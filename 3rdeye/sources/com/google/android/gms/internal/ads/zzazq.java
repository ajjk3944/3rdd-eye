package com.google.android.gms.internal.ads;

import androidx.work.s;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzazq {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final zzbaf zze;
    private final zzban zzf;
    private int zzn;
    private final Object zzg = new Object();
    private final ArrayList zzh = new ArrayList();
    private final ArrayList zzi = new ArrayList();
    private final ArrayList zzj = new ArrayList();
    private int zzk = 0;
    private int zzl = 0;
    private int zzm = 0;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";

    public zzazq(int i, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = z10;
        this.zze = new zzbaf(i12);
        this.zzf = new zzban(i13, i14, i15);
    }

    private final void zzm(String str, boolean z10, float f10, float f11, float f12, float f13) {
        if (str != null) {
            if (str.length() < this.zzc) {
                return;
            }
            synchronized (this.zzg) {
                try {
                    this.zzh.add(str);
                    this.zzk += str.length();
                    if (z10) {
                        this.zzi.add(str);
                        this.zzj.add(new zzbab(f10, f11, f12, f13, r10.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static final String zzn(ArrayList arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            sb.append((String) arrayList.get(i10));
            sb.append(' ');
            i10++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String string = sb.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzazq)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzazq) obj).zzo;
        return str != null && str.equals(this.zzo);
    }

    public final int hashCode() {
        return this.zzo.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = this.zzh;
        int i = this.zzl;
        int i10 = this.zzn;
        int i11 = this.zzk;
        String strZzn = zzn(arrayList, 100);
        String strZzn2 = zzn(this.zzi, 100);
        String str = this.zzo;
        String str2 = this.zzp;
        String str3 = this.zzq;
        StringBuilder sbI = s.i("ActivityContent fetchId: ", i, " score:", i10, " total_length:");
        sbI.append(i11);
        sbI.append("\n text: ");
        sbI.append(strZzn);
        sbI.append("\n viewableText");
        com.google.android.gms.measurement.internal.a.l(sbI, strZzn2, "\n signture: ", str, "\n viewableSignture: ");
        sbI.append(str2);
        sbI.append("\n viewableSignatureForVertical: ");
        sbI.append(str3);
        return sbI.toString();
    }

    public final int zza(int i, int i10) {
        if (this.zzd) {
            return this.zzb;
        }
        return (i10 * this.zzb) + (i * this.zza);
    }

    public final int zzb() {
        return this.zzk;
    }

    public final String zzc() {
        return this.zzo;
    }

    public final String zzd() {
        return this.zzq;
    }

    public final void zze() {
        synchronized (this.zzg) {
            this.zzm--;
        }
    }

    public final void zzf() {
        synchronized (this.zzg) {
            this.zzm++;
        }
    }

    public final void zzg(int i) {
        this.zzl = i;
    }

    public final void zzh(String str, boolean z10, float f10, float f11, float f12, float f13) {
        zzm(str, z10, f10, f11, f12, f13);
    }

    public final void zzi(String str, boolean z10, float f10, float f11, float f12, float f13) {
        zzm(str, z10, f10, f11, f12, f13);
        synchronized (this.zzg) {
            try {
                if (this.zzm < 0) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zze("ActivityContent: negative number of WebViews.");
                }
                zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj() {
        synchronized (this.zzg) {
            try {
                int iZza = zza(this.zzk, this.zzl);
                if (iZza > this.zzn) {
                    this.zzn = iZza;
                    if (!com.google.android.gms.ads.internal.zzv.zzp().zzi().zzK()) {
                        zzbaf zzbafVar = this.zze;
                        this.zzo = zzbafVar.zza(this.zzh);
                        this.zzp = zzbafVar.zza(this.zzi);
                    }
                    if (!com.google.android.gms.ads.internal.zzv.zzp().zzi().zzL()) {
                        this.zzq = this.zzf.zza(this.zzi, this.zzj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzk() {
        synchronized (this.zzg) {
            try {
                int iZza = zza(this.zzk, this.zzl);
                if (iZza > this.zzn) {
                    this.zzn = iZza;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzl() {
        boolean z10;
        synchronized (this.zzg) {
            z10 = this.zzm == 0;
        }
        return z10;
    }
}
