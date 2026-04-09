package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.u;
import androidx.core.view.x;
import androidx.core.view.z;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.b0;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.savedstate.a;
import b.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements androidx.activity.contextaware.a, androidx.lifecycle.n, j0, androidx.lifecycle.g, t1.d, q, androidx.activity.result.c, h0.b, h0.c, f0.q, f0.r, u, m {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;

    @LayoutRes
    private int mContentLayoutId;
    private f0.b mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;

    @NonNull
    final l mFullyDrawnReporter;
    private final AtomicInteger mNextLocalRequestCode;
    private OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<r0.b> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<r0.b> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<r0.b> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<r0.b> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<r0.b> mOnTrimMemoryListeners;
    final f mReportFullyDrawnExecutor;
    final t1.c mSavedStateRegistryController;
    private i0 mViewModelStore;
    final androidx.activity.contextaware.b mContextAwareHelper = new androidx.activity.contextaware.b();
    private final x mMenuHostHelper = new x(new Runnable() { // from class: androidx.activity.c
        @Override // java.lang.Runnable
        public final void run() {
            this.f257a.invalidateMenu();
        }
    });
    private final androidx.lifecycle.p mLifecycleRegistry = new androidx.lifecycle.p(this);

    public class a extends ActivityResultRegistry {

        /* renamed from: androidx.activity.ComponentActivity$a$a, reason: collision with other inner class name */
        public class RunnableC0004a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f218a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a.C0056a f219b;

            public RunnableC0004a(int i10, a.C0056a c0056a) {
                this.f218a = i10;
                this.f219b = c0056a;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.c(this.f218a, this.f219b.a());
            }
        }

        public class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f221a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IntentSender.SendIntentException f222b;

            public b(int i10, IntentSender.SendIntentException sendIntentException) {
                this.f221a = i10;
                this.f222b = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b(this.f221a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f222b));
            }
        }

        public a() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public void f(int i10, b.a aVar, Object obj, f0.c cVar) {
            Bundle bundleB;
            int i11;
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0056a c0056aB = aVar.b(componentActivity, obj);
            if (c0056aB != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0004a(i10, c0056aB));
                return;
            }
            Intent intentA = aVar.a(componentActivity, obj);
            if (intentA.getExtras() != null && intentA.getExtras().getClassLoader() == null) {
                intentA.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleB = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleB = cVar != null ? cVar.b() : null;
            }
            Bundle bundle = bundleB;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                f0.b.d(componentActivity, stringArrayExtra, i10);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
                f0.b.f(componentActivity, intentA, i10, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                i11 = i10;
                try {
                    f0.b.g(componentActivity, intentSenderRequest.getIntentSender(), i11, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle);
                } catch (IntentSender.SendIntentException e10) {
                    e = e10;
                    new Handler(Looper.getMainLooper()).post(new b(i11, e));
                }
            } catch (IntentSender.SendIntentException e11) {
                e = e11;
                i11 = i10;
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            } catch (NullPointerException e11) {
                if (!TextUtils.equals(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e11;
                }
            }
        }
    }

    public static class c {
        public static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    public static class d {
        @DoNotInline
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public Object f225a;

        /* renamed from: b, reason: collision with root package name */
        public i0 f226b;
    }

    public interface f extends Executor {
        void k();

        void n(View view);
    }

    public class g implements f, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: b, reason: collision with root package name */
        public Runnable f228b;

        /* renamed from: a, reason: collision with root package name */
        public final long f227a = SystemClock.uptimeMillis() + 10000;

        /* renamed from: c, reason: collision with root package name */
        public boolean f229c = false;

        public g() {
        }

        public static /* synthetic */ void a(g gVar) {
            Runnable runnable = gVar.f228b;
            if (runnable != null) {
                runnable.run();
                gVar.f228b = null;
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f228b = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.f229c) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.g.a(this.f263a);
                    }
                });
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // androidx.activity.ComponentActivity.f
        public void k() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // androidx.activity.ComponentActivity.f
        public void n(View view) {
            if (this.f229c) {
                return;
            }
            this.f229c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f228b;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f227a) {
                    this.f229c = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f228b = null;
            if (ComponentActivity.this.mFullyDrawnReporter.c()) {
                this.f229c = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public ComponentActivity() {
        t1.c cVarA = t1.c.a(this);
        this.mSavedStateRegistryController = cVarA;
        this.mOnBackPressedDispatcher = null;
        f fVarT = t();
        this.mReportFullyDrawnExecutor = fVarT;
        this.mFullyDrawnReporter = new l(fVarT, new l9.a() { // from class: androidx.activity.d
            @Override // l9.a
            public final Object invoke() {
                return ComponentActivity.s(this.f260a);
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new a();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i10 = Build.VERSION.SDK_INT;
        getLifecycle().a(new androidx.lifecycle.j() { // from class: androidx.activity.ComponentActivity.2
            @Override // androidx.lifecycle.j
            public void onStateChanged(androidx.lifecycle.n nVar, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        c.a(viewPeekDecorView);
                    }
                }
            }
        });
        getLifecycle().a(new androidx.lifecycle.j() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.j
            public void onStateChanged(androidx.lifecycle.n nVar, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ComponentActivity.this.mContextAwareHelper.b();
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.getViewModelStore().a();
                    }
                    ComponentActivity.this.mReportFullyDrawnExecutor.k();
                }
            }
        });
        getLifecycle().a(new androidx.lifecycle.j() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.j
            public void onStateChanged(androidx.lifecycle.n nVar, Lifecycle.Event event) {
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().d(this);
            }
        });
        cVarA.c();
        SavedStateHandleSupport.c(this);
        if (i10 <= 23) {
            getLifecycle().a(new ImmLeaksCleaner(this));
        }
        getSavedStateRegistry().h(ACTIVITY_RESULT_TAG, new a.c() { // from class: androidx.activity.e
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                return ComponentActivity.r(this.f261a);
            }
        });
        addOnContextAvailableListener(new androidx.activity.contextaware.d() { // from class: androidx.activity.f
            @Override // androidx.activity.contextaware.d
            public final void a(Context context) {
                ComponentActivity.q(this.f262a, context);
            }
        });
    }

    public static /* synthetic */ void q(ComponentActivity componentActivity, Context context) {
        Bundle bundleB = componentActivity.getSavedStateRegistry().b(ACTIVITY_RESULT_TAG);
        if (bundleB != null) {
            componentActivity.mActivityResultRegistry.g(bundleB);
        }
    }

    public static /* synthetic */ Bundle r(ComponentActivity componentActivity) {
        componentActivity.getClass();
        Bundle bundle = new Bundle();
        componentActivity.mActivityResultRegistry.h(bundle);
        return bundle;
    }

    public static /* synthetic */ y8.s s(ComponentActivity componentActivity) {
        componentActivity.reportFullyDrawn();
        return null;
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.n(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.u
    public void addMenuProvider(@NonNull z zVar) {
        this.mMenuHostHelper.c(zVar);
    }

    @Override // h0.b
    public final void addOnConfigurationChangedListener(@NonNull r0.b bVar) {
        this.mOnConfigurationChangedListeners.add(bVar);
    }

    public final void addOnContextAvailableListener(@NonNull androidx.activity.contextaware.d dVar) {
        this.mContextAwareHelper.a(dVar);
    }

    @Override // f0.q
    public final void addOnMultiWindowModeChangedListener(@NonNull r0.b bVar) {
        this.mOnMultiWindowModeChangedListeners.add(bVar);
    }

    public final void addOnNewIntentListener(@NonNull r0.b bVar) {
        this.mOnNewIntentListeners.add(bVar);
    }

    @Override // f0.r
    public final void addOnPictureInPictureModeChangedListener(@NonNull r0.b bVar) {
        this.mOnPictureInPictureModeChangedListeners.add(bVar);
    }

    @Override // h0.c
    public final void addOnTrimMemoryListener(@NonNull r0.b bVar) {
        this.mOnTrimMemoryListeners.add(bVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.mViewModelStore = eVar.f226b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new i0();
            }
        }
    }

    @Override // androidx.activity.result.c
    @NonNull
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.g
    @NonNull
    @CallSuper
    public k1.a getDefaultViewModelCreationExtras() {
        k1.d dVar = new k1.d();
        if (getApplication() != null) {
            dVar.c(f0.a.f3513g, getApplication());
        }
        dVar.c(SavedStateHandleSupport.f3472a, this);
        dVar.c(SavedStateHandleSupport.f3473b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            dVar.c(SavedStateHandleSupport.f3474c, getIntent().getExtras());
        }
        return dVar;
    }

    @NonNull
    public f0.b getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new b0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @NonNull
    public l getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Nullable
    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        e eVar = (e) getLastNonConfigurationInstance();
        if (eVar != null) {
            return eVar.f225a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.n
    @NonNull
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.q
    @NonNull
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new b());
            getLifecycle().a(new androidx.lifecycle.j() { // from class: androidx.activity.ComponentActivity.6
                @Override // androidx.lifecycle.j
                public void onStateChanged(androidx.lifecycle.n nVar, Lifecycle.Event event) {
                    if (event != Lifecycle.Event.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                        return;
                    }
                    ComponentActivity.this.mOnBackPressedDispatcher.n(d.a((ComponentActivity) nVar));
                }
            });
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // t1.d
    @NonNull
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    @Override // androidx.lifecycle.j0
    @NonNull
    public i0 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    @CallSuper
    public void initializeViewTreeOwners() {
        k0.a(getWindow().getDecorView(), this);
        l0.a(getWindow().getDecorView(), this);
        t1.e.a(getWindow().getDecorView(), this);
        t.a(getWindow().getDecorView(), this);
        s.a(getWindow().getDecorView(), this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @CallSuper
    @Deprecated
    public void onActivityResult(int i10, int i11, @Nullable Intent intent) {
        if (this.mActivityResultRegistry.b(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    @CallSuper
    @MainThread
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().k();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @CallSuper
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<r0.b> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.d(bundle);
        this.mContextAwareHelper.c(this);
        super.onCreate(bundle);
        ReportFragment.e(this);
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, @NonNull Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.mMenuHostHelper.f(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.mMenuHostHelper.h(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    @CallSuper
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<r0.b> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new f0.m(z10));
        }
    }

    @Override // android.app.Activity
    @CallSuper
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<r0.b> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, @NonNull Menu menu) {
        this.mMenuHostHelper.g(menu);
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<r0.b> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new f0.s(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, @Nullable View view, @NonNull Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.mMenuHostHelper.i(menu);
        return true;
    }

    @Override // android.app.Activity
    @CallSuper
    @Deprecated
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (this.mActivityResultRegistry.b(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Nullable
    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    @Nullable
    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        i0 i0Var = this.mViewModelStore;
        if (i0Var == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            i0Var = eVar.f226b;
        }
        if (i0Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.f225a = objOnRetainCustomNonConfigurationInstance;
        eVar2.f226b = i0Var;
        return eVar2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    @CallSuper
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof androidx.lifecycle.p) {
            ((androidx.lifecycle.p) lifecycle).n(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @CallSuper
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<r0.b> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    @Nullable
    public Context peekAvailableContext() {
        return this.mContextAwareHelper.d();
    }

    @NonNull
    public final <I, O> androidx.activity.result.b registerForActivityResult(@NonNull b.a aVar, @NonNull ActivityResultRegistry activityResultRegistry, @NonNull androidx.activity.result.a aVar2) {
        return activityResultRegistry.i("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aVar, aVar2);
    }

    @Override // androidx.core.view.u
    public void removeMenuProvider(@NonNull z zVar) {
        this.mMenuHostHelper.j(zVar);
    }

    @Override // h0.b
    public final void removeOnConfigurationChangedListener(@NonNull r0.b bVar) {
        this.mOnConfigurationChangedListeners.remove(bVar);
    }

    @Override // androidx.activity.contextaware.a
    public final void removeOnContextAvailableListener(@NonNull androidx.activity.contextaware.d dVar) {
        this.mContextAwareHelper.e(dVar);
    }

    @Override // f0.q
    public final void removeOnMultiWindowModeChangedListener(@NonNull r0.b bVar) {
        this.mOnMultiWindowModeChangedListeners.remove(bVar);
    }

    public final void removeOnNewIntentListener(@NonNull r0.b bVar) {
        this.mOnNewIntentListeners.remove(bVar);
    }

    @Override // f0.r
    public final void removeOnPictureInPictureModeChangedListener(@NonNull r0.b bVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(bVar);
    }

    @Override // h0.c
    public final void removeOnTrimMemoryListener(@NonNull r0.b bVar) {
        this.mOnTrimMemoryListeners.remove(bVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (x1.b.d()) {
                x1.b.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.b();
            x1.b.b();
        } catch (Throwable th) {
            x1.b.b();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@LayoutRes int i10) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.n(getWindow().getDecorView());
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i10, @Nullable Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    public final f t() {
        return new g();
    }

    public void addMenuProvider(@NonNull z zVar, @NonNull androidx.lifecycle.n nVar) {
        this.mMenuHostHelper.d(zVar, nVar);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i10, @Nullable Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i10, @Nullable Intent intent, int i11, int i12, int i13, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NonNull z zVar, @NonNull androidx.lifecycle.n nVar, @NonNull Lifecycle.State state) {
        this.mMenuHostHelper.e(zVar, nVar, state);
    }

    @Override // android.app.Activity
    @RequiresApi(api = 26)
    @CallSuper
    public void onMultiWindowModeChanged(boolean z10, @NonNull Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<r0.b> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new f0.m(z10, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    @RequiresApi(api = 26)
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z10, @NonNull Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<r0.b> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new f0.s(z10, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @NonNull
    public final <I, O> androidx.activity.result.b registerForActivityResult(@NonNull b.a aVar, @NonNull androidx.activity.result.a aVar2) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, aVar2);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.n(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.n(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}
