package ea;

import j$.util.DesugarCollections;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements we.d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f22466a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final we.c f22467b;

    /* renamed from: c, reason: collision with root package name */
    public static final we.c f22468c;

    /* renamed from: d, reason: collision with root package name */
    public static final we.c f22469d;

    /* renamed from: e, reason: collision with root package name */
    public static final we.c f22470e;

    static {
        ze.a aVar = new ze.a(1);
        HashMap map = new HashMap();
        map.put(ze.d.class, aVar);
        f22467b = new we.c("window", DesugarCollections.unmodifiableMap(new HashMap(map)));
        ze.a aVar2 = new ze.a(2);
        HashMap map2 = new HashMap();
        map2.put(ze.d.class, aVar2);
        f22468c = new we.c("logSourceMetrics", DesugarCollections.unmodifiableMap(new HashMap(map2)));
        ze.a aVar3 = new ze.a(3);
        HashMap map3 = new HashMap();
        map3.put(ze.d.class, aVar3);
        f22469d = new we.c("globalMetrics", DesugarCollections.unmodifiableMap(new HashMap(map3)));
        ze.a aVar4 = new ze.a(4);
        HashMap map4 = new HashMap();
        map4.put(ze.d.class, aVar4);
        f22470e = new we.c("appNamespace", DesugarCollections.unmodifiableMap(new HashMap(map4)));
    }

    @Override // we.a
    public final void a(Object obj, Object obj2) {
        ha.a aVar = (ha.a) obj;
        we.e eVar = (we.e) obj2;
        eVar.e(f22467b, aVar.f25017a);
        eVar.e(f22468c, aVar.f25018b);
        eVar.e(f22469d, aVar.f25019c);
        eVar.e(f22470e, aVar.f25020d);
    }
}
