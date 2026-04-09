package Ca;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes3.dex */
public final class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final String f2438a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2439b;

    /* renamed from: c, reason: collision with root package name */
    private final g f2440c;

    /* renamed from: d, reason: collision with root package name */
    private final c f2441d;

    /* renamed from: e, reason: collision with root package name */
    private final C0109a f2442e;

    /* renamed from: f, reason: collision with root package name */
    private final b f2443f;

    /* renamed from: g, reason: collision with root package name */
    private final d f2444g;

    /* renamed from: h, reason: collision with root package name */
    private final f f2445h;

    /* renamed from: i, reason: collision with root package name */
    private final e f2446i;

    /* renamed from: j, reason: collision with root package name */
    private final Boolean f2447j;

    /* renamed from: Ca.a$a, reason: collision with other inner class name */
    public static final class C0109a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Boolean f2448a;

        public C0109a(Boolean bool) {
            this.f2448a = bool;
        }

        public final Boolean a() {
            return this.f2448a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0109a) && AbstractC6492s.d(this.f2448a, ((C0109a) obj).f2448a);
        }

        public int hashCode() {
            Boolean bool = this.f2448a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return "Australia(rcm=" + this.f2448a + ")";
        }
    }

    public static final class b implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final String f2449a;

        public b(String str) {
            this.f2449a = str;
        }

        public final String a() {
            return this.f2449a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(this.f2449a, ((b) obj).f2449a);
        }

        public int hashCode() {
            String str = this.f2449a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Brazil(anatel=" + this.f2449a + ")";
        }
    }

    public static final class e implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final String f2463a;

        public e(String str) {
            this.f2463a = str;
        }

        public final String a() {
            return this.f2463a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && AbstractC6492s.d(this.f2463a, ((e) obj).f2463a);
        }

        public int hashCode() {
            String str = this.f2463a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "SouthKorea(kc=" + this.f2463a + ")";
        }
    }

    public static final class f implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final String f2464a;

        public f(String str) {
            this.f2464a = str;
        }

        public final String a() {
            return this.f2464a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && AbstractC6492s.d(this.f2464a, ((f) obj).f2464a);
        }

        public int hashCode() {
            String str = this.f2464a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Taiwan(ncc=" + this.f2464a + ")";
        }
    }

    public a(String str, String str2, g gVar, c cVar, C0109a c0109a, b bVar, d dVar, f fVar, e eVar, Boolean bool) {
        this.f2438a = str;
        this.f2439b = str2;
        this.f2440c = gVar;
        this.f2441d = cVar;
        this.f2442e = c0109a;
        this.f2443f = bVar;
        this.f2444g = dVar;
        this.f2445h = fVar;
        this.f2446i = eVar;
        this.f2447j = bool;
    }

    public final C0109a a() {
        return this.f2442e;
    }

    public final b c() {
        return this.f2443f;
    }

    public final c d() {
        return this.f2441d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC6492s.d(this.f2438a, aVar.f2438a) && AbstractC6492s.d(this.f2439b, aVar.f2439b) && AbstractC6492s.d(this.f2440c, aVar.f2440c) && AbstractC6492s.d(this.f2441d, aVar.f2441d) && AbstractC6492s.d(this.f2442e, aVar.f2442e) && AbstractC6492s.d(this.f2443f, aVar.f2443f) && AbstractC6492s.d(this.f2444g, aVar.f2444g) && AbstractC6492s.d(this.f2445h, aVar.f2445h) && AbstractC6492s.d(this.f2446i, aVar.f2446i) && AbstractC6492s.d(this.f2447j, aVar.f2447j);
    }

    public final String g() {
        return this.f2439b;
    }

    public final g h() {
        return this.f2440c;
    }

    public int hashCode() {
        String str = this.f2438a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2439b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        g gVar = this.f2440c;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        c cVar = this.f2441d;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        C0109a c0109a = this.f2442e;
        int iHashCode5 = (iHashCode4 + (c0109a == null ? 0 : c0109a.hashCode())) * 31;
        b bVar = this.f2443f;
        int iHashCode6 = (iHashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        d dVar = this.f2444g;
        int iHashCode7 = (iHashCode6 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        f fVar = this.f2445h;
        int iHashCode8 = (iHashCode7 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        e eVar = this.f2446i;
        int iHashCode9 = (iHashCode8 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Boolean bool = this.f2447j;
        return iHashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "ProductComplianceELabel(modelName=" + this.f2438a + ", productName=" + this.f2439b + ", us=" + this.f2440c + ", ca=" + this.f2441d + ", au=" + this.f2442e + ", br=" + this.f2443f + ", jp=" + this.f2444g + ", tw=" + this.f2445h + ", ko=" + this.f2446i + ", indoorOnly=" + this.f2447j + ")";
    }

    public static final class d implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final List f2460a;

        /* renamed from: b, reason: collision with root package name */
        private final List f2461b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2462c;

        public d(List list, List list2, String str) {
            this.f2460a = list;
            this.f2461b = list2;
            this.f2462c = str;
        }

        public final List a() {
            return this.f2461b;
        }

        public final List c() {
            return this.f2460a;
        }

        public final String d() {
            return this.f2462c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC6492s.d(this.f2460a, dVar.f2460a) && AbstractC6492s.d(this.f2461b, dVar.f2461b) && AbstractC6492s.d(this.f2462c, dVar.f2462c);
        }

        public int hashCode() {
            List list = this.f2460a;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            List list2 = this.f2461b;
            int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str = this.f2462c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Japan(jrf=" + this.f2460a + ", jpa=" + this.f2461b + ", wifi=" + this.f2462c + ")";
        }

        public /* synthetic */ d(List list, List list2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : list2, (i10 & 4) != 0 ? null : str);
        }
    }

    public static final class g implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final String f2465a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f2466b;

        /* renamed from: c, reason: collision with root package name */
        private final List f2467c;

        /* renamed from: Ca.a$g$a, reason: collision with other inner class name */
        public static abstract class AbstractC0113a implements Serializable {

            /* renamed from: Ca.a$g$a$a, reason: collision with other inner class name */
            public static final class C0114a extends AbstractC0113a {

                /* renamed from: a, reason: collision with root package name */
                public static final C0114a f2468a = new C0114a();

                private C0114a() {
                    super(null);
                }

                @Override // Ca.a.g.AbstractC0113a
                public String a() {
                    return "Note: This equipment has been tested and found to comply with the limits for a Class A digital device, pursuant to part 15 of the FCC Rules. These limits are designed to provide reasonable protection against harmful interference when the equipment is operated in a commercial environment. This equipment generates, uses, and can radiate radio frequency energy and, if not installed and used in accordance with the instruction manual, may cause harmful interference to radio communications. Operation of this equipment in a residential area is likely to cause harmful interference in which case the user will be required to correct the interference at his own expense. Changes or modifications not expressly approved by the party responsible for compliance could void the user's authority to operate the equipment.";
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0114a);
                }

                public int hashCode() {
                    return -342896663;
                }

                public String toString() {
                    return "FCC_A";
                }
            }

            /* renamed from: Ca.a$g$a$b */
            public static final class b extends AbstractC0113a {

                /* renamed from: a, reason: collision with root package name */
                public static final b f2469a = new b();

                private b() {
                    super(null);
                }

                @Override // Ca.a.g.AbstractC0113a
                public String a() {
                    return "Changes or modifications not expressly approved by the party responsible for compliance could void the user's authority to operate the equipment.\nNOTE: This equipment has been tested and found to comply with the limits for a Class B digital device, pursuant to part 15 of the FCC Rules. These limits are designed to provide reasonable protection against harmful interference in a residential installation. This equipment generates, uses and can radiate radio frequency energy and, if not installed and used in accordance with the instructions, may cause harmful interference to radio communications. However, there is no guarantee that interference will not occur in a particular installation. If this equipment does cause harmful interference to radio or television reception, which can be determined by turning the equipment off and on, the user is encouraged to try to correct the interference by one or more of the following measures:\n      — Reorient or relocate the receiving antenna.\n      — Increase the separation between the equipment and receiver.\n      — Connect the equipment into an outlet on a circuit different from that to which the receiver is connected.\n      — Consult the dealer or an experienced radio/TV technician for help.";
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public int hashCode() {
                    return -342896662;
                }

                public String toString() {
                    return "FCC_B";
                }
            }

            /* renamed from: Ca.a$g$a$c */
            public static final class c extends AbstractC0113a {

                /* renamed from: a, reason: collision with root package name */
                private final int f2470a;

                public c(int i10) {
                    super(null);
                    this.f2470a = i10;
                }

                @Override // Ca.a.g.AbstractC0113a
                public String a() {
                    return "This equipment should be installed and operated with a minimum distance " + this.f2470a + " cm between the radiator and your body.";
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && this.f2470a == ((c) obj).f2470a;
                }

                public int hashCode() {
                    return Integer.hashCode(this.f2470a);
                }

                public String toString() {
                    return "RF(rfCm=" + this.f2470a + ")";
                }
            }

            /* renamed from: Ca.a$g$a$d */
            public static final class d extends AbstractC0113a {

                /* renamed from: a, reason: collision with root package name */
                public static final d f2471a = new d();

                private d() {
                    super(null);
                }

                @Override // Ca.a.g.AbstractC0113a
                public String a() {
                    return "Radiation Exposure Statement:\n\n- The device has been evaluated to meet general RF exposure requirement. The device can be used in portable exposure condition without restriction.\n\n- This transmitter must not be co-located or operating in conjunction with any other antenna or transmitter.";
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public int hashCode() {
                    return 1966133893;
                }

                public String toString() {
                    return "SAR";
                }
            }

            /* renamed from: Ca.a$g$a$e */
            public static final class e extends AbstractC0113a {

                /* renamed from: a, reason: collision with root package name */
                public static final e f2472a = new e();

                private e() {
                    super(null);
                }

                @Override // Ca.a.g.AbstractC0113a
                public String a() {
                    return "The device for the band 5150-5250 MHz is only for indoor usage to reduce potential for harmful interference to co-channel mobile satellite systems.";
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof e);
                }

                public int hashCode() {
                    return -1517972630;
                }

                public String toString() {
                    return "WiFi_5";
                }
            }

            /* renamed from: Ca.a$g$a$f */
            public static final class f extends AbstractC0113a {

                /* renamed from: a, reason: collision with root package name */
                public static final f f2473a = new f();

                private f() {
                    super(null);
                }

                @Override // Ca.a.g.AbstractC0113a
                public String a() {
                    return "(i) the device for operation in the band 5150-5250 MHz is only for indoor use to reduce the potential for harmful interference to co-channel mobile satellite systems;\n\n(ii) for devices with detachable antenna(s), the maximum antenna gain permitted for devices in the bands 5250-5350 MHz and 5470-5725 MHz shall be such that the equipment still complies with the e.i.r.p. limit; and\n\n(iii) for devices with detachable antenna(s), the maximum antenna gain permitted for devices in the band 5725-5850 MHz shall be such that the equipment still complies with the e.i.r.p. limits as appropriate.";
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof f);
                }

                public int hashCode() {
                    return 1981426537;
                }

                public String toString() {
                    return "WiFi_5_DetAnt";
                }
            }

            /* renamed from: Ca.a$g$a$g, reason: collision with other inner class name */
            public static final class C0115g extends AbstractC0113a {

                /* renamed from: a, reason: collision with root package name */
                public static final C0115g f2474a = new C0115g();

                private C0115g() {
                    super(null);
                }

                @Override // Ca.a.g.AbstractC0113a
                public String a() {
                    return "FCC/ISED regulations restrict the operation of this device to indoor use only. The operation of this device is prohibited on oil platforms, cars, trains, boats, and aircraft, except that operation of this device is permitted in large aircraft while flying above 10,000 feet. Operation of transmitters in the 5.925-7.125 GHz band is prohibited for control of or communications with unmanned aircraft systems.";
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0115g);
                }

                public int hashCode() {
                    return -1517972629;
                }

                public String toString() {
                    return "WiFi_6";
                }
            }

            public /* synthetic */ AbstractC0113a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public abstract String a();

            private AbstractC0113a() {
            }
        }

        public g(String str, Integer num, List list) {
            this.f2465a = str;
            this.f2466b = num;
            this.f2467c = list;
        }

        public final String a() {
            return this.f2465a;
        }

        public final Integer c() {
            return this.f2466b;
        }

        public final List d() {
            return this.f2467c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return AbstractC6492s.d(this.f2465a, gVar.f2465a) && AbstractC6492s.d(this.f2466b, gVar.f2466b) && AbstractC6492s.d(this.f2467c, gVar.f2467c);
        }

        public int hashCode() {
            String str = this.f2465a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f2466b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            List list = this.f2467c;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "UnitedStates(fcc=" + this.f2465a + ", rfCm=" + this.f2466b + ", warning=" + this.f2467c + ")";
        }

        public /* synthetic */ g(String str, Integer num, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : list);
        }
    }

    public static final class c implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final String f2450a;

        /* renamed from: b, reason: collision with root package name */
        private final String f2451b;

        /* renamed from: c, reason: collision with root package name */
        private final Integer f2452c;

        /* renamed from: d, reason: collision with root package name */
        private final List f2453d;

        /* renamed from: Ca.a$c$a, reason: collision with other inner class name */
        public static abstract class AbstractC0110a implements Serializable {

            /* renamed from: Ca.a$c$a$a, reason: collision with other inner class name */
            public static final class C0111a extends AbstractC0110a {

                /* renamed from: a, reason: collision with root package name */
                public static final C0111a f2454a = new C0111a();

                private C0111a() {
                    super(null);
                }

                @Override // Ca.a.c.AbstractC0110a
                public String a() {
                    return "This device complies with ISED Canada license-exempt RSS standard(s). Operation is subject to the following two conditions:\n      1. This device may not cause interference, and\n      2. This device must accept any interference received, including interference that may cause undesired operation.\n      \nLe présent appareil est conforme aux CNR d'ISDE Canada applicables aux appareils radio exempts de licence. L'exploitation est autorisée aux deux conditions suivantes:\n      1. L'appareil ne doit pas produire de brouillage\n      2. L'appareil doit accepter tout brouillage radioélectrique subi, même si le brouillage est susceptible d'en compromettre le fonctionnement.";
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0111a);
                }

                public int hashCode() {
                    return 288575440;
                }

                public String toString() {
                    return "IC";
                }
            }

            /* renamed from: Ca.a$c$a$b */
            public static final class b extends AbstractC0110a {

                /* renamed from: a, reason: collision with root package name */
                private final int f2455a;

                public b(int i10) {
                    super(null);
                    this.f2455a = i10;
                }

                @Override // Ca.a.c.AbstractC0110a
                public String a() {
                    return "Les antennes utilisées pour ce transmetteur doivent être installé en considérant une distance de séparation de toute personnes d'au moins " + this.f2455a + " cm et ne doivent pas être localisé ou utilize en conflit avec tout autre antenne ou transmetteur.";
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && this.f2455a == ((b) obj).f2455a;
                }

                public int hashCode() {
                    return Integer.hashCode(this.f2455a);
                }

                public String toString() {
                    return "RF(rfCm=" + this.f2455a + ")";
                }
            }

            /* renamed from: Ca.a$c$a$c, reason: collision with other inner class name */
            public static final class C0112c extends AbstractC0110a {

                /* renamed from: a, reason: collision with root package name */
                public static final C0112c f2456a = new C0112c();

                private C0112c() {
                    super(null);
                }

                @Override // Ca.a.c.AbstractC0110a
                public String a() {
                    return "Radiation Exposure Statement:\n\n- The device has been evaluated to meet general RF exposure requirement. The device can be used in portable exposure condition without restriction.\n\n- This transmitter must not be co-located or operating in conjunction with any other antenna or transmitter.\n\nDéclaration d’exposition aux radiations:\n\n- L’appareil a été évalué pour répondre aux exigences générales d’exposition aux RF. L’appareil peut être utilisé sans restriction dans des conditions d’exposition portables.\n\n- Cet émetteur ne doit pas être colocalisé ou fonctionner en conjonction avec une autre antenne ou émetteur.";
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0112c);
                }

                public int hashCode() {
                    return 355913678;
                }

                public String toString() {
                    return "SAR";
                }
            }

            /* renamed from: Ca.a$c$a$d */
            public static final class d extends AbstractC0110a {

                /* renamed from: a, reason: collision with root package name */
                public static final d f2457a = new d();

                private d() {
                    super(null);
                }

                @Override // Ca.a.c.AbstractC0110a
                public String a() {
                    return "(i) the device for operation in the band 5150-5250 MHz is only for indoor use to reduce the potential for harmful interference to co-channel mobile satellite systems;\n\n(ii) for devices with detachable antenna(s), the maximum antenna gain permitted for devices in the bands 5250-5350 MHz and 5470-5725 MHz shall be such that the equipment still complies with the e.i.r.p. limit; and\n\n(iii) for devices with detachable antenna(s), the maximum antenna gain permitted for devices in the band 5725-5850 MHz shall be such that the equipment still complies with the e.i.r.p. limits as appropriate.\n\n(i) les dispositifs fonctionnant dans la bande 5150-5250 MHz sont réservés uniquement pour une utilisation à l'intérieur afin de réduire les risques de brouillage préjudiciable aux systèmes de satellites mobiles utilisant les mêmes canaux;\n\n(ii) pour les dispositifs munis d'antennes amovibles, le gain maximal d'antenne permis pour les dispositifs utilisant les bandes de 5 250 à 5 350 MHz et de 5 470 à 5 725 MHz doit être conforme à la limite de la p.i.r.e;\n\n(iii) pour les dispositifs munis d'antennes amovibles, le gain maximal d'antenne permis (pour les dispositifs utilisant la bande de 5 725 à 5 850 MHz) doit être conforme à la limite de la p.i.r.e. spécifiée, selon le cas.";
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public int hashCode() {
                    return 230613362;
                }

                public String toString() {
                    return "WiFi_5_DetAnt";
                }
            }

            /* renamed from: Ca.a$c$a$e */
            public static final class e extends AbstractC0110a {

                /* renamed from: a, reason: collision with root package name */
                public static final e f2458a = new e();

                private e() {
                    super(null);
                }

                @Override // Ca.a.c.AbstractC0110a
                public String a() {
                    return "FCC/ISED regulations restrict the operation of this device to indoor use only. The operation of this device is prohibited on oil platforms, cars, trains, boats, and aircraft, except that operation of this device is permitted in large aircraft while flying above 10,000 feet. Operation of transmitters in the 5.925-7.125 GHz band is prohibited for control of or communications with unmanned aircraft systems.";
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof e);
                }

                public int hashCode() {
                    return -1098668670;
                }

                public String toString() {
                    return "WiFi_6";
                }
            }

            /* renamed from: Ca.a$c$a$f */
            public static final class f extends AbstractC0110a {

                /* renamed from: a, reason: collision with root package name */
                public static final f f2459a = new f();

                private f() {
                    super(null);
                }

                @Override // Ca.a.c.AbstractC0110a
                public String a() {
                    return "The device for the band 5150-5250 MHz is only for indoor usage to reduce potential for harmful interference to co-channel mobile satellite systems.\nLes dispositifs fonctionnant dans la bande 5150-5250 MHz sont réservés uniquement pour une utilisation à l'intérieur afin de réduire les risques de brouillage préjudiciable aux systèmes de satellites mobiles utilisant les mêmes canaux.";
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof f);
                }

                public int hashCode() {
                    return -1097715359;
                }

                public String toString() {
                    return "Wifi_5";
                }
            }

            public /* synthetic */ AbstractC0110a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public abstract String a();

            private AbstractC0110a() {
            }
        }

        public c(String str, String str2, Integer num, List list) {
            this.f2450a = str;
            this.f2451b = str2;
            this.f2452c = num;
            this.f2453d = list;
        }

        public final String a() {
            return this.f2451b;
        }

        public final String c() {
            return this.f2450a;
        }

        public final Integer d() {
            return this.f2452c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC6492s.d(this.f2450a, cVar.f2450a) && AbstractC6492s.d(this.f2451b, cVar.f2451b) && AbstractC6492s.d(this.f2452c, cVar.f2452c) && AbstractC6492s.d(this.f2453d, cVar.f2453d);
        }

        public final List g() {
            return this.f2453d;
        }

        public int hashCode() {
            String str = this.f2450a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f2451b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f2452c;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            List list = this.f2453d;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Canada(icEmi=" + this.f2450a + ", ic=" + this.f2451b + ", rfCm=" + this.f2452c + ", warning=" + this.f2453d + ")";
        }

        public /* synthetic */ c(String str, String str2, Integer num, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : list);
        }
    }

    public /* synthetic */ a(String str, String str2, g gVar, c cVar, C0109a c0109a, b bVar, d dVar, f fVar, e eVar, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : gVar, (i10 & 8) != 0 ? null : cVar, (i10 & 16) != 0 ? null : c0109a, (i10 & 32) != 0 ? null : bVar, (i10 & 64) != 0 ? null : dVar, (i10 & 128) != 0 ? null : fVar, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : eVar, (i10 & 512) == 0 ? bool : null);
    }
}
