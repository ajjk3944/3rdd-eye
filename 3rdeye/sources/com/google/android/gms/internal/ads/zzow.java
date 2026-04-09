package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzow implements zzpf {
    public static final zzfvw zza = new zzfvw() { // from class: com.google.android.gms.internal.ads.zzou
        @Override // com.google.android.gms.internal.ads.zzfvw
        public final Object zza() {
            return zzow.zzn();
        }
    };
    private static final Random zzb = new Random();
    private final zzbk zzc;
    private final zzbj zzd;
    private final HashMap zze;
    private zzpe zzf;
    private zzbl zzg;
    private String zzh;
    private long zzi;

    public zzow() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzl() {
        zzov zzovVar = (zzov) this.zze.get(this.zzh);
        return (zzovVar == null || zzovVar.zzd == -1) ? this.zzi + 1 : zzovVar.zzd;
    }

    private final zzov zzm(int i, zzvh zzvhVar) {
        HashMap map = this.zze;
        long j4 = Long.MAX_VALUE;
        zzov zzovVar = null;
        for (zzov zzovVar2 : map.values()) {
            zzovVar2.zzg(i, zzvhVar);
            if (zzovVar2.zzj(i, zzvhVar)) {
                long j10 = zzovVar2.zzd;
                if (j10 == -1 || j10 < j4) {
                    zzovVar = zzovVar2;
                    j4 = j10;
                } else if (j10 == j4) {
                    String str = zzex.zza;
                    if (zzovVar.zze != null && zzovVar2.zze != null) {
                        zzovVar = zzovVar2;
                    }
                }
            }
        }
        if (zzovVar != null) {
            return zzovVar;
        }
        String strZzn = zzn();
        zzov zzovVar3 = new zzov(this, strZzn, i, zzvhVar);
        map.put(strZzn, zzovVar3);
        return zzovVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzn() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzo(zzov zzovVar) {
        if (zzovVar.zzd != -1) {
            this.zzi = zzovVar.zzd;
        }
        this.zzh = null;
    }

    private final void zzp(zzmp zzmpVar) {
        if (zzmpVar.zzb.zzo()) {
            String str = this.zzh;
            if (str != null) {
                zzov zzovVar = (zzov) this.zze.get(str);
                zzovVar.getClass();
                zzo(zzovVar);
                return;
            }
            return;
        }
        zzov zzovVar2 = (zzov) this.zze.get(this.zzh);
        int i = zzmpVar.zzc;
        zzvh zzvhVar = zzmpVar.zzd;
        zzov zzovVarZzm = zzm(i, zzvhVar);
        this.zzh = zzovVarZzm.zzb;
        zzi(zzmpVar);
        if (zzvhVar == null || !zzvhVar.zzb()) {
            return;
        }
        if (zzovVar2 != null) {
            if (zzovVar2.zzd == zzvhVar.zzd && zzovVar2.zze != null && zzovVar2.zze.zzb == zzvhVar.zzb && zzovVar2.zze.zzc == zzvhVar.zzc) {
                return;
            }
        }
        String unused = zzm(i, new zzvh(zzvhVar.zza, zzvhVar.zzd)).zzb;
        String unused2 = zzovVarZzm.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final synchronized String zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final synchronized String zzf(zzbl zzblVar, zzvh zzvhVar) {
        return zzm(zzblVar.zzn(zzvhVar.zza, this.zzd).zzc, zzvhVar).zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final synchronized void zzg(zzmp zzmpVar) {
        zzpe zzpeVar;
        try {
            String str = this.zzh;
            if (str != null) {
                zzov zzovVar = (zzov) this.zze.get(str);
                if (zzovVar == null) {
                    throw null;
                }
                zzo(zzovVar);
            }
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzov zzovVar2 = (zzov) it.next();
                it.remove();
                if (zzovVar2.zzf && (zzpeVar = this.zzf) != null) {
                    zzpeVar.zzv(zzmpVar, zzovVar2.zzb, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzh(zzpe zzpeVar) {
        this.zzf = zzpeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003f, B:23:0x0049, B:26:0x0052, B:28:0x0058, B:30:0x006d, B:31:0x0089, B:33:0x008f, B:34:0x0095, B:36:0x00a1, B:38:0x00a7, B:44:0x00b8), top: B:47:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzi(com.google.android.gms.internal.ads.zzmp r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzpe r0 = r9.zzf     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto Lb7
            com.google.android.gms.internal.ads.zzbl r0 = r10.zzb     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r0.zzo()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto Lf
            goto Lb5
        Lf:
            com.google.android.gms.internal.ads.zzvh r1 = r10.zzd     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L3f
            long r2 = r9.zzl()     // Catch: java.lang.Throwable -> L3c
            long r4 = r1.zzd     // Catch: java.lang.Throwable -> L3c
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto Lb5
            java.util.HashMap r2 = r9.zze     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = r9.zzh     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzov r2 = (com.google.android.gms.internal.ads.zzov) r2     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L3f
            long r3 = com.google.android.gms.internal.ads.zzov.zzb(r2)     // Catch: java.lang.Throwable -> L3c
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L3f
            int r2 = com.google.android.gms.internal.ads.zzov.zza(r2)     // Catch: java.lang.Throwable -> L3c
            int r3 = r10.zzc     // Catch: java.lang.Throwable -> L3c
            if (r2 != r3) goto Lb5
            goto L3f
        L3c:
            r10 = move-exception
            goto Lb9
        L3f:
            int r2 = r10.zzc     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzov r3 = r9.zzm(r2, r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = r9.zzh     // Catch: java.lang.Throwable -> L3c
            if (r4 != 0) goto L4f
            java.lang.String r4 = com.google.android.gms.internal.ads.zzov.zzd(r3)     // Catch: java.lang.Throwable -> L3c
            r9.zzh = r4     // Catch: java.lang.Throwable -> L3c
        L4f:
            r4 = 1
            if (r1 == 0) goto L89
            boolean r5 = r1.zzb()     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L89
            java.lang.Object r5 = r1.zza     // Catch: java.lang.Throwable -> L3c
            long r6 = r1.zzd     // Catch: java.lang.Throwable -> L3c
            int r1 = r1.zzb     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzvh r8 = new com.google.android.gms.internal.ads.zzvh     // Catch: java.lang.Throwable -> L3c
            r8.<init>(r5, r6, r1)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzov r2 = r9.zzm(r2, r8)     // Catch: java.lang.Throwable -> L3c
            boolean r6 = com.google.android.gms.internal.ads.zzov.zzi(r2)     // Catch: java.lang.Throwable -> L3c
            if (r6 != 0) goto L89
            com.google.android.gms.internal.ads.zzov.zzf(r2, r4)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzbj r6 = r9.zzd     // Catch: java.lang.Throwable -> L3c
            r0.zzn(r5, r6)     // Catch: java.lang.Throwable -> L3c
            r6.zzg(r1)     // Catch: java.lang.Throwable -> L3c
            r0 = 0
            long r5 = com.google.android.gms.internal.ads.zzex.zzv(r0)     // Catch: java.lang.Throwable -> L3c
            long r7 = com.google.android.gms.internal.ads.zzex.zzv(r0)     // Catch: java.lang.Throwable -> L3c
            long r5 = r5 + r7
            java.lang.Math.max(r0, r5)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzov.zzd(r2)     // Catch: java.lang.Throwable -> L3c
        L89:
            boolean r0 = com.google.android.gms.internal.ads.zzov.zzi(r3)     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L95
            com.google.android.gms.internal.ads.zzov.zzf(r3, r4)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzov.zzd(r3)     // Catch: java.lang.Throwable -> L3c
        L95:
            java.lang.String r0 = com.google.android.gms.internal.ads.zzov.zzd(r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = r9.zzh     // Catch: java.lang.Throwable -> L3c
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto Lb5
            boolean r0 = com.google.android.gms.internal.ads.zzov.zzh(r3)     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto Lb5
            com.google.android.gms.internal.ads.zzov.zze(r3, r4)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzpe r0 = r9.zzf     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = com.google.android.gms.internal.ads.zzov.zzd(r3)     // Catch: java.lang.Throwable -> L3c
            r0.zzu(r10, r1)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r9)
            return
        Lb5:
            monitor-exit(r9)
            return
        Lb7:
            r10 = 0
            throw r10     // Catch: java.lang.Throwable -> L3c
        Lb9:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3c
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzow.zzi(com.google.android.gms.internal.ads.zzmp):void");
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final synchronized void zzj(zzmp zzmpVar, int i) {
        try {
            if (this.zzf == null) {
                throw null;
            }
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzov zzovVar = (zzov) it.next();
                if (zzovVar.zzk(zzmpVar)) {
                    it.remove();
                    if (zzovVar.zzf) {
                        boolean zEquals = zzovVar.zzb.equals(this.zzh);
                        boolean z10 = false;
                        if (i == 0 && zEquals && zzovVar.zzg) {
                            z10 = true;
                        }
                        if (zEquals) {
                            zzo(zzovVar);
                        }
                        this.zzf.zzv(zzmpVar, zzovVar.zzb, z10);
                    }
                }
            }
            zzp(zzmpVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final synchronized void zzk(zzmp zzmpVar) {
        try {
            if (this.zzf == null) {
                throw null;
            }
            zzbl zzblVar = this.zzg;
            this.zzg = zzmpVar.zzb;
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzov zzovVar = (zzov) it.next();
                if (!zzovVar.zzl(zzblVar, this.zzg) || zzovVar.zzk(zzmpVar)) {
                    it.remove();
                    if (zzovVar.zzf) {
                        if (zzovVar.zzb.equals(this.zzh)) {
                            zzo(zzovVar);
                        }
                        this.zzf.zzv(zzmpVar, zzovVar.zzb, false);
                    }
                }
            }
            zzp(zzmpVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public zzow(zzfvw zzfvwVar) {
        this.zzc = new zzbk();
        this.zzd = new zzbj();
        this.zze = new HashMap();
        this.zzg = zzbl.zza;
        this.zzi = -1L;
    }
}
