package k0;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import d5.AbstractC2282j;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.WeakHashMap;

/* renamed from: k0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2605i {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f21636a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21637b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f21638c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21639d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21640e;

    public C2605i(ViewGroup viewGroup) {
        q5.i.e(viewGroup, "container");
        this.f21636a = viewGroup;
        this.f21637b = new ArrayList();
        this.f21638c = new ArrayList();
    }

    public static final C2605i f(ViewGroup viewGroup, K k6) {
        q5.i.e(viewGroup, "container");
        q5.i.e(k6, "fragmentManager");
        q5.i.d(k6.F(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C2605i) {
            return (C2605i) tag;
        }
        C2605i c2605i = new C2605i(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c2605i);
        return c2605i;
    }

    public final void a(int i, int i3, P p6) {
        synchronized (this.f21637b) {
            N.d dVar = new N.d();
            AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = p6.f21558c;
            q5.i.d(abstractComponentCallbacksC2617v, "fragmentStateManager.fragment");
            U uD = d(abstractComponentCallbacksC2617v);
            if (uD != null) {
                uD.c(i, i3);
                return;
            }
            final U u6 = new U(i, i3, p6, dVar);
            this.f21637b.add(u6);
            final int i6 = 0;
            u6.f21580d.add(new Runnable(this) { // from class: k0.T

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C2605i f21575b;

                {
                    this.f21575b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i6) {
                        case 0:
                            ArrayList arrayList = this.f21575b.f21637b;
                            U u7 = u6;
                            if (arrayList.contains(u7)) {
                                int i7 = u7.f21577a;
                                View view = u7.f21579c.f21696T;
                                q5.i.d(view, "operation.fragment.mView");
                                AbstractC1135f5.c(i7, view);
                                break;
                            }
                            break;
                        default:
                            C2605i c2605i = this.f21575b;
                            ArrayList arrayList2 = c2605i.f21637b;
                            U u8 = u6;
                            arrayList2.remove(u8);
                            c2605i.f21638c.remove(u8);
                            break;
                    }
                }
            });
            final int i7 = 1;
            u6.f21580d.add(new Runnable(this) { // from class: k0.T

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C2605i f21575b;

                {
                    this.f21575b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i7) {
                        case 0:
                            ArrayList arrayList = this.f21575b.f21637b;
                            U u7 = u6;
                            if (arrayList.contains(u7)) {
                                int i72 = u7.f21577a;
                                View view = u7.f21579c.f21696T;
                                q5.i.d(view, "operation.fragment.mView");
                                AbstractC1135f5.c(i72, view);
                                break;
                            }
                            break;
                        default:
                            C2605i c2605i = this.f21575b;
                            ArrayList arrayList2 = c2605i.f21637b;
                            U u8 = u6;
                            arrayList2.remove(u8);
                            c2605i.f21638c.remove(u8);
                            break;
                    }
                }
            });
        }
    }

    public final void b(ArrayList arrayList, boolean z6) {
        Object obj;
        Object obj2;
        String str;
        ArrayList arrayList2;
        int i;
        boolean z7;
        ArrayList arrayList3 = arrayList;
        int size = arrayList3.size();
        int i3 = 0;
        while (true) {
            obj = null;
            if (i3 >= size) {
                obj2 = null;
                break;
            }
            obj2 = arrayList3.get(i3);
            i3++;
            U u6 = (U) obj2;
            View view = u6.f21579c.f21696T;
            q5.i.d(view, "operation.fragment.mView");
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility != 0) {
                    if (visibility != 4 && visibility != 8) {
                        throw new IllegalArgumentException(AbstractC1135f5.l(visibility, "Unknown visibility "));
                    }
                } else if (u6.f21577a != 2) {
                    break;
                }
            }
        }
        U u7 = (U) obj2;
        ListIterator listIterator = arrayList3.listIterator(arrayList3.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object objPrevious = listIterator.previous();
            U u8 = (U) objPrevious;
            View view2 = u8.f21579c.f21696T;
            q5.i.d(view2, "operation.fragment.mView");
            if (view2.getAlpha() != 0.0f || view2.getVisibility() != 0) {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    continue;
                } else if (visibility2 != 4 && visibility2 != 8) {
                    throw new IllegalArgumentException(AbstractC1135f5.l(visibility2, "Unknown visibility "));
                }
            }
            if (u8.f21577a == 2) {
                obj = objPrevious;
                break;
            }
        }
        U u9 = (U) obj;
        if (K.H(2)) {
            Log.v("FragmentManager", "Executing operations from " + u7 + " to " + u9);
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayListK0 = AbstractC2282j.k0(arrayList3);
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = ((U) AbstractC2282j.Y(arrayList3)).f21579c;
        int size2 = arrayList3.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj3 = arrayList3.get(i6);
            i6++;
            C2614s c2614s = ((U) obj3).f21579c.f21699W;
            C2614s c2614s2 = abstractComponentCallbacksC2617v.f21699W;
            c2614s.f21669b = c2614s2.f21669b;
            c2614s.f21670c = c2614s2.f21670c;
            c2614s.f21671d = c2614s2.f21671d;
            c2614s.f21672e = c2614s2.f21672e;
        }
        int size3 = arrayList3.size();
        int i7 = 0;
        while (i7 < size3) {
            Object obj4 = arrayList3.get(i7);
            i7++;
            U u10 = (U) obj4;
            N.d dVar = new N.d();
            u10.d();
            LinkedHashSet linkedHashSet = u10.f21581e;
            linkedHashSet.add(dVar);
            arrayList4.add(new C2601e(u10, dVar, z6));
            N.d dVar2 = new N.d();
            u10.d();
            linkedHashSet.add(dVar2);
            boolean z8 = !z6 ? u10 != u9 : u10 != u7;
            AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v2 = u10.f21579c;
            C2602f c2602f = new C2602f(u10, dVar2);
            if (u10.f21577a == 2) {
                if (z6) {
                    C2614s c2614s3 = abstractComponentCallbacksC2617v2.f21699W;
                } else {
                    abstractComponentCallbacksC2617v2.getClass();
                }
            } else if (z6) {
                C2614s c2614s4 = abstractComponentCallbacksC2617v2.f21699W;
            } else {
                abstractComponentCallbacksC2617v2.getClass();
            }
            if (u10.f21577a == 2) {
                if (z6) {
                    C2614s c2614s5 = abstractComponentCallbacksC2617v2.f21699W;
                } else {
                    C2614s c2614s6 = abstractComponentCallbacksC2617v2.f21699W;
                }
            }
            if (z8) {
                if (z6) {
                    C2614s c2614s7 = abstractComponentCallbacksC2617v2.f21699W;
                } else {
                    abstractComponentCallbacksC2617v2.getClass();
                }
            }
            arrayList5.add(c2602f);
            u10.f21580d.add(new C0.A(arrayListK0, u10, this));
            arrayList3 = arrayList;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList6 = new ArrayList();
        int size4 = arrayList5.size();
        int i8 = 0;
        while (i8 < size4) {
            Object obj5 = arrayList5.get(i8);
            i8++;
            if (!((C2602f) obj5).r()) {
                arrayList6.add(obj5);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        int size5 = arrayList6.size();
        int i9 = 0;
        while (i9 < size5) {
            Object obj6 = arrayList6.get(i9);
            i9++;
            ((C2602f) obj6).getClass();
        }
        int size6 = arrayList7.size();
        int i10 = 0;
        while (i10 < size6) {
            Object obj7 = arrayList7.get(i10);
            i10++;
            ((C2602f) obj7).getClass();
        }
        int size7 = arrayList5.size();
        int i11 = 0;
        while (i11 < size7) {
            Object obj8 = arrayList5.get(i11);
            i11++;
            C2602f c2602f2 = (C2602f) obj8;
            linkedHashMap.put((U) c2602f2.f662a, Boolean.FALSE);
            c2602f2.f();
        }
        boolean zContainsValue = linkedHashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f21636a;
        Context context = viewGroup.getContext();
        ArrayList arrayList8 = new ArrayList();
        int size8 = arrayList4.size();
        boolean z9 = false;
        int i12 = 0;
        while (true) {
            str = "context";
            if (i12 >= size8) {
                break;
            }
            int i13 = i12 + 1;
            C2601e c2601e = (C2601e) arrayList4.get(i12);
            if (c2601e.r()) {
                c2601e.f();
            } else {
                q5.i.d(context, "context");
                V2.h hVarD = c2601e.D(context);
                if (hVarD == null) {
                    c2601e.f();
                } else {
                    Animator animator = (Animator) hVarD.f3876c;
                    if (animator == null) {
                        arrayList8.add(c2601e);
                    } else {
                        arrayList2 = arrayList8;
                        U u11 = (U) c2601e.f662a;
                        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v3 = u11.f21579c;
                        i = size8;
                        z7 = z9;
                        if (q5.i.a(linkedHashMap.get(u11), Boolean.TRUE)) {
                            if (K.H(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC2617v3 + " as this Fragment was involved in a Transition.");
                            }
                            c2601e.f();
                            arrayList8 = arrayList2;
                            size8 = i;
                            i12 = i13;
                            z9 = z7;
                        } else {
                            boolean z10 = u11.f21577a == 3;
                            if (z10) {
                                arrayListK0.remove(u11);
                            }
                            View view3 = abstractComponentCallbacksC2617v3.f21696T;
                            viewGroup.startViewTransition(view3);
                            LinkedHashMap linkedHashMap2 = linkedHashMap;
                            ArrayList arrayList9 = arrayList4;
                            animator.addListener(new C2603g(this, view3, z10, u11, c2601e));
                            animator.setTarget(view3);
                            animator.start();
                            if (K.H(2)) {
                                Log.v("FragmentManager", "Animator from operation " + u11 + " has started.");
                            }
                            ((N.d) c2601e.f663b).a(new U4.a(animator, 1, u11));
                            linkedHashMap = linkedHashMap2;
                            size8 = i;
                            i12 = i13;
                            arrayList8 = arrayList2;
                            arrayList4 = arrayList9;
                            z9 = true;
                        }
                    }
                }
            }
            arrayList2 = arrayList8;
            i = size8;
            z7 = z9;
            arrayList8 = arrayList2;
            size8 = i;
            i12 = i13;
            z9 = z7;
        }
        ArrayList arrayList10 = arrayList8;
        boolean z11 = z9;
        int size9 = arrayList10.size();
        int i14 = 0;
        while (i14 < size9) {
            ArrayList arrayList11 = arrayList10;
            Object obj9 = arrayList11.get(i14);
            int i15 = i14 + 1;
            final C2601e c2601e2 = (C2601e) obj9;
            final U u12 = (U) c2601e2.f662a;
            int i16 = size9;
            AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v4 = u12.f21579c;
            if (zContainsValue) {
                if (K.H(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC2617v4 + " as Animations cannot run alongside Transitions.");
                }
                c2601e2.f();
            } else if (z11) {
                if (K.H(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC2617v4 + " as Animations cannot run alongside Animators.");
                }
                c2601e2.f();
            } else {
                final View view4 = abstractComponentCallbacksC2617v4.f21696T;
                q5.i.d(context, str);
                V2.h hVarD2 = c2601e2.D(context);
                String str2 = str;
                if (hVarD2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Animation animation = (Animation) hVarD2.f3875b;
                if (animation == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                arrayList10 = arrayList11;
                if (u12.f21577a != 1) {
                    view4.startAnimation(animation);
                    c2601e2.f();
                } else {
                    viewGroup.startViewTransition(view4);
                    y yVar = new y(animation, viewGroup, view4);
                    yVar.setAnimationListener(new AnimationAnimationListenerC2604h(view4, c2601e2, this, u12));
                    view4.startAnimation(yVar);
                    if (K.H(2)) {
                        Log.v("FragmentManager", "Animation from operation " + u12 + " has started.");
                    }
                }
                ((N.d) c2601e2.f663b).a(new N.c() { // from class: k0.d
                    @Override // N.c
                    public final void onCancel() {
                        C2605i c2605i = this;
                        q5.i.e(c2605i, "this$0");
                        C2601e c2601e3 = c2601e2;
                        q5.i.e(c2601e3, "$animationInfo");
                        U u13 = u12;
                        q5.i.e(u13, "$operation");
                        View view5 = view4;
                        view5.clearAnimation();
                        c2605i.f21636a.endViewTransition(view5);
                        c2601e3.f();
                        if (K.H(2)) {
                            Log.v("FragmentManager", "Animation from operation " + u13 + " has been cancelled.");
                        }
                    }
                });
                size9 = i16;
                i14 = i15;
                str = str2;
            }
            size9 = i16;
            i14 = i15;
            arrayList10 = arrayList11;
        }
        int size10 = arrayListK0.size();
        int i17 = 0;
        while (i17 < size10) {
            Object obj10 = arrayListK0.get(i17);
            i17++;
            U u13 = (U) obj10;
            View view5 = u13.f21579c.f21696T;
            int i18 = u13.f21577a;
            q5.i.d(view5, "view");
            AbstractC1135f5.c(i18, view5);
        }
        arrayListK0.clear();
        if (K.H(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + u7 + " to " + u9);
        }
    }

    public final void c() {
        if (this.f21640e) {
            return;
        }
        ViewGroup viewGroup = this.f21636a;
        WeakHashMap weakHashMap = R.O.f3270a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.f21639d = false;
            return;
        }
        synchronized (this.f21637b) {
            try {
                if (!this.f21637b.isEmpty()) {
                    ArrayList arrayListK0 = AbstractC2282j.k0(this.f21638c);
                    this.f21638c.clear();
                    int size = arrayListK0.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayListK0.get(i);
                        i++;
                        U u6 = (U) obj;
                        if (K.H(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + u6);
                        }
                        u6.a();
                        if (!u6.f21583g) {
                            this.f21638c.add(u6);
                        }
                    }
                    g();
                    ArrayList arrayListK02 = AbstractC2282j.k0(this.f21637b);
                    this.f21637b.clear();
                    this.f21638c.addAll(arrayListK02);
                    if (K.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayListK02.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj2 = arrayListK02.get(i3);
                        i3++;
                        ((U) obj2).d();
                    }
                    b(arrayListK02, this.f21639d);
                    this.f21639d = false;
                    if (K.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final U d(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        Object obj;
        ArrayList arrayList = this.f21637b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            U u6 = (U) obj;
            if (q5.i.a(u6.f21579c, abstractComponentCallbacksC2617v) && !u6.f21582f) {
                break;
            }
        }
        return (U) obj;
    }

    public final void e() {
        String str;
        String str2;
        if (K.H(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f21636a;
        WeakHashMap weakHashMap = R.O.f3270a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f21637b) {
            try {
                g();
                ArrayList arrayList = this.f21637b;
                int size = arrayList.size();
                int i = 0;
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((U) obj).d();
                }
                ArrayList arrayListK0 = AbstractC2282j.k0(this.f21638c);
                int size2 = arrayListK0.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj2 = arrayListK0.get(i6);
                    i6++;
                    U u6 = (U) obj2;
                    if (K.H(2)) {
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f21636a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + u6);
                    }
                    u6.a();
                }
                ArrayList arrayListK02 = AbstractC2282j.k0(this.f21637b);
                int size3 = arrayListK02.size();
                while (i < size3) {
                    Object obj3 = arrayListK02.get(i);
                    i++;
                    U u7 = (U) obj3;
                    if (K.H(2)) {
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f21636a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + u7);
                    }
                    u7.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.f21637b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            U u6 = (U) obj;
            int i3 = 2;
            if (u6.f21578b == 2) {
                int visibility = u6.f21579c.S().getVisibility();
                if (visibility != 0) {
                    i3 = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(AbstractC1135f5.l(visibility, "Unknown visibility "));
                        }
                        i3 = 3;
                    }
                }
                u6.c(i3, 1);
            }
        }
    }
}
