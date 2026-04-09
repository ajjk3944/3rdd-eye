package com.yandex.mobile.ads.impl;

import android.util.LruCache;

/* loaded from: classes3.dex */
public final class z60 extends LruCache<mb2<?>, ia1> {
    public z60(int i) {
        super(i);
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z10, mb2<?> mb2Var, ia1 ia1Var, ia1 ia1Var2) {
        ia1 ia1Var3 = ia1Var;
        if (ia1Var3 != null) {
            ia1Var3.a();
        }
    }
}
