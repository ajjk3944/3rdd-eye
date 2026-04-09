package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzza extends zzzd {
    public abstract Pair zzd(zzyz zzyzVar, int[][][] iArr, int[] iArr2, zzvh zzvhVar, zzbl zzblVar) throws zzin;

    @Override // com.google.android.gms.internal.ads.zzzd
    public final zzze zzo(zzmd[] zzmdVarArr, zzxk zzxkVar, zzvh zzvhVar, zzbl zzblVar) throws zzin {
        List[] listArr;
        boolean z10;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzbm[][] zzbmVarArr = new zzbm[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i10 = zzxkVar.zzb;
            zzbmVarArr[i] = new zzbm[i10];
            iArr3[i] = new int[i10][];
        }
        int i11 = 2;
        int[] iArr4 = new int[2];
        for (int i12 = 0; i12 < 2; i12++) {
            iArr4[i12] = zzmdVarArr[i12].zze();
        }
        int i13 = 0;
        while (i13 < zzxkVar.zzb) {
            zzbm zzbmVarZzb = zzxkVar.zzb(i13);
            int i14 = zzbmVarZzb.zzc;
            int i15 = i11;
            int i16 = 0;
            int i17 = 0;
            boolean z11 = true;
            while (i16 < i11) {
                zzmd zzmdVar = zzmdVarArr[i16];
                int iMax = 0;
                for (int i18 = 0; i18 < zzbmVarZzb.zza; i18++) {
                    iMax = Math.max(iMax, zzmdVar.zzY(zzbmVarZzb.zzb(i18)) & 7);
                }
                boolean z12 = iArr2[i16] == 0;
                if (iMax > i17) {
                    z11 = z12;
                    i15 = i16;
                    i17 = iMax;
                } else if (iMax == i17 && i14 == 5 && !z11 && z12) {
                    i15 = i16;
                    i17 = iMax;
                    z11 = true;
                }
                i16++;
                i11 = 2;
            }
            if (i15 == i11) {
                iArr = new int[zzbmVarZzb.zza];
            } else {
                zzmd zzmdVar2 = zzmdVarArr[i15];
                int i19 = zzbmVarZzb.zza;
                int[] iArr5 = new int[i19];
                for (int i20 = 0; i20 < i19; i20++) {
                    iArr5[i20] = zzmdVar2.zzY(zzbmVarZzb.zzb(i20));
                }
                iArr = iArr5;
            }
            int i21 = iArr2[i15];
            zzbmVarArr[i15][i21] = zzbmVarZzb;
            iArr3[i15][i21] = iArr;
            iArr2[i15] = i21 + 1;
            i13++;
            i11 = 2;
        }
        zzxk[] zzxkVarArr = new zzxk[i11];
        String[] strArr = new String[i11];
        int[] iArr6 = new int[i11];
        int i22 = 0;
        while (i22 < i11) {
            int i23 = iArr2[i22];
            zzxkVarArr[i22] = new zzxk((zzbm[]) zzex.zzQ(zzbmVarArr[i22], i23));
            iArr3[i22] = (int[][]) zzex.zzQ(iArr3[i22], i23);
            strArr[i22] = zzmdVarArr[i22].zzU();
            iArr6[i22] = zzmdVarArr[i22].zzb();
            i22++;
            i11 = 2;
        }
        int i24 = i11;
        zzyz zzyzVar = new zzyz(strArr, iArr6, zzxkVarArr, iArr4, iArr3, new zzxk((zzbm[]) zzex.zzQ(zzbmVarArr[i24], iArr2[i24])));
        Pair pairZzd = zzd(zzyzVar, iArr3, iArr4, zzvhVar, zzblVar);
        zzzb[] zzzbVarArr = (zzzb[]) pairZzd.second;
        List[] listArr2 = new List[zzzbVarArr.length];
        for (int i25 = 0; i25 < zzzbVarArr.length; i25++) {
            zzzb zzzbVar = zzzbVarArr[i25];
            listArr2[i25] = zzzbVar != null ? zzfyf.zzo(zzzbVar) : zzfyf.zzn();
        }
        zzfyc zzfycVar = new zzfyc();
        for (int i26 = 0; i26 < 2; i26++) {
            zzxk zzxkVarZzd = zzyzVar.zzd(i26);
            List list = listArr2[i26];
            int i27 = 0;
            while (i27 < zzxkVarZzd.zzb) {
                zzbm zzbmVarZzb2 = zzxkVarZzd.zzb(i27);
                boolean z13 = zzyzVar.zza(i26, i27, false) != 0;
                int i28 = zzbmVarZzb2.zza;
                int[] iArr7 = new int[i28];
                boolean[] zArr = new boolean[i28];
                int i29 = 0;
                while (i29 < i28) {
                    iArr7[i29] = zzyzVar.zzb(i26, i27, i29) & 7;
                    int i30 = 0;
                    while (true) {
                        if (i30 >= list.size()) {
                            listArr = listArr2;
                            z10 = false;
                            break;
                        }
                        zzzb zzzbVar2 = (zzzb) list.get(i30);
                        listArr = listArr2;
                        if (zzzbVar2.zzc().equals(zzbmVarZzb2) && zzzbVar2.zzg(i29) != -1) {
                            z10 = true;
                            break;
                        }
                        i30++;
                        listArr2 = listArr;
                    }
                    zArr[i29] = z10;
                    i29++;
                    listArr2 = listArr;
                }
                zzfycVar.zzf(new zzbs(zzbmVarZzb2, z13, iArr7, zArr));
                i27++;
                listArr2 = listArr2;
            }
        }
        zzxk zzxkVarZze = zzyzVar.zze();
        for (int i31 = 0; i31 < zzxkVarZze.zzb; i31++) {
            zzbm zzbmVarZzb3 = zzxkVarZze.zzb(i31);
            int i32 = zzbmVarZzb3.zza;
            int[] iArr8 = new int[i32];
            Arrays.fill(iArr8, 0);
            zzfycVar.zzf(new zzbs(zzbmVarZzb3, false, iArr8, new boolean[i32]));
        }
        return new zzze((zzme[]) pairZzd.first, (zzyw[]) pairZzd.second, new zzbt(zzfycVar.zzi()), zzyzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final void zzp(Object obj) {
    }
}
