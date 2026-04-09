package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import java.util.List;

/* loaded from: classes3.dex */
public final class dk0 implements hk0, h11, he2, wo1 {

    /* renamed from: a, reason: collision with root package name */
    private final a f26208a;

    /* renamed from: b, reason: collision with root package name */
    private final C4101e4 f26209b;

    /* renamed from: c, reason: collision with root package name */
    private final fk0 f26210c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f26211d;

    /* renamed from: e, reason: collision with root package name */
    private List<tx1> f26212e;

    /* renamed from: f, reason: collision with root package name */
    private C4108f4 f26213f;

    public interface a {
        void a(C4108f4 c4108f4);
    }

    public dk0(Context context, a impressionListener, gk0 impressionReporter, C4101e4 adIdStorageManager, fk0 impressionReportController) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(impressionListener, "impressionListener");
        kotlin.jvm.internal.l.f(impressionReporter, "impressionReporter");
        kotlin.jvm.internal.l.f(adIdStorageManager, "adIdStorageManager");
        kotlin.jvm.internal.l.f(impressionReportController, "impressionReportController");
        this.f26208a = impressionListener;
        this.f26209b = adIdStorageManager;
        this.f26210c = impressionReportController;
        this.f26211d = context.getApplicationContext();
    }

    private final boolean i() {
        List<tx1> list = this.f26212e;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public final void a(List<tx1> showNotices, C4108f4 c4108f4) {
        kotlin.jvm.internal.l.f(showNotices, "showNotices");
        this.f26212e = showNotices;
        this.f26213f = c4108f4;
        this.f26210c.a();
    }

    @Override // com.yandex.mobile.ads.impl.h11
    public final void b() {
        if (i()) {
            return;
        }
        this.f26210c.c();
        if (a()) {
            this.f26209b.a();
            this.f26208a.a(this.f26213f);
        }
    }

    @Override // com.yandex.mobile.ads.impl.hk0
    public final void c() {
        if (!i() || a()) {
            return;
        }
        this.f26209b.a();
        this.f26208a.a(this.f26213f);
    }

    @Override // com.yandex.mobile.ads.impl.he2
    public final void d() {
        if (i()) {
            return;
        }
        this.f26210c.b();
        if (a()) {
            return;
        }
        this.f26209b.a();
        this.f26208a.a(this.f26213f);
    }

    @Override // com.yandex.mobile.ads.impl.h11
    public final void e() {
        if (i()) {
            return;
        }
        this.f26210c.b();
        if (a()) {
            return;
        }
        this.f26209b.a();
        this.f26208a.a(this.f26213f);
    }

    @Override // com.yandex.mobile.ads.impl.hk0
    public final void g() {
        if (i() && a()) {
            this.f26209b.a();
            this.f26208a.a(this.f26213f);
        }
    }

    @Override // com.yandex.mobile.ads.impl.he2
    public final void h() {
        if (i()) {
            return;
        }
        this.f26210c.c();
        if (a()) {
            this.f26209b.a();
            this.f26208a.a(this.f26213f);
        }
    }

    private final boolean a() {
        ew1 ew1VarA = ew1.a.a();
        Context context = this.f26211d;
        kotlin.jvm.internal.l.e(context, "context");
        du1 du1VarA = ew1VarA.a(context);
        return du1VarA == null || du1VarA.h0();
    }

    @Override // com.yandex.mobile.ads.impl.wo1
    public final void f() {
    }
}
