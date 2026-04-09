package os;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rs.p;
import rs.x;

/* loaded from: classes.dex */
public final class g extends rs.k implements x {
    public List B;
    public List D;

    /* renamed from: d, reason: collision with root package name */
    public int f19761d;

    /* renamed from: g, reason: collision with root package name */
    public int f19762g;

    /* renamed from: r, reason: collision with root package name */
    public int f19763r;

    /* renamed from: x, reason: collision with root package name */
    public Object f19764x;

    /* renamed from: y, reason: collision with root package name */
    public h f19765y;

    public static g g() {
        g gVar = new g();
        gVar.f19762g = 1;
        gVar.f19764x = "";
        gVar.f19765y = h.NONE;
        List list = Collections.EMPTY_LIST;
        gVar.B = list;
        gVar.D = list;
        return gVar;
    }

    @Override // rs.k
    public final rs.b c() {
        i iVarF = f();
        iVarF.b();
        return iVarF;
    }

    public final Object clone() {
        g gVarG = g();
        gVarG.h(f());
        return gVarG;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // rs.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final rs.k d(f5.u r2, rs.g r3) throws java.lang.Throwable {
        /*
            r1 = this;
            r3 = 0
            ls.a r0 = os.i.J     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            os.i r0 = new os.i     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.h(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            rs.b r0 = r2.f21776a     // Catch: java.lang.Throwable -> Lf
            os.i r0 = (os.i) r0     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = move-exception
            r3 = r0
        L19:
            if (r3 == 0) goto L1e
            r1.h(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: os.g.d(f5.u, rs.g):rs.k");
    }

    @Override // rs.k
    public final /* bridge */ /* synthetic */ rs.k e(p pVar) {
        h((i) pVar);
        return this;
    }

    public final i f() {
        i iVar = new i(this);
        int i10 = this.f19761d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        iVar.f19768g = this.f19762g;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        iVar.f19769r = this.f19763r;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        iVar.f19770x = this.f19764x;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        iVar.f19771y = this.f19765y;
        if ((i10 & 16) == 16) {
            this.B = Collections.unmodifiableList(this.B);
            this.f19761d &= -17;
        }
        iVar.B = this.B;
        if ((this.f19761d & 32) == 32) {
            this.D = Collections.unmodifiableList(this.D);
            this.f19761d &= -33;
        }
        iVar.E = this.D;
        iVar.f19767d = i11;
        return iVar;
    }

    public final void h(i iVar) {
        if (iVar == i.I) {
            return;
        }
        int i10 = iVar.f19767d;
        if ((i10 & 1) == 1) {
            int i11 = iVar.f19768g;
            this.f19761d = 1 | this.f19761d;
            this.f19762g = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = iVar.f19769r;
            this.f19761d = 2 | this.f19761d;
            this.f19763r = i12;
        }
        if ((i10 & 4) == 4) {
            this.f19761d |= 4;
            this.f19764x = iVar.f19770x;
        }
        if ((i10 & 8) == 8) {
            h hVar = iVar.f19771y;
            hVar.getClass();
            this.f19761d = 8 | this.f19761d;
            this.f19765y = hVar;
        }
        if (!iVar.B.isEmpty()) {
            if (this.B.isEmpty()) {
                this.B = iVar.B;
                this.f19761d &= -17;
            } else {
                if ((this.f19761d & 16) != 16) {
                    this.B = new ArrayList(this.B);
                    this.f19761d |= 16;
                }
                this.B.addAll(iVar.B);
            }
        }
        if (!iVar.E.isEmpty()) {
            if (this.D.isEmpty()) {
                this.D = iVar.E;
                this.f19761d &= -33;
            } else {
                if ((this.f19761d & 32) != 32) {
                    this.D = new ArrayList(this.D);
                    this.f19761d |= 32;
                }
                this.D.addAll(iVar.E);
            }
        }
        this.f21763a = this.f21763a.b(iVar.f19766a);
    }
}
