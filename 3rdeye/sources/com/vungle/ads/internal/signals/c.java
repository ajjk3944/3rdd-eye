package com.vungle.ads.internal.signals;

import M9.h;
import M9.n;
import O9.e;
import P9.d;
import Q9.C0;
import Q9.C1547o0;
import Q9.C1549p0;
import Q9.G0;
import Q9.H;
import Q9.Q;
import Q9.Y;
import Q9.x0;
import androidx.work.s;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: SignaledAd.kt */
@h
/* loaded from: classes2.dex */
public final class c {
    public static final b Companion = new b(null);
    private long adAvailabilityCallbackTime;
    private String eventId;
    private final Long lastAdLoadTime;
    private final long loadAdTime;
    private long playAdTime;
    private int screenOrientation;
    private String templateSignals;
    private long timeBetweenAdAvailabilityAndPlayAd;
    private final long timeSinceLastAdLoad;

    /* compiled from: SignaledAd.kt */
    public static final class a implements H<c> {
        public static final a INSTANCE;
        public static final /* synthetic */ e descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.signals.SignaledAd", aVar, 5);
            c1547o0.k("500", true);
            c1547o0.k("109", false);
            c1547o0.k("107", true);
            c1547o0.k("110", true);
            c1547o0.k("108", true);
            descriptor = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public M9.b<?>[] childSerializers() {
            C0 c02 = C0.f11399a;
            M9.b<?> bVarB = N9.a.b(c02);
            M9.b<?> bVarB2 = N9.a.b(c02);
            Y y10 = Y.f11465a;
            return new M9.b[]{bVarB, y10, bVarB2, y10, Q.f11448a};
        }

        @Override // M9.b
        public c deserialize(d decoder) {
            l.f(decoder, "decoder");
            e descriptor2 = getDescriptor();
            P9.b bVarD = decoder.d(descriptor2);
            Object objG = null;
            int i = 0;
            int i10 = 0;
            long jC = 0;
            long jC2 = 0;
            boolean z10 = true;
            Object objG2 = null;
            while (z10) {
                int iX = bVarD.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    objG = bVarD.G(descriptor2, 0, C0.f11399a, objG);
                    i |= 1;
                } else if (iX == 1) {
                    jC = bVarD.C(descriptor2, 1);
                    i |= 2;
                } else if (iX == 2) {
                    objG2 = bVarD.G(descriptor2, 2, C0.f11399a, objG2);
                    i |= 4;
                } else if (iX == 3) {
                    jC2 = bVarD.C(descriptor2, 3);
                    i |= 8;
                } else {
                    if (iX != 4) {
                        throw new n(iX);
                    }
                    i10 = bVarD.i(descriptor2, 4);
                    i |= 16;
                }
            }
            bVarD.b(descriptor2);
            return new c(i, (String) objG, jC, (String) objG2, jC2, i10, null);
        }

        @Override // M9.b
        public e getDescriptor() {
            return descriptor;
        }

        @Override // M9.b
        public void serialize(P9.e encoder, c value) {
            l.f(encoder, "encoder");
            l.f(value, "value");
            e descriptor2 = getDescriptor();
            P9.c cVarD = encoder.d(descriptor2);
            c.write$Self(value, cVarD, descriptor2);
            cVarD.b(descriptor2);
        }

