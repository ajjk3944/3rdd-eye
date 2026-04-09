package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class wq0<V extends ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    private final List<sq0<V>> f35042a;

    public wq0(List<sq0<V>> layoutDesigns) {
        kotlin.jvm.internal.l.f(layoutDesigns, "layoutDesigns");
        this.f35042a = layoutDesigns;
    }

    public final sq0<V> a(Context context) {
        Object next;
        kotlin.jvm.internal.l.f(context, "context");
        Iterator<T> it = this.f35042a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((sq0) next).b().a(context)) {
                break;
            }
        }
        return (sq0) next;
    }
}
