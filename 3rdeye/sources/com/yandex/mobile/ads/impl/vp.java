package com.yandex.mobile.ads.impl;

import android.app.Dialog;

/* loaded from: classes3.dex */
public final class vp implements yp {

    /* renamed from: a, reason: collision with root package name */
    private final Dialog f34644a;

    /* renamed from: b, reason: collision with root package name */
    private final tr f34645b;

    public vp(Dialog dialog, tr contentCloseListener) {
        kotlin.jvm.internal.l.f(dialog, "dialog");
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        this.f34644a = dialog;
        this.f34645b = contentCloseListener;
    }

    @Override // com.yandex.mobile.ads.impl.yp
    public final void a() {
        i10.a(this.f34644a);
        this.f34645b.f();
    }

    @Override // com.yandex.mobile.ads.impl.yp
    public final void b() {
        i10.a(this.f34644a);
    }
}
