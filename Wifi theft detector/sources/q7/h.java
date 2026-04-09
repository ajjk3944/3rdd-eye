package q7;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.p;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Transient;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b2;
import kotlinx.serialization.internal.i0;
import kotlinx.serialization.internal.m1;
import kotlinx.serialization.internal.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class h {

    @NotNull
    public static final b Companion = new b(null);
    private final boolean headerBidding;

    @NotNull
    private final String referenceId;

    @Nullable
    private final String type;

    @Nullable
    private Long wakeupTime;

    public static final class a implements i0 {

        @NotNull
        public static final a INSTANCE;
        public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.Placement", aVar, 3);
            pluginGeneratedSerialDescriptor.k("placement_ref_id", false);
            pluginGeneratedSerialDescriptor.k("is_hb", true);
            pluginGeneratedSerialDescriptor.k(HandleInvocationsFromAdViewer.KEY_AD_TYPE, true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] childSerializers() {
            b2 b2Var = b2.f22828a;
            return new kotlinx.serialization.b[]{b2Var, kotlinx.serialization.internal.i.f22868a, x9.a.s(b2Var)};
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
        public h deserialize(@NotNull y9.e decoder) {
            boolean z10;
            int i10;
            String str;
            Object objN;
            p.e(decoder, "decoder");
            kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
            y9.c cVarB = decoder.b(descriptor2);
            if (cVarB.p()) {
                String strM = cVarB.m(descriptor2, 0);
                boolean zC = cVarB.C(descriptor2, 1);
                objN = cVarB.n(descriptor2, 2, b2.f22828a, null);
                str = strM;
                z10 = zC;
                i10 = 7;
            } else {
                boolean z11 = true;
                boolean zC2 = false;
                String strM2 = null;
                Object objN2 = null;
                int i11 = 0;
                while (z11) {
                    int iO = cVarB.o(descriptor2);
                    if (iO == -1) {
                        z11 = false;
                    } else if (iO == 0) {
                        strM2 = cVarB.m(descriptor2, 0);
                        i11 |= 1;
                    } else if (iO == 1) {
                        zC2 = cVarB.C(descriptor2, 1);
                        i11 |= 2;
                    } else {
                        if (iO != 2) {
                            throw new UnknownFieldException(iO);
                        }
                        objN2 = cVarB.n(descriptor2, 2, b2.f22828a, objN2);
                        i11 |= 4;
                    }
                }
                z10 = zC2;
                i10 = i11;
                str = strM2;
                objN = objN2;
            }
            cVarB.c(descriptor2);
            return new h(i10, str, z10, (String) objN, (w1) null);
        }

        @Override // kotlinx.serialization.e
        public void serialize(@NotNull y9.f encoder, @NotNull h value) {
            p.e(encoder, "encoder");
            p.e(value, "value");
            kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
            y9.d dVarB = encoder.b(descriptor2);
            h.write$Self(value, dVarB, descriptor2);
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
    public /* synthetic */ h(int i10, @SerialName("placement_ref_id") String str, @SerialName("is_hb") boolean z10, @SerialName(HandleInvocationsFromAdViewer.KEY_AD_TYPE) String str2, w1 w1Var) {
        if (1 != (i10 & 1)) {
            m1.a(i10, 1, a.INSTANCE.getDescriptor());
        }
        this.referenceId = str;
        if ((i10 & 2) == 0) {
            this.headerBidding = false;
        } else {
            this.headerBidding = z10;
        }
        if ((i10 & 4) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        this.wakeupTime = null;
    }

    public static /* synthetic */ h copy$default(h hVar, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = hVar.referenceId;
        }
        if ((i10 & 2) != 0) {
            z10 = hVar.headerBidding;
        }
        if ((i10 & 4) != 0) {
            str2 = hVar.type;
        }
        return hVar.copy(str, z10, str2);
    }

    @JvmStatic
    public static final void write$Self(@NotNull h self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
        p.e(self, "self");
        p.e(output, "output");
        p.e(serialDesc, "serialDesc");
        output.y(serialDesc, 0, self.referenceId);
        if (output.z(serialDesc, 1) || self.headerBidding) {
            output.x(serialDesc, 1, self.headerBidding);
        }
        if (!output.z(serialDesc, 2) && self.type == null) {
            return;
        }
        output.i(serialDesc, 2, b2.f22828a, self.type);
    }

    @NotNull
    public final String component1() {
        return this.referenceId;
    }

    public final boolean component2() {
        return this.headerBidding;
    }

    @Nullable
    public final String component3() {
        return this.type;
    }

    @NotNull
    public final h copy(@NotNull String referenceId, boolean z10, @Nullable String str) {
        p.e(referenceId, "referenceId");
        return new h(referenceId, z10, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p.a(this.referenceId, hVar.referenceId) && this.headerBidding == hVar.headerBidding && p.a(this.type, hVar.type);
    }

    public final boolean getHeaderBidding() {
        return this.headerBidding;
    }

    @NotNull
    public final String getReferenceId() {
        return this.referenceId;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final Long getWakeupTime() {
        return this.wakeupTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.referenceId.hashCode() * 31;
        boolean z10 = this.headerBidding;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        String str = this.type;
        return i11 + (str == null ? 0 : str.hashCode());
    }

    public final boolean isAppOpen() {
        return p.a(this.type, com.vungle.ads.internal.b.PLACEMENT_TYPE_APP_OPEN);
    }

    public final boolean isBanner() {
        return p.a(this.type, "banner");
    }

    public final boolean isInline() {
        return p.a(this.type, "in_line");
    }

    public final boolean isInterstitial() {
        return p.a(this.type, com.vungle.ads.internal.b.PLACEMENT_TYPE_INTERSTITIAL);
    }

    public final boolean isMREC() {
        return p.a(this.type, "mrec");
    }

    public final boolean isNative() {
        return p.a(this.type, "native");
    }

    public final boolean isRewardedVideo() {
        return p.a(this.type, com.vungle.ads.internal.b.PLACEMENT_TYPE_REWARDED);
    }

    public final void setWakeupTime(@Nullable Long l10) {
        this.wakeupTime = l10;
    }

    public final void snooze(long j10) {
        this.wakeupTime = Long.valueOf(System.currentTimeMillis() + (j10 * 1000));
    }

    @NotNull
    public String toString() {
        return "Placement(referenceId=" + this.referenceId + ", headerBidding=" + this.headerBidding + ", type=" + this.type + ')';
    }

    public h(@NotNull String referenceId, boolean z10, @Nullable String str) {
        p.e(referenceId, "referenceId");
        this.referenceId = referenceId;
        this.headerBidding = z10;
        this.type = str;
    }

    public /* synthetic */ h(String str, boolean z10, String str2, int i10, kotlin.jvm.internal.i iVar) {
        this(str, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : str2);
    }

    @SerialName("is_hb")
    public static /* synthetic */ void getHeaderBidding$annotations() {
    }

    @SerialName("placement_ref_id")
    public static /* synthetic */ void getReferenceId$annotations() {
    }

    @SerialName(HandleInvocationsFromAdViewer.KEY_AD_TYPE)
    public static /* synthetic */ void getType$annotations() {
    }

    @Transient
    public static /* synthetic */ void getWakeupTime$annotations() {
    }
}
