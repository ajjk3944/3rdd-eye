package ls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class k extends rs.l {
    public List B;

    /* renamed from: r, reason: collision with root package name */
    public int f15811r;

    /* renamed from: x, reason: collision with root package name */
    public int f15812x;

    /* renamed from: y, reason: collision with root package name */
    public List f15813y;

    public static k h() {
        k kVar = new k();
        kVar.f15812x = 6;
        List list = Collections.EMPTY_LIST;
        kVar.f15813y = list;
        kVar.B = list;
        return kVar;
    }

    @Override // rs.k
    public final rs.b c() {
        l lVarG = g();
        if (lVarG.b()) {
            return lVarG;
        }
        throw new bf.n();
    }

    public final Object clone() {
        k kVarH = h();
        kVarH.i(g());
        return kVarH;
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
            ls.a r1 = ls.l.F     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            ls.l r1 = new ls.l     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            rs.b r4 = r3.f21776a     // Catch: java.lang.Throwable -> Lf
            ls.l r4 = (ls.l) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.i(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.k.d(f5.u, rs.g):rs.k");
    }

    @Override // rs.k
    public final /* bridge */ /* synthetic */ rs.k e(rs.p pVar) {
        i((l) pVar);
        return this;
    }

    public final l g() {
        l lVar = new l(this);
        int i10 = this.f15811r;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        lVar.f15822r = this.f15812x;
        if ((i10 & 2) == 2) {
            this.f15813y = Collections.unmodifiableList(this.f15813y);
            this.f15811r &= -3;
        }
        lVar.f15823x = this.f15813y;
        if ((this.f15811r & 4) == 4) {
            this.B = Collections.unmodifiableList(this.B);
            this.f15811r &= -5;
        }
        lVar.f15824y = this.B;
        lVar.f15821g = i11;
        return lVar;
    }

    public final void i(l lVar) {
        if (lVar == l.E) {
            return;
        }
        if ((lVar.f15821g & 1) == 1) {
            int i10 = lVar.f15822r;
            this.f15811r = 1 | this.f15811r;
            this.f15812x = i10;
        }
        if (!lVar.f15823x.isEmpty()) {
            if (this.f15813y.isEmpty()) {
                this.f15813y = lVar.f15823x;
                this.f15811r &= -3;
            } else {
                if ((this.f15811r & 2) != 2) {
                    this.f15813y = new ArrayList(this.f15813y);
                    this.f15811r |= 2;
                }
                this.f15813y.addAll(lVar.f15823x);
            }
        }
        if (!lVar.f15824y.isEmpty()) {
            if (this.B.isEmpty()) {
                this.B = lVar.f15824y;
                this.f15811r &= -5;
            } else {
                if ((this.f15811r & 4) != 4) {
                    this.B = new ArrayList(this.B);
                    this.f15811r |= 4;
                }
                this.B.addAll(lVar.f15824y);
            }
        }
        f(lVar);
        this.f21763a = this.f21763a.b(lVar.f15820d);
    }
}
