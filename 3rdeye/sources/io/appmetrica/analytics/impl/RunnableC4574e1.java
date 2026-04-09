package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.e1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4574e1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f40775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f40776b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f40777c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f40778d;

    public RunnableC4574e1(C4859p1 c4859p1, Context context, StartupParamsCallback startupParamsCallback, List list) {
        this.f40778d = c4859p1;
        this.f40775a = context;
        this.f40776b = startupParamsCallback;
        this.f40777c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4986u0 c4986u0 = this.f40778d.f41402a;
        Context applicationContext = this.f40775a.getApplicationContext();
        c4986u0.getClass();
        C4961t0 c4961t0A = C4961t0.a(applicationContext);
        c4961t0A.f().a(this.f40776b, this.f40777c);
    }
}
