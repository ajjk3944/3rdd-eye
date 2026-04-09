package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
final class X9 extends V9 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f35662a;

    X9(Object obj) {
        this.f35662a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof X9) {
            return this.f35662a.equals(((X9) obj).f35662a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35662a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f35662a.toString() + ")";
    }
}
