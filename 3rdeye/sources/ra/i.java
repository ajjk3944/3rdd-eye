package ra;

import com.google.android.gms.ads.AdRequest;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import ra.h;

/* compiled from: ZoneRulesProvider.java */
/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList<i> f45863a = new CopyOnWriteArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f45864b = new ConcurrentHashMap(AdRequest.MAX_CONTENT_URL_LENGTH, 0.75f, 2);

    static {
        if (h.f45861a.getAndSet(true)) {
            throw new IllegalStateException("Already initialized");
        }
        AtomicReference<h> atomicReference = h.f45862b;
        h.b bVar = new h.b();
        while (!atomicReference.compareAndSet(null, bVar) && atomicReference.get() == null) {
        }
        atomicReference.get().a();
    }

    public static f a(String str, boolean z10) {
        com.google.gson.internal.c.v(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = f45864b;
        i iVar = (i) concurrentHashMap.get(str);
        if (iVar != null) {
            return iVar.b(str);
        }
        if (concurrentHashMap.isEmpty()) {
            throw new g("No time-zone data files registered");
        }
        throw new g("Unknown time-zone ID: ".concat(str));
    }

    public static void d(i iVar) {
        com.google.gson.internal.c.v(iVar, "provider");
        Iterator it = iVar.c().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            com.google.gson.internal.c.v(str, "zoneId");
            if (((i) f45864b.putIfAbsent(str, iVar)) != null) {
                throw new g("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + iVar);
            }
        }
        f45863a.add(iVar);
    }

    public abstract f b(String str);

    public abstract HashSet c();
}
