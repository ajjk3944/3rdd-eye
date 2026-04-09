package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Dw {

    /* renamed from: a, reason: collision with root package name */
    public String f7853a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7854b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7855c;

    /* renamed from: d, reason: collision with root package name */
    public long f7856d;

    /* renamed from: e, reason: collision with root package name */
    public long f7857e;

    /* renamed from: f, reason: collision with root package name */
    public byte f7858f;

    public final Ew a() {
        String str;
        if (this.f7858f == 63 && (str = this.f7853a) != null) {
            return new Ew(str, this.f7854b, this.f7855c, this.f7856d, this.f7857e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f7853a == null) {
            sb.append(" clientVersion");
        }
        if ((this.f7858f & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.f7858f & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        if ((this.f7858f & 4) == 0) {
            sb.append(" enableQuerySignalsTimeout");
        }
        if ((this.f7858f & 8) == 0) {
            sb.append(" querySignalsTimeoutMs");
        }
        if ((this.f7858f & 16) == 0) {
            sb.append(" enableQuerySignalsCache");
        }
        if ((this.f7858f & 32) == 0) {
            sb.append(" querySignalsCacheTtlSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
