package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.Map;

@Immutable(containerOf = {"B"})
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class ImmutableClassToInstanceMap<B> extends s implements Map, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final ImmutableClassToInstanceMap f11780a = new ImmutableClassToInstanceMap(ImmutableMap.o());
    private final ImmutableMap<Class<? extends B>, B> delegate;

    public ImmutableClassToInstanceMap(ImmutableMap immutableMap) {
        this.delegate = immutableMap;
    }

    public static ImmutableClassToInstanceMap i() {
        return f11780a;
    }

    @Override // com.google.common.collect.v
    public Map h() {
        return this.delegate;
    }

    public Object readResolve() {
        return isEmpty() ? i() : this;
    }
}
