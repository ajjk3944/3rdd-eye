package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.gn0;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class hn0 implements sj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gn0 f28288a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List<ag<?>> f28289b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ej0 f28290c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ gn0.a f28291d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ mb2<tn0> f28292e;

    public hn0(gn0 gn0Var, List list, ej0 ej0Var, rn0 rn0Var, mb2 mb2Var) {
        this.f28288a = gn0Var;
        this.f28289b = list;
        this.f28290c = ej0Var;
        this.f28291d = rn0Var;
        this.f28292e = mb2Var;
    }

    @Override // com.yandex.mobile.ads.impl.sj0
    public final void a(String url, Bitmap bitmap) {
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(bitmap, "bitmap");
    }

    @Override // com.yandex.mobile.ads.impl.sj0
    public final void a(Map<String, Bitmap> images) {
        kotlin.jvm.internal.l.f(images, "images");
        this.f28288a.f27840b.a(EnumC4191r4.f32466p);
        this.f28288a.f27842d.a(this.f28288a.f27841c.a(this.f28289b, images), images);
        this.f28290c.a(images);
        this.f28291d.h(this.f28292e);
    }
}
