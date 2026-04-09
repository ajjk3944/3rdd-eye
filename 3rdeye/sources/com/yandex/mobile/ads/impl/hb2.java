package com.yandex.mobile.ads.impl;

import c9.C2099t;
import java.util.List;

/* loaded from: classes3.dex */
public final class hb2 {

    /* renamed from: a, reason: collision with root package name */
    private final List<p70> f28165a;

    /* renamed from: b, reason: collision with root package name */
    private final List<y52> f28166b;

    private hb2(List<p70> list, List<y52> list2) {
        this.f28165a = list;
        this.f28166b = list2;
    }

    public final List<p70> a() {
        return this.f28165a;
    }

    public final List<y52> b() {
        return this.f28166b;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private List<p70> f28167a;

        /* renamed from: b, reason: collision with root package name */
        private List<y52> f28168b;

        public a() {
            C2099t c2099t = C2099t.f18581b;
            this.f28167a = c2099t;
            this.f28168b = c2099t;
        }

        public final a a(List<p70> extensions) {
            kotlin.jvm.internal.l.f(extensions, "extensions");
            this.f28167a = extensions;
            return this;
        }

        public final a b(List<y52> trackingEvents) {
            kotlin.jvm.internal.l.f(trackingEvents, "trackingEvents");
            this.f28168b = trackingEvents;
            return this;
        }

        public final hb2 a() {
            return new hb2(this.f28167a, this.f28168b, 0);
        }
    }

    public /* synthetic */ hb2(List list, List list2, int i) {
        this(list, list2);
    }
}
