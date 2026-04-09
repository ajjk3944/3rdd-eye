package com.yandex.mobile.ads.impl;

import c9.C2079C;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class kv1 implements wg1 {

    /* renamed from: a, reason: collision with root package name */
    private final vg1 f29795a;

    public /* synthetic */ kv1(C4198s4 c4198s4) {
        this(c4198s4, new vg1(c4198s4));
    }

    @Override // com.yandex.mobile.ads.impl.wg1
    public final LinkedHashMap a() {
        return this.f29795a.a(C2079C.e(EnumC4191r4.i, EnumC4191r4.f32460j, EnumC4191r4.f32462l, EnumC4191r4.f32461k, EnumC4191r4.f32463m, EnumC4191r4.f32464n, EnumC4191r4.f32452A));
    }

    public kv1(C4198s4 adLoadingPhasesManager, vg1 phasesParametersExtractor) {
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(phasesParametersExtractor, "phasesParametersExtractor");
        this.f29795a = phasesParametersExtractor;
    }
}
