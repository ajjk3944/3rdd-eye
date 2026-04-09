package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class es1 implements tr {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26998a;

    /* renamed from: b, reason: collision with root package name */
    private final xp f26999b;

    /* renamed from: c, reason: collision with root package name */
    private final tr f27000c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f27001d;

    public es1(Context context, u20 closeVerificationDialogController, tr contentCloseListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(closeVerificationDialogController, "closeVerificationDialogController");
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        this.f26998a = context;
        this.f26999b = closeVerificationDialogController;
        this.f27000c = contentCloseListener;
    }

    public final void a() {
        this.f27001d = true;
        this.f26999b.a();
    }

    @Override // com.yandex.mobile.ads.impl.tr
    public final void f() {
        if (this.f27001d) {
            this.f27000c.f();
        } else {
            this.f26999b.a(this.f26998a);
        }
    }
}
