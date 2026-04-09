package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class s4 implements c2 {
    public final Callable B;
    public final String D;
    public HashMap E;

    /* renamed from: a, reason: collision with root package name */
    public final String f12730a;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f12731d;

    /* renamed from: g, reason: collision with root package name */
    public final String f12732g;

    /* renamed from: r, reason: collision with root package name */
    public final String f12733r;

    /* renamed from: x, reason: collision with root package name */
    public final a5 f12734x;

    /* renamed from: y, reason: collision with root package name */
    public final int f12735y;

    public s4(a5 a5Var, int i10, String str, String str2, String str3, String str4, Integer num) {
        this.f12734x = a5Var;
        this.f12730a = str;
        this.f12735y = i10;
        this.f12732g = str2;
        this.B = null;
        this.D = str3;
        this.f12733r = str4;
        this.f12731d = num;
    }

    public final int a() {
        Callable callable = this.B;
        if (callable == null) {
            return this.f12735y;
        }
        try {
            return ((Integer) callable.call()).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        String str = this.f12730a;
        if (str != null) {
            bVar.I("content_type");
            bVar.V(str);
        }
        String str2 = this.f12732g;
        if (str2 != null) {
            bVar.I("filename");
            bVar.V(str2);
        }
        bVar.I("type");
        bVar.S(u0Var, this.f12734x);
        String str3 = this.D;
        if (str3 != null) {
            bVar.I("attachment_type");
            bVar.V(str3);
        }
        String str4 = this.f12733r;
        if (str4 != null) {
            bVar.I("platform");
            bVar.V(str4);
        }
        Integer num = this.f12731d;
        if (num != null) {
            bVar.I("item_count");
            bVar.U(num);
        }
        bVar.I("length");
        bVar.R(a());
        HashMap map = this.E;
        if (map != null) {
            for (String str5 : map.keySet()) {
                h0.b.C(this.E, str5, bVar, str5, u0Var);
            }
        }
        bVar.F();
    }

    public s4(a5 a5Var, Callable callable, String str, String str2, String str3) {
        this(a5Var, callable, str, str2, str3, (String) null, (Integer) null);
    }

    public s4(a5 a5Var, Callable callable, String str, String str2, String str3, String str4, Integer num) {
        ir.f0.T(a5Var, "type is required");
        this.f12734x = a5Var;
        this.f12730a = str;
        this.f12735y = -1;
        this.f12732g = str2;
        this.B = callable;
        this.D = str3;
        this.f12733r = str4;
        this.f12731d = num;
    }
}
