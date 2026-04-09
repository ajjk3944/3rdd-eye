package ab;

import android.util.SparseArray;
import ca.u;
import ca.x;
import com.google.android.exoplayer2.Format;

/* loaded from: classes.dex */
public final class e implements ca.m {
    public static final ca.n F = new ca.n();
    public long B;
    public u D;
    public Format[] E;

    /* renamed from: a, reason: collision with root package name */
    public final ca.k f295a;

    /* renamed from: d, reason: collision with root package name */
    public final int f296d;

    /* renamed from: g, reason: collision with root package name */
    public final Format f297g;

    /* renamed from: r, reason: collision with root package name */
    public final SparseArray f298r = new SparseArray();

    /* renamed from: x, reason: collision with root package name */
    public boolean f299x;

    /* renamed from: y, reason: collision with root package name */
    public io.sentry.internal.debugmeta.c f300y;

    public e(ca.k kVar, int i10, Format format) {
        this.f295a = kVar;
        this.f296d = i10;
        this.f297g = format;
    }

    public final void a(io.sentry.internal.debugmeta.c cVar, long j, long j7) {
        this.f300y = cVar;
        this.B = j7;
        boolean z10 = this.f299x;
        ca.k kVar = this.f295a;
        if (!z10) {
            kVar.h(this);
            if (j != -9223372036854775807L) {
                kVar.c(0L, j);
            }
            this.f299x = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        kVar.c(0L, j);
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f298r;
            if (i10 >= sparseArray.size()) {
                return;
            }
            d dVar = (d) sparseArray.valueAt(i10);
            if (cVar == null) {
                dVar.f293e = dVar.f291c;
            } else {
                dVar.f294f = j7;
                x xVarE = cVar.E(dVar.f289a);
                dVar.f293e = xVarE;
                Format format = dVar.f292d;
                if (format != null) {
                    xVarE.e(format);
                }
            }
            i10++;
        }
    }

    @Override // ca.m
    public final void j() {
        SparseArray sparseArray = this.f298r;
        Format[] formatArr = new Format[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            Format format = ((d) sparseArray.valueAt(i10)).f292d;
            qb.b.k(format);
            formatArr[i10] = format;
        }
        this.E = formatArr;
    }

    @Override // ca.m
    public final x n(int i10, int i11) {
        SparseArray sparseArray = this.f298r;
        d dVar = (d) sparseArray.get(i10);
        if (dVar == null) {
            qb.b.j(this.E == null);
            dVar = new d(i10, i11, i11 == this.f296d ? this.f297g : null);
            io.sentry.internal.debugmeta.c cVar = this.f300y;
            long j = this.B;
            if (cVar == null) {
                dVar.f293e = dVar.f291c;
            } else {
                dVar.f294f = j;
                x xVarE = cVar.E(i11);
                dVar.f293e = xVarE;
                Format format = dVar.f292d;
                if (format != null) {
                    xVarE.e(format);
                }
            }
            sparseArray.put(i10, dVar);
        }
        return dVar;
    }

    @Override // ca.m
    public final void r(u uVar) {
        this.D = uVar;
    }
}
