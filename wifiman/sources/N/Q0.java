package N;

import Ii.AbstractC3063k;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Zg.AbstractC3689v;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC3932k0;
import androidx.compose.ui.platform.AbstractC3964z0;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f.AbstractC5487d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import y.InterfaceC8558m;

/* loaded from: classes.dex */
public abstract class Q0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13911a = new a();

        a() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke(Object obj, Object obj2) {
            return new T(Y0.h.j(56), null);
        }
    }

    static final class b extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f13912a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ R0 f13913b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3354x0 f13914c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13915d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f13916e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ w.q f13917f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f13918g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f13919h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f13920i;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f13921a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ R0 f13922b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Map f13923c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C3354x0 f13924d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Y0.d f13925e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f13926f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ float f13927g;

            /* renamed from: N.Q0$b$a$a, reason: collision with other inner class name */
            static final class C0545a extends AbstractC6494u implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Map f13928a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC6839p f13929b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Y0.d f13930c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0545a(Map map, InterfaceC6839p interfaceC6839p, Y0.d dVar) {
                    super(2);
                    this.f13928a = map;
                    this.f13929b = interfaceC6839p;
                    this.f13930c = dVar;
                }

                public final Float a(float f10, float f11) {
                    return Float.valueOf(((b1) this.f13929b.invoke(Zg.U.i(this.f13928a, Float.valueOf(f10)), Zg.U.i(this.f13928a, Float.valueOf(f11)))).a(this.f13930c, f10, f11));
                }

                @Override // mh.InterfaceC6839p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(R0 r02, Map map, C3354x0 c3354x0, Y0.d dVar, InterfaceC6839p interfaceC6839p, float f10, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f13922b = r02;
                this.f13923c = map;
                this.f13924d = c3354x0;
                this.f13925e = dVar;
                this.f13926f = interfaceC6839p;
                this.f13927g = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f13922b, this.f13923c, this.f13924d, this.f13925e, this.f13926f, this.f13927g, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f13921a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    Map mapL = this.f13922b.l();
                    this.f13922b.A(this.f13923c);
                    this.f13922b.D(this.f13924d);
                    this.f13922b.E(new C0545a(this.f13923c, this.f13926f, this.f13925e));
                    this.f13922b.F(this.f13925e.d1(this.f13927g));
                    R0 r02 = this.f13922b;
                    Map map = this.f13923c;
                    this.f13921a = 1;
                    if (r02.z(mapL, map, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                return Yg.J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* renamed from: N.Q0$b$b, reason: collision with other inner class name */
        static final class C0546b extends kotlin.coroutines.jvm.internal.l implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            int f13931a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f13932b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ float f13933c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ R0 f13934d;

            /* renamed from: N.Q0$b$b$a */
            static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f13935a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ R0 f13936b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ float f13937c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(R0 r02, float f10, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f13936b = r02;
                    this.f13937c = f10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new a(this.f13936b, this.f13937c, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f13935a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        R0 r02 = this.f13936b;
                        float f10 = this.f13937c;
                        this.f13935a = 1;
                        if (r02.y(f10, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                    }
                    return Yg.J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                    return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0546b(R0 r02, InterfaceC5380e interfaceC5380e) {
                super(3, interfaceC5380e);
                this.f13934d = r02;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f13931a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
                AbstractC3063k.d((Ii.N) this.f13932b, null, null, new a(this.f13934d, this.f13933c, null), 3, null);
                return Yg.J.f24997a;
            }

            public final Object n(Ii.N n10, float f10, InterfaceC5380e interfaceC5380e) {
                C0546b c0546b = new C0546b(this.f13934d, interfaceC5380e);
                c0546b.f13932b = n10;
                c0546b.f13933c = f10;
                return c0546b.invokeSuspend(Yg.J.f24997a);
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                return n((Ii.N) obj, ((Number) obj2).floatValue(), (InterfaceC5380e) obj3);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Map map, R0 r02, C3354x0 c3354x0, InterfaceC6839p interfaceC6839p, float f10, w.q qVar, boolean z10, InterfaceC8558m interfaceC8558m, boolean z11) {
            super(3);
            this.f13912a = map;
            this.f13913b = r02;
            this.f13914c = c3354x0;
            this.f13915d = interfaceC6839p;
            this.f13916e = f10;
            this.f13917f = qVar;
            this.f13918g = z10;
            this.f13919h = interfaceC8558m;
            this.f13920i = z11;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(43594985);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(43594985, i10, -1, "androidx.compose.material.swipeable.<anonymous> (Swipeable.kt:596)");
            }
            if (this.f13912a.isEmpty()) {
                throw new IllegalArgumentException("You must have at least one anchor.");
            }
            if (AbstractC3689v.g0(this.f13912a.values()).size() != this.f13912a.size()) {
                throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.");
            }
            Y0.d dVar = (Y0.d) interfaceC3540l.t(AbstractC3932k0.g());
            this.f13913b.k(this.f13912a);
            Map map = this.f13912a;
            R0 r02 = this.f13913b;
            boolean zT = interfaceC3540l.T(this.f13913b) | interfaceC3540l.l(this.f13912a) | interfaceC3540l.T(this.f13914c) | interfaceC3540l.T(this.f13915d) | interfaceC3540l.T(dVar) | interfaceC3540l.g(this.f13916e);
            R0 r03 = this.f13913b;
            Map map2 = this.f13912a;
            C3354x0 c3354x0 = this.f13914c;
            InterfaceC6839p interfaceC6839p = this.f13915d;
            float f10 = this.f13916e;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                Object aVar = new a(r03, map2, c3354x0, dVar, interfaceC6839p, f10, null);
                interfaceC3540l.K(aVar);
                objF = aVar;
            }
            T.O.e(map, r02, (InterfaceC6839p) objF, interfaceC3540l, 0);
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            boolean zX = this.f13913b.x();
            w.m mVarP = this.f13913b.p();
            w.q qVar = this.f13917f;
            boolean z10 = this.f13918g;
            InterfaceC8558m interfaceC8558m = this.f13919h;
            boolean zT2 = interfaceC3540l.T(this.f13913b);
            R0 r04 = this.f13913b;
            Object objF2 = interfaceC3540l.f();
            if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new C0546b(r04, null);
                interfaceC3540l.K(objF2);
            }
            androidx.compose.ui.e eVarG = w.l.g(aVar2, mVarP, qVar, (32 & 4) != 0 ? true : z10, (32 & 8) != 0 ? null : interfaceC8558m, (32 & 16) != 0 ? false : zX, (32 & 32) != 0 ? w.l.f63982a : null, (32 & 64) != 0 ? w.l.f63983b : (mh.q) objF2, (32 & 128) != 0 ? false : this.f13920i);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return eVarG;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ R0 f13938a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f13939b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w.q f13940c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f13941d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f13942e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f13943f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f13944g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C3354x0 f13945h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f13946i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(R0 r02, Map map, w.q qVar, boolean z10, boolean z11, InterfaceC8558m interfaceC8558m, InterfaceC6839p interfaceC6839p, C3354x0 c3354x0, float f10) {
            super(1);
            this.f13938a = r02;
            this.f13939b = map;
            this.f13940c = qVar;
            this.f13941d = z10;
            this.f13942e = z11;
            this.f13943f = interfaceC8558m;
            this.f13944g = interfaceC6839p;
            this.f13945h = c3354x0;
            this.f13946i = f10;
        }

        public final void a(androidx.compose.ui.platform.B0 b02) {
            throw null;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC5487d.a(obj);
            a(null);
            return Yg.J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r3 < ((java.lang.Number) r6.invoke(java.lang.Float.valueOf(r0), java.lang.Float.valueOf(r5))).floatValue()) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r3 > ((java.lang.Number) r6.invoke(java.lang.Float.valueOf(r5), java.lang.Float.valueOf(r0))).floatValue()) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float c(float r3, float r4, java.util.Set r5, mh.InterfaceC6839p r6, float r7, float r8) {
        /*
            java.util.List r5 = d(r3, r5)
            int r0 = r5.size()
            if (r0 == 0) goto L6c
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L62
            java.lang.Object r0 = r5.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Object r5 = r5.get(r2)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 > 0) goto L42
            int r4 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r4 < 0) goto L2b
            return r5
        L2b:
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            java.lang.Float r7 = java.lang.Float.valueOf(r5)
            java.lang.Object r4 = r6.invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L5e
            goto L60
        L42:
            float r4 = -r8
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L48
            return r0
        L48:
            java.lang.Float r4 = java.lang.Float.valueOf(r5)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            java.lang.Object r4 = r6.invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L60
        L5e:
            r4 = r5
            goto L6c
        L60:
            r4 = r0
            goto L6c
        L62:
            java.lang.Object r3 = r5.get(r1)
            java.lang.Number r3 = (java.lang.Number) r3
            float r4 = r3.floatValue()
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: N.Q0.c(float, float, java.util.Set, mh.p, float, float):float");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9 */
    private static final List d(float f10, Set set) {
        Object obj;
        Set set2 = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set2) {
            if (((Number) obj2).floatValue() <= f10 + 0.001d) {
                arrayList.add(obj2);
            }
        }
        Float f11 = null;
        int i10 = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            float fFloatValue = ((Number) obj).floatValue();
            int iN = AbstractC3689v.n(arrayList);
            if (1 <= iN) {
                int i11 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i11);
                    float fFloatValue2 = ((Number) obj3).floatValue();
                    if (Float.compare(fFloatValue, fFloatValue2) < 0) {
                        obj = obj3;
                        fFloatValue = fFloatValue2;
                    }
                    if (i11 == iN) {
                        break;
                    }
                    i11++;
                }
            }
        }
        Float f12 = (Float) obj;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : set2) {
            if (((Number) obj4).floatValue() >= f10 - 0.001d) {
                arrayList2.add(obj4);
            }
        }
        if (!arrayList2.isEmpty()) {
            ?? r13 = arrayList2.get(0);
            float fFloatValue3 = ((Number) r13).floatValue();
            int iN2 = AbstractC3689v.n(arrayList2);
            boolean z10 = r13;
            if (1 <= iN2) {
                while (true) {
                    Object obj5 = arrayList2.get(i10);
                    float fFloatValue4 = ((Number) obj5).floatValue();
                    r13 = z10;
                    if (Float.compare(fFloatValue3, fFloatValue4) > 0) {
                        r13 = obj5;
                        fFloatValue3 = fFloatValue4;
                    }
                    if (i10 == iN2) {
                        break;
                    }
                    i10++;
                    z10 = r13;
                }
            }
            f11 = r13;
        }
        Float f13 = f11;
        if (f12 == null) {
            return AbstractC3689v.p(f13);
        }
        if (f13 != null && !AbstractC6492s.c(f12, f13)) {
            return AbstractC3689v.o(f12, f13);
        }
        return AbstractC3689v.e(f12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float e(Map map, Object obj) {
        Object next;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC6492s.d(((Map.Entry) next).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    public static final androidx.compose.ui.e f(androidx.compose.ui.e eVar, R0 r02, Map map, w.q qVar, boolean z10, boolean z11, InterfaceC8558m interfaceC8558m, InterfaceC6839p interfaceC6839p, C3354x0 c3354x0, float f10) {
        return androidx.compose.ui.c.b(eVar, AbstractC3964z0.b() ? new c(r02, map, qVar, z10, z11, interfaceC8558m, interfaceC6839p, c3354x0, f10) : AbstractC3964z0.a(), new b(map, r02, c3354x0, interfaceC6839p, f10, qVar, z10, interfaceC8558m, z11));
    }
}
