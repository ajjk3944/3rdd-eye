package Df;

import Af.C2428c;
import Ee.C2706g;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface a extends C2706g.b {

    /* renamed from: Df.a$a, reason: collision with other inner class name */
    public static final class C0159a implements a {

        /* renamed from: a, reason: collision with root package name */
        private final C2428c f3297a;

        /* renamed from: b, reason: collision with root package name */
        private final String f3298b;

        /* renamed from: c, reason: collision with root package name */
        private final String f3299c;

        public C0159a(C2428c ap) {
            AbstractC6492s.i(ap, "ap");
            this.f3297a = ap;
            this.f3298b = "ap_" + ap.a();
            this.f3299c = "result";
        }

        public final C2428c a() {
            return this.f3297a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0159a) && AbstractC6492s.d(this.f3297a, ((C0159a) obj).f3297a);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f3298b;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f3299c;
        }

        public int hashCode() {
            return this.f3297a.hashCode();
        }

        public String toString() {
            return "AccessPoint(ap=" + this.f3297a + ")";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final s9.d f3300a;

        /* renamed from: b, reason: collision with root package name */
        private final String f3301b;

        /* renamed from: c, reason: collision with root package name */
        private final String f3302c;

        public b(s9.d text) {
            AbstractC6492s.i(text, "text");
            this.f3300a = text;
            this.f3301b = "emptyDescription";
            this.f3302c = getType();
        }

        public final s9.d a() {
            return this.f3300a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(this.f3300a, ((b) obj).f3300a);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f3302c;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f3301b;
        }

        public int hashCode() {
            return this.f3300a.hashCode();
        }

        public String toString() {
            return "EmptyDescription(text=" + this.f3300a + ")";
        }
    }
}
