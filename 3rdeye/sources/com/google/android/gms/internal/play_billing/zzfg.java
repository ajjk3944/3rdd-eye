package com.google.android.gms.internal.play_billing;

import N7.B8;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class zzfg {
    private static final zzfg zza = new zzfg(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzfg(int i, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzfg zzc() {
        return zza;
    }

    public static zzfg zze(zzfg zzfgVar, zzfg zzfgVar2) {
        int i = zzfgVar.zzb + zzfgVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzfgVar.zzc, i);
        System.arraycopy(zzfgVar2.zzc, 0, iArrCopyOf, zzfgVar.zzb, zzfgVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzfgVar.zzd, i);
        System.arraycopy(zzfgVar2.zzd, 0, objArrCopyOf, zzfgVar.zzb, zzfgVar2.zzb);
        return new zzfg(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzfg zzf() {
        return new zzfg(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i) {
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
        if (obj == null || !(obj instanceof zzfg)) {
            return false;
        }
        zzfg zzfgVar = (zzfg) obj;
        int i = this.zzb;
        if (i == zzfgVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzfgVar.zzc;
            int i10 = 0;
            while (true) {
                if (i10 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzfgVar.zzd;
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
        int iZzw;
        int iZzx;
        int iZzw2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzw3 = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.zzd[i10]).getClass();
                    iZzw2 = zzby.zzw(i12 << 3) + 8;
                } else if (i13 == 2) {
                    int i14 = i12 << 3;
                    zzbq zzbqVar = (zzbq) this.zzd[i10];
                    int iZzw4 = zzby.zzw(i14);
                    int iZzd = zzbqVar.zzd();
                    iZzw3 = zzby.zzw(iZzd) + iZzd + iZzw4 + iZzw3;
                } else if (i13 == 3) {
                    int iZzw5 = zzby.zzw(i12 << 3);
                    iZzw = iZzw5 + iZzw5;
                    iZzx = ((zzfg) this.zzd[i10]).zza();
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(zzdc.zza());
                    }
                    ((Integer) this.zzd[i10]).getClass();
                    iZzw2 = zzby.zzw(i12 << 3) + 4;
                }
                iZzw3 = iZzw2 + iZzw3;
            } else {
                int i15 = i12 << 3;
                long jLongValue = ((Long) this.zzd[i10]).longValue();
                iZzw = zzby.zzw(i15);
                iZzx = zzby.zzx(jLongValue);
            }
            iZzw3 = iZzx + iZzw + iZzw3;
        }
        this.zze = iZzw3;
        return iZzw3;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iH = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10] >>> 3;
            zzbq zzbqVar = (zzbq) this.zzd[i10];
            int iZzw = zzby.zzw(8);
            int iZzw2 = zzby.zzw(i11) + zzby.zzw(16);
            int iZzw3 = zzby.zzw(24);
            int iZzd = zzbqVar.zzd();
            iH += iZzw + iZzw + iZzw2 + B8.h(iZzd, iZzd, iZzw3);
        }
        this.zze = iH;
        return iH;
    }

    public final zzfg zzd(zzfg zzfgVar) {
        if (zzfgVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzfgVar.zzb;
        zzm(i);
        System.arraycopy(zzfgVar.zzc, 0, this.zzc, this.zzb, zzfgVar.zzb);
        System.arraycopy(zzfgVar.zzd, 0, this.zzd, this.zzb, zzfgVar.zzb);
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
            zzee.zzb(sb, i, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i10 = this.zzb;
        iArr[i10] = i;
        this.zzd[i10] = obj;
        this.zzb = i10 + 1;
    }

    public final void zzk(zzfx zzfxVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzfxVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzfx zzfxVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i10 = this.zzc[i];
                Object obj = this.zzd[i];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    zzfxVar.zzt(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    zzfxVar.zzm(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    zzfxVar.zzd(i12, (zzbq) obj);
                } else if (i11 == 3) {
                    zzfxVar.zzF(i12);
                    ((zzfg) obj).zzl(zzfxVar);
                    zzfxVar.zzh(i12);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(zzdc.zza());
                    }
                    zzfxVar.zzk(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzfg() {
        this(0, new int[8], new Object[8], true);
    }
}
