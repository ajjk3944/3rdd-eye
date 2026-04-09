package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.impl.ym0;

/* loaded from: classes3.dex */
public final class ml0 {

    /* renamed from: a, reason: collision with root package name */
    private final pn0 f30432a;

    public ml0(pn0 instreamVastAdPlayer) {
        kotlin.jvm.internal.l.f(instreamVastAdPlayer, "instreamVastAdPlayer");
        this.f30432a = instreamVastAdPlayer;
    }

    public final ym0 a(bb2 uiElements, ym0 initialControlsState) {
        kotlin.jvm.internal.l.f(uiElements, "uiElements");
        kotlin.jvm.internal.l.f(initialControlsState, "initialControlsState");
        boolean z10 = this.f30432a.getVolume() == 0.0f;
        View viewN = uiElements.n();
        Float fValueOf = null;
        Boolean boolValueOf = viewN != null ? Boolean.valueOf(viewN.isEnabled()) : null;
        ProgressBar progressBarJ = uiElements.j();
        if (progressBarJ != null) {
            int progress = progressBarJ.getProgress();
            int max = progressBarJ.getMax();
            if (max != 0) {
                fValueOf = Float.valueOf(progress / max);
            }
        }
        ym0.a aVar = new ym0.a();
        aVar.b(z10);
        if (boolValueOf != null) {
            aVar.a(boolValueOf.booleanValue());
        }
        if (fValueOf != null) {
            aVar.b(fValueOf.floatValue());
        }
        aVar.a(initialControlsState.a());
        return new ym0(aVar);
    }
}
