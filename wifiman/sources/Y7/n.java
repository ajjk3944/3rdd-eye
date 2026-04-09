package y7;

import com.ui.common.semver.SemVer;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.InterfaceC6518l;
import kotlin.text.t;
import mh.InterfaceC6824a;
import s7.InterfaceC7921h;

/* loaded from: classes3.dex */
public final class n implements InterfaceC7921h {

    /* renamed from: g, reason: collision with root package name */
    public static final d f66399g = new d(null);

    /* renamed from: h, reason: collision with root package name */
    private static final Yg.m f66400h = Yg.n.b(a.f66409a);

    /* renamed from: i, reason: collision with root package name */
    private static final Yg.m f66401i = Yg.n.b(b.f66410a);

    /* renamed from: j, reason: collision with root package name */
    private static final Yg.m f66402j = Yg.n.b(c.f66411a);

    /* renamed from: a, reason: collision with root package name */
    private final String f66403a;

    /* renamed from: b, reason: collision with root package name */
    private final String f66404b;

    /* renamed from: c, reason: collision with root package name */
    private final SemVer f66405c;

    /* renamed from: d, reason: collision with root package name */
    private final String f66406d;

    /* renamed from: e, reason: collision with root package name */
    private final String f66407e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f66408f;

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f66409a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.text.p invoke() {
            return new kotlin.text.p("^([a-zA-Z\\d\\-_]+)\\.([a-zA-Z\\d\\-_]+)\\.[v]?(\\d+)\\.(\\d+).(\\d+([-][a-zA-Z\\d\\-_]+)?)\\.([a-zA-Z\\d\\-_]+)\\.(\\d{6})\\.(\\d{4})");
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f66410a = new b();

        b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.text.p invoke() {
            return new kotlin.text.p("^([a-zA-Z\\d\\-_]+)\\.([a-zA-Z\\d\\-_]+)_[v]?(\\d+)\\.(\\d+).(\\d+([-][a-zA-Z\\d\\-_]+)?)\\+([a-zA-Z\\d\\-_]+).(\\d{6})\\.(\\d{4})");
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f66411a = new c();

        c() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.text.p invoke() {
            return new kotlin.text.p("^([a-zA-Z\\d\\-_]+)\\.[v]?(\\d+)\\.(\\d+).(\\d+([-][a-zA-Z\\d\\-_]+)?)\\.([a-zA-Z\\d\\-_]+)");
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final kotlin.text.p a() {
            return (kotlin.text.p) n.f66400h.getValue();
        }

        private final kotlin.text.p b() {
            return (kotlin.text.p) n.f66401i.getValue();
        }

        private final kotlin.text.p c() {
            return (kotlin.text.p) n.f66402j.getValue();
        }

        public final n d(String firmwareString) {
            AbstractC6492s.i(firmwareString, "firmwareString");
            InterfaceC6518l interfaceC6518lL = a().l(firmwareString);
            if (interfaceC6518lL == null) {
                InterfaceC6518l interfaceC6518lL2 = b().l(firmwareString);
                if (interfaceC6518lL2 != null) {
                    return new n((String) interfaceC6518lL2.b().get(1), (String) interfaceC6518lL2.b().get(2), new SemVer(Integer.parseInt((String) interfaceC6518lL2.b().get(3)), Integer.parseInt((String) interfaceC6518lL2.b().get(4)), Integer.parseInt((String) interfaceC6518lL2.b().get(5)), null, (String) interfaceC6518lL2.b().get(7), 8, null), (String) interfaceC6518lL2.b().get(8), (String) interfaceC6518lL2.b().get(9));
                }
                InterfaceC6518l interfaceC6518lL3 = c().l(firmwareString);
                if (interfaceC6518lL3 != null) {
                    return new n((String) interfaceC6518lL3.b().get(1), null, new SemVer(Integer.parseInt((String) interfaceC6518lL3.b().get(2)), Integer.parseInt((String) interfaceC6518lL3.b().get(3)), Integer.parseInt((String) interfaceC6518lL3.b().get(4)), (String) interfaceC6518lL3.b().get(6), null, 16, null), null, null);
                }
                return null;
            }
            String str = (String) interfaceC6518lL.b().get(5);
            String str2 = (String) interfaceC6518lL.b().get(1);
            String str3 = (String) interfaceC6518lL.b().get(2);
            int i10 = Integer.parseInt((String) interfaceC6518lL.b().get(3));
            int i11 = Integer.parseInt((String) interfaceC6518lL.b().get(4));
            int i12 = Integer.parseInt(t.l1(str, "-", null, 2, null));
            String strB1 = t.b1(str, "-", "");
            return new n(str2, str3, new SemVer(i10, i11, i12, strB1.length() == 0 ? null : strB1, (String) interfaceC6518lL.b().get(7)), (String) interfaceC6518lL.b().get(8), (String) interfaceC6518lL.b().get(9));
        }

        private d() {
        }
    }

    public n(String product, String str, SemVer version, String str2, String str3) {
        AbstractC6492s.i(product, "product");
        AbstractC6492s.i(version, "version");
        this.f66403a = product;
        this.f66404b = str;
        this.f66405c = version;
        this.f66406d = str2;
        this.f66407e = str3;
    }

    public final String d() {
        return this.f66403a;
    }

    public final SemVer e() {
        return this.f66405c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return AbstractC6492s.d(this.f66403a, nVar.f66403a) && AbstractC6492s.d(this.f66404b, nVar.f66404b) && AbstractC6492s.d(this.f66405c, nVar.f66405c) && AbstractC6492s.d(this.f66406d, nVar.f66406d) && AbstractC6492s.d(this.f66407e, nVar.f66407e);
    }

    public int hashCode() {
        int iHashCode = this.f66403a.hashCode() * 31;
        String str = this.f66404b;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f66405c.hashCode()) * 31;
        String str2 = this.f66406d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f66407e;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // s7.InterfaceC7921h
    public boolean isSingle() {
        return this.f66408f;
    }

    public String toString() {
        return "UbiquitiFirmwareInfo(product='" + this.f66403a + "', arch='" + this.f66404b + "', version='" + this.f66405c + "', date='" + this.f66406d + "', time='" + this.f66407e + "')";
    }
}
