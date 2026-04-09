package com.yandex.mobile.ads.impl;

import c9.C2078B;
import c9.C2079C;
import com.yandex.mobile.ads.impl.aa2;
import com.yandex.mobile.ads.impl.at;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class jl0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Set<o42> f29190b = C2079C.b(o42.f31177d, o42.f31178e, o42.f31176c, o42.f31175b, o42.f31179f);

    /* renamed from: c, reason: collision with root package name */
    private static final Map<aa2.b, at.a> f29191c = C2078B.o(new b9.l(aa2.b.f24585b, at.a.f24807c), new b9.l(aa2.b.f24586c, at.a.f24806b), new b9.l(aa2.b.f24587d, at.a.f24808d));

    /* renamed from: a, reason: collision with root package name */
    private final q42 f29192a;

    public /* synthetic */ jl0() {
        this(new q42(f29190b));
    }

    public final at a(n42 timeOffset) throws NumberFormatException {
        at.a aVar;
        kotlin.jvm.internal.l.f(timeOffset, "timeOffset");
        aa2 aa2VarA = this.f29192a.a(timeOffset.a());
        if (aa2VarA == null || (aVar = f29191c.get(aa2VarA.c())) == null) {
            return null;
        }
        return new at(aVar, (long) aa2VarA.d());
    }

    public jl0(q42 timeOffsetParser) {
        kotlin.jvm.internal.l.f(timeOffsetParser, "timeOffsetParser");
        this.f29192a = timeOffsetParser;
    }
}
