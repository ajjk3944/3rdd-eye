package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class ImmutableTable<R, C, V> extends g implements Serializable {

    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
    }

    @Override // com.google.common.collect.g
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.g
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.g
    public final void i() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.g
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final v0 h() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.g, com.google.common.collect.t0
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public ImmutableSet d() {
        return (ImmutableSet) super.d();
    }

    @Override // com.google.common.collect.g
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableSet j();

    public abstract SerializedForm n();

    @Override // com.google.common.collect.t0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableMap g();

    @Override // com.google.common.collect.g
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public final Object writeReplace() {
        n();
        return null;
    }
}
