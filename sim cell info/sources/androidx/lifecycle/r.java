package androidx.lifecycle;

import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, p> f1845a = new HashMap<>();

    public final void a() {
        Iterator<p> it = this.f1845a.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f1845a.clear();
    }

    final p b(String str) {
        return this.f1845a.get(str);
    }

    final void c(String str, p pVar) {
        p pVarPut = this.f1845a.put(str, pVar);
        if (pVarPut != null) {
            pVarPut.c();
        }
    }
}
