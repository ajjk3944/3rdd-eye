package q7;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.p;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b2;
import kotlinx.serialization.internal.i0;
import kotlinx.serialization.internal.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class g {

    @NotNull
    public static final b Companion = new b(null);

    @Nullable
    private final String params;

    @Nullable
    private final String vendorKey;

    @Nullable
    private final String vendorURL;

    public static final class a implements i0 {

        @NotNull
        public static final a INSTANCE;
        public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.OmSdkData", aVar, 3);
            pluginGeneratedSerialDescriptor.k("params", true);
            pluginGeneratedSerialDescriptor.k("vendorKey", true);
            pluginGeneratedSerialDescriptor.k("vendorURL", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] childSerializers() {
            b2 b2Var = b2.f22828a;
            return new kotlinx.serialization.b[]{x9.a.s(b2Var), x9.a.s(b2Var), x9.a.s(b2Var)};
        }

        @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
        @NotNull
        public kotlinx.serialization.descriptors.f getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] typeParametersSerializers() {
            return i0.a.a(this);
        }

        @Override // kotlinx.serialization.a
        @NotNull
        public g deserialize(@NotNull y9.e decoder) {
            Object objN;
            int i10;
            Object objN2;
            Object objN3;
            p.e(decoder, "decoder");
            kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
            y9.c cVarB = decoder.b(descriptor2);
            Object objN4 = null;
            if (cVarB.p()) {
                b2 b2Var = b2.f22828a;
                objN2 = cVarB.n(descriptor2, 0, b2Var, null);
                Object objN5 = cVarB.n(descriptor2, 1, b2Var, null);
                objN3 = cVarB.n(descriptor2, 2, b2Var, null);
                objN = objN5;
                i10 = 7;
            } else {
                boolean z10 = true;
                int i11 = 0;
                objN = null;
                Object objN6 = null;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    if (iO == -1) {
                        z10 = false;
                    } else if (iO == 0) {
                        objN4 = cVarB.n(descriptor2, 0, b2.f22828a, objN4);
                        i11 |= 1;
                    } else if (iO == 1) {
                        objN = cVarB.n(descriptor2, 1, b2.f22828a, objN);
                        i11 |= 2;
                    } else {
                        if (iO != 2) {
                            throw new UnknownFieldException(iO);
                        }
                        objN6 = cVarB.n(descriptor2, 2, b2.f22828a, objN6);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                objN2 = objN4;
                objN3 = objN6;
            }
            cVarB.c(descriptor2);
            return new g(i10, (String) objN2, (String) objN, (String) objN3, (w1) null);
        }

        @Override // kotlinx.serialization.e
        public void serialize(@NotNull y9.f encoder, @NotNull g value) {
            p.e(encoder, "encoder");
            p.e(value, "value");
            kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
            y9.d dVarB = encoder.b(descriptor2);
            g.write$Self(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
            this();
        }

        @NotNull
        public final kotlinx.serialization.b serializer() {
            return a.INSTANCE;
        }

        private b() {
        }
    }

    public g() {
        this((String) null, (String) null, (String) null, 7, (kotlin.jvm.internal.i) null);
    }

    public static /* synthetic */ g copy$default(g gVar, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = gVar.params;
        }
        if ((i10 & 2) != 0) {
            str2 = gVar.vendorKey;
        }
        if ((i10 & 4) != 0) {
            str3 = gVar.vendorURL;
        }
        return gVar.copy(str, str2, str3);
    }

    @JvmStatic
    public static final void write$Self(@NotNull g self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
        p.e(self, "self");
        p.e(output, "output");
        p.e(serialDesc, "serialDesc");
        if (output.z(serialDesc, 0) || self.params != null) {
            output.i(serialDesc, 0, b2.f22828a, self.params);
        }
        if (output.z(serialDesc, 1) || self.vendorKey != null) {
            output.i(serialDesc, 1, b2.f22828a, self.vendorKey);
        }
        if (!output.z(serialDesc, 2) && self.vendorURL == null) {
            return;
        }
        output.i(serialDesc, 2, b2.f22828a, self.vendorURL);
    }

    @Nullable
    public final String component1() {
        return this.params;
    }

    @Nullable
    public final String component2() {
        return this.vendorKey;
    }

    @Nullable
    public final String component3() {
        return this.vendorURL;
    }

    @NotNull
    public final g copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new g(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p.a(this.params, gVar.params) && p.a(this.vendorKey, gVar.vendorKey) && p.a(this.vendorURL, gVar.vendorURL);
    }

    @Nullable
    public final String getParams() {
        return this.params;
    }

    @Nullable
    public final String getVendorKey() {
        return this.vendorKey;
    }

    @Nullable
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

    @NotNull
    public String toString() {
        return "OmSdkData(params=" + this.params + ", vendorKey=" + this.vendorKey + ", vendorURL=" + this.vendorURL + ')';
    }

    @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ g(int i10, String str, String str2, String str3, w1 w1Var) {
        if ((i10 & 1) == 0) {
            this.params = null;
        } else {
            this.params = str;
        }
        if ((i10 & 2) == 0) {
            this.vendorKey = null;
        } else {
            this.vendorKey = str2;
        }
        if ((i10 & 4) == 0) {
            this.vendorURL = null;
        } else {
            this.vendorURL = str3;
        }
    }

    public g(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.params = str;
        this.vendorKey = str2;
        this.vendorURL = str3;
    }

    public /* synthetic */ g(String str, String str2, String str3, int i10, kotlin.jvm.internal.i iVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
