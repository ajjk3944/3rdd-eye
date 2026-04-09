package com.vungle.ads.fpd;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.t;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b2;
import kotlinx.serialization.internal.i0;
import kotlinx.serialization.internal.v0;
import kotlinx.serialization.internal.w1;
import l9.l;
import o7.a;
import o7.b;
import o7.c;
import o7.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;
import y9.e;
import z9.c;
import z9.k;

/* loaded from: classes3.dex */
public final class FirstPartyData {

    @NotNull
    public static final b Companion = new b(null);

    @NotNull
    private static final z9.a JSON = k.b(null, new l() { // from class: com.vungle.ads.fpd.FirstPartyData$Companion$JSON$1
        @Override // l9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((c) obj);
            return s.f25199a;
        }

        public final void invoke(@NotNull c Json) {
            p.e(Json, "$this$Json");
            Json.g(true);
            Json.e(false);
            Json.d(false);
        }
    }, 1, null);

    @NotNull
    private static final String MODEL_VERSION = "2.0";

    @Nullable
    private Map<String, String> _customData;

    @Nullable
    private volatile o7.a _demographic;

    @Nullable
    private volatile o7.b _location;

    @Nullable
    private volatile o7.c _revenue;

    @Nullable
    private volatile d _sessionContext;

    @NotNull
    private final String modelVersion;

    public static final class a implements i0 {

        @NotNull
        public static final a INSTANCE;
        public static final /* synthetic */ f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.fpd.FirstPartyData", aVar, 6);
            pluginGeneratedSerialDescriptor.k("model_version", true);
            pluginGeneratedSerialDescriptor.k("session_context", true);
            pluginGeneratedSerialDescriptor.k("demographic", true);
            pluginGeneratedSerialDescriptor.k("location", true);
            pluginGeneratedSerialDescriptor.k("revenue", true);
            pluginGeneratedSerialDescriptor.k("custom_data", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] childSerializers() {
            b2 b2Var = b2.f22828a;
            return new kotlinx.serialization.b[]{b2Var, x9.a.s(d.a.INSTANCE), x9.a.s(a.C0449a.INSTANCE), x9.a.s(b.a.INSTANCE), x9.a.s(c.a.INSTANCE), x9.a.s(new v0(b2Var, b2Var))};
        }

        @Override // kotlinx.serialization.a
        @NotNull
        public FirstPartyData deserialize(@NotNull e decoder) {
            int i10;
            String str;
            Object objN;
            Object objN2;
            Object objN3;
            Object objN4;
            Object objN5;
            p.e(decoder, "decoder");
            f descriptor2 = getDescriptor();
            y9.c cVarB = decoder.b(descriptor2);
            boolean z10 = true;
            String strM = null;
            if (cVarB.p()) {
                String strM2 = cVarB.m(descriptor2, 0);
                objN = cVarB.n(descriptor2, 1, d.a.INSTANCE, null);
                objN2 = cVarB.n(descriptor2, 2, a.C0449a.INSTANCE, null);
                objN3 = cVarB.n(descriptor2, 3, b.a.INSTANCE, null);
                objN4 = cVarB.n(descriptor2, 4, c.a.INSTANCE, null);
                b2 b2Var = b2.f22828a;
                objN5 = cVarB.n(descriptor2, 5, new v0(b2Var, b2Var), null);
                str = strM2;
                i10 = 63;
            } else {
                boolean z11 = true;
                int i11 = 0;
                Object objN6 = null;
                Object objN7 = null;
                Object objN8 = null;
                Object objN9 = null;
                Object objN10 = null;
                while (z11) {
                    int iO = cVarB.o(descriptor2);
                    switch (iO) {
                        case -1:
                            z11 = false;
                            z10 = z10;
                        case 0:
                            strM = cVarB.m(descriptor2, 0);
                            i11 |= 1;
                            z10 = z10;
                        case 1:
                            objN6 = cVarB.n(descriptor2, 1, d.a.INSTANCE, objN6);
                            i11 |= 2;
                            z10 = true;
                        case 2:
                            objN7 = cVarB.n(descriptor2, 2, a.C0449a.INSTANCE, objN7);
                            i11 |= 4;
                            z10 = true;
                        case 3:
                            objN8 = cVarB.n(descriptor2, 3, b.a.INSTANCE, objN8);
                            i11 |= 8;
                            z10 = true;
                        case 4:
                            objN9 = cVarB.n(descriptor2, 4, c.a.INSTANCE, objN9);
                            i11 |= 16;
                            z10 = true;
                        case 5:
                            b2 b2Var2 = b2.f22828a;
                            objN10 = cVarB.n(descriptor2, 5, new v0(b2Var2, b2Var2), objN10);
                            i11 |= 32;
                            z10 = true;
                        default:
                            throw new UnknownFieldException(iO);
                    }
                }
                i10 = i11;
                str = strM;
                objN = objN6;
                objN2 = objN7;
                objN3 = objN8;
                objN4 = objN9;
                objN5 = objN10;
            }
            cVarB.c(descriptor2);
            return new FirstPartyData(i10, str, (d) objN, (o7.a) objN2, (o7.b) objN3, (o7.c) objN4, (Map) objN5, null);
        }

        @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
        @NotNull
        public f getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.e
        public void serialize(@NotNull y9.f encoder, @NotNull FirstPartyData value) {
            p.e(encoder, "encoder");
            p.e(value, "value");
            f descriptor2 = getDescriptor();
            y9.d dVarB = encoder.b(descriptor2);
            FirstPartyData.write$Self(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] typeParametersSerializers() {
            return i0.a.a(this);
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

    public FirstPartyData() {
        this.modelVersion = "2.0";
    }

    @SerialName("model_version")
    private static /* synthetic */ void getModelVersion$annotations() {
    }

    @SerialName("custom_data")
    private static /* synthetic */ void get_customData$annotations() {
    }

    @SerialName("demographic")
    private static /* synthetic */ void get_demographic$annotations() {
    }

    @SerialName("location")
    private static /* synthetic */ void get_location$annotations() {
    }

    @SerialName("revenue")
    private static /* synthetic */ void get_revenue$annotations() {
    }

    @SerialName("session_context")
    private static /* synthetic */ void get_sessionContext$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull FirstPartyData self, @NotNull y9.d output, @NotNull f serialDesc) {
        p.e(self, "self");
        p.e(output, "output");
        p.e(serialDesc, "serialDesc");
        if (output.z(serialDesc, 0) || !p.a(self.modelVersion, "2.0")) {
            output.y(serialDesc, 0, self.modelVersion);
        }
        if (output.z(serialDesc, 1) || self._sessionContext != null) {
            output.i(serialDesc, 1, d.a.INSTANCE, self._sessionContext);
        }
        if (output.z(serialDesc, 2) || self._demographic != null) {
            output.i(serialDesc, 2, a.C0449a.INSTANCE, self._demographic);
        }
        if (output.z(serialDesc, 3) || self._location != null) {
            output.i(serialDesc, 3, b.a.INSTANCE, self._location);
        }
        if (output.z(serialDesc, 4) || self._revenue != null) {
            output.i(serialDesc, 4, c.a.INSTANCE, self._revenue);
        }
        if (!output.z(serialDesc, 5) && self._customData == null) {
            return;
        }
        b2 b2Var = b2.f22828a;
        output.i(serialDesc, 5, new v0(b2Var, b2Var), self._customData);
    }

    public final synchronized void clearAll() {
        try {
            this._sessionContext = null;
            this._demographic = null;
            this._revenue = null;
            this._location = null;
            Map<String, String> map = this._customData;
            if (map != null) {
                map.clear();
            }
            this._customData = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @NotNull
    public final String debug() {
        z9.a aVar = JSON;
        kotlinx.serialization.b bVarB = kotlinx.serialization.f.b(aVar.a(), t.m(FirstPartyData.class));
        p.c(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return aVar.c(bVarB, this);
    }

    @NotNull
    public final synchronized Map<String, String> getCustomData() {
        Map<String, String> concurrentHashMap;
        concurrentHashMap = this._customData;
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
            this._customData = concurrentHashMap;
        }
        return concurrentHashMap;
    }

    @NotNull
    public final synchronized o7.a getDemographic() {
        o7.a aVar;
        aVar = this._demographic;
        if (aVar == null) {
            aVar = new o7.a();
            this._demographic = aVar;
        }
        return aVar;
    }

    @NotNull
    public final synchronized o7.b getLocation() {
        o7.b bVar;
        bVar = this._location;
        if (bVar == null) {
            bVar = new o7.b();
            this._location = bVar;
        }
        return bVar;
    }

    @NotNull
    public final synchronized o7.c getRevenue() {
        o7.c cVar;
        cVar = this._revenue;
        if (cVar == null) {
            cVar = new o7.c();
            this._revenue = cVar;
        }
        return cVar;
    }

    @NotNull
    public final synchronized d getSessionContext() {
        d dVar;
        dVar = this._sessionContext;
        if (dVar == null) {
            dVar = new d();
            this._sessionContext = dVar;
        }
        return dVar;
    }

    @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ FirstPartyData(int i10, @SerialName("model_version") String str, @SerialName("session_context") d dVar, @SerialName("demographic") o7.a aVar, @SerialName("location") o7.b bVar, @SerialName("revenue") o7.c cVar, @SerialName("custom_data") Map map, w1 w1Var) {
        this.modelVersion = (i10 & 1) == 0 ? "2.0" : str;
        if ((i10 & 2) == 0) {
            this._sessionContext = null;
        } else {
            this._sessionContext = dVar;
        }
        if ((i10 & 4) == 0) {
            this._demographic = null;
        } else {
            this._demographic = aVar;
        }
        if ((i10 & 8) == 0) {
            this._location = null;
        } else {
            this._location = bVar;
        }
        if ((i10 & 16) == 0) {
            this._revenue = null;
        } else {
            this._revenue = cVar;
        }
        if ((i10 & 32) == 0) {
            this._customData = null;
        } else {
            this._customData = map;
        }
    }
}
