package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.vungle.ads.RunnableC4053k;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class z51 implements c61 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f36207a;

    /* renamed from: b, reason: collision with root package name */
    private final vu1 f36208b;

    /* renamed from: c, reason: collision with root package name */
    private final ns f36209c;

    /* renamed from: d, reason: collision with root package name */
    private final List<b61> f36210d;

    /* renamed from: e, reason: collision with root package name */
    private final zs0 f36211e;

    /* renamed from: f, reason: collision with root package name */
    private final vs0 f36212f;

    /* renamed from: g, reason: collision with root package name */
    private ot f36213g;

    /* renamed from: h, reason: collision with root package name */
    private ut f36214h;
    private du i;

    public /* synthetic */ z51(Context context, rm2 rm2Var, ns nsVar) {
        this(context, rm2Var, nsVar, new CopyOnWriteArrayList(), new zs0(context), new vs0(), null, null, null);
    }

    public final void a() {
        this.f36211e.a();
        this.f36212f.a();
        Iterator<b61> it = this.f36210d.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.f36210d.clear();
    }

    public final void b(h7 adRequestData, m61 requestPolicy) {
        r91 nativeResponseType = r91.f32563e;
        u91 sourceType = u91.f33976c;
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        kotlin.jvm.internal.l.f(nativeResponseType, "nativeResponseType");
        kotlin.jvm.internal.l.f(sourceType, "sourceType");
        kotlin.jvm.internal.l.f(requestPolicy, "requestPolicy");
        this.f36211e.a();
        this.f36212f.a(new T1.E(adRequestData, nativeResponseType, sourceType, requestPolicy, this, 2));
    }

    public z51(Context context, rm2 sdkEnvironmentModule, ns adType, List nativeAdLoadingItems, zs0 mainThreadUsageValidator, vs0 mainThreadExecutor, ot otVar, ut utVar, du duVar) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adType, "adType");
        kotlin.jvm.internal.l.f(nativeAdLoadingItems, "nativeAdLoadingItems");
        kotlin.jvm.internal.l.f(mainThreadUsageValidator, "mainThreadUsageValidator");
        kotlin.jvm.internal.l.f(mainThreadExecutor, "mainThreadExecutor");
        this.f36207a = context;
        this.f36208b = sdkEnvironmentModule;
        this.f36209c = adType;
        this.f36210d = nativeAdLoadingItems;
        this.f36211e = mainThreadUsageValidator;
        this.f36212f = mainThreadExecutor;
        this.f36213g = otVar;
        this.f36214h = utVar;
        this.i = duVar;
        mainThreadUsageValidator.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(h7 adRequestData, r91 nativeResponseType, u91 sourceType, bq1 requestPolicy, z51 this$0) {
        kotlin.jvm.internal.l.f(adRequestData, "$adRequestData");
        kotlin.jvm.internal.l.f(nativeResponseType, "$nativeResponseType");
        kotlin.jvm.internal.l.f(sourceType, "$sourceType");
        kotlin.jvm.internal.l.f(requestPolicy, "$requestPolicy");
        kotlin.jvm.internal.l.f(this$0, "this$0");
        b61 b61Var = new b61(this$0.f36207a, this$0.f36208b, new l61(adRequestData, nativeResponseType, sourceType, requestPolicy, 1), this$0, this$0.f36209c, 464);
        this$0.f36210d.add(b61Var);
        b61Var.a(this$0.i);
        b61Var.c();
    }

    public final void a(h7 adRequestData, m61 requestPolicy) {
        r91 nativeResponseType = r91.f32561c;
        u91 sourceType = u91.f33976c;
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        kotlin.jvm.internal.l.f(nativeResponseType, "nativeResponseType");
        kotlin.jvm.internal.l.f(sourceType, "sourceType");
        kotlin.jvm.internal.l.f(requestPolicy, "requestPolicy");
        this.f36211e.a();
        this.f36212f.a(new RunnableC4053k(adRequestData, nativeResponseType, sourceType, requestPolicy, this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(h7 adRequestData, r91 nativeResponseType, u91 sourceType, bq1 requestPolicy, z51 this$0) {
        kotlin.jvm.internal.l.f(adRequestData, "$adRequestData");
        kotlin.jvm.internal.l.f(nativeResponseType, "$nativeResponseType");
        kotlin.jvm.internal.l.f(sourceType, "$sourceType");
        kotlin.jvm.internal.l.f(requestPolicy, "$requestPolicy");
        kotlin.jvm.internal.l.f(this$0, "this$0");
        b61 b61Var = new b61(this$0.f36207a, this$0.f36208b, new l61(adRequestData, nativeResponseType, sourceType, requestPolicy, 1), this$0, this$0.f36209c, 464);
        this$0.f36210d.add(b61Var);
        b61Var.a(this$0.f36213g);
        b61Var.c();
    }

    public final void a(final h7 adRequestData, final m61 requestPolicy, final int i) {
        final r91 nativeResponseType = r91.f32562d;
        final u91 sourceType = u91.f33976c;
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        kotlin.jvm.internal.l.f(nativeResponseType, "nativeResponseType");
        kotlin.jvm.internal.l.f(sourceType, "sourceType");
        kotlin.jvm.internal.l.f(requestPolicy, "requestPolicy");
        this.f36211e.a();
        this.f36212f.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.O4
            @Override // java.lang.Runnable
            public final void run() {
                z51.a(adRequestData, nativeResponseType, sourceType, requestPolicy, i, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(h7 adRequestData, r91 nativeResponseType, u91 sourceType, bq1 requestPolicy, int i, z51 this$0) {
        kotlin.jvm.internal.l.f(adRequestData, "$adRequestData");
        kotlin.jvm.internal.l.f(nativeResponseType, "$nativeResponseType");
        kotlin.jvm.internal.l.f(sourceType, "$sourceType");
        kotlin.jvm.internal.l.f(requestPolicy, "$requestPolicy");
        kotlin.jvm.internal.l.f(this$0, "this$0");
        b61 b61Var = new b61(this$0.f36207a, this$0.f36208b, new l61(adRequestData, nativeResponseType, sourceType, requestPolicy, i), this$0, null, 496);
        this$0.f36210d.add(b61Var);
        b61Var.a(this$0.f36214h);
        b61Var.c();
    }

    @Override // com.yandex.mobile.ads.impl.c61
    public final void a(b61 nativeAdLoadingItem) {
        kotlin.jvm.internal.l.f(nativeAdLoadingItem, "nativeAdLoadingItem");
        this.f36211e.a();
        this.f36210d.remove(nativeAdLoadingItem);
    }

    public final void a(ot otVar) {
        this.f36211e.a();
        this.f36213g = otVar;
        Iterator<b61> it = this.f36210d.iterator();
        while (it.hasNext()) {
            it.next().a(otVar);
        }
    }

    public final void a(lm2 lm2Var) {
        this.f36211e.a();
        this.f36214h = lm2Var;
        Iterator<b61> it = this.f36210d.iterator();
        while (it.hasNext()) {
            it.next().a(lm2Var);
        }
    }

    public final void a(um2 um2Var) {
        this.f36211e.a();
        this.i = um2Var;
        Iterator<b61> it = this.f36210d.iterator();
        while (it.hasNext()) {
            it.next().a(um2Var);
        }
    }
}
