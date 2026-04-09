package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzalf implements zzakr {
    private final zzen zza = new zzen();
    private final zzen zzb = new zzen();
    private final zzale zzc = new zzale();
    private Inflater zzd;

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
        zzale zzaleVar = this.zzc;
        zzaleVar.zze();
        ArrayList arrayList = new ArrayList();
        while (zzenVar.zza() >= 3) {
            int iZzd = zzenVar.zzd();
            int iZzm = zzenVar.zzm();
            int iZzq = zzenVar.zzq();
            int iZzc = zzenVar.zzc() + iZzq;
            zzcu zzcuVarZza = null;
            if (iZzc > iZzd) {
                zzenVar.zzL(iZzd);
            } else {
                if (iZzm != 128) {
                    switch (iZzm) {
                        case 20:
                            zzale.zzd(zzaleVar, zzenVar, iZzq);
                            break;
                        case 21:
                            zzale.zzb(zzaleVar, zzenVar, iZzq);
                            break;
                        case 22:
                            zzale.zzc(zzaleVar, zzenVar, iZzq);
                            break;
                    }
                } else {
                    zzcuVarZza = zzaleVar.zza();
                    zzaleVar.zze();
                }
                zzenVar.zzL(iZzc);
            }
            if (zzcuVarZza != null) {
                arrayList.add(zzcuVarZza);
            }
        }
        zzdnVar.zza(new zzakj(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
