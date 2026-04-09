package A9;

import C0.K;
import T.InterfaceC3540l;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
public interface i {

    public static final class a {
        public static androidx.compose.ui.e a(i iVar, androidx.compose.ui.e receiver, boolean z10) {
            AbstractC6492s.i(receiver, "$receiver");
            return receiver.b0(new c(z10));
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f568a;

        public b(boolean z10) {
            this.f568a = z10;
        }

        public final boolean a() {
            return this.f568a;
        }

        public final void b(boolean z10) {
            this.f568a = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f568a == ((b) obj).f568a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f568a);
        }

        public String toString() {
            return "ParentData(visible=" + this.f568a + ")";
        }
    }

    public static final class c implements K {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f569a;

        public c(boolean z10) {
            this.f569a = z10;
        }

        @Override // C0.K
        public Object M(Y0.d dVar, Object obj) {
            AbstractC6492s.i(dVar, "<this>");
            b bVar = obj instanceof b ? (b) obj : null;
            if (bVar == null) {
                return new b(this.f569a);
            }
            bVar.b(this.f569a);
            return bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f569a == ((c) obj).f569a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f569a);
        }

        public String toString() {
            return "ParentDataModifier(visible=" + this.f569a + ")";
        }
    }

    void a(androidx.compose.ui.e eVar, boolean z10, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10);
}
