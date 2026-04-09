package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5233a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f5233a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((X) it.next()).b();
        }
        linkedHashMap.clear();
    }
}
