package com.google.common.collect;

/* loaded from: classes2.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f12059a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final m f12060b = new b(-1);

    /* renamed from: c, reason: collision with root package name */
    public static final m f12061c = new b(1);

    public class a extends m {
        public a() {
            super(null);
        }

        @Override // com.google.common.collect.m
        public m d(Comparable comparable, Comparable comparable2) {
            return g(comparable.compareTo(comparable2));
        }

        @Override // com.google.common.collect.m
        public int e() {
            return 0;
        }

        public m g(int i10) {
            return i10 < 0 ? m.f12060b : i10 > 0 ? m.f12061c : m.f12059a;
        }
    }

    public static final class b extends m {

        /* renamed from: d, reason: collision with root package name */
        public final int f12062d;

        public b(int i10) {
            super(null);
            this.f12062d = i10;
        }

        @Override // com.google.common.collect.m
        public m d(Comparable comparable, Comparable comparable2) {
            return this;
        }

        @Override // com.google.common.collect.m
        public int e() {
            return this.f12062d;
        }
    }

    public /* synthetic */ m(a aVar) {
        this();
    }

    public static m f() {
        return f12059a;
    }

    public abstract m d(Comparable comparable, Comparable comparable2);

    public abstract int e();

    public m() {
    }
}
