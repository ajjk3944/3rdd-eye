package com.google.ar.core;

import android.os.Bundle;
import android.util.Log;
import com.google.ar.core.ArCoreApk;

/* loaded from: classes3.dex */
final class P extends com.google.ar.core.dependencies.i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f38206a;

    P(x xVar) {
        this.f38206a = xVar;
    }

    @Override // com.google.ar.core.dependencies.j
    public final void b(Bundle bundle) {
    }

    @Override // com.google.ar.core.dependencies.j
    public final void c(Bundle bundle) {
        int i10 = bundle.getInt("error.code", -100);
        if (i10 == -5) {
            Log.e("ARCore-InstallService", "The device is not supported.");
            this.f38206a.a(ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE);
        } else if (i10 == -3) {
            Log.e("ARCore-InstallService", "The Google Play application must be updated.");
            this.f38206a.a(ArCoreApk.Availability.UNKNOWN_ERROR);
        } else if (i10 == 0) {
            this.f38206a.a(ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED);
        } else {
            Log.e("ARCore-InstallService", F.b((byte) 22, i10, "requestInfo returned: "));
            this.f38206a.a(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }
}
