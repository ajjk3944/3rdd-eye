package oe;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v0 extends h0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w0 f19389g;

    public v0(w0 w0Var) {
        this.f19389g = w0Var;
    }

    @Override // oe.c0
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        w0 w0Var = this.f19389g;
        ba.m.j(i10, w0Var.f19398y);
        Object[] objArr = w0Var.f19397x;
        int i11 = i10 * 2;
        Object obj = objArr[i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19389g.f19398y;
    }
}
