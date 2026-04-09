package com.google.common.collect;

/* loaded from: classes2.dex */
public abstract class u extends q implements e0 {
    @Override // java.util.Collection, com.google.common.collect.e0
    public boolean equals(Object obj) {
        return obj == this || x().equals(obj);
    }

    @Override // java.util.Collection, com.google.common.collect.e0
    public int hashCode() {
        return x().hashCode();
    }

    @Override // com.google.common.collect.e0
    public int l(Object obj, int i10) {
        return x().l(obj, i10);
    }

    @Override // com.google.common.collect.e0
    public int m(Object obj, int i10) {
        return x().m(obj, i10);
    }

    @Override // com.google.common.collect.e0
    public int n(Object obj, int i10) {
        return x().n(obj, i10);
    }

    @Override // com.google.common.collect.e0
    public boolean p(Object obj, int i10, int i11) {
        return x().p(obj, i10, i11);
    }

    @Override // com.google.common.collect.e0
    public int r(Object obj) {
        return x().r(obj);
    }

    public abstract e0 x();
}
