package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzajh implements zzadt, zzaes {
    private long zzA;
    private int zzB;
    private zzahk zzC;
    private final zzakp zza;
    private final int zzb;
    private final zzen zzc;
    private final zzen zzd;
    private final zzen zze;
    private final zzen zzf;
    private final ArrayDeque zzg;
    private final zzajl zzh;
    private final List zzi;
    private zzfyf zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private int zzn;
    private zzen zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private long zzv;
    private zzadw zzw;
    private zzajg[] zzx;
    private long[][] zzy;
    private int zzz;

    @Deprecated
    public zzajh() {
        this(zzakp.zza, 16);
    }

    private static int zzj(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzk(zzajq zzajqVar, long j4) {
        int iZza = zzajqVar.zza(j4);
        return iZza == -1 ? zzajqVar.zzb(j4) : iZza;
    }

    private static long zzl(zzajq zzajqVar, long j4, long j10) {
        int iZzk = zzk(zzajqVar, j4);
        return iZzk == -1 ? j10 : Math.min(zzajqVar.zzc[iZzk], j10);
    }

    private final void zzm() {
        this.zzk = 0;
        this.zzn = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzn(long j4) throws zzaz {
        int i;
        int i10;
        zzav zzavVar;
        int i11;
        ArrayDeque arrayDeque;
        List list;
        zzav[] zzavVarArr;
        long j10;
        zzav zzavVar2;
        ArrayList arrayList;
        int i12;
        int i13 = 0;
        int i14 = 1;
        while (true) {
            ArrayDeque arrayDeque2 = this.zzg;
            if (arrayDeque2.isEmpty() || ((zzfc) arrayDeque2.peek()).zza != j4) {
                break;
            }
            zzfc zzfcVar = (zzfc) arrayDeque2.pop();
            if (zzfcVar.zzd == 1836019574) {
                zzfc zzfcVarZza = zzfcVar.zza(1835365473);
                new ArrayList();
                zzav zzavVarZzb = zzfcVarZza != null ? zzaiv.zzb(zzfcVarZza) : null;
                ArrayList arrayList2 = new ArrayList();
                boolean z10 = this.zzB == i14 ? i14 : i13;
                zzaeh zzaehVar = new zzaeh();
                zzfd zzfdVarZzb = zzfcVar.zzb(1969517665);
                if (zzfdVarZzb != null) {
                    zzav zzavVarZzc = zzaiv.zzc(zzfdVarZzb);
                    zzaehVar.zzb(zzavVarZzc);
                    zzavVar = zzavVarZzc;
                } else {
                    zzavVar = null;
                }
                zzfd zzfdVarZzb2 = zzfcVar.zzb(1836476516);
                zzfdVarZzb2.getClass();
                zzau[] zzauVarArr = new zzau[i14];
                zzauVarArr[i13] = zzaiv.zzd(zzfdVarZzb2.zza);
                zzav zzavVar3 = new zzav(-9223372036854775807L, zzauVarArr);
                int i15 = this.zzb;
                ArrayList arrayList3 = arrayList2;
                List listZzf = zzaiv.zzf(zzfcVar, zzaehVar, -9223372036854775807L, null, i14 != (i15 & 1) ? i13 : i14, z10, new zzfut() { // from class: com.google.android.gms.internal.ads.zzajf
                    @Override // com.google.android.gms.internal.ads.zzfut
                    public final Object apply(Object obj) {
                        return (zzajn) obj;
                    }
                });
                String strZza = zzaje.zza(listZzf);
                long j11 = -9223372036854775807L;
                long j12 = -9223372036854775807L;
                int i16 = i13;
                int i17 = i16;
                int size = -1;
                while (i16 < listZzf.size()) {
                    zzajq zzajqVar = (zzajq) listZzf.get(i16);
                    if (zzajqVar.zzb == 0) {
                        list = listZzf;
                        i11 = i17;
                        arrayList = arrayList3;
                        arrayDeque = arrayDeque2;
                    } else {
                        zzajn zzajnVar = zzajqVar.zza;
                        int i18 = i13;
                        int i19 = i14;
                        zzadw zzadwVar = this.zzw;
                        i11 = i17 + 1;
                        int i20 = zzajnVar.zzb;
                        zzajg zzajgVar = new zzajg(zzajnVar, zzajqVar, zzadwVar.zzw(i17, i20));
                        arrayDeque = arrayDeque2;
                        long j13 = zzajnVar.zze;
                        if (j13 == j12) {
                            j13 = zzajqVar.zzh;
                        }
                        list = listZzf;
                        zzaez zzaezVar = zzajgVar.zzc;
                        zzaezVar.zzl(j13);
                        long jMax = Math.max(j11, j13);
                        zzz zzzVar = zzajnVar.zzg;
                        int i21 = "audio/true-hd".equals(zzzVar.zzo) ? zzajqVar.zze * 16 : zzajqVar.zze + 30;
                        zzx zzxVarZzb = zzzVar.zzb();
                        zzxVarZzb.zzX(i21);
                        if (i20 == 2) {
                            int i22 = zzzVar.zzf;
                            if ((i15 & 8) != 0) {
                                i22 |= size == -1 ? i19 : 2;
                            }
                            zzxVarZzb.zzaf(i22);
                            i20 = 2;
                        }
                        if (i20 == i19 && zzaehVar.zza()) {
                            zzxVarZzb.zzM(zzaehVar.zza);
                            zzxVarZzb.zzN(zzaehVar.zzb);
                        }
                        zzav zzavVar4 = zzzVar.zzl;
                        List list2 = this.zzi;
                        zzav[] zzavVarArr2 = new zzav[3];
                        zzavVarArr2[i18] = list2.isEmpty() ? null : new zzav(list2);
                        zzavVarArr2[1] = zzavVar;
                        zzavVarArr2[2] = zzavVar3;
                        if (zzavVar4 != null) {
                            zzavVarArr = zzavVarArr2;
                            zzavVar2 = zzavVar4;
                            j10 = jMax;
                        } else {
                            zzavVarArr = zzavVarArr2;
                            j10 = jMax;
                            zzavVar2 = new zzav(j12, new zzau[i18]);
                        }
                        if (zzavVarZzb != null) {
                            int i23 = 0;
                            while (i23 < zzavVarZzb.zza()) {
                                zzau zzauVarZzb = zzavVarZzb.zzb(i23);
                                if (zzauVarZzb instanceof zzfa) {
                                    zzfa zzfaVar = (zzfa) zzauVarZzb;
                                    if (!zzfaVar.zza.equals("com.android.capture.fps")) {
                                        i12 = 1;
                                        zzavVar2 = zzavVar2.zzc(zzfaVar);
                                    } else if (i20 == 2) {
                                        i12 = 1;
                                        zzavVar2 = zzavVar2.zzc(zzfaVar);
                                    } else {
                                        i12 = 1;
                                    }
                                } else {
                                    i12 = 1;
                                }
                                i23 += i12;
                            }
                        }
                        for (int i24 = 0; i24 < 3; i24++) {
                            zzavVar2 = zzavVar2.zzd(zzavVarArr[i24]);
                        }
                        if (zzavVar2.zza() > 0) {
                            zzxVarZzb.zzaa(zzavVar2);
                        }
                        zzxVarZzb.zzG(strZza);
                        zzaezVar.zzm(zzxVarZzb.zzan());
                        if (i20 == 2 && size == -1) {
                            size = arrayList3.size();
                        }
                        arrayList = arrayList3;
                        arrayList.add(zzajgVar);
                        j11 = j10;
                    }
                    i16++;
                    arrayList3 = arrayList;
                    arrayDeque2 = arrayDeque;
                    i17 = i11;
                    listZzf = list;
                    i13 = 0;
                    i14 = 1;
                    j12 = -9223372036854775807L;
                }
                ArrayDeque arrayDeque3 = arrayDeque2;
                int i25 = -1;
                this.zzz = size;
                this.zzA = j11;
                zzajg[] zzajgVarArr = (zzajg[]) arrayList3.toArray(new zzajg[0]);
                this.zzx = zzajgVarArr;
                int length = zzajgVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i26 = 0; i26 < zzajgVarArr.length; i26++) {
                    jArr[i26] = new long[zzajgVarArr[i26].zzb.zzb];
                    jArr2[i26] = zzajgVarArr[i26].zzb.zzf[0];
                }
                i = 0;
                long j14 = 0;
                int i27 = 0;
                while (i27 < zzajgVarArr.length) {
                    long j15 = Long.MAX_VALUE;
                    int i28 = i25;
                    for (int i29 = 0; i29 < zzajgVarArr.length; i29++) {
                        if (!zArr[i29]) {
                            long j16 = jArr2[i29];
                            if (j16 <= j15) {
                                i28 = i29;
                                j15 = j16;
                            }
                        }
                    }
                    int i30 = iArr[i28];
                    long[] jArr3 = jArr[i28];
                    jArr3[i30] = j14;
                    zzajq zzajqVar2 = zzajgVarArr[i28].zzb;
                    int[] iArr2 = iArr;
                    j14 += zzajqVar2.zzd[i30];
                    int i31 = i30 + 1;
                    iArr2[i28] = i31;
                    if (i31 < jArr3.length) {
                        jArr2[i28] = zzajqVar2.zzf[i31];
                    } else {
                        zArr[i28] = true;
                        i27++;
                    }
                    iArr = iArr2;
                    i25 = -1;
                }
                i10 = 1;
                this.zzy = jArr;
                this.zzw.zzG();
                this.zzw.zzP(this);
                arrayDeque3.clear();
                this.zzk = 2;
            } else {
                i = i13;
                i10 = i14;
                if (!arrayDeque2.isEmpty()) {
                    ((zzfc) arrayDeque2.peek()).zzc(zzfcVar);
                }
            }
            i13 = i;
            i14 = i10;
        }
        if (this.zzk != 2) {
            zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zza() {
        return this.zzA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01df, code lost:
    
        if (r2 >= r3) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e1, code lost:
    
        r2 = r9.zzf(r38, r3 - r2, false);
        r37.zzq += r2;
        r37.zzr += r2;
        r37.zzs -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f8, code lost:
    
        r16 = r15.zzf[r11];
        r1 = r15.zzg[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0202, code lost:
    
        if (r37.zzt != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0204, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0207, code lost:
    
        if (r14 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0209, code lost:
    
        r15 = r9;
        r14.zzc(r15, r16, r1, r18, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x021e, code lost:
    
        if ((r11 + 1) != r15.zzb) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0220, code lost:
    
        r14.zza(r15, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0225, code lost:
    
        r9.zzt(r16, r1, r18, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        zzm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0233, code lost:
    
        r10.zze++;
        r37.zzp = -1;
        r37.zzq = 0;
        r37.zzr = 0;
        r37.zzs = 0;
        r37.zzt = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0245, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0246, code lost:
    
        r39.zza = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0248, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0249, code lost:
    
        r3 = r37.zzm - r37.zzn;
        r5 = r38.zzf() + r3;
        r7 = r37.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x025c, code lost:
    
        if (r7 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x025e, code lost:
    
        r38.zzi(r7.zzN(), r37.zzn, (int) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x026a, code lost:
    
        if (r37.zzl != 1718909296) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x026c, code lost:
    
        r37.zzu = true;
        r7.zzL(8);
        r3 = zzj(r7.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x027a, code lost:
    
        if (r3 == 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x027d, code lost:
    
        r7.zzM(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0285, code lost:
    
        if (r7.zza() <= 0) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0287, code lost:
    
        r3 = zzj(r7.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x028f, code lost:
    
        if (r3 == 0) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0292, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0293, code lost:
    
        r37.zzB = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0295, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        r7 = r38.zzf();
        r14 = r37.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0297, code lost:
    
        r3 = r37.zzg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x029d, code lost:
    
        if (r3.isEmpty() != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x029f, code lost:
    
        ((com.google.android.gms.internal.ads.zzfc) r3.peek()).zzd(new com.google.android.gms.internal.ads.zzfd(r37.zzl, r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02b2, code lost:
    
        if (r37.zzu != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02b9, code lost:
    
        if (r37.zzl != 1835295092) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02bb, code lost:
    
        r37.zzB = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02c0, code lost:
    
        if (r3 >= 262144) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r14 != (-1)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02c2, code lost:
    
        r38.zzk((int) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02c7, code lost:
    
        r39.zza = r38.zzf() + r3;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02cf, code lost:
    
        zzn(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02d2, code lost:
    
        if (r3 == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02d8, code lost:
    
        if (r37.zzk == 2) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02da, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        r21 = r6;
        r28 = r21;
        r26 = -1;
        r27 = -1;
        r19 = Long.MAX_VALUE;
        r22 = Long.MAX_VALUE;
        r24 = Long.MAX_VALUE;
        r14 = 0;
        r29 = 262144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r15 = r37.zzx;
        r31 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r14 >= r15.length) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        r10 = r15[r14];
        r11 = r10.zze;
        r10 = r10.zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r11 != r10.zzb) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        r15 = r10.zzc[r11];
        r10 = r37.zzy;
        r33 = com.google.android.gms.internal.ads.zzex.zza;
        r33 = r10[r14][r11];
        r15 = r15 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r15 < r31) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r15 < 262144) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        r10 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r10 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (r28 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        r11 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        if (r10 != r11) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (r15 >= r24) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        r28 = r10;
        r27 = r14;
        r24 = r15;
        r22 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        r28 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        if (r33 >= r19) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        r21 = r10;
        r26 = r14;
        r19 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
    
        r14 = r14 + r6;
        r10 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009b, code lost:
    
        if (r19 == Long.MAX_VALUE) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        if (r21 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a6, code lost:
    
        if (r22 < (r19 + 10485760)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a8, code lost:
    
        r14 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
    
        r14 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ad, code lost:
    
        r37.zzp = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00af, code lost:
    
        if (r14 != (-1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b2, code lost:
    
        r31 = 0;
        r29 = 262144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b7, code lost:
    
        r10 = r37.zzx[r14];
        r14 = r10.zzc;
        r11 = r10.zze;
        r15 = r10.zzb;
        r19 = r14;
        r13 = r15.zzc[r11] + r37.zzv;
        r12 = r15.zzd;
        r17 = r12[r11];
        r23 = false;
        r14 = r10.zzd;
        r20 = 4;
        r7 = (r13 - r7) + r37.zzq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e0, code lost:
    
        if (r7 < r31) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e4, code lost:
    
        if (r7 < r29) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ea, code lost:
    
        r2 = r10.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ef, code lost:
    
        if (r2.zzh != 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f1, code lost:
    
        r7 = r7 + 8;
        r17 = r17 - 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f6, code lost:
    
        r3 = r17;
        r38.zzk((int) r7);
        r4 = r2.zzg;
        r5 = r4.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0106, code lost:
    
        if (java.util.Objects.equals(r5, "video/avc") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0108, code lost:
    
        java.util.Objects.equals(r5, "video/hevc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010d, code lost:
    
        r37.zzt = true;
        r2 = r2.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0112, code lost:
    
        if (r2 == 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0114, code lost:
    
        r5 = r37.zzd;
        r7 = r5.zzN();
        r7[0] = 0;
        r7[1] = 0;
        r7[2] = 0;
        r6 = 4 - r2;
        r3 = r3 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0125, code lost:
    
        if (r37.zzr >= r3) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0127, code lost:
    
        r8 = r37.zzs;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0129, code lost:
    
        if (r8 != 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012d, code lost:
    
        if (r37.zzt != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r7 == r6) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0139, code lost:
    
        if ((com.google.android.gms.internal.ads.zzfv.zzb(r4) + r2) > (r12[r11] - r37.zzq)) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013b, code lost:
    
        r8 = com.google.android.gms.internal.ads.zzfv.zzb(r4);
        r9 = r2 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0142, code lost:
    
        r9 = r2;
        r8 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0145, code lost:
    
        r38.zzi(r7, r6, r9);
        r37.zzq += r9;
        r9 = r23;
        r5.zzL(r9);
        r13 = r5.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0156, code lost:
    
        if (r13 < 0) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0158, code lost:
    
        r37.zzs = r13 - r8;
        r13 = r37.zzc;
        r13.zzL(r9);
        r17 = r2;
        r9 = r19;
        r2 = r20;
        r9.zzr(r13, r2);
        r37.zzr += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016e, code lost:
    
        if (r8 <= 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0170, code lost:
    
        r9.zzr(r5, r8);
        r37.zzr += r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017c, code lost:
    
        if (com.google.android.gms.internal.ads.zzfv.zzj(r7, r2, r8, r4) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r7 == 2) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017e, code lost:
    
        r37.zzt = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0181, code lost:
    
        r19 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0183, code lost:
    
        r2 = r17;
        r20 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0187, code lost:
    
        r23 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018a, code lost:
    
        r20 = r2;
        r19 = r9;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0198, code lost:
    
        throw com.google.android.gms.internal.ads.zzaz.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0199, code lost:
    
        r17 = r2;
        r8 = r19.zzf(r38, r8, r23);
        r37.zzq += r8;
        r37.zzr += r8;
        r37.zzs -= r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b3, code lost:
    
        r9 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b5, code lost:
    
        r18 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r37.zzh.zza(r38, r39, r37.zzi);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b8, code lost:
    
        r9 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c0, code lost:
    
        if ("audio/ac4".equals(r5) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c4, code lost:
    
        if (r37.zzr != 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c6, code lost:
    
        r2 = r37.zze;
        com.google.android.gms.internal.ads.zzacx.zzc(r3, r2);
        r13 = 7;
        r9.zzr(r2, 7);
        r37.zzr += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d5, code lost:
    
        r13 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d6, code lost:
    
        r3 = r3 + r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d8, code lost:
    
        if (r14 == null) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01da, code lost:
    
        r14.zzd(r38);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01dd, code lost:
    
        r2 = r37.zzr;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r39.zza != 0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.google.android.gms.internal.ads.zzadt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadu r38, com.google.android.gms.internal.ads.zzaep r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajh.zzb(com.google.android.gms.internal.ads.zzadu, com.google.android.gms.internal.ads.zzaep):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ List zzd() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zze(zzadw zzadwVar) {
        if ((this.zzb & 16) == 0) {
            zzadwVar = new zzaks(zzadwVar, this.zza);
        }
        this.zzw = zzadwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzf(long j4, long j10) {
        this.zzg.clear();
        this.zzn = 0;
        this.zzp = -1;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = false;
        if (j4 == 0) {
            if (this.zzk != 3) {
                zzm();
                return;
            } else {
                this.zzh.zzb();
                this.zzi.clear();
                return;
            }
        }
        for (zzajg zzajgVar : this.zzx) {
            zzajq zzajqVar = zzajgVar.zzb;
            int iZza = zzajqVar.zza(j10);
            if (iZza == -1) {
                iZza = zzajqVar.zzb(j10);
            }
            zzajgVar.zze = iZza;
            zzafa zzafaVar = zzajgVar.zzd;
            if (zzafaVar != null) {
                zzafaVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j4) {
        long j10;
        long j11;
        long jZzl;
        long j12;
        int iZzb;
        long j13 = j4;
        zzajg[] zzajgVarArr = this.zzx;
        if (zzajgVarArr.length == 0) {
            zzaet zzaetVar = zzaet.zza;
            return new zzaeq(zzaetVar, zzaetVar);
        }
        int i = this.zzz;
        if (i != -1) {
            zzajq zzajqVar = zzajgVarArr[i].zzb;
            int iZzk = zzk(zzajqVar, j13);
            if (iZzk == -1) {
                zzaet zzaetVar2 = zzaet.zza;
                return new zzaeq(zzaetVar2, zzaetVar2);
            }
            long[] jArr = zzajqVar.zzf;
            long j14 = jArr[iZzk];
            long[] jArr2 = zzajqVar.zzc;
            j10 = jArr2[iZzk];
            if (j14 >= j13 || iZzk >= zzajqVar.zzb - 1 || (iZzb = zzajqVar.zzb(j13)) == -1 || iZzb == iZzk) {
                j12 = -9223372036854775807L;
                jZzl = -1;
            } else {
                j12 = jArr[iZzb];
                jZzl = jArr2[iZzb];
            }
            j11 = j12;
            j13 = j14;
        } else {
            j10 = Long.MAX_VALUE;
            j11 = -9223372036854775807L;
            jZzl = -1;
        }
        int i10 = 0;
        while (true) {
            zzajg[] zzajgVarArr2 = this.zzx;
            if (i10 >= zzajgVarArr2.length) {
                break;
            }
            if (i10 != this.zzz) {
                zzajq zzajqVar2 = zzajgVarArr2[i10].zzb;
                long jZzl2 = zzl(zzajqVar2, j13, j10);
                if (j11 != -9223372036854775807L) {
                    jZzl = zzl(zzajqVar2, j11, jZzl);
                }
                j10 = jZzl2;
            }
            i10++;
        }
        zzaet zzaetVar3 = new zzaet(j13, j10);
        return j11 == -9223372036854775807L ? new zzaeq(zzaetVar3, zzaetVar3) : new zzaeq(zzaetVar3, new zzaet(j11, jZzl));
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzh() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final boolean zzi(zzadu zzaduVar) throws IOException {
        zzaew zzaewVarZzb = zzajm.zzb(zzaduVar, (this.zzb & 2) != 0);
        this.zzj = zzaewVarZzb != null ? zzfyf.zzo(zzaewVarZzb) : zzfyf.zzn();
        return zzaewVarZzb == null;
    }

    public zzajh(zzakp zzakpVar, int i) {
        this.zza = zzakpVar;
        this.zzb = i;
        this.zzj = zzfyf.zzn();
        this.zzk = (i & 4) != 0 ? 3 : 0;
        this.zzh = new zzajl();
        this.zzi = new ArrayList();
        this.zzf = new zzen(16);
        this.zzg = new ArrayDeque();
        this.zzc = new zzen(zzfv.zza);
        this.zzd = new zzen(6);
        this.zze = new zzen();
        this.zzp = -1;
        this.zzw = zzadw.zza;
        this.zzx = new zzajg[0];
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ zzadt zzc() {
        return this;
    }
}
