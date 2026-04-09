package ls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class o extends rs.k implements rs.x {

    /* renamed from: d, reason: collision with root package name */
    public int f15844d;

    /* renamed from: g, reason: collision with root package name */
    public p f15845g;

    /* renamed from: r, reason: collision with root package name */
    public List f15846r;

    /* renamed from: x, reason: collision with root package name */
    public w f15847x;

    /* renamed from: y, reason: collision with root package name */
    public q f15848y;

    public static o g() {
        o oVar = new o();
        oVar.f15845g = p.RETURNS_CONSTANT;
        oVar.f15846r = Collections.EMPTY_LIST;
        oVar.f15847x = w.H;
        oVar.f15848y = q.AT_MOST_ONCE;
        return oVar;
    }

    @Override // rs.k
    public final rs.b c() {
        r rVarF = f();
        if (rVarF.b()) {
            return rVarF;
        }
        throw new bf.n();
    }

    public final Object clone() {
        o oVarG = g();
        oVarG.h(f());
        return oVarG;
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
            ls.a r1 = ls.r.F     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            ls.r r1 = new ls.r     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r2.h(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            rs.b r4 = r3.f21776a     // Catch: java.lang.Throwable -> Lf
            ls.r r4 = (ls.r) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: ls.o.d(f5.u, rs.g):rs.k");
    }

    @Override // rs.k
    public final /* bridge */ /* synthetic */ rs.k e(rs.p pVar) {
        h((r) pVar);
        return this;
    }

    public final r f() {
        r rVar = new r(this);
        int i10 = this.f15844d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        rVar.f15865g = this.f15845g;
        if ((i10 & 2) == 2) {
            this.f15846r = Collections.unmodifiableList(this.f15846r);
            this.f15844d &= -3;
        }
        rVar.f15866r = this.f15846r;
        if ((i10 & 4) == 4) {
            i11 |= 2;
        }
        rVar.f15867x = this.f15847x;
        if ((i10 & 8) == 8) {
            i11 |= 4;
        }
        rVar.f15868y = this.f15848y;
        rVar.f15864d = i11;
        return rVar;
    }

    public final void h(r rVar) {
        w wVar;
        if (rVar == r.E) {
            return;
        }
        if ((rVar.f15864d & 1) == 1) {
            p pVar = rVar.f15865g;
            pVar.getClass();
            this.f15844d = 1 | this.f15844d;
            this.f15845g = pVar;
        }
        if (!rVar.f15866r.isEmpty()) {
            if (this.f15846r.isEmpty()) {
                this.f15846r = rVar.f15866r;
                this.f15844d &= -3;
            } else {
                if ((this.f15844d & 2) != 2) {
                    this.f15846r = new ArrayList(this.f15846r);
                    this.f15844d |= 2;
                }
                this.f15846r.addAll(rVar.f15866r);
            }
        }
        if ((rVar.f15864d & 2) == 2) {
            w wVar2 = rVar.f15867x;
            if ((this.f15844d & 4) != 4 || (wVar = this.f15847x) == w.H) {
                this.f15847x = wVar2;
            } else {
                u uVarG = u.g();
                uVarG.h(wVar);
                uVarG.h(wVar2);
                this.f15847x = uVarG.f();
            }
            this.f15844d |= 4;
        }
        if ((rVar.f15864d & 4) == 4) {
            q qVar = rVar.f15868y;
            qVar.getClass();
            this.f15844d |= 8;
            this.f15848y = qVar;
        }
        this.f21763a = this.f21763a.b(rVar.f15863a);
    }
}
