package ea;

import j$.util.DesugarCollections;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements we.d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f22471a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final we.c f22472b;

    static {
        ze.a aVar = new ze.a(1);
        HashMap map = new HashMap();
        map.put(ze.d.class, aVar);
        f22472b = new we.c("storageMetrics", DesugarCollections.unmodifiableMap(new HashMap(map)));
    }

    @Override // we.a
    public final void a(Object obj, Object obj2) {
        ((we.e) obj2).e(f22472b, ((ha.b) obj).f25021a);
    }
}
