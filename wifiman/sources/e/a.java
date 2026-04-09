package E;

import Y0.t;
import l0.C6537m;
import m0.Q0;
import m0.i1;

/* loaded from: classes.dex */
public abstract class a implements i1 {

    /* renamed from: a, reason: collision with root package name */
    private final b f3594a;

    /* renamed from: b, reason: collision with root package name */
    private final b f3595b;

    /* renamed from: c, reason: collision with root package name */
    private final b f3596c;

    /* renamed from: d, reason: collision with root package name */
    private final b f3597d;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        this.f3594a = bVar;
        this.f3595b = bVar2;
        this.f3596c = bVar3;
        this.f3597d = bVar4;
    }

    public static /* synthetic */ a d(a aVar, b bVar, b bVar2, b bVar3, b bVar4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i10 & 1) != 0) {
            bVar = aVar.f3594a;
        }
        if ((i10 & 2) != 0) {
            bVar2 = aVar.f3595b;
        }
        if ((i10 & 4) != 0) {
            bVar3 = aVar.f3596c;
        }
        if ((i10 & 8) != 0) {
            bVar4 = aVar.f3597d;
        }
        return aVar.c(bVar, bVar2, bVar3, bVar4);
    }

    @Override // m0.i1
    public final Q0 a(long j10, t tVar, Y0.d dVar) {
        float fA = this.f3594a.a(j10, dVar);
        float fA2 = this.f3595b.a(j10, dVar);
        float fA3 = this.f3596c.a(j10, dVar);
        float fA4 = this.f3597d.a(j10, dVar);
        float fH = C6537m.h(j10);
        float f10 = fA + fA4;
        if (f10 > fH) {
            float f11 = fH / f10;
            fA *= f11;
            fA4 *= f11;
        }
        float f12 = fA4;
        float f13 = fA2 + fA3;
        if (f13 > fH) {
            float f14 = fH / f13;
            fA2 *= f14;
            fA3 *= f14;
        }
        if (fA >= 0.0f && fA2 >= 0.0f && fA3 >= 0.0f && f12 >= 0.0f) {
            return e(j10, fA, fA2, fA3, f12, tVar);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + f12 + ")!").toString());
    }

    public final a b(b bVar) {
        return c(bVar, bVar, bVar, bVar);
    }

    public abstract a c(b bVar, b bVar2, b bVar3, b bVar4);

    public abstract Q0 e(long j10, float f10, float f11, float f12, float f13, t tVar);

    public final b f() {
        return this.f3596c;
    }

    public final b g() {
        return this.f3597d;
    }

    public final b h() {
        return this.f3595b;
    }

    public final b i() {
        return this.f3594a;
    }
}
