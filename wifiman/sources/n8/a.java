package N8;

import gg.AbstractC5912b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: N8.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0585a {

        /* renamed from: N8.a$a$a, reason: collision with other inner class name */
        public static final class C0586a extends AbstractC0585a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0586a f15416a = new C0586a();

            private C0586a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0586a);
            }

            public int hashCode() {
                return 844368054;
            }

            public String toString() {
                return "Done";
            }
        }

        /* renamed from: N8.a$a$b */
        public static final class b extends AbstractC0585a {

            /* renamed from: a, reason: collision with root package name */
            private final Hf.a f15417a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Hf.a screen) {
                super(null);
                AbstractC6492s.i(screen, "screen");
                this.f15417a = screen;
            }

            public final Hf.a a() {
                return this.f15417a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f15417a == ((b) obj).f15417a;
            }

            public int hashCode() {
                return this.f15417a.hashCode();
            }

            public String toString() {
                return "Required(screen=" + this.f15417a + ")";
            }
        }

        public /* synthetic */ AbstractC0585a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0585a() {
        }
    }

    AbstractC5912b a();

    AbstractC5912b b();

    AbstractC5912b c();

    AbstractC5912b d();

    gg.i getState();
}
