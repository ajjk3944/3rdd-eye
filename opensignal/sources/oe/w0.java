package oe;

import java.util.Map;

/* loaded from: classes.dex */
public final class w0 extends k0 {

    /* renamed from: r, reason: collision with root package name */
    public final transient z0 f19396r;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object[] f19397x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f19398y;

    public w0(z0 z0Var, Object[] objArr, int i10) {
        this.f19396r = z0Var;
        this.f19397x = objArr;
        this.f19398y = i10;
    }

    @Override // oe.c0
    public final int b(int i10, Object[] objArr) {
        return a().b(i10, objArr);
    }

    @Override // oe.c0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f19396r.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // oe.c0
    public final boolean g() {
        return true;
    }

    @Override // oe.c0
    /* renamed from: j */
    public final h1 iterator() {
        return a().listIterator(0);
    }

    @Override // oe.k0
    public final h0 n() {
        return new v0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19398y;
    }
}
