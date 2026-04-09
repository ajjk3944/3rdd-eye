package b3;

import android.content.Context;
import com.bykv.vk.openvk.emc.emc.emc.xq.xq;
import java.util.concurrent.ConcurrentHashMap;
import r2.a;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f4581a = new ConcurrentHashMap();

    public static synchronized void a(Context context, xq xqVar, a.InterfaceC0474a interfaceC0474a) {
        if (xqVar == null) {
            return;
        }
        try {
            ConcurrentHashMap concurrentHashMap = f4581a;
            c cVar = (c) concurrentHashMap.get(xqVar.aa());
            if (cVar == null) {
                cVar = new c(context, xqVar);
                concurrentHashMap.put(xqVar.aa(), cVar);
                xqVar.ycc();
                xqVar.aa();
            }
            cVar.m(interfaceC0474a);
            xqVar.ycc();
            xqVar.aa();
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void b(xq xqVar) {
        try {
            c cVar = (c) f4581a.remove(xqVar.aa());
            if (cVar != null) {
                cVar.n(true);
            }
            xqVar.ycc();
            xqVar.aa();
        } catch (Throwable th) {
            throw th;
        }
    }
}
