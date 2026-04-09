package s;

import T.InterfaceC3551q0;
import T.o1;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.AbstractC3964z0;
import androidx.compose.ui.platform.B0;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f.AbstractC5487d;
import kotlin.jvm.internal.AbstractC6494u;
import l0.AbstractC6532h;
import l0.AbstractC6538n;
import l0.C6531g;
import l0.C6537m;
import m0.AbstractC6737x0;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import oh.AbstractC7137b;
import org.snmp4j.mp.PduHandle;
import y0.AbstractC8576P;
import y0.C8603x;
import y0.InterfaceC8567G;
import y0.InterfaceC8581b;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7840a implements S {

    /* renamed from: a, reason: collision with root package name */
    private C6531g f60704a;

    /* renamed from: b, reason: collision with root package name */
    private final C7861w f60705b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3551q0 f60706c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f60707d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f60708e;

    /* renamed from: f, reason: collision with root package name */
    private long f60709f;

    /* renamed from: g, reason: collision with root package name */
    private C8603x f60710g;

    /* renamed from: h, reason: collision with root package name */
    private final androidx.compose.ui.e f60711h;

    /* renamed from: s.a$a, reason: collision with other inner class name */
    static final class C2125a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f60712a;

        /* renamed from: b, reason: collision with root package name */
        long f60713b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f60714c;

        /* renamed from: e, reason: collision with root package name */
        int f60716e;

        C2125a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f60714c = obj;
            this.f60716e |= PduHandle.NONE;
            return C7840a.this.a(0L, null, this);
        }
    }

    /* renamed from: s.a$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f60717a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f60718b;

        /* renamed from: s.a$b$a, reason: collision with other inner class name */
        static final class C2126a extends kotlin.coroutines.jvm.internal.k implements InterfaceC6839p {

            /* renamed from: b, reason: collision with root package name */
            int f60720b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f60721c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C7840a f60722d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2126a(C7840a c7840a, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f60722d = c7840a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                C2126a c2126a = new C2126a(this.f60722d, interfaceC5380e);
                c2126a.f60721c = obj;
                return c2126a;
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0066 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00b2 A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0064 -> B:17:0x0067). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = eh.AbstractC5467b.g()
                    int r1 = r12.f60720b
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L27
                    if (r1 == r4) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r12.f60721c
                    y0.b r1 = (y0.InterfaceC8581b) r1
                    Yg.v.b(r13)
                    goto L67
                L17:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L1f:
                    java.lang.Object r1 = r12.f60721c
                    y0.b r1 = (y0.InterfaceC8581b) r1
                    Yg.v.b(r13)
                    goto L40
                L27:
                    Yg.v.b(r13)
                    java.lang.Object r13 = r12.f60721c
                    r1 = r13
                    y0.b r1 = (y0.InterfaceC8581b) r1
                    r12.f60721c = r1
                    r12.f60720b = r4
                    r6 = 0
                    r7 = 0
                    r9 = 2
                    r10 = 0
                    r5 = r1
                    r8 = r12
                    java.lang.Object r13 = w.AbstractC8235B.f(r5, r6, r7, r8, r9, r10)
                    if (r13 != r0) goto L40
                    return r0
                L40:
                    y0.y r13 = (y0.C8604y) r13
                    s.a r5 = r12.f60722d
                    long r6 = r13.f()
                    y0.x r6 = y0.C8603x.a(r6)
                    s.C7840a.f(r5, r6)
                    s.a r5 = r12.f60722d
                    long r6 = r13.h()
                    l0.g r13 = l0.C6531g.d(r6)
                    s.C7840a.g(r5, r13)
                L5c:
                    r12.f60721c = r1
                    r12.f60720b = r2
                    java.lang.Object r13 = y0.InterfaceC8581b.s1(r1, r3, r12, r4, r3)
                    if (r13 != r0) goto L67
                    return r0
                L67:
                    y0.n r13 = (y0.C8593n) r13
                    java.util.List r13 = r13.c()
                    java.util.ArrayList r5 = new java.util.ArrayList
                    int r6 = r13.size()
                    r5.<init>(r6)
                    int r6 = r13.size()
                    r7 = 0
                    r8 = r7
                L7c:
                    if (r8 >= r6) goto L91
                    java.lang.Object r9 = r13.get(r8)
                    r10 = r9
                    y0.y r10 = (y0.C8604y) r10
                    boolean r10 = r10.i()
                    if (r10 == 0) goto L8e
                    r5.add(r9)
                L8e:
                    int r8 = r8 + 1
                    goto L7c
                L91:
                    s.a r13 = r12.f60722d
                    int r6 = r5.size()
                L97:
                    if (r7 >= r6) goto Lb2
                    java.lang.Object r8 = r5.get(r7)
                    r9 = r8
                    y0.y r9 = (y0.C8604y) r9
                    long r9 = r9.f()
                    y0.x r11 = s.C7840a.e(r13)
                    boolean r9 = y0.C8603x.c(r9, r11)
                    if (r9 == 0) goto Laf
                    goto Lb3
                Laf:
                    int r7 = r7 + 1
                    goto L97
                Lb2:
                    r8 = r3
                Lb3:
                    y0.y r8 = (y0.C8604y) r8
                    if (r8 != 0) goto Lbe
                    java.lang.Object r13 = Zg.AbstractC3689v.s0(r5)
                    r8 = r13
                    y0.y r8 = (y0.C8604y) r8
                Lbe:
                    if (r8 == 0) goto Lda
                    s.a r13 = r12.f60722d
                    long r6 = r8.f()
                    y0.x r6 = y0.C8603x.a(r6)
                    s.C7840a.f(r13, r6)
                    s.a r13 = r12.f60722d
                    long r6 = r8.h()
                    l0.g r6 = l0.C6531g.d(r6)
                    s.C7840a.g(r13, r6)
                Lda:
                    boolean r13 = r5.isEmpty()
                    if (r13 == 0) goto L5c
                    s.a r13 = r12.f60722d
                    s.C7840a.f(r13, r3)
                    Yg.J r13 = Yg.J.f24997a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: s.C7840a.b.C2126a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC8581b interfaceC8581b, InterfaceC5380e interfaceC5380e) {
                return ((C2126a) create(interfaceC8581b, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        b(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = C7840a.this.new b(interfaceC5380e);
            bVar.f60718b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f60717a;
            if (i10 == 0) {
                Yg.v.b(obj);
                InterfaceC8567G interfaceC8567G = (InterfaceC8567G) this.f60718b;
                C2126a c2126a = new C2126a(C7840a.this, null);
                this.f60717a = 1;
                if (w.o.d(interfaceC8567G, c2126a, this) == objG) {
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
        public final Object invoke(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
            return ((b) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: s.a$c */
    public static final class c extends AbstractC6494u implements InterfaceC6835l {
        public c() {
            super(1);
        }

        public final void a(B0 b02) {
            throw null;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC5487d.a(obj);
            a(null);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: s.a$d */
    public static final class d extends AbstractC6494u implements InterfaceC6835l {
        public d() {
            super(1);
        }

        public final void a(B0 b02) {
            throw null;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC5487d.a(obj);
            a(null);
            return Yg.J.f24997a;
        }
    }

    public C7840a(Context context, P p10) {
        androidx.compose.ui.e c7854o;
        C7861w c7861w = new C7861w(context, AbstractC6737x0.j(p10.b()));
        this.f60705b = c7861w;
        Yg.J j10 = Yg.J.f24997a;
        this.f60706c = o1.h(j10, o1.j());
        this.f60707d = true;
        this.f60709f = C6537m.f52356b.b();
        androidx.compose.ui.e eVarD = AbstractC8576P.d(androidx.compose.ui.e.f28771b0, j10, new b(null));
        if (Build.VERSION.SDK_INT >= 31) {
            c7854o = new C7859u(this, c7861w, AbstractC3964z0.b() ? new c() : AbstractC3964z0.a());
        } else {
            c7854o = new C7854o(this, c7861w, p10, AbstractC3964z0.b() ? new d() : AbstractC3964z0.a());
        }
        this.f60711h = eVarD.b0(c7854o);
    }

    private final void h() {
        boolean zIsFinished;
        C7861w c7861w = this.f60705b;
        EdgeEffect edgeEffect = c7861w.f60785d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = edgeEffect.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = c7861w.f60786e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished = edgeEffect2.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect3 = c7861w.f60787f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished = edgeEffect3.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect4 = c7861w.f60788g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished = edgeEffect4.isFinished() || zIsFinished;
        }
        if (zIsFinished) {
            k();
        }
    }

    private final float l(long j10) {
        float fM = C6531g.m(i());
        float fN = C6531g.n(j10) / C6537m.g(this.f60709f);
        EdgeEffect edgeEffectF = this.f60705b.f();
        C7860v c7860v = C7860v.f60781a;
        return c7860v.b(edgeEffectF) == 0.0f ? (-c7860v.d(edgeEffectF, -fN, 1 - fM)) * C6537m.g(this.f60709f) : C6531g.n(j10);
    }

    private final float m(long j10) {
        float fN = C6531g.n(i());
        float fM = C6531g.m(j10) / C6537m.i(this.f60709f);
        EdgeEffect edgeEffectH = this.f60705b.h();
        C7860v c7860v = C7860v.f60781a;
        return c7860v.b(edgeEffectH) == 0.0f ? c7860v.d(edgeEffectH, fM, 1 - fN) * C6537m.i(this.f60709f) : C6531g.m(j10);
    }

    private final float n(long j10) {
        float fN = C6531g.n(i());
        float fM = C6531g.m(j10) / C6537m.i(this.f60709f);
        EdgeEffect edgeEffectJ = this.f60705b.j();
        C7860v c7860v = C7860v.f60781a;
        return c7860v.b(edgeEffectJ) == 0.0f ? (-c7860v.d(edgeEffectJ, -fM, fN)) * C6537m.i(this.f60709f) : C6531g.m(j10);
    }

    private final float o(long j10) {
        float fM = C6531g.m(i());
        float fN = C6531g.n(j10) / C6537m.g(this.f60709f);
        EdgeEffect edgeEffectL = this.f60705b.l();
        C7860v c7860v = C7860v.f60781a;
        return c7860v.b(edgeEffectL) == 0.0f ? c7860v.d(edgeEffectL, fN, fM) * C6537m.g(this.f60709f) : C6531g.n(j10);
    }

    private final boolean p(long j10) {
        boolean z10;
        boolean z11 = true;
        if (!this.f60705b.r() || C6531g.m(j10) >= 0.0f) {
            z10 = false;
        } else {
            C7860v.f60781a.e(this.f60705b.h(), C6531g.m(j10));
            z10 = !this.f60705b.r();
        }
        if (this.f60705b.u() && C6531g.m(j10) > 0.0f) {
            C7860v.f60781a.e(this.f60705b.j(), C6531g.m(j10));
            z10 = z10 || !this.f60705b.u();
        }
        if (this.f60705b.y() && C6531g.n(j10) < 0.0f) {
            C7860v.f60781a.e(this.f60705b.l(), C6531g.n(j10));
            z10 = z10 || !this.f60705b.y();
        }
        if (!this.f60705b.o() || C6531g.n(j10) <= 0.0f) {
            return z10;
        }
        C7860v.f60781a.e(this.f60705b.f(), C6531g.n(j10));
        if (!z10 && this.f60705b.o()) {
            z11 = false;
        }
        return z11;
    }

    private final boolean q() {
        boolean z10;
        if (this.f60705b.t()) {
            m(C6531g.f52335b.c());
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f60705b.w()) {
            n(C6531g.f52335b.c());
            z10 = true;
        }
        if (this.f60705b.A()) {
            o(C6531g.f52335b.c());
            z10 = true;
        }
        if (!this.f60705b.q()) {
            return z10;
        }
        l(C6531g.f52335b.c());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // s.S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(long r11, mh.InterfaceC6839p r13, dh.InterfaceC5380e r14) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C7840a.a(long, mh.p, dh.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011b A[ADDED_TO_REGION] */
    @Override // s.S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long b(long r11, int r13, mh.InterfaceC6835l r14) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C7840a.b(long, int, mh.l):long");
    }

    @Override // s.S
    public androidx.compose.ui.e c() {
        return this.f60711h;
    }

    @Override // s.S
    public boolean d() {
        C7861w c7861w = this.f60705b;
        EdgeEffect edgeEffect = c7861w.f60785d;
        if (edgeEffect != null && C7860v.f60781a.b(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = c7861w.f60786e;
        if (edgeEffect2 != null && C7860v.f60781a.b(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = c7861w.f60787f;
        if (edgeEffect3 != null && C7860v.f60781a.b(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = c7861w.f60788g;
        return (edgeEffect4 == null || C7860v.f60781a.b(edgeEffect4) == 0.0f) ? false : true;
    }

    public final long i() {
        C6531g c6531g = this.f60704a;
        long jV = c6531g != null ? c6531g.v() : AbstractC6538n.b(this.f60709f);
        return AbstractC6532h.a(C6531g.m(jV) / C6537m.i(this.f60709f), C6531g.n(jV) / C6537m.g(this.f60709f));
    }

    public final InterfaceC3551q0 j() {
        return this.f60706c;
    }

    public final void k() {
        if (this.f60707d) {
            this.f60706c.setValue(Yg.J.f24997a);
        }
    }

    public final void r(long j10) {
        boolean zF = C6537m.f(this.f60709f, C6537m.f52356b.b());
        boolean zF2 = C6537m.f(j10, this.f60709f);
        this.f60709f = j10;
        if (!zF2) {
            this.f60705b.B(Y0.s.a(AbstractC7137b.e(C6537m.i(j10)), AbstractC7137b.e(C6537m.g(j10))));
        }
        if (zF || zF2) {
            return;
        }
        k();
        h();
    }
}
