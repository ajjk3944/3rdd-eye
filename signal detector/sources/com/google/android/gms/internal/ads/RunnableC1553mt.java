package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1553mt implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BinderC1607nt f15687b;

    public /* synthetic */ RunnableC1553mt(BinderC1607nt binderC1607nt, int i) {
        this.f15686a = i;
        this.f15687b = binderC1607nt;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f15686a) {
            case 0:
                BinderC1607nt binderC1607nt = this.f15687b;
                binderC1607nt.f15832a.b().execute(new RunnableC1553mt(binderC1607nt, 1));
                break;
            default:
                this.f15687b.K3(5);
                break;
        }
    }
}
