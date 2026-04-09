package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2097r;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.sv0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fa2 {

    /* renamed from: a, reason: collision with root package name */
    private final vv0 f27255a;

    /* renamed from: b, reason: collision with root package name */
    private final x02 f27256b;

    /* renamed from: c, reason: collision with root package name */
    private final C4136j4 f27257c;

    /* renamed from: d, reason: collision with root package name */
    private final k9 f27258d;

    /* renamed from: e, reason: collision with root package name */
    private final du1 f27259e;

    public /* synthetic */ fa2(Context context) {
        this(context, new vv0(context), new x02(), new C4136j4(), new k9(), ew1.a.a().a(context));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.yandex.mobile.ads.impl.ea2] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.yandex.mobile.ads.impl.ea2] */
    public final ArrayList a(List videoAds) {
        Object next;
        Object next2;
        i9 ea2Var;
        kotlin.jvm.internal.l.f(videoAds, "videoAds");
        ArrayList arrayList = new ArrayList();
        Iterator it = videoAds.iterator();
        while (it.hasNext()) {
            za2 za2Var = (za2) it.next();
            nu nuVar = (nu) C2097r.q0(za2Var.e());
            i9 i9Var = null;
            if (nuVar != null) {
                du1 du1Var = this.f27259e;
                if (du1Var != null && du1Var.J() && za2Var.o()) {
                    String strK = za2Var.k();
                    if (strK == null) {
                        strK = "";
                    }
                    ea2Var = new ea2(za2Var, nuVar, new sv0.a(strK).a(), null, null, null, null);
                } else {
                    sv0 sv0VarA = this.f27255a.a(nuVar);
                    if (sv0VarA != null) {
                        hb2 videoAdExtensions = za2Var.l();
                        this.f27256b.getClass();
                        kotlin.jvm.internal.l.f(videoAdExtensions, "videoAdExtensions");
                        Iterator it2 = videoAdExtensions.a().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            p70 p70Var = (p70) next;
                            if (kotlin.jvm.internal.l.b(p70Var.a(), "social_ad_info") && p70Var.b().length() > 0) {
                                break;
                            }
                        }
                        p70 p70Var2 = (p70) next;
                        String strB = p70Var2 != null ? p70Var2.b() : null;
                        w02 w02Var = strB != null ? new w02(strB) : null;
                        this.f27257c.getClass();
                        String strA = C4136j4.a(videoAdExtensions);
                        this.f27257c.getClass();
                        String strA2 = C4136j4.a(videoAdExtensions);
                        JSONObject jSONObjectA = strA2 != null ? iq0.a(strA2) : null;
                        this.f27258d.getClass();
                        Iterator it3 = videoAdExtensions.a().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it3.next();
                            if (kotlin.jvm.internal.l.b(((p70) next2).a(), "AdTune")) {
                                break;
                            }
                        }
                        p70 p70Var3 = (p70) next2;
                        String strB2 = p70Var3 != null ? p70Var3.b() : null;
                        JSONObject jSONObjectA2 = strB2 != null ? iq0.a(strB2) : null;
                        if (jSONObjectA2 != null) {
                            boolean z10 = jSONObjectA2.optInt("show", 0) == 1;
                            String strOptString = jSONObjectA2.optString("token");
                            kotlin.jvm.internal.l.e(strOptString, "optString(...)");
                            String strOptString2 = jSONObjectA2.optString("advertiserInfo");
                            kotlin.jvm.internal.l.e(strOptString2, "optString(...)");
                            i9Var = new i9(strOptString, strOptString2, z10);
                        }
                        ea2Var = new ea2(za2Var, nuVar, sv0VarA, w02Var, strA, jSONObjectA, i9Var);
                    }
                }
                i9Var = ea2Var;
            }
            if (i9Var != null) {
                arrayList.add(i9Var);
            }
        }
        return arrayList;
    }

    public fa2(Context context, vv0 mediaFileProvider, x02 socialAdInfoProvider, C4136j4 adInfoProvider, k9 adTuneInfoProvider, du1 du1Var) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(mediaFileProvider, "mediaFileProvider");
        kotlin.jvm.internal.l.f(socialAdInfoProvider, "socialAdInfoProvider");
        kotlin.jvm.internal.l.f(adInfoProvider, "adInfoProvider");
        kotlin.jvm.internal.l.f(adTuneInfoProvider, "adTuneInfoProvider");
        this.f27255a = mediaFileProvider;
        this.f27256b = socialAdInfoProvider;
        this.f27257c = adInfoProvider;
        this.f27258d = adTuneInfoProvider;
        this.f27259e = du1Var;
    }
}
