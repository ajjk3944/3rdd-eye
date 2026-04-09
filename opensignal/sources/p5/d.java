package p5;

import android.util.SparseArray;
import androidx.media3.common.r;
import u5.a0;
import u5.x;

/* loaded from: classes.dex */
public final class d implements u5.m, f {
    public static final ca.n F = new ca.n();
    public long B;
    public x D;
    public r[] E;

    /* renamed from: a, reason: collision with root package name */
    public final u5.k f20258a;

    /* renamed from: d, reason: collision with root package name */
    public final int f20259d;

    /* renamed from: g, reason: collision with root package name */
    public final r f20260g;

    /* renamed from: r, reason: collision with root package name */
    public final SparseArray f20261r = new SparseArray();

    /* renamed from: x, reason: collision with root package name */
    public boolean f20262x;

    /* renamed from: y, reason: collision with root package name */
    public om.f f20263y;

    public d(u5.k kVar, int i10, r rVar) {
        this.f20258a = kVar;
        this.f20259d = i10;
        this.f20260g = rVar;
    }

    public final void a(om.f fVar, long j, long j7) {
        this.f20263y = fVar;
        this.B = j7;
        boolean z10 = this.f20262x;
        u5.k kVar = this.f20258a;
        if (!z10) {
            kVar.f(this);
            if (j != -9223372036854775807L) {
                kVar.c(0L, j);
            }
            this.f20262x = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        kVar.c(0L, j);
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f20261r;
            if (i10 >= sparseArray.size()) {
                return;
            }
            c cVar = (c) sparseArray.valueAt(i10);
            if (fVar == null) {
                cVar.f20256e = cVar.f20254c;
            } else {
                cVar.f20257f = j7;
                a0 a0VarV = fVar.v(cVar.f20252a);
                cVar.f20256e = a0VarV;
                r rVar = cVar.f20255d;
                if (rVar != null) {
                    a0VarV.c(rVar);
                }
            }
            i10++;
        }
    }

    @Override // u5.m
    public final void j() {
        SparseArray sparseArray = this.f20261r;
        r[] rVarArr = new r[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            r rVar = ((c) sparseArray.valueAt(i10)).f20255d;
            a5.a.j(rVar);
            rVarArr[i10] = rVar;
        }
        this.E = rVarArr;
    }

    @Override // u5.m
    /* renamed from: n */
    public final a0 mo36n(int i10, int i11) {
        SparseArray sparseArray = this.f20261r;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            a5.a.i(this.E == null);
            cVar = new c(i10, i11, i11 == this.f20259d ? this.f20260g : null);
            om.f fVar = this.f20263y;
            long j = this.B;
            if (fVar == null) {
                cVar.f20256e = cVar.f20254c;
            } else {
                cVar.f20257f = j;
                a0 a0VarV = fVar.v(i11);
                cVar.f20256e = a0VarV;
                r rVar = cVar.f20255d;
                if (rVar != null) {
                    a0VarV.c(rVar);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }

    @Override // u5.m
    public final void u(x xVar) {
        this.D = xVar;
    }
}
