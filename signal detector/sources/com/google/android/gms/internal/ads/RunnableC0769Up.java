package com.google.android.gms.internal.ads;

import android.view.View;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Up, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0769Up implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rv f11796b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f11797c;

    public /* synthetic */ RunnableC0769Up(Rv rv, View view, int i) {
        this.f11795a = i;
        this.f11796b = rv;
        this.f11797c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11795a) {
            case 0:
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.a6)).booleanValue() && AbstractC0709Rg.f10942z.f16455b) {
                    Rv rv = this.f11796b;
                    if (!rv.f11083f) {
                        rv.f11079b.a(this.f11797c, Tv.f11507a);
                        break;
                    }
                }
                break;
            default:
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.a6)).booleanValue() && AbstractC0709Rg.f10942z.f16455b) {
                    this.f11796b.b(this.f11797c);
                    break;
                }
                break;
        }
    }
}
