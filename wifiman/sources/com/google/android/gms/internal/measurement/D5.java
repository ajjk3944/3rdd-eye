package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes.dex */
final class D5 extends E5 {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AbstractC4503y5 f34983b;

    @Override // com.google.android.gms.internal.measurement.E5, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new A5(this.f34983b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private D5(AbstractC4503y5 abstractC4503y5) {
        super(abstractC4503y5);
        this.f34983b = abstractC4503y5;
    }
}
