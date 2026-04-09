package com.facebook.ads.redexgen.core;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* renamed from: com.facebook.ads.redexgen.X.7m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C23517m {
    public static final C23517m A03;
    public final String A00;
    public final C23507l A01;
    public final Object A02;

    static {
        C23517m c23517m;
        if (AbstractC22614a.A02 < 31) {
            c23517m = new C23517m("");
        } else {
            c23517m = new C23517m(C23507l.A01, "");
        }
        A03 = c23517m;
    }

    public C23517m(C23507l c23507l, String str) {
        this.A01 = c23507l;
        this.A00 = str;
        this.A02 = new Object();
    }

    public C23517m(String str) {
        C3M.A08(AbstractC22614a.A02 < 31);
        this.A00 = str;
        this.A01 = null;
        this.A02 = new Object();
    }

    public final LogSessionId A00() {
        return ((C23507l) C3M.A01(this.A01)).A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23517m)) {
            return false;
        }
        C23517m c23517m = (C23517m) obj;
        if (Objects.equals(this.A00, c23517m.A00) && Objects.equals(this.A01, c23517m.A01) && Objects.equals(this.A02, c23517m.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.A00, this.A01, this.A02);
    }
}
