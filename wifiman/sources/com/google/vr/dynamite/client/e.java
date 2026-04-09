package com.google.vr.dynamite.client;

import java.util.Objects;

/* loaded from: classes3.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f39145a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39146b;

    public e(String str, String str2) {
        this.f39145a = str;
        this.f39146b = str2;
    }

    public final String a() {
        return this.f39145a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (Objects.equals(this.f39145a, eVar.f39145a) && Objects.equals(this.f39146b, eVar.f39146b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hashCode(this.f39145a) * 37) + Objects.hashCode(this.f39146b);
    }

    public final String toString() {
        return "[packageName=" + this.f39145a + ",libraryName=" + this.f39146b + "]";
    }
}
