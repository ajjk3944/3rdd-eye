package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
final class M1 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f35612a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35613b;

    M1(Object obj, int i10) {
        this.f35612a = obj;
        this.f35613b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof M1)) {
            return false;
        }
        M1 m12 = (M1) obj;
        return this.f35612a == m12.f35612a && this.f35613b == m12.f35613b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f35612a) * 65535) + this.f35613b;
    }
}
