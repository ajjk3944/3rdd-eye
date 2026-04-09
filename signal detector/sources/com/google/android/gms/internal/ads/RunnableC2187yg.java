package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.yg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2187yg implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f17730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17731b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17732c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f17734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f17735f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f17736g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17737h;
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0505Fg f17738j;

    public RunnableC2187yg(C0505Fg c0505Fg, String str, String str2, int i, int i3, long j6, long j7, boolean z6, int i6, int i7) {
        this.f17730a = str;
        this.f17731b = str2;
        this.f17732c = i;
        this.f17733d = i3;
        this.f17734e = j6;
        this.f17735f = j7;
        this.f17736g = z6;
        this.f17737h = i6;
        this.i = i7;
        this.f17738j = c0505Fg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f17730a);
        map.put("cachedSrc", this.f17731b);
        map.put("bytesLoaded", Integer.toString(this.f17732c));
        map.put("totalBytes", Integer.toString(this.f17733d));
        map.put("bufferedDuration", Long.toString(this.f17734e));
        map.put("totalDuration", Long.toString(this.f17735f));
        map.put("cacheReady", true != this.f17736g ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f17737h));
        map.put("playerPreparedCount", Integer.toString(this.i));
        this.f17738j.n(map);
    }
}
