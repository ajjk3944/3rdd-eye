package ec;

import com.google.android.gms.internal.measurement.t5;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class f1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22706a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f22707b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f22708c;

    public /* synthetic */ f1(h1 h1Var, String str, int i4) {
        this.f22706a = i4;
        this.f22707b = h1Var;
        this.f22708c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f22706a) {
            case 0:
                return new com.google.android.gms.internal.measurement.k4(new f1(this.f22707b, this.f22708c, 1));
            case 1:
                h1 h1Var = this.f22707b;
                m mVar = h1Var.f23175c.f22733c;
                g4.U(mVar);
                String str = this.f22708c;
                x0 x0VarD0 = mVar.D0(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                ((o1) h1Var.f218b).f22952d.G();
                map.put("gmp_version", 133005L);
                if (x0VarD0 != null) {
                    String strN = x0VarD0.N();
                    if (strN != null) {
                        map.put("app_version", strN);
                    }
                    map.put("app_version_int", Long.valueOf(x0VarD0.P()));
                    map.put("dynamite_version", Long.valueOf(x0VarD0.b()));
                }
                return map;
            default:
                y4.a aVar = new y4.a(false, this.f22707b, this.f22708c);
                t5 t5Var = new t5("internal.remoteConfig", 0);
                t5Var.f19763b.put("getValue", new com.google.android.gms.internal.measurement.k4(t5Var, aVar));
                return t5Var;
        }
    }
}
