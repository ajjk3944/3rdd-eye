package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public final class zzef implements zzcn {
    private final zzdt zza;
    private zzcm zzb = zzcm.zza;
    private zzsc zzc;

    public zzef(zzdt zzdtVar) {
        this.zza = zzdtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zza(java.lang.String r18, com.google.android.recaptcha.RecaptchaAction r19, long r20, dh.InterfaceC5380e r22) throws com.google.android.recaptcha.internal.zzbd {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzef.zza(java.lang.String, com.google.android.recaptcha.RecaptchaAction, long, dh.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
    
        if (r12 == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.google.android.recaptcha.internal.zzef] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzb(long r11, dh.InterfaceC5380e r13) throws com.google.android.recaptcha.internal.zzbd {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.google.android.recaptcha.internal.zzee
            if (r0 == 0) goto L13
            r0 = r13
            com.google.android.recaptcha.internal.zzee r0 = (com.google.android.recaptcha.internal.zzee) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzee r0 = new com.google.android.recaptcha.internal.zzee
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.zzb
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.zzd
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L32
            com.google.android.recaptcha.internal.zzef r11 = r0.zze
            Yg.v.b(r13)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            goto L9c
        L2f:
            r12 = move-exception
            goto La9
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            double r11 = r0.zza
            com.google.android.recaptcha.internal.zzef r2 = r0.zze
            Yg.v.b(r13)     // Catch: com.google.android.recaptcha.internal.zzbd -> L47
            r9 = r2
            r2 = r13
            r12 = r11
            r11 = r9
            goto L8b
        L47:
            r12 = move-exception
            r11 = r2
            goto La9
        L4a:
            Yg.v.b(r13)
            com.google.android.recaptcha.internal.zzcm r13 = r10.zzb
            com.google.android.recaptcha.internal.zzcj r2 = com.google.android.recaptcha.internal.zzcm.zzb()
            boolean r13 = kotlin.jvm.internal.AbstractC6492s.d(r13, r2)
            if (r13 != 0) goto Lb0
            com.google.android.recaptcha.internal.zzcm r13 = r10.zzb
            com.google.android.recaptcha.internal.zzci r2 = com.google.android.recaptcha.internal.zzcm.zza()
            boolean r13 = kotlin.jvm.internal.AbstractC6492s.d(r13, r2)
            if (r13 == 0) goto L66
            goto Lb0
        L66:
            com.google.android.recaptcha.internal.zzck r13 = com.google.android.recaptcha.internal.zzcm.zzc()
            r10.zzb = r13
            double r11 = (double) r11
            com.google.android.recaptcha.internal.zzdt r13 = r10.zza     // Catch: com.google.android.recaptcha.internal.zzbd -> La6
            r5 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            double r5 = r5 * r11
            r0.zze = r10     // Catch: com.google.android.recaptcha.internal.zzbd -> La6
            r7 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r11 = r11 * r7
            r0.zza = r11     // Catch: com.google.android.recaptcha.internal.zzbd -> La6
            r0.zzd = r4     // Catch: com.google.android.recaptcha.internal.zzbd -> La6
            long r4 = (long) r5     // Catch: com.google.android.recaptcha.internal.zzbd -> La6
            java.lang.Object r13 = r13.zzo(r4, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> La6
            if (r13 == r1) goto La5
            r2 = r13
            r12 = r11
            r11 = r10
        L8b:
            com.google.android.recaptcha.internal.zzsc r2 = (com.google.android.recaptcha.internal.zzsc) r2     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            r11.zzc = r2     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            com.google.android.recaptcha.internal.zzdt r4 = r11.zza     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            long r12 = (long) r12     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            r0.zze = r11     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            r0.zzd = r3     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            java.lang.Object r12 = r4.zzn(r2, r12, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            if (r12 == r1) goto La5
        L9c:
            com.google.android.recaptcha.internal.zzcj r12 = com.google.android.recaptcha.internal.zzcm.zzb()     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            r11.zzb = r12     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            Yg.J r11 = Yg.J.f24997a
            return r11
        La5:
            return r1
        La6:
            r11 = move-exception
            r12 = r11
            r11 = r10
        La9:
            com.google.android.recaptcha.internal.zzci r13 = com.google.android.recaptcha.internal.zzcm.zza()
            r11.zzb = r13
            throw r12
        Lb0:
            Yg.J r11 = Yg.J.f24997a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzef.zzb(long, dh.e):java.lang.Object");
    }
}
