package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzete implements zzetu {
    private final zzbym zza;
    private final zzgdm zzb;
    private final Context zzc;

    public zzete(zzbym zzbymVar, zzgdm zzgdmVar, Context context) {
        this.zza = zzbymVar;
        this.zzb = zzgdmVar;
        this.zzc = context;
    }

    public static /* synthetic */ zzetf zzc(zzete zzeteVar) {
        zzbym zzbymVar = zzeteVar.zza;
        Context context = zzeteVar.zzc;
        if (!zzbymVar.zzp(context)) {
            return new zzetf(null, null, null, null, null);
        }
        String strZze = zzbymVar.zze(context);
        String str = strZze == null ? "" : strZze;
        String strZzc = zzbymVar.zzc(context);
        String str2 = strZzc == null ? "" : strZzc;
        String strZzb = zzbymVar.zzb(context);
        String str3 = strZzb == null ? "" : strZzb;
        String str4 = true != zzbymVar.zzp(context) ? null : "fa";
        return new zzetf(str, str2, str3, str4 == null ? "" : str4, "TIME_OUT".equals(str2) ? (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzax) : null);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzete.zzc(this.zza);
            }
        });
    }
}
