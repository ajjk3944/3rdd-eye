package com.vungle.ads.internal.signals;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Transient;
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
import y9.c;
import y9.d;
import y9.e;

/* loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final C0372b Companion = new C0372b(null);
    private long adAvailabilityCallbackTime;

    @Nullable
    private String eventId;

    @Nullable
    private final Long lastAdLoadTime;
    private final long loadAdTime;
    private long playAdTime;
    private int screenOrientation;

    @Nullable
    private String templateSignals;
    private long timeBetweenAdAvailabilityAndPlayAd;
    private final long timeSinceLastAdLoad;

    public static final class a implements i0 {

        @NotNull
        public static final a INSTANCE;
        public static final /* synthetic */ f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.signals.SignaledAd", aVar, 5);
            pluginGeneratedSerialDescriptor.k("500", true);
            pluginGeneratedSerialDescriptor.k("109", false);
            pluginGeneratedSerialDescriptor.k("107", true);
            pluginGeneratedSerialDescriptor.k("110", true);
            pluginGeneratedSerialDescriptor.k("108", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] childSerializers() {
            b2 b2Var = b2.f22828a;
            kotlinx.serialization.b bVarS = x9.a.s(b2Var);
            kotlinx.serialization.b bVarS2 = x9.a.s(b2Var);
            b1 b1Var = b1.f22826a;
            return new kotlinx.serialization.b[]{bVarS, b1Var, bVarS2, b1Var, r0.f22908a};
        }

        @Override // kotlinx.serialization.a
        @NotNull
        public b deserialize(@NotNull e decoder) {
            long jF;
            long jF2;
            int i10;
            Object objN;
            int i11;
            Object objN2;
            p.e(decoder, "decoder");
            f descriptor2 = getDescriptor();
            c cVarB = decoder.b(descriptor2);
            int i12 = 3;
            if (cVarB.p()) {
                b2 b2Var = b2.f22828a;
                objN = cVarB.n(descriptor2, 0, b2Var, null);
                long jF3 = cVarB.f(descriptor2, 1);
                objN2 = cVarB.n(descriptor2, 2, b2Var, null);
                long jF4 = cVarB.f(descriptor2, 3);
                i10 = 31;
                i11 = cVarB.i(descriptor2, 4);
                jF2 = jF3;
                jF = jF4;
            } else {
                jF = 0;
                boolean z10 = true;
                int i13 = 0;
                Object objN3 = null;
                Object objN4 = null;
                jF2 = 0;
                int i14 = 0;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    if (iO == -1) {
                        z10 = false;
                    } else if (iO == 0) {
                        objN3 = cVarB.n(descriptor2, 0, b2.f22828a, objN3);
                        i14 |= 1;
                    } else if (iO == 1) {
                        jF2 = cVarB.f(descriptor2, 1);
                        i14 |= 2;
                    } else if (iO == 2) {
                        objN4 = cVarB.n(descriptor2, 2, b2.f22828a, objN4);
                        i14 |= 4;
                    } else if (iO == i12) {
                        jF = cVarB.f(descriptor2, i12);
                        i14 |= 8;
                    } else {
                        if (iO != 4) {
                            throw new UnknownFieldException(iO);
                        }
                        i13 = cVarB.i(descriptor2, 4);
                        i14 |= 16;
                    }
                    i12 = 3;
                }
                i10 = i14;
                objN = objN3;
                i11 = i13;
                objN2 = objN4;
            }
            cVarB.c(descriptor2);
            return new b(i10, (String) objN, jF2, (String) objN2, jF, i11, null);
        }

        @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
        @NotNull
        public f getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.e
        public void serialize(@NotNull y9.f encoder, @NotNull b value) {
            p.e(encoder, "encoder");
            p.e(value, "value");
            f descriptor2 = getDescriptor();
            d dVarB = encoder.b(descriptor2);
            b.write$Self(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] typeParametersSerializers() {
            return i0.a.a(this);
        }
    }

    /* renamed from: com.vungle.ads.internal.signals.b$b, reason: collision with other inner class name */
    public static final class C0372b {
        public /* synthetic */ C0372b(i iVar) {
            this();
        }

        @NotNull
        public final kotlinx.serialization.b serializer() {
            return a.INSTANCE;
        }

        private C0372b() {
        }
    }

    public b() {
        this(null, 0L, 3, null);
    }

    public static /* synthetic */ b copy$default(b bVar, Long l10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = bVar.lastAdLoadTime;
        }
        if ((i10 & 2) != 0) {
            j10 = bVar.loadAdTime;
        }
        return bVar.copy(l10, j10);
    }

    @Transient
    public static /* synthetic */ void getAdAvailabilityCallbackTime$annotations() {
    }

    @SerialName("107")
    public static /* synthetic */ void getEventId$annotations() {
    }

    @Transient
    public static /* synthetic */ void getLastAdLoadTime$annotations() {
    }

    @Transient
    public static /* synthetic */ void getLoadAdTime$annotations() {
    }

    @Transient
    public static /* synthetic */ void getPlayAdTime$annotations() {
    }

    @SerialName("108")
    public static /* synthetic */ void getScreenOrientation$annotations() {
    }

    @SerialName("500")
    public static /* synthetic */ void getTemplateSignals$annotations() {
    }

    @SerialName("110")
    public static /* synthetic */ void getTimeBetweenAdAvailabilityAndPlayAd$annotations() {
    }

    private final long getTimeDifference(Long l10, long j10) {
        if (l10 == null) {
            return -1L;
        }
        long jLongValue = j10 - l10.longValue();
        if (jLongValue < 0) {
            return -1L;
        }
        return jLongValue;
    }

    @SerialName("109")
    public static /* synthetic */ void getTimeSinceLastAdLoad$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull b self, @NotNull d output, @NotNull f serialDesc) {
        p.e(self, "self");
        p.e(output, "output");
        p.e(serialDesc, "serialDesc");
        if (output.z(serialDesc, 0) || self.templateSignals != null) {
            output.i(serialDesc, 0, b2.f22828a, self.templateSignals);
        }
        output.F(serialDesc, 1, self.timeSinceLastAdLoad);
        if (output.z(serialDesc, 2) || self.eventId != null) {
            output.i(serialDesc, 2, b2.f22828a, self.eventId);
        }
        if (output.z(serialDesc, 3) || self.timeBetweenAdAvailabilityAndPlayAd != 0) {
            output.F(serialDesc, 3, self.timeBetweenAdAvailabilityAndPlayAd);
        }
        if (!output.z(serialDesc, 4) && self.screenOrientation == 0) {
            return;
        }
        output.w(serialDesc, 4, self.screenOrientation);
    }

    public final void calculateTimeBetweenAdAvailabilityAndPlayAd() {
        this.timeBetweenAdAvailabilityAndPlayAd = getTimeDifference(Long.valueOf(this.adAvailabilityCallbackTime), this.playAdTime);
    }

    @Nullable
    public final Long component1() {
        return this.lastAdLoadTime;
    }

    public final long component2() {
        return this.loadAdTime;
    }

    @NotNull
    public final b copy(@Nullable Long l10, long j10) {
        return new b(l10, j10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p.a(this.lastAdLoadTime, bVar.lastAdLoadTime) && this.loadAdTime == bVar.loadAdTime;
    }

    public final long getAdAvailabilityCallbackTime() {
        return this.adAvailabilityCallbackTime;
    }

    @Nullable
    public final String getEventId() {
        return this.eventId;
    }

    @Nullable
    public final Long getLastAdLoadTime() {
        return this.lastAdLoadTime;
    }

    public final long getLoadAdTime() {
        return this.loadAdTime;
    }

    public final long getPlayAdTime() {
        return this.playAdTime;
    }

    public final int getScreenOrientation() {
        return this.screenOrientation;
    }

    @Nullable
    public final String getTemplateSignals() {
        return this.templateSignals;
    }

    public final long getTimeBetweenAdAvailabilityAndPlayAd() {
        return this.timeBetweenAdAvailabilityAndPlayAd;
    }

    public final long getTimeSinceLastAdLoad() {
        return this.timeSinceLastAdLoad;
    }

    public int hashCode() {
        Long l10 = this.lastAdLoadTime;
        return ((l10 == null ? 0 : l10.hashCode()) * 31) + androidx.privacysandbox.ads.adservices.topics.d.a(this.loadAdTime);
    }

    public final void setAdAvailabilityCallbackTime(long j10) {
        this.adAvailabilityCallbackTime = j10;
    }

    public final void setEventId(@Nullable String str) {
        this.eventId = str;
    }

    public final void setPlayAdTime(long j10) {
        this.playAdTime = j10;
    }

    public final void setScreenOrientation(int i10) {
        this.screenOrientation = i10;
    }

    public final void setTemplateSignals(@Nullable String str) {
        this.templateSignals = str;
    }

    public final void setTimeBetweenAdAvailabilityAndPlayAd(long j10) {
        this.timeBetweenAdAvailabilityAndPlayAd = j10;
    }

    @NotNull
    public String toString() {
        return "SignaledAd(lastAdLoadTime=" + this.lastAdLoadTime + ", loadAdTime=" + this.loadAdTime + ')';
    }

    @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ b(int i10, @SerialName("500") String str, @SerialName("109") long j10, @SerialName("107") String str2, @SerialName("110") long j11, @SerialName("108") int i11, w1 w1Var) {
        if (2 != (i10 & 2)) {
            m1.a(i10, 2, a.INSTANCE.getDescriptor());
        }
        this.lastAdLoadTime = 0L;
        this.loadAdTime = 0L;
        if ((i10 & 1) == 0) {
            this.templateSignals = null;
        } else {
            this.templateSignals = str;
        }
        this.timeSinceLastAdLoad = j10;
        if ((i10 & 4) == 0) {
            this.eventId = null;
        } else {
            this.eventId = str2;
        }
        if ((i10 & 8) == 0) {
            this.timeBetweenAdAvailabilityAndPlayAd = 0L;
        } else {
            this.timeBetweenAdAvailabilityAndPlayAd = j11;
        }
        if ((i10 & 16) == 0) {
            this.screenOrientation = 0;
        } else {
            this.screenOrientation = i11;
        }
        this.adAvailabilityCallbackTime = 0L;
        this.playAdTime = 0L;
        this.timeSinceLastAdLoad = getTimeDifference(0L, 0L);
    }

    public b(@Nullable Long l10, long j10) {
        this.lastAdLoadTime = l10;
        this.loadAdTime = j10;
        this.timeSinceLastAdLoad = getTimeDifference(l10, j10);
    }

    public /* synthetic */ b(Long l10, long j10, int i10, i iVar) {
        this((i10 & 1) != 0 ? 0L : l10, (i10 & 2) != 0 ? 0L : j10);
    }
}
