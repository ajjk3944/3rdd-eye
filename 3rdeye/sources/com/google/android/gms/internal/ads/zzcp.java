package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcp {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private double zzw;

    public zzcp(int i, int i10, float f10, float f11, int i11) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = f10;
        this.zzd = f11;
        this.zze = i / i11;
        this.zzf = i / 400;
        int i12 = i / 65;
        this.zzg = i12;
        int i13 = i12 + i12;
        this.zzh = i13;
        this.zzi = new short[i13];
        int i14 = i13 * i10;
        this.zzj = new short[i14];
        this.zzl = new short[i14];
        this.zzn = new short[i14];
    }

    private final int zzg(short[] sArr, int i, int i10, int i11) {
        int i12 = 1;
        int i13 = KotlinVersion.MAX_COMPONENT_VALUE;
        int i14 = 0;
        int i15 = 0;
        while (i10 <= i11) {
            int iAbs = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = this.zzb * i;
                iAbs += Math.abs(sArr[i17 + i16] - sArr[(i17 + i10) + i16]);
            }
            int i18 = iAbs * i14;
            int i19 = i12 * i10;
            if (i18 < i19) {
                i12 = iAbs;
            }
            if (i18 < i19) {
                i14 = i10;
            }
            int i20 = iAbs * i13;
            int i21 = i15 * i10;
            if (i20 > i21) {
                i15 = iAbs;
            }
            if (i20 > i21) {
                i13 = i10;
            }
            i10++;
        }
        this.zzu = i12 / i14;
        this.zzv = i15 / i13;
        return i14;
    }

    private final void zzh(short[] sArr, int i, int i10) {
        short[] sArrZzl = zzl(this.zzl, this.zzm, i10);
        this.zzl = sArrZzl;
        int i11 = this.zzm;
        int i12 = this.zzb;
        System.arraycopy(sArr, i * i12, sArrZzl, i11 * i12, i10 * i12);
        this.zzm += i10;
    }

    private final void zzi(short[] sArr, int i, int i10) {
        int i11;
        for (int i12 = 0; i12 < this.zzh / i10; i12++) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int i15 = this.zzb;
                i11 = i15 * i10;
                if (i13 < i11) {
                    i14 += sArr[(i11 * i12) + (i15 * i) + i13];
                    i13++;
                }
            }
            this.zzi[i12] = (short) (i14 / i11);
        }
    }

    private static void zzj(int i, int i10, short[] sArr, int i11, short[] sArr2, int i12, short[] sArr3, int i13) {
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i12 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i11 * i10) + i14;
            for (int i18 = 0; i18 < i; i18++) {
                sArr[i17] = (short) (((sArr3[i16] * i18) + ((i - i18) * sArr2[i15])) / i);
                i17 += i10;
                i15 += i10;
                i16 += i10;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzk() {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcp.zzk():void");
    }

    private final short[] zzl(short[] sArr, int i, int i10) {
        int length = sArr.length;
        int i11 = this.zzb;
        int i12 = length / i11;
        return i + i10 <= i12 ? sArr : Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public final int zza() {
        zzdd.zzf(this.zzm >= 0);
        int i = this.zzm * this.zzb;
        return i + i;
    }

    public final int zzb() {
        int i = this.zzk * this.zzb;
        return i + i;
    }

    public final void zzc() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
        this.zzw = 0.0d;
    }

    public final void zzd(ShortBuffer shortBuffer) {
        zzdd.zzf(this.zzm >= 0);
        int iRemaining = shortBuffer.remaining();
        int i = this.zzb;
        int iMin = Math.min(iRemaining / i, this.zzm);
        int i10 = iMin * i;
        shortBuffer.put(this.zzl, 0, i10);
        int i11 = this.zzm - iMin;
        this.zzm = i11;
        short[] sArr = this.zzl;
        System.arraycopy(sArr, i10, sArr, 0, i11 * i);
    }

    public final void zze() {
        int i = this.zzk;
        int i10 = this.zzr;
        int i11 = this.zzm;
        float f10 = this.zzc;
        float f11 = this.zzd;
        int i12 = i11 + ((int) (((((((i - i10) / (f10 / f11)) + i10) + this.zzw) + this.zzo) / (this.zze * f11)) + 0.5d));
        this.zzw = 0.0d;
        int i13 = this.zzh;
        int i14 = i13 + i13;
        this.zzj = zzl(this.zzj, i, i + i14);
        int i15 = 0;
        while (true) {
            int i16 = this.zzb;
            if (i15 >= i14 * i16) {
                break;
            }
            this.zzj[(i16 * i) + i15] = 0;
            i15++;
        }
        this.zzk += i14;
        zzk();
        if (this.zzm > i12) {
            this.zzm = Math.max(i12, 0);
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zzf(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.zzb;
        int i10 = iRemaining / i;
        int i11 = i10 * i;
        short[] sArrZzl = zzl(this.zzj, this.zzk, i10);
        this.zzj = sArrZzl;
        shortBuffer.get(sArrZzl, this.zzk * i, (i11 + i11) / 2);
        this.zzk += i10;
        zzk();
    }
}
