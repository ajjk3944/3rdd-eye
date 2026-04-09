package hf;

import F.AbstractC2730u;
import F.C2729t;
import L0.AbstractC3194y;
import L0.C3174d;
import L0.C3193x;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ff.AbstractC5822c;
import ff.EnumC5820a;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.Arrays;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.U;
import m8.AbstractC6780c;
import sa.AbstractC7930a;

/* renamed from: hf.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6031c {

    /* renamed from: a, reason: collision with root package name */
    public static final C6031c f48649a = new C6031c();

    /* renamed from: b, reason: collision with root package name */
    private static final double f48650b = 0.8d;

    /* renamed from: c, reason: collision with root package name */
    public static final int f48651c = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: hf.c$a */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        private final String inlineContentId;
        public static final a UP = new a("UP", 0, "<up>");
        public static final a DOWN = new a("DOWN", 1, "<down>");

        private static final /* synthetic */ a[] $values() {
            return new a[]{UP, DOWN};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10, String str2) {
            this.inlineContentId = str2;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final String getInlineContentId() {
            return this.inlineContentId;
        }
    }

    /* renamed from: hf.c$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48652a;

        static {
            int[] iArr = new int[EnumC5820a.values().length];
            try {
                iArr[EnumC5820a.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5820a.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f48652a = iArr;
        }
    }

    private C6031c() {
    }

    private final String d(EnumC5820a enumC5820a) {
        int i10 = b.f48652a[enumC5820a.ordinal()];
        if (i10 == 1) {
            return "<up>";
        }
        if (i10 == 2) {
            return "<down>";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final C3174d a(W7.a aVar, boolean z10, W7.a aVar2, boolean z11, String str, s9.d dVar, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        String strB;
        int iN;
        boolean z12;
        String strB2;
        interfaceC3540l.U(-1399844563);
        boolean z13 = (i11 & 2) != 0 ? true : z10;
        boolean z14 = (i11 & 8) != 0 ? true : z11;
        String str2 = (i11 & 16) != 0 ? "%.1f" : str;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1399844563, i10, -1, "com.ui.wifiman.ui.speedtest.component.NetworkSpeedString.bidirectional (NetworkSpeedString.kt:110)");
        }
        Context context = (Context) interfaceC3540l.t(AndroidCompositionLocals_androidKt.g());
        C3174d.a aVar3 = new C3174d.a(0, 1, null);
        if (aVar != null) {
            float fC = aVar.c();
            U u10 = U.f51694a;
            strB = String.format(str2, Arrays.copyOf(new Object[]{Float.valueOf(fC)}, 1));
            AbstractC6492s.h(strB, "format(...)");
        } else {
            strB = null;
        }
        interfaceC3540l.U(-469962021);
        if (strB == null) {
            strB = dVar == null ? null : AbstractC7930a.b(dVar, interfaceC3540l, (i10 >> 15) & 14);
        }
        interfaceC3540l.J();
        interfaceC3540l.U(-469958653);
        if (strB == null) {
            z12 = z14;
        } else {
            EnumC5820a enumC5820a = EnumC5820a.DOWN;
            iN = aVar3.n(new L0.D(AbstractC5822c.a(enumC5820a, interfaceC3540l, 6), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
            try {
                z12 = z14;
                AbstractC2730u.b(aVar3, a.DOWN.getInlineContentId(), null, 2, null);
                aVar3.i(" ");
                aVar3.i(strB);
                Yg.J j10 = Yg.J.f24997a;
                aVar3.l(iN);
                interfaceC3540l.U(-1535602674);
                if (z13) {
                    iN = aVar3.n(new L0.D(AbstractC5822c.a(enumC5820a, interfaceC3540l, 6), Y0.w.d(f48650b), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65532, null));
                    try {
                        aVar3.i(" ");
                        String string = context.getString(AbstractC6780c.f53578s4);
                        AbstractC6492s.h(string, "getString(...)");
                        aVar3.i(string);
                        aVar3.l(iN);
                    } finally {
                    }
                }
                interfaceC3540l.J();
            } finally {
            }
        }
        interfaceC3540l.J();
        if (aVar2 != null) {
            float fC2 = aVar2.c();
            U u11 = U.f51694a;
            strB2 = String.format(str2, Arrays.copyOf(new Object[]{Float.valueOf(fC2)}, 1));
            AbstractC6492s.h(strB2, "format(...)");
        } else {
            strB2 = null;
        }
        interfaceC3540l.U(-469935495);
        if (strB2 == null) {
            strB2 = dVar == null ? null : AbstractC7930a.b(dVar, interfaceC3540l, (i10 >> 15) & 14);
        }
        interfaceC3540l.J();
        interfaceC3540l.U(-469932117);
        if (strB2 != null) {
            if (aVar3.j() != 0) {
                aVar3.i(" ");
            }
            EnumC5820a enumC5820a2 = EnumC5820a.UP;
            iN = aVar3.n(new L0.D(AbstractC5822c.a(enumC5820a2, interfaceC3540l, 6), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
            try {
                AbstractC2730u.b(aVar3, a.UP.getInlineContentId(), null, 2, null);
                aVar3.i(" ");
                aVar3.i(strB2);
                Yg.J j11 = Yg.J.f24997a;
                aVar3.l(iN);
                interfaceC3540l.U(-1535573720);
                if (z12) {
                    iN = aVar3.n(new L0.D(AbstractC5822c.a(enumC5820a2, interfaceC3540l, 6), Y0.w.d(f48650b), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65532, null));
                    try {
                        aVar3.i(" ");
                        String string2 = context.getString(AbstractC6780c.f53578s4);
                        AbstractC6492s.h(string2, "getString(...)");
                        aVar3.i(string2);
                    } finally {
                    }
                }
                interfaceC3540l.J();
            } finally {
            }
        }
        interfaceC3540l.J();
        C3174d c3174dP = aVar3.p();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return c3174dP;
    }

    public final C3174d b(W7.a throughput, EnumC5820a direction, String str, boolean z10, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        AbstractC6492s.i(throughput, "throughput");
        AbstractC6492s.i(direction, "direction");
        interfaceC3540l.U(1179570575);
        String str2 = (i11 & 4) != 0 ? "%.1f" : str;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1179570575, i10, -1, "com.ui.wifiman.ui.speedtest.component.NetworkSpeedString.directional (NetworkSpeedString.kt:53)");
        }
        Context context = (Context) interfaceC3540l.t(AndroidCompositionLocals_androidKt.g());
        C3174d.a aVar = new C3174d.a(0, 1, null);
        int i12 = (i10 >> 3) & 14;
        int iN = aVar.n(new L0.D(AbstractC5822c.a(direction, interfaceC3540l, i12), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
        try {
            AbstractC2730u.b(aVar, f48649a.d(direction), null, 2, null);
            aVar.i(" ");
            U u10 = U.f51694a;
            String str3 = String.format(str2, Arrays.copyOf(new Object[]{Float.valueOf(throughput.c())}, 1));
            AbstractC6492s.h(str3, "format(...)");
            aVar.i(str3);
            Yg.J j10 = Yg.J.f24997a;
            aVar.l(iN);
            interfaceC3540l.U(1789969917);
            if (z10) {
                iN = aVar.n(new L0.D(AbstractC5822c.a(direction, interfaceC3540l, i12), Y0.w.d(f48650b), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65532, null));
                try {
                    aVar.i(" ");
                    String string = context.getString(AbstractC6780c.f53578s4);
                    AbstractC6492s.h(string, "getString(...)");
                    aVar.i(string);
                } finally {
                }
            }
            interfaceC3540l.J();
            C3174d c3174dP = aVar.p();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return c3174dP;
        } finally {
        }
    }

    public final C3174d c(EnumC5820a direction, boolean z10, InterfaceC3540l interfaceC3540l, int i10) {
        AbstractC6492s.i(direction, "direction");
        interfaceC3540l.U(-2012801433);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-2012801433, i10, -1, "com.ui.wifiman.ui.speedtest.component.NetworkSpeedString.directionalValueNotAvailable (NetworkSpeedString.kt:79)");
        }
        Context context = (Context) interfaceC3540l.t(AndroidCompositionLocals_androidKt.g());
        C3174d.a aVar = new C3174d.a(0, 1, null);
        interfaceC3540l.U(-452222700);
        int i11 = i10 & 14;
        int iN = aVar.n(new L0.D(AbstractC5822c.a(direction, interfaceC3540l, i11), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
        try {
            AbstractC2730u.b(aVar, f48649a.d(direction), null, 2, null);
            aVar.i(" ");
            aVar.i(H0.f.a(AbstractC6780c.f53274A4, interfaceC3540l, 0));
            Yg.J j10 = Yg.J.f24997a;
            aVar.l(iN);
            interfaceC3540l.J();
            interfaceC3540l.U(-452214076);
            if (z10) {
                iN = aVar.n(new L0.D(AbstractC5822c.a(direction, interfaceC3540l, i11), Y0.w.d(f48650b), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65532, null));
                try {
                    aVar.i(" ");
                    String string = context.getString(AbstractC6780c.f53578s4);
                    AbstractC6492s.h(string, "getString(...)");
                    aVar.i(string);
                } finally {
                }
            }
            interfaceC3540l.J();
            C3174d c3174dP = aVar.p();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return c3174dP;
        } finally {
        }
    }

    public final C3174d e(W7.a aVar, boolean z10, W7.a aVar2, boolean z11, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        interfaceC3540l.U(-462255519);
        boolean z12 = (i11 & 2) != 0 ? true : z10;
        boolean z13 = (i11 & 8) != 0 ? true : z11;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-462255519, i10, -1, "com.ui.wifiman.ui.speedtest.component.NetworkSpeedString.newWirelessRatesString (NetworkSpeedString.kt:164)");
        }
        C3174d c3174dA = a(aVar, z12, aVar2, z13, "%.0f", null, interfaceC3540l, (i10 & 14) | 221184 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | ((i10 << 6) & 3670016), 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return c3174dA;
    }

    public final Map f(long j10, InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(1782889168);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1782889168, i10, -1, "com.ui.wifiman.ui.speedtest.component.NetworkSpeedString.rememberInlineContent (NetworkSpeedString.kt:174)");
        }
        interfaceC3540l.U(400697157);
        boolean z10 = (((i10 & 14) ^ 6) > 4 && interfaceC3540l.j(j10)) || (i10 & 6) == 4;
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            String inlineContentId = a.DOWN.getInlineContentId();
            Y0.w.b(j10);
            long j11 = Y0.w.j(Y0.v.f(j10), Y0.v.h(j10) / 3.0f);
            Y0.w.b(j11);
            long j12 = Y0.w.j(Y0.v.f(j11), Y0.v.h(j11) * 2.0f);
            AbstractC3194y.a aVar = AbstractC3194y.f11198a;
            C3193x c3193x = new C3193x(j12, j10, aVar.a(), null);
            C6029a c6029a = C6029a.f48641a;
            Yg.s sVarA = Yg.z.a(inlineContentId, new C2729t(c3193x, c6029a.a()));
            String inlineContentId2 = a.UP.getInlineContentId();
            Y0.w.b(j10);
            long j13 = Y0.w.j(Y0.v.f(j10), Y0.v.h(j10) / 3.0f);
            Y0.w.b(j13);
            objF = Zg.U.k(sVarA, Yg.z.a(inlineContentId2, new C2729t(new C3193x(Y0.w.j(Y0.v.f(j13), Y0.v.h(j13) * 2.0f), j10, aVar.a(), null), c6029a.b())));
            interfaceC3540l.K(objF);
        }
        Map map = (Map) objF;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return map;
    }
}
