package U1;

import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f3688a = new ConcurrentHashMap();

    public static synchronized void a(com.bykv.vk.openvk.emc.emc.emc.xq.b bVar) {
        try {
            c cVar = (c) f3688a.remove(bVar.aa());
            if (cVar != null) {
                cVar.f3694c = true;
            }
            bVar.ycc();
            bVar.aa();
        } catch (Throwable th) {
            throw th;
        }
    }
}
