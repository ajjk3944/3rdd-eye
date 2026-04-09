package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzchh implements zzhfy {
    private final zzchc zza;

    public zzchh(zzchc zzchcVar) {
        this.zza = zzchcVar;
    }

    public static WeakReference zzc(zzchc zzchcVar) {
        WeakReference weakReferenceZzg = zzchcVar.zzg();
        zzhgg.zzb(weakReferenceZzg);
        return weakReferenceZzg;
    }

    public final WeakReference zza() {
        return zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
