package io.sentry.android.core;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f11538a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f11539b;

    public a1(Integer num, Boolean bool) {
        this.f11538a = num;
        this.f11539b = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return ir.f0.s(this.f11538a, a1Var.f11538a) && ir.f0.s(this.f11539b, a1Var.f11539b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11538a, this.f11539b});
    }
}
