package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdsb {
    final /* synthetic */ zzdsc zza;
    private final Map zzb = new ConcurrentHashMap();

    public zzdsb(zzdsc zzdscVar) {
        this.zza = zzdscVar;
    }

    public static /* bridge */ /* synthetic */ zzdsb zza(zzdsb zzdsbVar) {
        zzdsbVar.zzb.putAll(zzdsbVar.zza.zzc);
        return zzdsbVar;
    }

    public final zzdsb zzb(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdsb zzc(zzfbt zzfbtVar) {
        zzb("aai", zzfbtVar.zzw);
        zzb(CommonUrlParts.REQUEST_ID, zzfbtVar.zzan);
        zzb("ad_format", zzfbt.zza(zzfbtVar.zzb));
        return this;
    }

    public final zzdsb zzd(zzfbw zzfbwVar) {
        zzb("gqi", zzfbwVar.zzb);
        return this;
    }

    public final String zze() {
        return this.zza.zza.zzb(this.zzb);
    }

    public final void zzi() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsa
            @Override // java.lang.Runnable
            public final void run() {
                zzdsb zzdsbVar = this.zza;
                zzdsbVar.zza.zza.zze(zzdsbVar.zzb);
            }
        });
    }

    public final void zzj() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdry
            @Override // java.lang.Runnable
            public final void run() {
                zzdsb zzdsbVar = this.zza;
                zzdsbVar.zza.zza.zzg(zzdsbVar.zzb);
            }
        });
    }

    public final void zzk() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrz
            @Override // java.lang.Runnable
            public final void run() {
                zzdsb zzdsbVar = this.zza;
                zzdsbVar.zza.zza.zzf(zzdsbVar.zzb);
            }
        });
    }
}
