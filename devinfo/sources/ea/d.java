package ea;

import j$.util.DesugarCollections;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements we.d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f22476a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final we.c f22477b;

    /* renamed from: c, reason: collision with root package name */
    public static final we.c f22478c;

    static {
        ze.a aVar = new ze.a(1);
        HashMap map = new HashMap();
        map.put(ze.d.class, aVar);
        f22477b = new we.c("logSource", DesugarCollections.unmodifiableMap(new HashMap(map)));
        ze.a aVar2 = new ze.a(2);
        HashMap map2 = new HashMap();
        map2.put(ze.d.class, aVar2);
        f22478c = new we.c("logEventDropped", DesugarCollections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // we.a
    public final void a(Object obj, Object obj2) {
        ha.e eVar = (ha.e) obj;
        we.e eVar2 = (we.e) obj2;
        eVar2.e(f22477b, eVar.f25033a);
        eVar2.e(f22478c, eVar.f25034b);
    }
}
