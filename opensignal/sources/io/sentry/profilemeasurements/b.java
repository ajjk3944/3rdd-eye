package io.sentry.profilemeasurements;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import ir.f0;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class b implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap f12513a;

    /* renamed from: d, reason: collision with root package name */
    public double f12514d;

    /* renamed from: g, reason: collision with root package name */
    public String f12515g;

    /* renamed from: r, reason: collision with root package name */
    public double f12516r;

    public b(Long l10, Number number, long j) {
        this.f12515g = l10.toString();
        this.f12516r = number.doubleValue();
        this.f12514d = j / 1.0E9d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return f0.s(this.f12513a, bVar.f12513a) && this.f12515g.equals(bVar.f12515g) && this.f12516r == bVar.f12516r && this.f12514d == bVar.f12514d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12513a, this.f12515g, Double.valueOf(this.f12516r)});
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("value");
        bVar.S(u0Var, Double.valueOf(this.f12516r));
        bVar.I("elapsed_since_start_ns");
        bVar.S(u0Var, this.f12515g);
        bVar.I("timestamp");
        bVar.S(u0Var, BigDecimal.valueOf(this.f12514d).setScale(6, RoundingMode.DOWN));
        ConcurrentHashMap concurrentHashMap = this.f12513a;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.f12513a, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
