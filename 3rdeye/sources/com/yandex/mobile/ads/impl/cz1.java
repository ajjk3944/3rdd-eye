package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class cz1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final pn0 f25889a;

    public cz1(pn0 instreamVastAdPlayer) {
        kotlin.jvm.internal.l.f(instreamVastAdPlayer, "instreamVastAdPlayer");
        this.f25889a = instreamVastAdPlayer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v10) {
        kotlin.jvm.internal.l.f(v10, "v");
        this.f25889a.e();
    }
}
