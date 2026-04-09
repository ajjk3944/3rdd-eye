package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C4071a2;
import com.yandex.mobile.ads.impl.dx1;
import com.yandex.mobile.ads.impl.rq1;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class kk<T> extends op1<T> {

    /* renamed from: w, reason: collision with root package name */
    private static final int f29682w = (int) TimeUnit.SECONDS.toMillis(10);

    /* renamed from: s, reason: collision with root package name */
    private final Context f29683s;

    /* renamed from: t, reason: collision with root package name */
    private final a<T> f29684t;

    /* renamed from: u, reason: collision with root package name */
    private final yp1 f29685u;

    /* renamed from: v, reason: collision with root package name */
    private final gq1 f29686v;

    public interface a<T> extends rq1.b<T>, rq1.a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(Context context, int i, String url, a<T> listener, yp1 yp1Var) {
        super(i, url, listener);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f29683s = context;
        this.f29684t = listener;
        this.f29685u = yp1Var;
        q();
        a(new h00(1.0f, f29682w, 0));
        this.f29686v = gq1.f27872b;
    }

    public final void a(Integer num) {
        Context context = this.f29683s;
        kotlin.jvm.internal.l.f(context, "context");
        int i = C4071a2.f24390e;
        C4071a2.a.a(context).a(w(), num);
    }

    @Override // com.yandex.mobile.ads.impl.op1
    public fi2 b(fi2 volleyError) {
        kotlin.jvm.internal.l.f(volleyError, "volleyError");
        nc1 nc1Var = volleyError.f27346b;
        a(nc1Var != null ? Integer.valueOf(nc1Var.f30835a) : null);
        return volleyError;
    }

    public gq1 w() {
        return this.f29686v;
    }

    public final void x() {
        yp1 yp1Var = this.f29685u;
        if (yp1Var != null) {
            yp1Var.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.op1
    public final void a(T t10) {
        this.f29684t.a((a<T>) t10);
    }

    public final void a(Map<String, String> headers) {
        kotlin.jvm.internal.l.f(headers, "headers");
        String strA = hf0.a(headers, gh0.f27714b0);
        if (strA != null) {
            dx1.a aVar = dx1.f26520a;
            Context context = this.f29683s;
            aVar.getClass();
            dx1.a.a(context).a(strA);
        }
    }

    public /* synthetic */ kk(Context context, String str, a aVar) {
        this(context, 0, str, aVar, null);
    }
}
