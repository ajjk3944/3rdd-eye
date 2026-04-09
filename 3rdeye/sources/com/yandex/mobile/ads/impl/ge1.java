package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import b9.C1992A;
import b9.InterfaceC1997d;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ge1 {

    /* renamed from: g, reason: collision with root package name */
    public static final a f27640g = new a(0);

    /* renamed from: h, reason: collision with root package name */
    private static final long f27641h = TimeUnit.SECONDS.toMillis(1);
    private static volatile ge1 i;

    /* renamed from: a, reason: collision with root package name */
    private final Object f27642a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f27643b;

    /* renamed from: c, reason: collision with root package name */
    private final fe1 f27644c;

    /* renamed from: d, reason: collision with root package name */
    private final de1 f27645d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f27646e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f27647f;

    public static final class a {
        private a() {
        }

        public final ge1 a(Context context) {
            ge1 ge1Var;
            kotlin.jvm.internal.l.f(context, "context");
            ge1 ge1Var2 = ge1.i;
            if (ge1Var2 != null) {
                return ge1Var2;
            }
            synchronized (this) {
                ge1Var = ge1.i;
                if (ge1Var == null) {
                    ge1Var = new ge1(context, 0);
                    ge1.i = ge1Var;
                }
            }
            return ge1Var;
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    public /* synthetic */ class b implements pa2, kotlin.jvm.internal.h {
        public b() {
        }

        @Override // com.yandex.mobile.ads.impl.pa2
        public final void a() {
            ge1.a(ge1.this);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof pa2) && (obj instanceof kotlin.jvm.internal.h)) {
                return kotlin.jvm.internal.l.b(getFunctionDelegate(), ((kotlin.jvm.internal.h) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.h
        public final InterfaceC1997d<?> getFunctionDelegate() {
            return new kotlin.jvm.internal.k(0, ge1.this, ge1.class, "onOmSdkJsControllerLoaded", "onOmSdkJsControllerLoaded()V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    private ge1(Context context) {
        this.f27642a = new Object();
        this.f27643b = new Handler(Looper.getMainLooper());
        this.f27644c = new fe1(context);
        this.f27645d = new de1();
    }

    public static final void a(ge1 ge1Var) {
        synchronized (ge1Var.f27642a) {
            ge1Var.f27647f = true;
            C1992A c1992a = C1992A.f18074a;
        }
        ge1Var.d();
        ge1Var.f27645d.b();
    }

    private final void c() {
        this.f27643b.postDelayed(new J2(this, 5), f27641h);
    }

    private final void b() {
        boolean z10;
        synchronized (this.f27642a) {
            try {
                if (this.f27646e) {
                    z10 = false;
                } else {
                    z10 = true;
                    this.f27646e = true;
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            c();
            this.f27644c.a(new b());
        }
    }

    private final void d() {
        synchronized (this.f27642a) {
            this.f27643b.removeCallbacksAndMessages(null);
            this.f27646e = false;
            C1992A c1992a = C1992A.f18074a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ge1 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        this$0.f27644c.a();
        synchronized (this$0.f27642a) {
            this$0.f27647f = true;
            C1992A c1992a = C1992A.f18074a;
        }
        this$0.d();
        this$0.f27645d.b();
    }

    public /* synthetic */ ge1(Context context, int i10) {
        this(context);
    }

    public final void a(pa2 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        synchronized (this.f27642a) {
            try {
                this.f27645d.b(listener);
                if (!this.f27645d.a()) {
                    this.f27644c.a();
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(pa2 listener) {
        boolean z10;
        kotlin.jvm.internal.l.f(listener, "listener");
        synchronized (this.f27642a) {
            try {
                z10 = this.f27647f;
                if (!z10) {
                    this.f27645d.a(listener);
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z10) {
            b();
        } else {
            listener.a();
        }
    }
}
