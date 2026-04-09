package androidx.fragment.app;

import A1.e;
import F1.W;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
abstract class K {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f31336a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList f31337b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f31338c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    boolean f31339d = false;

    /* renamed from: e, reason: collision with root package name */
    boolean f31340e = false;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f31341a;

        a(d dVar) {
            this.f31341a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (K.this.f31337b.contains(this.f31341a)) {
                this.f31341a.e().applyState(this.f31341a.f().f31230I);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f31343a;

        b(d dVar) {
            this.f31343a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            K.this.f31337b.remove(this.f31343a);
            K.this.f31338c.remove(this.f31343a);
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31345a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f31346b;

        static {
            int[] iArr = new int[e.b.values().length];
            f31346b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31346b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31346b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f31345a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31345a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31345a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31345a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static class d extends e {

        /* renamed from: h, reason: collision with root package name */
        private final C f31347h;

        d(e.c cVar, e.b bVar, C c10, A1.e eVar) {
            super(cVar, bVar, c10.k(), eVar);
            this.f31347h = c10;
        }

        @Override // androidx.fragment.app.K.e
        public void c() {
            super.c();
            this.f31347h.m();
        }

        @Override // androidx.fragment.app.K.e
        void l() {
            if (g() != e.b.ADDING) {
                if (g() == e.b.REMOVING) {
                    Fragment fragmentK = this.f31347h.k();
                    View viewQ1 = fragmentK.q1();
                    if (w.E0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewQ1.findFocus() + " on view " + viewQ1 + " for Fragment " + fragmentK);
                    }
                    viewQ1.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragmentK2 = this.f31347h.k();
            View viewFindFocus = fragmentK2.f31230I.findFocus();
            if (viewFindFocus != null) {
                fragmentK2.w1(viewFindFocus);
                if (w.E0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentK2);
                }
            }
            View viewQ12 = f().q1();
            if (viewQ12.getParent() == null) {
                this.f31347h.b();
                viewQ12.setAlpha(0.0f);
            }
            if (viewQ12.getAlpha() == 0.0f && viewQ12.getVisibility() == 0) {
                viewQ12.setVisibility(4);
            }
            viewQ12.setAlpha(fragmentK2.K());
        }
    }

    K(ViewGroup viewGroup) {
        this.f31336a = viewGroup;
    }

    private void a(e.c cVar, e.b bVar, C c10) {
        synchronized (this.f31337b) {
            try {
                A1.e eVar = new A1.e();
                e eVarH = h(c10.k());
                if (eVarH != null) {
                    eVarH.k(cVar, bVar);
                    return;
                }
                d dVar = new d(cVar, bVar, c10, eVar);
                this.f31337b.add(dVar);
                dVar.a(new a(dVar));
                dVar.a(new b(dVar));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private e h(Fragment fragment) {
        Iterator it = this.f31337b.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    private e i(Fragment fragment) {
        Iterator it = this.f31338c.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    static K n(ViewGroup viewGroup, w wVar) {
        return o(viewGroup, wVar.w0());
    }

    static K o(ViewGroup viewGroup, L l10) {
        int i10 = U1.b.f22125b;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof K) {
            return (K) tag;
        }
        K kA = l10.a(viewGroup);
        viewGroup.setTag(i10, kA);
        return kA;
    }

    private void q() {
        Iterator it = this.f31337b.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.g() == e.b.ADDING) {
                eVar.k(e.c.from(eVar.f().q1().getVisibility()), e.b.NONE);
            }
        }
    }

    void b(e.c cVar, C c10) {
        if (w.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + c10.k());
        }
        a(cVar, e.b.ADDING, c10);
    }

    void c(C c10) {
        if (w.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + c10.k());
        }
        a(e.c.GONE, e.b.NONE, c10);
    }

    void d(C c10) {
        if (w.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + c10.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, c10);
    }

    void e(C c10) {
        if (w.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + c10.k());
        }
        a(e.c.VISIBLE, e.b.NONE, c10);
    }

    abstract void f(List list, boolean z10);

    void g() {
        if (this.f31340e) {
            return;
        }
        if (!W.P(this.f31336a)) {
            j();
            this.f31339d = false;
            return;
        }
        synchronized (this.f31337b) {
            try {
                if (!this.f31337b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f31338c);
                    this.f31338c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (w.E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.b();
                        if (!eVar.i()) {
                            this.f31338c.add(eVar);
                        }
                    }
                    q();
                    ArrayList arrayList2 = new ArrayList(this.f31337b);
                    this.f31337b.clear();
                    this.f31338c.addAll(arrayList2);
                    if (w.E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((e) it2.next()).l();
                    }
                    f(arrayList2, this.f31339d);
                    this.f31339d = false;
                    if (w.E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void j() {
        String str;
        String str2;
        if (w.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zP = W.P(this.f31336a);
        synchronized (this.f31337b) {
            try {
                q();
                Iterator it = this.f31337b.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).l();
                }
                Iterator it2 = new ArrayList(this.f31338c).iterator();
                while (it2.hasNext()) {
                    e eVar = (e) it2.next();
                    if (w.E0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (zP) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f31336a + " is not attached to window. ";
                        }
                        sb2.append(str2);
                        sb2.append("Cancelling running operation ");
                        sb2.append(eVar);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    eVar.b();
                }
                Iterator it3 = new ArrayList(this.f31337b).iterator();
                while (it3.hasNext()) {
                    e eVar2 = (e) it3.next();
                    if (w.E0(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("SpecialEffectsController: ");
                        if (zP) {
                            str = "";
                        } else {
                            str = "Container " + this.f31336a + " is not attached to window. ";
                        }
                        sb3.append(str);
                        sb3.append("Cancelling pending operation ");
                        sb3.append(eVar2);
                        Log.v("FragmentManager", sb3.toString());
                    }
                    eVar2.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void k() {
        if (this.f31340e) {
            if (w.E0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f31340e = false;
            g();
        }
    }

    e.b l(C c10) {
        e eVarH = h(c10.k());
        e.b bVarG = eVarH != null ? eVarH.g() : null;
        e eVarI = i(c10.k());
        return (eVarI == null || !(bVarG == null || bVarG == e.b.NONE)) ? bVarG : eVarI.g();
    }

    public ViewGroup m() {
        return this.f31336a;
    }

    void p() {
        synchronized (this.f31337b) {
            try {
                q();
                this.f31340e = false;
                int size = this.f31337b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    e eVar = (e) this.f31337b.get(size);
                    e.c cVarFrom = e.c.from(eVar.f().f31230I);
                    e.c cVarE = eVar.e();
                    e.c cVar = e.c.VISIBLE;
                    if (cVarE == cVar && cVarFrom != cVar) {
                        this.f31340e = eVar.f().e0();
                        break;
                    }
                    size--;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void r(boolean z10) {
        this.f31339d = z10;
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        private c f31348a;

        /* renamed from: b, reason: collision with root package name */
        private b f31349b;

        /* renamed from: c, reason: collision with root package name */
        private final Fragment f31350c;

        /* renamed from: d, reason: collision with root package name */
        private final List f31351d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private final HashSet f31352e = new HashSet();

        /* renamed from: f, reason: collision with root package name */
        private boolean f31353f = false;

        /* renamed from: g, reason: collision with root package name */
        private boolean f31354g = false;

        class a implements e.a {
            a() {
            }

            @Override // A1.e.a
            public void onCancel() {
                e.this.b();
            }
        }

        enum b {
            NONE,
            ADDING,
            REMOVING
        }

        e(c cVar, b bVar, Fragment fragment, A1.e eVar) {
            this.f31348a = cVar;
            this.f31349b = bVar;
            this.f31350c = fragment;
            eVar.b(new a());
        }

        final void a(Runnable runnable) {
            this.f31351d.add(runnable);
        }

        final void b() {
            if (h()) {
                return;
            }
            this.f31353f = true;
            if (this.f31352e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.f31352e).iterator();
            while (it.hasNext()) {
                ((A1.e) it.next()).a();
            }
        }

        public void c() {
            if (this.f31354g) {
                return;
            }
            if (w.E0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f31354g = true;
            Iterator it = this.f31351d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void d(A1.e eVar) {
            if (this.f31352e.remove(eVar) && this.f31352e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.f31348a;
        }

        public final Fragment f() {
            return this.f31350c;
        }

        b g() {
            return this.f31349b;
        }

        final boolean h() {
            return this.f31353f;
        }

        final boolean i() {
            return this.f31354g;
        }

        public final void j(A1.e eVar) {
            l();
            this.f31352e.add(eVar);
        }

        final void k(c cVar, b bVar) {
            int i10 = c.f31346b[bVar.ordinal()];
            if (i10 == 1) {
                if (this.f31348a == c.REMOVED) {
                    if (w.E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f31350c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f31349b + " to ADDING.");
                    }
                    this.f31348a = c.VISIBLE;
                    this.f31349b = b.ADDING;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (w.E0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f31350c + " mFinalState = " + this.f31348a + " -> REMOVED. mLifecycleImpact  = " + this.f31349b + " to REMOVING.");
                }
                this.f31348a = c.REMOVED;
                this.f31349b = b.REMOVING;
                return;
            }
            if (i10 == 3 && this.f31348a != c.REMOVED) {
                if (w.E0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f31350c + " mFinalState = " + this.f31348a + " -> " + cVar + ". ");
                }
                this.f31348a = cVar;
            }
        }

        abstract void l();

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f31348a + "} {mLifecycleImpact = " + this.f31349b + "} {mFragment = " + this.f31350c + "}";
        }

        enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            static c from(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : from(view.getVisibility());
            }

            void applyState(View view) {
                int i10 = c.f31345a[ordinal()];
                if (i10 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (w.E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (w.E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (w.E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                if (w.E0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }

            static c from(int i10) {
                if (i10 == 0) {
                    return VISIBLE;
                }
                if (i10 == 4) {
                    return INVISIBLE;
                }
                if (i10 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i10);
            }
        }
    }
}
