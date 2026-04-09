package io.sentry;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class q6 implements c2 {
    public final String B;
    public final String D;
    public final String E;
    public final io.sentry.protocol.t F;
    public ConcurrentHashMap G;

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.t f12680a;

    /* renamed from: d, reason: collision with root package name */
    public final String f12681d;

    /* renamed from: g, reason: collision with root package name */
    public final String f12682g;

    /* renamed from: r, reason: collision with root package name */
    public final String f12683r;

    /* renamed from: x, reason: collision with root package name */
    public final String f12684x;

    /* renamed from: y, reason: collision with root package name */
    public final String f12685y;

    public q6(io.sentry.protocol.t tVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, io.sentry.protocol.t tVar2, String str8) {
        this.f12680a = tVar;
        this.f12681d = str;
        this.f12682g = str2;
        this.f12683r = str3;
        this.f12684x = str4;
        this.f12685y = str5;
        this.B = str6;
        this.E = str7;
        this.F = tVar2;
        this.D = str8;
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("trace_id");
        bVar.S(u0Var, this.f12680a);
        bVar.I("public_key");
        bVar.V(this.f12681d);
        String str = this.f12682g;
        if (str != null) {
            bVar.I("release");
            bVar.V(str);
        }
        String str2 = this.f12683r;
        if (str2 != null) {
            bVar.I("environment");
            bVar.V(str2);
        }
        String str3 = this.f12684x;
        if (str3 != null) {
            bVar.I(hq.c.USER_ID);
            bVar.V(str3);
        }
        String str4 = this.f12685y;
        if (str4 != null) {
            bVar.I("transaction");
            bVar.V(str4);
        }
        String str5 = this.B;
        if (str5 != null) {
            bVar.I("sample_rate");
            bVar.V(str5);
        }
        String str6 = this.D;
        if (str6 != null) {
            bVar.I("sample_rand");
            bVar.V(str6);
        }
        String str7 = this.E;
        if (str7 != null) {
            bVar.I("sampled");
            bVar.V(str7);
        }
        io.sentry.protocol.t tVar = this.F;
        if (tVar != null) {
            bVar.I("replay_id");
            bVar.S(u0Var, tVar);
        }
        ConcurrentHashMap concurrentHashMap = this.G;
        if (concurrentHashMap != null) {
            for (String str8 : concurrentHashMap.keySet()) {
                h0.b.D(this.G, str8, bVar, str8, u0Var);
            }
        }
        bVar.F();
    }
}
