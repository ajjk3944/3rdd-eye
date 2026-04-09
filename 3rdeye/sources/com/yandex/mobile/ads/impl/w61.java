package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.a92;
import com.yandex.mobile.ads.impl.ew1;

/* loaded from: classes3.dex */
public class w61 implements ca1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34830a;

    /* renamed from: b, reason: collision with root package name */
    private final q71 f34831b;

    /* renamed from: c, reason: collision with root package name */
    private final a8<?> f34832c;

    /* renamed from: d, reason: collision with root package name */
    private final ah1 f34833d;

    /* renamed from: e, reason: collision with root package name */
    private x61 f34834e;

    public /* synthetic */ w61(Context context, q71 q71Var, a8 a8Var) {
        this(context, q71Var, a8Var, ah1.f24667h.a(context));
    }

    public a92 a(Context context, int i, boolean z10, boolean z11) {
        View viewE;
        View viewE2;
        View viewE3;
        kotlin.jvm.internal.l.f(context, "context");
        if (z10 && !z11) {
            return new a92(a92.a.f24562d, null);
        }
        if (b()) {
            return new a92(a92.a.f24572o, null);
        }
        x61 x61Var = this.f34834e;
        if (x61Var != null && (viewE = x61Var.e()) != null) {
            int i10 = jh2.f29145b;
            if (viewE.getWidth() >= 10 && viewE.getHeight() >= 10) {
                x61 x61Var2 = this.f34834e;
                if (x61Var2 == null || (viewE2 = x61Var2.e()) == null || jh2.b(viewE2) < 1) {
                    return new a92(a92.a.f24574q, null);
                }
                x61 x61Var3 = this.f34834e;
                if ((x61Var3 == null || (viewE3 = x61Var3.e()) == null || !jh2.a(viewE3, i)) && !z11) {
                    return new a92(a92.a.f24568k, null);
                }
                if (kotlin.jvm.internal.l.b(b10.f25040c.a(), this.f34832c.w())) {
                    return new a92(a92.a.f24561c, null);
                }
                q71 q71Var = this.f34831b;
                du1 du1VarA = ew1.a.a().a(this.f34830a);
                return q71Var.a(z11, du1VarA != null ? du1VarA.M() : false);
            }
        }
        return new a92(a92.a.f24573p, null);
    }

    @Override // com.yandex.mobile.ads.impl.ca1
    public final boolean b() {
        View viewE;
        x61 x61Var = this.f34834e;
        if (x61Var == null || (viewE = x61Var.e()) == null) {
            return true;
        }
        return jh2.d(viewE);
    }

    @Override // com.yandex.mobile.ads.impl.ca1
    public final boolean c() {
        View viewE;
        x61 x61Var = this.f34834e;
        return (x61Var == null || (viewE = x61Var.e()) == null || jh2.b(viewE) < 1) ? false : true;
    }

    public w61(Context context, q71 nativeAdAssetsValidator, a8<?> adResponse, ah1 phoneStateTracker) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(nativeAdAssetsValidator, "nativeAdAssetsValidator");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(phoneStateTracker, "phoneStateTracker");
        this.f34830a = context;
        this.f34831b = nativeAdAssetsValidator;
        this.f34832c = adResponse;
        this.f34833d = phoneStateTracker;
    }

    @Override // com.yandex.mobile.ads.impl.ca1
    public final a92 b(Context context, int i) {
        kotlin.jvm.internal.l.f(context, "context");
        return a(i, context, true);
    }

    @Override // com.yandex.mobile.ads.impl.ca1
    public final void a(x61 x61Var) {
        this.f34831b.a(x61Var);
        this.f34834e = x61Var;
    }

    @Override // com.yandex.mobile.ads.impl.ca1
    public final kq1 a() {
        return this.f34831b.a();
    }

    private final a92 a(int i, Context context, boolean z10) {
        return a(context, i, !this.f34833d.b(), z10);
    }

    @Override // com.yandex.mobile.ads.impl.ca1
    public final a92 a(Context context, int i) {
        kotlin.jvm.internal.l.f(context, "context");
        return a(i, context, false);
    }
}
