package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import n6.EnumC5370a;
import p7.C5477i;
import s6.C5581b;

/* loaded from: classes3.dex */
public final class tz1 {
    public static j6.i a(Context context, sz1 divExtensionHandler, q20 clickHandler) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(divExtensionHandler, "divExtensionHandler");
        kotlin.jvm.internal.l.f(clickHandler, "clickHandler");
        e20 e20Var = new e20(context);
        s10 s10Var = new s10(new u10(), new y10(), new x10(), new t10(), new z10(), new v10());
        r20 r20Var = new r20(clickHandler);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean defaultValue = EnumC5370a.TAP_BEACONS_ENABLED.getDefaultValue();
        boolean defaultValue2 = EnumC5370a.VISIBILITY_BEACONS_ENABLED.getDefaultValue();
        boolean defaultValue3 = EnumC5370a.SWIPE_OUT_BEACONS_ENABLED.getDefaultValue();
        boolean defaultValue4 = EnumC5370a.LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED.getDefaultValue();
        boolean defaultValue5 = EnumC5370a.IGNORE_ACTION_MENU_ITEMS_ENABLED.getDefaultValue();
        boolean defaultValue6 = EnumC5370a.HYPHENATION_SUPPORT_ENABLED.getDefaultValue();
        boolean defaultValue7 = EnumC5370a.VISUAL_ERRORS_ENABLED.getDefaultValue();
        boolean defaultValue8 = EnumC5370a.ACCESSIBILITY_ENABLED.getDefaultValue();
        boolean defaultValue9 = EnumC5370a.VIEW_POOL_ENABLED.getDefaultValue();
        boolean defaultValue10 = EnumC5370a.VIEW_POOL_PROFILING_ENABLED.getDefaultValue();
        boolean defaultValue11 = EnumC5370a.VIEW_POOL_OPTIMIZATION_DEBUG.getDefaultValue();
        boolean defaultValue12 = EnumC5370a.RESOURCE_CACHE_ENABLED.getDefaultValue();
        boolean defaultValue13 = EnumC5370a.MULTIPLE_STATE_CHANGE_ENABLED.getDefaultValue();
        boolean defaultValue14 = EnumC5370a.COMPLEX_REBIND_ENABLED.getDefaultValue();
        boolean defaultValue15 = EnumC5370a.PAGER_PAGE_CLIP_ENABLED.getDefaultValue();
        boolean defaultValue16 = EnumC5370a.PERMANENT_DEBUG_PANEL_ENABLED.getDefaultValue();
        h30 h30Var = new h30(context);
        arrayList2.add(divExtensionHandler);
        arrayList2.add(r20Var);
        return new j6.i(new D9.G(e20Var), new j6.h(), new E7.b(0), arrayList, s10Var, arrayList2, h30Var, new HashMap(), new C5477i(), new C5581b(), defaultValue, defaultValue2, defaultValue3, defaultValue4, defaultValue5, defaultValue7, defaultValue6, defaultValue8, defaultValue9, defaultValue10, defaultValue11, defaultValue12, defaultValue13, defaultValue14, defaultValue15, defaultValue16);
    }
}
