package gtPlusPlus.core.recipe;

import gregtech.api.enums.*;
import gregtech.api.interfaces.IOreRecipeRegistrator;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import gtPlusPlus.core.util.Utils;
import gtPlusPlus.core.util.item.ItemUtils;
import gtPlusPlus.xmod.gregtech.api.enums.GregtechItemList;
import net.minecraft.item.ItemStack;

public class RECIPES_LaserEngraver implements IOreRecipeRegistrator {
	public RECIPES_LaserEngraver() {
		OrePrefixes.crafting.add(this);
	}

	@Override
	public void registerOre(final OrePrefixes aPrefix, final Materials aMaterial, final String aOreDictName, final String aModName, final ItemStack aStack) {
		if (aOreDictName.equals(OreDictNames.craftingLensBlue.toString())) {
			if (ItemUtils.getItemStackOfAmountFromOreDictNoBroken("foilYttriumBariumCuprate", 1) != null){
				GT_Values.RA.addLaserEngraverRecipe(GT_OreDictUnificator.get(OrePrefixes.foil, Materials.YttriumBariumCuprate, 2L), GT_Utility.copyAmount(0L, new Object[]{aStack}), GregtechItemList.Circuit_Parts_Wiring_IV.get(1L, new Object[0]), 64, 480);
			}
			else {
				Utils.LOG_INFO("foilYttriumBariumCuprate does not exist within Gregtech, please report this issue to Blood-asp on github.");
				Utils.LOG_INFO("This material item can be re-enabled within the gregtech configuration files, If you wish to fix this yourself.");
			}
			if (ItemUtils.getItemStackOfAmountFromOreDictNoBroken("foilVanadiumGallium", 1) != null){
				GT_Values.RA.addLaserEngraverRecipe(GT_OreDictUnificator.get(OrePrefixes.foil, Materials.VanadiumGallium, 2L), GT_Utility.copyAmount(0L, new Object[]{aStack}), GregtechItemList.Circuit_Parts_Wiring_IV.get(1L, new Object[0]), 64, 480);
			}
			else {
				Utils.LOG_INFO("foilVanadiumGallium does not exist within Gregtech, please report this issue to Blood-asp on github.");
				Utils.LOG_INFO("This material item can be re-enabled within the gregtech configuration files, If you wish to fix this yourself.");
			}
			if (ItemUtils.getItemStackOfAmountFromOreDictNoBroken("foilNiobiumTitanium", 1) != null){
				GT_Values.RA.addLaserEngraverRecipe(GT_OreDictUnificator.get(OrePrefixes.foil, Materials.NiobiumTitanium, 2L), GT_Utility.copyAmount(0L, new Object[]{aStack}), GregtechItemList.Circuit_Parts_Wiring_IV.get(1L, new Object[0]), 64, 480);
			}
			else {
				Utils.LOG_INFO("foilNiobiumTitanium does not exist within Gregtech, please report this issue to Blood-asp on github.");
				Utils.LOG_INFO("This material item can be re-enabled within the gregtech configuration files, If you wish to fix this yourself.");
			}


		} else if (aOreDictName.equals(OreDictNames.craftingLensYellow.toString())) {
			if (ItemUtils.getItemStackOfAmountFromOreDictNoBroken("foilOsmium", 1) != null){
				GT_Values.RA.addLaserEngraverRecipe(GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Osmium, 2L), GT_Utility.copyAmount(0L, new Object[]{aStack}), GregtechItemList.Circuit_Parts_Wiring_LuV.get(1L, new Object[0]), 64, 1024);
			}
			else {
				Utils.LOG_INFO("foilOsmium does not exist within Gregtech, please report this issue to Blood-asp on github.");
				Utils.LOG_INFO("This material item can be re-enabled within the gregtech configuration files, If you wish to fix this yourself.");
			}

		} else if (aOreDictName.equals(OreDictNames.craftingLensCyan.toString())) {
		} else if (aOreDictName.equals(OreDictNames.craftingLensRed.toString())) {
		} else if (aOreDictName.equals(OreDictNames.craftingLensGreen.toString())) {
			if (ItemUtils.getItemStackOfAmountFromOreDictNoBroken("foilNaquadah", 1) != null){
				GT_Values.RA.addLaserEngraverRecipe(GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Naquadah, 2L), GT_Utility.copyAmount(0L, new Object[]{aStack}), GregtechItemList.Circuit_Parts_Wiring_ZPM.get(1L, new Object[0]), 64, 2000);
			}
			else {
				Utils.LOG_INFO("foilNaquadah does not exist within Gregtech, please report this issue to Blood-asp on github.");
				Utils.LOG_INFO("This material item can be re-enabled within the gregtech configuration files, If you wish to fix this yourself.");
			}

		} else if (aOreDictName.equals(OreDictNames.craftingLensWhite.toString())) {
			if (ItemUtils.getItemStackOfAmountFromOreDictNoBroken("plateLithium", 1) != null){
				GT_Values.RA.addLaserEngraverRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Lithium, 2L), GT_Utility.copyAmount(0L, new Object[]{aStack}), ItemUtils.getItemStackOfAmountFromOreDict("plateDoubleLithium7", 1), 4*60*20, 2000);
			}
			else {
				Utils.LOG_INFO("plateLithium does not exist within Gregtech, please report this issue to Blood-asp on github.");
				Utils.LOG_INFO("This material item can be re-enabled within the gregtech configuration files, If you wish to fix this yourself.");
			}
			if (ItemUtils.getItemStackOfAmountFromOreDictNoBroken("dustLithium", 1) != null){
				GT_Values.RA.addLaserEngraverRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Lithium, 3L), GT_Utility.copyAmount(0L, new Object[]{aStack}), ItemUtils.getItemStackOfAmountFromOreDict("dustLithium7", 1), 2*60*20, 2000);
			}
			else {
				Utils.LOG_INFO("dustLithium does not exist within Gregtech, please report this issue to Blood-asp on github.");
				Utils.LOG_INFO("This material item can be re-enabled within the gregtech configuration files, If you wish to fix this yourself.");
			}

		}
	}
}
