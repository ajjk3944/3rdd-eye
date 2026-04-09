package com.google.android.gms.internal.auth;

import j6.l;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
final class zzfz<T> implements zzgh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhi.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfw zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfk zzl;
    private final zzgy zzm;
    private final zzel zzn;
    private final zzgb zzo;
    private final zzfr zzp;

    private zzfz(int[] iArr, Object[] objArr, int i, int i10, zzfw zzfwVar, boolean z10, boolean z11, int[] iArr2, int i11, int i12, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i10;
        this.zzh = z10;
        this.zzi = iArr2;
        this.zzj = i11;
        this.zzk = i12;
        this.zzo = zzgbVar;
        this.zzl = zzfkVar;
        this.zzm = zzgyVar;
        this.zzn = zzelVar;
        this.zzg = zzfwVar;
        this.zzp = zzfrVar;
    }

    private static Field zzA(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbD = l.d("Field ", str, " for ", name, " not found. Known fields are ");
            sbD.append(string);
            throw new RuntimeException(sbD.toString());
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        long jZzv = zzv(i) & 1048575;
        if (zzG(obj2, i)) {
            Object objZzf = zzhi.zzf(obj, jZzv);
            Object objZzf2 = zzhi.zzf(obj2, jZzv);
            if (objZzf != null && objZzf2 != null) {
                zzhi.zzp(obj, jZzv, zzez.zzg(objZzf, objZzf2));
                zzD(obj, i);
            } else if (objZzf2 != null) {
                zzhi.zzp(obj, jZzv, objZzf2);
                zzD(obj, i);
            }
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int iZzv = zzv(i);
        int i10 = this.zzc[i];
        long j4 = iZzv & 1048575;
        if (zzJ(obj2, i10, i)) {
            Object objZzf = zzJ(obj, i10, i) ? zzhi.zzf(obj, j4) : null;
            Object objZzf2 = zzhi.zzf(obj2, j4);
            if (objZzf != null && objZzf2 != null) {
                zzhi.zzp(obj, j4, zzez.zzg(objZzf, objZzf2));
                zzE(obj, i10, i);
            } else if (objZzf2 != null) {
                zzhi.zzp(obj, j4, objZzf2);
                zzE(obj, i10, i);
            }
        }
    }

    private final void zzD(Object obj, int i) {
        int iZzs = zzs(i);
        long j4 = 1048575 & iZzs;
        if (j4 == 1048575) {
            return;
        }
        zzhi.zzn(obj, j4, (1 << (iZzs >>> 20)) | zzhi.zzc(obj, j4));
    }

    private final void zzE(Object obj, int i, int i10) {
        zzhi.zzn(obj, zzs(i10) & 1048575, i);
    }

    private final boolean zzF(Object obj, Object obj2, int i) {
        return zzG(obj, i) == zzG(obj2, i);
    }

    private final boolean zzG(Object obj, int i) {
        int iZzs = zzs(i);
        long j4 = iZzs & 1048575;
        if (j4 != 1048575) {
            return (zzhi.zzc(obj, j4) & (1 << (iZzs >>> 20))) != 0;
        }
        int iZzv = zzv(i);
        long j10 = iZzv & 1048575;
        switch (zzu(iZzv)) {
            case 0:
                return Double.doubleToRawLongBits(zzhi.zza(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhi.zzb(obj, j10)) != 0;
            case 2:
                return zzhi.zzd(obj, j10) != 0;
            case 3:
                return zzhi.zzd(obj, j10) != 0;
            case 4:
                return zzhi.zzc(obj, j10) != 0;
            case 5:
                return zzhi.zzd(obj, j10) != 0;
            case 6:
                return zzhi.zzc(obj, j10) != 0;
            case 7:
                return zzhi.zzt(obj, j10);
            case 8:
                Object objZzf = zzhi.zzf(obj, j10);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzee) {
                    return !zzee.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhi.zzf(obj, j10) != null;
            case 10:
                return !zzee.zzb.equals(zzhi.zzf(obj, j10));
            case 11:
                return zzhi.zzc(obj, j10) != 0;
            case 12:
                return zzhi.zzc(obj, j10) != 0;
            case 13:
                return zzhi.zzc(obj, j10) != 0;
            case 14:
                return zzhi.zzd(obj, j10) != 0;
            case 15:
                return zzhi.zzc(obj, j10) != 0;
            case 16:
                return zzhi.zzd(obj, j10) != 0;
            case 17:
                return zzhi.zzf(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzH(Object obj, int i, int i10, int i11, int i12) {
        return i10 == 1048575 ? zzG(obj, i) : (i11 & i12) != 0;
    }

    private static boolean zzI(Object obj, int i, zzgh zzghVar) {
        return zzghVar.zzi(zzhi.zzf(obj, i & 1048575));
    }

    private final boolean zzJ(Object obj, int i, int i10) {
        return zzhi.zzc(obj, (long) (zzs(i10) & 1048575)) == i;
    }

    public static zzgz zzc(Object obj) {
        zzeu zzeuVar = (zzeu) obj;
        zzgz zzgzVar = zzeuVar.zzc;
        if (zzgzVar != zzgz.zza()) {
            return zzgzVar;
        }
        zzgz zzgzVarZzc = zzgz.zzc();
        zzeuVar.zzc = zzgzVarZzc;
        return zzgzVarZzc;
    }

    public static zzfz zzj(Class cls, zzft zzftVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        if (zzftVar instanceof zzgg) {
            return zzk((zzgg) zzftVar, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0371  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.auth.zzfz zzk(com.google.android.gms.internal.auth.zzgg r34, com.google.android.gms.internal.auth.zzgb r35, com.google.android.gms.internal.auth.zzfk r36, com.google.android.gms.internal.auth.zzgy r37, com.google.android.gms.internal.auth.zzel r38, com.google.android.gms.internal.auth.zzfr r39) {
        /*
            Method dump skipped, instructions count: 985
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzk(com.google.android.gms.internal.auth.zzgg, com.google.android.gms.internal.auth.zzgb, com.google.android.gms.internal.auth.zzfk, com.google.android.gms.internal.auth.zzgy, com.google.android.gms.internal.auth.zzel, com.google.android.gms.internal.auth.zzfr):com.google.android.gms.internal.auth.zzfz");
    }

    private static int zzl(Object obj, long j4) {
        return ((Integer) zzhi.zzf(obj, j4)).intValue();
    }

    private final int zzm(Object obj, byte[] bArr, int i, int i10, int i11, long j4, zzds zzdsVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzz = zzz(i11);
        Object object = unsafe.getObject(obj, j4);
        if (!((zzfq) object).zze()) {
            zzfq zzfqVarZzb = zzfq.zza().zzb();
            zzfr.zza(zzfqVarZzb, object);
            unsafe.putObject(obj, j4, zzfqVarZzb);
        }
        throw null;
    }

    private final int zzn(Object obj, byte[] bArr, int i, int i10, int i11, int i12, int i13, int i14, int i15, long j4, int i16, zzds zzdsVar) throws IOException {
        Object object;
        Unsafe unsafe = zzb;
        long j10 = this.zzc[i16 + 2] & 1048575;
        switch (i15) {
            case 51:
                if (i13 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j4, Double.valueOf(Double.longBitsToDouble(zzdt.zzn(bArr, i))));
                unsafe.putInt(obj, j10, i12);
                return i + 8;
            case 52:
                if (i13 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j4, Float.valueOf(Float.intBitsToFloat(zzdt.zzb(bArr, i))));
                unsafe.putInt(obj, j10, i12);
                return i + 4;
            case 53:
            case 54:
                if (i13 != 0) {
                    return i;
                }
                int iZzm = zzdt.zzm(bArr, i, zzdsVar);
                unsafe.putObject(obj, j4, Long.valueOf(zzdsVar.zzb));
                unsafe.putInt(obj, j10, i12);
                return iZzm;
            case 55:
            case 62:
                if (i13 != 0) {
                    return i;
                }
                int iZzj = zzdt.zzj(bArr, i, zzdsVar);
                unsafe.putObject(obj, j4, Integer.valueOf(zzdsVar.zza));
                unsafe.putInt(obj, j10, i12);
                return iZzj;
            case 56:
            case 65:
                if (i13 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j4, Long.valueOf(zzdt.zzn(bArr, i)));
                unsafe.putInt(obj, j10, i12);
                return i + 8;
            case 57:
            case 64:
                if (i13 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j4, Integer.valueOf(zzdt.zzb(bArr, i)));
                unsafe.putInt(obj, j10, i12);
                return i + 4;
            case 58:
                if (i13 != 0) {
                    return i;
                }
                int iZzm2 = zzdt.zzm(bArr, i, zzdsVar);
                unsafe.putObject(obj, j4, Boolean.valueOf(zzdsVar.zzb != 0));
                unsafe.putInt(obj, j10, i12);
                return iZzm2;
            case 59:
                if (i13 != 2) {
                    return i;
                }
                int iZzj2 = zzdt.zzj(bArr, i, zzdsVar);
                int i17 = zzdsVar.zza;
                if (i17 == 0) {
                    unsafe.putObject(obj, j4, "");
                } else {
                    if ((i14 & 536870912) != 0 && !zzhm.zzd(bArr, iZzj2, iZzj2 + i17)) {
                        throw zzfa.zzb();
                    }
                    unsafe.putObject(obj, j4, new String(bArr, iZzj2, i17, zzez.zzb));
                    iZzj2 += i17;
                }
                unsafe.putInt(obj, j10, i12);
                return iZzj2;
            case 60:
                if (i13 != 2) {
                    return i;
                }
                int iZzd = zzdt.zzd(zzy(i16), bArr, i, i10, zzdsVar);
                object = unsafe.getInt(obj, j10) == i12 ? unsafe.getObject(obj, j4) : null;
                if (object == null) {
                    unsafe.putObject(obj, j4, zzdsVar.zzc);
                } else {
                    unsafe.putObject(obj, j4, zzez.zzg(object, zzdsVar.zzc));
                }
                unsafe.putInt(obj, j10, i12);
                return iZzd;
            case 61:
                if (i13 != 2) {
                    return i;
                }
                int iZza = zzdt.zza(bArr, i, zzdsVar);
                unsafe.putObject(obj, j4, zzdsVar.zzc);
                unsafe.putInt(obj, j10, i12);
                return iZza;
            case 63:
                if (i13 != 0) {
                    return i;
                }
                int iZzj3 = zzdt.zzj(bArr, i, zzdsVar);
                int i18 = zzdsVar.zza;
                zzex zzexVarZzx = zzx(i16);
                if (zzexVarZzx != null && !zzexVarZzx.zza()) {
                    zzc(obj).zzf(i11, Long.valueOf(i18));
                    return iZzj3;
                }
                unsafe.putObject(obj, j4, Integer.valueOf(i18));
                unsafe.putInt(obj, j10, i12);
                return iZzj3;
            case 66:
                if (i13 != 0) {
                    return i;
                }
                int iZzj4 = zzdt.zzj(bArr, i, zzdsVar);
                unsafe.putObject(obj, j4, Integer.valueOf(zzei.zzb(zzdsVar.zza)));
                unsafe.putInt(obj, j10, i12);
                return iZzj4;
            case 67:
                if (i13 != 0) {
                    return i;
                }
                int iZzm3 = zzdt.zzm(bArr, i, zzdsVar);
                unsafe.putObject(obj, j4, Long.valueOf(zzei.zzc(zzdsVar.zzb)));
                unsafe.putInt(obj, j10, i12);
                return iZzm3;
            case 68:
                if (i13 == 3) {
                    int iZzc = zzdt.zzc(zzy(i16), bArr, i, i10, (i11 & (-8)) | 4, zzdsVar);
                    object = unsafe.getInt(obj, j10) == i12 ? unsafe.getObject(obj, j4) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j4, zzdsVar.zzc);
                    } else {
                        unsafe.putObject(obj, j4, zzez.zzg(object, zzdsVar.zzc));
                    }
                    unsafe.putInt(obj, j10, i12);
                    return iZzc;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0080. Please report as an issue. */
    private final int zzo(Object obj, byte[] bArr, int i, int i10, zzds zzdsVar) throws IOException {
        Unsafe unsafe;
        int i11;
        int i12;
        int i13;
        int i14;
        Object obj2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        zzfz<T> zzfzVar = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i21 = i10;
        zzds zzdsVar2 = zzdsVar;
        Unsafe unsafe2 = zzb;
        int i22 = -1;
        int iZzm = i;
        int i23 = -1;
        int i24 = 0;
        int i25 = 0;
        int i26 = 1048575;
        while (iZzm < i21) {
            int iZzk = iZzm + 1;
            int i27 = bArr2[iZzm];
            if (i27 < 0) {
                iZzk = zzdt.zzk(i27, bArr2, iZzk, zzdsVar2);
                i27 = zzdsVar2.zza;
            }
            int i28 = iZzk;
            int i29 = i27 >>> 3;
            int i30 = i27 & 7;
            int iZzr = i29 > i23 ? zzfzVar.zzr(i29, i24 / 3) : zzfzVar.zzq(i29);
            if (iZzr == i22) {
                unsafe = unsafe2;
                i11 = i27;
                i12 = i22;
                i13 = i29;
                i14 = 0;
                obj2 = obj3;
            } else {
                int[] iArr = zzfzVar.zzc;
                int i31 = iArr[iZzr + 1];
                int iZzu = zzu(i31);
                int i32 = i27;
                int i33 = iZzr;
                long j4 = i31 & 1048575;
                if (iZzu <= 17) {
                    int i34 = iArr[i33 + 2];
                    int i35 = 1 << (i34 >>> 20);
                    int i36 = i34 & 1048575;
                    if (i36 != i26) {
                        int i37 = 1048575;
                        if (i26 != 1048575) {
                            unsafe2.putInt(obj3, i26, i25);
                            i37 = 1048575;
                        }
                        if (i36 != i37) {
                            i25 = unsafe2.getInt(obj3, i36);
                        }
                        i26 = i36;
                    }
                    switch (iZzu) {
                        case 0:
                            i20 = i33;
                            if (i30 != 1) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32;
                                break;
                            } else {
                                zzhi.zzl(obj3, j4, Double.longBitsToDouble(zzdt.zzn(bArr2, i28)));
                                iZzm = i28 + 8;
                                i25 |= i35;
                                i21 = i10;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                                break;
                            }
                        case 1:
                            i20 = i33;
                            if (i30 != 5) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32;
                                break;
                            } else {
                                zzhi.zzm(obj3, j4, Float.intBitsToFloat(zzdt.zzb(bArr2, i28)));
                                iZzm = i28 + 4;
                                i25 |= i35;
                                i21 = i10;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            i20 = i33;
                            if (i30 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32;
                                break;
                            } else {
                                int iZzm2 = zzdt.zzm(bArr2, i28, zzdsVar2);
                                Unsafe unsafe3 = unsafe2;
                                Object obj4 = obj3;
                                unsafe3.putLong(obj4, j4, zzdsVar2.zzb);
                                unsafe2 = unsafe3;
                                obj3 = obj4;
                                i25 |= i35;
                                iZzm = iZzm2;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                                i21 = i10;
                                break;
                            }
                        case 4:
                        case 11:
                            i20 = i33;
                            if (i30 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32;
                                break;
                            } else {
                                int iZzj = zzdt.zzj(bArr2, i28, zzdsVar2);
                                unsafe2.putInt(obj3, j4, zzdsVar2.zza);
                                i25 |= i35;
                                i21 = i10;
                                iZzm = iZzj;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            i20 = i33;
                            if (i30 != 1) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32;
                                break;
                            } else {
                                Unsafe unsafe4 = unsafe2;
                                Object obj5 = obj3;
                                unsafe4.putLong(obj5, j4, zzdt.zzn(bArr2, i28));
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                iZzm = i28 + 8;
                                i25 |= i35;
                                i21 = i10;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            i20 = i33;
                            if (i30 != 5) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32;
                                break;
                            } else {
                                unsafe2.putInt(obj3, j4, zzdt.zzb(bArr2, i28));
                                iZzm = i28 + 4;
                                i25 |= i35;
                                i21 = i10;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                                break;
                            }
                        case 7:
                            i20 = i33;
                            if (i30 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32;
                                break;
                            } else {
                                iZzm = zzdt.zzm(bArr2, i28, zzdsVar2);
                                zzhi.zzk(obj3, j4, zzdsVar2.zzb != 0);
                                i25 |= i35;
                                i21 = i10;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                                break;
                            }
                        case 8:
                            i20 = i33;
                            if (i30 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32;
                                break;
                            } else {
                                iZzm = (536870912 & i31) == 0 ? zzdt.zzg(bArr2, i28, zzdsVar2) : zzdt.zzh(bArr2, i28, zzdsVar2);
                                unsafe2.putObject(obj3, j4, zzdsVar2.zzc);
                                i25 |= i35;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                                break;
                            }
                        case 9:
                            i20 = i33;
                            if (i30 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32;
                                break;
                            } else {
                                iZzm = zzdt.zzd(zzfzVar.zzy(i20), bArr2, i28, i21, zzdsVar2);
                                Object object = unsafe2.getObject(obj3, j4);
                                if (object == null) {
                                    unsafe2.putObject(obj3, j4, zzdsVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj3, j4, zzez.zzg(object, zzdsVar2.zzc));
                                }
                                i25 |= i35;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                                break;
                            }
                        case 10:
                            i20 = i33;
                            if (i30 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32;
                                break;
                            } else {
                                iZzm = zzdt.zza(bArr2, i28, zzdsVar2);
                                unsafe2.putObject(obj3, j4, zzdsVar2.zzc);
                                i25 |= i35;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                                break;
                            }
                        case 12:
                            i20 = i33;
                            if (i30 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32;
                                break;
                            } else {
                                iZzm = zzdt.zzj(bArr2, i28, zzdsVar2);
                                unsafe2.putInt(obj3, j4, zzdsVar2.zza);
                                i25 |= i35;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                                break;
                            }
                        case 15:
                            i20 = i33;
                            if (i30 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32;
                                break;
                            } else {
                                iZzm = zzdt.zzj(bArr2, i28, zzdsVar2);
                                unsafe2.putInt(obj3, j4, zzei.zzb(zzdsVar2.zza));
                                i25 |= i35;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                                break;
                            }
                        case 16:
                            if (i30 != 0) {
                                i20 = i33;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32;
                                break;
                            } else {
                                int iZzm3 = zzdt.zzm(bArr2, i28, zzdsVar2);
                                Unsafe unsafe5 = unsafe2;
                                Object obj6 = obj3;
                                i20 = i33;
                                unsafe5.putLong(obj6, j4, zzei.zzc(zzdsVar2.zzb));
                                unsafe2 = unsafe5;
                                obj3 = obj6;
                                i25 |= i35;
                                iZzm = iZzm3;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                                break;
                            }
                        default:
                            i20 = i33;
                            obj2 = obj3;
                            unsafe = unsafe2;
                            i13 = i29;
                            i14 = i20;
                            i12 = -1;
                            i11 = i32;
                            break;
                    }
                } else {
                    i14 = i33;
                    if (iZzu != 27) {
                        i15 = i28;
                        Unsafe unsafe6 = unsafe2;
                        if (iZzu <= 49) {
                            i16 = i25;
                            unsafe = unsafe6;
                            i12 = -1;
                            i18 = i26;
                            int iZzp = zzfzVar.zzp(obj, bArr, i15, i10, i32, i29, i30, i14, i31, iZzu, j4, zzdsVar);
                            i17 = i32;
                            i19 = i29;
                            if (iZzp != i15) {
                                zzfzVar = this;
                                obj3 = obj;
                                zzdsVar2 = zzdsVar;
                                iZzm = iZzp;
                                i24 = i14;
                                i23 = i19;
                                i26 = i18;
                                i22 = i12;
                                i25 = i16;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i21 = i10;
                            } else {
                                obj2 = obj;
                                i28 = iZzp;
                                i13 = i19;
                                i11 = i17;
                            }
                        } else {
                            i16 = i25;
                            unsafe = unsafe6;
                            i12 = -1;
                            i17 = i32;
                            i18 = i26;
                            i19 = i29;
                            if (iZzu != 50) {
                                i13 = i19;
                                int iZzn = zzn(obj, bArr, i15, i10, i17, i13, i30, i31, iZzu, j4, i14, zzdsVar);
                                obj2 = obj;
                                i11 = i17;
                                i14 = i14;
                                if (iZzn != i15) {
                                    zzfzVar = this;
                                    zzdsVar2 = zzdsVar;
                                    i23 = i13;
                                    iZzm = iZzn;
                                    i24 = i14;
                                    obj3 = obj2;
                                    i26 = i18;
                                    i22 = i12;
                                    i25 = i16;
                                    unsafe2 = unsafe;
                                    bArr2 = bArr;
                                    i21 = i10;
                                } else {
                                    i28 = iZzn;
                                }
                            } else if (i30 == 2) {
                                int iZzm4 = zzm(obj, bArr, i15, i10, i14, j4, zzdsVar);
                                i14 = i14;
                                if (iZzm4 != i15) {
                                    zzfzVar = this;
                                    obj3 = obj;
                                    bArr2 = bArr;
                                    zzdsVar2 = zzdsVar;
                                    iZzm = iZzm4;
                                    i24 = i14;
                                    i23 = i19;
                                    i26 = i18;
                                    i22 = -1;
                                    i25 = i16;
                                    unsafe2 = unsafe;
                                    i21 = i10;
                                } else {
                                    obj2 = obj;
                                    i28 = iZzm4;
                                    i13 = i19;
                                    i11 = i17;
                                }
                            } else {
                                i14 = i14;
                                obj2 = obj;
                                i28 = i15;
                                i13 = i19;
                                i11 = i17;
                            }
                        }
                    } else if (i30 == 2) {
                        zzey zzeyVarZzd = (zzey) unsafe2.getObject(obj3, j4);
                        if (!zzeyVarZzd.zzc()) {
                            int size = zzeyVarZzd.size();
                            zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
                            unsafe2.putObject(obj3, j4, zzeyVarZzd);
                        }
                        int iZze = zzdt.zze(zzfzVar.zzy(i14), i32, bArr2, i28, i10, zzeyVarZzd, zzdsVar2);
                        bArr2 = bArr;
                        zzdsVar2 = zzdsVar;
                        iZzm = iZze;
                        i24 = i14;
                        unsafe2 = unsafe2;
                        i23 = i29;
                        i22 = -1;
                        obj3 = obj;
                        i21 = i10;
                    } else {
                        i15 = i28;
                        i18 = i26;
                        i16 = i25;
                        unsafe = unsafe2;
                        i19 = i29;
                        i12 = -1;
                        i17 = i32;
                        obj2 = obj;
                        i28 = i15;
                        i13 = i19;
                        i11 = i17;
                    }
                    i26 = i18;
                    i25 = i16;
                }
            }
            int iZzi = zzdt.zzi(i11, bArr, i28, i10, zzc(obj2), zzdsVar);
            bArr2 = bArr;
            zzdsVar2 = zzdsVar;
            i23 = i13;
            i24 = i14;
            obj3 = obj2;
            i22 = i12;
            unsafe2 = unsafe;
            i21 = i10;
            iZzm = iZzi;
            zzfzVar = this;
        }
        Object obj7 = obj3;
        Unsafe unsafe7 = unsafe2;
        int i38 = i21;
        int i39 = i26;
        int i40 = i25;
        if (i39 != 1048575) {
            unsafe7.putInt(obj7, i39, i40);
        }
        if (iZzm == i38) {
            return iZzm;
        }
        throw zzfa.zzd();
    }

    private final int zzp(Object obj, byte[] bArr, int i, int i10, int i11, int i12, int i13, int i14, long j4, int i15, long j10, zzds zzdsVar) throws IOException {
        int iZzl;
        Unsafe unsafe = zzb;
        zzey zzeyVarZzd = (zzey) unsafe.getObject(obj, j10);
        if (!zzeyVarZzd.zzc()) {
            int size = zzeyVarZzd.size();
            zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j10, zzeyVarZzd);
        }
        zzey zzeyVar = zzeyVarZzd;
        switch (i15) {
            case 18:
            case 35:
                if (i13 == 2) {
                    zzej zzejVar = (zzej) zzeyVar;
                    int iZzj = zzdt.zzj(bArr, i, zzdsVar);
                    int i16 = zzdsVar.zza + iZzj;
                    while (iZzj < i16) {
                        zzejVar.zze(Double.longBitsToDouble(zzdt.zzn(bArr, iZzj)));
                        iZzj += 8;
                    }
                    if (iZzj == i16) {
                        return iZzj;
                    }
                    throw zzfa.zzf();
                }
                if (i13 == 1) {
                    zzej zzejVar2 = (zzej) zzeyVar;
                    zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, i)));
                    int i17 = i + 8;
                    while (i17 < i10) {
                        int iZzj2 = zzdt.zzj(bArr, i17, zzdsVar);
                        if (i11 != zzdsVar.zza) {
                            return i17;
                        }
                        zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, iZzj2)));
                        i17 = iZzj2 + 8;
                    }
                    return i17;
                }
                return i;
            case 19:
            case 36:
                if (i13 == 2) {
                    zzeq zzeqVar = (zzeq) zzeyVar;
                    int iZzj3 = zzdt.zzj(bArr, i, zzdsVar);
                    int i18 = zzdsVar.zza + iZzj3;
                    while (iZzj3 < i18) {
                        zzeqVar.zze(Float.intBitsToFloat(zzdt.zzb(bArr, iZzj3)));
                        iZzj3 += 4;
                    }
                    if (iZzj3 == i18) {
                        return iZzj3;
                    }
                    throw zzfa.zzf();
                }
                if (i13 == 5) {
                    zzeq zzeqVar2 = (zzeq) zzeyVar;
                    zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, i)));
                    int i19 = i + 4;
                    while (i19 < i10) {
                        int iZzj4 = zzdt.zzj(bArr, i19, zzdsVar);
                        if (i11 != zzdsVar.zza) {
                            return i19;
                        }
                        zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, iZzj4)));
                        i19 = iZzj4 + 4;
                    }
                    return i19;
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i13 == 2) {
                    zzfl zzflVar = (zzfl) zzeyVar;
                    int iZzj5 = zzdt.zzj(bArr, i, zzdsVar);
                    int i20 = zzdsVar.zza + iZzj5;
                    while (iZzj5 < i20) {
                        iZzj5 = zzdt.zzm(bArr, iZzj5, zzdsVar);
                        zzflVar.zze(zzdsVar.zzb);
                    }
                    if (iZzj5 == i20) {
                        return iZzj5;
                    }
                    throw zzfa.zzf();
                }
                if (i13 == 0) {
                    zzfl zzflVar2 = (zzfl) zzeyVar;
                    int iZzm = zzdt.zzm(bArr, i, zzdsVar);
                    zzflVar2.zze(zzdsVar.zzb);
                    while (iZzm < i10) {
                        int iZzj6 = zzdt.zzj(bArr, iZzm, zzdsVar);
                        if (i11 != zzdsVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzdt.zzm(bArr, iZzj6, zzdsVar);
                        zzflVar2.zze(zzdsVar.zzb);
                    }
                    return iZzm;
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i13 == 2) {
                    return zzdt.zzf(bArr, i, zzeyVar, zzdsVar);
                }
                if (i13 == 0) {
                    return zzdt.zzl(i11, bArr, i, i10, zzeyVar, zzdsVar);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i13 == 2) {
                    zzfl zzflVar3 = (zzfl) zzeyVar;
                    int iZzj7 = zzdt.zzj(bArr, i, zzdsVar);
                    int i21 = zzdsVar.zza + iZzj7;
                    while (iZzj7 < i21) {
                        zzflVar3.zze(zzdt.zzn(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i21) {
                        return iZzj7;
                    }
                    throw zzfa.zzf();
                }
                if (i13 == 1) {
                    zzfl zzflVar4 = (zzfl) zzeyVar;
                    zzflVar4.zze(zzdt.zzn(bArr, i));
                    int i22 = i + 8;
                    while (i22 < i10) {
                        int iZzj8 = zzdt.zzj(bArr, i22, zzdsVar);
                        if (i11 != zzdsVar.zza) {
                            return i22;
                        }
                        zzflVar4.zze(zzdt.zzn(bArr, iZzj8));
                        i22 = iZzj8 + 8;
                    }
                    return i22;
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i13 == 2) {
                    zzev zzevVar = (zzev) zzeyVar;
                    int iZzj9 = zzdt.zzj(bArr, i, zzdsVar);
                    int i23 = zzdsVar.zza + iZzj9;
                    while (iZzj9 < i23) {
                        zzevVar.zze(zzdt.zzb(bArr, iZzj9));
                        iZzj9 += 4;
                    }
                    if (iZzj9 == i23) {
                        return iZzj9;
                    }
                    throw zzfa.zzf();
                }
                if (i13 == 5) {
                    zzev zzevVar2 = (zzev) zzeyVar;
                    zzevVar2.zze(zzdt.zzb(bArr, i));
                    int i24 = i + 4;
                    while (i24 < i10) {
                        int iZzj10 = zzdt.zzj(bArr, i24, zzdsVar);
                        if (i11 != zzdsVar.zza) {
                            return i24;
                        }
                        zzevVar2.zze(zzdt.zzb(bArr, iZzj10));
                        i24 = iZzj10 + 4;
                    }
                    return i24;
                }
                return i;
            case 25:
            case 42:
                if (i13 == 2) {
                    zzdu zzduVar = (zzdu) zzeyVar;
                    int iZzj11 = zzdt.zzj(bArr, i, zzdsVar);
                    int i25 = zzdsVar.zza + iZzj11;
                    while (iZzj11 < i25) {
                        iZzj11 = zzdt.zzm(bArr, iZzj11, zzdsVar);
                        zzduVar.zze(zzdsVar.zzb != 0);
                    }
                    if (iZzj11 == i25) {
                        return iZzj11;
                    }
                    throw zzfa.zzf();
                }
                if (i13 == 0) {
                    zzdu zzduVar2 = (zzdu) zzeyVar;
                    int iZzm2 = zzdt.zzm(bArr, i, zzdsVar);
                    zzduVar2.zze(zzdsVar.zzb != 0);
                    while (iZzm2 < i10) {
                        int iZzj12 = zzdt.zzj(bArr, iZzm2, zzdsVar);
                        if (i11 != zzdsVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzdt.zzm(bArr, iZzj12, zzdsVar);
                        zzduVar2.zze(zzdsVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return i;
            case 26:
                if (i13 == 2) {
                    if ((j4 & 536870912) == 0) {
                        int iZzj13 = zzdt.zzj(bArr, i, zzdsVar);
                        int i26 = zzdsVar.zza;
                        if (i26 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i26 == 0) {
                            zzeyVar.add("");
                        } else {
                            zzeyVar.add(new String(bArr, iZzj13, i26, zzez.zzb));
                            iZzj13 += i26;
                        }
                        while (iZzj13 < i10) {
                            int iZzj14 = zzdt.zzj(bArr, iZzj13, zzdsVar);
                            if (i11 != zzdsVar.zza) {
                                return iZzj13;
                            }
                            iZzj13 = zzdt.zzj(bArr, iZzj14, zzdsVar);
                            int i27 = zzdsVar.zza;
                            if (i27 < 0) {
                                throw zzfa.zzc();
                            }
                            if (i27 == 0) {
                                zzeyVar.add("");
                            } else {
                                zzeyVar.add(new String(bArr, iZzj13, i27, zzez.zzb));
                                iZzj13 += i27;
                            }
                        }
                        return iZzj13;
                    }
                    int iZzj15 = zzdt.zzj(bArr, i, zzdsVar);
                    int i28 = zzdsVar.zza;
                    if (i28 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i28 == 0) {
                        zzeyVar.add("");
                    } else {
                        int i29 = iZzj15 + i28;
                        if (!zzhm.zzd(bArr, iZzj15, i29)) {
                            throw zzfa.zzb();
                        }
                        zzeyVar.add(new String(bArr, iZzj15, i28, zzez.zzb));
                        iZzj15 = i29;
                    }
                    while (iZzj15 < i10) {
                        int iZzj16 = zzdt.zzj(bArr, iZzj15, zzdsVar);
                        if (i11 != zzdsVar.zza) {
                            return iZzj15;
                        }
                        iZzj15 = zzdt.zzj(bArr, iZzj16, zzdsVar);
                        int i30 = zzdsVar.zza;
                        if (i30 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i30 == 0) {
                            zzeyVar.add("");
                        } else {
                            int i31 = iZzj15 + i30;
                            if (!zzhm.zzd(bArr, iZzj15, i31)) {
                                throw zzfa.zzb();
                            }
                            zzeyVar.add(new String(bArr, iZzj15, i30, zzez.zzb));
                            iZzj15 = i31;
                        }
                    }
                    return iZzj15;
                }
                return i;
            case 27:
                if (i13 == 2) {
                    return zzdt.zze(zzy(i14), i11, bArr, i, i10, zzeyVar, zzdsVar);
                }
                return i;
            case 28:
                if (i13 == 2) {
                    int iZzj17 = zzdt.zzj(bArr, i, zzdsVar);
                    int i32 = zzdsVar.zza;
                    if (i32 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i32 > bArr.length - iZzj17) {
                        throw zzfa.zzf();
                    }
                    if (i32 == 0) {
                        zzeyVar.add(zzee.zzb);
                    } else {
                        zzeyVar.add(zzee.zzk(bArr, iZzj17, i32));
                        iZzj17 += i32;
                    }
                    while (iZzj17 < i10) {
                        int iZzj18 = zzdt.zzj(bArr, iZzj17, zzdsVar);
                        if (i11 != zzdsVar.zza) {
                            return iZzj17;
                        }
                        iZzj17 = zzdt.zzj(bArr, iZzj18, zzdsVar);
                        int i33 = zzdsVar.zza;
                        if (i33 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i33 > bArr.length - iZzj17) {
                            throw zzfa.zzf();
                        }
                        if (i33 == 0) {
                            zzeyVar.add(zzee.zzb);
                        } else {
                            zzeyVar.add(zzee.zzk(bArr, iZzj17, i33));
                            iZzj17 += i33;
                        }
                    }
                    return iZzj17;
                }
                return i;
            case 30:
            case 44:
                if (i13 != 2) {
                    if (i13 == 0) {
                        iZzl = zzdt.zzl(i11, bArr, i, i10, zzeyVar, zzdsVar);
                    }
                    return i;
                }
                iZzl = zzdt.zzf(bArr, i, zzeyVar, zzdsVar);
                zzeu zzeuVar = (zzeu) obj;
                zzgz zzgzVar = zzeuVar.zzc;
                if (zzgzVar == zzgz.zza()) {
                    zzgzVar = null;
                }
                Object objZzd = zzgj.zzd(i12, zzeyVar, zzx(i14), zzgzVar, this.zzm);
                if (objZzd == null) {
                    return iZzl;
                }
                zzeuVar.zzc = (zzgz) objZzd;
                return iZzl;
            case 33:
            case 47:
                if (i13 == 2) {
                    zzev zzevVar3 = (zzev) zzeyVar;
                    int iZzj19 = zzdt.zzj(bArr, i, zzdsVar);
                    int i34 = zzdsVar.zza + iZzj19;
                    while (iZzj19 < i34) {
                        iZzj19 = zzdt.zzj(bArr, iZzj19, zzdsVar);
                        zzevVar3.zze(zzei.zzb(zzdsVar.zza));
                    }
                    if (iZzj19 == i34) {
                        return iZzj19;
                    }
                    throw zzfa.zzf();
                }
                if (i13 == 0) {
                    zzev zzevVar4 = (zzev) zzeyVar;
                    int iZzj20 = zzdt.zzj(bArr, i, zzdsVar);
                    zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    while (iZzj20 < i10) {
                        int iZzj21 = zzdt.zzj(bArr, iZzj20, zzdsVar);
                        if (i11 != zzdsVar.zza) {
                            return iZzj20;
                        }
                        iZzj20 = zzdt.zzj(bArr, iZzj21, zzdsVar);
                        zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    }
                    return iZzj20;
                }
                return i;
            case 34:
            case 48:
                if (i13 == 2) {
                    zzfl zzflVar5 = (zzfl) zzeyVar;
                    int iZzj22 = zzdt.zzj(bArr, i, zzdsVar);
                    int i35 = zzdsVar.zza + iZzj22;
                    while (iZzj22 < i35) {
                        iZzj22 = zzdt.zzm(bArr, iZzj22, zzdsVar);
                        zzflVar5.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    if (iZzj22 == i35) {
                        return iZzj22;
                    }
                    throw zzfa.zzf();
                }
                if (i13 == 0) {
                    zzfl zzflVar6 = (zzfl) zzeyVar;
                    int iZzm3 = zzdt.zzm(bArr, i, zzdsVar);
                    zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    while (iZzm3 < i10) {
                        int iZzj23 = zzdt.zzj(bArr, iZzm3, zzdsVar);
                        if (i11 != zzdsVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzdt.zzm(bArr, iZzj23, zzdsVar);
                        zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    return iZzm3;
                }
                return i;
            default:
                if (i13 == 3) {
                    zzgh zzghVarZzy = zzy(i14);
                    int i36 = (i11 & (-8)) | 4;
                    int iZzc = zzdt.zzc(zzghVarZzy, bArr, i, i10, i36, zzdsVar);
                    zzgh zzghVar = zzghVarZzy;
                    zzds zzdsVar2 = zzdsVar;
                    zzeyVar.add(zzdsVar2.zzc);
                    while (iZzc < i10) {
                        int iZzj24 = zzdt.zzj(bArr, iZzc, zzdsVar2);
                        if (i11 != zzdsVar2.zza) {
                            return iZzc;
                        }
                        zzgh zzghVar2 = zzghVar;
                        zzds zzdsVar3 = zzdsVar2;
                        iZzc = zzdt.zzc(zzghVar2, bArr, iZzj24, i10, i36, zzdsVar3);
                        zzeyVar.add(zzdsVar3.zzc);
                        zzghVar = zzghVar2;
                        zzdsVar2 = zzdsVar3;
                    }
                    return iZzc;
                }
                return i;
        }
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzt(i, 0);
    }

    private final int zzr(int i, int i10) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzt(i, i10);
    }

    private final int zzs(int i) {
        return this.zzc[i + 2];
    }

    private final int zzt(int i, int i10) {
        int length = (this.zzc.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = this.zzc[i12];
            if (i == i13) {
                return i12;
            }
            if (i < i13) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    private static int zzu(int i) {
        return (i >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    private final int zzv(int i) {
        return this.zzc[i + 1];
    }

    private static long zzw(Object obj, long j4) {
        return ((Long) zzhi.zzf(obj, j4)).longValue();
    }

    private final zzex zzx(int i) {
        int i10 = i / 3;
        return (zzex) this.zzd[i10 + i10 + 1];
    }

    private final zzgh zzy(int i) {
        int i10 = i / 3;
        int i11 = i10 + i10;
        zzgh zzghVar = (zzgh) this.zzd[i11];
        if (zzghVar != null) {
            return zzghVar;
        }
        zzgh zzghVarZzb = zzge.zza().zzb((Class) this.zzd[i11 + 1]);
        this.zzd[i11] = zzghVarZzb;
        return zzghVarZzb;
    }

    private final Object zzz(int i) {
        int i10 = i / 3;
        return this.zzd[i10 + i10];
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final int zza(Object obj) {
        int i;
        int iZzc;
        int i10;
        int iZzc2;
        int length = this.zzc.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iZzv = zzv(i12);
            int i13 = this.zzc[i12];
            long j4 = 1048575 & iZzv;
            int iHashCode = 37;
            switch (zzu(iZzv)) {
                case 0:
                    i = i11 * 53;
                    iZzc = zzez.zzc(Double.doubleToLongBits(zzhi.zza(obj, j4)));
                    i11 = iZzc + i;
                    break;
                case 1:
                    i = i11 * 53;
                    iZzc = Float.floatToIntBits(zzhi.zzb(obj, j4));
                    i11 = iZzc + i;
                    break;
                case 2:
                    i = i11 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j4));
                    i11 = iZzc + i;
                    break;
                case 3:
                    i = i11 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j4));
                    i11 = iZzc + i;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iZzc2 = zzhi.zzc(obj, j4);
                    i11 = i10 + iZzc2;
                    break;
                case 5:
                    i = i11 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j4));
                    i11 = iZzc + i;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iZzc2 = zzhi.zzc(obj, j4);
                    i11 = i10 + iZzc2;
                    break;
                case 7:
                    i = i11 * 53;
                    iZzc = zzez.zza(zzhi.zzt(obj, j4));
                    i11 = iZzc + i;
                    break;
                case 8:
                    i = i11 * 53;
                    iZzc = ((String) zzhi.zzf(obj, j4)).hashCode();
                    i11 = iZzc + i;
                    break;
                case 9:
                    Object objZzf = zzhi.zzf(obj, j4);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i = i11 * 53;
                    iZzc = zzhi.zzf(obj, j4).hashCode();
                    i11 = iZzc + i;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iZzc2 = zzhi.zzc(obj, j4);
                    i11 = i10 + iZzc2;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iZzc2 = zzhi.zzc(obj, j4);
                    i11 = i10 + iZzc2;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iZzc2 = zzhi.zzc(obj, j4);
                    i11 = i10 + iZzc2;
                    break;
                case 14:
                    i = i11 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j4));
                    i11 = iZzc + i;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iZzc2 = zzhi.zzc(obj, j4);
                    i11 = i10 + iZzc2;
                    break;
                case 16:
                    i = i11 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j4));
                    i11 = iZzc + i;
                    break;
                case 17:
                    Object objZzf2 = zzhi.zzf(obj, j4);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i11 * 53;
                    iZzc = zzhi.zzf(obj, j4).hashCode();
                    i11 = iZzc + i;
                    break;
                case 50:
                    i = i11 * 53;
                    iZzc = zzhi.zzf(obj, j4).hashCode();
                    i11 = iZzc + i;
                    break;
                case 51:
                    if (zzJ(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzez.zzc(Double.doubleToLongBits(((Double) zzhi.zzf(obj, j4)).doubleValue()));
                        i11 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzJ(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = Float.floatToIntBits(((Float) zzhi.zzf(obj, j4)).floatValue());
                        i11 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzJ(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzez.zzc(zzw(obj, j4));
                        i11 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzJ(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzez.zzc(zzw(obj, j4));
                        i11 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc2 = zzl(obj, j4);
                        i11 = i10 + iZzc2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzJ(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzez.zzc(zzw(obj, j4));
                        i11 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc2 = zzl(obj, j4);
                        i11 = i10 + iZzc2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzJ(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzez.zza(((Boolean) zzhi.zzf(obj, j4)).booleanValue());
                        i11 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzJ(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = ((String) zzhi.zzf(obj, j4)).hashCode();
                        i11 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzJ(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzhi.zzf(obj, j4).hashCode();
                        i11 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzJ(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzhi.zzf(obj, j4).hashCode();
                        i11 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc2 = zzl(obj, j4);
                        i11 = i10 + iZzc2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc2 = zzl(obj, j4);
                        i11 = i10 + iZzc2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc2 = zzl(obj, j4);
                        i11 = i10 + iZzc2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzJ(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzez.zzc(zzw(obj, j4));
                        i11 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc2 = zzl(obj, j4);
                        i11 = i10 + iZzc2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzJ(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzez.zzc(zzw(obj, j4));
                        i11 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzJ(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzhi.zzf(obj, j4).hashCode();
                        i11 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this.zzm.zza(obj).hashCode() + (i11 * 53);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0088. Please report as an issue. */
    public final int zzb(Object obj, byte[] bArr, int i, int i10, int i11, zzds zzdsVar) throws IOException {
        int i12;
        zzfz<T> zzfzVar;
        Unsafe unsafe;
        int i13;
        Object obj2;
        int i14;
        int i15;
        int i16;
        int i17;
        byte[] bArr2;
        int i18;
        Unsafe unsafe2;
        int i19;
        zzds zzdsVar2;
        int iZzj;
        int i20;
        int i21;
        zzds zzdsVar3;
        int i22;
        Object obj3;
        Unsafe unsafe3;
        byte[] bArr3;
        zzds zzdsVar4;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        zzfz<T> zzfzVar2 = this;
        Object obj4 = obj;
        byte[] bArr4 = bArr;
        int i28 = i10;
        zzds zzdsVar5 = zzdsVar;
        Unsafe unsafe4 = zzb;
        int i29 = -1;
        int i30 = i;
        int i31 = -1;
        int i32 = 0;
        int i33 = 0;
        int iZzr = 0;
        int i34 = 1048575;
        while (true) {
            if (i30 < i28) {
                int iZzk = i30 + 1;
                int i35 = bArr4[i30];
                if (i35 < 0) {
                    iZzk = zzdt.zzk(i35, bArr4, iZzk, zzdsVar5);
                    i35 = zzdsVar5.zza;
                }
                int i36 = i35;
                int i37 = iZzk;
                int i38 = i36 >>> 3;
                int i39 = i36 & 7;
                iZzr = i38 > i31 ? zzfzVar2.zzr(i38, iZzr / 3) : zzfzVar2.zzq(i38);
                if (iZzr == i29) {
                    i12 = i11;
                    zzfzVar = zzfzVar2;
                    i14 = i37;
                    i15 = i38;
                    unsafe = unsafe4;
                    i16 = i29;
                    i32 = i36;
                    iZzr = 0;
                    i13 = 1048575;
                    obj2 = obj4;
                } else {
                    int[] iArr = zzfzVar2.zzc;
                    int i40 = iArr[iZzr + 1];
                    int iZzu = zzu(i40);
                    int i41 = i36;
                    long j4 = i40 & 1048575;
                    if (iZzu <= 17) {
                        int i42 = iArr[iZzr + 2];
                        int i43 = 1 << (i42 >>> 20);
                        int i44 = i42 & 1048575;
                        if (i44 != i34) {
                            i17 = 1048575;
                            if (i34 != 1048575) {
                                unsafe4.putInt(obj4, i34, i33);
                            }
                            i34 = i44;
                            i33 = unsafe4.getInt(obj4, i44);
                        } else {
                            i17 = 1048575;
                        }
                        switch (iZzu) {
                            case 0:
                                bArr3 = bArr;
                                i18 = i17;
                                zzdsVar4 = zzdsVar;
                                obj3 = obj4;
                                unsafe3 = unsafe4;
                                i19 = i37;
                                i15 = i38;
                                if (i39 == 1) {
                                    zzhi.zzl(obj3, j4, Double.longBitsToDouble(zzdt.zzn(bArr3, i19)));
                                    i30 = i19 + 8;
                                    i33 |= i43;
                                    i28 = i10;
                                    unsafe4 = unsafe3;
                                    bArr4 = bArr3;
                                    zzdsVar5 = zzdsVar4;
                                    obj4 = obj3;
                                    i32 = i41;
                                    i31 = i15;
                                    i29 = -1;
                                    break;
                                } else {
                                    i12 = i11;
                                    zzfzVar = zzfzVar2;
                                    i14 = i19;
                                    obj2 = obj3;
                                    i32 = i41;
                                    i13 = i18;
                                    i16 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                            case 1:
                                bArr3 = bArr;
                                i18 = i17;
                                zzdsVar4 = zzdsVar;
                                obj3 = obj4;
                                unsafe3 = unsafe4;
                                i19 = i37;
                                i15 = i38;
                                if (i39 == 5) {
                                    zzhi.zzm(obj3, j4, Float.intBitsToFloat(zzdt.zzb(bArr3, i19)));
                                    i30 = i19 + 4;
                                    i33 |= i43;
                                    i28 = i10;
                                    unsafe4 = unsafe3;
                                    bArr4 = bArr3;
                                    zzdsVar5 = zzdsVar4;
                                    obj4 = obj3;
                                    i32 = i41;
                                    i31 = i15;
                                    i29 = -1;
                                    break;
                                } else {
                                    i12 = i11;
                                    zzfzVar = zzfzVar2;
                                    i14 = i19;
                                    obj2 = obj3;
                                    i32 = i41;
                                    i13 = i18;
                                    i16 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                            case 2:
                            case 3:
                                bArr3 = bArr;
                                i18 = i17;
                                unsafe2 = unsafe4;
                                i19 = i37;
                                i15 = i38;
                                zzdsVar4 = zzdsVar;
                                if (i39 == 0) {
                                    int iZzm = zzdt.zzm(bArr3, i19, zzdsVar4);
                                    unsafe2.putLong(obj, j4, zzdsVar4.zzb);
                                    obj3 = obj;
                                    i33 |= i43;
                                    i28 = i10;
                                    unsafe4 = unsafe2;
                                    i30 = iZzm;
                                    bArr4 = bArr3;
                                    zzdsVar5 = zzdsVar4;
                                    obj4 = obj3;
                                    i32 = i41;
                                    i31 = i15;
                                    i29 = -1;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i12 = i11;
                                    zzfzVar = zzfzVar2;
                                    i14 = i19;
                                    obj2 = obj3;
                                    i32 = i41;
                                    i13 = i18;
                                    i16 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i18 = i17;
                                unsafe2 = unsafe4;
                                i19 = i37;
                                i15 = i38;
                                zzdsVar2 = zzdsVar;
                                if (i39 == 0) {
                                    iZzj = zzdt.zzj(bArr2, i19, zzdsVar2);
                                    unsafe2.putInt(obj4, j4, zzdsVar2.zza);
                                    i33 |= i43;
                                    i28 = i10;
                                    unsafe4 = unsafe2;
                                    zzdsVar5 = zzdsVar2;
                                    i32 = i41;
                                    i31 = i15;
                                    i29 = -1;
                                    i30 = iZzj;
                                    bArr4 = bArr2;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i12 = i11;
                                    zzfzVar = zzfzVar2;
                                    i14 = i19;
                                    obj2 = obj3;
                                    i32 = i41;
                                    i13 = i18;
                                    i16 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i18 = i17;
                                unsafe2 = unsafe4;
                                i15 = i38;
                                zzdsVar2 = zzdsVar;
                                if (i39 == 1) {
                                    Object obj5 = obj4;
                                    unsafe2.putLong(obj5, j4, zzdt.zzn(bArr2, i37));
                                    unsafe2 = unsafe2;
                                    obj4 = obj5;
                                    iZzj = i37 + 8;
                                    i33 |= i43;
                                    i28 = i10;
                                    unsafe4 = unsafe2;
                                    zzdsVar5 = zzdsVar2;
                                    i32 = i41;
                                    i31 = i15;
                                    i29 = -1;
                                    i30 = iZzj;
                                    bArr4 = bArr2;
                                    break;
                                } else {
                                    i19 = i37;
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i12 = i11;
                                    zzfzVar = zzfzVar2;
                                    i14 = i19;
                                    obj2 = obj3;
                                    i32 = i41;
                                    i13 = i18;
                                    i16 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i18 = i17;
                                unsafe2 = unsafe4;
                                i20 = i37;
                                i15 = i38;
                                zzdsVar2 = zzdsVar;
                                if (i39 == 5) {
                                    unsafe2.putInt(obj4, j4, zzdt.zzb(bArr2, i20));
                                    iZzj = i20 + 4;
                                    i33 |= i43;
                                    i28 = i10;
                                    unsafe4 = unsafe2;
                                    zzdsVar5 = zzdsVar2;
                                    i32 = i41;
                                    i31 = i15;
                                    i29 = -1;
                                    i30 = iZzj;
                                    bArr4 = bArr2;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i19 = i20;
                                    i12 = i11;
                                    zzfzVar = zzfzVar2;
                                    i14 = i19;
                                    obj2 = obj3;
                                    i32 = i41;
                                    i13 = i18;
                                    i16 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                            case 7:
                                bArr2 = bArr;
                                i18 = i17;
                                unsafe2 = unsafe4;
                                i20 = i37;
                                i15 = i38;
                                zzdsVar2 = zzdsVar;
                                if (i39 == 0) {
                                    iZzj = zzdt.zzm(bArr2, i20, zzdsVar2);
                                    i41 = i41;
                                    zzhi.zzk(obj4, j4, zzdsVar2.zzb != 0);
                                    i33 |= i43;
                                    i28 = i10;
                                    unsafe4 = unsafe2;
                                    zzdsVar5 = zzdsVar2;
                                    i32 = i41;
                                    i31 = i15;
                                    i29 = -1;
                                    i30 = iZzj;
                                    bArr4 = bArr2;
                                    break;
                                } else {
                                    i41 = i41;
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i19 = i20;
                                    i12 = i11;
                                    zzfzVar = zzfzVar2;
                                    i14 = i19;
                                    obj2 = obj3;
                                    i32 = i41;
                                    i13 = i18;
                                    i16 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                            case 8:
                                bArr2 = bArr;
                                i18 = i17;
                                unsafe2 = unsafe4;
                                i21 = i41;
                                i20 = i37;
                                i15 = i38;
                                zzdsVar3 = zzdsVar;
                                if (i39 == 2) {
                                    iZzj = (536870912 & i40) == 0 ? zzdt.zzg(bArr2, i20, zzdsVar3) : zzdt.zzh(bArr2, i20, zzdsVar3);
                                    unsafe2.putObject(obj4, j4, zzdsVar3.zzc);
                                    i33 |= i43;
                                    i28 = i10;
                                    i32 = i21;
                                    zzdsVar5 = zzdsVar3;
                                    i31 = i15;
                                    i29 = -1;
                                    unsafe4 = unsafe2;
                                    i30 = iZzj;
                                    bArr4 = bArr2;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i41 = i21;
                                    i19 = i20;
                                    i12 = i11;
                                    zzfzVar = zzfzVar2;
                                    i14 = i19;
                                    obj2 = obj3;
                                    i32 = i41;
                                    i13 = i18;
                                    i16 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                            case 9:
                                bArr2 = bArr;
                                i22 = i10;
                                i18 = i17;
                                unsafe2 = unsafe4;
                                i21 = i41;
                                i20 = i37;
                                i15 = i38;
                                zzdsVar3 = zzdsVar;
                                if (i39 == 2) {
                                    iZzj = zzdt.zzd(zzfzVar2.zzy(iZzr), bArr2, i20, i22, zzdsVar3);
                                    if ((i33 & i43) == 0) {
                                        unsafe2.putObject(obj4, j4, zzdsVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj4, j4, zzez.zzg(unsafe2.getObject(obj4, j4), zzdsVar3.zzc));
                                    }
                                    i33 |= i43;
                                    i32 = i21;
                                    i28 = i22;
                                    zzdsVar5 = zzdsVar3;
                                    i31 = i15;
                                    i29 = -1;
                                    unsafe4 = unsafe2;
                                    i30 = iZzj;
                                    bArr4 = bArr2;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i41 = i21;
                                    i19 = i20;
                                    i12 = i11;
                                    zzfzVar = zzfzVar2;
                                    i14 = i19;
                                    obj2 = obj3;
                                    i32 = i41;
                                    i13 = i18;
                                    i16 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                            case 10:
                                bArr2 = bArr;
                                i22 = i10;
                                i18 = i17;
                                unsafe2 = unsafe4;
                                i21 = i41;
                                i20 = i37;
                                i15 = i38;
                                zzdsVar3 = zzdsVar;
                                if (i39 == 2) {
                                    iZzj = zzdt.zza(bArr2, i20, zzdsVar3);
                                    unsafe2.putObject(obj4, j4, zzdsVar3.zzc);
                                    i33 |= i43;
                                    i32 = i21;
                                    i28 = i22;
                                    zzdsVar5 = zzdsVar3;
                                    i31 = i15;
                                    i29 = -1;
                                    unsafe4 = unsafe2;
                                    i30 = iZzj;
                                    bArr4 = bArr2;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i41 = i21;
                                    i19 = i20;
                                    i12 = i11;
                                    zzfzVar = zzfzVar2;
                                    i14 = i19;
                                    obj2 = obj3;
                                    i32 = i41;
                                    i13 = i18;
                                    i16 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                            case 12:
                                bArr2 = bArr;
                                i22 = i10;
                                i18 = i17;
                                unsafe2 = unsafe4;
                                i20 = i37;
                                i15 = i38;
                                zzdsVar3 = zzdsVar;
                                if (i39 != 0) {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i19 = i20;
                                    i12 = i11;
                                    zzfzVar = zzfzVar2;
                                    i14 = i19;
                                    obj2 = obj3;
                                    i32 = i41;
                                    i13 = i18;
                                    i16 = -1;
                                    unsafe = unsafe3;
                                    break;
                                } else {
                                    iZzj = zzdt.zzj(bArr2, i20, zzdsVar3);
                                    int i45 = zzdsVar3.zza;
                                    zzex zzexVarZzx = zzfzVar2.zzx(iZzr);
                                    if (zzexVarZzx == null || zzexVarZzx.zza()) {
                                        i21 = i41;
                                        unsafe2.putInt(obj4, j4, i45);
                                        i33 |= i43;
                                        i32 = i21;
                                        i28 = i22;
                                        zzdsVar5 = zzdsVar3;
                                        i31 = i15;
                                        i29 = -1;
                                        unsafe4 = unsafe2;
                                        i30 = iZzj;
                                        bArr4 = bArr2;
                                        break;
                                    } else {
                                        i21 = i41;
                                        zzc(obj4).zzf(i21, Long.valueOf(i45));
                                        i32 = i21;
                                        i28 = i22;
                                        zzdsVar5 = zzdsVar3;
                                        i31 = i15;
                                        i29 = -1;
                                        unsafe4 = unsafe2;
                                        i30 = iZzj;
                                        bArr4 = bArr2;
                                    }
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i18 = i17;
                                unsafe2 = unsafe4;
                                i20 = i37;
                                i15 = i38;
                                zzdsVar2 = zzdsVar;
                                if (i39 == 0) {
                                    iZzj = zzdt.zzj(bArr2, i20, zzdsVar2);
                                    unsafe2.putInt(obj4, j4, zzei.zzb(zzdsVar2.zza));
                                    i33 |= i43;
                                    unsafe4 = unsafe2;
                                    i28 = i10;
                                    zzdsVar5 = zzdsVar2;
                                    i32 = i41;
                                    i31 = i15;
                                    i29 = -1;
                                    i30 = iZzj;
                                    bArr4 = bArr2;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i19 = i20;
                                    i12 = i11;
                                    zzfzVar = zzfzVar2;
                                    i14 = i19;
                                    obj2 = obj3;
                                    i32 = i41;
                                    i13 = i18;
                                    i16 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                            case 16:
                                i18 = i17;
                                i20 = i37;
                                i15 = i38;
                                if (i39 == 0) {
                                    int iZzm2 = zzdt.zzm(bArr, i20, zzdsVar);
                                    Object obj6 = obj4;
                                    Unsafe unsafe5 = unsafe4;
                                    unsafe5.putLong(obj6, j4, zzei.zzc(zzdsVar.zzb));
                                    obj4 = obj6;
                                    i33 |= i43;
                                    unsafe4 = unsafe5;
                                    i30 = iZzm2;
                                    bArr4 = bArr;
                                    i28 = i10;
                                    zzdsVar5 = zzdsVar;
                                    i32 = i41;
                                    i31 = i15;
                                    i29 = -1;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe4;
                                    i19 = i20;
                                    i12 = i11;
                                    zzfzVar = zzfzVar2;
                                    i14 = i19;
                                    obj2 = obj3;
                                    i32 = i41;
                                    i13 = i18;
                                    i16 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                            default:
                                if (i39 == 3) {
                                    i15 = i38;
                                    iZzj = zzdt.zzc(zzfzVar2.zzy(iZzr), bArr, i37, i10, (i38 << 3) | 4, zzdsVar);
                                    bArr2 = bArr;
                                    if ((i33 & i43) == 0) {
                                        unsafe4.putObject(obj4, j4, zzdsVar.zzc);
                                    } else {
                                        unsafe4.putObject(obj4, j4, zzez.zzg(unsafe4.getObject(obj4, j4), zzdsVar.zzc));
                                    }
                                    i33 |= i43;
                                    zzdsVar5 = zzdsVar;
                                    i28 = i10;
                                    i32 = i41;
                                    i31 = i15;
                                    i29 = -1;
                                    i30 = iZzj;
                                    bArr4 = bArr2;
                                    break;
                                } else {
                                    i18 = i17;
                                    i20 = i37;
                                    i15 = i38;
                                    obj3 = obj4;
                                    unsafe3 = unsafe4;
                                    i19 = i20;
                                    i12 = i11;
                                    zzfzVar = zzfzVar2;
                                    i14 = i19;
                                    obj2 = obj3;
                                    i32 = i41;
                                    i13 = i18;
                                    i16 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                        }
                    } else {
                        obj3 = obj4;
                        Unsafe unsafe6 = unsafe4;
                        i15 = i38;
                        if (iZzu == 27) {
                            if (i39 == 2) {
                                zzey zzeyVarZzd = (zzey) unsafe6.getObject(obj3, j4);
                                if (!zzeyVarZzd.zzc()) {
                                    int size = zzeyVarZzd.size();
                                    zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
                                    unsafe6.putObject(obj3, j4, zzeyVarZzd);
                                }
                                unsafe4 = unsafe6;
                                int iZze = zzdt.zze(zzfzVar2.zzy(iZzr), i41, bArr, i37, i10, zzeyVarZzd, zzdsVar);
                                bArr4 = bArr;
                                i28 = i10;
                                zzdsVar5 = zzdsVar;
                                i30 = iZze;
                                obj4 = obj3;
                                i32 = i41;
                                i31 = i15;
                                i29 = -1;
                            } else {
                                i23 = i37;
                                i24 = i34;
                                i25 = i33;
                                i26 = iZzr;
                                i27 = i41;
                                i13 = 1048575;
                                i16 = -1;
                                unsafe = unsafe6;
                            }
                        } else if (iZzu <= 49) {
                            int i46 = i34;
                            i25 = i33;
                            i13 = 1048575;
                            i16 = -1;
                            unsafe = unsafe6;
                            int iZzp = zzfzVar2.zzp(obj3, bArr, i37, i10, i41, i15, i39, iZzr, i40, iZzu, j4, zzdsVar);
                            i26 = iZzr;
                            if (iZzp != i37) {
                                zzfzVar2 = this;
                                obj4 = obj;
                                bArr4 = bArr;
                                i34 = i46;
                                i28 = i10;
                                i30 = iZzp;
                                i32 = i41;
                                iZzr = i26;
                                i33 = i25;
                                unsafe4 = unsafe;
                                i29 = i16;
                                i31 = i15;
                                zzdsVar5 = zzdsVar;
                            } else {
                                zzfzVar = this;
                                obj2 = obj;
                                i34 = i46;
                                i14 = iZzp;
                                i32 = i41;
                                iZzr = i26;
                                i33 = i25;
                                i12 = i11;
                            }
                        } else {
                            i23 = i37;
                            i24 = i34;
                            i25 = i33;
                            i26 = iZzr;
                            i13 = 1048575;
                            i16 = -1;
                            i27 = i41;
                            unsafe = unsafe6;
                            if (iZzu != 50) {
                                i32 = i27;
                                int iZzn = zzn(obj, bArr, i23, i10, i32, i15, i39, i40, iZzu, j4, i26, zzdsVar);
                                obj2 = obj;
                                zzfzVar = this;
                                if (iZzn != i23) {
                                    bArr4 = bArr;
                                    i34 = i24;
                                    i28 = i10;
                                    zzfzVar2 = zzfzVar;
                                    i30 = iZzn;
                                    obj4 = obj2;
                                    iZzr = i26;
                                    i33 = i25;
                                    unsafe4 = unsafe;
                                    i29 = i16;
                                    i31 = i15;
                                    zzdsVar5 = zzdsVar;
                                } else {
                                    i34 = i24;
                                    i14 = iZzn;
                                    iZzr = i26;
                                    i33 = i25;
                                    i12 = i11;
                                }
                            } else if (i39 == 2) {
                                int iZzm3 = zzm(obj, bArr, i23, i10, i26, j4, zzdsVar);
                                if (iZzm3 != i23) {
                                    zzfzVar2 = this;
                                    obj4 = obj;
                                    bArr4 = bArr;
                                    i34 = i24;
                                    i28 = i10;
                                    zzdsVar5 = zzdsVar;
                                    i30 = iZzm3;
                                    i32 = i27;
                                    iZzr = i26;
                                    i33 = i25;
                                    unsafe4 = unsafe;
                                    i29 = -1;
                                    i31 = i15;
                                } else {
                                    obj2 = obj;
                                    i34 = i24;
                                    i12 = i11;
                                    i14 = iZzm3;
                                    i32 = i27;
                                    iZzr = i26;
                                    i33 = i25;
                                    zzfzVar = this;
                                }
                            }
                        }
                        zzfzVar = this;
                        obj2 = obj;
                        i34 = i24;
                        i12 = i11;
                        i14 = i23;
                        i32 = i27;
                        iZzr = i26;
                        i33 = i25;
                    }
                }
                if (i32 != i12 || i12 == 0) {
                    int i47 = i32;
                    int iZzi = zzdt.zzi(i47, bArr, i14, i10, zzc(obj2), zzdsVar);
                    i32 = i47;
                    zzdsVar5 = zzdsVar;
                    i28 = i10;
                    zzfzVar2 = zzfzVar;
                    obj4 = obj2;
                    unsafe4 = unsafe;
                    i29 = i16;
                    i31 = i15;
                    i30 = iZzi;
                    bArr4 = bArr;
                } else {
                    i28 = i10;
                    i30 = i14;
                }
            } else {
                i12 = i11;
                zzfzVar = zzfzVar2;
                unsafe = unsafe4;
                i13 = 1048575;
                obj2 = obj4;
            }
        }
        if (i34 != i13) {
            unsafe.putInt(obj2, i34, i33);
        }
        for (int i48 = zzfzVar.zzj; i48 < zzfzVar.zzk; i48++) {
            int i49 = zzfzVar.zzi[i48];
            int i50 = zzfzVar.zzc[i49];
            Object objZzf = zzhi.zzf(obj2, zzfzVar.zzv(i49) & i13);
            if (objZzf != null && zzfzVar.zzx(i49) != null) {
                throw null;
            }
        }
        if (i12 == 0) {
            if (i30 != i28) {
                throw zzfa.zzd();
            }
        } else if (i30 > i28 || i32 != i12) {
            throw zzfa.zzd();
        }
        return i30;
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final Object zzd() {
        return ((zzeu) this.zzg).zzi(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zze(Object obj) {
        int i;
        int i10 = this.zzj;
        while (true) {
            i = this.zzk;
            if (i10 >= i) {
                break;
            }
            long jZzv = zzv(this.zzi[i10]) & 1048575;
            Object objZzf = zzhi.zzf(obj, jZzv);
            if (objZzf != null) {
                ((zzfq) objZzf).zzc();
                zzhi.zzp(obj, jZzv, objZzf);
            }
            i10++;
        }
        int length = this.zzi.length;
        while (i < length) {
            this.zzl.zza(obj, this.zzi[i]);
            i++;
        }
        this.zzm.zze(obj);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzf(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzv = zzv(i);
            long j4 = 1048575 & iZzv;
            int i10 = this.zzc[i];
            switch (zzu(iZzv)) {
                case 0:
                    if (zzG(obj2, i)) {
                        zzhi.zzl(obj, j4, zzhi.zza(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzG(obj2, i)) {
                        zzhi.zzm(obj, j4, zzhi.zzb(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j4, zzhi.zzd(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j4, zzhi.zzd(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j4, zzhi.zzc(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j4, zzhi.zzd(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j4, zzhi.zzc(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzG(obj2, i)) {
                        zzhi.zzk(obj, j4, zzhi.zzt(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzG(obj2, i)) {
                        zzhi.zzp(obj, j4, zzhi.zzf(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzG(obj2, i)) {
                        zzhi.zzp(obj, j4, zzhi.zzf(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j4, zzhi.zzc(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j4, zzhi.zzc(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j4, zzhi.zzc(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j4, zzhi.zzd(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j4, zzhi.zzc(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j4, zzhi.zzd(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzl.zzb(obj, obj2, j4);
                    break;
                case 50:
                    zzgj.zzi(this.zzp, obj, obj2, j4);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzJ(obj2, i10, i)) {
                        zzhi.zzp(obj, j4, zzhi.zzf(obj2, j4));
                        zzE(obj, i10, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzC(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzJ(obj2, i10, i)) {
                        zzhi.zzp(obj, j4, zzhi.zzf(obj2, j4));
                        zzE(obj, i10, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zzgj.zzf(this.zzm, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzg(Object obj, byte[] bArr, int i, int i10, zzds zzdsVar) throws IOException {
        if (this.zzh) {
            zzo(obj, bArr, i, i10, zzdsVar);
        } else {
            zzb(obj, bArr, i, i10, 0, zzdsVar);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzh(Object obj, Object obj2) {
        boolean zZzh;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzv = zzv(i);
            long j4 = iZzv & 1048575;
            switch (zzu(iZzv)) {
                case 0:
                    if (!zzF(obj, obj2, i) || Double.doubleToLongBits(zzhi.zza(obj, j4)) != Double.doubleToLongBits(zzhi.zza(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzF(obj, obj2, i) || Float.floatToIntBits(zzhi.zzb(obj, j4)) != Float.floatToIntBits(zzhi.zzb(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j4) != zzhi.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j4) != zzhi.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j4) != zzhi.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j4) != zzhi.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j4) != zzhi.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzF(obj, obj2, i) || zzhi.zzt(obj, j4) != zzhi.zzt(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j4), zzhi.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j4), zzhi.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j4), zzhi.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j4) != zzhi.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j4) != zzhi.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j4) != zzhi.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j4) != zzhi.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j4) != zzhi.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j4) != zzhi.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j4), zzhi.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzh = zzgj.zzh(zzhi.zzf(obj, j4), zzhi.zzf(obj2, j4));
                    break;
                case 50:
                    zZzh = zzgj.zzh(zzhi.zzf(obj, j4), zzhi.zzf(obj2, j4));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzs = zzs(i) & 1048575;
                    if (zzhi.zzc(obj, jZzs) != zzhi.zzc(obj2, jZzs) || !zzgj.zzh(zzhi.zzf(obj, j4), zzhi.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzh) {
                return false;
            }
        }
        return this.zzm.zza(obj).equals(this.zzm.zza(obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // com.google.android.gms.internal.auth.zzgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzi(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 0
            r3 = r0
            r2 = r1
            r4 = r2
        L7:
            int r5 = r14.zzj
            r6 = 1
            if (r2 >= r5) goto Lcd
            int[] r5 = r14.zzi
            r9 = r5[r2]
            int[] r5 = r14.zzc
            r5 = r5[r9]
            int r13 = r14.zzv(r9)
            int[] r7 = r14.zzc
            int r8 = r9 + 2
            r7 = r7[r8]
            r8 = r7 & r0
            int r7 = r7 >>> 20
            int r12 = r6 << r7
            if (r8 == r3) goto L32
            if (r8 == r0) goto L2f
            sun.misc.Unsafe r3 = com.google.android.gms.internal.auth.zzfz.zzb
            long r6 = (long) r8
            int r4 = r3.getInt(r15, r6)
        L2f:
            r11 = r4
            r10 = r8
            goto L34
        L32:
            r10 = r3
            r11 = r4
        L34:
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r3 = r3 & r13
            r7 = r14
            r8 = r15
            if (r3 == 0) goto L43
            boolean r15 = r7.zzH(r8, r9, r10, r11, r12)
            if (r15 == 0) goto L42
            goto L43
        L42:
            return r1
        L43:
            int r15 = zzu(r13)
            r3 = 9
            if (r15 == r3) goto Lb5
            r3 = 17
            if (r15 == r3) goto Lb5
            r3 = 27
            if (r15 == r3) goto L8d
            r3 = 60
            if (r15 == r3) goto L7c
            r3 = 68
            if (r15 == r3) goto L7c
            r3 = 49
            if (r15 == r3) goto L8d
            r3 = 50
            if (r15 == r3) goto L64
            goto Lc6
        L64:
            r15 = r13 & r0
            long r3 = (long) r15
            java.lang.Object r15 = com.google.android.gms.internal.auth.zzhi.zzf(r8, r3)
            com.google.android.gms.internal.auth.zzfq r15 = (com.google.android.gms.internal.auth.zzfq) r15
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L74
            goto Lc6
        L74:
            java.lang.Object r15 = r14.zzz(r9)
            com.google.android.gms.internal.auth.zzfp r15 = (com.google.android.gms.internal.auth.zzfp) r15
            r15 = 0
            throw r15
        L7c:
            boolean r15 = r14.zzJ(r8, r5, r9)
            if (r15 == 0) goto Lc6
            com.google.android.gms.internal.auth.zzgh r15 = r14.zzy(r9)
            boolean r15 = zzI(r8, r13, r15)
            if (r15 != 0) goto Lc6
            return r1
        L8d:
            r15 = r13 & r0
            long r3 = (long) r15
            java.lang.Object r15 = com.google.android.gms.internal.auth.zzhi.zzf(r8, r3)
            java.util.List r15 = (java.util.List) r15
            boolean r3 = r15.isEmpty()
            if (r3 != 0) goto Lc6
            com.google.android.gms.internal.auth.zzgh r3 = r14.zzy(r9)
            r4 = r1
        La1:
            int r5 = r15.size()
            if (r4 >= r5) goto Lc6
            java.lang.Object r5 = r15.get(r4)
            boolean r5 = r3.zzi(r5)
            if (r5 != 0) goto Lb2
            return r1
        Lb2:
            int r4 = r4 + 1
            goto La1
        Lb5:
            boolean r15 = r7.zzH(r8, r9, r10, r11, r12)
            if (r15 == 0) goto Lc6
            com.google.android.gms.internal.auth.zzgh r15 = r14.zzy(r9)
            boolean r15 = zzI(r8, r13, r15)
            if (r15 != 0) goto Lc6
            return r1
        Lc6:
            int r2 = r2 + 1
            r15 = r8
            r3 = r10
            r4 = r11
            goto L7
        Lcd:
            r7 = r14
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzi(java.lang.Object):boolean");
    }
}
