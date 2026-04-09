package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfbg implements zzelg {
    private final Context zza;
    private final Executor zzb;
    private final zzcgz zzc;
    private final zzfaw zzd;
    private final zzezk zze;
    private final zzfcg zzf;
    private final zzfhp zzg;
    private final zzfcm zzh;
    private A4.a zzi;

    public zzfbg(Context context, Executor executor, zzcgz zzcgzVar, zzezk zzezkVar, zzfaw zzfawVar, zzfcm zzfcmVar, zzfcg zzfcgVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgzVar;
        this.zze = zzezkVar;
        this.zzd = zzfawVar;
        this.zzh = zzfcmVar;
        this.zzf = zzfcgVar;
        this.zzg = zzcgzVar.zzy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzdok zzk(zzezi zzeziVar) {
        zzdok zzdokVarZzh = this.zzc.zzh();
        zzcuy zzcuyVar = new zzcuy();
        zzcuyVar.zzf(this.zza);
        zzcuyVar.zzk(((zzfbe) zzeziVar).zza);
        zzcuyVar.zzj(this.zzf);
        zzdokVarZzh.zzd(zzcuyVar.zzl());
        zzdokVarZzh.zzc(new zzdbn().zzn());
        return zzdokVarZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zza() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    @Override // com.google.android.gms.internal.ads.zzelg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm r12, java.lang.String r13, com.google.android.gms.internal.ads.zzele r14, com.google.android.gms.internal.ads.zzelf r15) throws org.json.JSONException, android.os.RemoteException {
        /*
            r11 = this;
            r0 = 1
            com.google.android.gms.internal.ads.zzbwh r1 = new com.google.android.gms.internal.ads.zzbwh
            r1.<init>(r12, r13)
            com.google.android.gms.internal.ads.zzfay r14 = (com.google.android.gms.internal.ads.zzfay) r14
            java.lang.String r12 = r1.zzb
            r13 = 0
            if (r12 != 0) goto L1f
            int r12 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r12 = "Ad unit ID should not be null for rewarded video ad."
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r12)
            java.util.concurrent.Executor r12 = r11.zzb
            com.google.android.gms.internal.ads.zzfaz r14 = new com.google.android.gms.internal.ads.zzfaz
            r14.<init>()
            r12.execute(r14)
            return r13
        L1f:
            A4.a r14 = r11.zzi
            if (r14 == 0) goto L2a
            boolean r14 = r14.isDone()
            if (r14 != 0) goto L2a
            return r13
        L2a:
            com.google.android.gms.internal.ads.zzbem r14 = com.google.android.gms.internal.ads.zzbev.zzc
            java.lang.Object r14 = r14.zze()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            r2 = 5
            r3 = 0
            if (r14 == 0) goto L5d
            com.google.android.gms.internal.ads.zzezk r14 = r11.zze
            java.lang.Object r4 = r14.zzd()
            if (r4 == 0) goto L5d
            java.lang.Object r14 = r14.zzd()
            com.google.android.gms.internal.ads.zzdol r14 = (com.google.android.gms.internal.ads.zzdol) r14
            com.google.android.gms.internal.ads.zzfhm r14 = r14.zzg()
            r14.zzi(r2)
            com.google.android.gms.ads.internal.client.zzm r4 = r1.zza
            java.lang.String r5 = r4.zzp
            r14.zzb(r5)
            android.os.Bundle r4 = r4.zzm
            r14.zzf(r4)
            r8 = r14
            goto L5e
        L5d:
            r8 = r3
        L5e:
            android.content.Context r14 = r11.zza
            com.google.android.gms.ads.internal.client.zzm r1 = r1.zza
            boolean r4 = r1.zzf
            com.google.android.gms.internal.ads.zzfdl.zza(r14, r4)
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.internal.ads.zzbdc.zzjg
            com.google.android.gms.internal.ads.zzbda r6 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r5 = r6.zzb(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L84
            if (r4 == 0) goto L84
            com.google.android.gms.internal.ads.zzcgz r4 = r11.zzc
            com.google.android.gms.internal.ads.zzdvb r4 = r4.zzk()
            r4.zzo(r0)
        L84:
            android.util.Pair r4 = new android.util.Pair
            com.google.android.gms.internal.ads.zzdrk r5 = com.google.android.gms.internal.ads.zzdrk.PUBLIC_API_CALL
            java.lang.String r5 = r5.zza()
            long r6 = r1.zzz
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r4.<init>(r5, r6)
            android.util.Pair r5 = new android.util.Pair
            com.google.android.gms.internal.ads.zzdrk r6 = com.google.android.gms.internal.ads.zzdrk.DYNAMITE_ENTER
            java.lang.String r6 = r6.zza()
            com.google.android.gms.common.util.Clock r7 = com.google.android.gms.ads.internal.zzv.zzD()
            long r9 = r7.currentTimeMillis()
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r5.<init>(r6, r7)
            r6 = 2
            android.util.Pair[] r6 = new android.util.Pair[r6]
            r6[r13] = r4
            r6[r0] = r5
            android.os.Bundle r13 = com.google.android.gms.internal.ads.zzdrm.zza(r6)
            com.google.android.gms.internal.ads.zzfcm r4 = r11.zzh
            r4.zzt(r12)
            com.google.android.gms.ads.internal.client.zzr r12 = com.google.android.gms.ads.internal.client.zzr.zzd()
            r4.zzs(r12)
            r4.zzH(r1)
            r4.zzA(r13)
            com.google.android.gms.internal.ads.zzfco r12 = r4.zzJ()
            int r13 = com.google.android.gms.internal.ads.zzfhl.zzf(r12)
            com.google.android.gms.internal.ads.zzfhb r9 = com.google.android.gms.internal.ads.zzfha.zzb(r14, r13, r2, r1)
            com.google.android.gms.internal.ads.zzfbe r10 = new com.google.android.gms.internal.ads.zzfbe
            r10.<init>(r3)
            r10.zza = r12
            com.google.android.gms.internal.ads.zzezk r12 = r11.zze
            com.google.android.gms.internal.ads.zzezl r13 = new com.google.android.gms.internal.ads.zzezl
            r13.<init>(r10, r3)
            com.google.android.gms.internal.ads.zzfba r14 = new com.google.android.gms.internal.ads.zzfba
            r14.<init>()
            A4.a r12 = r12.zzc(r13, r14, r3)
            r11.zzi = r12
            com.google.android.gms.internal.ads.zzfbd r5 = new com.google.android.gms.internal.ads.zzfbd
            r6 = r11
            r7 = r15
            r5.<init>(r6, r7, r8, r9, r10)
            java.util.concurrent.Executor r13 = r6.zzb
            com.google.android.gms.internal.ads.zzgdb.zzr(r12, r5, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbg.zzb(com.google.android.gms.ads.internal.client.zzm, java.lang.String, com.google.android.gms.internal.ads.zzele, com.google.android.gms.internal.ads.zzelf):boolean");
    }

    public final void zzj(int i) {
        this.zzh.zzp().zza(i);
    }
}
