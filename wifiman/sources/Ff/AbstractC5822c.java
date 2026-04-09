package ff;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;

/* renamed from: ff.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5822c {

    /* renamed from: ff.c$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47340a;

        static {
            int[] iArr = new int[EnumC5820a.values().length];
            try {
                iArr[EnumC5820a.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5820a.UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f47340a = iArr;
        }
    }

    public static final long a(EnumC5820a enumC5820a, InterfaceC3540l interfaceC3540l, int i10) {
        long jF;
        AbstractC6492s.i(enumC5820a, "<this>");
        interfaceC3540l.U(397525889);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(397525889, i10, -1, "com.ui.wifiman.ui.speedtest.color (Speedtest.kt:23)");
        }
        int i11 = a.f47340a[enumC5820a.ordinal()];
        if (i11 == 1) {
            interfaceC3540l.U(-1289738868);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().a().f();
            interfaceC3540l.J();
        } else {
            if (i11 != 2) {
                interfaceC3540l.U(-1289741123);
                interfaceC3540l.J();
                throw new NoWhenBranchMatchedException();
            }
            interfaceC3540l.U(-1289736820);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().k().f();
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return jF;
    }
}
