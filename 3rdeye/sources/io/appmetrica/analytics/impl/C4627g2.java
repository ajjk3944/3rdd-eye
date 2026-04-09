package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.g2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4627g2 implements AppSetIdProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40913a;

    /* renamed from: b, reason: collision with root package name */
    public final IAppSetIdRetriever f40914b;

    /* renamed from: c, reason: collision with root package name */
    public volatile AppSetId f40915c;

    /* renamed from: d, reason: collision with root package name */
    public CountDownLatch f40916d;

    /* renamed from: e, reason: collision with root package name */
    public final long f40917e;

    /* renamed from: f, reason: collision with root package name */
    public final C4601f2 f40918f;

    public C4627g2(Context context, IAppSetIdRetriever iAppSetIdRetriever) {
        this.f40913a = context;
        this.f40914b = iAppSetIdRetriever;
        this.f40916d = new CountDownLatch(1);
        this.f40917e = 20L;
        this.f40918f = new C4601f2(this);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider
    public final synchronized AppSetId getAppSetId() {
        AppSetId appSetId;
        if (this.f40915c == null) {
            try {
                this.f40916d = new CountDownLatch(1);
                this.f40914b.retrieveAppSetId(this.f40913a, this.f40918f);
                this.f40916d.await(this.f40917e, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        appSetId = this.f40915c;
        if (appSetId == null) {
            appSetId = new AppSetId(null, AppSetIdScope.UNKNOWN);
            this.f40915c = appSetId;
        }
        return appSetId;
    }

    public C4627g2(Context context) {
        this(context, AbstractC4653h2.a());
    }
}
