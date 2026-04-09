package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.B2;
import com.google.android.gms.internal.measurement.C4300a2;
import java.util.Collections;
import java.util.HashMap;
import org.snmp4j.util.SnmpConfigurator;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
public final class X6 extends P6 {
    X6(C4833d7 c4833d7) {
        super(c4833d7);
    }

    private final boolean s(String str, String str2) {
        C4864h2 c4864h2Q0;
        C4300a2 c4300a2J = n().J(str);
        if (c4300a2J == null || (c4864h2Q0 = m().Q0(str)) == null) {
            return false;
        }
        if ((c4300a2J.Y() && c4300a2J.P().j() == 100) || g().B0(str, c4864h2Q0.v())) {
            return true;
        }
        return !TextUtils.isEmpty(str2) && Math.abs(str2.hashCode() % 100) < c4300a2J.P().j();
    }

    private final String t(String str) {
        String strP = n().P(str);
        if (TextUtils.isEmpty(strP)) {
            return (String) N.f36111r.a(null);
        }
        Uri uri = Uri.parse((String) N.f36111r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(strP + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
    }

    private static boolean u(String str) {
        String str2 = (String) N.f36115t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4893l a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ F b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ D2 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ X2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4915n5 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ x7 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ s7 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ C7 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ C4933q m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ C4873i3 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ C4924o6 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ X6 p() {
        return super.p();
    }

    public final W6 q(String str) {
        C4893l c4893lA = a();
        C4936q2 c4936q2 = N.f36040P0;
        W6 w62 = null;
        if (!c4893lA.p(c4936q2)) {
            C4864h2 c4864h2Q0 = m().Q0(str);
            if (c4864h2Q0 != null && s(str, c4864h2Q0.m())) {
                if (c4864h2Q0.C()) {
                    zzj().G().a("sgtm upload enabled in manifest.");
                    C4300a2 c4300a2J = n().J(c4864h2Q0.l());
                    if (c4300a2J != null && c4300a2J.Y()) {
                        String strJ = c4300a2J.P().J();
                        if (!TextUtils.isEmpty(strJ)) {
                            String strH = c4300a2J.P().H();
                            zzj().G().c("sgtm configured with upload_url, server_info", strJ, TextUtils.isEmpty(strH) ? SnmpConfigurator.O_PRIV_PASSPHRASE : "N");
                            if (TextUtils.isEmpty(strH)) {
                                w62 = new W6(strJ, EnumC4954s5.SGTM);
                            } else {
                                HashMap map = new HashMap();
                                map.put("x-sgtm-server-info", strH);
                                if (!TextUtils.isEmpty(c4864h2Q0.v())) {
                                    map.put("x-gtm-server-preview", c4864h2Q0.v());
                                }
                                w62 = new W6(strJ, map, EnumC4954s5.SGTM);
                            }
                        }
                    }
                }
                return w62 != null ? w62 : new W6(t(str), EnumC4954s5.GOOGLE_ANALYTICS);
            }
            return new W6(t(str), EnumC4954s5.GOOGLE_ANALYTICS);
        }
        C4864h2 c4864h2Q02 = m().Q0(str);
        if (c4864h2Q02 == null || !c4864h2Q02.C()) {
            return new W6(t(str), EnumC4954s5.GOOGLE_ANALYTICS);
        }
        B2.a aVarF = com.google.android.gms.internal.measurement.B2.F();
        B2.d dVar = B2.d.GA_UPLOAD;
        B2.a aVarU = aVarF.x(dVar).u((B2.b) AbstractC7901p.l(B2.b.zza(c4864h2Q02.F())));
        if (!s(str, c4864h2Q02.m())) {
            aVarU.w(B2.c.NOT_IN_ROLLOUT);
            return new W6(t(str), Collections.emptyMap(), EnumC4954s5.GOOGLE_ANALYTICS, (com.google.android.gms.internal.measurement.B2) ((com.google.android.gms.internal.measurement.D4) aVarU.p()));
        }
        String strL = c4864h2Q02.l();
        aVarU.x(dVar);
        C4300a2 c4300a2J2 = n().J(c4864h2Q02.l());
        if (c4300a2J2 == null || !c4300a2J2.Y()) {
            zzj().G().b("[sgtm] Missing sgtm_setting in remote config. appId", strL);
            aVarU.w(B2.c.MISSING_SGTM_SETTINGS);
        } else {
            HashMap map2 = new HashMap();
            if (!TextUtils.isEmpty(c4864h2Q02.v())) {
                map2.put("x-gtm-server-preview", c4864h2Q02.v());
            }
            String strI = c4300a2J2.P().I();
            B2.b bVarZza = B2.b.zza(c4864h2Q02.F());
            if (bVarZza != null && bVarZza != B2.b.CLIENT_UPLOAD_ELIGIBLE) {
                aVarU.u(bVarZza);
            } else if (!a().p(c4936q2)) {
                aVarU.u(B2.b.SERVICE_FLAG_OFF);
            } else if (u(c4864h2Q02.l())) {
                aVarU.u(B2.b.PINNED_TO_SERVICE_UPLOAD);
            } else if (TextUtils.isEmpty(strI)) {
                aVarU.u(B2.b.MISSING_SGTM_SERVER_URL);
            } else {
                zzj().G().b("[sgtm] Eligible for client side upload. appId", strL);
                aVarU.x(B2.d.SDK_CLIENT_UPLOAD).u(B2.b.CLIENT_UPLOAD_ELIGIBLE);
                w62 = new W6(strI, map2, EnumC4954s5.SGTM_CLIENT, (com.google.android.gms.internal.measurement.B2) ((com.google.android.gms.internal.measurement.D4) aVarU.p()));
            }
            c4300a2J2.P().J();
            c4300a2J2.P().H();
            if (TextUtils.isEmpty(strI)) {
                aVarU.w(B2.c.NON_PLAY_MISSING_SGTM_SERVER_URL);
                zzj().G().b("[sgtm] Local service, missing sgtm_server_url", c4864h2Q02.l());
            } else {
                zzj().G().b("[sgtm] Eligible for local service direct upload. appId", strL);
                aVarU.x(B2.d.SDK_SERVICE_UPLOAD).w(B2.c.SERVICE_UPLOAD_ELIGIBLE);
                w62 = new W6(strI, map2, EnumC4954s5.SGTM, (com.google.android.gms.internal.measurement.B2) ((com.google.android.gms.internal.measurement.D4) aVarU.p()));
            }
        }
        return w62 != null ? w62 : new W6(t(str), Collections.emptyMap(), EnumC4954s5.GOOGLE_ANALYTICS, (com.google.android.gms.internal.measurement.B2) ((com.google.android.gms.internal.measurement.D4) aVarU.p()));
    }

    final boolean r(String str, B2.b bVar) {
        C4300a2 c4300a2J;
        j();
        return a().p(N.f36040P0) && bVar == B2.b.CLIENT_UPLOAD_ELIGIBLE && !u(str) && (c4300a2J = n().J(str)) != null && c4300a2J.Y() && !c4300a2J.P().I().isEmpty();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.d zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ C4834e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ L2 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ C4952s3 zzl() {
        return super.zzl();
    }
}
