package o5;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f1 implements x, r5.i {
    public final long D;
    public final androidx.media3.common.r F;
    public final boolean G;
    public boolean H;
    public byte[] I;
    public int J;

    /* renamed from: a, reason: collision with root package name */
    public final b5.k f18929a;

    /* renamed from: d, reason: collision with root package name */
    public final b5.g f18930d;

    /* renamed from: g, reason: collision with root package name */
    public final b5.b0 f18931g;

    /* renamed from: r, reason: collision with root package name */
    public final r5.h f18932r;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f18933x;

    /* renamed from: y, reason: collision with root package name */
    public final h1 f18934y;
    public final ArrayList B = new ArrayList();
    public final r5.n E = new r5.n("SingleSampleMediaPeriod");

    public f1(b5.k kVar, b5.g gVar, b5.b0 b0Var, androidx.media3.common.r rVar, long j, r5.h hVar, e0 e0Var, boolean z10) {
        this.f18929a = kVar;
        this.f18930d = gVar;
        this.f18931g = b0Var;
        this.F = rVar;
        this.D = j;
        this.f18932r = hVar;
        this.f18933x = e0Var;
        this.G = z10;
        this.f18934y = new h1(new androidx.media3.common.b1("", rVar));
    }

    @Override // o5.x
    public final long C(androidx.media3.exoplayer.trackselection.v[] vVarArr, boolean[] zArr, x0[] x0VarArr, boolean[] zArr2, long j) {
        for (int i10 = 0; i10 < vVarArr.length; i10++) {
            x0 x0Var = x0VarArr[i10];
            ArrayList arrayList = this.B;
            if (x0Var != null && (vVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(x0Var);
                x0VarArr[i10] = null;
            }
            if (x0VarArr[i10] == null && vVarArr[i10] != null) {
                d1 d1Var = new d1(this);
                arrayList.add(d1Var);
                x0VarArr[i10] = d1Var;
                zArr2[i10] = true;
            }
        }
        return j;
    }

    @Override // o5.z0
    public final long d() {
        return (this.H || this.E.d()) ? Long.MIN_VALUE : 0L;
    }

    @Override // o5.x
    public final long f(long j) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i10 >= arrayList.size()) {
                return j;
            }
            d1 d1Var = (d1) arrayList.get(i10);
            if (d1Var.f18915a == 2) {
                d1Var.f18915a = 1;
            }
            i10++;
        }
    }

    @Override // o5.z0
    public final boolean i(long j) {
        if (this.H) {
            return false;
        }
        r5.n nVar = this.E;
        if (nVar.d() || nVar.c()) {
            return false;
        }
        b5.h hVarA = this.f18930d.a();
        b5.b0 b0Var = this.f18931g;
        if (b0Var != null) {
            hVarA.w(b0Var);
        }
        b5.k kVar = this.f18929a;
        e1 e1Var = new e1(hVarA, kVar);
        ((df.c) this.f18932r).getClass();
        this.f18933x.k(new q(kVar, nVar.f(e1Var, this, 3)), 1, -1, this.F, 0, null, 0L, this.D);
        return true;
    }

    @Override // o5.z0
    public final boolean isLoading() {
        return this.E.d();
    }

    @Override // o5.x
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // o5.x
    public final h1 l() {
        return this.f18934y;
    }

    @Override // o5.z0
    public final long m() {
        return this.H ? Long.MIN_VALUE : 0L;
    }

    @Override // r5.i
    public final r5.j q(r5.k kVar, long j, long j7, IOException iOException, int i10) {
        long jMin;
        r5.j jVar;
        e1 e1Var = (e1) kVar;
        b5.a0 a0Var = e1Var.f18927d;
        b5.k kVar2 = e1Var.f18926a;
        Uri uri = a0Var.f2421g;
        q qVar = new q(kVar2, j, j7, a0Var.f2420d);
        int i11 = a5.d0.f105a;
        r5.h hVar = this.f18932r;
        ((df.c) hVar).getClass();
        if ((iOException instanceof androidx.media3.common.k0) || (iOException instanceof FileNotFoundException) || (iOException instanceof b5.t) || (iOException instanceof r5.m)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i12 = b5.i.f2434d;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof b5.i) && ((b5.i) cause).f2435a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i10 - 1) * 1000, 5000);
        boolean z10 = jMin == -9223372036854775807L || i10 >= 3;
        if (this.G && z10) {
            a5.a.C("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.H = true;
            jVar = r5.n.f21248x;
        } else {
            jVar = jMin != -9223372036854775807L ? new r5.j(0, jMin) : r5.n.f21249y;
        }
        r5.j jVar2 = jVar;
        boolean zA = jVar2.a();
        this.f18933x.h(qVar, 1, -1, this.F, 0, null, 0L, this.D, iOException, !zA);
        if (!zA) {
            hVar.getClass();
        }
        return jVar2;
    }

    @Override // r5.i
    public final void r(r5.k kVar, long j, long j7) {
        e1 e1Var = (e1) kVar;
        this.J = (int) e1Var.f18927d.f2420d;
        byte[] bArr = e1Var.f18928g;
        bArr.getClass();
        this.I = bArr;
        this.H = true;
        b5.a0 a0Var = e1Var.f18927d;
        b5.k kVar2 = e1Var.f18926a;
        Uri uri = a0Var.f2421g;
        q qVar = new q(kVar2, j, j7, this.J);
        this.f18932r.getClass();
        this.f18933x.f(qVar, 1, -1, this.F, 0, null, 0L, this.D);
    }

    @Override // r5.i
    public final void s(r5.k kVar, long j, long j7, boolean z10) {
        e1 e1Var = (e1) kVar;
        b5.a0 a0Var = e1Var.f18927d;
        b5.k kVar2 = e1Var.f18926a;
        Uri uri = a0Var.f2421g;
        q qVar = new q(kVar2, j, j7, a0Var.f2420d);
        this.f18932r.getClass();
        this.f18933x.d(qVar, 1, -1, null, 0, null, 0L, this.D);
    }

    @Override // o5.x
    public final void t(w wVar, long j) {
        wVar.j(this);
    }

    @Override // o5.x
    public final void e() {
    }

    @Override // o5.x
    public final void g(long j) {
    }

    @Override // o5.z0
    public final void o(long j) {
    }

    @Override // o5.x
    public final long p(long j, d5.x0 x0Var) {
        return j;
    }
}
