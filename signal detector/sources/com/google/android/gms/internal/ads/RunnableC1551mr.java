package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1551mr implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1605nr f15678b;

    public /* synthetic */ RunnableC1551mr(C1605nr c1605nr, int i) {
        this.f15677a = i;
        this.f15678b = c1605nr;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f15677a) {
            case 0:
                this.f15678b.e();
                break;
            case 1:
                this.f15678b.e();
                break;
            default:
                C1605nr c1605nr = this.f15678b;
                c1605nr.getClass();
                c1605nr.f15828f.execute(new RunnableC1551mr(c1605nr, 1));
                break;
        }
    }
}
