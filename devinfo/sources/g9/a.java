package g9;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f24614a = new ConcurrentHashMap();

    public static synchronized void a(com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar) {
        try {
            b bVar = (b) f24614a.remove(aVar.bly());
            if (bVar != null) {
                bVar.f24617c = true;
            }
            pk.a.y("VideoFileManager", "removePreload:  cache size = ", Integer.valueOf(aVar.lh()), aVar.bly());
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
