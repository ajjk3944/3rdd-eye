package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes3.dex */
public final class Vc {

    /* renamed from: a, reason: collision with root package name */
    public final Tm f40281a;

    /* renamed from: b, reason: collision with root package name */
    public final Tm f40282b;

    /* renamed from: c, reason: collision with root package name */
    public final H4 f40283c;

    /* renamed from: d, reason: collision with root package name */
    public final PublicLogger f40284d;

    /* renamed from: e, reason: collision with root package name */
    public final String f40285e;

    public Vc(String str, PublicLogger publicLogger) {
        this(new H4(30), new Tm(50, str.concat("map key"), publicLogger), new Tm(4000, str.concat("map value"), publicLogger), str, publicLogger);
    }

    public Vc(H4 h42, Tm tm, Tm tm2, String str, PublicLogger publicLogger) {
        this.f40283c = h42;
        this.f40281a = tm;
        this.f40282b = tm2;
        this.f40285e = str;
        this.f40284d = publicLogger;
    }
}
