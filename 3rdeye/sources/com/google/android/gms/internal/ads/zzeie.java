package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeie implements zzedg {
    private final zzeji zza;
    private final zzdps zzb;

    public zzeie(zzeji zzejiVar, zzdps zzdpsVar) {
        this.zza = zzejiVar;
        this.zzb = zzdpsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedg
    public final zzedh zza(String str, JSONObject jSONObject) throws zzfcv {
        zzbrn zzbrnVarZzb;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbO)).booleanValue()) {
            try {
                zzbrnVarZzb = this.zzb.zzb(str);
            } catch (RemoteException e4) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Coundn't create RTB adapter: ", e4);
                zzbrnVarZzb = null;
            }
        } else {
            zzbrnVarZzb = this.zza.zza(str);
        }
        if (zzbrnVarZzb == null) {
            return null;
        }
        return new zzedh(zzbrnVarZzb, new zzeev(), str);
    }
}
