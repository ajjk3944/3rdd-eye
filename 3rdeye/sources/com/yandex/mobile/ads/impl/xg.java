package com.yandex.mobile.ads.impl;

import android.view.View;
import c9.C2099t;
import c9.C2100u;
import com.yandex.mobile.ads.impl.b71;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class xg {

    /* renamed from: a, reason: collision with root package name */
    private final Collection<String> f35292a;

    public /* synthetic */ xg() {
        this(C2099t.f18581b);
    }

    public final b71 a(View view, z31 viewProvider) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(viewProvider, "viewProvider");
        b71.a aVar = new b71.a(view, v71.f34408c, C2100u.f18582b);
        b71.a aVarE = aVar.a(viewProvider.h(view)).b(viewProvider.a(view)).c(viewProvider.e(view)).d(viewProvider.n(view)).a(viewProvider.g(view)).b(viewProvider.l(view)).c(viewProvider.o(view)).a(viewProvider.c(view)).a(viewProvider.b(view)).a(viewProvider.k(view)).e(viewProvider.d(view));
        View viewI = viewProvider.i(view);
        if (!(viewI instanceof gn1)) {
            viewI = null;
        }
        aVarE.a(viewI).f(viewProvider.p(view)).g(viewProvider.m(view)).h(viewProvider.j(view)).i(viewProvider.f(view));
        for (String str : this.f35292a) {
            View viewA = viewProvider.a(view, str);
            if (viewA != null) {
                aVar.a(viewA, str);
            }
        }
        return new b71(aVar);
    }

    public xg(Collection<String> supportedAssetNames) {
        kotlin.jvm.internal.l.f(supportedAssetNames, "supportedAssetNames");
        this.f35292a = supportedAssetNames;
    }
}
