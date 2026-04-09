package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class Fi extends C4648gn {

    /* renamed from: d, reason: collision with root package name */
    public final Ei f39459d;

    /* renamed from: e, reason: collision with root package name */
    public final ICommonExecutor f39460e;

    public Fi(C4940s5 c4940s5, Hl hl, ICommonExecutor iCommonExecutor) {
        super(c4940s5, hl);
        this.f39459d = new Ei(this);
        this.f39460e = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.C4648gn
    public final void a() {
        this.f39460e.remove(this.f39459d);
    }

    @Override // io.appmetrica.analytics.impl.C4648gn
    public final void f() {
        this.f40979b.a();
        C5028vh c5028vh = (C5028vh) ((C4940s5) this.f40978a).f41608k.a();
        if (c5028vh.f41867k.a(c5028vh.f41866j)) {
            String str = c5028vh.f41869m;
            if (TextUtils.isEmpty(str) || "-1".equals(str)) {
                return;
            }
            try {
                a(C4691ie.a((C4940s5) this.f40978a));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.C4648gn
    public final void g() {
        this.f39460e.executeDelayed(this.f39459d, TimeUnit.SECONDS.toMillis(1L));
    }

    public final void h() {
        if (this.f40980c.get()) {
            return;
        }
        this.f39460e.remove(this.f39459d);
        if (((C5028vh) ((C4940s5) this.f40978a).f41608k.a()).f41864g > 0) {
            this.f39460e.executeDelayed(this.f39459d, TimeUnit.SECONDS.toMillis(((C5028vh) ((C4940s5) this.f40978a).f41608k.a()).f41864g));
        }
    }
}
