package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class l31<K0, V0> {

    public static final class a<V> implements h32<List<V>>, Serializable {

        /* renamed from: b, reason: collision with root package name */
        private final int f29869b;

        public a(int i) {
            this.f29869b = jq.a(i, "expectedValuesPerKey");
        }

        @Override // com.yandex.mobile.ads.impl.h32
        public final Object get() {
            return new ArrayList(this.f29869b);
        }
    }

    public static abstract class b<K0, V0> extends l31<K0, V0> {
        public b() {
            super(0);
        }

        public abstract <K extends K0, V extends V0> mr0<K, V> b();
    }

    public static abstract class c<K0> {
        public final b<K0, Object> a() {
            jq.a(2, "expectedValuesPerKey");
            return new m31(this);
        }

        public abstract <K extends K0, V> Map<K, Collection<V>> b();
    }

    public /* synthetic */ l31(int i) {
        this();
    }

    public static c<Comparable> a() {
        gc1 gc1Var = gc1.f27622b;
        gc1Var.getClass();
        return new k31(gc1Var);
    }

    private l31() {
    }
}
