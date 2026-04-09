package com.yandex.mobile.ads.impl;

import N7.C1175g0;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class wp extends j6.h {

    /* renamed from: a, reason: collision with root package name */
    private final yp f35039a;

    public wp(vp closeVerificationListener) {
        kotlin.jvm.internal.l.f(closeVerificationListener, "closeVerificationListener");
        this.f35039a = closeVerificationListener;
    }

    @Override // j6.h
    public final boolean handleAction(C1175g0 action, j6.y view, A7.d expressionResolver) {
        kotlin.jvm.internal.l.f(action, "action");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(expressionResolver, "expressionResolver");
        boolean z10 = false;
        A7.b<Uri> bVar = action.f8262k;
        if (bVar != null) {
            String string = bVar.a(expressionResolver).toString();
            kotlin.jvm.internal.l.e(string, "toString(...)");
            if (string.equals("close_ad")) {
                this.f35039a.a();
            } else if (string.equals("close_dialog")) {
                this.f35039a.b();
            }
            z10 = true;
        }
        return z10 ? z10 : super.handleAction(action, view, expressionResolver);
    }
}
