package af;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: af.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3793B {

    /* renamed from: af.B$a */
    public static final class a extends AbstractC3793B {

        /* renamed from: a, reason: collision with root package name */
        private final List f25983a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List items) {
            super(null);
            AbstractC6492s.i(items, "items");
            this.f25983a = items;
        }

        public final List a() {
            return this.f25983a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC6492s.d(this.f25983a, ((a) obj).f25983a);
        }

        public int hashCode() {
            return this.f25983a.hashCode();
        }

        public String toString() {
            return "Loaded(items=" + this.f25983a + ")";
        }
    }

    /* renamed from: af.B$b */
    public static final class b extends AbstractC3793B {

        /* renamed from: a, reason: collision with root package name */
        public static final b f25984a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 892195917;
        }

        public String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ AbstractC3793B(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC3793B() {
    }
}
