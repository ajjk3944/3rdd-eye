package q7;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
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
public final class k {

    @NotNull
    public static final b Companion = new b(null);

    @NotNull
    private final String eventId;

    @NotNull
    private String sessionId;

    public static final class a implements i0 {

        @NotNull
        public static final a INSTANCE;
        public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.UnclosedAd", aVar, 2);
            pluginGeneratedSerialDescriptor.k("107", false);
            pluginGeneratedSerialDescriptor.k(StatisticData.ERROR_CODE_IO_ERROR, true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] childSerializers() {
            b2 b2Var = b2.f22828a;
            return new kotlinx.serialization.b[]{b2Var, b2Var};
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
        public k deserialize(@NotNull y9.e decoder) {
            String strM;
            String strM2;
            int i10;
            p.e(decoder, "decoder");
            kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
            y9.c cVarB = decoder.b(descriptor2);
            w1 w1Var = null;
            if (cVarB.p()) {
                strM = cVarB.m(descriptor2, 0);
                strM2 = cVarB.m(descriptor2, 1);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                strM = null;
                String strM3 = null;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    if (iO == -1) {
                        z10 = false;
                    } else if (iO == 0) {
                        strM = cVarB.m(descriptor2, 0);
                        i11 |= 1;
                    } else {
                        if (iO != 1) {
                            throw new UnknownFieldException(iO);
                        }
                        strM3 = cVarB.m(descriptor2, 1);
                        i11 |= 2;
                    }
                }
                strM2 = strM3;
                i10 = i11;
            }
            cVarB.c(descriptor2);
            return new k(i10, strM, strM2, w1Var);
        }

        @Override // kotlinx.serialization.e
        public void serialize(@NotNull y9.f encoder, @NotNull k value) {
            p.e(encoder, "encoder");
            p.e(value, "value");
            kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
            y9.d dVarB = encoder.b(descriptor2);
            k.write$Self(value, dVarB, descriptor2);
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
    public /* synthetic */ k(int i10, @SerialName("107") String str, @SerialName(StatisticData.ERROR_CODE_IO_ERROR) String str2, w1 w1Var) {
        if (1 != (i10 & 1)) {
            m1.a(i10, 1, a.INSTANCE.getDescriptor());
        }
        this.eventId = str;
        if ((i10 & 2) == 0) {
            this.sessionId = "";
        } else {
            this.sessionId = str2;
        }
    }

    public static /* synthetic */ k copy$default(k kVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = kVar.eventId;
        }
        if ((i10 & 2) != 0) {
            str2 = kVar.sessionId;
        }
        return kVar.copy(str, str2);
    }

    @JvmStatic
    public static final void write$Self(@NotNull k self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
        p.e(self, "self");
        p.e(output, "output");
        p.e(serialDesc, "serialDesc");
        output.y(serialDesc, 0, self.eventId);
        if (!output.z(serialDesc, 1) && p.a(self.sessionId, "")) {
            return;
        }
        output.y(serialDesc, 1, self.sessionId);
    }

    @NotNull
    public final String component1() {
        return this.eventId;
    }

    @NotNull
    public final String component2() {
        return this.sessionId;
    }

    @NotNull
    public final k copy(@NotNull String eventId, @NotNull String sessionId) {
        p.e(eventId, "eventId");
        p.e(sessionId, "sessionId");
        return new k(eventId, sessionId);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj != null && p.a(k.class, obj.getClass())) {
            k kVar = (k) obj;
            if (p.a(this.eventId, kVar.eventId) && p.a(this.sessionId, kVar.sessionId)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return (this.eventId.hashCode() * 31) + this.sessionId.hashCode();
    }

    public final void setSessionId(@NotNull String str) {
        p.e(str, "<set-?>");
        this.sessionId = str;
    }

    @NotNull
    public String toString() {
        return "UnclosedAd(eventId=" + this.eventId + ", sessionId=" + this.sessionId + ')';
    }

    public k(@NotNull String eventId, @NotNull String sessionId) {
        p.e(eventId, "eventId");
        p.e(sessionId, "sessionId");
        this.eventId = eventId;
        this.sessionId = sessionId;
    }

    public /* synthetic */ k(String str, String str2, int i10, kotlin.jvm.internal.i iVar) {
        this(str, (i10 & 2) != 0 ? "" : str2);
    }

    @SerialName("107")
    public static /* synthetic */ void getEventId$annotations() {
    }

    @SerialName(StatisticData.ERROR_CODE_IO_ERROR)
    public static /* synthetic */ void getSessionId$annotations() {
    }
}
