package androidx.camera.core.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: QuirkSettings.java */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15123a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<Class<? extends y0>> f15124b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<Class<? extends y0>> f15125c;

    public z0() {
        throw null;
    }

    public z0(boolean z10, HashSet hashSet, HashSet hashSet2) {
        this.f15123a = z10;
        this.f15124b = hashSet == null ? Collections.EMPTY_SET : new HashSet<>(hashSet);
        this.f15125c = hashSet2 == null ? Collections.EMPTY_SET : new HashSet<>(hashSet2);
    }

    public final boolean a(Class<? extends y0> cls, boolean z10) {
        if (this.f15124b.contains(cls)) {
            return true;
        }
        return !this.f15125c.contains(cls) && this.f15123a && z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        z0 z0Var = (z0) obj;
        return this.f15123a == z0Var.f15123a && Objects.equals(this.f15124b, z0Var.f15124b) && Objects.equals(this.f15125c, z0Var.f15125c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f15123a), this.f15124b, this.f15125c);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f15123a + ", forceEnabledQuirks=" + this.f15124b + ", forceDisabledQuirks=" + this.f15125c + '}';
    }
}
