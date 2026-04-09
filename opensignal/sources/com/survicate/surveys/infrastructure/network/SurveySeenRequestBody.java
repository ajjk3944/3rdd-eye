package com.survicate.surveys.infrastructure.network;

import br.g;
import br.l;
import com.survicate.surveys.entities.models.RespondentEvent;
import gu.a;
import kotlin.Metadata;
import ku.p0;
import ku.y0;
import lq.c;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0004\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/SurveySeenRequestBody;", "", "", "surveyFirstSeen", "<init>", "(Z)V", "Lcom/survicate/surveys/entities/models/RespondentEvent$SurveySeen;", "event", "(Lcom/survicate/surveys/entities/models/RespondentEvent$SurveySeen;)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(IZLku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/infrastructure/network/SurveySeenRequestBody;Lju/b;Liu/e;)V", "Z", "getSurveyFirstSeen", "()Z", "getSurveyFirstSeen$annotations", "()V", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurveySeenRequestBody {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean surveyFirstSeen;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/SurveySeenRequestBody$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/infrastructure/network/SurveySeenRequestBody;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final a serializer() {
            return SurveySeenRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @c
    public /* synthetic */ SurveySeenRequestBody(int i10, boolean z10, y0 y0Var) {
        if (1 == (i10 & 1)) {
            this.surveyFirstSeen = z10;
        } else {
            p0.f(i10, 1, SurveySeenRequestBody$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ void getSurveyFirstSeen$annotations() {
    }

    public final boolean getSurveyFirstSeen() {
        return this.surveyFirstSeen;
    }

    private SurveySeenRequestBody(boolean z10) {
        this.surveyFirstSeen = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SurveySeenRequestBody(RespondentEvent.SurveySeen surveySeen) {
        this(surveySeen.getSurveyFirstSeen());
        l.e(surveySeen, "event");
    }
}
