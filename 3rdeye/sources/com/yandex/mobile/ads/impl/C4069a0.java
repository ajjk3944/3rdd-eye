package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: com.yandex.mobile.ads.impl.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4069a0 {

    /* renamed from: a, reason: collision with root package name */
    private final dp1 f24352a;

    /* renamed from: b, reason: collision with root package name */
    private final nv0 f24353b;

    /* renamed from: c, reason: collision with root package name */
    private final C4241z f24354c;

    public /* synthetic */ C4069a0() {
        this(new dp1(), new nv0(), new C4241z());
    }

    public final ga1 a(Context context, ke2 videoOptions, ov0 customControls, int i) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(videoOptions, "videoOptions");
        kotlin.jvm.internal.l.f(customControls, "customControls");
        ga1 ga1Var = new ga1(context, this.f24352a.a(context), this.f24353b.a(context, i, customControls));
        this.f24354c.getClass();
        ov0 ov0VarA = ga1Var.a();
        ga1Var.b().setVisibility(8);
        CheckBox muteControl = ov0VarA != null ? ov0VarA.getMuteControl() : null;
        if (muteControl != null) {
            muteControl.setVisibility(8);
        }
        ProgressBar videoProgress = ov0VarA != null ? ov0VarA.getVideoProgress() : null;
        if (videoProgress != null) {
            videoProgress.setVisibility(8);
        }
        TextView countDownProgress = ov0VarA != null ? ov0VarA.getCountDownProgress() : null;
        if (countDownProgress != null) {
            countDownProgress.setVisibility(8);
        }
        CheckBox muteControl2 = ov0VarA != null ? ov0VarA.getMuteControl() : null;
        if (muteControl2 == null) {
            return ga1Var;
        }
        muteControl2.setChecked(videoOptions.e());
        return ga1Var;
    }

    public C4069a0(dp1 replayActionViewCreator, nv0 controlsContainerCreator, C4241z mediaControlsContainerConfigurator) {
        kotlin.jvm.internal.l.f(replayActionViewCreator, "replayActionViewCreator");
        kotlin.jvm.internal.l.f(controlsContainerCreator, "controlsContainerCreator");
        kotlin.jvm.internal.l.f(mediaControlsContainerConfigurator, "mediaControlsContainerConfigurator");
        this.f24352a = replayActionViewCreator;
        this.f24353b = controlsContainerCreator;
        this.f24354c = mediaControlsContainerConfigurator;
    }
}
