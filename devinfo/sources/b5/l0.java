package b5;

import android.os.Bundle;
import android.util.Log;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l0 implements androidx.lifecycle.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hg.a f1833b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.t f1834c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f1835d;

    /* JADX WARN: Multi-variable type inference failed */
    public l0(u0 u0Var, String str, y0 y0Var, androidx.lifecycle.t tVar) {
        this.f1835d = u0Var;
        this.f1832a = str;
        this.f1833b = (hg.a) y0Var;
        this.f1834c = tVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [b5.y0, hg.a] */
    @Override // androidx.lifecycle.y
    public final void g(androidx.lifecycle.a0 a0Var, androidx.lifecycle.r rVar) {
        Bundle bundle;
        u0 u0Var = this.f1835d;
        Map map = u0Var.f1887m;
        androidx.lifecycle.r rVar2 = androidx.lifecycle.r.ON_START;
        String str = this.f1832a;
        if (rVar == rVar2 && (bundle = (Bundle) map.get(str)) != null) {
            this.f1833b.d(bundle, str);
            map.remove(str);
            if (u0.K(2)) {
                Log.v("FragmentManager", "Clearing fragment result with key ".concat(str));
            }
        }
        if (rVar == androidx.lifecycle.r.ON_DESTROY) {
            this.f1834c.b(this);
            u0Var.f1888n.remove(str);
        }
    }
}
