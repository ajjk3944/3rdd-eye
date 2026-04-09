package r6;

import android.os.Build;
import cm.g;
import s6.e;
import s6.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    public final e f32842b;

    public d() {
        this.f32842b = Build.VERSION.SDK_INT >= 34 ? f.f33481b : s6.c.g;
        g.b(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
