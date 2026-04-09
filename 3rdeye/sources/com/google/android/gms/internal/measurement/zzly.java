package com.google.android.gms.internal.measurement;

import androidx.work.s;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.1.1 */
/* loaded from: classes2.dex */
final class zzly {
    private static final Class zza;
    private static final zzmn zzb;
    private static final zzmn zzc;
    private static final zzmn zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzab(false);
        zzc = zzab(true);
        zzd = new zzmp();
    }

    public static zzmn zzA() {
        return zzc;
    }

    public static zzmn zzB() {
        return zzd;
    }

    public static Object zzC(int i, List list, zzki zzkiVar, Object obj, zzmn zzmnVar) {
        if (zzkiVar == null) {
            return obj;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzkiVar.zza(iIntValue)) {
                    obj = zzD(i, iIntValue, obj, zzmnVar);
                    it.remove();
                }
            }
            return obj;
        }
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Integer num = (Integer) list.get(i11);
            int iIntValue2 = num.intValue();
            if (zzkiVar.zza(iIntValue2)) {
                if (i11 != i10) {
                    list.set(i10, num);
                }
                i10++;
            } else {
                obj = zzD(i, iIntValue2, obj, zzmnVar);
            }
        }
        if (i10 == size) {
            return obj;
        }
        list.subList(i10, size).clear();
        return obj;
    }

    public static Object zzD(int i, int i10, Object obj, zzmn zzmnVar) {
        if (obj == null) {
            obj = zzmnVar.zze();
        }
        zzmnVar.zzf(obj, i, i10);
        return obj;
    }

    public static void zzE(zzjr zzjrVar, Object obj, Object obj2) {
        zzjrVar.zza(obj2);
        throw null;
    }

    public static void zzF(zzmn zzmnVar, Object obj, Object obj2) {
        zzmnVar.zzh(obj, zzmnVar.zzd(zzmnVar.zzc(obj), zzmnVar.zzc(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzke.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzH(int i, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzc(i, list, z10);
    }

    public static void zzI(int i, List list, zznf zznfVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zze(i, list);
    }

    public static void zzJ(int i, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzg(i, list, z10);
    }

    public static void zzK(int i, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzj(i, list, z10);
    }

    public static void zzL(int i, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzl(i, list, z10);
    }

    public static void zzM(int i, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzn(i, list, z10);
    }

    public static void zzN(int i, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzp(i, list, z10);
    }

    public static void zzO(int i, List list, zznf zznfVar, zzlw zzlwVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((zzjm) zznfVar).zzq(i, list.get(i10), zzlwVar);
        }
    }

    public static void zzP(int i, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzs(i, list, z10);
    }

    public static void zzQ(int i, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzu(i, list, z10);
    }

    public static void zzR(int i, List list, zznf zznfVar, zzlw zzlwVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((zzjm) zznfVar).zzv(i, list.get(i10), zzlwVar);
        }
    }

    public static void zzS(int i, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzx(i, list, z10);
    }

    public static void zzT(int i, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzz(i, list, z10);
    }

    public static void zzU(int i, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzB(i, list, z10);
    }

    public static void zzV(int i, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzD(i, list, z10);
    }

    public static void zzW(int i, List list, zznf zznfVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzG(i, list);
    }

    public static void zzX(int i, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzI(i, list, z10);
    }

    public static void zzY(int i, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzK(i, list, z10);
    }

    public static boolean zzZ(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(int i, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjl.zzA(i << 3) + 1) * size;
    }

    public static void zzaa(zzlg zzlgVar, Object obj, Object obj2, long j4) {
        zzmx.zzs(obj, j4, zzlg.zzb(zzmx.zzf(obj, j4), zzmx.zzf(obj2, j4)));
    }

    private static zzmn zzab(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzmn) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zzb(List list) {
        return list.size();
    }

    public static int zzc(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzz = zzjl.zzz(i) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iZzz += zzjl.zzt((zzjd) list.get(i10));
        }
        return iZzz;
    }

    public static int zzd(int i, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjl.zzz(i) * size) + zze(list);
    }

    public static int zze(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkf)) {
            int iZzv = 0;
            while (i < size) {
                iZzv += zzjl.zzv(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzv;
        }
        zzkf zzkfVar = (zzkf) list;
        int iZzv2 = 0;
        while (i < size) {
            iZzv2 += zzjl.zzv(zzkfVar.zze(i));
            i++;
        }
        return iZzv2;
    }

    public static int zzf(int i, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjl.zzA(i << 3) + 4) * size;
    }

    public static int zzg(List list) {
        return list.size() * 4;
    }

    public static int zzh(int i, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjl.zzA(i << 3) + 8) * size;
    }

    public static int zzi(List list) {
        return list.size() * 8;
    }

    public static int zzj(int i, List list, zzlw zzlwVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzu = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iZzu += zzjl.zzu(i, (zzll) list.get(i10), zzlwVar);
        }
        return iZzu;
    }

    public static int zzk(int i, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjl.zzz(i) * size) + zzl(list);
    }

    public static int zzl(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkf)) {
            int iZzv = 0;
            while (i < size) {
                iZzv += zzjl.zzv(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzv;
        }
        zzkf zzkfVar = (zzkf) list;
        int iZzv2 = 0;
        while (i < size) {
            iZzv2 += zzjl.zzv(zzkfVar.zze(i));
            i++;
        }
        return iZzv2;
    }

    public static int zzm(int i, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzjl.zzz(i) * list.size()) + zzn(list);
    }

    public static int zzn(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzla)) {
            int iZzB = 0;
            while (i < size) {
                iZzB += zzjl.zzB(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzB;
        }
        zzla zzlaVar = (zzla) list;
        int iZzB2 = 0;
        while (i < size) {
            iZzB2 += zzjl.zzB(zzlaVar.zza(i));
            i++;
        }
        return iZzB2;
    }

    public static int zzo(int i, Object obj, zzlw zzlwVar) {
        if (!(obj instanceof zzkr)) {
            return zzjl.zzx((zzll) obj, zzlwVar) + zzjl.zzA(i << 3);
        }
        int iZzA = zzjl.zzA(i << 3);
        int iZza = ((zzkr) obj).zza();
        return s.c(iZza, iZza, iZzA);
    }

    public static int zzp(int i, List list, zzlw zzlwVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzz = zzjl.zzz(i) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            iZzz = (obj instanceof zzkr ? zzjl.zzw((zzkr) obj) : zzjl.zzx((zzll) obj, zzlwVar)) + iZzz;
        }
        return iZzz;
    }

    public static int zzq(int i, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjl.zzz(i) * size) + zzr(list);
    }

    public static int zzr(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkf)) {
            int iZzA = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzA += zzjl.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iZzA;
        }
        zzkf zzkfVar = (zzkf) list;
        int iZzA2 = 0;
        while (i < size) {
            int iZze = zzkfVar.zze(i);
            iZzA2 += zzjl.zzA((iZze >> 31) ^ (iZze + iZze));
            i++;
        }
        return iZzA2;
    }

    public static int zzs(int i, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjl.zzz(i) * size) + zzt(list);
    }

    public static int zzt(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzla)) {
            int iZzB = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzB += zzjl.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iZzB;
        }
        zzla zzlaVar = (zzla) list;
        int iZzB2 = 0;
        while (i < size) {
            long jZza = zzlaVar.zza(i);
            iZzB2 += zzjl.zzB((jZza >> 63) ^ (jZza + jZza));
            i++;
        }
        return iZzB2;
    }

    public static int zzu(int i, List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzz = zzjl.zzz(i) * size;
        if (!(list instanceof zzkt)) {
            while (i10 < size) {
                Object obj = list.get(i10);
                iZzz = (obj instanceof zzjd ? zzjl.zzt((zzjd) obj) : zzjl.zzy((String) obj)) + iZzz;
                i10++;
            }
            return iZzz;
        }
        zzkt zzktVar = (zzkt) list;
        while (i10 < size) {
            Object objZzf = zzktVar.zzf(i10);
            iZzz = (objZzf instanceof zzjd ? zzjl.zzt((zzjd) objZzf) : zzjl.zzy((String) objZzf)) + iZzz;
            i10++;
        }
        return iZzz;
    }

    public static int zzv(int i, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjl.zzz(i) * size) + zzw(list);
    }

    public static int zzw(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkf)) {
            int iZzA = 0;
            while (i < size) {
                iZzA += zzjl.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzA;
        }
        zzkf zzkfVar = (zzkf) list;
        int iZzA2 = 0;
        while (i < size) {
            iZzA2 += zzjl.zzA(zzkfVar.zze(i));
            i++;
        }
        return iZzA2;
    }

    public static int zzx(int i, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjl.zzz(i) * size) + zzy(list);
    }

    public static int zzy(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzla)) {
            int iZzB = 0;
            while (i < size) {
                iZzB += zzjl.zzB(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzB;
        }
        zzla zzlaVar = (zzla) list;
        int iZzB2 = 0;
        while (i < size) {
            iZzB2 += zzjl.zzB(zzlaVar.zza(i));
            i++;
        }
        return iZzB2;
    }

    public static zzmn zzz() {
        return zzb;
    }
}
