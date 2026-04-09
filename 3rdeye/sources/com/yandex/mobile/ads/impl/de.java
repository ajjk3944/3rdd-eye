package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class de {

    /* renamed from: a, reason: collision with root package name */
    private final ge f26144a;

    public de(TextView textView, ge appCompatTextViewAutoSizeHelper) {
        kotlin.jvm.internal.l.f(textView, "textView");
        kotlin.jvm.internal.l.f(appCompatTextViewAutoSizeHelper, "appCompatTextViewAutoSizeHelper");
        this.f26144a = appCompatTextViewAutoSizeHelper;
    }

    public final void a() {
        this.f26144a.a();
    }

    public final void b() {
        this.f26144a.a();
    }

    public final void a(int i) {
        this.f26144a.a(i);
    }

    public final void a(int i, float f10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f26144a.b()) {
            return;
        }
        this.f26144a.a(i, f10);
    }
}
