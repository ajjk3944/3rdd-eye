package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2092m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class un0 {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f34142a;

    /* renamed from: b, reason: collision with root package name */
    private final jl0 f34143b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f34144c;

    public /* synthetic */ un0(Context context, vu1 vu1Var) {
        this(context, vu1Var, new jl0());
    }

    public final zs a(C4078b2 adBreak, List<za2> videoAds) {
        at atVarA;
        kotlin.jvm.internal.l.f(adBreak, "adBreak");
        kotlin.jvm.internal.l.f(videoAds, "videoAds");
        String strC = adBreak.c();
        if (strC == null || (atVarA = this.f34143b.a(adBreak.f())) == null) {
            return null;
        }
        long jA = hi0.a();
        zn0 zn0Var = new zn0(adBreak, atVarA, jA, new gz1(), new k10(adBreak), new lb2(), new rl0());
        Context context = this.f34144c;
        kotlin.jvm.internal.l.e(context, "context");
        ArrayList arrayListA = new qb2(context, zn0Var).a(videoAds);
        if (arrayListA.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C2092m.T(arrayListA, 10));
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            arrayList.add((tn0) ((mb2) it.next()).d());
        }
        return new zs(this.f34142a, arrayListA, arrayList, strC, adBreak, atVarA, jA);
    }

    public un0(Context context, vu1 sdkEnvironmentModule, jl0 adBreakPositionParser) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adBreakPositionParser, "adBreakPositionParser");
        this.f34142a = sdkEnvironmentModule;
        this.f34143b = adBreakPositionParser;
        this.f34144c = context.getApplicationContext();
    }
}
