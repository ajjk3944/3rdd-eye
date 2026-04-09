package com.google.android.recaptcha.internal;

import Ii.AbstractC3059i;
import Ii.InterfaceC3088x;
import Yg.J;
import Yg.m;
import Yg.n;
import Zg.AbstractC3689v;
import android.app.Application;
import android.webkit.WebView;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes3.dex */
public final class zzja extends zze {
    public InterfaceC3088x zza;
    public zzfo zzb;
    private final zzek zzc;
    private zzsc zzf;
    private final zzek zzj;
    private final m zzk;
    private final m zzl;
    private final m zzm;
    private final m zzn;
    private final m zzo;
    private zzen zzp;
    private final zzbi zzq;
    private final Map zzd = zzjb.zza();
    private final Map zze = new LinkedHashMap();
    private final zzcb zzg = new zzcb(zzje.zza);
    private final zzjh zzh = zzjh.zzc();
    private final zzij zzi = new zzij(this);

    public zzja(zzek zzekVar, zzbi zzbiVar) {
        this.zzc = zzekVar;
        this.zzq = zzbiVar;
        zzek zzekVarZza = zzekVar.zza();
        zzekVarZza.zzc(zzekVar.zzd());
        this.zzj = zzekVarZza;
        int i10 = zzav.zza;
        this.zzk = n.b(zzis.zza);
        this.zzl = n.b(zzit.zza);
        this.zzm = n.b(zziu.zza);
        this.zzn = n.b(zziv.zza);
        this.zzo = n.b(zziw.zza);
    }

