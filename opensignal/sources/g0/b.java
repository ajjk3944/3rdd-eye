package g0;

import h2.b0;
import h2.j0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static b f9125h;

    /* renamed from: a, reason: collision with root package name */
    public final t2.i f9126a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f9127b;

    /* renamed from: c, reason: collision with root package name */
    public final t2.d f9128c;

    /* renamed from: d, reason: collision with root package name */
    public final k2.g f9129d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f9130e;

    /* renamed from: f, reason: collision with root package name */
    public float f9131f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f9132g = Float.NaN;

    public b(t2.i iVar, j0 j0Var, t2.d dVar, k2.g gVar) {
        this.f9126a = iVar;
        this.f9127b = j0Var;
        this.f9128c = dVar;
        this.f9129d = gVar;
        this.f9130e = b0.e(j0Var, iVar);
    }

    public final long a(int i10, long j) {
        int i11;
        float f10 = this.f9132g;
        float f11 = this.f9131f;
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            String str = c.f9133a;
            long jB = t2.b.b(0, 0, 15);
            k2.g gVar = this.f9129d;
            j0 j0Var = this.f9130e;
            t2.d dVar = this.f9128c;
            float fB = b0.a(str, j0Var, jB, dVar, gVar, 1).b();
            float fB2 = b0.a(c.f9134b, this.f9130e, t2.b.b(0, 0, 15), dVar, this.f9129d, 2).b() - fB;
            this.f9132g = fB;
            this.f9131f = fB2;
            f11 = fB2;
            f10 = fB;
        }
        if (i10 != 1) {
            int iRound = Math.round((f11 * (i10 - 1)) + f10);
            i11 = iRound >= 0 ? iRound : 0;
            int iG = t2.a.g(j);
            if (i11 > iG) {
                i11 = iG;
            }
        } else {
            i11 = t2.a.i(j);
        }
        return t2.b.a(t2.a.j(j), t2.a.h(j), i11, t2.a.g(j));
    }
}
