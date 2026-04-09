package Z2;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final a f25090a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        private final String f25091a;

        /* renamed from: b, reason: collision with root package name */
        private final Map f25092b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String url, Map additionalHttpHeaders) {
            super(null);
            AbstractC6492s.i(url, "url");
            AbstractC6492s.i(additionalHttpHeaders, "additionalHttpHeaders");
            this.f25091a = url;
            this.f25092b = additionalHttpHeaders;
        }

        public final Map a() {
            return this.f25092b;
        }

        public final String b() {
            return this.f25091a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f25091a, bVar.f25091a) && AbstractC6492s.d(this.f25092b, bVar.f25092b);
        }

        public int hashCode() {
            return (this.f25091a.hashCode() * 31) + this.f25092b.hashCode();
        }

        public String toString() {
            return "Url(url=" + this.f25091a + ", additionalHttpHeaders=" + this.f25092b + ')';
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private d() {
    }
}
