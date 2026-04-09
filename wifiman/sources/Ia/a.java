package Ia;

import Li.InterfaceC3220g;
import dh.InterfaceC5380e;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0364a f8969a = C0364a.f8970a;

    /* renamed from: Ia.a$a, reason: collision with other inner class name */
    public static final class C0364a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0364a f8970a = new C0364a();

        private C0364a() {
        }

        public final a a(String str, La.c clientApp, b environment) {
            AbstractC6492s.i(clientApp, "clientApp");
            AbstractC6492s.i(environment, "environment");
            return new Ia.b(str, clientApp, environment);
        }
    }

    public enum b {
        PRODUCTION,
        STAGE,
        DEV
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f8971a;

        /* renamed from: b, reason: collision with root package name */
        private final int f8972b;

        public c(String token, int i10) {
            AbstractC6492s.i(token, "token");
            this.f8971a = token;
            this.f8972b = i10;
        }

        public final String a() {
            return this.f8971a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC6492s.d(this.f8971a, cVar.f8971a) && this.f8972b == cVar.f8972b;
        }

        public int hashCode() {
            return (this.f8971a.hashCode() * 31) + Integer.hashCode(this.f8972b);
        }

        public String toString() {
            return "Token(token=" + this.f8971a + ", ttlMs=" + this.f8972b + ")";
        }
    }

    Object a(k kVar, InterfaceC5380e interfaceC5380e);

    Object b(InterfaceC5380e interfaceC5380e);

    Object c(InterfaceC5380e interfaceC5380e);

    InterfaceC3220g d(d dVar);
}
