package com.google.android.gms.internal.measurement;

import N7.C1094a9;
import androidx.work.s;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.1.1 */
/* loaded from: classes2.dex */
public final class zzmo {
    private static final zzmo zza = new zzmo(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzmo(int i, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzmo zzc() {
        return zza;
    }

    public static zzmo zzd(zzmo zzmoVar, zzmo zzmoVar2) {
        int i = zzmoVar.zzb + zzmoVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzmoVar.zzc, i);
        System.arraycopy(zzmoVar2.zzc, 0, iArrCopyOf, zzmoVar.zzb, zzmoVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzmoVar.zzd, i);
        System.arraycopy(zzmoVar2.zzd, 0, objArrCopyOf, zzmoVar.zzb, zzmoVar2.zzb);
        return new zzmo(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzmo zze() {
        return new zzmo(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzmo)) {
            return false;
        }
        zzmo zzmoVar = (zzmo) obj;
        int i = this.zzb;
        if (i == zzmoVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzmoVar.zzc;
            int i10 = 0;
            while (true) {
                if (i10 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzmoVar.zzd;
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
        int i10 = (i + 527) * 31;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i10 + i11) * 31;
        Object[] objArr = this.zzd;
        int i14 = this.zzb;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }

    public final int zza() {
        int iZzA;
        int iZzB;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iC = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.zzd[i10]).getClass();
                    iC = s.c(i12 << 3, 8, iC);
                } else if (i13 == 2) {
                    zzjd zzjdVar = (zzjd) this.zzd[i10];
                    int iZzA2 = zzjl.zzA(i12 << 3);
                    int iZzd = zzjdVar.zzd();
                    iC = C1094a9.m(iZzd, iZzd, iZzA2, iC);
                } else if (i13 == 3) {
                    int iZzz = zzjl.zzz(i12);
                    iZzA = iZzz + iZzz;
                    iZzB = ((zzmo) this.zzd[i10]).zza();
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(zzko.zza());
                    }
                    ((Integer) this.zzd[i10]).getClass();
                    iC = s.c(i12 << 3, 4, iC);
                }
            } else {
                long jLongValue = ((Long) this.zzd[i10]).longValue();
                iZzA = zzjl.zzA(i12 << 3);
                iZzB = zzjl.zzB(jLongValue);
            }
            iC = iZzB + iZzA + iC;
        }
        this.zze = iC;
        return iC;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzA = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10];
            zzjd zzjdVar = (zzjd) this.zzd[i10];
            int iZzA2 = zzjl.zzA(8);
            int iZzd = zzjdVar.zzd();
            iZzA += zzjl.zzA(iZzd) + iZzd + zzjl.zzA(24) + s.c(i11 >>> 3, zzjl.zzA(16), iZzA2 + iZzA2);
        }
        this.zze = iZzA;
        return iZzA;
    }

    public final void zzf() {
        this.zzf = false;
    }

    public final void zzg(StringBuilder sb, int i) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzln.zzb(sb, i, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final void zzh(int i, Object obj) {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
        int i10 = this.zzb;
        int[] iArr = this.zzc;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.zzc = Arrays.copyOf(iArr, i11);
            this.zzd = Arrays.copyOf(this.zzd, i11);
        }
        int[] iArr2 = this.zzc;
        int i12 = this.zzb;
        iArr2[i12] = i;
        this.zzd[i12] = obj;
        this.zzb = i12 + 1;
    }

    public final void zzi(zznf zznfVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i10 = this.zzc[i];
                Object obj = this.zzd[i];
                int i11 = i10 >>> 3;
                int i12 = i10 & 7;
                if (i12 == 0) {
                    zznfVar.zzt(i11, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    zznfVar.zzm(i11, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    zznfVar.zzd(i11, (zzjd) obj);
                } else if (i12 == 3) {
                    zznfVar.zzE(i11);
                    ((zzmo) obj).zzi(zznfVar);
                    zznfVar.zzh(i11);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(zzko.zza());
                    }
                    zznfVar.zzk(i11, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzmo() {
        this(0, new int[8], new Object[8], true);
    }
}
