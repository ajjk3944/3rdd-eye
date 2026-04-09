package os;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rs.p;
import rs.x;

/* loaded from: classes.dex */
public final class f extends rs.k implements x {

    /* renamed from: d, reason: collision with root package name */
    public int f19758d;

    /* renamed from: g, reason: collision with root package name */
    public List f19759g;

    /* renamed from: r, reason: collision with root package name */
    public List f19760r;

    @Override // rs.k
    public final rs.b c() {
        j jVarF = f();
        jVarF.b();
        return jVarF;
    }

    public final Object clone() {
        f fVar = new f();
        List list = Collections.EMPTY_LIST;
        fVar.f19759g = list;
        fVar.f19760r = list;
        fVar.g(f());
        return fVar;
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
            ls.a r1 = os.j.D     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            os.j r1 = new os.j     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r2.g(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            rs.b r4 = r3.f21776a     // Catch: java.lang.Throwable -> Lf
            os.j r4 = (os.j) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.g(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: os.f.d(f5.u, rs.g):rs.k");
    }

    @Override // rs.k
    public final /* bridge */ /* synthetic */ rs.k e(p pVar) {
        g((j) pVar);
        return this;
    }

    public final j f() {
        j jVar = new j(this);
        if ((this.f19758d & 1) == 1) {
            this.f19759g = Collections.unmodifiableList(this.f19759g);
            this.f19758d &= -2;
        }
        jVar.f19773d = this.f19759g;
        if ((this.f19758d & 2) == 2) {
            this.f19760r = Collections.unmodifiableList(this.f19760r);
            this.f19758d &= -3;
        }
        jVar.f19774g = this.f19760r;
        return jVar;
    }

    public final void g(j jVar) {
        if (jVar == j.B) {
            return;
        }
        if (!jVar.f19773d.isEmpty()) {
            if (this.f19759g.isEmpty()) {
                this.f19759g = jVar.f19773d;
                this.f19758d &= -2;
            } else {
                if ((this.f19758d & 1) != 1) {
                    this.f19759g = new ArrayList(this.f19759g);
                    this.f19758d |= 1;
                }
                this.f19759g.addAll(jVar.f19773d);
            }
        }
        if (!jVar.f19774g.isEmpty()) {
            if (this.f19760r.isEmpty()) {
                this.f19760r = jVar.f19774g;
                this.f19758d &= -3;
            } else {
                if ((this.f19758d & 2) != 2) {
                    this.f19760r = new ArrayList(this.f19760r);
                    this.f19758d |= 2;
                }
                this.f19760r.addAll(jVar.f19774g);
            }
        }
        this.f21763a = this.f21763a.b(jVar.f19772a);
    }
}
