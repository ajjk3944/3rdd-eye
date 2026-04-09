package androidx.fragment.app;

import C.g0;
import N7.B8;
import N7.C1154e9;
import N7.G8;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.x;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.C1791y;
import androidx.lifecycle.InterfaceC1777j;
import androidx.lifecycle.InterfaceC1788v;
import androidx.lifecycle.InterfaceC1790x;
import androidx.lifecycle.X;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import e.AbstractC4292c;
import e.AbstractC4294e;
import e.C4299j;
import e.InterfaceC4291b;
import e.InterfaceC4298i;
import f.AbstractC4328a;
import g1.C4368b;
import g1.C4370d;
import g1.C4371e;
import g1.C4372f;
import g1.C4374h;
import g1.C4375i;
import g1.C4376j;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j1.AbstractC5165a;
import j1.C5166b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import l1.AbstractC5266a;
import l1.C5267b;
import r.InterfaceC5503a;
import z0.C5848a;

/* compiled from: Fragment.java */
/* renamed from: androidx.fragment.app.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ComponentCallbacksC1759l implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1790x, j0, InterfaceC1777j, D1.e {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    k mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    x mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    f0 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    x mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    AbstractC1766t<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    C1791y mLifecycleRegistry;
    AbstractC1781n.b mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<m> mOnPreAttachedListeners;
    ComponentCallbacksC1759l mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final m mSavedStateAttachListener;
    D1.d mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    ComponentCallbacksC1759l mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    O mViewLifecycleOwner;
    androidx.lifecycle.E<InterfaceC1790x> mViewLifecycleOwnerLiveData;
    String mWho;

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* compiled from: Fragment.java */
    /* renamed from: androidx.fragment.app.l$a */
    public class a<I> extends AbstractC4292c<I> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f15902a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC4328a f15903b;

        public a(AtomicReference atomicReference, AbstractC4328a abstractC4328a) {
            this.f15902a = atomicReference;
            this.f15903b = abstractC4328a;
        }

        @Override // e.AbstractC4292c
        public final AbstractC4328a<I, ?> a() {
            return this.f15903b;
        }

        @Override // e.AbstractC4292c
        public final void c(Object obj) {
            AbstractC4292c abstractC4292c = (AbstractC4292c) this.f15902a.get();
            if (abstractC4292c == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            abstractC4292c.c(obj);
        }

        @Override // e.AbstractC4292c
        public final void d() {
            AbstractC4292c abstractC4292c = (AbstractC4292c) this.f15902a.getAndSet(null);
            if (abstractC4292c != null) {
                abstractC4292c.d();
            }
        }
    }

    /* compiled from: Fragment.java */
    /* renamed from: androidx.fragment.app.l$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentCallbacksC1759l.this.startPostponedEnterTransition();
        }
    }

    /* compiled from: Fragment.java */
    /* renamed from: androidx.fragment.app.l$c */
    public class c extends m {
        public c() {
        }

        @Override // androidx.fragment.app.ComponentCallbacksC1759l.m
        public final void a() {
            ComponentCallbacksC1759l componentCallbacksC1759l = ComponentCallbacksC1759l.this;
            componentCallbacksC1759l.mSavedStateRegistryController.a();
            androidx.lifecycle.U.b(componentCallbacksC1759l);
            Bundle bundle = componentCallbacksC1759l.mSavedFragmentState;
            componentCallbacksC1759l.mSavedStateRegistryController.b(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    /* compiled from: Fragment.java */
    /* renamed from: androidx.fragment.app.l$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentCallbacksC1759l.this.callStartTransitionListener(false);
        }
    }

    /* compiled from: Fragment.java */
    /* renamed from: androidx.fragment.app.l$e */
    public class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ S f15907b;

        public e(S s10) {
            this.f15907b = s10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f15907b.c();
        }
    }

    /* compiled from: Fragment.java */
    /* renamed from: androidx.fragment.app.l$f */
    public class f extends AbstractC1764q {
        public f() {
        }

        @Override // androidx.fragment.app.AbstractC1764q
        public final View b(int i) {
            ComponentCallbacksC1759l componentCallbacksC1759l = ComponentCallbacksC1759l.this;
            View view = componentCallbacksC1759l.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + componentCallbacksC1759l + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC1764q
        public final boolean c() {
            return ComponentCallbacksC1759l.this.mView != null;
        }
    }

    /* compiled from: Fragment.java */
    /* renamed from: androidx.fragment.app.l$g */
    public class g implements InterfaceC1788v {
        public g() {
        }

        @Override // androidx.lifecycle.InterfaceC1788v
        public final void c(InterfaceC1790x interfaceC1790x, AbstractC1781n.a aVar) {
            View view;
            if (aVar != AbstractC1781n.a.ON_STOP || (view = ComponentCallbacksC1759l.this.mView) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    /* compiled from: Fragment.java */
    /* renamed from: androidx.fragment.app.l$h */
    public class h implements InterfaceC5503a<Void, AbstractC4294e> {
        public h() {
        }

        @Override // r.InterfaceC5503a
        public final AbstractC4294e apply(Void r32) {
            ComponentCallbacksC1759l componentCallbacksC1759l = ComponentCallbacksC1759l.this;
            Object obj = componentCallbacksC1759l.mHost;
            return obj instanceof InterfaceC4298i ? ((InterfaceC4298i) obj).getActivityResultRegistry() : componentCallbacksC1759l.requireActivity().getActivityResultRegistry();
        }
    }

    /* compiled from: Fragment.java */
    /* renamed from: androidx.fragment.app.l$i */
    public class i implements InterfaceC5503a<Void, AbstractC4294e> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC4294e f15911a;

        public i(AbstractC4294e abstractC4294e) {
            this.f15911a = abstractC4294e;
        }

        @Override // r.InterfaceC5503a
        public final AbstractC4294e apply(Void r12) {
            return this.f15911a;
        }
    }

    /* compiled from: Fragment.java */
    /* renamed from: androidx.fragment.app.l$j */
    public class j extends m {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5503a f15912a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f15913b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC4328a f15914c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4291b f15915d;

        public j(InterfaceC5503a interfaceC5503a, AtomicReference atomicReference, AbstractC4328a abstractC4328a, InterfaceC4291b interfaceC4291b) {
            this.f15912a = interfaceC5503a;
            this.f15913b = atomicReference;
            this.f15914c = abstractC4328a;
            this.f15915d = interfaceC4291b;
        }

        @Override // androidx.fragment.app.ComponentCallbacksC1759l.m
        public final void a() {
            ComponentCallbacksC1759l componentCallbacksC1759l = ComponentCallbacksC1759l.this;
            this.f15913b.set(((AbstractC4294e) this.f15912a.apply(null)).c(componentCallbacksC1759l.generateActivityResultKey(), componentCallbacksC1759l, this.f15914c, this.f15915d));
        }
    }

    /* compiled from: Fragment.java */
    /* renamed from: androidx.fragment.app.l$k */
    public static class k {

        /* renamed from: a, reason: collision with root package name */
        public boolean f15917a;

        /* renamed from: b, reason: collision with root package name */
        public int f15918b;

        /* renamed from: c, reason: collision with root package name */
        public int f15919c;

        /* renamed from: d, reason: collision with root package name */
        public int f15920d;

        /* renamed from: e, reason: collision with root package name */
        public int f15921e;

        /* renamed from: f, reason: collision with root package name */
        public int f15922f;

        /* renamed from: g, reason: collision with root package name */
        public ArrayList<String> f15923g;

        /* renamed from: h, reason: collision with root package name */
        public ArrayList<String> f15924h;
        public Object i;

        /* renamed from: j, reason: collision with root package name */
        public Object f15925j;

        /* renamed from: k, reason: collision with root package name */
        public Object f15926k;

        /* renamed from: l, reason: collision with root package name */
        public Object f15927l;

        /* renamed from: m, reason: collision with root package name */
        public Object f15928m;

        /* renamed from: n, reason: collision with root package name */
        public Object f15929n;

        /* renamed from: o, reason: collision with root package name */
        public Boolean f15930o;

        /* renamed from: p, reason: collision with root package name */
        public Boolean f15931p;

        /* renamed from: q, reason: collision with root package name */
        public y0.y f15932q;

        /* renamed from: r, reason: collision with root package name */
        public y0.y f15933r;

        /* renamed from: s, reason: collision with root package name */
        public float f15934s;

        /* renamed from: t, reason: collision with root package name */
        public View f15935t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f15936u;
    }

    /* compiled from: Fragment.java */
    /* renamed from: androidx.fragment.app.l$l, reason: collision with other inner class name */
    public static class C0240l extends RuntimeException {
    }

    /* compiled from: Fragment.java */
    /* renamed from: androidx.fragment.app.l$m */
    public static abstract class m {
        public abstract void a();
    }

    /* compiled from: Fragment.java */
    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* renamed from: androidx.fragment.app.l$n */
    public static class n implements Parcelable {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f15937b;

        /* compiled from: Fragment.java */
        /* renamed from: androidx.fragment.app.l$n$a */
        public class a implements Parcelable.ClassLoaderCreator<n> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new n(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new n[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }
        }

        public n(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f15937b = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f15937b);
        }
    }

    public ComponentCallbacksC1759l() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new z();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new b();
        this.mMaxState = AbstractC1781n.b.RESUMED;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.E<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new c();
        initLifecycle();
    }

    private k ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            k kVar = new k();
            kVar.i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            kVar.f15925j = obj;
            kVar.f15926k = null;
            kVar.f15927l = obj;
            kVar.f15928m = null;
            kVar.f15929n = obj;
            kVar.f15932q = null;
            kVar.f15933r = null;
            kVar.f15934s = 1.0f;
            kVar.f15935t = null;
            this.mAnimationInfo = kVar;
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        AbstractC1781n.b bVar = this.mMaxState;
        return (bVar == AbstractC1781n.b.INITIALIZED || this.mParentFragment == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C1791y(this);
        this.mSavedStateRegistryController = new D1.d(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @Deprecated
    public static ComponentCallbacksC1759l instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$performCreateView$0() {
        O o10 = this.mViewLifecycleOwner;
        o10.f15828f.b(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    private <I, O> AbstractC4292c<I> prepareCallInternal(AbstractC4328a<I, O> abstractC4328a, InterfaceC5503a<Void, AbstractC4294e> interfaceC5503a, InterfaceC4291b<O> interfaceC4291b) {
        if (this.mState > 1) {
            throw new IllegalStateException(B8.i("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new j(interfaceC5503a, atomicReference, abstractC4328a, interfaceC4291b));
        return new a(atomicReference, abstractC4328a);
    }

    private void registerOnPreAttachListener(m mVar) {
        if (this.mState >= 0) {
            mVar.a();
        } else {
            this.mOnPreAttachedListeners.add(mVar);
        }
    }

    public void callStartTransitionListener(boolean z10) {
        ViewGroup viewGroup;
        x xVar;
        k kVar = this.mAnimationInfo;
        if (kVar != null) {
            kVar.f15936u = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (xVar = this.mFragmentManager) == null) {
            return;
        }
        S sF = S.f(viewGroup, xVar);
        sF.g();
        if (z10) {
            this.mHost.f15953d.post(new e(sF));
        } else {
            sF.c();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public AbstractC1764q createFragmentContainer() {
        return new f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        ComponentCallbacksC1759l targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            AbstractC5266a.a(this).b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + StringUtils.PROCESS_POSTFIX_DELIMITER);
        this.mChildFragmentManager.u(G8.s(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public ComponentCallbacksC1759l findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f15978c.c(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final ActivityC1762o getActivity() {
        AbstractC1766t<?> abstractC1766t = this.mHost;
        if (abstractC1766t == null) {
            return null;
        }
        return abstractC1766t.f15951b;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f15931p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f15930o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        kVar.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final x getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(B8.i("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        AbstractC1766t<?> abstractC1766t = this.mHost;
        if (abstractC1766t == null) {
            return null;
        }
        return abstractC1766t.f15952c;
    }

    @Override // androidx.lifecycle.InterfaceC1777j
    public AbstractC5165a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && x.G(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C5166b c5166b = new C5166b(0);
        LinkedHashMap linkedHashMap = c5166b.f42676a;
        if (application != null) {
            linkedHashMap.put(e0.f16144d, application);
        }
        linkedHashMap.put(androidx.lifecycle.U.f16101a, this);
        linkedHashMap.put(androidx.lifecycle.U.f16102b, this);
        if (getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.U.f16103c, getArguments());
        }
        return c5166b;
    }

    public f0 getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && x.G(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new X(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f15918b;
    }

    public Object getEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.i;
    }

    public y0.y getEnterTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f15932q;
    }

    public int getExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f15919c;
    }

    public Object getExitTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f15926k;
    }

    public y0.y getExitTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f15933r;
    }

    public View getFocusedView() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f15935t;
    }

    @Deprecated
    public final x getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        AbstractC1766t<?> abstractC1766t = this.mHost;
        if (abstractC1766t == null) {
            return null;
        }
        return abstractC1766t.e();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.InterfaceC1790x
    public AbstractC1781n getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public AbstractC5266a getLoaderManager() {
        return AbstractC5266a.a(this);
    }

    public int getNextTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f15922f;
    }

    public final ComponentCallbacksC1759l getParentFragment() {
        return this.mParentFragment;
    }

    public final x getParentFragmentManager() {
        x xVar = this.mFragmentManager;
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalStateException(B8.i("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f15917a;
    }

    public int getPopEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f15920d;
    }

    public int getPopExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f15921e;
    }

    public float getPostOnViewCreatedAlpha() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 1.0f;
        }
        return kVar.f15934s;
    }

    public Object getReenterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f15927l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        C4368b.C0457b c0457b = C4368b.f37937a;
        C4368b.b(new C4370d(this, "Attempting to get retain instance for fragment " + this));
        C4368b.a(this).getClass();
        C4368b.a aVar = C4368b.a.DETECT_RETAIN_INSTANCE_USAGE;
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f15925j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // D1.e
    public final D1.c getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f1029b;
    }

    public Object getSharedElementEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f15928m;
    }

    public Object getSharedElementReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f15929n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f15923g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f15924h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i10) {
        return getResources().getString(i10);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final ComponentCallbacksC1759l getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        C4368b.C0457b c0457b = C4368b.f37937a;
        C4368b.b(new C4371e(this, "Attempting to get target request code from fragment " + this));
        C4368b.a(this).getClass();
        C4368b.a aVar = C4368b.a.DETECT_TARGET_FRAGMENT_USAGE;
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i10) {
        return getResources().getText(i10);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public InterfaceC1790x getViewLifecycleOwner() {
        O o10 = this.mViewLifecycleOwner;
        if (o10 != null) {
            return o10;
        }
        throw new IllegalStateException(B8.i("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public androidx.lifecycle.C<InterfaceC1790x> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.j0
    public i0 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() == AbstractC1781n.b.INITIALIZED.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap<String, i0> map = this.mFragmentManager.f15974M.f15752d;
        i0 i0Var = map.get(this.mWho);
        if (i0Var != null) {
            return i0Var;
        }
        i0 i0Var2 = new i0();
        map.put(this.mWho, i0Var2);
        return i0Var2;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new z();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        x xVar = this.mFragmentManager;
        if (xVar != null) {
            ComponentCallbacksC1759l componentCallbacksC1759l = this.mParentFragment;
            xVar.getClass();
            if (componentCallbacksC1759l == null ? false : componentCallbacksC1759l.isHidden()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager != null) {
            ComponentCallbacksC1759l componentCallbacksC1759l = this.mParentFragment;
            if (!(componentCallbacksC1759l == null ? true : componentCallbacksC1759l.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    public boolean isPostponed() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f15936u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        x xVar = this.mFragmentManager;
        if (xVar == null) {
            return false;
        }
        return xVar.f15967F || xVar.f15968G;
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.L();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (x.G(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        AbstractC1766t<?> abstractC1766t = this.mHost;
        ActivityC1762o activityC1762o = abstractC1766t == null ? null : abstractC1766t.f15951b;
        if (activityC1762o != null) {
            this.mCalled = false;
            onAttach((Activity) activityC1762o);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        x xVar = this.mChildFragmentManager;
        if (xVar.f15994t >= 1) {
            return;
        }
        xVar.f15967F = false;
        xVar.f15968G = false;
        xVar.f15974M.f15755g = false;
        xVar.t(1);
    }

    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        return null;
    }

    public Animator onCreateAnimator(int i10, boolean z10, int i11) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        AbstractC1766t<?> abstractC1766t = this.mHost;
        ActivityC1762o activityC1762o = abstractC1766t == null ? null : abstractC1766t.f15951b;
        if (activityC1762o != null) {
            this.mCalled = false;
            onInflate((Activity) activityC1762o, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.L();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new U(B8.i("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        x xVar = this.mChildFragmentManager;
        xVar.f15967F = false;
        xVar.f15968G = false;
        xVar.f15974M.f15755g = false;
        xVar.t(4);
    }

    public void performAttach() {
        Iterator<m> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.f15952c);
        if (!this.mCalled) {
            throw new U(B8.i("Fragment ", this, " did not call through to super.onAttach()"));
        }
        Iterator<C> it2 = this.mFragmentManager.f15988n.iterator();
        while (it2.hasNext()) {
            it2.next().a(this);
        }
        x xVar = this.mChildFragmentManager;
        xVar.f15967F = false;
        xVar.f15968G = false;
        xVar.f15974M.f15755g = false;
        xVar.t(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.i(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.L();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.addObserver(new g());
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new U(B8.i("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.d(AbstractC1781n.a.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z10 = true;
        }
        return this.mChildFragmentManager.j(menu, menuInflater) | z10;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.L();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new O(this, getViewModelStore(), new g0(this, 13));
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.f15827e != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (x.G(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        B7.d.A(this.mView, this.mViewLifecycleOwner);
        View view = this.mView;
        O o10 = this.mViewLifecycleOwner;
        kotlin.jvm.internal.l.f(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, o10);
        A9.I.A(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.j(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.k();
        this.mLifecycleRegistry.d(AbstractC1781n.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new U(B8.i("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.t(1);
        if (this.mView != null) {
            O o10 = this.mViewLifecycleOwner;
            o10.b();
            if (o10.f15827e.f16185d.isAtLeast(AbstractC1781n.b.CREATED)) {
                this.mViewLifecycleOwner.a(AbstractC1781n.a.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new U(B8.i("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        m0.j<C5267b.a> jVar = AbstractC5266a.a(this).f43676b.f43684b;
        int i10 = jVar.f44033d;
        for (int i11 = 0; i11 < i10; i11++) {
            ((C5267b.a) jVar.f44032c[i11]).l();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new U(B8.i("Fragment ", this, " did not call through to super.onDetach()"));
        }
        x xVar = this.mChildFragmentManager;
        if (xVar.f15969H) {
            return;
        }
        xVar.k();
        this.mChildFragmentManager = new z();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z10) {
        onMultiWindowModeChanged(z10);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.o(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.p(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.t(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(AbstractC1781n.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.d(AbstractC1781n.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new U(B8.i("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z10) {
        onPictureInPictureModeChanged(z10);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z10 = true;
        }
        return this.mChildFragmentManager.s(menu) | z10;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zJ = x.J(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zJ) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zJ);
            onPrimaryNavigationFragmentChanged(zJ);
            x xVar = this.mChildFragmentManager;
            xVar.b0();
            xVar.q(xVar.f15998x);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.L();
        this.mChildFragmentManager.x(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new U(B8.i("Fragment ", this, " did not call through to super.onResume()"));
        }
        C1791y c1791y = this.mLifecycleRegistry;
        AbstractC1781n.a aVar = AbstractC1781n.a.ON_RESUME;
        c1791y.d(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f15827e.d(aVar);
        }
        x xVar = this.mChildFragmentManager;
        xVar.f15967F = false;
        xVar.f15968G = false;
        xVar.f15974M.f15755g = false;
        xVar.t(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.L();
        this.mChildFragmentManager.x(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new U(B8.i("Fragment ", this, " did not call through to super.onStart()"));
        }
        C1791y c1791y = this.mLifecycleRegistry;
        AbstractC1781n.a aVar = AbstractC1781n.a.ON_START;
        c1791y.d(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f15827e.d(aVar);
        }
        x xVar = this.mChildFragmentManager;
        xVar.f15967F = false;
        xVar.f15968G = false;
        xVar.f15974M.f15755g = false;
        xVar.t(5);
    }

    public void performStop() {
        x xVar = this.mChildFragmentManager;
        xVar.f15968G = true;
        xVar.f15974M.f15755g = true;
        xVar.t(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(AbstractC1781n.a.ON_STOP);
        }
        this.mLifecycleRegistry.d(AbstractC1781n.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new U(B8.i("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.t(2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f15936u = true;
    }

    public final <I, O> AbstractC4292c<I> registerForActivityResult(AbstractC4328a<I, O> abstractC4328a, InterfaceC4291b<O> interfaceC4291b) {
        return prepareCallInternal(abstractC4328a, new h(), interfaceC4291b);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i10) {
        if (this.mHost == null) {
            throw new IllegalStateException(B8.i("Fragment ", this, " not attached to Activity"));
        }
        x parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f15964C == null) {
            parentFragmentManager.f15995u.getClass();
            return;
        }
        parentFragmentManager.f15965D.addLast(new x.l(this.mWho, i10));
        parentFragmentManager.f15964C.c(strArr);
    }

    public final ActivityC1762o requireActivity() {
        ActivityC1762o activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(B8.i("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(B8.i("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(B8.i("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final x requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(B8.i("Fragment ", this, " not attached to a host."));
    }

    public final ComponentCallbacksC1759l requireParentFragment() {
        ComponentCallbacksC1759l parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(B8.i("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(B8.i("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.R(bundle);
        x xVar = this.mChildFragmentManager;
        xVar.f15967F = false;
        xVar.f15968G = false;
        xVar.f15974M.f15755g = false;
        xVar.t(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new U(B8.i("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(AbstractC1781n.a.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f15931p = Boolean.valueOf(z10);
    }

    public void setAllowReturnTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f15930o = Boolean.valueOf(z10);
    }

    public void setAnimations(int i10, int i11, int i12, int i13) {
        if (this.mAnimationInfo == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        ensureAnimationInfo().f15918b = i10;
        ensureAnimationInfo().f15919c = i11;
        ensureAnimationInfo().f15920d = i12;
        ensureAnimationInfo().f15921e = i13;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(y0.y yVar) {
        ensureAnimationInfo().f15932q = yVar;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().i = obj;
    }

    public void setExitSharedElementCallback(y0.y yVar) {
        ensureAnimationInfo().f15933r = yVar;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f15926k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f15935t = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z10) {
        if (this.mHasMenu != z10) {
            this.mHasMenu = z10;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.h();
        }
    }

    public void setInitialSavedState(n nVar) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (nVar == null || (bundle = nVar.f15937b) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z10) {
        if (this.mMenuVisible != z10) {
            this.mMenuVisible = z10;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.h();
            }
        }
    }

    public void setNextTransition(int i10) {
        if (this.mAnimationInfo == null && i10 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f15922f = i10;
    }

    public void setPopDirection(boolean z10) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f15917a = z10;
    }

    public void setPostOnViewCreatedAlpha(float f10) {
        ensureAnimationInfo().f15934s = f10;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f15927l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z10) {
        C4368b.C0457b c0457b = C4368b.f37937a;
        C4368b.b(new C4374h(this, "Attempting to set retain instance for fragment " + this));
        C4368b.a(this).getClass();
        C4368b.a aVar = C4368b.a.DETECT_RETAIN_INSTANCE_USAGE;
        this.mRetainInstance = z10;
        x xVar = this.mFragmentManager;
        if (xVar == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z10) {
            xVar.f15974M.e(this);
        } else {
            xVar.f15974M.i(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f15925j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f15928m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        k kVar = this.mAnimationInfo;
        kVar.f15923g = arrayList;
        kVar.f15924h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f15929n = obj;
    }

    @Deprecated
    public void setTargetFragment(ComponentCallbacksC1759l componentCallbacksC1759l, int i10) {
        if (componentCallbacksC1759l != null) {
            C4368b.C0457b c0457b = C4368b.f37937a;
            C4368b.b(new C4375i(this, "Attempting to set target fragment " + componentCallbacksC1759l + " with request code " + i10 + " for fragment " + this));
            C4368b.a(this).getClass();
            C4368b.a aVar = C4368b.a.DETECT_TARGET_FRAGMENT_USAGE;
        }
        x xVar = this.mFragmentManager;
        x xVar2 = componentCallbacksC1759l != null ? componentCallbacksC1759l.mFragmentManager : null;
        if (xVar != null && xVar2 != null && xVar != xVar2) {
            throw new IllegalArgumentException(B8.i("Fragment ", componentCallbacksC1759l, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (ComponentCallbacksC1759l targetFragment = componentCallbacksC1759l; targetFragment != null; targetFragment = targetFragment.getTargetFragment(false)) {
            if (targetFragment.equals(this)) {
                throw new IllegalArgumentException("Setting " + componentCallbacksC1759l + " as the target of " + this + " would create a target cycle");
            }
        }
        if (componentCallbacksC1759l == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || componentCallbacksC1759l.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = componentCallbacksC1759l;
        } else {
            this.mTargetWho = componentCallbacksC1759l.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i10;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z10) {
        C4368b.C0457b c0457b = C4368b.f37937a;
        C4368b.b(new C4376j(this, "Attempting to set user visible hint to " + z10 + " for fragment " + this));
        C4368b.a(this).getClass();
        C4368b.a aVar = C4368b.a.DETECT_SET_USER_VISIBLE_HINT;
        boolean z11 = false;
        if (!this.mUserVisibleHint && z10 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            x xVar = this.mFragmentManager;
            F f10 = xVar.f(this);
            ComponentCallbacksC1759l componentCallbacksC1759l = f10.f15771c;
            if (componentCallbacksC1759l.mDeferStart) {
                if (xVar.f15977b) {
                    xVar.f15970I = true;
                } else {
                    componentCallbacksC1759l.mDeferStart = false;
                    f10.k();
                }
            }
        }
        this.mUserVisibleHint = z10;
        if (this.mState < 5 && !z10) {
            z11 = true;
        }
        this.mDeferStart = z11;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z10);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        AbstractC1766t<?> abstractC1766t = this.mHost;
        if (abstractC1766t != null) {
            return abstractC1766t.g(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        startActivityForResult(intent, i10, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException(B8.i("Fragment ", this, " not attached to Activity"));
        }
        if (x.G(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i10 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        x parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f15963B == null) {
            AbstractC1766t<?> abstractC1766t = parentFragmentManager.f15995u;
            if (i10 == -1) {
                abstractC1766t.f15951b.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
                return;
            } else {
                abstractC1766t.getClass();
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (x.G(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + this);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        kotlin.jvm.internal.l.f(intentSender, "intentSender");
        C4299j c4299j = new C4299j(intentSender, intent, i11, i12);
        parentFragmentManager.f15965D.addLast(new x.l(this.mWho, i10));
        if (x.G(2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.f15963B.c(c4299j);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f15936u) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f15936u = false;
        } else if (Looper.myLooper() != this.mHost.f15953d.getLooper()) {
            this.mHost.f15953d.postAtFrontOfQueue(new d());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    private ComponentCallbacksC1759l getTargetFragment(boolean z10) {
        String str;
        if (z10) {
            C4368b.C0457b c0457b = C4368b.f37937a;
            C4368b.b(new C4372f(this, "Attempting to get target fragment from fragment " + this));
            C4368b.a(this).getClass();
            C4368b.a aVar = C4368b.a.DETECT_TARGET_FRAGMENT_USAGE;
        }
        ComponentCallbacksC1759l componentCallbacksC1759l = this.mTarget;
        if (componentCallbacksC1759l != null) {
            return componentCallbacksC1759l;
        }
        x xVar = this.mFragmentManager;
        if (xVar == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return xVar.f15978c.b(str);
    }

    @Deprecated
    public static ComponentCallbacksC1759l instantiate(Context context, String str, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            ComponentCallbacksC1759l componentCallbacksC1759lNewInstance = C1765s.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle == null) {
                return componentCallbacksC1759lNewInstance;
            }
            bundle.setClassLoader(componentCallbacksC1759lNewInstance.getClass().getClassLoader());
            componentCallbacksC1759lNewInstance.setArguments(bundle);
            return componentCallbacksC1759lNewInstance;
        } catch (IllegalAccessException e4) {
            throw new C0240l(C1154e9.i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (InstantiationException e10) {
            throw new C0240l(C1154e9.i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (NoSuchMethodException e11) {
            throw new C0240l(C1154e9.i("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e11);
        } catch (InvocationTargetException e12) {
            throw new C0240l(C1154e9.i("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e12);
        }
    }

    public final String getString(int i10, Object... objArr) {
        return getResources().getString(i10, objArr);
    }

    public final void postponeEnterTransition(long j4, TimeUnit timeUnit) {
        ensureAnimationInfo().f15936u = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        x xVar = this.mFragmentManager;
        if (xVar != null) {
            this.mPostponedHandler = xVar.f15995u.f15953d;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j4));
    }

    public final <I, O> AbstractC4292c<I> registerForActivityResult(AbstractC4328a<I, O> abstractC4328a, AbstractC4294e abstractC4294e, InterfaceC4291b<O> interfaceC4291b) {
        return prepareCallInternal(abstractC4328a, new i(abstractC4294e), interfaceC4291b);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        AbstractC1766t<?> abstractC1766t = this.mHost;
        if (abstractC1766t == null) {
            throw new IllegalStateException(B8.i("Fragment ", this, " not attached to Activity"));
        }
        C5848a.startActivity(abstractC1766t.f15952c, intent, bundle);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(B8.i("Fragment ", this, " not attached to Activity"));
        }
        x parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f15962A != null) {
            parentFragmentManager.f15965D.addLast(new x.l(this.mWho, i10));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.f15962A.c(intent);
            return;
        }
        AbstractC1766t<?> abstractC1766t = parentFragmentManager.f15995u;
        if (i10 == -1) {
            C5848a.startActivity(abstractC1766t.f15952c, intent, bundle);
        } else {
            abstractC1766t.getClass();
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AbstractC1766t<?> abstractC1766t = this.mHost;
        if (abstractC1766t != null) {
            LayoutInflater layoutInflaterF = abstractC1766t.f();
            layoutInflaterF.setFactory2(this.mChildFragmentManager.f15981f);
            return layoutInflaterF;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public ComponentCallbacksC1759l(int i10) {
        this();
        this.mContentLayoutId = i10;
    }

    private void restoreViewState() {
        if (x.G(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @Deprecated
    public void onAttachFragment(ComponentCallbacksC1759l componentCallbacksC1759l) {
    }

    public void onHiddenChanged(boolean z10) {
    }

    public void onMultiWindowModeChanged(boolean z10) {
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z10) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z10) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
    }
}
