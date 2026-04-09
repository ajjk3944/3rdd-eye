package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzxr extends zzxt {
    public zzxr(zzbm zzbmVar, int[] iArr, int i, zzzl zzzlVar, long j4, long j10, long j11, int i10, int i11, float f10, float f11, List list, zzdj zzdjVar) {
        super(zzbmVar, iArr, 0);
        zzfyf.zzl(list);
    }

    public static /* bridge */ /* synthetic */ zzfyf zzd(zzyv[] zzyvVarArr) {
        int i;
        long[][] jArr;
        int i10 = 1;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (int i12 = 0; i12 < 2; i12++) {
            zzyv zzyvVar = zzyvVarArr[i12];
            if (zzyvVar == null || zzyvVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                int i13 = zzfyf.zzd;
                zzfyc zzfycVar = new zzfyc();
                zzfycVar.zzf(new zzxp(0L, 0L));
                arrayList.add(zzfycVar);
            }
        }
        long[][] jArr2 = new long[2][];
        for (int i14 = 0; i14 < 2; i14++) {
            zzyv zzyvVar2 = zzyvVarArr[i14];
            if (zzyvVar2 == null) {
                jArr2[i14] = new long[0];
            } else {
                int[] iArr = zzyvVar2.zzb;
                jArr2[i14] = new long[iArr.length];
                for (int i15 = 0; i15 < iArr.length; i15++) {
                    long j4 = zzyvVar2.zza.zzb(iArr[i15]).zzj;
                    long[] jArr3 = jArr2[i14];
                    if (j4 == -1) {
                        j4 = 0;
                    }
                    jArr3[i15] = j4;
                }
                Arrays.sort(jArr2[i14]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr4 = new long[2];
        for (int i16 = 0; i16 < 2; i16++) {
            long[] jArr5 = jArr2[i16];
            jArr4[i16] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        zzi(arrayList, jArr4);
        zzfyq zzfyqVarZza = zzfzl.zzc(zzfzq.zzc()).zzb(2).zza();
        int i17 = 0;
        while (i17 < 2) {
            int length = jArr2[i17].length;
            if (length <= i10) {
                i = i11;
                jArr = jArr2;
            } else {
                double[] dArr = new double[length];
                int i18 = i11;
                while (true) {
                    long[] jArr6 = jArr2[i17];
                    double dLog = 0.0d;
                    if (i18 >= jArr6.length) {
                        break;
                    }
                    int i19 = i11;
                    long[][] jArr7 = jArr2;
                    long j10 = jArr6[i18];
                    if (j10 != -1) {
                        dLog = Math.log(j10);
                    }
                    dArr[i18] = dLog;
                    i18 += i10;
                    i11 = i19;
                    jArr2 = jArr7;
                }
                i = i11;
                jArr = jArr2;
                int i20 = length - 1;
                double d10 = dArr[i20] - dArr[i];
                int i21 = i;
                while (i21 < i20) {
                    double d11 = dArr[i21];
                    i21 += i10;
                    zzfyqVarZza.zzq(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i21]) * 0.5d) - dArr[i]) / d10), Integer.valueOf(i17));
                    i10 = i10;
                }
            }
            i17++;
            i11 = i;
            jArr2 = jArr;
            i10 = i10;
        }
        int i22 = i11;
        long[][] jArr8 = jArr2;
        zzfyf zzfyfVarZzl = zzfyf.zzl(zzfyqVarZza.zzr());
        while (i11 < zzfyfVarZzl.size()) {
            int iIntValue = ((Integer) zzfyfVarZzl.get(i11)).intValue();
            int i23 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i23;
            jArr4[iIntValue] = jArr8[iIntValue][i23];
            zzi(arrayList, jArr4);
            i11++;
        }
        for (int i24 = i22; i24 < 2; i24++) {
            if (arrayList.get(i24) != null) {
                long j11 = jArr4[i24];
                jArr4[i24] = j11 + j11;
            }
        }
        zzi(arrayList, jArr4);
        zzfyc zzfycVar2 = new zzfyc();
        for (int i25 = i22; i25 < arrayList.size(); i25++) {
            zzfyc zzfycVar3 = (zzfyc) arrayList.get(i25);
            zzfycVar2.zzf(zzfycVar3 == null ? zzfyf.zzn() : zzfycVar3.zzi());
        }
        return zzfycVar2.zzi();
    }

    private static void zzi(List list, long[] jArr) {
        long j4 = 0;
        for (int i = 0; i < 2; i++) {
            j4 += jArr[i];
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzfyc zzfycVar = (zzfyc) list.get(i10);
            if (zzfycVar != null) {
                zzfycVar.zzf(new zzxp(j4, jArr[i10]));
            }
        }
    }
}
