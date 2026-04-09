package o7;

import com.vungle.ads.internal.util.r;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.p;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.h0;
import kotlinx.serialization.internal.i;
import kotlinx.serialization.internal.i0;
import kotlinx.serialization.internal.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y9.e;

/* loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final b Companion = new b(null);

    @Nullable
    private Float iaaRevenueUSD;

    @Nullable
    private Float iapRevenueUSD;

    @Nullable
    private Boolean isUserAPurchaser;

    @Nullable
    private Float totalRevenueUSD;

    public static final class a implements i0 {

        @NotNull
        public static final a INSTANCE;
        public static final /* synthetic */ f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.fpd.Revenue", aVar, 4);
            pluginGeneratedSerialDescriptor.k("iaa_revenue_usd", true);
            pluginGeneratedSerialDescriptor.k("iap_revenue_usd", true);
            pluginGeneratedSerialDescriptor.k("total_revenue_usd", true);
            pluginGeneratedSerialDescriptor.k("is_user_a_purchaser", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] childSerializers() {
            h0 h0Var = h0.f22862a;
            return new kotlinx.serialization.b[]{x9.a.s(h0Var), x9.a.s(h0Var), x9.a.s(h0Var), x9.a.s(i.f22868a)};
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
        public c deserialize(@NotNull e decoder) {
            Object objN;
            int i10;
            Object objN2;
            Object objN3;
            Object objN4;
            p.e(decoder, "decoder");
            f descriptor2 = getDescriptor();
            y9.c cVarB = decoder.b(descriptor2);
            Object objN5 = null;
            if (cVarB.p()) {
                h0 h0Var = h0.f22862a;
                objN2 = cVarB.n(descriptor2, 0, h0Var, null);
                Object objN6 = cVarB.n(descriptor2, 1, h0Var, null);
                objN3 = cVarB.n(descriptor2, 2, h0Var, null);
                objN4 = cVarB.n(descriptor2, 3, i.f22868a, null);
                objN = objN6;
                i10 = 15;
            } else {
                boolean z10 = true;
                int i11 = 0;
                objN = null;
                Object objN7 = null;
                Object objN8 = null;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    if (iO == -1) {
                        z10 = false;
                    } else if (iO == 0) {
                        objN5 = cVarB.n(descriptor2, 0, h0.f22862a, objN5);
                        i11 |= 1;
                    } else if (iO == 1) {
                        objN = cVarB.n(descriptor2, 1, h0.f22862a, objN);
                        i11 |= 2;
                    } else if (iO == 2) {
                        objN7 = cVarB.n(descriptor2, 2, h0.f22862a, objN7);
                        i11 |= 4;
                    } else {
                        if (iO != 3) {
                            throw new UnknownFieldException(iO);
                        }
                        objN8 = cVarB.n(descriptor2, 3, i.f22868a, objN8);
                        i11 |= 8;
                    }
                }
                i10 = i11;
                objN2 = objN5;
                objN3 = objN7;
                objN4 = objN8;
            }
            cVarB.c(descriptor2);
            return new c(i10, (Float) objN2, (Float) objN, (Float) objN3, (Boolean) objN4, null);
        }

        @Override // kotlinx.serialization.e
        public void serialize(@NotNull y9.f encoder, @NotNull c value) {
            p.e(encoder, "encoder");
            p.e(value, "value");
            f descriptor2 = getDescriptor();
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

    public c() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull c self, @NotNull y9.d output, @NotNull f serialDesc) {
        p.e(self, "self");
        p.e(output, "output");
        p.e(serialDesc, "serialDesc");
        if (output.z(serialDesc, 0) || self.iaaRevenueUSD != null) {
            output.i(serialDesc, 0, h0.f22862a, self.iaaRevenueUSD);
        }
        if (output.z(serialDesc, 1) || self.iapRevenueUSD != null) {
            output.i(serialDesc, 1, h0.f22862a, self.iapRevenueUSD);
        }
        if (output.z(serialDesc, 2) || self.totalRevenueUSD != null) {
            output.i(serialDesc, 2, h0.f22862a, self.totalRevenueUSD);
        }
        if (!output.z(serialDesc, 3) && self.isUserAPurchaser == null) {
            return;
        }
        output.i(serialDesc, 3, i.f22868a, self.isUserAPurchaser);
    }

    @NotNull
    public final c setIAARevenueUSD(float f10) {
        if (r.isInRange$default(r.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.iaaRevenueUSD = Float.valueOf(f10);
        }
        return this;
    }

    @NotNull
    public final c setIAPRevenueUSD(float f10) {
        if (r.isInRange$default(r.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.iapRevenueUSD = Float.valueOf(f10);
        }
        return this;
    }

    @NotNull
    public final c setIsUserAPurchaser(boolean z10) {
        this.isUserAPurchaser = Boolean.valueOf(z10);
        return this;
    }

    @NotNull
    public final c setTotalRevenueUSD(float f10) {
        if (r.isInRange$default(r.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.totalRevenueUSD = Float.valueOf(f10);
        }
        return this;
    }

    @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ c(int i10, @SerialName("iaa_revenue_usd") Float f10, @SerialName("iap_revenue_usd") Float f11, @SerialName("total_revenue_usd") Float f12, @SerialName("is_user_a_purchaser") Boolean bool, w1 w1Var) {
        if ((i10 & 1) == 0) {
            this.iaaRevenueUSD = null;
        } else {
            this.iaaRevenueUSD = f10;
        }
        if ((i10 & 2) == 0) {
            this.iapRevenueUSD = null;
        } else {
            this.iapRevenueUSD = f11;
        }
        if ((i10 & 4) == 0) {
            this.totalRevenueUSD = null;
        } else {
            this.totalRevenueUSD = f12;
        }
        if ((i10 & 8) == 0) {
            this.isUserAPurchaser = null;
        } else {
            this.isUserAPurchaser = bool;
        }
    }

    @SerialName("iaa_revenue_usd")
    private static /* synthetic */ void getIaaRevenueUSD$annotations() {
    }

    @SerialName("iap_revenue_usd")
    private static /* synthetic */ void getIapRevenueUSD$annotations() {
    }

    @SerialName("total_revenue_usd")
    private static /* synthetic */ void getTotalRevenueUSD$annotations() {
    }

    @SerialName("is_user_a_purchaser")
    private static /* synthetic */ void isUserAPurchaser$annotations() {
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final c setEarningsByPlacement(float f10) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final c setIsUserASubscriber(boolean z10) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final c setLast30DaysMeanSpendUsd(float f10) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final c setLast30DaysMedianSpendUsd(float f10) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final c setLast30DaysPlacementFillRate(float f10) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final c setLast30DaysTotalSpendUsd(float f10) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final c setLast30DaysUserLtvUsd(float f10) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final c setLast30DaysUserPltvUsd(float f10) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final c setLast7DaysMeanSpendUsd(float f10) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final c setLast7DaysMedianSpendUsd(float f10) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final c setLast7DaysPlacementFillRate(float f10) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final c setLast7DaysTotalSpendUsd(float f10) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final c setLast7DaysUserLtvUsd(float f10) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final c setLast7DaysUserPltvUsd(float f10) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final c setTopNAdomain(@Nullable List<String> list) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final c setTotalEarningsUsd(float f10) {
        return this;
    }
}
