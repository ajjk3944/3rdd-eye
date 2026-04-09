package com.yandex.mobile.ads.impl;

import A9.C0575f;
import android.content.Context;
import b9.C1992A;
import com.yandex.mobile.ads.impl.gv1;
import f9.InterfaceC4350h;

/* loaded from: classes3.dex */
public final class u01 {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f33836f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static volatile u01 f33837g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f33838h = 0;

    /* renamed from: a, reason: collision with root package name */
    private final p01 f33839a;

    /* renamed from: b, reason: collision with root package name */
    private final t01 f33840b;

    /* renamed from: c, reason: collision with root package name */
    private final iv1 f33841c;

    /* renamed from: d, reason: collision with root package name */
    private final vu1 f33842d;

    /* renamed from: e, reason: collision with root package name */
    private b f33843e;

    public static final class a {
        public static u01 a(vu1 sdkEnvironmentModule) {
            kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
            if (u01.f33837g == null) {
                synchronized (u01.f33836f) {
                    try {
                        if (u01.f33837g == null) {
                            u01.f33837g = new u01(new p01(new q01()), new t01(), new iv1(), sdkEnvironmentModule);
                        }
                        C1992A c1992a = C1992A.f18074a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            u01 u01Var = u01.f33837g;
            if (u01Var != null) {
                return u01Var;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f33844b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f33845c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f33846d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f33847e;

        static {
            b bVar = new b(0, "INITIALIZATION_NOT_STARTED");
            f33844b = bVar;
            b bVar2 = new b(1, "INITIALIZING");
            f33845c = bVar2;
            b bVar3 = new b(2, "INITIALIZED");
            f33846d = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            f33847e = bVarArr;
            com.google.gson.internal.c.l(bVarArr);
        }

        private b(int i, String str) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f33847e.clone();
        }
    }

    public /* synthetic */ u01(p01 p01Var, t01 t01Var, iv1 iv1Var, vu1 vu1Var) {
        this(p01Var, t01Var, iv1Var, vu1Var, b.f33844b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(u01 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        this$0.f33840b.a();
    }

    public final void a(gv1 result) {
        kotlin.jvm.internal.l.f(result, "result");
        if (result instanceof gv1.b) {
            synchronized (f33836f) {
                this.f33843e = b.f33846d;
                C1992A c1992a = C1992A.f18074a;
            }
        } else if (result instanceof gv1.a) {
            synchronized (f33836f) {
                this.f33843e = b.f33844b;
                C1992A c1992a2 = C1992A.f18074a;
            }
        }
        this.f33839a.b(new P0(this, 11));
    }

    private u01(p01 p01Var, t01 t01Var, iv1 iv1Var, vu1 vu1Var, b bVar) {
        this.f33839a = p01Var;
        this.f33840b = t01Var;
        this.f33841c = iv1Var;
        this.f33842d = vu1Var;
        this.f33843e = bVar;
    }

    private final void b(Context context, ws wsVar) {
        boolean z10;
        boolean z11;
        synchronized (f33836f) {
            try {
                uk0 uk0Var = new uk0(this.f33839a, wsVar);
                z10 = true;
                z11 = false;
                if (this.f33843e != b.f33846d) {
                    this.f33840b.a(uk0Var);
                    if (this.f33843e == b.f33844b) {
                        this.f33843e = b.f33845c;
                        z11 = true;
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            this.f33839a.b(new I1(wsVar, 2));
        }
        if (z11) {
            iv1 iv1Var = this.f33841c;
            vu1 sdkEnvironmentModule = this.f33842d;
            iv1Var.getClass();
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
            this.f33839a.a(new hv1(context, sdkEnvironmentModule, A9.F.a(InterfaceC4350h.a.C0456a.d(C0575f.a(), A9.U.f212b)), a.a(sdkEnvironmentModule)));
        }
    }

    public final void a(Context context, ws initializationListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(initializationListener, "initializationListener");
        C4146l0.a(context);
        this.f33839a.a(new J4.f(this, context, initializationListener, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(u01 this$0, Context context, ws initializationListener) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(context, "$context");
        kotlin.jvm.internal.l.f(initializationListener, "$initializationListener");
        this$0.b(context, initializationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ws initializationListener) {
        kotlin.jvm.internal.l.f(initializationListener, "$initializationListener");
        initializationListener.onInitializationCompleted();
    }
}
