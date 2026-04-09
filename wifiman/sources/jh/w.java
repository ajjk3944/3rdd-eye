package Jh;

import Rh.C3484l;
import Rh.EnumC3483k;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final C3484l f10207a;

    /* renamed from: b, reason: collision with root package name */
    private final Collection f10208b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f10209c;

    public w(C3484l nullabilityQualifier, Collection qualifierApplicabilityTypes, boolean z10) {
        AbstractC6492s.i(nullabilityQualifier, "nullabilityQualifier");
        AbstractC6492s.i(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f10207a = nullabilityQualifier;
        this.f10208b = qualifierApplicabilityTypes;
        this.f10209c = z10;
    }

    public static /* synthetic */ w b(w wVar, C3484l c3484l, Collection collection, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c3484l = wVar.f10207a;
        }
        if ((i10 & 2) != 0) {
            collection = wVar.f10208b;
        }
        if ((i10 & 4) != 0) {
            z10 = wVar.f10209c;
        }
        return wVar.a(c3484l, collection, z10);
    }

    public final w a(C3484l nullabilityQualifier, Collection qualifierApplicabilityTypes, boolean z10) {
        AbstractC6492s.i(nullabilityQualifier, "nullabilityQualifier");
        AbstractC6492s.i(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        return new w(nullabilityQualifier, qualifierApplicabilityTypes, z10);
    }

    public final boolean c() {
        return this.f10209c;
    }

    public final C3484l d() {
        return this.f10207a;
    }

    public final Collection e() {
        return this.f10208b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return AbstractC6492s.d(this.f10207a, wVar.f10207a) && AbstractC6492s.d(this.f10208b, wVar.f10208b) && this.f10209c == wVar.f10209c;
    }

    public int hashCode() {
        return (((this.f10207a.hashCode() * 31) + this.f10208b.hashCode()) * 31) + Boolean.hashCode(this.f10209c);
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f10207a + ", qualifierApplicabilityTypes=" + this.f10208b + ", definitelyNotNull=" + this.f10209c + ')';
    }

    public /* synthetic */ w(C3484l c3484l, Collection collection, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3484l, collection, (i10 & 4) != 0 ? c3484l.c() == EnumC3483k.NOT_NULL : z10);
    }
}
