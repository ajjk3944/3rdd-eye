package X9;

import Li.InterfaceC3220g;
import Li.N;
import dh.InterfaceC5380e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public interface p extends W9.f {

    public static abstract class a {

        /* renamed from: X9.p$a$a, reason: collision with other inner class name */
        public static final class C0916a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0916a f24216a = new C0916a();

            private C0916a() {
                super(null);
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f24217a = new b();

            private b() {
                super(null);
            }
        }

        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            private final String f24218a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String code) {
                super(null);
                AbstractC6492s.i(code, "code");
                this.f24218a = code;
            }

            public final String a() {
                return this.f24218a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && AbstractC6492s.d(this.f24218a, ((c) obj).f24218a);
            }

            public int hashCode() {
                return this.f24218a.hashCode();
            }

            public String toString() {
                return "PasteCode(code=" + this.f24218a + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    N L();

    N N();

    void O(String str);

    N P();

    Object Q(InterfaceC5380e interfaceC5380e);

    InterfaceC3220g b();

    N c();

    Object e(InterfaceC5380e interfaceC5380e);

    N m();

    N n();

    N r();
}
