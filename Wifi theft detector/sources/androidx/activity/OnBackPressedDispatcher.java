package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f236a;

    /* renamed from: b, reason: collision with root package name */
    public final r0.b f237b;

    /* renamed from: c, reason: collision with root package name */
    public final z8.j f238c;

    /* renamed from: d, reason: collision with root package name */
    public n f239d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedCallback f240e;

    /* renamed from: f, reason: collision with root package name */
    public OnBackInvokedDispatcher f241f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f242g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f243h;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/j;", "Landroidx/activity/b;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/activity/n;", "onBackPressedCallback", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/Lifecycle;Landroidx/activity/n;)V", "Landroidx/lifecycle/n;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "Ly8/s;", "onStateChanged", "(Landroidx/lifecycle/n;Landroidx/lifecycle/Lifecycle$Event;)V", "cancel", "()V", "a", "Landroidx/lifecycle/Lifecycle;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Landroidx/activity/n;", "c", "Landroidx/activity/b;", "currentCancellable", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class LifecycleOnBackPressedCancellable implements androidx.lifecycle.j, androidx.activity.b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final Lifecycle lifecycle;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final n onBackPressedCallback;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public androidx.activity.b currentCancellable;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f247d;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, n onBackPressedCallback) {
            kotlin.jvm.internal.p.e(lifecycle, "lifecycle");
            kotlin.jvm.internal.p.e(onBackPressedCallback, "onBackPressedCallback");
            this.f247d = onBackPressedDispatcher;
            this.lifecycle = lifecycle;
            this.onBackPressedCallback = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // androidx.activity.b
        public void cancel() {
            this.lifecycle.d(this);
            this.onBackPressedCallback.i(this);
            androidx.activity.b bVar = this.currentCancellable;
            if (bVar != null) {
                bVar.cancel();
            }
            this.currentCancellable = null;
        }

        @Override // androidx.lifecycle.j
        public void onStateChanged(androidx.lifecycle.n source, Lifecycle.Event event) {
            kotlin.jvm.internal.p.e(source, "source");
            kotlin.jvm.internal.p.e(event, "event");
            if (event == Lifecycle.Event.ON_START) {
                this.currentCancellable = this.f247d.i(this.onBackPressedCallback);
                return;
            }
            if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.b bVar = this.currentCancellable;
                if (bVar != null) {
                    bVar.cancel();
                }
            }
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f248a = new a();

        public static final void c(l9.a onBackInvoked) {
            kotlin.jvm.internal.p.e(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        @DoNotInline
        @NotNull
        public final OnBackInvokedCallback b(@NotNull final l9.a onBackInvoked) {
            kotlin.jvm.internal.p.e(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.p
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.a.c(onBackInvoked);
                }
            };
        }

        @DoNotInline
        public final void d(@NotNull Object dispatcher, int i10, @NotNull Object callback) {
            kotlin.jvm.internal.p.e(dispatcher, "dispatcher");
            kotlin.jvm.internal.p.e(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) callback);
        }

        @DoNotInline
        public final void e(@NotNull Object dispatcher, @NotNull Object callback) {
            kotlin.jvm.internal.p.e(dispatcher, "dispatcher");
            kotlin.jvm.internal.p.e(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f249a = new b();

        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l9.l f250a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l9.l f251b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l9.a f252c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ l9.a f253d;

            public a(l9.l lVar, l9.l lVar2, l9.a aVar, l9.a aVar2) {
                this.f250a = lVar;
                this.f251b = lVar2;
                this.f252c = aVar;
                this.f253d = aVar2;
            }

            public void onBackCancelled() {
                this.f253d.invoke();
            }

            public void onBackInvoked() {
                this.f252c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                kotlin.jvm.internal.p.e(backEvent, "backEvent");
                this.f251b.invoke(new BackEventCompat(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                kotlin.jvm.internal.p.e(backEvent, "backEvent");
                this.f250a.invoke(new BackEventCompat(backEvent));
            }
        }

        @DoNotInline
        @NotNull
        public final OnBackInvokedCallback a(@NotNull l9.l onBackStarted, @NotNull l9.l onBackProgressed, @NotNull l9.a onBackInvoked, @NotNull l9.a onBackCancelled) {
            kotlin.jvm.internal.p.e(onBackStarted, "onBackStarted");
            kotlin.jvm.internal.p.e(onBackProgressed, "onBackProgressed");
            kotlin.jvm.internal.p.e(onBackInvoked, "onBackInvoked");
            kotlin.jvm.internal.p.e(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    public final class c implements androidx.activity.b {

        /* renamed from: a, reason: collision with root package name */
        public final n f254a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f255b;

        public c(OnBackPressedDispatcher onBackPressedDispatcher, n onBackPressedCallback) {
            kotlin.jvm.internal.p.e(onBackPressedCallback, "onBackPressedCallback");
            this.f255b = onBackPressedDispatcher;
            this.f254a = onBackPressedCallback;
        }

        @Override // androidx.activity.b
        public void cancel() {
            this.f255b.f238c.remove(this.f254a);
            if (kotlin.jvm.internal.p.a(this.f255b.f239d, this.f254a)) {
                this.f254a.c();
                this.f255b.f239d = null;
            }
            this.f254a.i(this);
            l9.a aVarB = this.f254a.b();
            if (aVarB != null) {
                aVarB.invoke();
            }
            this.f254a.k(null);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable, r0.b bVar) {
        this.f236a = runnable;
        this.f237b = bVar;
        this.f238c = new z8.j();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f240e = i10 >= 34 ? b.f249a.a(new l9.l() { // from class: androidx.activity.OnBackPressedDispatcher.1
                {
                    super(1);
                }

                public final void a(BackEventCompat backEvent) {
                    kotlin.jvm.internal.p.e(backEvent, "backEvent");
                    OnBackPressedDispatcher.this.m(backEvent);
                }

                @Override // l9.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((BackEventCompat) obj);
                    return y8.s.f25199a;
                }
            }, new l9.l() { // from class: androidx.activity.OnBackPressedDispatcher.2
                {
                    super(1);
                }

                public final void a(BackEventCompat backEvent) {
                    kotlin.jvm.internal.p.e(backEvent, "backEvent");
                    OnBackPressedDispatcher.this.l(backEvent);
                }

                @Override // l9.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((BackEventCompat) obj);
                    return y8.s.f25199a;
                }
            }, new l9.a() { // from class: androidx.activity.OnBackPressedDispatcher.3
                {
                    super(0);
                }

                @Override // l9.a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m0invoke();
                    return y8.s.f25199a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m0invoke() {
                    OnBackPressedDispatcher.this.k();
                }
            }, new l9.a() { // from class: androidx.activity.OnBackPressedDispatcher.4
                {
                    super(0);
                }

                @Override // l9.a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m1invoke();
                    return y8.s.f25199a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m1invoke() {
                    OnBackPressedDispatcher.this.j();
                }
            }) : a.f248a.b(new l9.a() { // from class: androidx.activity.OnBackPressedDispatcher.5
                {
                    super(0);
                }

                @Override // l9.a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m2invoke();
                    return y8.s.f25199a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m2invoke() {
                    OnBackPressedDispatcher.this.k();
                }
            });
        }
    }

    public final void h(androidx.lifecycle.n owner, n onBackPressedCallback) {
        kotlin.jvm.internal.p.e(owner, "owner");
        kotlin.jvm.internal.p.e(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = owner.getLifecycle();
        if (lifecycle.b() == Lifecycle.State.DESTROYED) {
            return;
        }
        onBackPressedCallback.a(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        p();
        onBackPressedCallback.k(new OnBackPressedDispatcher$addCallback$1(this));
    }

    public final androidx.activity.b i(n onBackPressedCallback) {
        kotlin.jvm.internal.p.e(onBackPressedCallback, "onBackPressedCallback");
        this.f238c.add(onBackPressedCallback);
        c cVar = new c(this, onBackPressedCallback);
        onBackPressedCallback.a(cVar);
        p();
        onBackPressedCallback.k(new OnBackPressedDispatcher$addCancellableCallback$1(this));
        return cVar;
    }

    public final void j() {
        Object objPrevious;
        z8.j jVar = this.f238c;
        ListIterator<E> listIterator = jVar.listIterator(jVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((n) objPrevious).g()) {
                    break;
                }
            }
        }
        n nVar = (n) objPrevious;
        this.f239d = null;
        if (nVar != null) {
            nVar.c();
        }
    }

    public final void k() {
        Object objPrevious;
        z8.j jVar = this.f238c;
        ListIterator<E> listIterator = jVar.listIterator(jVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((n) objPrevious).g()) {
                    break;
                }
            }
        }
        n nVar = (n) objPrevious;
        this.f239d = null;
        if (nVar != null) {
            nVar.d();
            return;
        }
        Runnable runnable = this.f236a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void l(BackEventCompat backEventCompat) {
        Object objPrevious;
        z8.j jVar = this.f238c;
        ListIterator<E> listIterator = jVar.listIterator(jVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((n) objPrevious).g()) {
                    break;
                }
            }
        }
        n nVar = (n) objPrevious;
        if (nVar != null) {
            nVar.e(backEventCompat);
        }
    }

    public final void m(BackEventCompat backEventCompat) {
        Object objPrevious;
        z8.j jVar = this.f238c;
        ListIterator<E> listIterator = jVar.listIterator(jVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((n) objPrevious).g()) {
                    break;
                }
            }
        }
        n nVar = (n) objPrevious;
        this.f239d = nVar;
        if (nVar != null) {
            nVar.f(backEventCompat);
        }
    }

    public final void n(OnBackInvokedDispatcher invoker) {
        kotlin.jvm.internal.p.e(invoker, "invoker");
        this.f241f = invoker;
        o(this.f243h);
    }

    public final void o(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f241f;
        OnBackInvokedCallback onBackInvokedCallback = this.f240e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z10 && !this.f242g) {
            a.f248a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f242g = true;
        } else {
            if (z10 || !this.f242g) {
                return;
            }
            a.f248a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f242g = false;
        }
    }

    public final void p() {
        boolean z10 = this.f243h;
        z8.j jVar = this.f238c;
        boolean z11 = false;
        if (!o.a(jVar) || !jVar.isEmpty()) {
            Iterator<E> it = jVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((n) it.next()).g()) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f243h = z11;
        if (z11 != z10) {
            r0.b bVar = this.f237b;
            if (bVar != null) {
                bVar.accept(Boolean.valueOf(z11));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                o(z11);
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, null);
    }
}
