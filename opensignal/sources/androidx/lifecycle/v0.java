package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1523a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f1523a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((s0) it.next()).a();
        }
        linkedHashMap.clear();
    }
}
