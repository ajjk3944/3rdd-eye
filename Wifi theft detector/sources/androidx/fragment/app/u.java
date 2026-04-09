package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class u extends androidx.lifecycle.e0 {

    /* renamed from: k, reason: collision with root package name */
    public static final f0.b f3364k = new a();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3368g;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f3365d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f3366e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f3367f = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public boolean f3369h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3370i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3371j = false;

    public class a implements f0.b {
        @Override // androidx.lifecycle.f0.b
        public androidx.lifecycle.e0 a(Class cls) {
            return new u(true);
        }

        @Override // androidx.lifecycle.f0.b
        public /* synthetic */ androidx.lifecycle.e0 b(Class cls, k1.a aVar) {
            return g0.b(this, cls, aVar);
        }
    }

    public u(boolean z10) {
        this.f3368g = z10;
    }

    public static u l(i0 i0Var) {
        return (u) new androidx.lifecycle.f0(i0Var, f3364k).a(u.class);
    }

    @Override // androidx.lifecycle.e0
    public void d() {
        if (FragmentManager.I0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f3369h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.f3365d.equals(uVar.f3365d) && this.f3366e.equals(uVar.f3366e) && this.f3367f.equals(uVar.f3367f)) {
                return true;
            }
        }
        return false;
    }

    public void f(Fragment fragment) {
        if (this.f3371j) {
            if (FragmentManager.I0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f3365d.containsKey(fragment.mWho)) {
                return;
            }
            this.f3365d.put(fragment.mWho, fragment);
            if (FragmentManager.I0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public void g(Fragment fragment) {
        if (FragmentManager.I0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        i(fragment.mWho);
    }

    public void h(String str) {
        if (FragmentManager.I0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        i(str);
    }

    public int hashCode() {
        return (((this.f3365d.hashCode() * 31) + this.f3366e.hashCode()) * 31) + this.f3367f.hashCode();
    }

    public final void i(String str) {
        u uVar = (u) this.f3366e.get(str);
        if (uVar != null) {
            uVar.d();
            this.f3366e.remove(str);
        }
        i0 i0Var = (i0) this.f3367f.get(str);
        if (i0Var != null) {
            i0Var.a();
            this.f3367f.remove(str);
        }
    }

    public Fragment j(String str) {
        return (Fragment) this.f3365d.get(str);
    }

    public u k(Fragment fragment) {
        u uVar = (u) this.f3366e.get(fragment.mWho);
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this.f3368g);
        this.f3366e.put(fragment.mWho, uVar2);
        return uVar2;
    }

    public Collection m() {
        return new ArrayList(this.f3365d.values());
    }

    public i0 n(Fragment fragment) {
        i0 i0Var = (i0) this.f3367f.get(fragment.mWho);
        if (i0Var != null) {
            return i0Var;
        }
        i0 i0Var2 = new i0();
        this.f3367f.put(fragment.mWho, i0Var2);
        return i0Var2;
    }

    public boolean o() {
        return this.f3369h;
    }

    public void p(Fragment fragment) {
        if (this.f3371j) {
            if (FragmentManager.I0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f3365d.remove(fragment.mWho) == null || !FragmentManager.I0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public void q(boolean z10) {
        this.f3371j = z10;
    }

    public boolean r(Fragment fragment) {
        if (this.f3365d.containsKey(fragment.mWho)) {
            return this.f3368g ? this.f3369h : !this.f3370i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f3365d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f3366e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f3367f.keySet().iterator();
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
