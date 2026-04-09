package q5;

import Ii.AbstractC3061j;
import Ii.N;
import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import R1.d;
import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    private static final b f58438c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final d.a f58439d = R1.f.a("firebase_sessions_enabled");

    /* renamed from: e, reason: collision with root package name */
    private static final d.a f58440e = R1.f.b("firebase_sessions_sampling_rate");

    /* renamed from: f, reason: collision with root package name */
    private static final d.a f58441f = R1.f.d("firebase_sessions_restart_timeout");

    /* renamed from: g, reason: collision with root package name */
    private static final d.a f58442g = R1.f.d("firebase_sessions_cache_duration");

    /* renamed from: h, reason: collision with root package name */
    private static final d.a f58443h = R1.f.e("firebase_sessions_cache_updated_time");

    /* renamed from: a, reason: collision with root package name */
    private final O1.e f58444a;

    /* renamed from: b, reason: collision with root package name */
    private e f58445b;

    static final class a extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f58446a;

        /* renamed from: b, reason: collision with root package name */
        int f58447b;

        a(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return g.this.new a(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            g gVar;
            Object objG = AbstractC5467b.g();
            int i10 = this.f58447b;
            if (i10 == 0) {
                v.b(obj);
                g gVar2 = g.this;
                InterfaceC3220g interfaceC3220gB = gVar2.f58444a.b();
                this.f58446a = gVar2;
                this.f58447b = 1;
                Object objX = AbstractC3222i.x(interfaceC3220gB, this);
                if (objX == objG) {
                    return objG;
                }
                gVar = gVar2;
                obj = objX;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar = (g) this.f58446a;
                v.b(obj);
            }
            gVar.l(((R1.d) obj).d());
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f58449a;

        /* renamed from: c, reason: collision with root package name */
        int f58451c;

        c(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58449a = obj;
            this.f58451c |= PduHandle.NONE;
            return g.this.h(null, null, this);
        }
    }

    static final class d extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f58452a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f58453b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f58454c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d.a f58455d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g f58456e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj, d.a aVar, g gVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f58454c = obj;
            this.f58455d = aVar;
            this.f58456e = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            d dVar = new d(this.f58454c, this.f58455d, this.f58456e, interfaceC5380e);
            dVar.f58453b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f58452a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            R1.a aVar = (R1.a) this.f58453b;
            Object obj2 = this.f58454c;
            if (obj2 != null) {
                aVar.i(this.f58455d, obj2);
            } else {
                aVar.h(this.f58455d);
            }
            this.f58456e.l(aVar);
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(R1.a aVar, InterfaceC5380e interfaceC5380e) {
            return ((d) create(aVar, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public g(O1.e dataStore) {
        AbstractC6492s.i(dataStore, "dataStore");
        this.f58444a = dataStore;
        AbstractC3061j.b(null, new a(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(R1.d.a r6, java.lang.Object r7, dh.InterfaceC5380e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof q5.g.c
            if (r0 == 0) goto L13
            r0 = r8
            q5.g$c r0 = (q5.g.c) r0
            int r1 = r0.f58451c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58451c = r1
            goto L18
        L13:
            q5.g$c r0 = new q5.g$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f58449a
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f58451c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2b
            Yg.v.b(r8)     // Catch: java.io.IOException -> L29
            goto L60
        L29:
            r6 = move-exception
            goto L48
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            Yg.v.b(r8)
            O1.e r8 = r5.f58444a     // Catch: java.io.IOException -> L29
            q5.g$d r2 = new q5.g$d     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L29
            r0.f58451c = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = R1.g.a(r8, r2, r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L60
            return r1
        L48:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed to update cache config value: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L60:
            Yg.J r6 = Yg.J.f24997a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.g.h(R1.d$a, java.lang.Object, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(R1.d dVar) {
        this.f58445b = new e((Boolean) dVar.b(f58439d), (Double) dVar.b(f58440e), (Integer) dVar.b(f58441f), (Integer) dVar.b(f58442g), (Long) dVar.b(f58443h));
    }

    public final boolean d() {
        e eVar = this.f58445b;
        e eVar2 = null;
        if (eVar == null) {
            AbstractC6492s.v("sessionConfigs");
            eVar = null;
        }
        Long lB = eVar.b();
        e eVar3 = this.f58445b;
        if (eVar3 == null) {
            AbstractC6492s.v("sessionConfigs");
        } else {
            eVar2 = eVar3;
        }
        Integer numA = eVar2.a();
        return lB == null || numA == null || (System.currentTimeMillis() - lB.longValue()) / ((long) 1000) >= ((long) numA.intValue());
    }

    public final Integer e() {
        e eVar = this.f58445b;
        if (eVar == null) {
            AbstractC6492s.v("sessionConfigs");
            eVar = null;
        }
        return eVar.d();
    }

    public final Double f() {
        e eVar = this.f58445b;
        if (eVar == null) {
            AbstractC6492s.v("sessionConfigs");
            eVar = null;
        }
        return eVar.e();
    }

    public final Boolean g() {
        e eVar = this.f58445b;
        if (eVar == null) {
            AbstractC6492s.v("sessionConfigs");
            eVar = null;
        }
        return eVar.c();
    }

    public final Object i(Double d10, InterfaceC5380e interfaceC5380e) {
        Object objH = h(f58440e, d10, interfaceC5380e);
        return objH == AbstractC5467b.g() ? objH : J.f24997a;
    }

    public final Object j(Integer num, InterfaceC5380e interfaceC5380e) {
        Object objH = h(f58442g, num, interfaceC5380e);
        return objH == AbstractC5467b.g() ? objH : J.f24997a;
    }

    public final Object k(Long l10, InterfaceC5380e interfaceC5380e) {
        Object objH = h(f58443h, l10, interfaceC5380e);
        return objH == AbstractC5467b.g() ? objH : J.f24997a;
    }

    public final Object m(Integer num, InterfaceC5380e interfaceC5380e) {
        Object objH = h(f58441f, num, interfaceC5380e);
        return objH == AbstractC5467b.g() ? objH : J.f24997a;
    }

    public final Object n(Boolean bool, InterfaceC5380e interfaceC5380e) {
        Object objH = h(f58439d, bool, interfaceC5380e);
        return objH == AbstractC5467b.g() ? objH : J.f24997a;
    }
}
