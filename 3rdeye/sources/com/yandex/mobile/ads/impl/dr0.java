package com.yandex.mobile.ads.impl;

import c9.C2099t;
import java.util.List;

/* loaded from: classes3.dex */
public final class dr0 {

    /* renamed from: a, reason: collision with root package name */
    private final List<ag<?>> f26297a;

    private dr0(List list) {
        this.f26297a = list;
    }

    public final List<ag<?>> a() {
        return this.f26297a;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private List<? extends ag<?>> f26298a = C2099t.f18581b;

        public final void a(List<? extends ag<?>> assets) {
            kotlin.jvm.internal.l.f(assets, "assets");
            this.f26298a = assets;
        }

        public final void a(ir0 link) {
            kotlin.jvm.internal.l.f(link, "link");
        }

        public final dr0 a() {
            return new dr0(this.f26298a, 0);
        }
    }

    public /* synthetic */ dr0(List list, int i) {
        this(list);
    }
}
