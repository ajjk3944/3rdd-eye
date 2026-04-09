package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.p;

/* loaded from: classes3.dex */
public final class ea0 extends p.e<da0> {
    @Override // androidx.recyclerview.widget.p.e
    public final boolean areContentsTheSame(da0 da0Var, da0 da0Var2) {
        da0 oldItem = da0Var;
        da0 newItem = da0Var2;
        kotlin.jvm.internal.l.f(oldItem, "oldItem");
        kotlin.jvm.internal.l.f(newItem, "newItem");
        return oldItem.equals(newItem);
    }

    @Override // androidx.recyclerview.widget.p.e
    public final boolean areItemsTheSame(da0 da0Var, da0 da0Var2) {
        da0 oldItem = da0Var;
        da0 newItem = da0Var2;
        kotlin.jvm.internal.l.f(oldItem, "oldItem");
        kotlin.jvm.internal.l.f(newItem, "newItem");
        if ((oldItem instanceof i90) && (newItem instanceof i90)) {
            return kotlin.jvm.internal.l.b(((i90) oldItem).a(), ((i90) newItem).a());
        }
        ca0 ca0Var = ca0.f25580a;
        return oldItem.equals(ca0Var) && newItem.equals(ca0Var);
    }
}
