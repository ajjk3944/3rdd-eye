package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zziez extends zziew implements Set, m9.a {

    @NotNull
    private final Set zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziez(@NotNull Set delegate) {
        super(delegate);
        kotlin.jvm.internal.p.e(delegate, "delegate");
        this.zza = delegate;
    }

    @Override // com.google.android.gms.internal.ads.zziew, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return super.contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zziew, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator iterator() {
        return new zziey(this.zza.iterator());
    }
}
