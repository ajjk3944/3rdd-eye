package com.vungle.ads.internal.network;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.internal.network.HttpMethod;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.p;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b2;
import kotlinx.serialization.internal.i0;
import kotlinx.serialization.internal.m1;
import kotlinx.serialization.internal.r0;
import kotlinx.serialization.internal.v0;
import kotlinx.serialization.internal.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final b Companion = new b(null);

    @Nullable
    private final String body;

    @Nullable
    private final Map<String, String> headers;

    @NotNull
    private final HttpMethod method;
    private int retryAttempt;
    private int retryCount;

    @Nullable
    private String tpatKey;

    public static final class a implements i0 {

        @NotNull
        public static final a INSTANCE;
        public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.network.FailedTpat", aVar, 6);
            pluginGeneratedSerialDescriptor.k("method", true);
            pluginGeneratedSerialDescriptor.k("headers", true);
            pluginGeneratedSerialDescriptor.k(TtmlNode.TAG_BODY, true);
            pluginGeneratedSerialDescriptor.k("retryAttempt", true);
            pluginGeneratedSerialDescriptor.k("retryCount", false);
            pluginGeneratedSerialDescriptor.k("tpatKey", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] childSerializers() {
            b2 b2Var = b2.f22828a;
            kotlinx.serialization.b bVarS = x9.a.s(new v0(b2Var, b2Var));
            kotlinx.serialization.b bVarS2 = x9.a.s(b2Var);
            kotlinx.serialization.b bVarS3 = x9.a.s(b2Var);
            r0 r0Var = r0.f22908a;
            return new kotlinx.serialization.b[]{HttpMethod.a.INSTANCE, bVarS, bVarS2, r0Var, r0Var, bVarS3};
        }

        @Override // kotlinx.serialization.a
        @NotNull
        public c deserialize(@NotNull y9.e decoder) {
            int i10;
            Object objN;
            Object objN2;
            Object objN3;
            int i11;
            int i12;
            Object objY;
            p.e(decoder, "decoder");
            kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
            y9.c cVarB = decoder.b(descriptor2);
            int i13 = 5;
            if (cVarB.p()) {
                objY = cVarB.y(descriptor2, 0, HttpMethod.a.INSTANCE, null);
                b2 b2Var = b2.f22828a;
                objN = cVarB.n(descriptor2, 1, new v0(b2Var, b2Var), null);
                objN2 = cVarB.n(descriptor2, 2, b2Var, null);
                int i14 = cVarB.i(descriptor2, 3);
                int i15 = cVarB.i(descriptor2, 4);
                objN3 = cVarB.n(descriptor2, 5, b2Var, null);
                i12 = i14;
                i11 = i15;
                i10 = 63;
            } else {
                boolean z10 = true;
                int i16 = 0;
                int i17 = 0;
                Object objY2 = null;
                Object objN4 = null;
                Object objN5 = null;
                Object objN6 = null;
                int i18 = 0;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    switch (iO) {
                        case -1:
                            z10 = false;
                            continue;
                        case 0:
                            objY2 = cVarB.y(descriptor2, 0, HttpMethod.a.INSTANCE, objY2);
                            i17 |= 1;
                            i13 = 5;
                            continue;
                        case 1:
                            b2 b2Var2 = b2.f22828a;
                            objN4 = cVarB.n(descriptor2, 1, new v0(b2Var2, b2Var2), objN4);
                            i17 |= 2;
                            i13 = 5;
                            break;
                        case 2:
                            objN5 = cVarB.n(descriptor2, 2, b2.f22828a, objN5);
                            i17 |= 4;
                            break;
                        case 3:
                            i16 = cVarB.i(descriptor2, 3);
                            i17 |= 8;
                            break;
                        case 4:
                            i18 = cVarB.i(descriptor2, 4);
                            i17 |= 16;
                            break;
                        case 5:
                            objN6 = cVarB.n(descriptor2, i13, b2.f22828a, objN6);
                            i17 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iO);
                    }
                }
                i10 = i17;
                objN = objN4;
                objN2 = objN5;
                objN3 = objN6;
                i11 = i18;
                i12 = i16;
                objY = objY2;
            }
            cVarB.c(descriptor2);
            return new c(i10, (HttpMethod) objY, (Map) objN, (String) objN2, i12, i11, (String) objN3, (w1) null);
        }

        @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
        @NotNull
        public kotlinx.serialization.descriptors.f getDescriptor() {
            return descriptor;
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

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] typeParametersSerializers() {
            return i0.a.a(this);
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
    public /* synthetic */ c(int i10, HttpMethod httpMethod, Map map, String str, int i11, int i12, String str2, w1 w1Var) {
        if (16 != (i10 & 16)) {
            m1.a(i10, 16, a.INSTANCE.getDescriptor());
        }
        this.method = (i10 & 1) == 0 ? HttpMethod.GET : httpMethod;
        if ((i10 & 2) == 0) {
            this.headers = null;
        } else {
            this.headers = map;
        }
        if ((i10 & 4) == 0) {
            this.body = null;
        } else {
            this.body = str;
        }
        if ((i10 & 8) == 0) {
            this.retryAttempt = 0;
        } else {
            this.retryAttempt = i11;
        }
        this.retryCount = i12;
        if ((i10 & 32) == 0) {
            this.tpatKey = null;
        } else {
            this.tpatKey = str2;
        }
    }

    public static /* synthetic */ c copy$default(c cVar, HttpMethod httpMethod, Map map, String str, int i10, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            httpMethod = cVar.method;
        }
        if ((i12 & 2) != 0) {
            map = cVar.headers;
        }
        if ((i12 & 4) != 0) {
            str = cVar.body;
        }
        if ((i12 & 8) != 0) {
            i10 = cVar.retryAttempt;
        }
        if ((i12 & 16) != 0) {
            i11 = cVar.retryCount;
        }
        if ((i12 & 32) != 0) {
            str2 = cVar.tpatKey;
        }
        int i13 = i11;
        String str3 = str2;
        return cVar.copy(httpMethod, map, str, i10, i13, str3);
    }

    @JvmStatic
    public static final void write$Self(@NotNull c self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
        p.e(self, "self");
        p.e(output, "output");
        p.e(serialDesc, "serialDesc");
        if (output.z(serialDesc, 0) || self.method != HttpMethod.GET) {
            output.C(serialDesc, 0, HttpMethod.a.INSTANCE, self.method);
        }
        if (output.z(serialDesc, 1) || self.headers != null) {
            b2 b2Var = b2.f22828a;
            output.i(serialDesc, 1, new v0(b2Var, b2Var), self.headers);
        }
        if (output.z(serialDesc, 2) || self.body != null) {
            output.i(serialDesc, 2, b2.f22828a, self.body);
        }
        if (output.z(serialDesc, 3) || self.retryAttempt != 0) {
            output.w(serialDesc, 3, self.retryAttempt);
        }
        output.w(serialDesc, 4, self.retryCount);
        if (!output.z(serialDesc, 5) && self.tpatKey == null) {
            return;
        }
        output.i(serialDesc, 5, b2.f22828a, self.tpatKey);
    }

    @NotNull
    public final HttpMethod component1() {
        return this.method;
    }

    @Nullable
    public final Map<String, String> component2() {
        return this.headers;
    }

    @Nullable
    public final String component3() {
        return this.body;
    }

    public final int component4() {
        return this.retryAttempt;
    }

    public final int component5() {
        return this.retryCount;
    }

    @Nullable
    public final String component6() {
        return this.tpatKey;
    }

    @NotNull
    public final c copy(@NotNull HttpMethod method, @Nullable Map<String, String> map, @Nullable String str, int i10, int i11, @Nullable String str2) {
        p.e(method, "method");
        return new c(method, map, str, i10, i11, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.method == cVar.method && p.a(this.headers, cVar.headers) && p.a(this.body, cVar.body) && this.retryAttempt == cVar.retryAttempt && this.retryCount == cVar.retryCount && p.a(this.tpatKey, cVar.tpatKey);
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    @Nullable
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final HttpMethod getMethod() {
        return this.method;
    }

    public final int getRetryAttempt() {
        return this.retryAttempt;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    @Nullable
    public final String getTpatKey() {
        return this.tpatKey;
    }

    public int hashCode() {
        int iHashCode = this.method.hashCode() * 31;
        Map<String, String> map = this.headers;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.body;
        int iHashCode3 = (((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.retryAttempt) * 31) + this.retryCount) * 31;
        String str2 = this.tpatKey;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setRetryAttempt(int i10) {
        this.retryAttempt = i10;
    }

    public final void setRetryCount(int i10) {
        this.retryCount = i10;
    }

    public final void setTpatKey(@Nullable String str) {
        this.tpatKey = str;
    }

    @NotNull
    public String toString() {
        return "FailedTpat(method=" + this.method + ", headers=" + this.headers + ", body=" + this.body + ", retryAttempt=" + this.retryAttempt + ", retryCount=" + this.retryCount + ", tpatKey=" + this.tpatKey + ')';
    }

    public c(@NotNull HttpMethod method, @Nullable Map<String, String> map, @Nullable String str, int i10, int i11, @Nullable String str2) {
        p.e(method, "method");
        this.method = method;
        this.headers = map;
        this.body = str;
        this.retryAttempt = i10;
        this.retryCount = i11;
        this.tpatKey = str2;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ c(com.vungle.ads.internal.network.HttpMethod r2, java.util.Map r3, java.lang.String r4, int r5, int r6, java.lang.String r7, int r8, kotlin.jvm.internal.i r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            com.vungle.ads.internal.network.HttpMethod r2 = com.vungle.ads.internal.network.HttpMethod.GET
        L6:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lc
            r3 = r0
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L11
            r4 = r0
        L11:
            r9 = r8 & 8
            if (r9 == 0) goto L16
            r5 = 0
        L16:
            r8 = r8 & 32
            if (r8 == 0) goto L22
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L29
        L22:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L29:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.network.c.<init>(com.vungle.ads.internal.network.HttpMethod, java.util.Map, java.lang.String, int, int, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
