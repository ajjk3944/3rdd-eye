package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class kn0 implements ec2 {

    /* renamed from: a, reason: collision with root package name */
    private final at f29733a;

    /* renamed from: b, reason: collision with root package name */
    private final String f29734b;

    /* renamed from: c, reason: collision with root package name */
    private final int f29735c;

    /* renamed from: d, reason: collision with root package name */
    private final int f29736d;

    /* renamed from: e, reason: collision with root package name */
    private final String f29737e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f29738f;

    /* renamed from: g, reason: collision with root package name */
    private final String f29739g;

    public kn0(at adBreakPosition, String url, int i, int i10, String str, Integer num, String str2) {
        kotlin.jvm.internal.l.f(adBreakPosition, "adBreakPosition");
        kotlin.jvm.internal.l.f(url, "url");
        this.f29733a = adBreakPosition;
        this.f29734b = url;
        this.f29735c = i;
        this.f29736d = i10;
        this.f29737e = str;
        this.f29738f = num;
        this.f29739g = str2;
    }

    public final at a() {
        return this.f29733a;
    }

    public final int getAdHeight() {
        return this.f29736d;
    }

    public final int getAdWidth() {
        return this.f29735c;
    }

    public final String getApiFramework() {
        return this.f29739g;
    }

    public final Integer getBitrate() {
        return this.f29738f;
    }

    public final String getMediaType() {
        return this.f29737e;
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final String getUrl() {
        return this.f29734b;
    }
}
