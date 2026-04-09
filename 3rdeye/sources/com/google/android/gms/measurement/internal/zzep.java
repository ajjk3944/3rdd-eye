package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import j6.l;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: classes2.dex */
public final class zzep {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final Bundle zzd;

    public zzep(String str, String str2, Bundle bundle, long j4) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = bundle;
        this.zzc = j4;
    }

    public static zzep zzb(zzaw zzawVar) {
        return new zzep(zzawVar.zza, zzawVar.zzc, zzawVar.zzb.zzc(), zzawVar.zzd);
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zza;
        String string = this.zzd.toString();
        StringBuilder sbD = l.d("origin=", str, ",name=", str2, ",params=");
        sbD.append(string);
        return sbD.toString();
    }

    public final zzaw zza() {
        return new zzaw(this.zza, new zzau(new Bundle(this.zzd)), this.zzb, this.zzc);
    }
}
