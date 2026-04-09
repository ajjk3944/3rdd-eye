package com.yandex.mobile.ads.impl;

import C.RunnableC0615b;
import b9.InterfaceC2000g;
import c9.C2077A;
import c9.C2088i;
import c9.C2091l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class g01 implements mp1 {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f27500e = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final mp1 f27501a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f27502b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f27503c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC2000g f27504d;

    public g01(mp1 mp1Var, InterfaceC2000g<? extends e92> lazyVarioqubAdapter, boolean z10, Executor executor) {
        kotlin.jvm.internal.l.f(lazyVarioqubAdapter, "lazyVarioqubAdapter");
        kotlin.jvm.internal.l.f(executor, "executor");
        this.f27501a = mp1Var;
        this.f27502b = z10;
        this.f27503c = executor;
        this.f27504d = lazyVarioqubAdapter;
    }

    private static void a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2077A.l(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), C2091l.t((Object[]) entry.getValue()));
        }
        linkedHashMap.toString();
        fp0.b(new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.mp1
    public final void reportAnr(Map<Thread, StackTraceElement[]> traces) {
        kotlin.jvm.internal.l.f(traces, "traces");
        if (this.f27501a != null) {
            this.f27503c.execute(new L(2, this, traces));
        } else {
            fp0.d(new Object[0]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.mp1
    public final void reportError(String message, Throwable error) {
        kotlin.jvm.internal.l.f(message, "message");
        kotlin.jvm.internal.l.f(error, "error");
        if (this.f27502b) {
            if (this.f27501a != null) {
                this.f27503c.execute(new J4.e(this, message, error, 14));
            } else {
                fp0.d(new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.mp1
    public final void reportUnhandledException(Throwable throwable) {
        kotlin.jvm.internal.l.f(throwable, "throwable");
        if (this.f27501a != null) {
            this.f27503c.execute(new L4(4, this, throwable));
        } else {
            fp0.d(new Object[0]);
        }
    }

    private static void a(String str, Throwable th) {
        Objects.toString(th);
        fp0.b(new Object[0]);
    }

    private static void a(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2077A.l(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object[] objArr = {entry.getValue()};
            StringBuilder sb = new StringBuilder(7);
            C2088i.b(objArr, sb, new ArrayList());
            linkedHashMap.put(key, sb.toString());
        }
        linkedHashMap.toString();
        fp0.a(new Object[0]);
    }

    private static void a(Throwable th) {
        Objects.toString(th);
        fp0.b(new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(g01 this$0, Map traces) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(traces, "$traces");
        try {
            a(traces);
            this$0.f27501a.reportAnr(traces);
        } catch (Throwable unused) {
            fp0.c(new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(g01 this$0, String message, Throwable error) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(message, "$message");
        kotlin.jvm.internal.l.f(error, "$error");
        try {
            a(message, error);
            this$0.f27501a.reportError(message, error);
        } catch (Throwable unused) {
            fp0.c(new Object[0]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.mp1
    public final void a(ip1 report) {
        kotlin.jvm.internal.l.f(report, "report");
        if (this.f27501a != null) {
            this.f27503c.execute(new RunnableC0615b(24, this, report));
        } else {
            fp0.d(new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(g01 this$0, ip1 report) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(report, "$report");
        try {
            f92.a((e92) this$0.f27504d.getValue(), report);
            a(report.c(), report.b());
            this$0.f27501a.a(report);
        } catch (Throwable unused) {
            fp0.c(new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(g01 this$0, Throwable throwable) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(throwable, "$throwable");
        try {
            a(throwable);
            this$0.f27501a.reportUnhandledException(throwable);
        } catch (Throwable unused) {
            fp0.c(new Object[0]);
        }
    }
}
