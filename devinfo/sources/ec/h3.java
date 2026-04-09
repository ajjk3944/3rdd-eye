package ec;

import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j3 f22777b;

    public /* synthetic */ h3(j3 j3Var, int i4) {
        this.f22776a = i4;
        this.f22777b = j3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22776a) {
            case 0:
                this.f22777b.H();
                break;
            case 1:
                j3 j3Var = this.f22777b;
                o1 o1Var = (o1) j3Var.f218b;
                g0 g0Var = j3Var.f22819e;
                if (g0Var == null) {
                    s0 s0Var = o1Var.f22954f;
                    o1.m(s0Var);
                    s0Var.g.d("Failed to send Dma consent settings to service");
                    break;
                } else {
                    try {
                        g0Var.H3(j3Var.R(false));
                        j3Var.O();
                        break;
                    } catch (RemoteException e2) {
                        s0 s0Var2 = o1Var.f22954f;
                        o1.m(s0Var2);
                        s0Var2.g.e(e2, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
            default:
                j3 j3Var2 = this.f22777b;
                o1 o1Var2 = (o1) j3Var2.f218b;
                g0 g0Var2 = j3Var2.f22819e;
                if (g0Var2 == null) {
                    s0 s0Var3 = o1Var2.f22954f;
                    o1.m(s0Var3);
                    s0Var3.g.d("Failed to send storage consent settings to service");
                    break;
                } else {
                    try {
                        g0Var2.O0(j3Var2.R(false));
                        j3Var2.O();
                        break;
                    } catch (RemoteException e10) {
                        s0 s0Var4 = o1Var2.f22954f;
                        o1.m(s0Var4);
                        s0Var4.g.e(e10, "Failed to send storage consent settings to the service");
                    }
                }
        }
    }
}
