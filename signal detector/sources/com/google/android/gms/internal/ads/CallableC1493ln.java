package com.google.android.gms.internal.ads;

import Y2.C0200b;
import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import q2.C2841s;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.ln, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC1493ln implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final V2.h f15459a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f15460b;

    /* renamed from: c, reason: collision with root package name */
    public final C0784Vn f15461c;

    /* renamed from: d, reason: collision with root package name */
    public final C0633Mp f15462d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f15463e;

    /* renamed from: f, reason: collision with root package name */
    public final H6 f15464f;

    /* renamed from: g, reason: collision with root package name */
    public final C2951a f15465g;

    /* renamed from: h, reason: collision with root package name */
    public final C2202yv f15466h;
    public final BinderC0718Rp i;

    /* renamed from: j, reason: collision with root package name */
    public final C1068du f15467j;

    public CallableC1493ln(Context context, Executor executor, H6 h6, C2951a c2951a, V2.h hVar, C0633Mp c0633Mp, C2202yv c2202yv, C0784Vn c0784Vn, BinderC0718Rp binderC0718Rp, C1068du c1068du) {
        this.f15460b = context;
        this.f15463e = executor;
        this.f15464f = h6;
        this.f15465g = c2951a;
        this.f15459a = hVar;
        this.f15462d = c0633Mp;
        this.f15466h = c2202yv;
        this.f15461c = c0784Vn;
        this.i = binderC0718Rp;
        this.f15467j = c1068du;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1547mn c1547mn = new C1547mn(this);
        synchronized (c1547mn) {
            String str = (String) C2841s.f23267e.f23270c.a(H9.f8845v4);
            H6 h6 = c1547mn.f15663f;
            V2.h hVar = c1547mn.f15659b;
            BinderC0718Rp binderC0718Rp = c1547mn.f15667k;
            C1358jD c1358jDG = AbstractC1984ut.G(AbstractC1984ut.B(new C0200b(c1547mn.f15660c, h6, c1547mn.f15664g, hVar, binderC0718Rp, c1547mn.f15668l, c1547mn.f15661d, str, 4), AbstractC0640Nf.f10010f), new C1754qe(1, c1547mn), c1547mn.f15662e);
            c1547mn.f15669m = c1358jDG;
            AbstractC2022vd.g(c1358jDG, "NativeJavascriptExecutor.initializeEngine");
        }
        return c1547mn;
    }
}
