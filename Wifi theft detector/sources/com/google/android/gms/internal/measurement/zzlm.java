package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class zzlm<T> implements zzlu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmv.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlj zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkx zzm;
    private final zzml zzn;
    private final zzjp zzo;
    private final zzlo zzp;
    private final zzle zzq;

    private zzlm(int[] iArr, Object[] objArr, int i10, int i11, zzlj zzljVar, boolean z10, boolean z11, int[] iArr2, int i12, int i13, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = z10;
        boolean z12 = false;
        if (zzjpVar != null && zzjpVar.zzc(zzljVar)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzp = zzloVar;
        this.zzm = zzkxVar;
        this.zzn = zzmlVar;
        this.zzo = zzjpVar;
        this.zzg = zzljVar;
        this.zzq = zzleVar;
    }

    private static int zzA(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzB(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzC(Object obj, long j10) {
        return ((Long) zzmv.zzf(obj, j10)).longValue();
    }

    private final zzkg zzD(int i10) {
        int i11 = i10 / 3;
        return (zzkg) this.zzd[i11 + i11 + 1];
    }

    private final zzlu zzE(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzlu zzluVar = (zzlu) this.zzd[i12];
        if (zzluVar != null) {
            return zzluVar;
        }
        zzlu zzluVarZzb = zzlr.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzluVarZzb;
        return zzluVarZzb;
    }

    private final Object zzF(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private static Field zzG(Class cls, String str) {
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

    private final void zzH(Object obj, Object obj2, int i10) {
        long jZzB = zzB(i10) & 1048575;
        if (zzO(obj2, i10)) {
            Object objZzf = zzmv.zzf(obj, jZzB);
            Object objZzf2 = zzmv.zzf(obj2, jZzB);
            if (objZzf != null && objZzf2 != null) {
                zzmv.zzs(obj, jZzB, zzkk.zzg(objZzf, objZzf2));
                zzJ(obj, i10);
            } else if (objZzf2 != null) {
                zzmv.zzs(obj, jZzB, objZzf2);
                zzJ(obj, i10);
            }
        }
    }

    private final void zzI(Object obj, Object obj2, int i10) {
        int iZzB = zzB(i10);
        int i11 = this.zzc[i10];
        long j10 = iZzB & 1048575;
        if (zzR(obj2, i11, i10)) {
            Object objZzf = zzR(obj, i11, i10) ? zzmv.zzf(obj, j10) : null;
            Object objZzf2 = zzmv.zzf(obj2, j10);
            if (objZzf != null && objZzf2 != null) {
                zzmv.zzs(obj, j10, zzkk.zzg(objZzf, objZzf2));
                zzK(obj, i11, i10);
            } else if (objZzf2 != null) {
                zzmv.zzs(obj, j10, objZzf2);
                zzK(obj, i11, i10);
            }
        }
    }

    private final void zzJ(Object obj, int i10) {
        int iZzy = zzy(i10);
        long j10 = 1048575 & iZzy;
        if (j10 == 1048575) {
            return;
        }
        zzmv.zzq(obj, j10, (1 << (iZzy >>> 20)) | zzmv.zzc(obj, j10));
    }

    private final void zzK(Object obj, int i10, int i11) {
        zzmv.zzq(obj, zzy(i11) & 1048575, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzL(Object obj, zznd zzndVar) throws IOException {
        int i10;
        boolean z10;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int iZzB = zzB(i13);
            int[] iArr = this.zzc;
            int i15 = iArr[i13];
            int iZzA = zzA(iZzB);
            if (iZzA <= 17) {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i14 = unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            long j10 = iZzB & i11;
            switch (iZzA) {
                case 0:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzf(i15, zzmv.zza(obj, j10));
                        break;
                    }
                case 1:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzo(i15, zzmv.zzb(obj, j10));
                        break;
                    }
                case 2:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzt(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                case 3:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzJ(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                case 4:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzr(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                case 5:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzm(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                case 6:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzk(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                case 7:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzb(i15, zzmv.zzw(obj, j10));
                        break;
                    }
                case 8:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzT(i15, unsafe.getObject(obj, j10), zzndVar);
                        break;
                    }
                case 9:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzv(i15, unsafe.getObject(obj, j10), zzE(i13));
                        break;
                    }
                case 10:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzd(i15, (zzjb) unsafe.getObject(obj, j10));
                        break;
                    }
                case 11:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzH(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                case 12:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzi(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                case 13:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzw(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                case 14:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzy(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                case 15:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzA(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                case 16:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzC(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                case 17:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        zzndVar.zzq(i15, unsafe.getObject(obj, j10), zzE(i13));
                        break;
                    }
                case 18:
                    zzlw.zzJ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 19:
                    zzlw.zzN(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 20:
                    zzlw.zzQ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 21:
                    zzlw.zzY(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 22:
                    zzlw.zzP(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 23:
                    zzlw.zzM(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 24:
                    zzlw.zzL(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 25:
                    zzlw.zzH(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 26:
                    zzlw.zzW(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar);
                    break;
                case 27:
                    zzlw.zzR(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, zzE(i13));
                    break;
                case 28:
                    zzlw.zzI(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar);
                    break;
                case 29:
                    z10 = false;
                    zzlw.zzX(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 30:
                    z10 = false;
                    zzlw.zzK(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 31:
                    z10 = false;
                    zzlw.zzS(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 32:
                    z10 = false;
                    zzlw.zzT(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 33:
                    z10 = false;
                    zzlw.zzU(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 34:
                    z10 = false;
                    zzlw.zzV(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 35:
                    zzlw.zzJ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 36:
                    zzlw.zzN(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 37:
                    zzlw.zzQ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 38:
                    zzlw.zzY(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 39:
                    zzlw.zzP(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 40:
                    zzlw.zzM(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 41:
                    zzlw.zzL(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 42:
                    zzlw.zzH(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 43:
                    zzlw.zzX(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 44:
                    zzlw.zzK(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 45:
                    zzlw.zzS(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 46:
                    zzlw.zzT(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 47:
                    zzlw.zzU(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 48:
                    zzlw.zzV(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 49:
                    zzlw.zzO(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, zzE(i13));
                    break;
                case 50:
                    zzM(zzndVar, i15, unsafe.getObject(obj, j10), i13);
                    break;
                case 51:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzf(i15, zzn(obj, j10));
                    }
                    break;
                case 52:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzo(i15, zzo(obj, j10));
                    }
                    break;
                case 53:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzt(i15, zzC(obj, j10));
                    }
                    break;
                case 54:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzJ(i15, zzC(obj, j10));
                    }
                    break;
                case 55:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzr(i15, zzr(obj, j10));
                    }
                    break;
                case 56:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzm(i15, zzC(obj, j10));
                    }
                    break;
                case 57:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzk(i15, zzr(obj, j10));
                    }
                    break;
                case 58:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzb(i15, zzS(obj, j10));
                    }
                    break;
                case 59:
                    if (zzR(obj, i15, i13)) {
                        zzT(i15, unsafe.getObject(obj, j10), zzndVar);
                    }
                    break;
                case 60:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzv(i15, unsafe.getObject(obj, j10), zzE(i13));
                    }
                    break;
                case 61:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzd(i15, (zzjb) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzH(i15, zzr(obj, j10));
                    }
                    break;
                case 63:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzi(i15, zzr(obj, j10));
                    }
                    break;
                case 64:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzw(i15, zzr(obj, j10));
                    }
                    break;
                case 65:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzy(i15, zzC(obj, j10));
                    }
                    break;
                case 66:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzA(i15, zzr(obj, j10));
                    }
                    break;
                case 67:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzC(i15, zzC(obj, j10));
                    }
                    break;
                case 68:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzq(i15, unsafe.getObject(obj, j10), zzE(i13));
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        zzml zzmlVar = this.zzn;
        zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
    }

    private final void zzM(zznd zzndVar, int i10, Object obj, int i11) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzN(Object obj, Object obj2, int i10) {
        return zzO(obj, i10) == zzO(obj2, i10);
    }

    private final boolean zzO(Object obj, int i10) {
        int iZzy = zzy(i10);
        long j10 = iZzy & 1048575;
        if (j10 != 1048575) {
            return (zzmv.zzc(obj, j10) & (1 << (iZzy >>> 20))) != 0;
        }
        int iZzB = zzB(i10);
        long j11 = iZzB & 1048575;
        switch (zzA(iZzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmv.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmv.zzb(obj, j11)) != 0;
            case 2:
                return zzmv.zzd(obj, j11) != 0;
            case 3:
                return zzmv.zzd(obj, j11) != 0;
            case 4:
                return zzmv.zzc(obj, j11) != 0;
            case 5:
                return zzmv.zzd(obj, j11) != 0;
            case 6:
                return zzmv.zzc(obj, j11) != 0;
            case 7:
                return zzmv.zzw(obj, j11);
            case 8:
                Object objZzf = zzmv.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzjb) {
                    return !zzjb.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmv.zzf(obj, j11) != null;
            case 10:
                return !zzjb.zzb.equals(zzmv.zzf(obj, j11));
            case 11:
                return zzmv.zzc(obj, j11) != 0;
            case 12:
                return zzmv.zzc(obj, j11) != 0;
            case 13:
                return zzmv.zzc(obj, j11) != 0;
            case 14:
                return zzmv.zzd(obj, j11) != 0;
            case 15:
                return zzmv.zzc(obj, j11) != 0;
            case 16:
                return zzmv.zzd(obj, j11) != 0;
            case 17:
                return zzmv.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzP(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzO(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzQ(Object obj, int i10, zzlu zzluVar) {
        return zzluVar.zzk(zzmv.zzf(obj, i10 & 1048575));
    }

    private final boolean zzR(Object obj, int i10, int i11) {
        return zzmv.zzc(obj, (long) (zzy(i11) & 1048575)) == i10;
    }

    private static boolean zzS(Object obj, long j10) {
        return ((Boolean) zzmv.zzf(obj, j10)).booleanValue();
    }

    private static final void zzT(int i10, Object obj, zznd zzndVar) throws IOException {
        if (obj instanceof String) {
            zzndVar.zzF(i10, (String) obj);
        } else {
            zzndVar.zzd(i10, (zzjb) obj);
        }
    }

    public static zzmm zzd(Object obj) {
        zzkc zzkcVar = (zzkc) obj;
        zzmm zzmmVar = zzkcVar.zzc;
        if (zzmmVar != zzmm.zzc()) {
            return zzmmVar;
        }
        zzmm zzmmVarZze = zzmm.zze();
        zzkcVar.zzc = zzmmVarZze;
        return zzmmVarZze;
    }

    public static zzlm zzl(Class cls, zzlg zzlgVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
        if (zzlgVar instanceof zzlt) {
            return zzm((zzlt) zzlgVar, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.measurement.zzlm zzm(com.google.android.gms.internal.measurement.zzlt r34, com.google.android.gms.internal.measurement.zzlo r35, com.google.android.gms.internal.measurement.zzkx r36, com.google.android.gms.internal.measurement.zzml r37, com.google.android.gms.internal.measurement.zzjp r38, com.google.android.gms.internal.measurement.zzle r39) {
        /*
            Method dump skipped, instructions count: 995
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzm(com.google.android.gms.internal.measurement.zzlt, com.google.android.gms.internal.measurement.zzlo, com.google.android.gms.internal.measurement.zzkx, com.google.android.gms.internal.measurement.zzml, com.google.android.gms.internal.measurement.zzjp, com.google.android.gms.internal.measurement.zzle):com.google.android.gms.internal.measurement.zzlm");
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzmv.zzf(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzmv.zzf(obj, j10)).floatValue();
    }

    private final int zzp(Object obj) {
        int i10;
        int iZzA;
        int iZzA2;
        int iZzA3;
        int iZzB;
        int iZzA4;
        int iZzv;
        int iZzA5;
        int iZzA6;
        int iZzd;
        int iZzA7;
        int iZzo;
        int iZzz;
        int iZzA8;
        int i11;
        Unsafe unsafe = zzb;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        for (int i15 = 0; i15 < this.zzc.length; i15 += 3) {
            int iZzB2 = zzB(i15);
            int[] iArr = this.zzc;
            int i16 = iArr[i15];
            int iZzA9 = zzA(iZzB2);
            if (iZzA9 <= 17) {
                int i17 = iArr[i15 + 2];
                int i18 = i17 & 1048575;
                i10 = 1 << (i17 >>> 20);
                if (i18 != i14) {
                    i13 = unsafe.getInt(obj, i18);
                    i14 = i18;
                }
            } else {
                i10 = 0;
            }
            long j10 = iZzB2 & 1048575;
            switch (iZzA9) {
                case 0:
                    if ((i13 & i10) != 0) {
                        iZzA = zzjj.zzA(i16 << 3);
                        iZzo = iZzA + 8;
                        i12 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i13 & i10) != 0) {
                        iZzA2 = zzjj.zzA(i16 << 3);
                        iZzo = iZzA2 + 4;
                        i12 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i13 & i10) != 0) {
                        long j11 = unsafe.getLong(obj, j10);
                        iZzA3 = zzjj.zzA(i16 << 3);
                        iZzB = zzjj.zzB(j11);
                        i12 += iZzA3 + iZzB;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i13 & i10) != 0) {
                        long j12 = unsafe.getLong(obj, j10);
                        iZzA3 = zzjj.zzA(i16 << 3);
                        iZzB = zzjj.zzB(j12);
                        i12 += iZzA3 + iZzB;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i13 & i10) != 0) {
                        int i19 = unsafe.getInt(obj, j10);
                        iZzA4 = zzjj.zzA(i16 << 3);
                        iZzv = zzjj.zzv(i19);
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i13 & i10) != 0) {
                        iZzA = zzjj.zzA(i16 << 3);
                        iZzo = iZzA + 8;
                        i12 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i13 & i10) != 0) {
                        iZzA2 = zzjj.zzA(i16 << 3);
                        iZzo = iZzA2 + 4;
                        i12 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i13 & i10) != 0) {
                        iZzA5 = zzjj.zzA(i16 << 3);
                        iZzo = iZzA5 + 1;
                        i12 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i13 & i10) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzjb) {
                            iZzA6 = zzjj.zzA(i16 << 3);
                            iZzd = ((zzjb) object).zzd();
                            iZzA7 = zzjj.zzA(iZzd);
                            i11 = iZzA6 + iZzA7 + iZzd;
                            i12 += i11;
                            break;
                        } else {
                            iZzA4 = zzjj.zzA(i16 << 3);
                            iZzv = zzjj.zzy((String) object);
                            i11 = iZzA4 + iZzv;
                            i12 += i11;
                        }
                    }
                case 9:
                    if ((i13 & i10) != 0) {
                        iZzo = zzlw.zzo(i16, unsafe.getObject(obj, j10), zzE(i15));
                        i12 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i13 & i10) != 0) {
                        zzjb zzjbVar = (zzjb) unsafe.getObject(obj, j10);
                        iZzA6 = zzjj.zzA(i16 << 3);
                        iZzd = zzjbVar.zzd();
                        iZzA7 = zzjj.zzA(iZzd);
                        i11 = iZzA6 + iZzA7 + iZzd;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i13 & i10) != 0) {
                        int i20 = unsafe.getInt(obj, j10);
                        iZzA4 = zzjj.zzA(i16 << 3);
                        iZzv = zzjj.zzA(i20);
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i13 & i10) != 0) {
                        int i21 = unsafe.getInt(obj, j10);
                        iZzA4 = zzjj.zzA(i16 << 3);
                        iZzv = zzjj.zzv(i21);
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i13 & i10) != 0) {
                        iZzA2 = zzjj.zzA(i16 << 3);
                        iZzo = iZzA2 + 4;
                        i12 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i13 & i10) != 0) {
                        iZzA = zzjj.zzA(i16 << 3);
                        iZzo = iZzA + 8;
                        i12 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i13 & i10) != 0) {
                        int i22 = unsafe.getInt(obj, j10);
                        iZzA4 = zzjj.zzA(i16 << 3);
                        iZzv = zzjj.zzA((i22 >> 31) ^ (i22 + i22));
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i10 & i13) != 0) {
                        long j13 = unsafe.getLong(obj, j10);
                        iZzA4 = zzjj.zzA(i16 << 3);
                        iZzv = zzjj.zzB((j13 >> 63) ^ (j13 + j13));
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i13 & i10) != 0) {
                        iZzo = zzjj.zzu(i16, (zzlj) unsafe.getObject(obj, j10), zzE(i15));
                        i12 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iZzo = zzlw.zzh(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iZzo;
                    break;
                case 19:
                    iZzo = zzlw.zzf(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iZzo;
                    break;
                case 20:
                    iZzo = zzlw.zzm(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iZzo;
                    break;
                case 21:
                    iZzo = zzlw.zzx(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iZzo;
                    break;
                case 22:
                    iZzo = zzlw.zzk(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iZzo;
                    break;
                case 23:
                    iZzo = zzlw.zzh(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iZzo;
                    break;
                case 24:
                    iZzo = zzlw.zzf(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iZzo;
                    break;
                case 25:
                    iZzo = zzlw.zza(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iZzo;
                    break;
                case 26:
                    iZzo = zzlw.zzu(i16, (List) unsafe.getObject(obj, j10));
                    i12 += iZzo;
                    break;
                case 27:
                    iZzo = zzlw.zzp(i16, (List) unsafe.getObject(obj, j10), zzE(i15));
                    i12 += iZzo;
                    break;
                case 28:
                    iZzo = zzlw.zzc(i16, (List) unsafe.getObject(obj, j10));
                    i12 += iZzo;
                    break;
                case 29:
                    iZzo = zzlw.zzv(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iZzo;
                    break;
                case 30:
                    iZzo = zzlw.zzd(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iZzo;
                    break;
                case 31:
                    iZzo = zzlw.zzf(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iZzo;
                    break;
                case 32:
                    iZzo = zzlw.zzh(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iZzo;
                    break;
                case 33:
                    iZzo = zzlw.zzq(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iZzo;
                    break;
                case 34:
                    iZzo = zzlw.zzs(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iZzo;
                    break;
                case 35:
                    iZzv = zzlw.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i16);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    iZzv = zzlw.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i16);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    iZzv = zzlw.zzn((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i16);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    iZzv = zzlw.zzy((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i16);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    iZzv = zzlw.zzl((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i16);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    iZzv = zzlw.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i16);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    iZzv = zzlw.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i16);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    iZzv = zzlw.zzb((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i16);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    iZzv = zzlw.zzw((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i16);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    iZzv = zzlw.zze((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i16);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    iZzv = zzlw.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i16);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    iZzv = zzlw.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i16);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    iZzv = zzlw.zzr((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i16);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    iZzv = zzlw.zzt((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i16);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    iZzo = zzlw.zzj(i16, (List) unsafe.getObject(obj, j10), zzE(i15));
                    i12 += iZzo;
                    break;
                case 50:
                    zzle.zza(i16, unsafe.getObject(obj, j10), zzF(i15));
                    break;
                case 51:
                    if (zzR(obj, i16, i15)) {
                        iZzA = zzjj.zzA(i16 << 3);
                        iZzo = iZzA + 8;
                        i12 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i16, i15)) {
                        iZzA2 = zzjj.zzA(i16 << 3);
                        iZzo = iZzA2 + 4;
                        i12 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i16, i15)) {
                        long jZzC = zzC(obj, j10);
                        iZzA3 = zzjj.zzA(i16 << 3);
                        iZzB = zzjj.zzB(jZzC);
                        i12 += iZzA3 + iZzB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i16, i15)) {
                        long jZzC2 = zzC(obj, j10);
                        iZzA3 = zzjj.zzA(i16 << 3);
                        iZzB = zzjj.zzB(jZzC2);
                        i12 += iZzA3 + iZzB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i16, i15)) {
                        int iZzr = zzr(obj, j10);
                        iZzA4 = zzjj.zzA(i16 << 3);
                        iZzv = zzjj.zzv(iZzr);
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i16, i15)) {
                        iZzA = zzjj.zzA(i16 << 3);
                        iZzo = iZzA + 8;
                        i12 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i16, i15)) {
                        iZzA2 = zzjj.zzA(i16 << 3);
                        iZzo = iZzA2 + 4;
                        i12 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i16, i15)) {
                        iZzA5 = zzjj.zzA(i16 << 3);
                        iZzo = iZzA5 + 1;
                        i12 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzR(obj, i16, i15)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzjb) {
                            iZzA6 = zzjj.zzA(i16 << 3);
                            iZzd = ((zzjb) object2).zzd();
                            iZzA7 = zzjj.zzA(iZzd);
                            i11 = iZzA6 + iZzA7 + iZzd;
                            i12 += i11;
                            break;
                        } else {
                            iZzA4 = zzjj.zzA(i16 << 3);
                            iZzv = zzjj.zzy((String) object2);
                            i11 = iZzA4 + iZzv;
                            i12 += i11;
                        }
                    }
                case 60:
                    if (zzR(obj, i16, i15)) {
                        iZzo = zzlw.zzo(i16, unsafe.getObject(obj, j10), zzE(i15));
                        i12 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i16, i15)) {
                        zzjb zzjbVar2 = (zzjb) unsafe.getObject(obj, j10);
                        iZzA6 = zzjj.zzA(i16 << 3);
                        iZzd = zzjbVar2.zzd();
                        iZzA7 = zzjj.zzA(iZzd);
                        i11 = iZzA6 + iZzA7 + iZzd;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i16, i15)) {
                        int iZzr2 = zzr(obj, j10);
                        iZzA4 = zzjj.zzA(i16 << 3);
                        iZzv = zzjj.zzA(iZzr2);
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i16, i15)) {
                        int iZzr3 = zzr(obj, j10);
                        iZzA4 = zzjj.zzA(i16 << 3);
                        iZzv = zzjj.zzv(iZzr3);
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i16, i15)) {
                        iZzA2 = zzjj.zzA(i16 << 3);
                        iZzo = iZzA2 + 4;
                        i12 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i16, i15)) {
                        iZzA = zzjj.zzA(i16 << 3);
                        iZzo = iZzA + 8;
                        i12 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i16, i15)) {
                        int iZzr4 = zzr(obj, j10);
                        iZzA4 = zzjj.zzA(i16 << 3);
                        iZzv = zzjj.zzA((iZzr4 >> 31) ^ (iZzr4 + iZzr4));
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i16, i15)) {
                        long jZzC3 = zzC(obj, j10);
                        iZzA4 = zzjj.zzA(i16 << 3);
                        iZzv = zzjj.zzB((jZzC3 >> 63) ^ (jZzC3 + jZzC3));
                        i11 = iZzA4 + iZzv;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i16, i15)) {
                        iZzo = zzjj.zzu(i16, (zzlj) unsafe.getObject(obj, j10), zzE(i15));
                        i12 += iZzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzml zzmlVar = this.zzn;
        int iZza = i12 + zzmlVar.zza(zzmlVar.zzc(obj));
        if (!this.zzh) {
            return iZza;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private final int zzq(Object obj) {
        int iZzA;
        int iZzA2;
        int iZzA3;
        int iZzB;
        int iZzA4;
        int iZzv;
        int iZzA5;
        int iZzA6;
        int iZzd;
        int iZzA7;
        int iZzo;
        int iZzz;
        int iZzA8;
        int i10;
        Unsafe unsafe = zzb;
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzc.length; i12 += 3) {
            int iZzB2 = zzB(i12);
            int iZzA9 = zzA(iZzB2);
            int i13 = this.zzc[i12];
            long j10 = iZzB2 & 1048575;
            if (iZzA9 >= zzju.zzJ.zza() && iZzA9 <= zzju.zzW.zza()) {
                int i14 = this.zzc[i12 + 2];
            }
            switch (iZzA9) {
                case 0:
                    if (zzO(obj, i12)) {
                        iZzA = zzjj.zzA(i13 << 3);
                        iZzo = iZzA + 8;
                        i11 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i12)) {
                        iZzA2 = zzjj.zzA(i13 << 3);
                        iZzo = iZzA2 + 4;
                        i11 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i12)) {
                        long jZzd = zzmv.zzd(obj, j10);
                        iZzA3 = zzjj.zzA(i13 << 3);
                        iZzB = zzjj.zzB(jZzd);
                        i11 += iZzA3 + iZzB;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i12)) {
                        long jZzd2 = zzmv.zzd(obj, j10);
                        iZzA3 = zzjj.zzA(i13 << 3);
                        iZzB = zzjj.zzB(jZzd2);
                        i11 += iZzA3 + iZzB;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i12)) {
                        int iZzc = zzmv.zzc(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzv(iZzc);
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i12)) {
                        iZzA = zzjj.zzA(i13 << 3);
                        iZzo = iZzA + 8;
                        i11 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i12)) {
                        iZzA2 = zzjj.zzA(i13 << 3);
                        iZzo = iZzA2 + 4;
                        i11 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i12)) {
                        iZzA5 = zzjj.zzA(i13 << 3);
                        iZzo = iZzA5 + 1;
                        i11 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzO(obj, i12)) {
                        break;
                    } else {
                        Object objZzf = zzmv.zzf(obj, j10);
                        if (objZzf instanceof zzjb) {
                            iZzA6 = zzjj.zzA(i13 << 3);
                            iZzd = ((zzjb) objZzf).zzd();
                            iZzA7 = zzjj.zzA(iZzd);
                            i10 = iZzA6 + iZzA7 + iZzd;
                            i11 += i10;
                            break;
                        } else {
                            iZzA4 = zzjj.zzA(i13 << 3);
                            iZzv = zzjj.zzy((String) objZzf);
                            i10 = iZzA4 + iZzv;
                            i11 += i10;
                        }
                    }
                case 9:
                    if (zzO(obj, i12)) {
                        iZzo = zzlw.zzo(i13, zzmv.zzf(obj, j10), zzE(i12));
                        i11 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i12)) {
                        zzjb zzjbVar = (zzjb) zzmv.zzf(obj, j10);
                        iZzA6 = zzjj.zzA(i13 << 3);
                        iZzd = zzjbVar.zzd();
                        iZzA7 = zzjj.zzA(iZzd);
                        i10 = iZzA6 + iZzA7 + iZzd;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i12)) {
                        int iZzc2 = zzmv.zzc(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzA(iZzc2);
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i12)) {
                        int iZzc3 = zzmv.zzc(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzv(iZzc3);
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i12)) {
                        iZzA2 = zzjj.zzA(i13 << 3);
                        iZzo = iZzA2 + 4;
                        i11 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i12)) {
                        iZzA = zzjj.zzA(i13 << 3);
                        iZzo = iZzA + 8;
                        i11 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i12)) {
                        int iZzc4 = zzmv.zzc(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzA((iZzc4 >> 31) ^ (iZzc4 + iZzc4));
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i12)) {
                        long jZzd3 = zzmv.zzd(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzB((jZzd3 >> 63) ^ (jZzd3 + jZzd3));
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i12)) {
                        iZzo = zzjj.zzu(i13, (zzlj) zzmv.zzf(obj, j10), zzE(i12));
                        i11 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iZzo = zzlw.zzh(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 19:
                    iZzo = zzlw.zzf(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 20:
                    iZzo = zzlw.zzm(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 21:
                    iZzo = zzlw.zzx(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 22:
                    iZzo = zzlw.zzk(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 23:
                    iZzo = zzlw.zzh(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 24:
                    iZzo = zzlw.zzf(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 25:
                    iZzo = zzlw.zza(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 26:
                    iZzo = zzlw.zzu(i13, (List) zzmv.zzf(obj, j10));
                    i11 += iZzo;
                    break;
                case 27:
                    iZzo = zzlw.zzp(i13, (List) zzmv.zzf(obj, j10), zzE(i12));
                    i11 += iZzo;
                    break;
                case 28:
                    iZzo = zzlw.zzc(i13, (List) zzmv.zzf(obj, j10));
                    i11 += iZzo;
                    break;
                case 29:
                    iZzo = zzlw.zzv(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 30:
                    iZzo = zzlw.zzd(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 31:
                    iZzo = zzlw.zzf(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 32:
                    iZzo = zzlw.zzh(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 33:
                    iZzo = zzlw.zzq(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 34:
                    iZzo = zzlw.zzs(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 35:
                    iZzv = zzlw.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    iZzv = zzlw.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    iZzv = zzlw.zzn((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    iZzv = zzlw.zzy((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    iZzv = zzlw.zzl((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    iZzv = zzlw.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    iZzv = zzlw.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    iZzv = zzlw.zzb((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    iZzv = zzlw.zzw((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    iZzv = zzlw.zze((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    iZzv = zzlw.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    iZzv = zzlw.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    iZzv = zzlw.zzr((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    iZzv = zzlw.zzt((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    iZzo = zzlw.zzj(i13, (List) zzmv.zzf(obj, j10), zzE(i12));
                    i11 += iZzo;
                    break;
                case 50:
                    zzle.zza(i13, zzmv.zzf(obj, j10), zzF(i12));
                    break;
                case 51:
                    if (zzR(obj, i13, i12)) {
                        iZzA = zzjj.zzA(i13 << 3);
                        iZzo = iZzA + 8;
                        i11 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i13, i12)) {
                        iZzA2 = zzjj.zzA(i13 << 3);
                        iZzo = iZzA2 + 4;
                        i11 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i13, i12)) {
                        long jZzC = zzC(obj, j10);
                        iZzA3 = zzjj.zzA(i13 << 3);
                        iZzB = zzjj.zzB(jZzC);
                        i11 += iZzA3 + iZzB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i13, i12)) {
                        long jZzC2 = zzC(obj, j10);
                        iZzA3 = zzjj.zzA(i13 << 3);
                        iZzB = zzjj.zzB(jZzC2);
                        i11 += iZzA3 + iZzB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i13, i12)) {
                        int iZzr = zzr(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzv(iZzr);
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i13, i12)) {
                        iZzA = zzjj.zzA(i13 << 3);
                        iZzo = iZzA + 8;
                        i11 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i13, i12)) {
                        iZzA2 = zzjj.zzA(i13 << 3);
                        iZzo = iZzA2 + 4;
                        i11 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i13, i12)) {
                        iZzA5 = zzjj.zzA(i13 << 3);
                        iZzo = iZzA5 + 1;
                        i11 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzR(obj, i13, i12)) {
                        break;
                    } else {
                        Object objZzf2 = zzmv.zzf(obj, j10);
                        if (objZzf2 instanceof zzjb) {
                            iZzA6 = zzjj.zzA(i13 << 3);
                            iZzd = ((zzjb) objZzf2).zzd();
                            iZzA7 = zzjj.zzA(iZzd);
                            i10 = iZzA6 + iZzA7 + iZzd;
                            i11 += i10;
                            break;
                        } else {
                            iZzA4 = zzjj.zzA(i13 << 3);
                            iZzv = zzjj.zzy((String) objZzf2);
                            i10 = iZzA4 + iZzv;
                            i11 += i10;
                        }
                    }
                case 60:
                    if (zzR(obj, i13, i12)) {
                        iZzo = zzlw.zzo(i13, zzmv.zzf(obj, j10), zzE(i12));
                        i11 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i13, i12)) {
                        zzjb zzjbVar2 = (zzjb) zzmv.zzf(obj, j10);
                        iZzA6 = zzjj.zzA(i13 << 3);
                        iZzd = zzjbVar2.zzd();
                        iZzA7 = zzjj.zzA(iZzd);
                        i10 = iZzA6 + iZzA7 + iZzd;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i13, i12)) {
                        int iZzr2 = zzr(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzA(iZzr2);
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i13, i12)) {
                        int iZzr3 = zzr(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzv(iZzr3);
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i13, i12)) {
                        iZzA2 = zzjj.zzA(i13 << 3);
                        iZzo = iZzA2 + 4;
                        i11 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i13, i12)) {
                        iZzA = zzjj.zzA(i13 << 3);
                        iZzo = iZzA + 8;
                        i11 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i13, i12)) {
                        int iZzr4 = zzr(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzA((iZzr4 >> 31) ^ (iZzr4 + iZzr4));
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i13, i12)) {
                        long jZzC3 = zzC(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzB((jZzC3 >> 63) ^ (jZzC3 + jZzC3));
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i13, i12)) {
                        iZzo = zzjj.zzu(i13, (zzlj) zzmv.zzf(obj, j10), zzE(i12));
                        i11 += iZzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzml zzmlVar = this.zzn;
        return i11 + zzmlVar.zza(zzmlVar.zzc(obj));
    }

    private static int zzr(Object obj, long j10) {
        return ((Integer) zzmv.zzf(obj, j10)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zzio zzioVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzF = zzF(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((zzld) object).zze()) {
            zzld zzldVarZzb = zzld.zza().zzb();
            zzle.zzb(zzldVarZzb, object);
            unsafe.putObject(obj, j10, zzldVarZzb);
        }
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzio zzioVar) throws IOException {
        Object object;
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzip.zzn(bArr, i10))));
                unsafe.putInt(obj, j11, i13);
                return i10 + 8;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzip.zzb(bArr, i10))));
                unsafe.putInt(obj, j11, i13);
                return i10 + 4;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm = zzip.zzm(bArr, i10, zzioVar);
                unsafe.putObject(obj, j10, Long.valueOf(zzioVar.zzb));
                unsafe.putInt(obj, j11, i13);
                return iZzm;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj = zzip.zzj(bArr, i10, zzioVar);
                unsafe.putObject(obj, j10, Integer.valueOf(zzioVar.zza));
                unsafe.putInt(obj, j11, i13);
                return iZzj;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Long.valueOf(zzip.zzn(bArr, i10)));
                unsafe.putInt(obj, j11, i13);
                return i10 + 8;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(zzip.zzb(bArr, i10)));
                unsafe.putInt(obj, j11, i13);
                return i10 + 4;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm2 = zzip.zzm(bArr, i10, zzioVar);
                unsafe.putObject(obj, j10, Boolean.valueOf(zzioVar.zzb != 0));
                unsafe.putInt(obj, j11, i13);
                return iZzm2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iZzj2 = zzip.zzj(bArr, i10, zzioVar);
                int i18 = zzioVar.zza;
                if (i18 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i15 & 536870912) != 0 && !zzna.zzf(bArr, iZzj2, iZzj2 + i18)) {
                        throw zzkm.zzc();
                    }
                    unsafe.putObject(obj, j10, new String(bArr, iZzj2, i18, zzkk.zzb));
                    iZzj2 += i18;
                }
                unsafe.putInt(obj, j11, i13);
                return iZzj2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                int iZzd = zzip.zzd(zzE(i17), bArr, i10, i11, zzioVar);
                object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                if (object == null) {
                    unsafe.putObject(obj, j10, zzioVar.zzc);
                } else {
                    unsafe.putObject(obj, j10, zzkk.zzg(object, zzioVar.zzc));
                }
                unsafe.putInt(obj, j11, i13);
                return iZzd;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iZza = zzip.zza(bArr, i10, zzioVar);
                unsafe.putObject(obj, j10, zzioVar.zzc);
                unsafe.putInt(obj, j11, i13);
                return iZza;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj3 = zzip.zzj(bArr, i10, zzioVar);
                int i19 = zzioVar.zza;
                zzkg zzkgVarZzD = zzD(i17);
                if (zzkgVarZzD != null && !zzkgVarZzD.zza(i19)) {
                    zzd(obj).zzh(i12, Long.valueOf(i19));
                    return iZzj3;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(i19));
                unsafe.putInt(obj, j11, i13);
                return iZzj3;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj4 = zzip.zzj(bArr, i10, zzioVar);
                unsafe.putObject(obj, j10, Integer.valueOf(zzjf.zzb(zzioVar.zza)));
                unsafe.putInt(obj, j11, i13);
                return iZzj4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm3 = zzip.zzm(bArr, i10, zzioVar);
                unsafe.putObject(obj, j10, Long.valueOf(zzjf.zzc(zzioVar.zzb)));
                unsafe.putInt(obj, j11, i13);
                return iZzm3;
            case 68:
                if (i14 == 3) {
                    int iZzc = zzip.zzc(zzE(i17), bArr, i10, i11, (i12 & (-8)) | 4, zzioVar);
                    object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j10, zzioVar.zzc);
                    } else {
                        unsafe.putObject(obj, j10, zzkk.zzg(object, zzioVar.zzc));
                    }
                    unsafe.putInt(obj, j11, i13);
                    return iZzc;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0080. Please report as an issue. */
    private final int zzu(Object obj, byte[] bArr, int i10, int i11, zzio zzioVar) throws IOException {
        Unsafe unsafe;
        int i12;
        int i13;
        int i14;
        int i15;
        Object obj2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        zzlm<T> zzlmVar = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i22 = i11;
        zzio zzioVar2 = zzioVar;
        Unsafe unsafe2 = zzb;
        int i23 = -1;
        int iZzm = i10;
        int i24 = -1;
        int i25 = 0;
        int i26 = 0;
        int i27 = 1048575;
        while (iZzm < i22) {
            int iZzk = iZzm + 1;
            int i28 = bArr2[iZzm];
            if (i28 < 0) {
                iZzk = zzip.zzk(i28, bArr2, iZzk, zzioVar2);
                i28 = zzioVar2.zza;
            }
            int i29 = iZzk;
            int i30 = i28 >>> 3;
            int i31 = i28 & 7;
            int iZzx = i30 > i24 ? zzlmVar.zzx(i30, i25 / 3) : zzlmVar.zzw(i30);
            if (iZzx == i23) {
                unsafe = unsafe2;
                i12 = i28;
                i13 = i23;
                i14 = i30;
                i15 = 0;
                obj2 = obj3;
            } else {
                int[] iArr = zzlmVar.zzc;
                int i32 = iArr[iZzx + 1];
                int iZzA = zzA(i32);
                int i33 = i28;
                int i34 = iZzx;
                long j10 = i32 & 1048575;
                if (iZzA <= 17) {
                    int i35 = iArr[i34 + 2];
                    int i36 = 1 << (i35 >>> 20);
                    int i37 = i35 & 1048575;
                    if (i37 != i27) {
                        int i38 = 1048575;
                        if (i27 != 1048575) {
                            unsafe2.putInt(obj3, i27, i26);
                            i38 = 1048575;
                        }
                        if (i37 != i38) {
                            i26 = unsafe2.getInt(obj3, i37);
                        }
                        i27 = i37;
                    }
                    switch (iZzA) {
                        case 0:
                            i21 = i34;
                            if (i31 != 1) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                zzmv.zzo(obj3, j10, Double.longBitsToDouble(zzip.zzn(bArr2, i29)));
                                iZzm = i29 + 8;
                                i26 |= i36;
                                i22 = i11;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 1:
                            i21 = i34;
                            if (i31 != 5) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                zzmv.zzp(obj3, j10, Float.intBitsToFloat(zzip.zzb(bArr2, i29)));
                                iZzm = i29 + 4;
                                i26 |= i36;
                                i22 = i11;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            i21 = i34;
                            if (i31 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                int iZzm2 = zzip.zzm(bArr2, i29, zzioVar2);
                                Unsafe unsafe3 = unsafe2;
                                Object obj4 = obj3;
                                unsafe3.putLong(obj4, j10, zzioVar2.zzb);
                                unsafe2 = unsafe3;
                                obj3 = obj4;
                                i26 |= i36;
                                iZzm = iZzm2;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                i22 = i11;
                                break;
                            }
                        case 4:
                        case 11:
                            i21 = i34;
                            if (i31 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                int iZzj = zzip.zzj(bArr2, i29, zzioVar2);
                                unsafe2.putInt(obj3, j10, zzioVar2.zza);
                                i26 |= i36;
                                i22 = i11;
                                iZzm = iZzj;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            i21 = i34;
                            if (i31 != 1) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                Unsafe unsafe4 = unsafe2;
                                Object obj5 = obj3;
                                unsafe4.putLong(obj5, j10, zzip.zzn(bArr2, i29));
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                iZzm = i29 + 8;
                                i26 |= i36;
                                i22 = i11;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            i21 = i34;
                            if (i31 != 5) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                unsafe2.putInt(obj3, j10, zzip.zzb(bArr2, i29));
                                iZzm = i29 + 4;
                                i26 |= i36;
                                i22 = i11;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 7:
                            i21 = i34;
                            if (i31 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                iZzm = zzip.zzm(bArr2, i29, zzioVar2);
                                zzmv.zzm(obj3, j10, zzioVar2.zzb != 0);
                                i26 |= i36;
                                i22 = i11;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 8:
                            i21 = i34;
                            if (i31 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                iZzm = (536870912 & i32) == 0 ? zzip.zzg(bArr2, i29, zzioVar2) : zzip.zzh(bArr2, i29, zzioVar2);
                                unsafe2.putObject(obj3, j10, zzioVar2.zzc);
                                i26 |= i36;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 9:
                            i21 = i34;
                            if (i31 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                iZzm = zzip.zzd(zzlmVar.zzE(i21), bArr2, i29, i22, zzioVar2);
                                Object object = unsafe2.getObject(obj3, j10);
                                if (object == null) {
                                    unsafe2.putObject(obj3, j10, zzioVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj3, j10, zzkk.zzg(object, zzioVar2.zzc));
                                }
                                i26 |= i36;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 10:
                            i21 = i34;
                            if (i31 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                iZzm = zzip.zza(bArr2, i29, zzioVar2);
                                unsafe2.putObject(obj3, j10, zzioVar2.zzc);
                                i26 |= i36;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 12:
                            i21 = i34;
                            if (i31 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                iZzm = zzip.zzj(bArr2, i29, zzioVar2);
                                unsafe2.putInt(obj3, j10, zzioVar2.zza);
                                i26 |= i36;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 15:
                            i21 = i34;
                            if (i31 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                iZzm = zzip.zzj(bArr2, i29, zzioVar2);
                                unsafe2.putInt(obj3, j10, zzjf.zzb(zzioVar2.zza));
                                i26 |= i36;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 16:
                            if (i31 != 0) {
                                i21 = i34;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                int iZzm3 = zzip.zzm(bArr2, i29, zzioVar2);
                                Unsafe unsafe5 = unsafe2;
                                Object obj6 = obj3;
                                i21 = i34;
                                unsafe5.putLong(obj6, j10, zzjf.zzc(zzioVar2.zzb));
                                unsafe2 = unsafe5;
                                obj3 = obj6;
                                i26 |= i36;
                                iZzm = iZzm3;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        default:
                            i21 = i34;
                            obj2 = obj3;
                            unsafe = unsafe2;
                            i14 = i30;
                            i15 = i21;
                            i13 = -1;
                            i12 = i33;
                            break;
                    }
                } else {
                    i15 = i34;
                    if (iZzA != 27) {
                        i16 = i29;
                        Unsafe unsafe6 = unsafe2;
                        if (iZzA <= 49) {
                            i17 = i26;
                            unsafe = unsafe6;
                            i13 = -1;
                            i19 = i27;
                            int iZzv = zzlmVar.zzv(obj, bArr, i16, i11, i33, i30, i31, i15, i32, iZzA, j10, zzioVar);
                            i18 = i33;
                            i20 = i30;
                            if (iZzv != i16) {
                                zzlmVar = this;
                                obj3 = obj;
                                zzioVar2 = zzioVar;
                                iZzm = iZzv;
                                i25 = i15;
                                i24 = i20;
                                i27 = i19;
                                i23 = i13;
                                i26 = i17;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i22 = i11;
                            } else {
                                obj2 = obj;
                                i29 = iZzv;
                                i14 = i20;
                                i12 = i18;
                            }
                        } else {
                            i17 = i26;
                            unsafe = unsafe6;
                            i13 = -1;
                            i18 = i33;
                            i19 = i27;
                            i20 = i30;
                            if (iZzA != 50) {
                                i14 = i20;
                                int iZzt = zzt(obj, bArr, i16, i11, i18, i14, i31, i32, iZzA, j10, i15, zzioVar);
                                obj2 = obj;
                                i12 = i18;
                                i15 = i15;
                                if (iZzt != i16) {
                                    zzlmVar = this;
                                    zzioVar2 = zzioVar;
                                    i24 = i14;
                                    iZzm = iZzt;
                                    i25 = i15;
                                    obj3 = obj2;
                                    i27 = i19;
                                    i23 = i13;
                                    i26 = i17;
                                    unsafe2 = unsafe;
                                    bArr2 = bArr;
                                    i22 = i11;
                                } else {
                                    i29 = iZzt;
                                }
                            } else if (i31 == 2) {
                                int iZzs = zzs(obj, bArr, i16, i11, i15, j10, zzioVar);
                                i15 = i15;
                                if (iZzs != i16) {
                                    zzlmVar = this;
                                    obj3 = obj;
                                    bArr2 = bArr;
                                    zzioVar2 = zzioVar;
                                    iZzm = iZzs;
                                    i25 = i15;
                                    i24 = i20;
                                    i27 = i19;
                                    i23 = -1;
                                    i26 = i17;
                                    unsafe2 = unsafe;
                                    i22 = i11;
                                } else {
                                    obj2 = obj;
                                    i29 = iZzs;
                                    i14 = i20;
                                    i12 = i18;
                                }
                            } else {
                                i15 = i15;
                                obj2 = obj;
                                i29 = i16;
                                i14 = i20;
                                i12 = i18;
                            }
                        }
                    } else if (i31 == 2) {
                        zzkj zzkjVarZzd = (zzkj) unsafe2.getObject(obj3, j10);
                        if (!zzkjVarZzd.zzc()) {
                            int size = zzkjVarZzd.size();
                            zzkjVarZzd = zzkjVarZzd.zzd(size == 0 ? 10 : size + size);
                            unsafe2.putObject(obj3, j10, zzkjVarZzd);
                        }
                        int iZze = zzip.zze(zzlmVar.zzE(i15), i33, bArr2, i29, i11, zzkjVarZzd, zzioVar2);
                        bArr2 = bArr;
                        zzioVar2 = zzioVar;
                        iZzm = iZze;
                        i25 = i15;
                        unsafe2 = unsafe2;
                        i24 = i30;
                        i23 = -1;
                        obj3 = obj;
                        i22 = i11;
                    } else {
                        i16 = i29;
                        i19 = i27;
                        i17 = i26;
                        unsafe = unsafe2;
                        i20 = i30;
                        i13 = -1;
                        i18 = i33;
                        obj2 = obj;
                        i29 = i16;
                        i14 = i20;
                        i12 = i18;
                    }
                    i27 = i19;
                    i26 = i17;
                }
            }
            int iZzi = zzip.zzi(i12, bArr, i29, i11, zzd(obj2), zzioVar);
            bArr2 = bArr;
            zzioVar2 = zzioVar;
            i24 = i14;
            i25 = i15;
            obj3 = obj2;
            i23 = i13;
            unsafe2 = unsafe;
            i22 = i11;
            iZzm = iZzi;
            zzlmVar = this;
        }
        Object obj7 = obj3;
        Unsafe unsafe7 = unsafe2;
        int i39 = i22;
        int i40 = i27;
        int i41 = i26;
        if (i40 != 1048575) {
            unsafe7.putInt(obj7, i40, i41);
        }
        if (iZzm == i39) {
            return iZzm;
        }
        throw zzkm.zze();
    }

    private final int zzv(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, zzio zzioVar) throws IOException {
        int iZzl;
        Unsafe unsafe = zzb;
        zzkj zzkjVarZzd = (zzkj) unsafe.getObject(obj, j11);
        if (!zzkjVarZzd.zzc()) {
            int size = zzkjVarZzd.size();
            zzkjVarZzd = zzkjVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j11, zzkjVarZzd);
        }
        zzkj zzkjVar = zzkjVarZzd;
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    zzjl zzjlVar = (zzjl) zzkjVar;
                    int iZzj = zzip.zzj(bArr, i10, zzioVar);
                    int i17 = zzioVar.zza + iZzj;
                    while (iZzj < i17) {
                        zzjlVar.zze(Double.longBitsToDouble(zzip.zzn(bArr, iZzj)));
                        iZzj += 8;
                    }
                    if (iZzj == i17) {
                        return iZzj;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 1) {
                    zzjl zzjlVar2 = (zzjl) zzkjVar;
                    zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, i10)));
                    int i18 = i10 + 8;
                    while (i18 < i11) {
                        int iZzj2 = zzip.zzj(bArr, i18, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return i18;
                        }
                        zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, iZzj2)));
                        i18 = iZzj2 + 8;
                    }
                    return i18;
                }
                return i10;
            case 19:
            case 36:
                if (i14 == 2) {
                    zzjv zzjvVar = (zzjv) zzkjVar;
                    int iZzj3 = zzip.zzj(bArr, i10, zzioVar);
                    int i19 = zzioVar.zza + iZzj3;
                    while (iZzj3 < i19) {
                        zzjvVar.zze(Float.intBitsToFloat(zzip.zzb(bArr, iZzj3)));
                        iZzj3 += 4;
                    }
                    if (iZzj3 == i19) {
                        return iZzj3;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 5) {
                    zzjv zzjvVar2 = (zzjv) zzkjVar;
                    zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, i10)));
                    int i20 = i10 + 4;
                    while (i20 < i11) {
                        int iZzj4 = zzip.zzj(bArr, i20, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return i20;
                        }
                        zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, iZzj4)));
                        i20 = iZzj4 + 4;
                    }
                    return i20;
                }
                return i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    zzky zzkyVar = (zzky) zzkjVar;
                    int iZzj5 = zzip.zzj(bArr, i10, zzioVar);
                    int i21 = zzioVar.zza + iZzj5;
                    while (iZzj5 < i21) {
                        iZzj5 = zzip.zzm(bArr, iZzj5, zzioVar);
                        zzkyVar.zzg(zzioVar.zzb);
                    }
                    if (iZzj5 == i21) {
                        return iZzj5;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 0) {
                    zzky zzkyVar2 = (zzky) zzkjVar;
                    int iZzm = zzip.zzm(bArr, i10, zzioVar);
                    zzkyVar2.zzg(zzioVar.zzb);
                    while (iZzm < i11) {
                        int iZzj6 = zzip.zzj(bArr, iZzm, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzip.zzm(bArr, iZzj6, zzioVar);
                        zzkyVar2.zzg(zzioVar.zzb);
                    }
                    return iZzm;
                }
                return i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return zzip.zzf(bArr, i10, zzkjVar, zzioVar);
                }
                if (i14 == 0) {
                    return zzip.zzl(i12, bArr, i10, i11, zzkjVar, zzioVar);
                }
                return i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    zzky zzkyVar3 = (zzky) zzkjVar;
                    int iZzj7 = zzip.zzj(bArr, i10, zzioVar);
                    int i22 = zzioVar.zza + iZzj7;
                    while (iZzj7 < i22) {
                        zzkyVar3.zzg(zzip.zzn(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i22) {
                        return iZzj7;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 1) {
                    zzky zzkyVar4 = (zzky) zzkjVar;
                    zzkyVar4.zzg(zzip.zzn(bArr, i10));
                    int i23 = i10 + 8;
                    while (i23 < i11) {
                        int iZzj8 = zzip.zzj(bArr, i23, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return i23;
                        }
                        zzkyVar4.zzg(zzip.zzn(bArr, iZzj8));
                        i23 = iZzj8 + 8;
                    }
                    return i23;
                }
                return i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    zzkd zzkdVar = (zzkd) zzkjVar;
                    int iZzj9 = zzip.zzj(bArr, i10, zzioVar);
                    int i24 = zzioVar.zza + iZzj9;
                    while (iZzj9 < i24) {
                        zzkdVar.zzh(zzip.zzb(bArr, iZzj9));
                        iZzj9 += 4;
                    }
                    if (iZzj9 == i24) {
                        return iZzj9;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 5) {
                    zzkd zzkdVar2 = (zzkd) zzkjVar;
                    zzkdVar2.zzh(zzip.zzb(bArr, i10));
                    int i25 = i10 + 4;
                    while (i25 < i11) {
                        int iZzj10 = zzip.zzj(bArr, i25, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return i25;
                        }
                        zzkdVar2.zzh(zzip.zzb(bArr, iZzj10));
                        i25 = iZzj10 + 4;
                    }
                    return i25;
                }
                return i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    zziq zziqVar = (zziq) zzkjVar;
                    int iZzj11 = zzip.zzj(bArr, i10, zzioVar);
                    int i26 = zzioVar.zza + iZzj11;
                    while (iZzj11 < i26) {
                        iZzj11 = zzip.zzm(bArr, iZzj11, zzioVar);
                        zziqVar.zze(zzioVar.zzb != 0);
                    }
                    if (iZzj11 == i26) {
                        return iZzj11;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 0) {
                    zziq zziqVar2 = (zziq) zzkjVar;
                    int iZzm2 = zzip.zzm(bArr, i10, zzioVar);
                    zziqVar2.zze(zzioVar.zzb != 0);
                    while (iZzm2 < i11) {
                        int iZzj12 = zzip.zzj(bArr, iZzm2, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzip.zzm(bArr, iZzj12, zzioVar);
                        zziqVar2.zze(zzioVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return i10;
            case 26:
                if (i14 == 2) {
                    if ((j10 & 536870912) == 0) {
                        int iZzj13 = zzip.zzj(bArr, i10, zzioVar);
                        int i27 = zzioVar.zza;
                        if (i27 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i27 == 0) {
                            zzkjVar.add("");
                        } else {
                            zzkjVar.add(new String(bArr, iZzj13, i27, zzkk.zzb));
                            iZzj13 += i27;
                        }
                        while (iZzj13 < i11) {
                            int iZzj14 = zzip.zzj(bArr, iZzj13, zzioVar);
                            if (i12 != zzioVar.zza) {
                                return iZzj13;
                            }
                            iZzj13 = zzip.zzj(bArr, iZzj14, zzioVar);
                            int i28 = zzioVar.zza;
                            if (i28 < 0) {
                                throw zzkm.zzd();
                            }
                            if (i28 == 0) {
                                zzkjVar.add("");
                            } else {
                                zzkjVar.add(new String(bArr, iZzj13, i28, zzkk.zzb));
                                iZzj13 += i28;
                            }
                        }
                        return iZzj13;
                    }
                    int iZzj15 = zzip.zzj(bArr, i10, zzioVar);
                    int i29 = zzioVar.zza;
                    if (i29 < 0) {
                        throw zzkm.zzd();
                    }
                    if (i29 == 0) {
                        zzkjVar.add("");
                    } else {
                        int i30 = iZzj15 + i29;
                        if (!zzna.zzf(bArr, iZzj15, i30)) {
                            throw zzkm.zzc();
                        }
                        zzkjVar.add(new String(bArr, iZzj15, i29, zzkk.zzb));
                        iZzj15 = i30;
                    }
                    while (iZzj15 < i11) {
                        int iZzj16 = zzip.zzj(bArr, iZzj15, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzj15;
                        }
                        iZzj15 = zzip.zzj(bArr, iZzj16, zzioVar);
                        int i31 = zzioVar.zza;
                        if (i31 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i31 == 0) {
                            zzkjVar.add("");
                        } else {
                            int i32 = iZzj15 + i31;
                            if (!zzna.zzf(bArr, iZzj15, i32)) {
                                throw zzkm.zzc();
                            }
                            zzkjVar.add(new String(bArr, iZzj15, i31, zzkk.zzb));
                            iZzj15 = i32;
                        }
                    }
                    return iZzj15;
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return zzip.zze(zzE(i15), i12, bArr, i10, i11, zzkjVar, zzioVar);
                }
                return i10;
            case 28:
                if (i14 == 2) {
                    int iZzj17 = zzip.zzj(bArr, i10, zzioVar);
                    int i33 = zzioVar.zza;
                    if (i33 < 0) {
                        throw zzkm.zzd();
                    }
                    if (i33 > bArr.length - iZzj17) {
                        throw zzkm.zzf();
                    }
                    if (i33 == 0) {
                        zzkjVar.add(zzjb.zzb);
                    } else {
                        zzkjVar.add(zzjb.zzl(bArr, iZzj17, i33));
                        iZzj17 += i33;
                    }
                    while (iZzj17 < i11) {
                        int iZzj18 = zzip.zzj(bArr, iZzj17, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzj17;
                        }
                        iZzj17 = zzip.zzj(bArr, iZzj18, zzioVar);
                        int i34 = zzioVar.zza;
                        if (i34 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i34 > bArr.length - iZzj17) {
                            throw zzkm.zzf();
                        }
                        if (i34 == 0) {
                            zzkjVar.add(zzjb.zzb);
                        } else {
                            zzkjVar.add(zzjb.zzl(bArr, iZzj17, i34));
                            iZzj17 += i34;
                        }
                    }
                    return iZzj17;
                }
                return i10;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        iZzl = zzip.zzl(i12, bArr, i10, i11, zzkjVar, zzioVar);
                    }
                    return i10;
                }
                iZzl = zzip.zzf(bArr, i10, zzkjVar, zzioVar);
                zzkc zzkcVar = (zzkc) obj;
                zzmm zzmmVar = zzkcVar.zzc;
                if (zzmmVar == zzmm.zzc()) {
                    zzmmVar = null;
                }
                Object objZzC = zzlw.zzC(i13, zzkjVar, zzD(i15), zzmmVar, this.zzn);
                if (objZzC == null) {
                    return iZzl;
                }
                zzkcVar.zzc = (zzmm) objZzC;
                return iZzl;
            case 33:
            case 47:
                if (i14 == 2) {
                    zzkd zzkdVar3 = (zzkd) zzkjVar;
                    int iZzj19 = zzip.zzj(bArr, i10, zzioVar);
                    int i35 = zzioVar.zza + iZzj19;
                    while (iZzj19 < i35) {
                        iZzj19 = zzip.zzj(bArr, iZzj19, zzioVar);
                        zzkdVar3.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    if (iZzj19 == i35) {
                        return iZzj19;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 0) {
                    zzkd zzkdVar4 = (zzkd) zzkjVar;
                    int iZzj20 = zzip.zzj(bArr, i10, zzioVar);
                    zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    while (iZzj20 < i11) {
                        int iZzj21 = zzip.zzj(bArr, iZzj20, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzj20;
                        }
                        iZzj20 = zzip.zzj(bArr, iZzj21, zzioVar);
                        zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    return iZzj20;
                }
                return i10;
            case 34:
            case 48:
                if (i14 == 2) {
                    zzky zzkyVar5 = (zzky) zzkjVar;
                    int iZzj22 = zzip.zzj(bArr, i10, zzioVar);
                    int i36 = zzioVar.zza + iZzj22;
                    while (iZzj22 < i36) {
                        iZzj22 = zzip.zzm(bArr, iZzj22, zzioVar);
                        zzkyVar5.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    if (iZzj22 == i36) {
                        return iZzj22;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 0) {
                    zzky zzkyVar6 = (zzky) zzkjVar;
                    int iZzm3 = zzip.zzm(bArr, i10, zzioVar);
                    zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    while (iZzm3 < i11) {
                        int iZzj23 = zzip.zzj(bArr, iZzm3, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzip.zzm(bArr, iZzj23, zzioVar);
                        zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    return iZzm3;
                }
                return i10;
            default:
                if (i14 == 3) {
                    zzlu zzluVarZzE = zzE(i15);
                    int i37 = (i12 & (-8)) | 4;
                    int iZzc = zzip.zzc(zzluVarZzE, bArr, i10, i11, i37, zzioVar);
                    zzlu zzluVar = zzluVarZzE;
                    zzio zzioVar2 = zzioVar;
                    zzkjVar.add(zzioVar2.zzc);
                    while (iZzc < i11) {
                        int iZzj24 = zzip.zzj(bArr, iZzc, zzioVar2);
                        if (i12 != zzioVar2.zza) {
                            return iZzc;
                        }
                        zzlu zzluVar2 = zzluVar;
                        zzio zzioVar3 = zzioVar2;
                        iZzc = zzip.zzc(zzluVar2, bArr, iZzj24, i11, i37, zzioVar3);
                        zzkjVar.add(zzioVar3.zzc);
                        zzluVar = zzluVar2;
                        zzioVar2 = zzioVar3;
                    }
                    return iZzc;
                }
                return i10;
        }
    }

    private final int zzw(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzz(i10, 0);
    }

    private final int zzx(int i10, int i11) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzz(i10, i11);
    }

    private final int zzy(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzz(int i10, int i11) {
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

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zzb(Object obj) {
        int i10;
        int iZzc;
        int length = this.zzc.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iZzB = zzB(i12);
            int i13 = this.zzc[i12];
            long j10 = 1048575 & iZzB;
            int iHashCode = 37;
            switch (zzA(iZzB)) {
                case 0:
                    i10 = i11 * 53;
                    iZzc = zzkk.zzc(Double.doubleToLongBits(zzmv.zza(obj, j10)));
                    i11 = i10 + iZzc;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iZzc = Float.floatToIntBits(zzmv.zzb(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzc(obj, j10);
                    i11 = i10 + iZzc;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzc(obj, j10);
                    i11 = i10 + iZzc;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iZzc = zzkk.zza(zzmv.zzw(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iZzc = ((String) zzmv.zzf(obj, j10)).hashCode();
                    i11 = i10 + iZzc;
                    break;
                case 9:
                    Object objZzf = zzmv.zzf(obj, j10);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzf(obj, j10).hashCode();
                    i11 = i10 + iZzc;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzc(obj, j10);
                    i11 = i10 + iZzc;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzc(obj, j10);
                    i11 = i10 + iZzc;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzc(obj, j10);
                    i11 = i10 + iZzc;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzc(obj, j10);
                    i11 = i10 + iZzc;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 17:
                    Object objZzf2 = zzmv.zzf(obj, j10);
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
                    i10 = i11 * 53;
                    iZzc = zzmv.zzf(obj, j10).hashCode();
                    i11 = i10 + iZzc;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzf(obj, j10).hashCode();
                    i11 = i10 + iZzc;
                    break;
                case 51:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzkk.zzc(Double.doubleToLongBits(zzn(obj, j10)));
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = Float.floatToIntBits(zzo(obj, j10));
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j10));
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j10));
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzr(obj, j10);
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j10));
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzr(obj, j10);
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzkk.zza(zzS(obj, j10));
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = ((String) zzmv.zzf(obj, j10)).hashCode();
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzmv.zzf(obj, j10).hashCode();
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzmv.zzf(obj, j10).hashCode();
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzr(obj, j10);
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzr(obj, j10);
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzr(obj, j10);
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j10));
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzr(obj, j10);
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j10));
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzmv.zzf(obj, j10).hashCode();
                        i11 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i11 * 53) + this.zzn.zzc(obj).hashCode();
        if (!this.zzh) {
            return iHashCode2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x04a4, code lost:
    
        if (r11 == r15) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x04a6, code lost:
    
        r20.putInt(r9, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04ac, code lost:
    
        r0 = r8.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04b0, code lost:
    
        if (r0 >= r8.zzl) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x04b2, code lost:
    
        r1 = r8.zzj[r0];
        r2 = r8.zzc[r1];
        r2 = com.google.android.gms.internal.measurement.zzmv.zzf(r9, r8.zzB(r1) & r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x04c4, code lost:
    
        if (r2 != null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04cb, code lost:
    
        if (r8.zzD(r1) != null) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04cd, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04d0, code lost:
    
        r2 = (com.google.android.gms.internal.measurement.zzld) r2;
        r0 = (com.google.android.gms.internal.measurement.zzlc) r8.zzF(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04d8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04d9, code lost:
    
        if (r7 != 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04db, code lost:
    
        if (r3 != r4) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x04e2, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkm.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x04e3, code lost:
    
        if (r3 > r4) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x04e5, code lost:
    
        if (r6 != r7) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x04e7, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x04ec, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkm.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.measurement.zzio r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzio):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final Object zze() {
        return ((zzkc) this.zzg).zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzf(Object obj) {
        int i10;
        int i11 = this.zzk;
        while (true) {
            i10 = this.zzl;
            if (i11 >= i10) {
                break;
            }
            long jZzB = zzB(this.zzj[i11]) & 1048575;
            Object objZzf = zzmv.zzf(obj, jZzB);
            if (objZzf != null) {
                ((zzld) objZzf).zzc();
                zzmv.zzs(obj, jZzB, objZzf);
            }
            i11++;
        }
        int length = this.zzj.length;
        while (i10 < length) {
            this.zzm.zza(obj, this.zzj[i10]);
            i10++;
        }
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzB = zzB(i10);
            long j10 = 1048575 & iZzB;
            int i11 = this.zzc[i10];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzO(obj2, i10)) {
                        zzmv.zzo(obj, j10, zzmv.zza(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj2, i10)) {
                        zzmv.zzp(obj, j10, zzmv.zzb(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj2, i10)) {
                        zzmv.zzm(obj, j10, zzmv.zzw(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj2, i10)) {
                        zzmv.zzs(obj, j10, zzmv.zzf(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i10);
                    break;
                case 10:
                    if (zzO(obj2, i10)) {
                        zzmv.zzs(obj, j10, zzmv.zzf(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i10);
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
                    this.zzm.zzb(obj, obj2, j10);
                    break;
                case 50:
                    zzlw.zzaa(this.zzq, obj, obj2, j10);
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
                    if (zzR(obj2, i11, i10)) {
                        zzmv.zzs(obj, j10, zzmv.zzf(obj2, j10));
                        zzK(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzI(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i11, i10)) {
                        zzmv.zzs(obj, j10, zzmv.zzf(obj2, j10));
                        zzK(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i10);
                    break;
            }
        }
        zzlw.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzlw.zzE(this.zzo, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzh(Object obj, byte[] bArr, int i10, int i11, zzio zzioVar) throws IOException {
        if (this.zzi) {
            zzu(obj, bArr, i10, i11, zzioVar);
        } else {
            zzc(obj, bArr, i10, i11, 0, zzioVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzi(Object obj, zznd zzndVar) throws IOException {
        if (!this.zzi) {
            zzL(obj, zzndVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzB = zzB(i10);
            int i11 = this.zzc[i10];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzO(obj, i10)) {
                        zzndVar.zzf(i11, zzmv.zza(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i10)) {
                        zzndVar.zzo(i11, zzmv.zzb(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i10)) {
                        zzndVar.zzt(i11, zzmv.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i10)) {
                        zzndVar.zzJ(i11, zzmv.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i10)) {
                        zzndVar.zzr(i11, zzmv.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i10)) {
                        zzndVar.zzm(i11, zzmv.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i10)) {
                        zzndVar.zzk(i11, zzmv.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i10)) {
                        zzndVar.zzb(i11, zzmv.zzw(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj, i10)) {
                        zzT(i11, zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzO(obj, i10)) {
                        zzndVar.zzv(i11, zzmv.zzf(obj, iZzB & 1048575), zzE(i10));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i10)) {
                        zzndVar.zzd(i11, (zzjb) zzmv.zzf(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i10)) {
                        zzndVar.zzH(i11, zzmv.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i10)) {
                        zzndVar.zzi(i11, zzmv.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i10)) {
                        zzndVar.zzw(i11, zzmv.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i10)) {
                        zzndVar.zzy(i11, zzmv.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i10)) {
                        zzndVar.zzA(i11, zzmv.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i10)) {
                        zzndVar.zzC(i11, zzmv.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i10)) {
                        zzndVar.zzq(i11, zzmv.zzf(obj, iZzB & 1048575), zzE(i10));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzlw.zzJ(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 19:
                    zzlw.zzN(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 20:
                    zzlw.zzQ(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 21:
                    zzlw.zzY(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 22:
                    zzlw.zzP(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 23:
                    zzlw.zzM(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 24:
                    zzlw.zzL(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 25:
                    zzlw.zzH(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 26:
                    zzlw.zzW(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                    break;
                case 27:
                    zzlw.zzR(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, zzE(i10));
                    break;
                case 28:
                    zzlw.zzI(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                    break;
                case 29:
                    zzlw.zzX(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 30:
                    zzlw.zzK(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 31:
                    zzlw.zzS(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 32:
                    zzlw.zzT(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 33:
                    zzlw.zzU(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 34:
                    zzlw.zzV(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 35:
                    zzlw.zzJ(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 36:
                    zzlw.zzN(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 37:
                    zzlw.zzQ(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 38:
                    zzlw.zzY(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 39:
                    zzlw.zzP(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 40:
                    zzlw.zzM(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 41:
                    zzlw.zzL(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 42:
                    zzlw.zzH(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 43:
                    zzlw.zzX(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 44:
                    zzlw.zzK(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 45:
                    zzlw.zzS(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 46:
                    zzlw.zzT(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 47:
                    zzlw.zzU(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 48:
                    zzlw.zzV(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 49:
                    zzlw.zzO(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, zzE(i10));
                    break;
                case 50:
                    zzM(zzndVar, i11, zzmv.zzf(obj, iZzB & 1048575), i10);
                    break;
                case 51:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzf(i11, zzn(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzo(i11, zzo(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzt(i11, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzJ(i11, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzr(i11, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzm(i11, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzk(i11, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzb(i11, zzS(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i11, i10)) {
                        zzT(i11, zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzv(i11, zzmv.zzf(obj, iZzB & 1048575), zzE(i10));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzd(i11, (zzjb) zzmv.zzf(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzH(i11, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzi(i11, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzw(i11, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzy(i11, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzA(i11, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzC(i11, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzq(i11, zzmv.zzf(obj, iZzB & 1048575), zzE(i10));
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzml zzmlVar = this.zzn;
        zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzZ;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzB = zzB(i10);
            long j10 = iZzB & 1048575;
            switch (zzA(iZzB)) {
                case 0:
                    if (!zzN(obj, obj2, i10) || Double.doubleToLongBits(zzmv.zza(obj, j10)) != Double.doubleToLongBits(zzmv.zza(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzN(obj, obj2, i10) || Float.floatToIntBits(zzmv.zzb(obj, j10)) != Float.floatToIntBits(zzmv.zzb(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzN(obj, obj2, i10) || zzmv.zzd(obj, j10) != zzmv.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzN(obj, obj2, i10) || zzmv.zzd(obj, j10) != zzmv.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzN(obj, obj2, i10) || zzmv.zzc(obj, j10) != zzmv.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzN(obj, obj2, i10) || zzmv.zzd(obj, j10) != zzmv.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzN(obj, obj2, i10) || zzmv.zzc(obj, j10) != zzmv.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzN(obj, obj2, i10) || zzmv.zzw(obj, j10) != zzmv.zzw(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzN(obj, obj2, i10) || !zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzN(obj, obj2, i10) || !zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzN(obj, obj2, i10) || !zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzN(obj, obj2, i10) || zzmv.zzc(obj, j10) != zzmv.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzN(obj, obj2, i10) || zzmv.zzc(obj, j10) != zzmv.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzN(obj, obj2, i10) || zzmv.zzc(obj, j10) != zzmv.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzN(obj, obj2, i10) || zzmv.zzd(obj, j10) != zzmv.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzN(obj, obj2, i10) || zzmv.zzc(obj, j10) != zzmv.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzN(obj, obj2, i10) || zzmv.zzd(obj, j10) != zzmv.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzN(obj, obj2, i10) || !zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
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
                    zZzZ = zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10));
                    break;
                case 50:
                    zZzZ = zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10));
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
                    long jZzy = zzy(i10) & 1048575;
                    if (zzmv.zzc(obj, jZzy) != zzmv.zzc(obj2, jZzy) || !zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzZ) {
                return false;
            }
        }
        if (!this.zzn.zzc(obj).equals(this.zzn.zzc(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzk(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzk(java.lang.Object):boolean");
    }
}
