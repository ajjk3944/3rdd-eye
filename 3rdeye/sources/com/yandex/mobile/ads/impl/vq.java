package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class vq implements x00 {

    /* renamed from: a, reason: collision with root package name */
    private final x00[] f34646a;

    public vq(x00... designConstraints) {
        kotlin.jvm.internal.l.f(designConstraints, "designConstraints");
        this.f34646a = designConstraints;
    }

    @Override // com.yandex.mobile.ads.impl.x00
    public final boolean a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        for (x00 x00Var : this.f34646a) {
            if (!x00Var.a(context)) {
                return false;
            }
        }
        return true;
    }
}
