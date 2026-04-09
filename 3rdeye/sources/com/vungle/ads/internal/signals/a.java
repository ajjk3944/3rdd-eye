package com.vungle.ads.internal.signals;

import M9.h;
import M9.n;
import N7.H7;
import O9.e;
import P9.d;
import Q9.C0;
import Q9.C1526e;
import Q9.C1547o0;
import Q9.C1549p0;
import Q9.G0;
import Q9.H;
import Q9.Q;
import Q9.Y;
import Q9.x0;
import a6.m;
import com.vungle.ads.internal.signals.c;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: SessionData.kt */
@h
/* loaded from: classes2.dex */
public final class a {
    public static final b Companion = new b(null);
    private final int sessionCount;
    private long sessionCreationTime;
    private int sessionDepthCounter;
    private long sessionDuration;
    private final String sessionId;
    private List<c> signaledAd;
    private List<m> unclosedAd;

    /* compiled from: SessionData.kt */
    /* renamed from: com.vungle.ads.internal.signals.a$a, reason: collision with other inner class name */
    public static final class C0391a implements H<a> {
        public static final C0391a INSTANCE;
        public static final /* synthetic */ e descriptor;

        static {
            C0391a c0391a = new C0391a();
            INSTANCE = c0391a;
            C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.signals.SessionData", c0391a, 7);
            c1547o0.k("103", false);
            c1547o0.k("101", true);
            c1547o0.k("100", true);
            c1547o0.k("106", true);
            c1547o0.k("102", true);
            c1547o0.k("104", true);
            c1547o0.k("105", true);
            descriptor = c1547o0;
        }

        private C0391a() {
        }

        @Override // Q9.H
        public M9.b<?>[] childSerializers() {
            C1526e c1526e = new C1526e(c.a.INSTANCE);
            C1526e c1526e2 = new C1526e(m.a.INSTANCE);
            Q q10 = Q.f11448a;
            Y y10 = Y.f11465a;
            return new M9.b[]{q10, C0.f11399a, y10, c1526e, y10, q10, c1526e2};
        }

        @Override // M9.b
        public a deserialize(d decoder) {
            l.f(decoder, "decoder");
            e descriptor2 = getDescriptor();
            P9.b bVarD = decoder.d(descriptor2);
            Object objH = null;
            int i = 0;
            int i10 = 0;
            int i11 = 0;
            String strN = null;
            long jC = 0;
            long jC2 = 0;
            boolean z10 = true;
            Object objH2 = null;
            while (z10) {
                int iX = bVarD.x(descriptor2);
                switch (iX) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        i10 = bVarD.i(descriptor2, 0);
                        i |= 1;
                        break;
                    case 1:
                        strN = bVarD.n(descriptor2, 1);
                        i |= 2;
                        break;
                    case 2:
                        jC = bVarD.C(descriptor2, 2);
                        i |= 4;
                        break;
                    case 3:
                        objH = bVarD.h(descriptor2, 3, new C1526e(c.a.INSTANCE), objH);
                        i |= 8;
                        break;
                    case 4:
                        jC2 = bVarD.C(descriptor2, 4);
                        i |= 16;
                        break;
                    case 5:
                        i11 = bVarD.i(descriptor2, 5);
                        i |= 32;
                        break;
                    case 6:
                        objH2 = bVarD.h(descriptor2, 6, new C1526e(m.a.INSTANCE), objH2);
                        i |= 64;
                        break;
                    default:
                        throw new n(iX);
                }
            }
            bVarD.b(descriptor2);
            return new a(i, i10, strN, jC, (List) objH, jC2, i11, (List) objH2, null);
        }

        @Override // M9.b
        public e getDescriptor() {
            return descriptor;
        }

        @Override // M9.b
        public void serialize(P9.e encoder, a value) {
            l.f(encoder, "encoder");
            l.f(value, "value");
            e descriptor2 = getDescriptor();
            P9.c cVarD = encoder.d(descriptor2);
            a.write$Self(value, cVarD, descriptor2);
            cVarD.b(descriptor2);
        }

