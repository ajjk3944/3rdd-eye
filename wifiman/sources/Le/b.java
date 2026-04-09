package Le;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11596a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1097889302;
        }

        public String toString() {
            return "Hidden";
        }
    }

    /* renamed from: Le.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0461b extends b {

        /* renamed from: Le.b$b$a */
        public static final class a extends AbstractC0461b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f11597a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -948556022;
            }

            public String toString() {
                return "Done";
            }
        }

        /* renamed from: Le.b$b$b, reason: collision with other inner class name */
        public static final class C0462b extends AbstractC0461b {

            /* renamed from: a, reason: collision with root package name */
            private final float f11598a;

            public C0462b(float f10) {
                super(null);
                this.f11598a = f10;
            }

            public final float a() {
                return this.f11598a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0462b) && Float.compare(this.f11598a, ((C0462b) obj).f11598a) == 0;
            }

            public int hashCode() {
                return Float.hashCode(this.f11598a);
            }

            public String toString() {
                return "InProgress(progress=" + this.f11598a + ")";
            }
        }

        public /* synthetic */ AbstractC0461b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0461b() {
            super(null);
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
