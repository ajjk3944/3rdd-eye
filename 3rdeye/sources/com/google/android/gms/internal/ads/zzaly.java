package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaly implements zzakr {
    private final zzen zza = new zzen();
    private final zzen zzb = new zzen();
    private final zzalx zzc;
    private Inflater zzd;

    public zzaly(List list) {
        zzalx zzalxVar = new zzalx();
        this.zzc = zzalxVar;
        zzalxVar.zzb(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzakr
    public final void zza(byte[] bArr, int i, int i10, zzakq zzakqVar, zzdn zzdnVar) {
        zzen zzenVar = this.zza;
        zzenVar.zzJ(bArr, i10 + i);
        zzenVar.zzL(i);
        if (this.zzd == null) {
            this.zzd = new Inflater();
        }
        zzen zzenVar2 = this.zzb;
        if (zzex.zzO(zzenVar, zzenVar2, this.zzd)) {
            zzenVar.zzJ(zzenVar2.zzN(), zzenVar2.zzd());
        }
        zzalx zzalxVar = this.zzc;
        zzalxVar.zzd();
        int iZza = zzenVar.zza();
        zzcu zzcuVarZza = null;
        if (iZza >= 2 && zzenVar.zzq() == iZza) {
            zzalxVar.zzc(zzenVar);
            zzcuVarZza = zzalxVar.zza(zzenVar);
        }
        zzdnVar.zza(new zzakj(zzcuVarZza != null ? zzfyf.zzo(zzcuVarZza) : zzfyf.zzn(), -9223372036854775807L, 5000000L));
    }
}
