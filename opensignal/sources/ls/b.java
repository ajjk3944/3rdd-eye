package ls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends rs.k implements rs.x {
    public int B;
    public int D;
    public int E;
    public g F;
    public List G;
    public int H;
    public int I;

    /* renamed from: d, reason: collision with root package name */
    public int f15723d;

    /* renamed from: g, reason: collision with root package name */
    public c f15724g;

    /* renamed from: r, reason: collision with root package name */
    public long f15725r;

    /* renamed from: x, reason: collision with root package name */
    public float f15726x;

    /* renamed from: y, reason: collision with root package name */
    public double f15727y;

    public static b g() {
        b bVar = new b();
        bVar.f15724g = c.BYTE;
        bVar.F = g.B;
        bVar.G = Collections.EMPTY_LIST;
        return bVar;
    }

    @Override // rs.k
    public final rs.b c() {
        d dVarF = f();
        if (dVarF.b()) {
            return dVarF;
        }
        throw new bf.n();
    }

    public final Object clone() {
        b bVarG = g();
        bVarG.h(f());
        return bVarG;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // rs.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final rs.k d(f5.u r3, rs.g r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            ls.a r1 = ls.d.M     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            ls.d r1 = new ls.d     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r2.h(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            rs.b r4 = r3.f21776a     // Catch: java.lang.Throwable -> Lf
            ls.d r4 = (ls.d) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.h(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.b.d(f5.u, rs.g):rs.k");
    }

    @Override // rs.k
    public final /* bridge */ /* synthetic */ rs.k e(rs.p pVar) {
        h((d) pVar);
        return this;
    }

    public final d f() {
        d dVar = new d(this);
        int i10 = this.f15723d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        dVar.f15744g = this.f15724g;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        dVar.f15745r = this.f15725r;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        dVar.f15746x = this.f15726x;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        dVar.f15747y = this.f15727y;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        dVar.B = this.B;
        if ((i10 & 32) == 32) {
            i11 |= 32;
        }
        dVar.D = this.D;
        if ((i10 & 64) == 64) {
            i11 |= 64;
        }
        dVar.E = this.E;
        if ((i10 & 128) == 128) {
            i11 |= 128;
        }
        dVar.F = this.F;
        if ((i10 & 256) == 256) {
            this.G = Collections.unmodifiableList(this.G);
            this.f15723d &= -257;
        }
        dVar.G = this.G;
        if ((i10 & 512) == 512) {
            i11 |= 256;
        }
        dVar.H = this.H;
        if ((i10 & 1024) == 1024) {
            i11 |= 512;
        }
        dVar.I = this.I;
        dVar.f15743d = i11;
        return dVar;
    }

    public final void h(d dVar) {
        g gVar;
        if (dVar == d.L) {
            return;
        }
        if ((dVar.f15743d & 1) == 1) {
            c cVar = dVar.f15744g;
            cVar.getClass();
            this.f15723d = 1 | this.f15723d;
            this.f15724g = cVar;
        }
        int i10 = dVar.f15743d;
        if ((i10 & 2) == 2) {
            long j = dVar.f15745r;
            this.f15723d |= 2;
            this.f15725r = j;
        }
        if ((i10 & 4) == 4) {
            float f10 = dVar.f15746x;
            this.f15723d = 4 | this.f15723d;
            this.f15726x = f10;
        }
        if ((i10 & 8) == 8) {
            double d6 = dVar.f15747y;
            this.f15723d |= 8;
            this.f15727y = d6;
        }
        if ((i10 & 16) == 16) {
            int i11 = dVar.B;
            this.f15723d = 16 | this.f15723d;
            this.B = i11;
        }
        if ((i10 & 32) == 32) {
            int i12 = dVar.D;
            this.f15723d = 32 | this.f15723d;
            this.D = i12;
        }
        if ((i10 & 64) == 64) {
            int i13 = dVar.E;
            this.f15723d = 64 | this.f15723d;
            this.E = i13;
        }
        if ((i10 & 128) == 128) {
            g gVar2 = dVar.F;
            if ((this.f15723d & 128) != 128 || (gVar = this.F) == g.B) {
                this.F = gVar2;
            } else {
                f fVar = new f(0);
                fVar.f15770r = Collections.EMPTY_LIST;
                fVar.k(gVar);
                fVar.k(gVar2);
                this.F = fVar.g();
            }
            this.f15723d |= 128;
        }
        if (!dVar.G.isEmpty()) {
            if (this.G.isEmpty()) {
                this.G = dVar.G;
                this.f15723d &= -257;
            } else {
                if ((this.f15723d & 256) != 256) {
                    this.G = new ArrayList(this.G);
                    this.f15723d |= 256;
                }
                this.G.addAll(dVar.G);
            }
        }
        int i14 = dVar.f15743d;
        if ((i14 & 256) == 256) {
            int i15 = dVar.H;
            this.f15723d |= 512;
            this.H = i15;
        }
        if ((i14 & 512) == 512) {
            int i16 = dVar.I;
            this.f15723d |= 1024;
            this.I = i16;
        }
        this.f21763a = this.f21763a.b(dVar.f15742a);
    }
}
