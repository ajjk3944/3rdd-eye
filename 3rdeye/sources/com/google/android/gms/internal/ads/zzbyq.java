package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbyq implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzbyr zza;
    private final String zzb;

    public zzbyq(zzbyr zzbyrVar, String str) {
        this.zza = zzbyrVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zzbyr zzbyrVar = this.zza;
        synchronized (zzbyrVar) {
            try {
                for (zzbyp zzbypVar : zzbyrVar.zzb) {
                    zzbyr.zzb(zzbypVar.zza, zzbypVar.zzb, sharedPreferences, this.zzb, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
