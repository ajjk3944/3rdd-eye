package F;

import L0.C3174d;
import Q0.AbstractC3434k;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.L0;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import m0.InterfaceC6739y0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* renamed from: F.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2717g {

    /* renamed from: F.g$a */
    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5266a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f5267b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L0.U f5268c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f5269d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f5270e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f5271f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f5272g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f5273h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC6739y0 f5274i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f5275j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f5276k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, androidx.compose.ui.e eVar, L0.U u10, InterfaceC6835l interfaceC6835l, int i10, boolean z10, int i11, int i12, InterfaceC6739y0 interfaceC6739y0, int i13, int i14) {
            super(2);
            this.f5266a = str;
            this.f5267b = eVar;
            this.f5268c = u10;
            this.f5269d = interfaceC6835l;
            this.f5270e = i10;
            this.f5271f = z10;
            this.f5272g = i11;
            this.f5273h = i12;
            this.f5274i = interfaceC6739y0;
            this.f5275j = i13;
            this.f5276k = i14;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC2717g.b(this.f5266a, this.f5267b, this.f5268c, this.f5269d, this.f5270e, this.f5271f, this.f5272g, this.f5273h, this.f5274i, interfaceC3540l, L0.a(this.f5275j | 1), this.f5276k);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.g$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f5277a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3551q0 interfaceC3551q0) {
            super(1);
            this.f5277a = interfaceC3551q0;
        }

        public final void a(b.a aVar) {
            AbstractC2717g.d(this.f5277a, aVar.d() ? aVar.c() : aVar.b());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((b.a) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.g$c */
    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3174d f5278a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f5279b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L0.U f5280c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f5281d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f5282e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f5283f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f5284g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f5285h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Map f5286i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC6739y0 f5287j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f5288k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f5289l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C3174d c3174d, androidx.compose.ui.e eVar, L0.U u10, InterfaceC6835l interfaceC6835l, int i10, boolean z10, int i11, int i12, Map map, InterfaceC6739y0 interfaceC6739y0, int i13, int i14) {
            super(2);
            this.f5278a = c3174d;
            this.f5279b = eVar;
            this.f5280c = u10;
            this.f5281d = interfaceC6835l;
            this.f5282e = i10;
            this.f5283f = z10;
            this.f5284g = i11;
            this.f5285h = i12;
            this.f5286i = map;
            this.f5287j = interfaceC6739y0;
            this.f5288k = i13;
            this.f5289l = i14;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC2717g.a(this.f5278a, this.f5279b, this.f5280c, this.f5281d, this.f5282e, this.f5283f, this.f5284g, this.f5285h, this.f5286i, this.f5287j, interfaceC3540l, L0.a(this.f5288k | 1), this.f5289l);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.g$d */
    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f5290a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f5291b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(m0 m0Var, InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f5290a = m0Var;
            this.f5291b = interfaceC6835l;
        }

        public final void a(L0.M m10) {
            m0 m0Var = this.f5290a;
            if (m0Var != null) {
                m0Var.r(m10);
            }
            InterfaceC6835l interfaceC6835l = this.f5291b;
            if (interfaceC6835l != null) {
                interfaceC6835l.invoke(m10);
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((L0.M) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.g$e */
    static final class e extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f5292a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(m0 m0Var) {
            super(0);
            this.f5292a = m0Var;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            m0 m0Var = this.f5292a;
            return Boolean.valueOf(m0Var != null ? ((Boolean) m0Var.l().invoke()).booleanValue() : false);
        }
    }

    /* renamed from: F.g$f */
    static final class f extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f5293a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(m0 m0Var) {
            super(0);
            this.f5293a = m0Var;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            m0 m0Var = this.f5293a;
            return Boolean.valueOf(m0Var != null ? ((Boolean) m0Var.l().invoke()).booleanValue() : false);
        }
    }

    /* renamed from: F.g$g, reason: collision with other inner class name */
    static final class C0223g extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f5294a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0223g(InterfaceC3551q0 interfaceC3551q0) {
            super(0);
            this.f5294a = interfaceC3551q0;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            InterfaceC3551q0 interfaceC3551q0 = this.f5294a;
            if (interfaceC3551q0 != null) {
                return (List) interfaceC3551q0.getValue();
            }
            return null;
        }
    }

    /* renamed from: F.g$h */
    static final class h extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f5295a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3174d f5296b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f5297c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f5298d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Map f5299e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L0.U f5300f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f5301g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f5302h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f5303i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f5304j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ AbstractC3434k.b f5305k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ L.g f5306l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC6739y0 f5307m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f5308n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f5309o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f5310p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f5311q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(androidx.compose.ui.e eVar, C3174d c3174d, InterfaceC6835l interfaceC6835l, boolean z10, Map map, L0.U u10, int i10, boolean z11, int i11, int i12, AbstractC3434k.b bVar, L.g gVar, InterfaceC6739y0 interfaceC6739y0, InterfaceC6835l interfaceC6835l2, int i13, int i14, int i15) {
            super(2);
            this.f5295a = eVar;
            this.f5296b = c3174d;
            this.f5297c = interfaceC6835l;
            this.f5298d = z10;
            this.f5299e = map;
            this.f5300f = u10;
            this.f5301g = i10;
            this.f5302h = z11;
            this.f5303i = i11;
            this.f5304j = i12;
            this.f5305k = bVar;
            this.f5307m = interfaceC6739y0;
            this.f5308n = interfaceC6835l2;
            this.f5309o = i13;
            this.f5310p = i14;
            this.f5311q = i15;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC2717g.e(this.f5295a, this.f5296b, this.f5297c, this.f5298d, this.f5299e, this.f5300f, this.f5301g, this.f5302h, this.f5303i, this.f5304j, this.f5305k, this.f5306l, this.f5307m, this.f5308n, interfaceC3540l, L0.a(this.f5309o | 1), L0.a(this.f5310p), this.f5311q);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.g$i */
    static final class i extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f5312a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(InterfaceC3551q0 interfaceC3551q0) {
            super(1);
            this.f5312a = interfaceC3551q0;
        }

        public final void a(List list) {
            InterfaceC3551q0 interfaceC3551q0 = this.f5312a;
            if (interfaceC3551q0 == null) {
                return;
            }
            interfaceC3551q0.setValue(list);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.g$j */
    static final class j extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f5313a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3174d f5314b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(m0 m0Var, C3174d c3174d) {
            super(0);
            this.f5313a = m0Var;
            this.f5314b = c3174d;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3174d invoke() {
            C3174d c3174dI;
            m0 m0Var = this.f5313a;
            return (m0Var == null || (c3174dI = m0Var.i()) == null) ? this.f5314b : c3174dI;
        }
    }

    /* renamed from: F.g$k */
    static final class k extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3174d f5315a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(C3174d c3174d) {
            super(0);
            this.f5315a = c3174d;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3174d invoke() {
            return this.f5315a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(L0.C3174d r52, androidx.compose.ui.e r53, L0.U r54, mh.InterfaceC6835l r55, int r56, boolean r57, int r58, int r59, java.util.Map r60, m0.InterfaceC6739y0 r61, T.InterfaceC3540l r62, int r63, int r64) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F.AbstractC2717g.a(L0.d, androidx.compose.ui.e, L0.U, mh.l, int, boolean, int, int, java.util.Map, m0.y0, T.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r42, androidx.compose.ui.e r43, L0.U r44, mh.InterfaceC6835l r45, int r46, boolean r47, int r48, int r49, m0.InterfaceC6739y0 r50, T.InterfaceC3540l r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F.AbstractC2717g.b(java.lang.String, androidx.compose.ui.e, L0.U, mh.l, int, boolean, int, int, m0.y0, T.l, int, int):void");
    }

    private static final C3174d c(InterfaceC3551q0 interfaceC3551q0) {
        return (C3174d) interfaceC3551q0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC3551q0 interfaceC3551q0, C3174d c3174d) {
        interfaceC3551q0.setValue(c3174d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:280:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(androidx.compose.ui.e r46, L0.C3174d r47, mh.InterfaceC6835l r48, boolean r49, java.util.Map r50, L0.U r51, int r52, boolean r53, int r54, int r55, Q0.AbstractC3434k.b r56, L.g r57, m0.InterfaceC6739y0 r58, mh.InterfaceC6835l r59, T.InterfaceC3540l r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 1251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F.AbstractC2717g.e(androidx.compose.ui.e, L0.d, mh.l, boolean, java.util.Map, L0.U, int, boolean, int, int, Q0.k$b, L.g, m0.y0, mh.l, T.l, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List i(List list, InterfaceC6824a interfaceC6824a) {
        if (!((Boolean) interfaceC6824a.invoke()).booleanValue()) {
            return null;
        }
        r0 r0Var = new r0();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0.B b10 = (C0.B) list.get(i10);
            Object objB = b10.b();
            AbstractC6492s.g(objB, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            q0 q0VarA = ((s0) objB).a().a(r0Var);
            arrayList.add(new Yg.s(b10.T(Y0.b.f24516b.b(q0VarA.c(), q0VarA.c(), q0VarA.a(), q0VarA.a())), q0VarA.b()));
        }
        return arrayList;
    }

    private static final androidx.compose.ui.e j(androidx.compose.ui.e eVar, C3174d c3174d, L0.U u10, InterfaceC6835l interfaceC6835l, int i10, boolean z10, int i11, int i12, AbstractC3434k.b bVar, List list, InterfaceC6835l interfaceC6835l2, L.g gVar, InterfaceC6739y0 interfaceC6739y0, InterfaceC6835l interfaceC6835l3) {
        return eVar.b0(androidx.compose.ui.e.f28771b0).b0(new TextAnnotatedStringElement(c3174d, u10, bVar, interfaceC6835l, i10, z10, i11, i12, list, interfaceC6835l2, null, interfaceC6739y0, interfaceC6835l3, null));
    }
}
