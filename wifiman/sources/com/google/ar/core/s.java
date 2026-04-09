package com.google.ar.core;

import com.google.ar.core.ArCoreApk;

/* loaded from: classes3.dex */
enum s extends ArCoreApk.Availability {
    /* JADX WARN: Illegal instructions before constructor call */
    /* synthetic */ s() {
        int i10 = 2;
        super("UNKNOWN_TIMED_OUT", i10, i10, null);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isUnknown() {
        return true;
    }
}
