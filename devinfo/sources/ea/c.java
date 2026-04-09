package ea;

import j$.util.DesugarCollections;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements we.d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f22473a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final we.c f22474b;

    /* renamed from: c, reason: collision with root package name */
    public static final we.c f22475c;

    static {
        ze.a aVar = new ze.a(1);
        HashMap map = new HashMap();
        map.put(ze.d.class, aVar);
        f22474b = new we.c("eventsDroppedCount", DesugarCollections.unmodifiableMap(new HashMap(map)));
        ze.a aVar2 = new ze.a(3);
        HashMap map2 = new HashMap();
        map2.put(ze.d.class, aVar2);
        f22475c = new we.c("reason", DesugarCollections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // we.a
    public final void a(Object obj, Object obj2) {
        ha.d dVar = (ha.d) obj;
        we.e eVar = (we.e) obj2;
        eVar.d(f22474b, dVar.f25030a);
        eVar.e(f22475c, dVar.f25031b);
    }
}
