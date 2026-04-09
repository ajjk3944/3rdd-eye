package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.InterfaceC4325d0;

/* renamed from: com.google.android.gms.measurement.internal.c3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4820c3 {

    /* renamed from: a, reason: collision with root package name */
    final C4976v3 f36357a;

    C4820c3(C4833d7 c4833d7) {
        this.f36357a = c4833d7.D0();
    }

    final Bundle a(String str, InterfaceC4325d0 interfaceC4325d0) {
        this.f36357a.zzl().j();
        if (interfaceC4325d0 == null) {
            this.f36357a.zzj().H().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle bundleA = interfaceC4325d0.a(bundle);
            if (bundleA != null) {
                return bundleA;
            }
            this.f36357a.zzj().C().a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e10) {
            this.f36357a.zzj().C().b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
            return null;
        }
    }

    final boolean b() {
        try {
            w3.b bVarA = w3.c.a(this.f36357a.zza());
            if (bVarA != null) {
                return bVarA.d("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f36357a.zzj().G().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.f36357a.zzj().G().b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
