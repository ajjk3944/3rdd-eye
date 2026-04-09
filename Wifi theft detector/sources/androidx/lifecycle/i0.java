package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f3522a = new LinkedHashMap();

    public final void a() {
        Iterator it = this.f3522a.values().iterator();
        while (it.hasNext()) {
            ((e0) it.next()).a();
        }
        this.f3522a.clear();
    }

    public final e0 b(String key) {
        kotlin.jvm.internal.p.e(key, "key");
        return (e0) this.f3522a.get(key);
    }

    public final Set c() {
        return new HashSet(this.f3522a.keySet());
    }

    public final void d(String key, e0 viewModel) {
        kotlin.jvm.internal.p.e(key, "key");
        kotlin.jvm.internal.p.e(viewModel, "viewModel");
        e0 e0Var = (e0) this.f3522a.put(key, viewModel);
        if (e0Var != null) {
            e0Var.d();
        }
    }
}
