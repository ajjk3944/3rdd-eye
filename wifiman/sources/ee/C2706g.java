package Ee;

import Ee.AbstractC2705f;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Ee.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2706g {

    /* renamed from: a, reason: collision with root package name */
    private final List f4606a;

    /* renamed from: Ee.g$a */
    public static abstract class a {

        /* renamed from: Ee.g$a$a, reason: collision with other inner class name */
        public static final class C0194a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final String f4607a;

            /* renamed from: b, reason: collision with root package name */
            private final s9.d f4608b;

            /* renamed from: c, reason: collision with root package name */
            private final AbstractC0195a f4609c;

            /* renamed from: d, reason: collision with root package name */
            private final List f4610d;

            /* renamed from: Ee.g$a$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC0195a {

                /* renamed from: Ee.g$a$a$a$a, reason: collision with other inner class name */
                public static final class C0196a extends AbstractC0195a {

                    /* renamed from: a, reason: collision with root package name */
                    private final s9.b f4611a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0196a(s9.b icon) {
                        super(null);
                        AbstractC6492s.i(icon, "icon");
                        this.f4611a = icon;
                    }

                    public final s9.b a() {
                        return this.f4611a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C0196a) && AbstractC6492s.d(this.f4611a, ((C0196a) obj).f4611a);
                    }

                    public int hashCode() {
                        return this.f4611a.hashCode();
                    }

                    public String toString() {
                        return "Icon(icon=" + this.f4611a + ")";
                    }
                }

                /* renamed from: Ee.g$a$a$a$b */
                public static final class b extends AbstractC0195a {

                    /* renamed from: a, reason: collision with root package name */
                    private final s9.d f4612a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(s9.d text) {
                        super(null);
                        AbstractC6492s.i(text, "text");
                        this.f4612a = text;
                    }

                    public final s9.d a() {
                        return this.f4612a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof b) && AbstractC6492s.d(this.f4612a, ((b) obj).f4612a);
                    }

                    public int hashCode() {
                        return this.f4612a.hashCode();
                    }

                    public String toString() {
                        return "Text(text=" + this.f4612a + ")";
                    }
                }

                public /* synthetic */ AbstractC0195a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private AbstractC0195a() {
                }
            }

            public /* synthetic */ C0194a(String str, s9.d dVar, AbstractC0195a abstractC0195a, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : dVar, (i10 & 4) != 0 ? null : abstractC0195a, list);
            }

            @Override // Ee.C2706g.a
            public String a() {
                return this.f4607a;
            }

            public final AbstractC0195a b() {
                return this.f4609c;
            }

            public final List c() {
                return this.f4610d;
            }

            public final s9.d d() {
                return this.f4608b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0194a)) {
                    return false;
                }
                C0194a c0194a = (C0194a) obj;
                return AbstractC6492s.d(this.f4607a, c0194a.f4607a) && AbstractC6492s.d(this.f4608b, c0194a.f4608b) && AbstractC6492s.d(this.f4609c, c0194a.f4609c) && AbstractC6492s.d(this.f4610d, c0194a.f4610d);
            }

            public int hashCode() {
                int iHashCode = this.f4607a.hashCode() * 31;
                s9.d dVar = this.f4608b;
                int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
                AbstractC0195a abstractC0195a = this.f4609c;
                return ((iHashCode2 + (abstractC0195a != null ? abstractC0195a.hashCode() : 0)) * 31) + this.f4610d.hashCode();
            }

            public String toString() {
                return "Card(id=" + this.f4607a + ", title=" + this.f4608b + ", headerButton=" + this.f4609c + ", items=" + this.f4610d + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0194a(String id2, s9.d dVar, AbstractC0195a abstractC0195a, List items) {
                super(null);
                AbstractC6492s.i(id2, "id");
                AbstractC6492s.i(items, "items");
                this.f4607a = id2;
                this.f4608b = dVar;
                this.f4609c = abstractC0195a;
                this.f4610d = items;
            }
        }

        /* renamed from: Ee.g$a$b */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final b f4613a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(b item) {
                super(null);
                AbstractC6492s.i(item, "item");
                this.f4613a = item;
            }

            @Override // Ee.C2706g.a
            public String a() {
                return this.f4613a.getId();
            }

            public final b b() {
                return this.f4613a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC6492s.d(this.f4613a, ((b) obj).f4613a);
            }

            public int hashCode() {
                return this.f4613a.hashCode();
            }

            public String toString() {
                return "NoCard(item=" + this.f4613a + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String a();

        private a() {
        }
    }

    /* renamed from: Ee.g$b */
    public interface b {
        String getId();

        String getType();
    }

    public C2706g(List items) {
        AbstractC6492s.i(items, "items");
        this.f4606a = items;
    }

    public final List a(boolean z10, boolean z11) {
        AbstractC2705f.c.a c0193a;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : this.f4606a) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC3689v.v();
            }
            a aVar = (a) obj;
            if (aVar instanceof a.C0194a) {
                a aVar2 = (a) AbstractC3689v.t0(this.f4606a, i10 - 1);
                if ((aVar2 != null && (aVar2 instanceof a.C0194a)) || (z10 && i10 == 0)) {
                    arrayList.add(new AbstractC2705f.b(((a.C0194a) aVar).a()));
                }
                a.C0194a c0194a = (a.C0194a) aVar;
                if (c0194a.d() != null) {
                    String strA = c0194a.a();
                    s9.d dVarD = c0194a.d();
                    a.C0194a.AbstractC0195a abstractC0195aB = c0194a.b();
                    if (abstractC0195aB instanceof a.C0194a.AbstractC0195a.b) {
                        c0193a = new AbstractC2705f.c.a.b(((a.C0194a.AbstractC0195a.b) c0194a.b()).a());
                    } else if (abstractC0195aB instanceof a.C0194a.AbstractC0195a.C0196a) {
                        c0193a = new AbstractC2705f.c.a.C0193a(((a.C0194a.AbstractC0195a.C0196a) c0194a.b()).a());
                    } else {
                        if (abstractC0195aB != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c0193a = null;
                    }
                    arrayList.add(new AbstractC2705f.c(strA, dVarD, c0193a));
                }
                int i12 = 0;
                for (Object obj2 : c0194a.c()) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        AbstractC3689v.v();
                    }
                    b bVar = (b) obj2;
                    if (i12 != 0) {
                        arrayList.add(new AbstractC2705f.a(c0194a.a(), bVar));
                    }
                    arrayList.add(new AbstractC2705f.d.a(c0194a.a(), i12 == 0, i12 == c0194a.c().size() + (-1), bVar));
                    i12 = i13;
                }
            } else {
                if (!(aVar instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList.add(new AbstractC2705f.d.b(((a.b) aVar).b()));
            }
            if (z11 && i10 == this.f4606a.size() - 1) {
                arrayList.add(new AbstractC2705f.b(aVar.a() + "bottom"));
            }
            i10 = i11;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2706g) && AbstractC6492s.d(this.f4606a, ((C2706g) obj).f4606a);
    }

    public int hashCode() {
        return this.f4606a.hashCode();
    }

    public String toString() {
        return "LazyCards(items=" + this.f4606a + ")";
    }
}
