package com.google.android.gms.internal.ads;

import N7.C1154e9;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzzy extends IOException {
    public zzzy(Throwable th) {
        super(C1154e9.i("Unexpected ", th.getClass().getSimpleName(), th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : ""), th);
    }
}
