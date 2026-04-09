package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.InterfaceC4325d0;

/* renamed from: com.google.android.gms.measurement.internal.e3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4838e3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ InterfaceC4325d0 f36430a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ServiceConnection f36431b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC4847f3 f36432c;

    RunnableC4838e3(ServiceConnectionC4847f3 serviceConnectionC4847f3, InterfaceC4325d0 interfaceC4325d0, ServiceConnection serviceConnection) {
        this.f36430a = interfaceC4325d0;
        this.f36431b = serviceConnection;
        this.f36432c = serviceConnectionC4847f3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ServiceConnectionC4847f3 serviceConnectionC4847f3 = this.f36432c;
        C4820c3 c4820c3 = serviceConnectionC4847f3.f36449b;
        String str = serviceConnectionC4847f3.f36448a;
        InterfaceC4325d0 interfaceC4325d0 = this.f36430a;
        ServiceConnection serviceConnection = this.f36431b;
        Bundle bundleA = c4820c3.a(str, interfaceC4325d0);
        c4820c3.f36357a.zzl().j();
        c4820c3.f36357a.j();
        if (bundleA != null) {
            long j10 = bundleA.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                c4820c3.f36357a.zzj().H().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundleA.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    c4820c3.f36357a.zzj().C().a("No referrer defined in Install Referrer response");
                } else {
                    c4820c3.f36357a.zzj().G().b("InstallReferrer API result", string);
                    Bundle bundleY = c4820c3.f36357a.K().y(Uri.parse("?" + string));
                    if (bundleY == null) {
                        c4820c3.f36357a.zzj().C().a("No campaign params defined in Install Referrer result");
                    } else {
                        if (bundleY.containsKey("gclid") || bundleY.containsKey("gbraid")) {
                            long j11 = bundleA.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                            if (j11 > 0) {
                                bundleY.putLong("click_timestamp", j11);
                            }
                        }
                        if (j10 == c4820c3.f36357a.C().f36268h.a()) {
                            c4820c3.f36357a.zzj().G().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (c4820c3.f36357a.n()) {
                            c4820c3.f36357a.C().f36268h.b(j10);
                            c4820c3.f36357a.zzj().G().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleY.putString("_cis", "referrer API v2");
                            c4820c3.f36357a.E().k0("auto", "_cmp", bundleY, str);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            v3.b.b().c(c4820c3.f36357a.zza(), serviceConnection);
        }
    }
}
