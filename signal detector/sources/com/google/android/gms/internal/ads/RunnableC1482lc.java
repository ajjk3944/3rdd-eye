package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1482lc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1536mc f15414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15415c;

    public /* synthetic */ RunnableC1482lc(C1536mc c1536mc, String str, int i) {
        this.f15413a = i;
        this.f15414b = c1536mc;
        this.f15415c = str;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f15413a) {
            case 0:
                InterfaceC0828Yg interfaceC0828Yg = this.f15414b.f15630a;
                if (interfaceC0828Yg != null) {
                    interfaceC0828Yg.loadData(this.f15415c, "text/html", "UTF-8");
                    break;
                }
                break;
            case 1:
                InterfaceC0828Yg interfaceC0828Yg2 = this.f15414b.f15630a;
                if (interfaceC0828Yg2 != null) {
                    interfaceC0828Yg2.loadData(this.f15415c, "text/html", "UTF-8");
                    break;
                }
                break;
            case 2:
                InterfaceC0828Yg interfaceC0828Yg3 = this.f15414b.f15630a;
                if (interfaceC0828Yg3 != null) {
                    interfaceC0828Yg3.loadUrl(this.f15415c);
                    break;
                }
                break;
            default:
                InterfaceC0828Yg interfaceC0828Yg4 = this.f15414b.f15630a;
                if (interfaceC0828Yg4 != null) {
                    interfaceC0828Yg4.c(this.f15415c);
                    break;
                }
                break;
        }
    }
}
