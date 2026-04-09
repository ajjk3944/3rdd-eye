package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2097r;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.dy;
import com.yandex.mobile.ads.impl.mw;
import com.yandex.mobile.ads.impl.vx;
import d9.C4284b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class fx {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27477a;

    /* renamed from: b, reason: collision with root package name */
    private final ty0 f27478b;

    /* renamed from: c, reason: collision with root package name */
    private final hz0 f27479c;

    public fx(Context context, ty0 versionValidator, hz0 networkErrorMapper) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(versionValidator, "versionValidator");
        kotlin.jvm.internal.l.f(networkErrorMapper, "networkErrorMapper");
        this.f27477a = context;
        this.f27478b = versionValidator;
        this.f27479c = networkErrorMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(java.util.List<com.yandex.mobile.ads.impl.dy> r19, com.yandex.mobile.ads.impl.mw r20) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.fx.a(java.util.List, com.yandex.mobile.ads.impl.mw):void");
    }

    private final wx a(Boolean bool) {
        if (kotlin.jvm.internal.l.b(bool, Boolean.TRUE)) {
            String string = this.f27477a.getString(R.string.yes);
            kotlin.jvm.internal.l.e(string, "getString(...)");
            return new wx(string, 0, null, 0, 14);
        }
        if (kotlin.jvm.internal.l.b(bool, Boolean.FALSE)) {
            String string2 = this.f27477a.getString(R.string.no);
            kotlin.jvm.internal.l.e(string2, "getString(...)");
            return new wx(string2, 0, null, 0, 14);
        }
        if (bool == null) {
            String string3 = this.f27477a.getString(R.string.no_value_set);
            kotlin.jvm.internal.l.e(string3, "getString(...)");
            return new wx(string3, 0, null, 0, 14);
        }
        throw new b9.j();
    }

    public final List<dy> a(dx debugPanelData) {
        wx wxVar;
        int iA;
        wx wxVar2;
        kotlin.jvm.internal.l.f(debugPanelData, "debugPanelData");
        C4284b c4284bU = E.u.u();
        sw swVarC = debugPanelData.c();
        dy.d dVar = dy.d.f26532a;
        c4284bU.add(dVar);
        String string = this.f27477a.getString(R.string.application_info);
        kotlin.jvm.internal.l.e(string, "getString(...)");
        c4284bU.add(new dy.e(string));
        c4284bU.add(new dy.f("Application ID", swVarC.b()));
        String string2 = this.f27477a.getString(R.string.app_version);
        kotlin.jvm.internal.l.e(string2, "getString(...)");
        c4284bU.add(new dy.f(string2, swVarC.c()));
        String string3 = this.f27477a.getString(R.string.system);
        kotlin.jvm.internal.l.e(string3, "getString(...)");
        c4284bU.add(new dy.f(string3, swVarC.d()));
        String string4 = this.f27477a.getString(R.string.api_level);
        kotlin.jvm.internal.l.e(string4, "getString(...)");
        c4284bU.add(new dy.f(string4, swVarC.a()));
        ux uxVarF = debugPanelData.f();
        c4284bU.add(dVar);
        String string5 = this.f27477a.getString(R.string.sdk_integration);
        kotlin.jvm.internal.l.e(string5, "getString(...)");
        c4284bU.add(new dy.e(string5));
        String string6 = this.f27477a.getString(R.string.ads_sdk_version);
        kotlin.jvm.internal.l.e(string6, "getString(...)");
        c4284bU.add(new dy.f(string6, uxVarF.b()));
        int iOrdinal = uxVarF.a().b().ordinal();
        if (iOrdinal == 0) {
            String string7 = this.f27477a.getString(R.string.integrated);
            kotlin.jvm.internal.l.e(string7, "getString(...)");
            wxVar = new wx(string7, R.attr.debug_panel_color_green, Integer.valueOf(R.drawable.debug_panel_icon_success), 0, 8);
        } else if (iOrdinal == 1) {
            String string8 = this.f27477a.getString(R.string.integrated);
            kotlin.jvm.internal.l.e(string8, "getString(...)");
            wxVar = new wx(string8, R.attr.debug_panel_color_red, Integer.valueOf(R.drawable.debug_panel_icon_error), 0, 8);
        } else if (iOrdinal == 2) {
            String string9 = this.f27477a.getString(R.string.integration_errors);
            kotlin.jvm.internal.l.e(string9, "getString(...)");
            wxVar = new wx(string9, R.attr.debug_panel_color_red, Integer.valueOf(R.drawable.debug_panel_icon_error), 0, 8);
        } else {
            throw new b9.j();
        }
        if (uxVarF.a().b() == vx.a.f34731b) {
            iA = R.attr.debug_panel_label_primary;
        } else {
            iA = wxVar.a();
        }
        List<String> listA = uxVarF.a().a();
        c4284bU.add(new dy.f(this.f27477a.getString(R.string.sdk_integration_status), wxVar, listA != null ? new uw(iA, R.style.DebugPanelText_Body2, C2097r.u0(listA, "\n", null, null, null, 62)) : null));
        bw bwVarA = debugPanelData.a();
        if (bwVarA.c() != null || bwVarA.a() != null || bwVarA.b() != null) {
            c4284bU.add(dVar);
            String string10 = this.f27477a.getString(R.string.advertisement_network_settings);
            kotlin.jvm.internal.l.e(string10, "getString(...)");
            c4284bU.add(new dy.e(string10));
            String strC = bwVarA.c();
            if (strC != null) {
                c4284bU.add(new dy.f("Page ID", strC));
            }
            String strB = bwVarA.b();
            if (strB != null) {
                String string11 = this.f27477a.getString(R.string.app_review_status);
                kotlin.jvm.internal.l.e(string11, "getString(...)");
                c4284bU.add(new dy.f(string11, strB));
            }
            String strA = bwVarA.a();
            if (strA != null) {
                c4284bU.add(new dy.f("app-ads.txt", strA));
            }
            c4284bU.add(dy.b.f26527a);
        }
        ow owVarB = debugPanelData.b();
        if (!owVarB.a().isEmpty()) {
            c4284bU.add(dVar);
            List listC0 = C2097r.C0(new ex(), owVarB.a());
            ArrayList arrayList = new ArrayList();
            for (Object obj : listC0) {
                if (((mw) obj).a() instanceof mw.a.C0413a) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listC0) {
                if (((mw) obj2).a() instanceof mw.a.b) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : listC0) {
                if (((mw) obj3).a() instanceof mw.a.c) {
                    arrayList3.add(obj3);
                }
            }
            if (!arrayList.isEmpty()) {
                String string12 = this.f27477a.getString(R.string.completed_integration);
                kotlin.jvm.internal.l.e(string12, "getString(...)");
                c4284bU.add(new dy.e(string12));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    a(c4284bU, (mw) it.next());
                }
            }
            if (!arrayList2.isEmpty()) {
                String string13 = this.f27477a.getString(R.string.invalid_integration);
                kotlin.jvm.internal.l.e(string13, "getString(...)");
                c4284bU.add(new dy.e(string13));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    a(c4284bU, (mw) it2.next());
                }
            }
            if (!arrayList3.isEmpty()) {
                String string14 = this.f27477a.getString(R.string.missing_integration);
                kotlin.jvm.internal.l.e(string14, "getString(...)");
                c4284bU.add(new dy.e(string14));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    a(c4284bU, (mw) it3.next());
                }
            }
        }
        vw vwVarD = debugPanelData.d();
        dy.d dVar2 = dy.d.f26532a;
        c4284bU.add(dVar2);
        String string15 = this.f27477a.getString(R.string.user_privacy);
        kotlin.jvm.internal.l.e(string15, "getString(...)");
        c4284bU.add(new dy.e(string15));
        c4284bU.add(new dy.f(this.f27477a.getString(R.string.age_restricted_user), a(vwVarD.a()), null));
        c4284bU.add(new dy.f(this.f27477a.getString(R.string.has_location_consent), a(Boolean.valueOf(vwVarD.c())), null));
        c4284bU.add(new dy.f(this.f27477a.getString(R.string.has_user_consent), a(vwVarD.d()), null));
        String string16 = this.f27477a.getString(R.string.tcf_consent);
        if (vwVarD.b()) {
            String string17 = this.f27477a.getString(R.string.provided);
            kotlin.jvm.internal.l.e(string17, "getString(...)");
            wxVar2 = new wx(string17, 0, null, 0, 14);
        } else {
            String string18 = this.f27477a.getString(R.string.no_value_set);
            kotlin.jvm.internal.l.e(string18, "getString(...)");
            wxVar2 = new wx(string18, 0, null, 0, 14);
        }
        c4284bU.add(new dy.f(string16, wxVar2, null));
        cx cxVarE = debugPanelData.e();
        c4284bU.add(dVar2);
        String string19 = this.f27477a.getString(R.string.features);
        kotlin.jvm.internal.l.e(string19, "getString(...)");
        c4284bU.add(new dy.e(string19));
        dy.h.a aVar = dy.h.a.f26550b;
        c4284bU.add(new dy.h(cxVarE.a()));
        return E.u.m(c4284bU);
    }
}
