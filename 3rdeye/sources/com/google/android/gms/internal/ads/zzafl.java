package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzafl implements zzadt {
    private final zzen zza;
    private final zzafj zzb;
    private final boolean zzc;
    private final zzakp zzd;
    private int zze;
    private zzadw zzf;
    private zzafm zzg;
    private long zzh;
    private zzafo[] zzi;
    private long zzj;
    private zzafo zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzafl() {
        this(1, zzakp.zza);
    }

    private final zzafo zzg(int i) {
        for (zzafo zzafoVar : this.zzi) {
            if (zzafoVar.zzf(i)) {
                return zzafoVar;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3, types: [int] */
    /* JADX WARN: Type inference failed for: r20v4 */
    @Override // com.google.android.gms.internal.ads.zzadt
    public final int zzb(zzadu zzaduVar, zzaep zzaepVar) throws IOException {
        boolean z10;
        ?? r20;
        long j4;
        long j10 = this.zzj;
        if (j10 != -1) {
            long jZzf = zzaduVar.zzf();
            if (j10 < jZzf || j10 > 262144 + jZzf) {
                zzaepVar.zza = j10;
                z10 = true;
            } else {
                zzaduVar.zzk((int) (j10 - jZzf));
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.zzj = -1L;
        if (z10) {
            return 1;
        }
        int i = this.zze;
        zzafo zzafoVar = null;
        if (i == 0) {
            if (!zzi(zzaduVar)) {
                throw zzaz.zza("AVI Header List not found", null);
            }
            zzaduVar.zzk(12);
            this.zze = 1;
            return 0;
        }
        if (i == 1) {
            zzen zzenVar = this.zza;
            zzaduVar.zzi(zzenVar.zzN(), 0, 12);
            zzenVar.zzL(0);
            zzafj zzafjVar = this.zzb;
            zzafjVar.zza(zzenVar);
            int i10 = zzafjVar.zza;
            if (i10 != 1414744396) {
                throw zzaz.zza("LIST expected, found: " + i10, null);
            }
            int iZzi = zzenVar.zzi();
            if (iZzi == 1819436136) {
                this.zzl = zzafjVar.zzb;
                this.zze = 2;
                return 0;
            }
            throw zzaz.zza("hdrl expected, found: " + iZzi, null);
        }
        if (i == 2) {
            int i11 = this.zzl - 4;
            zzen zzenVar2 = new zzen(i11);
            zzaduVar.zzi(zzenVar2.zzN(), 0, i11);
            zzafp zzafpVarZzc = zzafp.zzc(1819436136, zzenVar2);
            if (zzafpVarZzc.zza() != 1819436136) {
                throw zzaz.zza("Unexpected header list type " + zzafpVarZzc.zza(), null);
            }
            zzafm zzafmVar = (zzafm) zzafpVarZzc.zzb(zzafm.class);
            if (zzafmVar == null) {
                throw zzaz.zza("AviHeader not found", null);
            }
            this.zzg = zzafmVar;
            this.zzh = zzafmVar.zzc * zzafmVar.zza;
            ArrayList arrayList = new ArrayList();
            zzfyf zzfyfVar = zzafpVarZzc.zza;
            int size = zzfyfVar.size();
            int i12 = 0;
            int i13 = 0;
            while (i12 < size) {
                zzafh zzafhVar = (zzafh) zzfyfVar.get(i12);
                if (zzafhVar.zza() == 1819440243) {
                    zzafp zzafpVar = (zzafp) zzafhVar;
                    int i14 = i13 + 1;
                    zzafn zzafnVar = (zzafn) zzafpVar.zzb(zzafn.class);
                    zzafq zzafqVar = (zzafq) zzafpVar.zzb(zzafq.class);
                    if (zzafnVar == null) {
                        zzea.zzf("AviExtractor", "Missing Stream Header");
                    } else if (zzafqVar == null) {
                        zzea.zzf("AviExtractor", "Missing Stream Format");
                    } else {
                        long jZzc = zzafnVar.zzc();
                        zzz zzzVar = zzafqVar.zza;
                        zzx zzxVarZzb = zzzVar.zzb();
                        zzxVarZzb.zzR(i13);
                        int i15 = zzafnVar.zze;
                        if (i15 != 0) {
                            zzxVarZzb.zzX(i15);
                        }
                        zzafr zzafrVar = (zzafr) zzafpVar.zzb(zzafr.class);
                        if (zzafrVar != null) {
                            zzxVarZzb.zzU(zzafrVar.zza);
                        }
                        int iZzb = zzay.zzb(zzzVar.zzo);
                        if (iZzb == 1) {
                            zzaez zzaezVarZzw = this.zzf.zzw(i13, iZzb);
                            zzaezVarZzw.zzm(zzxVarZzb.zzan());
                            zzaezVarZzw.zzl(jZzc);
                            this.zzh = Math.max(this.zzh, jZzc);
                            zzafoVar = new zzafo(i13, zzafnVar, zzaezVarZzw);
                        } else if (iZzb == 2) {
                            iZzb = 2;
                            zzaez zzaezVarZzw2 = this.zzf.zzw(i13, iZzb);
                            zzaezVarZzw2.zzm(zzxVarZzb.zzan());
                            zzaezVarZzw2.zzl(jZzc);
                            this.zzh = Math.max(this.zzh, jZzc);
                            zzafoVar = new zzafo(i13, zzafnVar, zzaezVarZzw2);
                        } else {
                            zzafoVar = null;
                        }
                    }
                    if (zzafoVar != null) {
                        arrayList.add(zzafoVar);
                    }
                    i13 = i14;
                }
                i12++;
                zzafoVar = null;
            }
            this.zzi = (zzafo[]) arrayList.toArray(new zzafo[0]);
            this.zzf.zzG();
            this.zze = 3;
            return 0;
        }
        if (i == 3) {
            long j11 = this.zzm;
            if (j11 != -1 && zzaduVar.zzf() != j11) {
                this.zzj = j11;
                return 0;
            }
            zzen zzenVar3 = this.zza;
            zzaduVar.zzh(zzenVar3.zzN(), 0, 12);
            zzaduVar.zzj();
            zzenVar3.zzL(0);
            zzafj zzafjVar2 = this.zzb;
            zzafjVar2.zza(zzenVar3);
            int iZzi2 = zzenVar3.zzi();
            int i16 = zzafjVar2.zza;
            if (i16 == 1179011410) {
                zzaduVar.zzk(12);
                return 0;
            }
            if (i16 != 1414744396 || iZzi2 != 1769369453) {
                this.zzj = zzaduVar.zzf() + zzafjVar2.zzb + 8;
                return 0;
            }
            long jZzf2 = zzaduVar.zzf();
            this.zzm = jZzf2;
            long j12 = jZzf2 + zzafjVar2.zzb + 8;
            this.zzn = j12;
            if (!this.zzp) {
                zzafm zzafmVar2 = this.zzg;
                zzafmVar2.getClass();
                if ((zzafmVar2.zzb & 16) == 16) {
                    this.zze = 4;
                    this.zzj = j12;
                    return 0;
                }
                this.zzf.zzP(new zzaer(this.zzh, 0L));
                this.zzp = true;
            }
            this.zzj = zzaduVar.zzf() + 12;
            this.zze = 6;
            return 0;
        }
        if (i == 4) {
            zzen zzenVar4 = this.zza;
            zzaduVar.zzi(zzenVar4.zzN(), 0, 8);
            zzenVar4.zzL(0);
            int iZzi3 = zzenVar4.zzi();
            int iZzi4 = zzenVar4.zzi();
            if (iZzi3 != 829973609) {
                this.zzj = zzaduVar.zzf() + iZzi4;
                return 0;
            }
            this.zze = 5;
            this.zzo = iZzi4;
            return 0;
        }
        if (i != 5) {
            if (zzaduVar.zzf() >= this.zzn) {
                return -1;
            }
            zzafo zzafoVar2 = this.zzk;
            if (zzafoVar2 != null) {
                if (!zzafoVar2.zzg(zzaduVar)) {
                    return 0;
                }
                this.zzk = null;
                return 0;
            }
            if ((zzaduVar.zzf() & 1) == 1) {
                zzaduVar.zzk(1);
            }
            zzen zzenVar5 = this.zza;
            zzaduVar.zzh(zzenVar5.zzN(), 0, 12);
            zzenVar5.zzL(0);
            int iZzi5 = zzenVar5.zzi();
            if (iZzi5 == 1414744396) {
                zzenVar5.zzL(8);
                zzaduVar.zzk(zzenVar5.zzi() != 1769369453 ? 8 : 12);
                zzaduVar.zzj();
                return 0;
            }
            int iZzi6 = zzenVar5.zzi();
            if (iZzi5 == 1263424842) {
                this.zzj = zzaduVar.zzf() + iZzi6 + 8;
                return 0;
            }
            zzaduVar.zzk(8);
            zzaduVar.zzj();
            zzafo zzafoVarZzg = zzg(iZzi5);
            if (zzafoVarZzg == null) {
                this.zzj = zzaduVar.zzf() + iZzi6;
                return 0;
            }
            zzafoVarZzg.zzd(iZzi6);
            this.zzk = zzafoVarZzg;
            return 0;
        }
        zzen zzenVar6 = new zzen(this.zzo);
        zzaduVar.zzi(zzenVar6.zzN(), 0, this.zzo);
        if (zzenVar6.zza() < 16) {
            r20 = 0;
            j4 = 0;
        } else {
            int iZzc = zzenVar6.zzc();
            zzenVar6.zzM(8);
            long jZzi = zzenVar6.zzi();
            r20 = 0;
            long j13 = this.zzm;
            j4 = jZzi > j13 ? 0L : j13 + 8;
            zzenVar6.zzL(iZzc);
        }
        while (zzenVar6.zza() >= 16) {
            int iZzi7 = zzenVar6.zzi();
            int iZzi8 = zzenVar6.zzi();
            long jZzi2 = zzenVar6.zzi() + j4;
            zzenVar6.zzM(4);
            zzafo zzafoVarZzg2 = zzg(iZzi7);
            if (zzafoVarZzg2 != null) {
                zzafoVarZzg2.zzb(jZzi2, (iZzi8 & 16) == 16 ? true : r20);
            }
        }
        zzafo[] zzafoVarArr = this.zzi;
        int length = zzafoVarArr.length;
        for (int i17 = r20; i17 < length; i17++) {
            zzafoVarArr[i17].zzc();
        }
        this.zzp = true;
        if (this.zzi.length == 0) {
            this.zzf.zzP(new zzaer(this.zzh, 0L));
        } else {
            this.zzf.zzP(new zzafi(this, this.zzh));
        }
        this.zze = 6;
        this.zzj = this.zzm;
        return r20;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ List zzd() {
        return zzfyf.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zze(zzadw zzadwVar) {
        this.zze = 0;
        if (this.zzc) {
            zzadwVar = new zzaks(zzadwVar, this.zzd);
        }
        this.zzf = zzadwVar;
        this.zzj = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzf(long j4, long j10) {
        this.zzj = -1L;
        this.zzk = null;
        for (zzafo zzafoVar : this.zzi) {
            zzafoVar.zze(j4);
        }
        if (j4 == 0) {
            this.zze = this.zzi.length != 0 ? 3 : 0;
        } else {
            this.zze = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final boolean zzi(zzadu zzaduVar) throws IOException {
        zzen zzenVar = this.zza;
        zzaduVar.zzh(zzenVar.zzN(), 0, 12);
        zzenVar.zzL(0);
        if (zzenVar.zzi() != 1179011410) {
            return false;
        }
        zzenVar.zzM(4);
        return zzenVar.zzi() == 541677121;
    }

    public zzafl(int i, zzakp zzakpVar) {
        this.zzd = zzakpVar;
        this.zzc = 1 == (i ^ 1);
        this.zza = new zzen(12);
        this.zzb = new zzafj(null);
        this.zzf = new zzaen();
        this.zzi = new zzafo[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ zzadt zzc() {
        return this;
    }
}
