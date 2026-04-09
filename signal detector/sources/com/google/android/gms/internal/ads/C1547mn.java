package com.google.android.gms.internal.ads;

import android.content.Context;
import f4.InterfaceFutureC2326a;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.mn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1547mn {

    /* renamed from: b, reason: collision with root package name */
    public final V2.h f15659b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f15660c;

    /* renamed from: d, reason: collision with root package name */
    public final C0784Vn f15661d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f15662e;

    /* renamed from: f, reason: collision with root package name */
    public final H6 f15663f;

    /* renamed from: g, reason: collision with root package name */
    public final C2951a f15664g;
    public final C0633Mp i;

    /* renamed from: j, reason: collision with root package name */
    public final C2202yv f15666j;

    /* renamed from: k, reason: collision with root package name */
    public final BinderC0718Rp f15667k;

    /* renamed from: l, reason: collision with root package name */
    public final C1068du f15668l;

    /* renamed from: m, reason: collision with root package name */
    public C1358jD f15669m;

    /* renamed from: a, reason: collision with root package name */
    public final C1279hn f15658a = new C1279hn();

    /* renamed from: h, reason: collision with root package name */
    public final C0415Ab f15665h = new C0415Ab();

    public C1547mn(CallableC1493ln callableC1493ln) {
        this.f15660c = callableC1493ln.f15460b;
        this.f15662e = callableC1493ln.f15463e;
        this.f15663f = callableC1493ln.f15464f;
        this.f15664g = callableC1493ln.f15465g;
        this.f15659b = callableC1493ln.f15459a;
        this.i = callableC1493ln.f15462d;
        this.f15666j = callableC1493ln.f15466h;
        this.f15661d = callableC1493ln.f15461c;
        this.f15667k = callableC1493ln.i;
        this.f15668l = callableC1493ln.f15467j;
    }

    public final synchronized InterfaceFutureC2326a a(String str, JSONObject jSONObject) {
        C1358jD c1358jD = this.f15669m;
        if (c1358jD == null) {
            return ED.f7928b;
        }
        return AbstractC1984ut.F(c1358jD, new C2028vj(this, str, jSONObject, 2), this.f15662e);
    }

    public final synchronized void b(String str, InterfaceC0466Db interfaceC0466Db) {
        C1358jD c1358jD = this.f15669m;
        if (c1358jD == null) {
            return;
        }
        C0889ae c0889ae = new C0889ae(this, str, interfaceC0466Db, 21);
        c1358jD.a(new CD(c1358jD, 0, c0889ae), this.f15662e);
    }

    public final synchronized void c(String str, InterfaceC0466Db interfaceC0466Db) {
        C1358jD c1358jD = this.f15669m;
        if (c1358jD == null) {
            return;
        }
        C0697Ql c0697Ql = new C0697Ql(this, str, interfaceC0466Db);
        c1358jD.a(new CD(c1358jD, 0, c0697Ql), this.f15662e);
    }

    public final synchronized void d(Map map) {
        C1358jD c1358jD = this.f15669m;
        if (c1358jD == null) {
            return;
        }
        C1283hr c1283hr = new C1283hr(this, map);
        c1358jD.a(new CD(c1358jD, 0, c1283hr), this.f15662e);
    }
}
