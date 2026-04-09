package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class s20 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t20 f15843b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f15844c;

    public /* synthetic */ s20(t20 t20Var, Throwable th2, int i4) {
        this.f15842a = i4;
        this.f15843b = t20Var;
        this.f15844c = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15842a) {
            case 0:
                Context context = this.f15843b.f16670a;
                boolean zBooleanValue = ((Boolean) va.s.f36163e.f36166c.a(sk.Cb)).booleanValue();
                Throwable th2 = this.f15844c;
                if (!zBooleanValue) {
                    ut.a(context).d("AttributionReportingSampled", th2);
                    break;
                } else {
                    ut.c(context).d("AttributionReporting", th2);
                    break;
                }
            default:
                Context context2 = this.f15843b.f16670a;
                boolean zBooleanValue2 = ((Boolean) va.s.f36163e.f36166c.a(sk.Cb)).booleanValue();
                Throwable th3 = this.f15844c;
                if (!zBooleanValue2) {
                    ut.a(context2).d("AttributionReportingSampled.getUpdatedUrlAndRegisterSource", th3);
                    break;
                } else {
                    ut.c(context2).d("AttributionReporting.getUpdatedUrlAndRegisterSource", th3);
                    break;
                }
        }
    }
}
