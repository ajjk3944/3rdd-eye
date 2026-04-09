package b5;

import android.util.Log;
import androidx.lifecycle.j1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w0 extends androidx.lifecycle.e1 {

    /* renamed from: h, reason: collision with root package name */
    public static final androidx.lifecycle.x0 f1914h = new androidx.lifecycle.x0(2);

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1918e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1915b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1916c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1917d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f1919f = false;
    public boolean g = false;

    public w0(boolean z3) {
        this.f1918e = z3;
    }

    @Override // androidx.lifecycle.e1
    public final void d() {
        if (u0.K(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1919f = true;
    }

    public final void e(z zVar, boolean z3) {
        if (u0.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + zVar);
        }
        g(zVar.f1934f, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass()) {
            w0 w0Var = (w0) obj;
            if (this.f1915b.equals(w0Var.f1915b) && this.f1916c.equals(w0Var.f1916c) && this.f1917d.equals(w0Var.f1917d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(String str, boolean z3) {
        if (u0.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        g(str, z3);
    }

    public final void g(String str, boolean z3) {
        HashMap map = this.f1916c;
        w0 w0Var = (w0) map.get(str);
        if (w0Var != null) {
            if (z3) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(w0Var.f1916c.keySet());
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    w0Var.f((String) obj, true);
                }
            }
            w0Var.d();
            map.remove(str);
        }
        HashMap map2 = this.f1917d;
        j1 j1Var = (j1) map2.get(str);
        if (j1Var != null) {
            j1Var.a();
            map2.remove(str);
        }
    }

    public final void h(z zVar) {
        if (this.g) {
            if (u0.K(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f1915b.remove(zVar.f1934f) == null || !u0.K(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + zVar);
        }
    }

    public final int hashCode() {
        return this.f1917d.hashCode() + ((this.f1916c.hashCode() + (this.f1915b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f1915b.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f1916c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f1917d.keySet().iterator();
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
