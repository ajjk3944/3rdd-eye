package D7;

import Zg.AbstractC3689v;
import com.google.ar.core.Coordinates2d;
import com.google.ar.core.Frame;
import com.google.ar.core.HitResult;
import com.google.ar.core.Pose;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class a implements b {
    private final Pose b(float f10, float f11, Frame frame) {
        Pose hitPose;
        float[] fArr = new float[4];
        frame.transformCoordinates2d(Coordinates2d.IMAGE_PIXELS, new float[]{f10, f11, 0.0f, 0.0f}, Coordinates2d.VIEW, fArr);
        List<HitResult> listHitTest = frame.hitTest(fArr[0], fArr[1]);
        AbstractC6492s.h(listHitTest, "hitTest(...)");
        HitResult hitResult = (HitResult) AbstractC3689v.t0(listHitTest, 0);
        if (hitResult == null || (hitPose = hitResult.getHitPose()) == null) {
            return null;
        }
        return hitPose;
    }

    @Override // D7.b
    public Pose a(c obj, Frame frame) {
        AbstractC6492s.i(obj, "obj");
        AbstractC6492s.i(frame, "frame");
        return b(obj.c().centerX(), obj.c().centerY(), frame);
    }
}
