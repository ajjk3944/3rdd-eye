package c2;

import com.google.android.gms.internal.measurement.i4;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final g2.v f2592a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2593b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2594c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2595d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2596e;

    /* renamed from: f, reason: collision with root package name */
    public final x.a0 f2597f = new x.a0();
    public final i g = new i();

    /* renamed from: h, reason: collision with root package name */
    public final x.x f2598h = new x.x(10);

    public d(g2.v vVar) {
        this.f2592a = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.util.List r19, boolean r20, long r21) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.d.a(java.util.List, boolean, long):void");
    }

    public final boolean b(i4 i4Var, boolean z3) {
        x.o oVar = (x.o) i4Var.f19782c;
        g2.v vVar = this.f2592a;
        i iVar = this.g;
        boolean zA = iVar.a(oVar, vVar, i4Var, z3);
        w0.e eVar = iVar.f2620a;
        if (!zA) {
            return false;
        }
        boolean z10 = true;
        this.f2593b = true;
        Object[] objArr = eVar.f36397a;
        int i4 = eVar.f36399c;
        boolean z11 = false;
        for (int i10 = 0; i10 < i4; i10++) {
            z11 = ((h) objArr[i10]).e(i4Var, z3) || z11;
        }
        Object[] objArr2 = eVar.f36397a;
        int i11 = eVar.f36399c;
        boolean z12 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            z12 = ((h) objArr2[i12]).d(i4Var) || z12;
        }
        iVar.b(i4Var);
        if (!z12 && !z11) {
            z10 = false;
        }
        this.f2593b = false;
        if (this.f2596e) {
            this.f2596e = false;
            x.a0 a0Var = this.f2597f;
            int i13 = a0Var.f36847b;
            for (int i14 = 0; i14 < i13; i14++) {
                d((i1.m) a0Var.f(i14));
            }
            a0Var.d();
        }
        if (this.f2594c) {
            this.f2594c = false;
            c();
        }
        if (this.f2595d) {
            this.f2595d = false;
            iVar.f2620a.h();
        }
        return z10;
    }

    public final void c() {
        if (this.f2593b) {
            this.f2594c = true;
            return;
        }
        i iVar = this.g;
        w0.e eVar = iVar.f2620a;
        Object[] objArr = eVar.f36397a;
        int i4 = eVar.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            ((h) objArr[i10]).c();
        }
        if (this.f2595d) {
            this.f2595d = true;
        } else {
            iVar.f2620a.h();
        }
    }

    public final void d(i1.m mVar) {
        if (this.f2593b) {
            this.f2596e = true;
            this.f2597f.a(mVar);
            return;
        }
        i iVar = this.g;
        x.a0 a0Var = iVar.f2621b;
        a0Var.d();
        a0Var.a(iVar);
        while (a0Var.i()) {
            i iVar2 = (i) a0Var.k(a0Var.f36847b - 1);
            int i4 = 0;
            while (true) {
                w0.e eVar = iVar2.f2620a;
                if (i4 < eVar.f36399c) {
                    h hVar = (h) eVar.f36397a[i4];
                    if (nk.k.a(hVar.f2613c, mVar)) {
                        iVar2.f2620a.k(hVar);
                        hVar.c();
                    } else {
                        a0Var.a(hVar);
                        i4++;
                    }
                }
            }
        }
    }
}
