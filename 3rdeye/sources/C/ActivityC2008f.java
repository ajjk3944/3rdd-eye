package c;

import A9.I;
import C.T;
import C.V;
import C.g0;
import D1.c;
import H6.P;
import L0.C0781l;
import L0.InterfaceC0778i;
import L0.InterfaceC0783n;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.C1761n;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.C1780m;
import androidx.lifecycle.C1791y;
import androidx.lifecycle.InterfaceC1777j;
import androidx.lifecycle.InterfaceC1788v;
import androidx.lifecycle.InterfaceC1790x;
import androidx.lifecycle.O;
import androidx.lifecycle.U;
import androidx.lifecycle.X;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import b9.C2001h;
import b9.InterfaceC2000g;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import d.C4253a;
import e.AbstractC4292c;
import e.AbstractC4294e;
import e.C4299j;
import e.InterfaceC4291b;
import e.InterfaceC4298i;
import f.AbstractC4328a;
import j1.AbstractC5165a;
import j1.C5166b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p9.InterfaceC5480a;
import y0.C5788a;
import z0.InterfaceC5850c;
import z0.InterfaceC5851d;

/* compiled from: ComponentActivity.kt */
/* renamed from: c.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ActivityC2008f extends y0.h implements j0, InterfaceC1777j, D1.e, InterfaceC2025w, InterfaceC4298i, InterfaceC5850c, InterfaceC5851d, y0.t, y0.u, InterfaceC0778i {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final c Companion = new c();
    private i0 _viewModelStore;
    private final AbstractC4294e activityResultRegistry;
    private int contentLayoutId;
    private final C4253a contextAwareHelper;
    private final InterfaceC2000g defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final InterfaceC2000g fullyDrawnReporter$delegate;
    private final C0781l menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final InterfaceC2000g onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<K0.b<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<K0.b<y0.j>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<K0.b<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<K0.b<y0.w>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<K0.b<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final e reportFullyDrawnExecutor;
    private final D1.d savedStateRegistryController;

    /* compiled from: ComponentActivity.kt */
    /* renamed from: c.f$a */
    public static final class a implements InterfaceC1788v {
        public a() {
        }

        @Override // androidx.lifecycle.InterfaceC1788v
        public final void c(InterfaceC1790x interfaceC1790x, AbstractC1781n.a aVar) {
            ActivityC2008f activityC2008f = ActivityC2008f.this;
            activityC2008f.ensureViewModelStore();
            activityC2008f.getLifecycle().removeObserver(this);
        }
    }

    /* compiled from: ComponentActivity.kt */
    /* renamed from: c.f$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f18273a = new b();

        public final OnBackInvokedDispatcher a(Activity activity) {
            kotlin.jvm.internal.l.f(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            kotlin.jvm.internal.l.e(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    /* compiled from: ComponentActivity.kt */
    /* renamed from: c.f$c */
    public static final class c {
    }

    /* compiled from: ComponentActivity.kt */
    /* renamed from: c.f$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public Object f18274a;

        /* renamed from: b, reason: collision with root package name */
        public i0 f18275b;
    }

    /* compiled from: ComponentActivity.kt */
    /* renamed from: c.f$e */
    public interface e extends Executor {
        void d();

        void k0(View view);
    }

    /* compiled from: ComponentActivity.kt */
    /* renamed from: c.f$f, reason: collision with other inner class name */
    public final class ViewTreeObserverOnDrawListenerC0276f implements e, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final long f18276b = SystemClock.uptimeMillis() + 10000;

        /* renamed from: c, reason: collision with root package name */
        public Runnable f18277c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f18278d;

        public ViewTreeObserverOnDrawListenerC0276f() {
        }

        @Override // c.ActivityC2008f.e
        public final void d() {
            ActivityC2008f activityC2008f = ActivityC2008f.this;
            activityC2008f.getWindow().getDecorView().removeCallbacks(this);
            activityC2008f.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            kotlin.jvm.internal.l.f(runnable, "runnable");
            this.f18277c = runnable;
            View decorView = ActivityC2008f.this.getWindow().getDecorView();
            kotlin.jvm.internal.l.e(decorView, "window.decorView");
            if (!this.f18278d) {
                decorView.postOnAnimation(new V(this, 8));
            } else if (kotlin.jvm.internal.l.b(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // c.ActivityC2008f.e
        public final void k0(View view) {
            if (this.f18278d) {
                return;
            }
            this.f18278d = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            boolean z10;
            Runnable runnable = this.f18277c;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f18276b) {
                    this.f18278d = false;
                    ActivityC2008f.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f18277c = null;
            C2019q fullyDrawnReporter = ActivityC2008f.this.getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f18294a) {
                z10 = fullyDrawnReporter.f18295b;
            }
            if (z10) {
                this.f18278d = false;
                ActivityC2008f.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityC2008f.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* compiled from: ComponentActivity.kt */
    /* renamed from: c.f$g */
    public static final class g extends AbstractC4294e {
        public g() {
        }

        @Override // e.AbstractC4294e
        public final void b(int i, AbstractC4328a contract, Object obj) {
            Bundle bundleExtra;
            int i10;
            kotlin.jvm.internal.l.f(contract, "contract");
            ActivityC2008f activityC2008f = ActivityC2008f.this;
            AbstractC4328a.C0451a c0451aB = contract.b(activityC2008f, obj);
            if (c0451aB != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC2009g(this, i, 0, c0451aB));
                return;
            }
            Intent intentA = contract.a(activityC2008f, obj);
            if (intentA.getExtras() != null) {
                Bundle extras = intentA.getExtras();
                kotlin.jvm.internal.l.c(extras);
                if (extras.getClassLoader() == null) {
                    intentA.setExtrasClassLoader(activityC2008f.getClassLoader());
                }
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleExtra = null;
            }
            Bundle bundle = bundleExtra;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C5788a.a(activityC2008f, stringArrayExtra, i);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
                activityC2008f.startActivityForResult(intentA, i, bundle);
                return;
            }
            C4299j c4299j = (C4299j) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                kotlin.jvm.internal.l.c(c4299j);
                i10 = i;
                try {
                    activityC2008f.startIntentSenderForResult(c4299j.f37626b, i10, c4299j.f37627c, c4299j.f37628d, c4299j.f37629e, 0, bundle);
                } catch (IntentSender.SendIntentException e4) {
                    e = e4;
                    new Handler(Looper.getMainLooper()).post(new H2.d(this, i10, e));
                }
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                i10 = i;
            }
        }
    }

    /* compiled from: ComponentActivity.kt */
    /* renamed from: c.f$h */
    public static final class h extends kotlin.jvm.internal.m implements InterfaceC5480a<X> {
        public h() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final X invoke() {
            ActivityC2008f activityC2008f = ActivityC2008f.this;
            return new X(activityC2008f.getApplication(), activityC2008f, activityC2008f.getIntent() != null ? activityC2008f.getIntent().getExtras() : null);
        }
    }

    /* compiled from: ComponentActivity.kt */
    /* renamed from: c.f$i */
    public static final class i extends kotlin.jvm.internal.m implements InterfaceC5480a<C2019q> {
        public i() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C2019q invoke() {
            ActivityC2008f activityC2008f = ActivityC2008f.this;
            return new C2019q(activityC2008f.reportFullyDrawnExecutor, new C2010h(activityC2008f));
        }
    }

    /* compiled from: ComponentActivity.kt */
    /* renamed from: c.f$j */
    public static final class j extends kotlin.jvm.internal.m implements InterfaceC5480a<C2023u> {
        public j() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C2023u invoke() {
            ActivityC2008f activityC2008f = ActivityC2008f.this;
            C2023u c2023u = new C2023u(new g0(activityC2008f, 14));
            if (Build.VERSION.SDK_INT >= 33) {
                if (!kotlin.jvm.internal.l.b(Looper.myLooper(), Looper.getMainLooper())) {
                    new Handler(Looper.getMainLooper()).post(new T(14, activityC2008f, c2023u));
                    return c2023u;
                }
                activityC2008f.addObserverForBackInvoker(c2023u);
            }
            return c2023u;
        }
    }

    public ActivityC2008f() {
        this.contextAwareHelper = new C4253a();
        this.menuHostHelper = new C0781l(new B.b(this, 14));
        D1.d dVar = new D1.d(this);
        this.savedStateRegistryController = dVar;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter$delegate = C2001h.b(new i());
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new g();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i10 = 1;
        getLifecycle().addObserver(new C1780m(this, i10));
        getLifecycle().addObserver(new P(this, i10));
        getLifecycle().addObserver(new a());
        dVar.a();
        U.b(this);
        if (Build.VERSION.SDK_INT <= 23) {
            getLifecycle().addObserver(new C2020r(this));
        }
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new c.b() { // from class: c.d
            @Override // D1.c.b
            public final Bundle a() {
                return ActivityC2008f._init_$lambda$4(this.f18269a);
            }
        });
        addOnContextAvailableListener(new C1761n(this, 1));
        this.defaultViewModelProviderFactory$delegate = C2001h.b(new h());
        this.onBackPressedDispatcher$delegate = C2001h.b(new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ActivityC2008f this$0, InterfaceC1790x interfaceC1790x, AbstractC1781n.a event) {
        Window window;
        View viewPeekDecorView;
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(interfaceC1790x, "<anonymous parameter 0>");
        kotlin.jvm.internal.l.f(event, "event");
        if (event != AbstractC1781n.a.ON_STOP || (window = this$0.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(ActivityC2008f this$0, InterfaceC1790x interfaceC1790x, AbstractC1781n.a event) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(interfaceC1790x, "<anonymous parameter 0>");
        kotlin.jvm.internal.l.f(event, "event");
        if (event == AbstractC1781n.a.ON_DESTROY) {
            this$0.contextAwareHelper.f37191b = null;
            if (!this$0.isChangingConfigurations()) {
                this$0.getViewModelStore().a();
            }
            this$0.reportFullyDrawnExecutor.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$4(ActivityC2008f this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        Bundle bundle = new Bundle();
        AbstractC4294e abstractC4294e = this$0.activityResultRegistry;
        abstractC4294e.getClass();
        LinkedHashMap linkedHashMap = abstractC4294e.f37609b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC4294e.f37611d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(abstractC4294e.f37614g));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(ActivityC2008f this$0, Context it) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(it, "it");
        Bundle bundleA = this$0.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            AbstractC4294e abstractC4294e = this$0.activityResultRegistry;
            abstractC4294e.getClass();
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                abstractC4294e.f37611d.addAll(stringArrayList2);
            }
            Bundle bundle = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = abstractC4294e.f37614g;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                String str = stringArrayList.get(i10);
                LinkedHashMap linkedHashMap = abstractC4294e.f37609b;
                boolean zContainsKey = linkedHashMap.containsKey(str);
                LinkedHashMap linkedHashMap2 = abstractC4294e.f37608a;
                if (zContainsKey) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle2.containsKey(str)) {
                        kotlin.jvm.internal.z.a(linkedHashMap2);
                        linkedHashMap2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i10);
                kotlin.jvm.internal.l.e(num2, "rcs[i]");
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i10);
                kotlin.jvm.internal.l.e(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                linkedHashMap.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(final C2023u c2023u) {
        getLifecycle().addObserver(new InterfaceC1788v(this) { // from class: c.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ActivityC2008f f18271c;

            {
                this.f18271c = this;
            }

            @Override // androidx.lifecycle.InterfaceC1788v
            public final void c(InterfaceC1790x interfaceC1790x, AbstractC1781n.a aVar) {
                ActivityC2008f.addObserverForBackInvoker$lambda$7(c2023u, this.f18271c, interfaceC1790x, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$7(C2023u dispatcher, ActivityC2008f this$0, InterfaceC1790x interfaceC1790x, AbstractC1781n.a event) {
        kotlin.jvm.internal.l.f(dispatcher, "$dispatcher");
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(interfaceC1790x, "<anonymous parameter 0>");
        kotlin.jvm.internal.l.f(event, "event");
        if (event == AbstractC1781n.a.ON_CREATE) {
            OnBackInvokedDispatcher invoker = b.f18273a.a(this$0);
            kotlin.jvm.internal.l.f(invoker, "invoker");
            dispatcher.f18312e = invoker;
            dispatcher.e(dispatcher.f18314g);
        }
    }

    private final e createFullyDrawnExecutor() {
        return new ViewTreeObserverOnDrawListenerC0276f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this._viewModelStore = dVar.f18275b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new i0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void menuHostHelper$lambda$0(ActivityC2008f this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        this$0.invalidateMenu();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l.e(decorView, "window.decorView");
        eVar.k0(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // L0.InterfaceC0778i
    public void addMenuProvider(InterfaceC0783n provider) {
        kotlin.jvm.internal.l.f(provider, "provider");
        C0781l c0781l = this.menuHostHelper;
        c0781l.f3922b.add(provider);
        c0781l.f3921a.run();
    }

    @Override // z0.InterfaceC5850c
    public final void addOnConfigurationChangedListener(K0.b<Configuration> listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(d.b listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        C4253a c4253a = this.contextAwareHelper;
        c4253a.getClass();
        ActivityC2008f activityC2008f = c4253a.f37191b;
        if (activityC2008f != null) {
            listener.a(activityC2008f);
        }
        c4253a.f37190a.add(listener);
    }

    @Override // y0.t
    public final void addOnMultiWindowModeChangedListener(K0.b<y0.j> listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(K0.b<Intent> listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // y0.u
    public final void addOnPictureInPictureModeChangedListener(K0.b<y0.w> listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // z0.InterfaceC5851d
    public final void addOnTrimMemoryListener(K0.b<Integer> listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // e.InterfaceC4298i
    public final AbstractC4294e getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC1777j
    public AbstractC5165a getDefaultViewModelCreationExtras() {
        C5166b c5166b = new C5166b(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c5166b.f42676a;
        if (application != null) {
            e0.a aVar = e0.f16144d;
            Application application2 = getApplication();
            kotlin.jvm.internal.l.e(application2, "application");
            linkedHashMap.put(aVar, application2);
        }
        linkedHashMap.put(U.f16101a, this);
        linkedHashMap.put(U.f16102b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(U.f16103c, extras);
        }
        return c5166b;
    }

    public f0 getDefaultViewModelProviderFactory() {
        return (f0) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public C2019q getFullyDrawnReporter() {
        return (C2019q) this.fullyDrawnReporter$delegate.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        d dVar = (d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.f18274a;
        }
        return null;
    }

    @Override // y0.h, androidx.lifecycle.InterfaceC1790x
    public AbstractC1781n getLifecycle() {
        return super.getLifecycle();
    }

    @Override // c.InterfaceC2025w
    public final C2023u getOnBackPressedDispatcher() {
        return (C2023u) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // D1.e
    public final D1.c getSavedStateRegistry() {
        return this.savedStateRegistryController.f1029b;
    }

    @Override // androidx.lifecycle.j0
    public i0 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        i0 i0Var = this._viewModelStore;
        kotlin.jvm.internal.l.c(i0Var);
        return i0Var;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l.e(decorView, "window.decorView");
        B7.d.A(decorView, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.l.e(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.l.e(decorView3, "window.decorView");
        I.A(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.l.e(decorView4, "window.decorView");
        A2.l.D(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.l.e(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.activityResultRegistry.a(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        getOnBackPressedDispatcher().d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.l.f(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<K0.b<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // y0.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.b(bundle);
        C4253a c4253a = this.contextAwareHelper;
        c4253a.getClass();
        c4253a.f37191b = this;
        Iterator it = c4253a.f37190a.iterator();
        while (it.hasNext()) {
            ((d.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i10 = O.f16088c;
        O.a.b(this);
        int i11 = this.contentLayoutId;
        if (i11 != 0) {
            setContentView(i11);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        kotlin.jvm.internal.l.f(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        C0781l c0781l = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<InterfaceC0783n> it = c0781l.f3922b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem item) {
        kotlin.jvm.internal.l.f(item, "item");
        if (super.onMenuItemSelected(i10, item)) {
            return true;
        }
        if (i10 == 0) {
            Iterator<InterfaceC0783n> it = this.menuHostHelper.f3922b.iterator();
            while (it.hasNext()) {
                if (it.next().a(item)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<K0.b<y0.j>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new y0.j(z10));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.l.f(intent, "intent");
        super.onNewIntent(intent);
        Iterator<K0.b<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        kotlin.jvm.internal.l.f(menu, "menu");
        Iterator<InterfaceC0783n> it = this.menuHostHelper.f3922b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<K0.b<y0.w>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new y0.w(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        kotlin.jvm.internal.l.f(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        Iterator<InterfaceC0783n> it = this.menuHostHelper.f3922b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.l.f(permissions, "permissions");
        kotlin.jvm.internal.l.f(grantResults, "grantResults");
        if (this.activityResultRegistry.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i10, permissions, grantResults);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        i0 i0Var = this._viewModelStore;
        if (i0Var == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            i0Var = dVar.f18275b;
        }
        if (i0Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.f18274a = objOnRetainCustomNonConfigurationInstance;
        dVar2.f18275b = i0Var;
        return dVar2;
    }

    @Override // y0.h, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.l.f(outState, "outState");
        if (getLifecycle() instanceof C1791y) {
            AbstractC1781n lifecycle = getLifecycle();
            kotlin.jvm.internal.l.d(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C1791y) lifecycle).f(AbstractC1781n.b.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.c(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<K0.b<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.f37191b;
    }

    public final <I, O> AbstractC4292c<I> registerForActivityResult(AbstractC4328a<I, O> contract, AbstractC4294e registry, InterfaceC4291b<O> callback) {
        kotlin.jvm.internal.l.f(contract, "contract");
        kotlin.jvm.internal.l.f(registry, "registry");
        kotlin.jvm.internal.l.f(callback, "callback");
        return registry.c("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // L0.InterfaceC0778i
    public void removeMenuProvider(InterfaceC0783n provider) {
        kotlin.jvm.internal.l.f(provider, "provider");
        this.menuHostHelper.a(provider);
    }

    @Override // z0.InterfaceC5850c
    public final void removeOnConfigurationChangedListener(K0.b<Configuration> listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(d.b listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        C4253a c4253a = this.contextAwareHelper;
        c4253a.getClass();
        c4253a.f37190a.remove(listener);
    }

    @Override // y0.t
    public final void removeOnMultiWindowModeChangedListener(K0.b<y0.j> listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(K0.b<Intent> listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // y0.u
    public final void removeOnPictureInPictureModeChangedListener(K0.b<y0.w> listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // z0.InterfaceC5851d
    public final void removeOnTrimMemoryListener(K0.b<Integer> listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (J1.a.b()) {
                Trace.beginSection(J1.a.d("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().a();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l.e(decorView, "window.decorView");
        eVar.k0(decorView);
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10) {
        kotlin.jvm.internal.l.f(intent, "intent");
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.l.f(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        kotlin.jvm.internal.l.f(intent, "intent");
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.l.f(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13, bundle);
    }

    public final <I, O> AbstractC4292c<I> registerForActivityResult(AbstractC4328a<I, O> contract, InterfaceC4291b<O> callback) {
        kotlin.jvm.internal.l.f(contract, "contract");
        kotlin.jvm.internal.l.f(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration newConfig) {
        kotlin.jvm.internal.l.f(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<K0.b<y0.j>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new y0.j(z10));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration newConfig) {
        kotlin.jvm.internal.l.f(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<K0.b<y0.w>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new y0.w(z10));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l.e(decorView, "window.decorView");
        eVar.k0(decorView);
        super.setContentView(view);
    }

    public void addMenuProvider(final InterfaceC0783n provider, InterfaceC1790x owner) {
        kotlin.jvm.internal.l.f(provider, "provider");
        kotlin.jvm.internal.l.f(owner, "owner");
        final C0781l c0781l = this.menuHostHelper;
        c0781l.f3922b.add(provider);
        c0781l.f3921a.run();
        AbstractC1781n lifecycle = owner.getLifecycle();
        HashMap map = c0781l.f3923c;
        C0781l.a aVar = (C0781l.a) map.remove(provider);
        if (aVar != null) {
            aVar.f3924a.removeObserver(aVar.f3925b);
            aVar.f3925b = null;
        }
        map.put(provider, new C0781l.a(lifecycle, new InterfaceC1788v() { // from class: L0.k
            @Override // androidx.lifecycle.InterfaceC1788v
            public final void c(InterfaceC1790x interfaceC1790x, AbstractC1781n.a aVar2) {
                C0781l c0781l2 = c0781l;
                c0781l2.getClass();
                if (aVar2 == AbstractC1781n.a.ON_DESTROY) {
                    c0781l2.a(provider);
                }
            }
        }));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l.e(decorView, "window.decorView");
        eVar.k0(decorView);
        super.setContentView(view, layoutParams);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(final InterfaceC0783n provider, InterfaceC1790x owner, final AbstractC1781n.b state) {
        kotlin.jvm.internal.l.f(provider, "provider");
        kotlin.jvm.internal.l.f(owner, "owner");
        kotlin.jvm.internal.l.f(state, "state");
        final C0781l c0781l = this.menuHostHelper;
        c0781l.getClass();
        AbstractC1781n lifecycle = owner.getLifecycle();
        HashMap map = c0781l.f3923c;
        C0781l.a aVar = (C0781l.a) map.remove(provider);
        if (aVar != null) {
            aVar.f3924a.removeObserver(aVar.f3925b);
            aVar.f3925b = null;
        }
        map.put(provider, new C0781l.a(lifecycle, new InterfaceC1788v() { // from class: L0.j
            @Override // androidx.lifecycle.InterfaceC1788v
            public final void c(InterfaceC1790x interfaceC1790x, AbstractC1781n.a aVar2) {
                C0781l c0781l2 = c0781l;
                c0781l2.getClass();
                AbstractC1781n.b bVar = state;
                AbstractC1781n.a aVarUpTo = AbstractC1781n.a.upTo(bVar);
                InterfaceC0783n interfaceC0783n = provider;
                Runnable runnable = c0781l2.f3921a;
                CopyOnWriteArrayList<InterfaceC0783n> copyOnWriteArrayList = c0781l2.f3922b;
                if (aVar2 == aVarUpTo) {
                    copyOnWriteArrayList.add(interfaceC0783n);
                    runnable.run();
                } else if (aVar2 == AbstractC1781n.a.ON_DESTROY) {
                    c0781l2.a(interfaceC0783n);
                } else if (aVar2 == AbstractC1781n.a.downFrom(bVar)) {
                    copyOnWriteArrayList.remove(interfaceC0783n);
                    runnable.run();
                }
            }
        }));
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    public ActivityC2008f(int i10) {
        this();
        this.contentLayoutId = i10;
    }
}
