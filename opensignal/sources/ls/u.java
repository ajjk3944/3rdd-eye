package ls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class u extends rs.k implements rs.x {
    public int B;
    public List D;
    public List E;

    /* renamed from: d, reason: collision with root package name */
    public int f15887d;

    /* renamed from: g, reason: collision with root package name */
    public int f15888g;

    /* renamed from: r, reason: collision with root package name */
    public int f15889r;

    /* renamed from: x, reason: collision with root package name */
    public v f15890x;

    /* renamed from: y, reason: collision with root package name */
    public q0 f15891y;

    public static u g() {
        u uVar = new u();
        uVar.f15890x = v.TRUE;
        uVar.f15891y = q0.P;
        List list = Collections.EMPTY_LIST;
        uVar.D = list;
        uVar.E = list;
        return uVar;
    }

    @Override // rs.k
    public final rs.b c() {
        w wVarF = f();
        if (wVarF.b()) {
            return wVarF;
        }
        throw new bf.n();
    }

    public final Object clone() {
        u uVarG = g();
        uVarG.h(f());
        return uVarG;
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
            ls.a r1 = ls.w.I     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            ls.w r1 = new ls.w     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r2.h(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            rs.b r4 = r3.f21776a     // Catch: java.lang.Throwable -> Lf
            ls.w r4 = (ls.w) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: ls.u.d(f5.u, rs.g):rs.k");
    }

    @Override // rs.k
    public final /* bridge */ /* synthetic */ rs.k e(rs.p pVar) {
        h((w) pVar);
        return this;
    }

    public final w f() {
        w wVar = new w(this);
        int i10 = this.f15887d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        wVar.f15899g = this.f15888g;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        wVar.f15900r = this.f15889r;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        wVar.f15901x = this.f15890x;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        wVar.f15902y = this.f15891y;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        wVar.B = this.B;
        if ((i10 & 32) == 32) {
            this.D = Collections.unmodifiableList(this.D);
            this.f15887d &= -33;
        }
        wVar.D = this.D;
        if ((this.f15887d & 64) == 64) {
            this.E = Collections.unmodifiableList(this.E);
            this.f15887d &= -65;
        }
        wVar.E = this.E;
        wVar.f15898d = i11;
        return wVar;
    }

    public final void h(w wVar) {
        q0 q0Var;
        if (wVar == w.H) {
            return;
        }
        int i10 = wVar.f15898d;
        if ((i10 & 1) == 1) {
            int i11 = wVar.f15899g;
            this.f15887d = 1 | this.f15887d;
            this.f15888g = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = wVar.f15900r;
            this.f15887d = 2 | this.f15887d;
            this.f15889r = i12;
        }
        if ((i10 & 4) == 4) {
            v vVar = wVar.f15901x;
            vVar.getClass();
            this.f15887d = 4 | this.f15887d;
            this.f15890x = vVar;
        }
        if ((wVar.f15898d & 8) == 8) {
            q0 q0Var2 = wVar.f15902y;
            if ((this.f15887d & 8) != 8 || (q0Var = this.f15891y) == q0.P) {
                this.f15891y = q0Var2;
            } else {
                p0 p0VarR = q0.r(q0Var);
                p0VarR.i(q0Var2);
                this.f15891y = p0VarR.g();
            }
            this.f15887d |= 8;
        }
        if ((wVar.f15898d & 16) == 16) {
            int i13 = wVar.B;
            this.f15887d = 16 | this.f15887d;
            this.B = i13;
        }
        if (!wVar.D.isEmpty()) {
            if (this.D.isEmpty()) {
                this.D = wVar.D;
                this.f15887d &= -33;
            } else {
                if ((this.f15887d & 32) != 32) {
                    this.D = new ArrayList(this.D);
                    this.f15887d |= 32;
                }
                this.D.addAll(wVar.D);
            }
        }
        if (!wVar.E.isEmpty()) {
            if (this.E.isEmpty()) {
                this.E = wVar.E;
                this.f15887d &= -65;
            } else {
                if ((this.f15887d & 64) != 64) {
                    this.E = new ArrayList(this.E);
                    this.f15887d |= 64;
                }
                this.E.addAll(wVar.E);
            }
        }
        this.f21763a = this.f21763a.b(wVar.f15897a);
    }
}
