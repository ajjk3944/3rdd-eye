package Be;

import Be.AbstractC2466f;
import L0.C3174d;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.L0;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import l0.C6531g;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import w.AbstractC8235B;
import y0.InterfaceC8567G;

/* renamed from: Be.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2466f {

    /* renamed from: Be.f$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f1550a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f1551b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f1552c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f1553d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f1554e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, InterfaceC3551q0 interfaceC3551q0, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f1552c = interfaceC6835l;
            this.f1553d = interfaceC6835l2;
            this.f1554e = interfaceC3551q0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J E(InterfaceC3551q0 interfaceC3551q0, InterfaceC6835l interfaceC6835l, C6531g c6531g) {
            L0.M m10 = (L0.M) interfaceC3551q0.getValue();
            if (m10 != null) {
                interfaceC6835l.invoke(Integer.valueOf(m10.x(c6531g.v())));
            }
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J v(InterfaceC3551q0 interfaceC3551q0, InterfaceC6835l interfaceC6835l, C6531g c6531g) {
            L0.M m10 = (L0.M) interfaceC3551q0.getValue();
            if (m10 != null) {
                interfaceC6835l.invoke(Integer.valueOf(m10.x(c6531g.v())));
            }
            return Yg.J.f24997a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f1552c, this.f1553d, this.f1554e, interfaceC5380e);
            aVar.f1551b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC6835l interfaceC6835l;
            InterfaceC6835l interfaceC6835l2;
            Object objG = AbstractC5467b.g();
            int i10 = this.f1550a;
            if (i10 == 0) {
                Yg.v.b(obj);
                InterfaceC8567G interfaceC8567G = (InterfaceC8567G) this.f1551b;
                final InterfaceC6835l interfaceC6835l3 = this.f1552c;
                if (interfaceC6835l3 != null) {
                    final InterfaceC3551q0 interfaceC3551q0 = this.f1554e;
                    interfaceC6835l = new InterfaceC6835l() { // from class: Be.d
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj2) {
                            return AbstractC2466f.a.v(interfaceC3551q0, interfaceC6835l3, (C6531g) obj2);
                        }
                    };
                } else {
                    interfaceC6835l = null;
                }
                final InterfaceC6835l interfaceC6835l4 = this.f1553d;
                if (interfaceC6835l4 != null) {
                    final InterfaceC3551q0 interfaceC3551q02 = this.f1554e;
                    interfaceC6835l2 = new InterfaceC6835l() { // from class: Be.e
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj2) {
                            return AbstractC2466f.a.E(interfaceC3551q02, interfaceC6835l4, (C6531g) obj2);
                        }
                    };
                } else {
                    interfaceC6835l2 = null;
                }
                this.f1550a = 1;
                if (AbstractC8235B.k(interfaceC8567G, null, interfaceC6835l2, null, interfaceC6835l, this, 5, null) == objG) {
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
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
            return ((a) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final L0.C3174d r26, androidx.compose.ui.e r27, L0.U r28, boolean r29, int r30, int r31, mh.InterfaceC6835l r32, mh.InterfaceC6835l r33, final mh.InterfaceC6835l r34, T.InterfaceC3540l r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Be.AbstractC2466f.d(L0.d, androidx.compose.ui.e, L0.U, boolean, int, int, mh.l, mh.l, mh.l, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(L0.M it) {
        AbstractC6492s.i(it, "it");
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J f(InterfaceC3551q0 interfaceC3551q0, InterfaceC6835l interfaceC6835l, L0.M it) {
        AbstractC6492s.i(it, "it");
        interfaceC3551q0.setValue(it);
        interfaceC6835l.invoke(it);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J g(C3174d c3174d, androidx.compose.ui.e eVar, L0.U u10, boolean z10, int i10, int i11, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, InterfaceC6835l interfaceC6835l3, int i12, int i13, InterfaceC3540l interfaceC3540l, int i14) {
        d(c3174d, eVar, u10, z10, i10, i11, interfaceC6835l, interfaceC6835l2, interfaceC6835l3, interfaceC3540l, L0.a(i12 | 1), i13);
        return Yg.J.f24997a;
    }
}
