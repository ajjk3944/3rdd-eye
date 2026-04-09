package com.google.android.gms.internal.ads;

import B4.f;
import N7.B8;
import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfsm extends zzftp {
    private final IBinder zza;
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;
    private final String zzf;

    public /* synthetic */ zzfsm(IBinder iBinder, String str, int i, float f10, int i10, int i11, String str2, int i12, String str3, String str4, String str5, zzfsl zzfslVar) {
        this.zza = iBinder;
        this.zzb = str;
        this.zzc = i;
        this.zzd = f10;
        this.zze = i12;
        this.zzf = str4;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzftp) {
            zzftp zzftpVar = (zzftp) obj;
            if (this.zza.equals(zzftpVar.zzf()) && ((str = this.zzb) != null ? str.equals(zzftpVar.zzh()) : zzftpVar.zzh() == null) && this.zzc == zzftpVar.zzc() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzftpVar.zza())) {
                zzftpVar.zzb();
                zzftpVar.zzd();
                zzftpVar.zzj();
                if (this.zze == zzftpVar.zze()) {
                    zzftpVar.zzi();
                    String str2 = this.zzf;
                    if (str2 != null ? str2.equals(zzftpVar.zzg()) : zzftpVar.zzg() == null) {
                        zzftpVar.zzk();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd);
        int i = this.zze;
        String str2 = this.zzf;
        return ((((iHashCode2 * 1525764945) ^ i) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        StringBuilder sbK = B8.k("OverlayDisplayShowRequest{windowToken=", this.zza.toString(), ", appId=");
        sbK.append(this.zzb);
        sbK.append(", layoutGravity=");
        sbK.append(this.zzc);
        sbK.append(", layoutVerticalMargin=");
        sbK.append(this.zzd);
        sbK.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        sbK.append(this.zze);
        sbK.append(", deeplinkUrl=null, adFieldEnifd=");
        return f.c(sbK, this.zzf, ", thirdPartyAuthCallerId=null}");
    }

    @Override // com.google.android.gms.internal.ads.zzftp
    public final float zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzftp
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzftp
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzftp
    public final int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzftp
    public final int zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzftp
    public final IBinder zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzftp
    public final String zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzftp
    public final String zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzftp
    public final String zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzftp
    public final String zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzftp
    public final String zzk() {
        return null;
    }
}
