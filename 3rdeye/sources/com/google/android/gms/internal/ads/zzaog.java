package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaog implements zzany {
    final /* synthetic */ zzaoh zza;
    private final zzem zzb = new zzem(new byte[5], 5);
    private final SparseArray zzc = new SparseArray();
    private final SparseIntArray zzd = new SparseIntArray();
    private final int zze;

    public zzaog(zzaoh zzaohVar, int i) {
        this.zza = zzaohVar;
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zza(zzen zzenVar) {
        zzaoh zzaohVar;
        int i;
        zzem zzemVar;
        int i10;
        int i11;
        if (zzenVar.zzm() != 2) {
            return;
        }
        zzaoh zzaohVar2 = this.zza;
        zzeu zzeuVar = (zzeu) zzaohVar2.zzb.get(0);
        if ((zzenVar.zzm() & 128) != 0) {
            zzenVar.zzM(1);
            int iZzq = zzenVar.zzq();
            int i12 = 3;
            zzenVar.zzM(3);
            zzem zzemVar2 = this.zzb;
            zzenVar.zzG(zzemVar2, 2);
            zzemVar2.zzn(3);
            int i13 = 13;
            zzaohVar2.zzr = zzemVar2.zzd(13);
            zzenVar.zzG(zzemVar2, 2);
            int i14 = 4;
            zzemVar2.zzn(4);
            int i15 = 12;
            zzenVar.zzM(zzemVar2.zzd(12));
            SparseArray sparseArray = this.zzc;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.zzd;
            sparseIntArray.clear();
            int iZza = zzenVar.zza();
            while (iZza > 0) {
                int i16 = 5;
                zzenVar.zzG(zzemVar2, 5);
                int iZzd = zzemVar2.zzd(8);
                zzemVar2.zzn(i12);
                int iZzd2 = zzemVar2.zzd(i13);
                zzemVar2.zzn(i14);
                int iZzd3 = zzemVar2.zzd(i15);
                int iZzc = zzenVar.zzc();
                int i17 = iZzc + iZzd3;
                String str = null;
                ArrayList arrayList = null;
                int i18 = -1;
                int iZzm = 0;
                while (zzenVar.zzc() < i17) {
                    int iZzm2 = zzenVar.zzm();
                    int iZzc2 = zzenVar.zzc() + zzenVar.zzm();
                    if (iZzc2 > i17) {
                        break;
                    }
                    if (iZzm2 == i16) {
                        long jZzu = zzenVar.zzu();
                        if (jZzu != 1094921523) {
                            if (jZzu != 1161904947) {
                                if (jZzu != 1094921524) {
                                    if (jZzu == 1212503619) {
                                        i11 = 36;
                                        zzaohVar = zzaohVar2;
                                        i18 = i11;
                                        i = iZzc2;
                                        zzemVar = zzemVar2;
                                        i10 = iZza;
                                    }
                                    zzaohVar = zzaohVar2;
                                    i = iZzc2;
                                    zzemVar = zzemVar2;
                                    i10 = iZza;
                                }
                                zzaohVar = zzaohVar2;
                                i = iZzc2;
                                zzemVar = zzemVar2;
                                i10 = iZza;
                                i18 = 172;
                            }
                            zzaohVar = zzaohVar2;
                            zzemVar = zzemVar2;
                            i10 = iZza;
                            i18 = 135;
                            i = iZzc2;
                        }
                        zzaohVar = zzaohVar2;
                        i = iZzc2;
                        zzemVar = zzemVar2;
                        i10 = iZza;
                        i18 = 129;
                    } else {
                        if (iZzm2 != 106) {
                            if (iZzm2 == 122) {
                                zzaohVar = zzaohVar2;
                                zzemVar = zzemVar2;
                                i10 = iZza;
                                i18 = 135;
                                i = iZzc2;
                            } else {
                                if (iZzm2 == 127) {
                                    int iZzm3 = zzenVar.zzm();
                                    if (iZzm3 != 21) {
                                        if (iZzm3 == 14) {
                                            i11 = 136;
                                        } else {
                                            if (iZzm3 == 33) {
                                                i11 = 139;
                                            }
                                            zzaohVar = zzaohVar2;
                                            i = iZzc2;
                                            zzemVar = zzemVar2;
                                            i10 = iZza;
                                        }
                                    }
                                    zzaohVar = zzaohVar2;
                                    i = iZzc2;
                                    zzemVar = zzemVar2;
                                    i10 = iZza;
                                    i18 = 172;
                                } else if (iZzm2 == 123) {
                                    i11 = Sdk$SDKError.b.CONFIG_REFRESH_FAILED_VALUE;
                                } else if (iZzm2 == 10) {
                                    String strTrim = zzenVar.zzB(3, StandardCharsets.UTF_8).trim();
                                    iZzm = zzenVar.zzm();
                                    zzaohVar = zzaohVar2;
                                    str = strTrim;
                                    i = iZzc2;
                                    zzemVar = zzemVar2;
                                    i10 = iZza;
                                } else if (iZzm2 == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (zzenVar.zzc() < iZzc2) {
                                        int i19 = iZzc2;
                                        String strTrim2 = zzenVar.zzB(3, StandardCharsets.UTF_8).trim();
                                        int iZzm4 = zzenVar.zzm();
                                        int i20 = iZza;
                                        byte[] bArr = new byte[4];
                                        zzenVar.zzH(bArr, 0, 4);
                                        arrayList2.add(new zzaoi(strTrim2, iZzm4, bArr));
                                        iZza = i20;
                                        iZzc2 = i19;
                                        zzemVar2 = zzemVar2;
                                        zzaohVar2 = zzaohVar2;
                                    }
                                    zzaohVar = zzaohVar2;
                                    i = iZzc2;
                                    zzemVar = zzemVar2;
                                    i10 = iZza;
                                    arrayList = arrayList2;
                                    i18 = 89;
                                } else {
                                    zzaohVar = zzaohVar2;
                                    i = iZzc2;
                                    zzemVar = zzemVar2;
                                    i10 = iZza;
                                    if (iZzm2 == 111) {
                                        i18 = 257;
                                    }
                                }
                                zzaohVar = zzaohVar2;
                                i18 = i11;
                                i = iZzc2;
                                zzemVar = zzemVar2;
                                i10 = iZza;
                            }
                        }
                        zzaohVar = zzaohVar2;
                        i = iZzc2;
                        zzemVar = zzemVar2;
                        i10 = iZza;
                        i18 = 129;
                    }
                    zzenVar.zzM(i - zzenVar.zzc());
                    iZza = i10;
                    zzemVar2 = zzemVar;
                    zzaohVar2 = zzaohVar;
                    i16 = 5;
                }
                zzaoh zzaohVar3 = zzaohVar2;
                zzem zzemVar3 = zzemVar2;
                int i21 = iZza;
                zzenVar.zzL(i17);
                zzaoj zzaojVar = new zzaoj(i18, str, iZzm, arrayList, Arrays.copyOfRange(zzenVar.zzN(), iZzc, i17));
                if (iZzd == 6 || iZzd == 5) {
                    iZzd = zzaojVar.zza;
                }
                iZza = i21 - (iZzd3 + 5);
                if (!zzaohVar3.zzh.get(iZzd2)) {
                    zzaom zzaomVarZzb = zzaohVar3.zze.zzb(iZzd, zzaojVar);
                    sparseIntArray.put(iZzd2, iZzd2);
                    sparseArray.put(iZzd2, zzaomVarZzb);
                }
                i14 = 4;
                zzemVar2 = zzemVar3;
                zzaohVar2 = zzaohVar3;
                i12 = 3;
                i13 = 13;
                i15 = 12;
            }
            zzaoh zzaohVar4 = zzaohVar2;
            int size = sparseIntArray.size();
            for (int i22 = 0; i22 < size; i22++) {
                int iKeyAt = sparseIntArray.keyAt(i22);
                int iValueAt = sparseIntArray.valueAt(i22);
                zzaohVar4.zzh.put(iKeyAt, true);
                zzaohVar4.zzi.put(iValueAt, true);
                zzaom zzaomVar = (zzaom) sparseArray.valueAt(i22);
                if (zzaomVar != null) {
                    zzaomVar.zzb(zzeuVar, zzaohVar4.zzl, new zzaol(iZzq, iKeyAt, 8192));
                    zzaohVar4.zzg.put(iValueAt, zzaomVar);
                }
            }
            zzaohVar4.zzg.remove(this.zze);
            zzaohVar4.zzm = 0;
            if (zzaohVar4.zzm == 0) {
                zzaohVar4.zzl.zzG();
                zzaohVar4.zzn = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzb(zzeu zzeuVar, zzadw zzadwVar, zzaol zzaolVar) {
    }
}
