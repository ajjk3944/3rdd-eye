package o4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l0 extends androidx.lifecycle.s0 {

    /* renamed from: h, reason: collision with root package name */
    public static final k0 f18814h = new k0(0);

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18818e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18815b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f18816c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f18817d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f18819f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18820g = false;

    public l0(boolean z10) {
        this.f18818e = z10;
    }

    @Override // androidx.lifecycle.s0
    public final void b() {
        if (androidx.fragment.app.d.K(3)) {
            toString();
        }
        this.f18819f = true;
    }

    public final void c(String str, boolean z10) {
        HashMap map = this.f18816c;
        l0 l0Var = (l0) map.get(str);
        if (l0Var != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(l0Var.f18816c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    androidx.fragment.app.d.K(3);
                    l0Var.c(str2, true);
                }
            }
            l0Var.b();
            map.remove(str);
        }
        HashMap map2 = this.f18817d;
        androidx.lifecycle.v0 v0Var = (androidx.lifecycle.v0) map2.get(str);
        if (v0Var != null) {
            v0Var.a();
            map2.remove(str);
        }
    }

    public final void d(androidx.fragment.app.b bVar) {
        if (this.f18820g) {
            androidx.fragment.app.d.K(2);
        } else {
            if (this.f18815b.remove(bVar.f1433y) == null || !androidx.fragment.app.d.K(2)) {
                return;
            }
            bVar.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l0.class == obj.getClass()) {
            l0 l0Var = (l0) obj;
            if (this.f18815b.equals(l0Var.f18815b) && this.f18816c.equals(l0Var.f18816c) && this.f18817d.equals(l0Var.f18817d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f18817d.hashCode() + ((this.f18816c.hashCode() + (this.f18815b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f18815b.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f18816c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f18817d.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
