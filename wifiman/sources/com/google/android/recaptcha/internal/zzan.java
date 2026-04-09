package com.google.android.recaptcha.internal;

import Ii.InterfaceC3088x;
import Ii.N;
import Ti.g;
import Yg.J;
import android.content.Context;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import dh.InterfaceC5380e;

/* loaded from: classes3.dex */
public final class zzan {
    public InterfaceC3088x zza;
    private final N zzb;
    private final zzek zzc;
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;
    private zzao zze = zzao.zza;
    private final Ti.a zzg = g.b(false, 1, null);

    public zzan(Context context, N n10, zzek zzekVar, StandardIntegrityManager standardIntegrityManager, long j10) {
        this.zzb = n10;
        this.zzc = zzekVar;
        this.zzd = standardIntegrityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzi(dh.InterfaceC5380e r7) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzag
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzag r0 = (com.google.android.recaptcha.internal.zzag) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzag r0 = new com.google.android.recaptcha.internal.zzag
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.zza
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L29
            Yg.v.b(r7)
            goto L56
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            Yg.v.b(r7)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r7 = com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.builder()
            long r4 = r6.zzf
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r7 = r7.setCloudProjectNumber(r4)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest r7 = r7.build()
            com.google.android.play.core.integrity.StandardIntegrityManager r2 = r6.zzd
            com.google.android.gms.tasks.Task r7 = r2.prepareIntegrityToken(r7)
            Ii.V r7 = com.google.android.recaptcha.internal.zzbx.zza(r7)
            r0.zzc = r3
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzi(dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzj(java.lang.String r6, dh.InterfaceC5380e r7) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzah
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzah r0 = (com.google.android.recaptcha.internal.zzah) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzah r0 = new com.google.android.recaptcha.internal.zzah
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.zza
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2c
            Yg.v.b(r7)
            goto L6e
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            java.lang.String r6 = r0.zzd
            Yg.v.b(r7)
            goto L4c
        L3b:
            Yg.v.b(r7)
            Ii.x r7 = r5.zzf()
            r0.zzd = r6
            r0.zzc = r4
            java.lang.Object r7 = r7.await(r0)
            if (r7 == r1) goto L75
        L4c:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r7
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r2 = com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.builder()
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r6 = r2.setRequestHash(r6)
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest r6 = r6.build()
            com.google.android.gms.tasks.Task r6 = r7.request(r6)
            Ii.V r6 = com.google.android.recaptcha.internal.zzbx.zza(r6)
            r7 = 0
            r0.zzd = r7
            r0.zzc = r3
            java.lang.Object r7 = r6.await(r0)
            if (r7 != r1) goto L6e
            goto L75
        L6e:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken) r7
            java.lang.String r6 = r7.token()
            return r6
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzj(java.lang.String, dh.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(java.lang.String r7, dh.InterfaceC5380e r8) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzaf
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzaf r0 = (com.google.android.recaptcha.internal.zzaf) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzaf r0 = new com.google.android.recaptcha.internal.zzaf
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.zza
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.zzc
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L48
            if (r2 == r5) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L2f
            Yg.v.b(r8)
            goto L77
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzan r2 = r0.zzd
            Yg.v.b(r8)
            goto L6a
        L40:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzan r2 = r0.zzd
            Yg.v.b(r8)     // Catch: java.lang.Exception -> L5d
            goto L59
        L48:
            Yg.v.b(r8)
            r0.zzd = r6     // Catch: java.lang.Exception -> L5c
            r0.zze = r7     // Catch: java.lang.Exception -> L5c
            r0.zzc = r5     // Catch: java.lang.Exception -> L5c
            java.lang.Object r8 = r6.zzj(r7, r0)     // Catch: java.lang.Exception -> L5c
            if (r8 != r1) goto L58
            return r1
        L58:
            r2 = r6
        L59:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L5d
            goto L79
        L5c:
            r2 = r6
        L5d:
            r0.zzd = r2
            r0.zze = r7
            r0.zzc = r4
            java.lang.Object r8 = r2.zze(r0)
            if (r8 != r1) goto L6a
            return r1
        L6a:
            r8 = 0
            r0.zzd = r8
            r0.zze = r8
            r0.zzc = r3
            java.lang.Object r8 = r2.zzj(r7, r0)
            if (r8 == r1) goto L7a
        L77:
            java.lang.String r8 = (java.lang.String) r8
        L79:
            return r8
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzc(java.lang.String, dh.e):java.lang.Object");
    }

    public final Object zzd(long j10, InterfaceC5380e interfaceC5380e) {
        this.zzf = j10;
        return J.f24997a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        if (Yg.J.f24997a == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zze(dh.InterfaceC5380e r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzak
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzak r0 = (com.google.android.recaptcha.internal.zzak) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzak r0 = new com.google.android.recaptcha.internal.zzak
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.zzb
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.zzd
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2e
            Yg.v.b(r14)
            goto Lb6
        L2e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L37:
            java.lang.Object r2 = r0.zza
            Ti.a r2 = (Ti.a) r2
            com.google.android.recaptcha.internal.zzan r6 = r0.zze
            Yg.v.b(r14)
            goto L53
        L41:
            Yg.v.b(r14)
            Ti.a r2 = r13.zzg
            r0.zze = r13
            r0.zza = r2
            r0.zzd = r4
            java.lang.Object r14 = r2.a(r5, r0)
            if (r14 == r1) goto Lbd
            r6 = r13
        L53:
            com.google.android.recaptcha.internal.zzao r14 = r6.zze     // Catch: java.lang.Throwable -> L63
            com.google.android.recaptcha.internal.zzao r7 = com.google.android.recaptcha.internal.zzao.zza     // Catch: java.lang.Throwable -> L63
            boolean r14 = kotlin.jvm.internal.AbstractC6492s.d(r14, r7)     // Catch: java.lang.Throwable -> L63
            if (r14 != 0) goto L65
            Yg.J r14 = Yg.J.f24997a     // Catch: java.lang.Throwable -> L63
            r2.d(r5)
            return r14
        L63:
            r14 = move-exception
            goto Lb9
        L65:
            com.google.android.recaptcha.internal.zzao r14 = com.google.android.recaptcha.internal.zzao.zzb     // Catch: java.lang.Throwable -> L63
            r6.zze = r14     // Catch: java.lang.Throwable -> L63
            Yg.J r14 = Yg.J.f24997a     // Catch: java.lang.Throwable -> L63
            r2.d(r5)
            com.google.android.recaptcha.internal.zzek r14 = r6.zzc
            java.lang.String r2 = r14.zzd()
            r14.zzc(r2)
            r14.zzb(r3)
            r2 = 38
            com.google.android.recaptcha.internal.zzen r14 = r14.zzf(r2)
            Ii.x r2 = Ii.AbstractC3092z.b(r5, r4, r5)
            r6.zza = r2
            Ii.N r7 = r6.zzb
            com.google.android.recaptcha.internal.zzam r10 = new com.google.android.recaptcha.internal.zzam
            r10.<init>(r6, r14, r5)
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            Ii.AbstractC3059i.d(r7, r8, r9, r10, r11, r12)
            r0.zze = r5
            r0.zza = r5
            r0.zzd = r3
            boolean r14 = r6.zzh
            if (r14 != 0) goto Lb1
            java.util.Timer r7 = new java.util.Timer
            r7.<init>()
            com.google.android.recaptcha.internal.zzai r8 = new com.google.android.recaptcha.internal.zzai
            r8.<init>(r6)
            r11 = 28800000(0x1b77400, double:1.42290906E-316)
            r9 = r11
            r7.schedule(r8, r9, r11)
            r6.zzh = r4
        Lb1:
            Yg.J r14 = Yg.J.f24997a
            if (r14 != r1) goto Lb6
            goto Lbd
        Lb6:
            Yg.J r14 = Yg.J.f24997a
            return r14
        Lb9:
            r2.d(r5)
            throw r14
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zze(dh.e):java.lang.Object");
    }

    public final InterfaceC3088x zzf() {
        InterfaceC3088x interfaceC3088x = this.zza;
        if (interfaceC3088x != null) {
            return interfaceC3088x;
        }
        return null;
    }
}
