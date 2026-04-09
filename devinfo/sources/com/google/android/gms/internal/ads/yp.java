package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class yp implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zp f18817b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18818c;

    public /* synthetic */ yp(zp zpVar, String str, int i4) {
        this.f18816a = i4;
        this.f18817b = zpVar;
        this.f18818c = str;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f18816a) {
            case 0:
                qz qzVar = this.f18817b.f19142a;
                if (qzVar != null) {
                    qzVar.loadData(this.f18818c, "text/html", "UTF-8");
                    break;
                }
                break;
            case 1:
                qz qzVar2 = this.f18817b.f19142a;
                if (qzVar2 != null) {
                    qzVar2.loadData(this.f18818c, "text/html", "UTF-8");
                    break;
                }
                break;
            case 2:
                qz qzVar3 = this.f18817b.f19142a;
                if (qzVar3 != null) {
                    qzVar3.loadUrl(this.f18818c);
                    break;
                }
                break;
            default:
                qz qzVar4 = this.f18817b.f19142a;
                if (qzVar4 != null) {
                    qzVar4.g(this.f18818c);
                    break;
                }
                break;
        }
    }
}