    private final Application zzD() {
        return (Application) this.zzo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzE(com.google.android.recaptcha.internal.zzsc r8, dh.InterfaceC5380e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzim
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzim r0 = (com.google.android.recaptcha.internal.zzim) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzim r0 = new com.google.android.recaptcha.internal.zzim
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.zza
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2d
            com.google.android.recaptcha.internal.zzja r8 = r0.zzd
            Yg.v.b(r9)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2b
            goto L4f
        L2b:
            r9 = move-exception
            goto L68
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            Yg.v.b(r9)
            Yg.m r9 = r7.zzn     // Catch: com.google.android.recaptcha.internal.zzbd -> L65
            java.lang.Object r9 = r9.getValue()     // Catch: com.google.android.recaptcha.internal.zzbd -> L65
            com.google.android.recaptcha.internal.zzff r9 = (com.google.android.recaptcha.internal.zzff) r9     // Catch: com.google.android.recaptcha.internal.zzbd -> L65
            com.google.android.recaptcha.internal.zzek r2 = r7.zzj     // Catch: com.google.android.recaptcha.internal.zzbd -> L65
            r0.zzd = r7     // Catch: com.google.android.recaptcha.internal.zzbd -> L65
            r0.zzc = r3     // Catch: com.google.android.recaptcha.internal.zzbd -> L65
            java.lang.Object r9 = r9.zzd(r8, r2, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L65
            if (r9 != r1) goto L4e
            return r1
        L4e:
            r8 = r7
        L4f:
            java.lang.String r9 = (java.lang.String) r9     // Catch: com.google.android.recaptcha.internal.zzbd -> L2b
            com.google.android.recaptcha.internal.zzbi r0 = r8.zzq     // Catch: com.google.android.recaptcha.internal.zzbd -> L2b
            Ii.N r1 = r0.zzb()     // Catch: com.google.android.recaptcha.internal.zzbd -> L2b
            com.google.android.recaptcha.internal.zzin r4 = new com.google.android.recaptcha.internal.zzin     // Catch: com.google.android.recaptcha.internal.zzbd -> L2b
            r0 = 0
            r4.<init>(r8, r9, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2b
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            Ii.AbstractC3059i.d(r1, r2, r3, r4, r5, r6)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2b
            goto L6f
        L65:
            r8 = move-exception
            r9 = r8
            r8 = r7
        L68:
            Ii.x r8 = r8.zzA()
            r8.a(r9)
        L6f:
            Yg.J r8 = Yg.J.f24997a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzE(com.google.android.recaptcha.internal.zzsc, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzF(java.lang.String r9, dh.InterfaceC5380e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.recaptcha.internal.zzio
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.recaptcha.internal.zzio r0 = (com.google.android.recaptcha.internal.zzio) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzio r0 = new com.google.android.recaptcha.internal.zzio
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.zza
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L33
            java.lang.String r9 = r0.zzf
            java.lang.String r1 = r0.zze
            com.google.android.recaptcha.internal.zzja r0 = r0.zzd
            Yg.v.b(r10)     // Catch: java.lang.Exception -> L31
            r3 = r9
            r4 = r1
            goto L67
        L31:
            r9 = move-exception
            goto L78
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            Yg.v.b(r10)
            com.google.android.recaptcha.internal.zzek r10 = r8.zzj
            r2 = 26
            com.google.android.recaptcha.internal.zzen r10 = r10.zzf(r2)
            r8.zzp = r10
            Yg.m r10 = r8.zzl     // Catch: java.lang.Exception -> L76
            java.lang.Object r10 = r10.getValue()     // Catch: java.lang.Exception -> L76
            com.google.android.recaptcha.internal.zzbr r10 = (com.google.android.recaptcha.internal.zzbr) r10     // Catch: java.lang.Exception -> L76
            java.lang.String r10 = r10.zza()     // Catch: java.lang.Exception -> L76
            r0.zzd = r8     // Catch: java.lang.Exception -> L76
            r0.zze = r9     // Catch: java.lang.Exception -> L76
            r0.zzf = r10     // Catch: java.lang.Exception -> L76
            r0.zzc = r3     // Catch: java.lang.Exception -> L76
            java.lang.Object r0 = r8.zzw(r0)     // Catch: java.lang.Exception -> L76
            if (r0 == r1) goto L75
            r4 = r9
            r3 = r10
            r10 = r0
            r0 = r8
        L67:
            r2 = r10
            android.webkit.WebView r2 = (android.webkit.WebView) r2     // Catch: java.lang.Exception -> L31
            java.lang.String r5 = "text/html"
            java.lang.String r6 = "utf-8"
            r7 = 0
            r2.loadDataWithBaseURL(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L31
            goto L96
        L75:
            return r1
        L76:
            r9 = move-exception
            r0 = r8
        L78:
            com.google.android.recaptcha.internal.zzbd r10 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r2 = com.google.android.recaptcha.internal.zzba.zzU
            java.lang.String r9 = r9.getMessage()
            r10.<init>(r1, r2, r9)
            com.google.android.recaptcha.internal.zzen r9 = r0.zzp
            if (r9 == 0) goto L8c
            r9.zzb(r10)
        L8c:
            r9 = 0
            r0.zzp = r9
            Ii.x r9 = r0.zzA()
            r9.a(r10)
        L96:
            Yg.J r9 = Yg.J.f24997a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzF(java.lang.String, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzG(java.lang.String r9, dh.InterfaceC5380e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.recaptcha.internal.zzix
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.recaptcha.internal.zzix r0 = (com.google.android.recaptcha.internal.zzix) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzix r0 = new com.google.android.recaptcha.internal.zzix
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.zza
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L30
            java.lang.String r9 = r0.zze
            com.google.android.recaptcha.internal.zzja r0 = r0.zzd
            Yg.v.b(r10)
            goto L7a
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            java.lang.String r9 = r0.zze
            com.google.android.recaptcha.internal.zzja r2 = r0.zzd
            Yg.v.b(r10)
            goto L5d
        L41:
            Yg.v.b(r10)
            com.google.android.recaptcha.internal.zzcb r10 = r8.zzg
            com.google.android.recaptcha.internal.zzje r2 = com.google.android.recaptcha.internal.zzje.zzd
            com.google.android.recaptcha.internal.zzje r5 = com.google.android.recaptcha.internal.zzje.zzc
            com.google.android.recaptcha.internal.zzje r6 = com.google.android.recaptcha.internal.zzje.zzb
            com.google.android.recaptcha.internal.zzje[] r2 = new com.google.android.recaptcha.internal.zzje[]{r2, r5, r6}
            r0.zzd = r8
            r0.zze = r9
            r0.zzc = r4
            java.lang.Object r10 = r10.zzb(r2, r0)
            if (r10 == r1) goto La1
            r2 = r8
        L5d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L68
            Yg.J r9 = Yg.J.f24997a
            return r9
        L68:
            com.google.android.recaptcha.internal.zzcb r10 = r2.zzg
            com.google.android.recaptcha.internal.zzje r5 = com.google.android.recaptcha.internal.zzje.zzb
            r0.zzd = r2
            r0.zze = r9
            r0.zzc = r3
            java.lang.Object r10 = r10.zzc(r5, r0)
            if (r10 != r1) goto L79
            goto La1
        L79:
            r0 = r2
        L7a:
            r10 = 0
            Ii.x r1 = Ii.AbstractC3092z.b(r10, r4, r10)
            r0.zza = r1
            com.google.android.recaptcha.internal.zzek r1 = r0.zzj
            r1.zzc(r9)
            r9 = 42
            com.google.android.recaptcha.internal.zzen r9 = r1.zzf(r9)
            com.google.android.recaptcha.internal.zzbi r1 = r0.zzq
            Ii.N r2 = r1.zza()
            com.google.android.recaptcha.internal.zziz r5 = new com.google.android.recaptcha.internal.zziz
            r5.<init>(r0, r9, r10)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            Ii.AbstractC3059i.d(r2, r3, r4, r5, r6, r7)
            Yg.J r9 = Yg.J.f24997a
            return r9
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzG(java.lang.String, dh.e):java.lang.Object");
    }

    public static final /* synthetic */ zzfk zzp(zzja zzjaVar) {
        return (zzfk) zzjaVar.zzm.getValue();
    }

    public final InterfaceC3088x zzA() {
        InterfaceC3088x interfaceC3088x = this.zza;
        if (interfaceC3088x != null) {
            return interfaceC3088x;
        }
        return null;
    }

    public final zzft zzC(zzsc zzscVar, zzcg zzcgVar, WebView webView) {
        zzfw zzfwVar = new zzfw(webView, this.zzq.zzb());
        zzhy zzhyVar = new zzhy();
        zzhyVar.zzb(AbstractC3689v.j1(zzscVar.zzP()));
        zzgf zzgfVar = new zzgf(zzfwVar, zzcgVar, new zzbo());
        zzhz zzhzVar = new zzhz(zzhyVar, new zzhw());
        zzgfVar.zze(3, zzD());
        zzgfVar.zze(5, zzig.zza());
        zzgfVar.zze(6, new zzia(zzD()));
        zzgfVar.zze(7, new zzic());
        zzgfVar.zze(8, new zzii(zzD()));
        zzgfVar.zze(9, new zzid(zzD()));
        zzgfVar.zze(10, new zzib(zzD()));
        return new zzft(this.zzq.zzd(), zzgfVar, zzhzVar, zzfn.zza());
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final zzen zza(String str) {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(str);
        return zzekVar.zzf(33);
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final zzen zzb() {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(32);
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzd(String str, InterfaceC5380e interfaceC5380e) {
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        return zzshVarZzf.zzk();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.Object zzf(java.lang.String r18, dh.InterfaceC5380e r19) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzf(java.lang.String, dh.e):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzg(zzbd zzbdVar, InterfaceC5380e interfaceC5380e) {
        if (AbstractC6492s.d(zzbdVar.zza(), zzba.zzb)) {
            zzen zzenVar = this.zzp;
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVar);
            }
            this.zzp = null;
        }
        return J.f24997a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (zzG(r6, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r6.zzc(r7, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.Object zzh(com.google.android.recaptcha.internal.zzsc r6, dh.InterfaceC5380e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzir
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzir r0 = (com.google.android.recaptcha.internal.zzir) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzir r0 = new com.google.android.recaptcha.internal.zzir
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.zza
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2c
            Yg.v.b(r7)
            goto L5f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            Yg.v.b(r7)
            goto L75
        L39:
            Yg.v.b(r7)
            boolean r7 = r6.zzT()
            if (r7 == 0) goto L68
            boolean r7 = r6.zzR()
            if (r7 == 0) goto L68
            boolean r7 = r6.zzQ()
            if (r7 != 0) goto L4f
            goto L68
        L4f:
            r5.zzf = r6
            com.google.android.recaptcha.internal.zzek r6 = r5.zzc
            java.lang.String r6 = r6.zzd()
            r0.zzc = r3
            java.lang.Object r6 = r5.zzG(r6, r0)
            if (r6 == r1) goto L74
        L5f:
            Yg.u$a r6 = Yg.u.f25017b
            Yg.J r6 = Yg.J.f24997a
            java.lang.Object r6 = Yg.u.c(r6)
            return r6
        L68:
            com.google.android.recaptcha.internal.zzcb r6 = r5.zzg
            com.google.android.recaptcha.internal.zzje r7 = com.google.android.recaptcha.internal.zzje.zzd
            r0.zzc = r4
            java.lang.Object r6 = r6.zzc(r7, r0)
            if (r6 != r1) goto L75
        L74:
            return r1
        L75:
            Yg.u$a r6 = Yg.u.f25017b
            com.google.android.recaptcha.internal.zzbd r6 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r7 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzav
            r1 = 0
            r6.<init>(r7, r0, r1)
            java.lang.Object r6 = Yg.v.a(r6)
            java.lang.Object r6 = Yg.u.c(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzh(com.google.android.recaptcha.internal.zzsc, dh.e):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzi(String str, long j10, Exception exc, InterfaceC5380e interfaceC5380e) {
        exc.getMessage();
        InterfaceC3088x interfaceC3088x = (InterfaceC3088x) this.zze.remove(str);
        if (interfaceC3088x != null) {
            kotlin.coroutines.jvm.internal.b.a(interfaceC3088x.a(exc));
        }
        return J.f24997a;
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzj(Exception exc, InterfaceC5380e interfaceC5380e) {
        return ((exc instanceof TimeoutCancellationException) && this.zzi.zza() == null) ? new zzbd(zzbb.zzc, zzba.zzH, null) : zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzV, exc.getMessage()));
    }

    public final zzcb zzm() {
        return this.zzg;
    }

    public final zzij zzq() {
        return this.zzi;
    }

    public final Object zzw(InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(this.zzq.zzb().getCoroutineContext(), new zzjc((zzjd) this.zzk.getValue(), zzD(), null), interfaceC5380e);
    }

    public final Object zzx(InterfaceC5380e interfaceC5380e) {
        Object objG = AbstractC3059i.g(this.zzq.zzb().getCoroutineContext(), new zzil(this, null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : J.f24997a;
    }
}
