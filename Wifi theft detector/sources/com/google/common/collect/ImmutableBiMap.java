package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements i {

    public static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;

        public SerializedForm(ImmutableBiMap immutableBiMap) {
            super(immutableBiMap);
        }

        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a e(int i10) {
            return new a(i10);
        }
    }

    public static final class a extends ImmutableMap.a {
        public a(int i10) {
            super(i10);
        }

        @Override // com.google.common.collect.ImmutableMap.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public ImmutableBiMap a() {
            return d();
        }

        @Override // com.google.common.collect.ImmutableMap.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public ImmutableBiMap c() {
            throw new UnsupportedOperationException("Not supported for bimaps");
        }

        @Override // com.google.common.collect.ImmutableMap.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public ImmutableBiMap d() {
            int i10 = this.f11796c;
            if (i10 == 0) {
                return ImmutableBiMap.s();
            }
            if (this.f11794a != null) {
                if (this.f11797d) {
                    this.f11795b = Arrays.copyOf(this.f11795b, i10 * 2);
                }
                ImmutableMap.a.k(this.f11795b, this.f11796c, this.f11794a);
            }
            this.f11797d = true;
            return new RegularImmutableBiMap(this.f11795b, this.f11796c);
        }

        @Override // com.google.common.collect.ImmutableMap.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public a g(Object obj, Object obj2) {
            super.g(obj, obj2);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public a h(Map.Entry entry) {
            super.h(entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.a
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public a i(Iterable iterable) {
            super.i(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public a j(Map map) {
            super.j(map);
            return this;
        }
    }

    public static ImmutableBiMap s() {
        return RegularImmutableBiMap.f11930j;
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet j() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.i
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableBiMap g();

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public ImmutableSet values() {
        return g().keySet();
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
