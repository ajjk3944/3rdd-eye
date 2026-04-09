package com.yandex.mobile.ads.impl;

import c9.C2079C;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class ve1 implements wg1 {

    /* renamed from: a, reason: collision with root package name */
    private final vg1 f34520a;

    public /* synthetic */ ve1(C4198s4 c4198s4) {
        this(c4198s4, new vg1(c4198s4));
    }

    @Override // com.yandex.mobile.ads.impl.wg1
    public final LinkedHashMap a() {
        return this.f34520a.a(C2079C.e(EnumC4191r4.f32460j, EnumC4191r4.f32462l, EnumC4191r4.f32461k, EnumC4191r4.f32463m, EnumC4191r4.f32464n, EnumC4191r4.f32475y, EnumC4191r4.f32476z, EnumC4191r4.f32452A));
    }

    public ve1(C4198s4 adLoadingPhasesManager, vg1 phasesParametersExtractor) {
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(phasesParametersExtractor, "phasesParametersExtractor");
        this.f34520a = phasesParametersExtractor;
    }
}
