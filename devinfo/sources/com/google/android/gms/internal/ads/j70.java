package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j70 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12668a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f12669b;

    public /* synthetic */ j70(k70 k70Var, int i4) {
        this.f12668a = i4;
        switch (i4) {
            case 1:
                this.f12669b = new WeakReference(k70Var);
                break;
            default:
                this.f12669b = new WeakReference(k70Var);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12668a) {
            case 0:
                k70 k70Var = (k70) this.f12669b.get();
                if (k70Var != null) {
                    k70Var.p1(k60.f13064x);
                    break;
                }
                break;
            default:
                k70 k70Var2 = (k70) this.f12669b.get();
                if (k70Var2 != null) {
                    k70Var2.p1(k60.f13063w);
                    break;
                }
                break;
        }
    }
}
