package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes3.dex */
public final class Tm extends Z2 {
    public Tm(int i, String str) {
        this(i, str, PublicLogger.getAnonymousInstance());
    }

    public final int b() {
        return this.f40456a;
    }

    public Tm(int i, String str, PublicLogger publicLogger) {
        super(i, str, publicLogger);
    }

    @Override // io.appmetrica.analytics.impl.Fn
    public final String a(String str) {
        if (str != null) {
            int length = str.length();
            int i = this.f40456a;
            if (length > i) {
                String strSubstring = str.substring(0, i);
                this.f40458c.warning("\"%s\" %s size exceeded limit of %d characters", this.f40457b, str, Integer.valueOf(this.f40456a));
                return strSubstring;
            }
        }
        return str;
    }

    public final String a() {
        return this.f40457b;
    }
}
