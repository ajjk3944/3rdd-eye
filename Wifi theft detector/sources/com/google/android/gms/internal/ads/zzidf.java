package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class zzidf<T> implements zzidu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zziem.zzs();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzidc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzief zzm;
    private final zzibc zzn;

    private zzidf(int[] iArr, Object[] objArr, int i10, int i11, zzidc zzidcVar, boolean z10, int[] iArr2, int i12, int i13, zzidi zzidiVar, zzico zzicoVar, zzief zziefVar, zzibc zzibcVar, zzicx zzicxVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzidcVar instanceof zzibr;
        boolean z11 = false;
        if (zzibcVar != null && (zzidcVar instanceof zzibn)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzm = zziefVar;
        this.zzn = zzibcVar;
        this.zzg = zzidcVar;
    }

    private final int zzA(int i10) {
        return this.zzc[i10 + 1];
    }

    private final int zzB(int i10) {
        return this.zzc[i10 + 2];
    }

    private static int zzC(int i10) {
        return (i10 >>> 20) & 255;
    }

    private static boolean zzD(int i10) {
        return (i10 & 536870912) != 0;
    }

    private static boolean zzE(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzibr) {
            return ((zzibr) obj).zzaX();
        }
        return true;
    }

    private static void zzF(Object obj) {
        if (!zzE(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static double zzG(Object obj, long j10) {
        return ((Double) zziem.zzn(obj, j10)).doubleValue();
    }

    private static float zzH(Object obj, long j10) {
        return ((Float) zziem.zzn(obj, j10)).floatValue();
    }

    private static int zzI(Object obj, long j10) {
        return ((Integer) zziem.zzn(obj, j10)).intValue();
    }

    private static long zzJ(Object obj, long j10) {
        return ((Long) zziem.zzn(obj, j10)).longValue();
    }

    private static boolean zzK(Object obj, long j10) {
        return ((Boolean) zziem.zzn(obj, j10)).booleanValue();
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        return zzN(obj, i10) == zzN(obj2, i10);
    }

    private final boolean zzM(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzN(obj, i10) : (i12 & i13) != 0;
    }

    private final boolean zzN(Object obj, int i10) {
        int iZzB = zzB(i10);
        long j10 = iZzB & 1048575;
        if (j10 != 1048575) {
            return (zziem.zzd(obj, j10) & (1 << (iZzB >>> 20))) != 0;
        }
        int iZzA = zzA(i10);
        long j11 = iZzA & 1048575;
        switch (zzC(iZzA)) {
            case 0:
                return Double.doubleToRawLongBits(zziem.zzl(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zziem.zzj(obj, j11)) != 0;
            case 2:
                return zziem.zzf(obj, j11) != 0;
            case 3:
                return zziem.zzf(obj, j11) != 0;
            case 4:
                return zziem.zzd(obj, j11) != 0;
            case 5:
                return zziem.zzf(obj, j11) != 0;
            case 6:
                return zziem.zzd(obj, j11) != 0;
            case 7:
                return zziem.zzh(obj, j11);
            case 8:
                Object objZzn = zziem.zzn(obj, j11);
                if (objZzn instanceof String) {
                    return !((String) objZzn).isEmpty();
                }
                if (objZzn instanceof zzian) {
                    return !zzian.zza.equals(objZzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zziem.zzn(obj, j11) != null;
            case 10:
                return !zzian.zza.equals(zziem.zzn(obj, j11));
            case 11:
                return zziem.zzd(obj, j11) != 0;
            case 12:
                return zziem.zzd(obj, j11) != 0;
            case 13:
                return zziem.zzd(obj, j11) != 0;
            case 14:
                return zziem.zzf(obj, j11) != 0;
            case 15:
                return zziem.zzd(obj, j11) != 0;
            case 16:
                return zziem.zzf(obj, j11) != 0;
            case 17:
                return zziem.zzn(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzO(Object obj, int i10) {
        int iZzB = zzB(i10);
        long j10 = 1048575 & iZzB;
        if (j10 == 1048575) {
            return;
        }
        zziem.zze(obj, j10, (1 << (iZzB >>> 20)) | zziem.zzd(obj, j10));
    }

    private final boolean zzP(Object obj, int i10, int i11) {
        return zziem.zzd(obj, (long) (zzB(i11) & 1048575)) == i10;
    }

    private final void zzQ(Object obj, int i10, int i11) {
        zziem.zze(obj, zzB(i11) & 1048575, i10);
    }

    private final int zzR(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzS(i10, 0);
    }

    private final int zzS(int i10, int i11) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
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

    private static final int zzT(byte[] bArr, int i10, int i11, zzies zziesVar, Class cls, zziab zziabVar) throws IOException {
        zzies zziesVar2 = zzies.zza;
        switch (zziesVar.ordinal()) {
            case 0:
                int i12 = i10 + 8;
                zziabVar.zzc = Double.valueOf(Double.longBitsToDouble(zziac.zze(bArr, i10)));
                return i12;
            case 1:
                int i13 = i10 + 4;
                zziabVar.zzc = Float.valueOf(Float.intBitsToFloat(zziac.zzd(bArr, i10)));
                return i13;
            case 2:
            case 3:
                int iZzc = zziac.zzc(bArr, i10, zziabVar);
                zziabVar.zzc = Long.valueOf(zziabVar.zzb);
                return iZzc;
            case 4:
            case 12:
            case 13:
                int iZza = zziac.zza(bArr, i10, zziabVar);
                zziabVar.zzc = Integer.valueOf(zziabVar.zza);
                return iZza;
            case 5:
            case 15:
                int i14 = i10 + 8;
                zziabVar.zzc = Long.valueOf(zziac.zze(bArr, i10));
                return i14;
            case 6:
            case 14:
                int i15 = i10 + 4;
                zziabVar.zzc = Integer.valueOf(zziac.zzd(bArr, i10));
                return i15;
            case 7:
                int iZzc2 = zziac.zzc(bArr, i10, zziabVar);
                zziabVar.zzc = Boolean.valueOf(zziabVar.zzb != 0);
                return iZzc2;
            case 8:
                return zziac.zzf(bArr, i10, zziabVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zziac.zzh(zzidm.zza().zzb(cls), bArr, i10, i11, zziabVar);
            case 11:
                return zziac.zzg(bArr, i10, zziabVar);
            case 16:
                int iZza2 = zziac.zza(bArr, i10, zziabVar);
                zziabVar.zzc = Integer.valueOf(zziaq.zzK(zziabVar.zza));
                return iZza2;
            case 17:
                int iZzc3 = zziac.zzc(bArr, i10, zziabVar);
                zziabVar.zzc = Long.valueOf(zziaq.zzL(zziabVar.zzb));
                return iZzc3;
        }
    }

    private static final void zzU(int i10, Object obj, zzieu zzieuVar) throws IOException {
        if (obj instanceof String) {
            zzieuVar.zzm(i10, (String) obj);
        } else {
            zzieuVar.zzn(i10, (zzian) obj);
        }
    }

    public static zzieg zzh(Object obj) {
        zzibr zzibrVar = (zzibr) obj;
        zzieg zziegVar = zzibrVar.zzt;
        if (zziegVar != zzieg.zza()) {
            return zziegVar;
        }
        zzieg zziegVarZzb = zzieg.zzb();
        zzibrVar.zzt = zziegVarZzb;
        return zziegVarZzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzidf zzm(java.lang.Class r32, com.google.android.gms.internal.ads.zzicz r33, com.google.android.gms.internal.ads.zzidi r34, com.google.android.gms.internal.ads.zzico r35, com.google.android.gms.internal.ads.zzief r36, com.google.android.gms.internal.ads.zzibc r37, com.google.android.gms.internal.ads.zzicx r38) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzm(java.lang.Class, com.google.android.gms.internal.ads.zzicz, com.google.android.gms.internal.ads.zzidi, com.google.android.gms.internal.ads.zzico, com.google.android.gms.internal.ads.zzief, com.google.android.gms.internal.ads.zzibc, com.google.android.gms.internal.ads.zzicx):com.google.android.gms.internal.ads.zzidf");
    }

    private static Field zzn(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new RuntimeException(sb.toString(), e10);
        }
    }

    private final void zzo(Object obj, Object obj2, int i10) {
        if (zzN(obj2, i10)) {
            int iZzA = zzA(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzA;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i11 = this.zzc[i10];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i11);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            zzidu zziduVarZzq = zzq(i10);
            if (!zzN(obj, i10)) {
                if (zzE(object)) {
                    Object objZza = zziduVarZzq.zza();
                    zziduVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j10, objZza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzO(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzE(object2)) {
                Object objZza2 = zziduVarZzq.zza();
                zziduVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j10, objZza2);
                object2 = objZza2;
            }
            zziduVarZzq.zzd(object2, object);
        }
    }

    private final void zzp(Object obj, Object obj2, int i10) {
        int[] iArr = this.zzc;
        int i11 = iArr[i10];
        if (zzP(obj2, i11, i10)) {
            int iZzA = zzA(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzA;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i12 = iArr[i10];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i12).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i12);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            zzidu zziduVarZzq = zzq(i10);
            if (!zzP(obj, i11, i10)) {
                if (zzE(object)) {
                    Object objZza = zziduVarZzq.zza();
                    zziduVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j10, objZza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzQ(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzE(object2)) {
                Object objZza2 = zziduVarZzq.zza();
                zziduVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j10, objZza2);
                object2 = objZza2;
            }
            zziduVarZzq.zzd(object2, object);
        }
    }

    private final zzidu zzq(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzidu zziduVar = (zzidu) objArr[i12];
        if (zziduVar != null) {
            return zziduVar;
        }
        zzidu zziduVarZzb = zzidm.zza().zzb((Class) objArr[i12 + 1]);
        objArr[i12] = zziduVarZzb;
        return zziduVarZzb;
    }

    private final Object zzr(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final zzibx zzs(int i10) {
        int i11 = i10 / 3;
        return (zzibx) this.zzd[i11 + i11 + 1];
    }

    private final Object zzt(Object obj, int i10) {
        zzidu zziduVarZzq = zzq(i10);
        int iZzA = zzA(i10) & 1048575;
        if (!zzN(obj, i10)) {
            return zziduVarZzq.zza();
        }
        Object object = zzb.getObject(obj, iZzA);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zziduVarZzq.zza();
        if (object != null) {
            zziduVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzu(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzA(i10) & 1048575, obj2);
        zzO(obj, i10);
    }

    private final Object zzv(Object obj, int i10, int i11) {
        zzidu zziduVarZzq = zzq(i11);
        if (!zzP(obj, i10, i11)) {
            return zziduVarZzq.zza();
        }
        Object object = zzb.getObject(obj, zzA(i11) & 1048575);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zziduVarZzq.zza();
        if (object != null) {
            zziduVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzw(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzA(i11) & 1048575, obj2);
        zzQ(obj, i10, i11);
    }

    private final Object zzx(Object obj, int i10, Object obj2, zzief zziefVar, Object obj3) {
        zzibx zzibxVarZzs;
        int i11 = this.zzc[i10];
        Object objZzn = zziem.zzn(obj, zzA(i10) & 1048575);
        if (objZzn == null || (zzibxVarZzs = zzs(i10)) == null) {
            return obj2;
        }
        zzicu zzicuVarZze = ((zzicv) zzr(i10)).zze();
        Iterator it = ((zzicw) objZzn).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzibxVarZzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zziefVar.zzh(obj3);
                }
                int iZzc = zzicv.zzc(zzicuVarZze, entry.getKey(), entry.getValue());
                zzian zzianVar = zzian.zza;
                byte[] bArr = new byte[iZzc];
                int i12 = zziaw.zzf;
                zziat zziatVar = new zziat(bArr, 0, iZzc);
                try {
                    zzicv.zzb(zziatVar, zzicuVarZze, entry.getKey(), entry.getValue());
                    zziefVar.zzd(obj2, i11, zziaj.zza(zziatVar, bArr));
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj2;
    }

    private static boolean zzy(Object obj, int i10, zzidu zziduVar) {
        return zziduVar.zzl(zziem.zzn(obj, i10 & 1048575));
    }

    private final void zzz(Object obj, int i10, zzidp zzidpVar) throws IOException {
        long j10 = i10 & 1048575;
        if (zzD(i10)) {
            zziem.zzo(obj, j10, zzidpVar.zzn());
        } else if (this.zzi) {
            zziem.zzo(obj, j10, zzidpVar.zzm());
        } else {
            zziem.zzo(obj, j10, zzidpVar.zzq());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final Object zza() {
        return ((zzibr) this.zzg).zzbg();
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final boolean zzb(Object obj, Object obj2) {
        boolean zZzG;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzA = zzA(i10);
            long j10 = iZzA & 1048575;
            switch (zzC(iZzA)) {
                case 0:
                    if (!zzL(obj, obj2, i10) || Double.doubleToLongBits(zziem.zzl(obj, j10)) != Double.doubleToLongBits(zziem.zzl(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i10) || Float.floatToIntBits(zziem.zzj(obj, j10)) != Float.floatToIntBits(zziem.zzj(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i10) || zziem.zzf(obj, j10) != zziem.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i10) || zziem.zzf(obj, j10) != zziem.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i10) || zziem.zzd(obj, j10) != zziem.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i10) || zziem.zzf(obj, j10) != zziem.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i10) || zziem.zzd(obj, j10) != zziem.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i10) || zziem.zzh(obj, j10) != zziem.zzh(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i10) || !zzidw.zzG(zziem.zzn(obj, j10), zziem.zzn(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i10) || !zzidw.zzG(zziem.zzn(obj, j10), zziem.zzn(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i10) || !zzidw.zzG(zziem.zzn(obj, j10), zziem.zzn(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i10) || zziem.zzd(obj, j10) != zziem.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i10) || zziem.zzd(obj, j10) != zziem.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i10) || zziem.zzd(obj, j10) != zziem.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i10) || zziem.zzf(obj, j10) != zziem.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i10) || zziem.zzd(obj, j10) != zziem.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i10) || zziem.zzf(obj, j10) != zziem.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i10) || !zzidw.zzG(zziem.zzn(obj, j10), zziem.zzn(obj2, j10))) {
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
                    zZzG = zzidw.zzG(zziem.zzn(obj, j10), zziem.zzn(obj2, j10));
                    break;
                case 50:
                    zZzG = zzidw.zzG(zziem.zzn(obj, j10), zziem.zzn(obj2, j10));
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
                    long jZzB = zzB(i10) & 1048575;
                    if (zziem.zzd(obj, jZzB) != zziem.zzd(obj2, jZzB) || !zzidw.zzG(zziem.zzn(obj, j10), zziem.zzn(obj2, j10))) {
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
        if (!((zzibr) obj).zzt.equals(((zzibr) obj2).zzt)) {
            return false;
        }
        if (this.zzh) {
            return ((zzibn) obj).zza.equals(((zzibn) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final int zzc(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i12 >= iArr.length) {
                int iHashCode = (i13 * 53) + ((zzibr) obj).zzt.hashCode();
                return this.zzh ? (iHashCode * 53) + ((zzibn) obj).zza.zza.hashCode() : iHashCode;
            }
            int iZzA = zzA(i12);
            int i14 = 1048575 & iZzA;
            int iZzC = zzC(iZzA);
            int i15 = iArr[i12];
            long j10 = i14;
            int iHashCode2 = 37;
            switch (iZzC) {
                case 0:
                    i10 = i13 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zziem.zzl(obj, j10));
                    byte[] bArr = zzice.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 1:
                    i10 = i13 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zziem.zzj(obj, j10));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 2:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zziem.zzf(obj, j10);
                    byte[] bArr2 = zzice.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 3:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zziem.zzf(obj, j10);
                    byte[] bArr3 = zzice.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 4:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzd(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 5:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zziem.zzf(obj, j10);
                    byte[] bArr4 = zzice.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 6:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzd(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 7:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzice.zzb(zziem.zzh(obj, j10));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 8:
                    i10 = i13 * 53;
                    iFloatToIntBits = ((String) zziem.zzn(obj, j10)).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 9:
                    i11 = i13 * 53;
                    Object objZzn = zziem.zzn(obj, j10);
                    if (objZzn != null) {
                        iHashCode2 = objZzn.hashCode();
                    }
                    i13 = i11 + iHashCode2;
                    break;
                case 10:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzn(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 11:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzd(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 12:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzd(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 13:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzd(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 14:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zziem.zzf(obj, j10);
                    byte[] bArr5 = zzice.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 15:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzd(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 16:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zziem.zzf(obj, j10);
                    byte[] bArr6 = zzice.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 17:
                    i11 = i13 * 53;
                    Object objZzn2 = zziem.zzn(obj, j10);
                    if (objZzn2 != null) {
                        iHashCode2 = objZzn2.hashCode();
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
                    iFloatToIntBits = zziem.zzn(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 50:
                    i10 = i13 * 53;
                    iFloatToIntBits = zziem.zzn(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 51:
                    if (!zzP(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzG(obj, j10));
                        byte[] bArr7 = zzice.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 52:
                    if (!zzP(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzH(obj, j10));
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 53:
                    if (!zzP(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzJ(obj, j10);
                        byte[] bArr8 = zzice.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 54:
                    if (!zzP(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzJ(obj, j10);
                        byte[] bArr9 = zzice.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 55:
                    if (!zzP(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzI(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 56:
                    if (!zzP(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzJ(obj, j10);
                        byte[] bArr10 = zzice.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 57:
                    if (!zzP(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzI(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 58:
                    if (!zzP(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzice.zzb(zzK(obj, j10));
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 59:
                    if (!zzP(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = ((String) zziem.zzn(obj, j10)).hashCode();
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 60:
                    if (!zzP(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zziem.zzn(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 61:
                    if (!zzP(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zziem.zzn(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 62:
                    if (!zzP(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzI(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 63:
                    if (!zzP(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzI(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 64:
                    if (!zzP(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzI(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 65:
                    if (!zzP(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzJ(obj, j10);
                        byte[] bArr11 = zzice.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 66:
                    if (!zzP(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzI(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 67:
                    if (!zzP(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzJ(obj, j10);
                        byte[] bArr12 = zzice.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 68:
                    if (!zzP(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zziem.zzn(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
            }
            i12 += 3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzd(Object obj, Object obj2) {
        zzF(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i10 >= iArr.length) {
                zzidw.zzI(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzidw.zzH(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int iZzA = zzA(i10);
            int i11 = 1048575 & iZzA;
            int iZzC = zzC(iZzA);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iZzC) {
                case 0:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zziem.zzm(obj, j10, zziem.zzl(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 1:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zziem.zzk(obj, j10, zziem.zzj(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 2:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zziem.zzg(obj, j10, zziem.zzf(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 3:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zziem.zzg(obj, j10, zziem.zzf(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 4:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zziem.zze(obj, j10, zziem.zzd(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 5:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zziem.zzg(obj, j10, zziem.zzf(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 6:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zziem.zze(obj, j10, zziem.zzd(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 7:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zziem.zzi(obj, j10, zziem.zzh(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 8:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zziem.zzo(obj, j10, zziem.zzn(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 9:
                    zzo(obj, obj2, i10);
                    break;
                case 10:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zziem.zzo(obj, j10, zziem.zzn(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 11:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zziem.zze(obj, j10, zziem.zzd(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 12:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zziem.zze(obj, j10, zziem.zzd(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 13:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zziem.zze(obj, j10, zziem.zzd(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 14:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zziem.zzg(obj, j10, zziem.zzf(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 15:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zziem.zze(obj, j10, zziem.zzd(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 16:
                    if (!zzN(obj2, i10)) {
                        break;
                    } else {
                        zziem.zzg(obj, j10, zziem.zzf(obj2, j10));
                        zzO(obj, i10);
                        break;
                    }
                case 17:
                    zzo(obj, obj2, i10);
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
                    zzicd zzicdVarZzh = (zzicd) zziem.zzn(obj, j10);
                    zzicd zzicdVar = (zzicd) zziem.zzn(obj2, j10);
                    int size = zzicdVarZzh.size();
                    int size2 = zzicdVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzicdVarZzh.zza()) {
                            zzicdVarZzh = zzicdVarZzh.zzh(size2 + size);
                        }
                        zzicdVarZzh.addAll(zzicdVar);
                    }
                    if (size > 0) {
                        zzicdVar = zzicdVarZzh;
                    }
                    zziem.zzo(obj, j10, zzicdVar);
                    break;
                case 50:
                    int i13 = zzidw.zza;
                    zziem.zzo(obj, j10, zzicx.zzb(zziem.zzn(obj, j10), zziem.zzn(obj2, j10)));
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
                    if (!zzP(obj2, i12, i10)) {
                        break;
                    } else {
                        zziem.zzo(obj, j10, zziem.zzn(obj2, j10));
                        zzQ(obj, i12, i10);
                        break;
                    }
                case 60:
                    zzp(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzP(obj2, i12, i10)) {
                        break;
                    } else {
                        zziem.zzo(obj, j10, zziem.zzn(obj2, j10));
                        zzQ(obj, i12, i10);
                        break;
                    }
                case 68:
                    zzp(obj, obj2, i10);
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x01e2  */
    @Override // com.google.android.gms.internal.ads.zzidu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zze(java.lang.Object r17) throws com.google.android.gms.internal.ads.zzieq {
        /*
            Method dump skipped, instructions count: 2046
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zze(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.ads.zzidu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r21, com.google.android.gms.internal.ads.zzieu r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzf(java.lang.Object, com.google.android.gms.internal.ads.zzieu):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05a5 A[LOOP:2: B:189:0x05a1->B:191:0x05a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0562 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0572 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzidu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(java.lang.Object r12, com.google.android.gms.internal.ads.zzidp r13, com.google.android.gms.internal.ads.zzibb r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzg(java.lang.Object, com.google.android.gms.internal.ads.zzidp, com.google.android.gms.internal.ads.zzibb):void");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zzi(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.ads.zziab r37) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzi(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zziab):int");
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzj(Object obj, byte[] bArr, int i10, int i11, zziab zziabVar) throws IOException {
        zzi(obj, bArr, i10, i11, 0, zziabVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    @Override // com.google.android.gms.internal.ads.zzidu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzk(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzE(r8)
            if (r0 != 0) goto L8
            goto L91
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzibr
            if (r0 == 0) goto L18
            r0 = r8
            com.google.android.gms.internal.ads.zzibr r0 = (com.google.android.gms.internal.ads.zzibr) r0
            r0.zzbq()
            r0.zzbb()
            r0.zzaY()
        L18:
            int[] r0 = r7.zzc
            r1 = 0
        L1b:
            int r2 = r0.length
            if (r1 >= r2) goto L83
            int r2 = r7.zzA(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzC(r2)
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
            sun.misc.Unsafe r2 = com.google.android.gms.internal.ads.zzidf.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L80
            r6 = r5
            com.google.android.gms.internal.ads.zzicw r6 = (com.google.android.gms.internal.ads.zzicw) r6
            r6.zzd()
            r2.putObject(r8, r3, r5)
            goto L80
        L4d:
            java.lang.Object r2 = com.google.android.gms.internal.ads.zziem.zzn(r8, r3)
            com.google.android.gms.internal.ads.zzicd r2 = (com.google.android.gms.internal.ads.zzicd) r2
            r2.zzb()
            goto L80
        L57:
            r2 = r0[r1]
            boolean r2 = r7.zzP(r8, r2, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.ads.zzidu r2 = r7.zzq(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.zzidf.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzk(r3)
            goto L80
        L6d:
            boolean r2 = r7.zzN(r8, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.ads.zzidu r2 = r7.zzq(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.zzidf.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzk(r3)
        L80:
            int r1 = r1 + 3
            goto L1b
        L83:
            com.google.android.gms.internal.ads.zzief r0 = r7.zzm
            r0.zzj(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L91
            com.google.android.gms.internal.ads.zzibc r0 = r7.zzn
            r0.zza(r8)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzk(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1  */
    @Override // com.google.android.gms.internal.ads.zzidu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzl(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzl(java.lang.Object):boolean");
    }
}
