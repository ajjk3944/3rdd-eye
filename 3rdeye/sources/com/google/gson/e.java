package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: JsonArray.java */
/* loaded from: classes2.dex */
public final class e extends g implements Iterable<g> {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f23370b = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof e) && ((e) obj).f23370b.equals(this.f23370b);
        }
        return true;
    }

    public final int hashCode() {
        return this.f23370b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<g> iterator() {
        return this.f23370b.iterator();
    }
}
