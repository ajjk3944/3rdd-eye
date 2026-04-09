package androidx.compose.foundation.gestures;

import Yg.J;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import f0.g;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.K;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;
import r.m0;
import s.S;
import w.C8234A;
import w.InterfaceC8243d;
import w.n;
import w.p;
import w.q;
import w.v;
import w.y;
import y.InterfaceC8558m;
import y0.AbstractC8572L;
import y0.C8604y;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC6835l f27950a = a.f27954a;

    /* renamed from: b, reason: collision with root package name */
    private static final v f27951b = new c();

    /* renamed from: c, reason: collision with root package name */
    private static final g f27952c = new b();

    /* renamed from: d, reason: collision with root package name */
    private static final C1045d f27953d = new C1045d();

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27954a = new a();

        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C8604y c8604y) {
            return Boolean.valueOf(!AbstractC8572L.g(c8604y.n(), AbstractC8572L.f66233a.b()));
        }
    }

    public static final class b implements g {
        b() {
        }

        @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
        public Object fold(Object obj, InterfaceC6839p interfaceC6839p) {
            return g.a.a(this, obj, interfaceC6839p);
        }

        @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
        public InterfaceC5384i.b get(InterfaceC5384i.c cVar) {
            return g.a.b(this, cVar);
        }

        @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
        public InterfaceC5384i minusKey(InterfaceC5384i.c cVar) {
            return g.a.c(this, cVar);
        }

        @Override // dh.InterfaceC5384i
        public InterfaceC5384i plus(InterfaceC5384i interfaceC5384i) {
            return g.a.d(this, interfaceC5384i);
        }

        @Override // f0.g
        public float v() {
            return 1.0f;
        }
    }

    public static final class c implements v {
        c() {
        }

        @Override // w.v
        public float a(float f10) {
            return f10;
        }
    }

    /* renamed from: androidx.compose.foundation.gestures.d$d, reason: collision with other inner class name */
    public static final class C1045d implements Y0.d {
        C1045d() {
        }

        @Override // Y0.d
        public float getDensity() {
            return 1.0f;
        }

        @Override // Y0.l
        public float y() {
            return 1.0f;
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f27955a;

        /* renamed from: b, reason: collision with root package name */
        Object f27956b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f27957c;

        /* renamed from: d, reason: collision with root package name */
        int f27958d;

        e(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27957c = obj;
            this.f27958d |= PduHandle.NONE;
            return d.j(null, 0L, this);
        }
    }

    static final class f extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f27959a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f27960b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C8234A f27961c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f27962d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ K f27963e;

        static final class a extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ K f27964a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C8234A f27965b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ p f27966c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(K k10, C8234A c8234a, p pVar) {
                super(2);
                this.f27964a = k10;
                this.f27965b = c8234a;
                this.f27966c = pVar;
            }

            public final void a(float f10, float f11) {
                float f12 = f10 - this.f27964a.f51686a;
                C8234A c8234a = this.f27965b;
                this.f27964a.f51686a += c8234a.t(c8234a.A(this.f27966c.b(c8234a.B(c8234a.t(f12)), x0.e.f65322a.b())));
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C8234A c8234a, long j10, K k10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f27961c = c8234a;
            this.f27962d = j10;
            this.f27963e = k10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            f fVar = new f(this.f27961c, this.f27962d, this.f27963e, interfaceC5380e);
            fVar.f27960b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f27959a;
            if (i10 == 0) {
                Yg.v.b(obj);
                p pVar = (p) this.f27960b;
                float fA = this.f27961c.A(this.f27962d);
                a aVar = new a(this.f27963e, this.f27961c, pVar);
                this.f27959a = 1;
                if (m0.e(0.0f, fA, 0.0f, null, aVar, this, 12, null) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p pVar, InterfaceC5380e interfaceC5380e) {
            return ((f) create(pVar, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final g e() {
        return f27952c;
    }

    public static final androidx.compose.ui.e f(androidx.compose.ui.e eVar, y yVar, q qVar, S s10, boolean z10, boolean z11, n nVar, InterfaceC8558m interfaceC8558m, InterfaceC8243d interfaceC8243d) {
        return eVar.b0(new ScrollableElement(yVar, qVar, s10, z10, z11, nVar, interfaceC8558m, interfaceC8243d));
    }

    public static final androidx.compose.ui.e g(androidx.compose.ui.e eVar, y yVar, q qVar, boolean z10, boolean z11, n nVar, InterfaceC8558m interfaceC8558m) {
        return h(eVar, yVar, qVar, null, z10, z11, nVar, interfaceC8558m, null, 128, null);
    }

    public static /* synthetic */ androidx.compose.ui.e h(androidx.compose.ui.e eVar, y yVar, q qVar, S s10, boolean z10, boolean z11, n nVar, InterfaceC8558m interfaceC8558m, InterfaceC8243d interfaceC8243d, int i10, Object obj) {
        return f(eVar, yVar, qVar, s10, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? null : nVar, (i10 & 64) != 0 ? null : interfaceC8558m, (i10 & 128) != 0 ? null : interfaceC8243d);
    }

    public static /* synthetic */ androidx.compose.ui.e i(androidx.compose.ui.e eVar, y yVar, q qVar, boolean z10, boolean z11, n nVar, InterfaceC8558m interfaceC8558m, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return g(eVar, yVar, qVar, z12, z11, (i10 & 16) != 0 ? null : nVar, (i10 & 32) != 0 ? null : interfaceC8558m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(w.C8234A r11, long r12, dh.InterfaceC5380e r14) {
        /*
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.d.e
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.d$e r0 = (androidx.compose.foundation.gestures.d.e) r0
            int r1 = r0.f27958d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27958d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.d$e r0 = new androidx.compose.foundation.gestures.d$e
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f27957c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f27958d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r11 = r0.f27956b
            kotlin.jvm.internal.K r11 = (kotlin.jvm.internal.K) r11
            java.lang.Object r12 = r0.f27955a
            w.A r12 = (w.C8234A) r12
            Yg.v.b(r14)
            r14 = r11
            r11 = r12
            goto L5c
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            Yg.v.b(r14)
            kotlin.jvm.internal.K r14 = new kotlin.jvm.internal.K
            r14.<init>()
            s.L r2 = s.EnumC7839L.Default
            androidx.compose.foundation.gestures.d$f r10 = new androidx.compose.foundation.gestures.d$f
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r12
            r8 = r14
            r4.<init>(r5, r6, r8, r9)
            r0.f27955a = r11
            r0.f27956b = r14
            r0.f27958d = r3
            java.lang.Object r12 = r11.v(r2, r10, r0)
            if (r12 != r1) goto L5c
            return r1
        L5c:
            float r12 = r14.f51686a
            long r11 = r11.B(r12)
            l0.g r11 = l0.C6531g.d(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.d.j(w.A, long, dh.e):java.lang.Object");
    }
}
