package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.s3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4938s3 extends Mi {
    public C4938s3(Context context, String str) {
        super(context, str, "bool");
    }

    @Override // io.appmetrica.analytics.impl.Mi
    public final Object a(int i) {
        return Boolean.valueOf(this.f39872a.getResources().getBoolean(i));
    }

    public final Boolean b(int i) {
        return Boolean.valueOf(this.f39872a.getResources().getBoolean(i));
    }
}
