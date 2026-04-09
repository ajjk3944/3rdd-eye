package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.1.1 */
/* loaded from: classes2.dex */
final class zzjm implements zznf {
    private final zzjl zza;

    private zzjm(zzjl zzjlVar) {
        zzkm.zzf(zzjlVar, "output");
        this.zza = zzjlVar;
        zzjlVar.zza = this;
    }

    public static zzjm zza(zzjl zzjlVar) {
        zzjm zzjmVar = zzjlVar.zza;
        return zzjmVar != null ? zzjmVar : new zzjm(zzjlVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzA(int i, int i10) throws IOException {
        this.zza.zzp(i, (i10 >> 31) ^ (i10 + i10));
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzB(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                zzjl zzjlVar = this.zza;
                int iIntValue = ((Integer) list.get(i10)).intValue();
                zzjlVar.zzp(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int iZzA = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int iIntValue2 = ((Integer) list.get(i11)).intValue();
            iZzA += zzjl.zzA((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        this.zza.zzq(iZzA);
        while (i10 < list.size()) {
            zzjl zzjlVar2 = this.zza;
            int iIntValue3 = ((Integer) list.get(i10)).intValue();
            zzjlVar2.zzq((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzC(int i, long j4) throws IOException {
        this.zza.zzr(i, (j4 >> 63) ^ (j4 + j4));
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzD(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                zzjl zzjlVar = this.zza;
                long jLongValue = ((Long) list.get(i10)).longValue();
                zzjlVar.zzr(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int iZzB = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            long jLongValue2 = ((Long) list.get(i11)).longValue();
            iZzB += zzjl.zzB((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.zza.zzq(iZzB);
        while (i10 < list.size()) {
            zzjl zzjlVar2 = this.zza;
            long jLongValue3 = ((Long) list.get(i10)).longValue();
            zzjlVar2.zzs((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    @Deprecated
    public final void zzE(int i) throws IOException {
        this.zza.zzo(i, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzF(int i, String str) throws IOException {
        this.zza.zzm(i, str);
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzG(int i, List list) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzkt)) {
            while (i10 < list.size()) {
                this.zza.zzm(i, (String) list.get(i10));
                i10++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        while (i10 < list.size()) {
            Object objZzf = zzktVar.zzf(i10);
            if (objZzf instanceof String) {
                this.zza.zzm(i, (String) objZzf);
            } else {
                this.zza.zze(i, (zzjd) objZzf);
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzH(int i, int i10) throws IOException {
        this.zza.zzp(i, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzI(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.zza.zzp(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int iZzA = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzA += zzjl.zzA(((Integer) list.get(i11)).intValue());
        }
        this.zza.zzq(iZzA);
        while (i10 < list.size()) {
            this.zza.zzq(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzJ(int i, long j4) throws IOException {
        this.zza.zzr(i, j4);
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzK(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.zza.zzr(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int iZzB = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzB += zzjl.zzB(((Long) list.get(i11)).longValue());
        }
        this.zza.zzq(iZzB);
        while (i10 < list.size()) {
            this.zza.zzs(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzb(int i, boolean z10) throws IOException {
        this.zza.zzd(i, z10);
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzc(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.zza.zzd(i, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            i11++;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzb(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzd(int i, zzjd zzjdVar) throws IOException {
        this.zza.zze(i, zzjdVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zze(int i, List list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zze(i, (zzjd) list.get(i10));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzf(int i, double d10) throws IOException {
        this.zza.zzh(i, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzg(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.zza.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            i11 += 8;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    @Deprecated
    public final void zzh(int i) throws IOException {
        this.zza.zzo(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzi(int i, int i10) throws IOException {
        this.zza.zzj(i, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzj(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.zza.zzj(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int iZzv = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzv += zzjl.zzv(((Integer) list.get(i11)).intValue());
        }
        this.zza.zzq(iZzv);
        while (i10 < list.size()) {
            this.zza.zzk(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzk(int i, int i10) throws IOException {
        this.zza.zzf(i, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzl(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.zza.zzf(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            i11 += 4;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzg(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzm(int i, long j4) throws IOException {
        this.zza.zzh(i, j4);
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzn(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.zza.zzh(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzi(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzo(int i, float f10) throws IOException {
        this.zza.zzf(i, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzp(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.zza.zzf(i, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            i11 += 4;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzq(int i, Object obj, zzlw zzlwVar) throws IOException {
        zzjl zzjlVar = this.zza;
        zzjlVar.zzo(i, 3);
        zzlwVar.zzi((zzll) obj, zzjlVar.zza);
        zzjlVar.zzo(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzr(int i, int i10) throws IOException {
        this.zza.zzj(i, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzs(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.zza.zzj(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int iZzv = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzv += zzjl.zzv(((Integer) list.get(i11)).intValue());
        }
        this.zza.zzq(iZzv);
        while (i10 < list.size()) {
            this.zza.zzk(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzt(int i, long j4) throws IOException {
        this.zza.zzr(i, j4);
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzu(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.zza.zzr(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int iZzB = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzB += zzjl.zzB(((Long) list.get(i11)).longValue());
        }
        this.zza.zzq(iZzB);
        while (i10 < list.size()) {
            this.zza.zzs(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzv(int i, Object obj, zzlw zzlwVar) throws IOException {
        Object obj2 = (zzll) obj;
        zzji zzjiVar = (zzji) this.zza;
        zzjiVar.zzq((i << 3) | 2);
        zzin zzinVar = (zzin) obj2;
        int iZzbr = zzinVar.zzbr();
        if (iZzbr == -1) {
            iZzbr = zzlwVar.zza(zzinVar);
            zzinVar.zzbu(iZzbr);
        }
        zzjiVar.zzq(iZzbr);
        zzlwVar.zzi(obj2, zzjiVar.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzw(int i, int i10) throws IOException {
        this.zza.zzf(i, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzx(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.zza.zzf(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            i11 += 4;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzg(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzy(int i, long j4) throws IOException {
        this.zza.zzh(i, j4);
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final void zzz(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.zza.zzh(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzi(((Long) list.get(i10)).longValue());
            i10++;
        }
    }
}
