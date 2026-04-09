package com.google.android.recaptcha.internal;

import com.google.ar.core.ImageFormat;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.snmp4j.smi.SMIConstants;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzol<T> implements zzow<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzps.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzoi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzpl zzm;
    private final zzmp zzn;

    private zzol(int[] iArr, Object[] objArr, int i10, int i11, zzoi zzoiVar, boolean z10, int[] iArr2, int i12, int i13, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzoiVar instanceof zznd;
        boolean z11 = false;
        if (zzmpVar != null && (zzoiVar instanceof zzna)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzm = zzplVar;
        this.zzn = zzmpVar;
        this.zzg = zzoiVar;
    }

    private final Object zzA(Object obj, int i10) {
        zzow zzowVarZzx = zzx(i10);
        int iZzu = zzu(i10) & 1048575;
        if (!zzN(obj, i10)) {
            return zzowVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzowVarZzx.zze();
        if (object != null) {
            zzowVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i10, int i11) {
        zzow zzowVarZzx = zzx(i11);
        if (!zzR(obj, i10, i11)) {
            return zzowVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i11) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzowVarZzx.zze();
        if (object != null) {
            zzowVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i10) {
        if (zzN(obj2, i10)) {
            int iZzu = zzu(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzu;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzow zzowVarZzx = zzx(i10);
            if (!zzN(obj, i10)) {
                if (zzQ(object)) {
                    Object objZze = zzowVarZzx.zze();
                    zzowVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzH(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzQ(object2)) {
                Object objZze2 = zzowVarZzx.zze();
                zzowVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzowVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzR(obj2, i11, i10)) {
            int iZzu = zzu(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzu;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzow zzowVarZzx = zzx(i10);
            if (!zzR(obj, i11, i10)) {
                if (zzQ(object)) {
                    Object objZze = zzowVarZzx.zze();
                    zzowVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzI(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzQ(object2)) {
                Object objZze2 = zzowVarZzx.zze();
                zzowVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzowVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i10, zzov zzovVar) throws IOException {
        long j10 = i10 & 1048575;
        if (zzM(i10)) {
            zzps.zzs(obj, j10, zzovVar.zzs());
        } else if (this.zzi) {
            zzps.zzs(obj, j10, zzovVar.zzr());
        } else {
            zzps.zzs(obj, j10, zzovVar.zzp());
        }
    }

    private final void zzH(Object obj, int i10) {
        int iZzr = zzr(i10);
        long j10 = 1048575 & iZzr;
        if (j10 == 1048575) {
            return;
        }
        zzps.zzq(obj, j10, (1 << (iZzr >>> 20)) | zzps.zzc(obj, j10));
    }

    private final void zzI(Object obj, int i10, int i11) {
        zzps.zzq(obj, zzr(i11) & 1048575, i10);
    }

    private final void zzJ(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzu(i10) & 1048575, obj2);
        zzH(obj, i10);
    }

    private final void zzK(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzu(i11) & 1048575, obj2);
        zzI(obj, i10, i11);
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        return zzN(obj, i10) == zzN(obj2, i10);
    }

    private static boolean zzM(int i10) {
        return (i10 & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i10) {
        int iZzr = zzr(i10);
        long j10 = iZzr & 1048575;
        if (j10 != 1048575) {
            return (zzps.zzc(obj, j10) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i10);
        long j11 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzps.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzps.zzb(obj, j11)) != 0;
            case 2:
                return zzps.zzd(obj, j11) != 0;
            case 3:
                return zzps.zzd(obj, j11) != 0;
            case 4:
                return zzps.zzc(obj, j11) != 0;
            case 5:
                return zzps.zzd(obj, j11) != 0;
            case 6:
                return zzps.zzc(obj, j11) != 0;
            case 7:
                return zzps.zzw(obj, j11);
            case 8:
                Object objZzf = zzps.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzle) {
                    return !zzle.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzps.zzf(obj, j11) != null;
            case 10:
                return !zzle.zzb.equals(zzps.zzf(obj, j11));
            case 11:
                return zzps.zzc(obj, j11) != 0;
            case 12:
                return zzps.zzc(obj, j11) != 0;
            case 13:
                return zzps.zzc(obj, j11) != 0;
            case 14:
                return zzps.zzd(obj, j11) != 0;
            case 15:
                return zzps.zzc(obj, j11) != 0;
            case 16:
                return zzps.zzd(obj, j11) != 0;
            case 17:
                return zzps.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzN(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzP(Object obj, int i10, zzow zzowVar) {
        return zzowVar.zzl(zzps.zzf(obj, i10 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zznd) {
            return ((zznd) obj).zzL();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i10, int i11) {
        return zzps.zzc(obj, (long) (zzr(i11) & 1048575)) == i10;
    }

    private static boolean zzS(Object obj, long j10) {
        return ((Boolean) zzps.zzf(obj, j10)).booleanValue();
    }

    private static final void zzT(int i10, Object obj, zzpy zzpyVar) throws IOException {
        if (obj instanceof String) {
            zzpyVar.zzG(i10, (String) obj);
        } else {
            zzpyVar.zzd(i10, (zzle) obj);
        }
    }

    static zzpm zzd(Object obj) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar != zzpm.zzc()) {
            return zzpmVar;
        }
        zzpm zzpmVarZzf = zzpm.zzf();
        zzndVar.zzc = zzpmVarZzf;
        return zzpmVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0396  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.recaptcha.internal.zzol zzm(java.lang.Class r34, com.google.android.recaptcha.internal.zzof r35, com.google.android.recaptcha.internal.zzoo r36, com.google.android.recaptcha.internal.zznv r37, com.google.android.recaptcha.internal.zzpl r38, com.google.android.recaptcha.internal.zzmp r39, com.google.android.recaptcha.internal.zzod r40) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzm(java.lang.Class, com.google.android.recaptcha.internal.zzof, com.google.android.recaptcha.internal.zzoo, com.google.android.recaptcha.internal.zznv, com.google.android.recaptcha.internal.zzpl, com.google.android.recaptcha.internal.zzmp, com.google.android.recaptcha.internal.zzod):com.google.android.recaptcha.internal.zzol");
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzps.zzf(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzps.zzf(obj, j10)).floatValue();
    }

    private static int zzp(Object obj, long j10) {
        return ((Integer) zzps.zzf(obj, j10)).intValue();
    }

    private final int zzq(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzs(i10, 0);
    }

    private final int zzr(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzs(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int zzt(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzu(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzv(Object obj, long j10) {
        return ((Long) zzps.zzf(obj, j10)).longValue();
    }

    private final zznh zzw(int i10) {
        int i11 = i10 / 3;
        return (zznh) this.zzd[i11 + i11 + 1];
    }

    private final zzow zzx(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzow zzowVar = (zzow) objArr[i12];
        if (zzowVar != null) {
            return zzowVar;
        }
        zzow zzowVarZzb = zzos.zza().zzb((Class) objArr[i12 + 1]);
        this.zzd[i12] = zzowVarZzb;
        return zzowVarZzb;
    }

    private final Object zzy(Object obj, int i10, Object obj2, zzpl zzplVar, Object obj3) {
        int i11 = this.zzc[i10];
        Object objZzf = zzps.zzf(obj, zzu(i10) & 1048575);
        if (objZzf == null || zzw(i10) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0481  */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v137 */
    /* JADX WARN: Type inference failed for: r0v185, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v256, types: [int] */
    /* JADX WARN: Type inference failed for: r0v263, types: [int] */
    /* JADX WARN: Type inference failed for: r0v265 */
    /* JADX WARN: Type inference failed for: r0v266 */
    /* JADX WARN: Type inference failed for: r0v267 */
    /* JADX WARN: Type inference failed for: r0v268 */
    /* JADX WARN: Type inference failed for: r0v269 */
    /* JADX WARN: Type inference failed for: r0v270 */
    /* JADX WARN: Type inference failed for: r0v271 */
    /* JADX WARN: Type inference failed for: r0v272 */
    /* JADX WARN: Type inference failed for: r0v273 */
    /* JADX WARN: Type inference failed for: r0v274 */
    /* JADX WARN: Type inference failed for: r0v275 */
    /* JADX WARN: Type inference failed for: r0v276 */
    /* JADX WARN: Type inference failed for: r0v277 */
    /* JADX WARN: Type inference failed for: r0v278 */
    /* JADX WARN: Type inference failed for: r0v279 */
    /* JADX WARN: Type inference failed for: r0v280 */
    /* JADX WARN: Type inference failed for: r1v118, types: [int] */
    /* JADX WARN: Type inference failed for: r1v121, types: [int] */
    /* JADX WARN: Type inference failed for: r1v167 */
    /* JADX WARN: Type inference failed for: r1v168 */
    /* JADX WARN: Type inference failed for: r1v78, types: [int] */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r2v32, types: [int] */
    /* JADX WARN: Type inference failed for: r2v37, types: [int] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v42, types: [int] */
    /* JADX WARN: Type inference failed for: r2v46, types: [int] */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55, types: [int] */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v91 */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27, types: [int] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30, types: [int] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v39, types: [int] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v46, types: [int] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31, types: [int] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v38, types: [int] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zza(java.lang.Object):int");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zzb(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i11;
        int i12 = 0;
        for (int i13 = 0; i13 < this.zzc.length; i13 += 3) {
            int iZzu = zzu(i13);
            int[] iArr = this.zzc;
            int i14 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i15 = iArr[i13];
            long j10 = i14;
            int iHashCode = 37;
            switch (iZzt) {
                case 0:
                    i10 = i12 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzps.zza(obj, j10));
                    byte[] bArr = zznl.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzps.zzb(obj, j10));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 2:
                    i10 = i12 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j10);
                    byte[] bArr2 = zznl.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 3:
                    i10 = i12 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j10);
                    byte[] bArr3 = zznl.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzps.zzc(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 5:
                    i10 = i12 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j10);
                    byte[] bArr4 = zznl.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzps.zzc(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 7:
                    i10 = i12 * 53;
                    iFloatToIntBits = zznl.zza(zzps.zzw(obj, j10));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iFloatToIntBits = ((String) zzps.zzf(obj, j10)).hashCode();
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 9:
                    i11 = i12 * 53;
                    Object objZzf = zzps.zzf(obj, j10);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i12 = i11 + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzps.zzf(obj, j10).hashCode();
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzps.zzc(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 12:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzps.zzc(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 13:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzps.zzc(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 14:
                    i10 = i12 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j10);
                    byte[] bArr5 = zznl.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzps.zzc(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 16:
                    i10 = i12 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j10);
                    byte[] bArr6 = zznl.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 17:
                    i11 = i12 * 53;
                    Object objZzf2 = zzps.zzf(obj, j10);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i12 = i11 + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case ImageFormat.RGBA_FP16 /* 22 */:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case ImageFormat.YUV_420_888 /* 35 */:
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
                    i10 = i12 * 53;
                    iFloatToIntBits = zzps.zzf(obj, j10).hashCode();
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzps.zzf(obj, j10).hashCode();
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 51:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j10));
                        byte[] bArr7 = zznl.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j10));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr8 = zznl.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr9 = zznl.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzp(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr10 = zznl.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzp(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zznl.zza(zzS(obj, j10));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = ((String) zzps.zzf(obj, j10)).hashCode();
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzps.zzf(obj, j10).hashCode();
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzps.zzf(obj, j10).hashCode();
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzp(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzp(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzp(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr11 = zznl.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzp(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr12 = zznl.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzps.zzf(obj, j10).hashCode();
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i12 * 53) + ((zznd) obj).zzc.hashCode();
        return this.zzh ? (iHashCode2 * 53) + ((zzna) obj).zzb.zza.hashCode() : iHashCode2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0e2c, code lost:
    
        if (r11 == 1048575) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0e2e, code lost:
    
        r36.putInt(r7, r11, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0e34, code lost:
    
        r11 = r6.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0e39, code lost:
    
        if (r11 >= r6.zzl) goto L645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0e3b, code lost:
    
        zzy(r34, r6.zzj[r11], null, r6.zzm, r34);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0e51, code lost:
    
        if (r9 != 0) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0e53, code lost:
    
        if (r8 != r14) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0e5b, code lost:
    
        throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0e5c, code lost:
    
        if (r8 > r14) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0e5e, code lost:
    
        if (r10 != r9) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0e60, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0e66, code lost:
    
        throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0cdb A[PHI: r0 r2 r8 r10 r19 r24 r36
  0x0cdb: PHI (r0v102 int) = (r0v73 int), (r0v74 int), (r0v80 int), (r0v85 int), (r0v93 int), (r0v99 int), (r0v103 int) binds: [B:483:0x0cc4, B:480:0x0c9e, B:459:0x0bd6, B:443:0x0b83, B:424:0x0ac7, B:418:0x0a8b, B:413:0x0a45] A[DONT_GENERATE, DONT_INLINE]
  0x0cdb: PHI (r2v96 com.google.android.recaptcha.internal.zzkt) = 
  (r2v79 com.google.android.recaptcha.internal.zzkt)
  (r2v80 com.google.android.recaptcha.internal.zzkt)
  (r2v86 com.google.android.recaptcha.internal.zzkt)
  (r2v89 com.google.android.recaptcha.internal.zzkt)
  (r2v92 com.google.android.recaptcha.internal.zzkt)
  (r2v94 com.google.android.recaptcha.internal.zzkt)
  (r2v97 com.google.android.recaptcha.internal.zzkt)
 binds: [B:483:0x0cc4, B:480:0x0c9e, B:459:0x0bd6, B:443:0x0b83, B:424:0x0ac7, B:418:0x0a8b, B:413:0x0a45] A[DONT_GENERATE, DONT_INLINE]
  0x0cdb: PHI (r8v86 int) = (r8v61 int), (r8v62 int), (r8v68 int), (r8v71 int), (r8v75 int), (r8v80 int), (r8v87 int) binds: [B:483:0x0cc4, B:480:0x0c9e, B:459:0x0bd6, B:443:0x0b83, B:424:0x0ac7, B:418:0x0a8b, B:413:0x0a45] A[DONT_GENERATE, DONT_INLINE]
  0x0cdb: PHI (r10v54 int) = (r10v21 int), (r10v22 int), (r10v28 int), (r10v33 int), (r10v43 int), (r10v49 int), (r10v55 int) binds: [B:483:0x0cc4, B:480:0x0c9e, B:459:0x0bd6, B:443:0x0b83, B:424:0x0ac7, B:418:0x0a8b, B:413:0x0a45] A[DONT_GENERATE, DONT_INLINE]
  0x0cdb: PHI (r19v51 int) = (r19v30 int), (r19v31 int), (r19v37 int), (r19v40 int), (r19v44 int), (r19v48 int), (r19v52 int) binds: [B:483:0x0cc4, B:480:0x0c9e, B:459:0x0bd6, B:443:0x0b83, B:424:0x0ac7, B:418:0x0a8b, B:413:0x0a45] A[DONT_GENERATE, DONT_INLINE]
  0x0cdb: PHI (r24v25 int) = (r24v7 int), (r24v8 int), (r24v14 int), (r24v17 int), (r24v19 int), (r24v22 int), (r24v26 int) binds: [B:483:0x0cc4, B:480:0x0c9e, B:459:0x0bd6, B:443:0x0b83, B:424:0x0ac7, B:418:0x0a8b, B:413:0x0a45] A[DONT_GENERATE, DONT_INLINE]
  0x0cdb: PHI (r36v37 sun.misc.Unsafe) = 
  (r36v15 sun.misc.Unsafe)
  (r36v16 sun.misc.Unsafe)
  (r36v22 sun.misc.Unsafe)
  (r36v25 sun.misc.Unsafe)
  (r36v29 sun.misc.Unsafe)
  (r36v34 sun.misc.Unsafe)
  (r36v38 sun.misc.Unsafe)
 binds: [B:483:0x0cc4, B:480:0x0c9e, B:459:0x0bd6, B:443:0x0b83, B:424:0x0ac7, B:418:0x0a8b, B:413:0x0a45] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0cde  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0cf3  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0dfa  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x09ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:634:0x09c5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.recaptcha.internal.zzkt r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzkt):int");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        return ((zznd) this.zzg).zzv();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzQ(r8)
            if (r0 != 0) goto L8
            goto L95
        L8:
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zznd
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.recaptcha.internal.zznd r0 = (com.google.android.recaptcha.internal.zznd) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzJ(r2)
            r0.zza = r1
            r0.zzH()
        L1b:
            int[] r0 = r7.zzc
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L87
            int r2 = r7.zzu(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzt(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L71
            r5 = 60
            if (r2 == r5) goto L59
            r5 = 68
            if (r2 == r5) goto L59
            switch(r2) {
                case 17: goto L71;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L84
        L3d:
            sun.misc.Unsafe r2 = com.google.android.recaptcha.internal.zzol.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L84
            r6 = r5
            com.google.android.recaptcha.internal.zzoc r6 = (com.google.android.recaptcha.internal.zzoc) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L84
        L4f:
            java.lang.Object r2 = com.google.android.recaptcha.internal.zzps.zzf(r8, r3)
            com.google.android.recaptcha.internal.zznk r2 = (com.google.android.recaptcha.internal.zznk) r2
            r2.zzb()
            goto L84
        L59:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzR(r8, r2, r1)
            if (r2 == 0) goto L84
            com.google.android.recaptcha.internal.zzow r2 = r7.zzx(r1)
            sun.misc.Unsafe r5 = com.google.android.recaptcha.internal.zzol.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
            goto L84
        L71:
            boolean r2 = r7.zzN(r8, r1)
            if (r2 == 0) goto L84
            com.google.android.recaptcha.internal.zzow r2 = r7.zzx(r1)
            sun.misc.Unsafe r5 = com.google.android.recaptcha.internal.zzol.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
        L84:
            int r1 = r1 + 3
            goto L1d
        L87:
            com.google.android.recaptcha.internal.zzpl r0 = r7.zzm
            r0.zzi(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L95
            com.google.android.recaptcha.internal.zzmp r0 = r7.zzn
            r0.zza(r8)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzu = zzu(i10);
            int i11 = 1048575 & iZzu;
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i10)) {
                        zzps.zzo(obj, j10, zzps.zza(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i10)) {
                        zzps.zzp(obj, j10, zzps.zzb(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i10)) {
                        zzps.zzr(obj, j10, zzps.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i10)) {
                        zzps.zzr(obj, j10, zzps.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i10)) {
                        zzps.zzq(obj, j10, zzps.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i10)) {
                        zzps.zzr(obj, j10, zzps.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i10)) {
                        zzps.zzq(obj, j10, zzps.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i10)) {
                        zzps.zzm(obj, j10, zzps.zzw(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i10)) {
                        zzps.zzs(obj, j10, zzps.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i10);
                    break;
                case 10:
                    if (zzN(obj2, i10)) {
                        zzps.zzs(obj, j10, zzps.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i10)) {
                        zzps.zzq(obj, j10, zzps.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i10)) {
                        zzps.zzq(obj, j10, zzps.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i10)) {
                        zzps.zzq(obj, j10, zzps.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i10)) {
                        zzps.zzr(obj, j10, zzps.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i10)) {
                        zzps.zzq(obj, j10, zzps.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i10)) {
                        zzps.zzr(obj, j10, zzps.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case ImageFormat.RGBA_FP16 /* 22 */:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case ImageFormat.YUV_420_888 /* 35 */:
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
                    zznk zznkVarZzd = (zznk) zzps.zzf(obj, j10);
                    zznk zznkVar = (zznk) zzps.zzf(obj2, j10);
                    int size = zznkVarZzd.size();
                    int size2 = zznkVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zznkVarZzd.zzc()) {
                            zznkVarZzd = zznkVarZzd.zzd(size2 + size);
                        }
                        zznkVarZzd.addAll(zznkVar);
                    }
                    if (size > 0) {
                        zznkVar = zznkVarZzd;
                    }
                    zzps.zzs(obj, j10, zznkVar);
                    break;
                case 50:
                    int i13 = zzoy.zza;
                    zzps.zzs(obj, j10, zzod.zzb(zzps.zzf(obj, j10), zzps.zzf(obj2, j10)));
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
                    if (zzR(obj2, i12, i10)) {
                        zzps.zzs(obj, j10, zzps.zzf(obj2, j10));
                        zzI(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
                    zzF(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
                case 66:
                case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
                    if (zzR(obj2, i12, i10)) {
                        zzps.zzs(obj, j10, zzps.zzf(obj2, j10));
                        zzI(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                    zzF(obj, obj2, i10);
                    break;
            }
        }
        zzoy.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzoy.zzp(this.zzn, obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzh(Object obj, zzov zzovVar, zzmo zzmoVar) throws IOException {
        Object objValueOf;
        Object objZze;
        zzmoVar.getClass();
        zzD(obj);
        zzpl zzplVar = this.zzm;
        Object objZza = null;
        zzmt zzmtVarZzi = null;
        while (true) {
            try {
                int iZzc = zzovVar.zzc();
                int iZzq = zzq(iZzc);
                if (iZzq >= 0) {
                    int iZzu = zzu(iZzq);
                    try {
                    } catch (zznm unused) {
                        if (objZza == null) {
                            objZza = zzplVar.zza(obj);
                        }
                        if (!zzplVar.zzk(objZza, zzovVar, 0)) {
                            for (int i10 = this.zzk; i10 < this.zzl; i10++) {
                                zzy(obj, this.zzj[i10], objZza, zzplVar, obj);
                            }
                        }
                    }
                    switch (zzt(iZzu)) {
                        case 0:
                            zzps.zzo(obj, iZzu & 1048575, zzovVar.zza());
                            zzH(obj, iZzq);
                        case 1:
                            zzps.zzp(obj, iZzu & 1048575, zzovVar.zzb());
                            zzH(obj, iZzq);
                        case 2:
                            zzps.zzr(obj, iZzu & 1048575, zzovVar.zzl());
                            zzH(obj, iZzq);
                        case 3:
                            zzps.zzr(obj, iZzu & 1048575, zzovVar.zzo());
                            zzH(obj, iZzq);
                        case 4:
                            zzps.zzq(obj, iZzu & 1048575, zzovVar.zzg());
                            zzH(obj, iZzq);
                        case 5:
                            zzps.zzr(obj, iZzu & 1048575, zzovVar.zzk());
                            zzH(obj, iZzq);
                        case 6:
                            zzps.zzq(obj, iZzu & 1048575, zzovVar.zzf());
                            zzH(obj, iZzq);
                        case 7:
                            zzps.zzm(obj, iZzu & 1048575, zzovVar.zzN());
                            zzH(obj, iZzq);
                        case 8:
                            zzG(obj, iZzu, zzovVar);
                            zzH(obj, iZzq);
                        case 9:
                            zzoi zzoiVar = (zzoi) zzA(obj, iZzq);
                            zzovVar.zzu(zzoiVar, zzx(iZzq), zzmoVar);
                            zzJ(obj, iZzq, zzoiVar);
                        case 10:
                            zzps.zzs(obj, iZzu & 1048575, zzovVar.zzp());
                            zzH(obj, iZzq);
                        case 11:
                            zzps.zzq(obj, iZzu & 1048575, zzovVar.zzj());
                            zzH(obj, iZzq);
                        case 12:
                            int iZze = zzovVar.zze();
                            zznh zznhVarZzw = zzw(iZzq);
                            if (zznhVarZzw == null || zznhVarZzw.zza(iZze)) {
                                zzps.zzq(obj, iZzu & 1048575, iZze);
                                zzH(obj, iZzq);
                            } else {
                                objZza = zzoy.zzo(obj, iZzc, iZze, objZza, zzplVar);
                            }
                            break;
                        case 13:
                            zzps.zzq(obj, iZzu & 1048575, zzovVar.zzh());
                            zzH(obj, iZzq);
                        case 14:
                            zzps.zzr(obj, iZzu & 1048575, zzovVar.zzm());
                            zzH(obj, iZzq);
                        case 15:
                            zzps.zzq(obj, iZzu & 1048575, zzovVar.zzi());
                            zzH(obj, iZzq);
                        case 16:
                            zzps.zzr(obj, iZzu & 1048575, zzovVar.zzn());
                            zzH(obj, iZzq);
                        case 17:
                            zzoi zzoiVar2 = (zzoi) zzA(obj, iZzq);
                            zzovVar.zzt(zzoiVar2, zzx(iZzq), zzmoVar);
                            zzJ(obj, iZzq, zzoiVar2);
                        case 18:
                            zzovVar.zzx(zznv.zza(obj, iZzu & 1048575));
                        case 19:
                            zzovVar.zzB(zznv.zza(obj, iZzu & 1048575));
                        case 20:
                            zzovVar.zzE(zznv.zza(obj, iZzu & 1048575));
                        case 21:
                            zzovVar.zzM(zznv.zza(obj, iZzu & 1048575));
                        case ImageFormat.RGBA_FP16 /* 22 */:
                            zzovVar.zzD(zznv.zza(obj, iZzu & 1048575));
                        case 23:
                            zzovVar.zzA(zznv.zza(obj, iZzu & 1048575));
                        case 24:
                            zzovVar.zzz(zznv.zza(obj, iZzu & 1048575));
                        case 25:
                            zzovVar.zzv(zznv.zza(obj, iZzu & 1048575));
                        case 26:
                            if (zzM(iZzu)) {
                                ((zzlj) zzovVar).zzK(zznv.zza(obj, iZzu & 1048575), true);
                            } else {
                                ((zzlj) zzovVar).zzK(zznv.zza(obj, iZzu & 1048575), false);
                            }
                        case 27:
                            zzovVar.zzF(zznv.zza(obj, iZzu & 1048575), zzx(iZzq), zzmoVar);
                        case 28:
                            zzovVar.zzw(zznv.zza(obj, iZzu & 1048575));
                        case 29:
                            zzovVar.zzL(zznv.zza(obj, iZzu & 1048575));
                        case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                            List listZza = zznv.zza(obj, iZzu & 1048575);
                            zzovVar.zzy(listZza);
                            objZza = zzoy.zzn(obj, iZzc, listZza, zzw(iZzq), objZza, zzplVar);
                        case 31:
                            zzovVar.zzG(zznv.zza(obj, iZzu & 1048575));
                        case 32:
                            zzovVar.zzH(zznv.zza(obj, iZzu & 1048575));
                        case 33:
                            zzovVar.zzI(zznv.zza(obj, iZzu & 1048575));
                        case 34:
                            zzovVar.zzJ(zznv.zza(obj, iZzu & 1048575));
                        case ImageFormat.YUV_420_888 /* 35 */:
                            zzovVar.zzx(zznv.zza(obj, iZzu & 1048575));
                        case 36:
                            zzovVar.zzB(zznv.zza(obj, iZzu & 1048575));
                        case 37:
                            zzovVar.zzE(zznv.zza(obj, iZzu & 1048575));
                        case 38:
                            zzovVar.zzM(zznv.zza(obj, iZzu & 1048575));
                        case 39:
                            zzovVar.zzD(zznv.zza(obj, iZzu & 1048575));
                        case 40:
                            zzovVar.zzA(zznv.zza(obj, iZzu & 1048575));
                        case 41:
                            zzovVar.zzz(zznv.zza(obj, iZzu & 1048575));
                        case 42:
                            zzovVar.zzv(zznv.zza(obj, iZzu & 1048575));
                        case 43:
                            zzovVar.zzL(zznv.zza(obj, iZzu & 1048575));
                        case 44:
                            List listZza2 = zznv.zza(obj, iZzu & 1048575);
                            zzovVar.zzy(listZza2);
                            objZza = zzoy.zzn(obj, iZzc, listZza2, zzw(iZzq), objZza, zzplVar);
                        case 45:
                            zzovVar.zzG(zznv.zza(obj, iZzu & 1048575));
                        case 46:
                            zzovVar.zzH(zznv.zza(obj, iZzu & 1048575));
                        case 47:
                            zzovVar.zzI(zznv.zza(obj, iZzu & 1048575));
                        case 48:
                            zzovVar.zzJ(zznv.zza(obj, iZzu & 1048575));
                        case 49:
                            zzovVar.zzC(zznv.zza(obj, iZzu & 1048575), zzx(iZzq), zzmoVar);
                        case 50:
                            Object objZzz = zzz(iZzq);
                            long jZzu = zzu(iZzq) & 1048575;
                            Object objZzf = zzps.zzf(obj, jZzu);
                            if (objZzf == null) {
                                objZzf = zzoc.zza().zzb();
                                zzps.zzs(obj, jZzu, objZzf);
                            } else if (zzod.zza(objZzf)) {
                                Object objZzb = zzoc.zza().zzb();
                                zzod.zzb(objZzb, objZzf);
                                zzps.zzs(obj, jZzu, objZzb);
                                objZzf = objZzb;
                            }
                            throw null;
                            break;
                        case 51:
                            zzps.zzs(obj, iZzu & 1048575, Double.valueOf(zzovVar.zza()));
                            zzI(obj, iZzc, iZzq);
                        case 52:
                            zzps.zzs(obj, iZzu & 1048575, Float.valueOf(zzovVar.zzb()));
                            zzI(obj, iZzc, iZzq);
                        case 53:
                            zzps.zzs(obj, iZzu & 1048575, Long.valueOf(zzovVar.zzl()));
                            zzI(obj, iZzc, iZzq);
                        case 54:
                            zzps.zzs(obj, iZzu & 1048575, Long.valueOf(zzovVar.zzo()));
                            zzI(obj, iZzc, iZzq);
                        case 55:
                            zzps.zzs(obj, iZzu & 1048575, Integer.valueOf(zzovVar.zzg()));
                            zzI(obj, iZzc, iZzq);
                        case 56:
                            zzps.zzs(obj, iZzu & 1048575, Long.valueOf(zzovVar.zzk()));
                            zzI(obj, iZzc, iZzq);
                        case 57:
                            zzps.zzs(obj, iZzu & 1048575, Integer.valueOf(zzovVar.zzf()));
                            zzI(obj, iZzc, iZzq);
                        case 58:
                            zzps.zzs(obj, iZzu & 1048575, Boolean.valueOf(zzovVar.zzN()));
                            zzI(obj, iZzc, iZzq);
                        case 59:
                            zzG(obj, iZzu, zzovVar);
                            zzI(obj, iZzc, iZzq);
                        case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
                            zzoi zzoiVar3 = (zzoi) zzB(obj, iZzc, iZzq);
                            zzovVar.zzu(zzoiVar3, zzx(iZzq), zzmoVar);
                            zzK(obj, iZzc, iZzq, zzoiVar3);
                        case 61:
                            zzps.zzs(obj, iZzu & 1048575, zzovVar.zzp());
                            zzI(obj, iZzc, iZzq);
                        case 62:
                            zzps.zzs(obj, iZzu & 1048575, Integer.valueOf(zzovVar.zzj()));
                            zzI(obj, iZzc, iZzq);
                        case 63:
                            int iZze2 = zzovVar.zze();
                            zznh zznhVarZzw2 = zzw(iZzq);
                            if (zznhVarZzw2 == null || zznhVarZzw2.zza(iZze2)) {
                                zzps.zzs(obj, iZzu & 1048575, Integer.valueOf(iZze2));
                                zzI(obj, iZzc, iZzq);
                            } else {
                                objZza = zzoy.zzo(obj, iZzc, iZze2, objZza, zzplVar);
                            }
                            break;
                        case 64:
                            zzps.zzs(obj, iZzu & 1048575, Integer.valueOf(zzovVar.zzh()));
                            zzI(obj, iZzc, iZzq);
                        case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
                            zzps.zzs(obj, iZzu & 1048575, Long.valueOf(zzovVar.zzm()));
                            zzI(obj, iZzc, iZzq);
                        case 66:
                            zzps.zzs(obj, iZzu & 1048575, Integer.valueOf(zzovVar.zzi()));
                            zzI(obj, iZzc, iZzq);
                        case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
                            zzps.zzs(obj, iZzu & 1048575, Long.valueOf(zzovVar.zzn()));
                            zzI(obj, iZzc, iZzq);
                        case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                            zzoi zzoiVar4 = (zzoi) zzB(obj, iZzc, iZzq);
                            zzovVar.zzt(zzoiVar4, zzx(iZzq), zzmoVar);
                            zzK(obj, iZzc, iZzq, zzoiVar4);
                        default:
                            if (objZza == null) {
                                objZza = zzplVar.zza(obj);
                            }
                            if (!zzplVar.zzk(objZza, zzovVar, 0)) {
                                for (int i11 = this.zzk; i11 < this.zzl; i11++) {
                                    zzy(obj, this.zzj[i11], objZza, zzplVar, obj);
                                }
                                break;
                            }
                    }
                } else if (iZzc == Integer.MAX_VALUE) {
                    for (int i12 = this.zzk; i12 < this.zzl; i12++) {
                        zzy(obj, this.zzj[i12], objZza, zzplVar, obj);
                    }
                } else {
                    zznc zzncVarZza = !this.zzh ? null : zzmoVar.zza(this.zzg, iZzc);
                    if (zzncVarZza != null) {
                        if (zzmtVarZzi == null) {
                            zzmtVarZzi = ((zzna) obj).zzi();
                        }
                        zznb zznbVar = zzncVarZza.zza;
                        zzpw zzpwVar = zzpw.zzn;
                        zzpw zzpwVar2 = zznbVar.zzb;
                        if (zzpwVar2 == zzpwVar) {
                            zzovVar.zzg();
                            throw null;
                        }
                        switch (zzpwVar2.ordinal()) {
                            case 0:
                                objValueOf = Double.valueOf(zzovVar.zza());
                                break;
                            case 1:
                                objValueOf = Float.valueOf(zzovVar.zzb());
                                break;
                            case 2:
                                objValueOf = Long.valueOf(zzovVar.zzl());
                                break;
                            case 3:
                                objValueOf = Long.valueOf(zzovVar.zzo());
                                break;
                            case 4:
                                objValueOf = Integer.valueOf(zzovVar.zzg());
                                break;
                            case 5:
                                objValueOf = Long.valueOf(zzovVar.zzk());
                                break;
                            case 6:
                                objValueOf = Integer.valueOf(zzovVar.zzf());
                                break;
                            case 7:
                                objValueOf = Boolean.valueOf(zzovVar.zzN());
                                break;
                            case 8:
                                objValueOf = zzovVar.zzr();
                                break;
                            case 9:
                                Object objZze2 = zzmtVarZzi.zze(zzncVarZza.zza);
                                if (!(objZze2 instanceof zznd)) {
                                    throw null;
                                }
                                zzow zzowVarZzb = zzos.zza().zzb(objZze2.getClass());
                                if (!((zznd) objZze2).zzL()) {
                                    Object objZze3 = zzowVarZzb.zze();
                                    zzowVarZzb.zzg(objZze3, objZze2);
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objZze3);
                                    objZze2 = objZze3;
                                }
                                zzovVar.zzt(objZze2, zzowVarZzb, zzmoVar);
                                continue;
                            case 10:
                                Object objZze4 = zzmtVarZzi.zze(zzncVarZza.zza);
                                if (!(objZze4 instanceof zznd)) {
                                    throw null;
                                }
                                zzow zzowVarZzb2 = zzos.zza().zzb(objZze4.getClass());
                                if (!((zznd) objZze4).zzL()) {
                                    Object objZze5 = zzowVarZzb2.zze();
                                    zzowVarZzb2.zzg(objZze5, objZze4);
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objZze5);
                                    objZze4 = objZze5;
                                }
                                zzovVar.zzu(objZze4, zzowVarZzb2, zzmoVar);
                                continue;
                            case 11:
                                objValueOf = zzovVar.zzp();
                                break;
                            case 12:
                                objValueOf = Integer.valueOf(zzovVar.zzj());
                                break;
                            case 13:
                                throw new IllegalStateException("Shouldn't reach here.");
                            case 14:
                                objValueOf = Integer.valueOf(zzovVar.zzh());
                                break;
                            case 15:
                                objValueOf = Long.valueOf(zzovVar.zzm());
                                break;
                            case 16:
                                objValueOf = Integer.valueOf(zzovVar.zzi());
                                break;
                            case 17:
                                objValueOf = Long.valueOf(zzovVar.zzn());
                                break;
                            default:
                                objValueOf = null;
                                break;
                        }
                        int iOrdinal = zzncVarZza.zza.zzb.ordinal();
                        if ((iOrdinal == 9 || iOrdinal == 10) && (objZze = zzmtVarZzi.zze(zzncVarZza.zza)) != null) {
                            byte[] bArr = zznl.zzb;
                            objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                        }
                        zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                    } else {
                        if (objZza == null) {
                            objZza = zzplVar.zza(obj);
                        }
                        if (!zzplVar.zzk(objZza, zzovVar, 0)) {
                            for (int i13 = this.zzk; i13 < this.zzl; i13++) {
                                zzy(obj, this.zzj[i13], objZza, zzplVar, obj);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                for (int i14 = this.zzk; i14 < this.zzl; i14++) {
                    zzy(obj, this.zzj[i14], objZza, zzplVar, obj);
                }
                if (objZza != null) {
                    zzplVar.zzj(obj, objZza);
                }
                throw th2;
            }
        }
        if (objZza != null) {
            zzplVar.zzj(obj, objZza);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzkt zzktVar) throws IOException {
        zzc(obj, bArr, i10, i11, 0, zzktVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(java.lang.Object r25, com.google.android.recaptcha.internal.zzpy r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzj(java.lang.Object, com.google.android.recaptcha.internal.zzpy):void");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzF;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzu = zzu(i10);
            long j10 = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i10) || Double.doubleToLongBits(zzps.zza(obj, j10)) != Double.doubleToLongBits(zzps.zza(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i10) || Float.floatToIntBits(zzps.zzb(obj, j10)) != Float.floatToIntBits(zzps.zzb(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i10) || zzps.zzd(obj, j10) != zzps.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i10) || zzps.zzd(obj, j10) != zzps.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i10) || zzps.zzc(obj, j10) != zzps.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i10) || zzps.zzd(obj, j10) != zzps.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i10) || zzps.zzc(obj, j10) != zzps.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i10) || zzps.zzw(obj, j10) != zzps.zzw(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i10) || !zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i10) || !zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i10) || !zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i10) || zzps.zzc(obj, j10) != zzps.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i10) || zzps.zzc(obj, j10) != zzps.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i10) || zzps.zzc(obj, j10) != zzps.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i10) || zzps.zzd(obj, j10) != zzps.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i10) || zzps.zzc(obj, j10) != zzps.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i10) || zzps.zzd(obj, j10) != zzps.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i10) || !zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case ImageFormat.RGBA_FP16 /* 22 */:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case ImageFormat.YUV_420_888 /* 35 */:
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
                    zZzF = zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10));
                    break;
                case 50:
                    zZzF = zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10));
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
                case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
                case 61:
                case 62:
                case 63:
                case 64:
                case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
                case 66:
                case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
                case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                    long jZzr = zzr(i10) & 1048575;
                    if (zzps.zzc(obj, jZzr) != zzps.zzc(obj2, jZzr) || !zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzF) {
                return false;
            }
        }
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzl(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzl(java.lang.Object):boolean");
    }
}
