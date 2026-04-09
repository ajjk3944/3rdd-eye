package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.TextureView;

/* loaded from: classes3.dex */
public final class rb1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4069a0 f32581a;

    /* renamed from: b, reason: collision with root package name */
    private final oe2 f32582b;

    public /* synthetic */ rb1() {
        this(new C4069a0(), new oe2());
    }

    public final ob1 a(Context context, ke2 videoOptions, ov0 customControls, ya2 ya2Var, int i) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(videoOptions, "videoOptions");
        kotlin.jvm.internal.l.f(customControls, "customControls");
        TextureView textureView = new TextureView(context);
        textureView.setVisibility(8);
        ga1 ga1VarA = this.f32581a.a(context, videoOptions, customControls, i);
        ga1VarA.setVisibility(8);
        ne2 ne2VarA = this.f32582b.a(context, ya2Var);
        ne2VarA.setVisibility(8);
        ob1 ob1Var = new ob1(context, ne2VarA, textureView, ga1VarA);
        ob1Var.addView(ne2VarA);
        ob1Var.addView(textureView);
        ob1Var.addView(ga1VarA);
        ob1Var.setTag(hh2.a("native_video_view"));
        return ob1Var;
    }

    public rb1(C4069a0 actionViewsContainerCreator, oe2 placeholderViewCreator) {
        kotlin.jvm.internal.l.f(actionViewsContainerCreator, "actionViewsContainerCreator");
        kotlin.jvm.internal.l.f(placeholderViewCreator, "placeholderViewCreator");
        this.f32581a = actionViewsContainerCreator;
        this.f32582b = placeholderViewCreator;
    }
}
