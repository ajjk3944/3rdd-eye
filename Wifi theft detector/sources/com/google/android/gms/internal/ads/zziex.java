package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zziex implements Iterator, m9.a {
    private final /* synthetic */ Iterator zza;

    public zziex(@NotNull Iterator delegate) {
        kotlin.jvm.internal.p.e(delegate, "delegate");
        this.zza = delegate;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
