package Z8;

import gg.z;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: Z8.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0966a {

        /* renamed from: Z8.a$a$a, reason: collision with other inner class name */
        public static final class C0967a extends AbstractC0966a {

            /* renamed from: a, reason: collision with root package name */
            private final String f25189a;

            /* renamed from: b, reason: collision with root package name */
            private final String f25190b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0967a(String publicKey, String str) {
                super(null);
                AbstractC6492s.i(publicKey, "publicKey");
                this.f25189a = publicKey;
                this.f25190b = str;
            }

            public final String a() {
                return this.f25190b;
            }

            public final String b() {
                return this.f25189a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0967a)) {
                    return false;
                }
                C0967a c0967a = (C0967a) obj;
                return AbstractC6492s.d(this.f25189a, c0967a.f25189a) && AbstractC6492s.d(this.f25190b, c0967a.f25190b);
            }

            public int hashCode() {
                int iHashCode = this.f25189a.hashCode() * 31;
                String str = this.f25190b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "DhSharedKey(publicKey=" + this.f25189a + ", authKey=" + this.f25190b + ")";
            }

            public /* synthetic */ C0967a(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? "a781f8a4a627373b70745738cdffdd1de9ae352517c374ca9afc215c39c62637" : str, (i10 & 2) != 0 ? null : str2);
            }
        }

        /* renamed from: Z8.a$a$b */
        public static final class b extends AbstractC0966a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f25191a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC0966a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0966a() {
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract z a(byte[] bArr);

    public abstract z b(byte[] bArr);

    private a() {
    }
}
