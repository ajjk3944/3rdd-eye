package com.yandex.mobile.ads.impl;

import c9.C2092m;
import c9.C2097r;
import com.yandex.mobile.ads.impl.t30;
import java.util.List;

/* loaded from: classes3.dex */
public final class dj2 implements t30.c {

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f26198c = {fa.a(dj2.class, "cacheListener", "getCacheListener()Lcom/monetization/ads/nativeads/video/cache/VideoCacheListener;", 0)};

    /* renamed from: d, reason: collision with root package name */
    private static final List<Integer> f26199d;

    /* renamed from: e, reason: collision with root package name */
    private static final List<Integer> f26200e;

    /* renamed from: f, reason: collision with root package name */
    private static final List<Integer> f26201f;

    /* renamed from: a, reason: collision with root package name */
    private final String f26202a;

    /* renamed from: b, reason: collision with root package name */
    private final ao1 f26203b;

    static {
        List<Integer> listW = C2092m.W(3, 4);
        f26199d = listW;
        List<Integer> listW2 = C2092m.W(1, 5);
        f26200e = listW2;
        f26201f = C2097r.y0(listW2, listW);
    }

    public dj2(String requestId, rd2 videoCacheListener) {
        kotlin.jvm.internal.l.f(requestId, "requestId");
        kotlin.jvm.internal.l.f(videoCacheListener, "videoCacheListener");
        this.f26202a = requestId;
        this.f26203b = bo1.a(videoCacheListener);
    }

    @Override // com.yandex.mobile.ads.impl.t30.c
    public final void a(t30 downloadManager, r30 download) {
        rd2 rd2Var;
        rd2 rd2Var2;
        kotlin.jvm.internal.l.f(downloadManager, "downloadManager");
        kotlin.jvm.internal.l.f(download, "download");
        if (kotlin.jvm.internal.l.b(download.f32442a.f34313b, this.f26202a)) {
            if (f26199d.contains(Integer.valueOf(download.f32443b)) && (rd2Var2 = (rd2) this.f26203b.getValue(this, f26198c[0])) != null) {
                rd2Var2.a();
            }
            if (f26200e.contains(Integer.valueOf(download.f32443b)) && (rd2Var = (rd2) this.f26203b.getValue(this, f26198c[0])) != null) {
                rd2Var.c();
            }
            if (f26201f.contains(Integer.valueOf(download.f32443b))) {
                downloadManager.a((t30.c) this);
            }
        }
    }
}
