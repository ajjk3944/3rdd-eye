package b1;

import g1.AbstractC5849g;
import g1.InterfaceC5845c;

/* renamed from: b1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4040B extends AbstractC5849g {

    /* renamed from: l, reason: collision with root package name */
    private final Y0.d f32673l;

    /* renamed from: m, reason: collision with root package name */
    private long f32674m = Y0.c.b(0, 0, 0, 0, 15, null);

    /* renamed from: n, reason: collision with root package name */
    private Y0.t f32675n = Y0.t.Ltr;

    public C4040B(Y0.d dVar) {
        this.f32673l = dVar;
        v(new InterfaceC5845c() { // from class: b1.A
            @Override // g1.InterfaceC5845c
            public final float b(float f10) {
                return C4040B.E(this.f32672a, f10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float E(C4040B c4040b, float f10) {
        return c4040b.f32673l.getDensity() * f10;
    }

    public final long F() {
        return this.f32674m;
    }

    public final void G(long j10) {
        this.f32674m = j10;
    }

    @Override // g1.AbstractC5849g
    public int e(Object obj) {
        return obj instanceof Y0.h ? this.f32673l.x1(((Y0.h) obj).s()) : super.e(obj);
    }
}
