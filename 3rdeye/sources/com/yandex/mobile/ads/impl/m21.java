package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import com.yandex.mobile.ads.impl.gu0;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class m21 extends sf1 {

    /* renamed from: k, reason: collision with root package name */
    private final d21 f30164k;

    /* renamed from: l, reason: collision with root package name */
    private a f30165l;

    /* renamed from: m, reason: collision with root package name */
    private final q21 f30166m;

    /* renamed from: n, reason: collision with root package name */
    private gu0 f30167n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f30168o;

    public interface a {
        void a();

        void b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m21(Context context) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
        d21 d21Var = new d21();
        this.f30164k = d21Var;
        this.f30166m = new q21(this, d21Var);
        this.f30167n = new gy1();
    }

    @Override // com.yandex.mobile.ads.impl.sf1, com.yandex.mobile.ads.impl.mg0
    public final void a() {
        super.a();
        a aVar = this.f30165l;
        if (aVar != null) {
            this.f30168o = true;
            aVar.b();
            this.f30165l = null;
        }
    }

    public final void c(String htmlResponse) {
        kotlin.jvm.internal.l.f(htmlResponse, "htmlResponse");
        if (this.f30168o) {
            return;
        }
        this.f30166m.b(htmlResponse);
    }

    @Override // com.yandex.mobile.ads.impl.sf1
    public final void h() {
        this.f30166m.b();
    }

    public final d21 k() {
        return this.f30164k;
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        gu0.a aVarA = this.f30167n.a(i, i10);
        super.onMeasure(aVarA.f27985a, aVarA.f27986b);
    }

    public final void setAspectRatio(float f10) {
        this.f30167n = new fm1(f10);
    }

    public final void setClickListener(to clickListener) {
        kotlin.jvm.internal.l.f(clickListener, "clickListener");
        this.f30166m.a(clickListener);
    }

    public final void setPreloadListener(a aVar) {
        this.f30165l = aVar;
    }

    @Override // com.yandex.mobile.ads.impl.sf1, com.yandex.mobile.ads.impl.mg0
    public final void a(int i) {
        super.a(i);
        if (this.f30165l != null) {
            stopLoading();
            a aVar = this.f30165l;
            if (aVar != null) {
                aVar.a();
            }
            this.f30165l = null;
        }
    }
}
