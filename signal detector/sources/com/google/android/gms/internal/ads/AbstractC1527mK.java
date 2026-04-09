package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.mK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1527mK {
    public String a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final C1635oK b() {
        if (this instanceof C1635oK) {
            return (C1635oK) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final C1743qK c() {
        if (this instanceof C1743qK) {
            return (C1743qK) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            DK dk = new DK(new C2228zK(0, sb));
            dk.f7754h = 1;
            BK.f7330a.getClass();
            AK.J(dk, this);
            return sb.toString();
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }
}
