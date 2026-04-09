package e7;

import com.google.ar.core.Frame;
import com.google.ar.core.Pose;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: e7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5427c {

    /* renamed from: a, reason: collision with root package name */
    public static final C5427c f46223a = new C5427c();

    private C5427c() {
    }

    public final C5425a a(Frame frame, float[] sightVectorInitial) {
        AbstractC6492s.i(frame, "frame");
        AbstractC6492s.i(sightVectorInitial, "sightVectorInitial");
        Pose displayOrientedPose = frame.getCamera().getDisplayOrientedPose();
        float[] fArrRotateVector = displayOrientedPose.rotateVector(sightVectorInitial);
        fArrRotateVector[2] = fArrRotateVector[2] + 1.0f;
        return new C5425a(displayOrientedPose.tx(), displayOrientedPose.ty(), displayOrientedPose.tz(), 90 - ((float) Math.toDegrees((float) Math.atan2(r2 - sightVectorInitial[2], fArrRotateVector[0] - sightVectorInitial[0]))));
    }
}
