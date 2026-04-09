package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0580Jn implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9347a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0597Kn f9348b;

    public /* synthetic */ RunnableC0580Jn(C0597Kn c0597Kn, int i) {
        this.f9347a = i;
        this.f9348b = c0597Kn;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f9347a) {
            case 0:
                C0597Kn c0597Kn = this.f9348b;
                c0597Kn.f9533c.execute(new RunnableC0580Jn(c0597Kn, 1));
                break;
            case 1:
                this.f9348b.a();
                break;
            default:
                this.f9348b.a();
                break;
        }
    }
}
