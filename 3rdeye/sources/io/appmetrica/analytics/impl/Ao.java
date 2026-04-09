package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class Ao {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f39131a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public PublicLogger f39132b;

    public final synchronized void a(Consumer consumer) {
        try {
            PublicLogger publicLogger = this.f39132b;
            if (publicLogger == null) {
                this.f39131a.add(consumer);
            } else {
                consumer.consume(publicLogger);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
