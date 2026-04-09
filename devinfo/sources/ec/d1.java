package ec;

import android.util.Log;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22678a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final o1 f22679b;

    public d1(g4 g4Var) {
        this.f22679b = g4Var.f22740l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        switch (this.f22678a) {
            case 0:
                o1 o1Var = this.f22679b;
                boolean z3 = false;
                try {
                    j1.q qVarA = ub.b.a(o1Var.f22949a);
                    if (qVarA == null) {
                        s0 s0Var = o1Var.f22954f;
                        o1.m(s0Var);
                        s0Var.f23060o.d("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        o1Var = o1Var;
                    } else {
                        int i4 = qVarA.e(128, "com.android.vending").versionCode;
                        o1Var = i4;
                        if (i4 >= 80837300) {
                            z3 = true;
                            o1Var = i4;
                        }
                    }
                } catch (Exception e2) {
                    s0 s0Var2 = o1Var.f22954f;
                    o1.m(s0Var2);
                    s0Var2.f23060o.e(e2, "Failed to retrieve Play Store version for Install Referrer");
                }
                return z3;
            default:
                s0 s0Var3 = this.f22679b.f22954f;
                o1.m(s0Var3);
                return Log.isLoggable(s0Var3.L(), 3);
        }
    }

    public d1(d2 d2Var, o1 o1Var) {
        this.f22679b = o1Var;
    }
}
