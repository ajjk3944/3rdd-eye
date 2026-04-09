package com.yandex.mobile.ads.impl;

import H6.C0675l;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import n6.EnumC5370a;
import p7.C5477i;
import s6.C5581b;

/* loaded from: classes3.dex */
public final class l20 {

    /* renamed from: a, reason: collision with root package name */
    private final j20 f29865a;

    /* renamed from: b, reason: collision with root package name */
    private final i30 f29866b;

    public l20(j20 actionHandler, i30 divViewCreator) {
        kotlin.jvm.internal.l.f(actionHandler, "actionHandler");
        kotlin.jvm.internal.l.f(divViewCreator, "divViewCreator");
        this.f29865a = actionHandler;
        this.f29866b = divViewCreator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [j6.h] */
    public final C0675l a(Context context, i20 action) {
        String lowerCase;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(action, "action");
        e20 e20Var = new e20(context);
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
        j20 j20Var = this.f29865a;
        h30 h30Var = new h30(context);
        j20 hVar = j20Var;
        D9.G g10 = new D9.G(e20Var);
        if (hVar == null) {
            hVar = new j6.h();
        }
        j6.i iVar = new j6.i(g10, hVar, new E7.b(0), arrayList, j6.m.f43035b, arrayList2, h30Var, new HashMap(), new C5477i(), new C5581b(), defaultValue, defaultValue2, defaultValue3, defaultValue4, defaultValue5, defaultValue7, defaultValue6, defaultValue8, defaultValue9, defaultValue10, defaultValue11, defaultValue12, defaultValue13, defaultValue14, defaultValue15, defaultValue16);
        this.f29866b.getClass();
        C0675l c0675lA = i30.a(context, iVar, null);
        c0675lA.F(action.c().b(), action.c().c());
        ef1 ef1VarB = es.b(context);
        if (ef1VarB == ef1.f26823e) {
            lowerCase = "PORTRAIT".toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = ef1VarB.name().toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
        }
        c0675lA.G("orientation", lowerCase);
        return c0675lA;
    }
}
