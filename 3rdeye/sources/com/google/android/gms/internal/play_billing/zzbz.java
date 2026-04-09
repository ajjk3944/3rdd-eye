package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzbz implements zzfx {
    private final zzby zza;

    private zzbz(zzby zzbyVar) {
        byte[] bArr = zzda.zzd;
        this.zza = zzbyVar;
        zzbyVar.zza = this;
    }

    public static zzbz zza(zzby zzbyVar) {
        zzbz zzbzVar = zzbyVar.zza;
        return zzbzVar != null ? zzbzVar : new zzbz(zzbyVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzA(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzdr)) {
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
            return;
        }
        zzdr zzdrVar = (zzdr) list;
        if (!z10) {
            while (i10 < zzdrVar.size()) {
                this.zza.zzh(i, zzdrVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzdrVar.size(); i14++) {
            zzdrVar.zze(i14);
            i13 += 8;
        }
        this.zza.zzq(i13);
        while (i10 < zzdrVar.size()) {
            this.zza.zzi(zzdrVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzB(int i, int i10) throws IOException {
        this.zza.zzp(i, (i10 >> 31) ^ (i10 + i10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzC(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzct)) {
            if (!z10) {
                while (i10 < list.size()) {
                    zzby zzbyVar = this.zza;
                    int iIntValue = ((Integer) list.get(i10)).intValue();
                    zzbyVar.zzp(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i10++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int iZzw = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue2 = ((Integer) list.get(i11)).intValue();
                iZzw += zzby.zzw((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.zza.zzq(iZzw);
            while (i10 < list.size()) {
                zzby zzbyVar2 = this.zza;
                int iIntValue3 = ((Integer) list.get(i10)).intValue();
                zzbyVar2.zzq((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i10++;
            }
            return;
        }
        zzct zzctVar = (zzct) list;
        if (!z10) {
            while (i10 < zzctVar.size()) {
                zzby zzbyVar3 = this.zza;
                int iZze = zzctVar.zze(i10);
                zzbyVar3.zzp(i, (iZze >> 31) ^ (iZze + iZze));
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int iZzw2 = 0;
        for (int i12 = 0; i12 < zzctVar.size(); i12++) {
            int iZze2 = zzctVar.zze(i12);
            iZzw2 += zzby.zzw((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        this.zza.zzq(iZzw2);
        while (i10 < zzctVar.size()) {
            zzby zzbyVar4 = this.zza;
            int iZze3 = zzctVar.zze(i10);
            zzbyVar4.zzq((iZze3 >> 31) ^ (iZze3 + iZze3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzD(int i, long j4) throws IOException {
        this.zza.zzr(i, (j4 >> 63) ^ (j4 + j4));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzE(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzdr)) {
            if (!z10) {
                while (i10 < list.size()) {
                    zzby zzbyVar = this.zza;
                    long jLongValue = ((Long) list.get(i10)).longValue();
                    zzbyVar.zzr(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i10++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int iZzx = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                long jLongValue2 = ((Long) list.get(i11)).longValue();
                iZzx += zzby.zzx((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.zza.zzq(iZzx);
            while (i10 < list.size()) {
                zzby zzbyVar2 = this.zza;
                long jLongValue3 = ((Long) list.get(i10)).longValue();
                zzbyVar2.zzs((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i10++;
            }
            return;
        }
        zzdr zzdrVar = (zzdr) list;
        if (!z10) {
            while (i10 < zzdrVar.size()) {
                zzby zzbyVar3 = this.zza;
                long jZze = zzdrVar.zze(i10);
                zzbyVar3.zzr(i, (jZze >> 63) ^ (jZze + jZze));
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int iZzx2 = 0;
        for (int i12 = 0; i12 < zzdrVar.size(); i12++) {
            long jZze2 = zzdrVar.zze(i12);
            iZzx2 += zzby.zzx((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        this.zza.zzq(iZzx2);
        while (i10 < zzdrVar.size()) {
            zzby zzbyVar4 = this.zza;
            long jZze3 = zzdrVar.zze(i10);
            zzbyVar4.zzs((jZze3 >> 63) ^ (jZze3 + jZze3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    @Deprecated
    public final void zzF(int i) throws IOException {
        this.zza.zzo(i, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzG(int i, String str) throws IOException {
        this.zza.zzm(i, str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzH(int i, List list) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzdk)) {
            while (i10 < list.size()) {
                this.zza.zzm(i, (String) list.get(i10));
                i10++;
            }
            return;
        }
        zzdk zzdkVar = (zzdk) list;
        while (i10 < list.size()) {
            Object objZzf = zzdkVar.zzf(i10);
            if (objZzf instanceof String) {
                this.zza.zzm(i, (String) objZzf);
            } else {
                this.zza.zze(i, (zzbq) objZzf);
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzI(int i, int i10) throws IOException {
        this.zza.zzp(i, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzJ(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzct)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzp(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int iZzw = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzw += zzby.zzw(((Integer) list.get(i11)).intValue());
            }
            this.zza.zzq(iZzw);
            while (i10 < list.size()) {
                this.zza.zzq(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzct zzctVar = (zzct) list;
        if (!z10) {
            while (i10 < zzctVar.size()) {
                this.zza.zzp(i, zzctVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int iZzw2 = 0;
        for (int i12 = 0; i12 < zzctVar.size(); i12++) {
            iZzw2 += zzby.zzw(zzctVar.zze(i12));
        }
        this.zza.zzq(iZzw2);
        while (i10 < zzctVar.size()) {
            this.zza.zzq(zzctVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzK(int i, long j4) throws IOException {
        this.zza.zzr(i, j4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzL(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzdr)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzr(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int iZzx = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzx += zzby.zzx(((Long) list.get(i11)).longValue());
            }
            this.zza.zzq(iZzx);
            while (i10 < list.size()) {
                this.zza.zzs(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzdr zzdrVar = (zzdr) list;
        if (!z10) {
            while (i10 < zzdrVar.size()) {
                this.zza.zzr(i, zzdrVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int iZzx2 = 0;
        for (int i12 = 0; i12 < zzdrVar.size(); i12++) {
            iZzx2 += zzby.zzx(zzdrVar.zze(i12));
        }
        this.zza.zzq(iZzx2);
        while (i10 < zzdrVar.size()) {
            this.zza.zzs(zzdrVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzb(int i, boolean z10) throws IOException {
        this.zza.zzd(i, z10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzc(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzbe)) {
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
            return;
        }
        zzbe zzbeVar = (zzbe) list;
        if (!z10) {
            while (i10 < zzbeVar.size()) {
                this.zza.zzd(i, zzbeVar.zzf(i10));
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzbeVar.size(); i14++) {
            zzbeVar.zzf(i14);
            i13++;
        }
        this.zza.zzq(i13);
        while (i10 < zzbeVar.size()) {
            this.zza.zzb(zzbeVar.zzf(i10) ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzd(int i, zzbq zzbqVar) throws IOException {
        this.zza.zze(i, zzbqVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zze(int i, List list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zze(i, (zzbq) list.get(i10));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzf(int i, double d10) throws IOException {
        this.zza.zzh(i, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzg(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzca)) {
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
            return;
        }
        zzca zzcaVar = (zzca) list;
        if (!z10) {
            while (i10 < zzcaVar.size()) {
                this.zza.zzh(i, Double.doubleToRawLongBits(zzcaVar.zze(i10)));
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzcaVar.size(); i14++) {
            zzcaVar.zze(i14);
            i13 += 8;
        }
        this.zza.zzq(i13);
        while (i10 < zzcaVar.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(zzcaVar.zze(i10)));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    @Deprecated
    public final void zzh(int i) throws IOException {
        this.zza.zzo(i, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzi(int i, int i10) throws IOException {
        this.zza.zzj(i, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzj(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzct)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzj(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int iZzx = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzx += zzby.zzx(((Integer) list.get(i11)).intValue());
            }
            this.zza.zzq(iZzx);
            while (i10 < list.size()) {
                this.zza.zzk(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzct zzctVar = (zzct) list;
        if (!z10) {
            while (i10 < zzctVar.size()) {
                this.zza.zzj(i, zzctVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int iZzx2 = 0;
        for (int i12 = 0; i12 < zzctVar.size(); i12++) {
            iZzx2 += zzby.zzx(zzctVar.zze(i12));
        }
        this.zza.zzq(iZzx2);
        while (i10 < zzctVar.size()) {
            this.zza.zzk(zzctVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzk(int i, int i10) throws IOException {
        this.zza.zzf(i, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzl(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzct)) {
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
            return;
        }
        zzct zzctVar = (zzct) list;
        if (!z10) {
            while (i10 < zzctVar.size()) {
                this.zza.zzf(i, zzctVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzctVar.size(); i14++) {
            zzctVar.zze(i14);
            i13 += 4;
        }
        this.zza.zzq(i13);
        while (i10 < zzctVar.size()) {
            this.zza.zzg(zzctVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzm(int i, long j4) throws IOException {
        this.zza.zzh(i, j4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzn(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzdr)) {
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
            return;
        }
        zzdr zzdrVar = (zzdr) list;
        if (!z10) {
            while (i10 < zzdrVar.size()) {
                this.zza.zzh(i, zzdrVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzdrVar.size(); i14++) {
            zzdrVar.zze(i14);
            i13 += 8;
        }
        this.zza.zzq(i13);
        while (i10 < zzdrVar.size()) {
            this.zza.zzi(zzdrVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzo(int i, float f10) throws IOException {
        this.zza.zzf(i, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzp(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzck)) {
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
            return;
        }
        zzck zzckVar = (zzck) list;
        if (!z10) {
            while (i10 < zzckVar.size()) {
                this.zza.zzf(i, Float.floatToRawIntBits(zzckVar.zze(i10)));
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzckVar.size(); i14++) {
            zzckVar.zze(i14);
            i13 += 4;
        }
        this.zza.zzq(i13);
        while (i10 < zzckVar.size()) {
            this.zza.zzg(Float.floatToRawIntBits(zzckVar.zze(i10)));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzq(int i, Object obj, zzeo zzeoVar) throws IOException {
        zzby zzbyVar = this.zza;
        zzbyVar.zzo(i, 3);
        zzeoVar.zzi((zzec) obj, zzbyVar.zza);
        zzbyVar.zzo(i, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzr(int i, int i10) throws IOException {
        this.zza.zzj(i, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzs(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzct)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzj(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int iZzx = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzx += zzby.zzx(((Integer) list.get(i11)).intValue());
            }
            this.zza.zzq(iZzx);
            while (i10 < list.size()) {
                this.zza.zzk(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzct zzctVar = (zzct) list;
        if (!z10) {
            while (i10 < zzctVar.size()) {
                this.zza.zzj(i, zzctVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int iZzx2 = 0;
        for (int i12 = 0; i12 < zzctVar.size(); i12++) {
            iZzx2 += zzby.zzx(zzctVar.zze(i12));
        }
        this.zza.zzq(iZzx2);
        while (i10 < zzctVar.size()) {
            this.zza.zzk(zzctVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzt(int i, long j4) throws IOException {
        this.zza.zzr(i, j4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzu(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzdr)) {
            if (!z10) {
                while (i10 < list.size()) {
                    this.zza.zzr(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int iZzx = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzx += zzby.zzx(((Long) list.get(i11)).longValue());
            }
            this.zza.zzq(iZzx);
            while (i10 < list.size()) {
                this.zza.zzs(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzdr zzdrVar = (zzdr) list;
        if (!z10) {
            while (i10 < zzdrVar.size()) {
                this.zza.zzr(i, zzdrVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int iZzx2 = 0;
        for (int i12 = 0; i12 < zzdrVar.size(); i12++) {
            iZzx2 += zzby.zzx(zzdrVar.zze(i12));
        }
        this.zza.zzq(iZzx2);
        while (i10 < zzdrVar.size()) {
            this.zza.zzs(zzdrVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzv(int i, Object obj, zzeo zzeoVar) throws IOException {
        zzec zzecVar = (zzec) obj;
        zzbv zzbvVar = (zzbv) this.zza;
        zzbvVar.zzq((i << 3) | 2);
        zzbvVar.zzq(((zzay) zzecVar).zza(zzeoVar));
        zzeoVar.zzi(zzecVar, zzbvVar.zza);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzw(int i, Object obj) throws IOException {
        if (obj instanceof zzbq) {
            zzbv zzbvVar = (zzbv) this.zza;
            zzbvVar.zzq(11);
            zzbvVar.zzp(2, i);
            zzbvVar.zze(3, (zzbq) obj);
            zzbvVar.zzq(12);
            return;
        }
        zzby zzbyVar = this.zza;
        zzec zzecVar = (zzec) obj;
        zzbv zzbvVar2 = (zzbv) zzbyVar;
        zzbvVar2.zzq(11);
        zzbvVar2.zzp(2, i);
        zzbvVar2.zzq(26);
        zzbvVar2.zzq(zzecVar.zzf());
        zzecVar.zze(zzbyVar);
        zzbvVar2.zzq(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzx(int i, int i10) throws IOException {
        this.zza.zzf(i, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzy(int i, List list, boolean z10) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzct)) {
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
            return;
        }
        zzct zzctVar = (zzct) list;
        if (!z10) {
            while (i10 < zzctVar.size()) {
                this.zza.zzf(i, zzctVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzctVar.size(); i14++) {
            zzctVar.zze(i14);
            i13 += 4;
        }
        this.zza.zzq(i13);
        while (i10 < zzctVar.size()) {
            this.zza.zzg(zzctVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final void zzz(int i, long j4) throws IOException {
        this.zza.zzh(i, j4);
    }
}
