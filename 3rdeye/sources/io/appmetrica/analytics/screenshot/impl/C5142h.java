package io.appmetrica.analytics.screenshot.impl;

import android.os.Bundle;
import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;

/* renamed from: io.appmetrica.analytics.screenshot.impl.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5142h implements BundleToServiceConfigConverter {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final B fromBundle(Bundle bundle) {
        bundle.setClassLoader(B.class.getClassLoader());
        B b10 = (B) bundle.getParcelable("config");
        return b10 == null ? new B(new g0()) : b10;
    }
}
