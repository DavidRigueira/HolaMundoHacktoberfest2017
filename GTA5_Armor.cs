using System;
using GTA;

namespace GTAV_ArmorRecovery
{
    public class ArmorRecovery : Script
    {
        private int nativeArmor;
        private int prevArmor;
        private Ped prevPlayer;
        private DateTime lastArmorDecrease;

        private const bool debugActivated = true;
        private const int armorRecoveryDelay = 5;

        public ArmorRecovery()
        {
            Tick += OnTick;
            Interval = 100;
        }

        private void debug(string s)
        {
            if (debugActivated) {
                GTA.UI.ShowSubtitle(s);
            }
        }

        private void OnTick(object sender, EventArgs e)
        {
            Ped player = Game.Player.Character;
            int armor = player.Armor;

            bool hasArmor = false;
            if (armor > 0) hasArmor = true;

            if (player != prevPlayer) {
                debug("Player character has changed!");
            }

            else if (hasArmor && armor < prevArmor) {
                debug("Armor decreased! (from " + prevArmor.ToString() + " to " + armor.ToString() + ")");
                lastArmorDecrease = DateTime.Now;
            }

            else if (hasArmor && armor > prevArmor) {
                debug("Armor increased! (from " + prevArmor.ToString() + " to " + armor.ToString() + ")");
                nativeArmor = armor;
            }

            else if ((DateTime.Now - lastArmorDecrease).TotalSeconds > armorRecoveryDelay) {
                armor = nativeArmor;
                debug("Armor recovered!");
            }

            prevArmor = armor;
            prevPlayer = player;
        }

    }
}