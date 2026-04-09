package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: ViewModelStore.kt */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f16160a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f16160a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((b0) it.next()).b();
        }
        linkedHashMap.clear();
    }
}
