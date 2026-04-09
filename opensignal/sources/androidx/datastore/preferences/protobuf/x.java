package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class x implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f1377a;

    /* renamed from: d, reason: collision with root package name */
    public a0 f1378d;

    public x(a0 a0Var) {
        this.f1377a = a0Var;
        if (a0Var.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f1378d = a0Var.i();
    }

    public final a0 a() {
        a0 a0VarB = b();
        a0VarB.getClass();
        if (a0.f(a0VarB, true)) {
            return a0VarB;
        }
        throw new j1();
    }

    public final a0 b() {
        if (!this.f1378d.g()) {
            return this.f1378d;
        }
        a0 a0Var = this.f1378d;
        a0Var.getClass();
        a1 a1Var = a1.f1244c;
        a1Var.getClass();
        a1Var.a(a0Var.getClass()).c(a0Var);
        a0Var.h();
        return this.f1378d;
    }

    public final void c() {
        if (this.f1378d.g()) {
            return;
        }
        a0 a0VarI = this.f1377a.i();
        a0 a0Var = this.f1378d;
        a1 a1Var = a1.f1244c;
        a1Var.getClass();
        a1Var.a(a0VarI.getClass()).a(a0VarI, a0Var);
        this.f1378d = a0VarI;
    }

    public final Object clone() {
        a0 a0Var = this.f1377a;
        a0Var.getClass();
        x xVar = (x) a0Var.c(z.NEW_BUILDER);
        xVar.f1378d = b();
        return xVar;
    }
}
