package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgce extends zzgcc {
    private zzgce() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgcc
    public final int zza(zzgcg zzgcgVar) {
        int i;
        synchronized (zzgcgVar) {
            i = zzgcgVar.remainingField - 1;
            zzgcgVar.remainingField = i;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzgcc
    public final void zzb(zzgcg zzgcgVar, Set set, Set set2) {
        synchronized (zzgcgVar) {
            try {
                if (zzgcgVar.seenExceptionsField == null) {
                    zzgcgVar.seenExceptionsField = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ zzgce(zzgcf zzgcfVar) {
        super(null);
    }
}
