package com.google.android.recaptcha.internal;

import Ii.AbstractC3059i;
import Yg.m;
import Yg.n;
import Yg.s;
import Yg.z;
import Zg.AbstractC3689v;
import Zg.U;
import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.recaptcha.RecaptchaAction;
import dh.InterfaceC5380e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* loaded from: classes3.dex */
public final class zzdt {
    private final String zza;
    private final zzek zzb;
    private final zzl zzc;
    private final m zzd;
    private final m zze;
    private final m zzf;
    private final m zzg;
    private final m zzh;
    private final zzbi zzi;

    public zzdt(String str, zzbi zzbiVar, zzek zzekVar, zzl zzlVar) {
        this.zza = str;
        this.zzi = zzbiVar;
        this.zzb = zzekVar;
        this.zzc = zzlVar;
        int i10 = zzav.zza;
        this.zzd = n.b(zzdm.zza);
        this.zze = n.b(zzdn.zza);
        this.zzf = n.b(zzdo.zza);
        this.zzg = n.b(zzdp.zza);
        this.zzh = n.b(zzdq.zza);
    }

    public static final /* synthetic */ zzbr zzd(zzdt zzdtVar) {
        return (zzbr) zzdtVar.zze.getValue();
    }

    public static final /* synthetic */ zzff zzg(zzdt zzdtVar) {
        return (zzff) zzdtVar.zzd.getValue();
    }

