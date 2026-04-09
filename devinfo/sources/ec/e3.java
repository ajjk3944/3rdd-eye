package ec;

import android.os.RemoteException;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22700a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n4 f22701b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j3 f22702c;

    public /* synthetic */ e3(j3 j3Var, n4 n4Var, int i4) {
        this.f22700a = i4;
        this.f22701b = n4Var;
        this.f22702c = j3Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f22700a) {
            case 0:
                j3 j3Var = this.f22702c;
                g0 g0Var = j3Var.f22819e;
                o1 o1Var = (o1) j3Var.f218b;
                if (g0Var != null) {
                    try {
                        g0Var.c3(this.f22701b);
                    } catch (RemoteException e2) {
                        s0 s0Var = o1Var.f22954f;
                        o1.m(s0Var);
                        s0Var.g.e(e2, "Failed to reset data on the service: remote exception");
                    }
                    j3Var.O();
                    break;
                } else {
                    s0 s0Var2 = o1Var.f22954f;
                    o1.m(s0Var2);
                    s0Var2.g.d("Failed to reset data on the service: not connected to service");
                    break;
                }
            case 1:
                j3 j3Var2 = this.f22702c;
                g0 g0Var2 = j3Var2.f22819e;
                o1 o1Var2 = (o1) j3Var2.f218b;
                if (g0Var2 == null) {
                    s0 s0Var3 = o1Var2.f22954f;
                    o1.m(s0Var3);
                    s0Var3.g.d("Discarding data. Failed to send app launch");
                    break;
                } else {
                    try {
                        n4 n4Var = this.f22701b;
                        g gVar = o1Var2.f22952d;
                        c0 c0Var = d0.f22624c1;
                        if (gVar.L(null, c0Var)) {
                            j3Var2.T(g0Var2, null, n4Var);
                        }
                        g0Var2.m0(n4Var);
                        o1Var2.o().G();
                        o1Var2.f22952d.L(null, c0Var);
                        j3Var2.T(g0Var2, null, n4Var);
                        j3Var2.O();
                        break;
                    } catch (RemoteException e10) {
                        s0 s0Var4 = o1Var2.f22954f;
                        o1.m(s0Var4);
                        s0Var4.g.e(e10, "Failed to send app launch to the service");
                        return;
                    }
                }
            case 2:
                j3 j3Var3 = this.f22702c;
                g0 g0Var3 = j3Var3.f22819e;
                o1 o1Var3 = (o1) j3Var3.f218b;
                if (g0Var3 == null) {
                    s0 s0Var5 = o1Var3.f22954f;
                    o1.m(s0Var5);
                    s0Var5.j.d("Failed to send app backgrounded");
                    break;
                } else {
                    try {
                        g0Var3.f3(this.f22701b);
                        j3Var3.O();
                        break;
                    } catch (RemoteException e11) {
                        s0 s0Var6 = o1Var3.f22954f;
                        o1.m(s0Var6);
                        s0Var6.g.e(e11, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
            case 3:
                j3 j3Var4 = this.f22702c;
                g0 g0Var4 = j3Var4.f22819e;
                o1 o1Var4 = (o1) j3Var4.f218b;
                if (g0Var4 == null) {
                    s0 s0Var7 = o1Var4.f22954f;
                    o1.m(s0Var7);
                    s0Var7.g.d("Failed to send measurementEnabled to service");
                    break;
                } else {
                    try {
                        g0Var4.J3(this.f22701b);
                        j3Var4.O();
                        break;
                    } catch (RemoteException e12) {
                        s0 s0Var8 = o1Var4.f22954f;
                        o1.m(s0Var8);
                        s0Var8.g.e(e12, "Failed to send measurementEnabled to the service");
                        return;
                    }
                }
            default:
                j3 j3Var5 = this.f22702c;
                g0 g0Var5 = j3Var5.f22819e;
                o1 o1Var5 = (o1) j3Var5.f218b;
                if (g0Var5 == null) {
                    s0 s0Var9 = o1Var5.f22954f;
                    o1.m(s0Var9);
                    s0Var9.g.d("Failed to send consent settings to service");
                    break;
                } else {
                    try {
                        g0Var5.w1(this.f22701b);
                        j3Var5.O();
                        break;
                    } catch (RemoteException e13) {
                        s0 s0Var10 = o1Var5.f22954f;
                        o1.m(s0Var10);
                        s0Var10.g.e(e13, "Failed to send consent settings to the service");
                    }
                }
        }
    }

    public e3(j3 j3Var, n4 n4Var) {
        this.f22700a = 4;
        this.f22701b = n4Var;
        Objects.requireNonNull(j3Var);
        this.f22702c = j3Var;
    }
}
