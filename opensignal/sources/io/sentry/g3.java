package io.sentry;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class g3 implements c2 {
    public String B;
    public String D;
    public String E;
    public boolean F;
    public String G;
    public String I;
    public String J;
    public String K;
    public final ArrayList L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    public String U;
    public Date V;
    public final Map W;
    public ConcurrentHashMap Y;

    /* renamed from: a, reason: collision with root package name */
    public final File f12262a;

    /* renamed from: d, reason: collision with root package name */
    public final Callable f12263d;

    /* renamed from: g, reason: collision with root package name */
    public int f12264g;

    /* renamed from: x, reason: collision with root package name */
    public String f12266x;

    /* renamed from: y, reason: collision with root package name */
    public String f12267y;
    public List H = new ArrayList();
    public String X = null;

    /* renamed from: r, reason: collision with root package name */
    public String f12265r = Locale.getDefault().toString();

    public g3(File file, Date date, ArrayList arrayList, String str, String str2, String str3, String str4, int i10, String str5, Callable callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, Map map) {
        this.f12262a = file;
        this.V = date;
        this.G = str5;
        this.f12263d = callable;
        this.f12264g = i10;
        this.f12266x = str6 == null ? "" : str6;
        this.f12267y = str7 == null ? "" : str7;
        this.E = str8 != null ? str8 : "";
        this.F = bool != null ? bool.booleanValue() : false;
        this.I = str9 != null ? str9 : "0";
        this.B = "";
        this.D = "android";
        this.J = "android";
        this.K = str10 != null ? str10 : "";
        this.L = arrayList;
        this.M = str.isEmpty() ? "unknown" : str;
        this.N = str4;
        this.O = "";
        this.P = str11 != null ? str11 : "";
        this.Q = str2;
        this.R = str3;
        this.S = io.sentry.config.a.R();
        this.T = str12 != null ? str12 : "production";
        this.U = str13;
        if (!str13.equals("normal") && !this.U.equals("timeout") && !this.U.equals("backgrounded")) {
            this.U = "normal";
        }
        this.W = map;
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("android_api_level");
        bVar.S(u0Var, Integer.valueOf(this.f12264g));
        bVar.I("device_locale");
        bVar.S(u0Var, this.f12265r);
        bVar.I("device_manufacturer");
        bVar.V(this.f12266x);
        bVar.I("device_model");
        bVar.V(this.f12267y);
        bVar.I("device_os_build_number");
        bVar.V(this.B);
        bVar.I("device_os_name");
        bVar.V(this.D);
        bVar.I("device_os_version");
        bVar.V(this.E);
        bVar.I("device_is_emulator");
        bVar.W(this.F);
        bVar.I("architecture");
        bVar.S(u0Var, this.G);
        bVar.I("device_cpu_frequencies");
        bVar.S(u0Var, this.H);
        bVar.I("device_physical_memory_bytes");
        bVar.V(this.I);
        bVar.I("platform");
        bVar.V(this.J);
        bVar.I("build_id");
        bVar.V(this.K);
        bVar.I("transaction_name");
        bVar.V(this.M);
        bVar.I("duration_ns");
        bVar.V(this.N);
        bVar.I("version_name");
        bVar.V(this.P);
        bVar.I("version_code");
        bVar.V(this.O);
        ArrayList arrayList = this.L;
        if (!arrayList.isEmpty()) {
            bVar.I("transactions");
            bVar.S(u0Var, arrayList);
        }
        bVar.I("transaction_id");
        bVar.V(this.Q);
        bVar.I("trace_id");
        bVar.V(this.R);
        bVar.I("profile_id");
        bVar.V(this.S);
        bVar.I("environment");
        bVar.V(this.T);
        bVar.I("truncation_reason");
        bVar.V(this.U);
        if (this.X != null) {
            bVar.I("sampled_profile");
            bVar.V(this.X);
        }
        String str = ((io.sentry.vendor.gson.stream.c) bVar.f11196a).f12847r;
        bVar.N("");
        bVar.I("measurements");
        bVar.S(u0Var, this.W);
        bVar.N(str);
        bVar.I("timestamp");
        bVar.S(u0Var, this.V);
        ConcurrentHashMap concurrentHashMap = this.Y;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                h0.b.D(this.Y, str2, bVar, str2, u0Var);
            }
        }
        bVar.F();
    }
}
