package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class jt0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final kt0 f29270a;

    public jt0(Context context, rm2 sdkEnvironmentModule, xs instreamAd) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(instreamAd, "instreamAd");
        this.f29270a = new kt0(context, sdkEnvironmentModule, instreamAd);
    }

    public final it0<T> a(dt0<T> manualAdBreakFactory, String str) {
        kotlin.jvm.internal.l.f(manualAdBreakFactory, "manualAdBreakFactory");
        ArrayList arrayListA = this.f29270a.a(str);
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            arrayDeque.add(manualAdBreakFactory.a((et0) it.next()));
        }
        return new it0<>(arrayDeque);
    }
}
