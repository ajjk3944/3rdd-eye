package S8;

import Yg.m;
import Yg.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import sh.C7974i;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: f, reason: collision with root package name */
    public static final a f20364f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final S8.c f20365a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20366b;

    /* renamed from: c, reason: collision with root package name */
    private final b f20367c;

    /* renamed from: d, reason: collision with root package name */
    private final d f20368d;

    /* renamed from: e, reason: collision with root package name */
    private final m f20369e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(e eVar) {
            return Kb.a.f10590a.i7(eVar.d(), eVar.b().getWidth(), eVar.e().a());
        }

        public final Double b(e eVar, e channel) {
            AbstractC6492s.i(eVar, "<this>");
            AbstractC6492s.i(channel, "channel");
            return Kb.a.f10590a.j7(a(eVar), a(channel));
        }

        private a() {
        }
    }

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        private final m f20370a;

        public static final class a extends b {

            /* renamed from: b, reason: collision with root package name */
            private final d f20371b;

            /* renamed from: c, reason: collision with root package name */
            private final int f20372c;

            /* renamed from: d, reason: collision with root package name */
            private final int f20373d;

            /* renamed from: e, reason: collision with root package name */
            private final int f20374e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d bandwidth, int i10, int i11) {
                super(null);
                AbstractC6492s.i(bandwidth, "bandwidth");
                this.f20371b = bandwidth;
                this.f20372c = i10;
                this.f20373d = i11;
                this.f20374e = i10 - ((i10 - i11) / 2);
            }

            @Override // S8.e.b
            public int a() {
                return this.f20374e;
            }

            public final d c() {
                return this.f20371b;
            }

            public final int d() {
                return this.f20372c;
            }

            public final int e() {
                return this.f20373d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f20371b == aVar.f20371b && this.f20372c == aVar.f20372c && this.f20373d == aVar.f20373d;
            }

            public int hashCode() {
                return (((this.f20371b.hashCode() * 31) + Integer.hashCode(this.f20372c)) * 31) + Integer.hashCode(this.f20373d);
            }

            public String toString() {
                return "Combined(bandwidth=" + this.f20371b + ", controlCenter=" + this.f20372c + ", dataCenter=" + this.f20373d + ")";
            }
        }

        /* renamed from: S8.e$b$b, reason: collision with other inner class name */
        public static final class C0729b extends b {

            /* renamed from: b, reason: collision with root package name */
            private final d f20375b;

            /* renamed from: c, reason: collision with root package name */
            private final int f20376c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0729b(d bandwidth, int i10) {
                super(null);
                AbstractC6492s.i(bandwidth, "bandwidth");
                this.f20375b = bandwidth;
                this.f20376c = i10;
            }

            @Override // S8.e.b
            public int a() {
                return this.f20376c;
            }

            public final d c() {
                return this.f20375b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0729b)) {
                    return false;
                }
                C0729b c0729b = (C0729b) obj;
                return this.f20375b == c0729b.f20375b && this.f20376c == c0729b.f20376c;
            }

            public int hashCode() {
                return (this.f20375b.hashCode() * 31) + Integer.hashCode(this.f20376c);
            }

            public String toString() {
                return "Regular(bandwidth=" + this.f20375b + ", center=" + this.f20376c + ")";
            }
        }

        static final class c extends AbstractC6494u implements InterfaceC6824a {
            c() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                ArrayList arrayList = new ArrayList();
                b bVar = b.this;
                if (bVar instanceof C0729b) {
                    C0729b c0729b = (C0729b) bVar;
                    arrayList.add(new C7974i(bVar.a() - (c0729b.c().getWidth() / 2), bVar.a() + (c0729b.c().getWidth() / 2)));
                } else if (bVar instanceof a) {
                    a aVar = (a) bVar;
                    int width = aVar.c().getWidth() / 4;
                    arrayList.add(new C7974i(aVar.d() - width, aVar.d() + width));
                    arrayList.add(new C7974i(aVar.e() - width, aVar.e() + width));
                }
                return arrayList;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int a();

        public final List b() {
            return (List) this.f20370a.getValue();
        }

        private b() {
            this.f20370a = n.b(new c());
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {
        c() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf((((((e.this.a().hashCode() * 31) + e.this.d()) * 31) + e.this.e().hashCode()) * 31) + e.this.b().hashCode());
        }
    }

    public e(S8.c band, int i10, b range, d bandwidth) {
        AbstractC6492s.i(band, "band");
        AbstractC6492s.i(range, "range");
        AbstractC6492s.i(bandwidth, "bandwidth");
        this.f20365a = band;
        this.f20366b = i10;
        this.f20367c = range;
        this.f20368d = bandwidth;
        this.f20369e = n.b(new c());
    }

    public final S8.c a() {
        return this.f20365a;
    }

    public final d b() {
        return this.f20368d;
    }

    public final int c() {
        return ((Number) this.f20369e.getValue()).intValue();
    }

    public final int d() {
        return this.f20366b;
    }

    public final b e() {
        return this.f20367c;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && c() == ((e) obj).c();
    }

    public final boolean f(e channel) {
        AbstractC6492s.i(channel, "channel");
        List<C7974i> listB = this.f20367c.b();
        if ((listB instanceof Collection) && listB.isEmpty()) {
            return false;
        }
        for (C7974i c7974i : listB) {
            List<C7974i> listB2 = channel.f20367c.b();
            if (!(listB2 instanceof Collection) || !listB2.isEmpty()) {
                for (C7974i c7974i2 : listB2) {
                    if (Math.max(c7974i.i(), c7974i2.i()) < Math.min(c7974i.j(), c7974i2.j())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return c();
    }

    public String toString() {
        return "WiFi Channel " + this.f20366b + " [" + this.f20365a + "] (center: " + this.f20367c.a() + ", bw: " + this.f20368d + ")";
    }
}
