package com.staircase3.opensignal.utils;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f6180a;

    /* renamed from: b, reason: collision with root package name */
    public final h f6181b;

    public g(String str, h hVar) {
        this.f6180a = str;
        this.f6181b = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f6181b == gVar.f6181b && this.f6180a.equals(gVar.f6180a);
    }

    public final int hashCode() {
        return this.f6181b.hashCode() + (this.f6180a.hashCode() * 31);
    }
}
