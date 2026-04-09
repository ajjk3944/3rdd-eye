package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class F5 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f35002a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f35003b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f35004c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ AbstractC4503y5 f35005d;

    private final Iterator a() {
        if (this.f35004c == null) {
            this.f35004c = this.f35005d.f35537c.entrySet().iterator();
        }
        return this.f35004c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35002a + 1 < this.f35005d.f35536b || (!this.f35005d.f35537c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f35003b = true;
        int i10 = this.f35002a + 1;
        this.f35002a = i10;
        return i10 < this.f35005d.f35536b ? (C5) this.f35005d.f35535a[this.f35002a] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f35003b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f35003b = false;
        this.f35005d.u();
        if (this.f35002a >= this.f35005d.f35536b) {
            a().remove();
            return;
        }
        AbstractC4503y5 abstractC4503y5 = this.f35005d;
        int i10 = this.f35002a;
        this.f35002a = i10 - 1;
        abstractC4503y5.j(i10);
    }

    private F5(AbstractC4503y5 abstractC4503y5) {
        this.f35005d = abstractC4503y5;
        this.f35002a = -1;
    }
}
