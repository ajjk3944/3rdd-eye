package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.q;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
class k extends androidx.lifecycle.p {

    /* renamed from: i, reason: collision with root package name */
    private static final q.a f1672i = new a();

    /* renamed from: f, reason: collision with root package name */
    private final boolean f1676f;

    /* renamed from: c, reason: collision with root package name */
    private final HashSet<Fragment> f1673c = new HashSet<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, k> f1674d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, androidx.lifecycle.r> f1675e = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private boolean f1677g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1678h = false;

    static class a implements q.a {
        a() {
        }

        @Override // androidx.lifecycle.q.a
        public <T extends androidx.lifecycle.p> T a(Class<T> cls) {
            return new k(true);
        }
    }

    k(boolean z2) {
        this.f1676f = z2;
    }

    static k g(androidx.lifecycle.r rVar) {
        return (k) new androidx.lifecycle.q(rVar, f1672i).a(k.class);
    }

    @Override // androidx.lifecycle.p
    protected void c() {
        if (i.I) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1677g = true;
    }

    boolean d(Fragment fragment) {
        return this.f1673c.add(fragment);
    }

    void e(Fragment fragment) {
        if (i.I) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        k kVar = this.f1674d.get(fragment.f1534f);
        if (kVar != null) {
            kVar.c();
            this.f1674d.remove(fragment.f1534f);
        }
        androidx.lifecycle.r rVar = this.f1675e.get(fragment.f1534f);
        if (rVar != null) {
            rVar.a();
            this.f1675e.remove(fragment.f1534f);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f1673c.equals(kVar.f1673c) && this.f1674d.equals(kVar.f1674d) && this.f1675e.equals(kVar.f1675e);
    }

    k f(Fragment fragment) {
        k kVar = this.f1674d.get(fragment.f1534f);
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this.f1676f);
        this.f1674d.put(fragment.f1534f, kVar2);
        return kVar2;
    }

    Collection<Fragment> h() {
        return this.f1673c;
    }

    public int hashCode() {
        return (((this.f1673c.hashCode() * 31) + this.f1674d.hashCode()) * 31) + this.f1675e.hashCode();
    }

    androidx.lifecycle.r i(Fragment fragment) {
        androidx.lifecycle.r rVar = this.f1675e.get(fragment.f1534f);
        if (rVar != null) {
            return rVar;
        }
        androidx.lifecycle.r rVar2 = new androidx.lifecycle.r();
        this.f1675e.put(fragment.f1534f, rVar2);
        return rVar2;
    }

    boolean j() {
        return this.f1677g;
    }

    boolean k(Fragment fragment) {
        return this.f1673c.remove(fragment);
    }

    boolean l(Fragment fragment) {
        if (this.f1673c.contains(fragment)) {
            return this.f1676f ? this.f1677g : !this.f1678h;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f1673c.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f1674d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1675e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
