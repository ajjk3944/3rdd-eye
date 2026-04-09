package com.google.android.gms.internal.ads;

import N7.H7;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzhbb {
    public static final /* synthetic */ int zza = 0;
    private static final zzhbl zzb;

    static {
        int i = zzhaq.zza;
        zzb = new zzhbn();
    }

    public static void zzA(int i, List list, zzhca zzhcaVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzu(i, list, z10);
    }

    public static void zzB(int i, List list, zzhca zzhcaVar, zzhaz zzhazVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((zzgyb) zzhcaVar).zzv(i, list.get(i10), zzhazVar);
        }
    }

    public static void zzC(int i, List list, zzhca zzhcaVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzy(i, list, z10);
    }

    public static void zzD(int i, List list, zzhca zzhcaVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzA(i, list, z10);
    }

    public static void zzE(int i, List list, zzhca zzhcaVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzC(i, list, z10);
    }

    public static void zzF(int i, List list, zzhca zzhcaVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzE(i, list, z10);
    }

    public static void zzG(int i, List list, zzhca zzhcaVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzH(i, list);
    }

    public static void zzH(int i, List list, zzhca zzhcaVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzJ(i, list, z10);
    }

    public static void zzI(int i, List list, zzhca zzhcaVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzL(i, list, z10);
    }

    public static boolean zzJ(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgyw)) {
            int iZzE = 0;
            while (i < size) {
                iZzE += zzgya.zzE(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzE;
        }
        zzgyw zzgywVar = (zzgyw) list;
        int iZzE2 = 0;
        while (i < size) {
            iZzE2 += zzgya.zzE(zzgywVar.zzd(i));
            i++;
        }
        return iZzE2;
    }

    public static int zzb(int i, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgya.zzD(i << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgya.zzD(i << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgyw)) {
            int iZzE = 0;
            while (i < size) {
                iZzE += zzgya.zzE(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzE;
        }
        zzgyw zzgywVar = (zzgyw) list;
        int iZzE2 = 0;
        while (i < size) {
            iZzE2 += zzgya.zzE(zzgywVar.zzd(i));
            i++;
        }
        return iZzE2;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgzv)) {
            int iZzE = 0;
            while (i < size) {
                iZzE += zzgya.zzE(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzE;
        }
        zzgzv zzgzvVar = (zzgzv) list;
        int iZzE2 = 0;
        while (i < size) {
            iZzE2 += zzgya.zzE(zzgzvVar.zza(i));
            i++;
        }
        return iZzE2;
    }

    public static int zzh(int i, Object obj, zzhaz zzhazVar) {
        int i10 = i << 3;
        if (!(obj instanceof zzgzr)) {
            return zzgya.zzA((zzhag) obj, zzhazVar) + zzgya.zzD(i10);
        }
        int iZzD = zzgya.zzD(i10);
        int iZza = ((zzgzr) obj).zza();
        return H7.m(iZza, iZza, iZzD);
    }

    public static int zzi(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgyw)) {
            int iZzD = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzD += zzgya.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iZzD;
        }
        zzgyw zzgywVar = (zzgyw) list;
        int iZzD2 = 0;
        while (i < size) {
            int iZzd = zzgywVar.zzd(i);
            iZzD2 += zzgya.zzD((iZzd >> 31) ^ (iZzd + iZzd));
            i++;
        }
        return iZzD2;
    }

    public static int zzj(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgzv)) {
            int iZzE = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzE += zzgya.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iZzE;
        }
        zzgzv zzgzvVar = (zzgzv) list;
        int iZzE2 = 0;
        while (i < size) {
            long jZza = zzgzvVar.zza(i);
            iZzE2 += zzgya.zzE((jZza >> 63) ^ (jZza + jZza));
            i++;
        }
        return iZzE2;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgyw)) {
            int iZzD = 0;
            while (i < size) {
                iZzD += zzgya.zzD(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzD;
        }
        zzgyw zzgywVar = (zzgyw) list;
        int iZzD2 = 0;
        while (i < size) {
            iZzD2 += zzgya.zzD(zzgywVar.zzd(i));
            i++;
        }
        return iZzD2;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgzv)) {
            int iZzE = 0;
            while (i < size) {
                iZzE += zzgya.zzE(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzE;
        }
        zzgzv zzgzvVar = (zzgzv) list;
        int iZzE2 = 0;
        while (i < size) {
            iZzE2 += zzgya.zzE(zzgzvVar.zza(i));
            i++;
        }
        return iZzE2;
    }

    public static zzhbl zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i, List list, zzgzb zzgzbVar, Object obj2, zzhbl zzhblVar) {
        if (zzgzbVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzgzbVar.zza(iIntValue)) {
                    obj2 = zzo(obj, i, iIntValue, obj2, zzhblVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Integer num = (Integer) list.get(i11);
            int iIntValue2 = num.intValue();
            if (zzgzbVar.zza(iIntValue2)) {
                if (i11 != i10) {
                    list.set(i10, num);
                }
                i10++;
            } else {
                obj2 = zzo(obj, i, iIntValue2, obj2, zzhblVar);
            }
        }
        if (i10 != size) {
            list.subList(i10, size).clear();
        }
        return obj2;
    }

    public static Object zzo(Object obj, int i, int i10, Object obj2, zzhbl zzhblVar) {
        if (obj2 == null) {
            obj2 = zzhblVar.zza(obj);
        }
        zzhblVar.zzh(obj2, i, i10);
        return obj2;
    }

    public static void zzp(zzgyg zzgygVar, Object obj, Object obj2) {
        if (((zzgyr) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzq(zzhbl zzhblVar, Object obj, Object obj2) {
        zzgyv zzgyvVar = (zzgyv) obj;
        zzhbm zzhbmVarZze = zzgyvVar.zzt;
        zzhbm zzhbmVar = ((zzgyv) obj2).zzt;
        if (!zzhbm.zzc().equals(zzhbmVar)) {
            if (zzhbm.zzc().equals(zzhbmVarZze)) {
                zzhbmVarZze = zzhbm.zze(zzhbmVarZze, zzhbmVar);
            } else {
                zzhbmVarZze.zzd(zzhbmVar);
            }
        }
        zzgyvVar.zzt = zzhbmVarZze;
    }

    public static void zzr(int i, List list, zzhca zzhcaVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzc(i, list, z10);
    }

    public static void zzs(int i, List list, zzhca zzhcaVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zze(i, list);
    }

    public static void zzt(int i, List list, zzhca zzhcaVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzg(i, list, z10);
    }

    public static void zzu(int i, List list, zzhca zzhcaVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzj(i, list, z10);
    }

    public static void zzv(int i, List list, zzhca zzhcaVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzl(i, list, z10);
    }

    public static void zzw(int i, List list, zzhca zzhcaVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzn(i, list, z10);
    }

    public static void zzx(int i, List list, zzhca zzhcaVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzp(i, list, z10);
    }

    public static void zzy(int i, List list, zzhca zzhcaVar, zzhaz zzhazVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((zzgyb) zzhcaVar).zzq(i, list.get(i10), zzhazVar);
        }
    }

    public static void zzz(int i, List list, zzhca zzhcaVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhcaVar.zzs(i, list, z10);
    }
}
