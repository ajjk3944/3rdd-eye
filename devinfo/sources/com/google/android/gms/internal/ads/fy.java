package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class fy implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11286b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11287c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11288d;

    public /* synthetic */ fy(Object obj, boolean z3, long j, int i4) {
        this.f11285a = i4;
        this.f11288d = obj;
        this.f11286b = z3;
        this.f11287c = j;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f11285a) {
            case 0:
                gy gyVar = (gy) this.f11288d;
                gyVar.f11634c.A0(this.f11287c, this.f11286b);
                break;
            default:
                ((qz) this.f11288d).A0(this.f11287c, this.f11286b);
                break;
        }
    }
}
