package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzedx implements zzedk {
    private final Context zza;
    private final zzcob zzb;

    public zzedx(Context context, zzcob zzcobVar) {
        this.zza = context;
        this.zzb = zzcobVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final /* bridge */ /* synthetic */ Object zza(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzegx, zzfcv {
        zzefe zzefeVar = new zzefe(zzfbtVar, (zzbrn) zzedhVar.zzb, AdFormat.APP_OPEN_AD);
        zzcny zzcnyVarZza = this.zzb.zza(new zzcrl(zzfcfVar, zzfbtVar, zzedhVar.zza), new zzdey(zzefeVar, null), new zzcnz(zzfbtVar.zzaa));
        zzefeVar.zzc(zzcnyVarZza.zzc());
        ((zzeev) zzedhVar.zzc).zzc(zzcnyVarZza.zzj());
        return zzcnyVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final void zzb(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        try {
            zzbrn zzbrnVar = (zzbrn) zzedhVar.zzb;
            zzbrnVar.zzq(zzfbtVar.zzZ);
            zzbrnVar.zzi(zzfbtVar.zzU, zzfbtVar.zzv.toString(), zzfcfVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzedv(zzedhVar, null), (zzbpu) zzedhVar.zzc);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e4);
            throw new zzfcv(e4);
        }
    }
}
