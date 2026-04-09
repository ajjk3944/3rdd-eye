package com.google.android.exoplayer2;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: b, reason: collision with root package name */
    public static final c1 f4084b;

    /* renamed from: a, reason: collision with root package name */
    public final qb.f f4085a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        qb.b.j(!false);
        f4084b = new c1(new qb.f(sparseBooleanArray));
    }

    public c1(qb.f fVar) {
        this.f4085a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c1) {
            return this.f4085a.equals(((c1) obj).f4085a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4085a.hashCode();
    }
}
