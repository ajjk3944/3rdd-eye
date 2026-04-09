package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.tg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4977tg implements InterfaceC4662hb {

    /* renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f41692a;

    /* renamed from: b, reason: collision with root package name */
    public final InstallReferrerClient f41693b;

    public C4977tg(Context context, ICommonExecutor iCommonExecutor) {
        this.f41692a = iCommonExecutor;
        this.f41693b = InstallReferrerClient.newBuilder(context).build();
    }

    public static final void b(Dg dg, Throwable th) {
        dg.a(th);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4662hb
    public final void a(Dg dg) throws Throwable {
        this.f41693b.startConnection(new C4951sg(this, dg));
    }

    public final void a(Dg dg, Throwable th) {
        this.f41692a.execute(new B.a(27, dg, th));
    }
}
