package od;

import k7.InterfaceC6398a;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class f implements InterfaceC6398a {

    /* renamed from: a, reason: collision with root package name */
    private final W7.d f55630a;

    /* renamed from: b, reason: collision with root package name */
    private String f55631b;

    /* renamed from: c, reason: collision with root package name */
    private a f55632c;

    /* renamed from: d, reason: collision with root package name */
    private b f55633d;

    public static final class a implements InterfaceC6398a.InterfaceC1895a {

        /* renamed from: a, reason: collision with root package name */
        private final int f55634a;

        /* renamed from: b, reason: collision with root package name */
        private final int f55635b;

        public a(int i10, int i11) {
            this.f55634a = i10;
            this.f55635b = i11;
        }

        @Override // k7.InterfaceC6398a.InterfaceC1895a
        public int a() {
            return this.f55635b;
        }

        @Override // k7.InterfaceC6398a.InterfaceC1895a
        public int b() {
            return this.f55634a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f55634a == aVar.f55634a && this.f55635b == aVar.f55635b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f55634a) * 31) + Integer.hashCode(this.f55635b);
        }

        public String toString() {
            return "Image(resID=" + this.f55634a + ", sizePx=" + this.f55635b + ")";
        }
    }

    public static final class b {
    }

    public f(W7.d coordinates, String type, a aVar) {
        AbstractC6492s.i(coordinates, "coordinates");
        AbstractC6492s.i(type, "type");
        this.f55630a = coordinates;
        this.f55631b = type;
        this.f55632c = aVar;
        this.f55633d = new b();
    }

    @Override // l7.InterfaceC6554i
    public W7.d c() {
        return this.f55630a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC6492s.d(this.f55630a, fVar.f55630a) && AbstractC6492s.d(this.f55631b, fVar.f55631b) && AbstractC6492s.d(this.f55632c, fVar.f55632c);
    }

    @Override // k7.InterfaceC6398a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public a e() {
        return this.f55632c;
    }

    @Override // k7.InterfaceC6398a
    public String getId() {
        return h() + ":" + c().a() + "," + c().b();
    }

    public String h() {
        return this.f55631b;
    }

    public int hashCode() {
        int iHashCode = ((this.f55630a.hashCode() * 31) + this.f55631b.hashCode()) * 31;
        a aVar = this.f55632c;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public void i(a aVar) {
        this.f55632c = aVar;
    }

    public void j(String str) {
        AbstractC6492s.i(str, "<set-?>");
        this.f55631b = str;
    }

    public String toString() {
        return "DetectedObject(coordinates=" + this.f55630a + ", type=" + this.f55631b + ", img=" + this.f55632c + ")";
    }
}
