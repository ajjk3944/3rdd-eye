package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgyb implements zzhca {
    private final zzgya zza;

    private zzgyb(zzgya zzgyaVar) {
        zzgzi.zzc(zzgyaVar, "output");
        this.zza = zzgyaVar;
        zzgyaVar.zze = this;
    }

    public static zzgyb zza(zzgya zzgyaVar) {
        zzgyb zzgybVar = zzgyaVar.zze;
        return zzgybVar != null ? zzgybVar : new zzgyb(zzgyaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzA(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgzv)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzj(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzgya zzgyaVar = this.zza;
            zzgyaVar.zzs(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            zzgyaVar.zzu(i11);
            while (i10 < list.size()) {
                zzgyaVar.zzk(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzgzv zzgzvVar = (zzgzv) list;
        if (!z10) {
            while (i10 < zzgzvVar.size()) {
                this.zza.zzj(i, zzgzvVar.zza(i10));
                i10++;
            }
            return;
        }
        zzgya zzgyaVar2 = this.zza;
        zzgyaVar2.zzs(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzgzvVar.size(); i14++) {
            zzgzvVar.zza(i14);
            i13 += 8;
        }
        zzgyaVar2.zzu(i13);
        while (i10 < zzgzvVar.size()) {
            zzgyaVar2.zzk(zzgzvVar.zza(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzB(int i, int i10) throws IOException {
        this.zza.zzt(i, (i10 >> 31) ^ (i10 + i10));
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzC(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgyw)) {
            if (!z10) {
                while (i10 < list.size()) {
                    zzgya zzgyaVar = this.zza;
                    int iIntValue = ((Integer) list.get(i10)).intValue();
                    zzgyaVar.zzt(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i10++;
                }
                return;
            }
            zzgya zzgyaVar2 = this.zza;
            zzgyaVar2.zzs(i, 2);
            int iZzD = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue2 = ((Integer) list.get(i11)).intValue();
                iZzD += zzgya.zzD((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzgyaVar2.zzu(iZzD);
            while (i10 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i10)).intValue();
                zzgyaVar2.zzu((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i10++;
            }
            return;
        }
        zzgyw zzgywVar = (zzgyw) list;
        if (!z10) {
            while (i10 < zzgywVar.size()) {
                zzgya zzgyaVar3 = this.zza;
                int iZzd = zzgywVar.zzd(i10);
                zzgyaVar3.zzt(i, (iZzd >> 31) ^ (iZzd + iZzd));
                i10++;
            }
            return;
        }
        zzgya zzgyaVar4 = this.zza;
        zzgyaVar4.zzs(i, 2);
        int iZzD2 = 0;
        for (int i12 = 0; i12 < zzgywVar.size(); i12++) {
            int iZzd2 = zzgywVar.zzd(i12);
            iZzD2 += zzgya.zzD((iZzd2 >> 31) ^ (iZzd2 + iZzd2));
        }
        zzgyaVar4.zzu(iZzD2);
        while (i10 < zzgywVar.size()) {
            int iZzd3 = zzgywVar.zzd(i10);
            zzgyaVar4.zzu((iZzd3 >> 31) ^ (iZzd3 + iZzd3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzD(int i, long j4) throws IOException {
        this.zza.zzv(i, (j4 >> 63) ^ (j4 + j4));
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzE(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgzv)) {
            if (!z10) {
                while (i10 < list.size()) {
                    zzgya zzgyaVar = this.zza;
                    long jLongValue = ((Long) list.get(i10)).longValue();
                    zzgyaVar.zzv(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i10++;
                }
                return;
            }
            zzgya zzgyaVar2 = this.zza;
            zzgyaVar2.zzs(i, 2);
            int iZzE = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                long jLongValue2 = ((Long) list.get(i11)).longValue();
                iZzE += zzgya.zzE((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzgyaVar2.zzu(iZzE);
            while (i10 < list.size()) {
                long jLongValue3 = ((Long) list.get(i10)).longValue();
                zzgyaVar2.zzw((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i10++;
            }
            return;
        }
        zzgzv zzgzvVar = (zzgzv) list;
        if (!z10) {
            while (i10 < zzgzvVar.size()) {
                zzgya zzgyaVar3 = this.zza;
                long jZza = zzgzvVar.zza(i10);
                zzgyaVar3.zzv(i, (jZza >> 63) ^ (jZza + jZza));
                i10++;
            }
            return;
        }
        zzgya zzgyaVar4 = this.zza;
        zzgyaVar4.zzs(i, 2);
        int iZzE2 = 0;
        for (int i12 = 0; i12 < zzgzvVar.size(); i12++) {
            long jZza2 = zzgzvVar.zza(i12);
            iZzE2 += zzgya.zzE((jZza2 >> 63) ^ (jZza2 + jZza2));
        }
        zzgyaVar4.zzu(iZzE2);
        while (i10 < zzgzvVar.size()) {
            long jZza3 = zzgzvVar.zza(i10);
            zzgyaVar4.zzw((jZza3 >> 63) ^ (jZza3 + jZza3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    @Deprecated
    public final void zzF(int i) throws IOException {
        this.zza.zzs(i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzG(int i, String str) throws IOException {
        this.zza.zzq(i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzH(int i, List list) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgzs)) {
            while (i10 < list.size()) {
                this.zza.zzq(i, (String) list.get(i10));
                i10++;
            }
            return;
        }
        zzgzs zzgzsVar = (zzgzs) list;
        while (i10 < list.size()) {
            Object objZzc = zzgzsVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzq(i, (String) objZzc);
            } else {
                this.zza.zzN(i, (zzgxn) objZzc);
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzI(int i, int i10) throws IOException {
        this.zza.zzt(i, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzJ(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgyw)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzt(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzgya zzgyaVar = this.zza;
            zzgyaVar.zzs(i, 2);
            int iZzD = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzD += zzgya.zzD(((Integer) list.get(i11)).intValue());
            }
            zzgyaVar.zzu(iZzD);
            while (i10 < list.size()) {
                zzgyaVar.zzu(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzgyw zzgywVar = (zzgyw) list;
        if (!z10) {
            while (i10 < zzgywVar.size()) {
                this.zza.zzt(i, zzgywVar.zzd(i10));
                i10++;
            }
            return;
        }
        zzgya zzgyaVar2 = this.zza;
        zzgyaVar2.zzs(i, 2);
        int iZzD2 = 0;
        for (int i12 = 0; i12 < zzgywVar.size(); i12++) {
            iZzD2 += zzgya.zzD(zzgywVar.zzd(i12));
        }
        zzgyaVar2.zzu(iZzD2);
        while (i10 < zzgywVar.size()) {
            zzgyaVar2.zzu(zzgywVar.zzd(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzK(int i, long j4) throws IOException {
        this.zza.zzv(i, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzL(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgzv)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzv(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzgya zzgyaVar = this.zza;
            zzgyaVar.zzs(i, 2);
            int iZzE = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzE += zzgya.zzE(((Long) list.get(i11)).longValue());
            }
            zzgyaVar.zzu(iZzE);
            while (i10 < list.size()) {
                zzgyaVar.zzw(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzgzv zzgzvVar = (zzgzv) list;
        if (!z10) {
            while (i10 < zzgzvVar.size()) {
                this.zza.zzv(i, zzgzvVar.zza(i10));
                i10++;
            }
            return;
        }
        zzgya zzgyaVar2 = this.zza;
        zzgyaVar2.zzs(i, 2);
        int iZzE2 = 0;
        for (int i12 = 0; i12 < zzgzvVar.size(); i12++) {
            iZzE2 += zzgya.zzE(zzgzvVar.zza(i12));
        }
        zzgyaVar2.zzu(iZzE2);
        while (i10 < zzgzvVar.size()) {
            zzgyaVar2.zzw(zzgzvVar.zza(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzb(int i, boolean z10) throws IOException {
        this.zza.zzM(i, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzc(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgxd)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzM(i, ((Boolean) list.get(i10)).booleanValue());
                    i10++;
                }
                return;
            }
            zzgya zzgyaVar = this.zza;
            zzgyaVar.zzs(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Boolean) list.get(i12)).getClass();
                i11++;
            }
            zzgyaVar.zzu(i11);
            while (i10 < list.size()) {
                zzgyaVar.zzL(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                i10++;
            }
            return;
        }
        zzgxd zzgxdVar = (zzgxd) list;
        if (!z10) {
            while (i10 < zzgxdVar.size()) {
                this.zza.zzM(i, zzgxdVar.zzh(i10));
                i10++;
            }
            return;
        }
        zzgya zzgyaVar2 = this.zza;
        zzgyaVar2.zzs(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzgxdVar.size(); i14++) {
            zzgxdVar.zzh(i14);
            i13++;
        }
        zzgyaVar2.zzu(i13);
        while (i10 < zzgxdVar.size()) {
            zzgyaVar2.zzL(zzgxdVar.zzh(i10) ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzd(int i, zzgxn zzgxnVar) throws IOException {
        this.zza.zzN(i, zzgxnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zze(int i, List list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zzN(i, (zzgxn) list.get(i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzf(int i, double d10) throws IOException {
        this.zza.zzj(i, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzg(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgyc)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzj(i, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            zzgya zzgyaVar = this.zza;
            zzgyaVar.zzs(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Double) list.get(i12)).getClass();
                i11 += 8;
            }
            zzgyaVar.zzu(i11);
            while (i10 < list.size()) {
                zzgyaVar.zzk(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        zzgyc zzgycVar = (zzgyc) list;
        if (!z10) {
            while (i10 < zzgycVar.size()) {
                this.zza.zzj(i, Double.doubleToRawLongBits(zzgycVar.zzd(i10)));
                i10++;
            }
            return;
        }
        zzgya zzgyaVar2 = this.zza;
        zzgyaVar2.zzs(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzgycVar.size(); i14++) {
            zzgycVar.zzd(i14);
            i13 += 8;
        }
        zzgyaVar2.zzu(i13);
        while (i10 < zzgycVar.size()) {
            zzgyaVar2.zzk(Double.doubleToRawLongBits(zzgycVar.zzd(i10)));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    @Deprecated
    public final void zzh(int i) throws IOException {
        this.zza.zzs(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzi(int i, int i10) throws IOException {
        this.zza.zzl(i, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzj(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgyw)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzl(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzgya zzgyaVar = this.zza;
            zzgyaVar.zzs(i, 2);
            int iZzE = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzE += zzgya.zzE(((Integer) list.get(i11)).intValue());
            }
            zzgyaVar.zzu(iZzE);
            while (i10 < list.size()) {
                zzgyaVar.zzm(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzgyw zzgywVar = (zzgyw) list;
        if (!z10) {
            while (i10 < zzgywVar.size()) {
                this.zza.zzl(i, zzgywVar.zzd(i10));
                i10++;
            }
            return;
        }
        zzgya zzgyaVar2 = this.zza;
        zzgyaVar2.zzs(i, 2);
        int iZzE2 = 0;
        for (int i12 = 0; i12 < zzgywVar.size(); i12++) {
            iZzE2 += zzgya.zzE(zzgywVar.zzd(i12));
        }
        zzgyaVar2.zzu(iZzE2);
        while (i10 < zzgywVar.size()) {
            zzgyaVar2.zzm(zzgywVar.zzd(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzk(int i, int i10) throws IOException {
        this.zza.zzh(i, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzl(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgyw)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzh(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzgya zzgyaVar = this.zza;
            zzgyaVar.zzs(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            zzgyaVar.zzu(i11);
            while (i10 < list.size()) {
                zzgyaVar.zzi(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzgyw zzgywVar = (zzgyw) list;
        if (!z10) {
            while (i10 < zzgywVar.size()) {
                this.zza.zzh(i, zzgywVar.zzd(i10));
                i10++;
            }
            return;
        }
        zzgya zzgyaVar2 = this.zza;
        zzgyaVar2.zzs(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzgywVar.size(); i14++) {
            zzgywVar.zzd(i14);
            i13 += 4;
        }
        zzgyaVar2.zzu(i13);
        while (i10 < zzgywVar.size()) {
            zzgyaVar2.zzi(zzgywVar.zzd(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzm(int i, long j4) throws IOException {
        this.zza.zzj(i, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzn(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgzv)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzj(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzgya zzgyaVar = this.zza;
            zzgyaVar.zzs(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            zzgyaVar.zzu(i11);
            while (i10 < list.size()) {
                zzgyaVar.zzk(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzgzv zzgzvVar = (zzgzv) list;
        if (!z10) {
            while (i10 < zzgzvVar.size()) {
                this.zza.zzj(i, zzgzvVar.zza(i10));
                i10++;
            }
            return;
        }
        zzgya zzgyaVar2 = this.zza;
        zzgyaVar2.zzs(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzgzvVar.size(); i14++) {
            zzgzvVar.zza(i14);
            i13 += 8;
        }
        zzgyaVar2.zzu(i13);
        while (i10 < zzgzvVar.size()) {
            zzgyaVar2.zzk(zzgzvVar.zza(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzo(int i, float f10) throws IOException {
        this.zza.zzh(i, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzp(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgym)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzh(i, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            zzgya zzgyaVar = this.zza;
            zzgyaVar.zzs(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Float) list.get(i12)).getClass();
                i11 += 4;
            }
            zzgyaVar.zzu(i11);
            while (i10 < list.size()) {
                zzgyaVar.zzi(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        zzgym zzgymVar = (zzgym) list;
        if (!z10) {
            while (i10 < zzgymVar.size()) {
                this.zza.zzh(i, Float.floatToRawIntBits(zzgymVar.zzd(i10)));
                i10++;
            }
            return;
        }
        zzgya zzgyaVar2 = this.zza;
        zzgyaVar2.zzs(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzgymVar.size(); i14++) {
            zzgymVar.zzd(i14);
            i13 += 4;
        }
        zzgyaVar2.zzu(i13);
        while (i10 < zzgymVar.size()) {
            zzgyaVar2.zzi(Float.floatToRawIntBits(zzgymVar.zzd(i10)));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzq(int i, Object obj, zzhaz zzhazVar) throws IOException {
        zzgya zzgyaVar = this.zza;
        zzgyaVar.zzs(i, 3);
        zzhazVar.zzj((zzhag) obj, zzgyaVar.zze);
        zzgyaVar.zzs(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzr(int i, int i10) throws IOException {
        this.zza.zzl(i, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzs(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgyw)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzl(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzgya zzgyaVar = this.zza;
            zzgyaVar.zzs(i, 2);
            int iZzE = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzE += zzgya.zzE(((Integer) list.get(i11)).intValue());
            }
            zzgyaVar.zzu(iZzE);
            while (i10 < list.size()) {
                zzgyaVar.zzm(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzgyw zzgywVar = (zzgyw) list;
        if (!z10) {
            while (i10 < zzgywVar.size()) {
                this.zza.zzl(i, zzgywVar.zzd(i10));
                i10++;
            }
            return;
        }
        zzgya zzgyaVar2 = this.zza;
        zzgyaVar2.zzs(i, 2);
        int iZzE2 = 0;
        for (int i12 = 0; i12 < zzgywVar.size(); i12++) {
            iZzE2 += zzgya.zzE(zzgywVar.zzd(i12));
        }
        zzgyaVar2.zzu(iZzE2);
        while (i10 < zzgywVar.size()) {
            zzgyaVar2.zzm(zzgywVar.zzd(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzt(int i, long j4) throws IOException {
        this.zza.zzv(i, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzu(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgzv)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzv(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzgya zzgyaVar = this.zza;
            zzgyaVar.zzs(i, 2);
            int iZzE = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzE += zzgya.zzE(((Long) list.get(i11)).longValue());
            }
            zzgyaVar.zzu(iZzE);
            while (i10 < list.size()) {
                zzgyaVar.zzw(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzgzv zzgzvVar = (zzgzv) list;
        if (!z10) {
            while (i10 < zzgzvVar.size()) {
                this.zza.zzv(i, zzgzvVar.zza(i10));
                i10++;
            }
            return;
        }
        zzgya zzgyaVar2 = this.zza;
        zzgyaVar2.zzs(i, 2);
        int iZzE2 = 0;
        for (int i12 = 0; i12 < zzgzvVar.size(); i12++) {
            iZzE2 += zzgya.zzE(zzgzvVar.zza(i12));
        }
        zzgyaVar2.zzu(iZzE2);
        while (i10 < zzgzvVar.size()) {
            zzgyaVar2.zzw(zzgzvVar.zza(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzv(int i, Object obj, zzhaz zzhazVar) throws IOException {
        this.zza.zzn(i, (zzhag) obj, zzhazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzw(int i, Object obj) throws IOException {
        if (obj instanceof zzgxn) {
            this.zza.zzp(i, (zzgxn) obj);
        } else {
            this.zza.zzo(i, (zzhag) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzx(int i, int i10) throws IOException {
        this.zza.zzh(i, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzy(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgyw)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzh(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzgya zzgyaVar = this.zza;
            zzgyaVar.zzs(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            zzgyaVar.zzu(i11);
            while (i10 < list.size()) {
                zzgyaVar.zzi(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzgyw zzgywVar = (zzgyw) list;
        if (!z10) {
            while (i10 < zzgywVar.size()) {
                this.zza.zzh(i, zzgywVar.zzd(i10));
                i10++;
            }
            return;
        }
        zzgya zzgyaVar2 = this.zza;
        zzgyaVar2.zzs(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzgywVar.size(); i14++) {
            zzgywVar.zzd(i14);
            i13 += 4;
        }
        zzgyaVar2.zzu(i13);
        while (i10 < zzgywVar.size()) {
            zzgyaVar2.zzi(zzgywVar.zzd(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzz(int i, long j4) throws IOException {
        this.zza.zzj(i, j4);
    }
}
