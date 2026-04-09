package Fh;

import Bh.h0;
import Gh.u;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class l implements Ph.b {

    /* renamed from: a, reason: collision with root package name */
    public static final l f6682a = new l();

    public static final class a implements Ph.a {

        /* renamed from: b, reason: collision with root package name */
        private final u f6683b;

        public a(u javaElement) {
            AbstractC6492s.i(javaElement, "javaElement");
            this.f6683b = javaElement;
        }

        @Override // Bh.g0
        public h0 a() {
            h0 NO_SOURCE_FILE = h0.f1785a;
            AbstractC6492s.h(NO_SOURCE_FILE, "NO_SOURCE_FILE");
            return NO_SOURCE_FILE;
        }

        @Override // Ph.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public u b() {
            return this.f6683b;
        }

        public String toString() {
            return a.class.getName() + ": " + b();
        }
    }

    private l() {
    }

    @Override // Ph.b
    public Ph.a a(Qh.l javaElement) {
        AbstractC6492s.i(javaElement, "javaElement");
        return new a((u) javaElement);
    }
}
