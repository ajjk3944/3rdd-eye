package androidx.camera.core.impl;

import androidx.camera.core.impl.K0;

/* compiled from: AutoValue_StateObservable_ErrorWrapper.java */
/* renamed from: androidx.camera.core.impl.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1699l extends K0.a {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f15084a;

    public C1699l(Throwable th) {
        if (th == null) {
            throw new NullPointerException("Null error");
        }
        this.f15084a = th;
    }

    @Override // androidx.camera.core.impl.K0.a
    public final Throwable a() {
        return this.f15084a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof K0.a) {
            return this.f15084a.equals(((K0.a) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f15084a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ErrorWrapper{error=" + this.f15084a + "}";
    }
}
