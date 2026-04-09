package androidx.camera.video.internal.compat.quirk;

import W.C1635x;
import android.os.Build;
import androidx.camera.core.impl.I;

/* loaded from: classes.dex */
public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean b(I i, C1635x c1635x) {
        return ("positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) && i.g() == 0 && c1635x == C1635x.f13307a;
    }
}
