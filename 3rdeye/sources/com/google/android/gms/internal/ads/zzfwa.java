package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfwa {
    public static zzfvw zza(zzfvw zzfvwVar) {
        return ((zzfvwVar instanceof zzfvz) || (zzfvwVar instanceof zzfvx)) ? zzfvwVar : zzfvwVar instanceof Serializable ? new zzfvx(zzfvwVar) : new zzfvz(zzfvwVar);
    }
}
