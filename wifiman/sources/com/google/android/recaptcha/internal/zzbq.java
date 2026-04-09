package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public final class zzbq {
    public static final zzbq zza = new zzbq();

    private zzbq() {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086 A[PHI: r0
  0x0086: PHI (r0v4 java.lang.Object) = (r0v6 java.lang.Object), (r0v1 java.lang.Object) binds: [B:23:0x0083, B:17:0x005f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b3 -> B:13:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zza(mh.InterfaceC6835l r19, long r20, long r22, double r24, mh.InterfaceC6835l r26, dh.InterfaceC5380e r27) throws java.lang.Exception {
        /*
            r18 = this;
            r0 = r27
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzbp
            if (r1 == 0) goto L17
            r1 = r0
            com.google.android.recaptcha.internal.zzbp r1 = (com.google.android.recaptcha.internal.zzbp) r1
            int r2 = r1.zzh
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.zzh = r2
            r2 = r18
            goto L1e
        L17:
            com.google.android.recaptcha.internal.zzbp r1 = new com.google.android.recaptcha.internal.zzbp
            r2 = r18
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.zzf
            java.lang.Object r3 = eh.AbstractC5467b.g()
            int r4 = r1.zzh
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L65
            if (r4 == r6) goto L51
            if (r4 != r5) goto L48
            long r7 = r1.zzd
            double r9 = r1.zze
            long r11 = r1.zzc
            java.lang.Object r4 = r1.zzb
            mh.l r4 = (mh.InterfaceC6835l) r4
            java.lang.Object r13 = r1.zza
            mh.l r13 = (mh.InterfaceC6835l) r13
            Yg.v.b(r0)
        L3f:
            r15 = r13
            r13 = r1
            r1 = r15
            r16 = r9
            r9 = r11
            r11 = r16
            goto L73
        L48:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L51:
            long r7 = r1.zzd
            double r9 = r1.zze
            long r11 = r1.zzc
            java.lang.Object r4 = r1.zzb
            mh.l r4 = (mh.InterfaceC6835l) r4
            java.lang.Object r13 = r1.zza
            mh.l r13 = (mh.InterfaceC6835l) r13
            Yg.v.b(r0)     // Catch: java.lang.Exception -> L63
            goto L86
        L63:
            r0 = move-exception
            goto L90
        L65:
            Yg.v.b(r0)
            r7 = r20
            r9 = r22
            r11 = r24
            r4 = r26
            r13 = r1
            r1 = r19
        L73:
            r13.zza = r1     // Catch: java.lang.Exception -> L87
            r13.zzb = r4     // Catch: java.lang.Exception -> L87
            r13.zzc = r9     // Catch: java.lang.Exception -> L87
            r13.zze = r11     // Catch: java.lang.Exception -> L87
            r13.zzd = r7     // Catch: java.lang.Exception -> L87
            r13.zzh = r6     // Catch: java.lang.Exception -> L87
            java.lang.Object r0 = r4.invoke(r13)     // Catch: java.lang.Exception -> L87
            if (r0 != r3) goto L86
            return r3
        L86:
            return r0
        L87:
            r0 = move-exception
            r15 = r13
            r13 = r1
            r1 = r15
            r16 = r9
            r9 = r11
            r11 = r16
        L90:
            java.lang.Object r14 = r13.invoke(r0)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto Lb7
            double r7 = (double) r7
            double r7 = r7 * r9
            long r7 = (long) r7
            long r7 = sh.AbstractC7978m.h(r7, r11)
            r1.zza = r13
            r1.zzb = r4
            r1.zzc = r11
            r1.zze = r9
            r1.zzd = r7
            r1.zzh = r5
            java.lang.Object r0 = Ii.Y.a(r7, r1)
            if (r0 == r3) goto Lb6
            goto L3f
        Lb6:
            return r3
        Lb7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbq.zza(mh.l, long, long, double, mh.l, dh.e):java.lang.Object");
    }
}
