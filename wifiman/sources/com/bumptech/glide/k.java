package com.bumptech.glide;

import W2.l;

/* loaded from: classes.dex */
public abstract class k implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private U2.c f34247a = U2.a.a();

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k clone() {
        try {
            return (k) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    final U2.c c() {
        return this.f34247a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return l.d(this.f34247a, ((k) obj).f34247a);
        }
        return false;
    }

    public int hashCode() {
        U2.c cVar = this.f34247a;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }
}
