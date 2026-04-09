package Y2;

import android.app.Application;
import h0.C2351a;

/* loaded from: classes.dex */
public final class U implements N {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4289a;

    /* renamed from: b, reason: collision with root package name */
    public final A0.e f4290b;

    /* renamed from: c, reason: collision with root package name */
    public final O f4291c;

    public /* synthetic */ U(A0.e eVar, M m6, int i) {
        this.f4289a = i;
        this.f4290b = eVar;
        this.f4291c = m6;
    }

    @Override // Y2.O
    public final Object a() {
        switch (this.f4289a) {
            case 0:
                return new T((Application) this.f4290b.f73b, (C0202d) this.f4291c.a());
            default:
                return b();
        }
    }

    public C2351a b() {
        return new C2351a((Application) this.f4290b.f73b, 15, (C0204f) this.f4291c.a());
    }
}
