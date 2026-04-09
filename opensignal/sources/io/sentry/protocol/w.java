package io.sentry.protocol;

import com.google.android.gms.internal.measurement.b4;
import io.sentry.c2;
import io.sentry.j6;
import io.sentry.k6;
import io.sentry.n6;
import io.sentry.o6;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class w implements c2 {
    public final String B;
    public final o6 D;
    public final String E;
    public final Map F;
    public Map G;
    public final Map H;
    public ConcurrentHashMap I;

    /* renamed from: a, reason: collision with root package name */
    public final Double f12645a;

    /* renamed from: d, reason: collision with root package name */
    public final Double f12646d;

    /* renamed from: g, reason: collision with root package name */
    public final t f12647g;

    /* renamed from: r, reason: collision with root package name */
    public final n6 f12648r;

    /* renamed from: x, reason: collision with root package name */
    public final n6 f12649x;

    /* renamed from: y, reason: collision with root package name */
    public final String f12650y;

    public w(Double d6, Double d10, t tVar, n6 n6Var, n6 n6Var2, String str, String str2, o6 o6Var, String str3, Map map, Map map2, Map map3) {
        this.f12645a = d6;
        this.f12646d = d10;
        this.f12647g = tVar;
        this.f12648r = n6Var;
        this.f12649x = n6Var2;
        this.f12650y = str;
        this.B = str2;
        this.D = o6Var;
        this.E = str3;
        this.F = map;
        this.H = map2;
        this.G = map3;
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("start_timestamp");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.f12645a.doubleValue());
        RoundingMode roundingMode = RoundingMode.DOWN;
        bVar.S(u0Var, bigDecimalValueOf.setScale(6, roundingMode));
        Double d6 = this.f12646d;
        if (d6 != null) {
            bVar.I("timestamp");
            bVar.S(u0Var, BigDecimal.valueOf(d6.doubleValue()).setScale(6, roundingMode));
        }
        bVar.I("trace_id");
        bVar.S(u0Var, this.f12647g);
        bVar.I("span_id");
        bVar.S(u0Var, this.f12648r);
        n6 n6Var = this.f12649x;
        if (n6Var != null) {
            bVar.I("parent_span_id");
            bVar.S(u0Var, n6Var);
        }
        bVar.I("op");
        bVar.V(this.f12650y);
        String str = this.B;
        if (str != null) {
            bVar.I("description");
            bVar.V(str);
        }
        o6 o6Var = this.D;
        if (o6Var != null) {
            bVar.I("status");
            bVar.S(u0Var, o6Var);
        }
        String str2 = this.E;
        if (str2 != null) {
            bVar.I("origin");
            bVar.S(u0Var, str2);
        }
        Map map = this.F;
        if (!map.isEmpty()) {
            bVar.I("tags");
            bVar.S(u0Var, map);
        }
        if (this.G != null) {
            bVar.I("data");
            bVar.S(u0Var, this.G);
        }
        Map map2 = this.H;
        if (!map2.isEmpty()) {
            bVar.I("measurements");
            bVar.S(u0Var, map2);
        }
        ConcurrentHashMap concurrentHashMap = this.I;
        if (concurrentHashMap != null) {
            for (String str3 : concurrentHashMap.keySet()) {
                h0.b.D(this.I, str3, bVar, str3, u0Var);
            }
        }
        bVar.F();
    }

    public w(j6 j6Var) {
        ConcurrentHashMap concurrentHashMap = j6Var.k;
        k6 k6Var = j6Var.f12388c;
        this.B = k6Var.f12417y;
        this.f12650y = k6Var.f12416x;
        this.f12648r = k6Var.f12413d;
        this.f12649x = k6Var.f12414g;
        this.f12647g = k6Var.f12412a;
        this.D = k6Var.B;
        this.E = k6Var.E;
        ConcurrentHashMap concurrentHashMapO = b4.O(k6Var.D);
        this.F = concurrentHashMapO == null ? new ConcurrentHashMap() : concurrentHashMapO;
        ConcurrentHashMap concurrentHashMapO2 = b4.O(j6Var.f12395l);
        this.H = concurrentHashMapO2 == null ? new ConcurrentHashMap() : concurrentHashMapO2;
        this.f12646d = j6Var.f12387b == null ? null : Double.valueOf(j6Var.f12386a.c(r1) / 1.0E9d);
        this.f12645a = Double.valueOf(j6Var.f12386a.d() / 1.0E9d);
        this.G = concurrentHashMap;
    }
}
