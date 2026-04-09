package com.google.gson;

/* compiled from: JsonObject.java */
/* loaded from: classes2.dex */
public final class j extends g {

    /* renamed from: b, reason: collision with root package name */
    public final com.google.gson.internal.f<String, g> f23513b = new com.google.gson.internal.f<>();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof j) && ((j) obj).f23513b.equals(this.f23513b);
        }
        return true;
    }

    public final int hashCode() {
        return this.f23513b.hashCode();
    }
}
