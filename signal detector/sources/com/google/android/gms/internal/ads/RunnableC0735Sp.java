package com.google.android.gms.internal.ads;

import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Sp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0735Sp implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rv f11250b;

    public /* synthetic */ RunnableC0735Sp(Rv rv, int i) {
        this.f11249a = i;
        this.f11250b = rv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11249a) {
            case 0:
                this.f11250b.a();
                break;
            default:
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.a6)).booleanValue() && AbstractC0709Rg.f10942z.f16455b) {
                    this.f11250b.c();
                    break;
                }
                break;
        }
    }
}
