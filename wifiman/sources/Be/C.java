package Be;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.z1;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import net.sqlcipher.database.SQLiteDatabase;
import r.AbstractC7535j;
import r.T;

/* loaded from: classes4.dex */
public abstract class C {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1382a;

        static {
            int[] iArr = new int[EnumC2490z.values().length];
            try {
                iArr[EnumC2490z.NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2490z.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2490z.RTL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC2490z.LTR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1382a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(androidx.compose.ui.e r21, int r22, float r23, Be.EnumC2490z r24, long r25, T.InterfaceC3540l r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Be.C.c(androidx.compose.ui.e, int, float, Be.z, long, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J d(androidx.compose.ui.e eVar, int i10, float f10, EnumC2490z enumC2490z, long j10, int i11, int i12, InterfaceC3540l interfaceC3540l, int i13) {
        c(eVar, i10, f10, enumC2490z, j10, interfaceC3540l, L0.a(i11 | 1), i12);
        return Yg.J.f24997a;
    }

    private static final z1 e(r.O o10, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        interfaceC3540l.U(1563185693);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1563185693, i11, -1, "com.ui.wifiman.ui.component.animateAlphaWithDelay (ProgressDots.kt:77)");
        }
        interfaceC3540l.U(-170452413);
        Object objF = interfaceC3540l.f();
        if (objF == InterfaceC3540l.f21100a.a()) {
            objF = new InterfaceC6835l() { // from class: Be.A
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return C.f((T.b) obj);
                }
            };
            interfaceC3540l.K(objF);
        }
        interfaceC3540l.J();
        z1 z1VarA = r.P.a(o10, 0.3f, 0.3f, AbstractC7535j.e(AbstractC7535j.f((InterfaceC6835l) objF), null, r.k0.a(i10, r.l0.f59727a.a()), 2, null), "animateAlphaWithDelay", interfaceC3540l, (i11 & 14) | r.O.f59497f | 25008 | (r.N.f59493d << 9), 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return z1VarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J f(T.b keyframes) {
        AbstractC6492s.i(keyframes, "$this$keyframes");
        keyframes.d(1500);
        keyframes.e(keyframes.f(Float.valueOf(1.0f), SQLiteDatabase.MAX_SQL_CACHE_SIZE), r.G.d());
        keyframes.e(keyframes.f(Float.valueOf(0.3f), 500), r.G.d());
        return Yg.J.f24997a;
    }
}
