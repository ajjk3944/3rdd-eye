package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfco {
    public final com.google.android.gms.ads.internal.client.zzgc zza;
    public final zzbmn zzb;
    public final zzekq zzc;
    public final com.google.android.gms.ads.internal.client.zzm zzd;
    public final com.google.android.gms.ads.internal.client.zzr zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbgc zzi;
    public final com.google.android.gms.ads.internal.client.zzx zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final com.google.android.gms.ads.internal.client.zzco zzn;
    public final zzfcb zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final Bundle zzs;
    public final com.google.android.gms.ads.internal.client.zzcs zzt;

    public /* synthetic */ zzfco(zzfcm zzfcmVar, zzfcn zzfcnVar) {
        this.zze = zzfcmVar.zzb;
        this.zzf = zzfcmVar.zzc;
        this.zzt = zzfcmVar.zzu;
        int i = zzfcmVar.zza.zza;
        long j4 = zzfcmVar.zza.zzb;
        Bundle bundle = zzfcmVar.zza.zzc;
        int i10 = zzfcmVar.zza.zzd;
        List list = zzfcmVar.zza.zze;
        boolean z10 = zzfcmVar.zza.zzf;
        int i11 = zzfcmVar.zza.zzg;
        boolean z11 = true;
        if (!zzfcmVar.zza.zzh && !zzfcmVar.zze) {
            z11 = false;
        }
        this.zzd = new com.google.android.gms.ads.internal.client.zzm(i, j4, bundle, i10, list, z10, i11, z11, zzfcmVar.zza.zzi, zzfcmVar.zza.zzj, zzfcmVar.zza.zzk, zzfcmVar.zza.zzl, zzfcmVar.zza.zzm, zzfcmVar.zza.zzn, zzfcmVar.zza.zzo, zzfcmVar.zza.zzp, zzfcmVar.zza.zzq, zzfcmVar.zza.zzr, zzfcmVar.zza.zzs, zzfcmVar.zza.zzt, zzfcmVar.zza.zzu, zzfcmVar.zza.zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzfcmVar.zza.zzw), zzfcmVar.zza.zzx, zzfcmVar.zza.zzy, zzfcmVar.zza.zzz);
        this.zza = zzfcmVar.zzd != null ? zzfcmVar.zzd : zzfcmVar.zzh != null ? zzfcmVar.zzh.zzf : null;
        this.zzg = zzfcmVar.zzf;
        this.zzh = zzfcmVar.zzg;
        this.zzi = zzfcmVar.zzf == null ? null : zzfcmVar.zzh == null ? new zzbgc(new NativeAdOptions.Builder().build()) : zzfcmVar.zzh;
        this.zzj = zzfcmVar.zzi;
        this.zzk = zzfcmVar.zzm;
        this.zzl = zzfcmVar.zzj;
        this.zzm = zzfcmVar.zzk;
        this.zzn = zzfcmVar.zzl;
        this.zzb = zzfcmVar.zzn;
        this.zzo = new zzfcb(zzfcmVar.zzo, null);
        this.zzp = zzfcmVar.zzp;
        this.zzq = zzfcmVar.zzq;
        this.zzc = zzfcmVar.zzr;
        this.zzr = zzfcmVar.zzs;
        this.zzs = zzfcmVar.zzt;
    }

    public final boolean zza() {
        return this.zzf.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdv));
    }
}
