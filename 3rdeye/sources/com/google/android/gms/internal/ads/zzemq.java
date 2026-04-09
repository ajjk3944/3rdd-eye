package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzemq implements zzetu {
    private final zzgdm zza;
    private final zzdps zzb;
    private final zzdug zzc;
    private final zzems zzd;

    public zzemq(zzgdm zzgdmVar, zzdps zzdpsVar, zzdug zzdugVar, zzems zzemsVar) {
        this.zza = zzgdmVar;
        this.zzb = zzdpsVar;
        this.zzc = zzdugVar;
        this.zzd = zzemsVar;
    }

    public static /* synthetic */ zzemr zzc(zzemq zzemqVar) {
        List<String> listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbB)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                zzfdm zzfdmVarZzc = zzemqVar.zzb.zzc(str, new JSONObject());
                zzfdmVarZzc.zzC();
                boolean zZzt = zzemqVar.zzc.zzt();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlR)).booleanValue() || zZzt) {
                    try {
                        zzbsc zzbscVarZzf = zzfdmVarZzc.zzf();
                        if (zzbscVarZzf != null) {
                            bundle2.putString("sdk_version", zzbscVarZzf.toString());
                        }
                    } catch (zzfcv unused) {
                    }
                }
                try {
                    zzbsc zzbscVarZze = zzfdmVarZzc.zze();
                    if (zzbscVarZze != null) {
                        bundle2.putString("adapter_version", zzbscVarZze.toString());
                    }
                } catch (zzfcv unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfcv unused3) {
            }
        }
        zzemr zzemrVar = new zzemr(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlR)).booleanValue()) {
            zzemqVar.zzd.zzb(zzemrVar);
        }
        return zzemrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        zzbct zzbctVar = zzbdc.zzlR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            zzems zzemsVar = this.zzd;
            if (zzemsVar.zza() != null) {
                zzemr zzemrVarZza = zzemsVar.zza();
                zzemrVarZza.getClass();
                return zzgdb.zzh(zzemrVarZza);
            }
        }
        if (zzfvv.zzd((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbB)) || (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue() && (this.zzd.zzd() || !this.zzc.zzt()))) {
            return zzgdb.zzh(new zzemr(new Bundle()));
        }
        this.zzd.zzc(true);
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzemp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzemq.zzc(this.zza);
            }
        });
    }
}
