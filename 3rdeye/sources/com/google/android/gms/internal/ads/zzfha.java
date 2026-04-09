package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzfha {
    public static zzfhb zza(Context context, int i) {
        boolean zBooleanValue;
        if (zzfhp.zza()) {
            int i10 = i - 2;
            if (i10 != 20 && i10 != 21) {
                switch (i10) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) zzbev.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) zzbev.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) zzbev.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) zzbev.zze.zze()).booleanValue();
            }
            if (zBooleanValue) {
                return new zzfhd(context, i);
            }
        }
        return new zzfii();
    }

    public static zzfhb zzb(Context context, int i, int i10, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        zzfhb zzfhbVarZza = zza(context, i);
        if (zzfhbVarZza instanceof zzfhd) {
            zzfhbVarZza.zzi();
            zzfhbVarZza.zzn(i10);
            zzfhbVarZza.zzf(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zza(zzmVar.zzm));
            String str = zzmVar.zzp;
            if (zzfhl.zze(str)) {
                zzfhbVarZza.zze(str);
            }
        }
        return zzfhbVarZza;
    }
}
