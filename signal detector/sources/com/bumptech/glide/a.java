package com.bumptech.glide;

import H1.p;

/* loaded from: classes.dex */
public final class a implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public F1.a f6482a;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    public final boolean b(Object obj) {
        if (obj instanceof a) {
            return p.b(this.f6482a, ((a) obj).f6482a);
        }
        return false;
    }

    public final int c() {
        F1.a aVar = this.f6482a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b(obj);
    }

    public final int hashCode() {
        return c();
    }
}
