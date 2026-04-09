package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class EQ implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HQ f7964b;

    public /* synthetic */ EQ(HQ hq, int i) {
        this.f7963a = i;
        this.f7964b = hq;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f7963a) {
            case 0:
                HQ hq = this.f7964b;
                if (!hq.b0) {
                    InterfaceC1641oQ interfaceC1641oQ = hq.f8924D;
                    interfaceC1641oQ.getClass();
                    interfaceC1641oQ.d(hq);
                    break;
                }
                break;
            case 1:
                this.f7964b.f8941V = true;
                break;
            default:
                this.f7964b.t();
                break;
        }
    }
}
