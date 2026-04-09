package io.sentry.rrweb;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import ir.f0;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class m extends b implements c2 {
    public String B;
    public String D;
    public int E;
    public int F;
    public int G;
    public String H;
    public int I;
    public int J;
    public int K;
    public HashMap L;
    public ConcurrentHashMap M;
    public ConcurrentHashMap N;

    /* renamed from: g, reason: collision with root package name */
    public String f12723g;

    /* renamed from: r, reason: collision with root package name */
    public int f12724r;

    /* renamed from: x, reason: collision with root package name */
    public long f12725x;

    /* renamed from: y, reason: collision with root package name */
    public long f12726y;

    public m() {
        super(c.Custom);
        this.B = "h264";
        this.D = "mp4";
        this.H = "constant";
        this.f12723g = "video";
    }

    @Override // io.sentry.rrweb.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f12724r == mVar.f12724r && this.f12725x == mVar.f12725x && this.f12726y == mVar.f12726y && this.E == mVar.E && this.F == mVar.F && this.G == mVar.G && this.I == mVar.I && this.J == mVar.J && this.K == mVar.K && f0.s(this.f12723g, mVar.f12723g) && f0.s(this.B, mVar.B) && f0.s(this.D, mVar.D) && f0.s(this.H, mVar.H);
    }

    @Override // io.sentry.rrweb.b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f12723g, Integer.valueOf(this.f12724r), Long.valueOf(this.f12725x), Long.valueOf(this.f12726y), this.B, this.D, Integer.valueOf(this.E), Integer.valueOf(this.F), Integer.valueOf(this.G), this.H, Integer.valueOf(this.I), Integer.valueOf(this.J), Integer.valueOf(this.K)});
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("type");
        bVar.S(u0Var, this.f12699a);
        bVar.I("timestamp");
        bVar.R(this.f12700d);
        bVar.I("data");
        bVar.C();
        bVar.I("tag");
        bVar.V(this.f12723g);
        bVar.I("payload");
        bVar.C();
        bVar.I("segmentId");
        bVar.R(this.f12724r);
        bVar.I("size");
        bVar.R(this.f12725x);
        bVar.I("duration");
        bVar.R(this.f12726y);
        bVar.I("encoding");
        bVar.V(this.B);
        bVar.I("container");
        bVar.V(this.D);
        bVar.I("height");
        bVar.R(this.E);
        bVar.I("width");
        bVar.R(this.F);
        bVar.I("frameCount");
        bVar.R(this.G);
        bVar.I("frameRate");
        bVar.R(this.I);
        bVar.I("frameRateType");
        bVar.V(this.H);
        bVar.I("left");
        bVar.R(this.J);
        bVar.I("top");
        bVar.R(this.K);
        ConcurrentHashMap concurrentHashMap = this.M;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.M, str, bVar, str, u0Var);
            }
        }
        bVar.F();
        ConcurrentHashMap concurrentHashMap2 = this.N;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                h0.b.D(this.N, str2, bVar, str2, u0Var);
            }
        }
        bVar.F();
        HashMap map = this.L;
        if (map != null) {
            for (String str3 : map.keySet()) {
                h0.b.C(this.L, str3, bVar, str3, u0Var);
            }
        }
        bVar.F();
    }
}
