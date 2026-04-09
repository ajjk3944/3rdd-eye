package com.vungle.ads.internal.signals;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.vungle.ads.internal.signals.b;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b1;
import kotlinx.serialization.internal.b2;
import kotlinx.serialization.internal.i0;
import kotlinx.serialization.internal.m1;
import kotlinx.serialization.internal.r0;
import kotlinx.serialization.internal.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xbill.DNS.KEYRecord;
import q7.k;
import y9.c;
import y9.d;
import y9.e;

/* loaded from: classes3.dex */
public final class a {

    @NotNull
    public static final b Companion = new b(null);
    private int httpProxyEnabled;
    private int isDevice;
    private int isVPNConnected;
    private int overlayGranted;
    private int sensorCount;
    private final int sessionCount;
    private long sessionCreationTime;
    private int sessionDepthCounter;
    private long sessionDuration;

    @NotNull
    private final String sessionId;

    @NotNull
    private List<com.vungle.ads.internal.signals.b> signaledAd;

    @NotNull
    private List<k> unclosedAd;

    /* renamed from: com.vungle.ads.internal.signals.a$a, reason: collision with other inner class name */
    public static final class C0371a implements i0 {

        @NotNull
        public static final C0371a INSTANCE;
        public static final /* synthetic */ f descriptor;

        static {
            C0371a c0371a = new C0371a();
            INSTANCE = c0371a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.signals.SessionData", c0371a, 12);
            pluginGeneratedSerialDescriptor.k("103", false);
            pluginGeneratedSerialDescriptor.k(StatisticData.ERROR_CODE_IO_ERROR, true);
            pluginGeneratedSerialDescriptor.k(StatisticData.ERROR_CODE_NOT_FOUND, true);
            pluginGeneratedSerialDescriptor.k("106", true);
            pluginGeneratedSerialDescriptor.k("102", true);
            pluginGeneratedSerialDescriptor.k("104", true);
            pluginGeneratedSerialDescriptor.k("105", true);
            pluginGeneratedSerialDescriptor.k("112", true);
            pluginGeneratedSerialDescriptor.k("113", true);
            pluginGeneratedSerialDescriptor.k("114", true);
            pluginGeneratedSerialDescriptor.k("115", true);
            pluginGeneratedSerialDescriptor.k("116", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C0371a() {
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] childSerializers() {
            kotlinx.serialization.internal.f fVar = new kotlinx.serialization.internal.f(b.a.INSTANCE);
            kotlinx.serialization.internal.f fVar2 = new kotlinx.serialization.internal.f(k.a.INSTANCE);
            r0 r0Var = r0.f22908a;
            b1 b1Var = b1.f22826a;
            return new kotlinx.serialization.b[]{r0Var, b2.f22828a, b1Var, fVar, b1Var, r0Var, fVar2, r0Var, r0Var, r0Var, r0Var, r0Var};
        }

        @Override // kotlinx.serialization.a
        @NotNull
        public a deserialize(@NotNull e decoder) {
            int i10;
            Object objY;
            Object objY2;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            long j10;
            String str;
            long j11;
            p.e(decoder, "decoder");
            f descriptor2 = getDescriptor();
            c cVarB = decoder.b(descriptor2);
            int i17 = 0;
            if (cVarB.p()) {
                int i18 = cVarB.i(descriptor2, 0);
                String strM = cVarB.m(descriptor2, 1);
                long jF = cVarB.f(descriptor2, 2);
                objY2 = cVarB.y(descriptor2, 3, new kotlinx.serialization.internal.f(b.a.INSTANCE), null);
                long jF2 = cVarB.f(descriptor2, 4);
                int i19 = cVarB.i(descriptor2, 5);
                objY = cVarB.y(descriptor2, 6, new kotlinx.serialization.internal.f(k.a.INSTANCE), null);
                int i20 = cVarB.i(descriptor2, 7);
                int i21 = cVarB.i(descriptor2, 8);
                int i22 = cVarB.i(descriptor2, 9);
                i17 = 4095;
                i10 = i18;
                i11 = cVarB.i(descriptor2, 10);
                i12 = i22;
                i13 = i20;
                i14 = i21;
                i15 = i19;
                i16 = cVarB.i(descriptor2, 11);
                j10 = jF2;
                str = strM;
                j11 = jF;
            } else {
                int i23 = 11;
                boolean z10 = true;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                Object objY3 = null;
                Object objY4 = null;
                String strM2 = null;
                long jF3 = 0;
                long jF4 = 0;
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    switch (iO) {
                        case -1:
                            z10 = false;
                            i23 = 11;
                        case 0:
                            i17 |= 1;
                            i24 = cVarB.i(descriptor2, 0);
                            i23 = 11;
                        case 1:
                            strM2 = cVarB.m(descriptor2, 1);
                            i17 |= 2;
                            i23 = 11;
                        case 2:
                            jF4 = cVarB.f(descriptor2, 2);
                            i17 |= 4;
                            i23 = 11;
                        case 3:
                            objY4 = cVarB.y(descriptor2, 3, new kotlinx.serialization.internal.f(b.a.INSTANCE), objY4);
                            i17 |= 8;
                            i23 = 11;
                        case 4:
                            jF3 = cVarB.f(descriptor2, 4);
                            i17 |= 16;
                            i23 = 11;
                        case 5:
                            i26 = cVarB.i(descriptor2, 5);
                            i17 |= 32;
                            i23 = 11;
                        case 6:
                            objY3 = cVarB.y(descriptor2, 6, new kotlinx.serialization.internal.f(k.a.INSTANCE), objY3);
                            i17 |= 64;
                            i23 = 11;
                        case 7:
                            i30 = cVarB.i(descriptor2, 7);
                            i17 |= 128;
                        case 8:
                            i25 = cVarB.i(descriptor2, 8);
                            i17 |= 256;
                        case 9:
                            i29 = cVarB.i(descriptor2, 9);
                            i17 |= 512;
                        case 10:
                            i28 = cVarB.i(descriptor2, 10);
                            i17 |= 1024;
                        case 11:
                            i27 = cVarB.i(descriptor2, i23);
                            i17 |= KEYRecord.Flags.FLAG4;
                        default:
                            throw new UnknownFieldException(iO);
                    }
                }
                i10 = i24;
                objY = objY3;
                objY2 = objY4;
                i11 = i28;
                i12 = i29;
                i13 = i30;
                i14 = i25;
                i15 = i26;
                i16 = i27;
                j10 = jF3;
                str = strM2;
                j11 = jF4;
            }
            int i31 = i17;
            cVarB.c(descriptor2);
            return new a(i31, i10, str, j11, (List) objY2, j10, i15, (List) objY, i13, i14, i12, i11, i16, null);
        }

        @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
        @NotNull
        public f getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.e
        public void serialize(@NotNull y9.f encoder, @NotNull a value) {
            p.e(encoder, "encoder");
            p.e(value, "value");
            f descriptor2 = getDescriptor();
            d dVarB = encoder.b(descriptor2);
            a.write$Self(value, dVarB, descriptor2);
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
            return C0371a.INSTANCE;
        }

        private b() {
        }
    }

