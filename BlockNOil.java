// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package MCP.mod_finiteliquids;

import java.util.Random;

import net.minecraft.src.IBlockAccess;
import net.minecraft.src.Material;
import net.minecraft.src.World;
import MCP.ApiController;

// Referenced classes of package net.minecraft.src:
//            BlockNWater, mod_NWater, Block, Material, 
//            World, IBlockAccess

public class BlockNOil extends BlockNWater
{

    protected BlockNOil(ApiController api, int j, Material material)
    {
		super(api,api.getBlockID(BlockNOil.class), j, material);
        blockIndexInTexture = mod_NWater.texx[17];
        setLightOpacity(15);
        setHardness(100F);
        setLightOpacity(255);
        setBlockName("noil");
    }

    @Override
    public void updateTick(World world, int i, int j, int k, Random random)
    {
        super.updateTick(world, i, j, k, random);
    }

    @Override
    public int tickRate()
    {
        return 6;
    }

    @Override
    public int getThreshold()
    {
        return 2;
    }

    @Override
    public int getMetathresh()
    {
        return 0;
    }

    @Override
    public int getBlockTexture(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        return mod_NWater.texx[17];
    }
    
    @Override
    public float getSurfaceMull()
    {
        return 1.0F;
    }

    @Override
    public void setToStill(World world, int i, int j, int k)
    {
    }

    @Override
    public int getStill()
    {
        return mod_NWater.noil_still.blockID;
    }
}
