package com.instagram.common.viewpoint.core;

import java.io.Serializable;

/* loaded from: assets/audience_network/classes2.dex */
public class NT implements Serializable {
    public static final long serialVersionUID = -5352540727250859603L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public C0708No A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;

    public final NT A0D(int i4) {
        this.A02 = i4;
        return this;
    }

    public final NT A0E(int i4) {
        this.A03 = i4;
        return this;
    }

    public final NT A0F(int i4) {
        this.A04 = i4;
        return this;
    }

    public final NT A0G(int i4) {
        this.A05 = i4;
        return this;
    }

    public final NT A0H(int i4) {
        this.A00 = i4;
        return this;
    }

    public final NT A0I(int i4) {
        this.A01 = i4;
        return this;
    }

    public final NT A0J(long j) {
        this.A06 = j;
        return this;
    }

    public final NT A0K(C0708No c0708No) {
        this.A07 = c0708No;
        return this;
    }

    public final NT A0L(String str) {
        this.A09 = str;
        return this;
    }

    public final NT A0M(String str) {
        this.A08 = str;
        return this;
    }

    public final NT A0N(boolean z3) {
        this.A0A = z3;
        return this;
    }

    public final NT A0O(boolean z3) {
        this.A0B = z3;
        return this;
    }

    public final NT A0P(boolean z3) {
        this.A0C = z3;
        return this;
    }

    public final NU A0Q() {
        return new NU(this);
    }
}
