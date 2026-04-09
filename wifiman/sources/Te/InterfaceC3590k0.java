package Te;

import Ee.C2706g;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Te.k0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3590k0 extends C2706g.b {

    /* renamed from: Te.k0$a */
    public static final class a implements InterfaceC3590k0 {

        /* renamed from: a, reason: collision with root package name */
        private final C3578e0 f21868a;

        /* renamed from: b, reason: collision with root package name */
        private final String f21869b;

        /* renamed from: c, reason: collision with root package name */
        private final String f21870c;

        public a(C3578e0 model) {
            AbstractC6492s.i(model, "model");
            this.f21868a = model;
            this.f21869b = "ap";
            this.f21870c = model.d();
        }

        public final C3578e0 a() {
            return this.f21868a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC6492s.d(this.f21868a, ((a) obj).f21868a);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f21870c;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f21869b;
        }

        public int hashCode() {
            return this.f21868a.hashCode();
        }

        public String toString() {
            return "Ap(model=" + this.f21868a + ")";
        }
    }

    /* renamed from: Te.k0$b */
    public static final class b implements InterfaceC3590k0 {

        /* renamed from: a, reason: collision with root package name */
        private final s9.d f21871a;

        /* renamed from: b, reason: collision with root package name */
        private final String f21872b;

        /* renamed from: c, reason: collision with root package name */
        private final String f21873c;

        public b(s9.d text) {
            AbstractC6492s.i(text, "text");
            this.f21871a = text;
            this.f21872b = "empty";
            this.f21873c = getType();
        }

        public final s9.d a() {
            return this.f21871a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(this.f21871a, ((b) obj).f21871a);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f21873c;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f21872b;
        }

        public int hashCode() {
            return this.f21871a.hashCode();
        }

        public String toString() {
            return "EmptyItem(text=" + this.f21871a + ")";
        }
    }
}
