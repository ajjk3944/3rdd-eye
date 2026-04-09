package com.yandex.mobile.ads.impl;

import android.view.View;
import z0.C5848a;

/* loaded from: classes3.dex */
public final class oi2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f31389a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31390b;

    public oi2(int i, int i10) {
        this.f31389a = i;
        this.f31390b = i10;
    }

    public final void a(View volumeControl, boolean z10) {
        kotlin.jvm.internal.l.f(volumeControl, "volumeControl");
        volumeControl.setBackground(C5848a.getDrawable(volumeControl.getContext(), z10 ? this.f31389a : this.f31390b));
    }
}
