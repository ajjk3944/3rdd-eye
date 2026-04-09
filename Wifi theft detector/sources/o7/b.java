package o7;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.i0;
import kotlinx.serialization.internal.w1;
import org.jetbrains.annotations.NotNull;
import y9.e;

/* loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final C0450b Companion = new C0450b(null);

    public static final class a implements i0 {

        @NotNull
        public static final a INSTANCE;
        public static final /* synthetic */ f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            descriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.fpd.Location", aVar, 0);
        }

        private a() {
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] childSerializers() {
            return new kotlinx.serialization.b[0];
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
        public b deserialize(@NotNull e decoder) {
            int iO;
            p.e(decoder, "decoder");
            f descriptor2 = getDescriptor();
            y9.c cVarB = decoder.b(descriptor2);
            if (!cVarB.p() && (iO = cVarB.o(descriptor2)) != -1) {
                throw new UnknownFieldException(iO);
            }
            cVarB.c(descriptor2);
            return new b(0, null);
        }

        @Override // kotlinx.serialization.e
        public void serialize(@NotNull y9.f encoder, @NotNull b value) {
            p.e(encoder, "encoder");
            p.e(value, "value");
            f descriptor2 = getDescriptor();
            y9.d dVarB = encoder.b(descriptor2);
            b.write$Self(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }
    }

    /* renamed from: o7.b$b, reason: collision with other inner class name */
    public static final class C0450b {
        public /* synthetic */ C0450b(i iVar) {
            this();
        }

        @NotNull
        public final kotlinx.serialization.b serializer() {
            return a.INSTANCE;
        }

        private C0450b() {
        }
    }

    public b() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull b self, @NotNull y9.d output, @NotNull f serialDesc) {
        p.e(self, "self");
        p.e(output, "output");
        p.e(serialDesc, "serialDesc");
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final b setCountry(@NotNull String country) {
        p.e(country, "country");
        return this;
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final b setRegionState(@NotNull String regionState) {
        p.e(regionState, "regionState");
        return this;
    }

    @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ b(int i10, w1 w1Var) {
    }

    @Deprecated(message = "Will be deprecated", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @NotNull
    public final b setDma(int i10) {
        return this;
    }
}
