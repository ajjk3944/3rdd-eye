package Y2;

import C.C;
import T.InterfaceC3540l;
import T.L0;
import Y0.n;
import Y0.o;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import m0.i1;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: Y2.a$a, reason: collision with other inner class name */
    static final class C0935a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final C0935a f24563a = new C0935a();

        C0935a() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf(i10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f24564a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f24565b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f24566c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f24567d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f24568e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f24569f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f24570g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f24571h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f24572i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ i1 f24573j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f24574k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f24575l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C c10, int i10, androidx.compose.ui.e eVar, InterfaceC6835l interfaceC6835l, long j10, long j11, float f10, float f11, float f12, i1 i1Var, int i11, int i12) {
            super(2);
            this.f24564a = c10;
            this.f24565b = i10;
            this.f24566c = eVar;
            this.f24567d = interfaceC6835l;
            this.f24568e = j10;
            this.f24569f = j11;
            this.f24570g = f10;
            this.f24571h = f11;
            this.f24572i = f12;
            this.f24573j = i1Var;
            this.f24574k = i11;
            this.f24575l = i12;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            a.a(this.f24564a, this.f24565b, this.f24566c, this.f24567d, this.f24568e, this.f24569f, this.f24570g, this.f24571h, this.f24572i, this.f24573j, interfaceC3540l, L0.a(this.f24574k | 1), this.f24575l);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f24576a = new c();

        c() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf(i10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f24577a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y2.b f24578b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f24579c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f24580d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f24581e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC6835l interfaceC6835l, Y2.b bVar, int i10, int i11, int i12) {
            super(1);
            this.f24577a = interfaceC6835l;
            this.f24578b = bVar;
            this.f24579c = i10;
            this.f24580d = i11;
            this.f24581e = i12;
        }

        public final long a(Y0.d offset) {
            AbstractC6492s.i(offset, "$this$offset");
            return o.a((int) ((this.f24580d + this.f24581e) * AbstractC7978m.j(((((Number) this.f24577a.invoke(Integer.valueOf(this.f24578b.a() + ((int) Math.signum(r0))))).intValue() - r5) * Math.abs(this.f24578b.b())) + ((Number) this.f24577a.invoke(Integer.valueOf(this.f24578b.a()))).intValue(), 0.0f, AbstractC7978m.d(this.f24579c - 1, 0))), 0);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n.b(a((Y0.d) obj));
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y2.b f24582a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f24583b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f24584c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f24585d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f24586e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f24587f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f24588g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f24589h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f24590i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ i1 f24591j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f24592k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f24593l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Y2.b bVar, int i10, androidx.compose.ui.e eVar, InterfaceC6835l interfaceC6835l, long j10, long j11, float f10, float f11, float f12, i1 i1Var, int i11, int i12) {
            super(2);
            this.f24582a = bVar;
            this.f24583b = i10;
            this.f24584c = eVar;
            this.f24585d = interfaceC6835l;
            this.f24586e = j10;
            this.f24587f = j11;
            this.f24588g = f10;
            this.f24589h = f11;
            this.f24590i = f12;
            this.f24591j = i1Var;
            this.f24592k = i11;
            this.f24593l = i12;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            a.b(this.f24582a, this.f24583b, this.f24584c, this.f24585d, this.f24586e, this.f24587f, this.f24588g, this.f24589h, this.f24590i, this.f24591j, interfaceC3540l, L0.a(this.f24592k | 1), this.f24593l);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public static final class f implements Y2.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f24594a;

        f(C c10) {
            this.f24594a = c10;
        }

        @Override // Y2.b
        public int a() {
            return this.f24594a.v();
        }

        @Override // Y2.b
        public float b() {
            return this.f24594a.w();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(C.C r36, int r37, androidx.compose.ui.e r38, mh.InterfaceC6835l r39, long r40, long r42, float r44, float r45, float r46, m0.i1 r47, T.InterfaceC3540l r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.a.a(C.C, int, androidx.compose.ui.e, mh.l, long, long, float, float, float, m0.i1, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x036e A[LOOP:0: B:192:0x036c->B:193:0x036e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(Y2.b r40, int r41, androidx.compose.ui.e r42, mh.InterfaceC6835l r43, long r44, long r46, float r48, float r49, float r50, m0.i1 r51, T.InterfaceC3540l r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 985
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.a.b(Y2.b, int, androidx.compose.ui.e, mh.l, long, long, float, float, float, m0.i1, T.l, int, int):void");
    }
}
