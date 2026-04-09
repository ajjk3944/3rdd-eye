package com.squareup.picasso;

import android.os.HandlerThread;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final s f5943a;

    /* renamed from: b, reason: collision with root package name */
    public final l f5944b;

    /* renamed from: c, reason: collision with root package name */
    public long f5945c;

    /* renamed from: d, reason: collision with root package name */
    public long f5946d;

    /* renamed from: e, reason: collision with root package name */
    public long f5947e;

    /* renamed from: f, reason: collision with root package name */
    public long f5948f;

    /* renamed from: g, reason: collision with root package name */
    public long f5949g;

    /* renamed from: h, reason: collision with root package name */
    public long f5950h;

    /* renamed from: i, reason: collision with root package name */
    public long f5951i;
    public long j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f5952l;

    /* renamed from: m, reason: collision with root package name */
    public int f5953m;

    public n0(s sVar) {
        this.f5943a = sVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        handlerThread.start();
        yh.a aVar = new yh.a(handlerThread.getLooper(), 3, false);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000L);
        this.f5944b = new l(1, handlerThread.getLooper(), this);
    }

    public final o0 a() {
        int i10;
        int i11;
        s sVar = this.f5943a;
        synchronized (sVar) {
            i10 = sVar.f5978d;
        }
        s sVar2 = this.f5943a;
        synchronized (sVar2) {
            i11 = sVar2.f5979g;
        }
        return new o0(i10, i11, this.f5945c, this.f5946d, this.f5947e, this.f5948f, this.f5949g, this.f5950h, this.f5951i, this.j, this.k, this.f5952l, this.f5953m, System.currentTimeMillis());
    }
}
