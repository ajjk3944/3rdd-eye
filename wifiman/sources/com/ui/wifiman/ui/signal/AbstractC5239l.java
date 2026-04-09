package com.ui.wifiman.ui.signal;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.ui.wifiman.ui.signal.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5239l {

    /* renamed from: com.ui.wifiman.ui.signal.l$a */
    public static final class a extends AbstractC5239l {

        /* renamed from: a, reason: collision with root package name */
        private final List f44828a;

        /* renamed from: b, reason: collision with root package name */
        private final List f44829b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f44830c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f44831d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f44832e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List recordItems, List ssidAvailabilityRequirements, boolean z10, boolean z11, boolean z12) {
            super(null);
            AbstractC6492s.i(recordItems, "recordItems");
            AbstractC6492s.i(ssidAvailabilityRequirements, "ssidAvailabilityRequirements");
            this.f44828a = recordItems;
            this.f44829b = ssidAvailabilityRequirements;
            this.f44830c = z10;
            this.f44831d = z11;
            this.f44832e = z12;
        }

        public final boolean a() {
            return this.f44831d;
        }

        public final boolean b() {
            return this.f44832e;
        }

        public final List c() {
            return this.f44828a;
        }

        public final List d() {
            return this.f44829b;
        }

        public final boolean e() {
            return this.f44830c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f44828a, aVar.f44828a) && AbstractC6492s.d(this.f44829b, aVar.f44829b) && this.f44830c == aVar.f44830c && this.f44831d == aVar.f44831d && this.f44832e == aVar.f44832e;
        }

        public int hashCode() {
            return (((((((this.f44828a.hashCode() * 31) + this.f44829b.hashCode()) * 31) + Boolean.hashCode(this.f44830c)) * 31) + Boolean.hashCode(this.f44831d)) * 31) + Boolean.hashCode(this.f44832e);
        }

        public String toString() {
            return "Content(recordItems=" + this.f44828a + ", ssidAvailabilityRequirements=" + this.f44829b + ", isLoading=" + this.f44830c + ", newScanButtonAvailable=" + this.f44831d + ", newScanButtonEnabled=" + this.f44832e + ")";
        }
    }

    /* renamed from: com.ui.wifiman.ui.signal.l$b */
    public static abstract class b extends AbstractC5239l {

        /* renamed from: com.ui.wifiman.ui.signal.l$b$a */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f44833a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1390948083;
            }

            public String toString() {
                return "NoResultsYet";
            }
        }

        /* renamed from: com.ui.wifiman.ui.signal.l$b$b, reason: collision with other inner class name */
        public static abstract class AbstractC1612b extends b {

            /* renamed from: com.ui.wifiman.ui.signal.l$b$b$a */
            public static final class a extends AbstractC1612b {

                /* renamed from: a, reason: collision with root package name */
                public static final a f44834a = new a();

                private a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public int hashCode() {
                    return -270312532;
                }

                public String toString() {
                    return "ArCoreNotInstalled";
                }
            }

            /* renamed from: com.ui.wifiman.ui.signal.l$b$b$b, reason: collision with other inner class name */
            public static final class C1613b extends AbstractC1612b {

                /* renamed from: a, reason: collision with root package name */
                public static final C1613b f44835a = new C1613b();

                private C1613b() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1613b);
                }

                public int hashCode() {
                    return 701848137;
                }

                public String toString() {
                    return "CameraPermission";
                }
            }

            /* renamed from: com.ui.wifiman.ui.signal.l$b$b$c */
            public static final class c extends AbstractC1612b {

                /* renamed from: a, reason: collision with root package name */
                public static final c f44836a = new c();

                private c() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public int hashCode() {
                    return 2086766890;
                }

                public String toString() {
                    return "DeviceUnsupported";
                }
            }

            /* renamed from: com.ui.wifiman.ui.signal.l$b$b$d */
            public static abstract class d extends AbstractC1612b {

                /* renamed from: com.ui.wifiman.ui.signal.l$b$b$d$a */
                public static final class a extends d {

                    /* renamed from: a, reason: collision with root package name */
                    public static final a f44837a = new a();

                    private a() {
                        super(null);
                    }

                    public boolean equals(Object obj) {
                        return this == obj || (obj instanceof a);
                    }

                    public int hashCode() {
                        return 215078345;
                    }

                    public String toString() {
                        return "Disconnected";
                    }
                }

                /* renamed from: com.ui.wifiman.ui.signal.l$b$b$d$b, reason: collision with other inner class name */
                public static final class C1614b extends d {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C1614b f44838a = new C1614b();

                    private C1614b() {
                        super(null);
                    }

                    public boolean equals(Object obj) {
                        return this == obj || (obj instanceof C1614b);
                    }

                    public int hashCode() {
                        return -734959137;
                    }

                    public String toString() {
                        return "LocationDisabled";
                    }
                }

                /* renamed from: com.ui.wifiman.ui.signal.l$b$b$d$c */
                public static final class c extends d {

                    /* renamed from: a, reason: collision with root package name */
                    public static final c f44839a = new c();

                    private c() {
                        super(null);
                    }

                    public boolean equals(Object obj) {
                        return this == obj || (obj instanceof c);
                    }

                    public int hashCode() {
                        return -819812238;
                    }

                    public String toString() {
                        return "LocationPermission";
                    }
                }

                public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private d() {
                    super(null);
                }
            }

            /* renamed from: com.ui.wifiman.ui.signal.l$b$b$e */
            public static final class e extends AbstractC1612b {

                /* renamed from: a, reason: collision with root package name */
                public static final e f44840a = new e();

                private e() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof e);
                }

                public int hashCode() {
                    return 1207543093;
                }

                public String toString() {
                    return "Unknown";
                }
            }

            public /* synthetic */ AbstractC1612b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC1612b() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC5239l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC5239l() {
    }
}
