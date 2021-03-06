package fr.fifou.economy.capability;

import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;

public class CapabilityLoading
{
    @CapabilityInject(IMoney.class)
    public static final Capability<IMoney> CAPABILITY_MONEY = null;

    public static IMoney getMoneyHandler(Entity entity)
    {
        return entity.hasCapability(CAPABILITY_MONEY, EnumFacing.DOWN) ? (IMoney)entity.getCapability(CAPABILITY_MONEY, EnumFacing.DOWN) : null;
    }
}
