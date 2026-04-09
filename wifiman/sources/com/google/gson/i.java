package com.google.gson;

import java.util.Set;

/* loaded from: classes3.dex */
public final class i extends g {

    /* renamed from: a, reason: collision with root package name */
    private final t5.h f38982a = new t5.h(false);

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof i) && ((i) obj).f38982a.equals(this.f38982a));
    }

    public int hashCode() {
        return this.f38982a.hashCode();
    }

    public void m(String str, g gVar) {
        t5.h hVar = this.f38982a;
        if (gVar == null) {
            gVar = h.f38981a;
        }
        hVar.put(str, gVar);
    }

    public Set o() {
        return this.f38982a.entrySet();
    }
}
