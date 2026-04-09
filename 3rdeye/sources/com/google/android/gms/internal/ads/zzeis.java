package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeis implements zzede {
    private final Context zza;
    private final zzcps zzb;
    private final zzbdx zzc;
    private final zzgdm zzd;
    private final zzfgs zze;

    public zzeis(Context context, zzcps zzcpsVar, zzfgs zzfgsVar, zzgdm zzgdmVar, zzbdx zzbdxVar) {
        this.zza = context;
        this.zzb = zzcpsVar;
        this.zze = zzfgsVar;
        this.zzd = zzgdmVar;
        this.zzc = zzbdxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final A4.a zza(zzfcf zzfcfVar, zzfbt zzfbtVar) {
        zzeiq zzeiqVar = new zzeiq(this, new View(this.zza), null, new zzcqt() { // from class: com.google.android.gms.internal.ads.zzeio
            @Override // com.google.android.gms.internal.ads.zzcqt
            public final com.google.android.gms.ads.internal.client.zzed zza() {
                return null;
            }
        }, (zzfbu) zzfbtVar.zzu.get(0));
        zzcoo zzcooVarZza = this.zzb.zza(new zzcrl(zzfcfVar, zzfbtVar, null), zzeiqVar);
        zzeir zzeirVarZzm = zzcooVarZza.zzm();
        zzfby zzfbyVar = zzfbtVar.zzs;
        final zzbds zzbdsVar = new zzbds(zzeirVarZzm, zzfbyVar.zzb, zzfbyVar.zza);
        zzfgm zzfgmVar = zzfgm.CUSTOM_RENDER_SYN;
        return zzfgc.zzd(new zzffx() { // from class: com.google.android.gms.internal.ads.zzeip
            @Override // com.google.android.gms.internal.ads.zzffx
            public final void zza() throws RemoteException {
                this.zza.zzc.zze(zzbdsVar);
            }
        }, this.zzd, zzfgmVar, this.zze).zzb(zzfgm.CUSTOM_RENDER_ACK).zzd(zzgdb.zzh(zzcooVarZza.zza())).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final boolean zzb(zzfcf zzfcfVar, zzfbt zzfbtVar) {
        zzfby zzfbyVar;
        return (this.zzc == null || (zzfbyVar = zzfbtVar.zzs) == null || zzfbyVar.zza == null) ? false : true;
    }
}
