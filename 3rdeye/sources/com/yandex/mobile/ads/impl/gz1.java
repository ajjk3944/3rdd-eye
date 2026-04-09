package com.yandex.mobile.ads.impl;

import c9.C2092m;
import com.yandex.mobile.ads.impl.aa2;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class gz1 {

    /* renamed from: b, reason: collision with root package name */
    private static final HashSet f28045b = new HashSet(C2092m.W(o42.f31176c, o42.f31175b));

    /* renamed from: a, reason: collision with root package name */
    private final q42 f28046a;

    public /* synthetic */ gz1() {
        this(new q42(f28045b));
    }

    public final bd2 a(nu creative) throws NumberFormatException {
        kotlin.jvm.internal.l.f(creative, "creative");
        int iE = creative.e();
        hz1 hz1VarI = creative.i();
        if (hz1VarI == null) {
            return null;
        }
        aa2 aa2VarA = this.f28046a.a(hz1VarI.a());
        if (aa2VarA == null) {
            return null;
        }
        float fD = aa2VarA.d();
        if (aa2.b.f24586c == aa2VarA.c()) {
            fD = (long) ((fD / 100) * iE);
        }
        return new bd2((long) Math.min(fD, iE));
    }

    public gz1(q42 timeOffsetParser) {
        kotlin.jvm.internal.l.f(timeOffsetParser, "timeOffsetParser");
        this.f28046a = timeOffsetParser;
    }
}
