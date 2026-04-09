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
import kotlinx.serialization.internal.m1;
import kotlinx.serialization.internal.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final b Companion = new b(null);

    @NotNull
    private final String appId;

    @NotNull
    private final String bundle;

    @NotNull
    private final String ver;

    public static final class a implements i0 {

        @NotNull
        public static final a INSTANCE;
        public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AppNode", aVar, 3);
            pluginGeneratedSerialDescriptor.k("bundle", false);
            pluginGeneratedSerialDescriptor.k("ver", false);
            pluginGeneratedSerialDescriptor.k("id", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] childSerializers() {
            b2 b2Var = b2.f22828a;
            return new kotlinx.serialization.b[]{b2Var, b2Var, b2Var};
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
        public c deserialize(@NotNull y9.e decoder) {
            String strM;
            String strM2;
            String str;
            int i10;
            p.e(decoder, "decoder");
            kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
            y9.c cVarB = decoder.b(descriptor2);
            if (cVarB.p()) {
                strM = cVarB.m(descriptor2, 0);
                String strM3 = cVarB.m(descriptor2, 1);
                strM2 = cVarB.m(descriptor2, 2);
                str = strM3;
                i10 = 7;
            } else {
                strM = null;
                String strM4 = null;
                String strM5 = null;
                boolean z10 = true;
                int i11 = 0;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    if (iO == -1) {
                        z10 = false;
                    } else if (iO == 0) {
                        strM = cVarB.m(descriptor2, 0);
                        i11 |= 1;
                    } else if (iO == 1) {
                        strM5 = cVarB.m(descriptor2, 1);
                        i11 |= 2;
                    } else {
                        if (iO != 2) {
                            throw new UnknownFieldException(iO);
                        }
                        strM4 = cVarB.m(descriptor2, 2);
                        i11 |= 4;
                    }
                }
                strM2 = strM4;
                str = strM5;
                i10 = i11;
            }
            String str2 = strM;
            cVarB.c(descriptor2);
            return new c(i10, str2, str, strM2, null);
        }

        @Override // kotlinx.serialization.e
        public void serialize(@NotNull y9.f encoder, @NotNull c value) {
            p.e(encoder, "encoder");
            p.e(value, "value");
            kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
            y9.d dVarB = encoder.b(descriptor2);
            c.write$Self(value, dVarB, descriptor2);
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

    @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ c(int i10, String str, String str2, @SerialName("id") String str3, w1 w1Var) {
        if (7 != (i10 & 7)) {
            m1.a(i10, 7, a.INSTANCE.getDescriptor());
        }
        this.bundle = str;
        this.ver = str2;
        this.appId = str3;
    }

    public static /* synthetic */ c copy$default(c cVar, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cVar.bundle;
        }
        if ((i10 & 2) != 0) {
            str2 = cVar.ver;
        }
        if ((i10 & 4) != 0) {
            str3 = cVar.appId;
        }
        return cVar.copy(str, str2, str3);
    }

    @JvmStatic
    public static final void write$Self(@NotNull c self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
        p.e(self, "self");
        p.e(output, "output");
        p.e(serialDesc, "serialDesc");
        output.y(serialDesc, 0, self.bundle);
        output.y(serialDesc, 1, self.ver);
        output.y(serialDesc, 2, self.appId);
    }

    @NotNull
    public final String component1() {
        return this.bundle;
    }

    @NotNull
    public final String component2() {
        return this.ver;
    }

    @NotNull
    public final String component3() {
        return this.appId;
    }

    @NotNull
    public final c copy(@NotNull String bundle, @NotNull String ver, @NotNull String appId) {
        p.e(bundle, "bundle");
        p.e(ver, "ver");
        p.e(appId, "appId");
        return new c(bundle, ver, appId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p.a(this.bundle, cVar.bundle) && p.a(this.ver, cVar.ver) && p.a(this.appId, cVar.appId);
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getBundle() {
        return this.bundle;
    }

    @NotNull
    public final String getVer() {
        return this.ver;
    }

    public int hashCode() {
        return (((this.bundle.hashCode() * 31) + this.ver.hashCode()) * 31) + this.appId.hashCode();
    }

    @NotNull
    public String toString() {
        return "AppNode(bundle=" + this.bundle + ", ver=" + this.ver + ", appId=" + this.appId + ')';
    }

    public c(@NotNull String bundle, @NotNull String ver, @NotNull String appId) {
        p.e(bundle, "bundle");
        p.e(ver, "ver");
        p.e(appId, "appId");
        this.bundle = bundle;
        this.ver = ver;
        this.appId = appId;
    }

    @SerialName("id")
    public static /* synthetic */ void getAppId$annotations() {
    }
}
