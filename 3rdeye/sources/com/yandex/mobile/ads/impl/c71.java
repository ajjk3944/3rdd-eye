package com.yandex.mobile.ads.impl;

import b9.C1992A;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class c71 implements tb1 {

    /* renamed from: a, reason: collision with root package name */
    private final w31 f25554a;

    /* renamed from: b, reason: collision with root package name */
    private x61 f25555b;

    public c71(w31 nativeAd) {
        kotlin.jvm.internal.l.f(nativeAd, "nativeAd");
        this.f25554a = nativeAd;
    }

    @Override // com.yandex.mobile.ads.impl.tb1
    public final void a(x61 nativeAdViewAdapter) {
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
        nativeAdViewAdapter.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.tb1
    public final void a(x61 nativeAdViewAdapter, vo clickListenerConfigurator) {
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
        kotlin.jvm.internal.l.f(clickListenerConfigurator, "clickListenerConfigurator");
        this.f25555b = nativeAdViewAdapter;
        da daVar = new da(nativeAdViewAdapter, clickListenerConfigurator, this.f25554a.e(), new hh2());
        Iterator<ag<?>> it = this.f25554a.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ag<?> next = it.next();
            bg<?> bgVarA = nativeAdViewAdapter.a(next);
            bg<?> bgVar = bgVarA != null ? bgVarA : null;
            if (bgVar != null) {
                bgVar.c(next.d());
                bgVar.a(next, daVar);
            }
        }
        List<b9.l<String, gv>> listB = nativeAdViewAdapter.g().b();
        if (listB != null) {
            Iterator<T> it2 = listB.iterator();
            while (it2.hasNext()) {
                bg<?> bgVarA2 = nativeAdViewAdapter.a((String) ((b9.l) it2.next()).f18083b);
                if (bgVarA2 == null) {
                    bgVarA2 = null;
                }
                if (bgVarA2 != null) {
                    bgVarA2.c(C1992A.f18074a);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.tb1
    public final void a() {
        x61 x61Var = this.f25555b;
        if (x61Var != null) {
            for (ag<?> agVar : this.f25554a.b()) {
                bg<?> bgVarA = x61Var.a(agVar);
                if (bgVarA instanceof t00) {
                    ((t00) bgVarA).b(agVar.d());
                }
            }
        }
    }
}
