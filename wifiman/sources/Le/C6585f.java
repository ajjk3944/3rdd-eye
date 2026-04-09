package le;

import ch.AbstractC4260a;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import ke.AbstractC6458c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le.C6585f;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* renamed from: le.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6585f {

    /* renamed from: g, reason: collision with root package name */
    public static final a f52559g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final List f52560a;

    /* renamed from: b, reason: collision with root package name */
    private final C6588i f52561b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f52562c;

    /* renamed from: d, reason: collision with root package name */
    private final C6588i f52563d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f52564e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f52565f;

    /* renamed from: le.f$a */
    public static final class a {

        /* renamed from: le.f$a$a, reason: collision with other inner class name */
        public static final class C1942a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4260a.e(Boolean.valueOf(!(((C6585f) obj).c().r() instanceof AbstractC6458c.a)), Boolean.valueOf(!(((C6585f) obj2).c().r() instanceof AbstractC6458c.a)));
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int f(C6585f c6585f, C6585f c6585f2) {
            return AbstractC4260a.e(c6585f.c().r(), c6585f2.c().r());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int g(InterfaceC6839p interfaceC6839p, Object obj, Object obj2) {
            return ((Number) interfaceC6839p.invoke(obj, obj2)).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int h(C6585f c6585f, C6585f c6585f2) {
            return AbstractC4260a.e(c6585f.c().e(), c6585f2.c().e());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int i(InterfaceC6839p interfaceC6839p, Object obj, Object obj2) {
            return ((Number) interfaceC6839p.invoke(obj, obj2)).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int l(InterfaceC6835l interfaceC6835l, C6585f c6585f, C6585f c6585f2) {
            AbstractC6492s.f(c6585f2);
            Comparable comparable = (Comparable) interfaceC6835l.invoke(c6585f2);
            AbstractC6492s.f(c6585f);
            return AbstractC4260a.e(comparable, (Comparable) interfaceC6835l.invoke(c6585f));
        }

        public final Comparator j() {
            C1942a c1942a = new C1942a();
            final InterfaceC6839p interfaceC6839p = new InterfaceC6839p() { // from class: le.a
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(C6585f.a.f((C6585f) obj, (C6585f) obj2));
                }
            };
            Comparator comparatorI = AbstractC4260a.i(c1942a, new Comparator() { // from class: le.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C6585f.a.g(interfaceC6839p, obj, obj2);
                }
            });
            final InterfaceC6839p interfaceC6839p2 = new InterfaceC6839p() { // from class: le.c
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(C6585f.a.h((C6585f) obj, (C6585f) obj2));
                }
            };
            return AbstractC4260a.i(comparatorI, new Comparator() { // from class: le.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C6585f.a.i(interfaceC6839p2, obj, obj2);
                }
            });
        }

        public final Comparator k(final InterfaceC6835l signalGetter) {
            AbstractC6492s.i(signalGetter, "signalGetter");
            return new Comparator() { // from class: le.e
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C6585f.a.l(signalGetter, (C6585f) obj, (C6585f) obj2);
                }
            };
        }

        private a() {
        }
    }

    /* renamed from: le.f$b */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC4260a.e(((C6588i) obj2).q(), ((C6588i) obj).q());
        }
    }

    /* renamed from: le.f$c */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC4260a.e(((C6588i) obj2).f().a(), ((C6588i) obj).f().a());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C6585f(java.util.List r10) {
        /*
            r9 = this;
            java.lang.String r0 = "allSignals"
            kotlin.jvm.internal.AbstractC6492s.i(r10, r0)
            r9.<init>()
            r9.f52560a = r10
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r2 = 0
        L1b:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r10.next()
            le.i r3 = (le.C6588i) r3
            fh.a r4 = S8.c.getEntries()
            java.util.Iterator r4 = r4.iterator()
        L2f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L75
            java.lang.Object r5 = r4.next()
            S8.c r5 = (S8.c) r5
            java.lang.Object r6 = r0.get(r5)
            r7 = r6
            le.i r7 = (le.C6588i) r7
            if (r7 == 0) goto L49
            S8.l r8 = r7.q()
            goto L4a
        L49:
            r8 = 0
        L4a:
            if (r8 == 0) goto L66
            S8.l r8 = r3.q()
            if (r8 == 0) goto L69
            kotlin.jvm.internal.AbstractC6492s.f(r6)
            S8.l r6 = r7.q()
            kotlin.jvm.internal.AbstractC6492s.f(r6)
            S8.l r7 = r3.q()
            int r6 = r6.compareTo(r7)
            if (r6 > 0) goto L69
        L66:
            r0.put(r5, r3)
        L69:
            ke.a r6 = r3.m()
            boolean r6 = r6 instanceof ke.AbstractC6456a.AbstractC1905a
            if (r6 == 0) goto L2f
            r1.put(r5, r3)
            goto L2f
        L75:
            if (r2 != 0) goto L1b
            boolean r3 = r3.d()
            if (r3 == 0) goto L1b
            r2 = 1
            goto L1b
        L7f:
            boolean r10 = r0.isEmpty()
            if (r10 != 0) goto Lc2
            java.util.Collection r10 = r0.values()
            java.lang.String r3 = "<get-values>(...)"
            kotlin.jvm.internal.AbstractC6492s.h(r10, r3)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            le.f$b r4 = new le.f$b
            r4.<init>()
            java.util.List r10 = Zg.AbstractC3689v.X0(r10, r4)
            java.lang.Object r10 = Zg.AbstractC3689v.q0(r10)
            le.i r10 = (le.C6588i) r10
            r9.f52563d = r10
            java.util.Collection r10 = r1.values()
            kotlin.jvm.internal.AbstractC6492s.h(r10, r3)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            le.f$c r3 = new le.f$c
            r3.<init>()
            java.util.List r10 = Zg.AbstractC3689v.X0(r10, r3)
            java.lang.Object r10 = Zg.AbstractC3689v.s0(r10)
            le.i r10 = (le.C6588i) r10
            r9.f52561b = r10
            r9.f52562c = r1
            r9.f52564e = r0
            r9.f52565f = r2
            return
        Lc2:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Wifi Network with no signal"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: le.C6585f.<init>(java.util.List):void");
    }

    public final List a() {
        return this.f52560a;
    }

    public final String b() {
        return this.f52563d.o();
    }

    public final C6588i c() {
        return this.f52563d;
    }

    public final C6588i d(S8.c band) {
        AbstractC6492s.i(band, "band");
        return (C6588i) this.f52564e.get(band);
    }

    public final C6588i e() {
        return this.f52561b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6585f) && AbstractC6492s.d(this.f52560a, ((C6585f) obj).f52560a);
    }

    public int hashCode() {
        return S8.i.h(this.f52563d.o());
    }

    public String toString() {
        return "WifiNetwork(allSignals=" + this.f52560a + ")";
    }
}
