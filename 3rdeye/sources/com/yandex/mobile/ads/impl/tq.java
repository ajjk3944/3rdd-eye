package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class tq<T extends View> implements sd<T> {

    /* renamed from: a, reason: collision with root package name */
    private final List<sd<T>> f33762a;

    /* JADX WARN: Multi-variable type inference failed */
    public tq(List<? extends sd<T>> animators) {
        kotlin.jvm.internal.l.f(animators, "animators");
        this.f33762a = animators;
    }

    @Override // com.yandex.mobile.ads.impl.sd
    public final void a(T view) {
        kotlin.jvm.internal.l.f(view, "view");
        Iterator<sd<T>> it = this.f33762a.iterator();
        while (it.hasNext()) {
            it.next().a(view);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sd
    public final void cancel() {
        Iterator<sd<T>> it = this.f33762a.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }
}
