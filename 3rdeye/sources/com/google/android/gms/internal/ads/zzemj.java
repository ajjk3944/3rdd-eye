package com.google.android.gms.internal.ads;

import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzemj implements zzett {
    public final com.google.android.gms.ads.internal.client.zzr zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;
    public final Insets zzj;

    public zzemj(com.google.android.gms.ads.internal.client.zzr zzrVar, String str, boolean z10, String str2, float f10, int i, int i10, String str3, boolean z11, Insets insets) {
        Preconditions.checkNotNull(zzrVar, "the adSize must not be null");
        this.zza = zzrVar;
        this.zzb = str;
        this.zzc = z10;
        this.zzd = str2;
        this.zze = f10;
        this.zzf = i;
        this.zzg = i10;
        this.zzh = str3;
        this.zzi = z11;
        this.zzj = insets;
    }

    private final void zzc(Bundle bundle) {
        Insets insets;
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zza;
        int i = zzrVar.zze;
        zzfdc.zzf(bundle, "smart_w", "full", i == -1);
        int i10 = zzrVar.zzb;
        zzfdc.zzf(bundle, "smart_h", "auto", i10 == -2);
        zzfdc.zzg(bundle, "ene", true, zzrVar.zzj);
        zzfdc.zzf(bundle, "rafmt", "102", zzrVar.zzm);
        zzfdc.zzf(bundle, "rafmt", "103", zzrVar.zzn);
        zzfdc.zzf(bundle, "rafmt", "105", zzrVar.zzo);
        zzfdc.zzg(bundle, "inline_adaptive_slot", true, this.zzi);
        zzfdc.zzg(bundle, "interscroller_slot", true, zzrVar.zzo);
        zzfdc.zzc(bundle, "format", this.zzb);
        zzfdc.zzf(bundle, "fluid", "height", this.zzc);
        zzfdc.zzf(bundle, "sz", this.zzd, !TextUtils.isEmpty(r5));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        String str = this.zzh;
        zzfdc.zzf(bundle, "sc", str, true ^ TextUtils.isEmpty(str));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznw)).booleanValue() && Build.VERSION.SDK_INT >= 35 && (insets = this.zzj) != null) {
            bundle.putInt("sam_t", insets.top);
            bundle.putInt("sam_b", insets.bottom);
            bundle.putInt("sam_l", insets.left);
            bundle.putInt("sam_r", insets.right);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.zzg;
        if (zzrVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i10);
            bundle2.putInt("width", i);
            bundle2.putBoolean("is_fluid_height", zzrVar.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzrVar2.zzi);
                bundle3.putInt("height", zzrVar2.zzb);
                bundle3.putInt("width", zzrVar2.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* synthetic */ void zza(Object obj) {
        zzc(((zzcut) obj).zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* synthetic */ void zzb(Object obj) {
        zzc(((zzcut) obj).zza);
    }
}
