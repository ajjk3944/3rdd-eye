package R;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public Z f3300a;

    public a0(int i, Interpolator interpolator, long j6) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3300a = new Y(N4.g.i(i, interpolator, j6));
        } else {
            this.f3300a = new W(i, interpolator, j6);
        }
    }
}
