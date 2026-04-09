package Y5;

import M9.n;
import Q9.C0;
import Q9.C1526e;
import Q9.C1547o0;
import Q9.C1549p0;
import Q9.G;
import Q9.H;
import Q9.Q;
import Q9.x0;
import c9.C2097r;
import com.google.android.gms.ads.AdRequest;
import com.vungle.ads.internal.util.m;
import java.util.List;
import kotlin.jvm.internal.l;

/* compiled from: SessionContext.kt */
@M9.h
/* loaded from: classes2.dex */
public final class i {
    public static final b Companion = new b(null);
    private List<String> friends;
    private Float healthPercentile;
    private Float inGamePurchasesUSD;
    private Float levelPercentile;
    private String page;
    private Integer sessionDuration;
    private Integer sessionStartTime;
    private Integer signupDate;
    private Integer timeSpent;
    private String userID;
    private Float userLevelPercentile;
    private Float userScorePercentile;

    /* compiled from: SessionContext.kt */
    public static final class a implements H<i> {
        public static final a INSTANCE;
        public static final /* synthetic */ O9.e descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            C1547o0 c1547o0 = new C1547o0("com.vungle.ads.fpd.SessionContext", aVar, 12);
            c1547o0.k("level_percentile", true);
            c1547o0.k("page", true);
            c1547o0.k("time_spent", true);
            c1547o0.k("signup_date", true);
            c1547o0.k("user_score_percentile", true);
            c1547o0.k("user_id", true);
            c1547o0.k("friends", true);
            c1547o0.k("user_level_percentile", true);
            c1547o0.k("health_percentile", true);
            c1547o0.k("session_start_time", true);
            c1547o0.k("session_duration", true);
            c1547o0.k("in_game_purchases_usd", true);
            descriptor = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public M9.b<?>[] childSerializers() {
            G g10 = G.f11421a;
            M9.b<?> bVarB = N9.a.b(g10);
            C0 c02 = C0.f11399a;
            M9.b<?> bVarB2 = N9.a.b(c02);
            Q q10 = Q.f11448a;
            return new M9.b[]{bVarB, bVarB2, N9.a.b(q10), N9.a.b(q10), N9.a.b(g10), N9.a.b(c02), N9.a.b(new C1526e(c02)), N9.a.b(g10), N9.a.b(g10), N9.a.b(q10), N9.a.b(q10), N9.a.b(g10)};
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // M9.b
        public i deserialize(P9.d decoder) {
            Float f10;
            l.f(decoder, "decoder");
            O9.e descriptor2 = getDescriptor();
            P9.b bVarD = decoder.d(descriptor2);
            Float fG = null;
            Object objG = null;
            Object objG2 = null;
            Object objG3 = null;
            Object objG4 = null;
            Object objG5 = null;
            Object objG6 = null;
            Object objG7 = null;
            Object objG8 = null;
            Object objG9 = null;
            Object objG10 = null;
            Object objG11 = null;
            int i = 0;
            boolean z10 = true;
            while (z10) {
                int iX = bVarD.x(descriptor2);
                switch (iX) {
                    case -1:
                        z10 = false;
                        fG = fG;
                        i = i;
                        continue;
                    case 0:
                        i |= 1;
                        fG = bVarD.G(descriptor2, 0, G.f11421a, fG);
                        continue;
                    case 1:
                        f10 = fG;
                        objG = bVarD.G(descriptor2, 1, C0.f11399a, objG);
                        i |= 2;
                        break;
                    case 2:
                        f10 = fG;
                        objG2 = bVarD.G(descriptor2, 2, Q.f11448a, objG2);
                        i |= 4;
                        break;
                    case 3:
                        f10 = fG;
                        objG3 = bVarD.G(descriptor2, 3, Q.f11448a, objG3);
                        i |= 8;
                        break;
                    case 4:
                        f10 = fG;
                        objG4 = bVarD.G(descriptor2, 4, G.f11421a, objG4);
                        i |= 16;
                        break;
                    case 5:
                        f10 = fG;
                        objG5 = bVarD.G(descriptor2, 5, C0.f11399a, objG5);
                        i |= 32;
                        break;
                    case 6:
                        f10 = fG;
                        objG6 = bVarD.G(descriptor2, 6, new C1526e(C0.f11399a), objG6);
                        i |= 64;
                        break;
                    case 7:
                        f10 = fG;
                        objG7 = bVarD.G(descriptor2, 7, G.f11421a, objG7);
                        i |= 128;
                        break;
                    case 8:
                        f10 = fG;
                        objG8 = bVarD.G(descriptor2, 8, G.f11421a, objG8);
                        i |= 256;
                        break;
                    case 9:
                        f10 = fG;
                        objG9 = bVarD.G(descriptor2, 9, Q.f11448a, objG9);
                        i |= AdRequest.MAX_CONTENT_URL_LENGTH;
                        break;
                    case 10:
                        f10 = fG;
                        objG10 = bVarD.G(descriptor2, 10, Q.f11448a, objG10);
                        i |= 1024;
                        break;
                    case 11:
                        f10 = fG;
                        objG11 = bVarD.G(descriptor2, 11, G.f11421a, objG11);
                        i |= 2048;
                        break;
                    default:
                        throw new n(iX);
                }
                fG = f10;
            }
            bVarD.b(descriptor2);
            return new i(i, fG, (String) objG, (Integer) objG2, (Integer) objG3, (Float) objG4, (String) objG5, (List) objG6, (Float) objG7, (Float) objG8, (Integer) objG9, (Integer) objG10, (Float) objG11, null);
        }

        @Override // M9.b
        public O9.e getDescriptor() {
            return descriptor;
        }

        @Override // M9.b
        public void serialize(P9.e encoder, i value) {
            l.f(encoder, "encoder");
            l.f(value, "value");
            O9.e descriptor2 = getDescriptor();
            P9.c cVarD = encoder.d(descriptor2);
            i.write$Self(value, cVarD, descriptor2);
            cVarD.b(descriptor2);
        }

        @Override // Q9.H
        public M9.b<?>[] typeParametersSerializers() {
            return C1549p0.f11523a;
        }
    }

