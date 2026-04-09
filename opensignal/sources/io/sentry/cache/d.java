package io.sentry.cache;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.v0;
import io.sentry.x5;

/* loaded from: classes.dex */
public final class d implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final x5 f12128a;

    public d(SentryAndroidOptions sentryAndroidOptions) {
        this.f12128a = sentryAndroidOptions;
    }

    public final void a(String str) {
        a.a(this.f12128a, ".options-cache", str);
    }

    public final void b(Object obj, String str) {
        a.d(this.f12128a, obj, ".options-cache", str);
    }
}
