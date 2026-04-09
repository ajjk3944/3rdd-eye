package b8;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class d implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public static final b f33007a = new b(null);

    public static final class a extends d {

        /* renamed from: b, reason: collision with root package name */
        private final int f33008b;

        public a(int i10) {
            super(null);
            this.f33008b = i10;
        }

        @Override // b8.d
        public int b() {
            return this.f33008b;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(int i10) {
            return i10 <= 1 ? new c(i10) : i10 <= 10 ? new C1145d(i10) : new a(i10);
        }

        public final d b(float f10) {
            return a((int) Math.ceil(f10 * 100));
        }

        public final d c() {
            return a(100);
        }

        private b() {
        }
    }

    public static final class c extends d {

        /* renamed from: b, reason: collision with root package name */
        private final int f33009b;

        public c(int i10) {
            super(null);
            this.f33009b = i10;
        }

        @Override // b8.d
        public int b() {
            return this.f33009b;
        }
    }

    /* renamed from: b8.d$d, reason: collision with other inner class name */
    public static final class C1145d extends d {

        /* renamed from: b, reason: collision with root package name */
        private final int f33010b;

        public C1145d(int i10) {
            super(null);
            this.f33010b = i10;
        }

        @Override // b8.d
        public int b() {
            return this.f33010b;
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(d other) {
        AbstractC6492s.i(other, "other");
        return AbstractC6492s.k(b(), other.b());
    }

    public abstract int b();

    public boolean equals(Object obj) {
        return (obj instanceof d) && AbstractC6492s.d(obj.getClass(), getClass()) && ((d) obj).b() == b();
    }

    public int hashCode() {
        return getClass().getName().hashCode() * b();
    }

    public String toString() {
        return "PacketLoss[" + getClass().getSimpleName() + "](" + b() + "%)";
    }

    private d() {
    }
}
