package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzpi {
    public static final zzpi zza;
    public final int zzb;
    public final int zzc;
    private final zzfyk zzd;

    static {
        zzpi zzpiVar;
        if (Build.VERSION.SDK_INT >= 33) {
            zzfyj zzfyjVar = new zzfyj();
            for (int i = 1; i <= 10; i++) {
                zzfyjVar.zzf(Integer.valueOf(zzex.zzi(i)));
            }
            zzpiVar = new zzpi(2, zzfyjVar.zzi());
        } else {
            zzpiVar = new zzpi(2, 10);
        }
        zza = zzpiVar;
    }

    public zzpi(int i, int i10) {
        this.zzb = i;
        this.zzc = i10;
        this.zzd = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpi)) {
            return false;
        }
        zzpi zzpiVar = (zzpi) obj;
        return this.zzb == zzpiVar.zzb && this.zzc == zzpiVar.zzc && Objects.equals(this.zzd, zzpiVar.zzd);
    }

    public final int hashCode() {
        zzfyk zzfykVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzfykVar == null ? 0 : zzfykVar.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.zzb + ", maxChannelCount=" + this.zzc + ", channelMasks=" + String.valueOf(this.zzd) + "]";
    }

    public final int zza(int i, zze zzeVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (Build.VERSION.SDK_INT < 29) {
            Integer num = (Integer) zzpj.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
            num.getClass();
            return num.intValue();
        }
        int i10 = this.zzb;
        for (int i11 = 10; i11 > 0; i11--) {
            int iZzi = zzex.zzi(i11);
            if (iZzi != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i).setChannelMask(iZzi).build(), zzeVar.zza().zza)) {
                return i11;
            }
        }
        return 0;
    }

    public final boolean zzb(int i) {
        zzfyk zzfykVar = this.zzd;
        if (zzfykVar == null) {
            return i <= this.zzc;
        }
        int iZzi = zzex.zzi(i);
        if (iZzi == 0) {
            return false;
        }
        return zzfykVar.contains(Integer.valueOf(iZzi));
    }

    public zzpi(int i, Set set) {
        this.zzb = i;
        zzfyk zzfykVarZzl = zzfyk.zzl(set);
        this.zzd = zzfykVarZzl;
        zzgal it = zzfykVarZzl.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = iMax;
    }
}
