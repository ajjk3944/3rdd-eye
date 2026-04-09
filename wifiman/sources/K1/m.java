package k1;

import java.util.ArrayList;

/* loaded from: classes.dex */
class m {

    /* renamed from: h, reason: collision with root package name */
    public static int f51062h;

    /* renamed from: c, reason: collision with root package name */
    p f51065c;

    /* renamed from: d, reason: collision with root package name */
    p f51066d;

    /* renamed from: f, reason: collision with root package name */
    int f51068f;

    /* renamed from: g, reason: collision with root package name */
    int f51069g;

    /* renamed from: a, reason: collision with root package name */
    public int f51063a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f51064b = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList f51067e = new ArrayList();

    m(p pVar, int i10) {
        this.f51065c = null;
        this.f51066d = null;
        int i11 = f51062h;
        this.f51068f = i11;
        f51062h = i11 + 1;
        this.f51065c = pVar;
        this.f51066d = pVar;
        this.f51069g = i10;
    }

    private long c(f fVar, long j10) {
        p pVar = fVar.f51047d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f51054k.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC6358d interfaceC6358d = (InterfaceC6358d) fVar.f51054k.get(i10);
            if (interfaceC6358d instanceof f) {
                f fVar2 = (f) interfaceC6358d;
                if (fVar2.f51047d != pVar) {
                    jMin = Math.min(jMin, c(fVar2, fVar2.f51049f + j10));
                }
            }
        }
        if (fVar != pVar.f51095i) {
            return jMin;
        }
        long j11 = j10 - pVar.j();
        return Math.min(Math.min(jMin, c(pVar.f51094h, j11)), j11 - pVar.f51094h.f51049f);
    }

    private long d(f fVar, long j10) {
        p pVar = fVar.f51047d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f51054k.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC6358d interfaceC6358d = (InterfaceC6358d) fVar.f51054k.get(i10);
            if (interfaceC6358d instanceof f) {
                f fVar2 = (f) interfaceC6358d;
                if (fVar2.f51047d != pVar) {
                    jMax = Math.max(jMax, d(fVar2, fVar2.f51049f + j10));
                }
            }
        }
        if (fVar != pVar.f51094h) {
            return jMax;
        }
        long j11 = j10 + pVar.j();
        return Math.max(Math.max(jMax, d(pVar.f51095i, j11)), j11 - pVar.f51095i.f51049f);
    }

    public void a(p pVar) {
        this.f51067e.add(pVar);
        this.f51066d = pVar;
    }

    public long b(j1.f fVar, int i10) {
        long j10;
        int i11;
        p pVar = this.f51065c;
        if (pVar instanceof C6357c) {
            if (((C6357c) pVar).f51092f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i10 == 0 ? fVar.f49900e : fVar.f49902f).f51094h;
        f fVar3 = (i10 == 0 ? fVar.f49900e : fVar.f49902f).f51095i;
        boolean zContains = pVar.f51094h.f51055l.contains(fVar2);
        boolean zContains2 = this.f51065c.f51095i.f51055l.contains(fVar3);
        long j11 = this.f51065c.j();
        if (zContains && zContains2) {
            long jD = d(this.f51065c.f51094h, 0L);
            long jC = c(this.f51065c.f51095i, 0L);
            long j12 = jD - j11;
            p pVar2 = this.f51065c;
            int i12 = pVar2.f51095i.f51049f;
            if (j12 >= (-i12)) {
                j12 += i12;
            }
            int i13 = pVar2.f51094h.f51049f;
            long j13 = ((-jC) - j11) - i13;
            if (j13 >= i13) {
                j13 -= i13;
            }
            float fN = pVar2.f51088b.n(i10);
            float f10 = fN > 0.0f ? (long) ((j13 / fN) + (j12 / (1.0f - fN))) : 0L;
            long j14 = ((long) ((f10 * fN) + 0.5f)) + j11 + ((long) ((f10 * (1.0f - fN)) + 0.5f));
            j10 = r12.f51094h.f51049f + j14;
            i11 = this.f51065c.f51095i.f51049f;
        } else {
            if (zContains) {
                return Math.max(d(this.f51065c.f51094h, r12.f51049f), this.f51065c.f51094h.f51049f + j11);
            }
            if (zContains2) {
                return Math.max(-c(this.f51065c.f51095i, r12.f51049f), (-this.f51065c.f51095i.f51049f) + j11);
            }
            j10 = r12.f51094h.f51049f + this.f51065c.j();
            i11 = this.f51065c.f51095i.f51049f;
        }
        return j10 - i11;
    }
}
