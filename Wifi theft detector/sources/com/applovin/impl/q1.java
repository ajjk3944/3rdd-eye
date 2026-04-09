package com.applovin.impl;

/* loaded from: classes.dex */
public class q1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f7369a;

    /* renamed from: b, reason: collision with root package name */
    private String f7370b;

    /* renamed from: c, reason: collision with root package name */
    private y2 f7371c;

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.impl.sdk.ad.b f7372d;

    public q1(Object obj, long j10) {
        this.f7369a = j10;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) obj;
            this.f7372d = bVar;
            this.f7370b = bVar.getAdZone().d() != null ? this.f7372d.getAdZone().d().getLabel() : null;
        } else if (obj instanceof y2) {
            y2 y2Var = (y2) obj;
            this.f7371c = y2Var;
            this.f7370b = y2Var.getFormat().getLabel();
        }
    }

    public void a(Object obj) {
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            this.f7372d = (com.applovin.impl.sdk.ad.b) obj;
        } else if (obj instanceof y2) {
            this.f7371c = (y2) obj;
        }
    }

    public long b() {
        return this.f7369a;
    }

    public com.applovin.impl.sdk.ad.b c() {
        return this.f7372d;
    }

    public String d() {
        String str = this.f7370b;
        return str != null ? str : "Unknown";
    }

    public y2 e() {
        return this.f7371c;
    }

    public String f() {
        if (this.f7372d != null) {
            return "AppLovin";
        }
        y2 y2Var = this.f7371c;
        return y2Var != null ? y2Var.getNetworkName() : "Unknown";
    }

    public Object a() {
        com.applovin.impl.sdk.ad.b bVar = this.f7372d;
        return bVar != null ? bVar : this.f7371c;
    }
}
