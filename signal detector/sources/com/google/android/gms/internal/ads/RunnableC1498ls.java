package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ls, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1498ls implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15483a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1552ms f15484b;

    public /* synthetic */ RunnableC1498ls(C1552ms c1552ms, int i) {
        this.f15483a = i;
        this.f15484b = c1552ms;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f15483a) {
            case 0:
                C1552ms c1552ms = this.f15484b;
                c1552ms.f15679a.set(new C1444ks(c1552ms.f15683e.a(), c1552ms.f15684f, c1552ms.f15681c));
                break;
            default:
                C1552ms c1552ms2 = this.f15484b;
                c1552ms2.f15682d.execute(new RunnableC1498ls(c1552ms2, 0));
                break;
        }
    }
}
