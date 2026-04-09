package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public class Q {

    /* renamed from: a, reason: collision with root package name */
    private final Map f31635a = new LinkedHashMap();

    public final void a() {
        Iterator it = this.f31635a.values().iterator();
        while (it.hasNext()) {
            ((N) it.next()).U();
        }
        this.f31635a.clear();
    }

    public final N b(String key) {
        AbstractC6492s.i(key, "key");
        return (N) this.f31635a.get(key);
    }

    public final Set c() {
        return new HashSet(this.f31635a.keySet());
    }

    public final void d(String key, N viewModel) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(viewModel, "viewModel");
        N n10 = (N) this.f31635a.put(key, viewModel);
        if (n10 != null) {
            n10.U();
        }
    }
}
