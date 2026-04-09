package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class bk implements of {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25305a;

    /* renamed from: b, reason: collision with root package name */
    private final zs0 f25306b;

    /* renamed from: c, reason: collision with root package name */
    private final vs0 f25307c;

    /* renamed from: d, reason: collision with root package name */
    private final qf f25308d;

    /* renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArrayList<nf> f25309e;

    /* renamed from: f, reason: collision with root package name */
    private qs f25310f;

    public bk(Context context, rm2 sdkEnvironmentModule, zs0 mainThreadUsageValidator, vs0 mainThreadExecutor, qf adLoadControllerFactory) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(mainThreadUsageValidator, "mainThreadUsageValidator");
        kotlin.jvm.internal.l.f(mainThreadExecutor, "mainThreadExecutor");
        kotlin.jvm.internal.l.f(adLoadControllerFactory, "adLoadControllerFactory");
        this.f25305a = context;
        this.f25306b = mainThreadUsageValidator;
        this.f25307c = mainThreadExecutor;
        this.f25308d = adLoadControllerFactory;
        this.f25309e = new CopyOnWriteArrayList<>();
        mainThreadUsageValidator.a();
    }

    @Override // com.yandex.mobile.ads.impl.of
    public final void a() {
        this.f25306b.a();
        this.f25307c.a();
        Iterator<nf> it = this.f25309e.iterator();
        while (it.hasNext()) {
            nf next = it.next();
            next.a((qs) null);
            next.e();
        }
        this.f25309e.clear();
    }

    @Override // com.yandex.mobile.ads.impl.of
    public final void a(h7 adRequestData) {
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        this.f25306b.a();
        this.f25307c.a(new B.c(29, this, adRequestData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(bk this$0, h7 adRequestData) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(adRequestData, "$adRequestData");
        nf nfVarA = this$0.f25308d.a(this$0.f25305a, this$0, adRequestData, null);
        this$0.f25309e.add(nfVarA);
        nfVarA.a(adRequestData.a());
        nfVarA.a(this$0.f25310f);
        nfVarA.b(adRequestData);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4164n4
    public final void a(dd0 dd0Var) {
        nf loadController = (nf) dd0Var;
        kotlin.jvm.internal.l.f(loadController, "loadController");
        this.f25306b.a();
        loadController.a((qs) null);
        this.f25309e.remove(loadController);
    }

    @Override // com.yandex.mobile.ads.impl.of
    public final void a(el2 el2Var) {
        this.f25306b.a();
        this.f25310f = el2Var;
        Iterator<nf> it = this.f25309e.iterator();
        while (it.hasNext()) {
            it.next().a((qs) el2Var);
        }
    }
}
