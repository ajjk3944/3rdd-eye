package com.google.android.gms.internal.ads;

import N7.C1094a9;
import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzarr extends zzhfh {
    private Date zzg;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzhfr zzm;
    private long zzn;

    public zzarr() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzhfr.zza;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieHeaderBox[creationTime=");
        sb.append(this.zzg);
        sb.append(";modificationTime=");
        sb.append(this.zzh);
        sb.append(";timescale=");
        sb.append(this.zzi);
        sb.append(";duration=");
        sb.append(this.zzj);
        sb.append(";rate=");
        sb.append(this.zzk);
        sb.append(";volume=");
        sb.append(this.zzl);
        sb.append(";matrix=");
        sb.append(this.zzm);
        sb.append(";nextTrackId=");
        return C1094a9.f(sb, this.zzn, "]");
    }

    public final long zzc() {
        return this.zzj;
    }

    public final long zzd() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhff
    public final void zze(ByteBuffer byteBuffer) {
        zzh(byteBuffer);
        if (zzg() == 1) {
            this.zzg = zzhfm.zza(zzarn.zzf(byteBuffer));
            this.zzh = zzhfm.zza(zzarn.zzf(byteBuffer));
            this.zzi = zzarn.zze(byteBuffer);
            this.zzj = zzarn.zzf(byteBuffer);
        } else {
            this.zzg = zzhfm.zza(zzarn.zze(byteBuffer));
            this.zzh = zzhfm.zza(zzarn.zze(byteBuffer));
            this.zzi = zzarn.zze(byteBuffer);
            this.zzj = zzarn.zze(byteBuffer);
        }
        this.zzk = zzarn.zzb(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.zzl = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        zzarn.zzd(byteBuffer);
        zzarn.zze(byteBuffer);
        zzarn.zze(byteBuffer);
        this.zzm = new zzhfr(zzarn.zzb(byteBuffer), zzarn.zzb(byteBuffer), zzarn.zzb(byteBuffer), zzarn.zzb(byteBuffer), zzarn.zza(byteBuffer), zzarn.zza(byteBuffer), zzarn.zza(byteBuffer), zzarn.zzb(byteBuffer), zzarn.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzarn.zze(byteBuffer);
    }
}
