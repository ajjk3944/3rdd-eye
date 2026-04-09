package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbud;
import com.google.android.gms.internal.ads.zzgcx;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
final class zzas implements zzgcx {
    final /* synthetic */ zzbud zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzau zzc;

    public zzas(zzau zzauVar, zzbud zzbudVar, boolean z10) {
        this.zza = zzbudVar;
        this.zzb = z10;
        this.zzc = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        try {
            this.zza.zze("Internal error: " + th.getMessage());
        } catch (RemoteException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<Uri> list = (List) obj;
        try {
            zzau zzauVar = this.zzc;
            zzau.zzJ(zzauVar, list);
            this.zza.zzf(list);
            if (!zzauVar.zzs && !this.zzb) {
                return;
            }
            for (Uri uri : list) {
                if (zzauVar.zzP(uri)) {
                    zzauVar.zzq.zzd(zzau.zzaa(uri, zzauVar.zzA, "1").toString(), null, null, null);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhD)).booleanValue()) {
                        zzauVar.zzq.zzd(uri.toString(), null, null, null);
                    }
                }
            }
        } catch (RemoteException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e4);
        }
    }
}
