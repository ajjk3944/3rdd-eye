package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2256zv implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17991a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Av f17992b;

    public /* synthetic */ RunnableC2256zv(Av av, int i) {
        this.f17991a = i;
        this.f17992b = av;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17991a) {
            case 0:
                this.f17992b.k();
                return;
            case 1:
                this.f17992b.k();
                return;
            case 2:
                this.f17992b.k();
                return;
            case 3:
                this.f17992b.k();
                return;
            default:
                Av av = this.f17992b;
                synchronized (av) {
                    av.f7067b.set(false);
                    av.k();
                }
                return;
        }
    }
}
