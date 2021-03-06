package fr.fifou.economy.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureVillagePieces.PieceWeight;
import net.minecraft.world.gen.structure.StructureVillagePieces.Start;
import net.minecraft.world.gen.structure.StructureVillagePieces.Village;
import net.minecraftforge.fml.common.registry.VillagerRegistry.IVillageCreationHandler;

public class VillageHandlerShop implements IVillageCreationHandler
{
    public PieceWeight getVillagePieceWeight(Random random, int i)
    {
        return new PieceWeight(VillageComponentShop.class, 20, 1);
    }

    public Class<?> getComponentClass()
    {
        return VillageComponentShop.class;
    }

    public Village buildComponent(PieceWeight villagePiece, Start startPiece, List<StructureComponent> pieces, Random random, int x, int y, int z, EnumFacing facing, int type)
    {
        return VillageComponentShop.createPiece(startPiece, pieces, random, x, y, z, facing, type);
    }
}
