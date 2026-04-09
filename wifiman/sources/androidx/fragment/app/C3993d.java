package androidx.fragment.app;

import A1.e;
import F1.AbstractC2737a0;
import F1.W;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.AbstractC4000k;
import androidx.fragment.app.K;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C7010a;

/* renamed from: androidx.fragment.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3993d extends K {

    /* renamed from: androidx.fragment.app.d$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31376a;

        static {
            int[] iArr = new int[K.e.c.values().length];
            f31376a = iArr;
            try {
                iArr[K.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31376a[K.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31376a[K.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31376a[K.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f31377a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K.e f31378b;

        b(List list, K.e eVar) {
            this.f31377a = list;
            this.f31378b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f31377a.contains(this.f31378b)) {
                this.f31377a.remove(this.f31378b);
                C3993d.this.s(this.f31378b);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$c */
    class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f31380a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f31381b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f31382c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ K.e f31383d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k f31384e;

        c(ViewGroup viewGroup, View view, boolean z10, K.e eVar, k kVar) {
            this.f31380a = viewGroup;
            this.f31381b = view;
            this.f31382c = z10;
            this.f31383d = eVar;
            this.f31384e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f31380a.endViewTransition(this.f31381b);
            if (this.f31382c) {
                this.f31383d.e().applyState(this.f31381b);
            }
            this.f31384e.a();
            if (w.E0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f31383d + " has ended.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d, reason: collision with other inner class name */
    class C1103d implements e.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Animator f31386a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K.e f31387b;

        C1103d(Animator animator, K.e eVar) {
            this.f31386a = animator;
            this.f31387b = eVar;
        }

        @Override // A1.e.a
        public void onCancel() {
            this.f31386a.end();
            if (w.E0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f31387b + " has been canceled.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$e */
    class e implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ K.e f31389a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f31390b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f31391c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k f31392d;

        /* renamed from: androidx.fragment.app.d$e$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f31390b.endViewTransition(eVar.f31391c);
                e.this.f31392d.a();
            }
        }

        e(K.e eVar, ViewGroup viewGroup, View view, k kVar) {
            this.f31389a = eVar;
            this.f31390b = viewGroup;
            this.f31391c = view;
            this.f31392d = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f31390b.post(new a());
            if (w.E0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f31389a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (w.E0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f31389a + " has reached onAnimationStart.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$f */
    class f implements e.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f31395a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f31396b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f31397c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ K.e f31398d;

        f(View view, ViewGroup viewGroup, k kVar, K.e eVar) {
            this.f31395a = view;
            this.f31396b = viewGroup;
            this.f31397c = kVar;
            this.f31398d = eVar;
        }

        @Override // A1.e.a
        public void onCancel() {
            this.f31395a.clearAnimation();
            this.f31396b.endViewTransition(this.f31395a);
            this.f31397c.a();
            if (w.E0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f31398d + " has been cancelled.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$g */
    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ K.e f31400a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K.e f31401b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f31402c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C7010a f31403d;

        g(K.e eVar, K.e eVar2, boolean z10, C7010a c7010a) {
            this.f31400a = eVar;
            this.f31401b = eVar2;
            this.f31402c = z10;
            this.f31403d = c7010a;
        }

        @Override // java.lang.Runnable
        public void run() {
            F.a(this.f31400a.f(), this.f31401b.f(), this.f31402c, this.f31403d, false);
        }
    }

    /* renamed from: androidx.fragment.app.d$h */
    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ H f31405a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f31406b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f31407c;

        h(H h10, View view, Rect rect) {
            this.f31405a = h10;
            this.f31406b = view;
            this.f31407c = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31405a.h(this.f31406b, this.f31407c);
        }
    }

    /* renamed from: androidx.fragment.app.d$i */
    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f31409a;

        i(ArrayList arrayList) {
            this.f31409a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            F.d(this.f31409a, 4);
        }
    }

    /* renamed from: androidx.fragment.app.d$j */
    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f31411a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K.e f31412b;

        j(m mVar, K.e eVar) {
            this.f31411a = mVar;
            this.f31412b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31411a.a();
            if (w.E0(2)) {
                Log.v("FragmentManager", "Transition for operation " + this.f31412b + "has completed");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$k */
    private static class k extends l {

        /* renamed from: c, reason: collision with root package name */
        private boolean f31414c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f31415d;

        /* renamed from: e, reason: collision with root package name */
        private AbstractC4000k.a f31416e;

        k(K.e eVar, A1.e eVar2, boolean z10) {
            super(eVar, eVar2);
            this.f31415d = false;
            this.f31414c = z10;
        }

        AbstractC4000k.a e(Context context) throws Resources.NotFoundException {
            if (this.f31415d) {
                return this.f31416e;
            }
            AbstractC4000k.a aVarB = AbstractC4000k.b(context, b().f(), b().e() == K.e.c.VISIBLE, this.f31414c);
            this.f31416e = aVarB;
            this.f31415d = true;
            return aVarB;
        }
    }

    /* renamed from: androidx.fragment.app.d$l */
    private static class l {

        /* renamed from: a, reason: collision with root package name */
        private final K.e f31417a;

        /* renamed from: b, reason: collision with root package name */
        private final A1.e f31418b;

        l(K.e eVar, A1.e eVar2) {
            this.f31417a = eVar;
            this.f31418b = eVar2;
        }

        void a() {
            this.f31417a.d(this.f31418b);
        }

        K.e b() {
            return this.f31417a;
        }

        A1.e c() {
            return this.f31418b;
        }

        boolean d() {
            K.e.c cVar;
            K.e.c cVarFrom = K.e.c.from(this.f31417a.f().f31230I);
            K.e.c cVarE = this.f31417a.e();
            return cVarFrom == cVarE || !(cVarFrom == (cVar = K.e.c.VISIBLE) || cVarE == cVar);
        }
    }

    /* renamed from: androidx.fragment.app.d$m */
    private static class m extends l {

        /* renamed from: c, reason: collision with root package name */
        private final Object f31419c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f31420d;

        /* renamed from: e, reason: collision with root package name */
        private final Object f31421e;

        m(K.e eVar, A1.e eVar2, boolean z10, boolean z11) {
            super(eVar, eVar2);
            if (eVar.e() == K.e.c.VISIBLE) {
                this.f31419c = z10 ? eVar.f().L() : eVar.f().v();
                this.f31420d = z10 ? eVar.f().n() : eVar.f().m();
            } else {
                this.f31419c = z10 ? eVar.f().N() : eVar.f().y();
                this.f31420d = true;
            }
            if (!z11) {
                this.f31421e = null;
            } else if (z10) {
                this.f31421e = eVar.f().Q();
            } else {
                this.f31421e = eVar.f().P();
            }
        }

        private H f(Object obj) {
            if (obj == null) {
                return null;
            }
            H h10 = F.f31219a;
            if (h10 != null && h10.e(obj)) {
                return h10;
            }
            H h11 = F.f31220b;
            if (h11 != null && h11.e(obj)) {
                return h11;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        H e() {
            H hF = f(this.f31419c);
            H hF2 = f(this.f31421e);
            if (hF == null || hF2 == null || hF == hF2) {
                return hF != null ? hF : hF2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f31419c + " which uses a different Transition  type than its shared element transition " + this.f31421e);
        }

        public Object g() {
            return this.f31421e;
        }

        Object h() {
            return this.f31419c;
        }

        public boolean i() {
            return this.f31421e != null;
        }

        boolean j() {
            return this.f31420d;
        }
    }

    C3993d(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List list, List list2, boolean z10, Map map) throws Resources.NotFoundException {
        int i10;
        boolean z11;
        Context context;
        View view;
        int i11;
        K.e eVar;
        ViewGroup viewGroupM = m();
        Context context2 = viewGroupM.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z12 = false;
        while (true) {
            i10 = 2;
            if (!it.hasNext()) {
                break;
            }
            k kVar = (k) it.next();
            if (kVar.d()) {
                kVar.a();
            } else {
                AbstractC4000k.a aVarE = kVar.e(context2);
                if (aVarE == null) {
                    kVar.a();
                } else {
                    Animator animator = aVarE.f31455b;
                    if (animator == null) {
                        arrayList.add(kVar);
                    } else {
                        K.e eVarB = kVar.b();
                        Fragment fragmentF = eVarB.f();
                        if (Boolean.TRUE.equals(map.get(eVarB))) {
                            if (w.E0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + fragmentF + " as this Fragment was involved in a Transition.");
                            }
                            kVar.a();
                        } else {
                            boolean z13 = eVarB.e() == K.e.c.GONE;
                            if (z13) {
                                list2.remove(eVarB);
                            }
                            View view2 = fragmentF.f31230I;
                            viewGroupM.startViewTransition(view2);
                            animator.addListener(new c(viewGroupM, view2, z13, eVarB, kVar));
                            animator.setTarget(view2);
                            animator.start();
                            if (w.E0(2)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Animator from operation ");
                                eVar = eVarB;
                                sb2.append(eVar);
                                sb2.append(" has started.");
                                Log.v("FragmentManager", sb2.toString());
                            } else {
                                eVar = eVarB;
                            }
                            kVar.c().b(new C1103d(animator, eVar));
                            z12 = true;
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k kVar2 = (k) it2.next();
            K.e eVarB2 = kVar2.b();
            Fragment fragmentF2 = eVarB2.f();
            if (z10) {
                if (w.E0(i10)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragmentF2 + " as Animations cannot run alongside Transitions.");
                }
                kVar2.a();
            } else if (z12) {
                if (w.E0(i10)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragmentF2 + " as Animations cannot run alongside Animators.");
                }
                kVar2.a();
            } else {
                View view3 = fragmentF2.f31230I;
                Animation animation = (Animation) E1.h.g(((AbstractC4000k.a) E1.h.g(kVar2.e(context2))).f31454a);
                if (eVarB2.e() != K.e.c.REMOVED) {
                    view3.startAnimation(animation);
                    kVar2.a();
                    z11 = z12;
                    context = context2;
                    i11 = i10;
                    view = view3;
                } else {
                    viewGroupM.startViewTransition(view3);
                    AbstractC4000k.b bVar = new AbstractC4000k.b(animation, viewGroupM, view3);
                    z11 = z12;
                    context = context2;
                    view = view3;
                    bVar.setAnimationListener(new e(eVarB2, viewGroupM, view3, kVar2));
                    view.startAnimation(bVar);
                    i11 = 2;
                    if (w.E0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + eVarB2 + " has started.");
                    }
                }
                kVar2.c().b(new f(view, viewGroupM, kVar2, eVarB2));
                i10 = i11;
                z12 = z11;
                context2 = context;
            }
        }
    }

    private Map x(List list, List list2, boolean z10, K.e eVar, K.e eVar2) {
        String str;
        String str2;
        String str3;
        View view;
        Object obj;
        ArrayList arrayList;
        Object obj2;
        ArrayList arrayList2;
        HashMap map;
        View view2;
        Object objK;
        C7010a c7010a;
        ArrayList arrayList3;
        K.e eVar3;
        ArrayList arrayList4;
        Rect rect;
        H h10;
        HashMap map2;
        K.e eVar4;
        View view3;
        View view4;
        View view5;
        boolean z11 = z10;
        K.e eVar5 = eVar;
        K.e eVar6 = eVar2;
        HashMap map3 = new HashMap();
        Iterator it = list.iterator();
        H h11 = null;
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (!mVar.d()) {
                H hE = mVar.e();
                if (h11 == null) {
                    h11 = hE;
                } else if (hE != null && h11 != hE) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (h11 == null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                m mVar2 = (m) it2.next();
                map3.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return map3;
        }
        View view6 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        C7010a c7010a2 = new C7010a();
        Iterator it3 = list.iterator();
        Object obj3 = null;
        View view7 = null;
        boolean z12 = false;
        while (true) {
            str = "FragmentManager";
            if (!it3.hasNext()) {
                break;
            }
            m mVar3 = (m) it3.next();
            if (!mVar3.i() || eVar5 == null || eVar6 == null) {
                c7010a = c7010a2;
                arrayList3 = arrayList6;
                eVar3 = eVar5;
                arrayList4 = arrayList5;
                rect = rect2;
                h10 = h11;
                map2 = map3;
                View view8 = view6;
                eVar4 = eVar6;
                view3 = view8;
                view7 = view7;
            } else {
                Object objU = h11.u(h11.f(mVar3.g()));
                ArrayList arrayListR = eVar2.f().R();
                ArrayList arrayListR2 = eVar.f().R();
                ArrayList arrayListS = eVar.f().S();
                View view9 = view7;
                int i10 = 0;
                while (i10 < arrayListS.size()) {
                    int iIndexOf = arrayListR.indexOf(arrayListS.get(i10));
                    ArrayList arrayList7 = arrayListS;
                    if (iIndexOf != -1) {
                        arrayListR.set(iIndexOf, (String) arrayListR2.get(i10));
                    }
                    i10++;
                    arrayListS = arrayList7;
                }
                ArrayList arrayListS2 = eVar2.f().S();
                if (z11) {
                    eVar.f().w();
                    eVar2.f().z();
                } else {
                    eVar.f().z();
                    eVar2.f().w();
                }
                int i11 = 0;
                for (int size = arrayListR.size(); i11 < size; size = size) {
                    c7010a2.put((String) arrayListR.get(i11), (String) arrayListS2.get(i11));
                    i11++;
                }
                if (w.E0(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    for (Iterator it4 = arrayListS2.iterator(); it4.hasNext(); it4 = it4) {
                        Log.v("FragmentManager", "Name: " + ((String) it4.next()));
                    }
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    for (Iterator it5 = arrayListR.iterator(); it5.hasNext(); it5 = it5) {
                        Log.v("FragmentManager", "Name: " + ((String) it5.next()));
                    }
                }
                C7010a c7010a3 = new C7010a();
                u(c7010a3, eVar.f().f31230I);
                c7010a3.r(arrayListR);
                c7010a2.r(c7010a3.keySet());
                C7010a c7010a4 = new C7010a();
                u(c7010a4, eVar2.f().f31230I);
                c7010a4.r(arrayListS2);
                c7010a4.r(c7010a2.values());
                F.c(c7010a2, c7010a4);
                v(c7010a3, c7010a2.keySet());
                v(c7010a4, c7010a2.values());
                if (c7010a2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    c7010a = c7010a2;
                    arrayList3 = arrayList6;
                    eVar3 = eVar5;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view6;
                    h10 = h11;
                    view7 = view9;
                    obj3 = null;
                    eVar4 = eVar2;
                    map2 = map3;
                } else {
                    F.a(eVar2.f(), eVar.f(), z11, c7010a3, true);
                    HashMap map4 = map3;
                    View view10 = view6;
                    c7010a = c7010a2;
                    ArrayList arrayList8 = arrayList6;
                    F1.I.a(m(), new g(eVar2, eVar, z10, c7010a4));
                    arrayList5.addAll(c7010a3.values());
                    if (arrayListR.isEmpty()) {
                        view7 = view9;
                    } else {
                        view7 = (View) c7010a3.get((String) arrayListR.get(0));
                        h11.p(objU, view7);
                    }
                    arrayList3 = arrayList8;
                    arrayList3.addAll(c7010a4.values());
                    if (arrayListS2.isEmpty() || (view5 = (View) c7010a4.get((String) arrayListS2.get(0))) == null) {
                        view4 = view10;
                    } else {
                        F1.I.a(m(), new h(h11, view5, rect2));
                        view4 = view10;
                        z12 = true;
                    }
                    h11.s(objU, view4, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    h10 = h11;
                    h11.n(objU, null, null, null, null, objU, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar3 = eVar;
                    map2 = map4;
                    map2.put(eVar3, bool);
                    eVar4 = eVar2;
                    map2.put(eVar4, bool);
                    obj3 = objU;
                }
            }
            eVar5 = eVar3;
            arrayList5 = arrayList4;
            rect2 = rect;
            map3 = map2;
            c7010a2 = c7010a;
            z11 = z10;
            arrayList6 = arrayList3;
            h11 = h10;
            K.e eVar7 = eVar4;
            view6 = view3;
            eVar6 = eVar7;
        }
        View view11 = view7;
        C7010a c7010a5 = c7010a2;
        ArrayList arrayList9 = arrayList6;
        K.e eVar8 = eVar5;
        ArrayList arrayList10 = arrayList5;
        Rect rect3 = rect2;
        H h12 = h11;
        HashMap map5 = map3;
        View view12 = view6;
        K.e eVar9 = eVar6;
        View view13 = view12;
        ArrayList arrayList11 = new ArrayList();
        Iterator it6 = list.iterator();
        Object obj4 = null;
        Object objK2 = null;
        while (it6.hasNext()) {
            m mVar4 = (m) it6.next();
            if (mVar4.d()) {
                map5.put(mVar4.b(), Boolean.FALSE);
                mVar4.a();
            } else {
                Object objF = h12.f(mVar4.h());
                K.e eVarB = mVar4.b();
                boolean z13 = obj3 != null && (eVarB == eVar8 || eVarB == eVar9);
                if (objF == null) {
                    if (!z13) {
                        map5.put(eVarB, Boolean.FALSE);
                        mVar4.a();
                    }
                    arrayList2 = arrayList9;
                    str3 = str;
                    arrayList = arrayList10;
                    view = view13;
                    objK = obj4;
                    map = map5;
                    view2 = view11;
                } else {
                    str3 = str;
                    ArrayList arrayList12 = new ArrayList();
                    Object obj5 = obj4;
                    t(arrayList12, eVarB.f().f31230I);
                    if (z13) {
                        if (eVarB == eVar8) {
                            arrayList12.removeAll(arrayList10);
                        } else {
                            arrayList12.removeAll(arrayList9);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        h12.a(objF, view13);
                        arrayList2 = arrayList9;
                        arrayList = arrayList10;
                        view = view13;
                        obj2 = objK2;
                        map = map5;
                        obj = obj5;
                    } else {
                        h12.b(objF, arrayList12);
                        view = view13;
                        obj = obj5;
                        arrayList = arrayList10;
                        obj2 = objK2;
                        arrayList2 = arrayList9;
                        map = map5;
                        h12.n(objF, objF, arrayList12, null, null, null, null);
                        if (eVarB.e() == K.e.c.GONE) {
                            list2.remove(eVarB);
                            ArrayList arrayList13 = new ArrayList(arrayList12);
                            arrayList13.remove(eVarB.f().f31230I);
                            h12.m(objF, eVarB.f().f31230I, arrayList13);
                            F1.I.a(m(), new i(arrayList12));
                        }
                    }
                    if (eVarB.e() == K.e.c.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z12) {
                            h12.o(objF, rect3);
                        }
                        view2 = view11;
                    } else {
                        view2 = view11;
                        h12.p(objF, view2);
                    }
                    map.put(eVarB, Boolean.TRUE);
                    if (mVar4.j()) {
                        objK2 = h12.k(obj2, objF, null);
                        objK = obj;
                    } else {
                        objK = h12.k(obj, objF, null);
                        objK2 = obj2;
                    }
                }
                eVar9 = eVar2;
                map5 = map;
                obj4 = objK;
                view11 = view2;
                str = str3;
                view13 = view;
                arrayList10 = arrayList;
                arrayList9 = arrayList2;
            }
        }
        ArrayList arrayList14 = arrayList9;
        String str4 = str;
        ArrayList arrayList15 = arrayList10;
        HashMap map6 = map5;
        Object objJ = h12.j(objK2, obj4, obj3);
        if (objJ == null) {
            return map6;
        }
        Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            m mVar5 = (m) it7.next();
            if (!mVar5.d()) {
                Object objH = mVar5.h();
                K.e eVarB2 = mVar5.b();
                HashMap map7 = map6;
                boolean z14 = obj3 != null && (eVarB2 == eVar8 || eVarB2 == eVar2);
                if (objH == null && !z14) {
                    str2 = str4;
                } else if (W.Q(m())) {
                    str2 = str4;
                    h12.q(mVar5.b().f(), objJ, mVar5.c(), new j(mVar5, eVarB2));
                } else {
                    if (w.E0(2)) {
                        str2 = str4;
                        Log.v(str2, "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + eVarB2);
                    } else {
                        str2 = str4;
                    }
                    mVar5.a();
                }
                map6 = map7;
                str4 = str2;
            }
        }
        HashMap map8 = map6;
        String str5 = str4;
        if (!W.Q(m())) {
            return map8;
        }
        F.d(arrayList11, 4);
        ArrayList arrayListL = h12.l(arrayList14);
        if (w.E0(2)) {
            Log.v(str5, ">>>>> Beginning transition <<<<<");
            Log.v(str5, ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator it8 = arrayList15.iterator();
            while (it8.hasNext()) {
                View view14 = (View) it8.next();
                Log.v(str5, "View: " + view14 + " Name: " + W.H(view14));
            }
            Log.v(str5, ">>>>> SharedElementLastInViews <<<<<");
            Iterator it9 = arrayList14.iterator();
            while (it9.hasNext()) {
                View view15 = (View) it9.next();
                Log.v(str5, "View: " + view15 + " Name: " + W.H(view15));
            }
        }
        h12.c(m(), objJ);
        h12.r(m(), arrayList15, arrayList14, arrayListL, c7010a5);
        F.d(arrayList11, 0);
        h12.t(obj3, arrayList15, arrayList14);
        return map8;
    }

    private void y(List list) {
        Fragment fragmentF = ((K.e) list.get(list.size() - 1)).f();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            K.e eVar = (K.e) it.next();
            eVar.f().f31233X.f31284c = fragmentF.f31233X.f31284c;
            eVar.f().f31233X.f31285d = fragmentF.f31233X.f31285d;
            eVar.f().f31233X.f31286e = fragmentF.f31233X.f31286e;
            eVar.f().f31233X.f31287f = fragmentF.f31233X.f31287f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    @Override // androidx.fragment.app.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void f(java.util.List r14, boolean r15) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C3993d.f(java.util.List, boolean):void");
    }

    void s(K.e eVar) {
        eVar.e().applyState(eVar.f().f31230I);
    }

    void t(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (AbstractC2737a0.a(viewGroup)) {
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

    void u(Map map, View view) {
        String strH = W.H(view);
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

    void v(C7010a c7010a, Collection collection) {
        Iterator it = c7010a.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(W.H((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }
}
