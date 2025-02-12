package de.srendi.advancedperipherals.common.blocks.tileentity;

import de.srendi.advancedperipherals.common.addons.computercraft.peripheral.BlockReaderPeripheral;
import de.srendi.advancedperipherals.common.blocks.base.PeripheralTileEntity;
import de.srendi.advancedperipherals.common.setup.TileEntityTypes;

public class BlockReaderTileEntity extends PeripheralTileEntity<BlockReaderPeripheral> {

    public BlockReaderTileEntity() {
        super(TileEntityTypes.BLOCK_READER.get());
    }

    @Override
    protected BlockReaderPeripheral createPeripheral() {
        return new BlockReaderPeripheral("blockReader", this);
    }
}
