package u5;

import ja.c;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import km.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final c f35103c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f35104d = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f35105a;

    /* renamed from: b, reason: collision with root package name */
    public final o f35106b;

    public a(String str, boolean z3) {
        ReentrantLock reentrantLock;
        o oVar;
        synchronized (f35103c) {
            try {
                LinkedHashMap linkedHashMap = f35104d;
                Object reentrantLock2 = linkedHashMap.get(str);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(str, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f35105a = reentrantLock;
        if (z3) {
            oVar = new o();
            oVar.f28445a = str.concat(".lck");
        } else {
            oVar = null;
        }
        this.f35106b = oVar;
    }
}
