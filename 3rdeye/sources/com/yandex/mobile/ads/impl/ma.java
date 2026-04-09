package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.a92;
import com.yandex.mobile.ads.impl.ew1;
import java.util.Set;

/* loaded from: classes3.dex */
public class ma implements ca1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30312a;

    /* renamed from: b, reason: collision with root package name */
    private final q71 f30313b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<? extends String> f30314c;

    /* renamed from: d, reason: collision with root package name */
    private final ah1 f30315d;

    /* renamed from: e, reason: collision with root package name */
    private x61 f30316e;

    public /* synthetic */ ma(Context context, q71 q71Var, Set set) {
        this(context, q71Var, set, ah1.f24667h.a(context), 0);
    }

    public a92 a(Context context, int i, boolean z10, boolean z11) {
        kotlin.jvm.internal.l.f(context, "context");
        x61 x61Var = this.f30316e;
        View viewE = x61Var != null ? x61Var.e() : null;
        Set<? extends String> set = this.f30314c;
        a92.a status = a92.a.f24562d;
        kotlin.jvm.internal.l.f(status, "status");
        if (!set.contains(status.a()) && z10 && !z11) {
            return new a92(status, null);
        }
        if (viewE == null) {
            return new a92(a92.a.f24571n, null);
        }
        Set<? extends String> set2 = this.f30314c;
        a92.a status2 = a92.a.f24572o;
        kotlin.jvm.internal.l.f(status2, "status");
        if (!set2.contains(status2.a()) && jh2.d(viewE)) {
            return new a92(status2, null);
        }
        Set<? extends String> set3 = this.f30314c;
        a92.a status3 = a92.a.f24573p;
        kotlin.jvm.internal.l.f(status3, "status");
        if (!set3.contains(status3.a())) {
            int i10 = jh2.f29145b;
            if (viewE.getWidth() < 10 || viewE.getHeight() < 10) {
                return new a92(status3, null);
            }
        }
        Set<? extends String> set4 = this.f30314c;
        a92.a status4 = a92.a.f24574q;
        kotlin.jvm.internal.l.f(status4, "status");
        if (!set4.contains(status4.a()) && jh2.b(viewE) < 1) {
            return new a92(status4, null);
        }
        Set<? extends String> set5 = this.f30314c;
        a92.a status5 = a92.a.f24568k;
        kotlin.jvm.internal.l.f(status5, "status");
        if (!set5.contains(status5.a()) && !jh2.a(viewE, i) && !z11) {
            return new a92(status5, null);
        }
        q71 q71Var = this.f30313b;
        du1 du1VarA = ew1.a.a().a(this.f30312a);
        return q71Var.a(z11, du1VarA != null ? du1VarA.M() : false);
    }

    @Override // com.yandex.mobile.ads.impl.ca1
    public final boolean b() {
        View viewE;
        x61 x61Var = this.f30316e;
        if (x61Var == null || (viewE = x61Var.e()) == null) {
            return true;
        }
        return jh2.d(viewE);
    }

    @Override // com.yandex.mobile.ads.impl.ca1
    public final boolean c() {
        View viewE;
        x61 x61Var = this.f30316e;
        return (x61Var == null || (viewE = x61Var.e()) == null || jh2.b(viewE) < 1) ? false : true;
    }

    private ma(Context context, q71 nativeAdAssetsValidator, Set<? extends String> rules, ah1 phoneStateTracker) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(nativeAdAssetsValidator, "nativeAdAssetsValidator");
        kotlin.jvm.internal.l.f(rules, "rules");
        kotlin.jvm.internal.l.f(phoneStateTracker, "phoneStateTracker");
        this.f30312a = context;
        this.f30313b = nativeAdAssetsValidator;
        this.f30314c = rules;
        this.f30315d = phoneStateTracker;
    }

    @Override // com.yandex.mobile.ads.impl.ca1
    public final a92 b(Context context, int i) {
        kotlin.jvm.internal.l.f(context, "context");
        return a(i, context, true);
    }

    public /* synthetic */ ma(Context context, q71 q71Var, Set set, ah1 ah1Var, int i) {
        this(context, q71Var, set, ah1Var);
    }

    @Override // com.yandex.mobile.ads.impl.ca1
    public final void a(x61 x61Var) {
        this.f30313b.a(x61Var);
        this.f30316e = x61Var;
    }

    @Override // com.yandex.mobile.ads.impl.ca1
    public final kq1 a() {
        return this.f30313b.a();
    }

    private final a92 a(int i, Context context, boolean z10) {
        return a(context, i, !this.f30315d.b(), z10);
    }

    @Override // com.yandex.mobile.ads.impl.ca1
    public final a92 a(Context context, int i) {
        kotlin.jvm.internal.l.f(context, "context");
        return a(i, context, false);
    }
}
