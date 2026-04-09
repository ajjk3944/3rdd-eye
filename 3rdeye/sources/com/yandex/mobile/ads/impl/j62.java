package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import com.yandex.mobile.ads.impl.i62;

/* loaded from: classes3.dex */
public final class j62 implements InterfaceC4160n0 {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f28988d = {fa.a(j62.class, "contextReference", "getContextReference()Landroid/content/Context;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final i62.a f28989a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4083c0 f28990b;

    /* renamed from: c, reason: collision with root package name */
    private final ao1 f28991c;

    public j62(Activity context, q81 trackingListener, InterfaceC4083c0 activityBackgroundListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(trackingListener, "trackingListener");
        kotlin.jvm.internal.l.f(activityBackgroundListener, "activityBackgroundListener");
        this.f28989a = trackingListener;
        this.f28990b = activityBackgroundListener;
        this.f28991c = bo1.a(context);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4160n0
    public final void a(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        Context context = (Context) this.f28991c.getValue(this, f28988d[0]);
        if (context == null || !context.equals(activity)) {
            return;
        }
        this.f28989a.b();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4160n0
    public final void b(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        Context context = (Context) this.f28991c.getValue(this, f28988d[0]);
        if (context == null || !context.equals(activity)) {
            return;
        }
        this.f28989a.a();
    }

    public final void c(Activity activityContext) {
        kotlin.jvm.internal.l.f(activityContext, "activityContext");
        this.f28990b.b(activityContext, this);
    }

    public final void a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f28990b.a(context, this);
    }
}
