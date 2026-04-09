package a6;

import M9.n;
import N7.B8;
import Q9.C0;
import Q9.C1532h;
import Q9.C1547o0;
import Q9.C1549p0;
import Q9.G0;
import Q9.H;
import Q9.x0;

/* compiled from: ConfigPayload.kt */
@M9.h
/* renamed from: a6.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1661j {
    public static final b Companion = new b(null);
    private final boolean headerBidding;
    private final String referenceId;
    private final String type;
    private Long wakeupTime;

    /* compiled from: ConfigPayload.kt */
    /* renamed from: a6.j$a */
    public static final class a implements H<C1661j> {
        public static final a INSTANCE;
        public static final /* synthetic */ O9.e descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.Placement", aVar, 3);
            c1547o0.k("placement_ref_id", false);
            c1547o0.k("is_hb", true);
            c1547o0.k("type", true);
            descriptor = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public M9.b<?>[] childSerializers() {
            C0 c02 = C0.f11399a;
            return new M9.b[]{c02, C1532h.f11487a, N9.a.b(c02)};
        }

        @Override // M9.b
        public C1661j deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            O9.e descriptor2 = getDescriptor();
            P9.b bVarD = decoder.d(descriptor2);
            Object objG = null;
            boolean z10 = true;
            int i = 0;
            boolean zI = false;
            String strN = null;
            while (z10) {
                int iX = bVarD.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strN = bVarD.n(descriptor2, 0);
                    i |= 1;
                } else if (iX == 1) {
                    zI = bVarD.I(descriptor2, 1);
                    i |= 2;
                } else {
                    if (iX != 2) {
                        throw new n(iX);
                    }
                    objG = bVarD.G(descriptor2, 2, C0.f11399a, objG);
                    i |= 4;
                }
            }
            bVarD.b(descriptor2);
            return new C1661j(i, strN, zI, (String) objG, (x0) null);
        }

        @Override // M9.b
        public O9.e getDescriptor() {
            return descriptor;
        }

        @Override // M9.b
        public void serialize(P9.e encoder, C1661j value) {
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            O9.e descriptor2 = getDescriptor();
            P9.c cVarD = encoder.d(descriptor2);
            C1661j.write$Self(value, cVarD, descriptor2);
            cVarD.b(descriptor2);
        }

        @Override // Q9.H
        public M9.b<?>[] typeParametersSerializers() {
            return C1549p0.f11523a;
        }
    }

    /* compiled from: ConfigPayload.kt */
    /* renamed from: a6.j$b */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final M9.b<C1661j> serializer() {
            return a.INSTANCE;
        }

        private b() {
        }
    }

    public /* synthetic */ C1661j(int i, String str, boolean z10, String str2, x0 x0Var) {
        if (1 != (i & 1)) {
            G0.a(i, 1, a.INSTANCE.getDescriptor());
            throw null;
        }
        this.referenceId = str;
        if ((i & 2) == 0) {
            this.headerBidding = false;
        } else {
            this.headerBidding = z10;
        }
        if ((i & 4) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        this.wakeupTime = null;
    }

    public static /* synthetic */ C1661j copy$default(C1661j c1661j, String str, boolean z10, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c1661j.referenceId;
        }
        if ((i & 2) != 0) {
            z10 = c1661j.headerBidding;
        }
        if ((i & 4) != 0) {
            str2 = c1661j.type;
        }
        return c1661j.copy(str, z10, str2);
    }

    public static final void write$Self(C1661j self, P9.c output, O9.e serialDesc) {
        kotlin.jvm.internal.l.f(self, "self");
        kotlin.jvm.internal.l.f(output, "output");
        kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
        output.k(serialDesc, 0, self.referenceId);
        if (output.F(serialDesc, 1) || self.headerBidding) {
            output.B(serialDesc, 1, self.headerBidding);
        }
        if (!output.F(serialDesc, 2) && self.type == null) {
            return;
        }
        output.w(serialDesc, 2, C0.f11399a, self.type);
    }

    public final String component1() {
        return this.referenceId;
    }

    public final boolean component2() {
        return this.headerBidding;
    }

    public final String component3() {
        return this.type;
    }

    public final C1661j copy(String referenceId, boolean z10, String str) {
        kotlin.jvm.internal.l.f(referenceId, "referenceId");
        return new C1661j(referenceId, z10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1661j)) {
            return false;
        }
        C1661j c1661j = (C1661j) obj;
        return kotlin.jvm.internal.l.b(this.referenceId, c1661j.referenceId) && this.headerBidding == c1661j.headerBidding && kotlin.jvm.internal.l.b(this.type, c1661j.type);
    }

    public final boolean getHeaderBidding() {
        return this.headerBidding;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final String getType() {
        return this.type;
    }

    public final Long getWakeupTime() {
        return this.wakeupTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.referenceId.hashCode() * 31;
        boolean z10 = this.headerBidding;
        int i = z10;
        if (z10 != 0) {
            i = 1;
        }
        int i10 = (iHashCode + i) * 31;
        String str = this.type;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    public final boolean isAppOpen() {
        return kotlin.jvm.internal.l.b(this.type, com.vungle.ads.internal.g.PLACEMENT_TYPE_APP_OPEN);
    }

    public final boolean isBanner() {
        return kotlin.jvm.internal.l.b(this.type, "banner");
    }

    public final boolean isInline() {
        return kotlin.jvm.internal.l.b(this.type, "in_line");
    }

    public final boolean isInterstitial() {
        return kotlin.jvm.internal.l.b(this.type, com.vungle.ads.internal.g.PLACEMENT_TYPE_INTERSTITIAL);
    }

    public final boolean isMREC() {
        return kotlin.jvm.internal.l.b(this.type, "mrec");
    }

    public final boolean isNative() {
        return kotlin.jvm.internal.l.b(this.type, "native");
    }

    public final boolean isRewardedVideo() {
        return kotlin.jvm.internal.l.b(this.type, com.vungle.ads.internal.g.PLACEMENT_TYPE_REWARDED);
    }

    public final void setWakeupTime(Long l5) {
        this.wakeupTime = l5;
    }

    public final void snooze(long j4) {
        this.wakeupTime = Long.valueOf((j4 * 1000) + System.currentTimeMillis());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Placement(referenceId=");
        sb.append(this.referenceId);
        sb.append(", headerBidding=");
        sb.append(this.headerBidding);
        sb.append(", type=");
        return B8.j(sb, this.type, ')');
    }

    public C1661j(String referenceId, boolean z10, String str) {
        kotlin.jvm.internal.l.f(referenceId, "referenceId");
        this.referenceId = referenceId;
        this.headerBidding = z10;
        this.type = str;
    }

    public /* synthetic */ C1661j(String str, boolean z10, String str2, int i, kotlin.jvm.internal.g gVar) {
        this(str, (i & 2) != 0 ? false : z10, (i & 4) != 0 ? null : str2);
    }

    public static /* synthetic */ void getHeaderBidding$annotations() {
    }

    public static /* synthetic */ void getReferenceId$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static /* synthetic */ void getWakeupTime$annotations() {
    }
}