    public a(int i10) {
        this.sessionCount = i10;
        String string = UUID.randomUUID().toString();
        p.d(string, "randomUUID().toString()");
        this.sessionId = string;
        this.sessionCreationTime = System.currentTimeMillis() / 1000;
        this.signaledAd = new ArrayList();
        this.unclosedAd = new ArrayList();
    }

    public static /* synthetic */ a copy$default(a aVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = aVar.sessionCount;
        }
        return aVar.copy(i10);
    }

    @SerialName("116")
    public static /* synthetic */ void getHttpProxyEnabled$annotations() {
    }

    @SerialName("114")
    public static /* synthetic */ void getOverlayGranted$annotations() {
    }

    @SerialName("115")
    public static /* synthetic */ void getSensorCount$annotations() {
    }

    @SerialName("103")
    public static /* synthetic */ void getSessionCount$annotations() {
    }

    @SerialName(StatisticData.ERROR_CODE_NOT_FOUND)
    public static /* synthetic */ void getSessionCreationTime$annotations() {
    }

    @SerialName("104")
    public static /* synthetic */ void getSessionDepthCounter$annotations() {
    }

    @SerialName("102")
    public static /* synthetic */ void getSessionDuration$annotations() {
    }

    @SerialName(StatisticData.ERROR_CODE_IO_ERROR)
    public static /* synthetic */ void getSessionId$annotations() {
    }

    @SerialName("106")
    public static /* synthetic */ void getSignaledAd$annotations() {
    }

    @SerialName("105")
    public static /* synthetic */ void getUnclosedAd$annotations() {
    }

    @SerialName("112")
    public static /* synthetic */ void isDevice$annotations() {
    }

