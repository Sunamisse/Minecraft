package net.minecraft.src;
import java.util.Random;
public class BlockMyBloc extends Block
{
public BlockMyBloc(int i, int j)
{
super(i, j, Material.rock);
}
public int idDropped(int i, Random random)
{
return mod_MyMod.myBloc.blockID;
}
}