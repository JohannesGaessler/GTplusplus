package gtPlusPlus.core.material;

import gregtech.api.enums.Materials;
import gtPlusPlus.core.material.state.MaterialState;
import gtPlusPlus.core.util.materials.MaterialUtils;

public final class ALLOY {
	
	//Just some GT Alloys that I need within mine.
	public static final Material BRONZE = MaterialUtils.generateMaterialFromGtENUM(Materials.Bronze);
	public static final Material STEEL = MaterialUtils.generateMaterialFromGtENUM(Materials.Steel);

	public static final Material ENERGYCRYSTAL = new Material(
			"Energy Crystal", //Material Name
			MaterialState.SOLID, //State
			new short[]{228, 255, 0, 0}, //Material Colour
			5660, //Melting Point in C
			0, //Boiling Point in C
			150, //Protons
			80, //Neutrons
			true, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().AER, 5),
					new MaterialStack(ELEMENT.getInstance().IGNIS, 5),
					new MaterialStack(ELEMENT.getInstance().TERRA, 5),
					new MaterialStack(ELEMENT.getInstance().AQUA, 5)
			});

	public static final Material BLOODSTEEL = new Material(
			"Blood Steel", //Material Name
			MaterialState.SOLID, //State
			new short[]{142, 28, 0, 0}, //Material Colour
			2500, //Melting Point in C
			0, //Boiling Point in C
			100, //Protons
			100, //Neutrons
			false, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ALLOY.STEEL, 5),
					new MaterialStack(ELEMENT.getInstance().IGNIS, 5)
			});

	public static final Material STABALLOY = new Material(
			"Staballoy", //Material Name
			MaterialState.SOLID, //State
			new short[]{68, 75, 66, 0}, //Material Colour
			3450, //Melting Point in C
			((ELEMENT.getInstance().URANIUM238.getBoilingPointC()*9)+(ELEMENT.getInstance().TITANIUM.getBoilingPointC()*1))/10, //Boiling Point in C
			((ELEMENT.getInstance().URANIUM238.getProtons()*9)+ELEMENT.getInstance().TITANIUM.getProtons())/10, //Protons
			((ELEMENT.getInstance().URANIUM238.getNeutrons()*9)+ELEMENT.getInstance().TITANIUM.getNeutrons())/10, //Neutrons
			true, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().URANIUM238, 9),
					new MaterialStack(ELEMENT.getInstance().TITANIUM, 1)
			});

	public static final Material TANTALLOY_60 = new Material(
			"Tantalloy-60", //Material Name
			MaterialState.SOLID, //State
			new short[]{213, 231, 237, 0}, //Material Colour
			3025, //Melting Point in C
			((ELEMENT.getInstance().TUNGSTEN.getBoilingPointC()*1)+(ELEMENT.getInstance().TANTALUM.getBoilingPointC()*8)+(ELEMENT.getInstance().TITANIUM.getBoilingPointC()*1))/10, //Boiling Point in C
			((ELEMENT.getInstance().TUNGSTEN.getProtons()*1)+(ELEMENT.getInstance().TANTALUM.getProtons()*8)+(ELEMENT.getInstance().TITANIUM.getProtons()*1))/10, //Protons
			((ELEMENT.getInstance().TUNGSTEN.getNeutrons()*1)+(ELEMENT.getInstance().TANTALUM.getNeutrons()*8)+(ELEMENT.getInstance().TITANIUM.getNeutrons()*1))/10, //Neutrons
			true, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().TUNGSTEN, 4),
					new MaterialStack(ELEMENT.getInstance().TANTALUM, 46)
			});

	public static final Material TANTALLOY_61 = new Material(
			"Tantalloy-61", //Material Name
			MaterialState.SOLID, //State
			new short[]{193, 211, 217, 0}, //Material Colour
			3030, //Melting Point in C
			((ELEMENT.getInstance().TUNGSTEN.getBoilingPointC()*1)+(ELEMENT.getInstance().TANTALUM.getBoilingPointC()*7)+(ELEMENT.getInstance().TITANIUM.getBoilingPointC()*1)+(ELEMENT.getInstance().YTTRIUM.getBoilingPointC()*1))/10, //Boiling Point in C
			((ELEMENT.getInstance().TUNGSTEN.getProtons()*1)+(ELEMENT.getInstance().TANTALUM.getProtons()*7)+(ELEMENT.getInstance().TITANIUM.getProtons()*1)+(ELEMENT.getInstance().YTTRIUM.getProtons()*1))/10, //Protons
			((ELEMENT.getInstance().TUNGSTEN.getNeutrons()*1)+(ELEMENT.getInstance().TANTALUM.getNeutrons()*7)+(ELEMENT.getInstance().TITANIUM.getNeutrons()*1)+(ELEMENT.getInstance().YTTRIUM.getNeutrons()*1))/10, //Neutrons
			true, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ALLOY.TANTALLOY_60, 2),
					new MaterialStack(ELEMENT.getInstance().TITANIUM, 12),
					new MaterialStack(ELEMENT.getInstance().YTTRIUM, 8)
			});

	public static final Material TUMBAGA = new Material(
			"Tumbaga", //Material Name
			MaterialState.SOLID, //State
			new short[]{255,178,15, 0}, //Material Colour
			((ELEMENT.getInstance().GOLD.getMeltingPointC()*7)+(ELEMENT.getInstance().COPPER.getMeltingPointC()*3))/10, //Melting point in C
			((ELEMENT.getInstance().GOLD.getBoilingPointC()*7)+(ELEMENT.getInstance().COPPER.getBoilingPointC()*3))/10, //Boiling Point in C
			((ELEMENT.getInstance().GOLD.getProtons()*7)+(ELEMENT.getInstance().COPPER.getProtons()*3))/10, //Protons
			((ELEMENT.getInstance().GOLD.getNeutrons()*7)+(ELEMENT.getInstance().COPPER.getNeutrons()*3))/10, //Neutrons
			false, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().GOLD, 30),
					new MaterialStack(ELEMENT.getInstance().GOLD, 40),
					new MaterialStack(ELEMENT.getInstance().COPPER, 30)
			});

	public static final Material POTIN = new Material(
			"Potin", //Material Name
			MaterialState.SOLID, //State
			new short[]{201,151,129, 0}, //Material Colour
			((ELEMENT.getInstance().LEAD.getMeltingPointC()*4)+(ALLOY.BRONZE.getMeltingPointC()*4)+(ELEMENT.getInstance().TIN.getMeltingPointC()*2))/10, //Melting point in C
			((ELEMENT.getInstance().LEAD.getBoilingPointC()*4)+(ALLOY.BRONZE.getBoilingPointC()*4)+(ELEMENT.getInstance().TIN.getBoilingPointC()*2))/10, //Boiling Point in C
			((ELEMENT.getInstance().LEAD.getProtons()*4)+(ALLOY.BRONZE.getProtons()*4)+(ELEMENT.getInstance().TIN.getProtons()*2))/10, //Protons
			((ELEMENT.getInstance().LEAD.getNeutrons()*4)+(ALLOY.BRONZE.getNeutrons()*4)+(ELEMENT.getInstance().TIN.getNeutrons()*2))/10, //Neutrons
			false, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().LEAD, 40),
					new MaterialStack(ALLOY.BRONZE, 40),
					new MaterialStack(ELEMENT.getInstance().TIN, 20)
			});

	/*public static final Material BEDROCKIUM = new Material(
			"Bedrockium", //Material Name
			new short[]{32, 32, 32, 0}, //Material Colour
			7735, //Melting Point in C
			0, //Boiling Point in C
			100, //Protons
			100, //Neutrons
			false, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			null);*/

	public static final Material INCONEL_625 = new Material(
			"Inconel-625", //Material Name
			MaterialState.SOLID, //State
			new short[]{128, 200, 128, 0}, //Material Colour
			1425, //Melting Point in C
			((ELEMENT.getInstance().NICKEL.getBoilingPointC()*6)+(ELEMENT.getInstance().CHROMIUM.getBoilingPointC()*2)+(ELEMENT.getInstance().IRON.getBoilingPointC()*1)+(ELEMENT.getInstance().MOLYBDENUM.getBoilingPointC()*1))/10, //Boiling Point in C
			((ELEMENT.getInstance().NICKEL.getProtons()*6)+(ELEMENT.getInstance().CHROMIUM.getProtons()*2)+(ELEMENT.getInstance().IRON.getProtons()*1)+(ELEMENT.getInstance().MOLYBDENUM.getProtons()*1))/10, //Protons
			((ELEMENT.getInstance().NICKEL.getNeutrons()*6)+(ELEMENT.getInstance().CHROMIUM.getNeutrons()*2)+(ELEMENT.getInstance().IRON.getNeutrons()*1)+(ELEMENT.getInstance().MOLYBDENUM.getNeutrons()*1))/10, //Neutrons
			true, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().NICKEL, 60),
					new MaterialStack(ELEMENT.getInstance().CHROMIUM, 20),
					new MaterialStack(ELEMENT.getInstance().IRON, 10),
					new MaterialStack(ELEMENT.getInstance().MOLYBDENUM, 10)
			});

	public static final Material INCONEL_690 = new Material(
			"Inconel-690", //Material Name
			MaterialState.SOLID, //State
			new short[]{118, 220, 138, 0}, //Material Colour
			1425, //Melting Point in C
			((ELEMENT.getInstance().NICKEL.getBoilingPointC()*6)+(ELEMENT.getInstance().CHROMIUM.getBoilingPointC()*2)+(ELEMENT.getInstance().NIOBIUM.getBoilingPointC()*1)+(ELEMENT.getInstance().MOLYBDENUM.getBoilingPointC()*1))/10, //Boiling Point in C
			((ELEMENT.getInstance().NICKEL.getProtons()*6)+(ELEMENT.getInstance().CHROMIUM.getProtons()*2)+(ELEMENT.getInstance().NIOBIUM.getProtons()*1)+(ELEMENT.getInstance().MOLYBDENUM.getProtons()*1))/10, //Protons
			((ELEMENT.getInstance().NICKEL.getNeutrons()*6)+(ELEMENT.getInstance().CHROMIUM.getNeutrons()*2)+(ELEMENT.getInstance().NIOBIUM.getNeutrons()*1)+(ELEMENT.getInstance().MOLYBDENUM.getNeutrons()*1))/10, //Neutrons
			true, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().NICKEL, 60),
					new MaterialStack(ELEMENT.getInstance().CHROMIUM, 20),
					new MaterialStack(ELEMENT.getInstance().NIOBIUM, 10),
					new MaterialStack(ELEMENT.getInstance().MOLYBDENUM, 10)
			});

	public static final Material INCONEL_792 = new Material(
			"Inconel-792", //Material Name
			MaterialState.SOLID, //State
			new short[]{108, 240, 118, 0}, //Material Colour
			1425, //Melting Point in C
			((ELEMENT.getInstance().NICKEL.getBoilingPointC()*6)+(ELEMENT.getInstance().CHROMIUM.getBoilingPointC()*1)+(ELEMENT.getInstance().IRON.getBoilingPointC()*1)+(ELEMENT.getInstance().ALUMINIUM.getBoilingPointC()*2))/10, //Boiling Point in C
			((ELEMENT.getInstance().NICKEL.getProtons()*6)+(ELEMENT.getInstance().CHROMIUM.getProtons()*1)+(ELEMENT.getInstance().IRON.getProtons()*1)+(ELEMENT.getInstance().ALUMINIUM.getProtons()*2))/10, //Protons
			((ELEMENT.getInstance().NICKEL.getNeutrons()*6)+(ELEMENT.getInstance().CHROMIUM.getNeutrons()*1)+(ELEMENT.getInstance().IRON.getNeutrons()*1)+(ELEMENT.getInstance().ALUMINIUM.getNeutrons()*2))/10, //Neutrons
			true, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().NICKEL, 60),
					new MaterialStack(ELEMENT.getInstance().CHROMIUM, 10),
					new MaterialStack(ELEMENT.getInstance().NIOBIUM, 10),
					new MaterialStack(ELEMENT.getInstance().ALUMINIUM, 20)
			});


	public static final Material ZERON_100 = new Material(
			"Zeron-100", //Material Name
			MaterialState.SOLID, //State
			new short[]{180, 180, 20, 0}, //Material Colour
			((ELEMENT.getInstance().CHROMIUM.getMeltingPointC()*25)+(ELEMENT.getInstance().NICKEL.getMeltingPointC()*6)+(ELEMENT.getInstance().COBALT.getMeltingPointC()*9)+(ALLOY.STEEL.getMeltingPointC()*60))/100, //Melting Point in C
			((ELEMENT.getInstance().CHROMIUM.getBoilingPointC()*25)+(ELEMENT.getInstance().NICKEL.getBoilingPointC()*6)+(ELEMENT.getInstance().COBALT.getBoilingPointC()*9)+(ALLOY.STEEL.getBoilingPointC()*60))/100, //Boiling Point in C
			((ELEMENT.getInstance().CHROMIUM.getProtons()*25)+(ELEMENT.getInstance().NICKEL.getProtons()*6)+(ELEMENT.getInstance().COBALT.getProtons()*9)+(ALLOY.STEEL.getProtons()*60))/100, //Protons
			((ELEMENT.getInstance().CHROMIUM.getNeutrons()*25)+(ELEMENT.getInstance().NICKEL.getNeutrons()*6)+(ELEMENT.getInstance().COBALT.getNeutrons()*9)+(ALLOY.STEEL.getNeutrons()*60))/100, //Neutrons
			true, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().CHROMIUM, 26),
					new MaterialStack(ELEMENT.getInstance().NICKEL, 6),
					new MaterialStack(ELEMENT.getInstance().MOLYBDENUM, 4),
					new MaterialStack(ELEMENT.getInstance().COPPER, 20),
					new MaterialStack(ELEMENT.getInstance().TUNGSTEN, 4),
					new MaterialStack(ALLOY.STEEL, 40)
			});

	public static final Material MARAGING250 = new Material(
			"Maraging Steel 250", //Material Name
			MaterialState.SOLID, //State
			new short[]{140, 140, 140, 0}, //Material Colour
			1413, //Melting Point in C
			((ELEMENT.getInstance().TITANIUM.getBoilingPointC()*5)+(ELEMENT.getInstance().NICKEL.getBoilingPointC()*16)+(ELEMENT.getInstance().COBALT.getBoilingPointC()*9)+(ALLOY.STEEL.getBoilingPointC()*70))/100, //Boiling Point in C
			((ELEMENT.getInstance().TITANIUM.getProtons()*5)+(ELEMENT.getInstance().NICKEL.getProtons()*16)+(ELEMENT.getInstance().COBALT.getProtons()*9)+(ALLOY.STEEL.getProtons()*70))/100, //Protons
			((ELEMENT.getInstance().TITANIUM.getNeutrons()*5)+(ELEMENT.getInstance().NICKEL.getNeutrons()*16)+(ELEMENT.getInstance().COBALT.getNeutrons()*9)+(ALLOY.STEEL.getNeutrons()*70))/100, //Neutrons
			true, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ALLOY.STEEL, 64),
					new MaterialStack(ELEMENT.getInstance().MOLYBDENUM, 4),
					new MaterialStack(ELEMENT.getInstance().TITANIUM, 4),
					new MaterialStack(ELEMENT.getInstance().NICKEL, 16),
					new MaterialStack(ELEMENT.getInstance().COBALT, 8),
			});

	public static final Material MARAGING300 = new Material(
			"Maraging Steel 300", //Material Name
			MaterialState.SOLID, //State
			new short[]{150, 150, 150, 0}, //Material Colour
			1413, //Melting Point in C
			((ELEMENT.getInstance().TITANIUM.getBoilingPointC()*10)+(ELEMENT.getInstance().NICKEL.getBoilingPointC()*21)+(ELEMENT.getInstance().COBALT.getBoilingPointC()*14)+(ALLOY.STEEL.getBoilingPointC()*55))/100, //Boiling Point in C
			((ELEMENT.getInstance().TITANIUM.getProtons()*10)+(ELEMENT.getInstance().NICKEL.getProtons()*21)+(ELEMENT.getInstance().COBALT.getProtons()*14)+(ALLOY.STEEL.getProtons()*55))/100, //Protons
			((ELEMENT.getInstance().TITANIUM.getNeutrons()*10)+(ELEMENT.getInstance().NICKEL.getNeutrons()*21)+(ELEMENT.getInstance().COBALT.getNeutrons()*14)+(ALLOY.STEEL.getNeutrons()*55))/100, //Neutrons
			true, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ALLOY.STEEL, 64),
					new MaterialStack(ELEMENT.getInstance().TITANIUM, 4),
					new MaterialStack(ELEMENT.getInstance().ALUMINIUM, 4),
					new MaterialStack(ELEMENT.getInstance().NICKEL, 16),
					new MaterialStack(ELEMENT.getInstance().COBALT, 8),
			});

	public static final Material MARAGING350 = new Material(
			"Maraging Steel 350", //Material Name
			MaterialState.SOLID, //State
			new short[]{160, 160, 160, 0}, //Material Colour
			1413, //Melting Point in C
			((ELEMENT.getInstance().TITANIUM.getBoilingPointC()*15)+(ELEMENT.getInstance().NICKEL.getBoilingPointC()*21)+(ELEMENT.getInstance().COBALT.getBoilingPointC()*9)+(ALLOY.STEEL.getBoilingPointC()*55))/100, //Boiling Point in C
			((ELEMENT.getInstance().TITANIUM.getProtons()*15)+(ELEMENT.getInstance().NICKEL.getProtons()*21)+(ELEMENT.getInstance().COBALT.getProtons()*9)+(ALLOY.STEEL.getProtons()*55))/100, //Protons
			((ELEMENT.getInstance().TITANIUM.getNeutrons()*15)+(ELEMENT.getInstance().NICKEL.getNeutrons()*21)+(ELEMENT.getInstance().COBALT.getNeutrons()*9)+(ALLOY.STEEL.getNeutrons()*55))/100, //Neutrons
			true, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ALLOY.STEEL, 64),
					new MaterialStack(ELEMENT.getInstance().ALUMINIUM, 4),
					new MaterialStack(ELEMENT.getInstance().MOLYBDENUM, 4),
					new MaterialStack(ELEMENT.getInstance().NICKEL, 16),
					new MaterialStack(ELEMENT.getInstance().COBALT, 8),
			});

	public static final Material STELLITE = new Material(
			"Stellite", //Material Name
			MaterialState.SOLID, //State
			new short[]{129, 75, 120, 0}, //Material Colour
			1310, //Melting Point in C
			((ELEMENT.getInstance().TITANIUM.getBoilingPointC()*10)+(ELEMENT.getInstance().CHROMIUM.getBoilingPointC()*35)+(ELEMENT.getInstance().COBALT.getBoilingPointC()*35)+(ELEMENT.getInstance().MANGANESE.getBoilingPointC()*20))/100, //Boiling Point in C
			((ELEMENT.getInstance().TITANIUM.getProtons()*10)+(ELEMENT.getInstance().CHROMIUM.getProtons()*35)+(ELEMENT.getInstance().COBALT.getProtons()*35)+(ELEMENT.getInstance().MANGANESE.getProtons()*20))/100, //Protons
			((ELEMENT.getInstance().TITANIUM.getNeutrons()*10)+(ELEMENT.getInstance().CHROMIUM.getNeutrons()*35)+(ELEMENT.getInstance().COBALT.getNeutrons()*35)+(ELEMENT.getInstance().MANGANESE.getNeutrons()*20))/100, //Neutrons
			true, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().COBALT, 35),
					new MaterialStack(ELEMENT.getInstance().CHROMIUM, 35),
					new MaterialStack(ELEMENT.getInstance().MANGANESE, 20),
					new MaterialStack(ELEMENT.getInstance().TITANIUM, 10)
			});

	public static final Material TALONITE = new Material(
			"Talonite", //Material Name
			MaterialState.SOLID, //State
			new short[]{228, 75, 120, 0}, //Material Colour
			1454, //Melting Point in C
			((ELEMENT.getInstance().MOLYBDENUM.getBoilingPointC()*10)+(ELEMENT.getInstance().CHROMIUM.getBoilingPointC()*30)+(ELEMENT.getInstance().COBALT.getBoilingPointC()*40)+(ELEMENT.getInstance().PHOSPHORUS.getBoilingPointC()*20))/100, //Boiling Point in C
			((ELEMENT.getInstance().MOLYBDENUM.getProtons()*10)+(ELEMENT.getInstance().CHROMIUM.getProtons()*30)+(ELEMENT.getInstance().COBALT.getProtons()*40)+(ELEMENT.getInstance().PHOSPHORUS.getProtons()*20))/100, //Protons
			((ELEMENT.getInstance().MOLYBDENUM.getNeutrons()*10)+(ELEMENT.getInstance().CHROMIUM.getNeutrons()*30)+(ELEMENT.getInstance().COBALT.getNeutrons()*40)+(ELEMENT.getInstance().PHOSPHORUS.getNeutrons()*20))/100, //Neutrons
			false, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().COBALT, 40),
					new MaterialStack(ELEMENT.getInstance().CHROMIUM, 30),
					new MaterialStack(ELEMENT.getInstance().PHOSPHORUS, 20),
					new MaterialStack(ELEMENT.getInstance().MOLYBDENUM, 10)
			});

	public static final Material HASTELLOY_W = new Material(
			"Hastelloy-W", //Material Name
			MaterialState.SOLID, //State
			new short[]{218, 165, 32, 0}, //Material Colour
			1350, //Melting Point in C
			((ELEMENT.getInstance().IRON.getBoilingPointC()*6)+(ELEMENT.getInstance().MOLYBDENUM.getBoilingPointC()*24)+(ELEMENT.getInstance().CHROMIUM.getBoilingPointC()*5)+(ELEMENT.getInstance().NICKEL.getBoilingPointC()*65))/100, //Boiling Point in C
			((ELEMENT.getInstance().IRON.getProtons()*6)+(ELEMENT.getInstance().MOLYBDENUM.getProtons()*24)+(ELEMENT.getInstance().CHROMIUM.getProtons()*5)+(ELEMENT.getInstance().NICKEL.getProtons()*65))/100, //Protons
			((ELEMENT.getInstance().IRON.getNeutrons()*6)+(ELEMENT.getInstance().MOLYBDENUM.getNeutrons()*24)+(ELEMENT.getInstance().CHROMIUM.getNeutrons()*5)+(ELEMENT.getInstance().NICKEL.getNeutrons()*65))/100, //Neutrons
			false, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().IRON, 06),
					new MaterialStack(ELEMENT.getInstance().MOLYBDENUM, 24),
					new MaterialStack(ELEMENT.getInstance().CHROMIUM, 8),
					new MaterialStack(ELEMENT.getInstance().NICKEL, 62)
			});

	/*public static final Material HASTELLOY_X = new Material(
			"Hastelloy-X", //Material Name
			new short[]{255, 193, 37, 0}, //Material Colour
			1350, //Melting Point in C
			((ELEMENT.getInstance().IRON.getBoilingPoint_C()*18)+(ELEMENT.getInstance().MOLYBDENUM.getBoilingPoint_C()*9)+(ELEMENT.getInstance().CHROMIUM.getBoilingPoint_C()*22)+(ELEMENT.getInstance().NICKEL.getBoilingPoint_C()*51))/100, //Boiling Point in C
			((ELEMENT.getInstance().IRON.getProtons()*18)+(ELEMENT.getInstance().MOLYBDENUM.getProtons()*9)+(ELEMENT.getInstance().CHROMIUM.getProtons()*22)+(ELEMENT.getInstance().NICKEL.getProtons()*51))/100, //Protons
			((ELEMENT.getInstance().IRON.getNeutrons()*18)+(ELEMENT.getInstance().MOLYBDENUM.getNeutrons()*9)+(ELEMENT.getInstance().CHROMIUM.getNeutrons()*22)+(ELEMENT.getInstance().NICKEL.getNeutrons()*51))/100, //Neutrons
			false, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().IRON, 18),
					new MaterialStack(ELEMENT.getInstance().MOLYBDENUM, 9),
					new MaterialStack(ELEMENT.getInstance().CHROMIUM, 22),
					new MaterialStack(ELEMENT.getInstance().NICKEL, 51)
			});*/

	public static final Material HASTELLOY_X = new Material(
			"Hastelloy-X", //Material Name
			MaterialState.SOLID, //State
			new short[]{255, 193, 37, 0}, //Material Colour
			1350, //Melting Point in C
			((ELEMENT.getInstance().IRON.getBoilingPointC()*18)+(ELEMENT.getInstance().MOLYBDENUM.getBoilingPointC()*9)+(ELEMENT.getInstance().CHROMIUM.getBoilingPointC()*22)+(ELEMENT.getInstance().NICKEL.getBoilingPointC()*51))/100, //Boiling Point in C
			((ELEMENT.getInstance().IRON.getProtons()*18)+(ELEMENT.getInstance().MOLYBDENUM.getProtons()*9)+(ELEMENT.getInstance().CHROMIUM.getProtons()*22)+(ELEMENT.getInstance().NICKEL.getProtons()*51))/100, //Protons
			((ELEMENT.getInstance().IRON.getNeutrons()*18)+(ELEMENT.getInstance().MOLYBDENUM.getNeutrons()*9)+(ELEMENT.getInstance().CHROMIUM.getNeutrons()*22)+(ELEMENT.getInstance().NICKEL.getNeutrons()*51))/100, //Neutrons
			false, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().IRON, 18),
					new MaterialStack(ELEMENT.getInstance().MOLYBDENUM, 9),
					new MaterialStack(ELEMENT.getInstance().CHROMIUM, 22),
					new MaterialStack(ELEMENT.getInstance().NICKEL, 51)
			});

	public static final Material HASTELLOY_N = new Material(
			"Hastelloy-N", //Material Name
			MaterialState.SOLID, //State
			new short[]{236, 213, 48, 0}, //Material Colour
			1350, //Melting Point in C
			((ELEMENT.getInstance().YTTRIUM.getBoilingPointC()*5)+(ELEMENT.getInstance().MOLYBDENUM.getBoilingPointC()*16)+(ELEMENT.getInstance().CHROMIUM.getBoilingPointC()*7)+(ELEMENT.getInstance().NICKEL.getBoilingPointC()*72))/100, //Boiling Point in C
			((ELEMENT.getInstance().YTTRIUM.getProtons()*5)+(ELEMENT.getInstance().MOLYBDENUM.getProtons()*16)+(ELEMENT.getInstance().CHROMIUM.getProtons()*7)+(ELEMENT.getInstance().NICKEL.getProtons()*72))/100, //Protons
			((ELEMENT.getInstance().YTTRIUM.getNeutrons()*5)+(ELEMENT.getInstance().MOLYBDENUM.getNeutrons()*16)+(ELEMENT.getInstance().CHROMIUM.getNeutrons()*7)+(ELEMENT.getInstance().NICKEL.getNeutrons()*72))/100, //Neutrons
			true, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().YTTRIUM, 10),
					new MaterialStack(ELEMENT.getInstance().MOLYBDENUM, 16),
					new MaterialStack(ELEMENT.getInstance().CHROMIUM, 10),
					new MaterialStack(ELEMENT.getInstance().NICKEL, 64)
			});

	public static final Material HASTELLOY_C276 = new Material(
			"Hastelloy-C276", //Material Name
			MaterialState.SOLID, //State
			new short[]{238, 180, 34, 0}, //Material Colour
			1350, //Melting Point in C
			((ELEMENT.getInstance().COBALT.getBoilingPointC()*2)+(ELEMENT.getInstance().MOLYBDENUM.getBoilingPointC()*16)+(ELEMENT.getInstance().CHROMIUM.getBoilingPointC()*16)+(ELEMENT.getInstance().NICKEL.getBoilingPointC()*66))/100, //Boiling Point in C
			((ELEMENT.getInstance().COBALT.getProtons()*2)+(ELEMENT.getInstance().MOLYBDENUM.getProtons()*16)+(ELEMENT.getInstance().CHROMIUM.getProtons()*16)+(ELEMENT.getInstance().NICKEL.getProtons()*66))/100, //Protons
			((ELEMENT.getInstance().COBALT.getNeutrons()*2)+(ELEMENT.getInstance().MOLYBDENUM.getNeutrons()*16)+(ELEMENT.getInstance().CHROMIUM.getNeutrons()*16)+(ELEMENT.getInstance().NICKEL.getNeutrons()*66))/100, //Neutrons
			true, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().COBALT, 02),
					new MaterialStack(ELEMENT.getInstance().MOLYBDENUM, 16),
					new MaterialStack(ELEMENT.getInstance().CHROMIUM, 16),
					new MaterialStack(ELEMENT.getInstance().NICKEL, 66)
			});

	public static final Material INCOLOY_020 = new Material(
			"Incoloy-020", //Material Name
			MaterialState.SOLID, //State
			new short[]{101, 81, 71, 0}, //Material Colour
			1425, //Melting Point in C
			((ELEMENT.getInstance().IRON.getBoilingPointC()*40)+(ELEMENT.getInstance().COPPER.getBoilingPointC()*4)+(ELEMENT.getInstance().CHROMIUM.getBoilingPointC()*20)+(ELEMENT.getInstance().NICKEL.getBoilingPointC()*36))/100, //Boiling Point in C
			((ELEMENT.getInstance().IRON.getProtons()*40)+(ELEMENT.getInstance().COPPER.getProtons()*4)+(ELEMENT.getInstance().CHROMIUM.getProtons()*20)+(ELEMENT.getInstance().NICKEL.getProtons()*36))/100, //Protons
			((ELEMENT.getInstance().IRON.getNeutrons()*40)+(ELEMENT.getInstance().COPPER.getNeutrons()*4)+(ELEMENT.getInstance().CHROMIUM.getNeutrons()*20)+(ELEMENT.getInstance().NICKEL.getNeutrons()*36))/100, //Neutrons
			false, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().IRON, 40),
					new MaterialStack(ELEMENT.getInstance().COPPER, 4),
					new MaterialStack(ELEMENT.getInstance().CHROMIUM, 20),
					new MaterialStack(ELEMENT.getInstance().NICKEL, 36)
			});

	public static final Material INCOLOY_DS = new Material(
			"Incoloy-DS", //Material Name
			MaterialState.SOLID, //State
			new short[]{71, 101, 81, 0}, //Material Colour
			1425, //Melting Point in C
			((ELEMENT.getInstance().IRON.getBoilingPointC()*46)+(ELEMENT.getInstance().COBALT.getBoilingPointC()*18)+(ELEMENT.getInstance().CHROMIUM.getBoilingPointC()*18)+(ELEMENT.getInstance().NICKEL.getBoilingPointC()*18))/100, //Boiling Point in C
			((ELEMENT.getInstance().IRON.getProtons()*46)+(ELEMENT.getInstance().COBALT.getProtons()*18)+(ELEMENT.getInstance().CHROMIUM.getProtons()*18)+(ELEMENT.getInstance().NICKEL.getProtons()*18))/100, //Protons
			((ELEMENT.getInstance().IRON.getNeutrons()*46)+(ELEMENT.getInstance().COBALT.getNeutrons()*18)+(ELEMENT.getInstance().CHROMIUM.getNeutrons()*18)+(ELEMENT.getInstance().NICKEL.getNeutrons()*18))/100, //Neutrons
			false, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().IRON, 46),
					new MaterialStack(ELEMENT.getInstance().COBALT, 18),
					new MaterialStack(ELEMENT.getInstance().CHROMIUM, 18),
					new MaterialStack(ELEMENT.getInstance().NICKEL, 18)
			});

	public static final Material INCOLOY_MA956 = new Material(
			"Incoloy-MA956", //Material Name
			MaterialState.SOLID, //State
			new short[]{81, 71, 101, 0}, //Material Colour
			1425, //Melting Point in C
			((ELEMENT.getInstance().IRON.getBoilingPointC()*75)+(ELEMENT.getInstance().ALUMINIUM.getBoilingPointC()*4)+(ELEMENT.getInstance().CHROMIUM.getBoilingPointC()*20)+(ELEMENT.getInstance().YTTRIUM.getBoilingPointC()*1))/100, //Boiling Point in C
			((ELEMENT.getInstance().IRON.getProtons()*75)+(ELEMENT.getInstance().ALUMINIUM.getProtons()*4)+(ELEMENT.getInstance().CHROMIUM.getProtons()*20)+(ELEMENT.getInstance().YTTRIUM.getProtons()*1))/100, //Protons
			((ELEMENT.getInstance().IRON.getNeutrons()*75)+(ELEMENT.getInstance().ALUMINIUM.getNeutrons()*4)+(ELEMENT.getInstance().CHROMIUM.getNeutrons()*20)+(ELEMENT.getInstance().YTTRIUM.getNeutrons()*1))/100, //Neutrons
			true, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().IRON, 64),
					new MaterialStack(ELEMENT.getInstance().ALUMINIUM, 12),
					new MaterialStack(ELEMENT.getInstance().CHROMIUM, 20),
					new MaterialStack(ELEMENT.getInstance().YTTRIUM, 4)
			});

	public static final Material TUNGSTEN_CARBIDE = new Material(
			"Tungsten Carbide", //Material Name
			MaterialState.SOLID, //State
			new short[]{44, 44, 44, 0}, //Material Colour
			3422, //Melting Point in C
			((ELEMENT.getInstance().TUNGSTEN.getBoilingPointC()*5)+(ELEMENT.getInstance().CARBON.getBoilingPointC()*5))/10, //Boiling Point in C
			((ELEMENT.getInstance().TUNGSTEN.getProtons()*5)+(ELEMENT.getInstance().CARBON.getProtons()*5))/10, //Protons
			((ELEMENT.getInstance().TUNGSTEN.getNeutrons()*5)+(ELEMENT.getInstance().CARBON.getNeutrons()*5))/10, //Neutrons
			true, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().CARBON, 50),
					new MaterialStack(ELEMENT.getInstance().TUNGSTEN, 50)
			});

	public static final Material SILICON_CARBIDE = new Material(
			"Silicon Carbide", //Material Name
			MaterialState.SOLID, //State
			new short[]{40, 48, 36, 0}, //Material Colour
			1414, //Melting Point in C
			((ELEMENT.getInstance().SILICON.getBoilingPointC()*5)+(ELEMENT.getInstance().CARBON.getBoilingPointC()*5))/10, //Boiling Point in C
			((ELEMENT.getInstance().SILICON.getProtons()*5)+(ELEMENT.getInstance().CARBON.getProtons()*5))/10, //Protons
			((ELEMENT.getInstance().SILICON.getNeutrons()*5)+(ELEMENT.getInstance().CARBON.getNeutrons()*5))/10, //Neutrons
			false, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().SILICON, 40),
					new MaterialStack(ELEMENT.getInstance().CARBON, 50),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 10)
			});

	public static final Material TANTALUM_CARBIDE = new Material(
			"Tantalum Carbide", //Material Name
			MaterialState.SOLID, //State
			new short[]{139, 136, 120, 0}, //Material Colour
			2980, //Melting Point in C
			((ELEMENT.getInstance().TANTALUM.getBoilingPointC()*5)+(ELEMENT.getInstance().CARBON.getBoilingPointC()*5))/10, //Boiling Point in C
			((ELEMENT.getInstance().TANTALUM.getProtons()*5)+(ELEMENT.getInstance().CARBON.getProtons()*5))/10, //Protons
			((ELEMENT.getInstance().TANTALUM.getNeutrons()*5)+(ELEMENT.getInstance().CARBON.getNeutrons()*5))/10, //Neutrons
			true, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().TANTALUM, 40),
					new MaterialStack(ELEMENT.getInstance().CARBON, 50),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 10)
			});

	public static final Material ZIRCONIUM_CARBIDE = new Material(
			"Zirconium Carbide", //Material Name
			MaterialState.SOLID, //State
			new short[]{222, 202, 180, 0}, //Material Colour
			1855, //Melting Point in C
			((ELEMENT.getInstance().ZIRCONIUM.getBoilingPointC()*5)+(ELEMENT.getInstance().CARBON.getBoilingPointC()*5))/10, //Boiling Point in C
			((ELEMENT.getInstance().ZIRCONIUM.getProtons()*5)+(ELEMENT.getInstance().CARBON.getProtons()*5))/10, //Protons
			((ELEMENT.getInstance().ZIRCONIUM.getNeutrons()*5)+(ELEMENT.getInstance().CARBON.getNeutrons()*5))/10, //Neutrons
			true, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().ZIRCONIUM, 40),
					new MaterialStack(ELEMENT.getInstance().CARBON, 50),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 10)
			});

	public static final Material NIOBIUM_CARBIDE = new Material(
			"Niobium Carbide", //Material Name
			MaterialState.SOLID, //State
			new short[]{205, 197, 191, 0}, //Material Colour
			2477, //Melting Point in C
			((ELEMENT.getInstance().NIOBIUM.getBoilingPointC()*5)+(ELEMENT.getInstance().CARBON.getBoilingPointC()*5))/10, //Boiling Point in C
			((ELEMENT.getInstance().NIOBIUM.getProtons()*5)+(ELEMENT.getInstance().CARBON.getProtons()*5))/10, //Protons
			((ELEMENT.getInstance().NIOBIUM.getNeutrons()*5)+(ELEMENT.getInstance().CARBON.getNeutrons()*5))/10, //Neutrons
			true, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().NIOBIUM, 40),
					new MaterialStack(ELEMENT.getInstance().CARBON, 50),
					new MaterialStack(ELEMENT.getInstance().OXYGEN, 10)
			});

	public static final Material LEAGRISIUM = new Material(
			"Grisium", //Material Name
			MaterialState.SOLID, //State
			new short[]{53, 93, 106, 0}, //Material Colour
			9001, //Melting Point in C
			25000, //Boiling Point in C
			96, //Protons
			128, //Neutrons
			true, //Uses Blast furnace?
			new MaterialStack[]{
					new MaterialStack(ELEMENT.getInstance().TITANIUM, 18),
					new MaterialStack(ELEMENT.getInstance().CARBON, 18),
					new MaterialStack(ELEMENT.getInstance().POTASSIUM, 18),
					new MaterialStack(ELEMENT.getInstance().LITHIUM, 18),
					new MaterialStack(ELEMENT.getInstance().SULFUR, 18),
					new MaterialStack(ELEMENT.getInstance().HYDROGEN, 10)
			});	//Material Stacks with Percentage of required elements.

	public static final Material EGLIN_STEEL = new Material(
			"Eglin Steel", //Material Name
			MaterialState.SOLID, //State
			new short[]{139,69,19, 0}, //Material Colour
			1048, //Melting Point in C
			1973, //Boiling Point in C
			((ALLOY.STEEL.getProtons()*20)+(ELEMENT.getInstance().NICKEL.getProtons()*5)+(ELEMENT.getInstance().SILICON.getProtons()*1)+(ELEMENT.getInstance().ALUMINIUM.getProtons()*4))/30, //Protons
			((ALLOY.STEEL.getNeutrons()*20)+(ELEMENT.getInstance().NICKEL.getNeutrons()*5)+(ELEMENT.getInstance().SILICON.getNeutrons()*1)+(ELEMENT.getInstance().ALUMINIUM.getNeutrons()*4))/30, //Neutrons
			true, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ALLOY.STEEL, 20),
					new MaterialStack(ELEMENT.getInstance().SILICON, 1),
					new MaterialStack(ELEMENT.getInstance().NICKEL, 5),
					new MaterialStack(ELEMENT.getInstance().ALUMINIUM, 4),
			});










	//Quantum
	public static final Material QUANTUM = new Material(
			"Quantum", //Material Name
			MaterialState.SOLID, //State
			new short[]{128, 128, 255, 50}, //Material Colour
			9999, //Melting Point in C
			25000, //Boiling Point in C
			150, //Protons
			200, //Neutrons
			true, //Uses Blast furnace?
			//Material Stacks with Percentage of required elements.
			new MaterialStack[]{
					new MaterialStack(ALLOY.LEAGRISIUM, 25),
					new MaterialStack(ALLOY.ENERGYCRYSTAL, 25),
					new MaterialStack(ALLOY.ZIRCONIUM_CARBIDE, 25),
					new MaterialStack(ELEMENT.getInstance().MANGANESE, 5),
					new MaterialStack(ELEMENT.getInstance().MOLYBDENUM, 5),
					new MaterialStack(ELEMENT.getInstance().TUNGSTEN, 5),
					new MaterialStack(ELEMENT.getInstance().BERYLLIUM, 5),
					new MaterialStack(ELEMENT.getInstance().BISMUTH, 5)
			});



}
