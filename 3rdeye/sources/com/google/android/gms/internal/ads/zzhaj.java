package com.google.android.gms.internal.ads;

import j6.l;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzhaj<T> implements zzhaz<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhbs.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhag zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzhbl zzm;
    private final zzgyg zzn;

    private zzhaj(int[] iArr, Object[] objArr, int i, int i10, zzhag zzhagVar, boolean z10, int[] iArr2, int i11, int i12, zzham zzhamVar, zzgzt zzgztVar, zzhbl zzhblVar, zzgyg zzgygVar, zzhab zzhabVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i10;
        this.zzi = zzhagVar instanceof zzgyv;
        boolean z11 = false;
        if (zzgygVar != null && (zzhagVar instanceof zzgyr)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i11;
        this.zzl = i12;
        this.zzm = zzhblVar;
        this.zzn = zzgygVar;
        this.zzg = zzhagVar;
    }

    private final Object zzA(Object obj, int i) {
        zzhaz zzhazVarZzx = zzx(i);
        int iZzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzhazVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzhazVarZzx.zze();
        if (object != null) {
            zzhazVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i, int i10) {
        zzhaz zzhazVarZzx = zzx(i10);
        if (!zzR(obj, i, i10)) {
            return zzhazVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i10) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzhazVarZzx.zze();
        if (object != null) {
            zzhazVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e4) {
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
            throw new RuntimeException(sbD.toString(), e4);
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j4 = iZzu;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzhaz zzhazVarZzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    Object objZze = zzhazVarZzx.zze();
                    zzhazVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j4, objZze);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzQ(object2)) {
                Object objZze2 = zzhazVarZzx.zze();
                zzhazVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j4, objZze2);
                object2 = objZze2;
            }
            zzhazVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i10 = iArr[i];
        if (zzR(obj2, i10, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j4 = iZzu;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            zzhaz zzhazVarZzx = zzx(i);
            if (!zzR(obj, i10, i)) {
                if (zzQ(object)) {
                    Object objZze = zzhazVarZzx.zze();
                    zzhazVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j4, objZze);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                zzI(obj, i10, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzQ(object2)) {
                Object objZze2 = zzhazVarZzx.zze();
                zzhazVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j4, objZze2);
                object2 = objZze2;
            }
            zzhazVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i, zzhat zzhatVar) throws IOException {
        long j4 = i & 1048575;
        if (zzM(i)) {
            zzhbs.zzv(obj, j4, zzhatVar.zzs());
        } else if (this.zzi) {
            zzhbs.zzv(obj, j4, zzhatVar.zzr());
        } else {
            zzhbs.zzv(obj, j4, zzhatVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int iZzr = zzr(i);
        long j4 = 1048575 & iZzr;
        if (j4 == 1048575) {
            return;
        }
        zzhbs.zzt(obj, j4, (1 << (iZzr >>> 20)) | zzhbs.zzd(obj, j4));
    }

    private final void zzI(Object obj, int i, int i10) {
        zzhbs.zzt(obj, zzr(i10) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i10, Object obj2) {
        zzb.putObject(obj, zzu(i10) & 1048575, obj2);
        zzI(obj, i, i10);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int iZzr = zzr(i);
        long j4 = iZzr & 1048575;
        if (j4 != 1048575) {
            return (zzhbs.zzd(obj, j4) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i);
        long j10 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzhbs.zzb(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhbs.zzc(obj, j10)) != 0;
            case 2:
                return zzhbs.zzf(obj, j10) != 0;
            case 3:
                return zzhbs.zzf(obj, j10) != 0;
            case 4:
                return zzhbs.zzd(obj, j10) != 0;
            case 5:
                return zzhbs.zzf(obj, j10) != 0;
            case 6:
                return zzhbs.zzd(obj, j10) != 0;
            case 7:
                return zzhbs.zzz(obj, j10);
            case 8:
                Object objZzh = zzhbs.zzh(obj, j10);
                if (objZzh instanceof String) {
                    return !((String) objZzh).isEmpty();
                }
                if (objZzh instanceof zzgxn) {
                    return !zzgxn.zzb.equals(objZzh);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhbs.zzh(obj, j10) != null;
            case 10:
                return !zzgxn.zzb.equals(zzhbs.zzh(obj, j10));
            case 11:
                return zzhbs.zzd(obj, j10) != 0;
            case 12:
                return zzhbs.zzd(obj, j10) != 0;
            case 13:
                return zzhbs.zzd(obj, j10) != 0;
            case 14:
                return zzhbs.zzf(obj, j10) != 0;
            case 15:
                return zzhbs.zzd(obj, j10) != 0;
            case 16:
                return zzhbs.zzf(obj, j10) != 0;
            case 17:
                return zzhbs.zzh(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i, int i10, int i11, int i12) {
        return i10 == 1048575 ? zzN(obj, i) : (i11 & i12) != 0;
    }

    private static boolean zzP(Object obj, int i, zzhaz zzhazVar) {
        return zzhazVar.zzl(zzhbs.zzh(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgyv) {
            return ((zzgyv) obj).zzcd();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i10) {
        return zzhbs.zzd(obj, (long) (zzr(i10) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j4) {
        return ((Boolean) zzhbs.zzh(obj, j4)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzhca zzhcaVar) throws IOException {
        if (obj instanceof String) {
            zzhcaVar.zzG(i, (String) obj);
        } else {
            zzhcaVar.zzd(i, (zzgxn) obj);
        }
    }

    public static zzhbm zzd(Object obj) {
        zzgyv zzgyvVar = (zzgyv) obj;
        zzhbm zzhbmVar = zzgyvVar.zzt;
        if (zzhbmVar != zzhbm.zzc()) {
            return zzhbmVar;
        }
        zzhbm zzhbmVarZzf = zzhbm.zzf();
        zzgyvVar.zzt = zzhbmVarZzf;
        return zzhbmVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzhaj zzm(java.lang.Class r31, com.google.android.gms.internal.ads.zzhad r32, com.google.android.gms.internal.ads.zzham r33, com.google.android.gms.internal.ads.zzgzt r34, com.google.android.gms.internal.ads.zzhbl r35, com.google.android.gms.internal.ads.zzgyg r36, com.google.android.gms.internal.ads.zzhab r37) {
        /*
            Method dump skipped, instructions count: 1043
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhaj.zzm(java.lang.Class, com.google.android.gms.internal.ads.zzhad, com.google.android.gms.internal.ads.zzham, com.google.android.gms.internal.ads.zzgzt, com.google.android.gms.internal.ads.zzhbl, com.google.android.gms.internal.ads.zzgyg, com.google.android.gms.internal.ads.zzhab):com.google.android.gms.internal.ads.zzhaj");
    }

    private static double zzn(Object obj, long j4) {
        return ((Double) zzhbs.zzh(obj, j4)).doubleValue();
    }

    private static float zzo(Object obj, long j4) {
        return ((Float) zzhbs.zzh(obj, j4)).floatValue();
    }

    private static int zzp(Object obj, long j4) {
        return ((Integer) zzhbs.zzh(obj, j4)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i10) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = iArr[i12];
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

    private static int zzt(int i) {
        return (i >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j4) {
        return ((Long) zzhbs.zzh(obj, j4)).longValue();
    }

    private final zzgzb zzw(int i) {
        int i10 = i / 3;
        return (zzgzb) this.zzd[i10 + i10 + 1];
    }

    private final zzhaz zzx(int i) {
        Object[] objArr = this.zzd;
        int i10 = i / 3;
        int i11 = i10 + i10;
        zzhaz zzhazVar = (zzhaz) objArr[i11];
        if (zzhazVar != null) {
            return zzhazVar;
        }
        zzhaz zzhazVarZzb = zzhaq.zza().zzb((Class) objArr[i11 + 1]);
        objArr[i11] = zzhazVarZzb;
        return zzhazVarZzb;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzhbl zzhblVar, Object obj3) {
        int i10 = this.zzc[i];
        Object objZzh = zzhbs.zzh(obj, zzu(i) & 1048575);
        if (objZzh == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i10 = i / 3;
        return this.zzd[i10 + i10];
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04d9  */
    @Override // com.google.android.gms.internal.ads.zzhaz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 2010
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhaj.zza(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i10;
        int iFloatToIntBits;
        int iZzd;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i12 >= iArr.length) {
                int iHashCode = ((zzgyv) obj).zzt.hashCode() + (i13 * 53);
                return this.zzh ? (iHashCode * 53) + ((zzgyr) obj).zza.zza.hashCode() : iHashCode;
            }
            int iZzu = zzu(i12);
            int i14 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i15 = iArr[i12];
            long j4 = i14;
            int iHashCode2 = 37;
            switch (iZzt) {
                case 0:
                    i = i13 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzhbs.zzb(obj, j4));
                    byte[] bArr = zzgzi.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i + iZzd;
                    break;
                case 1:
                    i10 = i13 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzhbs.zzc(obj, j4));
                    i13 = iFloatToIntBits + i10;
                    break;
                case 2:
                    i = i13 * 53;
                    jDoubleToLongBits = zzhbs.zzf(obj, j4);
                    byte[] bArr2 = zzgzi.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i + iZzd;
                    break;
                case 3:
                    i = i13 * 53;
                    jDoubleToLongBits = zzhbs.zzf(obj, j4);
                    byte[] bArr3 = zzgzi.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i + iZzd;
                    break;
                case 4:
                    i = i13 * 53;
                    iZzd = zzhbs.zzd(obj, j4);
                    i13 = i + iZzd;
                    break;
                case 5:
                    i = i13 * 53;
                    jDoubleToLongBits = zzhbs.zzf(obj, j4);
                    byte[] bArr4 = zzgzi.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i + iZzd;
                    break;
                case 6:
                    i = i13 * 53;
                    iZzd = zzhbs.zzd(obj, j4);
                    i13 = i + iZzd;
                    break;
                case 7:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzgzi.zza(zzhbs.zzz(obj, j4));
                    i13 = iFloatToIntBits + i10;
                    break;
                case 8:
                    i10 = i13 * 53;
                    iFloatToIntBits = ((String) zzhbs.zzh(obj, j4)).hashCode();
                    i13 = iFloatToIntBits + i10;
                    break;
                case 9:
                    i11 = i13 * 53;
                    Object objZzh = zzhbs.zzh(obj, j4);
                    if (objZzh != null) {
                        iHashCode2 = objZzh.hashCode();
                    }
                    i13 = i11 + iHashCode2;
                    break;
                case 10:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzhbs.zzh(obj, j4).hashCode();
                    i13 = iFloatToIntBits + i10;
                    break;
                case 11:
                    i = i13 * 53;
                    iZzd = zzhbs.zzd(obj, j4);
                    i13 = i + iZzd;
                    break;
                case 12:
                    i = i13 * 53;
                    iZzd = zzhbs.zzd(obj, j4);
                    i13 = i + iZzd;
                    break;
                case 13:
                    i = i13 * 53;
                    iZzd = zzhbs.zzd(obj, j4);
                    i13 = i + iZzd;
                    break;
                case 14:
                    i = i13 * 53;
                    jDoubleToLongBits = zzhbs.zzf(obj, j4);
                    byte[] bArr5 = zzgzi.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i + iZzd;
                    break;
                case 15:
                    i = i13 * 53;
                    iZzd = zzhbs.zzd(obj, j4);
                    i13 = i + iZzd;
                    break;
                case 16:
                    i = i13 * 53;
                    jDoubleToLongBits = zzhbs.zzf(obj, j4);
                    byte[] bArr6 = zzgzi.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i + iZzd;
                    break;
                case 17:
                    i11 = i13 * 53;
                    Object objZzh2 = zzhbs.zzh(obj, j4);
                    if (objZzh2 != null) {
                        iHashCode2 = objZzh2.hashCode();
                    }
                    i13 = i11 + iHashCode2;
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
                    i10 = i13 * 53;
                    iFloatToIntBits = zzhbs.zzh(obj, j4).hashCode();
                    i13 = iFloatToIntBits + i10;
                    break;
                case 50:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzhbs.zzh(obj, j4).hashCode();
                    i13 = iFloatToIntBits + i10;
                    break;
                case 51:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i = i13 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j4));
                        byte[] bArr7 = zzgzi.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i + iZzd;
                        break;
                    }
                case 52:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j4));
                        i13 = iFloatToIntBits + i10;
                        break;
                    }
                case 53:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j4);
                        byte[] bArr8 = zzgzi.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i + iZzd;
                        break;
                    }
                case 54:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j4);
                        byte[] bArr9 = zzgzi.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i + iZzd;
                        break;
                    }
                case 55:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i = i13 * 53;
                        iZzd = zzp(obj, j4);
                        i13 = i + iZzd;
                        break;
                    }
                case 56:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j4);
                        byte[] bArr10 = zzgzi.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i + iZzd;
                        break;
                    }
                case 57:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i = i13 * 53;
                        iZzd = zzp(obj, j4);
                        i13 = i + iZzd;
                        break;
                    }
                case 58:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzgzi.zza(zzS(obj, j4));
                        i13 = iFloatToIntBits + i10;
                        break;
                    }
                case 59:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = ((String) zzhbs.zzh(obj, j4)).hashCode();
                        i13 = iFloatToIntBits + i10;
                        break;
                    }
                case 60:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzhbs.zzh(obj, j4).hashCode();
                        i13 = iFloatToIntBits + i10;
                        break;
                    }
                case 61:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzhbs.zzh(obj, j4).hashCode();
                        i13 = iFloatToIntBits + i10;
                        break;
                    }
                case 62:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i = i13 * 53;
                        iZzd = zzp(obj, j4);
                        i13 = i + iZzd;
                        break;
                    }
                case 63:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i = i13 * 53;
                        iZzd = zzp(obj, j4);
                        i13 = i + iZzd;
                        break;
                    }
                case 64:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i = i13 * 53;
                        iZzd = zzp(obj, j4);
                        i13 = i + iZzd;
                        break;
                    }
                case 65:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j4);
                        byte[] bArr11 = zzgzi.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i + iZzd;
                        break;
                    }
                case 66:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i = i13 * 53;
                        iZzd = zzp(obj, j4);
                        i13 = i + iZzd;
                        break;
                    }
                case 67:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j4);
                        byte[] bArr12 = zzgzi.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i + iZzd;
                        break;
                    }
                case 68:
                    if (!zzR(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzhbs.zzh(obj, j4).hashCode();
                        i13 = iFloatToIntBits + i10;
                        break;
                    }
            }
            i12 += 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:512:0x0cba, code lost:
    
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0d1a, code lost:
    
        if (r14 == r2) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0d1c, code lost:
    
        r12.putInt(r13, r14, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0d20, code lost:
    
        r8 = r0.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0d25, code lost:
    
        if (r8 >= r0.zzl) goto L639;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0d27, code lost:
    
        r0.zzy(r13, r0.zzj[r8], null, r0.zzm, r34);
        r8 = r8 + 1;
        r0 = r33;
        r13 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0d3f, code lost:
    
        if (r11 != 0) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0d41, code lost:
    
        if (r7 != r6) goto L536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0d49, code lost:
    
        throw new com.google.android.gms.internal.ads.zzgzk("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0d4a, code lost:
    
        if (r7 > r6) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0d4c, code lost:
    
        if (r10 != r11) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0d4e, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0d54, code lost:
    
        throw new com.google.android.gms.internal.ads.zzgzk("Failed to parse the message.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0a29 A[PHI: r1 r6 r7 r10 r13 r17
  0x0a29: PHI (r1v189 int) = (r1v103 int), (r1v106 int), (r1v110 int), (r1v113 int), (r1v132 int), (r1v151 int), (r1v178 int), (r1v194 int) binds: [B:413:0x09ff, B:393:0x098d, B:373:0x0924, B:361:0x08e4, B:280:0x076d, B:224:0x065d, B:170:0x054a, B:153:0x04dc] A[DONT_GENERATE, DONT_INLINE]
  0x0a29: PHI (r6v107 com.google.android.gms.internal.ads.zzgxb) = 
  (r6v52 com.google.android.gms.internal.ads.zzgxb)
  (r6v53 com.google.android.gms.internal.ads.zzgxb)
  (r6v55 com.google.android.gms.internal.ads.zzgxb)
  (r6v57 com.google.android.gms.internal.ads.zzgxb)
  (r6v87 com.google.android.gms.internal.ads.zzgxb)
  (r6v95 com.google.android.gms.internal.ads.zzgxb)
  (r6v103 com.google.android.gms.internal.ads.zzgxb)
  (r6v110 com.google.android.gms.internal.ads.zzgxb)
 binds: [B:413:0x09ff, B:393:0x098d, B:373:0x0924, B:361:0x08e4, B:280:0x076d, B:224:0x065d, B:170:0x054a, B:153:0x04dc] A[DONT_GENERATE, DONT_INLINE]
  0x0a29: PHI (r7v112 byte[]) = 
  (r7v77 byte[])
  (r7v78 byte[])
  (r7v80 byte[])
  (r7v82 byte[])
  (r7v92 byte[])
  (r7v99 byte[])
  (r7v110 byte[])
  (r7v116 byte[])
 binds: [B:413:0x09ff, B:393:0x098d, B:373:0x0924, B:361:0x08e4, B:280:0x076d, B:224:0x065d, B:170:0x054a, B:153:0x04dc] A[DONT_GENERATE, DONT_INLINE]
  0x0a29: PHI (r10v45 int) = (r10v7 int), (r10v8 int), (r10v10 int), (r10v11 int), (r10v26 int), (r10v39 int), (r10v42 int), (r10v48 int) binds: [B:413:0x09ff, B:393:0x098d, B:373:0x0924, B:361:0x08e4, B:280:0x076d, B:224:0x065d, B:170:0x054a, B:153:0x04dc] A[DONT_GENERATE, DONT_INLINE]
  0x0a29: PHI (r13v101 int) = (r13v69 int), (r13v70 int), (r13v72 int), (r13v73 int), (r13v83 int), (r13v91 int), (r13v97 int), (r13v107 int) binds: [B:413:0x09ff, B:393:0x098d, B:373:0x0924, B:361:0x08e4, B:280:0x076d, B:224:0x065d, B:170:0x054a, B:153:0x04dc] A[DONT_GENERATE, DONT_INLINE]
  0x0a29: PHI (r17v51 sun.misc.Unsafe) = 
  (r17v28 sun.misc.Unsafe)
  (r17v29 sun.misc.Unsafe)
  (r17v31 sun.misc.Unsafe)
  (r17v34 sun.misc.Unsafe)
  (r17v38 sun.misc.Unsafe)
  (r17v46 sun.misc.Unsafe)
  (r17v49 sun.misc.Unsafe)
  (r17v55 sun.misc.Unsafe)
 binds: [B:413:0x09ff, B:393:0x098d, B:373:0x0924, B:361:0x08e4, B:280:0x076d, B:224:0x065d, B:170:0x054a, B:153:0x04dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0c95 A[PHI: r1 r11 r13 r18
  0x0c95: PHI (r1v101 com.google.android.gms.internal.ads.zzgxb) = 
  (r1v76 com.google.android.gms.internal.ads.zzgxb)
  (r1v77 com.google.android.gms.internal.ads.zzgxb)
  (r1v78 com.google.android.gms.internal.ads.zzgxb)
  (r1v79 com.google.android.gms.internal.ads.zzgxb)
  (r1v80 com.google.android.gms.internal.ads.zzgxb)
  (r1v81 com.google.android.gms.internal.ads.zzgxb)
  (r1v82 com.google.android.gms.internal.ads.zzgxb)
  (r1v83 com.google.android.gms.internal.ads.zzgxb)
  (r1v94 com.google.android.gms.internal.ads.zzgxb)
  (r1v102 com.google.android.gms.internal.ads.zzgxb)
 binds: [B:503:0x0c7e, B:500:0x0c5f, B:497:0x0c44, B:494:0x0c2a, B:491:0x0c0f, B:488:0x0bf3, B:481:0x0bd0, B:467:0x0b93, B:442:0x0ae1, B:436:0x0aa7] A[DONT_GENERATE, DONT_INLINE]
  0x0c95: PHI (r11v47 int) = 
  (r11v33 int)
  (r11v34 int)
  (r11v35 int)
  (r11v36 int)
  (r11v37 int)
  (r11v38 int)
  (r11v39 int)
  (r11v40 int)
  (r11v43 int)
  (r11v48 int)
 binds: [B:503:0x0c7e, B:500:0x0c5f, B:497:0x0c44, B:494:0x0c2a, B:491:0x0c0f, B:488:0x0bf3, B:481:0x0bd0, B:467:0x0b93, B:442:0x0ae1, B:436:0x0aa7] A[DONT_GENERATE, DONT_INLINE]
  0x0c95: PHI (r13v67 java.lang.Object) = 
  (r13v46 java.lang.Object)
  (r13v47 java.lang.Object)
  (r13v48 java.lang.Object)
  (r13v49 java.lang.Object)
  (r13v50 java.lang.Object)
  (r13v51 java.lang.Object)
  (r13v52 java.lang.Object)
  (r13v53 java.lang.Object)
  (r13v61 java.lang.Object)
  (r13v68 java.lang.Object)
 binds: [B:503:0x0c7e, B:500:0x0c5f, B:497:0x0c44, B:494:0x0c2a, B:491:0x0c0f, B:488:0x0bf3, B:481:0x0bd0, B:467:0x0b93, B:442:0x0ae1, B:436:0x0aa7] A[DONT_GENERATE, DONT_INLINE]
  0x0c95: PHI (r18v16 int) = 
  (r18v3 int)
  (r18v4 int)
  (r18v5 int)
  (r18v6 int)
  (r18v7 int)
  (r18v8 int)
  (r18v9 int)
  (r18v10 int)
  (r18v13 int)
  (r18v17 int)
 binds: [B:503:0x0c7e, B:500:0x0c5f, B:497:0x0c44, B:494:0x0c2a, B:491:0x0c0f, B:488:0x0bf3, B:481:0x0bd0, B:467:0x0b93, B:442:0x0ae1, B:436:0x0aa7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0cb3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0cc2  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0ce9  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0a2c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0c98 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0caa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0a42 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.ads.zzgxb r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhaj.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzgxb):int");
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Object zze() {
        return ((zzgyv) this.zzg).zzbj();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    @Override // com.google.android.gms.internal.ads.zzhaz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzQ(r8)
            if (r0 != 0) goto L8
            goto L91
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzgyv
            if (r0 == 0) goto L18
            r0 = r8
            com.google.android.gms.internal.ads.zzgyv r0 = (com.google.android.gms.internal.ads.zzgyv) r0
            r0.zzbT()
            r0.zzbS()
            r0.zzbV()
        L18:
            int[] r0 = r7.zzc
            r1 = 0
        L1b:
            int r2 = r0.length
            if (r1 >= r2) goto L83
            int r2 = r7.zzu(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzt(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6d
            r5 = 60
            if (r2 == r5) goto L57
            r5 = 68
            if (r2 == r5) goto L57
            switch(r2) {
                case 17: goto L6d;
                case 18: goto L4d;
                case 19: goto L4d;
                case 20: goto L4d;
                case 21: goto L4d;
                case 22: goto L4d;
                case 23: goto L4d;
                case 24: goto L4d;
                case 25: goto L4d;
                case 26: goto L4d;
                case 27: goto L4d;
                case 28: goto L4d;
                case 29: goto L4d;
                case 30: goto L4d;
                case 31: goto L4d;
                case 32: goto L4d;
                case 33: goto L4d;
                case 34: goto L4d;
                case 35: goto L4d;
                case 36: goto L4d;
                case 37: goto L4d;
                case 38: goto L4d;
                case 39: goto L4d;
                case 40: goto L4d;
                case 41: goto L4d;
                case 42: goto L4d;
                case 43: goto L4d;
                case 44: goto L4d;
                case 45: goto L4d;
                case 46: goto L4d;
                case 47: goto L4d;
                case 48: goto L4d;
                case 49: goto L4d;
                case 50: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L80
        L3b:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.ads.zzhaj.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L80
            r6 = r5
            com.google.android.gms.internal.ads.zzhaa r6 = (com.google.android.gms.internal.ads.zzhaa) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L80
        L4d:
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhbs.zzh(r8, r3)
            com.google.android.gms.internal.ads.zzgzh r2 = (com.google.android.gms.internal.ads.zzgzh) r2
            r2.zzb()
            goto L80
        L57:
            r2 = r0[r1]
            boolean r2 = r7.zzR(r8, r2, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.ads.zzhaz r2 = r7.zzx(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.zzhaj.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
            goto L80
        L6d:
            boolean r2 = r7.zzN(r8, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.ads.zzhaz r2 = r7.zzx(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.zzhaj.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
        L80:
            int r1 = r1 + 3
            goto L1b
        L83:
            com.google.android.gms.internal.ads.zzhbl r0 = r7.zzm
            r0.zzi(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L91
            com.google.android.gms.internal.ads.zzgyg r0 = r7.zzn
            r0.zza(r8)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhaj.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zzhbb.zzq(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzhbb.zzp(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int iZzu = zzu(i);
            int i10 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i11 = iArr[i];
            long j4 = i10;
            switch (iZzt) {
                case 0:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhbs.zzr(obj, j4, zzhbs.zzb(obj2, j4));
                        zzH(obj, i);
                        break;
                    }
                case 1:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhbs.zzs(obj, j4, zzhbs.zzc(obj2, j4));
                        zzH(obj, i);
                        break;
                    }
                case 2:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhbs.zzu(obj, j4, zzhbs.zzf(obj2, j4));
                        zzH(obj, i);
                        break;
                    }
                case 3:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhbs.zzu(obj, j4, zzhbs.zzf(obj2, j4));
                        zzH(obj, i);
                        break;
                    }
                case 4:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhbs.zzt(obj, j4, zzhbs.zzd(obj2, j4));
                        zzH(obj, i);
                        break;
                    }
                case 5:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhbs.zzu(obj, j4, zzhbs.zzf(obj2, j4));
                        zzH(obj, i);
                        break;
                    }
                case 6:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhbs.zzt(obj, j4, zzhbs.zzd(obj2, j4));
                        zzH(obj, i);
                        break;
                    }
                case 7:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhbs.zzp(obj, j4, zzhbs.zzz(obj2, j4));
                        zzH(obj, i);
                        break;
                    }
                case 8:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhbs.zzv(obj, j4, zzhbs.zzh(obj2, j4));
                        zzH(obj, i);
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhbs.zzv(obj, j4, zzhbs.zzh(obj2, j4));
                        zzH(obj, i);
                        break;
                    }
                case 11:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhbs.zzt(obj, j4, zzhbs.zzd(obj2, j4));
                        zzH(obj, i);
                        break;
                    }
                case 12:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhbs.zzt(obj, j4, zzhbs.zzd(obj2, j4));
                        zzH(obj, i);
                        break;
                    }
                case 13:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhbs.zzt(obj, j4, zzhbs.zzd(obj2, j4));
                        zzH(obj, i);
                        break;
                    }
                case 14:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhbs.zzu(obj, j4, zzhbs.zzf(obj2, j4));
                        zzH(obj, i);
                        break;
                    }
                case 15:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhbs.zzt(obj, j4, zzhbs.zzd(obj2, j4));
                        zzH(obj, i);
                        break;
                    }
                case 16:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhbs.zzu(obj, j4, zzhbs.zzf(obj2, j4));
                        zzH(obj, i);
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i);
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
                    zzgzh zzgzhVarZzf = (zzgzh) zzhbs.zzh(obj, j4);
                    zzgzh zzgzhVar = (zzgzh) zzhbs.zzh(obj2, j4);
                    int size = zzgzhVarZzf.size();
                    int size2 = zzgzhVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzgzhVarZzf.zzc()) {
                            zzgzhVarZzf = zzgzhVarZzf.zzf(size2 + size);
                        }
                        zzgzhVarZzf.addAll(zzgzhVar);
                    }
                    if (size > 0) {
                        zzgzhVar = zzgzhVarZzf;
                    }
                    zzhbs.zzv(obj, j4, zzgzhVar);
                    break;
                case 50:
                    int i12 = zzhbb.zza;
                    zzhbs.zzv(obj, j4, zzhab.zzb(zzhbs.zzh(obj, j4), zzhbs.zzh(obj2, j4)));
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
                    if (!zzR(obj2, i11, i)) {
                        break;
                    } else {
                        zzhbs.zzv(obj, j4, zzhbs.zzh(obj2, j4));
                        zzI(obj, i11, i);
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzR(obj2, i11, i)) {
                        break;
                    } else {
                        zzhbs.zzv(obj, j4, zzhbs.zzh(obj2, j4));
                        zzI(obj, i11, i);
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        r2 = r3;
        r5 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0610 A[LOOP:3: B:202:0x060c->B:204:0x0610, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:320:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhaz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r12, com.google.android.gms.internal.ads.zzhat r13, com.google.android.gms.internal.ads.zzgyf r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhaj.zzh(java.lang.Object, com.google.android.gms.internal.ads.zzhat, com.google.android.gms.internal.ads.zzgyf):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final void zzi(Object obj, byte[] bArr, int i, int i10, zzgxb zzgxbVar) throws IOException {
        zzc(obj, bArr, i, i10, 0, zzgxbVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.ads.zzhaz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(java.lang.Object r22, com.google.android.gms.internal.ads.zzhca r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhaj.zzj(java.lang.Object, com.google.android.gms.internal.ads.zzhca):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzJ;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            long j4 = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i) || Double.doubleToLongBits(zzhbs.zzb(obj, j4)) != Double.doubleToLongBits(zzhbs.zzb(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i) || Float.floatToIntBits(zzhbs.zzc(obj, j4)) != Float.floatToIntBits(zzhbs.zzc(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i) || zzhbs.zzf(obj, j4) != zzhbs.zzf(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i) || zzhbs.zzf(obj, j4) != zzhbs.zzf(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i) || zzhbs.zzd(obj, j4) != zzhbs.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i) || zzhbs.zzf(obj, j4) != zzhbs.zzf(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i) || zzhbs.zzd(obj, j4) != zzhbs.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i) || zzhbs.zzz(obj, j4) != zzhbs.zzz(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i) || !zzhbb.zzJ(zzhbs.zzh(obj, j4), zzhbs.zzh(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i) || !zzhbb.zzJ(zzhbs.zzh(obj, j4), zzhbs.zzh(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i) || !zzhbb.zzJ(zzhbs.zzh(obj, j4), zzhbs.zzh(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i) || zzhbs.zzd(obj, j4) != zzhbs.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i) || zzhbs.zzd(obj, j4) != zzhbs.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i) || zzhbs.zzd(obj, j4) != zzhbs.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i) || zzhbs.zzf(obj, j4) != zzhbs.zzf(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i) || zzhbs.zzd(obj, j4) != zzhbs.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i) || zzhbs.zzf(obj, j4) != zzhbs.zzf(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i) || !zzhbb.zzJ(zzhbs.zzh(obj, j4), zzhbs.zzh(obj2, j4))) {
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
                    zZzJ = zzhbb.zzJ(zzhbs.zzh(obj, j4), zzhbs.zzh(obj2, j4));
                    break;
                case 50:
                    zZzJ = zzhbb.zzJ(zzhbs.zzh(obj, j4), zzhbs.zzh(obj2, j4));
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
                    long jZzr = zzr(i) & 1048575;
                    if (zzhbs.zzd(obj, jZzr) != zzhbs.zzd(obj2, jZzr) || !zzhbb.zzJ(zzhbs.zzh(obj, j4), zzhbs.zzh(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzJ) {
                return false;
            }
        }
        if (!((zzgyv) obj).zzt.equals(((zzgyv) obj2).zzt)) {
            return false;
        }
        if (this.zzh) {
            return ((zzgyr) obj).zza.equals(((zzgyr) obj2).zza);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // com.google.android.gms.internal.ads.zzhaz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzl(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhaj.zzl(java.lang.Object):boolean");
    }
}
