package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzafg implements zzadt {
    private static final int[] zza = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzb = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private final byte[] zze;
    private final zzaez zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private zzadw zzn;
    private zzaez zzo;
    private zzaez zzp;
    private zzaes zzq;
    private long zzr;
    private boolean zzs;

    static {
        String str = zzex.zza;
        Charset charset = StandardCharsets.UTF_8;
        zzc = "#!AMR\n".getBytes(charset);
        zzd = "#!AMR-WB\n".getBytes(charset);
    }

    public zzafg() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039 A[Catch: EOFException -> 0x00ac, TryCatch #0 {EOFException -> 0x00ac, blocks: (B:5:0x000c, B:7:0x001b, B:21:0x0039, B:24:0x0044, B:23:0x003f, B:41:0x0082, B:42:0x009a, B:43:0x009b, B:44:0x00ab), top: B:46:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f A[Catch: EOFException -> 0x00ac, TryCatch #0 {EOFException -> 0x00ac, blocks: (B:5:0x000c, B:7:0x001b, B:21:0x0039, B:24:0x0044, B:23:0x003f, B:41:0x0082, B:42:0x009a, B:43:0x009b, B:44:0x00ab), top: B:46:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zza(com.google.android.gms.internal.ads.zzadu r14) throws java.io.IOException {
        /*
            r13 = this;
            java.lang.String r0 = "Illegal AMR "
            java.lang.String r1 = "Invalid padding bits for frame header "
            int r2 = r13.zzj
            r3 = -1
            r4 = 1
            r5 = 0
            if (r2 == 0) goto Lc
            goto L56
        Lc:
            r14.zzj()     // Catch: java.io.EOFException -> Lac
            byte[] r2 = r13.zze     // Catch: java.io.EOFException -> Lac
            r14.zzh(r2, r5, r4)     // Catch: java.io.EOFException -> Lac
            r2 = r2[r5]     // Catch: java.io.EOFException -> Lac
            r6 = r2 & 131(0x83, float:1.84E-43)
            r7 = 0
            if (r6 > 0) goto L9b
            int r1 = r2 >> 3
            boolean r2 = r13.zzg     // Catch: java.io.EOFException -> Lac
            r1 = r1 & 15
            if (r2 == 0) goto L2c
            r6 = 10
            if (r1 < r6) goto L37
            r6 = 13
            if (r1 <= r6) goto L2c
            goto L37
        L2c:
            if (r2 != 0) goto L7b
            r6 = 12
            if (r1 < r6) goto L37
            r6 = 14
            if (r1 > r6) goto L37
            goto L7b
        L37:
            if (r2 == 0) goto L3f
            int[] r0 = com.google.android.gms.internal.ads.zzafg.zzb     // Catch: java.io.EOFException -> Lac
            r0 = r0[r1]     // Catch: java.io.EOFException -> Lac
        L3d:
            r2 = r0
            goto L44
        L3f:
            int[] r0 = com.google.android.gms.internal.ads.zzafg.zza     // Catch: java.io.EOFException -> Lac
            r0 = r0[r1]     // Catch: java.io.EOFException -> Lac
            goto L3d
        L44:
            r13.zzi = r2     // Catch: java.io.EOFException -> Lac
            r13.zzj = r2
            int r0 = r13.zzk
            if (r0 != r3) goto L4f
            r13.zzk = r2
            r0 = r2
        L4f:
            if (r0 != r2) goto L56
            int r0 = r13.zzl
            int r0 = r0 + r4
            r13.zzl = r0
        L56:
            com.google.android.gms.internal.ads.zzaez r0 = r13.zzp
            int r14 = r0.zzf(r14, r2, r4)
            if (r14 != r3) goto L5f
            return r3
        L5f:
            int r0 = r13.zzj
            int r0 = r0 - r14
            r13.zzj = r0
            if (r0 <= 0) goto L67
            return r5
        L67:
            com.google.android.gms.internal.ads.zzaez r6 = r13.zzp
            long r7 = r13.zzh
            int r10 = r13.zzi
            r11 = 0
            r12 = 0
            r9 = 1
            r6.zzt(r7, r9, r10, r11, r12)
            long r0 = r13.zzh
            r2 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r2
            r13.zzh = r0
            return r5
        L7b:
            java.lang.String r14 = "WB"
            java.lang.String r5 = "NB"
            if (r4 == r2) goto L82
            r14 = r5
        L82:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lac
            r2.<init>(r0)     // Catch: java.io.EOFException -> Lac
            r2.append(r14)     // Catch: java.io.EOFException -> Lac
            java.lang.String r14 = " frame type "
            r2.append(r14)     // Catch: java.io.EOFException -> Lac
            r2.append(r1)     // Catch: java.io.EOFException -> Lac
            java.lang.String r14 = r2.toString()     // Catch: java.io.EOFException -> Lac
            com.google.android.gms.internal.ads.zzaz r14 = com.google.android.gms.internal.ads.zzaz.zza(r14, r7)     // Catch: java.io.EOFException -> Lac
            throw r14     // Catch: java.io.EOFException -> Lac
        L9b:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lac
            r14.<init>(r1)     // Catch: java.io.EOFException -> Lac
            r14.append(r2)     // Catch: java.io.EOFException -> Lac
            java.lang.String r14 = r14.toString()     // Catch: java.io.EOFException -> Lac
            com.google.android.gms.internal.ads.zzaz r14 = com.google.android.gms.internal.ads.zzaz.zza(r14, r7)     // Catch: java.io.EOFException -> Lac
            throw r14     // Catch: java.io.EOFException -> Lac
        Lac:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafg.zza(com.google.android.gms.internal.ads.zzadu):int");
    }

    private static boolean zzg(zzadu zzaduVar, byte[] bArr) throws IOException {
        zzaduVar.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzaduVar.zzh(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzh(zzadu zzaduVar) throws IOException {
        byte[] bArr = zzc;
        if (zzg(zzaduVar, bArr)) {
            this.zzg = false;
            zzaduVar.zzk(bArr.length);
            return true;
        }
        byte[] bArr2 = zzd;
        if (!zzg(zzaduVar, bArr2)) {
            return false;
        }
        this.zzg = true;
        zzaduVar.zzk(bArr2.length);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final int zzb(zzadu zzaduVar, zzaep zzaepVar) throws IOException {
        zzdd.zzb(this.zzo);
        String str = zzex.zza;
        if (zzaduVar.zzf() == 0 && !zzh(zzaduVar)) {
            throw zzaz.zza("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z10 = this.zzg;
            String str2 = true != z10 ? "audio/amr" : "audio/amr-wb";
            String str3 = true != z10 ? "audio/3gpp" : "audio/amr-wb";
            int i = true != z10 ? 8000 : 16000;
            int i10 = z10 ? zzb[8] : zza[7];
            zzaez zzaezVar = this.zzo;
            zzx zzxVar = new zzx();
            zzxVar.zzG(str2);
            zzxVar.zzah(str3);
            zzxVar.zzX(i10);
            zzxVar.zzD(1);
            zzxVar.zzai(i);
            zzaezVar.zzm(zzxVar.zzan());
        }
        int iZza = zza(zzaduVar);
        if (this.zzq == null) {
            zzaer zzaerVar = new zzaer(-9223372036854775807L, 0L);
            this.zzq = zzaerVar;
            this.zzn.zzP(zzaerVar);
        }
        return iZza == -1 ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ List zzd() {
        return zzfyf.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zze(zzadw zzadwVar) {
        this.zzn = zzadwVar;
        zzaez zzaezVarZzw = zzadwVar.zzw(0, 1);
        this.zzo = zzaezVarZzw;
        this.zzp = zzaezVarZzw;
        zzadwVar.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzf(long j4, long j10) {
        this.zzh = 0L;
        this.zzi = 0;
        this.zzj = 0;
        this.zzr = j10;
        this.zzm = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final boolean zzi(zzadu zzaduVar) throws IOException {
        return zzh(zzaduVar);
    }

    public zzafg(int i) {
        this.zze = new byte[1];
        this.zzk = -1;
        zzadp zzadpVar = new zzadp();
        this.zzf = zzadpVar;
        this.zzp = zzadpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ zzadt zzc() {
        return this;
    }
}
