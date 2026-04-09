package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.view.ViewCompat;
import androidx.core.view.d1;
import androidx.core.view.j0;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n0.c;

/* loaded from: classes.dex */
public class b extends SpecialEffectsController {

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3241a;

        static {
            int[] iArr = new int[SpecialEffectsController.Operation.State.values().length];
            f3241a = iArr;
            try {
                iArr[SpecialEffectsController.Operation.State.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3241a[SpecialEffectsController.Operation.State.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3241a[SpecialEffectsController.Operation.State.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3241a[SpecialEffectsController.Operation.State.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$b, reason: collision with other inner class name */
    public class RunnableC0029b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f3242a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SpecialEffectsController.Operation f3243b;

        public RunnableC0029b(List list, SpecialEffectsController.Operation operation) {
            this.f3242a = list;
            this.f3243b = operation;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3242a.contains(this.f3243b)) {
                this.f3242a.remove(this.f3243b);
                b.this.s(this.f3243b);
            }
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3245a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f3246b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f3247c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SpecialEffectsController.Operation f3248d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ k f3249e;

        public c(ViewGroup viewGroup, View view, boolean z10, SpecialEffectsController.Operation operation, k kVar) {
            this.f3245a = viewGroup;
            this.f3246b = view;
            this.f3247c = z10;
            this.f3248d = operation;
            this.f3249e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3245a.endViewTransition(this.f3246b);
            if (this.f3247c) {
                this.f3248d.e().a(this.f3246b);
            }
            this.f3249e.a();
            if (FragmentManager.I0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f3248d + " has ended.");
            }
        }
    }

    public class d implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Animator f3251a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SpecialEffectsController.Operation f3252b;

        public d(Animator animator, SpecialEffectsController.Operation operation) {
            this.f3251a = animator;
            this.f3252b = operation;
        }

        @Override // n0.c.a
        public void onCancel() {
            this.f3251a.end();
            if (FragmentManager.I0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f3252b + " has been canceled.");
            }
        }
    }

    public class e implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SpecialEffectsController.Operation f3254a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3255b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f3256c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f3257d;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f3255b.endViewTransition(eVar.f3256c);
                e.this.f3257d.a();
            }
        }

