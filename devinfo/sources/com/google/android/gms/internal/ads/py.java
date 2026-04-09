package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class py implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f15144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15145b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f15146c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f15147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f15148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f15149f;
    public final /* synthetic */ long g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f15150h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15151i;
    public final /* synthetic */ int j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ uy f15152k;

    public py(uy uyVar, String str, String str2, long j, long j8, long j9, long j10, long j11, boolean z3, int i4, int i10) {
        this.f15144a = str;
        this.f15145b = str2;
        this.f15146c = j;
        this.f15147d = j8;
        this.f15148e = j9;
        this.f15149f = j10;
        this.g = j11;
        this.f15150h = z3;
        this.f15151i = i4;
        this.j = i10;
        this.f15152k = uyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f15144a);
        map.put("cachedSrc", this.f15145b);
        map.put("bufferedDuration", Long.toString(this.f15146c));
        map.put("totalDuration", Long.toString(this.f15147d));
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16237n2)).booleanValue()) {
            map.put("qoeLoadedBytes", Long.toString(this.f15148e));
            map.put("qoeCachedBytes", Long.toString(this.f15149f));
            map.put("totalBytes", Long.toString(this.g));
            ua.j.C.f35267k.getClass();
            map.put("reportTime", Long.toString(System.currentTimeMillis()));
        }
        map.put("cacheReady", true != this.f15150h ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f15151i));
        map.put("playerPreparedCount", Integer.toString(this.j));
        this.f15152k.s(map);
    }
}
