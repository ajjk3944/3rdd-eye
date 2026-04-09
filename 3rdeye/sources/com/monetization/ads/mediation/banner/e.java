package com.monetization.ads.mediation.banner;

import android.view.View;
import android.view.ViewTreeObserver;
import com.monetization.ads.mediation.banner.d;
import com.yandex.mobile.ads.impl.fp0;
import com.yandex.mobile.ads.impl.mg2;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f23696a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d.a f23697b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f23698c;

    public e(d dVar, View view, d.a aVar) {
        this.f23696a = view;
        this.f23697b = aVar;
        this.f23698c = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(d this$0) {
        l.f(this$0, "this$0");
        mg2.a(d.a(this$0), false);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        fp0.d(new Object[0]);
        if (!this.f23696a.isShown()) {
            return true;
        }
        this.f23696a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f23697b.a();
        this.f23698c.f23694b.postDelayed(new B.b(this.f23698c, 27), 50L);
        return true;
    }
}
