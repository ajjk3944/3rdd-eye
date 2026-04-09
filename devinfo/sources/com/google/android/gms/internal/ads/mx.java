package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mx implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14036b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14037c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ px f14038d;

    public /* synthetic */ mx(px pxVar, int i4, int i10, int i11) {
        this.f14035a = i11;
        this.f14036b = i4;
        this.f14037c = i10;
        this.f14038d = pxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14035a) {
            case 0:
                sx sxVar = ((nx) this.f14038d).f14473q;
                if (sxVar != null) {
                    sxVar.j(this.f14036b, this.f14037c);
                    break;
                }
                break;
            default:
                sx sxVar2 = ((gy) this.f14038d).g;
                if (sxVar2 != null) {
                    sxVar2.j(this.f14036b, this.f14037c);
                    break;
                }
                break;
        }
    }
}
