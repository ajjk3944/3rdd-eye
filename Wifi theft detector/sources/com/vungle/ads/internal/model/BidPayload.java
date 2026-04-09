package com.vungle.ads.internal.model;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.t;
import kotlinx.serialization.Transient;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b2;
import kotlinx.serialization.internal.i0;
import kotlinx.serialization.internal.r0;
import kotlinx.serialization.internal.w1;
import l9.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q7.a;
import y8.s;
import y9.c;
import y9.d;
import y9.e;
import z9.k;

/* loaded from: classes3.dex */
public final class BidPayload {

    @NotNull
    public static final b Companion = new b(null);

    @Nullable
    private final q7.a ad;

    @Nullable
    private final String adunit;

    @Nullable
    private final List<String> impression;

    @NotNull
    private final z9.a json;

    @Nullable
    private final Integer version;

    public static final class a implements i0 {

        @NotNull
        public static final a INSTANCE;
        public static final /* synthetic */ f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.BidPayload", aVar, 4);
            pluginGeneratedSerialDescriptor.k("version", true);
            pluginGeneratedSerialDescriptor.k("adunit", true);
            pluginGeneratedSerialDescriptor.k("impression", true);
            pluginGeneratedSerialDescriptor.k("ad", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] childSerializers() {
            kotlinx.serialization.b bVarS = x9.a.s(r0.f22908a);
            b2 b2Var = b2.f22828a;
            return new kotlinx.serialization.b[]{bVarS, x9.a.s(b2Var), x9.a.s(new kotlinx.serialization.internal.f(b2Var)), x9.a.s(a.C0460a.INSTANCE)};
        }

        @Override // kotlinx.serialization.a
        @NotNull
        public BidPayload deserialize(@NotNull e decoder) {
            int i10;
            Object objN;
            Object objN2;
            Object objN3;
            Object objN4;
            p.e(decoder, "decoder");
            f descriptor2 = getDescriptor();
            c cVarB = decoder.b(descriptor2);
            Object objN5 = null;
            if (cVarB.p()) {
                objN = cVarB.n(descriptor2, 0, r0.f22908a, null);
                b2 b2Var = b2.f22828a;
                objN2 = cVarB.n(descriptor2, 1, b2Var, null);
                objN3 = cVarB.n(descriptor2, 2, new kotlinx.serialization.internal.f(b2Var), null);
                objN4 = cVarB.n(descriptor2, 3, a.C0460a.INSTANCE, null);
                i10 = 15;
            } else {
                boolean z10 = true;
                int i11 = 0;
                Object objN6 = null;
                Object objN7 = null;
                Object objN8 = null;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    if (iO == -1) {
                        z10 = false;
                    } else if (iO == 0) {
                        objN5 = cVarB.n(descriptor2, 0, r0.f22908a, objN5);
                        i11 |= 1;
                    } else if (iO == 1) {
                        objN6 = cVarB.n(descriptor2, 1, b2.f22828a, objN6);
                        i11 |= 2;
                    } else if (iO == 2) {
                        objN7 = cVarB.n(descriptor2, 2, new kotlinx.serialization.internal.f(b2.f22828a), objN7);
                        i11 |= 4;
                    } else {
                        if (iO != 3) {
                            throw new UnknownFieldException(iO);
                        }
                        objN8 = cVarB.n(descriptor2, 3, a.C0460a.INSTANCE, objN8);
                        i11 |= 8;
                    }
                }
                Object obj = objN5;
                i10 = i11;
                objN = obj;
                objN2 = objN6;
                objN3 = objN7;
                objN4 = objN8;
            }
            cVarB.c(descriptor2);
            return new BidPayload(i10, (Integer) objN, (String) objN2, (List) objN3, (q7.a) objN4, null);
        }

        @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
        @NotNull
        public f getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.e
        public void serialize(@NotNull y9.f encoder, @NotNull BidPayload value) {
            p.e(encoder, "encoder");
            p.e(value, "value");
            f descriptor2 = getDescriptor();
            d dVarB = encoder.b(descriptor2);
            BidPayload.write$Self(value, dVarB, descriptor2);
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

    public BidPayload() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BidPayload copy$default(BidPayload bidPayload, Integer num, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = bidPayload.version;
        }
        if ((i10 & 2) != 0) {
            str = bidPayload.adunit;
        }
        if ((i10 & 4) != 0) {
            list = bidPayload.impression;
        }
        return bidPayload.copy(num, str, list);
    }

    @Transient
    private static /* synthetic */ void getJson$annotations() {
    }

