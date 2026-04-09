package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes2.dex */
final class zzake implements zzakb {
    private final int zza;
    private final int zzb;
    private final zzer zzc;

    public zzake(zzfv zzfvVar, zzv zzvVar) {
        zzer zzerVar = zzfvVar.zza;
        this.zzc = zzerVar;
        zzerVar.zzh(12);
        int iZzH = zzerVar.zzH();
        if (MimeTypes.AUDIO_RAW.equals(zzvVar.zzo)) {
            int iZzD = zzfj.zzD(zzvVar.zzI) * zzvVar.zzG;
            if (iZzH == 0 || iZzH % iZzD != 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(iZzD).length() + 66 + String.valueOf(iZzH).length());
                sb.append("Audio sample size mismatch. stsd sample size: ");
                sb.append(iZzD);
                sb.append(", stsz sample size: ");
                sb.append(iZzH);
                zzee.zzc("BoxParsers", sb.toString());
                iZzH = iZzD;
            }
        }
        this.zza = iZzH == 0 ? -1 : iZzH;
        this.zzb = zzerVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final int zzc() {
        int i10 = this.zza;
        return i10 == -1 ? this.zzc.zzH() : i10;
    }
}
