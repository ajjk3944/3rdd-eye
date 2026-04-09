package com.google.android.gms.internal.ads;

import android.content.Context;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.xi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2135xi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2189yi f17619b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f17620c;

    public /* synthetic */ RunnableC2135xi(C2189yi c2189yi, Throwable th, int i) {
        this.f17618a = i;
        this.f17619b = c2189yi;
        this.f17620c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17618a) {
            case 0:
                Context context = this.f17619b.f17741a;
                boolean zBooleanValue = ((Boolean) C2841s.f23267e.f23270c.a(H9.Ab)).booleanValue();
                Throwable th = this.f17620c;
                if (!zBooleanValue) {
                    C1053de.a(context).e("AttributionReportingSampled", th);
                    break;
                } else {
                    C1053de.c(context).e("AttributionReporting", th);
                    break;
                }
            default:
                Context context2 = this.f17619b.f17741a;
                boolean zBooleanValue2 = ((Boolean) C2841s.f23267e.f23270c.a(H9.Ab)).booleanValue();
                Throwable th2 = this.f17620c;
                if (!zBooleanValue2) {
                    C1053de.a(context2).e("AttributionReportingSampled.getUpdatedUrlAndRegisterSource", th2);
                    break;
                } else {
                    C1053de.c(context2).e("AttributionReporting.getUpdatedUrlAndRegisterSource", th2);
                    break;
                }
        }
    }
}
