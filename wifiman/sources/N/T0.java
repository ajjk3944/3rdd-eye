package N;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import com.google.ar.core.ImageMetadata;
import kotlin.jvm.internal.AbstractC6494u;
import m0.C6733v0;
import m0.i1;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import y.InterfaceC8556k;

/* loaded from: classes.dex */
public final class T0 {

    /* renamed from: a, reason: collision with root package name */
    public static final T0 f14003a = new T0();

    /* renamed from: b, reason: collision with root package name */
    private static final float f14004b = Y0.h.j(56);

    /* renamed from: c, reason: collision with root package name */
    private static final float f14005c = Y0.h.j(280);

    /* renamed from: d, reason: collision with root package name */
    private static final float f14006d = Y0.h.j(1);

    /* renamed from: e, reason: collision with root package name */
    private static final float f14007e = Y0.h.j(2);

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f14009b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f14010c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC8556k f14011d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ S0 f14012e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ i1 f14013f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f14014g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f14015h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f14016i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f14017j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, boolean z11, InterfaceC8556k interfaceC8556k, S0 s02, i1 i1Var, float f10, float f11, int i10, int i11) {
            super(2);
            this.f14009b = z10;
            this.f14010c = z11;
            this.f14011d = interfaceC8556k;
            this.f14012e = s02;
            this.f14013f = i1Var;
            this.f14014g = f10;
            this.f14015h = f11;
            this.f14016i = i10;
            this.f14017j = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            T0.this.a(this.f14009b, this.f14010c, this.f14011d, this.f14012e, this.f14013f, this.f14014g, this.f14015h, interfaceC3540l, T.L0.a(this.f14016i | 1), this.f14017j);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f14018a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f14019b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC8556k f14020c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ S0 f14021d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ i1 f14022e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, boolean z11, InterfaceC8556k interfaceC8556k, S0 s02, i1 i1Var) {
            super(2);
            this.f14018a = z10;
            this.f14019b = z11;
            this.f14020c = interfaceC8556k;
            this.f14021d = s02;
            this.f14022e = i1Var;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2147252344, i10, -1, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:673)");
            }
            T0.f14003a.a(this.f14018a, this.f14019b, this.f14020c, this.f14021d, this.f14022e, 0.0f, 0.0f, interfaceC3540l, 12582912, 96);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f14024b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14025c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f14026d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f14027e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ R0.c0 f14028f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC8556k f14029g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f14030h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14031i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14032j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14033k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14034l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ i1 f14035m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ S0 f14036n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ z.N f14037o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14038p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f14039q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f14040r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f14041s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, InterfaceC6839p interfaceC6839p, boolean z10, boolean z11, R0.c0 c0Var, InterfaceC8556k interfaceC8556k, boolean z12, InterfaceC6839p interfaceC6839p2, InterfaceC6839p interfaceC6839p3, InterfaceC6839p interfaceC6839p4, InterfaceC6839p interfaceC6839p5, i1 i1Var, S0 s02, z.N n10, InterfaceC6839p interfaceC6839p6, int i10, int i11, int i12) {
            super(2);
            this.f14024b = str;
            this.f14025c = interfaceC6839p;
            this.f14026d = z10;
            this.f14027e = z11;
            this.f14028f = c0Var;
            this.f14029g = interfaceC8556k;
            this.f14030h = z12;
            this.f14031i = interfaceC6839p2;
            this.f14032j = interfaceC6839p3;
            this.f14033k = interfaceC6839p4;
            this.f14034l = interfaceC6839p5;
            this.f14035m = i1Var;
            this.f14036n = s02;
            this.f14037o = n10;
            this.f14038p = interfaceC6839p6;
            this.f14039q = i10;
            this.f14040r = i11;
            this.f14041s = i12;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            T0.this.b(this.f14024b, this.f14025c, this.f14026d, this.f14027e, this.f14028f, this.f14029g, this.f14030h, this.f14031i, this.f14032j, this.f14033k, this.f14034l, this.f14035m, this.f14036n, this.f14037o, this.f14038p, interfaceC3540l, T.L0.a(this.f14039q | 1), T.L0.a(this.f14040r), this.f14041s);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    private T0() {
    }

    public static /* synthetic */ z.N h(T0 t02, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = V0.g();
        }
        if ((i10 & 2) != 0) {
            f11 = V0.g();
        }
        if ((i10 & 4) != 0) {
            f12 = V0.g();
        }
        if ((i10 & 8) != 0) {
            f13 = V0.g();
        }
        return t02.g(f10, f11, f12, f13);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r19, boolean r20, y.InterfaceC8556k r21, N.S0 r22, m0.i1 r23, float r24, float r25, T.InterfaceC3540l r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.T0.a(boolean, boolean, y.k, N.S0, m0.i1, float, float, T.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:238:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r60, mh.InterfaceC6839p r61, boolean r62, boolean r63, R0.c0 r64, y.InterfaceC8556k r65, boolean r66, mh.InterfaceC6839p r67, mh.InterfaceC6839p r68, mh.InterfaceC6839p r69, mh.InterfaceC6839p r70, m0.i1 r71, N.S0 r72, z.N r73, mh.InterfaceC6839p r74, T.InterfaceC3540l r75, int r76, int r77, int r78) {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.T0.b(java.lang.String, mh.p, boolean, boolean, R0.c0, y.k, boolean, mh.p, mh.p, mh.p, mh.p, m0.i1, N.S0, z.N, mh.p, T.l, int, int, int):void");
    }

    public final float c() {
        return f14004b;
    }

    public final float d() {
        return f14005c;
    }

    public final i1 e(InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1899109048, i10, -1, "androidx.compose.material.TextFieldDefaults.<get-OutlinedTextFieldShape> (TextFieldDefaults.kt:242)");
        }
        E.a aVarC = C3319f0.f14419a.b(interfaceC3540l, 6).c();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return aVarC;
    }

    public final S0 f(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, InterfaceC3540l interfaceC3540l, int i10, int i11, int i12, int i13) {
        long j31;
        long jK;
        long j32;
        int i14;
        long jD;
        long j33;
        long jK2;
        long j34;
        long jK3;
        long j35;
        long jK4;
        long j36;
        int i15;
        long jD2;
        long j37;
        long jK5;
        long j38;
        long jK6;
        long j39;
        int i16;
        long jD3;
        long j40;
        long j41;
        long jK7 = (i13 & 1) != 0 ? C6733v0.k(((C6733v0) interfaceC3540l.t(AbstractC3345t.a())).u(), ((Number) interfaceC3540l.t(AbstractC3343s.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long jK8 = (i13 & 2) != 0 ? C6733v0.k(jK7, r.f14715a.b(interfaceC3540l, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jD4 = (i13 & 4) != 0 ? C6733v0.f52951b.d() : j12;
        long j42 = (i13 & 8) != 0 ? C3319f0.f14419a.a(interfaceC3540l, 6).j() : j13;
        long jD5 = (i13 & 16) != 0 ? C3319f0.f14419a.a(interfaceC3540l, 6).d() : j14;
        long jK9 = (i13 & 32) != 0 ? C6733v0.k(C3319f0.f14419a.a(interfaceC3540l, 6).j(), r.f14715a.c(interfaceC3540l, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        if ((i13 & 64) != 0) {
            j31 = jD4;
            jK = C6733v0.k(C3319f0.f14419a.a(interfaceC3540l, 6).i(), r.f14715a.b(interfaceC3540l, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j31 = jD4;
            jK = j16;
        }
        long jK10 = (i13 & 128) != 0 ? C6733v0.k(jK, r.f14715a.b(interfaceC3540l, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        if ((i13 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            j32 = jK10;
            i14 = 6;
            jD = C3319f0.f14419a.a(interfaceC3540l, 6).d();
        } else {
            j32 = jK10;
            i14 = 6;
            jD = j18;
        }
        long jK11 = (i13 & 512) != 0 ? C6733v0.k(C3319f0.f14419a.a(interfaceC3540l, i14).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        if ((i13 & 1024) != 0) {
            j33 = jK;
            jK2 = C6733v0.k(jK11, r.f14715a.b(interfaceC3540l, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j33 = jK;
            jK2 = j20;
        }
        long j43 = (i13 & 2048) != 0 ? jK11 : j21;
        if ((i13 & 4096) != 0) {
            j34 = jK2;
            jK3 = C6733v0.k(C3319f0.f14419a.a(interfaceC3540l, 6).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j34 = jK2;
            jK3 = j22;
        }
        if ((i13 & 8192) != 0) {
            j35 = jK11;
            jK4 = C6733v0.k(jK3, r.f14715a.b(interfaceC3540l, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j35 = jK11;
            jK4 = j23;
        }
        if ((i13 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0) {
            j36 = jK4;
            i15 = 6;
            jD2 = C3319f0.f14419a.a(interfaceC3540l, 6).d();
        } else {
            j36 = jK4;
            i15 = 6;
            jD2 = j24;
        }
        long jK12 = (32768 & i13) != 0 ? C6733v0.k(C3319f0.f14419a.a(interfaceC3540l, i15).j(), r.f14715a.c(interfaceC3540l, i15), 0.0f, 0.0f, 0.0f, 14, null) : j25;
        if ((65536 & i13) != 0) {
            j37 = jK12;
            jK5 = C6733v0.k(C3319f0.f14419a.a(interfaceC3540l, 6).i(), r.f14715a.d(interfaceC3540l, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j37 = jK12;
            jK5 = j26;
        }
        if ((131072 & i13) != 0) {
            j38 = jK3;
            jK6 = C6733v0.k(jK5, r.f14715a.b(interfaceC3540l, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j38 = jK3;
            jK6 = j27;
        }
        if ((262144 & i13) != 0) {
            j39 = jK6;
            i16 = 6;
            jD3 = C3319f0.f14419a.a(interfaceC3540l, 6).d();
        } else {
            j39 = jK6;
            i16 = 6;
            jD3 = j28;
        }
        long jK13 = (524288 & i13) != 0 ? C6733v0.k(C3319f0.f14419a.a(interfaceC3540l, i16).i(), r.f14715a.d(interfaceC3540l, i16), 0.0f, 0.0f, 0.0f, 14, null) : j29;
        long jK14 = (i13 & ImageMetadata.SHADING_MODE) != 0 ? C6733v0.k(jK13, r.f14715a.b(interfaceC3540l, 6), 0.0f, 0.0f, 0.0f, 14, null) : j30;
        if (AbstractC3546o.H()) {
            j40 = jK14;
            j41 = jK13;
            AbstractC3546o.Q(1762667317, i10, i11, "androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:480)");
        } else {
            j40 = jK14;
            j41 = jK13;
        }
        B b10 = new B(jK7, jK8, j42, jD5, jK9, j33, jD, j32, j35, j34, j43, j38, j36, jD2, j31, j37, jK5, j39, jD3, j41, j40, null);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return b10;
    }

    public final z.N g(float f10, float f11, float f12, float f13) {
        return androidx.compose.foundation.layout.o.d(f10, f11, f12, f13);
    }

    public final S0 i(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, InterfaceC3540l interfaceC3540l, int i10, int i11, int i12, int i13) {
        long j31;
        long jK;
        long j32;
        int i14;
        long jD;
        long j33;
        long jK2;
        long j34;
        long jK3;
        long j35;
        long jK4;
        long j36;
        int i15;
        long jD2;
        long j37;
        long jK5;
        long j38;
        long jK6;
        long j39;
        int i16;
        long jD3;
        long j40;
        long j41;
        long jK7 = (i13 & 1) != 0 ? C6733v0.k(((C6733v0) interfaceC3540l.t(AbstractC3345t.a())).u(), ((Number) interfaceC3540l.t(AbstractC3343s.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long jK8 = (i13 & 2) != 0 ? C6733v0.k(jK7, r.f14715a.b(interfaceC3540l, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jK9 = (i13 & 4) != 0 ? C6733v0.k(C3319f0.f14419a.a(interfaceC3540l, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long j42 = (i13 & 8) != 0 ? C3319f0.f14419a.a(interfaceC3540l, 6).j() : j13;
        long jD4 = (i13 & 16) != 0 ? C3319f0.f14419a.a(interfaceC3540l, 6).d() : j14;
        long jK10 = (i13 & 32) != 0 ? C6733v0.k(C3319f0.f14419a.a(interfaceC3540l, 6).j(), r.f14715a.c(interfaceC3540l, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jK11 = (i13 & 64) != 0 ? C6733v0.k(C3319f0.f14419a.a(interfaceC3540l, 6).i(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        if ((i13 & 128) != 0) {
            j31 = jK9;
            jK = C6733v0.k(jK11, r.f14715a.b(interfaceC3540l, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j31 = jK9;
            jK = j17;
        }
        if ((i13 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            j32 = jK;
            i14 = 6;
            jD = C3319f0.f14419a.a(interfaceC3540l, 6).d();
        } else {
            j32 = jK;
            i14 = 6;
            jD = j18;
        }
        long jK12 = (i13 & 512) != 0 ? C6733v0.k(C3319f0.f14419a.a(interfaceC3540l, i14).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        if ((i13 & 1024) != 0) {
            j33 = jK11;
            jK2 = C6733v0.k(jK12, r.f14715a.b(interfaceC3540l, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j33 = jK11;
            jK2 = j20;
        }
        long j43 = (i13 & 2048) != 0 ? jK12 : j21;
        if ((i13 & 4096) != 0) {
            j34 = jK2;
            jK3 = C6733v0.k(C3319f0.f14419a.a(interfaceC3540l, 6).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j34 = jK2;
            jK3 = j22;
        }
        if ((i13 & 8192) != 0) {
            j35 = jK12;
            jK4 = C6733v0.k(jK3, r.f14715a.b(interfaceC3540l, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j35 = jK12;
            jK4 = j23;
        }
        if ((i13 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0) {
            j36 = jK4;
            i15 = 6;
            jD2 = C3319f0.f14419a.a(interfaceC3540l, 6).d();
        } else {
            j36 = jK4;
            i15 = 6;
            jD2 = j24;
        }
        long jK13 = (32768 & i13) != 0 ? C6733v0.k(C3319f0.f14419a.a(interfaceC3540l, i15).j(), r.f14715a.c(interfaceC3540l, i15), 0.0f, 0.0f, 0.0f, 14, null) : j25;
        if ((65536 & i13) != 0) {
            j37 = jK13;
            jK5 = C6733v0.k(C3319f0.f14419a.a(interfaceC3540l, 6).i(), r.f14715a.d(interfaceC3540l, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j37 = jK13;
            jK5 = j26;
        }
        if ((131072 & i13) != 0) {
            j38 = jK3;
            jK6 = C6733v0.k(jK5, r.f14715a.b(interfaceC3540l, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j38 = jK3;
            jK6 = j27;
        }
        if ((262144 & i13) != 0) {
            j39 = jK6;
            i16 = 6;
            jD3 = C3319f0.f14419a.a(interfaceC3540l, 6).d();
        } else {
            j39 = jK6;
            i16 = 6;
            jD3 = j28;
        }
        long jK14 = (524288 & i13) != 0 ? C6733v0.k(C3319f0.f14419a.a(interfaceC3540l, i16).i(), r.f14715a.d(interfaceC3540l, i16), 0.0f, 0.0f, 0.0f, 14, null) : j29;
        long jK15 = (i13 & ImageMetadata.SHADING_MODE) != 0 ? C6733v0.k(jK14, r.f14715a.b(interfaceC3540l, 6), 0.0f, 0.0f, 0.0f, 14, null) : j30;
        if (AbstractC3546o.H()) {
            j40 = jK15;
            j41 = jK14;
            AbstractC3546o.Q(231892599, i10, i11, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:422)");
        } else {
            j40 = jK15;
            j41 = jK14;
        }
        B b10 = new B(jK7, jK8, j42, jD4, jK10, j33, jD, j32, j35, j34, j43, j38, j36, jD2, j31, j37, jK5, j39, jD3, j41, j40, null);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return b10;
    }
}
