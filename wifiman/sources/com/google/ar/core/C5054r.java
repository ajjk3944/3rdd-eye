package com.google.ar.core;

import com.google.ar.core.ArCoreApk;

/* renamed from: com.google.ar.core.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
enum C5054r extends ArCoreApk.Availability {
    /* JADX WARN: Illegal instructions before constructor call */
    /* synthetic */ C5054r() {
        int i10 = 1;
        super("UNKNOWN_CHECKING", i10, i10, null);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isTransient() {
        return true;
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isUnknown() {
        return true;
    }
}
