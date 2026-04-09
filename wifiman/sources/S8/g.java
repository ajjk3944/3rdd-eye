package S8;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20381b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f20382a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(int i10) {
            if (i10 < 1 || i10 > 100) {
                return null;
            }
            return i10 >= 90 ? new b(i10) : i10 >= 70 ? new c(i10) : new d(i10);
        }

        private a() {
        }
    }

    public static final class b extends g {
        public b(int i10) {
            super(i10, null);
        }
    }

    public static final class c extends g {
        public c(int i10) {
            super(i10, null);
        }
    }

    public static final class d extends g {
        public d(int i10) {
            super(i10, null);
        }
    }

    public /* synthetic */ g(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public final int a() {
        return this.f20382a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof g) && ((g) obj).f20382a == this.f20382a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f20382a);
    }

    private g(int i10) {
        this.f20382a = i10;
    }
}
