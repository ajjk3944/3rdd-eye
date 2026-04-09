package Ne;

import L0.C3174d;
import L0.D;
import S8.f;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m8.AbstractC6780c;
import ma.AbstractC6784a;
import mh.q;
import s9.d;

/* loaded from: classes4.dex */
public abstract class j {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16415a;

        static {
            int[] iArr = new int[f.a.values().length];
            try {
                iArr[f.a.EXCELLENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.a.GOOD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.a.FAIR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.a.POOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f16415a = iArr;
        }
    }

    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ S8.f f16416a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f16417b;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f16418a;

            static {
                int[] iArr = new int[f.a.values().length];
                try {
                    iArr[f.a.EXCELLENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[f.a.GOOD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[f.a.FAIR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[f.a.POOR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f16418a = iArr;
            }
        }

        b(S8.f fVar, boolean z10) {
            this.f16416a = fVar;
            this.f16417b = z10;
        }

        public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(context, "context");
            interfaceC3540l.U(839158710);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(839158710, i10, -1, "com.ui.wifiman.ui.domain.text.<anonymous> (WifiChannelQualityExtensions.kt:29)");
            }
            int i12 = a.f16418a[this.f16416a.b().ordinal()];
            if (i12 == 1) {
                i11 = AbstractC6780c.f53321H2;
            } else if (i12 == 2) {
                i11 = AbstractC6780c.f53335J2;
            } else if (i12 == 3) {
                i11 = AbstractC6780c.f53328I2;
            } else {
                if (i12 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i11 = AbstractC6780c.f53342K2;
            }
            String string = context.getString(i11);
            AbstractC6492s.h(string, "getString(...)");
            CharSequence charSequenceP = string;
            if (this.f16417b) {
                S8.f fVar = this.f16416a;
                C3174d.a aVar = new C3174d.a(0, 1, null);
                int iN = aVar.n(new D(j.b(fVar, interfaceC3540l, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                try {
                    aVar.i(string);
                    J j10 = J.f24997a;
                    aVar.l(iN);
                    charSequenceP = aVar.p();
                } catch (Throwable th2) {
                    aVar.l(iN);
                    throw th2;
                }
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return charSequenceP;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final long a(f.a aVar, AbstractC6784a palette) {
        AbstractC6492s.i(aVar, "<this>");
        AbstractC6492s.i(palette, "palette");
        int i10 = a.f16415a[aVar.ordinal()];
        if (i10 == 1) {
            return palette.a().d().f();
        }
        if (i10 == 2) {
            return palette.a().e().f();
        }
        if (i10 == 3) {
            return palette.a().h().f();
        }
        if (i10 == 4) {
            return palette.a().l().f();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final long b(S8.f fVar, InterfaceC3540l interfaceC3540l, int i10) {
        AbstractC6492s.i(fVar, "<this>");
        interfaceC3540l.U(-1634523191);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1634523191, i10, -1, "com.ui.wifiman.ui.domain.color (WifiChannelQualityExtensions.kt:25)");
        }
        long jA = a(fVar.b(), C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b));
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return jA;
    }

    public static final s9.d c(S8.f fVar, boolean z10) {
        AbstractC6492s.i(fVar, "<this>");
        return new d.a(fVar.b().name(), new b(fVar, z10));
    }
}
