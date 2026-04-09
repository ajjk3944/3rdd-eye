package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.j0;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final n f3372a;

    /* renamed from: b, reason: collision with root package name */
    public final y f3373b;

    /* renamed from: c, reason: collision with root package name */
    public final Fragment f3374c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3375d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f3376e = -1;

    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f3377a;

        public a(View view) {
            this.f3377a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f3377a.removeOnAttachStateChangeListener(this);
            ViewCompat.g0(this.f3377a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3379a;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            f3379a = iArr;
            try {
                iArr[Lifecycle.State.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3379a[Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3379a[Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3379a[Lifecycle.State.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public w(n nVar, y yVar, Fragment fragment) {
        this.f3372a = nVar;
        this.f3373b = yVar;
        this.f3374c = fragment;
    }

    public void a() {
        if (FragmentManager.I0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f3374c);
        }
        Fragment fragment = this.f3374c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        n nVar = this.f3372a;
        Fragment fragment2 = this.f3374c;
        nVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    public void b() {
        int iJ = this.f3373b.j(this.f3374c);
        Fragment fragment = this.f3374c;
        fragment.mContainer.addView(fragment.mView, iJ);
    }

    public void c() {
        if (FragmentManager.I0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f3374c);
        }
        Fragment fragment = this.f3374c;
        Fragment fragment2 = fragment.mTarget;
        w wVarN = null;
        if (fragment2 != null) {
            w wVarN2 = this.f3373b.n(fragment2.mWho);
            if (wVarN2 == null) {
                throw new IllegalStateException("Fragment " + this.f3374c + " declared target fragment " + this.f3374c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f3374c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            wVarN = wVarN2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (wVarN = this.f3373b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f3374c + " declared target fragment " + this.f3374c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (wVarN != null) {
            wVarN.m();
        }
        Fragment fragment4 = this.f3374c;
        fragment4.mHost = fragment4.mFragmentManager.v0();
        Fragment fragment5 = this.f3374c;
        fragment5.mParentFragment = fragment5.mFragmentManager.y0();
        this.f3372a.g(this.f3374c, false);
        this.f3374c.performAttach();
        this.f3372a.b(this.f3374c, false);
    }

    public int d() {
        Fragment fragment = this.f3374c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f3376e;
        int i10 = b.f3379a[fragment.mMaxState.ordinal()];
        if (i10 != 1) {
            iMin = i10 != 2 ? i10 != 3 ? i10 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        Fragment fragment2 = this.f3374c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                iMin = Math.max(this.f3376e, 2);
                View view = this.f3374c.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f3376e < 4 ? Math.min(iMin, fragment2.mState) : Math.min(iMin, 1);
            }
        }
        if (!this.f3374c.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment3 = this.f3374c;
        ViewGroup viewGroup = fragment3.mContainer;
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpactL = viewGroup != null ? SpecialEffectsController.n(viewGroup, fragment3.getParentFragmentManager()).l(this) : null;
        if (lifecycleImpactL == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (lifecycleImpactL == SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment4 = this.f3374c;
            if (fragment4.mRemoving) {
                iMin = fragment4.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment5 = this.f3374c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (FragmentManager.I0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f3374c);
        }
        return iMin;
    }

    public void e() {
        if (FragmentManager.I0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f3374c);
        }
        Fragment fragment = this.f3374c;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.f3374c.mState = 1;
            return;
        }
        this.f3372a.h(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.f3374c;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        n nVar = this.f3372a;
        Fragment fragment3 = this.f3374c;
        nVar.c(fragment3, fragment3.mSavedFragmentState, false);
    }

    public void f() throws Resources.NotFoundException {
        String resourceName;
        if (this.f3374c.mFromLayout) {
            return;
        }
        if (FragmentManager.I0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3374c);
        }
        Fragment fragment = this.f3374c;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        Fragment fragment2 = this.f3374c;
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup == null) {
            int i10 = fragment2.mContainerId;
            if (i10 == 0) {
                viewGroup = null;
            } else {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f3374c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.q0().c(this.f3374c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f3374c;
                    if (!fragment3.mRestored) {
                        try {
                            resourceName = fragment3.getResources().getResourceName(this.f3374c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f3374c.mContainerId) + " (" + resourceName + ") for fragment " + this.f3374c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    FragmentStrictMode.n(this.f3374c, viewGroup);
                }
            }
        }
        Fragment fragment4 = this.f3374c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.f3374c.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f3374c;
            fragment5.mView.setTag(g1.b.fragment_container_view_tag, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f3374c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (ViewCompat.P(this.f3374c.mView)) {
                ViewCompat.g0(this.f3374c.mView);
            } else {
                View view2 = this.f3374c.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f3374c.performViewCreated();
            n nVar = this.f3372a;
            Fragment fragment7 = this.f3374c;
            nVar.m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.f3374c.mView.getVisibility();
            this.f3374c.setPostOnViewCreatedAlpha(this.f3374c.mView.getAlpha());
            Fragment fragment8 = this.f3374c;
            if (fragment8.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment8.mView.findFocus();
                if (viewFindFocus != null) {
                    this.f3374c.setFocusedView(viewFindFocus);
                    if (FragmentManager.I0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f3374c);
                    }
                }
                this.f3374c.mView.setAlpha(0.0f);
            }
        }
        this.f3374c.mState = 2;
    }

    public void g() {
        Fragment fragmentF;
        if (FragmentManager.I0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f3374c);
        }
        Fragment fragment = this.f3374c;
        boolean zIsChangingConfigurations = true;
        boolean z10 = fragment.mRemoving && !fragment.isInBackStack();
        if (z10) {
            Fragment fragment2 = this.f3374c;
            if (!fragment2.mBeingSaved) {
                this.f3373b.B(fragment2.mWho, null);
            }
        }
        if (!z10 && !this.f3373b.p().r(this.f3374c)) {
            String str = this.f3374c.mTargetWho;
            if (str != null && (fragmentF = this.f3373b.f(str)) != null && fragmentF.mRetainInstance) {
                this.f3374c.mTarget = fragmentF;
            }
            this.f3374c.mState = 0;
            return;
        }
        l lVar = this.f3374c.mHost;
        if (lVar instanceof j0) {
            zIsChangingConfigurations = this.f3373b.p().o();
        } else if (lVar.f() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) lVar.f()).isChangingConfigurations();
        }
        if ((z10 && !this.f3374c.mBeingSaved) || zIsChangingConfigurations) {
            this.f3373b.p().g(this.f3374c);
        }
        this.f3374c.performDestroy();
        this.f3372a.d(this.f3374c, false);
        for (w wVar : this.f3373b.k()) {
            if (wVar != null) {
                Fragment fragmentK = wVar.k();
                if (this.f3374c.mWho.equals(fragmentK.mTargetWho)) {
                    fragmentK.mTarget = this.f3374c;
                    fragmentK.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.f3374c;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.f3373b.f(str2);
        }
        this.f3373b.s(this);
    }

    public void h() {
        View view;
        if (FragmentManager.I0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f3374c);
        }
        Fragment fragment = this.f3374c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f3374c.performDestroyView();
        this.f3372a.n(this.f3374c, false);
        Fragment fragment2 = this.f3374c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.k(null);
        this.f3374c.mInLayout = false;
    }

    public void i() {
        if (FragmentManager.I0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f3374c);
        }
        this.f3374c.performDetach();
        this.f3372a.e(this.f3374c, false);
        Fragment fragment = this.f3374c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((!fragment.mRemoving || fragment.isInBackStack()) && !this.f3373b.p().r(this.f3374c)) {
            return;
        }
        if (FragmentManager.I0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f3374c);
        }
        this.f3374c.initState();
    }

    public void j() {
        Fragment fragment = this.f3374c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.I0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3374c);
            }
            Fragment fragment2 = this.f3374c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f3374c.mSavedFragmentState);
            View view = this.f3374c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f3374c;
                fragment3.mView.setTag(g1.b.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f3374c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f3374c.performViewCreated();
                n nVar = this.f3372a;
                Fragment fragment5 = this.f3374c;
                nVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f3374c.mState = 2;
            }
        }
    }

    public Fragment k() {
        return this.f3374c;
    }

    public final boolean l(View view) {
        if (view == this.f3374c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f3374c.mView) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f3375d) {
            if (FragmentManager.I0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f3375d = true;
            boolean z10 = false;
            while (true) {
                int iD = d();
                Fragment fragment = this.f3374c;
                int i10 = fragment.mState;
                if (iD == i10) {
                    if (!z10 && i10 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f3374c.mBeingSaved) {
                        if (FragmentManager.I0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f3374c);
                        }
                        this.f3373b.p().g(this.f3374c);
                        this.f3373b.s(this);
                        if (FragmentManager.I0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f3374c);
                        }
                        this.f3374c.initState();
                    }
                    Fragment fragment2 = this.f3374c;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            SpecialEffectsController specialEffectsControllerN = SpecialEffectsController.n(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f3374c.mHidden) {
                                specialEffectsControllerN.c(this);
                            } else {
                                specialEffectsControllerN.e(this);
                            }
                        }
                        Fragment fragment3 = this.f3374c;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.G0(fragment3);
                        }
                        Fragment fragment4 = this.f3374c;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f3374c.mChildFragmentManager.J();
                    }
                    this.f3375d = false;
                    return;
                }
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved && this.f3373b.q(fragment.mWho) == null) {
                                s();
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f3374c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.I0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f3374c);
                            }
                            Fragment fragment5 = this.f3374c;
                            if (fragment5.mBeingSaved) {
                                s();
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                t();
                            }
                            Fragment fragment6 = this.f3374c;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                SpecialEffectsController.n(viewGroup2, fragment6.getParentFragmentManager()).d(this);
                            }
                            this.f3374c.mState = 3;
                            break;
                        case 4:
                            w();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
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
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                SpecialEffectsController.n(viewGroup3, fragment.getParentFragmentManager()).b(SpecialEffectsController.Operation.State.b(this.f3374c.mView.getVisibility()), this);
                            }
                            this.f3374c.mState = 4;
                            break;
                        case 5:
                            v();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z10 = true;
            }
        } catch (Throwable th) {
            this.f3375d = false;
            throw th;
        }
    }

    public void n() {
        if (FragmentManager.I0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f3374c);
        }
        this.f3374c.performPause();
        this.f3372a.f(this.f3374c, false);
    }

    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f3374c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f3374c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f3374c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f3374c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f3374c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f3374c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f3374c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f3374c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    public void p() {
        if (FragmentManager.I0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f3374c);
        }
        View focusedView = this.f3374c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean zRequestFocus = focusedView.requestFocus();
            if (FragmentManager.I0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(zRequestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f3374c);
                sb.append(" resulting in focused view ");
                sb.append(this.f3374c.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f3374c.setFocusedView(null);
        this.f3374c.performResume();
        this.f3372a.i(this.f3374c, false);
        Fragment fragment = this.f3374c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final Bundle q() {
        Bundle bundle = new Bundle();
        this.f3374c.performSaveInstanceState(bundle);
        this.f3372a.j(this.f3374c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f3374c.mView != null) {
            t();
        }
        if (this.f3374c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f3374c.mSavedViewState);
        }
        if (this.f3374c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f3374c.mSavedViewRegistryState);
        }
        if (!this.f3374c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f3374c.mUserVisibleHint);
        }
        return bundle;
    }

    public Fragment.SavedState r() {
        Bundle bundleQ;
        if (this.f3374c.mState <= -1 || (bundleQ = q()) == null) {
            return null;
        }
        return new Fragment.SavedState(bundleQ);
    }

    public void s() {
        FragmentState fragmentState = new FragmentState(this.f3374c);
        Fragment fragment = this.f3374c;
        if (fragment.mState <= -1 || fragmentState.f3204m != null) {
            fragmentState.f3204m = fragment.mSavedFragmentState;
        } else {
            Bundle bundleQ = q();
            fragmentState.f3204m = bundleQ;
            if (this.f3374c.mTargetWho != null) {
                if (bundleQ == null) {
                    fragmentState.f3204m = new Bundle();
                }
                fragmentState.f3204m.putString("android:target_state", this.f3374c.mTargetWho);
                int i10 = this.f3374c.mTargetRequestCode;
                if (i10 != 0) {
                    fragmentState.f3204m.putInt("android:target_req_state", i10);
                }
            }
        }
        this.f3373b.B(this.f3374c.mWho, fragmentState);
    }

    public void t() {
        if (this.f3374c.mView == null) {
            return;
        }
        if (FragmentManager.I0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f3374c + " with view " + this.f3374c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f3374c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f3374c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f3374c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f3374c.mSavedViewRegistryState = bundle;
    }

    public void u(int i10) {
        this.f3376e = i10;
    }

    public void v() {
        if (FragmentManager.I0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f3374c);
        }
        this.f3374c.performStart();
        this.f3372a.k(this.f3374c, false);
    }

    public void w() {
        if (FragmentManager.I0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f3374c);
        }
        this.f3374c.performStop();
        this.f3372a.l(this.f3374c, false);
    }

    public w(n nVar, y yVar, ClassLoader classLoader, k kVar, FragmentState fragmentState) {
        this.f3372a = nVar;
        this.f3373b = yVar;
        Fragment fragmentC = fragmentState.c(kVar, classLoader);
        this.f3374c = fragmentC;
        if (FragmentManager.I0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentC);
        }
    }

    public w(n nVar, y yVar, Fragment fragment, FragmentState fragmentState) {
        this.f3372a = nVar;
        this.f3373b = yVar;
        this.f3374c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f3204m;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
