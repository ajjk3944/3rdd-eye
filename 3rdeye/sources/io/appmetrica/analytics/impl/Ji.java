package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: classes3.dex */
public final class Ji extends V4 {
    public Ji(S4 s42) {
        super(s42);
    }

    @Override // io.appmetrica.analytics.impl.V4
    public final boolean a(C4683i6 c4683i6, P4 p42) {
        Bundle bundle = c4683i6.f41055m;
        this.f40278a.f40096k.a(new R4(bundle != null ? (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver") : null));
        return false;
    }
}
