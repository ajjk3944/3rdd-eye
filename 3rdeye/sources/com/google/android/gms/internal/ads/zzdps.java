package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdps {
    private final zzfdk zza;
    private final zzdpp zzb;

    public zzdps(zzfdk zzfdkVar, zzdpp zzdppVar) {
        this.zza = zzfdkVar;
        this.zzb = zzdppVar;
    }

    public final zzbpo zza() throws RemoteException {
        zzbpo zzbpoVarZzb = this.zza.zzb();
        if (zzbpoVarZzb != null) {
            return zzbpoVarZzb;
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbrn zzb(String str) throws RemoteException {
        zzbrn zzbrnVarZzc = zza().zzc(str);
        this.zzb.zzd(str, zzbrnVarZzc);
        return zzbrnVarZzc;
    }

    public final zzfdm zzc(String str, JSONObject jSONObject) throws zzfcv {
        zzbpr zzbprVarZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbprVarZzb = new zzbqp(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbprVarZzb = new zzbqp(new zzbsg());
            } else {
                zzbpo zzbpoVarZza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        zzbprVarZzb = zzbpoVarZza.zze(string) ? zzbpoVarZza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zzbpoVarZza.zzd(string) ? zzbpoVarZza.zzb(string) : zzbpoVarZza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e4) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Invalid custom event.", e4);
                    }
                } else {
                    zzbprVarZzb = zzbpoVarZza.zzb(str);
                }
            }
            zzfdm zzfdmVar = new zzfdm(zzbprVarZzb);
            this.zzb.zzc(str, zzfdmVar);
            return zzfdmVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjD)).booleanValue()) {
                this.zzb.zzc(str, null);
            }
            throw new zzfcv(th);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}
