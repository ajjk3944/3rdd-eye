package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgmt {
    private HashMap zza = new HashMap();

    public final zzgmv zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzgmv zzgmvVar = new zzgmv(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzgmvVar;
    }
}
