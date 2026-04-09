package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.j2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4615j2 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private final Iterator f35695a;

    public C4615j2(Iterator it) {
        this.f35695a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35695a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f35695a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f35695a.remove();
    }
}
