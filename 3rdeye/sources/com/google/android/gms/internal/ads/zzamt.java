package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzamt implements zzamx {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final String zze;
    private final int zzf;
    private final String zzg;
    private String zzh;
    private zzaez zzi;
    private zzaez zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzr;
    private boolean zzs;
    private int zzu;
    private zzaez zzw;
    private long zzx;
    private final zzem zzc = new zzem(new byte[7], 7);
    private final zzen zzd = new zzen(Arrays.copyOf(zza, 10));
    private int zzp = -1;
    private int zzq = -1;
    private long zzt = -9223372036854775807L;
    private long zzv = -9223372036854775807L;

    public zzamt(boolean z10, String str, int i, String str2) {
        this.zzb = z10;
        this.zze = str;
        this.zzf = i;
        this.zzg = str2;
        zzh();
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzo = false;
        zzh();
    }

    private final void zzh() {
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 256;
    }

    private final void zzi() {
        this.zzk = 3;
        this.zzl = 0;
    }

    private final void zzj(zzaez zzaezVar, long j4, int i, int i10) {
        this.zzk = 4;
        this.zzl = i;
        this.zzw = zzaezVar;
        this.zzx = j4;
        this.zzu = i10;
    }

    private final boolean zzk(zzen zzenVar, byte[] bArr, int i) {
        int iMin = Math.min(zzenVar.zza(), i - this.zzl);
        zzenVar.zzH(bArr, this.zzl, iMin);
        int i10 = this.zzl + iMin;
        this.zzl = i10;
        return i10 == i;
    }

    private static final boolean zzl(byte b10, byte b11) {
        return zzf((b11 & 255) | 65280);
    }

    private static final boolean zzm(zzen zzenVar, byte[] bArr, int i) {
        if (zzenVar.zza() < i) {
            return false;
        }
        zzenVar.zzH(bArr, 0, i);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0253, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0254, code lost:
    
        r20.zzn = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0258, code lost:
    
        if (r20.zzo != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x025a, code lost:
    
        r20.zzk = 1;
        r20.zzl = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0260, code lost:
    
        zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0263, code lost:
    
        r21.zzL(r13);
        r9 = r19;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01df, code lost:
    
        r19 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0246, code lost:
    
        r20.zzr = (r14 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x024f, code lost:
    
        if (1 == ((r14 & 1) ^ 1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0251, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c1  */
    @Override // com.google.android.gms.internal.ads.zzamx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzen r21) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamt.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzb(zzadw zzadwVar, zzaol zzaolVar) {
        zzaolVar.zzc();
        this.zzh = zzaolVar.zzb();
        zzaez zzaezVarZzw = zzadwVar.zzw(zzaolVar.zza(), 1);
        this.zzi = zzaezVarZzw;
        this.zzw = zzaezVarZzw;
        if (!this.zzb) {
            this.zzj = new zzadp();
            return;
        }
        zzaolVar.zzc();
        zzaez zzaezVarZzw2 = zzadwVar.zzw(zzaolVar.zza(), 5);
        this.zzj = zzaezVarZzw2;
        zzx zzxVar = new zzx();
        zzxVar.zzS(zzaolVar.zzb());
        zzxVar.zzG(this.zzg);
        zzxVar.zzah("application/id3");
        zzaezVarZzw2.zzm(zzxVar.zzan());
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzd(long j4, int i) {
        this.zzv = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zze() {
        this.zzv = -9223372036854775807L;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzc(boolean z10) {
    }
}
