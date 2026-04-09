package com.vungle.ads.internal.util;

import java.util.concurrent.TimeUnit;

/* compiled from: ConcurrencyTimeoutProvider.kt */
/* loaded from: classes2.dex */
public final class d {
    public static final a Companion = new a(null);
    private static final long OPERATION_TIMEOUT = TimeUnit.SECONDS.toMillis(4);

    /* compiled from: ConcurrencyTimeoutProvider.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    public final long getTimeout() {
        if (q.INSTANCE.isMainThread()) {
            return OPERATION_TIMEOUT;
        }
        return Long.MAX_VALUE;
    }
}
