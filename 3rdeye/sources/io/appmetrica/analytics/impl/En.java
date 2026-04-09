package io.appmetrica.analytics.impl;

import c9.C2092m;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;

/* loaded from: classes3.dex */
public final class En {

    /* renamed from: a, reason: collision with root package name */
    public final C4474a4 f39386a;

    /* renamed from: b, reason: collision with root package name */
    public final wo f39387b;

    /* renamed from: c, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f39388c;

    public En(Toggle toggle) {
        C4474a4 c4474a4 = new C4474a4(Ga.j().x());
        this.f39386a = c4474a4;
        wo woVar = new wo();
        this.f39387b = woVar;
        this.f39388c = new ConjunctiveCompositeThreadSafeToggle(C2092m.W(c4474a4, woVar, toggle == null ? new C4882po() : toggle), "loc-def");
    }
}