        @Override // Q9.H
        public M9.b<?>[] typeParametersSerializers() {
            return C1549p0.f11523a;
        }
    }

    /* compiled from: SessionData.kt */
    public static final class b {
        public /* synthetic */ b(g gVar) {
            this();
        }

        public final M9.b<a> serializer() {
            return C0391a.INSTANCE;
        }

        private b() {
        }
    }

    public a(int i) {
        this.sessionCount = i;
        String string = UUID.randomUUID().toString();
        l.e(string, "randomUUID().toString()");
        this.sessionId = string;
        this.sessionCreationTime = System.currentTimeMillis() / 1000;
        this.signaledAd = new ArrayList();
        this.unclosedAd = new ArrayList();
    }

    public static /* synthetic */ a copy$default(a aVar, int i, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = aVar.sessionCount;
        }
        return aVar.copy(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(com.vungle.ads.internal.signals.a r7, P9.c r8, O9.e r9) {
        /*
            java.lang.String r0 = "self"
            kotlin.jvm.internal.l.f(r7, r0)
            java.lang.String r0 = "output"
            kotlin.jvm.internal.l.f(r8, r0)
            java.lang.String r0 = "serialDesc"
            kotlin.jvm.internal.l.f(r9, r0)
            r0 = 0
            int r1 = r7.sessionCount
            r8.n(r0, r1, r9)
            r0 = 1
            boolean r1 = r8.F(r9, r0)
            if (r1 == 0) goto L1d
            goto L32
        L1d:
            java.lang.String r1 = r7.sessionId
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "randomUUID().toString()"
            kotlin.jvm.internal.l.e(r2, r3)
            boolean r1 = kotlin.jvm.internal.l.b(r1, r2)
            if (r1 != 0) goto L37
        L32:
            java.lang.String r1 = r7.sessionId
            r8.k(r9, r0, r1)
        L37:
            r0 = 2
            boolean r1 = r8.F(r9, r0)
            if (r1 == 0) goto L3f
            goto L4c
        L3f:
            long r1 = r7.sessionCreationTime
            long r3 = java.lang.System.currentTimeMillis()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L51
        L4c:
            long r1 = r7.sessionCreationTime
            r8.m(r9, r0, r1)
        L51:
            r0 = 3
            boolean r1 = r8.F(r9, r0)
            if (r1 == 0) goto L59
            goto L66
        L59:
            java.util.List<com.vungle.ads.internal.signals.c> r1 = r7.signaledAd
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r1 = kotlin.jvm.internal.l.b(r1, r2)
            if (r1 != 0) goto L72
        L66:
            Q9.e r1 = new Q9.e
            com.vungle.ads.internal.signals.c$a r2 = com.vungle.ads.internal.signals.c.a.INSTANCE
            r1.<init>(r2)
            java.util.List<com.vungle.ads.internal.signals.c> r2 = r7.signaledAd
            r8.y(r9, r0, r1, r2)
        L72:
            r0 = 4
            boolean r1 = r8.F(r9, r0)
            if (r1 == 0) goto L7a
            goto L82
        L7a:
            long r1 = r7.sessionDuration
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L87
        L82:
            long r1 = r7.sessionDuration
            r8.m(r9, r0, r1)
        L87:
            r0 = 5
            boolean r1 = r8.F(r9, r0)
            if (r1 == 0) goto L8f
            goto L93
        L8f:
            int r1 = r7.sessionDepthCounter
            if (r1 == 0) goto L98
        L93:
            int r1 = r7.sessionDepthCounter
            r8.n(r0, r1, r9)
        L98:
            r0 = 6
            boolean r1 = r8.F(r9, r0)
            if (r1 == 0) goto La0
            goto Lad
        La0:
            java.util.List<a6.m> r1 = r7.unclosedAd
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r1 = kotlin.jvm.internal.l.b(r1, r2)
            if (r1 != 0) goto Lb9
        Lad:
            Q9.e r1 = new Q9.e
            a6.m$a r2 = a6.m.a.INSTANCE
            r1.<init>(r2)
            java.util.List<a6.m> r7 = r7.unclosedAd
            r8.y(r9, r0, r1, r7)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.signals.a.write$Self(com.vungle.ads.internal.signals.a, P9.c, O9.e):void");
    }

    public final int component1() {
        return this.sessionCount;
    }

    public final a copy(int i) {
        return new a(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.sessionCount == ((a) obj).sessionCount;
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

    public final String getSessionId() {
        return this.sessionId;
    }

    public final List<c> getSignaledAd() {
        return this.signaledAd;
    }

    public final List<m> getUnclosedAd() {
        return this.unclosedAd;
    }

    public int hashCode() {
        return this.sessionCount;
    }

    public final void setSessionCreationTime(long j4) {
        this.sessionCreationTime = j4;
    }

    public final void setSessionDepthCounter(int i) {
        this.sessionDepthCounter = i;
    }

    public final void setSessionDuration(long j4) {
        this.sessionDuration = j4;
    }

    public final void setSignaledAd(List<c> list) {
        l.f(list, "<set-?>");
        this.signaledAd = list;
    }

    public final void setUnclosedAd(List<m> list) {
        l.f(list, "<set-?>");
        this.unclosedAd = list;
    }

    public String toString() {
        return H7.p(new StringBuilder("SessionData(sessionCount="), this.sessionCount, ')');
    }

    public /* synthetic */ a(int i, int i10, String str, long j4, List list, long j10, int i11, List list2, x0 x0Var) {
        if (1 != (i & 1)) {
            G0.a(i, 1, C0391a.INSTANCE.getDescriptor());
            throw null;
        }
        this.sessionCount = i10;
        if ((i & 2) == 0) {
            String string = UUID.randomUUID().toString();
            l.e(string, "randomUUID().toString()");
            this.sessionId = string;
        } else {
            this.sessionId = str;
        }
        if ((i & 4) == 0) {
            this.sessionCreationTime = System.currentTimeMillis() / 1000;
        } else {
            this.sessionCreationTime = j4;
        }
        if ((i & 8) == 0) {
            this.signaledAd = new ArrayList();
        } else {
            this.signaledAd = list;
        }
        if ((i & 16) == 0) {
            this.sessionDuration = 0L;
        } else {
            this.sessionDuration = j10;
        }
        if ((i & 32) == 0) {
            this.sessionDepthCounter = 0;
        } else {
            this.sessionDepthCounter = i11;
        }
        if ((i & 64) == 0) {
            this.unclosedAd = new ArrayList();
        } else {
            this.unclosedAd = list2;
        }
    }

    public static /* synthetic */ void getSessionCount$annotations() {
    }

    public static /* synthetic */ void getSessionCreationTime$annotations() {
    }

    public static /* synthetic */ void getSessionDepthCounter$annotations() {
    }

    public static /* synthetic */ void getSessionDuration$annotations() {
    }

    public static /* synthetic */ void getSessionId$annotations() {
    }

    public static /* synthetic */ void getSignaledAd$annotations() {
    }

    public static /* synthetic */ void getUnclosedAd$annotations() {
    }
}
