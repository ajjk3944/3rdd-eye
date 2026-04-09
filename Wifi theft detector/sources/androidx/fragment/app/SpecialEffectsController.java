package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import n0.c;

/* loaded from: classes.dex */
public abstract class SpecialEffectsController {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f3206a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3207b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3208c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f3209d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3210e = false;

    public static class Operation {

        /* renamed from: a, reason: collision with root package name */
        public State f3211a;

        /* renamed from: b, reason: collision with root package name */
        public LifecycleImpact f3212b;

        /* renamed from: c, reason: collision with root package name */
        public final Fragment f3213c;

        /* renamed from: d, reason: collision with root package name */
        public final List f3214d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public final HashSet f3215e = new HashSet();

        /* renamed from: f, reason: collision with root package name */
        public boolean f3216f = false;

        /* renamed from: g, reason: collision with root package name */
        public boolean f3217g = false;

        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static State b(int i10) {
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

            public static State c(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : b(view.getVisibility());
            }

            public void a(View view) {
                int i10 = c.f3232a[ordinal()];
                if (i10 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.I0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (FragmentManager.I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (FragmentManager.I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                if (FragmentManager.I0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        public class a implements c.a {
            public a() {
            }

            @Override // n0.c.a
            public void onCancel() {
                Operation.this.b();
            }
        }

        public Operation(State state, LifecycleImpact lifecycleImpact, Fragment fragment, n0.c cVar) {
            this.f3211a = state;
            this.f3212b = lifecycleImpact;
            this.f3213c = fragment;
            cVar.b(new a());
        }

        public final void a(Runnable runnable) {
            this.f3214d.add(runnable);
        }

        public final void b() {
            if (h()) {
                return;
            }
            this.f3216f = true;
            if (this.f3215e.isEmpty()) {
                c();
                return;
            }
            ArrayList arrayList = new ArrayList(this.f3215e);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((n0.c) obj).a();
            }
        }

        public void c() {
            if (this.f3217g) {
                return;
            }
            if (FragmentManager.I0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f3217g = true;
            Iterator it = this.f3214d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void d(n0.c cVar) {
            if (this.f3215e.remove(cVar) && this.f3215e.isEmpty()) {
                c();
            }
        }

        public State e() {
            return this.f3211a;
        }

        public final Fragment f() {
            return this.f3213c;
        }

        public LifecycleImpact g() {
            return this.f3212b;
        }

        public final boolean h() {
            return this.f3216f;
        }

        public final boolean i() {
            return this.f3217g;
        }

        public final void j(n0.c cVar) {
            l();
            this.f3215e.add(cVar);
        }

        public final void k(State state, LifecycleImpact lifecycleImpact) {
            int i10 = c.f3233b[lifecycleImpact.ordinal()];
            if (i10 == 1) {
                if (this.f3211a == State.REMOVED) {
                    if (FragmentManager.I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3213c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f3212b + " to ADDING.");
                    }
                    this.f3211a = State.VISIBLE;
                    this.f3212b = LifecycleImpact.ADDING;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (FragmentManager.I0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3213c + " mFinalState = " + this.f3211a + " -> REMOVED. mLifecycleImpact  = " + this.f3212b + " to REMOVING.");
                }
                this.f3211a = State.REMOVED;
                this.f3212b = LifecycleImpact.REMOVING;
                return;
            }
            if (i10 == 3 && this.f3211a != State.REMOVED) {
                if (FragmentManager.I0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3213c + " mFinalState = " + this.f3211a + " -> " + state + ". ");
                }
                this.f3211a = state;
            }
        }

        public abstract void l();

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f3211a + "} {mLifecycleImpact = " + this.f3212b + "} {mFragment = " + this.f3213c + "}";
        }
    }

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f3228a;

        public a(d dVar) {
            this.f3228a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SpecialEffectsController.this.f3207b.contains(this.f3228a)) {
                this.f3228a.e().a(this.f3228a.f().mView);
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f3230a;

        public b(d dVar) {
            this.f3230a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            SpecialEffectsController.this.f3207b.remove(this.f3230a);
            SpecialEffectsController.this.f3208c.remove(this.f3230a);
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3232a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f3233b;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            f3233b = iArr;
            try {
                iArr[Operation.LifecycleImpact.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3233b[Operation.LifecycleImpact.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3233b[Operation.LifecycleImpact.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Operation.State.values().length];
            f3232a = iArr2;
            try {
                iArr2[Operation.State.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3232a[Operation.State.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3232a[Operation.State.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3232a[Operation.State.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static class d extends Operation {

        /* renamed from: h, reason: collision with root package name */
        public final w f3234h;

        public d(Operation.State state, Operation.LifecycleImpact lifecycleImpact, w wVar, n0.c cVar) {
            super(state, lifecycleImpact, wVar.k(), cVar);
            this.f3234h = wVar;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void c() {
            super.c();
            this.f3234h.m();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void l() {
            if (g() != Operation.LifecycleImpact.ADDING) {
                if (g() == Operation.LifecycleImpact.REMOVING) {
                    Fragment fragmentK = this.f3234h.k();
                    View viewRequireView = fragmentK.requireView();
                    if (FragmentManager.I0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + fragmentK);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragmentK2 = this.f3234h.k();
            View viewFindFocus = fragmentK2.mView.findFocus();
            if (viewFindFocus != null) {
                fragmentK2.setFocusedView(viewFindFocus);
                if (FragmentManager.I0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentK2);
                }
            }
            View viewRequireView2 = f().requireView();
            if (viewRequireView2.getParent() == null) {
                this.f3234h.b();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragmentK2.getPostOnViewCreatedAlpha());
        }
    }

    public SpecialEffectsController(ViewGroup viewGroup) {
        this.f3206a = viewGroup;
    }

    public static SpecialEffectsController n(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return o(viewGroup, fragmentManager.A0());
    }

    public static SpecialEffectsController o(ViewGroup viewGroup, f0 f0Var) {
        int i10 = g1.b.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        SpecialEffectsController specialEffectsControllerA = f0Var.a(viewGroup);
        viewGroup.setTag(i10, specialEffectsControllerA);
        return specialEffectsControllerA;
    }

    public final void a(Operation.State state, Operation.LifecycleImpact lifecycleImpact, w wVar) {
        synchronized (this.f3207b) {
            try {
                n0.c cVar = new n0.c();
                Operation operationH = h(wVar.k());
                if (operationH != null) {
                    operationH.k(state, lifecycleImpact);
                    return;
                }
                d dVar = new d(state, lifecycleImpact, wVar, cVar);
                this.f3207b.add(dVar);
                dVar.a(new a(dVar));
                dVar.a(new b(dVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(Operation.State state, w wVar) {
        if (FragmentManager.I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + wVar.k());
        }
        a(state, Operation.LifecycleImpact.ADDING, wVar);
    }

    public void c(w wVar) {
        if (FragmentManager.I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + wVar.k());
        }
        a(Operation.State.GONE, Operation.LifecycleImpact.NONE, wVar);
    }

    public void d(w wVar) {
        if (FragmentManager.I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + wVar.k());
        }
        a(Operation.State.REMOVED, Operation.LifecycleImpact.REMOVING, wVar);
    }

    public void e(w wVar) {
        if (FragmentManager.I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + wVar.k());
        }
        a(Operation.State.VISIBLE, Operation.LifecycleImpact.NONE, wVar);
    }

    public abstract void f(List list, boolean z10);

    public void g() {
        if (this.f3210e) {
            return;
        }
        if (!ViewCompat.P(this.f3206a)) {
            j();
            this.f3209d = false;
            return;
        }
        synchronized (this.f3207b) {
            try {
                if (!this.f3207b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f3208c);
                    this.f3208c.clear();
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        Operation operation = (Operation) obj;
                        if (FragmentManager.I0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + operation);
                        }
                        operation.b();
                        if (!operation.i()) {
                            this.f3208c.add(operation);
                        }
                    }
                    q();
                    ArrayList arrayList2 = new ArrayList(this.f3207b);
                    this.f3207b.clear();
                    this.f3208c.addAll(arrayList2);
                    if (FragmentManager.I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        ((Operation) obj2).l();
                    }
                    f(arrayList2, this.f3209d);
                    this.f3209d = false;
                    if (FragmentManager.I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Operation h(Fragment fragment) {
        ArrayList arrayList = this.f3207b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Operation operation = (Operation) obj;
            if (operation.f().equals(fragment) && !operation.h()) {
                return operation;
            }
        }
        return null;
    }

    public final Operation i(Fragment fragment) {
        ArrayList arrayList = this.f3208c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Operation operation = (Operation) obj;
            if (operation.f().equals(fragment) && !operation.h()) {
                return operation;
            }
        }
        return null;
    }

    public void j() {
        String str;
        String str2;
        if (FragmentManager.I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zP = ViewCompat.P(this.f3206a);
        synchronized (this.f3207b) {
            try {
                q();
                ArrayList arrayList = this.f3207b;
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((Operation) obj).l();
                }
                ArrayList arrayList2 = new ArrayList(this.f3208c);
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList2.get(i12);
                    i12++;
                    Operation operation = (Operation) obj2;
                    if (FragmentManager.I0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (zP) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f3206a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(operation);
                        Log.v("FragmentManager", sb.toString());
                    }
                    operation.b();
                }
                ArrayList arrayList3 = new ArrayList(this.f3207b);
                int size3 = arrayList3.size();
                while (i10 < size3) {
                    Object obj3 = arrayList3.get(i10);
                    i10++;
                    Operation operation2 = (Operation) obj3;
                    if (FragmentManager.I0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (zP) {
                            str = "";
                        } else {
                            str = "Container " + this.f3206a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(operation2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    operation2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k() {
        if (this.f3210e) {
            if (FragmentManager.I0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f3210e = false;
            g();
        }
    }

    public Operation.LifecycleImpact l(w wVar) {
        Operation operationH = h(wVar.k());
        Operation.LifecycleImpact lifecycleImpactG = operationH != null ? operationH.g() : null;
        Operation operationI = i(wVar.k());
        return (operationI == null || !(lifecycleImpactG == null || lifecycleImpactG == Operation.LifecycleImpact.NONE)) ? lifecycleImpactG : operationI.g();
    }

    public ViewGroup m() {
        return this.f3206a;
    }

    public void p() {
        synchronized (this.f3207b) {
            try {
                q();
                this.f3210e = false;
                int size = this.f3207b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    Operation operation = (Operation) this.f3207b.get(size);
                    Operation.State stateC = Operation.State.c(operation.f().mView);
                    Operation.State stateE = operation.e();
                    Operation.State state = Operation.State.VISIBLE;
                    if (stateE == state && stateC != state) {
                        this.f3210e = operation.f().isPostponed();
                        break;
                    }
                    size--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q() {
        ArrayList arrayList = this.f3207b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Operation operation = (Operation) obj;
            if (operation.g() == Operation.LifecycleImpact.ADDING) {
                operation.k(Operation.State.b(operation.f().requireView().getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    public void r(boolean z10) {
        this.f3209d = z10;
    }
}
