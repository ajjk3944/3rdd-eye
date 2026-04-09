package Te;

import Ee.C2706g;
import gc.EnumC5895b;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface K0 extends C2706g.b {

    public static final class a implements K0 {

        /* renamed from: a, reason: collision with root package name */
        private final s9.d f21673a;

        /* renamed from: b, reason: collision with root package name */
        private final String f21674b;

        /* renamed from: c, reason: collision with root package name */
        private final String f21675c;

        public a(s9.d text) {
            AbstractC6492s.i(text, "text");
            this.f21673a = text;
            this.f21674b = "apComparisonButton";
            this.f21675c = getType();
        }

        public final s9.d a() {
            return this.f21673a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC6492s.d(this.f21673a, ((a) obj).f21673a);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f21675c;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f21674b;
        }

        public int hashCode() {
            return this.f21673a.hashCode();
        }

        public String toString() {
            return "ApComparisonButton(text=" + this.f21673a + ")";
        }
    }

    public static final class b implements K0 {

        /* renamed from: a, reason: collision with root package name */
        private final S f21676a;

        /* renamed from: b, reason: collision with root package name */
        private final String f21677b = "chart";

        /* renamed from: c, reason: collision with root package name */
        private final String f21678c = getType();

        public b(S s10) {
            this.f21676a = s10;
        }

        public final S a() {
            return this.f21676a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(this.f21676a, ((b) obj).f21676a);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f21678c;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f21677b;
        }

        public int hashCode() {
            S s10 = this.f21676a;
            if (s10 == null) {
                return 0;
            }
            return s10.hashCode();
        }

        public String toString() {
            return "Chart(overlay=" + this.f21676a + ")";
        }
    }

    public static final class c implements K0 {

        /* renamed from: a, reason: collision with root package name */
        private final B0 f21679a;

        /* renamed from: b, reason: collision with root package name */
        private final int f21680b;

        /* renamed from: c, reason: collision with root package name */
        private final String f21681c;

        /* renamed from: d, reason: collision with root package name */
        private final String f21682d;

        public c(B0 model, int i10) {
            AbstractC6492s.i(model, "model");
            this.f21679a = model;
            this.f21680b = i10;
            this.f21681c = model.b();
            this.f21682d = "chartStats";
        }

        public final B0 a() {
            return this.f21679a;
        }

        public final int b() {
            return this.f21680b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC6492s.d(this.f21679a, cVar.f21679a) && this.f21680b == cVar.f21680b;
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f21681c;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f21682d;
        }

        public int hashCode() {
            return (this.f21679a.hashCode() * 31) + Integer.hashCode(this.f21680b);
        }

        public String toString() {
            return "ChartStats(model=" + this.f21679a + ", statsIndex=" + this.f21680b + ")";
        }
    }

    public static final class d implements K0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f21683a;

        /* renamed from: b, reason: collision with root package name */
        private static final String f21684b;

        /* renamed from: c, reason: collision with root package name */
        private static final String f21685c;

        static {
            d dVar = new d();
            f21683a = dVar;
            f21684b = "chartThroughputUnavailable";
            f21685c = dVar.getType();
        }

        private d() {
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return f21685c;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return f21684b;
        }
    }

    public static final class e implements K0 {

        /* renamed from: a, reason: collision with root package name */
        private final C3592l0 f21686a;

        /* renamed from: b, reason: collision with root package name */
        private final String f21687b;

        /* renamed from: c, reason: collision with root package name */
        private final String f21688c;

        public e(C3592l0 model) {
            AbstractC6492s.i(model, "model");
            this.f21686a = model;
            this.f21687b = "connectionStatsBar";
            this.f21688c = getType();
        }

        public final C3592l0 a() {
            return this.f21686a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && AbstractC6492s.d(this.f21686a, ((e) obj).f21686a);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f21688c;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f21687b;
        }

        public int hashCode() {
            return this.f21686a.hashCode();
        }

        public String toString() {
            return "ConnectionStats(model=" + this.f21686a + ")";
        }
    }

    public static final class f implements K0 {

        /* renamed from: a, reason: collision with root package name */
        private final String f21689a;

        /* renamed from: b, reason: collision with root package name */
        private final s9.d f21690b;

        /* renamed from: c, reason: collision with root package name */
        private final s9.d f21691c;

        /* renamed from: d, reason: collision with root package name */
        private final s9.d f21692d;

        /* renamed from: e, reason: collision with root package name */
        private final String f21693e;

        public f(String id2, s9.d title, s9.d text, s9.d dVar) {
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(title, "title");
            AbstractC6492s.i(text, "text");
            this.f21689a = id2;
            this.f21690b = title;
            this.f21691c = text;
            this.f21692d = dVar;
            this.f21693e = "unavailableAction";
        }

        public final s9.d a() {
            return this.f21692d;
        }

        public final s9.d b() {
            return this.f21691c;
        }

        public final s9.d c() {
            return this.f21690b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return AbstractC6492s.d(this.f21689a, fVar.f21689a) && AbstractC6492s.d(this.f21690b, fVar.f21690b) && AbstractC6492s.d(this.f21691c, fVar.f21691c) && AbstractC6492s.d(this.f21692d, fVar.f21692d);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f21689a;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f21693e;
        }

        public int hashCode() {
            int iHashCode = ((((this.f21689a.hashCode() * 31) + this.f21690b.hashCode()) * 31) + this.f21691c.hashCode()) * 31;
            s9.d dVar = this.f21692d;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        public String toString() {
            return "DataUnavailableAction(id=" + this.f21689a + ", title=" + this.f21690b + ", text=" + this.f21691c + ", button=" + this.f21692d + ")";
        }
    }

    public static final class g implements K0 {

        /* renamed from: a, reason: collision with root package name */
        private final s9.d f21694a;

        /* renamed from: b, reason: collision with root package name */
        private final String f21695b;

        /* renamed from: c, reason: collision with root package name */
        private final String f21696c;

        public g(s9.d text) {
            AbstractC6492s.i(text, "text");
            this.f21694a = text;
            this.f21695b = "empty";
            this.f21696c = getType();
        }

        public final s9.d a() {
            return this.f21694a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && AbstractC6492s.d(this.f21694a, ((g) obj).f21694a);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f21696c;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f21695b;
        }

        public int hashCode() {
            return this.f21694a.hashCode();
        }

        public String toString() {
            return "EmptyItem(text=" + this.f21694a + ")";
        }
    }

    public static final class h implements K0 {

        /* renamed from: a, reason: collision with root package name */
        private final C3572b0 f21697a;

        /* renamed from: b, reason: collision with root package name */
        private final String f21698b;

        public h(C3572b0 model) {
            AbstractC6492s.i(model, "model");
            this.f21697a = model;
            this.f21698b = "place";
        }

        public final C3572b0 a() {
            return this.f21697a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && AbstractC6492s.d(this.f21697a, ((h) obj).f21697a);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f21697a.c();
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f21698b;
        }

        public int hashCode() {
            return this.f21697a.hashCode();
        }

        public String toString() {
            return "PlaceItem(model=" + this.f21697a + ")";
        }
    }

    public static final class i implements K0 {

        /* renamed from: a, reason: collision with root package name */
        private final C3569a f21699a;

        /* renamed from: b, reason: collision with root package name */
        private final String f21700b;

        public i(C3569a model) {
            AbstractC6492s.i(model, "model");
            this.f21699a = model;
            this.f21700b = "roamingItem";
        }

        public final C3569a a() {
            return this.f21699a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && AbstractC6492s.d(this.f21699a, ((i) obj).f21699a);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f21699a.c();
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f21700b;
        }

        public int hashCode() {
            return this.f21699a.hashCode();
        }

        public String toString() {
            return "RoamingItem(model=" + this.f21699a + ")";
        }
    }

    public static final class j implements K0 {

        /* renamed from: a, reason: collision with root package name */
        private final x0 f21701a;

        /* renamed from: b, reason: collision with root package name */
        private final String f21702b;

        /* renamed from: c, reason: collision with root package name */
        private final String f21703c;

        public j(x0 model) {
            AbstractC6492s.i(model, "model");
            this.f21701a = model;
            this.f21702b = "signalTypePicker";
            this.f21703c = getType();
        }

        public final x0 a() {
            return this.f21701a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && AbstractC6492s.d(this.f21701a, ((j) obj).f21701a);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f21703c;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f21702b;
        }

        public int hashCode() {
            return this.f21701a.hashCode();
        }

        public String toString() {
            return "SignalTypePickerTabStrength(model=" + this.f21701a + ")";
        }
    }

    public static final class k implements K0 {

        /* renamed from: a, reason: collision with root package name */
        private final List f21704a;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC5895b f21705b;

        /* renamed from: c, reason: collision with root package name */
        private final String f21706c;

        /* renamed from: d, reason: collision with root package name */
        private final String f21707d;

        public k(List tabs, EnumC5895b enumC5895b) {
            AbstractC6492s.i(tabs, "tabs");
            this.f21704a = tabs;
            this.f21705b = enumC5895b;
            this.f21706c = "tabs";
            this.f21707d = getType();
        }

        public final EnumC5895b a() {
            return this.f21705b;
        }

        public final List b() {
            return this.f21704a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return AbstractC6492s.d(this.f21704a, kVar.f21704a) && this.f21705b == kVar.f21705b;
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f21707d;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f21706c;
        }

        public int hashCode() {
            int iHashCode = this.f21704a.hashCode() * 31;
            EnumC5895b enumC5895b = this.f21705b;
            return iHashCode + (enumC5895b == null ? 0 : enumC5895b.hashCode());
        }

        public String toString() {
            return "TabBarTabStrength(tabs=" + this.f21704a + ", selected=" + this.f21705b + ")";
        }
    }

    public static final class l implements K0 {

        /* renamed from: a, reason: collision with root package name */
        private final F0 f21708a;

        /* renamed from: b, reason: collision with root package name */
        private final String f21709b;

        /* renamed from: c, reason: collision with root package name */
        private final String f21710c;

        public l(F0 model) {
            AbstractC6492s.i(model, "model");
            this.f21708a = model;
            this.f21709b = "chartStatsWifi";
            this.f21710c = getType();
        }

        public final F0 a() {
            return this.f21708a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && AbstractC6492s.d(this.f21708a, ((l) obj).f21708a);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f21710c;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f21709b;
        }

        public int hashCode() {
            return this.f21708a.hashCode();
        }

        public String toString() {
            return "WifiChartStats(model=" + this.f21708a + ")";
        }
    }
}
