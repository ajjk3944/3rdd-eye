package L0;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: L0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3179i {

    /* renamed from: L0.i$a */
    public static final class a extends AbstractC3179i {

        /* renamed from: a, reason: collision with root package name */
        private final String f11149a;

        /* renamed from: b, reason: collision with root package name */
        private final N f11150b;

        public a(String str, N n10, InterfaceC3180j interfaceC3180j) {
            super(null);
            this.f11149a = str;
            this.f11150b = n10;
        }

        @Override // L0.AbstractC3179i
        public InterfaceC3180j a() {
            return null;
        }

        @Override // L0.AbstractC3179i
        public N b() {
            return this.f11150b;
        }

        public final String c() {
            return this.f11149a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!AbstractC6492s.d(this.f11149a, aVar.f11149a) || !AbstractC6492s.d(b(), aVar.b())) {
                return false;
            }
            a();
            aVar.a();
            return AbstractC6492s.d(null, null);
        }

        public int hashCode() {
            int iHashCode = this.f11149a.hashCode() * 31;
            N nB = b();
            int iHashCode2 = (iHashCode + (nB != null ? nB.hashCode() : 0)) * 31;
            a();
            return iHashCode2;
        }

        public String toString() {
            return "LinkAnnotation.Clickable(tag=" + this.f11149a + ')';
        }
    }

    /* renamed from: L0.i$b */
    public static final class b extends AbstractC3179i {

        /* renamed from: a, reason: collision with root package name */
        private final String f11151a;

        /* renamed from: b, reason: collision with root package name */
        private final N f11152b;

        public /* synthetic */ b(String str, N n10, InterfaceC3180j interfaceC3180j, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : n10, (i10 & 4) != 0 ? null : interfaceC3180j);
        }

        @Override // L0.AbstractC3179i
        public InterfaceC3180j a() {
            return null;
        }

        @Override // L0.AbstractC3179i
        public N b() {
            return this.f11152b;
        }

        public final String c() {
            return this.f11151a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!AbstractC6492s.d(this.f11151a, bVar.f11151a) || !AbstractC6492s.d(b(), bVar.b())) {
                return false;
            }
            a();
            bVar.a();
            return AbstractC6492s.d(null, null);
        }

        public int hashCode() {
            int iHashCode = this.f11151a.hashCode() * 31;
            N nB = b();
            int iHashCode2 = (iHashCode + (nB != null ? nB.hashCode() : 0)) * 31;
            a();
            return iHashCode2;
        }

        public String toString() {
            return "LinkAnnotation.Url(url=" + this.f11151a + ')';
        }

        public b(String str, N n10, InterfaceC3180j interfaceC3180j) {
            super(null);
            this.f11151a = str;
            this.f11152b = n10;
        }
    }

    public /* synthetic */ AbstractC3179i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract InterfaceC3180j a();

    public abstract N b();

    private AbstractC3179i() {
    }
}
