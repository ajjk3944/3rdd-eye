package com.survicate.surveys.infrastructure.network;

import br.g;
import br.l;
import gu.a;
import iu.e;
import ju.b;
import kotlin.Metadata;
import ku.c1;
import ku.y0;
import lq.c;
import mu.y;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B?\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0002\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\u001b\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010\b\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00068\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001b\u0012\u0004\b#\u0010\u0003\u001a\u0004\b\"\u0010\u001dR*\u0010\t\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00068\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001b\u0012\u0004\b%\u0010\u0003\u001a\u0004\b$\u0010\u001d¨\u0006("}, d2 = {"Lcom/survicate/surveys/infrastructure/network/VisitData;", "", "<init>", "()V", "", "seen1", "", "languageCode", "platform", "userAgent", "Lku/y0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/infrastructure/network/VisitData;Lju/b;Liu/e;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "getLanguageCode", "()Ljava/lang/String;", "setLanguageCode", "(Ljava/lang/String;)V", "getLanguageCode$annotations", "<set-?>", "getPlatform", "getPlatform$annotations", "getUserAgent", "getUserAgent$annotations", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VisitData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String languageCode;
    private String platform;
    private String userAgent;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/VisitData$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/infrastructure/network/VisitData;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final a serializer() {
            return VisitData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public VisitData() {
        this.platform = "Android";
        this.userAgent = UserAgentBuilder.INSTANCE.build();
    }

    public static /* synthetic */ void getLanguageCode$annotations() {
    }

    public static /* synthetic */ void getPlatform$annotations() {
    }

    public static /* synthetic */ void getUserAgent$annotations() {
    }

    public static final /* synthetic */ void write$Self(VisitData self, b output, e serialDesc) {
        if (output.n(serialDesc) || self.languageCode != null) {
            output.i(serialDesc, 0, c1.f14534a, self.languageCode);
        }
        if (output.n(serialDesc) || !l.a(self.platform, "Android")) {
            ((y) output).x(serialDesc, 1, self.platform);
        }
        if (!output.n(serialDesc) && l.a(self.userAgent, UserAgentBuilder.INSTANCE.build())) {
            return;
        }
        ((y) output).x(serialDesc, 2, self.userAgent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!VisitData.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        l.c(other, "null cannot be cast to non-null type com.survicate.surveys.infrastructure.network.VisitData");
        VisitData visitData = (VisitData) other;
        return l.a(this.platform, visitData.platform) && l.a(this.userAgent, visitData.userAgent) && l.a(this.languageCode, visitData.languageCode);
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        int iG = c7.a.g(this.userAgent, this.platform.hashCode() * 31, 31);
        String str = this.languageCode;
        return iG + (str != null ? str.hashCode() : 0);
    }

    public final void setLanguageCode(String str) {
        this.languageCode = str;
    }

    @c
    public /* synthetic */ VisitData(int i10, String str, String str2, String str3, y0 y0Var) {
        this.languageCode = (i10 & 1) == 0 ? null : str;
        if ((i10 & 2) == 0) {
            this.platform = "Android";
        } else {
            this.platform = str2;
        }
        if ((i10 & 4) == 0) {
            this.userAgent = UserAgentBuilder.INSTANCE.build();
        } else {
            this.userAgent = str3;
        }
    }
}
