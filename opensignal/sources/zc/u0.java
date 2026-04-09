package zc;

import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.internal.measurement.u5;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27222a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f27223b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27224c;

    public /* synthetic */ u0(w0 w0Var, String str, int i10) {
        this.f27222a = i10;
        this.f27223b = w0Var;
        this.f27224c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f27222a) {
            case 0:
                return new j4(new u0(this.f27223b, this.f27224c, 1));
            case 1:
                w0 w0Var = this.f27223b;
                l lVar = w0Var.f26981g.f27099g;
                p3.Q(lVar);
                String str = this.f27224c;
                n0 n0VarU2 = lVar.u2(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                ((c1) w0Var.f1504d).f26887r.x1();
                map.put("gmp_version", 133005L);
                if (n0VarU2 != null) {
                    String strN = n0VarU2.N();
                    if (strN != null) {
                        map.put("app_version", strN);
                    }
                    map.put("app_version_int", Long.valueOf(n0VarU2.P()));
                    map.put("dynamite_version", Long.valueOf(n0VarU2.b()));
                }
                return map;
            default:
                xr.a aVar = new xr.a(this.f27223b, this.f27224c);
                u5 u5Var = new u5("internal.remoteConfig", 0);
                u5Var.f5050d.put("getValue", new j4(u5Var, aVar));
                return u5Var;
        }
    }
}
