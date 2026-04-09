package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ey implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gy f10915b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10916c;

    public /* synthetic */ ey(gy gyVar, String str, int i4) {
        this.f10914a = i4;
        this.f10915b = gyVar;
        this.f10916c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10914a) {
            case 0:
                sx sxVar = this.f10915b.g;
                if (sxVar != null) {
                    sxVar.c("exception", "what", "ExoPlayerAdapter exception", "extra", this.f10916c);
                    break;
                }
                break;
            default:
                sx sxVar2 = this.f10915b.g;
                if (sxVar2 != null) {
                    sxVar2.c("error", "what", "ExoPlayerAdapter error", "extra", this.f10916c);
                    break;
                }
                break;
        }
    }
}
