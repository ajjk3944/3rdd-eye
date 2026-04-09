package com.google.android.gms.internal.play_billing;

import j6.l;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzef<T> implements zzeo<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzfp.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzec zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzdq zzl;
    private final zzff zzm;
    private final zzce zzn;
    private final zzei zzo;
    private final zzdx zzp;

    private zzef(int[] iArr, Object[] objArr, int i, int i10, zzec zzecVar, int i11, boolean z10, int[] iArr2, int i12, int i13, zzei zzeiVar, zzdq zzdqVar, zzff zzffVar, zzce zzceVar, zzdx zzdxVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i10;
        boolean z11 = false;
        if (zzceVar != null && zzceVar.zzf(zzecVar)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzi = iArr2;
        this.zzj = i12;
        this.zzk = i13;
        this.zzo = zzeiVar;
        this.zzl = zzdqVar;
        this.zzm = zzffVar;
        this.zzn = zzceVar;
        this.zzg = zzecVar;
        this.zzp = zzdxVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        if (zzI(obj2, i)) {
            int iZzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j4 = iZzs;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzeo zzeoVarZzv = zzv(i);
            if (!zzI(obj, i)) {
                if (zzL(object)) {
                    Object objZze = zzeoVarZzv.zze();
                    zzeoVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j4, objZze);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                zzD(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzL(object2)) {
                Object objZze2 = zzeoVarZzv.zze();
                zzeoVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j4, objZze2);
                object2 = objZze2;
            }
            zzeoVarZzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int i10 = this.zzc[i];
        if (zzM(obj2, i10, i)) {
            int iZzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j4 = iZzs;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzeo zzeoVarZzv = zzv(i);
            if (!zzM(obj, i10, i)) {
                if (zzL(object)) {
                    Object objZze = zzeoVarZzv.zze();
                    zzeoVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j4, objZze);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                zzE(obj, i10, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzL(object2)) {
                Object objZze2 = zzeoVarZzv.zze();
                zzeoVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j4, objZze2);
                object2 = objZze2;
            }
            zzeoVarZzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i) {
        int iZzp = zzp(i);
        long j4 = 1048575 & iZzp;
        if (j4 == 1048575) {
            return;
        }
        zzfp.zzq(obj, j4, (1 << (iZzp >>> 20)) | zzfp.zzc(obj, j4));
    }

    private final void zzE(Object obj, int i, int i10) {
        zzfp.zzq(obj, zzp(i10) & 1048575, i);
    }

    private final void zzF(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzs(i) & 1048575, obj2);
        zzD(obj, i);
    }

    private final void zzG(Object obj, int i, int i10, Object obj2) {
        zzb.putObject(obj, zzs(i10) & 1048575, obj2);
        zzE(obj, i, i10);
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        return zzI(obj, i) == zzI(obj2, i);
    }

    private final boolean zzI(Object obj, int i) {
        int iZzp = zzp(i);
        long j4 = iZzp & 1048575;
        if (j4 != 1048575) {
            return (zzfp.zzc(obj, j4) & (1 << (iZzp >>> 20))) != 0;
        }
        int iZzs = zzs(i);
        long j10 = iZzs & 1048575;
        switch (zzr(iZzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzfp.zza(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzfp.zzb(obj, j10)) != 0;
            case 2:
                return zzfp.zzd(obj, j10) != 0;
            case 3:
                return zzfp.zzd(obj, j10) != 0;
            case 4:
                return zzfp.zzc(obj, j10) != 0;
            case 5:
                return zzfp.zzd(obj, j10) != 0;
            case 6:
                return zzfp.zzc(obj, j10) != 0;
            case 7:
                return zzfp.zzw(obj, j10);
            case 8:
                Object objZzf = zzfp.zzf(obj, j10);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzbq) {
                    return !zzbq.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzfp.zzf(obj, j10) != null;
            case 10:
                return !zzbq.zzb.equals(zzfp.zzf(obj, j10));
            case 11:
                return zzfp.zzc(obj, j10) != 0;
            case 12:
                return zzfp.zzc(obj, j10) != 0;
            case 13:
                return zzfp.zzc(obj, j10) != 0;
            case 14:
                return zzfp.zzd(obj, j10) != 0;
            case 15:
                return zzfp.zzc(obj, j10) != 0;
            case 16:
                return zzfp.zzd(obj, j10) != 0;
            case 17:
                return zzfp.zzf(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i, int i10, int i11, int i12) {
        return i10 == 1048575 ? zzI(obj, i) : (i11 & i12) != 0;
    }

    private static boolean zzK(Object obj, int i, zzeo zzeoVar) {
        return zzeoVar.zzk(zzfp.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzcs) {
            return ((zzcs) obj).zzw();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i10) {
        return zzfp.zzc(obj, (long) (zzp(i10) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j4) {
        return ((Boolean) zzfp.zzf(obj, j4)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzfx zzfxVar) throws IOException {
        if (obj instanceof String) {
            zzfxVar.zzG(i, (String) obj);
        } else {
            zzfxVar.zzd(i, (zzbq) obj);
        }
    }

    public static zzfg zzd(Object obj) {
        zzcs zzcsVar = (zzcs) obj;
        zzfg zzfgVar = zzcsVar.zzc;
        if (zzfgVar != zzfg.zzc()) {
            return zzfgVar;
        }
        zzfg zzfgVarZzf = zzfg.zzf();
        zzcsVar.zzc = zzfgVarZzf;
        return zzfgVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.play_billing.zzef zzl(java.lang.Class r32, com.google.android.gms.internal.play_billing.zzdz r33, com.google.android.gms.internal.play_billing.zzei r34, com.google.android.gms.internal.play_billing.zzdq r35, com.google.android.gms.internal.play_billing.zzff r36, com.google.android.gms.internal.play_billing.zzce r37, com.google.android.gms.internal.play_billing.zzdx r38) {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzl(java.lang.Class, com.google.android.gms.internal.play_billing.zzdz, com.google.android.gms.internal.play_billing.zzei, com.google.android.gms.internal.play_billing.zzdq, com.google.android.gms.internal.play_billing.zzff, com.google.android.gms.internal.play_billing.zzce, com.google.android.gms.internal.play_billing.zzdx):com.google.android.gms.internal.play_billing.zzef");
    }

    private static double zzm(Object obj, long j4) {
        return ((Double) zzfp.zzf(obj, j4)).doubleValue();
    }

    private static float zzn(Object obj, long j4) {
        return ((Float) zzfp.zzf(obj, j4)).floatValue();
    }

    private static int zzo(Object obj, long j4) {
        return ((Integer) zzfp.zzf(obj, j4)).intValue();
    }

    private final int zzp(int i) {
        return this.zzc[i + 2];
    }

    private final int zzq(int i, int i10) {
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

    private static int zzr(int i) {
        return (i >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    private final int zzs(int i) {
        return this.zzc[i + 1];
    }

    private static long zzt(Object obj, long j4) {
        return ((Long) zzfp.zzf(obj, j4)).longValue();
    }

    private final zzcw zzu(int i) {
        int i10 = i / 3;
        return (zzcw) this.zzd[i10 + i10 + 1];
    }

    private final zzeo zzv(int i) {
        Object[] objArr = this.zzd;
        int i10 = i / 3;
        int i11 = i10 + i10;
        zzeo zzeoVar = (zzeo) objArr[i11];
        if (zzeoVar != null) {
            return zzeoVar;
        }
        zzeo zzeoVarZzb = zzel.zza().zzb((Class) objArr[i11 + 1]);
        this.zzd[i11] = zzeoVarZzb;
        return zzeoVarZzb;
    }

    private final Object zzw(int i) {
        int i10 = i / 3;
        return this.zzd[i10 + i10];
    }

    private final Object zzx(Object obj, int i) {
        zzeo zzeoVarZzv = zzv(i);
        int iZzs = zzs(i) & 1048575;
        if (!zzI(obj, i)) {
            return zzeoVarZzv.zze();
        }
        Object object = zzb.getObject(obj, iZzs);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzeoVarZzv.zze();
        if (object != null) {
            zzeoVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzy(Object obj, int i, int i10) {
        zzeo zzeoVarZzv = zzv(i10);
        if (!zzM(obj, i, i10)) {
            return zzeoVarZzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i10) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzeoVarZzv.zze();
        if (object != null) {
            zzeoVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzz(Class cls, String str) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0211  */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 2078
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zza(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i10;
        int iFloatToIntBits;
        int iZzc;
        int i11;
        int i12 = 0;
        for (int i13 = 0; i13 < this.zzc.length; i13 += 3) {
            int iZzs = zzs(i13);
            int[] iArr = this.zzc;
            int i14 = 1048575 & iZzs;
            int iZzr = zzr(iZzs);
            int i15 = iArr[i13];
            long j4 = i14;
            int iHashCode = 37;
            switch (iZzr) {
                case 0:
                    i = i12 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzfp.zza(obj, j4));
                    byte[] bArr = zzda.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i + iZzc;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzfp.zzb(obj, j4));
                    i12 = iFloatToIntBits + i10;
                    break;
                case 2:
                    i = i12 * 53;
                    jDoubleToLongBits = zzfp.zzd(obj, j4);
                    byte[] bArr2 = zzda.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i + iZzc;
                    break;
                case 3:
                    i = i12 * 53;
                    jDoubleToLongBits = zzfp.zzd(obj, j4);
                    byte[] bArr3 = zzda.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i + iZzc;
                    break;
                case 4:
                    i = i12 * 53;
                    iZzc = zzfp.zzc(obj, j4);
                    i12 = i + iZzc;
                    break;
                case 5:
                    i = i12 * 53;
                    jDoubleToLongBits = zzfp.zzd(obj, j4);
                    byte[] bArr4 = zzda.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i + iZzc;
                    break;
                case 6:
                    i = i12 * 53;
                    iZzc = zzfp.zzc(obj, j4);
                    i12 = i + iZzc;
                    break;
                case 7:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzda.zza(zzfp.zzw(obj, j4));
                    i12 = iFloatToIntBits + i10;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iFloatToIntBits = ((String) zzfp.zzf(obj, j4)).hashCode();
                    i12 = iFloatToIntBits + i10;
                    break;
                case 9:
                    i11 = i12 * 53;
                    Object objZzf = zzfp.zzf(obj, j4);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i12 = i11 + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzfp.zzf(obj, j4).hashCode();
                    i12 = iFloatToIntBits + i10;
                    break;
                case 11:
                    i = i12 * 53;
                    iZzc = zzfp.zzc(obj, j4);
                    i12 = i + iZzc;
                    break;
                case 12:
                    i = i12 * 53;
                    iZzc = zzfp.zzc(obj, j4);
                    i12 = i + iZzc;
                    break;
                case 13:
                    i = i12 * 53;
                    iZzc = zzfp.zzc(obj, j4);
                    i12 = i + iZzc;
                    break;
                case 14:
                    i = i12 * 53;
                    jDoubleToLongBits = zzfp.zzd(obj, j4);
                    byte[] bArr5 = zzda.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i + iZzc;
                    break;
                case 15:
                    i = i12 * 53;
                    iZzc = zzfp.zzc(obj, j4);
                    i12 = i + iZzc;
                    break;
                case 16:
                    i = i12 * 53;
                    jDoubleToLongBits = zzfp.zzd(obj, j4);
                    byte[] bArr6 = zzda.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i + iZzc;
                    break;
                case 17:
                    i11 = i12 * 53;
                    Object objZzf2 = zzfp.zzf(obj, j4);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i12 = i11 + iHashCode;
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
                    i10 = i12 * 53;
                    iFloatToIntBits = zzfp.zzf(obj, j4).hashCode();
                    i12 = iFloatToIntBits + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzfp.zzf(obj, j4).hashCode();
                    i12 = iFloatToIntBits + i10;
                    break;
                case 51:
                    if (zzM(obj, i15, i13)) {
                        i = i12 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzm(obj, j4));
                        byte[] bArr7 = zzda.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzn(obj, j4));
                        i12 = iFloatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i15, i13)) {
                        i = i12 * 53;
                        jDoubleToLongBits = zzt(obj, j4);
                        byte[] bArr8 = zzda.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i15, i13)) {
                        i = i12 * 53;
                        jDoubleToLongBits = zzt(obj, j4);
                        byte[] bArr9 = zzda.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i15, i13)) {
                        i = i12 * 53;
                        iZzc = zzo(obj, j4);
                        i12 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i15, i13)) {
                        i = i12 * 53;
                        jDoubleToLongBits = zzt(obj, j4);
                        byte[] bArr10 = zzda.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i15, i13)) {
                        i = i12 * 53;
                        iZzc = zzo(obj, j4);
                        i12 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzda.zza(zzN(obj, j4));
                        i12 = iFloatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = ((String) zzfp.zzf(obj, j4)).hashCode();
                        i12 = iFloatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzM(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzfp.zzf(obj, j4).hashCode();
                        i12 = iFloatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzfp.zzf(obj, j4).hashCode();
                        i12 = iFloatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i15, i13)) {
                        i = i12 * 53;
                        iZzc = zzo(obj, j4);
                        i12 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i15, i13)) {
                        i = i12 * 53;
                        iZzc = zzo(obj, j4);
                        i12 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i15, i13)) {
                        i = i12 * 53;
                        iZzc = zzo(obj, j4);
                        i12 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(obj, i15, i13)) {
                        i = i12 * 53;
                        jDoubleToLongBits = zzt(obj, j4);
                        byte[] bArr11 = zzda.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(obj, i15, i13)) {
                        i = i12 * 53;
                        iZzc = zzo(obj, j4);
                        i12 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(obj, i15, i13)) {
                        i = i12 * 53;
                        jDoubleToLongBits = zzt(obj, j4);
                        byte[] bArr12 = zzda.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzfp.zzf(obj, j4).hashCode();
                        i12 = iFloatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = this.zzm.zzd(obj).hashCode() + (i12 * 53);
        return this.zzh ? (iHashCode2 * 53) + this.zzn.zzb(obj).zza.hashCode() : iHashCode2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:570:0x0f0d, code lost:
    
        if (r13 == r6) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0f0f, code lost:
    
        r29.putInt(r8, r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0f15, code lost:
    
        r1 = r0.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0f19, code lost:
    
        if (r1 >= r0.zzk) goto L682;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0f1b, code lost:
    
        r2 = r0.zzi;
        r3 = r0.zzc;
        r2 = r2[r1];
        r3 = r3[r2];
        r3 = com.google.android.gms.internal.play_billing.zzfp.zzf(r8, r0.zzs(r2) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0f31, code lost:
    
        if (r3 != null) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0f3a, code lost:
    
        if (r0.zzu(r2) != null) goto L681;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0f3d, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0f40, code lost:
    
        r3 = (com.google.android.gms.internal.play_billing.zzdw) r3;
        r1 = (com.google.android.gms.internal.play_billing.zzdv) r0.zzw(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0f48, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0f49, code lost:
    
        if (r10 != 0) goto L589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0f4b, code lost:
    
        if (r7 != r4) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x0f52, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzdc.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0f53, code lost:
    
        if (r7 > r4) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x0f55, code lost:
    
        if (r15 != r10) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0f57, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x0f5c, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzdc.zze();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0bba A[PHI: r0 r1 r2 r3 r4 r6 r10 r12 r22
  0x0bba: PHI (r0v34 com.google.android.gms.internal.play_billing.zzef<T>) = 
  (r0v2 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v2 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v2 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v2 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v32 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v2 com.google.android.gms.internal.play_billing.zzef<T>)
 binds: [B:452:0x0b91, B:436:0x0b32, B:420:0x0adb, B:344:0x0965, B:216:0x06cd, B:198:0x065d] A[DONT_GENERATE, DONT_INLINE]
  0x0bba: PHI (r1v145 int) = (r1v83 int), (r1v85 int), (r1v87 int), (r1v107 int), (r1v134 int), (r1v150 int) binds: [B:452:0x0b91, B:436:0x0b32, B:420:0x0adb, B:344:0x0965, B:216:0x06cd, B:198:0x065d] A[DONT_GENERATE, DONT_INLINE]
  0x0bba: PHI (r2v126 byte[]) = (r2v103 byte[]), (r2v104 byte[]), (r2v105 byte[]), (r2v113 byte[]), (r2v121 byte[]), (r2v131 byte[]) binds: [B:452:0x0b91, B:436:0x0b32, B:420:0x0adb, B:344:0x0965, B:216:0x06cd, B:198:0x065d] A[DONT_GENERATE, DONT_INLINE]
  0x0bba: PHI (r3v128 int) = (r3v84 int), (r3v85 int), (r3v86 int), (r3v98 int), (r3v121 int), (r3v135 int) binds: [B:452:0x0b91, B:436:0x0b32, B:420:0x0adb, B:344:0x0965, B:216:0x06cd, B:198:0x065d] A[DONT_GENERATE, DONT_INLINE]
  0x0bba: PHI (r4v128 com.google.android.gms.internal.play_billing.zzbc) = 
  (r4v77 com.google.android.gms.internal.play_billing.zzbc)
  (r4v78 com.google.android.gms.internal.play_billing.zzbc)
  (r4v79 com.google.android.gms.internal.play_billing.zzbc)
  (r4v108 com.google.android.gms.internal.play_billing.zzbc)
  (r4v121 com.google.android.gms.internal.play_billing.zzbc)
  (r4v133 com.google.android.gms.internal.play_billing.zzbc)
 binds: [B:452:0x0b91, B:436:0x0b32, B:420:0x0adb, B:344:0x0965, B:216:0x06cd, B:198:0x065d] A[DONT_GENERATE, DONT_INLINE]
  0x0bba: PHI (r6v89 int) = (r6v55 int), (r6v56 int), (r6v57 int), (r6v69 int), (r6v84 int), (r6v94 int) binds: [B:452:0x0b91, B:436:0x0b32, B:420:0x0adb, B:344:0x0965, B:216:0x06cd, B:198:0x065d] A[DONT_GENERATE, DONT_INLINE]
  0x0bba: PHI (r10v24 sun.misc.Unsafe) = 
  (r10v8 sun.misc.Unsafe)
  (r10v9 sun.misc.Unsafe)
  (r10v10 sun.misc.Unsafe)
  (r10v18 sun.misc.Unsafe)
  (r10v23 sun.misc.Unsafe)
  (r10v28 sun.misc.Unsafe)
 binds: [B:452:0x0b91, B:436:0x0b32, B:420:0x0adb, B:344:0x0965, B:216:0x06cd, B:198:0x065d] A[DONT_GENERATE, DONT_INLINE]
  0x0bba: PHI (r12v69 int) = (r12v56 int), (r12v56 int), (r12v56 int), (r12v56 int), (r12v68 int), (r12v56 int) binds: [B:452:0x0b91, B:436:0x0b32, B:420:0x0adb, B:344:0x0965, B:216:0x06cd, B:198:0x065d] A[DONT_GENERATE, DONT_INLINE]
  0x0bba: PHI (r22v58 int) = (r22v36 int), (r22v37 int), (r22v38 int), (r22v46 int), (r22v55 int), (r22v62 int) binds: [B:452:0x0b91, B:436:0x0b32, B:420:0x0adb, B:344:0x0965, B:216:0x06cd, B:198:0x065d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0bbd  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0e89  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0edd  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0bd3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:647:0x0ea3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.play_billing.zzbc r42) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 4078
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzbc):int");
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final Object zze() {
        return ((zzcs) this.zzg).zzl();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzL(r8)
            if (r0 != 0) goto L8
            goto L91
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.play_billing.zzcs
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.play_billing.zzcs r0 = (com.google.android.gms.internal.play_billing.zzcs) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzu(r2)
            r0.zza = r1
            r0.zzs()
        L1b:
            int[] r0 = r7.zzc
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L83
            int r2 = r7.zzs(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzr(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6d
            r5 = 60
            if (r2 == r5) goto L55
            r5 = 68
            if (r2 == r5) goto L55
            switch(r2) {
                case 17: goto L6d;
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
            goto L80
        L3d:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.play_billing.zzef.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L80
            r6 = r5
            com.google.android.gms.internal.play_billing.zzdw r6 = (com.google.android.gms.internal.play_billing.zzdw) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L80
        L4f:
            com.google.android.gms.internal.play_billing.zzdq r2 = r7.zzl
            r2.zza(r8, r3)
            goto L80
        L55:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzM(r8, r2, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.play_billing.zzeo r2 = r7.zzv(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.play_billing.zzef.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
            goto L80
        L6d:
            boolean r2 = r7.zzI(r8, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.play_billing.zzeo r2 = r7.zzv(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.play_billing.zzef.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
        L80:
            int r1 = r1 + 3
            goto L1d
        L83:
            com.google.android.gms.internal.play_billing.zzff r0 = r7.zzm
            r0.zzg(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L91
            com.google.android.gms.internal.play_billing.zzce r0 = r7.zzn
            r0.zzd(r8)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzs = zzs(i);
            int i10 = 1048575 & iZzs;
            int[] iArr = this.zzc;
            int iZzr = zzr(iZzs);
            int i11 = iArr[i];
            long j4 = i10;
            switch (iZzr) {
                case 0:
                    if (zzI(obj2, i)) {
                        zzfp.zzo(obj, j4, zzfp.zza(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzI(obj2, i)) {
                        zzfp.zzp(obj, j4, zzfp.zzb(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j4, zzfp.zzd(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j4, zzfp.zzd(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j4, zzfp.zzc(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j4, zzfp.zzd(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j4, zzfp.zzc(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzI(obj2, i)) {
                        zzfp.zzm(obj, j4, zzfp.zzw(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzI(obj2, i)) {
                        zzfp.zzs(obj, j4, zzfp.zzf(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzI(obj2, i)) {
                        zzfp.zzs(obj, j4, zzfp.zzf(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j4, zzfp.zzc(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j4, zzfp.zzc(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j4, zzfp.zzc(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j4, zzfp.zzd(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j4, zzfp.zzc(obj2, j4));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j4, zzfp.zzd(obj2, j4));
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
                    int i12 = zzeq.zza;
                    zzfp.zzs(obj, j4, zzdx.zza(zzfp.zzf(obj, j4), zzfp.zzf(obj2, j4)));
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
                    if (zzM(obj2, i11, i)) {
                        zzfp.zzs(obj, j4, zzfp.zzf(obj2, j4));
                        zzE(obj, i11, i);
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
                    if (zzM(obj2, i11, i)) {
                        zzfp.zzs(obj, j4, zzfp.zzf(obj2, j4));
                        zzE(obj, i11, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zzeq.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzeq.zzp(this.zzn, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzh(Object obj, byte[] bArr, int i, int i10, zzbc zzbcVar) throws IOException {
        zzc(obj, bArr, i, i10, 0, zzbcVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(java.lang.Object r20, com.google.android.gms.internal.play_billing.zzfx r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzi(java.lang.Object, com.google.android.gms.internal.play_billing.zzfx):void");
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzG;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzs = zzs(i);
            long j4 = iZzs & 1048575;
            switch (zzr(iZzs)) {
                case 0:
                    if (!zzH(obj, obj2, i) || Double.doubleToLongBits(zzfp.zza(obj, j4)) != Double.doubleToLongBits(zzfp.zza(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i) || Float.floatToIntBits(zzfp.zzb(obj, j4)) != Float.floatToIntBits(zzfp.zzb(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i) || zzfp.zzd(obj, j4) != zzfp.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i) || zzfp.zzd(obj, j4) != zzfp.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i) || zzfp.zzc(obj, j4) != zzfp.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i) || zzfp.zzd(obj, j4) != zzfp.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i) || zzfp.zzc(obj, j4) != zzfp.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i) || zzfp.zzw(obj, j4) != zzfp.zzw(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i) || !zzeq.zzG(zzfp.zzf(obj, j4), zzfp.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i) || !zzeq.zzG(zzfp.zzf(obj, j4), zzfp.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i) || !zzeq.zzG(zzfp.zzf(obj, j4), zzfp.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i) || zzfp.zzc(obj, j4) != zzfp.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i) || zzfp.zzc(obj, j4) != zzfp.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i) || zzfp.zzc(obj, j4) != zzfp.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i) || zzfp.zzd(obj, j4) != zzfp.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i) || zzfp.zzc(obj, j4) != zzfp.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i) || zzfp.zzd(obj, j4) != zzfp.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i) || !zzeq.zzG(zzfp.zzf(obj, j4), zzfp.zzf(obj2, j4))) {
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
                    zZzG = zzeq.zzG(zzfp.zzf(obj, j4), zzfp.zzf(obj2, j4));
                    break;
                case 50:
                    zZzG = zzeq.zzG(zzfp.zzf(obj, j4), zzfp.zzf(obj2, j4));
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
                    long jZzp = zzp(i) & 1048575;
                    if (zzfp.zzc(obj, jZzp) != zzfp.zzc(obj2, jZzp) || !zzeq.zzG(zzfp.zzf(obj, j4), zzfp.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzG) {
                return false;
            }
        }
        if (!this.zzm.zzd(obj).equals(this.zzm.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzn.zzb(obj).equals(this.zzn.zzb(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzk(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzk(java.lang.Object):boolean");
    }
}
