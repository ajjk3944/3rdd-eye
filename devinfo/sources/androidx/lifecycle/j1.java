package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1157a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f1157a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((e1) it.next()).b();
        }
        linkedHashMap.clear();
    }
}