    /* compiled from: SessionContext.kt */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final M9.b<i> serializer() {
            return a.INSTANCE;
        }

        private b() {
        }
    }

    public i() {
    }

    public static final void write$Self(i self, P9.c output, O9.e serialDesc) {
        l.f(self, "self");
        l.f(output, "output");
        l.f(serialDesc, "serialDesc");
        if (output.F(serialDesc, 0) || self.levelPercentile != null) {
            output.w(serialDesc, 0, G.f11421a, self.levelPercentile);
        }
        if (output.F(serialDesc, 1) || self.page != null) {
            output.w(serialDesc, 1, C0.f11399a, self.page);
        }
        if (output.F(serialDesc, 2) || self.timeSpent != null) {
            output.w(serialDesc, 2, Q.f11448a, self.timeSpent);
        }
        if (output.F(serialDesc, 3) || self.signupDate != null) {
            output.w(serialDesc, 3, Q.f11448a, self.signupDate);
        }
        if (output.F(serialDesc, 4) || self.userScorePercentile != null) {
            output.w(serialDesc, 4, G.f11421a, self.userScorePercentile);
        }
        if (output.F(serialDesc, 5) || self.userID != null) {
            output.w(serialDesc, 5, C0.f11399a, self.userID);
        }
        if (output.F(serialDesc, 6) || self.friends != null) {
            output.w(serialDesc, 6, new C1526e(C0.f11399a), self.friends);
        }
        if (output.F(serialDesc, 7) || self.userLevelPercentile != null) {
            output.w(serialDesc, 7, G.f11421a, self.userLevelPercentile);
        }
        if (output.F(serialDesc, 8) || self.healthPercentile != null) {
            output.w(serialDesc, 8, G.f11421a, self.healthPercentile);
        }
        if (output.F(serialDesc, 9) || self.sessionStartTime != null) {
            output.w(serialDesc, 9, Q.f11448a, self.sessionStartTime);
        }
        if (output.F(serialDesc, 10) || self.sessionDuration != null) {
            output.w(serialDesc, 10, Q.f11448a, self.sessionDuration);
        }
        if (!output.F(serialDesc, 11) && self.inGamePurchasesUSD == null) {
            return;
        }
        output.w(serialDesc, 11, G.f11421a, self.inGamePurchasesUSD);
    }

    public final i setFriends(List<String> list) {
        this.friends = list != null ? C2097r.I0(list) : null;
        return this;
    }

