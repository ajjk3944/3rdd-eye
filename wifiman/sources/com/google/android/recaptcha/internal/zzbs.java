package com.google.android.recaptcha.internal;

import android.content.Context;
import r3.C7568f;

/* loaded from: classes3.dex */
public final class zzbs {
    private final C7568f zza;

    public zzbs(C7568f c7568f) {
        this.zza = c7568f;
    }

    public final int zza(Context context) {
        int iG = this.zza.g(context);
        return (iG == 1 || iG == 3 || iG == 9) ? 4 : 3;
    }

    public zzbs() {
        this.zza = C7568f.f();
    }
}
