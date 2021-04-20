package net.minecraft.src;
import java.util.Random;
public class BlockMyBloc2 extends Block
{
public BlockMyBloc2(int i, int j)
{
super(i, j, Material.ground);
}
public int idDropped(int i, Random random)
{
return mod_MyMod.myBloc2.blockID;
}
}