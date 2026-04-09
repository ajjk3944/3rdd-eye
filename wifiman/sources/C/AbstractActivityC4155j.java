package c;

import F1.C2781x;
import F1.InterfaceC2779w;
import F1.InterfaceC2784z;
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
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.C4018p;
import androidx.lifecycle.InterfaceC4011i;
import androidx.lifecycle.InterfaceC4015m;
import androidx.lifecycle.InterfaceC4017o;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import b2.AbstractC4056a;
import b2.C4057b;
import c.AbstractActivityC4155j;
import e.C5406a;
import e.InterfaceC5407b;
import f.AbstractC5488e;
import f.C5490g;
import f.InterfaceC5489f;
import g.AbstractC5837a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import q2.AbstractC7419g;
import q2.C7416d;
import q2.C7417e;
import q2.InterfaceC7418f;
import s1.AbstractC7874b;
import s1.AbstractC7875c;
import t1.InterfaceC8022b;
import t1.InterfaceC8023c;
import v2.AbstractC8187a;

/* renamed from: c.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC4155j extends s1.g implements InterfaceC4017o, S, InterfaceC4011i, InterfaceC7418f, InterfaceC4141J, InterfaceC5489f, InterfaceC8022b, InterfaceC8023c, s1.o, s1.p, InterfaceC2779w, InterfaceC4136E {

    /* renamed from: v, reason: collision with root package name */
    private static final c f33536v = new c(null);

    /* renamed from: c, reason: collision with root package name */
    private final C5406a f33537c = new C5406a();

    /* renamed from: d, reason: collision with root package name */
    private final C2781x f33538d = new C2781x(new Runnable() { // from class: c.d
        @Override // java.lang.Runnable
        public final void run() {
            AbstractActivityC4155j.o0(this.f33529a);
        }
    });

    /* renamed from: e, reason: collision with root package name */
    private final C7417e f33539e;

    /* renamed from: f, reason: collision with root package name */
    private Q f33540f;

    /* renamed from: g, reason: collision with root package name */
    private final e f33541g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f33542h;

    /* renamed from: i, reason: collision with root package name */
    private int f33543i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicInteger f33544j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC5488e f33545k;

    /* renamed from: l, reason: collision with root package name */
    private final CopyOnWriteArrayList f33546l;

    /* renamed from: m, reason: collision with root package name */
    private final CopyOnWriteArrayList f33547m;

    /* renamed from: n, reason: collision with root package name */
    private final CopyOnWriteArrayList f33548n;

    /* renamed from: o, reason: collision with root package name */
    private final CopyOnWriteArrayList f33549o;

    /* renamed from: p, reason: collision with root package name */
    private final CopyOnWriteArrayList f33550p;

    /* renamed from: q, reason: collision with root package name */
    private final CopyOnWriteArrayList f33551q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f33552r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f33553s;

    /* renamed from: t, reason: collision with root package name */
    private final Yg.m f33554t;

    /* renamed from: u, reason: collision with root package name */
    private final Yg.m f33555u;

    /* renamed from: c.j$a */
    public static final class a implements InterfaceC4015m {
        a() {
        }

        @Override // androidx.lifecycle.InterfaceC4015m
        public void j(InterfaceC4017o source, AbstractC4013k.a event) {
            AbstractC6492s.i(source, "source");
            AbstractC6492s.i(event, "event");
            AbstractActivityC4155j.this.k0();
            AbstractActivityC4155j.this.O().c(this);
        }
    }

    /* renamed from: c.j$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f33557a = new b();

        private b() {
        }

        public final OnBackInvokedDispatcher a(Activity activity) {
            AbstractC6492s.i(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            AbstractC6492s.h(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    /* renamed from: c.j$c */
    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* renamed from: c.j$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private Object f33558a;

        /* renamed from: b, reason: collision with root package name */
        private Q f33559b;

        public final Q a() {
            return this.f33559b;
        }

        public final void b(Object obj) {
            this.f33558a = obj;
        }

        public final void c(Q q10) {
            this.f33559b = q10;
        }
    }

    /* renamed from: c.j$e */
    private interface e extends Executor {
        void P(View view);

        void g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c.j$f */
    final class f implements e, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final long f33560a = SystemClock.uptimeMillis() + 10000;

        /* renamed from: b, reason: collision with root package name */
        private Runnable f33561b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f33562c;

        public f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(f fVar) {
            Runnable runnable = fVar.f33561b;
            if (runnable != null) {
                AbstractC6492s.f(runnable);
                runnable.run();
                fVar.f33561b = null;
            }
        }

        @Override // c.AbstractActivityC4155j.e
        public void P(View view) {
            AbstractC6492s.i(view, "view");
            if (this.f33562c) {
                return;
            }
            this.f33562c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            AbstractC6492s.i(runnable, "runnable");
            this.f33561b = runnable;
            View decorView = AbstractActivityC4155j.this.getWindow().getDecorView();
            AbstractC6492s.h(decorView, "window.decorView");
            if (!this.f33562c) {
                decorView.postOnAnimation(new Runnable() { // from class: c.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC4155j.f.b(this.f33569a);
                    }
                });
            } else if (AbstractC6492s.d(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // c.AbstractActivityC4155j.e
        public void g() {
            AbstractActivityC4155j.this.getWindow().getDecorView().removeCallbacks(this);
            AbstractActivityC4155j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f33561b;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f33560a) {
                    this.f33562c = false;
                    AbstractActivityC4155j.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f33561b = null;
            if (AbstractActivityC4155j.this.l0().c()) {
                this.f33562c = false;
                AbstractActivityC4155j.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractActivityC4155j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* renamed from: c.j$g */
    public static final class g extends AbstractC5488e {
        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(g gVar, int i10, AbstractC5837a.C1765a c1765a) {
            gVar.e(i10, c1765a.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(g gVar, int i10, IntentSender.SendIntentException sendIntentException) {
            gVar.d(i10, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
        }

        @Override // f.AbstractC5488e
        public void h(final int i10, AbstractC5837a contract, Object obj, AbstractC7875c abstractC7875c) {
            Bundle bundle;
            AbstractC6492s.i(contract, "contract");
            AbstractActivityC4155j abstractActivityC4155j = AbstractActivityC4155j.this;
            final AbstractC5837a.C1765a c1765aB = contract.b(abstractActivityC4155j, obj);
            if (c1765aB != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: c.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC4155j.g.p(this.f33570a, i10, c1765aB);
                    }
                });
                return;
            }
            Intent intentA = contract.a(abstractActivityC4155j, obj);
            if (intentA.getExtras() != null) {
                Bundle extras = intentA.getExtras();
                AbstractC6492s.f(extras);
                if (extras.getClassLoader() == null) {
                    intentA.setExtrasClassLoader(abstractActivityC4155j.getClassLoader());
                }
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if (AbstractC6492s.d("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                AbstractC7874b.s(abstractActivityC4155j, stringArrayExtra, i10);
                return;
            }
            if (!AbstractC6492s.d("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentA.getAction())) {
                AbstractC7874b.u(abstractActivityC4155j, intentA, i10, bundle);
                return;
            }
            C5490g c5490g = (C5490g) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                AbstractC6492s.f(c5490g);
                AbstractC7874b.v(abstractActivityC4155j, c5490g.d(), i10, c5490g.a(), c5490g.b(), c5490g.c(), 0, bundle);
            } catch (IntentSender.SendIntentException e10) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: c.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC4155j.g.q(this.f33573a, i10, e10);
                    }
                });
            }
        }
    }

    /* renamed from: c.j$h */
    static final class h extends AbstractC6494u implements InterfaceC6824a {
        h() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.K invoke() {
            Application application = AbstractActivityC4155j.this.getApplication();
            AbstractActivityC4155j abstractActivityC4155j = AbstractActivityC4155j.this;
            return new androidx.lifecycle.K(application, abstractActivityC4155j, abstractActivityC4155j.getIntent() != null ? AbstractActivityC4155j.this.getIntent().getExtras() : null);
        }
    }

    /* renamed from: c.j$i */
    static final class i extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: c.j$i$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractActivityC4155j f33567a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractActivityC4155j abstractActivityC4155j) {
                super(0);
                this.f33567a = abstractActivityC4155j;
            }

            public final void a() {
                this.f33567a.reportFullyDrawn();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        i() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4135D invoke() {
            return new C4135D(AbstractActivityC4155j.this.f33541g, new a(AbstractActivityC4155j.this));
        }
    }

    /* renamed from: c.j$j, reason: collision with other inner class name */
    static final class C1168j extends AbstractC6494u implements InterfaceC6824a {
        C1168j() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(AbstractActivityC4155j abstractActivityC4155j) {
            try {
                AbstractActivityC4155j.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!AbstractC6492s.d(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            } catch (NullPointerException e11) {
                if (!AbstractC6492s.d(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e11;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(AbstractActivityC4155j abstractActivityC4155j, C4138G c4138g) {
            abstractActivityC4155j.f0(c4138g);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final C4138G invoke() {
            final AbstractActivityC4155j abstractActivityC4155j = AbstractActivityC4155j.this;
            final C4138G c4138g = new C4138G(new Runnable() { // from class: c.n
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractActivityC4155j.C1168j.j(abstractActivityC4155j);
                }
            });
            final AbstractActivityC4155j abstractActivityC4155j2 = AbstractActivityC4155j.this;
            if (Build.VERSION.SDK_INT >= 33) {
                if (AbstractC6492s.d(Looper.myLooper(), Looper.getMainLooper())) {
                    abstractActivityC4155j2.f0(c4138g);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: c.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractActivityC4155j.C1168j.l(abstractActivityC4155j2, c4138g);
                        }
                    });
                }
            }
            return c4138g;
        }
    }

    public AbstractActivityC4155j() {
        C7417e c7417eA = C7417e.f58360d.a(this);
        this.f33539e = c7417eA;
        this.f33541g = j0();
        this.f33542h = Yg.n.b(new i());
        this.f33544j = new AtomicInteger();
        this.f33545k = new g();
        this.f33546l = new CopyOnWriteArrayList();
        this.f33547m = new CopyOnWriteArrayList();
        this.f33548n = new CopyOnWriteArrayList();
        this.f33549o = new CopyOnWriteArrayList();
        this.f33550p = new CopyOnWriteArrayList();
        this.f33551q = new CopyOnWriteArrayList();
        if (O() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        O().a(new InterfaceC4015m() { // from class: c.e
            @Override // androidx.lifecycle.InterfaceC4015m
            public final void j(InterfaceC4017o interfaceC4017o, AbstractC4013k.a aVar) {
                AbstractActivityC4155j.X(this.f33530a, interfaceC4017o, aVar);
            }
        });
        O().a(new InterfaceC4015m() { // from class: c.f
            @Override // androidx.lifecycle.InterfaceC4015m
            public final void j(InterfaceC4017o interfaceC4017o, AbstractC4013k.a aVar) {
                AbstractActivityC4155j.Y(this.f33531a, interfaceC4017o, aVar);
            }
        });
        O().a(new a());
        c7417eA.c();
        androidx.lifecycle.H.c(this);
        t().h("android:support:activity-result", new C7416d.c() { // from class: c.g
            @Override // q2.C7416d.c
            public final Bundle a() {
                return AbstractActivityC4155j.Z(this.f33532a);
            }
        });
        h0(new InterfaceC5407b() { // from class: c.h
            @Override // e.InterfaceC5407b
            public final void a(Context context) {
                AbstractActivityC4155j.a0(this.f33533a, context);
            }
        });
        this.f33554t = Yg.n.b(new h());
        this.f33555u = Yg.n.b(new C1168j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(AbstractActivityC4155j abstractActivityC4155j, InterfaceC4017o interfaceC4017o, AbstractC4013k.a event) {
        Window window;
        View viewPeekDecorView;
        AbstractC6492s.i(interfaceC4017o, "<anonymous parameter 0>");
        AbstractC6492s.i(event, "event");
        if (event != AbstractC4013k.a.ON_STOP || (window = abstractActivityC4155j.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(AbstractActivityC4155j abstractActivityC4155j, InterfaceC4017o interfaceC4017o, AbstractC4013k.a event) {
        AbstractC6492s.i(interfaceC4017o, "<anonymous parameter 0>");
        AbstractC6492s.i(event, "event");
        if (event == AbstractC4013k.a.ON_DESTROY) {
            abstractActivityC4155j.f33537c.b();
            if (!abstractActivityC4155j.isChangingConfigurations()) {
                abstractActivityC4155j.o().a();
            }
            abstractActivityC4155j.f33541g.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle Z(AbstractActivityC4155j abstractActivityC4155j) {
        Bundle bundle = new Bundle();
        abstractActivityC4155j.f33545k.j(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(AbstractActivityC4155j abstractActivityC4155j, Context it) {
        AbstractC6492s.i(it, "it");
        Bundle bundleB = abstractActivityC4155j.t().b("android:support:activity-result");
        if (bundleB != null) {
            abstractActivityC4155j.f33545k.i(bundleB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(final C4138G c4138g) {
        O().a(new InterfaceC4015m() { // from class: c.i
            @Override // androidx.lifecycle.InterfaceC4015m
            public final void j(InterfaceC4017o interfaceC4017o, AbstractC4013k.a aVar) {
                AbstractActivityC4155j.g0(c4138g, this, interfaceC4017o, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(C4138G c4138g, AbstractActivityC4155j abstractActivityC4155j, InterfaceC4017o interfaceC4017o, AbstractC4013k.a event) {
        AbstractC6492s.i(interfaceC4017o, "<anonymous parameter 0>");
        AbstractC6492s.i(event, "event");
        if (event == AbstractC4013k.a.ON_CREATE) {
            c4138g.o(b.f33557a.a(abstractActivityC4155j));
        }
    }

    private final e j0() {
        return new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0() {
        if (this.f33540f == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this.f33540f = dVar.a();
            }
            if (this.f33540f == null) {
                this.f33540f = new Q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(AbstractActivityC4155j abstractActivityC4155j) {
        abstractActivityC4155j.n0();
    }

    @Override // t1.InterfaceC8023c
    public final void D(E1.a listener) {
        AbstractC6492s.i(listener, "listener");
        this.f33547m.remove(listener);
    }

    @Override // t1.InterfaceC8023c
    public final void E(E1.a listener) {
        AbstractC6492s.i(listener, "listener");
        this.f33547m.add(listener);
    }

    @Override // s1.p
    public final void G(E1.a listener) {
        AbstractC6492s.i(listener, "listener");
        this.f33550p.add(listener);
    }

    @Override // s1.o
    public final void L(E1.a listener) {
        AbstractC6492s.i(listener, "listener");
        this.f33549o.add(listener);
    }

    @Override // F1.InterfaceC2779w
    public void N(InterfaceC2784z provider) {
        AbstractC6492s.i(provider, "provider");
        this.f33538d.f(provider);
    }

    @Override // s1.g, androidx.lifecycle.InterfaceC4017o
    public AbstractC4013k O() {
        return super.O();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m0();
        e eVar = this.f33541g;
        View decorView = getWindow().getDecorView();
        AbstractC6492s.h(decorView, "window.decorView");
        eVar.P(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // c.InterfaceC4141J
    public final C4138G b() {
        return (C4138G) this.f33555u.getValue();
    }

    @Override // androidx.lifecycle.InterfaceC4011i
    public P.c g() {
        return (P.c) this.f33554t.getValue();
    }

    @Override // androidx.lifecycle.InterfaceC4011i
    public AbstractC4056a h() {
        C4057b c4057b = new C4057b(null, 1, null);
        if (getApplication() != null) {
            AbstractC4056a.b bVar = P.a.f31628h;
            Application application = getApplication();
            AbstractC6492s.h(application, "application");
            c4057b.c(bVar, application);
        }
        c4057b.c(androidx.lifecycle.H.f31605a, this);
        c4057b.c(androidx.lifecycle.H.f31606b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            c4057b.c(androidx.lifecycle.H.f31607c, extras);
        }
        return c4057b;
    }

    public final void h0(InterfaceC5407b listener) {
        AbstractC6492s.i(listener, "listener");
        this.f33537c.a(listener);
    }

    public final void i0(E1.a listener) {
        AbstractC6492s.i(listener, "listener");
        this.f33548n.add(listener);
    }

    @Override // s1.o
    public final void j(E1.a listener) {
        AbstractC6492s.i(listener, "listener");
        this.f33549o.remove(listener);
    }

    @Override // f.InterfaceC5489f
    public final AbstractC5488e l() {
        return this.f33545k;
    }

    public C4135D l0() {
        return (C4135D) this.f33542h.getValue();
    }

    public void m0() {
        View decorView = getWindow().getDecorView();
        AbstractC6492s.h(decorView, "window.decorView");
        T.b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC6492s.h(decorView2, "window.decorView");
        U.b(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC6492s.h(decorView3, "window.decorView");
        AbstractC7419g.b(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC6492s.h(decorView4, "window.decorView");
        AbstractC4145N.b(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC6492s.h(decorView5, "window.decorView");
        AbstractC4144M.a(decorView5, this);
    }

    public void n0() {
        invalidateOptionsMenu();
    }

    @Override // androidx.lifecycle.S
    public Q o() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        k0();
        Q q10 = this.f33540f;
        AbstractC6492s.f(q10);
        return q10;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f33545k.d(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        b().l();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC6492s.i(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator it = this.f33546l.iterator();
        while (it.hasNext()) {
            ((E1.a) it.next()).accept(newConfig);
        }
    }

    @Override // s1.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f33539e.d(bundle);
        this.f33537c.c(this);
        super.onCreate(bundle);
        androidx.lifecycle.B.INSTANCE.c(this);
        int i10 = this.f33543i;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        AbstractC6492s.i(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.f33538d.b(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem item) {
        AbstractC6492s.i(item, "item");
        if (super.onMenuItemSelected(i10, item)) {
            return true;
        }
        if (i10 == 0) {
            return this.f33538d.d(item);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.f33552r) {
            return;
        }
        Iterator it = this.f33549o.iterator();
        while (it.hasNext()) {
            ((E1.a) it.next()).accept(new s1.h(z10));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        AbstractC6492s.i(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f33548n.iterator();
        while (it.hasNext()) {
            ((E1.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        AbstractC6492s.i(menu, "menu");
        this.f33538d.c(menu);
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.f33553s) {
            return;
        }
        Iterator it = this.f33550p.iterator();
        while (it.hasNext()) {
            ((E1.a) it.next()).accept(new s1.r(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        AbstractC6492s.i(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.f33538d.e(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        AbstractC6492s.i(permissions, "permissions");
        AbstractC6492s.i(grantResults, "grantResults");
        if (this.f33545k.d(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i10, permissions, grantResults);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object objP0 = p0();
        Q qA = this.f33540f;
        if (qA == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            qA = dVar.a();
        }
        if (qA == null && objP0 == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.b(objP0);
        dVar2.c(qA);
        return dVar2;
    }

    @Override // s1.g, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        AbstractC6492s.i(outState, "outState");
        if (O() instanceof C4018p) {
            AbstractC4013k abstractC4013kO = O();
            AbstractC6492s.g(abstractC4013kO, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C4018p) abstractC4013kO).m(AbstractC4013k.b.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.f33539e.e(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator it = this.f33547m.iterator();
        while (it.hasNext()) {
            ((E1.a) it.next()).accept(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f33551q.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public Object p0() {
        return null;
    }

    @Override // F1.InterfaceC2779w
    public void r(InterfaceC2784z provider) {
        AbstractC6492s.i(provider, "provider");
        this.f33538d.a(provider);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC8187a.d()) {
                AbstractC8187a.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            l0().b();
            AbstractC8187a.b();
        } catch (Throwable th2) {
            AbstractC8187a.b();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        m0();
        e eVar = this.f33541g;
        View decorView = getWindow().getDecorView();
        AbstractC6492s.h(decorView, "window.decorView");
        eVar.P(decorView);
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10) {
        AbstractC6492s.i(intent, "intent");
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        AbstractC6492s.i(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13);
    }

    @Override // q2.InterfaceC7418f
    public final C7416d t() {
        return this.f33539e.b();
    }

    @Override // t1.InterfaceC8022b
    public final void u(E1.a listener) {
        AbstractC6492s.i(listener, "listener");
        this.f33546l.remove(listener);
    }

    @Override // s1.p
    public final void x(E1.a listener) {
        AbstractC6492s.i(listener, "listener");
        this.f33550p.remove(listener);
    }

    @Override // t1.InterfaceC8022b
    public final void z(E1.a listener) {
        AbstractC6492s.i(listener, "listener");
        this.f33546l.add(listener);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        AbstractC6492s.i(intent, "intent");
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        AbstractC6492s.i(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration newConfig) {
        AbstractC6492s.i(newConfig, "newConfig");
        this.f33552r = true;
        try {
            super.onMultiWindowModeChanged(z10, newConfig);
            this.f33552r = false;
            Iterator it = this.f33549o.iterator();
            while (it.hasNext()) {
                ((E1.a) it.next()).accept(new s1.h(z10, newConfig));
            }
        } catch (Throwable th2) {
            this.f33552r = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration newConfig) {
        AbstractC6492s.i(newConfig, "newConfig");
        this.f33553s = true;
        try {
            super.onPictureInPictureModeChanged(z10, newConfig);
            this.f33553s = false;
            Iterator it = this.f33550p.iterator();
            while (it.hasNext()) {
                ((E1.a) it.next()).accept(new s1.r(z10, newConfig));
            }
        } catch (Throwable th2) {
            this.f33553s = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m0();
        e eVar = this.f33541g;
        View decorView = getWindow().getDecorView();
        AbstractC6492s.h(decorView, "window.decorView");
        eVar.P(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m0();
        e eVar = this.f33541g;
        View decorView = getWindow().getDecorView();
        AbstractC6492s.h(decorView, "window.decorView");
        eVar.P(decorView);
        super.setContentView(view, layoutParams);
    }
}
