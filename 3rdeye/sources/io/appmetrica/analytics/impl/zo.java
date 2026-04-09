package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes3.dex */
public final class zo implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f42215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f42216b = "WebView interface setup failed because of an exception.";

    public zo(Throwable th) {
        this.f42215a = th;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        ((PublicLogger) obj).error(this.f42215a, this.f42216b, new Object[0]);
    }
}
