package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k extends l implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f20891a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof k) && ((k) obj).f20891a.equals(this.f20891a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f20891a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f20891a.iterator();
    }
}
