package v8;

import gg.AbstractC5912b;
import gg.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: v8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC8196a {

    /* renamed from: v8.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC2249a {

        /* renamed from: v8.a$a$a, reason: collision with other inner class name */
        public static final class C2250a extends AbstractC2249a {

            /* renamed from: a, reason: collision with root package name */
            private final boolean f63498a;

            public C2250a(boolean z10) {
                super(null);
                this.f63498a = z10;
            }

            public final boolean a() {
                return this.f63498a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2250a) && this.f63498a == ((C2250a) obj).f63498a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f63498a);
            }

            public String toString() {
                return "Available(recommended=" + this.f63498a + ")";
            }
        }

        /* renamed from: v8.a$a$b */
        public static final class b extends AbstractC2249a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f63499a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1617719485;
            }

            public String toString() {
                return "Unavailable";
            }
        }

        public /* synthetic */ AbstractC2249a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC2249a() {
        }
    }

    i a();

    AbstractC5912b b();

    AbstractC5912b dismiss();
}
