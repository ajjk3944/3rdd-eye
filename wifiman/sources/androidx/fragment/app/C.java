package androidx.fragment.app;

import F1.W;
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
import androidx.fragment.app.K;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.S;

/* loaded from: classes.dex */
class C {

    /* renamed from: a, reason: collision with root package name */
    private final q f31179a;

    /* renamed from: b, reason: collision with root package name */
    private final D f31180b;

    /* renamed from: c, reason: collision with root package name */
    private final Fragment f31181c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f31182d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f31183e = -1;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f31184a;

        a(View view) {
            this.f31184a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f31184a.removeOnAttachStateChangeListener(this);
            W.j0(this.f31184a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31186a;

        static {
            int[] iArr = new int[AbstractC4013k.b.values().length];
            f31186a = iArr;
            try {
                iArr[AbstractC4013k.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31186a[AbstractC4013k.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31186a[AbstractC4013k.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31186a[AbstractC4013k.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    C(q qVar, D d10, Fragment fragment) {
        this.f31179a = qVar;
        this.f31180b = d10;
        this.f31181c = fragment;
    }

    private boolean l(View view) {
        if (view == this.f31181c.f31230I) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f31181c.f31230I) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f31181c.j1(bundle);
        this.f31179a.j(this.f31181c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f31181c.f31230I != null) {
            s();
        }
        if (this.f31181c.f31238c != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f31181c.f31238c);
        }
        if (this.f31181c.f31239d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f31181c.f31239d);
        }
        if (!this.f31181c.f31232N) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f31181c.f31232N);
        }
        return bundle;
    }

    void a() {
        if (w.E0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f31181c);
        }
        Fragment fragment = this.f31181c;
        fragment.P0(fragment.f31237b);
        q qVar = this.f31179a;
        Fragment fragment2 = this.f31181c;
        qVar.a(fragment2, fragment2.f31237b, false);
    }

    void b() {
        int iJ = this.f31180b.j(this.f31181c);
        Fragment fragment = this.f31181c;
        fragment.f31229H.addView(fragment.f31230I, iJ);
    }

    void c() {
        if (w.E0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f31181c);
        }
        Fragment fragment = this.f31181c;
        Fragment fragment2 = fragment.f31245h;
        C cN = null;
        if (fragment2 != null) {
            C cN2 = this.f31180b.n(fragment2.f31241f);
            if (cN2 == null) {
                throw new IllegalStateException("Fragment " + this.f31181c + " declared target fragment " + this.f31181c.f31245h + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f31181c;
            fragment3.f31247i = fragment3.f31245h.f31241f;
            fragment3.f31245h = null;
            cN = cN2;
        } else {
            String str = fragment.f31247i;
            if (str != null && (cN = this.f31180b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f31181c + " declared target fragment " + this.f31181c.f31247i + " that does not belong to this FragmentManager!");
            }
        }
        if (cN != null) {
            cN.m();
        }
        Fragment fragment4 = this.f31181c;
        fragment4.f31269u = fragment4.f31268t.r0();
        Fragment fragment5 = this.f31181c;
        fragment5.f31271w = fragment5.f31268t.u0();
        this.f31179a.g(this.f31181c, false);
        this.f31181c.Q0();
        this.f31179a.b(this.f31181c, false);
    }

    int d() {
        Fragment fragment = this.f31181c;
        if (fragment.f31268t == null) {
            return fragment.f31236a;
        }
        int iMin = this.f31183e;
        int i10 = b.f31186a[fragment.f31248i1.ordinal()];
        if (i10 != 1) {
            iMin = i10 != 2 ? i10 != 3 ? i10 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        Fragment fragment2 = this.f31181c;
        if (fragment2.f31259o) {
            if (fragment2.f31261p) {
                iMin = Math.max(this.f31183e, 2);
                View view = this.f31181c.f31230I;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f31183e < 4 ? Math.min(iMin, fragment2.f31236a) : Math.min(iMin, 1);
            }
        }
        if (!this.f31181c.f31253l) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment3 = this.f31181c;
        ViewGroup viewGroup = fragment3.f31229H;
        K.e.b bVarL = viewGroup != null ? K.n(viewGroup, fragment3.G()).l(this) : null;
        if (bVarL == K.e.b.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (bVarL == K.e.b.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment4 = this.f31181c;
            if (fragment4.f31255m) {
                iMin = fragment4.c0() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment5 = this.f31181c;
        if (fragment5.f31231J && fragment5.f31236a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (w.E0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f31181c);
        }
        return iMin;
    }

    void e() {
        if (w.E0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f31181c);
        }
        Fragment fragment = this.f31181c;
        if (fragment.f31244g1) {
            fragment.r1(fragment.f31237b);
            this.f31181c.f31236a = 1;
            return;
        }
        this.f31179a.h(fragment, fragment.f31237b, false);
        Fragment fragment2 = this.f31181c;
        fragment2.T0(fragment2.f31237b);
        q qVar = this.f31179a;
        Fragment fragment3 = this.f31181c;
        qVar.c(fragment3, fragment3.f31237b, false);
    }

    void f() throws Resources.NotFoundException {
        String resourceName;
        if (this.f31181c.f31259o) {
            return;
        }
        if (w.E0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f31181c);
        }
        Fragment fragment = this.f31181c;
        LayoutInflater layoutInflaterZ0 = fragment.Z0(fragment.f31237b);
        Fragment fragment2 = this.f31181c;
        ViewGroup viewGroup = fragment2.f31229H;
        if (viewGroup == null) {
            int i10 = fragment2.f31273y;
            if (i10 == 0) {
                viewGroup = null;
            } else {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f31181c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.f31268t.n0().d(this.f31181c.f31273y);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f31181c;
                    if (!fragment3.f31263q) {
                        try {
                            resourceName = fragment3.M().getResourceName(this.f31181c.f31273y);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f31181c.f31273y) + " (" + resourceName + ") for fragment " + this.f31181c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    V1.b.i(this.f31181c, viewGroup);
                }
            }
        }
        Fragment fragment4 = this.f31181c;
        fragment4.f31229H = viewGroup;
        fragment4.V0(layoutInflaterZ0, viewGroup, fragment4.f31237b);
        View view = this.f31181c.f31230I;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f31181c;
            fragment5.f31230I.setTag(U1.b.f22124a, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f31181c;
            if (fragment6.f31222A) {
                fragment6.f31230I.setVisibility(8);
            }
            if (W.P(this.f31181c.f31230I)) {
                W.j0(this.f31181c.f31230I);
            } else {
                View view2 = this.f31181c.f31230I;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f31181c.m1();
            q qVar = this.f31179a;
            Fragment fragment7 = this.f31181c;
            qVar.m(fragment7, fragment7.f31230I, fragment7.f31237b, false);
            int visibility = this.f31181c.f31230I.getVisibility();
            this.f31181c.z1(this.f31181c.f31230I.getAlpha());
            Fragment fragment8 = this.f31181c;
            if (fragment8.f31229H != null && visibility == 0) {
                View viewFindFocus = fragment8.f31230I.findFocus();
                if (viewFindFocus != null) {
                    this.f31181c.w1(viewFindFocus);
                    if (w.E0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f31181c);
                    }
                }
                this.f31181c.f31230I.setAlpha(0.0f);
            }
        }
        this.f31181c.f31236a = 2;
    }

    void g() {
        Fragment fragmentF;
        if (w.E0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f31181c);
        }
        Fragment fragment = this.f31181c;
        boolean zIsChangingConfigurations = true;
        boolean z10 = fragment.f31255m && !fragment.c0();
        if (z10) {
            Fragment fragment2 = this.f31181c;
            if (!fragment2.f31257n) {
                this.f31180b.B(fragment2.f31241f, null);
            }
        }
        if (!z10 && !this.f31180b.p().j0(this.f31181c)) {
            String str = this.f31181c.f31247i;
            if (str != null && (fragmentF = this.f31180b.f(str)) != null && fragmentF.f31224C) {
                this.f31181c.f31245h = fragmentF;
            }
            this.f31181c.f31236a = 0;
            return;
        }
        o oVar = this.f31181c.f31269u;
        if (oVar instanceof S) {
            zIsChangingConfigurations = this.f31180b.p().g0();
        } else if (oVar.g() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) oVar.g()).isChangingConfigurations();
        }
        if ((z10 && !this.f31181c.f31257n) || zIsChangingConfigurations) {
            this.f31180b.p().Y(this.f31181c);
        }
        this.f31181c.W0();
        this.f31179a.d(this.f31181c, false);
        for (C c10 : this.f31180b.k()) {
            if (c10 != null) {
                Fragment fragmentK = c10.k();
                if (this.f31181c.f31241f.equals(fragmentK.f31247i)) {
                    fragmentK.f31245h = this.f31181c;
                    fragmentK.f31247i = null;
                }
            }
        }
        Fragment fragment3 = this.f31181c;
        String str2 = fragment3.f31247i;
        if (str2 != null) {
            fragment3.f31245h = this.f31180b.f(str2);
        }
        this.f31180b.s(this);
    }

    void h() {
        View view;
        if (w.E0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f31181c);
        }
        Fragment fragment = this.f31181c;
        ViewGroup viewGroup = fragment.f31229H;
        if (viewGroup != null && (view = fragment.f31230I) != null) {
            viewGroup.removeView(view);
        }
        this.f31181c.X0();
        this.f31179a.n(this.f31181c, false);
        Fragment fragment2 = this.f31181c;
        fragment2.f31229H = null;
        fragment2.f31230I = null;
        fragment2.f31252k1 = null;
        fragment2.f31254l1.n(null);
        this.f31181c.f31261p = false;
    }

    void i() {
        if (w.E0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f31181c);
        }
        this.f31181c.Y0();
        this.f31179a.e(this.f31181c, false);
        Fragment fragment = this.f31181c;
        fragment.f31236a = -1;
        fragment.f31269u = null;
        fragment.f31271w = null;
        fragment.f31268t = null;
        if ((!fragment.f31255m || fragment.c0()) && !this.f31180b.p().j0(this.f31181c)) {
            return;
        }
        if (w.E0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f31181c);
        }
        this.f31181c.Y();
    }

    void j() {
        Fragment fragment = this.f31181c;
        if (fragment.f31259o && fragment.f31261p && !fragment.f31265r) {
            if (w.E0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f31181c);
            }
            Fragment fragment2 = this.f31181c;
            fragment2.V0(fragment2.Z0(fragment2.f31237b), null, this.f31181c.f31237b);
            View view = this.f31181c.f31230I;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f31181c;
                fragment3.f31230I.setTag(U1.b.f22124a, fragment3);
                Fragment fragment4 = this.f31181c;
                if (fragment4.f31222A) {
                    fragment4.f31230I.setVisibility(8);
                }
                this.f31181c.m1();
                q qVar = this.f31179a;
                Fragment fragment5 = this.f31181c;
                qVar.m(fragment5, fragment5.f31230I, fragment5.f31237b, false);
                this.f31181c.f31236a = 2;
            }
        }
    }

    Fragment k() {
        return this.f31181c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f31182d) {
            if (w.E0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f31182d = true;
            boolean z10 = false;
            while (true) {
                int iD = d();
                Fragment fragment = this.f31181c;
                int i10 = fragment.f31236a;
                if (iD == i10) {
                    if (!z10 && i10 == -1 && fragment.f31255m && !fragment.c0() && !this.f31181c.f31257n) {
                        if (w.E0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f31181c);
                        }
                        this.f31180b.p().Y(this.f31181c);
                        this.f31180b.s(this);
                        if (w.E0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f31181c);
                        }
                        this.f31181c.Y();
                    }
                    Fragment fragment2 = this.f31181c;
                    if (fragment2.f31235Z) {
                        if (fragment2.f31230I != null && (viewGroup = fragment2.f31229H) != null) {
                            K kN = K.n(viewGroup, fragment2.G());
                            if (this.f31181c.f31222A) {
                                kN.c(this);
                            } else {
                                kN.e(this);
                            }
                        }
                        Fragment fragment3 = this.f31181c;
                        w wVar = fragment3.f31268t;
                        if (wVar != null) {
                            wVar.C0(fragment3);
                        }
                        Fragment fragment4 = this.f31181c;
                        fragment4.f31235Z = false;
                        fragment4.y0(fragment4.f31222A);
                        this.f31181c.f31270v.G();
                    }
                    this.f31182d = false;
                    return;
                }
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.f31257n && this.f31180b.q(fragment.f31241f) == null) {
                                r();
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f31181c.f31236a = 1;
                            break;
                        case 2:
                            fragment.f31261p = false;
                            fragment.f31236a = 2;
                            break;
                        case 3:
                            if (w.E0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f31181c);
                            }
                            Fragment fragment5 = this.f31181c;
                            if (fragment5.f31257n) {
                                r();
                            } else if (fragment5.f31230I != null && fragment5.f31238c == null) {
                                s();
                            }
                            Fragment fragment6 = this.f31181c;
                            if (fragment6.f31230I != null && (viewGroup2 = fragment6.f31229H) != null) {
                                K.n(viewGroup2, fragment6.G()).d(this);
                            }
                            this.f31181c.f31236a = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            fragment.f31236a = 5;
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
                            if (fragment.f31230I != null && (viewGroup3 = fragment.f31229H) != null) {
                                K.n(viewGroup3, fragment.G()).b(K.e.c.from(this.f31181c.f31230I.getVisibility()), this);
                            }
                            this.f31181c.f31236a = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            fragment.f31236a = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z10 = true;
            }
        } catch (Throwable th2) {
            this.f31182d = false;
            throw th2;
        }
    }

    void n() {
        if (w.E0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f31181c);
        }
        this.f31181c.e1();
        this.f31179a.f(this.f31181c, false);
    }

    void o(ClassLoader classLoader) {
        Bundle bundle = this.f31181c.f31237b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f31181c;
        fragment.f31238c = fragment.f31237b.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f31181c;
        fragment2.f31239d = fragment2.f31237b.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f31181c;
        fragment3.f31247i = fragment3.f31237b.getString("android:target_state");
        Fragment fragment4 = this.f31181c;
        if (fragment4.f31247i != null) {
            fragment4.f31249j = fragment4.f31237b.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f31181c;
        Boolean bool = fragment5.f31240e;
        if (bool != null) {
            fragment5.f31232N = bool.booleanValue();
            this.f31181c.f31240e = null;
        } else {
            fragment5.f31232N = fragment5.f31237b.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f31181c;
        if (fragment6.f31232N) {
            return;
        }
        fragment6.f31231J = true;
    }

    void p() {
        if (w.E0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f31181c);
        }
        View viewA = this.f31181c.A();
        if (viewA != null && l(viewA)) {
            boolean zRequestFocus = viewA.requestFocus();
            if (w.E0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(viewA);
                sb2.append(" ");
                sb2.append(zRequestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f31181c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f31181c.f31230I.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f31181c.w1(null);
        this.f31181c.i1();
        this.f31179a.i(this.f31181c, false);
        Fragment fragment = this.f31181c;
        fragment.f31237b = null;
        fragment.f31238c = null;
        fragment.f31239d = null;
    }

    void r() {
        B b10 = new B(this.f31181c);
        Fragment fragment = this.f31181c;
        if (fragment.f31236a <= -1 || b10.f31178m != null) {
            b10.f31178m = fragment.f31237b;
        } else {
            Bundle bundleQ = q();
            b10.f31178m = bundleQ;
            if (this.f31181c.f31247i != null) {
                if (bundleQ == null) {
                    b10.f31178m = new Bundle();
                }
                b10.f31178m.putString("android:target_state", this.f31181c.f31247i);
                int i10 = this.f31181c.f31249j;
                if (i10 != 0) {
                    b10.f31178m.putInt("android:target_req_state", i10);
                }
            }
        }
        this.f31180b.B(this.f31181c.f31241f, b10);
    }

    void s() {
        if (this.f31181c.f31230I == null) {
            return;
        }
        if (w.E0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f31181c + " with view " + this.f31181c.f31230I);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f31181c.f31230I.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f31181c.f31238c = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f31181c.f31252k1.f(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f31181c.f31239d = bundle;
    }

    void t(int i10) {
        this.f31183e = i10;
    }

    void u() {
        if (w.E0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f31181c);
        }
        this.f31181c.k1();
        this.f31179a.k(this.f31181c, false);
    }

    void v() {
        if (w.E0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f31181c);
        }
        this.f31181c.l1();
        this.f31179a.l(this.f31181c, false);
    }

    C(q qVar, D d10, ClassLoader classLoader, n nVar, B b10) {
        this.f31179a = qVar;
        this.f31180b = d10;
        Fragment fragmentA = b10.a(nVar, classLoader);
        this.f31181c = fragmentA;
        if (w.E0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentA);
        }
    }

    C(q qVar, D d10, Fragment fragment, B b10) {
        this.f31179a = qVar;
        this.f31180b = d10;
        this.f31181c = fragment;
        fragment.f31238c = null;
        fragment.f31239d = null;
        fragment.f31267s = 0;
        fragment.f31261p = false;
        fragment.f31253l = false;
        Fragment fragment2 = fragment.f31245h;
        fragment.f31247i = fragment2 != null ? fragment2.f31241f : null;
        fragment.f31245h = null;
        Bundle bundle = b10.f31178m;
        if (bundle != null) {
            fragment.f31237b = bundle;
        } else {
            fragment.f31237b = new Bundle();
        }
    }
}
