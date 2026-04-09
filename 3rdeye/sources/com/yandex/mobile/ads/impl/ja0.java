package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.impl.Oo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ja0 implements InterfaceC4200t {

    /* renamed from: a, reason: collision with root package name */
    private final String f29032a;

    /* renamed from: b, reason: collision with root package name */
    private final List<a> f29033b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f29034a;

        /* renamed from: b, reason: collision with root package name */
        private final String f29035b;

        public a(String title, String url) {
            kotlin.jvm.internal.l.f(title, "title");
            kotlin.jvm.internal.l.f(url, "url");
            this.f29034a = title;
            this.f29035b = url;
        }

        public final String a() {
            return this.f29034a;
        }

        public final String b() {
            return this.f29035b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.l.b(this.f29034a, aVar.f29034a) && kotlin.jvm.internal.l.b(this.f29035b, aVar.f29035b);
        }

        public final int hashCode() {
            return this.f29035b.hashCode() + (this.f29034a.hashCode() * 31);
        }

        public final String toString() {
            return Oo.h("Item(title=", this.f29034a, ", url=", this.f29035b, ")");
        }
    }

    public ja0(String actionType, ArrayList items) {
        kotlin.jvm.internal.l.f(actionType, "actionType");
        kotlin.jvm.internal.l.f(items, "items");
        this.f29032a = actionType;
        this.f29033b = items;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4200t
    public final String a() {
        return this.f29032a;
    }

    public final List<a> c() {
        return this.f29033b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja0)) {
            return false;
        }
        ja0 ja0Var = (ja0) obj;
        return kotlin.jvm.internal.l.b(this.f29032a, ja0Var.f29032a) && kotlin.jvm.internal.l.b(this.f29033b, ja0Var.f29033b);
    }

    public final int hashCode() {
        return this.f29033b.hashCode() + (this.f29032a.hashCode() * 31);
    }

    public final String toString() {
        return "FeedbackAction(actionType=" + this.f29032a + ", items=" + this.f29033b + ")";
    }
}
