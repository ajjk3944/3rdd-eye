package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Di, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0473Di implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0507Fi f7826b;

    public /* synthetic */ RunnableC0473Di(C0507Fi c0507Fi, int i) {
        this.f7825a = i;
        this.f7826b = c0507Fi;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f7825a) {
            case 0:
                C0507Fi c0507Fi = this.f7826b;
                c0507Fi.f8165b.execute(new RunnableC0473Di(c0507Fi, 1));
                break;
            default:
                this.f7826b.p();
                break;
        }
    }
}
