package com.applovin.impl;

/* loaded from: classes.dex */
public class l1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f19680a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f19681b;

    /* renamed from: c, reason: collision with root package name */
    private String f19682c;

    /* renamed from: d, reason: collision with root package name */
    private String f19683d;

    public l1(Object obj, long j4) {
        this.f19681b = obj;
        this.f19680a = j4;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) obj;
            this.f19682c = bVar.getAdZone().d() != null ? bVar.getAdZone().d().getLabel() : null;
            this.f19683d = "AppLovin";
        } else if (obj instanceof q2) {
            q2 q2Var = (q2) obj;
            this.f19682c = q2Var.getFormat().getLabel();
            this.f19683d = q2Var.getNetworkName();
        }
    }

    public Object a() {
        return this.f19681b;
    }

    public long b() {
        return this.f19680a;
    }

    public String c() {
        String str = this.f19682c;
        return str != null ? str : "Unknown";
    }

    public String d() {
        String str = this.f19683d;
        return str != null ? str : "Unknown";
    }
}
