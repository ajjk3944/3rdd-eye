package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzakl {
    public static void zza(zzakm zzakmVar, zzakq zzakqVar, zzdn zzdnVar) {
        for (int i = 0; i < zzakmVar.zza(); i++) {
            long jZzb = zzakmVar.zzb(i);
            List listZzc = zzakmVar.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i == zzakmVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = zzakmVar.zzb(i + 1) - zzakmVar.zzb(i);
                if (jZzb2 > 0) {
                    zzdnVar.zza(new zzakj(listZzc, jZzb, jZzb2));
                }
            }
        }
    }
}
