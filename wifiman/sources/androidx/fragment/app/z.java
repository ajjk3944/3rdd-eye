package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.N;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
final class z extends N {

    /* renamed from: i, reason: collision with root package name */
    private static final P.c f31551i = new a();

    /* renamed from: e, reason: collision with root package name */
    private final boolean f31555e;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f31552b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f31553c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f31554d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private boolean f31556f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f31557g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f31558h = false;

    class a implements P.c {
        a() {
        }

        @Override // androidx.lifecycle.P.c
        public N a(Class cls) {
            return new z(true);
        }
    }

    z(boolean z10) {
        this.f31555e = z10;
    }

    private void a0(String str) {
        z zVar = (z) this.f31553c.get(str);
        if (zVar != null) {
            zVar.W();
            this.f31553c.remove(str);
        }
        Q q10 = (Q) this.f31554d.get(str);
        if (q10 != null) {
            q10.a();
            this.f31554d.remove(str);
        }
    }

    static z d0(Q q10) {
        return (z) new P(q10, f31551i).a(z.class);
    }

    @Override // androidx.lifecycle.N
    protected void W() {
        if (w.E0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f31556f = true;
    }

    void X(Fragment fragment) {
        if (this.f31558h) {
            if (w.E0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f31552b.containsKey(fragment.f31241f)) {
                return;
            }
            this.f31552b.put(fragment.f31241f, fragment);
            if (w.E0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    void Y(Fragment fragment) {
        if (w.E0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        a0(fragment.f31241f);
    }

    void Z(String str) {
        if (w.E0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        a0(str);
    }

    Fragment b0(String str) {
        return (Fragment) this.f31552b.get(str);
    }

    z c0(Fragment fragment) {
        z zVar = (z) this.f31553c.get(fragment.f31241f);
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(this.f31555e);
        this.f31553c.put(fragment.f31241f, zVar2);
        return zVar2;
    }

    Collection e0() {
        return new ArrayList(this.f31552b.values());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        return this.f31552b.equals(zVar.f31552b) && this.f31553c.equals(zVar.f31553c) && this.f31554d.equals(zVar.f31554d);
    }

    Q f0(Fragment fragment) {
        Q q10 = (Q) this.f31554d.get(fragment.f31241f);
        if (q10 != null) {
            return q10;
        }
        Q q11 = new Q();
        this.f31554d.put(fragment.f31241f, q11);
        return q11;
    }

    boolean g0() {
        return this.f31556f;
    }

    void h0(Fragment fragment) {
        if (this.f31558h) {
            if (w.E0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f31552b.remove(fragment.f31241f) == null || !w.E0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public int hashCode() {
        return (((this.f31552b.hashCode() * 31) + this.f31553c.hashCode()) * 31) + this.f31554d.hashCode();
    }

    void i0(boolean z10) {
        this.f31558h = z10;
    }

    boolean j0(Fragment fragment) {
        if (this.f31552b.containsKey(fragment.f31241f)) {
            return this.f31555e ? this.f31556f : !this.f31557g;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f31552b.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f31553c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f31554d.keySet().iterator();
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
