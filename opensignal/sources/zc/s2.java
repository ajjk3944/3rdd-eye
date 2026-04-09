package zc;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27142a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzr f27143d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x2 f27144g;

    public /* synthetic */ s2(x2 x2Var, zzr zzrVar, int i10) {
        this.f27142a = i10;
        this.f27143d = zzrVar;
        this.f27144g = x2Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f27142a) {
            case 0:
                x2 x2Var = this.f27144g;
                x xVar = x2Var.f27267x;
                c1 c1Var = (c1) x2Var.f1504d;
                if (xVar != null) {
                    try {
                        xVar.m(this.f27143d);
                    } catch (RemoteException e4) {
                        j0 j0Var = c1Var.f26889y;
                        c1.g(j0Var);
                        j0Var.B.c(e4, "Failed to reset data on the service: remote exception");
                    }
                    x2Var.F1();
                    break;
                } else {
                    j0 j0Var2 = c1Var.f26889y;
                    c1.g(j0Var2);
                    j0Var2.B.b("Failed to reset data on the service: not connected to service");
                    break;
                }
            case 1:
                x2 x2Var2 = this.f27144g;
                x xVar2 = x2Var2.f27267x;
                c1 c1Var2 = (c1) x2Var2.f1504d;
                if (xVar2 == null) {
                    j0 j0Var3 = c1Var2.f26889y;
                    c1.g(j0Var3);
                    j0Var3.B.b("Discarding data. Failed to send app launch");
                    break;
                } else {
                    try {
                        zzr zzrVar = this.f27143d;
                        f fVar = c1Var2.f26887r;
                        t tVar = u.f27166b1;
                        if (fVar.C1(null, tVar)) {
                            x2Var2.K1(xVar2, null, zzrVar);
                        }
                        xVar2.E(zzrVar);
                        c1Var2.i().x1();
                        c1Var2.f26887r.C1(null, tVar);
                        x2Var2.K1(xVar2, null, zzrVar);
                        x2Var2.F1();
                        break;
                    } catch (RemoteException e10) {
                        j0 j0Var4 = c1Var2.f26889y;
                        c1.g(j0Var4);
                        j0Var4.B.c(e10, "Failed to send app launch to the service");
                        return;
                    }
                }
            case 2:
                x2 x2Var3 = this.f27144g;
                x xVar3 = x2Var3.f27267x;
                c1 c1Var3 = (c1) x2Var3.f1504d;
                if (xVar3 == null) {
                    j0 j0Var5 = c1Var3.f26889y;
                    c1.g(j0Var5);
                    j0Var5.F.b("Failed to send app backgrounded");
                    break;
                } else {
                    try {
                        xVar3.G(this.f27143d);
                        x2Var3.F1();
                        break;
                    } catch (RemoteException e11) {
                        j0 j0Var6 = c1Var3.f26889y;
                        c1.g(j0Var6);
                        j0Var6.B.c(e11, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
            case 3:
                x2 x2Var4 = this.f27144g;
                x xVar4 = x2Var4.f27267x;
                c1 c1Var4 = (c1) x2Var4.f1504d;
                if (xVar4 == null) {
                    j0 j0Var7 = c1Var4.f26889y;
                    c1.g(j0Var7);
                    j0Var7.B.b("Failed to send measurementEnabled to service");
                    break;
                } else {
                    try {
                        xVar4.t(this.f27143d);
                        x2Var4.F1();
                        break;
                    } catch (RemoteException e12) {
                        j0 j0Var8 = c1Var4.f26889y;
                        c1.g(j0Var8);
                        j0Var8.B.c(e12, "Failed to send measurementEnabled to the service");
                        return;
                    }
                }
            default:
                x2 x2Var5 = this.f27144g;
                x xVar5 = x2Var5.f27267x;
                c1 c1Var5 = (c1) x2Var5.f1504d;
                if (xVar5 == null) {
                    j0 j0Var9 = c1Var5.f26889y;
                    c1.g(j0Var9);
                    j0Var9.B.b("Failed to send consent settings to service");
                    break;
                } else {
                    try {
                        xVar5.Q(this.f27143d);
                        x2Var5.F1();
                        break;
                    } catch (RemoteException e13) {
                        j0 j0Var10 = c1Var5.f26889y;
                        c1.g(j0Var10);
                        j0Var10.B.c(e13, "Failed to send consent settings to the service");
                    }
                }
        }
    }

    public s2(x2 x2Var, zzr zzrVar) {
        this.f27142a = 4;
        this.f27143d = zzrVar;
        Objects.requireNonNull(x2Var);
        this.f27144g = x2Var;
    }
}
