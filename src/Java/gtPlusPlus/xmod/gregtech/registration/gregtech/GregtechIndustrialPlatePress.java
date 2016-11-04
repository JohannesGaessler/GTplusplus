package gtPlusPlus.xmod.gregtech.registration.gregtech;

import gtPlusPlus.core.util.Utils;
import gtPlusPlus.xmod.gregtech.api.enums.GregtechItemList;
import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.GregtechMetaTileEntity_IndustrialPlatePress;

public class GregtechIndustrialPlatePress {

	public static void run() {
		if (gtPlusPlus.core.lib.LoadedMods.Gregtech) {
			Utils.LOG_INFO("Gregtech5u Content | Registering Industrial Press Multiblock.");
			GregtechIndustrialPlatePress.run1();
		}

	}

	private static void run1() {
		// Industrial Centrifuge Multiblock
		GregtechItemList.Industrial_PlatePress.set(new GregtechMetaTileEntity_IndustrialPlatePress(792,
				"industrialbender.controller.tier.single", "Industrial Material Press").getStackForm(1L));

	}
}