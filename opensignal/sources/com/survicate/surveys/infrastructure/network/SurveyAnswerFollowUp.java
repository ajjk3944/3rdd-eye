package com.survicate.surveys.infrastructure.network;

import br.g;
import br.l;
import gu.a;
import iu.e;
import ju.b;
import kotlin.Metadata;
import ku.c1;
import ku.p0;
import ku.y0;
import lq.c;
import mu.y;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006("}, d2 = {"Lcom/survicate/surveys/infrastructure/network/SurveyAnswerFollowUp;", "", "", "question", "answer", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/infrastructure/network/SurveyAnswerFollowUp;Lju/b;Liu/e;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/survicate/surveys/infrastructure/network/SurveyAnswerFollowUp;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQuestion", "getQuestion$annotations", "()V", "getAnswer", "getAnswer$annotations", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SurveyAnswerFollowUp {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String answer;
    private final String question;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/SurveyAnswerFollowUp$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/infrastructure/network/SurveyAnswerFollowUp;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final a serializer() {
            return SurveyAnswerFollowUp$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @c
    public /* synthetic */ SurveyAnswerFollowUp(int i10, String str, String str2, y0 y0Var) {
        if (3 != (i10 & 3)) {
            p0.f(i10, 3, SurveyAnswerFollowUp$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.question = str;
        this.answer = str2;
    }

    public static /* synthetic */ SurveyAnswerFollowUp copy$default(SurveyAnswerFollowUp surveyAnswerFollowUp, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = surveyAnswerFollowUp.question;
        }
        if ((i10 & 2) != 0) {
            str2 = surveyAnswerFollowUp.answer;
        }
        return surveyAnswerFollowUp.copy(str, str2);
    }

    public static /* synthetic */ void getAnswer$annotations() {
    }

    public static /* synthetic */ void getQuestion$annotations() {
    }

    public static final /* synthetic */ void write$Self(SurveyAnswerFollowUp self, b output, e serialDesc) {
        y yVar = (y) output;
        yVar.x(serialDesc, 0, self.question);
        yVar.i(serialDesc, 1, c1.f14534a, self.answer);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAnswer() {
        return this.answer;
    }

    public final SurveyAnswerFollowUp copy(String question, String answer) {
        l.e(question, "question");
        return new SurveyAnswerFollowUp(question, answer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyAnswerFollowUp)) {
            return false;
        }
        SurveyAnswerFollowUp surveyAnswerFollowUp = (SurveyAnswerFollowUp) other;
        return l.a(this.question, surveyAnswerFollowUp.question) && l.a(this.answer, surveyAnswerFollowUp.answer);
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final String getQuestion() {
        return this.question;
    }

    public int hashCode() {
        int iHashCode = this.question.hashCode() * 31;
        String str = this.answer;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SurveyAnswerFollowUp(question=");
        sb2.append(this.question);
        sb2.append(", answer=");
        return h0.b.r(sb2, this.answer, ')');
    }

    public SurveyAnswerFollowUp(String str, String str2) {
        l.e(str, "question");
        this.question = str;
        this.answer = str2;
    }
}
