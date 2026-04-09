package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Xl extends AbstractC4605f6 {

    /* renamed from: b, reason: collision with root package name */
    public final V3 f40397b;

    public Xl(Context context, String str) {
        this(context, str, new SafePackageManager(), Ga.j().e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.AbstractC4605f6, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Yl load(C4579e6 c4579e6) {
        Yl yl = (Yl) super.load(c4579e6);
        C4544cm c4544cm = c4579e6.f40791a;
        yl.f40435d = c4544cm.f40645f;
        yl.f40436e = c4544cm.f40646g;
        Wl wl = (Wl) c4579e6.componentArguments;
        String str = wl.f40358a;
        if (str != null) {
            yl.f40437f = str;
            yl.f40438g = wl.f40359b;
        }
        Map<String, String> map = wl.f40360c;
        yl.f40439h = map;
        yl.i = (N3) this.f40397b.a(new N3(map, EnumC4685i8.f41060c));
        Wl wl2 = (Wl) c4579e6.componentArguments;
        yl.f40441k = wl2.f40361d;
        yl.f40440j = wl2.f40362e;
        C4544cm c4544cm2 = c4579e6.f40791a;
        yl.f40442l = c4544cm2.f40654p;
        yl.f40443m = c4544cm2.f40656r;
        long j4 = c4544cm2.f40660v;
        if (yl.f40444n == 0) {
            yl.f40444n = j4;
        }
        return yl;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new Yl();
    }

    public Xl(Context context, String str, SafePackageManager safePackageManager, V3 v32) {
        super(context, str, safePackageManager);
        this.f40397b = v32;
    }

    public final Yl a() {
        return new Yl();
    }
}
