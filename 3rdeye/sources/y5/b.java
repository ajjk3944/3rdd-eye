package Y5;

import M9.n;
import Q9.C1547o0;
import Q9.C1549p0;
import Q9.H;
import Q9.Q;
import Q9.x0;
import kotlin.jvm.internal.l;

/* compiled from: Demographic.kt */
@M9.h
/* loaded from: classes2.dex */
public final class b {
    public static final C0201b Companion = new C0201b(null);
    private Integer ageRange;
    private Integer lengthOfResidence;
    private Integer medianHomeValueUSD;
    private Integer monthlyHousingPaymentUSD;

    /* compiled from: Demographic.kt */
    public static final class a implements H<b> {
        public static final a INSTANCE;
        public static final /* synthetic */ O9.e descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            C1547o0 c1547o0 = new C1547o0("com.vungle.ads.fpd.Demographic", aVar, 4);
            c1547o0.k("age_range", true);
            c1547o0.k("length_of_residence", true);
            c1547o0.k("median_home_value_usd", true);
            c1547o0.k("monthly_housing_payment_usd", true);
            descriptor = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public M9.b<?>[] childSerializers() {
            Q q10 = Q.f11448a;
            return new M9.b[]{N9.a.b(q10), N9.a.b(q10), N9.a.b(q10), N9.a.b(q10)};
        }

        @Override // M9.b
        public b deserialize(P9.d decoder) {
            l.f(decoder, "decoder");
            O9.e descriptor2 = getDescriptor();
            P9.b bVarD = decoder.d(descriptor2);
            Object objG = null;
            boolean z10 = true;
            int i = 0;
            Object objG2 = null;
            Object objG3 = null;
            Object objG4 = null;
            while (z10) {
                int iX = bVarD.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    objG = bVarD.G(descriptor2, 0, Q.f11448a, objG);
                    i |= 1;
                } else if (iX == 1) {
                    objG2 = bVarD.G(descriptor2, 1, Q.f11448a, objG2);
                    i |= 2;
                } else if (iX == 2) {
                    objG3 = bVarD.G(descriptor2, 2, Q.f11448a, objG3);
                    i |= 4;
                } else {
                    if (iX != 3) {
                        throw new n(iX);
                    }
                    objG4 = bVarD.G(descriptor2, 3, Q.f11448a, objG4);
                    i |= 8;
                }
            }
            bVarD.b(descriptor2);
            return new b(i, (Integer) objG, (Integer) objG2, (Integer) objG3, (Integer) objG4, null);
        }

        @Override // M9.b
        public O9.e getDescriptor() {
            return descriptor;
        }

        @Override // M9.b
        public void serialize(P9.e encoder, b value) {
            l.f(encoder, "encoder");
            l.f(value, "value");
            O9.e descriptor2 = getDescriptor();
            P9.c cVarD = encoder.d(descriptor2);
            b.write$Self(value, cVarD, descriptor2);
            cVarD.b(descriptor2);
        }

        @Override // Q9.H
        public M9.b<?>[] typeParametersSerializers() {
            return C1549p0.f11523a;
        }
    }

    /* compiled from: Demographic.kt */
    /* renamed from: Y5.b$b, reason: collision with other inner class name */
    public static final class C0201b {
        public /* synthetic */ C0201b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final M9.b<b> serializer() {
            return a.INSTANCE;
        }

        private C0201b() {
        }
    }

    public b() {
    }

    public static final void write$Self(b self, P9.c output, O9.e serialDesc) {
        l.f(self, "self");
        l.f(output, "output");
        l.f(serialDesc, "serialDesc");
        if (output.F(serialDesc, 0) || self.ageRange != null) {
            output.w(serialDesc, 0, Q.f11448a, self.ageRange);
        }
        if (output.F(serialDesc, 1) || self.lengthOfResidence != null) {
            output.w(serialDesc, 1, Q.f11448a, self.lengthOfResidence);
        }
        if (output.F(serialDesc, 2) || self.medianHomeValueUSD != null) {
            output.w(serialDesc, 2, Q.f11448a, self.medianHomeValueUSD);
        }
        if (!output.F(serialDesc, 3) && self.monthlyHousingPaymentUSD == null) {
            return;
        }
        output.w(serialDesc, 3, Q.f11448a, self.monthlyHousingPaymentUSD);
    }

    public final b setAgeRange(int i) {
        this.ageRange = Integer.valueOf(Y5.a.Companion.fromAge$vungle_ads_release(i).getId());
        return this;
    }

    public final b setLengthOfResidence(int i) {
        this.lengthOfResidence = Integer.valueOf(d.Companion.fromYears$vungle_ads_release(i).getId());
        return this;
    }

    public final b setMedianHomeValueUSD(int i) {
        this.medianHomeValueUSD = Integer.valueOf(f.Companion.fromPrice$vungle_ads_release(i).getId());
        return this;
    }

    public final b setMonthlyHousingCosts(int i) {
        this.monthlyHousingPaymentUSD = Integer.valueOf(g.Companion.fromCost$vungle_ads_release(i).getId());
        return this;
    }

    public /* synthetic */ b(int i, Integer num, Integer num2, Integer num3, Integer num4, x0 x0Var) {
        if ((i & 1) == 0) {
            this.ageRange = null;
        } else {
            this.ageRange = num;
        }
        if ((i & 2) == 0) {
            this.lengthOfResidence = null;
        } else {
            this.lengthOfResidence = num2;
        }
        if ((i & 4) == 0) {
            this.medianHomeValueUSD = null;
        } else {
            this.medianHomeValueUSD = num3;
        }
        if ((i & 8) == 0) {
            this.monthlyHousingPaymentUSD = null;
        } else {
            this.monthlyHousingPaymentUSD = num4;
        }
    }

    private static /* synthetic */ void getAgeRange$annotations() {
    }

    private static /* synthetic */ void getLengthOfResidence$annotations() {
    }

    private static /* synthetic */ void getMedianHomeValueUSD$annotations() {
    }

    private static /* synthetic */ void getMonthlyHousingPaymentUSD$annotations() {
    }
}
