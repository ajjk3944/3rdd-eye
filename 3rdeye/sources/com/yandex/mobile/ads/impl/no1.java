package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ko1;
import java.util.List;

/* loaded from: classes3.dex */
public final class no1 implements ko1.b {

    /* renamed from: a, reason: collision with root package name */
    private final C4101e4 f30956a;

    /* renamed from: b, reason: collision with root package name */
    private final wo1 f30957b;

    /* renamed from: c, reason: collision with root package name */
    private final qo1 f30958c;

    /* renamed from: d, reason: collision with root package name */
    private final mo1 f30959d;

    /* renamed from: e, reason: collision with root package name */
    private final ko1 f30960e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f30961f;

    public no1(Context context, g7 renderingValidator, a8 adResponse, C4072a3 adConfiguration, e9 adStructureType, C4101e4 adIdStorageManager, wo1 renderingImpressionTrackingListener, qo1 qo1Var, mo1 renderTracker) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(renderingValidator, "renderingValidator");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adStructureType, "adStructureType");
        kotlin.jvm.internal.l.f(adIdStorageManager, "adIdStorageManager");
        kotlin.jvm.internal.l.f(renderingImpressionTrackingListener, "renderingImpressionTrackingListener");
        kotlin.jvm.internal.l.f(renderTracker, "renderTracker");
        this.f30956a = adIdStorageManager;
        this.f30957b = renderingImpressionTrackingListener;
        this.f30958c = qo1Var;
        this.f30959d = renderTracker;
        this.f30960e = new ko1(renderingValidator, this);
    }

    @Override // com.yandex.mobile.ads.impl.ko1.b
    public final void a() {
        qo1 qo1Var = this.f30958c;
        if (qo1Var != null) {
            qo1Var.a();
        }
        this.f30959d.a();
        this.f30956a.b();
        this.f30957b.f();
    }

    public final void b() {
        if (this.f30961f) {
            return;
        }
        this.f30961f = true;
        this.f30960e.a();
    }

    public final void c() {
        this.f30961f = false;
        this.f30960e.b();
    }

    public final void a(j91 reportParameterManager) {
        kotlin.jvm.internal.l.f(reportParameterManager, "reportParameterManager");
        this.f30959d.a(reportParameterManager);
    }

    public /* synthetic */ no1(Context context, g7 g7Var, a8 a8Var, C4072a3 c4072a3, e9 e9Var, C4101e4 c4101e4, wo1 wo1Var, qo1 qo1Var, List list) {
        this(context, g7Var, a8Var, c4072a3, e9Var, c4101e4, wo1Var, qo1Var, new mo1(context, a8Var, c4072a3, e9Var, list));
    }
}
