package com.google.ar.core;

import com.google.ar.core.ArCoreApk;

/* loaded from: classes3.dex */
enum u extends ArCoreApk.Availability {
    /* synthetic */ u() {
        super("SUPPORTED_NOT_INSTALLED", 4, 201, null);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isSupported() {
        return true;
    }
}
