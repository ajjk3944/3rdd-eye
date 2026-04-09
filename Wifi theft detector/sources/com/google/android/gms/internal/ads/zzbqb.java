package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
final class zzbqb implements zzgyw {
    final /* synthetic */ zzbpt zza;

    public zzbqb(zzbqf zzbqfVar, zzbpt zzbptVar) {
        this.zza = zzbptVar;
        Objects.requireNonNull(zzbqfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.a zza(Object obj) throws Exception {
        zzcen zzcenVar = new zzcen();
        ((zzbpz) obj).zze(this.zza, new zzbqa(this, zzcenVar));
        return zzcenVar;
    }
}
