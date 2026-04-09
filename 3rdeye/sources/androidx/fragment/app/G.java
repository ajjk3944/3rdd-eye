package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: FragmentStore.java */
/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<ComponentCallbacksC1759l> f15780a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<String, F> f15781b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<String, Bundle> f15782c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public B f15783d;

    public final void a(ComponentCallbacksC1759l componentCallbacksC1759l) {
        if (this.f15780a.contains(componentCallbacksC1759l)) {
            throw new IllegalStateException("Fragment already added: " + componentCallbacksC1759l);
        }
        synchronized (this.f15780a) {
            this.f15780a.add(componentCallbacksC1759l);
        }
        componentCallbacksC1759l.mAdded = true;
    }

    public final ComponentCallbacksC1759l b(String str) {
        F f10 = this.f15781b.get(str);
        if (f10 != null) {
            return f10.f15771c;
        }
        return null;
    }

    public final ComponentCallbacksC1759l c(String str) {
        ComponentCallbacksC1759l componentCallbacksC1759lFindFragmentByWho;
        for (F f10 : this.f15781b.values()) {
            if (f10 != null && (componentCallbacksC1759lFindFragmentByWho = f10.f15771c.findFragmentByWho(str)) != null) {
                return componentCallbacksC1759lFindFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (F f10 : this.f15781b.values()) {
            if (f10 != null) {
                arrayList.add(f10);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (F f10 : this.f15781b.values()) {
            if (f10 != null) {
                arrayList.add(f10.f15771c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List<ComponentCallbacksC1759l> f() {
        ArrayList arrayList;
        if (this.f15780a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f15780a) {
            arrayList = new ArrayList(this.f15780a);
        }
        return arrayList;
    }

    public final void g(F f10) {
        ComponentCallbacksC1759l componentCallbacksC1759l = f10.f15771c;
        String str = componentCallbacksC1759l.mWho;
        HashMap<String, F> map = this.f15781b;
        if (map.get(str) != null) {
            return;
        }
        map.put(componentCallbacksC1759l.mWho, f10);
        if (componentCallbacksC1759l.mRetainInstanceChangedWhileDetached) {
            if (componentCallbacksC1759l.mRetainInstance) {
                this.f15783d.e(componentCallbacksC1759l);
            } else {
                this.f15783d.i(componentCallbacksC1759l);
            }
            componentCallbacksC1759l.mRetainInstanceChangedWhileDetached = false;
        }
        if (x.G(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + componentCallbacksC1759l);
        }
    }

    public final void h(F f10) {
        ComponentCallbacksC1759l componentCallbacksC1759l = f10.f15771c;
        if (componentCallbacksC1759l.mRetainInstance) {
            this.f15783d.i(componentCallbacksC1759l);
        }
        HashMap<String, F> map = this.f15781b;
        if (map.get(componentCallbacksC1759l.mWho) == f10 && map.put(componentCallbacksC1759l.mWho, null) != null && x.G(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + componentCallbacksC1759l);
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap<String, Bundle> map = this.f15782c;
        return bundle != null ? map.put(str, bundle) : map.remove(str);
    }
}
