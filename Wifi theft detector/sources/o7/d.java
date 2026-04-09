package o7;

import com.vungle.ads.internal.util.r;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.h0;
import kotlinx.serialization.internal.i0;
import kotlinx.serialization.internal.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y9.e;

/* loaded from: classes3.dex */
public final class d {

    @NotNull
    public static final b Companion = new b(null);

    @Nullable
    private Float levelPercentile;

    public static final class a implements i0 {

        @NotNull
        public static final a INSTANCE;
        public static final /* synthetic */ f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.fpd.SessionContext", aVar, 1);
            pluginGeneratedSerialDescriptor.k("level_percentile", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] childSerializers() {
            return new kotlinx.serialization.b[]{x9.a.s(h0.f22862a)};
        }

        @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
        @NotNull
        public f getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] typeParametersSerializers() {
            return i0.a.a(this);
        }

        @Override // kotlinx.serialization.a
        @NotNull
        public d deserialize(@NotNull e decoder) {
            Object objN;
            p.e(decoder, "decoder");
            f descriptor2 = getDescriptor();
            y9.c cVarB = decoder.b(descriptor2);
            int i10 = 1;
            w1 w1Var = null;
            if (cVarB.p()) {
                objN = cVarB.n(descriptor2, 0, h0.f22862a, null);
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
                        objN = cVarB.n(descriptor2, 0, h0.f22862a, objN);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarB.c(descriptor2);
            return new d(i10, (Float) objN, w1Var);
        }

        @Override // kotlinx.serialization.e
        public void serialize(@NotNull y9.f encoder, @NotNull d value) {
            p.e(encoder, "encoder");
            p.e(value, "value");
            f descriptor2 = getDescriptor();
            y9.d dVarB = encoder.b(descriptor2);
            d.write$Self(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }
    }

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        @NotNull
        public final kotlinx.serialization.b serializer() {
            return a.INSTANCE;
        }

        private b() {
        }
    }

    public d() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull d self, @NotNull y9.d output, @NotNull f serialDesc) {
        p.e(self, "self");
        p.e(output, "output");
        p.e(serialDesc, "serialDesc");
        if (!output.z(serialDesc, 0) && self.levelPercentile == null) {
            return;
        }
        output.i(serialDesc, 0, h0.f22862a, self.levelPercentile);
    }

    @NotNull
    public final d setLevelPercentile(float f10) {
        if (r.INSTANCE.isInRange(f10, 0.0f, 100.0f)) {
            this.levelPercentile = Float.valueOf(f10);
        }
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final d setPage(@NotNull String page) {
        p.e(page, "page");
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final d setUserID(@NotNull String userID) {
        p.e(userID, "userID");
        return this;
    }

    @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ d(int i10, @SerialName("level_percentile") Float f10, w1 w1Var) {
        if ((i10 & 1) == 0) {
            this.levelPercentile = null;
        } else {
            this.levelPercentile = f10;
        }
    }

    @SerialName("level_percentile")
    private static /* synthetic */ void getLevelPercentile$annotations() {
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final d setFriends(@Nullable List<String> list) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final d setHealthPercentile(float f10) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final d setInGamePurchasesUSD(float f10) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final d setSessionDuration(int i10) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final d setSessionStartTime(int i10) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final d setSignupDate(int i10) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final d setTimeSpent(int i10) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final d setUserLevelPercentile(float f10) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final d setUserScorePercentile(float f10) {
        return this;
    }
}
