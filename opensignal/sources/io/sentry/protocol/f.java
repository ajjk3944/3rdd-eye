package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class f implements c2 {
    public String[] B;
    public Float D;
    public Boolean E;
    public Boolean F;
    public e G;
    public Boolean H;
    public Long I;
    public Long J;
    public Long K;
    public Boolean L;
    public Long M;
    public Long N;
    public Long O;
    public Long P;
    public Integer Q;
    public Integer R;
    public Float S;
    public Integer T;
    public Date U;
    public TimeZone V;
    public String W;
    public String X;
    public String Y;
    public Float Z;

    /* renamed from: a, reason: collision with root package name */
    public String f12540a;

    /* renamed from: a0, reason: collision with root package name */
    public Integer f12541a0;

    /* renamed from: b0, reason: collision with root package name */
    public Double f12542b0;

    /* renamed from: c0, reason: collision with root package name */
    public String f12543c0;

    /* renamed from: d, reason: collision with root package name */
    public String f12544d;

    /* renamed from: d0, reason: collision with root package name */
    public String f12545d0;

    /* renamed from: e0, reason: collision with root package name */
    public ConcurrentHashMap f12546e0;

    /* renamed from: g, reason: collision with root package name */
    public String f12547g;

    /* renamed from: r, reason: collision with root package name */
    public String f12548r;

    /* renamed from: x, reason: collision with root package name */
    public String f12549x;

    /* renamed from: y, reason: collision with root package name */
    public String f12550y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (ir.f0.s(this.f12540a, fVar.f12540a) && ir.f0.s(this.f12544d, fVar.f12544d) && ir.f0.s(this.f12547g, fVar.f12547g) && ir.f0.s(this.f12548r, fVar.f12548r) && ir.f0.s(this.f12549x, fVar.f12549x) && ir.f0.s(this.f12550y, fVar.f12550y) && Arrays.equals(this.B, fVar.B) && ir.f0.s(this.D, fVar.D) && ir.f0.s(this.E, fVar.E) && ir.f0.s(this.F, fVar.F) && this.G == fVar.G && ir.f0.s(this.H, fVar.H) && ir.f0.s(this.I, fVar.I) && ir.f0.s(this.J, fVar.J) && ir.f0.s(this.K, fVar.K) && ir.f0.s(this.L, fVar.L) && ir.f0.s(this.M, fVar.M) && ir.f0.s(this.N, fVar.N) && ir.f0.s(this.O, fVar.O) && ir.f0.s(this.P, fVar.P) && ir.f0.s(this.Q, fVar.Q) && ir.f0.s(this.R, fVar.R) && ir.f0.s(this.S, fVar.S) && ir.f0.s(this.T, fVar.T) && ir.f0.s(this.U, fVar.U) && ir.f0.s(this.W, fVar.W) && ir.f0.s(this.X, fVar.X) && ir.f0.s(this.Y, fVar.Y) && ir.f0.s(this.Z, fVar.Z) && ir.f0.s(this.f12541a0, fVar.f12541a0) && ir.f0.s(this.f12542b0, fVar.f12542b0) && ir.f0.s(this.f12543c0, fVar.f12543c0) && ir.f0.s(this.f12545d0, fVar.f12545d0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{this.f12540a, this.f12544d, this.f12547g, this.f12548r, this.f12549x, this.f12550y, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.f12541a0, this.f12542b0, this.f12543c0, this.f12545d0}) * 31) + Arrays.hashCode(this.B);
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        if (this.f12540a != null) {
            bVar.I("name");
            bVar.V(this.f12540a);
        }
        if (this.f12544d != null) {
            bVar.I("manufacturer");
            bVar.V(this.f12544d);
        }
        if (this.f12547g != null) {
            bVar.I("brand");
            bVar.V(this.f12547g);
        }
        if (this.f12548r != null) {
            bVar.I("family");
            bVar.V(this.f12548r);
        }
        if (this.f12549x != null) {
            bVar.I("model");
            bVar.V(this.f12549x);
        }
        if (this.f12550y != null) {
            bVar.I("model_id");
            bVar.V(this.f12550y);
        }
        if (this.B != null) {
            bVar.I("archs");
            bVar.S(u0Var, this.B);
        }
        if (this.D != null) {
            bVar.I("battery_level");
            bVar.U(this.D);
        }
        if (this.E != null) {
            bVar.I("charging");
            bVar.T(this.E);
        }
        if (this.F != null) {
            bVar.I("online");
            bVar.T(this.F);
        }
        if (this.G != null) {
            bVar.I("orientation");
            bVar.S(u0Var, this.G);
        }
        if (this.H != null) {
            bVar.I("simulator");
            bVar.T(this.H);
        }
        if (this.I != null) {
            bVar.I("memory_size");
            bVar.U(this.I);
        }
        if (this.J != null) {
            bVar.I("free_memory");
            bVar.U(this.J);
        }
        if (this.K != null) {
            bVar.I("usable_memory");
            bVar.U(this.K);
        }
        if (this.L != null) {
            bVar.I("low_memory");
            bVar.T(this.L);
        }
        if (this.M != null) {
            bVar.I("storage_size");
            bVar.U(this.M);
        }
        if (this.N != null) {
            bVar.I("free_storage");
            bVar.U(this.N);
        }
        if (this.O != null) {
            bVar.I("external_storage_size");
            bVar.U(this.O);
        }
        if (this.P != null) {
            bVar.I("external_free_storage");
            bVar.U(this.P);
        }
        if (this.Q != null) {
            bVar.I("screen_width_pixels");
            bVar.U(this.Q);
        }
        if (this.R != null) {
            bVar.I("screen_height_pixels");
            bVar.U(this.R);
        }
        if (this.S != null) {
            bVar.I("screen_density");
            bVar.U(this.S);
        }
        if (this.T != null) {
            bVar.I("screen_dpi");
            bVar.U(this.T);
        }
        if (this.U != null) {
            bVar.I("boot_time");
            bVar.S(u0Var, this.U);
        }
        if (this.V != null) {
            bVar.I("timezone");
            bVar.S(u0Var, this.V);
        }
        if (this.W != null) {
            bVar.I("id");
            bVar.V(this.W);
        }
        if (this.Y != null) {
            bVar.I("connection_type");
            bVar.V(this.Y);
        }
        if (this.Z != null) {
            bVar.I("battery_temperature");
            bVar.U(this.Z);
        }
        if (this.X != null) {
            bVar.I("locale");
            bVar.V(this.X);
        }
        if (this.f12541a0 != null) {
            bVar.I("processor_count");
            bVar.U(this.f12541a0);
        }
        if (this.f12542b0 != null) {
            bVar.I("processor_frequency");
            bVar.U(this.f12542b0);
        }
        if (this.f12543c0 != null) {
            bVar.I("cpu_description");
            bVar.V(this.f12543c0);
        }
        if (this.f12545d0 != null) {
            bVar.I("chipset");
            bVar.V(this.f12545d0);
        }
        ConcurrentHashMap concurrentHashMap = this.f12546e0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.f12546e0, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
