package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class z71 implements h61 {

    /* renamed from: a, reason: collision with root package name */
    private final List<h61> f36234a;

    /* renamed from: b, reason: collision with root package name */
    private final h61 f36235b;

    public z71(ArrayList nativePrivates) {
        kotlin.jvm.internal.l.f(nativePrivates, "nativePrivates");
        this.f36234a = nativePrivates;
        this.f36235b = nativePrivates.isEmpty() ? null : (h61) nativePrivates.get(0);
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final p61 a() {
        h61 h61Var = this.f36235b;
        if (h61Var != null) {
            return h61Var.a();
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final void b(nt listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        h61 h61Var = this.f36235b;
        if (h61Var != null) {
            h61Var.b(listener);
        }
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final List<w20> c() {
        h61 h61Var = this.f36235b;
        if (h61Var != null) {
            return h61Var.c();
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final void destroy() {
        h61 h61Var = this.f36235b;
        if (h61Var != null) {
            h61Var.destroy();
        }
    }

    public final List<h61> e() {
        return this.f36234a;
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final kt getAdAssets() {
        kt adAssets;
        h61 h61Var = this.f36235b;
        return (h61Var == null || (adAssets = h61Var.getAdAssets()) == null) ? new kt(0) : adAssets;
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final ar1 getAdType() {
        ar1 adType;
        h61 h61Var = this.f36235b;
        return (h61Var == null || (adType = h61Var.getAdType()) == null) ? ar1.f24799c : adType;
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final String getInfo() {
        h61 h61Var = this.f36235b;
        if (h61Var != null) {
            return h61Var.getInfo();
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final rt getNativeAdVideoController() {
        h61 h61Var = this.f36235b;
        if (h61Var != null) {
            return h61Var.getNativeAdVideoController();
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final void loadImages() {
        h61 h61Var = this.f36235b;
        if (h61Var != null) {
            h61Var.loadImages();
        }
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final void a(nt listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        h61 h61Var = this.f36235b;
        if (h61Var != null) {
            h61Var.a(listener);
        }
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final void b(b71 viewProvider, oo clickConnector) throws v51 {
        kotlin.jvm.internal.l.f(viewProvider, "viewProvider");
        kotlin.jvm.internal.l.f(clickConnector, "clickConnector");
        h61 h61Var = this.f36235b;
        if (h61Var != null) {
            h61Var.b(viewProvider, clickConnector);
        }
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final void a(com.yandex.mobile.ads.nativeads.c cVar) {
        h61 h61Var = this.f36235b;
        if (h61Var != null) {
            h61Var.a(cVar);
        }
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final void a(lt ltVar) {
        h61 h61Var = this.f36235b;
        if (h61Var != null) {
            h61Var.a(ltVar);
        }
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final void b(b71 viewProvider) throws v51 {
        kotlin.jvm.internal.l.f(viewProvider, "viewProvider");
        h61 h61Var = this.f36235b;
        if (h61Var != null) {
            h61Var.b(viewProvider);
        }
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final c91 b() {
        c91 c91VarB;
        h61 h61Var = this.f36235b;
        return (h61Var == null || (c91VarB = h61Var.b()) == null) ? new c91(null, null) : c91VarB;
    }
}
