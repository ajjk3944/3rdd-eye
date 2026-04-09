package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzvv implements zzvf, zzve {
    private final zzvf[] zza;
    private final boolean[] zzb;
    private zzve zzf;
    private zzxk zzg;
    private final ArrayList zzd = new ArrayList();
    private final HashMap zze = new HashMap();
    private zzxb zzi = new zzur(zzfyf.zzn(), zzfyf.zzn());
    private final IdentityHashMap zzc = new IdentityHashMap();
    private zzvf[] zzh = new zzvf[0];

    public zzvv(zzus zzusVar, long[] jArr, zzvf... zzvfVarArr) {
        this.zza = zzvfVarArr;
        this.zzb = new boolean[zzvfVarArr.length];
        for (int i = 0; i < zzvfVarArr.length; i++) {
            long j4 = jArr[i];
            if (j4 != 0) {
                this.zzb[i] = true;
                this.zza[i] = new zzxh(zzvfVarArr[i], j4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zza(long j4, zzmi zzmiVar) {
        zzvf[] zzvfVarArr = this.zzh;
        return (zzvfVarArr.length > 0 ? zzvfVarArr[0] : this.zza[0]).zza(j4, zzmiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final long zzb() {
        return this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final long zzc() {
        return this.zzi.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzd() {
        long j4 = -9223372036854775807L;
        for (zzvf zzvfVar : this.zzh) {
            long jZzd = zzvfVar.zzd();
            if (jZzd == -9223372036854775807L) {
                if (j4 != -9223372036854775807L && zzvfVar.zze(j4) != j4) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j4 == -9223372036854775807L) {
                for (zzvf zzvfVar2 : this.zzh) {
                    if (zzvfVar2 == zzvfVar) {
                        break;
                    }
                    if (zzvfVar2.zze(jZzd) != jZzd) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j4 = jZzd;
            } else if (jZzd != j4) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j4;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zze(long j4) {
        long jZze = this.zzh[0].zze(j4);
        int i = 1;
        while (true) {
            zzvf[] zzvfVarArr = this.zzh;
            if (i >= zzvfVarArr.length) {
                return jZze;
            }
            if (zzvfVarArr[i].zze(jZze) != jZze) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzf(zzyw[] zzywVarArr, boolean[] zArr, zzwz[] zzwzVarArr, boolean[] zArr2, long j4) {
        int length;
        int[] iArr;
        int length2 = zzywVarArr.length;
        int[] iArr2 = new int[length2];
        int[] iArr3 = new int[length2];
        int i = 0;
        int i10 = 0;
        while (true) {
            length = zzywVarArr.length;
            if (i10 >= length) {
                break;
            }
            zzwz zzwzVar = zzwzVarArr[i10];
            Integer num = zzwzVar == null ? null : (Integer) this.zzc.get(zzwzVar);
            iArr2[i10] = num == null ? -1 : num.intValue();
            zzyw zzywVar = zzywVarArr[i10];
            if (zzywVar != null) {
                String str = zzywVar.zzc().zzb;
                iArr3[i10] = Integer.parseInt(str.substring(0, str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER)));
            } else {
                iArr3[i10] = -1;
            }
            i10++;
        }
        IdentityHashMap identityHashMap = this.zzc;
        identityHashMap.clear();
        zzvf[] zzvfVarArr = this.zza;
        zzwz[] zzwzVarArr2 = new zzwz[length];
        zzwz[] zzwzVarArr3 = new zzwz[length];
        zzyw[] zzywVarArr2 = new zzyw[length];
        ArrayList arrayList = new ArrayList(zzvfVarArr.length);
        long j10 = j4;
        int i11 = 0;
        while (i11 < zzvfVarArr.length) {
            int i12 = i;
            while (i12 < zzywVarArr.length) {
                zzwzVarArr3[i12] = iArr2[i12] == i11 ? zzwzVarArr[i12] : null;
                if (iArr3[i12] == i11) {
                    zzyw zzywVar2 = zzywVarArr[i12];
                    zzywVar2.getClass();
                    iArr = iArr3;
                    zzbm zzbmVar = (zzbm) this.zze.get(zzywVar2.zzc());
                    zzbmVar.getClass();
                    zzywVarArr2[i12] = new zzvu(zzywVar2, zzbmVar);
                } else {
                    iArr = iArr3;
                    zzywVarArr2[i12] = null;
                }
                i12++;
                iArr3 = iArr;
            }
            int[] iArr4 = iArr3;
            ArrayList arrayList2 = arrayList;
            int i13 = i11;
            long jZzf = zzvfVarArr[i11].zzf(zzywVarArr2, zArr, zzwzVarArr3, zArr2, j10);
            if (i13 == 0) {
                j10 = jZzf;
            } else if (jZzf != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i14 = 0; i14 < zzywVarArr.length; i14++) {
                if (iArr4[i14] == i13) {
                    zzwz zzwzVar2 = zzwzVarArr3[i14];
                    zzwzVar2.getClass();
                    zzwzVarArr2[i14] = zzwzVar2;
                    identityHashMap.put(zzwzVar2, Integer.valueOf(i13));
                    z10 = true;
                } else if (iArr2[i14] == i13) {
                    zzdd.zzf(zzwzVarArr3[i14] == null);
                }
            }
            if (z10) {
                arrayList2.add(zzvfVarArr[i13]);
            }
            i11 = i13 + 1;
            arrayList = arrayList2;
            iArr3 = iArr4;
            i = 0;
        }
        int i15 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzwzVarArr2, i15, zzwzVarArr, i15, length);
        this.zzh = (zzvf[]) arrayList3.toArray(new zzvf[i15]);
        this.zzi = new zzur(arrayList3, zzfyv.zzc(arrayList3, new zzfut() { // from class: com.google.android.gms.internal.ads.zzvt
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return ((zzvf) obj).zzg().zzc();
            }
        }));
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final zzxk zzg() {
        zzxk zzxkVar = this.zzg;
        zzxkVar.getClass();
        return zzxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzh(long j4, boolean z10) {
        for (zzvf zzvfVar : this.zzh) {
            zzvfVar.zzh(j4, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final /* bridge */ /* synthetic */ void zzi(zzxb zzxbVar) {
        zzve zzveVar = this.zzf;
        zzveVar.getClass();
        zzveVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzj() throws IOException {
        int i = 0;
        while (true) {
            zzvf[] zzvfVarArr = this.zza;
            if (i >= zzvfVarArr.length) {
                return;
            }
            zzvfVarArr[i].zzj();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzve
    public final void zzk(zzvf zzvfVar) {
        ArrayList arrayList = this.zzd;
        arrayList.remove(zzvfVar);
        if (arrayList.isEmpty()) {
            zzvf[] zzvfVarArr = this.zza;
            int i = 0;
            for (zzvf zzvfVar2 : zzvfVarArr) {
                i += zzvfVar2.zzg().zzb;
            }
            zzbm[] zzbmVarArr = new zzbm[i];
            int i10 = 0;
            for (int i11 = 0; i11 < zzvfVarArr.length; i11++) {
                zzxk zzxkVarZzg = zzvfVarArr[i11].zzg();
                int i12 = zzxkVarZzg.zzb;
                int i13 = 0;
                while (i13 < i12) {
                    zzbm zzbmVarZzb = zzxkVarZzg.zzb(i13);
                    int i14 = zzbmVarZzb.zza;
                    zzz[] zzzVarArr = new zzz[i14];
                    for (int i15 = 0; i15 < i14; i15++) {
                        zzz zzzVarZzb = zzbmVarZzb.zzb(i15);
                        zzx zzxVarZzb = zzzVarZzb.zzb();
                        String str = zzzVarZzb.zza;
                        if (str == null) {
                            str = "";
                        }
                        zzxVarZzb.zzS(i11 + StringUtils.PROCESS_POSTFIX_DELIMITER + str);
                        zzzVarArr[i15] = zzxVarZzb.zzan();
                    }
                    zzbm zzbmVar = new zzbm(i11 + StringUtils.PROCESS_POSTFIX_DELIMITER + zzbmVarZzb.zzb, zzzVarArr);
                    this.zze.put(zzbmVar, zzbmVarZzb);
                    zzbmVarArr[i10] = zzbmVar;
                    i13++;
                    i10++;
                }
            }
            this.zzg = new zzxk(zzbmVarArr);
            zzve zzveVar = this.zzf;
            zzveVar.getClass();
            zzveVar.zzk(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzl(zzve zzveVar, long j4) {
        this.zzf = zzveVar;
        ArrayList arrayList = this.zzd;
        zzvf[] zzvfVarArr = this.zza;
        Collections.addAll(arrayList, zzvfVarArr);
        for (zzvf zzvfVar : zzvfVarArr) {
            zzvfVar.zzl(this, j4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final void zzm(long j4) {
        this.zzi.zzm(j4);
    }

    public final zzvf zzn(int i) {
        return this.zzb[i] ? ((zzxh) this.zza[i]).zzn() : this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final boolean zzo(zzla zzlaVar) {
        ArrayList arrayList = this.zzd;
        if (arrayList.isEmpty()) {
            return this.zzi.zzo(zzlaVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzvf) arrayList.get(i)).zzo(zzlaVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final boolean zzp() {
        return this.zzi.zzp();
    }
}
