package com.google.ar.core;

import com.google.ar.core.ArCoreApk;

/* loaded from: classes3.dex */
enum t extends ArCoreApk.Availability {
    /* synthetic */ t() {
        super("UNSUPPORTED_DEVICE_NOT_CAPABLE", 3, 100, null);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isUnsupported() {
        return true;
    }
}
