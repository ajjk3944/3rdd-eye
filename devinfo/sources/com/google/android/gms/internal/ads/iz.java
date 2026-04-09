package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class iz implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12543a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kz f12544b;

    public /* synthetic */ iz(kz kzVar, int i4) {
        this.f12543a = i4;
        this.f12544b = kzVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f12543a) {
            case 0:
                kz kzVar = this.f12544b;
                sx sxVar = kzVar.f13295e;
                if (sxVar != null) {
                    if (!kzVar.f13296f) {
                        sxVar.k();
                        kzVar.f13296f = true;
                    }
                    kzVar.f13295e.f();
                    break;
                }
                break;
            case 1:
                sx sxVar2 = this.f12544b.f13295e;
                if (sxVar2 != null) {
                    sxVar2.g();
                    break;
                }
                break;
            default:
                sx sxVar3 = this.f12544b.f13295e;
                if (sxVar3 != null) {
                    sxVar3.e();
                    break;
                }
                break;
        }
    }
}
