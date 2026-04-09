package androidx.fragment.app;

import N7.G8;
import android.util.Log;
import androidx.lifecycle.b0;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import j1.C5166b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: FragmentManagerViewModel.java */
/* loaded from: classes.dex */
public final class B extends b0 {

    /* renamed from: h, reason: collision with root package name */
    public static final a f15749h = new a();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15753e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<String, ComponentCallbacksC1759l> f15750b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<String, B> f15751c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap<String, i0> f15752d = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    public boolean f15754f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15755g = false;

    /* compiled from: FragmentManagerViewModel.java */
    public class a implements f0 {
        @Override // androidx.lifecycle.f0
        public final <T extends b0> T a(Class<T> cls) {
            return new B(true);
        }

        @Override // androidx.lifecycle.f0
        public final /* synthetic */ b0 b(kotlin.jvm.internal.e eVar, C5166b c5166b) {
            return G8.c(this, eVar, c5166b);
        }

        @Override // androidx.lifecycle.f0
        public final b0 c(Class cls, C5166b c5166b) {
            return a(cls);
        }
    }

    public B(boolean z10) {
        this.f15753e = z10;
    }

    @Override // androidx.lifecycle.b0
    public final void d() {
        if (x.G(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f15754f = true;
    }

    public final void e(ComponentCallbacksC1759l componentCallbacksC1759l) {
        if (this.f15755g) {
            if (x.G(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        HashMap<String, ComponentCallbacksC1759l> map = this.f15750b;
        if (map.containsKey(componentCallbacksC1759l.mWho)) {
            return;
        }
        map.put(componentCallbacksC1759l.mWho, componentCallbacksC1759l);
        if (x.G(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + componentCallbacksC1759l);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && B.class == obj.getClass()) {
            B b10 = (B) obj;
            if (this.f15750b.equals(b10.f15750b) && this.f15751c.equals(b10.f15751c) && this.f15752d.equals(b10.f15752d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(ComponentCallbacksC1759l componentCallbacksC1759l, boolean z10) {
        if (x.G(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + componentCallbacksC1759l);
        }
        h(componentCallbacksC1759l.mWho, z10);
    }

    public final void g(String str, boolean z10) {
        if (x.G(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        h(str, z10);
    }

    public final void h(String str, boolean z10) {
        HashMap<String, B> map = this.f15751c;
        B b10 = map.get(str);
        if (b10 != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(b10.f15751c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b10.g((String) it.next(), true);
                }
            }
            b10.d();
            map.remove(str);
        }
        HashMap<String, i0> map2 = this.f15752d;
        i0 i0Var = map2.get(str);
        if (i0Var != null) {
            i0Var.a();
            map2.remove(str);
        }
    }

    public final int hashCode() {
        return this.f15752d.hashCode() + ((this.f15751c.hashCode() + (this.f15750b.hashCode() * 31)) * 31);
    }

    public final void i(ComponentCallbacksC1759l componentCallbacksC1759l) {
        if (this.f15755g) {
            if (x.G(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f15750b.remove(componentCallbacksC1759l.mWho) == null || !x.G(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + componentCallbacksC1759l);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<ComponentCallbacksC1759l> it = this.f15750b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f15751c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f15752d.keySet().iterator();
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
