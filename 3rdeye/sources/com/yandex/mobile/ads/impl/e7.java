package com.yandex.mobile.ads.impl;

import c9.C2079C;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class e7 implements wg1 {

    /* renamed from: a, reason: collision with root package name */
    private final vg1 f26695a;

    public /* synthetic */ e7(C4198s4 c4198s4) {
        this(c4198s4, new vg1(c4198s4));
    }

    @Override // com.yandex.mobile.ads.impl.wg1
    public final LinkedHashMap a() {
        return this.f26695a.a(C2079C.d(EnumC4191r4.f32457f));
    }

    public e7(C4198s4 adLoadingPhasesManager, vg1 phasesParametersExtractor) {
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(phasesParametersExtractor, "phasesParametersExtractor");
        this.f26695a = phasesParametersExtractor;
    }
}