    @SerialName("113")
    public static /* synthetic */ void isVPNConnected$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(@org.jetbrains.annotations.NotNull com.vungle.ads.internal.signals.a r7, @org.jetbrains.annotations.NotNull y9.d r8, @org.jetbrains.annotations.NotNull kotlinx.serialization.descriptors.f r9) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.signals.a.write$Self(com.vungle.ads.internal.signals.a, y9.d, kotlinx.serialization.descriptors.f):void");
    }

    public final int component1() {
        return this.sessionCount;
    }

    @NotNull
    public final a copy(int i10) {
        return new a(i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.sessionCount == ((a) obj).sessionCount;
    }

    public final int getHttpProxyEnabled() {
        return this.httpProxyEnabled;
    }

    public final int getOverlayGranted() {
        return this.overlayGranted;
    }

    public final int getSensorCount() {
        return this.sensorCount;
    }

    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final long getSessionCreationTime() {
        return this.sessionCreationTime;
    }

    public final int getSessionDepthCounter() {
        return this.sessionDepthCounter;
    }

    public final long getSessionDuration() {
        return this.sessionDuration;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final List<com.vungle.ads.internal.signals.b> getSignaledAd() {
        return this.signaledAd;
    }

    @NotNull
    public final List<k> getUnclosedAd() {
        return this.unclosedAd;
    }

    public int hashCode() {
        return this.sessionCount;
    }

    public final int isDevice() {
        return this.isDevice;
    }

    public final int isVPNConnected() {
        return this.isVPNConnected;
    }

    public final void setDevice(int i10) {
        this.isDevice = i10;
    }

    public final void setHttpProxyEnabled(int i10) {
        this.httpProxyEnabled = i10;
    }

    public final void setOverlayGranted(int i10) {
        this.overlayGranted = i10;
    }

    public final void setSensorCount(int i10) {
        this.sensorCount = i10;
    }

    public final void setSessionCreationTime(long j10) {
        this.sessionCreationTime = j10;
    }

    public final void setSessionDepthCounter(int i10) {
        this.sessionDepthCounter = i10;
    }

    public final void setSessionDuration(long j10) {
        this.sessionDuration = j10;
    }

    public final void setSignaledAd(@NotNull List<com.vungle.ads.internal.signals.b> list) {
        p.e(list, "<set-?>");
        this.signaledAd = list;
    }

    public final void setUnclosedAd(@NotNull List<k> list) {
        p.e(list, "<set-?>");
        this.unclosedAd = list;
    }

    public final void setVPNConnected(int i10) {
        this.isVPNConnected = i10;
    }

    @NotNull
    public String toString() {
        return "SessionData(sessionCount=" + this.sessionCount + ')';
    }

    @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ a(int i10, @SerialName("103") int i11, @SerialName(StatisticData.ERROR_CODE_IO_ERROR) String str, @SerialName(StatisticData.ERROR_CODE_NOT_FOUND) long j10, @SerialName("106") List list, @SerialName("102") long j11, @SerialName("104") int i12, @SerialName("105") List list2, @SerialName("112") int i13, @SerialName("113") int i14, @SerialName("114") int i15, @SerialName("115") int i16, @SerialName("116") int i17, w1 w1Var) {
        if (1 != (i10 & 1)) {
            m1.a(i10, 1, C0371a.INSTANCE.getDescriptor());
        }
        this.sessionCount = i11;
        if ((i10 & 2) == 0) {
            String string = UUID.randomUUID().toString();
            p.d(string, "randomUUID().toString()");
            this.sessionId = string;
        } else {
            this.sessionId = str;
        }
        if ((i10 & 4) == 0) {
            this.sessionCreationTime = System.currentTimeMillis() / 1000;
        } else {
            this.sessionCreationTime = j10;
        }
        if ((i10 & 8) == 0) {
            this.signaledAd = new ArrayList();
        } else {
            this.signaledAd = list;
        }
        if ((i10 & 16) == 0) {
            this.sessionDuration = 0L;
        } else {
            this.sessionDuration = j11;
        }
        if ((i10 & 32) == 0) {
            this.sessionDepthCounter = 0;
        } else {
            this.sessionDepthCounter = i12;
        }
        if ((i10 & 64) == 0) {
            this.unclosedAd = new ArrayList();
        } else {
            this.unclosedAd = list2;
        }
        if ((i10 & 128) == 0) {
            this.isDevice = 0;
        } else {
            this.isDevice = i13;
        }
        if ((i10 & 256) == 0) {
            this.isVPNConnected = 0;
        } else {
            this.isVPNConnected = i14;
        }
        if ((i10 & 512) == 0) {
            this.overlayGranted = 0;
        } else {
            this.overlayGranted = i15;
        }
        if ((i10 & 1024) == 0) {
            this.sensorCount = 0;
        } else {
            this.sensorCount = i16;
        }
        if ((i10 & KEYRecord.Flags.FLAG4) == 0) {
            this.httpProxyEnabled = 0;
        } else {
            this.httpProxyEnabled = i17;
        }
    }
}
