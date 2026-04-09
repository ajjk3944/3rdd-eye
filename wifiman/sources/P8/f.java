package P8;

import If.EnumC3021a;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.AbstractC5912b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public interface f {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a STATUS = new a("STATUS", 0);
        public static final a FW_UPDATE = new a("FW_UPDATE", 1);
        public static final a COMPLIANCE = new a("COMPLIANCE", 2);

        private static final /* synthetic */ a[] $values() {
            return new a[]{STATUS, FW_UPDATE, COMPLIANCE};
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

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f18267a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -503801676;
            }

            public String toString() {
                return "Closed";
            }
        }

        /* renamed from: P8.f$b$b, reason: collision with other inner class name */
        public static final class C0647b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final EnumC3021a f18268a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0647b(EnumC3021a content) {
                super(null);
                AbstractC6492s.i(content, "content");
                this.f18268a = content;
            }

            public final EnumC3021a a() {
                return this.f18268a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0647b) && this.f18268a == ((C0647b) obj).f18268a;
            }

            public int hashCode() {
                return this.f18268a.hashCode();
            }

            public String toString() {
                return "Opened(content=" + this.f18268a + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    AbstractC5912b a();

    AbstractC5912b b(a aVar);

    AbstractC5912b c();

    AbstractC5912b close();

    AbstractC5912b d();

    gg.i e();

    AbstractC5912b f();

    gg.i getState();
}
