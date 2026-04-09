package com.google.android.gms.internal.ads;

import N7.H7;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzhbm {
    private static final zzhbm zza = new zzhbm(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzhbm(int i, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzhbm zzc() {
        return zza;
    }

    public static zzhbm zze(zzhbm zzhbmVar, zzhbm zzhbmVar2) {
        int i = zzhbmVar.zzb + zzhbmVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzhbmVar.zzc, i);
        System.arraycopy(zzhbmVar2.zzc, 0, iArrCopyOf, zzhbmVar.zzb, zzhbmVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzhbmVar.zzd, i);
        System.arraycopy(zzhbmVar2.zzd, 0, objArrCopyOf, zzhbmVar.zzb, zzhbmVar2.zzb);
        return new zzhbm(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzhbm zzf() {
        return new zzhbm();
    }

    private final void zzn(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i10 = this.zzb;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i) {
                i = i11;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzhbm)) {
            return false;
        }
        zzhbm zzhbmVar = (zzhbm) obj;
        int i = this.zzb;
        if (i == zzhbmVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzhbmVar.zzc;
            int i10 = 0;
            while (true) {
                if (i10 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzhbmVar.zzd;
                    int i11 = this.zzb;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
                if (iArr[i10] != iArr2[i10]) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i10 = i + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = ((i10 * 31) + i11) * 31;
        Object[] objArr = this.zzd;
        int i14 = this.zzb;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }

    public final int zza() {
        int iZzD;
        int iZzE;
        int iZzD2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzD3 = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.zzd[i10]).getClass();
                    iZzD2 = zzgya.zzD(i12 << 3) + 8;
                } else if (i13 == 2) {
                    int i14 = i12 << 3;
                    zzgxn zzgxnVar = (zzgxn) this.zzd[i10];
                    int iZzD4 = zzgya.zzD(i14);
                    int iZzd = zzgxnVar.zzd();
                    iZzD3 = zzgya.zzD(iZzd) + iZzd + iZzD4 + iZzD3;
                } else if (i13 == 3) {
                    int iZzD5 = zzgya.zzD(i12 << 3);
                    iZzD = iZzD5 + iZzD5;
                    iZzE = ((zzhbm) this.zzd[i10]).zza();
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(new zzgzj("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i10]).getClass();
                    iZzD2 = zzgya.zzD(i12 << 3) + 4;
                }
                iZzD3 = iZzD2 + iZzD3;
            } else {
                int i15 = i12 << 3;
                long jLongValue = ((Long) this.zzd[i10]).longValue();
                iZzD = zzgya.zzD(i15);
                iZzE = zzgya.zzE(jLongValue);
            }
            iZzD3 = iZzE + iZzD + iZzD3;
        }
        this.zze = iZzD3;
        return iZzD3;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iM = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10] >>> 3;
            zzgxn zzgxnVar = (zzgxn) this.zzd[i10];
            int iZzD = zzgya.zzD(8);
            int iZzD2 = zzgya.zzD(i11) + zzgya.zzD(16);
            int iZzD3 = zzgya.zzD(24);
            int iZzd = zzgxnVar.zzd();
            iM += iZzD + iZzD + iZzD2 + H7.m(iZzd, iZzd, iZzD3);
        }
        this.zze = iM;
        return iM;
    }

    public final zzhbm zzd(zzhbm zzhbmVar) {
        if (zzhbmVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzhbmVar.zzb;
        zzn(i);
        System.arraycopy(zzhbmVar.zzc, 0, this.zzc, this.zzb, zzhbmVar.zzb);
        System.arraycopy(zzhbmVar.zzd, 0, this.zzd, this.zzb, zzhbmVar.zzb);
        this.zzb = i;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzhai.zzb(sb, i, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i10 = this.zzb;
        iArr[i10] = i;
        this.zzd[i10] = obj;
        this.zzb = i10 + 1;
    }

    public final void zzk(zzhca zzhcaVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzhcaVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzhca zzhcaVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i10 = this.zzc[i];
                Object obj = this.zzd[i];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    zzhcaVar.zzt(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    zzhcaVar.zzm(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    zzhcaVar.zzd(i12, (zzgxn) obj);
                } else if (i11 == 3) {
                    zzhcaVar.zzF(i12);
                    ((zzhbm) obj).zzl(zzhcaVar);
                    zzhcaVar.zzh(i12);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(new zzgzj("Protocol message tag had invalid wire type."));
                    }
                    zzhcaVar.zzk(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final boolean zzm(int i, zzgxt zzgxtVar) throws IOException {
        int iZzl;
        zzg();
        int i10 = i & 7;
        if (i10 == 0) {
            zzj(i, Long.valueOf(zzgxtVar.zzo()));
            return true;
        }
        if (i10 == 1) {
            zzj(i, Long.valueOf(zzgxtVar.zzn()));
            return true;
        }
        if (i10 == 2) {
            zzj(i, zzgxtVar.zzv());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                zzgxtVar.zzy(0);
                return false;
            }
            if (i10 != 5) {
                throw new zzgzj("Protocol message tag had invalid wire type.");
            }
            zzj(i, Integer.valueOf(zzgxtVar.zzf()));
            return true;
        }
        zzhbm zzhbmVar = new zzhbm();
        do {
            iZzl = zzgxtVar.zzl();
            if (iZzl == 0) {
                break;
            }
        } while (zzhbmVar.zzm(iZzl, zzgxtVar));
        zzgxtVar.zzy(4 | ((i >>> 3) << 3));
        zzj(i, zzhbmVar);
        return true;
    }

    private zzhbm() {
        this(0, new int[8], new Object[8], true);
    }
}
