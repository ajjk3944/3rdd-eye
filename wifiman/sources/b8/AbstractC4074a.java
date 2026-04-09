package b8;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: b8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4074a {

    /* renamed from: b8.a$a, reason: collision with other inner class name */
    public static final class C1143a extends AbstractC4074a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1143a f32999a = new C1143a();

        private C1143a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1143a);
        }

        public int hashCode() {
            return 1327232868;
        }

        public String toString() {
            return "Available";
        }
    }

    /* renamed from: b8.a$b */
    public static final class b extends AbstractC4074a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f33000a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1876335305;
        }

        public String toString() {
            return "InProgress";
        }
    }

    /* renamed from: b8.a$c */
    public static final class c extends AbstractC4074a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f33001a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 105351723;
        }

        public String toString() {
            return "Unavailable";
        }
    }

    public /* synthetic */ AbstractC4074a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC4074a() {
    }
}
