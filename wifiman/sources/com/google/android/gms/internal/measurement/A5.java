package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class A5 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f34929a;

    /* renamed from: b, reason: collision with root package name */
    private Iterator f34930b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ AbstractC4503y5 f34931c;

    private final Iterator a() {
        if (this.f34930b == null) {
            this.f34930b = this.f34931c.f35540f.entrySet().iterator();
        }
        return this.f34930b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f34929a;
        return (i10 > 0 && i10 <= this.f34931c.f35536b) || a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (a().hasNext()) {
            return (Map.Entry) a().next();
        }
        Object[] objArr = this.f34931c.f35535a;
        int i10 = this.f34929a - 1;
        this.f34929a = i10;
        return (C5) objArr[i10];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private A5(AbstractC4503y5 abstractC4503y5) {
        this.f34931c = abstractC4503y5;
        this.f34929a = abstractC4503y5.f35536b;
    }
}
