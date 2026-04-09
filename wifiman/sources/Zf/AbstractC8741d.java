package zf;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import Yg.J;
import Zg.AbstractC3689v;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import m8.AbstractC6780c;
import mh.InterfaceC6835l;
import mh.q;
import s9.d;
import sa.AbstractC7930a;

/* renamed from: zf.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8741d {

    /* renamed from: zf.d$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67260a;

        static {
            int[] iArr = new int[EnumC8738a.values().length];
            try {
                iArr[EnumC8738a.AP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8738a.INTERFERE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f67260a = iArr;
        }
    }

    /* renamed from: zf.d$b */
    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f67261a;

        b(Map map) {
            this.f67261a = map;
        }

        public final String a(EnumC8738a it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(1645793634);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1645793634, i10, -1, "com.ui.wifiman.ui.wifi.channel.component.WifiChannelApFilterPicker.<anonymous> (WifiChannelApFilter.kt:63)");
            }
            Integer num = (Integer) this.f67261a.get(it);
            String strG = AbstractC8741d.g(it, num != null ? num.intValue() : 0, interfaceC3540l, i10 & 14);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return strG;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((EnumC8738a) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(androidx.compose.ui.e r9, final zf.C8743f r10, final mh.InterfaceC6835l r11, T.InterfaceC3540l r12, final int r13, final int r14) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zf.AbstractC8741d.c(androidx.compose.ui.e, zf.f, mh.l, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(InterfaceC6835l interfaceC6835l, EnumC8738a it) {
        AbstractC6492s.i(it, "it");
        interfaceC6835l.invoke(it);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(androidx.compose.ui.e eVar, C8743f c8743f, InterfaceC6835l interfaceC6835l, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(eVar, c8743f, interfaceC6835l, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(EnumC8738a enumC8738a, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        d.b bVar;
        interfaceC3540l.U(689946550);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(689946550, i11, -1, "com.ui.wifiman.ui.wifi.channel.component.string (WifiChannelApFilter.kt:19)");
        }
        int i12 = a.f67260a[enumC8738a.ordinal()];
        if (i12 == 1) {
            bVar = new d.b(AbstractC6780c.f53344K4, AbstractC3689v.e(Integer.valueOf(i10)));
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new d.b(AbstractC6780c.f53337J4, AbstractC3689v.e(Integer.valueOf(i10)));
        }
        String strB = AbstractC7930a.b(bVar, interfaceC3540l, 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return strB;
    }
}
