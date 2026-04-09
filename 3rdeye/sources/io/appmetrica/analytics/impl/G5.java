package io.appmetrica.analytics.impl;

import g0.C4356c;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes3.dex */
public final class G5 {

    /* renamed from: a, reason: collision with root package name */
    public final PublicLogger f39481a;

    public G5(String str) {
        this.f39481a = LoggerStorage.getOrCreatePublicLogger(str);
    }

    public final int a(int i) {
        if (i < 100) {
            this.f39481a.warning(C4356c.i(i, "Value passed as maxReportsInDatabaseCount is invalid. Should be greater than or equal to 100, but was: ", ". Default value (100) will be used"), new Object[0]);
            return 100;
        }
        if (i <= 10000) {
            return i;
        }
        this.f39481a.warning(C4356c.i(i, "Value passed as maxReportsInDatabaseCount is invalid. Should be less than or equal to 10000, but was: ", ". Default value (10000) will be used"), new Object[0]);
        return 10000;
    }
}
