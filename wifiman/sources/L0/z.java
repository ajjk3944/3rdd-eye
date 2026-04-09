package L0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    public static final a f11206c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final z f11207d = new z();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f11208a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11209b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z a() {
            return z.f11207d;
        }

        private a() {
        }
    }

    public /* synthetic */ z(int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10);
    }

    public final int b() {
        return this.f11209b;
    }

    public final boolean c() {
        return this.f11208a;
    }

    public final z d(z zVar) {
        return zVar == null ? this : zVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f11208a == zVar.f11208a && C3178h.g(this.f11209b, zVar.f11209b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f11208a) * 31) + C3178h.h(this.f11209b);
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f11208a + ", emojiSupportMatch=" + ((Object) C3178h.i(this.f11209b)) + ')';
    }

    public z(boolean z10) {
        this.f11208a = z10;
        this.f11209b = C3178h.f11144b.b();
    }

    private z(int i10, boolean z10) {
        this.f11208a = z10;
        this.f11209b = i10;
    }

    public z() {
        this(C3178h.f11144b.b(), false, null);
    }
}
