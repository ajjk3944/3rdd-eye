package k0;

import android.util.Log;
import androidx.lifecycle.X;
import androidx.lifecycle.a0;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class M extends X {

    /* renamed from: h, reason: collision with root package name */
    public static final androidx.lifecycle.P f21536h = new androidx.lifecycle.P(2);

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21540e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f21537b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f21538c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f21539d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f21541f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21542g = false;

    public M(boolean z6) {
        this.f21540e = z6;
    }

    @Override // androidx.lifecycle.X
    public final void d() {
        if (K.H(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f21541f = true;
    }

    public final void e(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        if (K.H(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC2617v);
        }
        f(abstractComponentCallbacksC2617v.f21710e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && M.class == obj.getClass()) {
            M m6 = (M) obj;
            if (this.f21537b.equals(m6.f21537b) && this.f21538c.equals(m6.f21538c) && this.f21539d.equals(m6.f21539d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(String str) {
        HashMap map = this.f21538c;
        M m6 = (M) map.get(str);
        if (m6 != null) {
            m6.d();
            map.remove(str);
        }
        HashMap map2 = this.f21539d;
        a0 a0Var = (a0) map2.get(str);
        if (a0Var != null) {
            a0Var.a();
            map2.remove(str);
        }
    }

    public final void g(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        if (this.f21542g) {
            if (K.H(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f21537b.remove(abstractComponentCallbacksC2617v.f21710e) == null || !K.H(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC2617v);
        }
    }

    public final int hashCode() {
        return this.f21539d.hashCode() + ((this.f21538c.hashCode() + (this.f21537b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f21537b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f21538c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f21539d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
