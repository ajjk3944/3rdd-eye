package com.google.android.recaptcha.internal;

import Yg.J;
import dh.InterfaceC5380e;

/* loaded from: classes3.dex */
public abstract class zze {
    private boolean zza;

    protected zzen zza(String str) {
        throw null;
    }

    protected zzen zzb() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(java.lang.String r19, long r20, dh.InterfaceC5380e r22) throws com.google.android.recaptcha.internal.zzbd {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zzc(java.lang.String, long, dh.e):java.lang.Object");
    }

    protected abstract Object zzd(String str, InterfaceC5380e interfaceC5380e);

    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa A[PHI: r9 r10 r12
  0x00aa: PHI (r9v12 com.google.android.recaptcha.internal.zzen) = (r9v8 com.google.android.recaptcha.internal.zzen), (r9v19 com.google.android.recaptcha.internal.zzen) binds: [B:37:0x00a8, B:16:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x00aa: PHI (r10v5 com.google.android.recaptcha.internal.zze) = (r10v2 com.google.android.recaptcha.internal.zze), (r10v10 com.google.android.recaptcha.internal.zze) binds: [B:37:0x00a8, B:16:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x00aa: PHI (r12v8 java.lang.Object) = (r12v9 java.lang.Object), (r12v10 java.lang.Object) binds: [B:37:0x00a8, B:16:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zze(long r9, com.google.android.recaptcha.internal.zzsc r11, dh.InterfaceC5380e r12) throws com.google.android.recaptcha.internal.zzbd {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.internal.zzc
            if (r0 == 0) goto L13
            r0 = r12
            com.google.android.recaptcha.internal.zzc r0 = (com.google.android.recaptcha.internal.zzc) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzc r0 = new com.google.android.recaptcha.internal.zzc
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.zzb
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.zzd
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L54
            if (r2 == r6) goto L48
            if (r2 == r5) goto L3e
            if (r2 != r4) goto L35
            java.lang.Object r9 = r0.zza
            com.google.android.recaptcha.internal.zzbd r9 = (com.google.android.recaptcha.internal.zzbd) r9
            Yg.v.b(r12)
            goto Lbf
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            com.google.android.recaptcha.internal.zzen r9 = r0.zze
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zze r10 = (com.google.android.recaptcha.internal.zze) r10
            Yg.v.b(r12)
            goto Laa
        L48:
            com.google.android.recaptcha.internal.zzen r9 = r0.zze
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zze r10 = (com.google.android.recaptcha.internal.zze) r10
            Yg.v.b(r12)     // Catch: java.lang.Exception -> L52
            goto L80
        L52:
            r11 = move-exception
            goto L9b
        L54:
            Yg.v.b(r12)
            com.google.android.recaptcha.internal.zzen r12 = r8.zzb()
            boolean r2 = r8.zza
            if (r2 == 0) goto L6b
            r12.zza()
            Yg.u$a r9 = Yg.u.f25017b
            Yg.J r9 = Yg.J.f24997a
            java.lang.Object r9 = Yg.u.c(r9)
            return r9
        L6b:
            com.google.android.recaptcha.internal.zzd r2 = new com.google.android.recaptcha.internal.zzd     // Catch: java.lang.Exception -> L97
            r2.<init>(r8, r11, r3)     // Catch: java.lang.Exception -> L97
            r0.zza = r8     // Catch: java.lang.Exception -> L97
            r0.zze = r12     // Catch: java.lang.Exception -> L97
            r0.zzd = r6     // Catch: java.lang.Exception -> L97
            java.lang.Object r9 = Ii.W0.c(r9, r2, r0)     // Catch: java.lang.Exception -> L97
            if (r9 == r1) goto Lca
            r10 = r8
            r7 = r12
            r12 = r9
            r9 = r7
        L80:
            Yg.u r12 = (Yg.u) r12     // Catch: java.lang.Exception -> L52
            java.lang.Object r11 = r12.o()     // Catch: java.lang.Exception -> L52
            Yg.v.b(r11)     // Catch: java.lang.Exception -> L52
            Yg.J r11 = Yg.J.f24997a     // Catch: java.lang.Exception -> L52
            r10.zza = r6     // Catch: java.lang.Exception -> L52
            if (r9 == 0) goto L92
            r9.zza()     // Catch: java.lang.Exception -> L52
        L92:
            java.lang.Object r9 = Yg.u.c(r11)     // Catch: java.lang.Exception -> L52
            return r9
        L97:
            r9 = move-exception
            r11 = r9
            r10 = r8
            r9 = r12
        L9b:
            r12 = 0
            r10.zza = r12
            r0.zza = r10
            r0.zze = r9
            r0.zzd = r5
            java.lang.Object r12 = r10.zzj(r11, r0)
            if (r12 == r1) goto Lca
        Laa:
            r11 = r12
            com.google.android.recaptcha.internal.zzbd r11 = (com.google.android.recaptcha.internal.zzbd) r11
            if (r9 == 0) goto Lb2
            r9.zzb(r11)
        Lb2:
            r0.zza = r11
            r0.zze = r3
            r0.zzd = r4
            java.lang.Object r9 = r10.zzg(r11, r0)
            if (r9 == r1) goto Lca
            r9 = r11
        Lbf:
            Yg.u$a r10 = Yg.u.f25017b
            java.lang.Object r9 = Yg.v.a(r9)
            java.lang.Object r9 = Yg.u.c(r9)
            return r9
        Lca:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zze(long, com.google.android.recaptcha.internal.zzsc, dh.e):java.lang.Object");
    }

    protected abstract Object zzf(String str, InterfaceC5380e interfaceC5380e) throws zzbd;

    protected Object zzg(zzbd zzbdVar, InterfaceC5380e interfaceC5380e) {
        return J.f24997a;
    }

    protected abstract Object zzh(zzsc zzscVar, InterfaceC5380e interfaceC5380e) throws zzbd;

    protected Object zzi(String str, long j10, Exception exc, InterfaceC5380e interfaceC5380e) {
        return J.f24997a;
    }

    protected Object zzj(Exception exc, InterfaceC5380e interfaceC5380e) {
        return zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzap, exc.getMessage()));
    }

    protected void zzk(zzsr zzsrVar) {
    }

    public final boolean zzl() {
        return this.zza;
    }
}
