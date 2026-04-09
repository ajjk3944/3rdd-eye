package p1;

import java.util.ArrayList;
import o1.C7050f;

/* loaded from: classes.dex */
class k {

    /* renamed from: h, reason: collision with root package name */
    public static int f57487h;

    /* renamed from: c, reason: collision with root package name */
    m f57490c;

    /* renamed from: d, reason: collision with root package name */
    m f57491d;

    /* renamed from: f, reason: collision with root package name */
    int f57493f;

    /* renamed from: g, reason: collision with root package name */
    int f57494g;

    /* renamed from: a, reason: collision with root package name */
    public int f57488a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f57489b = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList f57492e = new ArrayList();

    public k(m mVar, int i10) {
        this.f57490c = null;
        this.f57491d = null;
        int i11 = f57487h;
        this.f57493f = i11;
        f57487h = i11 + 1;
        this.f57490c = mVar;
        this.f57491d = mVar;
        this.f57494g = i10;
    }

    private long c(f fVar, long j10) {
        m mVar = fVar.f57475d;
        if (mVar instanceof i) {
            return j10;
        }
        int size = fVar.f57482k.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.f57482k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f57475d != mVar) {
                    jMin = Math.min(jMin, c(fVar2, fVar2.f57477f + j10));
                }
            }
        }
        if (fVar != mVar.f57506i) {
            return jMin;
        }
        long j11 = j10 - mVar.j();
        return Math.min(Math.min(jMin, c(mVar.f57505h, j11)), j11 - mVar.f57505h.f57477f);
    }

    private long d(f fVar, long j10) {
        m mVar = fVar.f57475d;
        if (mVar instanceof i) {
            return j10;
        }
        int size = fVar.f57482k.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.f57482k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f57475d != mVar) {
                    jMax = Math.max(jMax, d(fVar2, fVar2.f57477f + j10));
                }
            }
        }
        if (fVar != mVar.f57505h) {
            return jMax;
        }
        long j11 = j10 + mVar.j();
        return Math.max(Math.max(jMax, d(mVar.f57506i, j11)), j11 - mVar.f57506i.f57477f);
    }

    public void a(m mVar) {
        this.f57492e.add(mVar);
        this.f57491d = mVar;
    }

    public long b(C7050f c7050f, int i10) {
        long j10;
        int i11;
        m mVar = this.f57490c;
        if (mVar instanceof c) {
            if (((c) mVar).f57503f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(mVar instanceof j)) {
                return 0L;
            }
        } else if (!(mVar instanceof l)) {
            return 0L;
        }
        f fVar = (i10 == 0 ? c7050f.f55115e : c7050f.f55117f).f57505h;
        f fVar2 = (i10 == 0 ? c7050f.f55115e : c7050f.f55117f).f57506i;
        boolean zContains = mVar.f57505h.f57483l.contains(fVar);
        boolean zContains2 = this.f57490c.f57506i.f57483l.contains(fVar2);
        long j11 = this.f57490c.j();
        if (zContains && zContains2) {
            long jD = d(this.f57490c.f57505h, 0L);
            long jC = c(this.f57490c.f57506i, 0L);
            long j12 = jD - j11;
            m mVar2 = this.f57490c;
            int i12 = mVar2.f57506i.f57477f;
            if (j12 >= (-i12)) {
                j12 += i12;
            }
            int i13 = mVar2.f57505h.f57477f;
            long j13 = ((-jC) - j11) - i13;
            if (j13 >= i13) {
                j13 -= i13;
            }
            float fO = mVar2.f57499b.o(i10);
            float f10 = fO > 0.0f ? (long) ((j13 / fO) + (j12 / (1.0f - fO))) : 0L;
            long j14 = ((long) ((f10 * fO) + 0.5f)) + j11 + ((long) ((f10 * (1.0f - fO)) + 0.5f));
            j10 = r12.f57505h.f57477f + j14;
            i11 = this.f57490c.f57506i.f57477f;
        } else {
            if (zContains) {
                return Math.max(d(this.f57490c.f57505h, r12.f57477f), this.f57490c.f57505h.f57477f + j11);
            }
            if (zContains2) {
                return Math.max(-c(this.f57490c.f57506i, r12.f57477f), (-this.f57490c.f57506i.f57477f) + j11);
            }
            j10 = r12.f57505h.f57477f + this.f57490c.j();
            i11 = this.f57490c.f57506i.f57477f;
        }
        return j10 - i11;
    }
}
