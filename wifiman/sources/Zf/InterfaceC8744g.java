package zf;

import Af.C2428c;
import Ee.C2706g;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: zf.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC8744g extends C2706g.b {

    /* renamed from: zf.g$a */
    public static final class a implements InterfaceC8744g {

        /* renamed from: a, reason: collision with root package name */
        private final C2428c f67266a;

        /* renamed from: b, reason: collision with root package name */
        private final String f67267b;

        /* renamed from: c, reason: collision with root package name */
        private final String f67268c;

        public a(C2428c ap) {
            AbstractC6492s.i(ap, "ap");
            this.f67266a = ap;
            this.f67267b = ap.a();
            this.f67268c = "ap";
        }

        public final C2428c a() {
            return this.f67266a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC6492s.d(this.f67266a, ((a) obj).f67266a);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f67267b;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f67268c;
        }

        public int hashCode() {
            return this.f67266a.hashCode();
        }

        public String toString() {
            return "AccessPoint(ap=" + this.f67266a + ")";
        }
    }

    /* renamed from: zf.g$b */
    public static final class b implements InterfaceC8744g {

        /* renamed from: a, reason: collision with root package name */
        private final s9.d f67269a;

        /* renamed from: b, reason: collision with root package name */
        private final String f67270b;

        /* renamed from: c, reason: collision with root package name */
        private final String f67271c;

        public b(s9.d text) {
            AbstractC6492s.i(text, "text");
            this.f67269a = text;
            this.f67270b = "emptyDescription";
            this.f67271c = getType();
        }

        public final s9.d a() {
            return this.f67269a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(this.f67269a, ((b) obj).f67269a);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f67271c;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f67270b;
        }

        public int hashCode() {
            return this.f67269a.hashCode();
        }

        public String toString() {
            return "EmptyDescription(text=" + this.f67269a + ")";
        }
    }
}
