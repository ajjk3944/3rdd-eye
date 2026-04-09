package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hv0 {

    /* renamed from: a, reason: collision with root package name */
    public String f11983a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11984b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11985c;

    /* renamed from: d, reason: collision with root package name */
    public long f11986d;

    /* renamed from: e, reason: collision with root package name */
    public long f11987e;

    /* renamed from: f, reason: collision with root package name */
    public byte f11988f;

    public final iv0 a() {
        String str;
        if (this.f11988f == 63 && (str = this.f11983a) != null) {
            return new iv0(str, this.f11984b, this.f11985c, this.f11986d, this.f11987e);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f11983a == null) {
            sb2.append(" clientVersion");
        }
        if ((this.f11988f & 1) == 0) {
            sb2.append(" shouldGetAdvertisingId");
        }
        if ((this.f11988f & 2) == 0) {
            sb2.append(" isGooglePlayServicesAvailable");
        }
        if ((this.f11988f & 4) == 0) {
            sb2.append(" enableQuerySignalsTimeout");
        }
        if ((this.f11988f & 8) == 0) {
            sb2.append(" querySignalsTimeoutMs");
        }
        if ((this.f11988f & 16) == 0) {
            sb2.append(" enableQuerySignalsCache");
        }
        if ((this.f11988f & 32) == 0) {
            sb2.append(" querySignalsCacheTtlSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
