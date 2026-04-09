package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbcz implements zzbfr {
    final /* synthetic */ SharedPreferences zza;

    public zzbcz(zzbda zzbdaVar, SharedPreferences sharedPreferences) {
        this.zza = sharedPreferences;
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final Boolean zza(String str, boolean z10) {
        try {
            return Boolean.valueOf(this.zza.getBoolean(str, z10));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.zza.getString(str, String.valueOf(z10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final Double zzb(String str, double d10) {
        try {
            return Double.valueOf(this.zza.getFloat(str, (float) d10));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.zza.getString(str, String.valueOf(d10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final Long zzc(String str, long j4) {
        try {
            return Long.valueOf(this.zza.getLong(str, j4));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.zza.getInt(str, (int) j4));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final String zzd(String str, String str2) {
        return this.zza.getString(str, str2);
    }
}
