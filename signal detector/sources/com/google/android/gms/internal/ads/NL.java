package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class NL implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f9993a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9994b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f9995c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LL f9996d;

    public /* synthetic */ NL(LL ll) {
        Objects.requireNonNull(ll);
        this.f9996d = ll;
        this.f9993a = -1;
    }

    public final Iterator a() {
        if (this.f9995c == null) {
            this.f9995c = this.f9996d.f9657c.entrySet().iterator();
        }
        return this.f9995c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f9993a + 1;
        LL ll = this.f9996d;
        if (i >= ll.f9656b) {
            return !ll.f9657c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f9994b = true;
        int i = this.f9993a + 1;
        this.f9993a = i;
        LL ll = this.f9996d;
        return i < ll.f9656b ? (ML) ll.f9655a[i] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f9994b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f9994b = false;
        LL ll = this.f9996d;
        ll.f();
        int i = this.f9993a;
        if (i >= ll.f9656b) {
            a().remove();
        } else {
            this.f9993a = i - 1;
            ll.d(i);
        }
    }
}
