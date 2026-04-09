package f1;

import java.util.Map;
import u0.f0;
import x.e0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f23612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23613b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f23614c;

    public d(e eVar, Object obj, j jVar) {
        this.f23612a = eVar;
        this.f23613b = obj;
        this.f23614c = jVar;
    }

    @Override // u0.f0
    public final void a() {
        e eVar = this.f23612a;
        e0 e0Var = eVar.f23617b;
        Object obj = this.f23613b;
        Object objK = e0Var.k(obj);
        j jVar = this.f23614c;
        if (objK == jVar) {
            Map map = eVar.f23616a;
            Map mapB = jVar.b();
            if (mapB.isEmpty()) {
                map.remove(obj);
            } else {
                map.put(obj, mapB);
            }
        }
    }
}
