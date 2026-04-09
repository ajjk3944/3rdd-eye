package a6;

import M9.n;
import N7.B8;
import Q9.C0;
import Q9.C1547o0;
import Q9.C1549p0;
import Q9.G0;
import Q9.H;
import Q9.x0;

/* compiled from: UnclosedAd.kt */
@M9.h
/* loaded from: classes2.dex */
public final class m {
    public static final b Companion = new b(null);
    private final String eventId;
    private String sessionId;

    /* compiled from: UnclosedAd.kt */
    public static final class a implements H<m> {
        public static final a INSTANCE;
        public static final /* synthetic */ O9.e descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.UnclosedAd", aVar, 2);
            c1547o0.k("107", false);
            c1547o0.k("101", true);
            descriptor = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public M9.b<?>[] childSerializers() {
            C0 c02 = C0.f11399a;
            return new M9.b[]{c02, c02};
        }

        @Override // M9.b
        public m deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            O9.e descriptor2 = getDescriptor();
            P9.b bVarD = decoder.d(descriptor2);
            x0 x0Var = null;
            boolean z10 = true;
            int i = 0;
            String strN = null;
            String strN2 = null;
            while (z10) {
                int iX = bVarD.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strN = bVarD.n(descriptor2, 0);
                    i |= 1;
                } else {
                    if (iX != 1) {
                        throw new n(iX);
                    }
                    strN2 = bVarD.n(descriptor2, 1);
                    i |= 2;
                }
            }
            bVarD.b(descriptor2);
            return new m(i, strN, strN2, x0Var);
        }

        @Override // M9.b
        public O9.e getDescriptor() {
            return descriptor;
        }

        @Override // M9.b
        public void serialize(P9.e encoder, m value) {
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            O9.e descriptor2 = getDescriptor();
            P9.c cVarD = encoder.d(descriptor2);
            m.write$Self(value, cVarD, descriptor2);
            cVarD.b(descriptor2);
        }

        @Override // Q9.H
        public M9.b<?>[] typeParametersSerializers() {
            return C1549p0.f11523a;
        }
    }

    /* compiled from: UnclosedAd.kt */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final M9.b<m> serializer() {
            return a.INSTANCE;
        }

        private b() {
        }
    }

    public /* synthetic */ m(int i, String str, String str2, x0 x0Var) {
        if (1 != (i & 1)) {
            G0.a(i, 1, a.INSTANCE.getDescriptor());
            throw null;
        }
        this.eventId = str;
        if ((i & 2) == 0) {
            this.sessionId = "";
        } else {
            this.sessionId = str2;
        }
    }

    public static /* synthetic */ m copy$default(m mVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mVar.eventId;
        }
        if ((i & 2) != 0) {
            str2 = mVar.sessionId;
        }
        return mVar.copy(str, str2);
    }

    public static final void write$Self(m self, P9.c output, O9.e serialDesc) {
        kotlin.jvm.internal.l.f(self, "self");
        kotlin.jvm.internal.l.f(output, "output");
        kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
        output.k(serialDesc, 0, self.eventId);
        if (!output.F(serialDesc, 1) && kotlin.jvm.internal.l.b(self.sessionId, "")) {
            return;
        }
        output.k(serialDesc, 1, self.sessionId);
    }

    public final String component1() {
        return this.eventId;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final m copy(String eventId, String sessionId) {
        kotlin.jvm.internal.l.f(eventId, "eventId");
        kotlin.jvm.internal.l.f(sessionId, "sessionId");
        return new m(eventId, sessionId);
    }

    public boolean equals(Object obj) {
        if (obj != null && m.class.equals(obj.getClass())) {
            m mVar = (m) obj;
            if (kotlin.jvm.internal.l.b(this.eventId, mVar.eventId) && kotlin.jvm.internal.l.b(this.sessionId, mVar.sessionId)) {
                return true;
            }
        }
        return false;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return this.sessionId.hashCode() + (this.eventId.hashCode() * 31);
    }

    public final void setSessionId(String str) {
        kotlin.jvm.internal.l.f(str, "<set-?>");
        this.sessionId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UnclosedAd(eventId=");
        sb.append(this.eventId);
        sb.append(", sessionId=");
        return B8.j(sb, this.sessionId, ')');
    }

    public m(String eventId, String sessionId) {
        kotlin.jvm.internal.l.f(eventId, "eventId");
        kotlin.jvm.internal.l.f(sessionId, "sessionId");
        this.eventId = eventId;
        this.sessionId = sessionId;
    }

    public /* synthetic */ m(String str, String str2, int i, kotlin.jvm.internal.g gVar) {
        this(str, (i & 2) != 0 ? "" : str2);
    }

    public static /* synthetic */ void getEventId$annotations() {
    }

    public static /* synthetic */ void getSessionId$annotations() {
    }
}
