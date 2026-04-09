package com.ui.wifiman.ui.teleport.consoles;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f45024a;

    public b(String id2) {
        AbstractC6492s.i(id2, "id");
        this.f45024a = id2;
    }

    public final String a() {
        return this.f45024a;
    }

    public final String b() {
        return this.f45024a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && AbstractC6492s.d(this.f45024a, ((b) obj).f45024a);
    }

    public int hashCode() {
        return this.f45024a.hashCode();
    }

    public String toString() {
        return "Params(id=" + this.f45024a + ")";
    }
}
