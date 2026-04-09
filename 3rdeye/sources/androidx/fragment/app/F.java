package androidx.fragment.app;

import L0.I;
import N7.B8;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.S;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.j0;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import g1.C4368b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: FragmentStateManager.java */
/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final v f15769a;

    /* renamed from: b, reason: collision with root package name */
    public final G f15770b;

    /* renamed from: c, reason: collision with root package name */
    public final ComponentCallbacksC1759l f15771c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15772d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f15773e = -1;

    /* compiled from: FragmentStateManager.java */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15775a;

        static {
            int[] iArr = new int[AbstractC1781n.b.values().length];
            f15775a = iArr;
            try {
                iArr[AbstractC1781n.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15775a[AbstractC1781n.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15775a[AbstractC1781n.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15775a[AbstractC1781n.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public F(v vVar, G g10, ComponentCallbacksC1759l componentCallbacksC1759l) {
        this.f15769a = vVar;
        this.f15770b = g10;
        this.f15771c = componentCallbacksC1759l;
    }

    public final void a() {
        boolean zG = x.G(3);
        ComponentCallbacksC1759l componentCallbacksC1759l = this.f15771c;
        if (zG) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + componentCallbacksC1759l);
        }
        Bundle bundle = componentCallbacksC1759l.mSavedFragmentState;
        componentCallbacksC1759l.performActivityCreated(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f15769a.a(false);
    }

    public final void b() {
        ComponentCallbacksC1759l componentCallbacksC1759l;
        View view;
        View view2;
        int iIndexOfChild = -1;
        ComponentCallbacksC1759l componentCallbacksC1759l2 = this.f15771c;
        View view3 = componentCallbacksC1759l2.mContainer;
        while (true) {
            componentCallbacksC1759l = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            ComponentCallbacksC1759l componentCallbacksC1759l3 = tag instanceof ComponentCallbacksC1759l ? (ComponentCallbacksC1759l) tag : null;
            if (componentCallbacksC1759l3 != null) {
                componentCallbacksC1759l = componentCallbacksC1759l3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        ComponentCallbacksC1759l parentFragment = componentCallbacksC1759l2.getParentFragment();
        if (componentCallbacksC1759l != null && !componentCallbacksC1759l.equals(parentFragment)) {
            int i = componentCallbacksC1759l2.mContainerId;
            C4368b.C0457b c0457b = C4368b.f37937a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(componentCallbacksC1759l2);
            sb.append(" within the view of parent fragment ");
            sb.append(componentCallbacksC1759l);
            sb.append(" via container with ID ");
            C4368b.b(new g1.m(componentCallbacksC1759l2, B4.i.j(sb, i, " without using parent's childFragmentManager")));
            C4368b.a(componentCallbacksC1759l2).getClass();
            C4368b.a aVar = C4368b.a.DETECT_WRONG_NESTED_HIERARCHY;
        }
        G g10 = this.f15770b;
        g10.getClass();
        ViewGroup viewGroup = componentCallbacksC1759l2.mContainer;
        if (viewGroup != null) {
            ArrayList<ComponentCallbacksC1759l> arrayList = g10.f15780a;
            int iIndexOf = arrayList.indexOf(componentCallbacksC1759l2);
            int i10 = iIndexOf - 1;
            while (true) {
                if (i10 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        ComponentCallbacksC1759l componentCallbacksC1759l4 = arrayList.get(iIndexOf);
                        if (componentCallbacksC1759l4.mContainer == viewGroup && (view = componentCallbacksC1759l4.mView) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    ComponentCallbacksC1759l componentCallbacksC1759l5 = arrayList.get(i10);
                    if (componentCallbacksC1759l5.mContainer == viewGroup && (view2 = componentCallbacksC1759l5.mView) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i10--;
                }
            }
        }
        componentCallbacksC1759l2.mContainer.addView(componentCallbacksC1759l2.mView, iIndexOfChild);
    }

    public final void c() {
        boolean zG = x.G(3);
        ComponentCallbacksC1759l componentCallbacksC1759l = this.f15771c;
        if (zG) {
            Log.d("FragmentManager", "moveto ATTACHED: " + componentCallbacksC1759l);
        }
        ComponentCallbacksC1759l componentCallbacksC1759l2 = componentCallbacksC1759l.mTarget;
        F f10 = null;
        G g10 = this.f15770b;
        if (componentCallbacksC1759l2 != null) {
            F f11 = g10.f15781b.get(componentCallbacksC1759l2.mWho);
            if (f11 == null) {
                throw new IllegalStateException("Fragment " + componentCallbacksC1759l + " declared target fragment " + componentCallbacksC1759l.mTarget + " that does not belong to this FragmentManager!");
            }
            componentCallbacksC1759l.mTargetWho = componentCallbacksC1759l.mTarget.mWho;
            componentCallbacksC1759l.mTarget = null;
            f10 = f11;
        } else {
            String str = componentCallbacksC1759l.mTargetWho;
            if (str != null && (f10 = g10.f15781b.get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(componentCallbacksC1759l);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(B4.f.c(sb, componentCallbacksC1759l.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (f10 != null) {
            f10.k();
        }
        x xVar = componentCallbacksC1759l.mFragmentManager;
        componentCallbacksC1759l.mHost = xVar.f15995u;
        componentCallbacksC1759l.mParentFragment = xVar.f15997w;
        v vVar = this.f15769a;
        vVar.g(false);
        componentCallbacksC1759l.performAttach();
        vVar.b(false);
    }

    public final int d() {
        Object next;
        ComponentCallbacksC1759l componentCallbacksC1759l = this.f15771c;
        if (componentCallbacksC1759l.mFragmentManager == null) {
            return componentCallbacksC1759l.mState;
        }
        int iMin = this.f15773e;
        int i = b.f15775a[componentCallbacksC1759l.mMaxState.ordinal()];
        if (i != 1) {
            iMin = i != 2 ? i != 3 ? i != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        if (componentCallbacksC1759l.mFromLayout) {
            if (componentCallbacksC1759l.mInLayout) {
                iMin = Math.max(this.f15773e, 2);
                View view = componentCallbacksC1759l.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f15773e < 4 ? Math.min(iMin, componentCallbacksC1759l.mState) : Math.min(iMin, 1);
            }
        }
        if (!componentCallbacksC1759l.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = componentCallbacksC1759l.mContainer;
        if (viewGroup != null) {
            S sF = S.f(viewGroup, componentCallbacksC1759l.getParentFragmentManager());
            sF.getClass();
            S.b bVarD = sF.d(componentCallbacksC1759l);
            S.b.a aVar = bVarD != null ? bVarD.f15840b : null;
            Iterator it = sF.f15835c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                S.b bVar = (S.b) next;
                if (kotlin.jvm.internal.l.b(bVar.f15841c, componentCallbacksC1759l) && !bVar.f15844f) {
                    break;
                }
            }
            S.b bVar2 = (S.b) next;
            aVar = bVar2 != null ? bVar2.f15840b : null;
            int i10 = aVar == null ? -1 : S.c.f15848a[aVar.ordinal()];
            if (i10 != -1 && i10 != 1) {
                aVar = aVar;
            }
        }
        if (aVar == S.b.a.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (aVar == S.b.a.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else if (componentCallbacksC1759l.mRemoving) {
            iMin = componentCallbacksC1759l.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (componentCallbacksC1759l.mDeferStart && componentCallbacksC1759l.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (x.G(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + componentCallbacksC1759l);
        }
        return iMin;
    }

    public final void e() {
        boolean zG = x.G(3);
        ComponentCallbacksC1759l componentCallbacksC1759l = this.f15771c;
        if (zG) {
            Log.d("FragmentManager", "moveto CREATED: " + componentCallbacksC1759l);
        }
        Bundle bundle = componentCallbacksC1759l.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (componentCallbacksC1759l.mIsCreated) {
            componentCallbacksC1759l.mState = 1;
            componentCallbacksC1759l.restoreChildFragmentState();
        } else {
            v vVar = this.f15769a;
            vVar.h(false);
            componentCallbacksC1759l.performCreate(bundle2);
            vVar.c(false);
        }
    }

    public final void f() throws Resources.NotFoundException {
        String resourceName;
        ComponentCallbacksC1759l componentCallbacksC1759l = this.f15771c;
        if (componentCallbacksC1759l.mFromLayout) {
            return;
        }
        if (x.G(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + componentCallbacksC1759l);
        }
        Bundle bundle = componentCallbacksC1759l.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = componentCallbacksC1759l.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = componentCallbacksC1759l.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = componentCallbacksC1759l.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException(B8.i("Cannot create fragment ", componentCallbacksC1759l, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) componentCallbacksC1759l.mFragmentManager.f15996v.b(i);
                if (viewGroup == null) {
                    if (!componentCallbacksC1759l.mRestored) {
                        try {
                            resourceName = componentCallbacksC1759l.getResources().getResourceName(componentCallbacksC1759l.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(componentCallbacksC1759l.mContainerId) + " (" + resourceName + ") for fragment " + componentCallbacksC1759l);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C4368b.C0457b c0457b = C4368b.f37937a;
                    C4368b.b(new g1.l(componentCallbacksC1759l, viewGroup));
                    C4368b.a(componentCallbacksC1759l).getClass();
                    C4368b.a aVar = C4368b.a.DETECT_WRONG_FRAGMENT_CONTAINER;
                }
            }
        }
        componentCallbacksC1759l.mContainer = viewGroup;
        componentCallbacksC1759l.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (componentCallbacksC1759l.mView != null) {
            if (x.G(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + componentCallbacksC1759l);
            }
            componentCallbacksC1759l.mView.setSaveFromParentEnabled(false);
            componentCallbacksC1759l.mView.setTag(R.id.fragment_container_view_tag, componentCallbacksC1759l);
            if (viewGroup != null) {
                b();
            }
            if (componentCallbacksC1759l.mHidden) {
                componentCallbacksC1759l.mView.setVisibility(8);
            }
            View view = componentCallbacksC1759l.mView;
            WeakHashMap<View, L0.S> weakHashMap = L0.I.f3792a;
            if (view.isAttachedToWindow()) {
                I.c.c(componentCallbacksC1759l.mView);
            } else {
                View view2 = componentCallbacksC1759l.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            componentCallbacksC1759l.performViewCreated();
            this.f15769a.m(false);
            int visibility = componentCallbacksC1759l.mView.getVisibility();
            componentCallbacksC1759l.setPostOnViewCreatedAlpha(componentCallbacksC1759l.mView.getAlpha());
            if (componentCallbacksC1759l.mContainer != null && visibility == 0) {
                View viewFindFocus = componentCallbacksC1759l.mView.findFocus();
                if (viewFindFocus != null) {
                    componentCallbacksC1759l.setFocusedView(viewFindFocus);
                    if (x.G(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + componentCallbacksC1759l);
                    }
                }
                componentCallbacksC1759l.mView.setAlpha(0.0f);
            }
        }
        componentCallbacksC1759l.mState = 2;
    }

    public final void g() {
        ComponentCallbacksC1759l componentCallbacksC1759lB;
        boolean zG = x.G(3);
        ComponentCallbacksC1759l componentCallbacksC1759l = this.f15771c;
        if (zG) {
            Log.d("FragmentManager", "movefrom CREATED: " + componentCallbacksC1759l);
        }
        boolean zIsChangingConfigurations = true;
        boolean z10 = componentCallbacksC1759l.mRemoving && !componentCallbacksC1759l.isInBackStack();
        G g10 = this.f15770b;
        if (z10 && !componentCallbacksC1759l.mBeingSaved) {
            g10.i(null, componentCallbacksC1759l.mWho);
        }
        if (!z10) {
            B b10 = g10.f15783d;
            if (!((b10.f15750b.containsKey(componentCallbacksC1759l.mWho) && b10.f15753e) ? b10.f15754f : true)) {
                String str = componentCallbacksC1759l.mTargetWho;
                if (str != null && (componentCallbacksC1759lB = g10.b(str)) != null && componentCallbacksC1759lB.mRetainInstance) {
                    componentCallbacksC1759l.mTarget = componentCallbacksC1759lB;
                }
                componentCallbacksC1759l.mState = 0;
                return;
            }
        }
        AbstractC1766t<?> abstractC1766t = componentCallbacksC1759l.mHost;
        if (abstractC1766t instanceof j0) {
            zIsChangingConfigurations = g10.f15783d.f15754f;
        } else {
            ActivityC1762o activityC1762o = abstractC1766t.f15952c;
            if (androidx.work.s.n(activityC1762o)) {
                zIsChangingConfigurations = true ^ activityC1762o.isChangingConfigurations();
            }
        }
        if ((z10 && !componentCallbacksC1759l.mBeingSaved) || zIsChangingConfigurations) {
            g10.f15783d.f(componentCallbacksC1759l, false);
        }
        componentCallbacksC1759l.performDestroy();
        this.f15769a.d(false);
        Iterator it = g10.d().iterator();
        while (it.hasNext()) {
            F f10 = (F) it.next();
            if (f10 != null) {
                String str2 = componentCallbacksC1759l.mWho;
                ComponentCallbacksC1759l componentCallbacksC1759l2 = f10.f15771c;
                if (str2.equals(componentCallbacksC1759l2.mTargetWho)) {
                    componentCallbacksC1759l2.mTarget = componentCallbacksC1759l;
                    componentCallbacksC1759l2.mTargetWho = null;
                }
            }
        }
        String str3 = componentCallbacksC1759l.mTargetWho;
        if (str3 != null) {
            componentCallbacksC1759l.mTarget = g10.b(str3);
        }
        g10.h(this);
    }

    public final void h() {
        View view;
        boolean zG = x.G(3);
        ComponentCallbacksC1759l componentCallbacksC1759l = this.f15771c;
        if (zG) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + componentCallbacksC1759l);
        }
        ViewGroup viewGroup = componentCallbacksC1759l.mContainer;
        if (viewGroup != null && (view = componentCallbacksC1759l.mView) != null) {
            viewGroup.removeView(view);
        }
        componentCallbacksC1759l.performDestroyView();
        this.f15769a.n(false);
        componentCallbacksC1759l.mContainer = null;
        componentCallbacksC1759l.mView = null;
        componentCallbacksC1759l.mViewLifecycleOwner = null;
        componentCallbacksC1759l.mViewLifecycleOwnerLiveData.j(null);
        componentCallbacksC1759l.mInLayout = false;
    }

    public final void i() {
        boolean zG = x.G(3);
        ComponentCallbacksC1759l componentCallbacksC1759l = this.f15771c;
        if (zG) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + componentCallbacksC1759l);
        }
        componentCallbacksC1759l.performDetach();
        this.f15769a.e(false);
        componentCallbacksC1759l.mState = -1;
        componentCallbacksC1759l.mHost = null;
        componentCallbacksC1759l.mParentFragment = null;
        componentCallbacksC1759l.mFragmentManager = null;
        if (!componentCallbacksC1759l.mRemoving || componentCallbacksC1759l.isInBackStack()) {
            B b10 = this.f15770b.f15783d;
            if (!((b10.f15750b.containsKey(componentCallbacksC1759l.mWho) && b10.f15753e) ? b10.f15754f : true)) {
                return;
            }
        }
        if (x.G(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + componentCallbacksC1759l);
        }
        componentCallbacksC1759l.initState();
    }

    public final void j() {
        ComponentCallbacksC1759l componentCallbacksC1759l = this.f15771c;
        if (componentCallbacksC1759l.mFromLayout && componentCallbacksC1759l.mInLayout && !componentCallbacksC1759l.mPerformedCreateView) {
            if (x.G(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + componentCallbacksC1759l);
            }
            Bundle bundle = componentCallbacksC1759l.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            componentCallbacksC1759l.performCreateView(componentCallbacksC1759l.performGetLayoutInflater(bundle2), null, bundle2);
            View view = componentCallbacksC1759l.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                componentCallbacksC1759l.mView.setTag(R.id.fragment_container_view_tag, componentCallbacksC1759l);
                if (componentCallbacksC1759l.mHidden) {
                    componentCallbacksC1759l.mView.setVisibility(8);
                }
                componentCallbacksC1759l.performViewCreated();
                this.f15769a.m(false);
                componentCallbacksC1759l.mState = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z10 = this.f15772d;
        ComponentCallbacksC1759l componentCallbacksC1759l = this.f15771c;
        if (z10) {
            if (x.G(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + componentCallbacksC1759l);
                return;
            }
            return;
        }
        try {
            this.f15772d = true;
            boolean z11 = false;
            while (true) {
                int iD = d();
                int i = componentCallbacksC1759l.mState;
                G g10 = this.f15770b;
                if (iD == i) {
                    if (!z11 && i == -1 && componentCallbacksC1759l.mRemoving && !componentCallbacksC1759l.isInBackStack() && !componentCallbacksC1759l.mBeingSaved) {
                        if (x.G(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + componentCallbacksC1759l);
                        }
                        g10.f15783d.f(componentCallbacksC1759l, true);
                        g10.h(this);
                        if (x.G(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + componentCallbacksC1759l);
                        }
                        componentCallbacksC1759l.initState();
                    }
                    if (componentCallbacksC1759l.mHiddenChanged) {
                        if (componentCallbacksC1759l.mView != null && (viewGroup = componentCallbacksC1759l.mContainer) != null) {
                            S sF = S.f(viewGroup, componentCallbacksC1759l.getParentFragmentManager());
                            if (componentCallbacksC1759l.mHidden) {
                                sF.getClass();
                                if (x.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + componentCallbacksC1759l);
                                }
                                sF.a(S.b.EnumC0238b.GONE, S.b.a.NONE, this);
                            } else {
                                sF.getClass();
                                if (x.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + componentCallbacksC1759l);
                                }
                                sF.a(S.b.EnumC0238b.VISIBLE, S.b.a.NONE, this);
                            }
                        }
                        x xVar = componentCallbacksC1759l.mFragmentManager;
                        if (xVar != null && componentCallbacksC1759l.mAdded && x.H(componentCallbacksC1759l)) {
                            xVar.f15966E = true;
                        }
                        componentCallbacksC1759l.mHiddenChanged = false;
                        componentCallbacksC1759l.onHiddenChanged(componentCallbacksC1759l.mHidden);
                        componentCallbacksC1759l.mChildFragmentManager.n();
                    }
                    this.f15772d = false;
                    return;
                }
                v vVar = this.f15769a;
                if (iD <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (componentCallbacksC1759l.mBeingSaved) {
                                if (g10.f15782c.get(componentCallbacksC1759l.mWho) == null) {
                                    g10.i(n(), componentCallbacksC1759l.mWho);
                                }
                            }
                            g();
                            break;
                        case 1:
                            h();
                            componentCallbacksC1759l.mState = 1;
                            break;
                        case 2:
                            componentCallbacksC1759l.mInLayout = false;
                            componentCallbacksC1759l.mState = 2;
                            break;
                        case 3:
                            if (x.G(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + componentCallbacksC1759l);
                            }
                            if (componentCallbacksC1759l.mBeingSaved) {
                                g10.i(n(), componentCallbacksC1759l.mWho);
                            } else if (componentCallbacksC1759l.mView != null && componentCallbacksC1759l.mSavedViewState == null) {
                                o();
                            }
                            if (componentCallbacksC1759l.mView != null && (viewGroup2 = componentCallbacksC1759l.mContainer) != null) {
                                S sF2 = S.f(viewGroup2, componentCallbacksC1759l.getParentFragmentManager());
                                sF2.getClass();
                                if (x.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + componentCallbacksC1759l);
                                }
                                sF2.a(S.b.EnumC0238b.REMOVED, S.b.a.REMOVING, this);
                            }
                            componentCallbacksC1759l.mState = 3;
                            break;
                        case 4:
                            if (x.G(3)) {
                                Log.d("FragmentManager", "movefrom STARTED: " + componentCallbacksC1759l);
                            }
                            componentCallbacksC1759l.performStop();
                            vVar.l(false);
                            break;
                        case 5:
                            componentCallbacksC1759l.mState = 5;
                            break;
                        case 6:
                            if (x.G(3)) {
                                Log.d("FragmentManager", "movefrom RESUMED: " + componentCallbacksC1759l);
                            }
                            componentCallbacksC1759l.performPause();
                            vVar.f(false);
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (componentCallbacksC1759l.mView != null && (viewGroup3 = componentCallbacksC1759l.mContainer) != null) {
                                S sF3 = S.f(viewGroup3, componentCallbacksC1759l.getParentFragmentManager());
                                S.b.EnumC0238b finalState = S.b.EnumC0238b.from(componentCallbacksC1759l.mView.getVisibility());
                                sF3.getClass();
                                kotlin.jvm.internal.l.f(finalState, "finalState");
                                if (x.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + componentCallbacksC1759l);
                                }
                                sF3.a(finalState, S.b.a.ADDING, this);
                            }
                            componentCallbacksC1759l.mState = 4;
                            break;
                        case 5:
                            if (x.G(3)) {
                                Log.d("FragmentManager", "moveto STARTED: " + componentCallbacksC1759l);
                            }
                            componentCallbacksC1759l.performStart();
                            vVar.k(false);
                            break;
                        case 6:
                            componentCallbacksC1759l.mState = 6;
                            break;
                        case 7:
                            m();
                            break;
                    }
                }
                z11 = true;
            }
        } catch (Throwable th) {
            this.f15772d = false;
            throw th;
        }
    }

    public final void l(ClassLoader classLoader) {
        ComponentCallbacksC1759l componentCallbacksC1759l = this.f15771c;
        Bundle bundle = componentCallbacksC1759l.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (componentCallbacksC1759l.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            componentCallbacksC1759l.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        componentCallbacksC1759l.mSavedViewState = componentCallbacksC1759l.mSavedFragmentState.getSparseParcelableArray("viewState");
        componentCallbacksC1759l.mSavedViewRegistryState = componentCallbacksC1759l.mSavedFragmentState.getBundle("viewRegistryState");
        E e4 = (E) componentCallbacksC1759l.mSavedFragmentState.getParcelable("state");
        if (e4 != null) {
            componentCallbacksC1759l.mTargetWho = e4.f15766m;
            componentCallbacksC1759l.mTargetRequestCode = e4.f15767n;
            Boolean bool = componentCallbacksC1759l.mSavedUserVisibleHint;
            if (bool != null) {
                componentCallbacksC1759l.mUserVisibleHint = bool.booleanValue();
                componentCallbacksC1759l.mSavedUserVisibleHint = null;
            } else {
                componentCallbacksC1759l.mUserVisibleHint = e4.f15768o;
            }
        }
        if (componentCallbacksC1759l.mUserVisibleHint) {
            return;
        }
        componentCallbacksC1759l.mDeferStart = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.x.G(r0)
            java.lang.String r1 = "FragmentManager"
            androidx.fragment.app.l r2 = r6.f15771c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            android.view.View r0 = r2.getFocusedView()
            if (r0 == 0) goto L78
            android.view.View r3 = r2.mView
            if (r0 != r3) goto L27
            goto L31
        L27:
            android.view.ViewParent r3 = r0.getParent()
        L2b:
            if (r3 == 0) goto L78
            android.view.View r4 = r2.mView
            if (r3 != r4) goto L73
        L31:
            boolean r3 = r0.requestFocus()
            r4 = 2
            boolean r4 = androidx.fragment.app.x.G(r4)
            if (r4 == 0) goto L78
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "requestFocus: Restoring focused view "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = " "
            r4.append(r0)
            if (r3 == 0) goto L50
            java.lang.String r0 = "succeeded"
            goto L52
        L50:
            java.lang.String r0 = "failed"
        L52:
            r4.append(r0)
            java.lang.String r0 = " on Fragment "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = " resulting in focused view "
            r4.append(r0)
            android.view.View r0 = r2.mView
            android.view.View r0 = r0.findFocus()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.v(r1, r0)
            goto L78
        L73:
            android.view.ViewParent r3 = r3.getParent()
            goto L2b
        L78:
            r0 = 0
            r2.setFocusedView(r0)
            r2.performResume()
            androidx.fragment.app.v r1 = r6.f15769a
            r3 = 0
            r1.i(r2, r3)
            androidx.fragment.app.G r1 = r6.f15770b
            java.lang.String r3 = r2.mWho
            r1.i(r0, r3)
            r2.mSavedFragmentState = r0
            r2.mSavedViewState = r0
            r2.mSavedViewRegistryState = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.F.m():void");
    }

    public final Bundle n() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        ComponentCallbacksC1759l componentCallbacksC1759l = this.f15771c;
        if (componentCallbacksC1759l.mState == -1 && (bundle = componentCallbacksC1759l.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new E(componentCallbacksC1759l));
        if (componentCallbacksC1759l.mState > -1) {
            Bundle bundle3 = new Bundle();
            componentCallbacksC1759l.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f15769a.j(false);
            Bundle bundle4 = new Bundle();
            componentCallbacksC1759l.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleS = componentCallbacksC1759l.mChildFragmentManager.S();
            if (!bundleS.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleS);
            }
            if (componentCallbacksC1759l.mView != null) {
                o();
            }
            SparseArray<Parcelable> sparseArray = componentCallbacksC1759l.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = componentCallbacksC1759l.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = componentCallbacksC1759l.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void o() {
        ComponentCallbacksC1759l componentCallbacksC1759l = this.f15771c;
        if (componentCallbacksC1759l.mView == null) {
            return;
        }
        if (x.G(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + componentCallbacksC1759l + " with view " + componentCallbacksC1759l.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        componentCallbacksC1759l.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            componentCallbacksC1759l.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        componentCallbacksC1759l.mViewLifecycleOwner.f15828f.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        componentCallbacksC1759l.mSavedViewRegistryState = bundle;
    }

    public F(v vVar, G g10, ClassLoader classLoader, C1765s c1765s, Bundle bundle) {
        this.f15769a = vVar;
        this.f15770b = g10;
        E e4 = (E) bundle.getParcelable("state");
        ComponentCallbacksC1759l componentCallbacksC1759lA = c1765s.a(e4.f15756b);
        componentCallbacksC1759lA.mWho = e4.f15757c;
        componentCallbacksC1759lA.mFromLayout = e4.f15758d;
        componentCallbacksC1759lA.mRestored = true;
        componentCallbacksC1759lA.mFragmentId = e4.f15759e;
        componentCallbacksC1759lA.mContainerId = e4.f15760f;
        componentCallbacksC1759lA.mTag = e4.f15761g;
        componentCallbacksC1759lA.mRetainInstance = e4.f15762h;
        componentCallbacksC1759lA.mRemoving = e4.i;
        componentCallbacksC1759lA.mDetached = e4.f15763j;
        componentCallbacksC1759lA.mHidden = e4.f15764k;
        componentCallbacksC1759lA.mMaxState = AbstractC1781n.b.values()[e4.f15765l];
        componentCallbacksC1759lA.mTargetWho = e4.f15766m;
        componentCallbacksC1759lA.mTargetRequestCode = e4.f15767n;
        componentCallbacksC1759lA.mUserVisibleHint = e4.f15768o;
        this.f15771c = componentCallbacksC1759lA;
        componentCallbacksC1759lA.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        componentCallbacksC1759lA.setArguments(bundle2);
        if (x.G(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + componentCallbacksC1759lA);
        }
    }

    /* compiled from: FragmentStateManager.java */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f15774b;

        public a(View view) {
            this.f15774b = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View view2 = this.f15774b;
            view2.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, L0.S> weakHashMap = L0.I.f3792a;
            I.c.c(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public F(v vVar, G g10, ComponentCallbacksC1759l componentCallbacksC1759l, Bundle bundle) {
        this.f15769a = vVar;
        this.f15770b = g10;
        this.f15771c = componentCallbacksC1759l;
        componentCallbacksC1759l.mSavedViewState = null;
        componentCallbacksC1759l.mSavedViewRegistryState = null;
        componentCallbacksC1759l.mBackStackNesting = 0;
        componentCallbacksC1759l.mInLayout = false;
        componentCallbacksC1759l.mAdded = false;
        ComponentCallbacksC1759l componentCallbacksC1759l2 = componentCallbacksC1759l.mTarget;
        componentCallbacksC1759l.mTargetWho = componentCallbacksC1759l2 != null ? componentCallbacksC1759l2.mWho : null;
        componentCallbacksC1759l.mTarget = null;
        componentCallbacksC1759l.mSavedFragmentState = bundle;
        componentCallbacksC1759l.mArguments = bundle.getBundle("arguments");
    }
}
