package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class f extends g implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f38980a = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof f) && ((f) obj).f38980a.equals(this.f38980a));
    }

    public int hashCode() {
        return this.f38980a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f38980a.iterator();
    }

    public void m(g gVar) {
        if (gVar == null) {
            gVar = h.f38981a;
        }
        this.f38980a.add(gVar);
    }
}
