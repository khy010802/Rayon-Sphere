package dev.lazurite.rayon.physics;

import javax.vecmath.Vector3f;

public interface DynamicBody {
//    DynamicBodyComposition getDynamicBody();
    boolean hasDynamicBody();
    boolean belongsToClient();
    void updatePositionAndAngles(Vector3f position, float yaw, float pitch);
}
