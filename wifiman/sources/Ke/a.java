package Ke;

import Af.C2428c;
import Be.A0;
import Ee.C2706g;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import s9.InterfaceC7929a;

/* loaded from: classes4.dex */
public interface a extends C2706g.b {

    /* renamed from: Ke.a$a, reason: collision with other inner class name */
    public static final class C0430a implements a {

        /* renamed from: a, reason: collision with root package name */
        private final s9.d f10674a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f10675b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC7929a f10676c;

        /* renamed from: d, reason: collision with root package name */
        private final s9.d f10677d;

        /* renamed from: e, reason: collision with root package name */
        private final List f10678e;

        /* renamed from: f, reason: collision with root package name */
        private final String f10679f;

        /* renamed from: g, reason: collision with root package name */
        private final String f10680g;

        public C0430a(s9.d name, boolean z10, InterfaceC7929a interfaceC7929a, s9.d dVar, List labels) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(labels, "labels");
            this.f10674a = name;
            this.f10675b = z10;
            this.f10676c = interfaceC7929a;
            this.f10677d = dVar;
            this.f10678e = labels;
            this.f10679f = "header";
            this.f10680g = getType();
        }

        public final boolean a() {
            return this.f10675b;
        }

        public final InterfaceC7929a b() {
            return this.f10676c;
        }

        public final List c() {
            return this.f10678e;
        }

        public final s9.d d() {
            return this.f10677d;
        }

