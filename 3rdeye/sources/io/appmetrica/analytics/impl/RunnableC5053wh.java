package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.wh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5053wh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f41976a;

    /* renamed from: b, reason: collision with root package name */
    public final C4683i6 f41977b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f41978c;

    /* renamed from: d, reason: collision with root package name */
    public final C5040w4 f41979d;

    public RunnableC5053wh(Context context, C4683i6 c4683i6, Bundle bundle, C5040w4 c5040w4) {
        this.f41976a = context;
        this.f41977b = c4683i6;
        this.f41978c = bundle;
        this.f41979d = c5040w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C4552d4 c4552d4A = C4552d4.a(this.f41976a, this.f41978c);
            if (c4552d4A == null) {
                return;
            }
            C4758l4 c4758l4A = C4758l4.a(c4552d4A);
            C4851oj c4851ojU = Ga.f39501F.u();
            c4851ojU.a(c4552d4A.f40684b.getAppVersion(), c4552d4A.f40684b.getAppBuildNumber());
            c4851ojU.a(c4552d4A.f40684b.getDeviceType());
            K4 k42 = new K4(new Wl(c4552d4A), new J4(c4552d4A.f40684b, AbstractC5122zb.c(c4552d4A.f40683a.f39902a.getAsString("PROCESS_CFG_CLIDS"))), c4552d4A.f40683a.f39903b);
            this.f41979d.a(c4758l4A, k42).a(this.f41977b, k42);
        } catch (Throwable th) {
            Zj zj = AbstractC5105yj.f42147a;
            String str = "Exception during processing event with type: " + this.f41977b.f41047d + " (" + this.f41977b.f41048e + "): " + th.getMessage();
            zj.getClass();
            zj.a(new C5130zj(str, th));
        }
    }
}
