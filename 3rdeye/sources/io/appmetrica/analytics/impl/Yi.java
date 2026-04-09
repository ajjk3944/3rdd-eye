package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes3.dex */
public final class Yi {

    /* renamed from: a, reason: collision with root package name */
    public final Revenue f40425a;

    /* renamed from: b, reason: collision with root package name */
    public final Rm f40426b;

    /* renamed from: c, reason: collision with root package name */
    public final Zm f40427c;

    /* renamed from: d, reason: collision with root package name */
    public final Zm f40428d;

    /* renamed from: e, reason: collision with root package name */
    public final PublicLogger f40429e;

    public Yi(Revenue revenue, PublicLogger publicLogger) {
        this.f40429e = publicLogger;
        this.f40425a = revenue;
        this.f40426b = new Rm(30720, "revenue payload", publicLogger);
        this.f40427c = new Zm(new Rm(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.f40428d = new Zm(new Tm(1000, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}
