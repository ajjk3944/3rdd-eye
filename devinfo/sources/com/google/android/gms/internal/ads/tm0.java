package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tm0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16881a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16882b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16883c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16884d;

    public /* synthetic */ tm0(Object obj, Object obj2, Object obj3, int i4) {
        this.f16881a = i4;
        this.f16882b = obj;
        this.f16884d = obj2;
        this.f16883c = obj3;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void c(Object obj) {
        int i4;
        String str;
        JSONArray jSONArrayOptJSONArray;
        int i10;
        switch (this.f16881a) {
            case 0:
                Bundle bundle = ((t50) obj).f16705a;
                bundle.putString("consent_string", (String) this.f16882b);
                bundle.putString("fc_consent", (String) this.f16884d);
                Bundle bundle2 = (Bundle) this.f16883c;
                if (bundle2 != null) {
                    bundle.putBundle("iab_consent_info", bundle2);
                    return;
                }
                return;
            case 1:
                Bundle bundle3 = ((t50) obj).f16705a;
                bundle3.putString("rtb", (String) this.f16882b);
                if (((Boolean) va.s.f36163e.f36166c.a(sk.T4)).booleanValue()) {
                    String str2 = (String) this.f16884d;
                    if (!str2.isEmpty()) {
                        bundle3.putString("cld_status", str2);
                    }
                }
                Bundle bundle4 = (Bundle) this.f16883c;
                if (bundle4.isEmpty()) {
                    return;
                }
                bundle3.putBundle("adapter_initialization_status", bundle4);
                return;
            default:
                hq0 hq0Var = (hq0) this.f16882b;
                ArrayList<String> arrayList = hq0Var.f11947h;
                t50 t50Var = (t50) obj;
                if (arrayList == null) {
                    return;
                }
                if (arrayList.isEmpty()) {
                    t50Var.f16705a.putInt("native_version", 0);
                    return;
                }
                Bundle bundle5 = t50Var.f16705a;
                bundle5.putInt("native_version", 3);
                bundle5.putStringArrayList("native_templates", arrayList);
                bundle5.putStringArrayList("native_custom_templates", hq0Var.f11948i);
                qm qmVar = hq0Var.j;
                if (qmVar != null) {
                    if (qmVar.f15365a > 3) {
                        bundle5.putBoolean("enable_native_media_orientation", true);
                        int i11 = qmVar.f15371h;
                        String str3 = i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? AppLovinMediationProvider.UNKNOWN : "square" : "portrait" : "landscape" : "any";
                        if (!AppLovinMediationProvider.UNKNOWN.equals(str3)) {
                            bundle5.putString("native_media_orientation", str3);
                        }
                    }
                    int i12 = qmVar.f15367c;
                    String str4 = i12 != 0 ? i12 != 1 ? i12 != 2 ? AppLovinMediationProvider.UNKNOWN : "landscape" : "portrait" : "any";
                    if (!AppLovinMediationProvider.UNKNOWN.equals(str4)) {
                        bundle5.putString("native_image_orientation", str4);
                    }
                    bundle5.putBoolean("native_multiple_images", qmVar.f15368d);
                    bundle5.putBoolean("use_custom_mute", qmVar.g);
                    qm qmVar2 = ((hq0) this.f16882b).j;
                    if (qmVar2 != null && (i10 = qmVar2.f15372i) != 0) {
                        bundle5.putBoolean("sccg_tap", qmVar2.j);
                        bundle5.putInt("sccg_dir", i10);
                    }
                }
                PackageInfo packageInfo = (PackageInfo) this.f16884d;
                int i13 = packageInfo != null ? packageInfo.versionCode : 0;
                ya.c0 c0Var = (ya.c0) this.f16883c;
                c0Var.m();
                synchronized (c0Var.f37402a) {
                    i4 = c0Var.f37417r;
                }
                if (i13 > i4) {
                    c0Var.A();
                    c0Var.r(i13);
                }
                JSONObject jSONObjectZ = c0Var.z();
                String string = null;
                if (jSONObjectZ != null && (jSONArrayOptJSONArray = jSONObjectZ.optJSONArray(hq0Var.g)) != null) {
                    string = jSONArrayOptJSONArray.toString();
                }
                if (!TextUtils.isEmpty(string)) {
                    bundle5.putString("native_advanced_settings", string);
                }
                int i14 = hq0Var.f11950l;
                if (i14 > 1) {
                    bundle5.putInt("max_num_ads", i14);
                }
                op opVar = hq0Var.f11942b;
                if (opVar != null) {
                    String str5 = opVar.f14766c;
                    if (TextUtils.isEmpty(str5)) {
                        if (opVar.f14764a >= 2) {
                            int i15 = opVar.f14767d;
                            str = (i15 == 2 || i15 != 3) ? "l" : "p";
                        } else {
                            int i16 = opVar.f14765b;
                            if (i16 == 1) {
                                str = "l";
                            } else if (i16 != 2) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(i16).length() + 41);
                                sb2.append("Instream ad video aspect ratio ");
                                sb2.append(i16);
                                sb2.append(" is wrong.");
                                za.i.e(sb2.toString());
                                str = "l";
                            } else {
                                str = "p";
                            }
                        }
                        bundle5.putString("ia_var", str);
                    } else {
                        bundle5.putString("ad_tag", str5);
                    }
                    bundle5.putBoolean("instr", true);
                }
                if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16112ed)).booleanValue() || qmVar == null) {
                    return;
                }
                va.x2 x2Var = qmVar.f15370f;
                if (x2Var != null) {
                    Bundle bundle6 = new Bundle();
                    bundle6.putBoolean("startMuted", x2Var.f36183a);
                    bundle6.putBoolean("clickToExpandRequested", x2Var.f36185c);
                    bundle6.putBoolean("customControlsRequested", x2Var.f36184b);
                    bundle5.putBundle("video", bundle6);
                }
                bundle5.putBoolean("disable_image_loading", qmVar.f15366b);
                bundle5.putInt("preferred_ad_choices_position", qmVar.f15369e);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void h(Object obj) {
        int i4;
        switch (this.f16881a) {
            case 0:
            case 1:
                break;
            default:
                hq0 hq0Var = (hq0) this.f16882b;
                ArrayList arrayList = hq0Var.f11947h;
                t50 t50Var = (t50) obj;
                if (arrayList != null && !arrayList.isEmpty()) {
                    Bundle bundle = t50Var.f16706b;
                    qm qmVar = hq0Var.j;
                    if (qmVar != null && (i4 = qmVar.f15372i) != 0) {
                        bundle.putBoolean("sccg_tap", qmVar.j);
                        bundle.putInt("sccg_dir", i4);
                        break;
                    }
                }
                break;
        }
    }

    public tm0(String str, String str2, Bundle bundle) {
        this.f16881a = 1;
        this.f16882b = str;
        this.f16883c = bundle;
        this.f16884d = str2;
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void b(Object obj) {
    }
}
