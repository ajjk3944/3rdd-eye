package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.Button;

/* loaded from: classes3.dex */
public final class dp1 {

    /* renamed from: a, reason: collision with root package name */
    private final fp1 f26287a;

    public /* synthetic */ dp1() {
        this(new fp1());
    }

    public final bp1 a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        Button buttonA = this.f26287a.a(context);
        buttonA.setTag(hh2.a("replay_button"));
        buttonA.setVisibility(8);
        bp1 bp1Var = new bp1(context, buttonA);
        bp1Var.addView(buttonA);
        return bp1Var;
    }

    public dp1(fp1 replayButtonCreator) {
        kotlin.jvm.internal.l.f(replayButtonCreator, "replayButtonCreator");
        this.f26287a = replayButtonCreator;
    }
}
