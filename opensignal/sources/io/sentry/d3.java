package io.sentry;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class d3 implements c2 {
    public String B;
    public String D;
    public String E;
    public double F;
    public final File G;
    public io.sentry.protocol.profiling.a I;
    public ConcurrentHashMap J;

    /* renamed from: d, reason: collision with root package name */
    public io.sentry.protocol.t f12180d;

    /* renamed from: g, reason: collision with root package name */
    public io.sentry.protocol.t f12181g;

    /* renamed from: r, reason: collision with root package name */
    public io.sentry.protocol.r f12182r;

    /* renamed from: x, reason: collision with root package name */
    public final Map f12183x;

    /* renamed from: y, reason: collision with root package name */
    public String f12184y;
    public String H = null;

    /* renamed from: a, reason: collision with root package name */
    public io.sentry.protocol.d f12179a = null;

    public d3(io.sentry.protocol.t tVar, io.sentry.protocol.t tVar2, File file, Map map, Double d6, String str, x5 x5Var) {
        this.f12180d = tVar;
        this.f12181g = tVar2;
        this.G = file;
        this.f12183x = map;
        this.f12182r = x5Var.getSdkVersion();
        this.B = x5Var.getRelease() != null ? x5Var.getRelease() : "";
        this.D = x5Var.getEnvironment();
        this.f12184y = str;
        this.E = "2";
        this.F = d6.doubleValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return Objects.equals(this.f12179a, d3Var.f12179a) && Objects.equals(this.f12180d, d3Var.f12180d) && Objects.equals(this.f12181g, d3Var.f12181g) && Objects.equals(this.f12182r, d3Var.f12182r) && Objects.equals(this.f12183x, d3Var.f12183x) && Objects.equals(this.f12184y, d3Var.f12184y) && Objects.equals(this.B, d3Var.B) && Objects.equals(this.D, d3Var.D) && Objects.equals(this.E, d3Var.E) && Objects.equals(this.H, d3Var.H) && Objects.equals(this.J, d3Var.J) && Objects.equals(this.I, d3Var.I);
    }

    public final int hashCode() {
        return Objects.hash(this.f12179a, this.f12180d, this.f12181g, this.f12182r, this.f12183x, this.f12184y, this.B, this.D, this.E, this.H, this.I, this.J);
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        if (this.f12179a != null) {
            bVar.I("debug_meta");
            bVar.S(u0Var, this.f12179a);
        }
        bVar.I("profiler_id");
        bVar.S(u0Var, this.f12180d);
        bVar.I("chunk_id");
        bVar.S(u0Var, this.f12181g);
        if (this.f12182r != null) {
            bVar.I("client_sdk");
            bVar.S(u0Var, this.f12182r);
        }
        Map map = this.f12183x;
        if (!map.isEmpty()) {
            String str = ((io.sentry.vendor.gson.stream.c) bVar.f11196a).f12847r;
            bVar.N("");
            bVar.I("measurements");
            bVar.S(u0Var, map);
            bVar.N(str);
        }
        bVar.I("platform");
        bVar.S(u0Var, this.f12184y);
        bVar.I("release");
        bVar.S(u0Var, this.B);
        if (this.D != null) {
            bVar.I("environment");
            bVar.S(u0Var, this.D);
        }
        bVar.I("version");
        bVar.S(u0Var, this.E);
        if (this.H != null) {
            bVar.I("sampled_profile");
            bVar.S(u0Var, this.H);
        }
        bVar.I("timestamp");
        bVar.S(u0Var, BigDecimal.valueOf(this.F).setScale(6, RoundingMode.DOWN));
        if (this.I != null) {
            bVar.I("profile");
            bVar.S(u0Var, this.I);
        }
        ConcurrentHashMap concurrentHashMap = this.J;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                h0.b.D(this.J, str2, bVar, str2, u0Var);
            }
        }
        bVar.F();
    }
}
