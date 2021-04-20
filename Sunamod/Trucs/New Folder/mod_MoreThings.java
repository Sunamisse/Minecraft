package net.minecraft.src;

public class mod_MoreThings extends BaseMod
{

    public mod_MoreThings()
    {
        netherrackId = 87;
        recipes();
    }

    public void recipes()
    {
        
        ModLoader.AddRecipe(new ItemStack(Block.cobblestoneMossy, 2), new Object[] {
            "S", "S", Character.valueOf('S'), Block.cobblestone
        });
        ModLoader.AddRecipe(new ItemStack(Block.grass, 2), new Object[] {
            "C", "C", Character.valueOf('C'), Block.dirt
        });
        ModLoader.AddRecipe(new ItemStack(Item.record13, 1), new Object[] {
            "CCC", "CGC", "CCC", Character.valueOf('G'), Item.ingotGold, Character.valueOf('C'), Block.obsidian
        });
        ModLoader.AddRecipe(new ItemStack(Item.recordCat, 1), new Object[] {
            "CCC", "CGC", "CCC", Character.valueOf('G'), new ItemStack(Item.dyePowder, 1, 10), Character.valueOf('C'), Block.obsidian
        });
        ModLoader.AddRecipe(new ItemStack(Item.flint, 1), new Object[] {
            "C", "C", Character.valueOf ('C'), Block.gravel
        });
        ModLoader.AddRecipe(new ItemStack(Block.ice, 12), new Object[] {
            " S ", "SWS", " S ", Character.valueOf('S'), Item.snowball, Character.valueOf('W'), Item.bucketWater
        });
        ModLoader.AddSmelting(netherrackId, new ItemStack(Block.fire, 1));
       
    }

    public String Version()
    {
        return "1.8.1";
    }

    int netherrackId;
}
