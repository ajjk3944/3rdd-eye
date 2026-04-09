package I5;

import E.u;
import I5.d;
import T1.B;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class j implements d.a {

    /* renamed from: e, reason: collision with root package name */
    public static j f2510e;

    /* renamed from: a, reason: collision with root package name */
    public float f2511a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public final B f2512b;

    /* renamed from: c, reason: collision with root package name */
    public H5.a f2513c;

    /* renamed from: d, reason: collision with root package name */
    public c f2514d;

    public j(u uVar, B b10) {
        this.f2512b = b10;
    }

    public static j b() {
        if (f2510e == null) {
            f2510e = new j(new u(4), new B());
        }
        return f2510e;
    }

    @Override // I5.d.a
    public final void a(boolean z10) {
        if (z10) {
            M5.a.f4180h.getClass();
            M5.a.b();
            return;
        }
        M5.a.f4180h.getClass();
        Handler handler = M5.a.f4181j;
        if (handler != null) {
            handler.removeCallbacks(M5.a.f4183l);
            M5.a.f4181j = null;
        }
    }
}
