package net.minecraft.src;

import java.util.Random;

public class mod_MyMod extends BaseMod
{
public String Version()

{
return "1.5_01";
}
public void GenerateSurface(World world, Random rand, int chunkX, int chunkZ)
{
for(int i = 0; i < 15; i++)
{
int randPosX = chunkX + rand.nextInt(16);
int randPosY = rand.nextInt(70);
int randPosZ = chunkZ + rand.nextInt(16);
(new WorldGenMinable(Gisement.blockID, 15)).generate(world, rand, randPosX, randPosY, randPosZ);
}
}

public int AddFuel(int i)
{
return i != thillium.shiftedIndex ? 0 : 2000;
}

public mod_MyMod()
{


ModLoader.RegisterBlock(Gisement);
ModLoader.AddName(Gisement, "Thillium Ore");
ModLoader.RegisterBlock(myBloc);
ModLoader.AddName(myBloc, "WoodStone");
ModLoader.RegisterBlock(myBloc2);
ModLoader.AddName(myBloc2, "Stone Lamp");
ModLoader.AddSmelting(thillium.shiftedIndex, new ItemStack(Item.ingotIron));

ModLoader.AddRecipe(new ItemStack(myBloc, 2), new Object[]
{"X", "#", Character.valueOf('#'), Block.cobblestone, Character.valueOf('X'), Block.planks});

ModLoader.AddRecipe(new ItemStack(myBloc2, 1), new Object[]
{" # ", " XX", Character.valueOf('#'), Block.stone, Character.valueOf('X'), Block.torchWood});

ModLoader.AddRecipe(new ItemStack(Block.torchWood, 8), new Object[]
{"X", "T", Character.valueOf('X'), thillium, Character.valueOf('S'), Item.stick});


thillium = (new Itemthillium(99)).setItemName("thillium").setIconIndex(ModLoader.addOverride("/gui/items.png", "/inutilecraft/thillium.png"));
ModLoader.AddName(thillium, "Thillium");


}



public static final Block myBloc = (new
BlockMyBloc(120, ModLoader.addOverride("/terrain.png", "/inutilecraft/woodstone.png")))
.setHardness(2.0F).setResistance(10F).setBlockName("WoodStone");

//code son : ".setStepSound(Block.soundFootstep)"

public static final Block myBloc2 = (new
BlockMyBloc2(121, ModLoader.addOverride("/terrain.png", "inutilecraft/Dirtlamp.png"))).setHardness(2.0F).setResistance(10F)
.setStepSound(Block.soundGrassFootstep).setLightValue(0.8F).setBlockName("Stone Lamp");

public static final Block Gisement = (new
ThilliumOre(122, ModLoader.addOverride("/terrain.png", "inutilecraft/thilliumore.png"))).setHardness(2.0F).setResistance(10F)
.setStepSound(Block.soundStoneFootstep).setBlockName("Thillium Ore");

public static Item thillium;
}