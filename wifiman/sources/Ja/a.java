package Ja;

import Li.InterfaceC3220g;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0400a f9952a = C0400a.f9953a;

    /* renamed from: Ja.a$a, reason: collision with other inner class name */
    public static final class C0400a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0400a f9953a = new C0400a();

        private C0400a() {
        }

        public final a a(b params) {
            AbstractC6492s.i(params, "params");
            return new Ja.c(params);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f9954a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f9955b;

        public b(boolean z10, boolean z11) {
            this.f9954a = z10;
            this.f9955b = z11;
        }

        public final boolean a() {
            return this.f9954a;
        }

        public final boolean b() {
            return this.f9955b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f9954a == bVar.f9954a && this.f9955b == bVar.f9955b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z10 = this.f9954a;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            int i10 = r02 * 31;
            boolean z11 = this.f9955b;
            return i10 + (z11 ? 1 : z11 ? 1 : 0);
        }

        public String toString() {
            return "Params(http=" + this.f9954a + ", tcp=" + this.f9955b + ")";
        }
    }

    public enum c {
        OFF,
        STARTING,
        IDLE,
        ACTIVE
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final c f9956a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f9957b;

        /* renamed from: c, reason: collision with root package name */
        private final int f9958c;

        public d(c state, Integer num, int i10) {
            AbstractC6492s.i(state, "state");
            this.f9956a = state;
            this.f9957b = num;
            this.f9958c = i10;
        }

        public final int a() {
            return this.f9958c;
        }

        public final Integer b() {
            return this.f9957b;
        }

        public final c c() {
            return this.f9956a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f9956a == dVar.f9956a && AbstractC6492s.d(this.f9957b, dVar.f9957b) && this.f9958c == dVar.f9958c;
        }

        public int hashCode() {
            int iHashCode = this.f9956a.hashCode() * 31;
            Integer num = this.f9957b;
            return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.f9958c);
        }

        public String toString() {
            return "Status(state=" + this.f9956a + ", port=" + this.f9957b + ", connections=" + this.f9958c + ")";
        }
    }

    InterfaceC3220g start();
}
