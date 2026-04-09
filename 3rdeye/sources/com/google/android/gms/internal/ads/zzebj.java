package com.google.android.gms.internal.ads;

import B4.f;
import android.app.Activity;
import j6.l;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzebj extends zzecf {
    private final Activity zza;
    private final com.google.android.gms.ads.internal.overlay.zzm zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzebj(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, String str, String str2, zzebi zzebiVar) {
        this.zza = activity;
        this.zzb = zzmVar;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzecf) {
            zzecf zzecfVar = (zzecf) obj;
            if (this.zza.equals(zzecfVar.zza()) && ((zzmVar = this.zzb) != null ? zzmVar.equals(zzecfVar.zzb()) : zzecfVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzecfVar.zzc()) : zzecfVar.zzc() == null) && ((str2 = this.zzd) != null ? str2.equals(zzecfVar.zzd()) : zzecfVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzb;
        int iHashCode2 = ((iHashCode * 1000003) ^ (zzmVar == null ? 0 : zzmVar.hashCode())) * 1000003;
        String str = this.zzc;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zzd;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbD = l.d("OfflineUtilsParams{activity=", this.zza.toString(), ", adOverlay=", String.valueOf(this.zzb), ", gwsQueryId=");
        sbD.append(this.zzc);
        sbD.append(", uri=");
        return f.c(sbD, this.zzd, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzecf
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzecf
    public final com.google.android.gms.ads.internal.overlay.zzm zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzecf
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzecf
    public final String zzd() {
        return this.zzd;
    }
}
