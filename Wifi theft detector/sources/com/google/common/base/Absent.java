package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
final class Absent<T> extends Optional<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final Absent f11540a = new Absent();
    private static final long serialVersionUID = 0;

    private Absent() {
    }

    public static Optional j() {
        return f11540a;
    }

    private Object readResolve() {
        return f11540a;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.google.common.base.Optional
    public boolean g() {
        return false;
    }

    public int hashCode() {
        return 2040732332;
    }

    @Override // com.google.common.base.Optional
    public Object i(Object obj) {
        return g.n(obj, "use Optional.orNull() instead of Optional.or(null)");
    }

    public String toString() {
        return "Optional.absent()";
    }
}
