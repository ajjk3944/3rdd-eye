package ls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d0 extends rs.l {
    public c0 B;
    public List D;

    /* renamed from: r, reason: collision with root package name */
    public int f15748r;

    /* renamed from: x, reason: collision with root package name */
    public l0 f15749x;

    /* renamed from: y, reason: collision with root package name */
    public k0 f15750y;

    public static d0 h() {
        d0 d0Var = new d0();
        d0Var.f15749x = l0.f15825x;
        d0Var.f15750y = k0.f15814x;
        d0Var.B = c0.G;
        d0Var.D = Collections.EMPTY_LIST;
        return d0Var;
    }

    @Override // rs.k
    public final rs.b c() {
        e0 e0VarG = g();
        if (e0VarG.b()) {
            return e0VarG;
        }
        throw new bf.n();
    }

    public final Object clone() {
        d0 d0VarH = h();
        d0VarH.i(g());
        return d0VarH;
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
            ls.a r1 = ls.e0.G     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            ls.e0 r1 = new ls.e0     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            rs.b r4 = r3.f21776a     // Catch: java.lang.Throwable -> Lf
            ls.e0 r4 = (ls.e0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: ls.d0.d(f5.u, rs.g):rs.k");
    }

    @Override // rs.k
    public final /* bridge */ /* synthetic */ rs.k e(rs.p pVar) {
        i((e0) pVar);
        return this;
    }

    public final e0 g() {
        e0 e0Var = new e0(this);
        int i10 = this.f15748r;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        e0Var.f15765r = this.f15749x;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        e0Var.f15766x = this.f15750y;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        e0Var.f15767y = this.B;
        if ((i10 & 8) == 8) {
            this.D = Collections.unmodifiableList(this.D);
            this.f15748r &= -9;
        }
        e0Var.B = this.D;
        e0Var.f15764g = i11;
        return e0Var;
    }

    public final void i(e0 e0Var) {
        c0 c0Var;
        k0 k0Var;
        l0 l0Var;
        if (e0Var == e0.F) {
            return;
        }
        if ((e0Var.f15764g & 1) == 1) {
            l0 l0Var2 = e0Var.f15765r;
            if ((this.f15748r & 1) != 1 || (l0Var = this.f15749x) == l0.f15825x) {
                this.f15749x = l0Var2;
            } else {
                m mVar = new m(3);
                mVar.f15833r = rs.u.f21777d;
                mVar.l(l0Var);
                mVar.l(l0Var2);
                this.f15749x = mVar.h();
            }
            this.f15748r |= 1;
        }
        if ((e0Var.f15764g & 2) == 2) {
            k0 k0Var2 = e0Var.f15766x;
            if ((this.f15748r & 2) != 2 || (k0Var = this.f15750y) == k0.f15814x) {
                this.f15750y = k0Var2;
            } else {
                m mVar2 = new m(1);
                mVar2.f15833r = Collections.EMPTY_LIST;
                mVar2.k(k0Var);
                mVar2.k(k0Var2);
                this.f15750y = mVar2.g();
            }
            this.f15748r |= 2;
        }
        if ((e0Var.f15764g & 4) == 4) {
            c0 c0Var2 = e0Var.f15767y;
            if ((this.f15748r & 4) != 4 || (c0Var = this.B) == c0.G) {
                this.B = c0Var2;
            } else {
                b0 b0VarH = b0.h();
                b0VarH.i(c0Var);
                b0VarH.i(c0Var2);
                this.B = b0VarH.g();
            }
            this.f15748r |= 4;
        }
        if (!e0Var.B.isEmpty()) {
            if (this.D.isEmpty()) {
                this.D = e0Var.B;
                this.f15748r &= -9;
            } else {
                if ((this.f15748r & 8) != 8) {
                    this.D = new ArrayList(this.D);
                    this.f15748r |= 8;
                }
                this.D.addAll(e0Var.B);
            }
        }
        f(e0Var);
        this.f21763a = this.f21763a.b(e0Var.f15763d);
    }
}
