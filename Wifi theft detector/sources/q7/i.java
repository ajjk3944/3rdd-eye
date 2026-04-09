package q7;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.p;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b2;
import kotlinx.serialization.internal.i0;
import kotlinx.serialization.internal.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class i {

    @NotNull
    public static final b Companion = new b(null);

    @Nullable
    private final String sdkUserAgent;

    public static final class a implements i0 {

        @NotNull
        public static final a INSTANCE;
        public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.RtbRequest", aVar, 1);
            pluginGeneratedSerialDescriptor.k("sdk_user_agent", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] childSerializers() {
            return new kotlinx.serialization.b[]{x9.a.s(b2.f22828a)};
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
        public i deserialize(@NotNull y9.e decoder) {
            Object objN;
            p.e(decoder, "decoder");
            kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
            y9.c cVarB = decoder.b(descriptor2);
            int i10 = 1;
            w1 w1Var = null;
            if (cVarB.p()) {
                objN = cVarB.n(descriptor2, 0, b2.f22828a, null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                objN = null;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    if (iO == -1) {
                        z10 = false;
                    } else {
                        if (iO != 0) {
                            throw new UnknownFieldException(iO);
                        }
                        objN = cVarB.n(descriptor2, 0, b2.f22828a, objN);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarB.c(descriptor2);
            return new i(i10, (String) objN, w1Var);
        }

        @Override // kotlinx.serialization.e
        public void serialize(@NotNull y9.f encoder, @NotNull i value) {
            p.e(encoder, "encoder");
            p.e(value, "value");
            kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
            y9.d dVarB = encoder.b(descriptor2);
            i.write$Self(value, dVarB, descriptor2);
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

    public i() {
        this((String) null, 1, (kotlin.jvm.internal.i) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ i copy$default(i iVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = iVar.sdkUserAgent;
        }
        return iVar.copy(str);
    }

    @JvmStatic
    public static final void write$Self(@NotNull i self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
        p.e(self, "self");
        p.e(output, "output");
        p.e(serialDesc, "serialDesc");
        if (!output.z(serialDesc, 0) && self.sdkUserAgent == null) {
            return;
        }
        output.i(serialDesc, 0, b2.f22828a, self.sdkUserAgent);
    }

    @Nullable
    public final String component1() {
        return this.sdkUserAgent;
    }

    @NotNull
    public final i copy(@Nullable String str) {
        return new i(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && p.a(this.sdkUserAgent, ((i) obj).sdkUserAgent);
    }

    @Nullable
    public final String getSdkUserAgent() {
        return this.sdkUserAgent;
    }

    public int hashCode() {
        String str = this.sdkUserAgent;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return "RtbRequest(sdkUserAgent=" + this.sdkUserAgent + ')';
    }

    @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ i(int i10, @SerialName("sdk_user_agent") String str, w1 w1Var) {
        if ((i10 & 1) == 0) {
            this.sdkUserAgent = null;
        } else {
            this.sdkUserAgent = str;
        }
    }

    public i(@Nullable String str) {
        this.sdkUserAgent = str;
    }

    public /* synthetic */ i(String str, int i10, kotlin.jvm.internal.i iVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    @SerialName("sdk_user_agent")
    public static /* synthetic */ void getSdkUserAgent$annotations() {
    }
}
