package zc;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final /* synthetic */ class v2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27247a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x2 f27248d;

    public /* synthetic */ v2(x2 x2Var, int i10) {
        this.f27247a = i10;
        this.f27248d = x2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27247a) {
            case 0:
                this.f27248d.y1();
                break;
            case 1:
                x2 x2Var = this.f27248d;
                c1 c1Var = (c1) x2Var.f1504d;
                x xVar = x2Var.f27267x;
                if (xVar == null) {
                    j0 j0Var = c1Var.f26889y;
                    c1.g(j0Var);
                    j0Var.B.b("Failed to send Dma consent settings to service");
                    break;
                } else {
                    try {
                        xVar.u(x2Var.I1(false));
                        x2Var.F1();
                        break;
                    } catch (RemoteException e4) {
                        j0 j0Var2 = c1Var.f26889y;
                        c1.g(j0Var2);
                        j0Var2.B.c(e4, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
            default:
                x2 x2Var2 = this.f27248d;
                c1 c1Var2 = (c1) x2Var2.f1504d;
                x xVar2 = x2Var2.f27267x;
                if (xVar2 == null) {
                    j0 j0Var3 = c1Var2.f26889y;
                    c1.g(j0Var3);
                    j0Var3.B.b("Failed to send storage consent settings to service");
                    break;
                } else {
                    try {
                        xVar2.p(x2Var2.I1(false));
                        x2Var2.F1();
                        break;
                    } catch (RemoteException e10) {
                        j0 j0Var4 = c1Var2.f26889y;
                        c1.g(j0Var4);
                        j0Var4.B.c(e10, "Failed to send storage consent settings to the service");
                    }
                }
        }
    }
}
