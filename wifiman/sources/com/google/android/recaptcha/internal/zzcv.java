package com.google.android.recaptcha.internal;

import Ti.g;
import Yg.n;
import android.app.Application;
import com.google.android.gms.common.api.ApiException;
import com.google.android.recaptcha.RecaptchaException;
import dh.InterfaceC5380e;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;
import kotlinx.coroutines.TimeoutCancellationException;
import t1.AbstractC8021a;

/* loaded from: classes3.dex */
public final class zzcv {
    private final Application zza;
    private zzdc zzc;
    private final zzl zze;
    private final Ti.a zzb = g.b(false, 1, null);
    private final String zzd = UUID.randomUUID().toString();
    private zzbi zzf = new zzbi();

    public zzcv(Application application) {
        this.zza = application;
        int i10 = 1;
        this.zze = new zzl(null, i10, 0 == true ? 1 : 0);
        int i11 = zzav.zza;
        zzaw[] zzawVarArr = {new zzaw(zzaz.class.getName().hashCode(), new zzaz(null, 1, null)), new zzaw(zzfu.class.getName().hashCode(), new zzfu()), new zzaw(zzbe.class.getName().hashCode(), new zzbe()), new zzaw(zzjd.class.getName().hashCode(), new zzjd()), new zzaw(zzbr.class.getName().hashCode(), new zzbr("https://www.recaptcha.net/recaptcha/api3")), new zzaw(zzex.class.getName().hashCode(), new zzex(0 == true ? 1 : 0, i10, 0 == true ? 1 : 0)), new zzaw(zzfk.class.getName().hashCode(), new zzfk(true)), new zzaw(Application.class.getName().hashCode(), application), new zzaw(zzbf.class.getName().hashCode(), new zzbf(application)), new zzaw(zzfj.class.getName().hashCode(), new zzfj()), new zzaw(zzaq.class.getName().hashCode(), new zzbm(application)), new zzaw(zzey.class.getName().hashCode(), new zzfa()), new zzaw(zzff.class.getName().hashCode(), new zzff())};
        for (int i12 = 0; i12 < 13; i12++) {
            zzaw zzawVar = zzawVarArr[i12];
            if (!zzav.zzc.containsKey(Integer.valueOf(zzawVar.zza()))) {
                zzav.zzc.put(Integer.valueOf(zzawVar.zza()), zzawVar);
            }
        }
    }

    public static final /* synthetic */ zzdc zza(zzcv zzcvVar, String str) throws zzbd {
        zzdc zzdcVar = zzcvVar.zzc;
        if (zzdcVar == null) {
            return null;
        }
        if (AbstractC6492s.d(zzdcVar.zzd(), str)) {
            return zzdcVar;
        }
        throw new zzbd(zzbb.zzd, zzba.zzam, null);
    }

    public static final /* synthetic */ void zzc(zzcv zzcvVar, long j10) throws zzbd {
        if (j10 < 5000) {
            throw new zzbd(zzbb.zzj, zzba.zzI, null);
        }
        if (AbstractC8021a.a(zzcvVar.zza, "android.permission.INTERNET") != 0) {
            throw new zzbd(zzbb.zzc, zzba.zzao, null);
        }
    }

    public static final /* synthetic */ zzcn zze(zzcv zzcvVar, String str, zzbi zzbiVar, zzch zzchVar, zzek zzekVar) {
        zzdt zzdtVar = new zzdt(str, zzbiVar, zzekVar, zzcvVar.zze);
        return AbstractC6492s.d(zzchVar, zzch.zza) ? new zzef(zzdtVar) : new zzec(zzdtVar, zzbiVar, zzekVar, new zzbo());
    }

    public static /* synthetic */ Object zzh(zzcv zzcvVar, String str, long j10, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, InterfaceC5380e interfaceC5380e, int i10, Object obj) throws RecaptchaException, TimeoutCancellationException, ApiException {
        return zzcvVar.zzg(str, (i10 & 2) != 0 ? 10000L : j10, null, (i10 & 8) != 0 ? zzcvVar.zzf : zzbiVar, (i10 & 16) != 0 ? zzch.zza : zzchVar, interfaceC5380e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzj(java.lang.String r6, int r7, mh.InterfaceC6839p r8, dh.InterfaceC5380e r9) throws com.google.android.recaptcha.RecaptchaException {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzcu
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzcu r0 = (com.google.android.recaptcha.internal.zzcu) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcu r0 = new com.google.android.recaptcha.internal.zzcu
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.zza
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L2f
            com.google.android.recaptcha.internal.zzen r6 = r0.zzd
            Yg.v.b(r9)     // Catch: java.lang.Exception -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            goto L51
        L2b:
            r7 = move-exception
            goto L5d
        L2d:
            r7 = move-exception
            goto L75
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            Yg.v.b(r9)
            com.google.android.recaptcha.internal.zzbi r9 = r5.zzf
            com.google.android.recaptcha.internal.zzek r6 = r5.zzk(r6, r9, r7)
            r7 = 6
            com.google.android.recaptcha.internal.zzen r7 = r6.zzf(r7)
            r0.zzd = r7     // Catch: java.lang.Exception -> L56 com.google.android.recaptcha.internal.zzbd -> L58
            r0.zzc = r3     // Catch: java.lang.Exception -> L56 com.google.android.recaptcha.internal.zzbd -> L58
            java.lang.Object r9 = r8.invoke(r6, r0)     // Catch: java.lang.Exception -> L56 com.google.android.recaptcha.internal.zzbd -> L58
            if (r9 == r1) goto L55
            r6 = r7
        L51:
            r6.zza()     // Catch: java.lang.Exception -> L2b com.google.android.recaptcha.internal.zzbd -> L2d
            return r9
        L55:
            return r1
        L56:
            r6 = move-exception
            goto L5a
        L58:
            r6 = move-exception
            goto L72
        L5a:
            r4 = r7
            r7 = r6
            r6 = r4
        L5d:
            com.google.android.recaptcha.internal.zzbd r8 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r9 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zza
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r9, r0, r7)
            r6.zzb(r8)
            com.google.android.recaptcha.RecaptchaException r6 = r8.zzc()
            throw r6
        L72:
            r4 = r7
            r7 = r6
            r6 = r4
        L75:
            r6.zzb(r7)
            com.google.android.recaptcha.RecaptchaException r6 = r7.zzc()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcv.zzj(java.lang.String, int, mh.p, dh.e):java.lang.Object");
    }

    private final zzek zzk(String str, zzbi zzbiVar, int i10) {
        String string = UUID.randomUUID().toString();
        int i11 = zzav.zza;
        zzes zzesVar = new zzes(this.zza, new zzeu(((zzbr) n.b(zzcr.zza).getValue()).zzc()), zzbiVar.zza());
        zzek zzekVar = new zzek(str, this.zzd, string, i10, this.zza, zzesVar, null);
        zzekVar.zzc(string);
        return zzekVar;
    }

    public final zzbi zzd() {
        return this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzg(java.lang.String r23, long r24, com.google.android.recaptcha.internal.zzcn r26, com.google.android.recaptcha.internal.zzbi r27, com.google.android.recaptcha.internal.zzch r28, dh.InterfaceC5380e r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcv.zzg(java.lang.String, long, com.google.android.recaptcha.internal.zzcn, com.google.android.recaptcha.internal.zzbi, com.google.android.recaptcha.internal.zzch, dh.e):java.lang.Object");
    }
}
