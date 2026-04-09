package wc;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: wc.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC8324d {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: wc.d$a */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a STATE_ON = new a("STATE_ON", 0);
        public static final a STATE_TURNING_OFF = new a("STATE_TURNING_OFF", 1);
        public static final a STATE_OFF = new a("STATE_OFF", 2);
        public static final a STATE_TURNING_ON = new a("STATE_TURNING_ON", 3);
        public static final a ERROR = new a("ERROR", 4);

        private static final /* synthetic */ a[] $values() {
            return new a[]{STATE_ON, STATE_TURNING_OFF, STATE_OFF, STATE_TURNING_ON, ERROR};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* renamed from: wc.d$b */
    public static abstract class b {

        /* renamed from: wc.d$b$a */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final a f64822a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a state) {
                super(null);
                AbstractC6492s.i(state, "state");
                this.f64822a = state;
            }

            public final a a() {
                return this.f64822a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f64822a == ((a) obj).f64822a;
            }

            public int hashCode() {
                return this.f64822a.hashCode();
            }

            public String toString() {
                return "Available(state=" + this.f64822a + ")";
            }
        }

        /* renamed from: wc.d$b$b, reason: collision with other inner class name */
        public static final class C2294b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C2294b f64823a = new C2294b();

            private C2294b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2294b);
            }

            public int hashCode() {
                return 589553856;
            }

            public String toString() {
                return "Unavailable";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    gg.i a();
}
