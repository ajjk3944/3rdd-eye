package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Button;
import android.widget.FrameLayout;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class bp1 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final Button f25360a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp1(Context context, Button replayButton) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(replayButton, "replayButton");
        this.f25360a = replayButton;
    }

    public final Button a() {
        return this.f25360a;
    }
}
