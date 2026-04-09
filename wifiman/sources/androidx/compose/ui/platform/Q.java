package androidx.compose.ui.platform;

import Ii.AbstractC3059i;
import Ii.C3048c0;
import T.InterfaceC3530g0;
import Zg.C3681m;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class Q extends Ii.J {

    /* renamed from: m, reason: collision with root package name */
    public static final c f29278m = new c(null);

    /* renamed from: n, reason: collision with root package name */
    public static final int f29279n = 8;

    /* renamed from: o, reason: collision with root package name */
    private static final Yg.m f29280o = Yg.n.b(a.f29292a);

    /* renamed from: p, reason: collision with root package name */
    private static final ThreadLocal f29281p = new b();

    /* renamed from: c, reason: collision with root package name */
    private final Choreographer f29282c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f29283d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f29284e;

    /* renamed from: f, reason: collision with root package name */
    private final C3681m f29285f;

    /* renamed from: g, reason: collision with root package name */
    private List f29286g;

    /* renamed from: h, reason: collision with root package name */
    private List f29287h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f29288i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f29289j;

    /* renamed from: k, reason: collision with root package name */
    private final d f29290k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC3530g0 f29291l;

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29292a = new a();

        /* renamed from: androidx.compose.ui.platform.Q$a$a, reason: collision with other inner class name */
        static final class C1073a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f29293a;

            C1073a(InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new C1073a(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f29293a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
                return Choreographer.getInstance();
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((C1073a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC5384i invoke() {
            Q q10 = new Q(S.b() ? Choreographer.getInstance() : (Choreographer) AbstractC3059i.e(C3048c0.c(), new C1073a(null)), A1.i.a(Looper.getMainLooper()), null);
            return q10.plus(q10.y0());
        }
    }

    public static final class b extends ThreadLocal {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC5384i initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread");
            }
            Q q10 = new Q(choreographer, A1.i.a(looperMyLooper), null);
            return q10.plus(q10.y0());
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC5384i a() {
            if (S.b()) {
                return b();
            }
            InterfaceC5384i interfaceC5384i = (InterfaceC5384i) Q.f29281p.get();
            if (interfaceC5384i != null) {
                return interfaceC5384i;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread");
        }

        public final InterfaceC5384i b() {
            return (InterfaceC5384i) Q.f29280o.getValue();
        }

        private c() {
        }
    }

    public static final class d implements Choreographer.FrameCallback, Runnable {
        d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            Q.this.f29283d.removeCallbacks(this);
            Q.this.B0();
            Q.this.A0(j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            Q.this.B0();
            Object obj = Q.this.f29284e;
            Q q10 = Q.this;
            synchronized (obj) {
                try {
                    if (q10.f29286g.isEmpty()) {
                        q10.x0().removeFrameCallback(this);
                        q10.f29289j = false;
                    }
                    Yg.J j10 = Yg.J.f24997a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public /* synthetic */ Q(Choreographer choreographer, Handler handler, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographer, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0(long j10) {
        synchronized (this.f29284e) {
            if (this.f29289j) {
                this.f29289j = false;
                List list = this.f29286g;
                this.f29286g = this.f29287h;
                this.f29287h = list;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Choreographer.FrameCallback) list.get(i10)).doFrame(j10);
                }
                list.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0() {
        boolean z10;
        do {
            Runnable runnableZ0 = z0();
            while (runnableZ0 != null) {
                runnableZ0.run();
                runnableZ0 = z0();
            }
            synchronized (this.f29284e) {
                if (this.f29285f.isEmpty()) {
                    z10 = false;
                    this.f29288i = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    private final Runnable z0() {
        Runnable runnable;
        synchronized (this.f29284e) {
            runnable = (Runnable) this.f29285f.N0();
        }
        return runnable;
    }

    public final void C0(Choreographer.FrameCallback frameCallback) {
        synchronized (this.f29284e) {
            try {
                this.f29286g.add(frameCallback);
                if (!this.f29289j) {
                    this.f29289j = true;
                    this.f29282c.postFrameCallback(this.f29290k);
                }
                Yg.J j10 = Yg.J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void D0(Choreographer.FrameCallback frameCallback) {
        synchronized (this.f29284e) {
            this.f29286g.remove(frameCallback);
        }
    }

    @Override // Ii.J
    public void Y(InterfaceC5384i interfaceC5384i, Runnable runnable) {
        synchronized (this.f29284e) {
            try {
                this.f29285f.addLast(runnable);
                if (!this.f29288i) {
                    this.f29288i = true;
                    this.f29283d.post(this.f29290k);
                    if (!this.f29289j) {
                        this.f29289j = true;
                        this.f29282c.postFrameCallback(this.f29290k);
                    }
                }
                Yg.J j10 = Yg.J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Choreographer x0() {
        return this.f29282c;
    }

    public final InterfaceC3530g0 y0() {
        return this.f29291l;
    }

    private Q(Choreographer choreographer, Handler handler) {
        this.f29282c = choreographer;
        this.f29283d = handler;
        this.f29284e = new Object();
        this.f29285f = new C3681m();
        this.f29286g = new ArrayList();
        this.f29287h = new ArrayList();
        this.f29290k = new d();
        this.f29291l = new T(choreographer, this);
    }
}
