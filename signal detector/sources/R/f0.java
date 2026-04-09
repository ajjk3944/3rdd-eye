package R;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f3318a;

    /* renamed from: b, reason: collision with root package name */
    public J.c[] f3319b;

    public f0() {
        this(new r0());
    }

    public final void a() {
        J.c[] cVarArr = this.f3319b;
        if (cVarArr != null) {
            J.c cVarF = cVarArr[0];
            J.c cVarF2 = cVarArr[1];
            r0 r0Var = this.f3318a;
            if (cVarF2 == null) {
                cVarF2 = r0Var.f3359a.f(2);
            }
            if (cVarF == null) {
                cVarF = r0Var.f3359a.f(1);
            }
            g(J.c.a(cVarF, cVarF2));
            J.c cVar = this.f3319b[I5.b.r(16)];
            if (cVar != null) {
                f(cVar);
            }
            J.c cVar2 = this.f3319b[I5.b.r(32)];
            if (cVar2 != null) {
                d(cVar2);
            }
            J.c cVar3 = this.f3319b[I5.b.r(64)];
            if (cVar3 != null) {
                h(cVar3);
            }
        }
    }

    public abstract r0 b();

    public void c(int i, J.c cVar) {
        if (this.f3319b == null) {
            this.f3319b = new J.c[10];
        }
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i & i3) != 0) {
                this.f3319b[I5.b.r(i3)] = cVar;
            }
        }
    }

    public abstract void e(J.c cVar);

    public abstract void g(J.c cVar);

    public f0(r0 r0Var) {
        this.f3318a = r0Var;
    }

    public void d(J.c cVar) {
    }

    public void f(J.c cVar) {
    }

    public void h(J.c cVar) {
    }
}
