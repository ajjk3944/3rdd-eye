package os;

import rs.p;
import rs.x;

/* loaded from: classes.dex */
public final class a extends rs.k implements x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19731d;

    /* renamed from: g, reason: collision with root package name */
    public int f19732g;

    /* renamed from: r, reason: collision with root package name */
    public int f19733r;

    /* renamed from: x, reason: collision with root package name */
    public int f19734x;

    public /* synthetic */ a(int i10) {
        this.f19731d = i10;
    }

    @Override // rs.k
    public final rs.b c() {
        switch (this.f19731d) {
            case 0:
                b bVarF = f();
                bVarF.b();
                return bVarF;
            default:
                c cVarG = g();
                cVarG.b();
                return cVarG;
        }
    }

    public final Object clone() {
        switch (this.f19731d) {
            case 0:
                a aVar = new a(0);
                aVar.h(f());
                return aVar;
            default:
                a aVar2 = new a(1);
                aVar2.i(g());
                return aVar2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    @Override // rs.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final rs.k d(f5.u r2, rs.g r3) throws java.lang.Throwable {
        /*
            r1 = this;
            int r3 = r1.f19731d
            switch(r3) {
                case 0: goto L24;
                default: goto L5;
            }
        L5:
            r3 = 0
            ls.a r0 = os.c.D     // Catch: java.lang.Throwable -> L14 rs.t -> L16
            r0.getClass()     // Catch: java.lang.Throwable -> L14 rs.t -> L16
            os.c r0 = new os.c     // Catch: java.lang.Throwable -> L14 rs.t -> L16
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L14 rs.t -> L16
            r1.i(r0)
            return r1
        L14:
            r2 = move-exception
            goto L1e
        L16:
            r2 = move-exception
            rs.b r0 = r2.f21776a     // Catch: java.lang.Throwable -> L14
            os.c r0 = (os.c) r0     // Catch: java.lang.Throwable -> L14
            throw r2     // Catch: java.lang.Throwable -> L1c
        L1c:
            r2 = move-exception
            r3 = r0
        L1e:
            if (r3 == 0) goto L23
            r1.i(r3)
        L23:
            throw r2
        L24:
            r3 = 0
            ls.a r0 = os.b.D     // Catch: java.lang.Throwable -> L33 rs.t -> L35
            r0.getClass()     // Catch: java.lang.Throwable -> L33 rs.t -> L35
            os.b r0 = new os.b     // Catch: java.lang.Throwable -> L33 rs.t -> L35
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L33 rs.t -> L35
            r1.h(r0)
            return r1
        L33:
            r2 = move-exception
            goto L3d
        L35:
            r2 = move-exception
            rs.b r0 = r2.f21776a     // Catch: java.lang.Throwable -> L33
            os.b r0 = (os.b) r0     // Catch: java.lang.Throwable -> L33
            throw r2     // Catch: java.lang.Throwable -> L3b
        L3b:
            r2 = move-exception
            r3 = r0
        L3d:
            if (r3 == 0) goto L42
            r1.h(r3)
        L42:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: os.a.d(f5.u, rs.g):rs.k");
    }

    @Override // rs.k
    public final /* bridge */ /* synthetic */ rs.k e(p pVar) {
        switch (this.f19731d) {
            case 0:
                h((b) pVar);
                break;
            default:
                i((c) pVar);
                break;
        }
        return this;
    }

    public b f() {
        b bVar = new b(this);
        int i10 = this.f19732g;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        bVar.f19737g = this.f19733r;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        bVar.f19738r = this.f19734x;
        bVar.f19736d = i11;
        return bVar;
    }

    public c g() {
        c cVar = new c(this);
        int i10 = this.f19732g;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        cVar.f19743g = this.f19733r;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        cVar.f19744r = this.f19734x;
        cVar.f19742d = i11;
        return cVar;
    }

    public void h(b bVar) {
        if (bVar == b.B) {
            return;
        }
        int i10 = bVar.f19736d;
        if ((i10 & 1) == 1) {
            int i11 = bVar.f19737g;
            this.f19732g = 1 | this.f19732g;
            this.f19733r = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = bVar.f19738r;
            this.f19732g = 2 | this.f19732g;
            this.f19734x = i12;
        }
        this.f21763a = this.f21763a.b(bVar.f19735a);
    }

    public void i(c cVar) {
        if (cVar == c.B) {
            return;
        }
        int i10 = cVar.f19742d;
        if ((i10 & 1) == 1) {
            int i11 = cVar.f19743g;
            this.f19732g = 1 | this.f19732g;
            this.f19733r = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = cVar.f19744r;
            this.f19732g = 2 | this.f19732g;
            this.f19734x = i12;
        }
        this.f21763a = this.f21763a.b(cVar.f19741a);
    }
}
