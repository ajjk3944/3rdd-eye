package ea;

import j$.util.DesugarCollections;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g implements we.d {

    /* renamed from: a, reason: collision with root package name */
    public static final g f22483a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final we.c f22484b;

    /* renamed from: c, reason: collision with root package name */
    public static final we.c f22485c;

    static {
        ze.a aVar = new ze.a(1);
        HashMap map = new HashMap();
        map.put(ze.d.class, aVar);
        f22484b = new we.c("startMs", DesugarCollections.unmodifiableMap(new HashMap(map)));
        ze.a aVar2 = new ze.a(2);
        HashMap map2 = new HashMap();
        map2.put(ze.d.class, aVar2);
        f22485c = new we.c("endMs", DesugarCollections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // we.a
    public final void a(Object obj, Object obj2) {
        ha.g gVar = (ha.g) obj;
        we.e eVar = (we.e) obj2;
        eVar.d(f22484b, gVar.f25037a);
        eVar.d(f22485c, gVar.f25038b);
    }
}
