package oe;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class d0 extends o implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19312a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19313d;

    public d0(Object obj, Object obj2) {
        this.f19312a = obj;
        this.f19313d = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f19312a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f19313d;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
