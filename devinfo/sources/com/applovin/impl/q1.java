package com.applovin.impl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class q1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f5151a;

    /* renamed from: b, reason: collision with root package name */
    private String f5152b;

    /* renamed from: c, reason: collision with root package name */
    private y2 f5153c;

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.impl.sdk.ad.b f5154d;

    public q1(Object obj, long j) {
        this.f5151a = j;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) obj;
            this.f5154d = bVar;
            this.f5152b = bVar.getAdZone().d() != null ? this.f5154d.getAdZone().d().getLabel() : null;
        } else if (obj instanceof y2) {
            y2 y2Var = (y2) obj;
            this.f5153c = y2Var;
            this.f5152b = y2Var.getFormat().getLabel();
        }
    }

    public void a(Object obj) {
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            this.f5154d = (com.applovin.impl.sdk.ad.b) obj;
        } else if (obj instanceof y2) {
            this.f5153c = (y2) obj;
        }
    }

    public long b() {
        return this.f5151a;
    }

    public com.applovin.impl.sdk.ad.b c() {
        return this.f5154d;
    }

    public String d() {
        String str = this.f5152b;
        return str != null ? str : "Unknown";
    }

    public y2 e() {
        return this.f5153c;
    }

    public String f() {
        if (this.f5154d != null) {
            return "AppLovin";
        }
        y2 y2Var = this.f5153c;
        return y2Var != null ? y2Var.getNetworkName() : "Unknown";
    }

    public Object a() {
        com.applovin.impl.sdk.ad.b bVar = this.f5154d;
        return bVar != null ? bVar : this.f5153c;
    }
}
