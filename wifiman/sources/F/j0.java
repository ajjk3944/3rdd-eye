package F;

import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6531g;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    private final L0.M f5356a;

    /* renamed from: b, reason: collision with root package name */
    private C0.r f5357b;

    /* renamed from: c, reason: collision with root package name */
    private C0.r f5358c;

    public j0(L0.M m10, C0.r rVar, C0.r rVar2) {
        this.f5356a = m10;
        this.f5357b = rVar;
        this.f5358c = rVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long a(long r6) {
        /*
            r5 = this;
            C0.r r0 = r5.f5357b
            if (r0 == 0) goto L1e
            boolean r1 = r0.M()
            if (r1 == 0) goto L16
            C0.r r1 = r5.f5358c
            r2 = 0
            if (r1 == 0) goto L1c
            r3 = 0
            r4 = 2
            l0.i r2 = C0.r.c0(r1, r0, r3, r4, r2)
            goto L1c
        L16:
            l0.i$a r0 = l0.C6533i.f52340e
            l0.i r2 = r0.a()
        L1c:
            if (r2 != 0) goto L24
        L1e:
            l0.i$a r0 = l0.C6533i.f52340e
            l0.i r2 = r0.a()
        L24:
            long r6 = F.k0.a(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: F.j0.a(long):long");
    }

    public static /* synthetic */ int e(j0 j0Var, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return j0Var.d(j10, z10);
    }

    public final C0.r b() {
        return this.f5358c;
    }

    public final C0.r c() {
        return this.f5357b;
    }

    public final int d(long j10, boolean z10) {
        if (z10) {
            j10 = a(j10);
        }
        return this.f5356a.x(j(j10));
    }

    public final L0.M f() {
        return this.f5356a;
    }

    public final boolean g(long j10) {
        long j11 = j(a(j10));
        int iR = this.f5356a.r(C6531g.n(j11));
        return C6531g.m(j11) >= this.f5356a.s(iR) && C6531g.m(j11) <= this.f5356a.t(iR);
    }

    public final void h(C0.r rVar) {
        this.f5358c = rVar;
    }

    public final void i(C0.r rVar) {
        this.f5357b = rVar;
    }

    public final long j(long j10) {
        C0.r rVar;
        C0.r rVar2 = this.f5357b;
        if (rVar2 == null) {
            return j10;
        }
        if (!rVar2.M()) {
            rVar2 = null;
        }
        if (rVar2 == null || (rVar = this.f5358c) == null) {
            return j10;
        }
        C0.r rVar3 = rVar.M() ? rVar : null;
        return rVar3 == null ? j10 : rVar2.b0(rVar3, j10);
    }

    public final long k(long j10) {
        C0.r rVar;
        C0.r rVar2 = this.f5357b;
        if (rVar2 == null) {
            return j10;
        }
        if (!rVar2.M()) {
            rVar2 = null;
        }
        if (rVar2 == null || (rVar = this.f5358c) == null) {
            return j10;
        }
        C0.r rVar3 = rVar.M() ? rVar : null;
        return rVar3 == null ? j10 : rVar3.b0(rVar2, j10);
    }

    public /* synthetic */ j0(L0.M m10, C0.r rVar, C0.r rVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(m10, (i10 & 2) != 0 ? null : rVar, (i10 & 4) != 0 ? null : rVar2);
    }
}
