package io.appmetrica.analytics.logger.appmetrica.internal;

import androidx.work.s;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import kotlin.jvm.internal.g;

/* loaded from: classes3.dex */
public final class PublicLogger extends BaseReleaseLogger {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private static final PublicLogger f42290a = new PublicLogger("");

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final PublicLogger getAnonymousInstance() {
            return PublicLogger.f42290a;
        }

        private Companion() {
        }
    }

    public PublicLogger(String str) {
        super("AppMetrica", s.e("[", str, ']'));
    }

    public static final PublicLogger getAnonymousInstance() {
        return Companion.getAnonymousInstance();
    }
}
