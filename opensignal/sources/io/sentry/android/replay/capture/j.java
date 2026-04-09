package io.sentry.android.replay.capture;

import io.sentry.b1;
import io.sentry.h0;
import io.sentry.l3;
import io.sentry.z5;

/* loaded from: classes.dex */
public final class j extends l {

    /* renamed from: a, reason: collision with root package name */
    public final z5 f11890a;

    /* renamed from: b, reason: collision with root package name */
    public final l3 f11891b;

    public j(z5 z5Var, l3 l3Var) {
        this.f11890a = z5Var;
        this.f11891b = l3Var;
    }

    public static void a(j jVar, b1 b1Var) {
        h0 h0Var = new h0();
        if (b1Var == null) {
            jVar.getClass();
            return;
        }
        z5 z5Var = jVar.f11890a;
        h0Var.f12299g = jVar.f11891b;
        b1Var.t(z5Var, h0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return br.l.a(this.f11890a, jVar.f11890a) && br.l.a(this.f11891b, jVar.f11891b);
    }

    public final int hashCode() {
        return this.f11891b.hashCode() + (this.f11890a.hashCode() * 31);
    }

    public final String toString() {
        return "Created(replay=" + this.f11890a + ", recording=" + this.f11891b + ')';
    }
}
