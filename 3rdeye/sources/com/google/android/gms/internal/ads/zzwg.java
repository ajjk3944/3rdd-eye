package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzwg implements zzzv, zzuw {
    final /* synthetic */ zzwl zza;
    private final Uri zzc;
    private final zzhi zzd;
    private final zzwa zze;
    private final zzadw zzf;
    private final zzdm zzg;
    private volatile boolean zzi;
    private long zzk;
    private zzaez zzm;
    private boolean zzn;
    private final zzaep zzh = new zzaep();
    private boolean zzj = true;
    private final long zzb = zzuy.zza();
    private zzgo zzl = zzi(0);

    public zzwg(zzwl zzwlVar, Uri uri, zzgj zzgjVar, zzwa zzwaVar, zzadw zzadwVar, zzdm zzdmVar) {
        this.zza = zzwlVar;
        this.zzc = uri;
        this.zzd = new zzhi(zzgjVar);
        this.zze = zzwaVar;
        this.zzf = zzadwVar;
        this.zzg = zzdmVar;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzwg zzwgVar, long j4, long j10) {
        zzwgVar.zzh.zza = j4;
        zzwgVar.zzk = j10;
        zzwgVar.zzj = true;
        zzwgVar.zzn = false;
    }

    private final zzgo zzi(long j4) {
        zzgm zzgmVar = new zzgm();
        zzgmVar.zzd(this.zzc);
        zzgmVar.zzc(j4);
        zzgmVar.zza(6);
        zzgmVar.zzb(zzwl.zzb);
        return zzgmVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zza(zzen zzenVar) {
        long jMax = !this.zzn ? this.zzk : Math.max(zzwl.zzr(this.zza, true), this.zzk);
        int iZza = zzenVar.zza();
        zzaez zzaezVar = this.zzm;
        zzaezVar.getClass();
        zzaezVar.zzr(zzenVar, iZza);
        zzaezVar.zzt(jMax, 1, iZza, 0, null);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:13|(2:15|16)|17|20|21|(5:23|115|24|25|(16:27|28|117|37|(1:39)(1:40)|41|(1:43)(1:44)|45|(1:47)(1:48)|49|(1:51)(1:52)|53|(4:55|121|56|(14:58|59|(1:65)|66|(1:71)(1:70)|72|(1:74)|75|(1:77)|78|(1:(3:113|80|(5:123|82|83|(3:130|85|134)(1:133)|132)(2:129|90))(1:131))|(3:93|(1:95)|96)|97|(2:127|135)(1:128))(6:109|60|61|(0)|66|(11:68|71|72|(0)|75|(0)|78|(2:(0)(0)|132)|(0)|97|(0)(0))(0)))(4:61|(0)|66|(0)(0))|(2:101|(1:103))|104|105)(3:29|119|30))(1:36)|31|117|37|(0)(0)|41|(0)(0)|45|(0)(0)|49|(0)(0)|53|(0)(0)|(0)|104|105) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x019a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[LOOP:0: B:3:0x0004->B:128:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d0 A[EDGE_INSN: B:131:0x01d0->B:91:0x01d0 BREAK  A[LOOP:1: B:79:0x0198->B:132:0x0198], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad A[Catch: all -> 0x008a, TryCatch #4 {all -> 0x008a, blocks: (B:37:0x00a2, B:39:0x00ad, B:41:0x00b9, B:43:0x00c3, B:45:0x00cf, B:47:0x00d9, B:49:0x00e5, B:51:0x00ef, B:53:0x0101, B:55:0x010b, B:56:0x0111, B:65:0x013f, B:66:0x0146, B:68:0x0153, B:70:0x015b, B:72:0x0176, B:74:0x0189, B:75:0x018c, B:77:0x0190, B:60:0x011b, B:63:0x0131, B:30:0x0072, B:35:0x0090), top: B:117:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3 A[Catch: all -> 0x008a, TryCatch #4 {all -> 0x008a, blocks: (B:37:0x00a2, B:39:0x00ad, B:41:0x00b9, B:43:0x00c3, B:45:0x00cf, B:47:0x00d9, B:49:0x00e5, B:51:0x00ef, B:53:0x0101, B:55:0x010b, B:56:0x0111, B:65:0x013f, B:66:0x0146, B:68:0x0153, B:70:0x015b, B:72:0x0176, B:74:0x0189, B:75:0x018c, B:77:0x0190, B:60:0x011b, B:63:0x0131, B:30:0x0072, B:35:0x0090), top: B:117:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9 A[Catch: all -> 0x008a, TryCatch #4 {all -> 0x008a, blocks: (B:37:0x00a2, B:39:0x00ad, B:41:0x00b9, B:43:0x00c3, B:45:0x00cf, B:47:0x00d9, B:49:0x00e5, B:51:0x00ef, B:53:0x0101, B:55:0x010b, B:56:0x0111, B:65:0x013f, B:66:0x0146, B:68:0x0153, B:70:0x015b, B:72:0x0176, B:74:0x0189, B:75:0x018c, B:77:0x0190, B:60:0x011b, B:63:0x0131, B:30:0x0072, B:35:0x0090), top: B:117:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef A[Catch: all -> 0x008a, TryCatch #4 {all -> 0x008a, blocks: (B:37:0x00a2, B:39:0x00ad, B:41:0x00b9, B:43:0x00c3, B:45:0x00cf, B:47:0x00d9, B:49:0x00e5, B:51:0x00ef, B:53:0x0101, B:55:0x010b, B:56:0x0111, B:65:0x013f, B:66:0x0146, B:68:0x0153, B:70:0x015b, B:72:0x0176, B:74:0x0189, B:75:0x018c, B:77:0x0190, B:60:0x011b, B:63:0x0131, B:30:0x0072, B:35:0x0090), top: B:117:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010b A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #4 {all -> 0x008a, blocks: (B:37:0x00a2, B:39:0x00ad, B:41:0x00b9, B:43:0x00c3, B:45:0x00cf, B:47:0x00d9, B:49:0x00e5, B:51:0x00ef, B:53:0x0101, B:55:0x010b, B:56:0x0111, B:65:0x013f, B:66:0x0146, B:68:0x0153, B:70:0x015b, B:72:0x0176, B:74:0x0189, B:75:0x018c, B:77:0x0190, B:60:0x011b, B:63:0x0131, B:30:0x0072, B:35:0x0090), top: B:117:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013f A[Catch: all -> 0x008a, TryCatch #4 {all -> 0x008a, blocks: (B:37:0x00a2, B:39:0x00ad, B:41:0x00b9, B:43:0x00c3, B:45:0x00cf, B:47:0x00d9, B:49:0x00e5, B:51:0x00ef, B:53:0x0101, B:55:0x010b, B:56:0x0111, B:65:0x013f, B:66:0x0146, B:68:0x0153, B:70:0x015b, B:72:0x0176, B:74:0x0189, B:75:0x018c, B:77:0x0190, B:60:0x011b, B:63:0x0131, B:30:0x0072, B:35:0x0090), top: B:117:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0153 A[Catch: all -> 0x008a, TryCatch #4 {all -> 0x008a, blocks: (B:37:0x00a2, B:39:0x00ad, B:41:0x00b9, B:43:0x00c3, B:45:0x00cf, B:47:0x00d9, B:49:0x00e5, B:51:0x00ef, B:53:0x0101, B:55:0x010b, B:56:0x0111, B:65:0x013f, B:66:0x0146, B:68:0x0153, B:70:0x015b, B:72:0x0176, B:74:0x0189, B:75:0x018c, B:77:0x0190, B:60:0x011b, B:63:0x0131, B:30:0x0072, B:35:0x0090), top: B:117:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0189 A[Catch: all -> 0x008a, TryCatch #4 {all -> 0x008a, blocks: (B:37:0x00a2, B:39:0x00ad, B:41:0x00b9, B:43:0x00c3, B:45:0x00cf, B:47:0x00d9, B:49:0x00e5, B:51:0x00ef, B:53:0x0101, B:55:0x010b, B:56:0x0111, B:65:0x013f, B:66:0x0146, B:68:0x0153, B:70:0x015b, B:72:0x0176, B:74:0x0189, B:75:0x018c, B:77:0x0190, B:60:0x011b, B:63:0x0131, B:30:0x0072, B:35:0x0090), top: B:117:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0190 A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #4 {all -> 0x008a, blocks: (B:37:0x00a2, B:39:0x00ad, B:41:0x00b9, B:43:0x00c3, B:45:0x00cf, B:47:0x00d9, B:49:0x00e5, B:51:0x00ef, B:53:0x0101, B:55:0x010b, B:56:0x0111, B:65:0x013f, B:66:0x0146, B:68:0x0153, B:70:0x015b, B:72:0x0176, B:74:0x0189, B:75:0x018c, B:77:0x0190, B:60:0x011b, B:63:0x0131, B:30:0x0072, B:35:0x0090), top: B:117:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d3  */
    @Override // com.google.android.gms.internal.ads.zzzv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwg.zzh():void");
    }
}
