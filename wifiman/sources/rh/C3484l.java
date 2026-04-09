package Rh;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Rh.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3484l {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC3483k f19936a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f19937b;

    public C3484l(EnumC3483k qualifier, boolean z10) {
        AbstractC6492s.i(qualifier, "qualifier");
        this.f19936a = qualifier;
        this.f19937b = z10;
    }

    public static /* synthetic */ C3484l b(C3484l c3484l, EnumC3483k enumC3483k, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC3483k = c3484l.f19936a;
        }
        if ((i10 & 2) != 0) {
            z10 = c3484l.f19937b;
        }
        return c3484l.a(enumC3483k, z10);
    }

    public final C3484l a(EnumC3483k qualifier, boolean z10) {
        AbstractC6492s.i(qualifier, "qualifier");
        return new C3484l(qualifier, z10);
    }

    public final EnumC3483k c() {
        return this.f19936a;
    }

    public final boolean d() {
        return this.f19937b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3484l)) {
            return false;
        }
        C3484l c3484l = (C3484l) obj;
        return this.f19936a == c3484l.f19936a && this.f19937b == c3484l.f19937b;
    }

    public int hashCode() {
        return (this.f19936a.hashCode() * 31) + Boolean.hashCode(this.f19937b);
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f19936a + ", isForWarningOnly=" + this.f19937b + ')';
    }

    public /* synthetic */ C3484l(EnumC3483k enumC3483k, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC3483k, (i10 & 2) != 0 ? false : z10);
    }
}
