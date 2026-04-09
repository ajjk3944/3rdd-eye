package s9;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;
import s9.InterfaceC7929a;

/* loaded from: classes3.dex */
public abstract class b implements InterfaceC7929a.b {

    public static final class a extends b implements InterfaceC7929a.b.InterfaceC2144a {

        /* renamed from: a, reason: collision with root package name */
        private final int f61418a;

        /* renamed from: b, reason: collision with root package name */
        private final C2145b f61419b;

        /* renamed from: c, reason: collision with root package name */
        private final d f61420c;

        public /* synthetic */ a(int i10, C2145b c2145b, d dVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? null : c2145b, (i11 & 4) != 0 ? null : dVar);
        }

        public static /* synthetic */ a i(a aVar, int i10, C2145b c2145b, d dVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = aVar.f61418a;
            }
            if ((i11 & 2) != 0) {
                c2145b = aVar.f61419b;
            }
            if ((i11 & 4) != 0) {
                dVar = aVar.f61420c;
            }
            return aVar.h(i10, c2145b, dVar);
        }

        @Override // s9.InterfaceC7929a.b.InterfaceC2144a
        public int d() {
            return this.f61418a;
        }

        @Override // s9.b
        public C2145b e() {
            return this.f61419b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f61418a == aVar.f61418a && AbstractC6492s.d(this.f61419b, aVar.f61419b) && AbstractC6492s.d(this.f61420c, aVar.f61420c);
        }

        @Override // s9.InterfaceC7929a
        public d getContentDescription() {
            return this.f61420c;
        }

        public final a h(int i10, C2145b c2145b, d dVar) {
            return new a(i10, c2145b, dVar);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f61418a) * 31;
            C2145b c2145b = this.f61419b;
            int iHashCode2 = (iHashCode + (c2145b == null ? 0 : c2145b.hashCode())) * 31;
            d dVar = this.f61420c;
            return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
        }

        public String toString() {
            return "Res(resource=" + this.f61418a + ", tint=" + this.f61419b + ", contentDescription=" + this.f61420c + ")";
        }

        public a(int i10, C2145b c2145b, d dVar) {
            super(null);
            this.f61418a = i10;
            this.f61419b = c2145b;
            this.f61420c = dVar;
        }
    }

    /* renamed from: s9.b$b, reason: collision with other inner class name */
    public static final class C2145b {

        /* renamed from: a, reason: collision with root package name */
        private final String f61421a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC6839p f61422b;

        public C2145b(String id2, InterfaceC6839p tintColor) {
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(tintColor, "tintColor");
            this.f61421a = id2;
            this.f61422b = tintColor;
        }

        public final InterfaceC6839p a() {
            return this.f61422b;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C2145b) && AbstractC6492s.d(((C2145b) obj).f61421a, this.f61421a);
        }

        public int hashCode() {
            return this.f61421a.hashCode();
        }

        public String toString() {
            return "CommonIcon.Tint[" + this.f61421a + "]";
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract C2145b e();

    public final b f(C2145b c2145b) {
        if (this instanceof a) {
            return a.i((a) this, 0, c2145b, null, 5, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final b g(d dVar) {
        if (this instanceof a) {
            return a.i((a) this, 0, null, dVar, 3, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private b() {
    }
}
