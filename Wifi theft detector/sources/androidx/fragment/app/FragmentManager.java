package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.z;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.savedstate.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class FragmentManager {
    public static boolean S = false;
    public androidx.activity.result.b D;
    public androidx.activity.result.b E;
    public androidx.activity.result.b F;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public ArrayList O;
    public u P;
    public FragmentStrictMode.b Q;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3140b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f3142d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3143e;

    /* renamed from: g, reason: collision with root package name */
    public OnBackPressedDispatcher f3145g;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f3151m;

    /* renamed from: v, reason: collision with root package name */
    public androidx.fragment.app.l f3160v;

    /* renamed from: w, reason: collision with root package name */
    public androidx.fragment.app.i f3161w;

    /* renamed from: x, reason: collision with root package name */
    public Fragment f3162x;

    /* renamed from: y, reason: collision with root package name */
    public Fragment f3163y;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3139a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final y f3141c = new y();

    /* renamed from: f, reason: collision with root package name */
    public final m f3144f = new m(this);

    /* renamed from: h, reason: collision with root package name */
    public final androidx.activity.n f3146h = new b(false);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f3147i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f3148j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f3149k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l, reason: collision with root package name */
    public final Map f3150l = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    public final n f3152n = new n(this);

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f3153o = new CopyOnWriteArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final r0.b f3154p = new r0.b() { // from class: androidx.fragment.app.o
        @Override // r0.b
        public final void accept(Object obj) {
            FragmentManager.e(this.f3344a, (Configuration) obj);
        }
    };

    /* renamed from: q, reason: collision with root package name */
    public final r0.b f3155q = new r0.b() { // from class: androidx.fragment.app.p
        @Override // r0.b
        public final void accept(Object obj) {
            FragmentManager.a(this.f3345a, (Integer) obj);
        }
    };

    /* renamed from: r, reason: collision with root package name */
    public final r0.b f3156r = new r0.b() { // from class: androidx.fragment.app.q
        @Override // r0.b
        public final void accept(Object obj) {
            FragmentManager.d(this.f3346a, (f0.m) obj);
        }
    };

    /* renamed from: s, reason: collision with root package name */
    public final r0.b f3157s = new r0.b() { // from class: androidx.fragment.app.r
        @Override // r0.b
        public final void accept(Object obj) {
            FragmentManager.c(this.f3347a, (f0.s) obj);
        }
    };

    /* renamed from: t, reason: collision with root package name */
    public final androidx.core.view.z f3158t = new c();

    /* renamed from: u, reason: collision with root package name */
    public int f3159u = -1;

    /* renamed from: z, reason: collision with root package name */
    public androidx.fragment.app.k f3164z = null;
    public androidx.fragment.app.k A = new d();
    public f0 B = null;
    public f0 C = new e();
    public ArrayDeque G = new ArrayDeque();
    public Runnable R = new f();

    /* renamed from: androidx.fragment.app.FragmentManager$6, reason: invalid class name */
    class AnonymousClass6 implements androidx.lifecycle.j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f3165a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f3166b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ FragmentManager f3167c;

        @Override // androidx.lifecycle.j
        public void onStateChanged(androidx.lifecycle.n nVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START && ((Bundle) this.f3167c.f3149k.get(this.f3165a)) != null) {
                throw null;
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.f3166b.d(this);
                this.f3167c.f3150l.remove(this.f3165a);
            }
        }
    }

    public class a implements androidx.activity.result.a {
        public a() {
        }

        @Override // androidx.activity.result.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.G.pollFirst();
            if (launchedFragmentInfo == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = launchedFragmentInfo.f3168a;
            int i11 = launchedFragmentInfo.f3169b;
            Fragment fragmentI = FragmentManager.this.f3141c.i(str);
            if (fragmentI != null) {
                fragmentI.onRequestPermissionsResult(i11, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    public class b extends androidx.activity.n {
        public b(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.n
        public void d() {
            FragmentManager.this.E0();
        }
    }

    public class c implements androidx.core.view.z {
        public c() {
        }

        @Override // androidx.core.view.z
        public void a(Menu menu) {
            FragmentManager.this.L(menu);
        }

        @Override // androidx.core.view.z
        public void b(Menu menu) {
            FragmentManager.this.P(menu);
        }

        @Override // androidx.core.view.z
        public boolean c(MenuItem menuItem) {
            return FragmentManager.this.K(menuItem);
        }

        @Override // androidx.core.view.z
        public void d(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.D(menu, menuInflater);
        }
    }

    public class d extends androidx.fragment.app.k {
        public d() {
        }

        @Override // androidx.fragment.app.k
        public Fragment a(ClassLoader classLoader, String str) {
            return FragmentManager.this.v0().b(FragmentManager.this.v0().f(), str, null);
        }
    }

    public class e implements f0 {
        public e() {
        }

        @Override // androidx.fragment.app.f0
        public SpecialEffectsController a(ViewGroup viewGroup) {
            return new androidx.fragment.app.b(viewGroup);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.b0(true);
        }
    }

    public class g implements v {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f3176a;

        public g(Fragment fragment) {
            this.f3176a = fragment;
        }

        @Override // androidx.fragment.app.v
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            this.f3176a.onAttachFragment(fragment);
        }
    }

    public class h implements androidx.activity.result.a {
        public h() {
        }

        @Override // androidx.activity.result.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.G.pollFirst();
            if (launchedFragmentInfo == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = launchedFragmentInfo.f3168a;
            int i10 = launchedFragmentInfo.f3169b;
            Fragment fragmentI = FragmentManager.this.f3141c.i(str);
            if (fragmentI != null) {
                fragmentI.onActivityResult(i10, activityResult.e(), activityResult.c());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    public class i implements androidx.activity.result.a {
        public i() {
        }

        @Override // androidx.activity.result.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.G.pollFirst();
            if (launchedFragmentInfo == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = launchedFragmentInfo.f3168a;
            int i10 = launchedFragmentInfo.f3169b;
            Fragment fragmentI = FragmentManager.this.f3141c.i(str);
            if (fragmentI != null) {
                fragmentI.onActivityResult(i10, activityResult.e(), activityResult.c());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    public static class j extends b.a {
        @Override // b.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentC = intentSenderRequest.getFillInIntent();
            if (intentC != null && (bundleExtra = intentC.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentC.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentC.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.Builder(intentSenderRequest.getIntentSender()).b(null).c(intentSenderRequest.getFlagsValues(), intentSenderRequest.getFlagsMask()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.I0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // b.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public ActivityResult c(int i10, Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    public interface k {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    public class l implements k {

        /* renamed from: a, reason: collision with root package name */
        public final String f3180a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3181b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3182c;

        public l(String str, int i10, int i11) {
            this.f3180a = str;
            this.f3181b = i10;
            this.f3182c = i11;
        }

        @Override // androidx.fragment.app.FragmentManager.k
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = FragmentManager.this.f3163y;
            if (fragment == null || this.f3181b >= 0 || this.f3180a != null || !fragment.getChildFragmentManager().Y0()) {
                return FragmentManager.this.b1(arrayList, arrayList2, this.f3180a, this.f3181b, this.f3182c);
            }
            return false;
        }
    }

    public static Fragment C0(View view) {
        Object tag = view.getTag(g1.b.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static boolean I0(int i10) {
        return S || Log.isLoggable("FragmentManager", i10);
    }

    public static /* synthetic */ void a(FragmentManager fragmentManager, Integer num) {
        if (fragmentManager.K0() && num.intValue() == 80) {
            fragmentManager.G(false);
        }
    }

    public static /* synthetic */ void c(FragmentManager fragmentManager, f0.s sVar) {
        if (fragmentManager.K0()) {
            fragmentManager.O(sVar.a(), false);
        }
    }

    public static /* synthetic */ void d(FragmentManager fragmentManager, f0.m mVar) {
        if (fragmentManager.K0()) {
            fragmentManager.H(mVar.a(), false);
        }
    }

    public static void d0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        while (i10 < i11) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                aVar.r(-1);
                aVar.w();
            } else {
                aVar.r(1);
                aVar.v();
            }
            i10++;
        }
    }

    public static /* synthetic */ void e(FragmentManager fragmentManager, Configuration configuration) {
        if (fragmentManager.K0()) {
            fragmentManager.A(configuration, false);
        }
    }

    public static int i1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 == 8194) {
            return 4097;
        }
        if (i10 == 8197) {
            return 4100;
        }
        if (i10 != 4099) {
            return i10 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    public static FragmentManager k0(View view) {
        FragmentActivity fragmentActivity;
        Fragment fragmentL0 = l0(view);
        if (fragmentL0 != null) {
            if (fragmentL0.isAdded()) {
                return fragmentL0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + fragmentL0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                fragmentActivity = null;
                break;
            }
            if (context instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (fragmentActivity != null) {
            return fragmentActivity.z();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    public static Fragment l0(View view) {
        while (view != null) {
            Fragment fragmentC0 = C0(view);
            if (fragmentC0 != null) {
                return fragmentC0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public void A(Configuration configuration, boolean z10) {
        if (z10 && (this.f3160v instanceof h0.b)) {
            s1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f3141c.o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z10) {
                    fragment.mChildFragmentManager.A(configuration, true);
                }
            }
        }
    }

    public f0 A0() {
        f0 f0Var = this.B;
        if (f0Var != null) {
            return f0Var;
        }
        Fragment fragment = this.f3162x;
        return fragment != null ? fragment.mFragmentManager.A0() : this.C;
    }

    public boolean B(MenuItem menuItem) {
        if (this.f3159u < 1) {
            return false;
        }
        for (Fragment fragment : this.f3141c.o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public FragmentStrictMode.b B0() {
        return this.Q;
    }

    public void C() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        T(1);
    }

    public boolean D(Menu menu, MenuInflater menuInflater) {
        if (this.f3159u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f3141c.o()) {
            if (fragment != null && M0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f3143e != null) {
            for (int i10 = 0; i10 < this.f3143e.size(); i10++) {
                Fragment fragment2 = (Fragment) this.f3143e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f3143e = arrayList;
        return z10;
    }

    public i0 D0(Fragment fragment) {
        return this.P.n(fragment);
    }

    public void E() {
        this.K = true;
        b0(true);
        Y();
        t();
        T(-1);
        Object obj = this.f3160v;
        if (obj instanceof h0.c) {
            ((h0.c) obj).removeOnTrimMemoryListener(this.f3155q);
        }
        Object obj2 = this.f3160v;
        if (obj2 instanceof h0.b) {
            ((h0.b) obj2).removeOnConfigurationChangedListener(this.f3154p);
        }
        Object obj3 = this.f3160v;
        if (obj3 instanceof f0.q) {
            ((f0.q) obj3).removeOnMultiWindowModeChangedListener(this.f3156r);
        }
        Object obj4 = this.f3160v;
        if (obj4 instanceof f0.r) {
            ((f0.r) obj4).removeOnPictureInPictureModeChangedListener(this.f3157s);
        }
        Object obj5 = this.f3160v;
        if (obj5 instanceof androidx.core.view.u) {
            ((androidx.core.view.u) obj5).removeMenuProvider(this.f3158t);
        }
        this.f3160v = null;
        this.f3161w = null;
        this.f3162x = null;
        if (this.f3145g != null) {
            this.f3146h.h();
            this.f3145g = null;
        }
        androidx.activity.result.b bVar = this.D;
        if (bVar != null) {
            bVar.c();
            this.E.c();
            this.F.c();
        }
    }

    public void E0() {
        b0(true);
        if (this.f3146h.g()) {
            Y0();
        } else {
            this.f3145g.k();
        }
    }

    public void F() {
        T(1);
    }

    public void F0(Fragment fragment) {
        if (I0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        p1(fragment);
    }

    public void G(boolean z10) {
        if (z10 && (this.f3160v instanceof h0.c)) {
            s1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f3141c.o()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z10) {
                    fragment.mChildFragmentManager.G(true);
                }
            }
        }
    }

    public void G0(Fragment fragment) {
        if (fragment.mAdded && J0(fragment)) {
            this.H = true;
        }
    }

    public void H(boolean z10, boolean z11) {
        if (z11 && (this.f3160v instanceof f0.q)) {
            s1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f3141c.o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.H(z10, true);
                }
            }
        }
    }

    public boolean H0() {
        return this.K;
    }

    public void I(Fragment fragment) {
        Iterator it = this.f3153o.iterator();
        while (it.hasNext()) {
            ((v) it.next()).a(this, fragment);
        }
    }

    public void J() {
        for (Fragment fragment : this.f3141c.l()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.J();
            }
        }
    }

    public final boolean J0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.q();
    }

    public boolean K(MenuItem menuItem) {
        if (this.f3159u < 1) {
            return false;
        }
        for (Fragment fragment : this.f3141c.o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean K0() {
        Fragment fragment = this.f3162x;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f3162x.getParentFragmentManager().K0();
    }

    public void L(Menu menu) {
        if (this.f3159u < 1) {
            return;
        }
        for (Fragment fragment : this.f3141c.o()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public boolean L0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    public final void M(Fragment fragment) {
        if (fragment == null || !fragment.equals(f0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    public boolean M0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public void N() {
        T(5);
    }

    public boolean N0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.z0()) && N0(fragmentManager.f3162x);
    }

    public void O(boolean z10, boolean z11) {
        if (z11 && (this.f3160v instanceof f0.r)) {
            s1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f3141c.o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.O(z10, true);
                }
            }
        }
    }

    public boolean O0(int i10) {
        return this.f3159u >= i10;
    }

    public boolean P(Menu menu) {
        boolean z10 = false;
        if (this.f3159u < 1) {
            return false;
        }
        for (Fragment fragment : this.f3141c.o()) {
            if (fragment != null && M0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean P0() {
        return this.I || this.J;
    }

    public void Q() {
        t1();
        M(this.f3163y);
    }

    public void Q0(Fragment fragment, String[] strArr, int i10) {
        if (this.F == null) {
            this.f3160v.k(fragment, strArr, i10);
            return;
        }
        this.G.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
        this.F.a(strArr);
    }

    public void R() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        T(7);
    }

    public void R0(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (this.D == null) {
            this.f3160v.m(fragment, intent, i10, bundle);
            return;
        }
        this.G.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.D.a(intent);
    }

    public void S() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        T(5);
    }

    public void S0(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (this.E == null) {
            this.f3160v.n(fragment, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (I0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + fragment);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        IntentSenderRequest intentSenderRequestA = new IntentSenderRequest.Builder(intentSender).b(intent).c(i12, i11).a();
        this.G.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
        if (I0(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.E.a(intentSenderRequestA);
    }

    public final void T(int i10) {
        try {
            this.f3140b = true;
            this.f3141c.d(i10);
            T0(i10, false);
            Iterator it = u().iterator();
            while (it.hasNext()) {
                ((SpecialEffectsController) it.next()).j();
            }
            this.f3140b = false;
            b0(true);
        } catch (Throwable th) {
            this.f3140b = false;
            throw th;
        }
    }

    public void T0(int i10, boolean z10) {
        androidx.fragment.app.l lVar;
        if (this.f3160v == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f3159u) {
            this.f3159u = i10;
            this.f3141c.t();
            r1();
            if (this.H && (lVar = this.f3160v) != null && this.f3159u == 7) {
                lVar.o();
                this.H = false;
            }
        }
    }

    public void U() {
        this.J = true;
        this.P.q(true);
        T(4);
    }

    public void U0() {
        if (this.f3160v == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.q(false);
        for (Fragment fragment : this.f3141c.o()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public void V() {
        T(2);
    }

    public void V0(FragmentContainerView fragmentContainerView) {
        View view;
        for (w wVar : this.f3141c.k()) {
            Fragment fragmentK = wVar.k();
            if (fragmentK.mContainerId == fragmentContainerView.getId() && (view = fragmentK.mView) != null && view.getParent() == null) {
                fragmentK.mContainer = fragmentContainerView;
                wVar.b();
            }
        }
    }

    public final void W() {
        if (this.L) {
            this.L = false;
            r1();
        }
    }

    public void W0(w wVar) {
        Fragment fragmentK = wVar.k();
        if (fragmentK.mDeferStart) {
            if (this.f3140b) {
                this.L = true;
            } else {
                fragmentK.mDeferStart = false;
                wVar.m();
            }
        }
    }

    public void X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f3141c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f3143e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                Fragment fragment = (Fragment) this.f3143e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList arrayList2 = this.f3142d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.f3142d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.t(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3147i.get());
        synchronized (this.f3139a) {
            try {
                int size3 = this.f3139a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size3; i12++) {
                        k kVar = (k) this.f3139a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(kVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3160v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3161w);
        if (this.f3162x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3162x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3159u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    public void X0(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            Z(new l(null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public final void Y() {
        Iterator it = u().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).j();
        }
    }

    public boolean Y0() {
        return a1(null, -1, 0);
    }

    public void Z(k kVar, boolean z10) {
        if (!z10) {
            if (this.f3160v == null) {
                if (!this.K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            r();
        }
        synchronized (this.f3139a) {
            try {
                if (this.f3160v == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f3139a.add(kVar);
                    l1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean Z0(int i10, int i11) {
        if (i10 >= 0) {
            return a1(null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public final void a0(boolean z10) {
        if (this.f3140b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f3160v == null) {
            if (!this.K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f3160v.g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            r();
        }
        if (this.M == null) {
            this.M = new ArrayList();
            this.N = new ArrayList();
        }
    }

    public final boolean a1(String str, int i10, int i11) {
        b0(false);
        a0(true);
        Fragment fragment = this.f3163y;
        if (fragment != null && i10 < 0 && str == null && fragment.getChildFragmentManager().Y0()) {
            return true;
        }
        boolean zB1 = b1(this.M, this.N, str, i10, i11);
        if (zB1) {
            this.f3140b = true;
            try {
                e1(this.M, this.N);
            } finally {
                s();
            }
        }
        t1();
        W();
        this.f3141c.b();
        return zB1;
    }

    public boolean b0(boolean z10) {
        a0(z10);
        boolean z11 = false;
        while (n0(this.M, this.N)) {
            z11 = true;
            this.f3140b = true;
            try {
                e1(this.M, this.N);
            } finally {
                s();
            }
        }
        t1();
        W();
        this.f3141c.b();
        return z11;
    }

    public boolean b1(ArrayList arrayList, ArrayList arrayList2, String str, int i10, int i11) {
        int iG0 = g0(str, i10, (i11 & 1) != 0);
        if (iG0 < 0) {
            return false;
        }
        for (int size = this.f3142d.size() - 1; size >= iG0; size--) {
            arrayList.add((androidx.fragment.app.a) this.f3142d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public void c0(k kVar, boolean z10) {
        if (z10 && (this.f3160v == null || this.K)) {
            return;
        }
        a0(z10);
        if (kVar.a(this.M, this.N)) {
            this.f3140b = true;
            try {
                e1(this.M, this.N);
            } finally {
                s();
            }
        }
        t1();
        W();
        this.f3141c.b();
    }

    public void c1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            s1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    public void d1(Fragment fragment) {
        if (I0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        this.f3141c.u(fragment);
        if (J0(fragment)) {
            this.H = true;
        }
        fragment.mRemoving = true;
        p1(fragment);
    }

    public final void e0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z10 = ((androidx.fragment.app.a) arrayList.get(i10)).f3408r;
        ArrayList arrayList3 = this.O;
        if (arrayList3 == null) {
            this.O = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.O.addAll(this.f3141c.o());
        Fragment fragmentZ0 = z0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i12);
            fragmentZ0 = !((Boolean) arrayList2.get(i12)).booleanValue() ? aVar.x(this.O, fragmentZ0) : aVar.A(this.O, fragmentZ0);
            z11 = z11 || aVar.f3399i;
        }
        this.O.clear();
        if (!z10 && this.f3159u >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                ArrayList arrayList4 = ((androidx.fragment.app.a) arrayList.get(i13)).f3393c;
                int size = arrayList4.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList4.get(i14);
                    i14++;
                    Fragment fragment = ((z.a) obj).f3411b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f3141c.r(w(fragment));
                    }
                }
            }
        }
        d0(arrayList, arrayList2, i10, i11);
        boolean zBooleanValue = ((Boolean) arrayList2.get(i11 - 1)).booleanValue();
        for (int i15 = i10; i15 < i11; i15++) {
            androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) arrayList.get(i15);
            if (zBooleanValue) {
                for (int size2 = aVar2.f3393c.size() - 1; size2 >= 0; size2--) {
                    Fragment fragment2 = ((z.a) aVar2.f3393c.get(size2)).f3411b;
                    if (fragment2 != null) {
                        w(fragment2).m();
                    }
                }
            } else {
                ArrayList arrayList5 = aVar2.f3393c;
                int size3 = arrayList5.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj2 = arrayList5.get(i16);
                    i16++;
                    Fragment fragment3 = ((z.a) obj2).f3411b;
                    if (fragment3 != null) {
                        w(fragment3).m();
                    }
                }
            }
        }
        T0(this.f3159u, true);
        for (SpecialEffectsController specialEffectsController : v(arrayList, i10, i11)) {
            specialEffectsController.r(zBooleanValue);
            specialEffectsController.p();
            specialEffectsController.g();
        }
        while (i10 < i11) {
            androidx.fragment.app.a aVar3 = (androidx.fragment.app.a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue() && aVar3.f3237v >= 0) {
                aVar3.f3237v = -1;
            }
            aVar3.z();
            i10++;
        }
        if (z11) {
            g1();
        }
    }

    public final void e1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!((androidx.fragment.app.a) arrayList.get(i10)).f3408r) {
                if (i11 != i10) {
                    e0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                    while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((androidx.fragment.app.a) arrayList.get(i11)).f3408r) {
                        i11++;
                    }
                }
                e0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            e0(arrayList, arrayList2, i11, size);
        }
    }

    public Fragment f0(String str) {
        return this.f3141c.f(str);
    }

    public void f1(Fragment fragment) {
        this.P.p(fragment);
    }

    public final int g0(String str, int i10, boolean z10) {
        ArrayList arrayList = this.f3142d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f3142d.size() - 1;
        }
        int size = this.f3142d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.f3142d.get(size);
            if ((str != null && str.equals(aVar.y())) || (i10 >= 0 && i10 == aVar.f3237v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size == this.f3142d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) this.f3142d.get(size - 1);
            if ((str == null || !str.equals(aVar2.y())) && (i10 < 0 || i10 != aVar2.f3237v)) {
                break;
            }
            size--;
        }
        return size;
    }

    public final void g1() {
        ArrayList arrayList = this.f3151m;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        androidx.appcompat.app.z.a(this.f3151m.get(0));
        throw null;
    }

    public Fragment h0(int i10) {
        return this.f3141c.g(i10);
    }

    public void h1(Parcelable parcelable) {
        w wVar;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f3160v.f().getClassLoader());
                this.f3149k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f3160v.f().getClassLoader());
                arrayList.add((FragmentState) bundle.getParcelable("state"));
            }
        }
        this.f3141c.x(arrayList);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.f3141c.v();
        ArrayList arrayList2 = fragmentManagerState.f3184a;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            FragmentState fragmentStateB = this.f3141c.B((String) obj, null);
            if (fragmentStateB != null) {
                Fragment fragmentJ = this.P.j(fragmentStateB.f3193b);
                if (fragmentJ != null) {
                    if (I0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragmentJ);
                    }
                    wVar = new w(this.f3152n, this.f3141c, fragmentJ, fragmentStateB);
                } else {
                    wVar = new w(this.f3152n, this.f3141c, this.f3160v.f().getClassLoader(), t0(), fragmentStateB);
                }
                Fragment fragmentK = wVar.k();
                fragmentK.mFragmentManager = this;
                if (I0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentK.mWho + "): " + fragmentK);
                }
                wVar.o(this.f3160v.f().getClassLoader());
                this.f3141c.r(wVar);
                wVar.u(this.f3159u);
            }
        }
        for (Fragment fragment : this.P.m()) {
            if (!this.f3141c.c(fragment.mWho)) {
                if (I0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.f3184a);
                }
                this.P.p(fragment);
                fragment.mFragmentManager = this;
                w wVar2 = new w(this.f3152n, this.f3141c, fragment);
                wVar2.u(1);
                wVar2.m();
                fragment.mRemoving = true;
                wVar2.m();
            }
        }
        this.f3141c.w(fragmentManagerState.f3185b);
        if (fragmentManagerState.f3186c != null) {
            this.f3142d = new ArrayList(fragmentManagerState.f3186c.length);
            int i11 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f3186c;
                if (i11 >= backStackRecordStateArr.length) {
                    break;
                }
                androidx.fragment.app.a aVarE = backStackRecordStateArr[i11].e(this);
                if (I0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i11 + " (index " + aVarE.f3237v + "): " + aVarE);
                    PrintWriter printWriter = new PrintWriter(new e0("FragmentManager"));
                    aVarE.u("  ", printWriter, false);
                    printWriter.close();
                }
                this.f3142d.add(aVarE);
                i11++;
            }
        } else {
            this.f3142d = null;
        }
        this.f3147i.set(fragmentManagerState.f3187d);
        String str3 = fragmentManagerState.f3188e;
        if (str3 != null) {
            Fragment fragmentF0 = f0(str3);
            this.f3163y = fragmentF0;
            M(fragmentF0);
        }
        ArrayList arrayList3 = fragmentManagerState.f3189f;
        if (arrayList3 != null) {
            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                this.f3148j.put((String) arrayList3.get(i12), (BackStackState) fragmentManagerState.f3190g.get(i12));
            }
        }
        this.G = new ArrayDeque(fragmentManagerState.f3191h);
    }

    public void i(androidx.fragment.app.a aVar) {
        if (this.f3142d == null) {
            this.f3142d = new ArrayList();
        }
        this.f3142d.add(aVar);
    }

    public Fragment i0(String str) {
        return this.f3141c.h(str);
    }

    public w j(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.f(fragment, str);
        }
        if (I0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        w wVarW = w(fragment);
        fragment.mFragmentManager = this;
        this.f3141c.r(wVarW);
        if (!fragment.mDetached) {
            this.f3141c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (J0(fragment)) {
                this.H = true;
            }
        }
        return wVarW;
    }

    public Fragment j0(String str) {
        return this.f3141c.i(str);
    }

    public Bundle j1() {
        BackStackRecordState[] backStackRecordStateArr;
        int size;
        Bundle bundle = new Bundle();
        m0();
        Y();
        b0(true);
        this.I = true;
        this.P.q(true);
        ArrayList arrayListY = this.f3141c.y();
        ArrayList arrayListM = this.f3141c.m();
        if (!arrayListM.isEmpty()) {
            ArrayList arrayListZ = this.f3141c.z();
            ArrayList arrayList = this.f3142d;
            int i10 = 0;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                backStackRecordStateArr = null;
            } else {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i11 = 0; i11 < size; i11++) {
                    backStackRecordStateArr[i11] = new BackStackRecordState((androidx.fragment.app.a) this.f3142d.get(i11));
                    if (I0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i11 + ": " + this.f3142d.get(i11));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f3184a = arrayListY;
            fragmentManagerState.f3185b = arrayListZ;
            fragmentManagerState.f3186c = backStackRecordStateArr;
            fragmentManagerState.f3187d = this.f3147i.get();
            Fragment fragment = this.f3163y;
            if (fragment != null) {
                fragmentManagerState.f3188e = fragment.mWho;
            }
            fragmentManagerState.f3189f.addAll(this.f3148j.keySet());
            fragmentManagerState.f3190g.addAll(this.f3148j.values());
            fragmentManagerState.f3191h = new ArrayList(this.G);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f3149k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f3149k.get(str));
            }
            int size2 = arrayListM.size();
            while (i10 < size2) {
                Object obj = arrayListM.get(i10);
                i10++;
                FragmentState fragmentState = (FragmentState) obj;
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", fragmentState);
                bundle.putBundle("fragment_" + fragmentState.f3193b, bundle2);
            }
        } else if (I0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public void k(v vVar) {
        this.f3153o.add(vVar);
    }

    public Fragment.SavedState k1(Fragment fragment) {
        w wVarN = this.f3141c.n(fragment.mWho);
        if (wVarN == null || !wVarN.k().equals(fragment)) {
            s1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return wVarN.r();
    }

    public void l(Fragment fragment) {
        this.P.f(fragment);
    }

    public void l1() {
        synchronized (this.f3139a) {
            try {
                if (this.f3139a.size() == 1) {
                    this.f3160v.g().removeCallbacks(this.R);
                    this.f3160v.g().post(this.R);
                    t1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int m() {
        return this.f3147i.getAndIncrement();
    }

    public final void m0() {
        Iterator it = u().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).k();
        }
    }

    public void m1(Fragment fragment, boolean z10) {
        ViewGroup viewGroupS0 = s0(fragment);
        if (viewGroupS0 == null || !(viewGroupS0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupS0).setDrawDisappearingViewsLast(!z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void n(androidx.fragment.app.l lVar, androidx.fragment.app.i iVar, Fragment fragment) {
        String str;
        if (this.f3160v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f3160v = lVar;
        this.f3161w = iVar;
        this.f3162x = fragment;
        if (fragment != null) {
            k(new g(fragment));
        } else if (lVar instanceof v) {
            k((v) lVar);
        }
        if (this.f3162x != null) {
            t1();
        }
        if (lVar instanceof androidx.activity.q) {
            androidx.activity.q qVar = (androidx.activity.q) lVar;
            OnBackPressedDispatcher onBackPressedDispatcher = qVar.getOnBackPressedDispatcher();
            this.f3145g = onBackPressedDispatcher;
            androidx.lifecycle.n nVar = qVar;
            if (fragment != null) {
                nVar = fragment;
            }
            onBackPressedDispatcher.h(nVar, this.f3146h);
        }
        if (fragment != null) {
            this.P = fragment.mFragmentManager.p0(fragment);
        } else if (lVar instanceof j0) {
            this.P = u.l(((j0) lVar).getViewModelStore());
        } else {
            this.P = new u(false);
        }
        this.P.q(P0());
        this.f3141c.A(this.P);
        Object obj = this.f3160v;
        if ((obj instanceof t1.d) && fragment == null) {
            androidx.savedstate.a savedStateRegistry = ((t1.d) obj).getSavedStateRegistry();
            savedStateRegistry.h("android:support:fragments", new a.c() { // from class: androidx.fragment.app.s
                @Override // androidx.savedstate.a.c
                public final Bundle a() {
                    return this.f3348a.j1();
                }
            });
            Bundle bundleB = savedStateRegistry.b("android:support:fragments");
            if (bundleB != null) {
                h1(bundleB);
            }
        }
        Object obj2 = this.f3160v;
        if (obj2 instanceof androidx.activity.result.c) {
            ActivityResultRegistry activityResultRegistry = ((androidx.activity.result.c) obj2).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.D = activityResultRegistry.j(str2 + "StartActivityForResult", new b.c(), new h());
            this.E = activityResultRegistry.j(str2 + "StartIntentSenderForResult", new j(), new i());
            this.F = activityResultRegistry.j(str2 + "RequestPermissions", new b.b(), new a());
        }
        Object obj3 = this.f3160v;
        if (obj3 instanceof h0.b) {
            ((h0.b) obj3).addOnConfigurationChangedListener(this.f3154p);
        }
        Object obj4 = this.f3160v;
        if (obj4 instanceof h0.c) {
            ((h0.c) obj4).addOnTrimMemoryListener(this.f3155q);
        }
        Object obj5 = this.f3160v;
        if (obj5 instanceof f0.q) {
            ((f0.q) obj5).addOnMultiWindowModeChangedListener(this.f3156r);
        }
        Object obj6 = this.f3160v;
        if (obj6 instanceof f0.r) {
            ((f0.r) obj6).addOnPictureInPictureModeChangedListener(this.f3157s);
        }
        Object obj7 = this.f3160v;
        if ((obj7 instanceof androidx.core.view.u) && fragment == null) {
            ((androidx.core.view.u) obj7).addMenuProvider(this.f3158t);
        }
    }

    public final boolean n0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f3139a) {
            if (this.f3139a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f3139a.size();
                boolean zA = false;
                for (int i10 = 0; i10 < size; i10++) {
                    zA |= ((k) this.f3139a.get(i10)).a(arrayList, arrayList2);
                }
                return zA;
            } finally {
                this.f3139a.clear();
                this.f3160v.g().removeCallbacks(this.R);
            }
        }
    }

    public void n1(Fragment fragment, Lifecycle.State state) {
        if (fragment.equals(f0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void o(Fragment fragment) {
        if (I0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f3141c.a(fragment);
            if (I0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (J0(fragment)) {
                this.H = true;
            }
        }
    }

    public int o0() {
        ArrayList arrayList = this.f3142d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void o1(Fragment fragment) {
        if (fragment == null || (fragment.equals(f0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f3163y;
            this.f3163y = fragment;
            M(fragment2);
            M(this.f3163y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public z p() {
        return new androidx.fragment.app.a(this);
    }

    public final u p0(Fragment fragment) {
        return this.P.k(fragment);
    }

    public final void p1(Fragment fragment) {
        ViewGroup viewGroupS0 = s0(fragment);
        if (viewGroupS0 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        int i10 = g1.b.visible_removing_fragment_view_tag;
        if (viewGroupS0.getTag(i10) == null) {
            viewGroupS0.setTag(i10, fragment);
        }
        ((Fragment) viewGroupS0.getTag(i10)).setPopDirection(fragment.getPopDirection());
    }

    public boolean q() {
        boolean zJ0 = false;
        for (Fragment fragment : this.f3141c.l()) {
            if (fragment != null) {
                zJ0 = J0(fragment);
            }
            if (zJ0) {
                return true;
            }
        }
        return false;
    }

    public androidx.fragment.app.i q0() {
        return this.f3161w;
    }

    public void q1(Fragment fragment) {
        if (I0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final void r() {
        if (P0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public Fragment r0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentF0 = f0(string);
        if (fragmentF0 == null) {
            s1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragmentF0;
    }

    public final void r1() {
        Iterator it = this.f3141c.k().iterator();
        while (it.hasNext()) {
            W0((w) it.next());
        }
    }

    public final void s() {
        this.f3140b = false;
        this.N.clear();
        this.M.clear();
    }

    public final ViewGroup s0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f3161w.d()) {
            View viewC = this.f3161w.c(fragment.mContainerId);
            if (viewC instanceof ViewGroup) {
                return (ViewGroup) viewC;
            }
        }
        return null;
    }

    public final void s1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new e0("FragmentManager"));
        androidx.fragment.app.l lVar = this.f3160v;
        if (lVar != null) {
            try {
                lVar.h("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            X("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    public final void t() {
        androidx.fragment.app.l lVar = this.f3160v;
        if (lVar instanceof j0 ? this.f3141c.p().o() : lVar.f() instanceof Activity ? !((Activity) this.f3160v.f()).isChangingConfigurations() : true) {
            Iterator it = this.f3148j.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((BackStackState) it.next()).f3087a.iterator();
                while (it2.hasNext()) {
                    this.f3141c.p().h((String) it2.next());
                }
            }
        }
    }

    public androidx.fragment.app.k t0() {
        androidx.fragment.app.k kVar = this.f3164z;
        if (kVar != null) {
            return kVar;
        }
        Fragment fragment = this.f3162x;
        return fragment != null ? fragment.mFragmentManager.t0() : this.A;
    }

    public final void t1() {
        synchronized (this.f3139a) {
            try {
                if (this.f3139a.isEmpty()) {
                    this.f3146h.j(o0() > 0 && N0(this.f3162x));
                } else {
                    this.f3146h.j(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f3162x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f3162x)));
            sb.append("}");
        } else {
            androidx.fragment.app.l lVar = this.f3160v;
            if (lVar != null) {
                sb.append(lVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f3160v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final Set u() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f3141c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((w) it.next()).k().mContainer;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.o(viewGroup, A0()));
            }
        }
        return hashSet;
    }

    public List u0() {
        return this.f3141c.o();
    }

    public final Set v(ArrayList arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            ArrayList arrayList2 = ((androidx.fragment.app.a) arrayList.get(i10)).f3393c;
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                Fragment fragment = ((z.a) obj).f3411b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(SpecialEffectsController.n(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    public androidx.fragment.app.l v0() {
        return this.f3160v;
    }

    public w w(Fragment fragment) {
        w wVarN = this.f3141c.n(fragment.mWho);
        if (wVarN != null) {
            return wVarN;
        }
        w wVar = new w(this.f3152n, this.f3141c, fragment);
        wVar.o(this.f3160v.f().getClassLoader());
        wVar.u(this.f3159u);
        return wVar;
    }

    public LayoutInflater.Factory2 w0() {
        return this.f3144f;
    }

    public void x(Fragment fragment) {
        if (I0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (I0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f3141c.u(fragment);
            if (J0(fragment)) {
                this.H = true;
            }
            p1(fragment);
        }
    }

    public n x0() {
        return this.f3152n;
    }

    public void y() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        T(4);
    }

    public Fragment y0() {
        return this.f3162x;
    }

    public void z() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        T(0);
    }

    public Fragment z0() {
        return this.f3163y;
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public String f3168a;

        /* renamed from: b, reason: collision with root package name */
        public int f3169b;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i10) {
                return new LaunchedFragmentInfo[i10];
            }
        }

        public LaunchedFragmentInfo(String str, int i10) {
            this.f3168a = str;
            this.f3169b = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f3168a);
            parcel.writeInt(this.f3169b);
        }

        public LaunchedFragmentInfo(Parcel parcel) {
            this.f3168a = parcel.readString();
            this.f3169b = parcel.readInt();
        }
    }
}
