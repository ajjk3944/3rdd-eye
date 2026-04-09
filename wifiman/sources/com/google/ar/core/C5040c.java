package com.google.ar.core;

import android.content.pm.PackageInstaller;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.ar.core.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5040c extends PackageInstaller.SessionCallback {

    /* renamed from: a, reason: collision with root package name */
    final Map f38232a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ L f38233b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ N f38234c;

    C5040c(N n10, L l10) {
        this.f38233b = l10;
        this.f38234c = n10;
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onActiveChanged(int i10, boolean z10) {
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onBadgingChanged(int i10) {
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onCreated(int i10) {
        this.f38232a.put(Integer.valueOf(i10), this.f38234c.g().getSessionInfo(i10));
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onFinished(int i10, boolean z10) {
        PackageInstaller.SessionInfo sessionInfo = (PackageInstaller.SessionInfo) this.f38232a.remove(Integer.valueOf(i10));
        if (sessionInfo == null || !"com.google.ar.core".equals(sessionInfo.getAppPackageName())) {
            return;
        }
        Log.i("ARCore-InstallService", "Detected ARCore install completion");
        this.f38233b.a(M.COMPLETED);
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onProgressChanged(int i10, float f10) {
    }
}