        @Override // Q9.H
        public M9.b<?>[] typeParametersSerializers() {
            return C1549p0.f11523a;
        }
    }

    /* compiled from: SignaledAd.kt */
    public static final class b {
        public /* synthetic */ b(g gVar) {
            this();
        }

        public final M9.b<c> serializer() {
            return a.INSTANCE;
        }

        private b() {
        }
    }

    public c() {
        this(null, 0L, 3, null);
    }

    public static /* synthetic */ c copy$default(c cVar, Long l5, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            l5 = cVar.lastAdLoadTime;
        }
        if ((i & 2) != 0) {
            j4 = cVar.loadAdTime;
        }
        return cVar.copy(l5, j4);
    }

    private final long getTimeDifference(Long l5, long j4) {
        if (l5 == null) {
            return -1L;
        }
        long jLongValue = j4 - l5.longValue();
        if (jLongValue < 0) {
            return -1L;
        }
        return jLongValue;
    }

    public static final void write$Self(c self, P9.c output, e serialDesc) {
        l.f(self, "self");
        l.f(output, "output");
        l.f(serialDesc, "serialDesc");
        if (output.F(serialDesc, 0) || self.templateSignals != null) {
            output.w(serialDesc, 0, C0.f11399a, self.templateSignals);
        }
        output.m(serialDesc, 1, self.timeSinceLastAdLoad);
        if (output.F(serialDesc, 2) || self.eventId != null) {
            output.w(serialDesc, 2, C0.f11399a, self.eventId);
        }
        if (output.F(serialDesc, 3) || self.timeBetweenAdAvailabilityAndPlayAd != 0) {
            output.m(serialDesc, 3, self.timeBetweenAdAvailabilityAndPlayAd);
        }
        if (!output.F(serialDesc, 4) && self.screenOrientation == 0) {
            return;
        }
        output.n(4, self.screenOrientation, serialDesc);
    }

    public final void calculateTimeBetweenAdAvailabilityAndPlayAd() {
        this.timeBetweenAdAvailabilityAndPlayAd = getTimeDifference(Long.valueOf(this.adAvailabilityCallbackTime), this.playAdTime);
    }

    public final Long component1() {
        return this.lastAdLoadTime;
    }

    public final long component2() {
        return this.loadAdTime;
    }

    public final c copy(Long l5, long j4) {
        return new c(l5, j4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.b(this.lastAdLoadTime, cVar.lastAdLoadTime) && this.loadAdTime == cVar.loadAdTime;
    }

    public final long getAdAvailabilityCallbackTime() {
        return this.adAvailabilityCallbackTime;
    }

    public final String getEventId() {
        return this.eventId;
    }

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
        Long l5 = this.lastAdLoadTime;
        int iHashCode = l5 == null ? 0 : l5.hashCode();
        long j4 = this.loadAdTime;
        return (iHashCode * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public final void setAdAvailabilityCallbackTime(long j4) {
        this.adAvailabilityCallbackTime = j4;
    }

    public final void setEventId(String str) {
        this.eventId = str;
    }

    public final void setPlayAdTime(long j4) {
        this.playAdTime = j4;
    }

    public final void setScreenOrientation(int i) {
        this.screenOrientation = i;
    }

    public final void setTemplateSignals(String str) {
        this.templateSignals = str;
    }

    public final void setTimeBetweenAdAvailabilityAndPlayAd(long j4) {
        this.timeBetweenAdAvailabilityAndPlayAd = j4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SignaledAd(lastAdLoadTime=");
        sb.append(this.lastAdLoadTime);
        sb.append(", loadAdTime=");
        return s.f(sb, this.loadAdTime, ')');
    }

    public /* synthetic */ c(int i, String str, long j4, String str2, long j10, int i10, x0 x0Var) {
        if (2 != (i & 2)) {
            G0.a(i, 2, a.INSTANCE.getDescriptor());
            throw null;
        }
        this.lastAdLoadTime = 0L;
        this.loadAdTime = 0L;
        if ((i & 1) == 0) {
            this.templateSignals = null;
        } else {
            this.templateSignals = str;
        }
        this.timeSinceLastAdLoad = j4;
        if ((i & 4) == 0) {
            this.eventId = null;
        } else {
            this.eventId = str2;
        }
        if ((i & 8) == 0) {
            this.timeBetweenAdAvailabilityAndPlayAd = 0L;
        } else {
            this.timeBetweenAdAvailabilityAndPlayAd = j10;
        }
        if ((i & 16) == 0) {
            this.screenOrientation = 0;
        } else {
            this.screenOrientation = i10;
        }
        this.adAvailabilityCallbackTime = 0L;
        this.playAdTime = 0L;
        this.timeSinceLastAdLoad = getTimeDifference(0L, 0L);
    }

    public c(Long l5, long j4) {
        this.lastAdLoadTime = l5;
        this.loadAdTime = j4;
        this.timeSinceLastAdLoad = getTimeDifference(l5, j4);
    }

    public /* synthetic */ c(Long l5, long j4, int i, g gVar) {
        this((i & 1) != 0 ? 0L : l5, (i & 2) != 0 ? 0L : j4);
    }

    public static /* synthetic */ void getAdAvailabilityCallbackTime$annotations() {
    }

    public static /* synthetic */ void getEventId$annotations() {
    }

    public static /* synthetic */ void getLastAdLoadTime$annotations() {
    }

    public static /* synthetic */ void getLoadAdTime$annotations() {
    }

    public static /* synthetic */ void getPlayAdTime$annotations() {
    }

    public static /* synthetic */ void getScreenOrientation$annotations() {
    }

    public static /* synthetic */ void getTemplateSignals$annotations() {
    }

    public static /* synthetic */ void getTimeBetweenAdAvailabilityAndPlayAd$annotations() {
    }

    public static /* synthetic */ void getTimeSinceLastAdLoad$annotations() {
    }
}
