package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2693Lh {
    public static final C2693Lh A02 = new C2693Lh();
    public byte A00 = 3;
    public boolean A01 = true;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C2693Lh)) {
            return false;
        }
        C2693Lh c2693Lh = (C2693Lh) obj;
        return this.A00 == c2693Lh.A00 && this.A01 == c2693Lh.A01;
    }

    public final int hashCode() {
        return new Byte(this.A00).hashCode() + new Boolean(this.A01).hashCode();
    }
}
