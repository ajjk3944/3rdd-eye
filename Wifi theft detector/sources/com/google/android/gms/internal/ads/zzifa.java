package com.google.android.gms.internal.ads;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzifa implements Map.Entry, m9.a {
    private final /* synthetic */ Map.Entry zza;

    public zzifa(@NotNull Map.Entry delegate) {
        kotlin.jvm.internal.p.e(delegate, "delegate");
        this.zza = delegate;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zza.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
