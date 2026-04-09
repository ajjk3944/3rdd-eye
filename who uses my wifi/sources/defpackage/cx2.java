package defpackage;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cx2 extends t2 {
    public final /* synthetic */ int f;
    public final Object g;
    public Object h;
    public final /* synthetic */ Object i;

    public cx2(ex2 ex2Var, String str, r9 r9Var) {
        this.f = 0;
        this.g = str;
        this.h = r9Var;
        Objects.requireNonNull(ex2Var);
        this.i = ex2Var;
    }

    @Override // defpackage.t2
    public void C() {
        switch (this.f) {
            case 1:
                synchronized (this.g) {
                    try {
                        t2 t2Var = (t2) this.h;
                        if (t2Var != null) {
                            t2Var.C();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.t2
    public void a() {
        switch (this.f) {
            case 1:
                synchronized (this.g) {
                    try {
                        t2 t2Var = (t2) this.h;
                        if (t2Var != null) {
                            t2Var.a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.t2
    public final void b(u70 u70Var) {
        switch (this.f) {
            case 0:
                ((ex2) this.i).C3(ex2.F3(u70Var));
                return;
            default:
                e23 e23Var = (e23) this.i;
                j51 j51Var = e23Var.c;
                ba2 ba2Var = e23Var.i;
                py2 py2VarA = null;
                if (ba2Var != null) {
                    try {
                        py2VarA = ba2Var.A();
                    } catch (RemoteException e) {
                        gi2.p0("#007 Could not call remote method.", e);
                    }
                }
                j51Var.a(py2VarA);
                synchronized (this.g) {
                    try {
                        t2 t2Var = (t2) this.h;
                        if (t2Var != null) {
                            t2Var.b(u70Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // defpackage.t2
    public void c() {
        switch (this.f) {
            case 1:
                synchronized (this.g) {
                    try {
                        t2 t2Var = (t2) this.h;
                        if (t2Var != null) {
                            t2Var.c();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.t2
    public final void e() {
        switch (this.f) {
            case 0:
                ((ex2) this.i).B3((r9) this.h, (String) this.g);
                return;
            default:
                e23 e23Var = (e23) this.i;
                j51 j51Var = e23Var.c;
                ba2 ba2Var = e23Var.i;
                py2 py2VarA = null;
                if (ba2Var != null) {
                    try {
                        py2VarA = ba2Var.A();
                    } catch (RemoteException e) {
                        gi2.p0("#007 Could not call remote method.", e);
                    }
                }
                j51Var.a(py2VarA);
                synchronized (this.g) {
                    try {
                        t2 t2Var = (t2) this.h;
                        if (t2Var != null) {
                            t2Var.e();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // defpackage.t2
    public void h() {
        switch (this.f) {
            case 1:
                synchronized (this.g) {
                    try {
                        t2 t2Var = (t2) this.h;
                        if (t2Var != null) {
                            t2Var.h();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                return;
        }
    }

    public cx2(e23 e23Var) {
        this.f = 1;
        this.i = e23Var;
        this.g = new Object();
    }
}
