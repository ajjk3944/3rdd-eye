package com.google.ar.core;

import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* loaded from: classes3.dex */
final class L {

    /* renamed from: a, reason: collision with root package name */
    boolean f38190a = false;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InstallActivity f38191b;

    L(InstallActivity installActivity) {
        this.f38191b = installActivity;
    }

    public final void a(M m10) {
        synchronized (this.f38191b) {
            try {
                if (this.f38190a) {
                    return;
                }
                this.f38191b.f(m10);
                ArCoreApk.UserMessageType userMessageType = ArCoreApk.UserMessageType.APPLICATION;
                ArCoreApk.Availability availability = ArCoreApk.Availability.UNKNOWN_ERROR;
                int iOrdinal = m10.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        this.f38191b.c(new UnavailableUserDeclinedInstallationException());
                    } else if (iOrdinal == 2) {
                        if (!this.f38191b.g() && A.a().f38156d) {
                            this.f38191b.e();
                        }
                        this.f38191b.c(null);
                    }
                    this.f38190a = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Exception exc) {
        synchronized (this.f38191b) {
            try {
                if (this.f38190a) {
                    return;
                }
                this.f38190a = true;
                this.f38191b.f(M.CANCELLED);
                this.f38191b.c(exc);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
