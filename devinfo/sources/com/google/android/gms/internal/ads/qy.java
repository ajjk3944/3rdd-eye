package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qy implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f15475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15476b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15477c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f15479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f15480f;
    public final /* synthetic */ boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f15481h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15482i;
    public final /* synthetic */ xy j;

    public qy(xy xyVar, String str, String str2, int i4, int i10, long j, long j8, boolean z3, int i11, int i12) {
        this.f15475a = str;
        this.f15476b = str2;
        this.f15477c = i4;
        this.f15478d = i10;
        this.f15479e = j;
        this.f15480f = j8;
        this.g = z3;
        this.f15481h = i11;
        this.f15482i = i12;
        this.j = xyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f15475a);
        map.put("cachedSrc", this.f15476b);
        map.put("bytesLoaded", Integer.toString(this.f15477c));
        map.put("totalBytes", Integer.toString(this.f15478d));
        map.put("bufferedDuration", Long.toString(this.f15479e));
        map.put("totalDuration", Long.toString(this.f15480f));
        map.put("cacheReady", true != this.g ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f15481h));
        map.put("playerPreparedCount", Integer.toString(this.f15482i));
        this.j.s(map);
    }
}
