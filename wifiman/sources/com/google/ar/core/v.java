package com.google.ar.core;

import com.google.ar.core.ArCoreApk;

/* loaded from: classes3.dex */
enum v extends ArCoreApk.Availability {
    /* synthetic */ v() {
        super("SUPPORTED_APK_TOO_OLD", 5, 202, null);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isSupported() {
        return true;
    }
}
