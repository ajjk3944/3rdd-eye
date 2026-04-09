package w9;

import L0.U;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import Yg.J;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import s.InterfaceC7836I;
import z.C8680c;

/* loaded from: classes3.dex */
public abstract class k {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f64740a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s9.b f64741b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f64742c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f64743d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f64744e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C8284a f64745f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C8285b f64746g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ U f64747h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC7836I f64748i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C8680c.e f64749j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f64750k;

        a(androidx.compose.ui.e eVar, s9.b bVar, String str, boolean z10, boolean z11, C8284a c8284a, C8285b c8285b, U u10, InterfaceC7836I interfaceC7836I, C8680c.e eVar2, InterfaceC6824a interfaceC6824a) {
            this.f64740a = eVar;
            this.f64741b = bVar;
            this.f64742c = str;
            this.f64743d = z10;
            this.f64744e = z11;
            this.f64745f = c8284a;
            this.f64746g = c8285b;
            this.f64747h = u10;
            this.f64748i = interfaceC7836I;
            this.f64749j = eVar2;
            this.f64750k = interfaceC6824a;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(973051195, i10, -1, "com.ui.core.ui.component.button.UiButtonLink.<anonymous> (UiButtonLink.kt:97)");
            }
            g.b(this.f64740a, this.f64741b, this.f64742c, this.f64743d, this.f64744e, this.f64745f, this.f64746g, this.f64747h, null, null, this.f64748i, this.f64749j, null, this.f64750k, interfaceC3540l, 805306368, 0, 4352);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64751a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.ALERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f64751a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(androidx.compose.ui.e r58, mh.InterfaceC6824a r59, boolean r60, boolean r61, s9.b r62, w9.h r63, final java.lang.String r64, z.C8680c.e r65, T.InterfaceC3540l r66, final int r67, final int r68) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.k.c(androidx.compose.ui.e, mh.a, boolean, boolean, s9.b, w9.h, java.lang.String, z.c$e, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d() {
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(androidx.compose.ui.e eVar, InterfaceC6824a interfaceC6824a, boolean z10, boolean z11, s9.b bVar, h hVar, String str, C8680c.e eVar2, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(eVar, interfaceC6824a, z10, z11, bVar, hVar, str, eVar2, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
