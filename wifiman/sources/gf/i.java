package Gf;

import Ee.C2706g;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface i extends C2706g.b {

    public static final class a implements i {

        /* renamed from: a, reason: collision with root package name */
        private final String f7382a;

        /* renamed from: b, reason: collision with root package name */
        private final Gf.b f7383b;

        /* renamed from: c, reason: collision with root package name */
        private final String f7384c;

        public a(String id2, Gf.b model) {
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(model, "model");
            this.f7382a = id2;
            this.f7383b = model;
            this.f7384c = "quality";
        }

        public final Gf.b a() {
            return this.f7383b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f7382a, aVar.f7382a) && AbstractC6492s.d(this.f7383b, aVar.f7383b);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f7382a;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f7384c;
        }

        public int hashCode() {
            return (this.f7382a.hashCode() * 31) + this.f7383b.hashCode();
        }

        public String toString() {
            return "ChannelQualityItem(id=" + this.f7382a + ", model=" + this.f7383b + ")";
        }
    }

    public static final class b implements i {

        /* renamed from: a, reason: collision with root package name */
        private final s9.d f7385a;

        /* renamed from: b, reason: collision with root package name */
        private final String f7386b;

        public b(s9.d text) {
            AbstractC6492s.i(text, "text");
            this.f7385a = text;
            this.f7386b = "empty";
        }

        public final s9.d a() {
            return this.f7385a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(this.f7385a, ((b) obj).f7385a);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return getType();
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f7386b;
        }

        public int hashCode() {
            return this.f7385a.hashCode();
        }

        public String toString() {
            return "EmptyItem(text=" + this.f7385a + ")";
        }
    }

    public static final class c implements i {

        /* renamed from: a, reason: collision with root package name */
        private final String f7387a;

        /* renamed from: b, reason: collision with root package name */
        private final j f7388b;

        /* renamed from: c, reason: collision with root package name */
        private final String f7389c;

        public c(String id2, j model) {
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(model, "model");
            this.f7387a = id2;
            this.f7388b = model;
            this.f7389c = "result";
        }

        public final j a() {
            return this.f7388b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC6492s.d(this.f7387a, cVar.f7387a) && AbstractC6492s.d(this.f7388b, cVar.f7388b);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f7387a;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f7389c;
        }

        public int hashCode() {
            return (this.f7387a.hashCode() * 31) + this.f7388b.hashCode();
        }

        public String toString() {
            return "NetworkItem(id=" + this.f7387a + ", model=" + this.f7388b + ")";
        }
    }
}
