package com.yandex.mobile.ads.impl;

import c9.C2079C;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class xc2 implements wg1 {

    /* renamed from: a, reason: collision with root package name */
    private final vg1 f35248a;

    public /* synthetic */ xc2(C4198s4 c4198s4) {
        this(c4198s4, new vg1(c4198s4));
    }

    @Override // com.yandex.mobile.ads.impl.wg1
    public final LinkedHashMap a() {
        return this.f35248a.a(C2079C.e(EnumC4191r4.f32472v, EnumC4191r4.f32473w));
    }

    public xc2(C4198s4 adLoadingPhasesManager, vg1 phasesParametersExtractor) {
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(phasesParametersExtractor, "phasesParametersExtractor");
        this.f35248a = phasesParametersExtractor;
    }
}
