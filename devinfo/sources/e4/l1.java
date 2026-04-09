package e4;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public k1 f22371a;

    public l1(int i4, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f22371a = new j1(h1.b(i4, interpolator, j));
        } else {
            this.f22371a = new g1(i4, interpolator, j);
        }
    }
}
