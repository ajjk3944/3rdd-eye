package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzge extends zzgc {
    private Uri zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private final zzgd zzf;

    public zzge(byte[] bArr) {
        zzgd zzgdVar = new zzgd(bArr);
        super(false);
        this.zzf = zzgdVar;
        zzdd.zzd(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.zzd;
        if (i11 == 0) {
            return -1;
        }
        int iMin = Math.min(i10, i11);
        byte[] bArr2 = this.zzb;
        zzdd.zzb(bArr2);
        System.arraycopy(bArr2, this.zzc, bArr, i, iMin);
        this.zzc += iMin;
        this.zzd -= iMin;
        zzg(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final long zzb(zzgo zzgoVar) throws IOException {
        zzi(zzgoVar);
        this.zza = zzgoVar.zza;
        byte[] bArr = this.zzf.zza;
        this.zzb = bArr;
        long j4 = zzgoVar.zze;
        int length = bArr.length;
        if (j4 > length) {
            throw new zzgk(2008);
        }
        int i = (int) j4;
        this.zzc = i;
        int i10 = length - i;
        this.zzd = i10;
        long j10 = zzgoVar.zzf;
        if (j10 != -1) {
            this.zzd = (int) Math.min(i10, j10);
        }
        this.zze = true;
        zzj(zzgoVar);
        return j10 != -1 ? j10 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final Uri zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzd() {
        if (this.zze) {
            this.zze = false;
            zzh();
        }
        this.zza = null;
        this.zzb = null;
    }
}
