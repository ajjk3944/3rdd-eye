package io.appmetrica.analytics.impl;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import g0.C4356c;

/* renamed from: io.appmetrica.analytics.impl.sg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4951sg implements InstallReferrerStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4977tg f41643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Dg f41644b;

    public C4951sg(C4977tg c4977tg, Dg dg) {
        this.f41643a = c4977tg;
        this.f41644b = dg;
    }

    public static final void a(C4977tg c4977tg, Dg dg) {
        InstallReferrerClient installReferrerClient;
        try {
            try {
                ReferrerDetails installReferrer = c4977tg.f41693b.getInstallReferrer();
                dg.a(new C5102yg(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), EnumC5077xg.f42078c));
                installReferrerClient = c4977tg.f41693b;
            } catch (Throwable th) {
                try {
                    dg.a(th);
                    installReferrerClient = c4977tg.f41693b;
                } finally {
                }
            }
            installReferrerClient.endConnection();
        } catch (Throwable unused) {
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i) {
        if (i != 0) {
            this.f41643a.a(this.f41644b, new IllegalStateException(C4356c.h(i, "Referrer check failed with error ")));
            return;
        }
        C4977tg c4977tg = this.f41643a;
        c4977tg.f41692a.execute(new B.a(26, c4977tg, this.f41644b));
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }
}
