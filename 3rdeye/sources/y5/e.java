package Y5;

import M9.n;
import Q9.C0;
import Q9.C1547o0;
import Q9.C1549p0;
import Q9.H;
import Q9.Q;
import Q9.x0;
import kotlin.jvm.internal.l;

/* compiled from: Location.kt */
@M9.h
/* loaded from: classes2.dex */
public final class e {
    public static final b Companion = new b(null);
    private String country;
    private Integer dma;
    private String regionState;

    /* compiled from: Location.kt */
    public static final class a implements H<e> {
        public static final a INSTANCE;
        public static final /* synthetic */ O9.e descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            C1547o0 c1547o0 = new C1547o0("com.vungle.ads.fpd.Location", aVar, 3);
            c1547o0.k("country", true);
            c1547o0.k("region_state", true);
            c1547o0.k("dma", true);
            descriptor = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public M9.b<?>[] childSerializers() {
            C0 c02 = C0.f11399a;
            return new M9.b[]{N9.a.b(c02), N9.a.b(c02), N9.a.b(Q.f11448a)};
        }

        @Override // M9.b
        public e deserialize(P9.d decoder) {
            l.f(decoder, "decoder");
            O9.e descriptor2 = getDescriptor();
            P9.b bVarD = decoder.d(descriptor2);
            Object objG = null;
            boolean z10 = true;
            int i = 0;
            Object objG2 = null;
            Object objG3 = null;
            while (z10) {
                int iX = bVarD.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    objG = bVarD.G(descriptor2, 0, C0.f11399a, objG);
                    i |= 1;
                } else if (iX == 1) {
                    objG2 = bVarD.G(descriptor2, 1, C0.f11399a, objG2);
                    i |= 2;
                } else {
                    if (iX != 2) {
                        throw new n(iX);
                    }
                    objG3 = bVarD.G(descriptor2, 2, Q.f11448a, objG3);
                    i |= 4;
                }
            }
            bVarD.b(descriptor2);
            return new e(i, (String) objG, (String) objG2, (Integer) objG3, null);
        }

        @Override // M9.b
        public O9.e getDescriptor() {
            return descriptor;
        }

        @Override // M9.b
        public void serialize(P9.e encoder, e value) {
            l.f(encoder, "encoder");
            l.f(value, "value");
            O9.e descriptor2 = getDescriptor();
            P9.c cVarD = encoder.d(descriptor2);
            e.write$Self(value, cVarD, descriptor2);
            cVarD.b(descriptor2);
        }

        @Override // Q9.H
        public M9.b<?>[] typeParametersSerializers() {
            return C1549p0.f11523a;
        }
    }

    /* compiled from: Location.kt */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final M9.b<e> serializer() {
            return a.INSTANCE;
        }

        private b() {
        }
    }

    public e() {
    }

    public static final void write$Self(e self, P9.c output, O9.e serialDesc) {
        l.f(self, "self");
        l.f(output, "output");
        l.f(serialDesc, "serialDesc");
        if (output.F(serialDesc, 0) || self.country != null) {
            output.w(serialDesc, 0, C0.f11399a, self.country);
        }
        if (output.F(serialDesc, 1) || self.regionState != null) {
            output.w(serialDesc, 1, C0.f11399a, self.regionState);
        }
        if (!output.F(serialDesc, 2) && self.dma == null) {
            return;
        }
        output.w(serialDesc, 2, Q.f11448a, self.dma);
    }

    public final e setCountry(String country) {
        l.f(country, "country");
        this.country = country;
        return this;
    }

    public final e setDma(int i) {
        this.dma = Integer.valueOf(i);
        return this;
    }

    public final e setRegionState(String regionState) {
        l.f(regionState, "regionState");
        this.regionState = regionState;
        return this;
    }

    public /* synthetic */ e(int i, String str, String str2, Integer num, x0 x0Var) {
        if ((i & 1) == 0) {
            this.country = null;
        } else {
            this.country = str;
        }
        if ((i & 2) == 0) {
            this.regionState = null;
        } else {
            this.regionState = str2;
        }
        if ((i & 4) == 0) {
            this.dma = null;
        } else {
            this.dma = num;
        }
    }

    private static /* synthetic */ void getCountry$annotations() {
    }

    private static /* synthetic */ void getDma$annotations() {
    }

    private static /* synthetic */ void getRegionState$annotations() {
    }
}