        public e(SpecialEffectsController.Operation operation, ViewGroup viewGroup, View view, k kVar) {
            this.f3254a = operation;
            this.f3255b = viewGroup;
            this.f3256c = view;
            this.f3257d = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f3255b.post(new a());
            if (FragmentManager.I0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f3254a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (FragmentManager.I0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f3254a + " has reached onAnimationStart.");
            }
        }
    }

    public class f implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f3260a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3261b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f3262c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SpecialEffectsController.Operation f3263d;

        public f(View view, ViewGroup viewGroup, k kVar, SpecialEffectsController.Operation operation) {
            this.f3260a = view;
            this.f3261b = viewGroup;
            this.f3262c = kVar;
            this.f3263d = operation;
        }

        @Override // n0.c.a
        public void onCancel() {
            this.f3260a.clearAnimation();
            this.f3261b.endViewTransition(this.f3260a);
            this.f3262c.a();
            if (FragmentManager.I0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f3263d + " has been cancelled.");
            }
        }
    }

    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SpecialEffectsController.Operation f3265a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SpecialEffectsController.Operation f3266b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f3267c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r.a f3268d;

        public g(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z10, r.a aVar) {
            this.f3265a = operation;
            this.f3266b = operation2;
            this.f3267c = z10;
            this.f3268d = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.a(this.f3265a.f(), this.f3266b.f(), this.f3267c, this.f3268d, false);
        }
    }

    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c0 f3270a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f3271b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Rect f3272c;

        public h(c0 c0Var, View view, Rect rect) {
            this.f3270a = c0Var;
            this.f3271b = view;
            this.f3272c = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3270a.h(this.f3271b, this.f3272c);
        }
    }

    public class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3274a;

        public i(ArrayList arrayList) {
            this.f3274a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.d(this.f3274a, 4);
        }
    }

    public class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f3276a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SpecialEffectsController.Operation f3277b;

        public j(m mVar, SpecialEffectsController.Operation operation) {
            this.f3276a = mVar;
            this.f3277b = operation;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3276a.a();
            if (FragmentManager.I0(2)) {
                Log.v("FragmentManager", "Transition for operation " + this.f3277b + "has completed");
            }
        }
    }

    public static class k extends l {

        /* renamed from: c, reason: collision with root package name */
        public boolean f3279c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f3280d;

        /* renamed from: e, reason: collision with root package name */
        public h.a f3281e;

        public k(SpecialEffectsController.Operation operation, n0.c cVar, boolean z10) {
            super(operation, cVar);
            this.f3280d = false;
            this.f3279c = z10;
        }

        public h.a e(Context context) throws Resources.NotFoundException {
            if (this.f3280d) {
                return this.f3281e;
            }
            h.a aVarB = androidx.fragment.app.h.b(context, b().f(), b().e() == SpecialEffectsController.Operation.State.VISIBLE, this.f3279c);
            this.f3281e = aVarB;
            this.f3280d = true;
            return aVarB;
        }
    }

    public static class l {

        /* renamed from: a, reason: collision with root package name */
        public final SpecialEffectsController.Operation f3282a;

        /* renamed from: b, reason: collision with root package name */
        public final n0.c f3283b;

        public l(SpecialEffectsController.Operation operation, n0.c cVar) {
            this.f3282a = operation;
            this.f3283b = cVar;
        }

        public void a() {
            this.f3282a.d(this.f3283b);
        }

        public SpecialEffectsController.Operation b() {
            return this.f3282a;
        }

        public n0.c c() {
            return this.f3283b;
        }

        public boolean d() {
            SpecialEffectsController.Operation.State stateC = SpecialEffectsController.Operation.State.c(this.f3282a.f().mView);
            SpecialEffectsController.Operation.State stateE = this.f3282a.e();
            if (stateC == stateE) {
                return true;
            }
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            return (stateC == state || stateE == state) ? false : true;
        }
    }

    public static class m extends l {

        /* renamed from: c, reason: collision with root package name */
        public final Object f3284c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f3285d;

        /* renamed from: e, reason: collision with root package name */
        public final Object f3286e;

        public m(SpecialEffectsController.Operation operation, n0.c cVar, boolean z10, boolean z11) {
            super(operation, cVar);
            if (operation.e() == SpecialEffectsController.Operation.State.VISIBLE) {
                this.f3284c = z10 ? operation.f().getReenterTransition() : operation.f().getEnterTransition();
                this.f3285d = z10 ? operation.f().getAllowReturnTransitionOverlap() : operation.f().getAllowEnterTransitionOverlap();
            } else {
                this.f3284c = z10 ? operation.f().getReturnTransition() : operation.f().getExitTransition();
                this.f3285d = true;
            }
            if (!z11) {
                this.f3286e = null;
            } else if (z10) {
                this.f3286e = operation.f().getSharedElementReturnTransition();
            } else {
                this.f3286e = operation.f().getSharedElementEnterTransition();
            }
        }

        public c0 e() {
            c0 c0VarF = f(this.f3284c);
            c0 c0VarF2 = f(this.f3286e);
            if (c0VarF == null || c0VarF2 == null || c0VarF == c0VarF2) {
                return c0VarF != null ? c0VarF : c0VarF2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f3284c + " which uses a different Transition  type than its shared element transition " + this.f3286e);
        }

        public final c0 f(Object obj) {
            if (obj == null) {
                return null;
            }
            c0 c0Var = a0.f3239a;
            if (c0Var != null && c0Var.e(obj)) {
                return c0Var;
            }
            c0 c0Var2 = a0.f3240b;
            if (c0Var2 != null && c0Var2.e(obj)) {
                return c0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        public Object g() {
            return this.f3286e;
        }

        public Object h() {
            return this.f3284c;
        }

        public boolean i() {
            return this.f3286e != null;
        }

        public boolean j() {
            return this.f3285d;
        }
    }

    public b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    @Override // androidx.fragment.app.SpecialEffectsController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(java.util.List r14, boolean r15) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b.f(java.util.List, boolean):void");
    }

    public void s(SpecialEffectsController.Operation operation) {
        operation.e().a(operation.f().mView);
    }

    public void t(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (d1.a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                t(arrayList, childAt);
            }
        }
    }

    public void u(Map map, View view) {
        String strH = ViewCompat.H(view);
        if (strH != null) {
            map.put(strH, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    public void v(r.a aVar, Collection collection) {
        Iterator it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(ViewCompat.H((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }

    public final void w(List list, List list2, boolean z10, Map map) throws Resources.NotFoundException {
        SpecialEffectsController.Operation operation;
        k kVar;
        View view;
        ViewGroup viewGroupM = m();
        Context context = viewGroupM.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i10 = 0;
        boolean z11 = false;
        while (it.hasNext()) {
            k kVar2 = (k) it.next();
            if (kVar2.d()) {
                kVar2.a();
            } else {
                h.a aVarE = kVar2.e(context);
                if (aVarE == null) {
                    kVar2.a();
                } else {
                    Animator animator = aVarE.f3326b;
                    if (animator == null) {
                        arrayList.add(kVar2);
                    } else {
                        SpecialEffectsController.Operation operationB = kVar2.b();
                        Fragment fragmentF = operationB.f();
                        if (Boolean.TRUE.equals(map.get(operationB))) {
                            if (FragmentManager.I0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + fragmentF + " as this Fragment was involved in a Transition.");
                            }
                            kVar2.a();
                        } else {
                            boolean z12 = operationB.e() == SpecialEffectsController.Operation.State.GONE;
                            if (z12) {
                                list2.remove(operationB);
                            }
                            View view2 = fragmentF.mView;
                            viewGroupM.startViewTransition(view2);
                            ViewGroup viewGroup = viewGroupM;
                            viewGroupM = viewGroup;
                            animator.addListener(new c(viewGroup, view2, z12, operationB, kVar2));
                            animator.setTarget(view2);
                            animator.start();
                            if (FragmentManager.I0(2)) {
                                Log.v("FragmentManager", "Animator from operation " + operationB + " has started.");
                            }
                            kVar2.c().b(new d(animator, operationB));
                            z11 = true;
                        }
                    }
                }
            }
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            k kVar3 = (k) obj;
            SpecialEffectsController.Operation operationB2 = kVar3.b();
            Fragment fragmentF2 = operationB2.f();
            if (z10) {
                if (FragmentManager.I0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragmentF2 + " as Animations cannot run alongside Transitions.");
                }
                kVar3.a();
            } else if (z11) {
                if (FragmentManager.I0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragmentF2 + " as Animations cannot run alongside Animators.");
                }
                kVar3.a();
            } else {
                View view3 = fragmentF2.mView;
                Animation animation = (Animation) r0.i.g(((h.a) r0.i.g(kVar3.e(context))).f3325a);
                if (operationB2.e() != SpecialEffectsController.Operation.State.REMOVED) {
                    view3.startAnimation(animation);
                    kVar3.a();
                    operation = operationB2;
                    kVar = kVar3;
                    view = view3;
                } else {
                    viewGroupM.startViewTransition(view3);
                    h.b bVar = new h.b(animation, viewGroupM, view3);
                    operation = operationB2;
                    kVar = kVar3;
                    view = view3;
                    bVar.setAnimationListener(new e(operation, viewGroupM, view, kVar));
                    view.startAnimation(bVar);
                    if (FragmentManager.I0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + operation + " has started.");
                    }
                }
                kVar.c().b(new f(view, viewGroupM, kVar, operation));
            }
        }
    }

    public final Map x(List list, List list2, boolean z10, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2) {
        String str;
        ArrayList arrayList;
        String str2;
        ArrayList arrayList2;
        View view;
        View view2;
        Object objK;
        Object objK2;
        String str3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Object obj;
        Rect rect;
        SpecialEffectsController.Operation operation3;
        View view3;
        Rect rect2;
        ArrayList arrayList5;
        r.a aVar;
        View view4;
        ArrayList arrayList6;
        int i10;
        View view5;
        boolean z11 = z10;
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        c0 c0Var = null;
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (!mVar.d()) {
                c0 c0VarE = mVar.e();
                if (c0Var == null) {
                    c0Var = c0VarE;
                } else if (c0VarE != null && c0Var != c0VarE) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (c0Var == null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                m mVar2 = (m) it2.next();
                map.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
        } else {
            View view6 = new View(m().getContext());
            Rect rect3 = new Rect();
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            r.a aVar2 = new r.a();
            Iterator it3 = list.iterator();
            Object obj2 = null;
            View view7 = null;
            boolean z12 = false;
            while (true) {
                str = "FragmentManager";
                if (!it3.hasNext()) {
                    break;
                }
                m mVar3 = (m) it3.next();
                if (!mVar3.i() || operation == null || operation2 == null) {
                    view3 = view6;
                    rect2 = rect3;
                    arrayList5 = arrayList7;
                    aVar = aVar2;
                    view4 = view7;
                    arrayList6 = arrayList8;
                } else {
                    Object objU = c0Var.u(c0Var.f(mVar3.g()));
                    ArrayList<String> sharedElementSourceNames = operation2.f().getSharedElementSourceNames();
                    ArrayList<String> sharedElementSourceNames2 = operation.f().getSharedElementSourceNames();
                    ArrayList<String> sharedElementTargetNames = operation.f().getSharedElementTargetNames();
                    int i11 = 0;
                    while (i11 < sharedElementTargetNames.size()) {
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i11));
                        ArrayList<String> arrayList9 = sharedElementTargetNames;
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i11));
                        }
                        i11++;
                        sharedElementTargetNames = arrayList9;
                    }
                    ArrayList<String> sharedElementTargetNames2 = operation2.f().getSharedElementTargetNames();
                    if (z11) {
                        operation.f().getEnterTransitionCallback();
                        operation2.f().getExitTransitionCallback();
                    } else {
                        operation.f().getExitTransitionCallback();
                        operation2.f().getEnterTransitionCallback();
                    }
                    int i12 = 0;
                    for (int size = sharedElementSourceNames.size(); i12 < size; size = size) {
                        aVar2.put(sharedElementSourceNames.get(i12), sharedElementTargetNames2.get(i12));
                        i12++;
                    }
                    if (FragmentManager.I0(2)) {
                        Log.v("FragmentManager", ">>> entering view names <<<");
                        int i13 = 0;
                        for (int size2 = sharedElementTargetNames2.size(); i13 < size2; size2 = size2) {
                            String str4 = sharedElementTargetNames2.get(i13);
                            Log.v("FragmentManager", "Name: " + str4);
                            i13++;
                        }
                        Log.v("FragmentManager", ">>> exiting view names <<<");
                        int i14 = 0;
                        for (int size3 = sharedElementSourceNames.size(); i14 < size3; size3 = size3) {
                            String str5 = sharedElementSourceNames.get(i14);
                            Log.v("FragmentManager", "Name: " + str5);
                            i14++;
                        }
                    }
                    r.a aVar3 = new r.a();
                    u(aVar3, operation.f().mView);
                    aVar3.p(sharedElementSourceNames);
                    aVar2.p(aVar3.keySet());
                    r.a aVar4 = new r.a();
                    u(aVar4, operation2.f().mView);
                    aVar4.p(sharedElementTargetNames2);
                    aVar4.p(aVar2.values());
                    a0.c(aVar2, aVar4);
                    v(aVar3, aVar2.keySet());
                    v(aVar4, aVar2.values());
                    if (aVar2.isEmpty()) {
                        arrayList7.clear();
                        arrayList8.clear();
                        view3 = view6;
                        rect2 = rect3;
                        arrayList5 = arrayList7;
                        aVar = aVar2;
                        arrayList6 = arrayList8;
                        obj2 = null;
                        z11 = z10;
                        arrayList7 = arrayList5;
                        arrayList8 = arrayList6;
                        aVar2 = aVar;
                        rect3 = rect2;
                        view6 = view3;
                    } else {
                        aVar = aVar2;
                        a0.a(operation2.f(), operation.f(), z11, aVar3, true);
                        view4 = view7;
                        j0.a(m(), new g(operation2, operation, z11, aVar4));
                        arrayList7.addAll(aVar3.values());
                        if (sharedElementSourceNames.isEmpty()) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                            View view8 = (View) aVar3.get((String) sharedElementSourceNames.get(0));
                            c0Var.p(objU, view8);
                            view4 = view8;
                        }
                        arrayList8.addAll(aVar4.values());
                        if (!sharedElementTargetNames2.isEmpty() && (view5 = (View) aVar4.get((String) sharedElementTargetNames2.get(i10))) != null) {
                            j0.a(m(), new h(c0Var, view5, rect3));
                            z12 = true;
                        }
                        c0Var.s(objU, view6, arrayList7);
                        rect2 = rect3;
                        ArrayList arrayList10 = arrayList7;
                        view3 = view6;
                        c0Var.n(objU, null, null, null, null, objU, arrayList8);
                        arrayList6 = arrayList8;
                        Boolean bool = Boolean.TRUE;
                        map.put(operation, bool);
                        map.put(operation2, bool);
                        arrayList5 = arrayList10;
                        obj2 = objU;
                    }
                }
                view7 = view4;
                z11 = z10;
                arrayList7 = arrayList5;
                arrayList8 = arrayList6;
                aVar2 = aVar;
                rect3 = rect2;
                view6 = view3;
            }
            SpecialEffectsController.Operation operation4 = operation;
            SpecialEffectsController.Operation operation5 = operation2;
            View view9 = view6;
            ArrayList arrayList11 = arrayList7;
            r.a aVar5 = aVar2;
            View view10 = view7;
            Rect rect4 = rect3;
            ArrayList arrayList12 = arrayList8;
            ArrayList arrayList13 = new ArrayList();
            Iterator it4 = list.iterator();
            Object obj3 = null;
            Object obj4 = null;
            while (it4.hasNext()) {
                m mVar4 = (m) it4.next();
                if (mVar4.d()) {
                    map.put(mVar4.b(), Boolean.FALSE);
                    mVar4.a();
                } else {
                    Object objF = c0Var.f(mVar4.h());
                    SpecialEffectsController.Operation operationB = mVar4.b();
                    boolean z13 = obj2 != null && (operationB == operation4 || operationB == operation5);
                    if (objF == null) {
                        if (!z13) {
                            map.put(operationB, Boolean.FALSE);
                            mVar4.a();
                        }
                        view = view9;
                        arrayList4 = arrayList11;
                        arrayList2 = arrayList12;
                        rect = rect4;
                        view2 = view10;
                        str3 = str;
                        arrayList3 = arrayList13;
                    } else {
                        Rect rect5 = rect4;
                        ArrayList arrayList14 = new ArrayList();
                        ArrayList arrayList15 = arrayList13;
                        t(arrayList14, operationB.f().mView);
                        if (z13) {
                            if (operationB == operation4) {
                                arrayList14.removeAll(arrayList11);
                            } else {
                                arrayList14.removeAll(arrayList12);
                            }
                        }
                        if (arrayList14.isEmpty()) {
                            c0Var.a(objF, view9);
                            view = view9;
                            arrayList2 = arrayList12;
                            objK2 = obj3;
                            objK = obj4;
                            operation3 = operationB;
                            view2 = view10;
                            str3 = str;
                            arrayList3 = arrayList15;
                            arrayList4 = arrayList11;
                            obj = objF;
                            rect = rect5;
                        } else {
                            c0Var.b(objF, arrayList14);
                            arrayList2 = arrayList12;
                            view = view9;
                            view2 = view10;
                            objK = obj4;
                            objK2 = obj3;
                            str3 = str;
                            arrayList3 = arrayList15;
                            arrayList4 = arrayList11;
                            obj = objF;
                            rect = rect5;
                            c0Var.n(obj, objF, arrayList14, null, null, null, null);
                            if (operationB.e() == SpecialEffectsController.Operation.State.GONE) {
                                operation3 = operationB;
                                list2.remove(operation3);
                                ArrayList arrayList16 = new ArrayList(arrayList14);
                                arrayList16.remove(operation3.f().mView);
                                c0Var.m(obj, operation3.f().mView, arrayList16);
                                j0.a(m(), new i(arrayList14));
                            } else {
                                operation3 = operationB;
                            }
                        }
                        if (operation3.e() == SpecialEffectsController.Operation.State.VISIBLE) {
                            arrayList3.addAll(arrayList14);
                            if (z12) {
                                c0Var.o(obj, rect);
                            }
                        } else {
                            c0Var.p(obj, view2);
                        }
                        map.put(operation3, Boolean.TRUE);
                        if (mVar4.j()) {
                            objK2 = c0Var.k(objK2, obj, null);
                        } else {
                            objK = c0Var.k(objK, obj, null);
                        }
                        obj3 = objK2;
                        obj4 = objK;
                    }
                    arrayList11 = arrayList4;
                    operation4 = operation;
                    operation5 = operation2;
                    rect4 = rect;
                    arrayList13 = arrayList3;
                    str = str3;
                    arrayList12 = arrayList2;
                    view10 = view2;
                    view9 = view;
                }
            }
            String str6 = str;
            ArrayList arrayList17 = arrayList11;
            ArrayList arrayList18 = arrayList12;
            ArrayList arrayList19 = arrayList13;
            Object objJ = c0Var.j(obj3, obj4, obj2);
            if (objJ != null) {
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    m mVar5 = (m) it5.next();
                    if (!mVar5.d()) {
                        Object objH = mVar5.h();
                        SpecialEffectsController.Operation operationB2 = mVar5.b();
                        boolean z14 = obj2 != null && (operationB2 == operation || operationB2 == operation2);
                        if (objH == null && !z14) {
                            str2 = str6;
                        } else if (ViewCompat.Q(m())) {
                            str2 = str6;
                            c0Var.q(mVar5.b().f(), objJ, mVar5.c(), new j(mVar5, operationB2));
                        } else {
                            if (FragmentManager.I0(2)) {
                                str2 = str6;
                                Log.v(str2, "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + operationB2);
                            } else {
                                str2 = str6;
                            }
                            mVar5.a();
                        }
                        str6 = str2;
                    }
                }
                String str7 = str6;
                if (ViewCompat.Q(m())) {
                    a0.d(arrayList19, 4);
                    ArrayList arrayListL = c0Var.l(arrayList18);
                    if (FragmentManager.I0(2)) {
                        Log.v(str7, ">>>>> Beginning transition <<<<<");
                        Log.v(str7, ">>>>> SharedElementFirstOutViews <<<<<");
                        int size4 = arrayList17.size();
                        int i15 = 0;
                        while (i15 < size4) {
                            Object obj5 = arrayList17.get(i15);
                            i15++;
                            View view11 = (View) obj5;
                            Log.v(str7, "View: " + view11 + " Name: " + ViewCompat.H(view11));
                        }
                        arrayList = arrayList17;
                        Log.v(str7, ">>>>> SharedElementLastInViews <<<<<");
                        int size5 = arrayList18.size();
                        int i16 = 0;
                        while (i16 < size5) {
                            Object obj6 = arrayList18.get(i16);
                            i16++;
                            View view12 = (View) obj6;
                            Log.v(str7, "View: " + view12 + " Name: " + ViewCompat.H(view12));
                        }
                    } else {
                        arrayList = arrayList17;
                    }
                    c0Var.c(m(), objJ);
                    ArrayList arrayList20 = arrayList;
                    c0Var.r(m(), arrayList20, arrayList18, arrayListL, aVar5);
                    a0.d(arrayList19, 0);
                    c0Var.t(obj2, arrayList20, arrayList18);
                    return map;
                }
            }
        }
        return map;
    }

    public final void y(List list) {
        Fragment fragmentF = ((SpecialEffectsController.Operation) list.get(list.size() - 1)).f();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) it.next();
            operation.f().mAnimationInfo.f3110c = fragmentF.mAnimationInfo.f3110c;
            operation.f().mAnimationInfo.f3111d = fragmentF.mAnimationInfo.f3111d;
            operation.f().mAnimationInfo.f3112e = fragmentF.mAnimationInfo.f3112e;
            operation.f().mAnimationInfo.f3113f = fragmentF.mAnimationInfo.f3113f;
        }
    }
}
