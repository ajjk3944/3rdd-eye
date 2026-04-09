package a6;

import M9.n;
import N7.B8;
import Q9.C0;
import Q9.C1547o0;
import Q9.C1549p0;
import Q9.H;
import Q9.x0;

/* compiled from: OmSdkData.kt */
@M9.h
/* renamed from: a6.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1660i {
    public static final b Companion = new b(null);
    private final String params;
    private final String vendorKey;
    private final String vendorURL;

    /* compiled from: OmSdkData.kt */
    /* renamed from: a6.i$a */
    public static final class a implements H<C1660i> {
        public static final a INSTANCE;
        public static final /* synthetic */ O9.e descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.OmSdkData", aVar, 3);
            c1547o0.k("params", true);
            c1547o0.k("vendorKey", true);
            c1547o0.k("vendorURL", true);
            descriptor = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public M9.b<?>[] childSerializers() {
            C0 c02 = C0.f11399a;
            return new M9.b[]{N9.a.b(c02), N9.a.b(c02), N9.a.b(c02)};
        }

        @Override // M9.b
        public C1660i deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
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
                    objG3 = bVarD.G(descriptor2, 2, C0.f11399a, objG3);
                    i |= 4;
                }
            }
            bVarD.b(descriptor2);
            return new C1660i(i, (String) objG, (String) objG2, (String) objG3, (x0) null);
        }

        @Override // M9.b
        public O9.e getDescriptor() {
            return descriptor;
        }

        @Override // M9.b
        public void serialize(P9.e encoder, C1660i value) {
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            O9.e descriptor2 = getDescriptor();
            P9.c cVarD = encoder.d(descriptor2);
            C1660i.write$Self(value, cVarD, descriptor2);
            cVarD.b(descriptor2);
        }

        @Override // Q9.H
        public M9.b<?>[] typeParametersSerializers() {
            return C1549p0.f11523a;
        }
    }

    /* compiled from: OmSdkData.kt */
    /* renamed from: a6.i$b */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final M9.b<C1660i> serializer() {
            return a.INSTANCE;
        }

        private b() {
        }
    }

    public C1660i() {
        this((String) null, (String) null, (String) null, 7, (kotlin.jvm.internal.g) null);
    }

    public static /* synthetic */ C1660i copy$default(C1660i c1660i, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c1660i.params;
        }
        if ((i & 2) != 0) {
            str2 = c1660i.vendorKey;
        }
        if ((i & 4) != 0) {
            str3 = c1660i.vendorURL;
        }
        return c1660i.copy(str, str2, str3);
    }

    public static final void write$Self(C1660i self, P9.c output, O9.e serialDesc) {
        kotlin.jvm.internal.l.f(self, "self");
        kotlin.jvm.internal.l.f(output, "output");
        kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
        if (output.F(serialDesc, 0) || self.params != null) {
            output.w(serialDesc, 0, C0.f11399a, self.params);
        }
        if (output.F(serialDesc, 1) || self.vendorKey != null) {
            output.w(serialDesc, 1, C0.f11399a, self.vendorKey);
        }
        if (!output.F(serialDesc, 2) && self.vendorURL == null) {
            return;
        }
        output.w(serialDesc, 2, C0.f11399a, self.vendorURL);
    }

    public final String component1() {
        return this.params;
    }

    public final String component2() {
        return this.vendorKey;
    }

    public final String component3() {
        return this.vendorURL;
    }

    public final C1660i copy(String str, String str2, String str3) {
        return new C1660i(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1660i)) {
            return false;
        }
        C1660i c1660i = (C1660i) obj;
        return kotlin.jvm.internal.l.b(this.params, c1660i.params) && kotlin.jvm.internal.l.b(this.vendorKey, c1660i.vendorKey) && kotlin.jvm.internal.l.b(this.vendorURL, c1660i.vendorURL);
    }

    public final String getParams() {
        return this.params;
    }

    public final String getVendorKey() {
        return this.vendorKey;
    }

    public final String getVendorURL() {
        return this.vendorURL;
    }

    public int hashCode() {
        String str = this.params;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.vendorKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.vendorURL;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OmSdkData(params=");
        sb.append(this.params);
        sb.append(", vendorKey=");
        sb.append(this.vendorKey);
        sb.append(", vendorURL=");
        return B8.j(sb, this.vendorURL, ')');
    }

    public /* synthetic */ C1660i(int i, String str, String str2, String str3, x0 x0Var) {
        if ((i & 1) == 0) {
            this.params = null;
        } else {
            this.params = str;
        }
        if ((i & 2) == 0) {
            this.vendorKey = null;
        } else {
            this.vendorKey = str2;
        }
        if ((i & 4) == 0) {
            this.vendorURL = null;
        } else {
            this.vendorURL = str3;
        }
    }

    public C1660i(String str, String str2, String str3) {
        this.params = str;
        this.vendorKey = str2;
        this.vendorURL = str3;
    }

    public /* synthetic */ C1660i(String str, String str2, String str3, int i, kotlin.jvm.internal.g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
