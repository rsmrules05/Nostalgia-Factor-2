// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BiomeGenBase, SpawnListEntry, EntityWolf, WorldGenForest, 
//            WorldGenBigTree, WorldGenTrees, WorldGenerator

public class BiomeGenForest2 extends BiomeGenBase
{

    protected BiomeGenForest2()
    {
        spawnableCreatureList.add(new SpawnListEntry(net.minecraft.src.EntityWolf.class, 5, 4, 4));
    }

    public WorldGenerator getRandomWorldGenForTrees(Random random)
    {
        if(random.nextInt(5) == 0)
        {
            return new WorldGenForest(false);
        }
        if(random.nextInt(3) == 0)
        {
            return new WorldGenBigTree(false);
        } else
        {
            return new WorldGenTrees(false);
        }
    }
}
