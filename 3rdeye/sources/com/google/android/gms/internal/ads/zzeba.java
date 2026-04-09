package com.google.android.gms.internal.ads;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzbch;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeba implements zzfgt {
    private final zzeao zza;
    private final zzeas zzb;

    public zzeba(zzeao zzeaoVar, zzeas zzeasVar) {
        this.zza = zzeaoVar;
        this.zzb = zzeasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzd(zzfgm zzfgmVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgq)).booleanValue() && zzfgm.RENDERER == zzfgmVar) {
            zzeao zzeaoVar = this.zza;
            if (zzeaoVar.zzc() != 0) {
                zzeaoVar.zzf(com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime() - zzeaoVar.zzc());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzdF(zzfgm zzfgmVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgq)).booleanValue() && zzfgm.RENDERER == zzfgmVar) {
            zzeao zzeaoVar = this.zza;
            if (zzeaoVar.zzc() != 0) {
                zzeaoVar.zzf(com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime() - zzeaoVar.zzc());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzdG(zzfgm zzfgmVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgq)).booleanValue()) {
            if (zzfgm.RENDERER == zzfgmVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime());
                return;
            }
            if (zzfgm.PRELOADED_LOADER == zzfgmVar || zzfgm.SERVER_TRANSACTION == zzfgmVar) {
                zzeao zzeaoVar = this.zza;
                zzeaoVar.zzh(com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime());
                final zzeas zzeasVar = this.zzb;
                final long jZzd = zzeaoVar.zzd();
                zzeasVar.zza.zza(new zzffw() { // from class: com.google.android.gms.internal.ads.zzear
                    @Override // com.google.android.gms.internal.ads.zzffw
                    public final Object zza(Object obj) throws SQLException {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzeasVar.zzf()) {
                            return null;
                        }
                        long j4 = jZzd;
                        zzbch.zzaf.zza.C0335zza c0335zzaZzn = zzbch.zzaf.zza.zzn();
                        c0335zzaZzn.zzP(j4);
                        byte[] bArrZzaV = c0335zzaZzn.zzbr().zzaV();
                        zzeaz.zzf(sQLiteDatabase, false, false);
                        zzeaz.zzc(sQLiteDatabase, j4, bArrZzaV);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzdE(zzfgm zzfgmVar, String str) {
    }
}
