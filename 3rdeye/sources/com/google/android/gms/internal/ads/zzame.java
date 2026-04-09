package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzame {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzamd
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((zzame) obj).zzb.zzb, ((zzame) obj2).zzb.zzb);
        }
    };
    private final zzamf zzb;
    private final int zzc;

    public /* synthetic */ zzame(zzamf zzamfVar, int i, zzami zzamiVar) {
        this.zzb = zzamfVar;
        this.zzc = i;
    }
}
