package com.ui.wifiman.ui.signal;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    private final String f44737a;

    public D(String id2) {
        AbstractC6492s.i(id2, "id");
        this.f44737a = id2;
    }

    public final String a() {
        return this.f44737a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D) && AbstractC6492s.d(this.f44737a, ((D) obj).f44737a);
    }

    public int hashCode() {
        return this.f44737a.hashCode();
    }

    public String toString() {
        return "Params(id=" + this.f44737a + ")";
    }
}
