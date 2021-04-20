package net.minecraft.src;
import java.util.Random;
public class ThilliumOre extends Block
{
public ThilliumOre(int i, int j)
{
super(i, j, Material.rock);
}
public int idDropped(int i, Random random)
{
return mod_MyMod.thillium.shiftedIndex;
}
}