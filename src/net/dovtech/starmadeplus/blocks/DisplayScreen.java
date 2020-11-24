package net.dovtech.starmadeplus.blocks;

import api.config.BlockConfig;
import api.element.block.Blocks;
import org.schema.game.common.data.element.ElementInformation;
import org.schema.game.common.data.element.FactoryResource;

public class DisplayScreen extends BlockElement {

    public DisplayScreen(BlockConfig config) {
        super(config, "Display Screen", BlockManager.BlockSide.ALL);
        blockInfo.setInRecipe(true);
        blockInfo.canActivate = true;
        blockInfo.lodShapeString = "displayscreen";
        blockInfo.lodCollisionPhysical = true;
        blockInfo.lodUseDetailCollision = false;
        blockInfo.lodCollision.colslab = 0;
        blockInfo.lodCollision.type = ElementInformation.LodCollision.LodCollisionType.BLOCK_TYPE;
        blockInfo.cubeCubeCollision = true;
        blockInfo.setPrice(Blocks.DISPLAY_MODULE.getInfo().price);
        blockInfo.setShoppable(true);

        BlockConfig.addRecipe(blockInfo, Blocks.DISPLAY_MODULE.getInfo().getProducedInFactoryType(), (int) Blocks.DISPLAY_MODULE.getInfo().getFactoryBakeTime(),
                new FactoryResource(1, Blocks.DISPLAY_MODULE.getId())
        );
        config.add(blockInfo);
    }
}