    public final i setHealthPercentile(float f10) {
        if (m.INSTANCE.isInRange(f10, 0.0f, 100.0f)) {
            this.healthPercentile = Float.valueOf(f10);
        }
        return this;
    }

    public final i setInGamePurchasesUSD(float f10) {
        if (m.isInRange$default(m.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.inGamePurchasesUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final i setLevelPercentile(float f10) {
        if (m.INSTANCE.isInRange(f10, 0.0f, 100.0f)) {
            this.levelPercentile = Float.valueOf(f10);
        }
        return this;
    }

    public final i setPage(String page) {
        l.f(page, "page");
        this.page = page;
        return this;
    }

    public final i setSessionDuration(int i) {
        this.sessionDuration = Integer.valueOf(i);
        return this;
    }

    public final i setSessionStartTime(int i) {
        this.sessionStartTime = Integer.valueOf(i);
        return this;
    }

    public final i setSignupDate(int i) {
        this.signupDate = Integer.valueOf(i);
        return this;
    }

    public final i setTimeSpent(int i) {
        this.timeSpent = Integer.valueOf(i);
        return this;
    }

    public final i setUserID(String userID) {
        l.f(userID, "userID");
        this.userID = userID;
        return this;
    }

    public final i setUserLevelPercentile(float f10) {
        if (m.INSTANCE.isInRange(f10, 0.0f, 100.0f)) {
            this.userLevelPercentile = Float.valueOf(f10);
        }
        return this;
    }

    public final i setUserScorePercentile(float f10) {
        if (m.INSTANCE.isInRange(f10, 0.0f, 100.0f)) {
            this.userScorePercentile = Float.valueOf(f10);
        }
        return this;
    }

    public /* synthetic */ i(int i, Float f10, String str, Integer num, Integer num2, Float f11, String str2, List list, Float f12, Float f13, Integer num3, Integer num4, Float f14, x0 x0Var) {
        if ((i & 1) == 0) {
            this.levelPercentile = null;
        } else {
            this.levelPercentile = f10;
        }
        if ((i & 2) == 0) {
            this.page = null;
        } else {
            this.page = str;
        }
        if ((i & 4) == 0) {
            this.timeSpent = null;
        } else {
            this.timeSpent = num;
        }
        if ((i & 8) == 0) {
            this.signupDate = null;
        } else {
            this.signupDate = num2;
        }
        if ((i & 16) == 0) {
            this.userScorePercentile = null;
        } else {
            this.userScorePercentile = f11;
        }
        if ((i & 32) == 0) {
            this.userID = null;
        } else {
            this.userID = str2;
        }
        if ((i & 64) == 0) {
            this.friends = null;
        } else {
            this.friends = list;
        }
        if ((i & 128) == 0) {
            this.userLevelPercentile = null;
        } else {
            this.userLevelPercentile = f12;
        }
        if ((i & 256) == 0) {
            this.healthPercentile = null;
        } else {
            this.healthPercentile = f13;
        }
        if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) == 0) {
            this.sessionStartTime = null;
        } else {
            this.sessionStartTime = num3;
        }
        if ((i & 1024) == 0) {
            this.sessionDuration = null;
        } else {
            this.sessionDuration = num4;
        }
        if ((i & 2048) == 0) {
            this.inGamePurchasesUSD = null;
        } else {
            this.inGamePurchasesUSD = f14;
        }
    }

    private static /* synthetic */ void getFriends$annotations() {
    }

    private static /* synthetic */ void getHealthPercentile$annotations() {
    }

    private static /* synthetic */ void getInGamePurchasesUSD$annotations() {
    }

    private static /* synthetic */ void getLevelPercentile$annotations() {
    }

    private static /* synthetic */ void getPage$annotations() {
    }

    private static /* synthetic */ void getSessionDuration$annotations() {
    }

    private static /* synthetic */ void getSessionStartTime$annotations() {
    }

    private static /* synthetic */ void getSignupDate$annotations() {
    }

    private static /* synthetic */ void getTimeSpent$annotations() {
    }

    private static /* synthetic */ void getUserID$annotations() {
    }

    private static /* synthetic */ void getUserLevelPercentile$annotations() {
    }

    private static /* synthetic */ void getUserScorePercentile$annotations() {
    }
}
