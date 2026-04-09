package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zzbch;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdgl implements zzcvr, zzddb {
    private final zzbyi zza;
    private final Context zzb;
    private final zzbym zzc;
    private final View zzd;
    private String zze;
    private final zzbch.zza.EnumC0333zza zzf;

    public zzdgl(zzbyi zzbyiVar, Context context, zzbym zzbymVar, View view, zzbch.zza.EnumC0333zza enumC0333zza) {
        this.zza = zzbyiVar;
        this.zzb = context;
        this.zzc = zzbymVar;
        this.zzd = view;
        this.zzf = enumC0333zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zza() {
        this.zza.zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzc() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzo(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzdu(zzbwa zzbwaVar, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        zzbym zzbymVar = this.zzc;
        Context context = this.zzb;
        if (zzbymVar.zzp(context)) {
            try {
                zzbymVar.zzl(context, zzbymVar.zzb(context), this.zza.zza(), zzbwaVar.zzc(), zzbwaVar.zzb());
            } catch (RemoteException e4) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Remote Exception to get reward item.", e4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzj() {
        zzbch.zza.EnumC0333zza enumC0333zza = this.zzf;
        if (enumC0333zza == zzbch.zza.EnumC0333zza.APP_OPEN) {
            return;
        }
        String strZzd = this.zzc.zzd(this.zzb);
        this.zze = strZzd;
        this.zze = String.valueOf(strZzd).concat(enumC0333zza == zzbch.zza.EnumC0333zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzi() {
    }
}
