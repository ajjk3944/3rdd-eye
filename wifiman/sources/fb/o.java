package fb;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class o {

    public static final class a extends o {

        /* renamed from: a, reason: collision with root package name */
        private final String f47281a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String ncaToken) {
            super(null);
            AbstractC6492s.i(ncaToken, "ncaToken");
            this.f47281a = ncaToken;
        }

        public final String a() {
            return this.f47281a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC6492s.d(this.f47281a, ((a) obj).f47281a);
        }

        public int hashCode() {
            return this.f47281a.hashCode();
        }

        public String toString() {
            return "NcaAuth(ncaToken=" + this.f47281a + ")";
        }
    }

    public /* synthetic */ o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private o() {
    }
}
