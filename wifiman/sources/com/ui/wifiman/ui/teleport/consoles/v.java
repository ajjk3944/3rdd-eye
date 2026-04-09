package com.ui.wifiman.ui.teleport.consoles;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final String f45100a;

    public v(String id2) {
        AbstractC6492s.i(id2, "id");
        this.f45100a = id2;
    }

    public final String a() {
        return this.f45100a;
    }

    public final String b() {
        return this.f45100a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && AbstractC6492s.d(this.f45100a, ((v) obj).f45100a);
    }

    public int hashCode() {
        return this.f45100a.hashCode();
    }

    public String toString() {
        return "Params(id=" + this.f45100a + ")";
    }
}
