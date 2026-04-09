package com.yandex.mobile.ads.impl;

import android.view.View;
import c9.C2099t;
import java.util.List;

/* loaded from: classes3.dex */
public final class sb1 implements fg2 {

    /* renamed from: a, reason: collision with root package name */
    private final eg2 f32929a;

    public sb1(eg2 videoViewAdapter) {
        kotlin.jvm.internal.l.f(videoViewAdapter, "videoViewAdapter");
        this.f32929a = videoViewAdapter;
    }

    @Override // com.yandex.mobile.ads.impl.fg2
    public final List<kb2> a() {
        return C2099t.f18581b;
    }

    @Override // com.yandex.mobile.ads.impl.fg2
    public final View getView() {
        return this.f32929a.b();
    }
}
