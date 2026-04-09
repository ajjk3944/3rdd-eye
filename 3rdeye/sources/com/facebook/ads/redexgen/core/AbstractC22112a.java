package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.2a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC22112a {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;

    public AbstractC22112a(AbstractC22112a abstractC22112a) {
        this.A04 = abstractC22112a.A04;
        this.A00 = abstractC22112a.A00;
        this.A01 = abstractC22112a.A01;
        this.A03 = abstractC22112a.A03;
        this.A02 = abstractC22112a.A02;
    }

    public AbstractC22112a(Object obj) {
        this(obj, -1L);
    }

    public AbstractC22112a(Object obj, int i, int i10, long j4) {
        this(obj, i, i10, j4, -1);
    }

    public AbstractC22112a(Object obj, int i, int i10, long j4, int i11) {
        this.A04 = obj;
        this.A00 = i;
        this.A01 = i10;
        this.A03 = j4;
        this.A02 = i11;
    }

    public AbstractC22112a(Object obj, long j4) {
        this(obj, -1, -1, j4, -1);
    }

    public final boolean A00() {
        return this.A00 != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC22112a)) {
            return false;
        }
        AbstractC22112a abstractC22112a = (AbstractC22112a) obj;
        return this.A04.equals(abstractC22112a.A04) && this.A00 == abstractC22112a.A00 && this.A01 == abstractC22112a.A01 && this.A03 == abstractC22112a.A03 && this.A02 == abstractC22112a.A02;
    }

    public final int hashCode() {
        int result = this.A04.hashCode();
        int result2 = ((((17 * 31) + result) * 31) + this.A00) * 31;
        int result3 = this.A01;
        int result4 = (((result2 + result3) * 31) + ((int) this.A03)) * 31;
        int result5 = this.A02;
        return result4 + result5;
    }
}
