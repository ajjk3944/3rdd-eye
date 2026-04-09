package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.p;

/* loaded from: classes3.dex */
public final class bx extends p.e<dy> {
    @Override // androidx.recyclerview.widget.p.e
    public final boolean areContentsTheSame(dy dyVar, dy dyVar2) {
        dy prevItem = dyVar;
        dy newItem = dyVar2;
        kotlin.jvm.internal.l.f(prevItem, "prevItem");
        kotlin.jvm.internal.l.f(newItem, "newItem");
        return prevItem.a(newItem);
    }

    @Override // androidx.recyclerview.widget.p.e
    public final boolean areItemsTheSame(dy dyVar, dy dyVar2) {
        dy prevItem = dyVar;
        dy newItem = dyVar2;
        kotlin.jvm.internal.l.f(prevItem, "prevItem");
        kotlin.jvm.internal.l.f(newItem, "newItem");
        return prevItem.a(newItem);
    }
}
