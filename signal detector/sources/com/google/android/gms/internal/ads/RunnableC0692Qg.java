package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Qg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0692Qg implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0726Sg f10623b;

    public /* synthetic */ RunnableC0692Qg(C0726Sg c0726Sg, int i) {
        this.f10622a = i;
        this.f10623b = c0726Sg;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f10622a) {
            case 0:
                C0726Sg c0726Sg = this.f10623b;
                C0946bg c0946bg = c0726Sg.f11191e;
                if (c0946bg != null) {
                    if (!c0726Sg.f11192f) {
                        c0946bg.k();
                        c0726Sg.f11192f = true;
                    }
                    c0726Sg.f11191e.f();
                    break;
                }
                break;
            case 1:
                C0946bg c0946bg2 = this.f10623b.f11191e;
                if (c0946bg2 != null) {
                    c0946bg2.g();
                    break;
                }
                break;
            default:
                C0946bg c0946bg3 = this.f10623b.f11191e;
                if (c0946bg3 != null) {
                    c0946bg3.e();
                    break;
                }
                break;
        }
    }
}
