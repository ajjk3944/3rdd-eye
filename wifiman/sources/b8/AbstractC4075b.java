package b8;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: b8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4075b implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public static final C1144b f33002a = new C1144b(null);

    /* renamed from: b8.b$a */
    public static final class a extends AbstractC4075b {

        /* renamed from: b, reason: collision with root package name */
        private final int f33003b;

        public a(int i10) {
            super(null);
            this.f33003b = i10;
        }

        @Override // b8.AbstractC4075b
        public int b() {
            return this.f33003b;
        }
    }

    /* renamed from: b8.b$b, reason: collision with other inner class name */
    public static final class C1144b {
        public /* synthetic */ C1144b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC4075b a(int i10) {
            return i10 < 50 ? new c(i10) : i10 <= 100 ? new e(i10) : i10 <= 200 ? new d(i10) : new a(i10);
        }

        private C1144b() {
        }
    }

    /* renamed from: b8.b$c */
    public static final class c extends AbstractC4075b {

        /* renamed from: b, reason: collision with root package name */
        private final int f33004b;

        public c(int i10) {
            super(null);
            this.f33004b = i10;
        }

        @Override // b8.AbstractC4075b
        public int b() {
            return this.f33004b;
        }
    }

    /* renamed from: b8.b$d */
    public static final class d extends AbstractC4075b {

        /* renamed from: b, reason: collision with root package name */
        private final int f33005b;

        public d(int i10) {
            super(null);
            this.f33005b = i10;
        }

        @Override // b8.AbstractC4075b
        public int b() {
            return this.f33005b;
        }
    }

    /* renamed from: b8.b$e */
    public static final class e extends AbstractC4075b {

        /* renamed from: b, reason: collision with root package name */
        private final int f33006b;

        public e(int i10) {
            super(null);
            this.f33006b = i10;
        }

        @Override // b8.AbstractC4075b
        public int b() {
            return this.f33006b;
        }
    }

    public /* synthetic */ AbstractC4075b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC4075b other) {
        AbstractC6492s.i(other, "other");
        return AbstractC6492s.k(b(), other.b());
    }

    public abstract int b();

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC4075b) && AbstractC6492s.d(obj.getClass(), getClass()) && ((AbstractC4075b) obj).b() == b();
    }

    public int hashCode() {
        return getClass().getName().hashCode() * Integer.hashCode(b());
    }

    public String toString() {
        return "Latency[" + getClass().getSimpleName() + "](" + b() + " ms)";
    }

    private AbstractC4075b() {
    }
}
