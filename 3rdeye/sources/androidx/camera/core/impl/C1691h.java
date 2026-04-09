package androidx.camera.core.impl;

/* compiled from: AutoValue_Identifier.java */
/* renamed from: androidx.camera.core.impl.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1691h extends AbstractC1688f0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15041a;

    public C1691h(Object obj) {
        this.f15041a = obj;
    }

    @Override // androidx.camera.core.impl.AbstractC1688f0
    public final Object a() {
        return this.f15041a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1688f0) {
            return this.f15041a.equals(((AbstractC1688f0) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f15041a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Identifier{value=" + this.f15041a + "}";
    }
}
