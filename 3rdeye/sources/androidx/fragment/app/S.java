package androidx.fragment.app;

import G0.e;
import N7.B8;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.S;
import b9.C1992A;
import c9.C2097r;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import g0.C4356c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.WeakHashMap;

/* compiled from: SpecialEffectsController.kt */
/* loaded from: classes.dex */
public abstract class S {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f15833a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f15834b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f15835c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15836d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15837e;

    /* compiled from: SpecialEffectsController.kt */
    public static final class a extends b {

        /* renamed from: h, reason: collision with root package name */
        public final F f15838h;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(b.EnumC0238b finalState, b.a lifecycleImpact, F f10, G0.e eVar) {
            kotlin.jvm.internal.l.f(finalState, "finalState");
            kotlin.jvm.internal.l.f(lifecycleImpact, "lifecycleImpact");
            ComponentCallbacksC1759l componentCallbacksC1759l = f10.f15771c;
            kotlin.jvm.internal.l.e(componentCallbacksC1759l, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, componentCallbacksC1759l, eVar);
            this.f15838h = f10;
        }

        @Override // androidx.fragment.app.S.b
        public final void b() {
            super.b();
            this.f15838h.k();
        }

        @Override // androidx.fragment.app.S.b
        public final void d() {
            b.a aVar = this.f15840b;
            b.a aVar2 = b.a.ADDING;
            F f10 = this.f15838h;
            if (aVar != aVar2) {
                if (aVar == b.a.REMOVING) {
                    ComponentCallbacksC1759l componentCallbacksC1759l = f10.f15771c;
                    kotlin.jvm.internal.l.e(componentCallbacksC1759l, "fragmentStateManager.fragment");
                    View viewRequireView = componentCallbacksC1759l.requireView();
                    kotlin.jvm.internal.l.e(viewRequireView, "fragment.requireView()");
                    if (x.G(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + componentCallbacksC1759l);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            ComponentCallbacksC1759l componentCallbacksC1759l2 = f10.f15771c;
            kotlin.jvm.internal.l.e(componentCallbacksC1759l2, "fragmentStateManager.fragment");
            View viewFindFocus = componentCallbacksC1759l2.mView.findFocus();
            if (viewFindFocus != null) {
                componentCallbacksC1759l2.setFocusedView(viewFindFocus);
                if (x.G(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + componentCallbacksC1759l2);
                }
            }
            View viewRequireView2 = this.f15841c.requireView();
            kotlin.jvm.internal.l.e(viewRequireView2, "this.fragment.requireView()");
            if (viewRequireView2.getParent() == null) {
                f10.b();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(componentCallbacksC1759l2.getPostOnViewCreatedAlpha());
        }
    }

    /* compiled from: SpecialEffectsController.kt */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15848a;

        static {
            int[] iArr = new int[b.a.values().length];
            try {
                iArr[b.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f15848a = iArr;
        }
    }

    public S(ViewGroup container) {
        kotlin.jvm.internal.l.f(container, "container");
        this.f15833a = container;
        this.f15834b = new ArrayList();
        this.f15835c = new ArrayList();
    }

    public static final S f(ViewGroup container, x fragmentManager) {
        kotlin.jvm.internal.l.f(container, "container");
        kotlin.jvm.internal.l.f(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.l.e(fragmentManager.E(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof S) {
            return (S) tag;
        }
        C1754g c1754g = new C1754g(container);
        container.setTag(R.id.special_effects_controller_view_tag, c1754g);
        return c1754g;
    }

    public final void a(b.EnumC0238b enumC0238b, b.a aVar, F f10) {
        synchronized (this.f15834b) {
            G0.e eVar = new G0.e();
            ComponentCallbacksC1759l componentCallbacksC1759l = f10.f15771c;
            kotlin.jvm.internal.l.e(componentCallbacksC1759l, "fragmentStateManager.fragment");
            b bVarD = d(componentCallbacksC1759l);
            if (bVarD != null) {
                bVarD.c(enumC0238b, aVar);
                return;
            }
            final a aVar2 = new a(enumC0238b, aVar, f10, eVar);
            this.f15834b.add(aVar2);
            aVar2.f15842d.add(new Runnable() { // from class: androidx.fragment.app.Q
                @Override // java.lang.Runnable
                public final void run() {
                    S this$0 = this.f15831b;
                    kotlin.jvm.internal.l.f(this$0, "this$0");
                    S.a aVar3 = aVar2;
                    if (this$0.f15834b.contains(aVar3)) {
                        S.b.EnumC0238b enumC0238b2 = aVar3.f15839a;
                        View view = aVar3.f15841c.mView;
                        kotlin.jvm.internal.l.e(view, "operation.fragment.mView");
                        enumC0238b2.applyState(view);
                    }
                }
            });
            aVar2.f15842d.add(new C.T(13, this, aVar2));
            C1992A c1992a = C1992A.f18074a;
        }
    }

    public abstract void b(ArrayList arrayList, boolean z10);

    public final void c() {
        if (this.f15837e) {
            return;
        }
        ViewGroup viewGroup = this.f15833a;
        WeakHashMap<View, L0.S> weakHashMap = L0.I.f3792a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.f15836d = false;
            return;
        }
        synchronized (this.f15834b) {
            try {
                if (!this.f15834b.isEmpty()) {
                    ArrayList arrayListI0 = C2097r.I0(this.f15835c);
                    this.f15835c.clear();
                    Iterator it = arrayListI0.iterator();
                    while (it.hasNext()) {
                        b bVar = (b) it.next();
                        if (x.G(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + bVar);
                        }
                        bVar.a();
                        if (!bVar.f15845g) {
                            this.f15835c.add(bVar);
                        }
                    }
                    h();
                    ArrayList arrayListI02 = C2097r.I0(this.f15834b);
                    this.f15834b.clear();
                    this.f15835c.addAll(arrayListI02);
                    if (x.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayListI02.iterator();
                    while (it2.hasNext()) {
                        ((b) it2.next()).d();
                    }
                    b(arrayListI02, this.f15836d);
                    this.f15836d = false;
                    if (x.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final b d(ComponentCallbacksC1759l componentCallbacksC1759l) {
        Object next;
        Iterator it = this.f15834b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            b bVar = (b) next;
            if (kotlin.jvm.internal.l.b(bVar.f15841c, componentCallbacksC1759l) && !bVar.f15844f) {
                break;
            }
        }
        return (b) next;
    }

    public final void e() {
        String str;
        String str2;
        if (x.G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f15833a;
        WeakHashMap<View, L0.S> weakHashMap = L0.I.f3792a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f15834b) {
            try {
                h();
                Iterator it = this.f15834b.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).d();
                }
                Iterator it2 = C2097r.I0(this.f15835c).iterator();
                while (it2.hasNext()) {
                    b bVar = (b) it2.next();
                    if (x.G(2)) {
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f15833a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + bVar);
                    }
                    bVar.a();
                }
                Iterator it3 = C2097r.I0(this.f15834b).iterator();
                while (it3.hasNext()) {
                    b bVar2 = (b) it3.next();
                    if (x.G(2)) {
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f15833a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + bVar2);
                    }
                    bVar2.a();
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        Object objPrevious;
        synchronized (this.f15834b) {
            try {
                h();
                ArrayList arrayList = this.f15834b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    b bVar = (b) objPrevious;
                    b.EnumC0238b.a aVar = b.EnumC0238b.Companion;
                    View view = bVar.f15841c.mView;
                    kotlin.jvm.internal.l.e(view, "operation.fragment.mView");
                    aVar.getClass();
                    b.EnumC0238b enumC0238bA = b.EnumC0238b.a.a(view);
                    b.EnumC0238b enumC0238b = bVar.f15839a;
                    b.EnumC0238b enumC0238b2 = b.EnumC0238b.VISIBLE;
                    if (enumC0238b == enumC0238b2 && enumC0238bA != enumC0238b2) {
                        break;
                    }
                }
                b bVar2 = (b) objPrevious;
                ComponentCallbacksC1759l componentCallbacksC1759l = bVar2 != null ? bVar2.f15841c : null;
                this.f15837e = componentCallbacksC1759l != null ? componentCallbacksC1759l.isPostponed() : false;
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        Iterator it = this.f15834b.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f15840b == b.a.ADDING) {
                View viewRequireView = bVar.f15841c.requireView();
                kotlin.jvm.internal.l.e(viewRequireView, "fragment.requireView()");
                b.EnumC0238b.a aVar = b.EnumC0238b.Companion;
                int visibility = viewRequireView.getVisibility();
                aVar.getClass();
                bVar.c(b.EnumC0238b.a.b(visibility), b.a.NONE);
            }
        }
    }

    /* compiled from: SpecialEffectsController.kt */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public EnumC0238b f15839a;

        /* renamed from: b, reason: collision with root package name */
        public a f15840b;

        /* renamed from: c, reason: collision with root package name */
        public final ComponentCallbacksC1759l f15841c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f15842d;

        /* renamed from: e, reason: collision with root package name */
        public final LinkedHashSet f15843e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f15844f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f15845g;

        /* compiled from: SpecialEffectsController.kt */
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        /* compiled from: SpecialEffectsController.kt */
        /* renamed from: androidx.fragment.app.S$b$b, reason: collision with other inner class name */
        public enum EnumC0238b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static final a Companion = new a();

            /* compiled from: SpecialEffectsController.kt */
            /* renamed from: androidx.fragment.app.S$b$b$a */
            public static final class a {
                public static EnumC0238b a(View view) {
                    kotlin.jvm.internal.l.f(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? EnumC0238b.INVISIBLE : b(view.getVisibility());
                }

                public static EnumC0238b b(int i) {
                    if (i == 0) {
                        return EnumC0238b.VISIBLE;
                    }
                    if (i == 4) {
                        return EnumC0238b.INVISIBLE;
                    }
                    if (i == 8) {
                        return EnumC0238b.GONE;
                    }
                    throw new IllegalArgumentException(C4356c.h(i, "Unknown visibility "));
                }
            }

            /* compiled from: SpecialEffectsController.kt */
            /* renamed from: androidx.fragment.app.S$b$b$b, reason: collision with other inner class name */
            public /* synthetic */ class C0239b {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f15846a;

                static {
                    int[] iArr = new int[EnumC0238b.values().length];
                    try {
                        iArr[EnumC0238b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC0238b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC0238b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[EnumC0238b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f15846a = iArr;
                }
            }

            public static final EnumC0238b from(int i) {
                Companion.getClass();
                return a.b(i);
            }

            public final void applyState(View view) {
                kotlin.jvm.internal.l.f(view, "view");
                int i = C0239b.f15846a[ordinal()];
                if (i == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (x.G(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    if (x.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i == 3) {
                    if (x.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i != 4) {
                    return;
                }
                if (x.G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        /* compiled from: SpecialEffectsController.kt */
        public /* synthetic */ class c {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f15847a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f15847a = iArr;
            }
        }

        public b(EnumC0238b finalState, a lifecycleImpact, ComponentCallbacksC1759l fragment, G0.e eVar) {
            kotlin.jvm.internal.l.f(finalState, "finalState");
            kotlin.jvm.internal.l.f(lifecycleImpact, "lifecycleImpact");
            kotlin.jvm.internal.l.f(fragment, "fragment");
            this.f15839a = finalState;
            this.f15840b = lifecycleImpact;
            this.f15841c = fragment;
            this.f15842d = new ArrayList();
            this.f15843e = new LinkedHashSet();
            eVar.a(new M8.a(this, 10));
        }

        public final void a() {
            if (this.f15844f) {
                return;
            }
            this.f15844f = true;
            LinkedHashSet linkedHashSet = this.f15843e;
            if (linkedHashSet.isEmpty()) {
                b();
                return;
            }
            for (G0.e eVar : C2097r.K0(linkedHashSet)) {
                synchronized (eVar) {
                    try {
                        if (!eVar.f1846a) {
                            eVar.f1846a = true;
                            eVar.f1848c = true;
                            e.a aVar = eVar.f1847b;
                            if (aVar != null) {
                                try {
                                    aVar.b();
                                } catch (Throwable th) {
                                    synchronized (eVar) {
                                        eVar.f1848c = false;
                                        eVar.notifyAll();
                                        throw th;
                                    }
                                }
                            }
                            synchronized (eVar) {
                                eVar.f1848c = false;
                                eVar.notifyAll();
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        public void b() {
            if (this.f15845g) {
                return;
            }
            if (x.G(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f15845g = true;
            Iterator it = this.f15842d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void c(EnumC0238b finalState, a lifecycleImpact) {
            kotlin.jvm.internal.l.f(finalState, "finalState");
            kotlin.jvm.internal.l.f(lifecycleImpact, "lifecycleImpact");
            int i = c.f15847a[lifecycleImpact.ordinal()];
            ComponentCallbacksC1759l componentCallbacksC1759l = this.f15841c;
            if (i == 1) {
                if (this.f15839a == EnumC0238b.REMOVED) {
                    if (x.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + componentCallbacksC1759l + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f15840b + " to ADDING.");
                    }
                    this.f15839a = EnumC0238b.VISIBLE;
                    this.f15840b = a.ADDING;
                    return;
                }
                return;
            }
            if (i == 2) {
                if (x.G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + componentCallbacksC1759l + " mFinalState = " + this.f15839a + " -> REMOVED. mLifecycleImpact  = " + this.f15840b + " to REMOVING.");
                }
                this.f15839a = EnumC0238b.REMOVED;
                this.f15840b = a.REMOVING;
                return;
            }
            if (i == 3 && this.f15839a != EnumC0238b.REMOVED) {
                if (x.G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + componentCallbacksC1759l + " mFinalState = " + this.f15839a + " -> " + finalState + '.');
                }
                this.f15839a = finalState;
            }
        }

        public final String toString() {
            StringBuilder sbK = B8.k("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
            sbK.append(this.f15839a);
            sbK.append(" lifecycleImpact = ");
            sbK.append(this.f15840b);
            sbK.append(" fragment = ");
            sbK.append(this.f15841c);
            sbK.append('}');
            return sbK.toString();
        }

        public void d() {
        }
    }
}
