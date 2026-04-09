package o7;

import com.vungle.ads.fpd.AgeRange;
import com.vungle.ads.fpd.LiftoffGender;
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
import kotlinx.serialization.internal.i0;
import kotlinx.serialization.internal.r0;
import kotlinx.serialization.internal.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y9.e;

/* loaded from: classes3.dex */
public final class a {

    @NotNull
    public static final b Companion = new b(null);

    @Nullable
    private Integer ageRange;

    @Nullable
    private Integer gender;

    /* renamed from: o7.a$a, reason: collision with other inner class name */
    public static final class C0449a implements i0 {

        @NotNull
        public static final C0449a INSTANCE;
        public static final /* synthetic */ f descriptor;

        static {
            C0449a c0449a = new C0449a();
            INSTANCE = c0449a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.fpd.Demographic", c0449a, 2);
            pluginGeneratedSerialDescriptor.k("age_range", true);
            pluginGeneratedSerialDescriptor.k("gender", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C0449a() {
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] childSerializers() {
            r0 r0Var = r0.f22908a;
            return new kotlinx.serialization.b[]{x9.a.s(r0Var), x9.a.s(r0Var)};
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
        public a deserialize(@NotNull e decoder) {
            Object objN;
            int i10;
            Object objN2;
            p.e(decoder, "decoder");
            f descriptor2 = getDescriptor();
            y9.c cVarB = decoder.b(descriptor2);
            w1 w1Var = null;
            if (cVarB.p()) {
                r0 r0Var = r0.f22908a;
                objN2 = cVarB.n(descriptor2, 0, r0Var, null);
                objN = cVarB.n(descriptor2, 1, r0Var, null);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                objN = null;
                Object objN3 = null;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    if (iO == -1) {
                        z10 = false;
                    } else if (iO == 0) {
                        objN3 = cVarB.n(descriptor2, 0, r0.f22908a, objN3);
                        i11 |= 1;
                    } else {
                        if (iO != 1) {
                            throw new UnknownFieldException(iO);
                        }
                        objN = cVarB.n(descriptor2, 1, r0.f22908a, objN);
                        i11 |= 2;
                    }
                }
                i10 = i11;
                objN2 = objN3;
            }
            cVarB.c(descriptor2);
            return new a(i10, (Integer) objN2, (Integer) objN, w1Var);
        }

        @Override // kotlinx.serialization.e
        public void serialize(@NotNull y9.f encoder, @NotNull a value) {
            p.e(encoder, "encoder");
            p.e(value, "value");
            f descriptor2 = getDescriptor();
            y9.d dVarB = encoder.b(descriptor2);
            a.write$Self(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }
    }

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        @NotNull
        public final kotlinx.serialization.b serializer() {
            return C0449a.INSTANCE;
        }

        private b() {
        }
    }

    public a() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull a self, @NotNull y9.d output, @NotNull f serialDesc) {
        p.e(self, "self");
        p.e(output, "output");
        p.e(serialDesc, "serialDesc");
        if (output.z(serialDesc, 0) || self.ageRange != null) {
            output.i(serialDesc, 0, r0.f22908a, self.ageRange);
        }
        if (!output.z(serialDesc, 1) && self.gender == null) {
            return;
        }
        output.i(serialDesc, 1, r0.f22908a, self.gender);
    }

    @NotNull
    public final a setAgeRange(int i10) {
        this.ageRange = Integer.valueOf(AgeRange.INSTANCE.fromAge$vungle_ads_release(i10).getId());
        return this;
    }

    @NotNull
    public final a setGender(@NotNull LiftoffGender gender) {
        p.e(gender, "gender");
        this.gender = Integer.valueOf(gender.getValue());
        return this;
    }

    @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ a(int i10, @SerialName("age_range") Integer num, @SerialName("gender") Integer num2, w1 w1Var) {
        if ((i10 & 1) == 0) {
            this.ageRange = null;
        } else {
            this.ageRange = num;
        }
        if ((i10 & 2) == 0) {
            this.gender = null;
        } else {
            this.gender = num2;
        }
    }

    @SerialName("age_range")
    private static /* synthetic */ void getAgeRange$annotations() {
    }

    @SerialName("gender")
    private static /* synthetic */ void getGender$annotations() {
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final a setLengthOfResidence(int i10) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final a setMedianHomeValueUSD(int i10) {
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final a setMonthlyHousingCosts(int i10) {
        return this;
    }
}
