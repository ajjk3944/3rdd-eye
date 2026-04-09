package J0;

import Yg.InterfaceC3665i;
import androidx.compose.ui.platform.E0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import nh.InterfaceC6944a;

/* loaded from: classes.dex */
public final class j implements w, Iterable, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final Map f9645a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private boolean f9646b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9647c;

    @Override // J0.w
    public void b(v vVar, Object obj) {
        if (!(obj instanceof a) || !f(vVar)) {
            this.f9645a.put(vVar, obj);
            return;
        }
        Object obj2 = this.f9645a.get(vVar);
        AbstractC6492s.g(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        a aVar = (a) obj2;
        Map map = this.f9645a;
        a aVar2 = (a) obj;
        String strB = aVar2.b();
        if (strB == null) {
            strB = aVar.b();
        }
        InterfaceC3665i interfaceC3665iA = aVar2.a();
        if (interfaceC3665iA == null) {
            interfaceC3665iA = aVar.a();
        }
        map.put(vVar, new a(strB, interfaceC3665iA));
    }

    public final void e(j jVar) {
        if (jVar.f9646b) {
            this.f9646b = true;
        }
        if (jVar.f9647c) {
            this.f9647c = true;
        }
        for (Map.Entry entry : jVar.f9645a.entrySet()) {
            v vVar = (v) entry.getKey();
            Object value = entry.getValue();
            if (!this.f9645a.containsKey(vVar)) {
                this.f9645a.put(vVar, value);
            } else if (value instanceof a) {
                Object obj = this.f9645a.get(vVar);
                AbstractC6492s.g(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                a aVar = (a) obj;
                Map map = this.f9645a;
                String strB = aVar.b();
                if (strB == null) {
                    strB = ((a) value).b();
                }
                InterfaceC3665i interfaceC3665iA = aVar.a();
                if (interfaceC3665iA == null) {
                    interfaceC3665iA = ((a) value).a();
                }
                map.put(vVar, new a(strB, interfaceC3665iA));
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return AbstractC6492s.d(this.f9645a, jVar.f9645a) && this.f9646b == jVar.f9646b && this.f9647c == jVar.f9647c;
    }

    public final boolean f(v vVar) {
        return this.f9645a.containsKey(vVar);
    }

    public final boolean g() {
        Set setKeySet = this.f9645a.keySet();
        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
            return false;
        }
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            if (((v) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f9645a.hashCode() * 31) + Boolean.hashCode(this.f9646b)) * 31) + Boolean.hashCode(this.f9647c);
    }

    public final j i() {
        j jVar = new j();
        jVar.f9646b = this.f9646b;
        jVar.f9647c = this.f9647c;
        jVar.f9645a.putAll(this.f9645a);
        return jVar;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f9645a.entrySet().iterator();
    }

    public final Object j(v vVar) {
        Object obj = this.f9645a.get(vVar);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + vVar + " - consider getOrElse or getOrNull");
    }

    public final Object k(v vVar, InterfaceC6824a interfaceC6824a) {
        Object obj = this.f9645a.get(vVar);
        return obj == null ? interfaceC6824a.invoke() : obj;
    }

    public final Object q(v vVar, InterfaceC6824a interfaceC6824a) {
        Object obj = this.f9645a.get(vVar);
        return obj == null ? interfaceC6824a.invoke() : obj;
    }

    public final boolean s() {
        return this.f9647c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        if (this.f9646b) {
            sb2.append("");
            sb2.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f9647c) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f9645a.entrySet()) {
            v vVar = (v) entry.getKey();
            Object value = entry.getValue();
            sb2.append(str);
            sb2.append(vVar.a());
            sb2.append(" : ");
            sb2.append(value);
            str = ", ";
        }
        return E0.a(this, null) + "{ " + ((Object) sb2) + " }";
    }

    public final boolean u() {
        return this.f9646b;
    }

    public final void v(j jVar) {
        for (Map.Entry entry : jVar.f9645a.entrySet()) {
            v vVar = (v) entry.getKey();
            Object value = entry.getValue();
            Object obj = this.f9645a.get(vVar);
            AbstractC6492s.g(vVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object objC = vVar.c(obj, value);
            if (objC != null) {
                this.f9645a.put(vVar, objC);
            }
        }
    }

    public final void w(boolean z10) {
        this.f9647c = z10;
    }

    public final void x(boolean z10) {
        this.f9646b = z10;
    }
}
