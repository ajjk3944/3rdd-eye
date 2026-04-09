package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class qu {

    /* renamed from: a, reason: collision with root package name */
    private final h80 f32341a;

    /* renamed from: b, reason: collision with root package name */
    private final List<y52> f32342b;

    /* renamed from: c, reason: collision with root package name */
    private final dr0 f32343c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private h80 f32344a;

        /* renamed from: b, reason: collision with root package name */
        private List<y52> f32345b;

        /* renamed from: c, reason: collision with root package name */
        private dr0 f32346c;

        public final void a(h80 h80Var) {
            this.f32344a = h80Var;
        }

        public final void a(dr0 dr0Var) {
            this.f32346c = dr0Var;
        }

        public final void a(List list) {
            this.f32345b = list;
        }

        public final qu a() {
            return new qu(this.f32344a, this.f32345b, this.f32346c);
        }
    }

    public qu(h80 h80Var, List<y52> list, dr0 dr0Var) {
        this.f32341a = h80Var;
        this.f32342b = list;
        this.f32343c = dr0Var;
    }

    public final h80 a() {
        return this.f32341a;
    }

    public final dr0 b() {
        return this.f32343c;
    }

    public final List<y52> c() {
        return this.f32342b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu)) {
            return false;
        }
        qu quVar = (qu) obj;
        return kotlin.jvm.internal.l.b(this.f32341a, quVar.f32341a) && kotlin.jvm.internal.l.b(this.f32342b, quVar.f32342b) && kotlin.jvm.internal.l.b(this.f32343c, quVar.f32343c);
    }

    public final int hashCode() {
        h80 h80Var = this.f32341a;
        int iHashCode = (h80Var == null ? 0 : h80Var.hashCode()) * 31;
        List<y52> list = this.f32342b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        dr0 dr0Var = this.f32343c;
        return iHashCode2 + (dr0Var != null ? dr0Var.hashCode() : 0);
    }

    public final String toString() {
        return "CreativeExtensions(falseClick=" + this.f32341a + ", trackingEvents=" + this.f32342b + ", linearCreativeInfo=" + this.f32343c + ")";
    }
}
