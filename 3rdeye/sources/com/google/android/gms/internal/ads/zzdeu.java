package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdeu extends zzcqv {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdda zze;
    private final zzdgg zzf;
    private final zzcrq zzg;
    private final zzfok zzh;
    private final zzcwe zzi;
    private final zzbzu zzj;
    private boolean zzk;

    public zzdeu(zzcqu zzcquVar, Context context, zzcfe zzcfeVar, zzdda zzddaVar, zzdgg zzdggVar, zzcrq zzcrqVar, zzfok zzfokVar, zzcwe zzcweVar, zzbzu zzbzuVar) {
        super(zzcquVar);
        this.zzk = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcfeVar);
        this.zze = zzddaVar;
        this.zzf = zzdggVar;
        this.zzg = zzcrqVar;
        this.zzh = zzfokVar;
        this.zzi = zzcweVar;
        this.zzj = zzbzuVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcfe zzcfeVar = (zzcfe) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgP)).booleanValue()) {
                if (!this.zzk && zzcfeVar != null) {
                    zzcad.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdet
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcfeVar.destroy();
                        }
                    });
                }
            } else if (zzcfeVar != null) {
                zzcfeVar.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005f  */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(boolean r7, android.app.Activity r8) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzdda r0 = r6.zze
            r0.zzb()
            com.google.android.gms.ads.internal.zzv.zzr()
            com.google.android.gms.internal.ads.zzdgg r1 = r6.zzf
            com.google.android.gms.internal.ads.zzfbt r2 = r1.zza()
            boolean r2 = com.google.android.gms.ads.internal.util.zzs.zzO(r2)
            r3 = 0
            if (r2 != 0) goto L5f
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.internal.ads.zzbdc.zzaO
            com.google.android.gms.internal.ads.zzbda r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r4.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L5f
            com.google.android.gms.ads.internal.zzv.zzr()
            android.content.Context r2 = r6.zzc
            boolean r2 = com.google.android.gms.ads.internal.util.zzs.zzH(r2)
            if (r2 == 0) goto L5f
            int r7 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r7 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies"
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r7)
            com.google.android.gms.internal.ads.zzcwe r7 = r6.zzi
            r7.zzd()
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.internal.ads.zzbdc.zzaP
            com.google.android.gms.internal.ads.zzbda r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r7 = r8.zzb(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto Ld5
            com.google.android.gms.internal.ads.zzfok r7 = r6.zzh
            com.google.android.gms.internal.ads.zzfcf r8 = r6.zza
            com.google.android.gms.internal.ads.zzfce r8 = r8.zzb
            com.google.android.gms.internal.ads.zzfbw r8 = r8.zzb
            java.lang.String r8 = r8.zzb
            r7.zza(r8)
            goto Ld5
        L5f:
            java.lang.ref.WeakReference r2 = r6.zzd
            java.lang.Object r2 = r2.get()
            com.google.android.gms.internal.ads.zzcfe r2 = (com.google.android.gms.internal.ads.zzcfe) r2
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.internal.ads.zzbdc.zzmf
            com.google.android.gms.internal.ads.zzbda r5 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 0
            if (r4 == 0) goto La5
            if (r2 == 0) goto La5
            com.google.android.gms.internal.ads.zzfbt r2 = r2.zzD()
            if (r2 == 0) goto La5
            boolean r4 = r2.zzar
            if (r4 == 0) goto La5
            int r2 = r2.zzas
            com.google.android.gms.internal.ads.zzbzu r4 = r6.zzj
            int r4 = r4.zzb()
            if (r2 == r4) goto La5
            int r7 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r7 = "The interstitial consent form has been shown."
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r7)
            com.google.android.gms.internal.ads.zzcwe r7 = r6.zzi
            r8 = 12
            java.lang.String r0 = "The consent form has already been shown."
            com.google.android.gms.ads.internal.client.zze r8 = com.google.android.gms.internal.ads.zzfdp.zzd(r8, r0, r5)
            r7.zzc(r8)
            goto Ld5
        La5:
            boolean r2 = r6.zzk
            if (r2 == 0) goto Lbb
            int r2 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r2 = "The interstitial ad has been shown."
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r2)
            com.google.android.gms.internal.ads.zzcwe r2 = r6.zzi
            r4 = 10
            com.google.android.gms.ads.internal.client.zze r4 = com.google.android.gms.internal.ads.zzfdp.zzd(r4, r5, r5)
            r2.zzc(r4)
        Lbb:
            boolean r2 = r6.zzk
            if (r2 != 0) goto Ld5
            if (r8 != 0) goto Lc3
            android.content.Context r8 = r6.zzc
        Lc3:
            com.google.android.gms.internal.ads.zzcwe r2 = r6.zzi     // Catch: com.google.android.gms.internal.ads.zzdgf -> Lcf
            r1.zzb(r7, r8, r2)     // Catch: com.google.android.gms.internal.ads.zzdgf -> Lcf
            r0.zza()     // Catch: com.google.android.gms.internal.ads.zzdgf -> Lcf
            r7 = 1
            r6.zzk = r7
            return r7
        Lcf:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzcwe r8 = r6.zzi
            r8.zze(r7)
        Ld5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdeu.zzc(boolean, android.app.Activity):boolean");
    }
}
