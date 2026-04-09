package u3;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public t0 f23222a;

    public u0(int i10, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f23222a = new s0(hf.z.l(i10, interpolator, j));
        } else {
            this.f23222a = new p0(i10, interpolator, j);
        }
    }
}