    public static final /* synthetic */ zzfj zzh(zzdt zzdtVar) {
        return (zzfj) zzdtVar.zzg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application zzr() {
        return (Application) this.zzh.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbd zzs(Exception exc, zzbd zzbdVar) {
        return !zzx() ? new zzbd(zzbb.zzc, zzba.zzao, exc.getMessage()) : zzbdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbf zzt() {
        return (zzbf) this.zzf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzek zzu(String str) {
        zzek zzekVarZza = this.zzb.zza();
        zzekVarZza.zzc(str);
        return zzekVarZza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzv(com.google.android.recaptcha.internal.zzsc r11, long r12, dh.InterfaceC5380e r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzdj
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzdj r0 = (com.google.android.recaptcha.internal.zzdj) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdj r0 = new com.google.android.recaptcha.internal.zzdj
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.zzb
            java.lang.Object r7 = eh.AbstractC5467b.g()
            int r1 = r0.zzd
            r8 = 2
            r9 = 1
            if (r1 == 0) goto L48
            if (r1 == r9) goto L3a
            if (r1 == r8) goto L31
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            java.lang.Object r11 = r0.zza
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            Yg.v.b(r14)
            goto Lbe
        L3a:
            java.lang.Object r11 = r0.zza
            com.google.android.recaptcha.internal.zzdt r11 = (com.google.android.recaptcha.internal.zzdt) r11
            Yg.v.b(r14)
            Yg.u r14 = (Yg.u) r14
            java.lang.Object r12 = r14.o()
            goto L83
        L48:
            Yg.v.b(r14)
            java.lang.String r14 = r11.zzO()
            zzy(r14)
            java.util.List r14 = r10.zzw()
            java.util.Iterator r14 = r14.iterator()
        L5a:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L70
            java.lang.Object r1 = r14.next()
            com.google.android.recaptcha.internal.zze r1 = (com.google.android.recaptcha.internal.zze) r1
            com.google.android.recaptcha.internal.zzl r2 = r10.zzc
            com.google.android.recaptcha.internal.zze[] r1 = new com.google.android.recaptcha.internal.zze[]{r1}
            r2.zzf(r1)
            goto L5a
        L70:
            com.google.android.recaptcha.internal.zzl r1 = r10.zzc
            com.google.android.recaptcha.internal.zzek r5 = r10.zzb
            r0.zza = r10
            r0.zzd = r9
            r2 = r12
            r4 = r11
            r6 = r0
            java.lang.Object r12 = r1.zzc(r2, r4, r5, r6)
            if (r12 != r7) goto L82
            goto Lbc
        L82:
            r11 = r10
        L83:
            java.lang.Throwable r12 = Yg.u.h(r12)
            if (r12 != 0) goto L8c
            Yg.J r11 = Yg.J.f24997a
            return r11
        L8c:
            com.google.android.recaptcha.internal.zzbi r13 = r11.zzi
            Ii.N r13 = r13.zzd()
            dh.i r13 = r13.getCoroutineContext()
            r14 = 0
            Ii.A0.i(r13, r14, r9, r14)
            com.google.android.recaptcha.internal.zzbi r11 = r11.zzi
            Ii.N r11 = r11.zzd()
            dh.i r11 = r11.getCoroutineContext()
            Ii.y0 r11 = Ii.A0.m(r11)
            zi.j r11 = r11.getChildren()
            java.util.List r11 = zi.AbstractC8783m.Z(r11)
            java.util.Collection r11 = (java.util.Collection) r11
            r0.zza = r12
            r0.zzd = r8
            java.lang.Object r11 = Ii.AbstractC3053f.b(r11, r0)
            if (r11 != r7) goto Lbd
        Lbc:
            return r7
        Lbd:
            r11 = r12
        Lbe:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzv(com.google.android.recaptcha.internal.zzsc, long, dh.e):java.lang.Object");
    }

    private final List zzw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzv(zzr(), this.zzb.zza(), this.zzi, null, 8, null));
        arrayList.add(new zzja(this.zzb, this.zzi));
        return AbstractC3689v.i1(arrayList);
    }

    private final boolean zzx() {
        NetworkCapabilities networkCapabilities;
        int i10 = zzav.zza;
        try {
            Object systemService = zzr().getSystemService("connectivity");
            AbstractC6492s.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static final void zzy(String str) throws zzbd {
        try {
            zzrv zzrvVarZzj = zzrv.zzj(zzbt.zza(str));
            int i10 = zzav.zza;
            ((zzfu) n.b(zzde.zza).getValue()).zza(zzrvVarZzj);
        } catch (Exception e10) {
            throw new zzbd(zzbb.zzl, zzba.zzan, e10.getMessage());
        }
    }

    public final zzsp zzi(RecaptchaAction recaptchaAction, zzsi zzsiVar, zzsc zzscVar) {
        zzso zzsoVarZzf = zzsp.zzf();
        zzsoVarZzf.zzs(this.zza);
        zzsoVarZzf.zze(recaptchaAction.getAction());
        zzsoVarZzf.zzf(zzscVar.zzN());
        zzsoVarZzf.zzq(zzscVar.zzM());
        zzsoVarZzf.zzr(zzsiVar);
        return (zzsp) zzsoVarZzf.zzk();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzl(java.lang.String r6, long r7, dh.InterfaceC5380e r9) throws com.google.android.recaptcha.internal.zzbd {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzdd
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzdd r0 = (com.google.android.recaptcha.internal.zzdd) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdd r0 = new com.google.android.recaptcha.internal.zzdd
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.zza
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L31
            com.google.android.recaptcha.internal.zzen r6 = r0.zzd
            Yg.v.b(r9)     // Catch: java.lang.Exception -> L2b kotlinx.coroutines.TimeoutCancellationException -> L2d com.google.android.recaptcha.internal.zzbd -> L2f
            goto L56
        L2b:
            r7 = move-exception
            goto L67
        L2d:
            r7 = move-exception
            goto L79
        L2f:
            r7 = move-exception
            goto L8b
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            Yg.v.b(r9)
            com.google.android.recaptcha.internal.zzek r9 = r5.zzu(r6)
            r2 = 27
            com.google.android.recaptcha.internal.zzen r9 = r9.zzf(r2)
            com.google.android.recaptcha.internal.zzl r2 = r5.zzc     // Catch: java.lang.Exception -> L5d kotlinx.coroutines.TimeoutCancellationException -> L60 com.google.android.recaptcha.internal.zzbd -> L63
            r0.zzd = r9     // Catch: java.lang.Exception -> L5d kotlinx.coroutines.TimeoutCancellationException -> L60 com.google.android.recaptcha.internal.zzbd -> L63
            r0.zzc = r3     // Catch: java.lang.Exception -> L5d kotlinx.coroutines.TimeoutCancellationException -> L60 com.google.android.recaptcha.internal.zzbd -> L63
            java.lang.Object r6 = r2.zzb(r6, r7, r0)     // Catch: java.lang.Exception -> L5d kotlinx.coroutines.TimeoutCancellationException -> L60 com.google.android.recaptcha.internal.zzbd -> L63
            if (r6 == r1) goto L5c
            r4 = r9
            r9 = r6
            r6 = r4
        L56:
            com.google.android.recaptcha.internal.zzsi r9 = (com.google.android.recaptcha.internal.zzsi) r9     // Catch: java.lang.Exception -> L2b kotlinx.coroutines.TimeoutCancellationException -> L2d com.google.android.recaptcha.internal.zzbd -> L2f
            r6.zza()     // Catch: java.lang.Exception -> L2b kotlinx.coroutines.TimeoutCancellationException -> L2d com.google.android.recaptcha.internal.zzbd -> L2f
            return r9
        L5c:
            return r1
        L5d:
            r6 = move-exception
            r7 = r6
            goto L66
        L60:
            r6 = move-exception
            r7 = r6
            goto L78
        L63:
            r6 = move-exception
            r7 = r6
            goto L8a
        L66:
            r6 = r9
        L67:
            com.google.android.recaptcha.internal.zzbd r8 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r9 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzaa
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r9, r0, r7)
            r6.zzb(r8)
            throw r8
        L78:
            r6 = r9
        L79:
            com.google.android.recaptcha.internal.zzbd r8 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r9 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r9, r0, r7)
            r6.zzb(r8)
            throw r8
        L8a:
            r6 = r9
        L8b:
            r6.zzb(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzl(java.lang.String, long, dh.e):java.lang.Object");
    }

    public final Object zzm(zzsp zzspVar, String str, long j10, InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(this.zzi.zza().getCoroutineContext(), new zzdg(this, str, j10, zzspVar, null), interfaceC5380e);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzn(com.google.android.recaptcha.internal.zzsc r11, long r12, dh.InterfaceC5380e r14) throws com.google.android.recaptcha.internal.zzbd {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzdk
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzdk r0 = (com.google.android.recaptcha.internal.zzdk) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdk r0 = new com.google.android.recaptcha.internal.zzdk
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.zza
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L2f
            Yg.v.b(r14)     // Catch: java.lang.Exception -> L29 kotlinx.coroutines.TimeoutCancellationException -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            goto L4e
        L29:
            r11 = move-exception
            goto L51
        L2b:
            r11 = move-exception
            goto L5f
        L2d:
            r11 = move-exception
            goto L6d
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            Yg.v.b(r14)
            com.google.android.recaptcha.internal.zzdl r14 = new com.google.android.recaptcha.internal.zzdl     // Catch: java.lang.Exception -> L29 kotlinx.coroutines.TimeoutCancellationException -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Exception -> L29 kotlinx.coroutines.TimeoutCancellationException -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            r0.zzc = r3     // Catch: java.lang.Exception -> L29 kotlinx.coroutines.TimeoutCancellationException -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            java.lang.Object r11 = Ii.W0.c(r12, r14, r0)     // Catch: java.lang.Exception -> L29 kotlinx.coroutines.TimeoutCancellationException -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            if (r11 != r1) goto L4e
            return r1
        L4e:
            Yg.J r11 = Yg.J.f24997a
            return r11
        L51:
            com.google.android.recaptcha.internal.zzbd r12 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r13 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r14 = com.google.android.recaptcha.internal.zzba.zzap
            java.lang.String r11 = r11.getMessage()
            r12.<init>(r13, r14, r11)
            throw r12
        L5f:
            com.google.android.recaptcha.internal.zzbd r12 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r13 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r14 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r11 = r11.getMessage()
            r12.<init>(r13, r14, r11)
            throw r12
        L6d:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzn(com.google.android.recaptcha.internal.zzsc, long, dh.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzo(long r7, dh.InterfaceC5380e r9) throws com.google.android.recaptcha.internal.zzbd {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzdr
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzdr r0 = (com.google.android.recaptcha.internal.zzdr) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdr r0 = new com.google.android.recaptcha.internal.zzdr
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.zza
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L34
            com.google.android.recaptcha.internal.zzen r7 = r0.zze
            com.google.android.recaptcha.internal.zzdt r8 = r0.zzd
            Yg.v.b(r9)     // Catch: java.lang.Exception -> L2d kotlinx.coroutines.TimeoutCancellationException -> L2f com.google.android.recaptcha.internal.zzbd -> L31
            goto L5e
        L2d:
            r9 = move-exception
            goto L6c
        L2f:
            r9 = move-exception
            goto L85
        L31:
            r9 = move-exception
            goto L9e
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            Yg.v.b(r9)
            com.google.android.recaptcha.internal.zzek r9 = r6.zzb
            r2 = 22
            com.google.android.recaptcha.internal.zzen r9 = r9.zzf(r2)
            com.google.android.recaptcha.internal.zzds r2 = new com.google.android.recaptcha.internal.zzds     // Catch: java.lang.Exception -> L62 kotlinx.coroutines.TimeoutCancellationException -> L64 com.google.android.recaptcha.internal.zzbd -> L66
            r4 = 0
            r2.<init>(r6, r9, r4)     // Catch: java.lang.Exception -> L62 kotlinx.coroutines.TimeoutCancellationException -> L64 com.google.android.recaptcha.internal.zzbd -> L66
            r0.zzd = r6     // Catch: java.lang.Exception -> L62 kotlinx.coroutines.TimeoutCancellationException -> L64 com.google.android.recaptcha.internal.zzbd -> L66
            r0.zze = r9     // Catch: java.lang.Exception -> L62 kotlinx.coroutines.TimeoutCancellationException -> L64 com.google.android.recaptcha.internal.zzbd -> L66
            r0.zzc = r3     // Catch: java.lang.Exception -> L62 kotlinx.coroutines.TimeoutCancellationException -> L64 com.google.android.recaptcha.internal.zzbd -> L66
            java.lang.Object r7 = Ii.W0.c(r7, r2, r0)     // Catch: java.lang.Exception -> L62 kotlinx.coroutines.TimeoutCancellationException -> L64 com.google.android.recaptcha.internal.zzbd -> L66
            if (r7 == r1) goto L61
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L5e:
            com.google.android.recaptcha.internal.zzsc r9 = (com.google.android.recaptcha.internal.zzsc) r9     // Catch: java.lang.Exception -> L2d kotlinx.coroutines.TimeoutCancellationException -> L2f com.google.android.recaptcha.internal.zzbd -> L31
            return r9
        L61:
            return r1
        L62:
            r7 = move-exception
            goto L68
        L64:
            r7 = move-exception
            goto L81
        L66:
            r7 = move-exception
            goto L9a
        L68:
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L6c:
            com.google.android.recaptcha.internal.zzbd r0 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzc
            com.google.android.recaptcha.internal.zzba r2 = com.google.android.recaptcha.internal.zzba.zzaw
            java.lang.String r3 = r9.getMessage()
            r0.<init>(r1, r2, r3)
            com.google.android.recaptcha.internal.zzbd r8 = r8.zzs(r9, r0)
            r7.zzb(r8)
            throw r8
        L81:
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L85:
            com.google.android.recaptcha.internal.zzbd r0 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzc
            com.google.android.recaptcha.internal.zzba r2 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r3 = r9.getMessage()
            r0.<init>(r1, r2, r3)
            com.google.android.recaptcha.internal.zzbd r8 = r8.zzs(r9, r0)
            r7.zzb(r8)
            throw r8
        L9a:
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L9e:
            com.google.android.recaptcha.internal.zzbb r0 = r9.zzb()
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzc
            boolean r0 = kotlin.jvm.internal.AbstractC6492s.d(r0, r1)
            if (r0 == 0) goto Lae
            com.google.android.recaptcha.internal.zzbd r9 = r8.zzs(r9, r9)
        Lae:
            r7.zzb(r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzo(long, dh.e):java.lang.Object");
    }

    public final void zzq(String str, zzsr zzsrVar) {
        zzen zzenVarZzf = zzu(str).zzf(29);
        try {
            List<zzst> listZzk = zzsrVar.zzk();
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(listZzk, 10)), 16));
            for (zzst zzstVar : listZzk) {
                s sVarA = z.a(zzstVar.zzg(), zzstVar.zzi());
                linkedHashMap.put(sVarA.h(), sVarA.j());
            }
            zzt().zzb(linkedHashMap);
            this.zzc.zzg(zzsrVar);
            zzenVarZzf.zza();
        } catch (zzbd e10) {
            zzenVarZzf.zzb(e10);
        } catch (Exception e11) {
            zzenVarZzf.zzb(new zzbd(zzbb.zzb, zzba.zzas, e11.getMessage()));
        }
    }
}
