package com.yandex.mobile.ads.impl;

import N7.C1175g0;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class j20 extends j6.h {

    /* renamed from: a, reason: collision with root package name */
    private final tr f28929a;

    public j20(h10 contentCloseListener) {
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        this.f28929a = contentCloseListener;
    }

    @Override // j6.h
    public final boolean handleAction(C1175g0 action, j6.y view, A7.d resolver) {
        kotlin.jvm.internal.l.f(action, "action");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        A7.b<Uri> bVar = action.f8262k;
        if (bVar != null) {
            Uri uriA = bVar.a(resolver);
            if (kotlin.jvm.internal.l.b(uriA.getScheme(), "mobileads") && kotlin.jvm.internal.l.b(uriA.getHost(), "closeDialog")) {
                this.f28929a.f();
                return true;
            }
        }
        return super.handleAction(action, view, resolver);
    }
}
