package ae;

import gg.z;
import h9.C5969a;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ae.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3790b {

    /* renamed from: ae.b$a */
    public static abstract class a {

        /* renamed from: ae.b$a$a, reason: collision with other inner class name */
        public static final class C1002a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1002a f25966a = new C1002a();

            private C1002a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1002a);
            }

            public int hashCode() {
                return 953635242;
            }

            public String toString() {
                return "AppNotInstalled";
            }
        }

        /* renamed from: ae.b$a$b, reason: collision with other inner class name */
        public static final class C1003b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final AbstractC3789a f25967a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1003b(AbstractC3789a deeplink) {
                super(null);
                AbstractC6492s.i(deeplink, "deeplink");
                this.f25967a = deeplink;
            }

            public final AbstractC3789a a() {
                return this.f25967a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1003b) && AbstractC6492s.d(this.f25967a, ((C1003b) obj).f25967a);
            }

            public int hashCode() {
                return this.f25967a.hashCode();
            }

            public String toString() {
                return "Available(deeplink=" + this.f25967a + ")";
            }
        }

        /* renamed from: ae.b$a$c */
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f25968a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1165003048;
            }

            public String toString() {
                return "NotResolvable";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    z a(UUID uuid, String str, C5969a c5969a);
}
