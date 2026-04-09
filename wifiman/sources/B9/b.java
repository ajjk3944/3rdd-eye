package B9;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final String f1242a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String text) {
            super(null);
            AbstractC6492s.i(text, "text");
            this.f1242a = text;
        }

        public final String a() {
            return this.f1242a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC6492s.d(this.f1242a, ((a) obj).f1242a);
        }

        public int hashCode() {
            return this.f1242a.hashCode();
        }

        public String toString() {
            return "Text(text=" + this.f1242a + ")";
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
