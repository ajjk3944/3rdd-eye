package Ya;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C6516j;
import kotlin.text.InterfaceC6518l;
import kotlin.text.p;

/* loaded from: classes3.dex */
public abstract class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final C0943a f24826a = new C0943a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final String f24827b = "^(W/)?(\".+\")$";

    /* renamed from: Ya.a$a, reason: collision with other inner class name */
    public static final class C0943a {
        public /* synthetic */ C0943a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String headerValue) {
            a bVar;
            String strA;
            AbstractC6492s.i(headerValue, "headerValue");
            InterfaceC6518l interfaceC6518lL = new p(a.f24827b).l(headerValue);
            if (interfaceC6518lL == null) {
                return null;
            }
            if (interfaceC6518lL.c().size() != 3) {
                throw new IllegalStateException("There are just two values defined in etag pattern");
            }
            if (interfaceC6518lL.c().get(1) != null) {
                C6516j c6516j = interfaceC6518lL.c().get(2);
                strA = c6516j != null ? c6516j.a() : null;
                AbstractC6492s.f(strA);
                bVar = new c(strA);
            } else {
                C6516j c6516j2 = interfaceC6518lL.c().get(2);
                strA = c6516j2 != null ? c6516j2.a() : null;
                AbstractC6492s.f(strA);
                bVar = new b(strA);
            }
            return bVar;
        }

        private C0943a() {
        }
    }

    public static final class b extends a {

        /* renamed from: c, reason: collision with root package name */
        private final String f24828c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String value) {
            super(null);
            AbstractC6492s.i(value, "value");
            this.f24828c = value;
        }

        @Override // Ya.a
        public String c() {
            return this.f24828c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(this.f24828c, ((b) obj).f24828c);
        }

        public int hashCode() {
            return this.f24828c.hashCode();
        }

        public String toString() {
            return "Strong(value=" + this.f24828c + ")";
        }
    }

    public static final class c extends a {

        /* renamed from: c, reason: collision with root package name */
        private final String f24829c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String value) {
            super(null);
            AbstractC6492s.i(value, "value");
            this.f24829c = value;
        }

        @Override // Ya.a
        public String c() {
            return this.f24829c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC6492s.d(this.f24829c, ((c) obj).f24829c);
        }

        public int hashCode() {
            return this.f24829c.hashCode();
        }

        public String toString() {
            return "Weak(value=" + this.f24829c + ")";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String c();

    private a() {
    }
}
