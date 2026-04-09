package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzamv implements zzamx {
    private final zzen zza;
    private final String zzc;
    private final int zzd;
    private String zzf;
    private zzaez zzg;
    private int zzi;
    private int zzj;
    private long zzk;
    private zzz zzl;
    private int zzm;
    private int zzn;
    private int zzh = 0;
    private long zzq = -9223372036854775807L;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzo = -1;
    private int zzp = -1;
    private final String zze = "video/mp2t";

    public zzamv(String str, int i, int i10, String str2) {
        this.zza = new zzen(new byte[i10]);
        this.zzc = str;
        this.zzd = i;
    }

    private final void zzf(zzadq zzadqVar) {
        int i;
        int i10 = zzadqVar.zzb;
        if (i10 == -2147483647 || (i = zzadqVar.zzc) == -1) {
            return;
        }
        zzz zzzVar = this.zzl;
        if (zzzVar != null && i == zzzVar.zzG && i10 == zzzVar.zzH && Objects.equals(zzadqVar.zza, zzzVar.zzo)) {
            return;
        }
        zzz zzzVar2 = this.zzl;
        zzx zzxVar = zzzVar2 == null ? new zzx() : zzzVar2.zzb();
        zzxVar.zzS(this.zzf);
        zzxVar.zzG(this.zze);
        zzxVar.zzah(zzadqVar.zza);
        zzxVar.zzD(i);
        zzxVar.zzai(i10);
        zzxVar.zzW(this.zzc);
        zzxVar.zzaf(this.zzd);
        zzz zzzVarZzan = zzxVar.zzan();
        this.zzl = zzzVarZzan;
        this.zzg.zzm(zzzVarZzan);
    }

    private final boolean zzg(zzen zzenVar, byte[] bArr, int i) {
        int iMin = Math.min(zzenVar.zza(), i - this.zzi);
        zzenVar.zzH(bArr, this.zzi, iMin);
        int i10 = this.zzi + iMin;
        this.zzi = i10;
        return i10 == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f1  */
    @Override // com.google.android.gms.internal.ads.zzamx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzen r23) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamv.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzb(zzadw zzadwVar, zzaol zzaolVar) {
        zzaolVar.zzc();
        this.zzf = zzaolVar.zzb();
        this.zzg = zzadwVar.zzw(zzaolVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzd(long j4, int i) {
        this.zzq = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zze() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = 0;
        this.zzq = -9223372036854775807L;
        this.zzb.set(0);
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzc(boolean z10) {
    }
}
