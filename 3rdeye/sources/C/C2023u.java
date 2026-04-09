package c;

import H6.C0680q;
import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.InterfaceC1788v;
import androidx.lifecycle.InterfaceC1790x;
import b9.C1992A;
import c9.C2087h;
import java.util.Iterator;
import java.util.ListIterator;
import p9.InterfaceC5480a;

/* compiled from: OnBackPressedDispatcher.kt */
/* renamed from: c.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2023u {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f18308a;

    /* renamed from: b, reason: collision with root package name */
    public final C2087h<AbstractC2021s> f18309b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC2021s f18310c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f18311d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f18312e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18313f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18314g;

    /* compiled from: OnBackPressedDispatcher.kt */
    /* renamed from: c.u$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18315a = new a();

        public final OnBackInvokedCallback a(final InterfaceC5480a<C1992A> onBackInvoked) {
            kotlin.jvm.internal.l.f(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: c.t
                public final void onBackInvoked() {
                    InterfaceC5480a onBackInvoked2 = onBackInvoked;
                    kotlin.jvm.internal.l.f(onBackInvoked2, "$onBackInvoked");
                    onBackInvoked2.invoke();
                }
            };
        }

        public final void b(Object dispatcher, int i, Object callback) {
            kotlin.jvm.internal.l.f(dispatcher, "dispatcher");
            kotlin.jvm.internal.l.f(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) callback);
        }

        public final void c(Object dispatcher, Object callback) {
            kotlin.jvm.internal.l.f(dispatcher, "dispatcher");
            kotlin.jvm.internal.l.f(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    /* renamed from: c.u$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f18316a = new b();

        /* compiled from: OnBackPressedDispatcher.kt */
        /* renamed from: c.u$b$a */
        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p9.l<C2004b, C1992A> f18317a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p9.l<C2004b, C1992A> f18318b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5480a<C1992A> f18319c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5480a<C1992A> f18320d;

            /* JADX WARN: Multi-variable type inference failed */
            public a(p9.l<? super C2004b, C1992A> lVar, p9.l<? super C2004b, C1992A> lVar2, InterfaceC5480a<C1992A> interfaceC5480a, InterfaceC5480a<C1992A> interfaceC5480a2) {
                this.f18317a = lVar;
                this.f18318b = lVar2;
                this.f18319c = interfaceC5480a;
                this.f18320d = interfaceC5480a2;
            }

            public final void onBackCancelled() {
                this.f18320d.invoke();
            }

            public final void onBackInvoked() {
                this.f18319c.invoke();
            }

            public final void onBackProgressed(BackEvent backEvent) {
                kotlin.jvm.internal.l.f(backEvent, "backEvent");
                this.f18318b.invoke(new C2004b(backEvent));
            }

            public final void onBackStarted(BackEvent backEvent) {
                kotlin.jvm.internal.l.f(backEvent, "backEvent");
                this.f18317a.invoke(new C2004b(backEvent));
            }
        }

        public final OnBackInvokedCallback a(p9.l<? super C2004b, C1992A> onBackStarted, p9.l<? super C2004b, C1992A> onBackProgressed, InterfaceC5480a<C1992A> onBackInvoked, InterfaceC5480a<C1992A> onBackCancelled) {
            kotlin.jvm.internal.l.f(onBackStarted, "onBackStarted");
            kotlin.jvm.internal.l.f(onBackProgressed, "onBackProgressed");
            kotlin.jvm.internal.l.f(onBackInvoked, "onBackInvoked");
            kotlin.jvm.internal.l.f(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    /* renamed from: c.u$c */
    public final class c implements InterfaceC1788v, InterfaceC2005c {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC1781n f18321b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC2021s f18322c;

        /* renamed from: d, reason: collision with root package name */
        public d f18323d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C2023u f18324e;

        public c(C2023u c2023u, AbstractC1781n abstractC1781n, AbstractC2021s onBackPressedCallback) {
            kotlin.jvm.internal.l.f(onBackPressedCallback, "onBackPressedCallback");
            this.f18324e = c2023u;
            this.f18321b = abstractC1781n;
            this.f18322c = onBackPressedCallback;
            abstractC1781n.addObserver(this);
        }

        @Override // androidx.lifecycle.InterfaceC1788v
        public final void c(InterfaceC1790x interfaceC1790x, AbstractC1781n.a aVar) {
            if (aVar == AbstractC1781n.a.ON_START) {
                this.f18323d = this.f18324e.b(this.f18322c);
                return;
            }
            if (aVar != AbstractC1781n.a.ON_STOP) {
                if (aVar == AbstractC1781n.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                d dVar = this.f18323d;
                if (dVar != null) {
                    dVar.cancel();
                }
            }
        }

        @Override // c.InterfaceC2005c
        public final void cancel() {
            this.f18321b.removeObserver(this);
            this.f18322c.f18305b.remove(this);
            d dVar = this.f18323d;
            if (dVar != null) {
                dVar.cancel();
            }
            this.f18323d = null;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    /* renamed from: c.u$d */
    public final class d implements InterfaceC2005c {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC2021s f18325b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C2023u f18326c;

        public d(C2023u c2023u, AbstractC2021s onBackPressedCallback) {
            kotlin.jvm.internal.l.f(onBackPressedCallback, "onBackPressedCallback");
            this.f18326c = c2023u;
            this.f18325b = onBackPressedCallback;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.k, p9.a] */
        @Override // c.InterfaceC2005c
        public final void cancel() {
            C2023u c2023u = this.f18326c;
            C2087h<AbstractC2021s> c2087h = c2023u.f18309b;
            AbstractC2021s abstractC2021s = this.f18325b;
            c2087h.remove(abstractC2021s);
            if (kotlin.jvm.internal.l.b(c2023u.f18310c, abstractC2021s)) {
                abstractC2021s.getClass();
                c2023u.f18310c = null;
            }
            abstractC2021s.f18305b.remove(this);
            ?? r02 = abstractC2021s.f18306c;
            if (r02 != 0) {
                r02.invoke();
            }
            abstractC2021s.f18306c = null;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    /* renamed from: c.u$e */
    public /* synthetic */ class e extends kotlin.jvm.internal.k implements InterfaceC5480a<C1992A> {
        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            ((C2023u) this.receiver).f();
            return C1992A.f18074a;
        }
    }

    public C2023u(Runnable runnable) {
        this.f18308a = runnable;
        this.f18309b = new C2087h<>();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f18311d = i >= 34 ? b.f18316a.a(new C0680q(this, 6), new E7.a(this, 7), new A6.h(this, 4), new F6.c(this, 4)) : a.f18315a.a(new F7.l(this, 4));
        }
    }

    public final void a(InterfaceC1790x interfaceC1790x, AbstractC2021s onBackPressedCallback) {
        kotlin.jvm.internal.l.f(onBackPressedCallback, "onBackPressedCallback");
        AbstractC1781n lifecycle = interfaceC1790x.getLifecycle();
        if (lifecycle.getCurrentState() == AbstractC1781n.b.DESTROYED) {
            return;
        }
        onBackPressedCallback.f18305b.add(new c(this, lifecycle, onBackPressedCallback));
        f();
        onBackPressedCallback.f18306c = new e(0, this, C2023u.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    public final d b(AbstractC2021s onBackPressedCallback) {
        kotlin.jvm.internal.l.f(onBackPressedCallback, "onBackPressedCallback");
        this.f18309b.e(onBackPressedCallback);
        d dVar = new d(this, onBackPressedCallback);
        onBackPressedCallback.f18305b.add(dVar);
        f();
        onBackPressedCallback.f18306c = new C2024v(0, this, C2023u.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        return dVar;
    }

    public final void c() {
        AbstractC2021s abstractC2021sPrevious;
        if (this.f18310c == null) {
            C2087h<AbstractC2021s> c2087h = this.f18309b;
            ListIterator<AbstractC2021s> listIterator = c2087h.listIterator(c2087h.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC2021sPrevious = null;
                    break;
                } else {
                    abstractC2021sPrevious = listIterator.previous();
                    if (abstractC2021sPrevious.f18304a) {
                        break;
                    }
                }
            }
        }
        this.f18310c = null;
    }

    public final void d() {
        AbstractC2021s abstractC2021sPrevious;
        AbstractC2021s abstractC2021s = this.f18310c;
        if (abstractC2021s == null) {
            C2087h<AbstractC2021s> c2087h = this.f18309b;
            ListIterator<AbstractC2021s> listIterator = c2087h.listIterator(c2087h.c());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC2021sPrevious = null;
                    break;
                } else {
                    abstractC2021sPrevious = listIterator.previous();
                    if (abstractC2021sPrevious.f18304a) {
                        break;
                    }
                }
            }
            abstractC2021s = abstractC2021sPrevious;
        }
        this.f18310c = null;
        if (abstractC2021s != null) {
            abstractC2021s.a();
            return;
        }
        Runnable runnable = this.f18308a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void e(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f18312e;
        OnBackInvokedCallback onBackInvokedCallback = this.f18311d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        a aVar = a.f18315a;
        if (z10 && !this.f18313f) {
            aVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f18313f = true;
        } else {
            if (z10 || !this.f18313f) {
                return;
            }
            aVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f18313f = false;
        }
    }

    public final void f() {
        boolean z10 = this.f18314g;
        boolean z11 = false;
        C2087h<AbstractC2021s> c2087h = this.f18309b;
        if (!(c2087h != null) || !c2087h.isEmpty()) {
            Iterator<AbstractC2021s> it = c2087h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f18304a) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f18314g = z11;
        if (z11 == z10 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        e(z11);
    }

    public C2023u() {
        this(null);
    }
}