        public final s9.d e() {
            return this.f10674a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0430a)) {
                return false;
            }
            C0430a c0430a = (C0430a) obj;
            return AbstractC6492s.d(this.f10674a, c0430a.f10674a) && this.f10675b == c0430a.f10675b && AbstractC6492s.d(this.f10676c, c0430a.f10676c) && AbstractC6492s.d(this.f10677d, c0430a.f10677d) && AbstractC6492s.d(this.f10678e, c0430a.f10678e);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f10680g;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f10679f;
        }

        public int hashCode() {
            int iHashCode = ((this.f10674a.hashCode() * 31) + Boolean.hashCode(this.f10675b)) * 31;
            InterfaceC7929a interfaceC7929a = this.f10676c;
            int iHashCode2 = (iHashCode + (interfaceC7929a == null ? 0 : interfaceC7929a.hashCode())) * 31;
            s9.d dVar = this.f10677d;
            return ((iHashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.f10678e.hashCode();
        }

        public String toString() {
            return "Header(name=" + this.f10674a + ", deviceIdentified=" + this.f10675b + ", image=" + this.f10676c + ", model=" + this.f10677d + ", labels=" + this.f10678e + ")";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final String f10681a;

        /* renamed from: b, reason: collision with root package name */
        private final s9.d f10682b;

        /* renamed from: c, reason: collision with root package name */
        private final s9.d f10683c;

        /* renamed from: d, reason: collision with root package name */
        private final s9.d f10684d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f10685e;

        /* renamed from: f, reason: collision with root package name */
        private final String f10686f;

        public b(String id2, s9.d title, s9.d dVar, s9.d value, boolean z10) {
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(title, "title");
            AbstractC6492s.i(value, "value");
            this.f10681a = id2;
            this.f10682b = title;
            this.f10683c = dVar;
            this.f10684d = value;
            this.f10685e = z10;
            this.f10686f = "keyValue";
        }

        public final boolean a() {
            return this.f10685e;
        }

        public final s9.d b() {
            return this.f10683c;
        }

        public final s9.d c() {
            return this.f10682b;
        }

        public final s9.d d() {
            return this.f10684d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f10681a, bVar.f10681a) && AbstractC6492s.d(this.f10682b, bVar.f10682b) && AbstractC6492s.d(this.f10683c, bVar.f10683c) && AbstractC6492s.d(this.f10684d, bVar.f10684d) && this.f10685e == bVar.f10685e;
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f10681a;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f10686f;
        }

        public int hashCode() {
            int iHashCode = ((this.f10681a.hashCode() * 31) + this.f10682b.hashCode()) * 31;
            s9.d dVar = this.f10683c;
            return ((((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.f10684d.hashCode()) * 31) + Boolean.hashCode(this.f10685e);
        }

        public String toString() {
            return "KeyValue(id=" + this.f10681a + ", title=" + this.f10682b + ", subtitle=" + this.f10683c + ", value=" + this.f10684d + ", networkHostHighlightEnabled=" + this.f10685e + ")";
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        private final String f10687a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC7929a f10688b;

        /* renamed from: c, reason: collision with root package name */
        private final s9.d f10689c;

        /* renamed from: d, reason: collision with root package name */
        private final String f10690d;

        public c(String id2, InterfaceC7929a icon, s9.d title) {
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(icon, "icon");
            AbstractC6492s.i(title, "title");
            this.f10687a = id2;
            this.f10688b = icon;
            this.f10689c = title;
            this.f10690d = "managerApp";
        }

        public final InterfaceC7929a a() {
            return this.f10688b;
        }

        public final s9.d b() {
            return this.f10689c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC6492s.d(this.f10687a, cVar.f10687a) && AbstractC6492s.d(this.f10688b, cVar.f10688b) && AbstractC6492s.d(this.f10689c, cVar.f10689c);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f10687a;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f10690d;
        }

        public int hashCode() {
            return (((this.f10687a.hashCode() * 31) + this.f10688b.hashCode()) * 31) + this.f10689c.hashCode();
        }

        public String toString() {
            return "ManagerApp(id=" + this.f10687a + ", icon=" + this.f10688b + ", title=" + this.f10689c + ")";
        }
    }

    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f10691a;

        /* renamed from: b, reason: collision with root package name */
        private static final String f10692b;

        /* renamed from: c, reason: collision with root package name */
        private static final String f10693c;

        static {
            d dVar = new d();
            f10691a = dVar;
            f10692b = "portScanControl";
            f10693c = dVar.getType();
        }

        private d() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return f10693c;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return f10692b;
        }

        public int hashCode() {
            return -900621582;
        }

        public String toString() {
            return "PortScanControl";
        }
    }

    public static final class e implements a {

        /* renamed from: a, reason: collision with root package name */
        private final String f10694a;

        /* renamed from: b, reason: collision with root package name */
        private final l f10695b;

        /* renamed from: c, reason: collision with root package name */
        private final String f10696c;

        public e(String id2, l item) {
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(item, "item");
            this.f10694a = id2;
            this.f10695b = item;
            this.f10696c = "portScanItem";
        }

        public final l a() {
            return this.f10695b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC6492s.d(this.f10694a, eVar.f10694a) && AbstractC6492s.d(this.f10695b, eVar.f10695b);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f10694a;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f10696c;
        }

        public int hashCode() {
            return (this.f10694a.hashCode() * 31) + this.f10695b.hashCode();
        }

        public String toString() {
            return "PortScanItem(id=" + this.f10694a + ", item=" + this.f10695b + ")";
        }
    }

    public static final class f implements a {

        /* renamed from: a, reason: collision with root package name */
        private final A0 f10697a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f10698b;

        /* renamed from: c, reason: collision with root package name */
        private final String f10699c;

        /* renamed from: d, reason: collision with root package name */
        private final String f10700d;

        public f(A0 signal, boolean z10) {
            AbstractC6492s.i(signal, "signal");
            this.f10697a = signal;
            this.f10698b = z10;
            this.f10699c = signal.c();
            this.f10700d = "wirelessSignals";
        }

        public final A0 a() {
            return this.f10697a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return AbstractC6492s.d(this.f10697a, fVar.f10697a) && this.f10698b == fVar.f10698b;
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f10699c;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f10700d;
        }

        public int hashCode() {
            return (this.f10697a.hashCode() * 31) + Boolean.hashCode(this.f10698b);
        }

        public String toString() {
            return "Signal(signal=" + this.f10697a + ", clickable=" + this.f10698b + ")";
        }
    }

    public static final class g implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f10701a;

        /* renamed from: b, reason: collision with root package name */
        private static final String f10702b;

        /* renamed from: c, reason: collision with root package name */
        private static final String f10703c;

        static {
            g gVar = new g();
            f10701a = gVar;
            f10702b = "speedtestButton";
            f10703c = gVar.getType();
        }

        private g() {
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return f10703c;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return f10702b;
        }
    }

    public static final class h implements a {

        /* renamed from: a, reason: collision with root package name */
        private final C2428c f10704a;

        /* renamed from: b, reason: collision with root package name */
        private final String f10705b;

        /* renamed from: c, reason: collision with root package name */
        private final String f10706c;

        public h(C2428c ap) {
            AbstractC6492s.i(ap, "ap");
            this.f10704a = ap;
            this.f10705b = ap.a();
            this.f10706c = "wifiAP";
        }

        public final C2428c a() {
            return this.f10704a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && AbstractC6492s.d(this.f10704a, ((h) obj).f10704a);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f10705b;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f10706c;
        }

        public int hashCode() {
            return this.f10704a.hashCode();
        }

        public String toString() {
            return "WifiAP(ap=" + this.f10704a + ")";
        }
    }
}
