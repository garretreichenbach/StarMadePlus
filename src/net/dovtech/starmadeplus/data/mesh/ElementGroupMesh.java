package net.dovtech.starmadeplus.data.mesh;

import api.entity.StarEntity;
import net.dovtech.starmadeplus.data.element.ElementGroup;
import org.schema.game.common.data.element.ElementCollection;
import org.schema.schine.graphicsengine.texture.Texture;
import javax.vecmath.Vector3f;
import java.util.UUID;

public class ElementGroupMesh {

    private String meshId;
    private ElementGroup elementGroup;
    private ElementCollection targetCollection;
    private StarEntity entity;

    private Vector3f scale;
    private Texture texture;

    public ElementGroupMesh(String meshId, ElementGroup elementGroup, ElementCollection targetCollection) {
        this.meshId = meshId;
        this.elementGroup = elementGroup;
        this.targetCollection = targetCollection;
        this.entity = elementGroup.getEntity();
    }

    public ElementGroupMesh(ElementGroup elementGroup, ElementCollection targetCollection) {
        this(UUID.randomUUID().toString(), elementGroup, targetCollection);
    }
}
