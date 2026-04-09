package r5;

import java.util.HashSet;
import java.util.Set;

/* compiled from: AutoValue_ConfigUpdate.java */
/* renamed from: r5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5523a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f45687a;

    public C5523a(HashSet hashSet) {
        this.f45687a = hashSet;
    }

    @Override // r5.b
    public final Set<String> a() {
        return this.f45687a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return this.f45687a.equals(((b) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f45687a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f45687a + "}";
    }
}
