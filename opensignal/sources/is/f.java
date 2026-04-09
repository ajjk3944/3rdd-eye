package is;

import ht.a1;
import ht.b0;
import ht.c1;
import ht.i0;
import ht.x;

/* loaded from: classes.dex */
public final class f extends ht.o implements ht.l {

    /* renamed from: d, reason: collision with root package name */
    public final b0 f12954d;

    public f(b0 b0Var) {
        br.l.e(b0Var, "delegate");
        this.f12954d = b0Var;
    }

    @Override // ht.o
    public final b0 C0() {
        return this.f12954d;
    }

    @Override // ht.l
    public final c1 H(x xVar) {
        br.l.e(xVar, "replacement");
        c1 c1VarK0 = xVar.k0();
        if (!a1.f(c1VarK0) && !a1.e(c1VarK0)) {
            return c1VarK0;
        }
        if (c1VarK0 instanceof b0) {
            b0 b0Var = (b0) c1VarK0;
            b0 b0VarP0 = b0Var.p0(false);
            return !a1.f(b0Var) ? b0VarP0 : new f(b0VarP0);
        }
        if (!(c1VarK0 instanceof ht.r)) {
            throw new IllegalStateException(("Incorrect type: " + c1VarK0).toString());
        }
        ht.r rVar = (ht.r) c1VarK0;
        b0 b0Var2 = rVar.f10938d;
        b0 b0VarP02 = b0Var2.p0(false);
        if (a1.f(b0Var2)) {
            b0VarP02 = new f(b0VarP02);
        }
        b0 b0Var3 = rVar.f10939g;
        b0 b0VarP03 = b0Var3.p0(false);
        if (a1.f(b0Var3)) {
            b0VarP03 = new f(b0VarP03);
        }
        return ht.c.A(ht.e.j(b0VarP02, b0VarP03), ht.c.e(c1VarK0));
    }

    @Override // ht.l
    public final boolean J() {
        return true;
    }

    @Override // ht.o
    public final ht.o M0(b0 b0Var) {
        return new f(b0Var);
    }

    @Override // ht.o, ht.x
    public final boolean c0() {
        return false;
    }

    @Override // ht.b0, ht.c1
    public final c1 r0(i0 i0Var) {
        br.l.e(i0Var, "newAttributes");
        return new f(this.f12954d.r0(i0Var));
    }

    @Override // ht.b0
    /* renamed from: u0 */
    public final b0 p0(boolean z10) {
        return z10 ? this.f12954d.p0(true) : this;
    }

    @Override // ht.b0
    /* renamed from: v0 */
    public final b0 r0(i0 i0Var) {
        br.l.e(i0Var, "newAttributes");
        return new f(this.f12954d.r0(i0Var));
    }
}
