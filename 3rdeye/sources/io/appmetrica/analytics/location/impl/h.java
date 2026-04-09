package io.appmetrica.analytics.location.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;

/* loaded from: classes3.dex */
public final class h implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final m f42238a;

    public h(m mVar) {
        this.f42238a = mVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(Location location) {
        if (location != null) {
            this.f42238a.updateData(location);
        }
    }
}
