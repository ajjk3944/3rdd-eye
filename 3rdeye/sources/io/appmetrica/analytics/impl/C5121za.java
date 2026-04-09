package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.za, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5121za extends V4 {
    public C5121za(S4 s42) {
        super(s42);
    }

    @Override // io.appmetrica.analytics.impl.V4
    public final boolean a(C4683i6 c4683i6, P4 p42) {
        Bundle bundle = c4683i6.f41055m;
        this.f40278a.a(bundle != null ? (C4895qb) bundle.getParcelable("io.appmetrica.analytics.impl.IdentifiersData") : null);
        return false;
    }
}
