package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzzm {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzzf[] zzd = new zzzf[100];

    public zzzm(boolean z10, int i) {
    }

    public final synchronized int zza() {
        return this.zzb * 65536;
    }

    public final synchronized zzzf zzb() {
        zzzf zzzfVar;
        try {
            this.zzb++;
            int i = this.zzc;
            if (i > 0) {
                zzzf[] zzzfVarArr = this.zzd;
                int i10 = i - 1;
                this.zzc = i10;
                zzzfVar = zzzfVarArr[i10];
                if (zzzfVar == null) {
                    throw null;
                }
                zzzfVarArr[i10] = null;
            } else {
                zzzfVar = new zzzf(new byte[65536], 0);
                int i11 = this.zzb;
                zzzf[] zzzfVarArr2 = this.zzd;
                int length = zzzfVarArr2.length;
                if (i11 > length) {
                    this.zzd = (zzzf[]) Arrays.copyOf(zzzfVarArr2, length + length);
                    return zzzfVar;
                }
            }
            return zzzfVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc(zzzf zzzfVar) {
        zzzf[] zzzfVarArr = this.zzd;
        int i = this.zzc;
        this.zzc = i + 1;
        zzzfVarArr[i] = zzzfVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(zzzg zzzgVar) {
        while (zzzgVar != null) {
            try {
                zzzf[] zzzfVarArr = this.zzd;
                int i = this.zzc;
                this.zzc = i + 1;
                zzzfVarArr[i] = zzzgVar.zzc();
                this.zzb--;
                zzzgVar = zzzgVar.zzd();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i10 = this.zza;
        this.zza = i;
        if (i < i10) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int i = this.zza;
        String str = zzex.zza;
        int iMax = Math.max(0, ((i + 65535) / 65536) - this.zzb);
        int i10 = this.zzc;
        if (iMax >= i10) {
            return;
        }
        Arrays.fill(this.zzd, iMax, i10, (Object) null);
        this.zzc = iMax;
    }
}
