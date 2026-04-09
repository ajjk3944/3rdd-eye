package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2097r;
import c9.C2099t;
import com.yandex.mobile.ads.impl.ew1;
import java.util.List;

/* loaded from: classes3.dex */
public final class vf0 {

    /* renamed from: a, reason: collision with root package name */
    private final ew1 f34523a;

    /* renamed from: b, reason: collision with root package name */
    private final at0 f34524b;

    public /* synthetic */ vf0() {
        this(ew1.a.a(), new at0());
    }

    public final List<String> a(Context context) {
        String strD;
        kotlin.jvm.internal.l.f(context, "context");
        du1 du1VarA = this.f34523a.a(context);
        if (du1VarA == null || (strD = du1VarA.d()) == null) {
            return C2099t.f18581b;
        }
        this.f34524b.getClass();
        List<String> listB = at0.b(context);
        if (listB == null) {
            listB = du1VarA.y();
        }
        return C2097r.y0(listB, E.u.G(strD));
    }

    public vf0(ew1 sdkSettings, at0 manifestAnalyzer) {
        kotlin.jvm.internal.l.f(sdkSettings, "sdkSettings");
        kotlin.jvm.internal.l.f(manifestAnalyzer, "manifestAnalyzer");
        this.f34523a = sdkSettings;
        this.f34524b = manifestAnalyzer;
    }
}
