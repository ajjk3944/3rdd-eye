package Ee;

import Ee.C2706g;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Ee.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2705f {

    /* renamed from: Ee.f$a */
    public static final class a extends AbstractC2705f {

        /* renamed from: a, reason: collision with root package name */
        private final String f4588a;

        /* renamed from: b, reason: collision with root package name */
        private final C2706g.b f4589b;

        /* renamed from: c, reason: collision with root package name */
        private final String f4590c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String cardId, C2706g.b item) {
            super(null);
            AbstractC6492s.i(cardId, "cardId");
            AbstractC6492s.i(item, "item");
            this.f4588a = cardId;
            this.f4589b = item;
            this.f4590c = "itmD" + cardId + item.getId();
        }

        @Override // Ee.AbstractC2705f
        public String a() {
            return this.f4590c;
        }

        public final C2706g.b b() {
            return this.f4589b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f4588a, aVar.f4588a) && AbstractC6492s.d(this.f4589b, aVar.f4589b);
        }

        public int hashCode() {
            return (this.f4588a.hashCode() * 31) + this.f4589b.hashCode();
        }

        public String toString() {
            return "CardContentItemDivider(cardId=" + this.f4588a + ", item=" + this.f4589b + ")";
        }
    }

    /* renamed from: Ee.f$b */
    public static final class b extends AbstractC2705f {

        /* renamed from: a, reason: collision with root package name */
        private final String f4591a;

        /* renamed from: b, reason: collision with root package name */
        private final String f4592b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String cardId) {
            super(null);
            AbstractC6492s.i(cardId, "cardId");
            this.f4591a = cardId;
            this.f4592b = "cD" + cardId;
        }

        @Override // Ee.AbstractC2705f
        public String a() {
            return this.f4592b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(this.f4591a, ((b) obj).f4591a);
        }

        public int hashCode() {
            return this.f4591a.hashCode();
        }

        public String toString() {
            return "CardDivider(cardId=" + this.f4591a + ")";
        }
    }

    /* renamed from: Ee.f$c */
    public static final class c extends AbstractC2705f {

        /* renamed from: a, reason: collision with root package name */
        private final String f4593a;

        /* renamed from: b, reason: collision with root package name */
        private final s9.d f4594b;

        /* renamed from: c, reason: collision with root package name */
        private final a f4595c;

        /* renamed from: d, reason: collision with root package name */
        private final String f4596d;

        /* renamed from: Ee.f$c$a */
        public static abstract class a {

            /* renamed from: Ee.f$c$a$a, reason: collision with other inner class name */
            public static final class C0193a extends a {

                /* renamed from: a, reason: collision with root package name */
                private final s9.b f4597a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0193a(s9.b icon) {
                    super(null);
                    AbstractC6492s.i(icon, "icon");
                    this.f4597a = icon;
                }

                public final s9.b a() {
                    return this.f4597a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0193a) && AbstractC6492s.d(this.f4597a, ((C0193a) obj).f4597a);
                }

                public int hashCode() {
                    return this.f4597a.hashCode();
                }

                public String toString() {
                    return "Icon(icon=" + this.f4597a + ")";
                }
            }

            /* renamed from: Ee.f$c$a$b */
            public static final class b extends a {

                /* renamed from: a, reason: collision with root package name */
                private final s9.d f4598a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(s9.d text) {
                    super(null);
                    AbstractC6492s.i(text, "text");
                    this.f4598a = text;
                }

                public final s9.d a() {
                    return this.f4598a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && AbstractC6492s.d(this.f4598a, ((b) obj).f4598a);
                }

                public int hashCode() {
                    return this.f4598a.hashCode();
                }

                public String toString() {
                    return "Text(text=" + this.f4598a + ")";
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String cardId, s9.d title, a aVar) {
            super(null);
            AbstractC6492s.i(cardId, "cardId");
            AbstractC6492s.i(title, "title");
            this.f4593a = cardId;
            this.f4594b = title;
            this.f4595c = aVar;
            this.f4596d = "cTit" + cardId;
        }

        @Override // Ee.AbstractC2705f
        public String a() {
            return this.f4596d;
        }

        public final a b() {
            return this.f4595c;
        }

        public final String c() {
            return this.f4593a;
        }

        public final s9.d d() {
            return this.f4594b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC6492s.d(this.f4593a, cVar.f4593a) && AbstractC6492s.d(this.f4594b, cVar.f4594b) && AbstractC6492s.d(this.f4595c, cVar.f4595c);
        }

        public int hashCode() {
            int iHashCode = ((this.f4593a.hashCode() * 31) + this.f4594b.hashCode()) * 31;
            a aVar = this.f4595c;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            return "Header(cardId=" + this.f4593a + ", title=" + this.f4594b + ", button=" + this.f4595c + ")";
        }
    }

    /* renamed from: Ee.f$d */
    public static abstract class d extends AbstractC2705f {

        /* renamed from: Ee.f$d$a */
        public static final class a extends d {

            /* renamed from: a, reason: collision with root package name */
            private final String f4599a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f4600b;

            /* renamed from: c, reason: collision with root package name */
            private final boolean f4601c;

            /* renamed from: d, reason: collision with root package name */
            private final C2706g.b f4602d;

            /* renamed from: e, reason: collision with root package name */
            private final String f4603e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String cardId, boolean z10, boolean z11, C2706g.b item) {
                super(null);
                AbstractC6492s.i(cardId, "cardId");
                AbstractC6492s.i(item, "item");
                this.f4599a = cardId;
                this.f4600b = z10;
                this.f4601c = z11;
                this.f4602d = item;
                this.f4603e = "itm" + cardId + b().getId();
            }

            @Override // Ee.AbstractC2705f
            public String a() {
                return this.f4603e;
            }

            public C2706g.b b() {
                return this.f4602d;
            }

            public final boolean c() {
                return this.f4600b;
            }

            public final boolean d() {
                return this.f4601c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return AbstractC6492s.d(this.f4599a, aVar.f4599a) && this.f4600b == aVar.f4600b && this.f4601c == aVar.f4601c && AbstractC6492s.d(this.f4602d, aVar.f4602d);
            }

            public int hashCode() {
                return (((((this.f4599a.hashCode() * 31) + Boolean.hashCode(this.f4600b)) * 31) + Boolean.hashCode(this.f4601c)) * 31) + this.f4602d.hashCode();
            }

            public String toString() {
                return "CardContentItem(cardId=" + this.f4599a + ", isFirst=" + this.f4600b + ", isLast=" + this.f4601c + ", item=" + this.f4602d + ")";
            }
        }

        /* renamed from: Ee.f$d$b */
        public static final class b extends d {

            /* renamed from: a, reason: collision with root package name */
            private final C2706g.b f4604a;

            /* renamed from: b, reason: collision with root package name */
            private final String f4605b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C2706g.b item) {
                super(null);
                AbstractC6492s.i(item, "item");
                this.f4604a = item;
                this.f4605b = "itm" + b().getId();
            }

            @Override // Ee.AbstractC2705f
            public String a() {
                return this.f4605b;
            }

            public C2706g.b b() {
                return this.f4604a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC6492s.d(this.f4604a, ((b) obj).f4604a);
            }

            public int hashCode() {
                return this.f4604a.hashCode();
            }

            public String toString() {
                return "NoCardItem(item=" + this.f4604a + ")";
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC2705f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    private AbstractC2705f() {
    }
}
