package H6;

import H6.L;
import N7.B9;
import N7.Z;
import android.view.View;
import b9.C1992A;
import c9.C2095p;
import c9.C2097r;
import c9.C2101v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: SightActionIsEnabledObserver.kt */
/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final L.b f2114a;

    /* renamed from: b, reason: collision with root package name */
    public final L.c f2115b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap<View, Set<B9>> f2116c = new WeakHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap<B9, a> f2117d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap<View, C1992A> f2118e = new WeakHashMap<>();

    /* compiled from: SightActionIsEnabledObserver.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final j6.d f2119a;

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference<View> f2120b;

        public a(j6.d disposable, View owner) {
            kotlin.jvm.internal.l.f(disposable, "disposable");
            kotlin.jvm.internal.l.f(owner, "owner");
            this.f2119a = disposable;
            this.f2120b = new WeakReference<>(owner);
        }
    }

    public V(L.b bVar, L.c cVar) {
        this.f2114a = bVar;
        this.f2115b = cVar;
    }

    public final void a(B9 b92) {
        Set<B9> set;
        a aVarRemove = this.f2117d.remove(b92);
        if (aVarRemove == null) {
            return;
        }
        aVarRemove.f2119a.close();
        View view = aVarRemove.f2120b.get();
        if (view == null || (set = this.f2116c.get(view)) == null) {
            return;
        }
        set.remove(b92);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(final View view, C0675l c0675l, A7.d resolver, Z z10, ArrayList arrayList) {
        HashMap<B9, a> map;
        a aVarRemove;
        kotlin.jvm.internal.l.f(view, "view");
        C0675l div2View = c0675l;
        kotlin.jvm.internal.l.f(div2View, "div2View");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        Z div = z10;
        kotlin.jvm.internal.l.f(div, "div");
        WeakHashMap<View, C1992A> weakHashMap = this.f2118e;
        if (!weakHashMap.containsKey(view) && (view instanceof i7.k)) {
            ((i7.k) view).b(new j6.d() { // from class: H6.U
                @Override // java.lang.AutoCloseable, java.io.Closeable
                public final void close() {
                    V this$0 = this.f2112b;
                    kotlin.jvm.internal.l.f(this$0, "this$0");
                    View this_addSubscriptionIfNeeded = view;
                    kotlin.jvm.internal.l.f(this_addSubscriptionIfNeeded, "$this_addSubscriptionIfNeeded");
                    Set<B9> setRemove = this$0.f2116c.remove(this_addSubscriptionIfNeeded);
                    Iterator it = (setRemove == null ? C2101v.f18583b : setRemove).iterator();
                    while (it.hasNext()) {
                        this$0.a((B9) it.next());
                    }
                }
            });
            weakHashMap.put(view, C1992A.f18074a);
        }
        WeakHashMap<View, Set<B9>> weakHashMap2 = this.f2116c;
        Set<B9> set = weakHashMap2.get(view);
        if (set == null) {
            set = C2101v.f18583b;
        }
        Set setK0 = C2097r.K0(arrayList);
        setK0.retainAll(C2095p.d0(set));
        Set<B9> setK02 = C2097r.K0(setK0);
        Iterator<B9> it = set.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = this.f2117d;
            if (!zHasNext) {
                break;
            }
            B9 next = it.next();
            if (!setK0.contains(next) && (aVarRemove = map.remove(next)) != null) {
                aVarRemove.f2119a.close();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            B9 b92 = (B9) it2.next();
            if (!setK0.contains(b92)) {
                setK02.add(b92);
                a(b92);
                map.put(b92, new a(b92.isEnabled().d(resolver, new W(this, div2View, resolver, view, div, b92)), view));
            }
            div2View = c0675l;
            div = z10;
        }
        weakHashMap2.put(view, setK02);
    }
}
