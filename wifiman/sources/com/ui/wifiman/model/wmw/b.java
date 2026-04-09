package com.ui.wifiman.model.wmw;

import com.ui.wifiman.model.wmw.WifimanWizard;
import gg.AbstractC5912b;
import h9.C5969a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class b {

    public static abstract class a extends b {

        /* renamed from: com.ui.wifiman.model.wmw.b$a$a, reason: collision with other inner class name */
        public static final class C1526a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final String f44086a;

            /* renamed from: b, reason: collision with root package name */
            private final C5969a f44087b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1526a(String name, C5969a mac) {
                super(null);
                AbstractC6492s.i(name, "name");
                AbstractC6492s.i(mac, "mac");
                this.f44086a = name;
                this.f44087b = mac;
            }

            @Override // com.ui.wifiman.model.wmw.b.a
            public C5969a a() {
                return this.f44087b;
            }

            @Override // com.ui.wifiman.model.wmw.b.a
            public String b() {
                return this.f44086a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1526a)) {
                    return false;
                }
                C1526a c1526a = (C1526a) obj;
                return AbstractC6492s.d(this.f44086a, c1526a.f44086a) && AbstractC6492s.d(this.f44087b, c1526a.f44087b);
            }

            public int hashCode() {
                return (this.f44086a.hashCode() * 31) + this.f44087b.hashCode();
            }

            public String toString() {
                return "Bonded(name=" + this.f44086a + ", mac=" + this.f44087b + ")";
            }
        }

        /* renamed from: com.ui.wifiman.model.wmw.b$a$b, reason: collision with other inner class name */
        public static final class C1527b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final String f44088a;

            /* renamed from: b, reason: collision with root package name */
            private final C5969a f44089b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1527b(String name, C5969a mac) {
                super(null);
                AbstractC6492s.i(name, "name");
                AbstractC6492s.i(mac, "mac");
                this.f44088a = name;
                this.f44089b = mac;
            }

            @Override // com.ui.wifiman.model.wmw.b.a
            public C5969a a() {
                return this.f44089b;
            }

            @Override // com.ui.wifiman.model.wmw.b.a
            public String b() {
                return this.f44088a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1527b)) {
                    return false;
                }
                C1527b c1527b = (C1527b) obj;
                return AbstractC6492s.d(this.f44088a, c1527b.f44088a) && AbstractC6492s.d(this.f44089b, c1527b.f44089b);
            }

            public int hashCode() {
                return (this.f44088a.hashCode() * 31) + this.f44089b.hashCode();
            }

            public String toString() {
                return "NotBonded(name=" + this.f44088a + ", mac=" + this.f44089b + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract C5969a a();

        public abstract String b();

        private a() {
            super(null);
        }
    }

    /* renamed from: com.ui.wifiman.model.wmw.b$b, reason: collision with other inner class name */
    public static final class C1528b extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1528b f44090a = new C1528b();

        private C1528b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1528b);
        }

        public int hashCode() {
            return -595397584;
        }

        public String toString() {
            return "NothingAdopted";
        }
    }

    public static abstract class c {

        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            private final b f44091a;

            /* renamed from: b, reason: collision with root package name */
            private final float f44092b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b adoption, float f10) {
                super(null);
                AbstractC6492s.i(adoption, "adoption");
                this.f44091a = adoption;
                this.f44092b = f10;
            }

            @Override // com.ui.wifiman.model.wmw.b.c
            public b a() {
                return this.f44091a;
            }

            @Override // com.ui.wifiman.model.wmw.b.c
            public float b() {
                return this.f44092b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return AbstractC6492s.d(this.f44091a, aVar.f44091a) && Float.compare(this.f44092b, aVar.f44092b) == 0;
            }

            public int hashCode() {
                return (this.f44091a.hashCode() * 31) + Float.hashCode(this.f44092b);
            }

            public String toString() {
                return "Adopting(adoption=" + this.f44091a + ", progressLevel=" + this.f44092b + ")";
            }
        }

        /* renamed from: com.ui.wifiman.model.wmw.b$c$b, reason: collision with other inner class name */
        public static final class C1529b extends c {

            /* renamed from: a, reason: collision with root package name */
            private final b f44093a;

            /* renamed from: b, reason: collision with root package name */
            private final float f44094b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1529b(b adoption, float f10) {
                super(null);
                AbstractC6492s.i(adoption, "adoption");
                this.f44093a = adoption;
                this.f44094b = f10;
            }

            @Override // com.ui.wifiman.model.wmw.b.c
            public b a() {
                return this.f44093a;
            }

            @Override // com.ui.wifiman.model.wmw.b.c
            public float b() {
                return this.f44094b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1529b)) {
                    return false;
                }
                C1529b c1529b = (C1529b) obj;
                return AbstractC6492s.d(this.f44093a, c1529b.f44093a) && Float.compare(this.f44094b, c1529b.f44094b) == 0;
            }

            public int hashCode() {
                return (this.f44093a.hashCode() * 31) + Float.hashCode(this.f44094b);
            }

            public String toString() {
                return "Connecting(adoption=" + this.f44093a + ", progressLevel=" + this.f44094b + ")";
            }
        }

        /* renamed from: com.ui.wifiman.model.wmw.b$c$c, reason: collision with other inner class name */
        public static abstract class AbstractC1530c extends c {

            /* renamed from: com.ui.wifiman.model.wmw.b$c$c$a */
            public static final class a extends AbstractC1530c {

                /* renamed from: a, reason: collision with root package name */
                private final b f44095a;

                /* renamed from: b, reason: collision with root package name */
                private final float f44096b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(b adoption) {
                    super(null);
                    AbstractC6492s.i(adoption, "adoption");
                    this.f44095a = adoption;
                    this.f44096b = 1.0f;
                }

                @Override // com.ui.wifiman.model.wmw.b.c
                public b a() {
                    return this.f44095a;
                }

                @Override // com.ui.wifiman.model.wmw.b.c
                public float b() {
                    return this.f44096b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && AbstractC6492s.d(this.f44095a, ((a) obj).f44095a);
                }

                public int hashCode() {
                    return this.f44095a.hashCode();
                }

                public String toString() {
                    return "Adopted(adoption=" + this.f44095a + ")";
                }
            }

            /* renamed from: com.ui.wifiman.model.wmw.b$c$c$b, reason: collision with other inner class name */
            public static final class C1531b extends AbstractC1530c {

                /* renamed from: a, reason: collision with root package name */
                private final b f44097a;

                /* renamed from: b, reason: collision with root package name */
                private final WifimanWizard.Error f44098b;

                /* renamed from: c, reason: collision with root package name */
                private final float f44099c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1531b(b adoption, WifimanWizard.Error reason) {
                    super(null);
                    AbstractC6492s.i(adoption, "adoption");
                    AbstractC6492s.i(reason, "reason");
                    this.f44097a = adoption;
                    this.f44098b = reason;
                    this.f44099c = 1.0f;
                }

                @Override // com.ui.wifiman.model.wmw.b.c
                public b a() {
                    return this.f44097a;
                }

                @Override // com.ui.wifiman.model.wmw.b.c
                public float b() {
                    return this.f44099c;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1531b)) {
                        return false;
                    }
                    C1531b c1531b = (C1531b) obj;
                    return AbstractC6492s.d(this.f44097a, c1531b.f44097a) && AbstractC6492s.d(this.f44098b, c1531b.f44098b);
                }

                public int hashCode() {
                    return (this.f44097a.hashCode() * 31) + this.f44098b.hashCode();
                }

                public String toString() {
                    return "Failed(adoption=" + this.f44097a + ", reason=" + this.f44098b + ")";
                }
            }

            public /* synthetic */ AbstractC1530c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC1530c() {
                super(null);
            }
        }

        public static final class d extends c {

            /* renamed from: a, reason: collision with root package name */
            private final b f44100a;

            /* renamed from: b, reason: collision with root package name */
            private final float f44101b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(b adoption) {
                super(null);
                AbstractC6492s.i(adoption, "adoption");
                this.f44100a = adoption;
            }

            @Override // com.ui.wifiman.model.wmw.b.c
            public b a() {
                return this.f44100a;
            }

            @Override // com.ui.wifiman.model.wmw.b.c
            public float b() {
                return this.f44101b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && AbstractC6492s.d(this.f44100a, ((d) obj).f44100a);
            }

            public int hashCode() {
                return this.f44100a.hashCode();
            }

            public String toString() {
                return "Idle(adoption=" + this.f44100a + ")";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract b a();

        public abstract float b();

        private c() {
        }
    }

    public interface d {
        gg.i a();

        AbstractC5912b b(b bVar);
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
