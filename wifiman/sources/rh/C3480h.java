package Rh;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Rh.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3480h {

    /* renamed from: e, reason: collision with root package name */
    public static final a f19925e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final C3480h f19926f = new C3480h(null, null, false, false, 8, null);

    /* renamed from: a, reason: collision with root package name */
    private final EnumC3483k f19927a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC3481i f19928b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f19929c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f19930d;

    /* renamed from: Rh.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3480h a() {
            return C3480h.f19926f;
        }

        private a() {
        }
    }

    public C3480h(EnumC3483k enumC3483k, EnumC3481i enumC3481i, boolean z10, boolean z11) {
        this.f19927a = enumC3483k;
        this.f19928b = enumC3481i;
        this.f19929c = z10;
        this.f19930d = z11;
    }

    public static /* synthetic */ C3480h c(C3480h c3480h, EnumC3483k enumC3483k, EnumC3481i enumC3481i, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC3483k = c3480h.f19927a;
        }
        if ((i10 & 2) != 0) {
            enumC3481i = c3480h.f19928b;
        }
        if ((i10 & 4) != 0) {
            z10 = c3480h.f19929c;
        }
        if ((i10 & 8) != 0) {
            z11 = c3480h.f19930d;
        }
        return c3480h.b(enumC3483k, enumC3481i, z10, z11);
    }

    public final C3480h b(EnumC3483k enumC3483k, EnumC3481i enumC3481i, boolean z10, boolean z11) {
        return new C3480h(enumC3483k, enumC3481i, z10, z11);
    }

    public final boolean d() {
        return this.f19929c;
    }

    public final EnumC3481i e() {
        return this.f19928b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3480h)) {
            return false;
        }
        C3480h c3480h = (C3480h) obj;
        return this.f19927a == c3480h.f19927a && this.f19928b == c3480h.f19928b && this.f19929c == c3480h.f19929c && this.f19930d == c3480h.f19930d;
    }

    public final EnumC3483k f() {
        return this.f19927a;
    }

    public final boolean g() {
        return this.f19930d;
    }

    public int hashCode() {
        EnumC3483k enumC3483k = this.f19927a;
        int iHashCode = (enumC3483k == null ? 0 : enumC3483k.hashCode()) * 31;
        EnumC3481i enumC3481i = this.f19928b;
        return ((((iHashCode + (enumC3481i != null ? enumC3481i.hashCode() : 0)) * 31) + Boolean.hashCode(this.f19929c)) * 31) + Boolean.hashCode(this.f19930d);
    }

    public String toString() {
        return "JavaTypeQualifiers(nullability=" + this.f19927a + ", mutability=" + this.f19928b + ", definitelyNotNull=" + this.f19929c + ", isNullabilityQualifierForWarning=" + this.f19930d + ')';
    }

    public /* synthetic */ C3480h(EnumC3483k enumC3483k, EnumC3481i enumC3481i, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC3483k, enumC3481i, z10, (i10 & 8) != 0 ? false : z11);
    }
}
