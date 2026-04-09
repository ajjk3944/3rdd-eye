package com.google.android.gms.internal.measurement;

import N7.C1094a9;
import androidx.work.s;
import j6.l;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.1.1 */
/* loaded from: classes2.dex */
final class zzlo<T> implements zzlw<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmx.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzll zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkz zzm;
    private final zzmn zzn;
    private final zzjr zzo;
    private final zzlq zzp;
    private final zzlg zzq;

    private zzlo(int[] iArr, Object[] objArr, int i, int i10, zzll zzllVar, boolean z10, boolean z11, int[] iArr2, int i11, int i12, zzlq zzlqVar, zzkz zzkzVar, zzmn zzmnVar, zzjr zzjrVar, zzlg zzlgVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i10;
        this.zzi = z10;
        boolean z12 = false;
        if (zzjrVar != null && zzjrVar.zzc(zzllVar)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzj = iArr2;
        this.zzk = i11;
        this.zzl = i12;
        this.zzp = zzlqVar;
        this.zzm = zzkzVar;
        this.zzn = zzmnVar;
        this.zzo = zzjrVar;
        this.zzg = zzllVar;
        this.zzq = zzlgVar;
    }

    private static int zzA(int i) {
        return (i >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    private final int zzB(int i) {
        return this.zzc[i + 1];
    }

    private static long zzC(Object obj, long j4) {
        return ((Long) zzmx.zzf(obj, j4)).longValue();
    }

    private final zzki zzD(int i) {
        int i10 = i / 3;
        return (zzki) this.zzd[i10 + i10 + 1];
    }

    private final zzlw zzE(int i) {
        int i10 = i / 3;
        int i11 = i10 + i10;
        zzlw zzlwVar = (zzlw) this.zzd[i11];
        if (zzlwVar != null) {
            return zzlwVar;
        }
        zzlw zzlwVarZzb = zzlt.zza().zzb((Class) this.zzd[i11 + 1]);
        this.zzd[i11] = zzlwVarZzb;
        return zzlwVarZzb;
    }

    private final Object zzF(int i) {
        int i10 = i / 3;
        return this.zzd[i10 + i10];
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
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbD = l.d("Field ", str, " for ", name, " not found. Known fields are ");
            sbD.append(string);
            throw new RuntimeException(sbD.toString());
        }
    }

    private final void zzH(Object obj, Object obj2, int i) {
        long jZzB = zzB(i) & 1048575;
        if (zzO(obj2, i)) {
            Object objZzf = zzmx.zzf(obj, jZzB);
            Object objZzf2 = zzmx.zzf(obj2, jZzB);
            if (objZzf != null && objZzf2 != null) {
                zzmx.zzs(obj, jZzB, zzkm.zzg(objZzf, objZzf2));
                zzJ(obj, i);
            } else if (objZzf2 != null) {
                zzmx.zzs(obj, jZzB, objZzf2);
                zzJ(obj, i);
            }
        }
    }

    private final void zzI(Object obj, Object obj2, int i) {
        int iZzB = zzB(i);
        int i10 = this.zzc[i];
        long j4 = iZzB & 1048575;
        if (zzR(obj2, i10, i)) {
            Object objZzf = zzR(obj, i10, i) ? zzmx.zzf(obj, j4) : null;
            Object objZzf2 = zzmx.zzf(obj2, j4);
            if (objZzf != null && objZzf2 != null) {
                zzmx.zzs(obj, j4, zzkm.zzg(objZzf, objZzf2));
                zzK(obj, i10, i);
            } else if (objZzf2 != null) {
                zzmx.zzs(obj, j4, objZzf2);
                zzK(obj, i10, i);
            }
        }
    }

    private final void zzJ(Object obj, int i) {
        int iZzy = zzy(i);
        long j4 = 1048575 & iZzy;
        if (j4 == 1048575) {
            return;
        }
        zzmx.zzq(obj, j4, (1 << (iZzy >>> 20)) | zzmx.zzc(obj, j4));
    }

    private final void zzK(Object obj, int i, int i10) {
        zzmx.zzq(obj, zzy(i10) & 1048575, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzL(Object obj, zznf zznfVar) throws IOException {
        int i;
        boolean z10;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            int iZzB = zzB(i12);
            int[] iArr = this.zzc;
            int i14 = iArr[i12];
            int iZzA = zzA(iZzB);
            if (iZzA <= 17) {
                int i15 = iArr[i12 + 2];
                int i16 = i15 & i10;
                if (i16 != i11) {
                    i13 = unsafe.getInt(obj, i16);
                    i11 = i16;
                }
                i = 1 << (i15 >>> 20);
            } else {
                i = 0;
            }
            long j4 = iZzB & i10;
            switch (iZzA) {
                case 0:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        zznfVar.zzf(i14, zzmx.zza(obj, j4));
                        break;
                    }
                case 1:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        zznfVar.zzo(i14, zzmx.zzb(obj, j4));
                        break;
                    }
                case 2:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        zznfVar.zzt(i14, unsafe.getLong(obj, j4));
                        break;
                    }
                case 3:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        zznfVar.zzJ(i14, unsafe.getLong(obj, j4));
                        break;
                    }
                case 4:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        zznfVar.zzr(i14, unsafe.getInt(obj, j4));
                        break;
                    }
                case 5:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        zznfVar.zzm(i14, unsafe.getLong(obj, j4));
                        break;
                    }
                case 6:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        zznfVar.zzk(i14, unsafe.getInt(obj, j4));
                        break;
                    }
                case 7:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        zznfVar.zzb(i14, zzmx.zzw(obj, j4));
                        break;
                    }
                case 8:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        zzT(i14, unsafe.getObject(obj, j4), zznfVar);
                        break;
                    }
                case 9:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        zznfVar.zzv(i14, unsafe.getObject(obj, j4), zzE(i12));
                        break;
                    }
                case 10:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        zznfVar.zzd(i14, (zzjd) unsafe.getObject(obj, j4));
                        break;
                    }
                case 11:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        zznfVar.zzH(i14, unsafe.getInt(obj, j4));
                        break;
                    }
                case 12:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        zznfVar.zzi(i14, unsafe.getInt(obj, j4));
                        break;
                    }
                case 13:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        zznfVar.zzw(i14, unsafe.getInt(obj, j4));
                        break;
                    }
                case 14:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        zznfVar.zzy(i14, unsafe.getLong(obj, j4));
                        break;
                    }
                case 15:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        zznfVar.zzA(i14, unsafe.getInt(obj, j4));
                        break;
                    }
                case 16:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        zznfVar.zzC(i14, unsafe.getLong(obj, j4));
                        break;
                    }
                case 17:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        zznfVar.zzq(i14, unsafe.getObject(obj, j4), zzE(i12));
                        break;
                    }
                case 18:
                    zzly.zzJ(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, false);
                    break;
                case 19:
                    zzly.zzN(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, false);
                    break;
                case 20:
                    zzly.zzQ(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, false);
                    break;
                case 21:
                    zzly.zzY(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, false);
                    break;
                case 22:
                    zzly.zzP(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, false);
                    break;
                case 23:
                    zzly.zzM(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, false);
                    break;
                case 24:
                    zzly.zzL(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, false);
                    break;
                case 25:
                    zzly.zzH(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, false);
                    break;
                case 26:
                    zzly.zzW(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar);
                    break;
                case 27:
                    zzly.zzR(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, zzE(i12));
                    break;
                case 28:
                    zzly.zzI(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar);
                    break;
                case 29:
                    z10 = false;
                    zzly.zzX(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, false);
                    break;
                case 30:
                    z10 = false;
                    zzly.zzK(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, false);
                    break;
                case 31:
                    z10 = false;
                    zzly.zzS(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, false);
                    break;
                case 32:
                    z10 = false;
                    zzly.zzT(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, false);
                    break;
                case 33:
                    z10 = false;
                    zzly.zzU(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, false);
                    break;
                case 34:
                    z10 = false;
                    zzly.zzV(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, false);
                    break;
                case 35:
                    zzly.zzJ(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, true);
                    break;
                case 36:
                    zzly.zzN(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, true);
                    break;
                case 37:
                    zzly.zzQ(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, true);
                    break;
                case 38:
                    zzly.zzY(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, true);
                    break;
                case 39:
                    zzly.zzP(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, true);
                    break;
                case 40:
                    zzly.zzM(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, true);
                    break;
                case 41:
                    zzly.zzL(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, true);
                    break;
                case 42:
                    zzly.zzH(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, true);
                    break;
                case 43:
                    zzly.zzX(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, true);
                    break;
                case 44:
                    zzly.zzK(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, true);
                    break;
                case 45:
                    zzly.zzS(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, true);
                    break;
                case 46:
                    zzly.zzT(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, true);
                    break;
                case 47:
                    zzly.zzU(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, true);
                    break;
                case 48:
                    zzly.zzV(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, true);
                    break;
                case 49:
                    zzly.zzO(this.zzc[i12], (List) unsafe.getObject(obj, j4), zznfVar, zzE(i12));
                    break;
                case 50:
                    zzM(zznfVar, i14, unsafe.getObject(obj, j4), i12);
                    break;
                case 51:
                    if (zzR(obj, i14, i12)) {
                        zznfVar.zzf(i14, zzn(obj, j4));
                    }
                    break;
                case 52:
                    if (zzR(obj, i14, i12)) {
                        zznfVar.zzo(i14, zzo(obj, j4));
                    }
                    break;
                case 53:
                    if (zzR(obj, i14, i12)) {
                        zznfVar.zzt(i14, zzC(obj, j4));
                    }
                    break;
                case 54:
                    if (zzR(obj, i14, i12)) {
                        zznfVar.zzJ(i14, zzC(obj, j4));
                    }
                    break;
                case 55:
                    if (zzR(obj, i14, i12)) {
                        zznfVar.zzr(i14, zzr(obj, j4));
                    }
                    break;
                case 56:
                    if (zzR(obj, i14, i12)) {
                        zznfVar.zzm(i14, zzC(obj, j4));
                    }
                    break;
                case 57:
                    if (zzR(obj, i14, i12)) {
                        zznfVar.zzk(i14, zzr(obj, j4));
                    }
                    break;
                case 58:
                    if (zzR(obj, i14, i12)) {
                        zznfVar.zzb(i14, zzS(obj, j4));
                    }
                    break;
                case 59:
                    if (zzR(obj, i14, i12)) {
                        zzT(i14, unsafe.getObject(obj, j4), zznfVar);
                    }
                    break;
                case 60:
                    if (zzR(obj, i14, i12)) {
                        zznfVar.zzv(i14, unsafe.getObject(obj, j4), zzE(i12));
                    }
                    break;
                case 61:
                    if (zzR(obj, i14, i12)) {
                        zznfVar.zzd(i14, (zzjd) unsafe.getObject(obj, j4));
                    }
                    break;
                case 62:
                    if (zzR(obj, i14, i12)) {
                        zznfVar.zzH(i14, zzr(obj, j4));
                    }
                    break;
                case 63:
                    if (zzR(obj, i14, i12)) {
                        zznfVar.zzi(i14, zzr(obj, j4));
                    }
                    break;
                case 64:
                    if (zzR(obj, i14, i12)) {
                        zznfVar.zzw(i14, zzr(obj, j4));
                    }
                    break;
                case 65:
                    if (zzR(obj, i14, i12)) {
                        zznfVar.zzy(i14, zzC(obj, j4));
                    }
                    break;
                case 66:
                    if (zzR(obj, i14, i12)) {
                        zznfVar.zzA(i14, zzr(obj, j4));
                    }
                    break;
                case 67:
                    if (zzR(obj, i14, i12)) {
                        zznfVar.zzC(i14, zzC(obj, j4));
                    }
                    break;
                case 68:
                    if (zzR(obj, i14, i12)) {
                        zznfVar.zzq(i14, unsafe.getObject(obj, j4), zzE(i12));
                    }
                    break;
            }
            i12 += 3;
            i10 = 1048575;
        }
        zzmn zzmnVar = this.zzn;
        zzmnVar.zzi(zzmnVar.zzc(obj), zznfVar);
    }

    private final void zzM(zznf zznfVar, int i, Object obj, int i10) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzN(Object obj, Object obj2, int i) {
        return zzO(obj, i) == zzO(obj2, i);
    }

    private final boolean zzO(Object obj, int i) {
        int iZzy = zzy(i);
        long j4 = iZzy & 1048575;
        if (j4 != 1048575) {
            return (zzmx.zzc(obj, j4) & (1 << (iZzy >>> 20))) != 0;
        }
        int iZzB = zzB(i);
        long j10 = iZzB & 1048575;
        switch (zzA(iZzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmx.zza(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmx.zzb(obj, j10)) != 0;
            case 2:
                return zzmx.zzd(obj, j10) != 0;
            case 3:
                return zzmx.zzd(obj, j10) != 0;
            case 4:
                return zzmx.zzc(obj, j10) != 0;
            case 5:
                return zzmx.zzd(obj, j10) != 0;
            case 6:
                return zzmx.zzc(obj, j10) != 0;
            case 7:
                return zzmx.zzw(obj, j10);
            case 8:
                Object objZzf = zzmx.zzf(obj, j10);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzjd) {
                    return !zzjd.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmx.zzf(obj, j10) != null;
            case 10:
                return !zzjd.zzb.equals(zzmx.zzf(obj, j10));
            case 11:
                return zzmx.zzc(obj, j10) != 0;
            case 12:
                return zzmx.zzc(obj, j10) != 0;
            case 13:
                return zzmx.zzc(obj, j10) != 0;
            case 14:
                return zzmx.zzd(obj, j10) != 0;
            case 15:
                return zzmx.zzc(obj, j10) != 0;
            case 16:
                return zzmx.zzd(obj, j10) != 0;
            case 17:
                return zzmx.zzf(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzP(Object obj, int i, int i10, int i11, int i12) {
        return i10 == 1048575 ? zzO(obj, i) : (i11 & i12) != 0;
    }

    private static boolean zzQ(Object obj, int i, zzlw zzlwVar) {
        return zzlwVar.zzk(zzmx.zzf(obj, i & 1048575));
    }

    private final boolean zzR(Object obj, int i, int i10) {
        return zzmx.zzc(obj, (long) (zzy(i10) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j4) {
        return ((Boolean) zzmx.zzf(obj, j4)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zznf zznfVar) throws IOException {
        if (obj instanceof String) {
            zznfVar.zzF(i, (String) obj);
        } else {
            zznfVar.zzd(i, (zzjd) obj);
        }
    }

    public static zzmo zzd(Object obj) {
        zzke zzkeVar = (zzke) obj;
        zzmo zzmoVar = zzkeVar.zzc;
        if (zzmoVar != zzmo.zzc()) {
            return zzmoVar;
        }
        zzmo zzmoVarZze = zzmo.zze();
        zzkeVar.zzc = zzmoVarZze;
        return zzmoVarZze;
    }

    public static zzlo zzl(Class cls, zzli zzliVar, zzlq zzlqVar, zzkz zzkzVar, zzmn zzmnVar, zzjr zzjrVar, zzlg zzlgVar) {
        if (zzliVar instanceof zzlv) {
            return zzm((zzlv) zzliVar, zzlqVar, zzkzVar, zzmnVar, zzjrVar, zzlgVar);
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
    public static com.google.android.gms.internal.measurement.zzlo zzm(com.google.android.gms.internal.measurement.zzlv r34, com.google.android.gms.internal.measurement.zzlq r35, com.google.android.gms.internal.measurement.zzkz r36, com.google.android.gms.internal.measurement.zzmn r37, com.google.android.gms.internal.measurement.zzjr r38, com.google.android.gms.internal.measurement.zzlg r39) {
        /*
            Method dump skipped, instructions count: 985
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlo.zzm(com.google.android.gms.internal.measurement.zzlv, com.google.android.gms.internal.measurement.zzlq, com.google.android.gms.internal.measurement.zzkz, com.google.android.gms.internal.measurement.zzmn, com.google.android.gms.internal.measurement.zzjr, com.google.android.gms.internal.measurement.zzlg):com.google.android.gms.internal.measurement.zzlo");
    }

    private static double zzn(Object obj, long j4) {
        return ((Double) zzmx.zzf(obj, j4)).doubleValue();
    }

    private static float zzo(Object obj, long j4) {
        return ((Float) zzmx.zzf(obj, j4)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(Object obj) {
        int i;
        int iZzA;
        int iZzB;
        int iZzA2;
        int iZzv;
        int iZzo;
        int iZzu;
        int iZzu2;
        boolean z10;
        int iZzd;
        int iZzA3;
        int iZzB2;
        int iZzA4;
        int iZzv2;
        int iZzu3;
        Unsafe unsafe = zzb;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int iC = 0;
        int i13 = 0;
        while (i12 < this.zzc.length) {
            int iZzB3 = zzB(i12);
            int[] iArr = this.zzc;
            int i14 = iArr[i12];
            int iZzA5 = zzA(iZzB3);
            if (iZzA5 <= 17) {
                int i15 = iArr[i12 + 2];
                int i16 = i15 & i10;
                i = 1 << (i15 >>> 20);
                if (i16 != i11) {
                    i13 = unsafe.getInt(obj, i16);
                    i11 = i16;
                }
            } else {
                i = 0;
            }
            long j4 = iZzB3 & i10;
            switch (iZzA5) {
                case 0:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        iC = s.c(i14 << 3, 8, iC);
                        break;
                    }
                case 1:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        iC = s.c(i14 << 3, 4, iC);
                        break;
                    }
                case 2:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        long j10 = unsafe.getLong(obj, j4);
                        iZzA = zzjl.zzA(i14 << 3);
                        iZzB = zzjl.zzB(j10);
                        iZzu = iZzB + iZzA;
                        iC += iZzu;
                        break;
                    }
                case 3:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        long j11 = unsafe.getLong(obj, j4);
                        iZzA = zzjl.zzA(i14 << 3);
                        iZzB = zzjl.zzB(j11);
                        iZzu = iZzB + iZzA;
                        iC += iZzu;
                        break;
                    }
                case 4:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        int i17 = unsafe.getInt(obj, j4);
                        iZzA2 = zzjl.zzA(i14 << 3);
                        iZzv = zzjl.zzv(i17);
                        iZzu = iZzv + iZzA2;
                        iC += iZzu;
                        break;
                    }
                case 5:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        iC = s.c(i14 << 3, 8, iC);
                        break;
                    }
                case 6:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        iC = s.c(i14 << 3, 4, iC);
                        break;
                    }
                case 7:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        iC = s.c(i14 << 3, 1, iC);
                        break;
                    }
                case 8:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j4);
                        if (!(object instanceof zzjd)) {
                            iZzA2 = zzjl.zzA(i14 << 3);
                            iZzv = zzjl.zzy((String) object);
                            iZzu = iZzv + iZzA2;
                            iC += iZzu;
                            break;
                        } else {
                            int iZzA6 = zzjl.zzA(i14 << 3);
                            int iZzd2 = ((zzjd) object).zzd();
                            iC = C1094a9.m(iZzd2, iZzd2, iZzA6, iC);
                            break;
                        }
                    }
                case 9:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        iZzo = zzly.zzo(i14, unsafe.getObject(obj, j4), zzE(i12));
                        iC += iZzo;
                        break;
                    }
                case 10:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        zzjd zzjdVar = (zzjd) unsafe.getObject(obj, j4);
                        int iZzA7 = zzjl.zzA(i14 << 3);
                        int iZzd3 = zzjdVar.zzd();
                        iC = C1094a9.m(iZzd3, iZzd3, iZzA7, iC);
                        break;
                    }
                case 11:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        iC = s.c(unsafe.getInt(obj, j4), zzjl.zzA(i14 << 3), iC);
                        break;
                    }
                case 12:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        int i18 = unsafe.getInt(obj, j4);
                        iZzA2 = zzjl.zzA(i14 << 3);
                        iZzv = zzjl.zzv(i18);
                        iZzu = iZzv + iZzA2;
                        iC += iZzu;
                        break;
                    }
                case 13:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        iC = s.c(i14 << 3, 4, iC);
                        break;
                    }
                case 14:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        iC = s.c(i14 << 3, 8, iC);
                        break;
                    }
                case 15:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        int i19 = unsafe.getInt(obj, j4);
                        iC = s.c((i19 >> 31) ^ (i19 + i19), zzjl.zzA(i14 << 3), iC);
                        break;
                    }
                case 16:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        long j12 = unsafe.getLong(obj, j4);
                        iZzA = zzjl.zzA(i14 << 3);
                        iZzB = zzjl.zzB((j12 >> 63) ^ (j12 + j12));
                        iZzu = iZzB + iZzA;
                        iC += iZzu;
                        break;
                    }
                case 17:
                    if ((i13 & i) == 0) {
                        break;
                    } else {
                        iZzu = zzjl.zzu(i14, (zzll) unsafe.getObject(obj, j4), zzE(i12));
                        iC += iZzu;
                        break;
                    }
                case 18:
                    iZzo = zzly.zzh(i14, (List) unsafe.getObject(obj, j4), false);
                    iC += iZzo;
                    break;
                case 19:
                    iZzo = zzly.zzf(i14, (List) unsafe.getObject(obj, j4), false);
                    iC += iZzo;
                    break;
                case 20:
                    iZzo = zzly.zzm(i14, (List) unsafe.getObject(obj, j4), false);
                    iC += iZzo;
                    break;
                case 21:
                    iZzo = zzly.zzx(i14, (List) unsafe.getObject(obj, j4), false);
                    iC += iZzo;
                    break;
                case 22:
                    iZzo = zzly.zzk(i14, (List) unsafe.getObject(obj, j4), false);
                    iC += iZzo;
                    break;
                case 23:
                    iZzo = zzly.zzh(i14, (List) unsafe.getObject(obj, j4), false);
                    iC += iZzo;
                    break;
                case 24:
                    iZzo = zzly.zzf(i14, (List) unsafe.getObject(obj, j4), false);
                    iC += iZzo;
                    break;
                case 25:
                    iZzo = zzly.zza(i14, (List) unsafe.getObject(obj, j4), false);
                    iC += iZzo;
                    break;
                case 26:
                    iZzu2 = zzly.zzu(i14, (List) unsafe.getObject(obj, j4));
                    iC += iZzu2;
                    break;
                case 27:
                    iZzu2 = zzly.zzp(i14, (List) unsafe.getObject(obj, j4), zzE(i12));
                    iC += iZzu2;
                    break;
                case 28:
                    iZzu2 = zzly.zzc(i14, (List) unsafe.getObject(obj, j4));
                    iC += iZzu2;
                    break;
                case 29:
                    iZzu2 = zzly.zzv(i14, (List) unsafe.getObject(obj, j4), false);
                    iC += iZzu2;
                    break;
                case 30:
                    z10 = false;
                    iZzd = zzly.zzd(i14, (List) unsafe.getObject(obj, j4), false);
                    iC += iZzd;
                    break;
                case 31:
                    z10 = false;
                    iZzd = zzly.zzf(i14, (List) unsafe.getObject(obj, j4), false);
                    iC += iZzd;
                    break;
                case 32:
                    z10 = false;
                    iZzd = zzly.zzh(i14, (List) unsafe.getObject(obj, j4), false);
                    iC += iZzd;
                    break;
                case 33:
                    z10 = false;
                    iZzd = zzly.zzq(i14, (List) unsafe.getObject(obj, j4), false);
                    iC += iZzd;
                    break;
                case 34:
                    z10 = false;
                    iZzd = zzly.zzs(i14, (List) unsafe.getObject(obj, j4), false);
                    iC += iZzd;
                    break;
                case 35:
                    int iZzi = zzly.zzi((List) unsafe.getObject(obj, j4));
                    if (iZzi > 0) {
                        iC = C1094a9.m(iZzi, zzjl.zzz(i14), iZzi, iC);
                    }
                    break;
                case 36:
                    int iZzg = zzly.zzg((List) unsafe.getObject(obj, j4));
                    if (iZzg > 0) {
                        iC = C1094a9.m(iZzg, zzjl.zzz(i14), iZzg, iC);
                    }
                    break;
                case 37:
                    int iZzn = zzly.zzn((List) unsafe.getObject(obj, j4));
                    if (iZzn > 0) {
                        iC = C1094a9.m(iZzn, zzjl.zzz(i14), iZzn, iC);
                    }
                    break;
                case 38:
                    int iZzy = zzly.zzy((List) unsafe.getObject(obj, j4));
                    if (iZzy > 0) {
                        iC = C1094a9.m(iZzy, zzjl.zzz(i14), iZzy, iC);
                    }
                    break;
                case 39:
                    int iZzl = zzly.zzl((List) unsafe.getObject(obj, j4));
                    if (iZzl > 0) {
                        iC = C1094a9.m(iZzl, zzjl.zzz(i14), iZzl, iC);
                    }
                    break;
                case 40:
                    int iZzi2 = zzly.zzi((List) unsafe.getObject(obj, j4));
                    if (iZzi2 > 0) {
                        iC = C1094a9.m(iZzi2, zzjl.zzz(i14), iZzi2, iC);
                    }
                    break;
                case 41:
                    int iZzg2 = zzly.zzg((List) unsafe.getObject(obj, j4));
                    if (iZzg2 > 0) {
                        iC = C1094a9.m(iZzg2, zzjl.zzz(i14), iZzg2, iC);
                    }
                    break;
                case 42:
                    int iZzb = zzly.zzb((List) unsafe.getObject(obj, j4));
                    if (iZzb > 0) {
                        iC = C1094a9.m(iZzb, zzjl.zzz(i14), iZzb, iC);
                    }
                    break;
                case 43:
                    int iZzw = zzly.zzw((List) unsafe.getObject(obj, j4));
                    if (iZzw > 0) {
                        iC = C1094a9.m(iZzw, zzjl.zzz(i14), iZzw, iC);
                    }
                    break;
                case 44:
                    int iZze = zzly.zze((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iC = C1094a9.m(iZze, zzjl.zzz(i14), iZze, iC);
                    }
                    break;
                case 45:
                    int iZzg3 = zzly.zzg((List) unsafe.getObject(obj, j4));
                    if (iZzg3 > 0) {
                        iC = C1094a9.m(iZzg3, zzjl.zzz(i14), iZzg3, iC);
                    }
                    break;
                case 46:
                    int iZzi3 = zzly.zzi((List) unsafe.getObject(obj, j4));
                    if (iZzi3 > 0) {
                        iC = C1094a9.m(iZzi3, zzjl.zzz(i14), iZzi3, iC);
                    }
                    break;
                case 47:
                    int iZzr = zzly.zzr((List) unsafe.getObject(obj, j4));
                    if (iZzr > 0) {
                        iC = C1094a9.m(iZzr, zzjl.zzz(i14), iZzr, iC);
                    }
                    break;
                case 48:
                    int iZzt = zzly.zzt((List) unsafe.getObject(obj, j4));
                    if (iZzt > 0) {
                        iC = C1094a9.m(iZzt, zzjl.zzz(i14), iZzt, iC);
                    }
                    break;
                case 49:
                    iZzu2 = zzly.zzj(i14, (List) unsafe.getObject(obj, j4), zzE(i12));
                    iC += iZzu2;
                    break;
                case 50:
                    zzlg.zza(i14, unsafe.getObject(obj, j4), zzF(i12));
                    break;
                case 51:
                    if (zzR(obj, i14, i12)) {
                        iC = s.c(i14 << 3, 8, iC);
                    }
                    break;
                case 52:
                    if (zzR(obj, i14, i12)) {
                        iC = s.c(i14 << 3, 4, iC);
                    }
                    break;
                case 53:
                    if (zzR(obj, i14, i12)) {
                        long jZzC = zzC(obj, j4);
                        iZzA3 = zzjl.zzA(i14 << 3);
                        iZzB2 = zzjl.zzB(jZzC);
                        iZzu3 = iZzB2 + iZzA3;
                        iC += iZzu3;
                    }
                    break;
                case 54:
                    if (zzR(obj, i14, i12)) {
                        long jZzC2 = zzC(obj, j4);
                        iZzA3 = zzjl.zzA(i14 << 3);
                        iZzB2 = zzjl.zzB(jZzC2);
                        iZzu3 = iZzB2 + iZzA3;
                        iC += iZzu3;
                    }
                    break;
                case 55:
                    if (zzR(obj, i14, i12)) {
                        int iZzr2 = zzr(obj, j4);
                        iZzA4 = zzjl.zzA(i14 << 3);
                        iZzv2 = zzjl.zzv(iZzr2);
                        iZzu3 = iZzv2 + iZzA4;
                        iC += iZzu3;
                    }
                    break;
                case 56:
                    if (zzR(obj, i14, i12)) {
                        iC = s.c(i14 << 3, 8, iC);
                    }
                    break;
                case 57:
                    if (zzR(obj, i14, i12)) {
                        iC = s.c(i14 << 3, 4, iC);
                    }
                    break;
                case 58:
                    if (zzR(obj, i14, i12)) {
                        iC = s.c(i14 << 3, 1, iC);
                    }
                    break;
                case 59:
                    if (zzR(obj, i14, i12)) {
                        Object object2 = unsafe.getObject(obj, j4);
                        if (object2 instanceof zzjd) {
                            int iZzA8 = zzjl.zzA(i14 << 3);
                            int iZzd4 = ((zzjd) object2).zzd();
                            iC = C1094a9.m(iZzd4, iZzd4, iZzA8, iC);
                        } else {
                            iZzA4 = zzjl.zzA(i14 << 3);
                            iZzv2 = zzjl.zzy((String) object2);
                            iZzu3 = iZzv2 + iZzA4;
                            iC += iZzu3;
                        }
                    }
                    break;
                case 60:
                    if (zzR(obj, i14, i12)) {
                        iZzu2 = zzly.zzo(i14, unsafe.getObject(obj, j4), zzE(i12));
                        iC += iZzu2;
                    }
                    break;
                case 61:
                    if (zzR(obj, i14, i12)) {
                        zzjd zzjdVar2 = (zzjd) unsafe.getObject(obj, j4);
                        int iZzA9 = zzjl.zzA(i14 << 3);
                        int iZzd5 = zzjdVar2.zzd();
                        iC = C1094a9.m(iZzd5, iZzd5, iZzA9, iC);
                    }
                    break;
                case 62:
                    if (zzR(obj, i14, i12)) {
                        iC = s.c(zzr(obj, j4), zzjl.zzA(i14 << 3), iC);
                    }
                    break;
                case 63:
                    if (zzR(obj, i14, i12)) {
                        int iZzr3 = zzr(obj, j4);
                        iZzA4 = zzjl.zzA(i14 << 3);
                        iZzv2 = zzjl.zzv(iZzr3);
                        iZzu3 = iZzv2 + iZzA4;
                        iC += iZzu3;
                    }
                    break;
                case 64:
                    if (zzR(obj, i14, i12)) {
                        iC = s.c(i14 << 3, 4, iC);
                    }
                    break;
                case 65:
                    if (zzR(obj, i14, i12)) {
                        iC = s.c(i14 << 3, 8, iC);
                    }
                    break;
                case 66:
                    if (zzR(obj, i14, i12)) {
                        int iZzr4 = zzr(obj, j4);
                        iC = s.c((iZzr4 >> 31) ^ (iZzr4 + iZzr4), zzjl.zzA(i14 << 3), iC);
                    }
                    break;
                case 67:
                    if (zzR(obj, i14, i12)) {
                        long jZzC3 = zzC(obj, j4);
                        iZzA3 = zzjl.zzA(i14 << 3);
                        iZzB2 = zzjl.zzB((jZzC3 >> 63) ^ (jZzC3 + jZzC3));
                        iZzu3 = iZzB2 + iZzA3;
                        iC += iZzu3;
                    }
                    break;
                case 68:
                    if (zzR(obj, i14, i12)) {
                        iZzu3 = zzjl.zzu(i14, (zzll) unsafe.getObject(obj, j4), zzE(i12));
                        iC += iZzu3;
                    }
                    break;
            }
            i12 += 3;
            i10 = 1048575;
        }
        zzmn zzmnVar = this.zzn;
        int iZza = iC + zzmnVar.zza(zzmnVar.zzc(obj));
        if (!this.zzh) {
            return iZza;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private final int zzq(Object obj) {
        int iZzA;
        int iZzB;
        int iZzA2;
        int iZzv;
        int iZzo;
        int iZzu;
        Unsafe unsafe = zzb;
        int iC = 0;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzB2 = zzB(i);
            int iZzA3 = zzA(iZzB2);
            int i10 = this.zzc[i];
            long j4 = iZzB2 & 1048575;
            if (iZzA3 >= zzjw.zzJ.zza() && iZzA3 <= zzjw.zzW.zza()) {
                int i11 = this.zzc[i + 2];
            }
            switch (iZzA3) {
                case 0:
                    if (zzO(obj, i)) {
                        iC = s.c(i10 << 3, 8, iC);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i)) {
                        iC = s.c(i10 << 3, 4, iC);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i)) {
                        long jZzd = zzmx.zzd(obj, j4);
                        iZzA = zzjl.zzA(i10 << 3);
                        iZzB = zzjl.zzB(jZzd);
                        iZzu = iZzB + iZzA;
                        iC += iZzu;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i)) {
                        long jZzd2 = zzmx.zzd(obj, j4);
                        iZzA = zzjl.zzA(i10 << 3);
                        iZzB = zzjl.zzB(jZzd2);
                        iZzu = iZzB + iZzA;
                        iC += iZzu;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i)) {
                        int iZzc = zzmx.zzc(obj, j4);
                        iZzA2 = zzjl.zzA(i10 << 3);
                        iZzv = zzjl.zzv(iZzc);
                        iZzu = iZzv + iZzA2;
                        iC += iZzu;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i)) {
                        iC = s.c(i10 << 3, 8, iC);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i)) {
                        iC = s.c(i10 << 3, 4, iC);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i)) {
                        iC = s.c(i10 << 3, 1, iC);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj, i)) {
                        Object objZzf = zzmx.zzf(obj, j4);
                        if (objZzf instanceof zzjd) {
                            int iZzA4 = zzjl.zzA(i10 << 3);
                            int iZzd = ((zzjd) objZzf).zzd();
                            iC = C1094a9.m(iZzd, iZzd, iZzA4, iC);
                            break;
                        } else {
                            iZzA2 = zzjl.zzA(i10 << 3);
                            iZzv = zzjl.zzy((String) objZzf);
                            iZzu = iZzv + iZzA2;
                            iC += iZzu;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzO(obj, i)) {
                        iZzo = zzly.zzo(i10, zzmx.zzf(obj, j4), zzE(i));
                        iC += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i)) {
                        zzjd zzjdVar = (zzjd) zzmx.zzf(obj, j4);
                        int iZzA5 = zzjl.zzA(i10 << 3);
                        int iZzd2 = zzjdVar.zzd();
                        iC = C1094a9.m(iZzd2, iZzd2, iZzA5, iC);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i)) {
                        iC = s.c(zzmx.zzc(obj, j4), zzjl.zzA(i10 << 3), iC);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i)) {
                        int iZzc2 = zzmx.zzc(obj, j4);
                        iZzA2 = zzjl.zzA(i10 << 3);
                        iZzv = zzjl.zzv(iZzc2);
                        iZzu = iZzv + iZzA2;
                        iC += iZzu;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i)) {
                        iC = s.c(i10 << 3, 4, iC);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i)) {
                        iC = s.c(i10 << 3, 8, iC);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i)) {
                        int iZzc3 = zzmx.zzc(obj, j4);
                        iC = s.c((iZzc3 >> 31) ^ (iZzc3 + iZzc3), zzjl.zzA(i10 << 3), iC);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i)) {
                        long jZzd3 = zzmx.zzd(obj, j4);
                        iZzA = zzjl.zzA(i10 << 3);
                        iZzB = zzjl.zzB((jZzd3 >> 63) ^ (jZzd3 + jZzd3));
                        iZzu = iZzB + iZzA;
                        iC += iZzu;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i)) {
                        iZzu = zzjl.zzu(i10, (zzll) zzmx.zzf(obj, j4), zzE(i));
                        iC += iZzu;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iZzo = zzly.zzh(i10, (List) zzmx.zzf(obj, j4), false);
                    iC += iZzo;
                    break;
                case 19:
                    iZzo = zzly.zzf(i10, (List) zzmx.zzf(obj, j4), false);
                    iC += iZzo;
                    break;
                case 20:
                    iZzo = zzly.zzm(i10, (List) zzmx.zzf(obj, j4), false);
                    iC += iZzo;
                    break;
                case 21:
                    iZzo = zzly.zzx(i10, (List) zzmx.zzf(obj, j4), false);
                    iC += iZzo;
                    break;
                case 22:
                    iZzo = zzly.zzk(i10, (List) zzmx.zzf(obj, j4), false);
                    iC += iZzo;
                    break;
                case 23:
                    iZzo = zzly.zzh(i10, (List) zzmx.zzf(obj, j4), false);
                    iC += iZzo;
                    break;
                case 24:
                    iZzo = zzly.zzf(i10, (List) zzmx.zzf(obj, j4), false);
                    iC += iZzo;
                    break;
                case 25:
                    iZzo = zzly.zza(i10, (List) zzmx.zzf(obj, j4), false);
                    iC += iZzo;
                    break;
                case 26:
                    iZzo = zzly.zzu(i10, (List) zzmx.zzf(obj, j4));
                    iC += iZzo;
                    break;
                case 27:
                    iZzo = zzly.zzp(i10, (List) zzmx.zzf(obj, j4), zzE(i));
                    iC += iZzo;
                    break;
                case 28:
                    iZzo = zzly.zzc(i10, (List) zzmx.zzf(obj, j4));
                    iC += iZzo;
                    break;
                case 29:
                    iZzo = zzly.zzv(i10, (List) zzmx.zzf(obj, j4), false);
                    iC += iZzo;
                    break;
                case 30:
                    iZzo = zzly.zzd(i10, (List) zzmx.zzf(obj, j4), false);
                    iC += iZzo;
                    break;
                case 31:
                    iZzo = zzly.zzf(i10, (List) zzmx.zzf(obj, j4), false);
                    iC += iZzo;
                    break;
                case 32:
                    iZzo = zzly.zzh(i10, (List) zzmx.zzf(obj, j4), false);
                    iC += iZzo;
                    break;
                case 33:
                    iZzo = zzly.zzq(i10, (List) zzmx.zzf(obj, j4), false);
                    iC += iZzo;
                    break;
                case 34:
                    iZzo = zzly.zzs(i10, (List) zzmx.zzf(obj, j4), false);
                    iC += iZzo;
                    break;
                case 35:
                    int iZzi = zzly.zzi((List) unsafe.getObject(obj, j4));
                    if (iZzi > 0) {
                        iC = C1094a9.m(iZzi, zzjl.zzz(i10), iZzi, iC);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int iZzg = zzly.zzg((List) unsafe.getObject(obj, j4));
                    if (iZzg > 0) {
                        iC = C1094a9.m(iZzg, zzjl.zzz(i10), iZzg, iC);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int iZzn = zzly.zzn((List) unsafe.getObject(obj, j4));
                    if (iZzn > 0) {
                        iC = C1094a9.m(iZzn, zzjl.zzz(i10), iZzn, iC);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int iZzy = zzly.zzy((List) unsafe.getObject(obj, j4));
                    if (iZzy > 0) {
                        iC = C1094a9.m(iZzy, zzjl.zzz(i10), iZzy, iC);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int iZzl = zzly.zzl((List) unsafe.getObject(obj, j4));
                    if (iZzl > 0) {
                        iC = C1094a9.m(iZzl, zzjl.zzz(i10), iZzl, iC);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int iZzi2 = zzly.zzi((List) unsafe.getObject(obj, j4));
                    if (iZzi2 > 0) {
                        iC = C1094a9.m(iZzi2, zzjl.zzz(i10), iZzi2, iC);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int iZzg2 = zzly.zzg((List) unsafe.getObject(obj, j4));
                    if (iZzg2 > 0) {
                        iC = C1094a9.m(iZzg2, zzjl.zzz(i10), iZzg2, iC);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int iZzb = zzly.zzb((List) unsafe.getObject(obj, j4));
                    if (iZzb > 0) {
                        iC = C1094a9.m(iZzb, zzjl.zzz(i10), iZzb, iC);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int iZzw = zzly.zzw((List) unsafe.getObject(obj, j4));
                    if (iZzw > 0) {
                        iC = C1094a9.m(iZzw, zzjl.zzz(i10), iZzw, iC);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int iZze = zzly.zze((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iC = C1094a9.m(iZze, zzjl.zzz(i10), iZze, iC);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int iZzg3 = zzly.zzg((List) unsafe.getObject(obj, j4));
                    if (iZzg3 > 0) {
                        iC = C1094a9.m(iZzg3, zzjl.zzz(i10), iZzg3, iC);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int iZzi3 = zzly.zzi((List) unsafe.getObject(obj, j4));
                    if (iZzi3 > 0) {
                        iC = C1094a9.m(iZzi3, zzjl.zzz(i10), iZzi3, iC);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int iZzr = zzly.zzr((List) unsafe.getObject(obj, j4));
                    if (iZzr > 0) {
                        iC = C1094a9.m(iZzr, zzjl.zzz(i10), iZzr, iC);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int iZzt = zzly.zzt((List) unsafe.getObject(obj, j4));
                    if (iZzt > 0) {
                        iC = C1094a9.m(iZzt, zzjl.zzz(i10), iZzt, iC);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    iZzo = zzly.zzj(i10, (List) zzmx.zzf(obj, j4), zzE(i));
                    iC += iZzo;
                    break;
                case 50:
                    zzlg.zza(i10, zzmx.zzf(obj, j4), zzF(i));
                    break;
                case 51:
                    if (zzR(obj, i10, i)) {
                        iC = s.c(i10 << 3, 8, iC);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i10, i)) {
                        iC = s.c(i10 << 3, 4, iC);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i10, i)) {
                        long jZzC = zzC(obj, j4);
                        iZzA = zzjl.zzA(i10 << 3);
                        iZzB = zzjl.zzB(jZzC);
                        iZzu = iZzB + iZzA;
                        iC += iZzu;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i10, i)) {
                        long jZzC2 = zzC(obj, j4);
                        iZzA = zzjl.zzA(i10 << 3);
                        iZzB = zzjl.zzB(jZzC2);
                        iZzu = iZzB + iZzA;
                        iC += iZzu;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i10, i)) {
                        int iZzr2 = zzr(obj, j4);
                        iZzA2 = zzjl.zzA(i10 << 3);
                        iZzv = zzjl.zzv(iZzr2);
                        iZzu = iZzv + iZzA2;
                        iC += iZzu;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i10, i)) {
                        iC = s.c(i10 << 3, 8, iC);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i10, i)) {
                        iC = s.c(i10 << 3, 4, iC);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i10, i)) {
                        iC = s.c(i10 << 3, 1, iC);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i10, i)) {
                        Object objZzf2 = zzmx.zzf(obj, j4);
                        if (objZzf2 instanceof zzjd) {
                            int iZzA6 = zzjl.zzA(i10 << 3);
                            int iZzd3 = ((zzjd) objZzf2).zzd();
                            iC = C1094a9.m(iZzd3, iZzd3, iZzA6, iC);
                            break;
                        } else {
                            iZzA2 = zzjl.zzA(i10 << 3);
                            iZzv = zzjl.zzy((String) objZzf2);
                            iZzu = iZzv + iZzA2;
                            iC += iZzu;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i10, i)) {
                        iZzo = zzly.zzo(i10, zzmx.zzf(obj, j4), zzE(i));
                        iC += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i10, i)) {
                        zzjd zzjdVar2 = (zzjd) zzmx.zzf(obj, j4);
                        int iZzA7 = zzjl.zzA(i10 << 3);
                        int iZzd4 = zzjdVar2.zzd();
                        iC = C1094a9.m(iZzd4, iZzd4, iZzA7, iC);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i10, i)) {
                        iC = s.c(zzr(obj, j4), zzjl.zzA(i10 << 3), iC);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i10, i)) {
                        int iZzr3 = zzr(obj, j4);
                        iZzA2 = zzjl.zzA(i10 << 3);
                        iZzv = zzjl.zzv(iZzr3);
                        iZzu = iZzv + iZzA2;
                        iC += iZzu;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i10, i)) {
                        iC = s.c(i10 << 3, 4, iC);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i10, i)) {
                        iC = s.c(i10 << 3, 8, iC);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i10, i)) {
                        int iZzr4 = zzr(obj, j4);
                        iC = s.c((iZzr4 >> 31) ^ (iZzr4 + iZzr4), zzjl.zzA(i10 << 3), iC);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i10, i)) {
                        long jZzC3 = zzC(obj, j4);
                        iZzA = zzjl.zzA(i10 << 3);
                        iZzB = zzjl.zzB((jZzC3 >> 63) ^ (jZzC3 + jZzC3));
                        iZzu = iZzB + iZzA;
                        iC += iZzu;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i10, i)) {
                        iZzu = zzjl.zzu(i10, (zzll) zzmx.zzf(obj, j4), zzE(i));
                        iC += iZzu;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzmn zzmnVar = this.zzn;
        return iC + zzmnVar.zza(zzmnVar.zzc(obj));
    }

    private static int zzr(Object obj, long j4) {
        return ((Integer) zzmx.zzf(obj, j4)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i10, int i11, long j4, zziq zziqVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzF = zzF(i11);
        Object object = unsafe.getObject(obj, j4);
        if (!((zzlf) object).zze()) {
            zzlf zzlfVarZzb = zzlf.zza().zzb();
            zzlg.zzb(zzlfVarZzb, object);
            unsafe.putObject(obj, j4, zzlfVarZzb);
        }
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i10, int i11, int i12, int i13, int i14, int i15, long j4, int i16, zziq zziqVar) throws IOException {
        Object object;
        Unsafe unsafe = zzb;
        long j10 = this.zzc[i16 + 2] & 1048575;
        switch (i15) {
            case 51:
                if (i13 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j4, Double.valueOf(Double.longBitsToDouble(zzir.zzn(bArr, i))));
                unsafe.putInt(obj, j10, i12);
                return i + 8;
            case 52:
                if (i13 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j4, Float.valueOf(Float.intBitsToFloat(zzir.zzb(bArr, i))));
                unsafe.putInt(obj, j10, i12);
                return i + 4;
            case 53:
            case 54:
                if (i13 != 0) {
                    return i;
                }
                int iZzm = zzir.zzm(bArr, i, zziqVar);
                unsafe.putObject(obj, j4, Long.valueOf(zziqVar.zzb));
                unsafe.putInt(obj, j10, i12);
                return iZzm;
            case 55:
            case 62:
                if (i13 != 0) {
                    return i;
                }
                int iZzj = zzir.zzj(bArr, i, zziqVar);
                unsafe.putObject(obj, j4, Integer.valueOf(zziqVar.zza));
                unsafe.putInt(obj, j10, i12);
                return iZzj;
            case 56:
            case 65:
                if (i13 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j4, Long.valueOf(zzir.zzn(bArr, i)));
                unsafe.putInt(obj, j10, i12);
                return i + 8;
            case 57:
            case 64:
                if (i13 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j4, Integer.valueOf(zzir.zzb(bArr, i)));
                unsafe.putInt(obj, j10, i12);
                return i + 4;
            case 58:
                if (i13 != 0) {
                    return i;
                }
                int iZzm2 = zzir.zzm(bArr, i, zziqVar);
                unsafe.putObject(obj, j4, Boolean.valueOf(zziqVar.zzb != 0));
                unsafe.putInt(obj, j10, i12);
                return iZzm2;
            case 59:
                if (i13 != 2) {
                    return i;
                }
                int iZzj2 = zzir.zzj(bArr, i, zziqVar);
                int i17 = zziqVar.zza;
                if (i17 == 0) {
                    unsafe.putObject(obj, j4, "");
                } else {
                    if ((i14 & 536870912) != 0 && !zznc.zzf(bArr, iZzj2, iZzj2 + i17)) {
                        throw zzko.zzc();
                    }
                    unsafe.putObject(obj, j4, new String(bArr, iZzj2, i17, zzkm.zzb));
                    iZzj2 += i17;
                }
                unsafe.putInt(obj, j10, i12);
                return iZzj2;
            case 60:
                if (i13 != 2) {
                    return i;
                }
                int iZzd = zzir.zzd(zzE(i16), bArr, i, i10, zziqVar);
                object = unsafe.getInt(obj, j10) == i12 ? unsafe.getObject(obj, j4) : null;
                if (object == null) {
                    unsafe.putObject(obj, j4, zziqVar.zzc);
                } else {
                    unsafe.putObject(obj, j4, zzkm.zzg(object, zziqVar.zzc));
                }
                unsafe.putInt(obj, j10, i12);
                return iZzd;
            case 61:
                if (i13 != 2) {
                    return i;
                }
                int iZza = zzir.zza(bArr, i, zziqVar);
                unsafe.putObject(obj, j4, zziqVar.zzc);
                unsafe.putInt(obj, j10, i12);
                return iZza;
            case 63:
                if (i13 != 0) {
                    return i;
                }
                int iZzj3 = zzir.zzj(bArr, i, zziqVar);
                int i18 = zziqVar.zza;
                zzki zzkiVarZzD = zzD(i16);
                if (zzkiVarZzD != null && !zzkiVarZzD.zza(i18)) {
                    zzd(obj).zzh(i11, Long.valueOf(i18));
                    return iZzj3;
                }
                unsafe.putObject(obj, j4, Integer.valueOf(i18));
                unsafe.putInt(obj, j10, i12);
                return iZzj3;
            case 66:
                if (i13 != 0) {
                    return i;
                }
                int iZzj4 = zzir.zzj(bArr, i, zziqVar);
                unsafe.putObject(obj, j4, Integer.valueOf(zzjh.zzb(zziqVar.zza)));
                unsafe.putInt(obj, j10, i12);
                return iZzj4;
            case 67:
                if (i13 != 0) {
                    return i;
                }
                int iZzm3 = zzir.zzm(bArr, i, zziqVar);
                unsafe.putObject(obj, j4, Long.valueOf(zzjh.zzc(zziqVar.zzb)));
                unsafe.putInt(obj, j10, i12);
                return iZzm3;
            case 68:
                if (i13 == 3) {
                    int iZzc = zzir.zzc(zzE(i16), bArr, i, i10, (i11 & (-8)) | 4, zziqVar);
                    object = unsafe.getInt(obj, j10) == i12 ? unsafe.getObject(obj, j4) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j4, zziqVar.zzc);
                    } else {
                        unsafe.putObject(obj, j4, zzkm.zzg(object, zziqVar.zzc));
                    }
                    unsafe.putInt(obj, j10, i12);
                    return iZzc;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0080. Please report as an issue. */
    private final int zzu(Object obj, byte[] bArr, int i, int i10, zziq zziqVar) throws IOException {
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
        zzlo<T> zzloVar = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i21 = i10;
        zziq zziqVar2 = zziqVar;
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
                iZzk = zzir.zzk(i27, bArr2, iZzk, zziqVar2);
                i27 = zziqVar2.zza;
            }
            int i28 = iZzk;
            int i29 = i27 >>> 3;
            int i30 = i27 & 7;
            int iZzx = i29 > i23 ? zzloVar.zzx(i29, i24 / 3) : zzloVar.zzw(i29);
            if (iZzx == i22) {
                unsafe = unsafe2;
                i11 = i27;
                i12 = i22;
                i13 = i29;
                i14 = 0;
                obj2 = obj3;
            } else {
                int[] iArr = zzloVar.zzc;
                int i31 = iArr[iZzx + 1];
                int iZzA = zzA(i31);
                int i32 = i27;
                int i33 = iZzx;
                long j4 = i31 & 1048575;
                if (iZzA <= 17) {
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
                    switch (iZzA) {
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
                                zzmx.zzo(obj3, j4, Double.longBitsToDouble(zzir.zzn(bArr2, i28)));
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
                                zzmx.zzp(obj3, j4, Float.intBitsToFloat(zzir.zzb(bArr2, i28)));
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
                                int iZzm2 = zzir.zzm(bArr2, i28, zziqVar2);
                                Unsafe unsafe3 = unsafe2;
                                Object obj4 = obj3;
                                unsafe3.putLong(obj4, j4, zziqVar2.zzb);
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
                                int iZzj = zzir.zzj(bArr2, i28, zziqVar2);
                                unsafe2.putInt(obj3, j4, zziqVar2.zza);
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
                                unsafe4.putLong(obj5, j4, zzir.zzn(bArr2, i28));
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
                                unsafe2.putInt(obj3, j4, zzir.zzb(bArr2, i28));
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
                                iZzm = zzir.zzm(bArr2, i28, zziqVar2);
                                zzmx.zzm(obj3, j4, zziqVar2.zzb != 0);
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
                                iZzm = (536870912 & i31) == 0 ? zzir.zzg(bArr2, i28, zziqVar2) : zzir.zzh(bArr2, i28, zziqVar2);
                                unsafe2.putObject(obj3, j4, zziqVar2.zzc);
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
                                iZzm = zzir.zzd(zzloVar.zzE(i20), bArr2, i28, i21, zziqVar2);
                                Object object = unsafe2.getObject(obj3, j4);
                                if (object == null) {
                                    unsafe2.putObject(obj3, j4, zziqVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj3, j4, zzkm.zzg(object, zziqVar2.zzc));
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
                                iZzm = zzir.zza(bArr2, i28, zziqVar2);
                                unsafe2.putObject(obj3, j4, zziqVar2.zzc);
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
                                iZzm = zzir.zzj(bArr2, i28, zziqVar2);
                                unsafe2.putInt(obj3, j4, zziqVar2.zza);
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
                                iZzm = zzir.zzj(bArr2, i28, zziqVar2);
                                unsafe2.putInt(obj3, j4, zzjh.zzb(zziqVar2.zza));
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
                                int iZzm3 = zzir.zzm(bArr2, i28, zziqVar2);
                                Unsafe unsafe5 = unsafe2;
                                Object obj6 = obj3;
                                i20 = i33;
                                unsafe5.putLong(obj6, j4, zzjh.zzc(zziqVar2.zzb));
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
                    if (iZzA != 27) {
                        i15 = i28;
                        Unsafe unsafe6 = unsafe2;
                        if (iZzA <= 49) {
                            i16 = i25;
                            unsafe = unsafe6;
                            i12 = -1;
                            i18 = i26;
                            int iZzv = zzloVar.zzv(obj, bArr, i15, i10, i32, i29, i30, i14, i31, iZzA, j4, zziqVar);
                            i17 = i32;
                            i19 = i29;
                            if (iZzv != i15) {
                                zzloVar = this;
                                obj3 = obj;
                                zziqVar2 = zziqVar;
                                iZzm = iZzv;
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
                                i28 = iZzv;
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
                            if (iZzA != 50) {
                                i13 = i19;
                                int iZzt = zzt(obj, bArr, i15, i10, i17, i13, i30, i31, iZzA, j4, i14, zziqVar);
                                obj2 = obj;
                                i11 = i17;
                                i14 = i14;
                                if (iZzt != i15) {
                                    zzloVar = this;
                                    zziqVar2 = zziqVar;
                                    i23 = i13;
                                    iZzm = iZzt;
                                    i24 = i14;
                                    obj3 = obj2;
                                    i26 = i18;
                                    i22 = i12;
                                    i25 = i16;
                                    unsafe2 = unsafe;
                                    bArr2 = bArr;
                                    i21 = i10;
                                } else {
                                    i28 = iZzt;
                                }
                            } else if (i30 == 2) {
                                int iZzs = zzs(obj, bArr, i15, i10, i14, j4, zziqVar);
                                i14 = i14;
                                if (iZzs != i15) {
                                    zzloVar = this;
                                    obj3 = obj;
                                    bArr2 = bArr;
                                    zziqVar2 = zziqVar;
                                    iZzm = iZzs;
                                    i24 = i14;
                                    i23 = i19;
                                    i26 = i18;
                                    i22 = -1;
                                    i25 = i16;
                                    unsafe2 = unsafe;
                                    i21 = i10;
                                } else {
                                    obj2 = obj;
                                    i28 = iZzs;
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
                        zzkl zzklVarZzd = (zzkl) unsafe2.getObject(obj3, j4);
                        if (!zzklVarZzd.zzc()) {
                            int size = zzklVarZzd.size();
                            zzklVarZzd = zzklVarZzd.zzd(size == 0 ? 10 : size + size);
                            unsafe2.putObject(obj3, j4, zzklVarZzd);
                        }
                        int iZze = zzir.zze(zzloVar.zzE(i14), i32, bArr2, i28, i10, zzklVarZzd, zziqVar2);
                        bArr2 = bArr;
                        zziqVar2 = zziqVar;
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
            int iZzi = zzir.zzi(i11, bArr, i28, i10, zzd(obj2), zziqVar);
            bArr2 = bArr;
            zziqVar2 = zziqVar;
            i23 = i13;
            i24 = i14;
            obj3 = obj2;
            i22 = i12;
            unsafe2 = unsafe;
            i21 = i10;
            iZzm = iZzi;
            zzloVar = this;
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
        throw zzko.zze();
    }

    private final int zzv(Object obj, byte[] bArr, int i, int i10, int i11, int i12, int i13, int i14, long j4, int i15, long j10, zziq zziqVar) throws IOException {
        int iZzl;
        Unsafe unsafe = zzb;
        zzkl zzklVarZzd = (zzkl) unsafe.getObject(obj, j10);
        if (!zzklVarZzd.zzc()) {
            int size = zzklVarZzd.size();
            zzklVarZzd = zzklVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j10, zzklVarZzd);
        }
        zzkl zzklVar = zzklVarZzd;
        switch (i15) {
            case 18:
            case 35:
                if (i13 == 2) {
                    zzjn zzjnVar = (zzjn) zzklVar;
                    int iZzj = zzir.zzj(bArr, i, zziqVar);
                    int i16 = zziqVar.zza + iZzj;
                    while (iZzj < i16) {
                        zzjnVar.zze(Double.longBitsToDouble(zzir.zzn(bArr, iZzj)));
                        iZzj += 8;
                    }
                    if (iZzj == i16) {
                        return iZzj;
                    }
                    throw zzko.zzf();
                }
                if (i13 == 1) {
                    zzjn zzjnVar2 = (zzjn) zzklVar;
                    zzjnVar2.zze(Double.longBitsToDouble(zzir.zzn(bArr, i)));
                    int i17 = i + 8;
                    while (i17 < i10) {
                        int iZzj2 = zzir.zzj(bArr, i17, zziqVar);
                        if (i11 != zziqVar.zza) {
                            return i17;
                        }
                        zzjnVar2.zze(Double.longBitsToDouble(zzir.zzn(bArr, iZzj2)));
                        i17 = iZzj2 + 8;
                    }
                    return i17;
                }
                return i;
            case 19:
            case 36:
                if (i13 == 2) {
                    zzjx zzjxVar = (zzjx) zzklVar;
                    int iZzj3 = zzir.zzj(bArr, i, zziqVar);
                    int i18 = zziqVar.zza + iZzj3;
                    while (iZzj3 < i18) {
                        zzjxVar.zze(Float.intBitsToFloat(zzir.zzb(bArr, iZzj3)));
                        iZzj3 += 4;
                    }
                    if (iZzj3 == i18) {
                        return iZzj3;
                    }
                    throw zzko.zzf();
                }
                if (i13 == 5) {
                    zzjx zzjxVar2 = (zzjx) zzklVar;
                    zzjxVar2.zze(Float.intBitsToFloat(zzir.zzb(bArr, i)));
                    int i19 = i + 4;
                    while (i19 < i10) {
                        int iZzj4 = zzir.zzj(bArr, i19, zziqVar);
                        if (i11 != zziqVar.zza) {
                            return i19;
                        }
                        zzjxVar2.zze(Float.intBitsToFloat(zzir.zzb(bArr, iZzj4)));
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
                    zzla zzlaVar = (zzla) zzklVar;
                    int iZzj5 = zzir.zzj(bArr, i, zziqVar);
                    int i20 = zziqVar.zza + iZzj5;
                    while (iZzj5 < i20) {
                        iZzj5 = zzir.zzm(bArr, iZzj5, zziqVar);
                        zzlaVar.zzg(zziqVar.zzb);
                    }
                    if (iZzj5 == i20) {
                        return iZzj5;
                    }
                    throw zzko.zzf();
                }
                if (i13 == 0) {
                    zzla zzlaVar2 = (zzla) zzklVar;
                    int iZzm = zzir.zzm(bArr, i, zziqVar);
                    zzlaVar2.zzg(zziqVar.zzb);
                    while (iZzm < i10) {
                        int iZzj6 = zzir.zzj(bArr, iZzm, zziqVar);
                        if (i11 != zziqVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzir.zzm(bArr, iZzj6, zziqVar);
                        zzlaVar2.zzg(zziqVar.zzb);
                    }
                    return iZzm;
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i13 == 2) {
                    return zzir.zzf(bArr, i, zzklVar, zziqVar);
                }
                if (i13 == 0) {
                    return zzir.zzl(i11, bArr, i, i10, zzklVar, zziqVar);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i13 == 2) {
                    zzla zzlaVar3 = (zzla) zzklVar;
                    int iZzj7 = zzir.zzj(bArr, i, zziqVar);
                    int i21 = zziqVar.zza + iZzj7;
                    while (iZzj7 < i21) {
                        zzlaVar3.zzg(zzir.zzn(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i21) {
                        return iZzj7;
                    }
                    throw zzko.zzf();
                }
                if (i13 == 1) {
                    zzla zzlaVar4 = (zzla) zzklVar;
                    zzlaVar4.zzg(zzir.zzn(bArr, i));
                    int i22 = i + 8;
                    while (i22 < i10) {
                        int iZzj8 = zzir.zzj(bArr, i22, zziqVar);
                        if (i11 != zziqVar.zza) {
                            return i22;
                        }
                        zzlaVar4.zzg(zzir.zzn(bArr, iZzj8));
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
                    zzkf zzkfVar = (zzkf) zzklVar;
                    int iZzj9 = zzir.zzj(bArr, i, zziqVar);
                    int i23 = zziqVar.zza + iZzj9;
                    while (iZzj9 < i23) {
                        zzkfVar.zzh(zzir.zzb(bArr, iZzj9));
                        iZzj9 += 4;
                    }
                    if (iZzj9 == i23) {
                        return iZzj9;
                    }
                    throw zzko.zzf();
                }
                if (i13 == 5) {
                    zzkf zzkfVar2 = (zzkf) zzklVar;
                    zzkfVar2.zzh(zzir.zzb(bArr, i));
                    int i24 = i + 4;
                    while (i24 < i10) {
                        int iZzj10 = zzir.zzj(bArr, i24, zziqVar);
                        if (i11 != zziqVar.zza) {
                            return i24;
                        }
                        zzkfVar2.zzh(zzir.zzb(bArr, iZzj10));
                        i24 = iZzj10 + 4;
                    }
                    return i24;
                }
                return i;
            case 25:
            case 42:
                if (i13 == 2) {
                    zzis zzisVar = (zzis) zzklVar;
                    int iZzj11 = zzir.zzj(bArr, i, zziqVar);
                    int i25 = zziqVar.zza + iZzj11;
                    while (iZzj11 < i25) {
                        iZzj11 = zzir.zzm(bArr, iZzj11, zziqVar);
                        zzisVar.zze(zziqVar.zzb != 0);
                    }
                    if (iZzj11 == i25) {
                        return iZzj11;
                    }
                    throw zzko.zzf();
                }
                if (i13 == 0) {
                    zzis zzisVar2 = (zzis) zzklVar;
                    int iZzm2 = zzir.zzm(bArr, i, zziqVar);
                    zzisVar2.zze(zziqVar.zzb != 0);
                    while (iZzm2 < i10) {
                        int iZzj12 = zzir.zzj(bArr, iZzm2, zziqVar);
                        if (i11 != zziqVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzir.zzm(bArr, iZzj12, zziqVar);
                        zzisVar2.zze(zziqVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return i;
            case 26:
                if (i13 == 2) {
                    if ((j4 & 536870912) == 0) {
                        int iZzj13 = zzir.zzj(bArr, i, zziqVar);
                        int i26 = zziqVar.zza;
                        if (i26 < 0) {
                            throw zzko.zzd();
                        }
                        if (i26 == 0) {
                            zzklVar.add("");
                        } else {
                            zzklVar.add(new String(bArr, iZzj13, i26, zzkm.zzb));
                            iZzj13 += i26;
                        }
                        while (iZzj13 < i10) {
                            int iZzj14 = zzir.zzj(bArr, iZzj13, zziqVar);
                            if (i11 != zziqVar.zza) {
                                return iZzj13;
                            }
                            iZzj13 = zzir.zzj(bArr, iZzj14, zziqVar);
                            int i27 = zziqVar.zza;
                            if (i27 < 0) {
                                throw zzko.zzd();
                            }
                            if (i27 == 0) {
                                zzklVar.add("");
                            } else {
                                zzklVar.add(new String(bArr, iZzj13, i27, zzkm.zzb));
                                iZzj13 += i27;
                            }
                        }
                        return iZzj13;
                    }
                    int iZzj15 = zzir.zzj(bArr, i, zziqVar);
                    int i28 = zziqVar.zza;
                    if (i28 < 0) {
                        throw zzko.zzd();
                    }
                    if (i28 == 0) {
                        zzklVar.add("");
                    } else {
                        int i29 = iZzj15 + i28;
                        if (!zznc.zzf(bArr, iZzj15, i29)) {
                            throw zzko.zzc();
                        }
                        zzklVar.add(new String(bArr, iZzj15, i28, zzkm.zzb));
                        iZzj15 = i29;
                    }
                    while (iZzj15 < i10) {
                        int iZzj16 = zzir.zzj(bArr, iZzj15, zziqVar);
                        if (i11 != zziqVar.zza) {
                            return iZzj15;
                        }
                        iZzj15 = zzir.zzj(bArr, iZzj16, zziqVar);
                        int i30 = zziqVar.zza;
                        if (i30 < 0) {
                            throw zzko.zzd();
                        }
                        if (i30 == 0) {
                            zzklVar.add("");
                        } else {
                            int i31 = iZzj15 + i30;
                            if (!zznc.zzf(bArr, iZzj15, i31)) {
                                throw zzko.zzc();
                            }
                            zzklVar.add(new String(bArr, iZzj15, i30, zzkm.zzb));
                            iZzj15 = i31;
                        }
                    }
                    return iZzj15;
                }
                return i;
            case 27:
                if (i13 == 2) {
                    return zzir.zze(zzE(i14), i11, bArr, i, i10, zzklVar, zziqVar);
                }
                return i;
            case 28:
                if (i13 == 2) {
                    int iZzj17 = zzir.zzj(bArr, i, zziqVar);
                    int i32 = zziqVar.zza;
                    if (i32 < 0) {
                        throw zzko.zzd();
                    }
                    if (i32 > bArr.length - iZzj17) {
                        throw zzko.zzf();
                    }
                    if (i32 == 0) {
                        zzklVar.add(zzjd.zzb);
                    } else {
                        zzklVar.add(zzjd.zzl(bArr, iZzj17, i32));
                        iZzj17 += i32;
                    }
                    while (iZzj17 < i10) {
                        int iZzj18 = zzir.zzj(bArr, iZzj17, zziqVar);
                        if (i11 != zziqVar.zza) {
                            return iZzj17;
                        }
                        iZzj17 = zzir.zzj(bArr, iZzj18, zziqVar);
                        int i33 = zziqVar.zza;
                        if (i33 < 0) {
                            throw zzko.zzd();
                        }
                        if (i33 > bArr.length - iZzj17) {
                            throw zzko.zzf();
                        }
                        if (i33 == 0) {
                            zzklVar.add(zzjd.zzb);
                        } else {
                            zzklVar.add(zzjd.zzl(bArr, iZzj17, i33));
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
                        iZzl = zzir.zzl(i11, bArr, i, i10, zzklVar, zziqVar);
                    }
                    return i;
                }
                iZzl = zzir.zzf(bArr, i, zzklVar, zziqVar);
                zzke zzkeVar = (zzke) obj;
                zzmo zzmoVar = zzkeVar.zzc;
                if (zzmoVar == zzmo.zzc()) {
                    zzmoVar = null;
                }
                Object objZzC = zzly.zzC(i12, zzklVar, zzD(i14), zzmoVar, this.zzn);
                if (objZzC == null) {
                    return iZzl;
                }
                zzkeVar.zzc = (zzmo) objZzC;
                return iZzl;
            case 33:
            case 47:
                if (i13 == 2) {
                    zzkf zzkfVar3 = (zzkf) zzklVar;
                    int iZzj19 = zzir.zzj(bArr, i, zziqVar);
                    int i34 = zziqVar.zza + iZzj19;
                    while (iZzj19 < i34) {
                        iZzj19 = zzir.zzj(bArr, iZzj19, zziqVar);
                        zzkfVar3.zzh(zzjh.zzb(zziqVar.zza));
                    }
                    if (iZzj19 == i34) {
                        return iZzj19;
                    }
                    throw zzko.zzf();
                }
                if (i13 == 0) {
                    zzkf zzkfVar4 = (zzkf) zzklVar;
                    int iZzj20 = zzir.zzj(bArr, i, zziqVar);
                    zzkfVar4.zzh(zzjh.zzb(zziqVar.zza));
                    while (iZzj20 < i10) {
                        int iZzj21 = zzir.zzj(bArr, iZzj20, zziqVar);
                        if (i11 != zziqVar.zza) {
                            return iZzj20;
                        }
                        iZzj20 = zzir.zzj(bArr, iZzj21, zziqVar);
                        zzkfVar4.zzh(zzjh.zzb(zziqVar.zza));
                    }
                    return iZzj20;
                }
                return i;
            case 34:
            case 48:
                if (i13 == 2) {
                    zzla zzlaVar5 = (zzla) zzklVar;
                    int iZzj22 = zzir.zzj(bArr, i, zziqVar);
                    int i35 = zziqVar.zza + iZzj22;
                    while (iZzj22 < i35) {
                        iZzj22 = zzir.zzm(bArr, iZzj22, zziqVar);
                        zzlaVar5.zzg(zzjh.zzc(zziqVar.zzb));
                    }
                    if (iZzj22 == i35) {
                        return iZzj22;
                    }
                    throw zzko.zzf();
                }
                if (i13 == 0) {
                    zzla zzlaVar6 = (zzla) zzklVar;
                    int iZzm3 = zzir.zzm(bArr, i, zziqVar);
                    zzlaVar6.zzg(zzjh.zzc(zziqVar.zzb));
                    while (iZzm3 < i10) {
                        int iZzj23 = zzir.zzj(bArr, iZzm3, zziqVar);
                        if (i11 != zziqVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzir.zzm(bArr, iZzj23, zziqVar);
                        zzlaVar6.zzg(zzjh.zzc(zziqVar.zzb));
                    }
                    return iZzm3;
                }
                return i;
            default:
                if (i13 == 3) {
                    zzlw zzlwVarZzE = zzE(i14);
                    int i36 = (i11 & (-8)) | 4;
                    int iZzc = zzir.zzc(zzlwVarZzE, bArr, i, i10, i36, zziqVar);
                    zzlw zzlwVar = zzlwVarZzE;
                    zziq zziqVar2 = zziqVar;
                    zzklVar.add(zziqVar2.zzc);
                    while (iZzc < i10) {
                        int iZzj24 = zzir.zzj(bArr, iZzc, zziqVar2);
                        if (i11 != zziqVar2.zza) {
                            return iZzc;
                        }
                        zzlw zzlwVar2 = zzlwVar;
                        zziq zziqVar3 = zziqVar2;
                        iZzc = zzir.zzc(zzlwVar2, bArr, iZzj24, i10, i36, zziqVar3);
                        zzklVar.add(zziqVar3.zzc);
                        zzlwVar = zzlwVar2;
                        zziqVar2 = zziqVar3;
                    }
                    return iZzc;
                }
                return i;
        }
    }

    private final int zzw(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, 0);
    }

    private final int zzx(int i, int i10) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, i10);
    }

    private final int zzy(int i) {
        return this.zzc[i + 2];
    }

    private final int zzz(int i, int i10) {
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

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final int zzb(Object obj) {
        int i;
        int iZzc;
        int i10;
        int iZzc2;
        int length = this.zzc.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iZzB = zzB(i12);
            int i13 = this.zzc[i12];
            long j4 = 1048575 & iZzB;
            int iHashCode = 37;
            switch (zzA(iZzB)) {
                case 0:
                    i = i11 * 53;
                    iZzc = zzkm.zzc(Double.doubleToLongBits(zzmx.zza(obj, j4)));
                    i11 = iZzc + i;
                    break;
                case 1:
                    i = i11 * 53;
                    iZzc = Float.floatToIntBits(zzmx.zzb(obj, j4));
                    i11 = iZzc + i;
                    break;
                case 2:
                    i = i11 * 53;
                    iZzc = zzkm.zzc(zzmx.zzd(obj, j4));
                    i11 = iZzc + i;
                    break;
                case 3:
                    i = i11 * 53;
                    iZzc = zzkm.zzc(zzmx.zzd(obj, j4));
                    i11 = iZzc + i;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iZzc2 = zzmx.zzc(obj, j4);
                    i11 = i10 + iZzc2;
                    break;
                case 5:
                    i = i11 * 53;
                    iZzc = zzkm.zzc(zzmx.zzd(obj, j4));
                    i11 = iZzc + i;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iZzc2 = zzmx.zzc(obj, j4);
                    i11 = i10 + iZzc2;
                    break;
                case 7:
                    i = i11 * 53;
                    iZzc = zzkm.zza(zzmx.zzw(obj, j4));
                    i11 = iZzc + i;
                    break;
                case 8:
                    i = i11 * 53;
                    iZzc = ((String) zzmx.zzf(obj, j4)).hashCode();
                    i11 = iZzc + i;
                    break;
                case 9:
                    Object objZzf = zzmx.zzf(obj, j4);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i = i11 * 53;
                    iZzc = zzmx.zzf(obj, j4).hashCode();
                    i11 = iZzc + i;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iZzc2 = zzmx.zzc(obj, j4);
                    i11 = i10 + iZzc2;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iZzc2 = zzmx.zzc(obj, j4);
                    i11 = i10 + iZzc2;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iZzc2 = zzmx.zzc(obj, j4);
                    i11 = i10 + iZzc2;
                    break;
                case 14:
                    i = i11 * 53;
                    iZzc = zzkm.zzc(zzmx.zzd(obj, j4));
                    i11 = iZzc + i;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iZzc2 = zzmx.zzc(obj, j4);
                    i11 = i10 + iZzc2;
                    break;
                case 16:
                    i = i11 * 53;
                    iZzc = zzkm.zzc(zzmx.zzd(obj, j4));
                    i11 = iZzc + i;
                    break;
                case 17:
                    Object objZzf2 = zzmx.zzf(obj, j4);
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
                    iZzc = zzmx.zzf(obj, j4).hashCode();
                    i11 = iZzc + i;
                    break;
                case 50:
                    i = i11 * 53;
                    iZzc = zzmx.zzf(obj, j4).hashCode();
                    i11 = iZzc + i;
                    break;
                case 51:
                    if (zzR(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzkm.zzc(Double.doubleToLongBits(zzn(obj, j4)));
                        i11 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = Float.floatToIntBits(zzo(obj, j4));
                        i11 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzkm.zzc(zzC(obj, j4));
                        i11 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzkm.zzc(zzC(obj, j4));
                        i11 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc2 = zzr(obj, j4);
                        i11 = i10 + iZzc2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzkm.zzc(zzC(obj, j4));
                        i11 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc2 = zzr(obj, j4);
                        i11 = i10 + iZzc2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzkm.zza(zzS(obj, j4));
                        i11 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = ((String) zzmx.zzf(obj, j4)).hashCode();
                        i11 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzmx.zzf(obj, j4).hashCode();
                        i11 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzmx.zzf(obj, j4).hashCode();
                        i11 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc2 = zzr(obj, j4);
                        i11 = i10 + iZzc2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc2 = zzr(obj, j4);
                        i11 = i10 + iZzc2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc2 = zzr(obj, j4);
                        i11 = i10 + iZzc2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzkm.zzc(zzC(obj, j4));
                        i11 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc2 = zzr(obj, j4);
                        i11 = i10 + iZzc2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzkm.zzc(zzC(obj, j4));
                        i11 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzmx.zzf(obj, j4).hashCode();
                        i11 = iZzc + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = this.zzn.zzc(obj).hashCode() + (i11 * 53);
        if (!this.zzh) {
            return iHashCode2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x04a0, code lost:
    
        if (r11 == r15) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x04a2, code lost:
    
        r20.putInt(r9, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04a8, code lost:
    
        r0 = r8.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04ac, code lost:
    
        if (r0 >= r8.zzl) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x04ae, code lost:
    
        r1 = r8.zzj[r0];
        r2 = r8.zzc[r1];
        r2 = com.google.android.gms.internal.measurement.zzmx.zzf(r9, r8.zzB(r1) & r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x04c0, code lost:
    
        if (r2 != null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04c7, code lost:
    
        if (r8.zzD(r1) != null) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04c9, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04cc, code lost:
    
        r2 = (com.google.android.gms.internal.measurement.zzlf) r2;
        r0 = (com.google.android.gms.internal.measurement.zzle) r8.zzF(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04d4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04d5, code lost:
    
        if (r7 != 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04d7, code lost:
    
        if (r3 != r4) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x04de, code lost:
    
        throw com.google.android.gms.internal.measurement.zzko.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x04df, code lost:
    
        if (r3 > r4) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x04e1, code lost:
    
        if (r6 != r7) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x04e3, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x04e8, code lost:
    
        throw com.google.android.gms.internal.measurement.zzko.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.measurement.zziq r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlo.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zziq):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final Object zze() {
        return ((zzke) this.zzg).zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zzf(Object obj) {
        int i;
        int i10 = this.zzk;
        while (true) {
            i = this.zzl;
            if (i10 >= i) {
                break;
            }
            long jZzB = zzB(this.zzj[i10]) & 1048575;
            Object objZzf = zzmx.zzf(obj, jZzB);
            if (objZzf != null) {
                ((zzlf) objZzf).zzc();
                zzmx.zzs(obj, jZzB, objZzf);
            }
            i10++;
        }
        int length = this.zzj.length;
        while (i < length) {
            this.zzm.zza(obj, this.zzj[i]);
            i++;
        }
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzB = zzB(i);
            long j4 = 1048575 & iZzB;
            int i10 = this.zzc[i];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzO(obj2, i)) {
                        zzmx.zzo(obj, j4, zzmx.zza(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj2, i)) {
                        zzmx.zzp(obj, j4, zzmx.zzb(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj2, i)) {
                        zzmx.zzr(obj, j4, zzmx.zzd(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj2, i)) {
                        zzmx.zzr(obj, j4, zzmx.zzd(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj2, i)) {
                        zzmx.zzq(obj, j4, zzmx.zzc(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj2, i)) {
                        zzmx.zzr(obj, j4, zzmx.zzd(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj2, i)) {
                        zzmx.zzq(obj, j4, zzmx.zzc(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj2, i)) {
                        zzmx.zzm(obj, j4, zzmx.zzw(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj2, i)) {
                        zzmx.zzs(obj, j4, zzmx.zzf(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i);
                    break;
                case 10:
                    if (zzO(obj2, i)) {
                        zzmx.zzs(obj, j4, zzmx.zzf(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj2, i)) {
                        zzmx.zzq(obj, j4, zzmx.zzc(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj2, i)) {
                        zzmx.zzq(obj, j4, zzmx.zzc(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj2, i)) {
                        zzmx.zzq(obj, j4, zzmx.zzc(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj2, i)) {
                        zzmx.zzr(obj, j4, zzmx.zzd(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj2, i)) {
                        zzmx.zzq(obj, j4, zzmx.zzc(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj2, i)) {
                        zzmx.zzr(obj, j4, zzmx.zzd(obj2, j4));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i);
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
                    this.zzm.zzb(obj, obj2, j4);
                    break;
                case 50:
                    zzly.zzaa(this.zzq, obj, obj2, j4);
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
                    if (zzR(obj2, i10, i)) {
                        zzmx.zzs(obj, j4, zzmx.zzf(obj2, j4));
                        zzK(obj, i10, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzI(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i10, i)) {
                        zzmx.zzs(obj, j4, zzmx.zzf(obj2, j4));
                        zzK(obj, i10, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i);
                    break;
            }
        }
        zzly.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzly.zzE(this.zzo, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zzh(Object obj, byte[] bArr, int i, int i10, zziq zziqVar) throws IOException {
        if (this.zzi) {
            zzu(obj, bArr, i, i10, zziqVar);
        } else {
            zzc(obj, bArr, i, i10, 0, zziqVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zzi(Object obj, zznf zznfVar) throws IOException {
        if (!this.zzi) {
            zzL(obj, zznfVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzB = zzB(i);
            int i10 = this.zzc[i];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzO(obj, i)) {
                        zznfVar.zzf(i10, zzmx.zza(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i)) {
                        zznfVar.zzo(i10, zzmx.zzb(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i)) {
                        zznfVar.zzt(i10, zzmx.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i)) {
                        zznfVar.zzJ(i10, zzmx.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i)) {
                        zznfVar.zzr(i10, zzmx.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i)) {
                        zznfVar.zzm(i10, zzmx.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i)) {
                        zznfVar.zzk(i10, zzmx.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i)) {
                        zznfVar.zzb(i10, zzmx.zzw(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj, i)) {
                        zzT(i10, zzmx.zzf(obj, iZzB & 1048575), zznfVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzO(obj, i)) {
                        zznfVar.zzv(i10, zzmx.zzf(obj, iZzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i)) {
                        zznfVar.zzd(i10, (zzjd) zzmx.zzf(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i)) {
                        zznfVar.zzH(i10, zzmx.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i)) {
                        zznfVar.zzi(i10, zzmx.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i)) {
                        zznfVar.zzw(i10, zzmx.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i)) {
                        zznfVar.zzy(i10, zzmx.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i)) {
                        zznfVar.zzA(i10, zzmx.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i)) {
                        zznfVar.zzC(i10, zzmx.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i)) {
                        zznfVar.zzq(i10, zzmx.zzf(obj, iZzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzly.zzJ(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 19:
                    zzly.zzN(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 20:
                    zzly.zzQ(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 21:
                    zzly.zzY(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 22:
                    zzly.zzP(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 23:
                    zzly.zzM(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 24:
                    zzly.zzL(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 25:
                    zzly.zzH(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 26:
                    zzly.zzW(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar);
                    break;
                case 27:
                    zzly.zzR(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, zzE(i));
                    break;
                case 28:
                    zzly.zzI(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar);
                    break;
                case 29:
                    zzly.zzX(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 30:
                    zzly.zzK(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 31:
                    zzly.zzS(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 32:
                    zzly.zzT(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 33:
                    zzly.zzU(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 34:
                    zzly.zzV(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 35:
                    zzly.zzJ(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 36:
                    zzly.zzN(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 37:
                    zzly.zzQ(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 38:
                    zzly.zzY(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 39:
                    zzly.zzP(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 40:
                    zzly.zzM(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 41:
                    zzly.zzL(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 42:
                    zzly.zzH(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 43:
                    zzly.zzX(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 44:
                    zzly.zzK(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 45:
                    zzly.zzS(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 46:
                    zzly.zzT(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 47:
                    zzly.zzU(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 48:
                    zzly.zzV(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 49:
                    zzly.zzO(i10, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, zzE(i));
                    break;
                case 50:
                    zzM(zznfVar, i10, zzmx.zzf(obj, iZzB & 1048575), i);
                    break;
                case 51:
                    if (zzR(obj, i10, i)) {
                        zznfVar.zzf(i10, zzn(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i10, i)) {
                        zznfVar.zzo(i10, zzo(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i10, i)) {
                        zznfVar.zzt(i10, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i10, i)) {
                        zznfVar.zzJ(i10, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i10, i)) {
                        zznfVar.zzr(i10, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i10, i)) {
                        zznfVar.zzm(i10, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i10, i)) {
                        zznfVar.zzk(i10, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i10, i)) {
                        zznfVar.zzb(i10, zzS(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i10, i)) {
                        zzT(i10, zzmx.zzf(obj, iZzB & 1048575), zznfVar);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i10, i)) {
                        zznfVar.zzv(i10, zzmx.zzf(obj, iZzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i10, i)) {
                        zznfVar.zzd(i10, (zzjd) zzmx.zzf(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i10, i)) {
                        zznfVar.zzH(i10, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i10, i)) {
                        zznfVar.zzi(i10, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i10, i)) {
                        zznfVar.zzw(i10, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i10, i)) {
                        zznfVar.zzy(i10, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i10, i)) {
                        zznfVar.zzA(i10, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i10, i)) {
                        zznfVar.zzC(i10, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i10, i)) {
                        zznfVar.zzq(i10, zzmx.zzf(obj, iZzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzmn zzmnVar = this.zzn;
        zzmnVar.zzi(zzmnVar.zzc(obj), zznfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzZ;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzB = zzB(i);
            long j4 = iZzB & 1048575;
            switch (zzA(iZzB)) {
                case 0:
                    if (!zzN(obj, obj2, i) || Double.doubleToLongBits(zzmx.zza(obj, j4)) != Double.doubleToLongBits(zzmx.zza(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzN(obj, obj2, i) || Float.floatToIntBits(zzmx.zzb(obj, j4)) != Float.floatToIntBits(zzmx.zzb(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzN(obj, obj2, i) || zzmx.zzd(obj, j4) != zzmx.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzN(obj, obj2, i) || zzmx.zzd(obj, j4) != zzmx.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzN(obj, obj2, i) || zzmx.zzc(obj, j4) != zzmx.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzN(obj, obj2, i) || zzmx.zzd(obj, j4) != zzmx.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzN(obj, obj2, i) || zzmx.zzc(obj, j4) != zzmx.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzN(obj, obj2, i) || zzmx.zzw(obj, j4) != zzmx.zzw(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzN(obj, obj2, i) || !zzly.zzZ(zzmx.zzf(obj, j4), zzmx.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzN(obj, obj2, i) || !zzly.zzZ(zzmx.zzf(obj, j4), zzmx.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzN(obj, obj2, i) || !zzly.zzZ(zzmx.zzf(obj, j4), zzmx.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzN(obj, obj2, i) || zzmx.zzc(obj, j4) != zzmx.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzN(obj, obj2, i) || zzmx.zzc(obj, j4) != zzmx.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzN(obj, obj2, i) || zzmx.zzc(obj, j4) != zzmx.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzN(obj, obj2, i) || zzmx.zzd(obj, j4) != zzmx.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzN(obj, obj2, i) || zzmx.zzc(obj, j4) != zzmx.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzN(obj, obj2, i) || zzmx.zzd(obj, j4) != zzmx.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzN(obj, obj2, i) || !zzly.zzZ(zzmx.zzf(obj, j4), zzmx.zzf(obj2, j4))) {
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
                    zZzZ = zzly.zzZ(zzmx.zzf(obj, j4), zzmx.zzf(obj2, j4));
                    break;
                case 50:
                    zZzZ = zzly.zzZ(zzmx.zzf(obj, j4), zzmx.zzf(obj2, j4));
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
                    long jZzy = zzy(i) & 1048575;
                    if (zzmx.zzc(obj, jZzy) != zzmx.zzc(obj2, jZzy) || !zzly.zzZ(zzmx.zzf(obj, j4), zzmx.zzf(obj2, j4))) {
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
    @Override // com.google.android.gms.internal.measurement.zzlw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzk(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlo.zzk(java.lang.Object):boolean");
    }
}
