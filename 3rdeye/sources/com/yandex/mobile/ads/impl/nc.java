package com.yandex.mobile.ads.impl;

import C.RunnableC0615b;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class nc {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f30831a;

    /* renamed from: b, reason: collision with root package name */
    private final jc f30832b;

    /* renamed from: c, reason: collision with root package name */
    private final jc f30833c;

    /* renamed from: d, reason: collision with root package name */
    private final me0 f30834d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ nc(Context context) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new v31(v31.f34329d));
        kotlin.jvm.internal.l.e(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this(context, executorServiceNewSingleThreadExecutor, new oe0(context), new of0(context), ne0.a(context));
    }

    public final void a(lc listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f30831a.execute(new RunnableC0615b(29, this, listener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(nc this$0, lc listener) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(listener, "$listener");
        ec ecVarA = this$0.f30832b.a();
        ec ecVarA2 = this$0.f30833c.a();
        this$0.f30834d.b(ecVarA);
        gc gcVar = new gc(ecVarA, ecVarA2, this$0.f30834d.a(ecVarA));
        if (gcVar.a() == null && gcVar.c() == null) {
            listener.a();
        } else {
            listener.a(gcVar);
        }
    }

    public nc(Context context, Executor executor, jc gmsAdvertisingInfoProvider, jc hmsAdvertisingInfoProvider, me0 gmsAdvertisingIdStorage) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(executor, "executor");
        kotlin.jvm.internal.l.f(gmsAdvertisingInfoProvider, "gmsAdvertisingInfoProvider");
        kotlin.jvm.internal.l.f(hmsAdvertisingInfoProvider, "hmsAdvertisingInfoProvider");
        kotlin.jvm.internal.l.f(gmsAdvertisingIdStorage, "gmsAdvertisingIdStorage");
        this.f30831a = executor;
        this.f30832b = gmsAdvertisingInfoProvider;
        this.f30833c = hmsAdvertisingInfoProvider;
        this.f30834d = gmsAdvertisingIdStorage;
    }
}