    private final String gzipDecode(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 1024);
            try {
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int i10 = gZIPInputStream.read(bArr2);
                    if (i10 == -1) {
                        s sVar = s.f25199a;
                        i9.b.a(gZIPInputStream, null);
                        i9.b.a(byteArrayInputStream, null);
                        String string = byteArrayOutputStream.toString();
                        p.d(string, "result.toString()");
                        return string;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i10);
                }
            } finally {
            }
        } finally {
        }
    }

    @JvmStatic
    public static final void write$Self(@NotNull BidPayload self, @NotNull d output, @NotNull f serialDesc) {
        String decodedAdsResponse;
        p.e(self, "self");
        p.e(output, "output");
        p.e(serialDesc, "serialDesc");
        if (output.z(serialDesc, 0) || self.version != null) {
            output.i(serialDesc, 0, r0.f22908a, self.version);
        }
        if (output.z(serialDesc, 1) || self.adunit != null) {
            output.i(serialDesc, 1, b2.f22828a, self.adunit);
        }
        if (output.z(serialDesc, 2) || self.impression != null) {
            output.i(serialDesc, 2, new kotlinx.serialization.internal.f(b2.f22828a), self.impression);
        }
        if (!output.z(serialDesc, 3)) {
            q7.a aVar = self.ad;
            q7.a aVar2 = null;
            if (self.adunit != null && (decodedAdsResponse = self.getDecodedAdsResponse()) != null) {
                z9.a aVar3 = self.json;
                kotlinx.serialization.b bVarB = kotlinx.serialization.f.b(aVar3.a(), t.m(q7.a.class));
                p.c(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                aVar2 = (q7.a) aVar3.b(bVarB, decodedAdsResponse);
            }
            if (p.a(aVar, aVar2)) {
                return;
            }
        }
        output.i(serialDesc, 3, a.C0460a.INSTANCE, self.ad);
    }

    @Nullable
    public final Integer component1() {
        return this.version;
    }

    @Nullable
    public final String component2() {
        return this.adunit;
    }

    @Nullable
    public final List<String> component3() {
        return this.impression;
    }

    @NotNull
    public final BidPayload copy(@Nullable Integer num, @Nullable String str, @Nullable List<String> list) {
        return new BidPayload(num, str, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BidPayload)) {
            return false;
        }
        BidPayload bidPayload = (BidPayload) obj;
        return p.a(this.version, bidPayload.version) && p.a(this.adunit, bidPayload.adunit) && p.a(this.impression, bidPayload.impression);
    }

    @Nullable
    public final q7.a getAdPayload() {
        return this.ad;
    }

    @Nullable
    public final String getAdunit() {
        return this.adunit;
    }

    @Nullable
    public final String getCreativeId() {
        q7.a aVar = this.ad;
        if (aVar != null) {
            return aVar.getCreativeId();
        }
        return null;
    }

    @Nullable
    public final String getDecodedAdsResponse() throws Throwable {
        byte[] bArrDecode = Base64.decode(this.adunit, 0);
        if (bArrDecode != null) {
            return gzipDecode(bArrDecode);
        }
        return null;
    }

    @Nullable
    public final String getEventId() {
        q7.a aVar = this.ad;
        if (aVar != null) {
            return aVar.eventId();
        }
        return null;
    }

    @Nullable
    public final List<String> getImpression() {
        return this.impression;
    }

    @Nullable
    public final String getPlacementId() {
        q7.a aVar = this.ad;
        if (aVar != null) {
            return aVar.placementId();
        }
        return null;
    }

    @Nullable
    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        Integer num = this.version;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.adunit;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.impression;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BidPayload(version=" + this.version + ", adunit=" + this.adunit + ", impression=" + this.impression + ')';
    }

    @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ BidPayload(int i10, Integer num, String str, List list, q7.a aVar, w1 w1Var) {
        String decodedAdsResponse;
        q7.a aVar2 = null;
        if ((i10 & 1) == 0) {
            this.version = null;
        } else {
            this.version = num;
        }
        if ((i10 & 2) == 0) {
            this.adunit = null;
        } else {
            this.adunit = str;
        }
        if ((i10 & 4) == 0) {
            this.impression = null;
        } else {
            this.impression = list;
        }
        z9.a aVarB = k.b(null, new l() { // from class: com.vungle.ads.internal.model.BidPayload.1
            @Override // l9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((z9.c) obj);
                return s.f25199a;
            }

            public final void invoke(@NotNull z9.c Json) {
                p.e(Json, "$this$Json");
                Json.f(true);
                Json.d(true);
                Json.e(false);
            }
        }, 1, null);
        this.json = aVarB;
        if ((i10 & 8) != 0) {
            this.ad = aVar;
            return;
        }
        if (this.adunit != null && (decodedAdsResponse = getDecodedAdsResponse()) != null) {
            kotlinx.serialization.b bVarB = kotlinx.serialization.f.b(aVarB.a(), t.m(q7.a.class));
            p.c(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            aVar2 = (q7.a) aVarB.b(bVarB, decodedAdsResponse);
        }
        this.ad = aVar2;
    }

    public BidPayload(@Nullable Integer num, @Nullable String str, @Nullable List<String> list) {
        String decodedAdsResponse;
        this.version = num;
        this.adunit = str;
        this.impression = list;
        q7.a aVar = null;
        z9.a aVarB = k.b(null, new l() { // from class: com.vungle.ads.internal.model.BidPayload$json$1
            @Override // l9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((z9.c) obj);
                return s.f25199a;
            }

            public final void invoke(@NotNull z9.c Json) {
                p.e(Json, "$this$Json");
                Json.f(true);
                Json.d(true);
                Json.e(false);
            }
        }, 1, null);
        this.json = aVarB;
        if (str != null && (decodedAdsResponse = getDecodedAdsResponse()) != null) {
            kotlinx.serialization.b bVarB = kotlinx.serialization.f.b(aVarB.a(), t.m(q7.a.class));
            p.c(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            aVar = (q7.a) aVarB.b(bVarB, decodedAdsResponse);
        }
        this.ad = aVar;
    }

    public /* synthetic */ BidPayload(Integer num, String str, List list, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : list);
    }
}
