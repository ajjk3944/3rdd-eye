package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentTransitionCompat21.java */
/* loaded from: classes.dex */
public final class J extends N {

    /* compiled from: FragmentTransitionCompat21.java */
    public class a extends Transition.EpicenterCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f15809a;

        public a(Rect rect) {
            this.f15809a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public final Rect onGetEpicenter(Transition transition) {
            return this.f15809a;
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    public class c extends Transition.EpicenterCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f15812a;

        public c(Rect rect) {
            this.f15812a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public final Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f15812a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return rect;
        }
    }

    public static boolean s(Transition transition) {
        return (N.h(transition.getTargetIds()) && N.h(transition.getTargetNames()) && N.h(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.N
    public final void a(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // androidx.fragment.app.N
    public final void b(ArrayList arrayList, Object obj) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                b(arrayList, transitionSet.getTransitionAt(i));
                i++;
            }
            return;
        }
        if (s(transition) || !N.h(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget((View) arrayList.get(i));
            i++;
        }
    }

    @Override // androidx.fragment.app.N
    public final void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.N
    public final boolean e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.N
    public final Object f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.N
    public final Object i(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.N
    public final Object j(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.N
    public final void k(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.N
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new K(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.N
    public final void m(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            N.g(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // androidx.fragment.app.N
    public final void n(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new c(rect));
    }

    @Override // androidx.fragment.app.N
    public final void o(Object obj, G0.e eVar, C.E e4) {
        ((Transition) obj).addListener(new L(e4));
    }

    @Override // androidx.fragment.app.N
    public final void p(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            N.d(arrayList.get(i), targets);
        }
        targets.add(view);
        arrayList.add(view);
        b(arrayList, transitionSet);
    }

    @Override // androidx.fragment.app.N
    public final void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            t(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.N
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public final void t(Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                t(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (s(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget(arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    public class b implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f15810a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f15811b;

        public b(View view, ArrayList arrayList) {
            this.f15810a = view;
            this.f15811b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f15810a.setVisibility(8);
            ArrayList arrayList = this.f15811b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((View) arrayList.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }
    }
}
