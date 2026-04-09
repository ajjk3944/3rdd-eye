package c;

import Zg.C3681m;
import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.InterfaceC4015m;
import androidx.lifecycle.InterfaceC4017o;
import c.C4138G;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* renamed from: c.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4138G {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f33487a;

    /* renamed from: b, reason: collision with root package name */
    private final E1.a f33488b;

    /* renamed from: c, reason: collision with root package name */
    private final C3681m f33489c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC4137F f33490d;

    /* renamed from: e, reason: collision with root package name */
    private OnBackInvokedCallback f33491e;

    /* renamed from: f, reason: collision with root package name */
    private OnBackInvokedDispatcher f33492f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f33493g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f33494h;

    /* renamed from: c.G$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {
        a() {
            super(1);
        }

        public final void a(C4147b backEvent) {
            AbstractC6492s.i(backEvent, "backEvent");
            C4138G.this.n(backEvent);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4147b) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: c.G$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {
        b() {
            super(1);
        }

        public final void a(C4147b backEvent) {
            AbstractC6492s.i(backEvent, "backEvent");
            C4138G.this.m(backEvent);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4147b) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: c.G$c */
    static final class c extends AbstractC6494u implements InterfaceC6824a {
        c() {
            super(0);
        }

        public final void a() {
            C4138G.this.l();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    /* renamed from: c.G$d */
    static final class d extends AbstractC6494u implements InterfaceC6824a {
        d() {
            super(0);
        }

        public final void a() {
            C4138G.this.k();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    /* renamed from: c.G$e */
    static final class e extends AbstractC6494u implements InterfaceC6824a {
        e() {
            super(0);
        }

        public final void a() {
            C4138G.this.l();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    /* renamed from: c.G$f */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f33500a = new f();

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(InterfaceC6824a interfaceC6824a) {
            interfaceC6824a.invoke();
        }

        public final OnBackInvokedCallback b(final InterfaceC6824a onBackInvoked) {
            AbstractC6492s.i(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: c.H
                public final void onBackInvoked() {
                    C4138G.f.c(onBackInvoked);
                }
            };
        }

        public final void d(Object dispatcher, int i10, Object callback) {
            AbstractC6492s.i(dispatcher, "dispatcher");
            AbstractC6492s.i(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) callback);
        }

        public final void e(Object dispatcher, Object callback) {
            AbstractC6492s.i(dispatcher, "dispatcher");
            AbstractC6492s.i(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* renamed from: c.G$g */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public static final g f33501a = new g();

        /* renamed from: c.G$g$a */
        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f33502a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f33503b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC6824a f33504c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC6824a f33505d;

            a(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2) {
                this.f33502a = interfaceC6835l;
                this.f33503b = interfaceC6835l2;
                this.f33504c = interfaceC6824a;
                this.f33505d = interfaceC6824a2;
            }

            public void onBackCancelled() {
                this.f33505d.invoke();
            }

            public void onBackInvoked() {
                this.f33504c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                AbstractC6492s.i(backEvent, "backEvent");
                this.f33503b.invoke(new C4147b(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                AbstractC6492s.i(backEvent, "backEvent");
                this.f33502a.invoke(new C4147b(backEvent));
            }
        }

        private g() {
        }

        public final OnBackInvokedCallback a(InterfaceC6835l onBackStarted, InterfaceC6835l onBackProgressed, InterfaceC6824a onBackInvoked, InterfaceC6824a onBackCancelled) {
            AbstractC6492s.i(onBackStarted, "onBackStarted");
            AbstractC6492s.i(onBackProgressed, "onBackProgressed");
            AbstractC6492s.i(onBackInvoked, "onBackInvoked");
            AbstractC6492s.i(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    /* renamed from: c.G$h */
    private final class h implements InterfaceC4015m, InterfaceC4148c {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC4013k f33506a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC4137F f33507b;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC4148c f33508c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C4138G f33509d;

        public h(C4138G c4138g, AbstractC4013k lifecycle, AbstractC4137F onBackPressedCallback) {
            AbstractC6492s.i(lifecycle, "lifecycle");
            AbstractC6492s.i(onBackPressedCallback, "onBackPressedCallback");
            this.f33509d = c4138g;
            this.f33506a = lifecycle;
            this.f33507b = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // c.InterfaceC4148c
        public void cancel() {
            this.f33506a.c(this);
            this.f33507b.i(this);
            InterfaceC4148c interfaceC4148c = this.f33508c;
            if (interfaceC4148c != null) {
                interfaceC4148c.cancel();
            }
            this.f33508c = null;
        }

        @Override // androidx.lifecycle.InterfaceC4015m
        public void j(InterfaceC4017o source, AbstractC4013k.a event) {
            AbstractC6492s.i(source, "source");
            AbstractC6492s.i(event, "event");
            if (event == AbstractC4013k.a.ON_START) {
                this.f33508c = this.f33509d.j(this.f33507b);
                return;
            }
            if (event != AbstractC4013k.a.ON_STOP) {
                if (event == AbstractC4013k.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC4148c interfaceC4148c = this.f33508c;
                if (interfaceC4148c != null) {
                    interfaceC4148c.cancel();
                }
            }
        }
    }

    /* renamed from: c.G$i */
    private final class i implements InterfaceC4148c {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC4137F f33510a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4138G f33511b;

        public i(C4138G c4138g, AbstractC4137F onBackPressedCallback) {
            AbstractC6492s.i(onBackPressedCallback, "onBackPressedCallback");
            this.f33511b = c4138g;
            this.f33510a = onBackPressedCallback;
        }

        @Override // c.InterfaceC4148c
        public void cancel() {
            this.f33511b.f33489c.remove(this.f33510a);
            if (AbstractC6492s.d(this.f33511b.f33490d, this.f33510a)) {
                this.f33510a.c();
                this.f33511b.f33490d = null;
            }
            this.f33510a.i(this);
            InterfaceC6824a interfaceC6824aB = this.f33510a.b();
            if (interfaceC6824aB != null) {
                interfaceC6824aB.invoke();
            }
            this.f33510a.k(null);
        }
    }

    /* renamed from: c.G$j */
    /* synthetic */ class j extends C6490p implements InterfaceC6824a {
        j(Object obj) {
            super(0, obj, C4138G.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void a() {
            ((C4138G) this.receiver).q();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    /* renamed from: c.G$k */
    /* synthetic */ class k extends C6490p implements InterfaceC6824a {
        k(Object obj) {
            super(0, obj, C4138G.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void a() {
            ((C4138G) this.receiver).q();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    public C4138G(Runnable runnable, E1.a aVar) {
        this.f33487a = runnable;
        this.f33488b = aVar;
        this.f33489c = new C3681m();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f33491e = i10 >= 34 ? g.f33501a.a(new a(), new b(), new c(), new d()) : f.f33500a.b(new e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void k() {
        AbstractC4137F abstractC4137FPrevious;
        AbstractC4137F abstractC4137F = this.f33490d;
        if (abstractC4137F == null) {
            C3681m c3681m = this.f33489c;
            ListIterator listIterator = c3681m.listIterator(c3681m.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC4137FPrevious = 0;
                    break;
                } else {
                    abstractC4137FPrevious = listIterator.previous();
                    if (((AbstractC4137F) abstractC4137FPrevious).g()) {
                        break;
                    }
                }
            }
            abstractC4137F = abstractC4137FPrevious;
        }
        this.f33490d = null;
        if (abstractC4137F != null) {
            abstractC4137F.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public final void m(C4147b c4147b) {
        AbstractC4137F abstractC4137FPrevious;
        AbstractC4137F abstractC4137F = this.f33490d;
        if (abstractC4137F == null) {
            C3681m c3681m = this.f33489c;
            ListIterator listIterator = c3681m.listIterator(c3681m.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC4137FPrevious = 0;
                    break;
                } else {
                    abstractC4137FPrevious = listIterator.previous();
                    if (((AbstractC4137F) abstractC4137FPrevious).g()) {
                        break;
                    }
                }
            }
            abstractC4137F = abstractC4137FPrevious;
        }
        if (abstractC4137F != null) {
            abstractC4137F.e(c4147b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(C4147b c4147b) {
        Object objPrevious;
        C3681m c3681m = this.f33489c;
        ListIterator<E> listIterator = c3681m.listIterator(c3681m.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((AbstractC4137F) objPrevious).g()) {
                    break;
                }
            }
        }
        AbstractC4137F abstractC4137F = (AbstractC4137F) objPrevious;
        if (this.f33490d != null) {
            k();
        }
        this.f33490d = abstractC4137F;
        if (abstractC4137F != null) {
            abstractC4137F.f(c4147b);
        }
    }

    private final void p(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f33492f;
        OnBackInvokedCallback onBackInvokedCallback = this.f33491e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z10 && !this.f33493g) {
            f.f33500a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f33493g = true;
        } else {
            if (z10 || !this.f33493g) {
                return;
            }
            f.f33500a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f33493g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        boolean z10 = this.f33494h;
        C3681m c3681m = this.f33489c;
        boolean z11 = false;
        if (c3681m == null || !c3681m.isEmpty()) {
            Iterator<E> it = c3681m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((AbstractC4137F) it.next()).g()) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f33494h = z11;
        if (z11 != z10) {
            E1.a aVar = this.f33488b;
            if (aVar != null) {
                aVar.accept(Boolean.valueOf(z11));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                p(z11);
            }
        }
    }

    public final void h(InterfaceC4017o owner, AbstractC4137F onBackPressedCallback) {
        AbstractC6492s.i(owner, "owner");
        AbstractC6492s.i(onBackPressedCallback, "onBackPressedCallback");
        AbstractC4013k abstractC4013kO = owner.O();
        if (abstractC4013kO.b() == AbstractC4013k.b.DESTROYED) {
            return;
        }
        onBackPressedCallback.a(new h(this, abstractC4013kO, onBackPressedCallback));
        q();
        onBackPressedCallback.k(new j(this));
    }

    public final void i(AbstractC4137F onBackPressedCallback) {
        AbstractC6492s.i(onBackPressedCallback, "onBackPressedCallback");
        j(onBackPressedCallback);
    }

    public final InterfaceC4148c j(AbstractC4137F onBackPressedCallback) {
        AbstractC6492s.i(onBackPressedCallback, "onBackPressedCallback");
        this.f33489c.add(onBackPressedCallback);
        i iVar = new i(this, onBackPressedCallback);
        onBackPressedCallback.a(iVar);
        q();
        onBackPressedCallback.k(new k(this));
        return iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void l() {
        AbstractC4137F abstractC4137FPrevious;
        AbstractC4137F abstractC4137F = this.f33490d;
        if (abstractC4137F == null) {
            C3681m c3681m = this.f33489c;
            ListIterator listIterator = c3681m.listIterator(c3681m.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC4137FPrevious = 0;
                    break;
                } else {
                    abstractC4137FPrevious = listIterator.previous();
                    if (((AbstractC4137F) abstractC4137FPrevious).g()) {
                        break;
                    }
                }
            }
            abstractC4137F = abstractC4137FPrevious;
        }
        this.f33490d = null;
        if (abstractC4137F != null) {
            abstractC4137F.d();
            return;
        }
        Runnable runnable = this.f33487a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void o(OnBackInvokedDispatcher invoker) {
        AbstractC6492s.i(invoker, "invoker");
        this.f33492f = invoker;
        p(this.f33494h);
    }

    public C4138G(Runnable runnable) {
        this(runnable, null);
    }
}
