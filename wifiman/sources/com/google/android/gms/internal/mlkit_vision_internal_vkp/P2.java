package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class P2 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f35624a = -1;

    /* renamed from: b, reason: collision with root package name */
    private boolean f35625b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f35626c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ T2 f35627d;

    /* synthetic */ P2(T2 t22, O2 o22) {
        this.f35627d = t22;
    }

    private final Iterator a() {
        if (this.f35626c == null) {
            this.f35626c = this.f35627d.f35638c.entrySet().iterator();
        }
        return this.f35626c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f35624a + 1;
        T2 t22 = this.f35627d;
        if (i10 >= t22.f35637b) {
            return !t22.f35638c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f35625b = true;
        int i10 = this.f35624a + 1;
        this.f35624a = i10;
        T2 t22 = this.f35627d;
        return i10 < t22.f35637b ? (N2) t22.f35636a[i10] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f35625b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f35625b = false;
        this.f35627d.s();
        int i10 = this.f35624a;
        T2 t22 = this.f35627d;
        if (i10 >= t22.f35637b) {
            a().remove();
        } else {
            this.f35624a = i10 - 1;
            t22.q(i10);
        }
    }
}
