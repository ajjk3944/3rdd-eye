package com.survicate.surveys.infrastructure.network;

import br.g;
import br.l;
import gu.a;
import iu.e;
import java.util.List;
import ju.b;
import kotlin.Metadata;
import ku.c;
import ku.c1;
import ku.f;
import ku.k0;
import ku.y0;
import mu.y;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b9\b\u0007\u0018\u0000 \\2\u00020\u0001:\u0002]\\B\u009b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0015B\u007f\b\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#HÇ\u0001¢\u0006\u0004\b&\u0010'R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010(\u0012\u0004\b-\u0010.\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010(\u0012\u0004\b1\u0010.\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u00102\u0012\u0004\b7\u0010.\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u00108\u0012\u0004\b=\u0010.\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u00102\u0012\u0004\b@\u0010.\u001a\u0004\b>\u00104\"\u0004\b?\u00106R(\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010A\u0012\u0004\bF\u0010.\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER*\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\f\u00102\u0012\u0004\bI\u0010.\u001a\u0004\bG\u00104\"\u0004\bH\u00106R0\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010J\u0012\u0004\bO\u0010.\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR*\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0010\u00102\u0012\u0004\bR\u0010.\u001a\u0004\bP\u00104\"\u0004\bQ\u00106R*\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0011\u00108\u0012\u0004\bU\u0010.\u001a\u0004\bS\u0010:\"\u0004\bT\u0010<R*\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u00102\u0012\u0004\bX\u0010.\u001a\u0004\bV\u00104\"\u0004\bW\u00106R*\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0013\u00102\u0012\u0004\b[\u0010.\u001a\u0004\bY\u00104\"\u0004\bZ\u00106¨\u0006^"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/SurveyAnswer;", "", "", "finished", "ctaSuccess", "", "content", "", "questionAnswerId", "answerType", "", "completionRate", "comment", "", "Lcom/survicate/surveys/infrastructure/network/SurveyAnswerFollowUp;", "followUp", "answer", "answerId", "matrixGroupName", "matrixColumnName", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;DLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;DLjava/lang/String;Ljava/util/List;Lku/y0;)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/infrastructure/network/SurveyAnswer;Lju/b;Liu/e;)V", "Ljava/lang/Boolean;", "getFinished", "()Ljava/lang/Boolean;", "setFinished", "(Ljava/lang/Boolean;)V", "getFinished$annotations", "()V", "getCtaSuccess", "setCtaSuccess", "getCtaSuccess$annotations", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getContent$annotations", "Ljava/lang/Long;", "getQuestionAnswerId", "()Ljava/lang/Long;", "setQuestionAnswerId", "(Ljava/lang/Long;)V", "getQuestionAnswerId$annotations", "getAnswerType", "setAnswerType", "getAnswerType$annotations", "D", "getCompletionRate", "()D", "setCompletionRate", "(D)V", "getCompletionRate$annotations", "getComment", "setComment", "getComment$annotations", "Ljava/util/List;", "getFollowUp", "()Ljava/util/List;", "setFollowUp", "(Ljava/util/List;)V", "getFollowUp$annotations", "getAnswer", "setAnswer", "getAnswer$annotations", "getAnswerId", "setAnswerId", "getAnswerId$annotations", "getMatrixGroupName", "setMatrixGroupName", "getMatrixGroupName$annotations", "getMatrixColumnName", "setMatrixColumnName", "getMatrixColumnName$annotations", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurveyAnswer {
    private String answer;
    private Long answerId;
    private String answerType;
    private String comment;
    private double completionRate;
    private String content;
    private Boolean ctaSuccess;
    private Boolean finished;
    private List<SurveyAnswerFollowUp> followUp;
    private String matrixColumnName;
    private String matrixGroupName;
    private Long questionAnswerId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final a[] $childSerializers = {null, null, null, null, null, null, null, new c(SurveyAnswerFollowUp$$serializer.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/SurveyAnswer$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/infrastructure/network/SurveyAnswer;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final a serializer() {
            return SurveyAnswer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SurveyAnswer() {
        this(null, null, null, null, null, 0.0d, null, null, null, null, null, null, 4095, null);
    }

    public static /* synthetic */ void getAnswer$annotations() {
    }

    public static /* synthetic */ void getAnswerId$annotations() {
    }

    public static /* synthetic */ void getAnswerType$annotations() {
    }

    public static /* synthetic */ void getComment$annotations() {
    }

    public static /* synthetic */ void getCompletionRate$annotations() {
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void getCtaSuccess$annotations() {
    }

    public static /* synthetic */ void getFinished$annotations() {
    }

    public static /* synthetic */ void getFollowUp$annotations() {
    }

    public static /* synthetic */ void getMatrixColumnName$annotations() {
    }

    public static /* synthetic */ void getMatrixGroupName$annotations() {
    }

    public static /* synthetic */ void getQuestionAnswerId$annotations() {
    }

    public static final void write$Self(SurveyAnswer self, b output, e serialDesc) {
        a[] aVarArr = $childSerializers;
        if (output.n(serialDesc) || self.finished != null) {
            output.i(serialDesc, 0, f.f14545a, self.finished);
        }
        if (output.n(serialDesc) || self.ctaSuccess != null) {
            output.i(serialDesc, 1, f.f14545a, self.ctaSuccess);
        }
        if (output.n(serialDesc) || self.content != null) {
            output.i(serialDesc, 2, c1.f14534a, self.content);
        }
        if (output.n(serialDesc) || self.questionAnswerId != null) {
            output.i(serialDesc, 3, k0.f14571a, self.questionAnswerId);
        }
        if (output.n(serialDesc) || self.answerType != null) {
            output.i(serialDesc, 4, c1.f14534a, self.answerType);
        }
        if (output.n(serialDesc) || Double.compare(self.completionRate, 0.0d) != 0) {
            double d6 = self.completionRate;
            y yVar = (y) output;
            yVar.t(serialDesc, 5);
            yVar.e(d6);
        }
        if (output.n(serialDesc) || self.comment != null) {
            output.i(serialDesc, 6, c1.f14534a, self.comment);
        }
        if (!output.n(serialDesc) && self.followUp == null) {
            return;
        }
        output.i(serialDesc, 7, aVarArr[7], self.followUp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!SurveyAnswer.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        l.c(other, "null cannot be cast to non-null type com.survicate.surveys.infrastructure.network.SurveyAnswer");
        SurveyAnswer surveyAnswer = (SurveyAnswer) other;
        return l.a(this.finished, surveyAnswer.finished) && l.a(this.ctaSuccess, surveyAnswer.ctaSuccess) && l.a(this.content, surveyAnswer.content) && l.a(this.questionAnswerId, surveyAnswer.questionAnswerId) && l.a(this.answerType, surveyAnswer.answerType) && this.completionRate == surveyAnswer.completionRate && l.a(this.comment, surveyAnswer.comment) && l.a(this.followUp, surveyAnswer.followUp);
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final Long getAnswerId() {
        return this.answerId;
    }

    public final String getAnswerType() {
        return this.answerType;
    }

    public final String getComment() {
        return this.comment;
    }

    public final double getCompletionRate() {
        return this.completionRate;
    }

    public final String getContent() {
        return this.content;
    }

    public final Boolean getCtaSuccess() {
        return this.ctaSuccess;
    }

    public final Boolean getFinished() {
        return this.finished;
    }

    public final List<SurveyAnswerFollowUp> getFollowUp() {
        return this.followUp;
    }

    public final String getMatrixColumnName() {
        return this.matrixColumnName;
    }

    public final String getMatrixGroupName() {
        return this.matrixGroupName;
    }

    public final Long getQuestionAnswerId() {
        return this.questionAnswerId;
    }

    public int hashCode() {
        Boolean bool = this.finished;
        int iHashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.ctaSuccess;
        int iHashCode2 = (iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        String str = this.content;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Long l10 = this.questionAnswerId;
        int iHashCode4 = (iHashCode3 + (l10 != null ? l10.hashCode() : 0)) * 31;
        String str2 = this.answerType;
        int iA = h0.b.a(this.completionRate, (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
        String str3 = this.comment;
        int iHashCode5 = (iA + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<SurveyAnswerFollowUp> list = this.followUp;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final void setAnswer(String str) {
        this.answer = str;
    }

    public final void setAnswerId(Long l10) {
        this.answerId = l10;
    }

    public final void setAnswerType(String str) {
        this.answerType = str;
    }

    public final void setComment(String str) {
        this.comment = str;
    }

    public final void setCompletionRate(double d6) {
        this.completionRate = d6;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setCtaSuccess(Boolean bool) {
        this.ctaSuccess = bool;
    }

    public final void setFinished(Boolean bool) {
        this.finished = bool;
    }

    public final void setFollowUp(List<SurveyAnswerFollowUp> list) {
        this.followUp = list;
    }

    public final void setMatrixColumnName(String str) {
        this.matrixColumnName = str;
    }

    public final void setMatrixGroupName(String str) {
        this.matrixGroupName = str;
    }

    public final void setQuestionAnswerId(Long l10) {
        this.questionAnswerId = l10;
    }

    @lq.c
    public /* synthetic */ SurveyAnswer(int i10, Boolean bool, Boolean bool2, String str, Long l10, String str2, double d6, String str3, List list, y0 y0Var) {
        if ((i10 & 1) == 0) {
            this.finished = null;
        } else {
            this.finished = bool;
        }
        if ((i10 & 2) == 0) {
            this.ctaSuccess = null;
        } else {
            this.ctaSuccess = bool2;
        }
        if ((i10 & 4) == 0) {
            this.content = null;
        } else {
            this.content = str;
        }
        if ((i10 & 8) == 0) {
            this.questionAnswerId = null;
        } else {
            this.questionAnswerId = l10;
        }
        if ((i10 & 16) == 0) {
            this.answerType = null;
        } else {
            this.answerType = str2;
        }
        if ((i10 & 32) == 0) {
            this.completionRate = 0.0d;
        } else {
            this.completionRate = d6;
        }
        if ((i10 & 64) == 0) {
            this.comment = null;
        } else {
            this.comment = str3;
        }
        if ((i10 & 128) == 0) {
            this.followUp = null;
        } else {
            this.followUp = list;
        }
        this.answer = null;
        this.answerId = null;
        this.matrixGroupName = null;
        this.matrixColumnName = null;
    }

    public SurveyAnswer(Boolean bool, Boolean bool2, String str, Long l10, String str2, double d6, String str3, List<SurveyAnswerFollowUp> list, String str4, Long l11, String str5, String str6) {
        this.finished = bool;
        this.ctaSuccess = bool2;
        this.content = str;
        this.questionAnswerId = l10;
        this.answerType = str2;
        this.completionRate = d6;
        this.comment = str3;
        this.followUp = list;
        this.answer = str4;
        this.answerId = l11;
        this.matrixGroupName = str5;
        this.matrixColumnName = str6;
    }

    public /* synthetic */ SurveyAnswer(Boolean bool, Boolean bool2, String str, Long l10, String str2, double d6, String str3, List list, String str4, Long l11, String str5, String str6, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : bool2, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? 0.0d : d6, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : list, (i10 & 256) != 0 ? null : str4, (i10 & 512) != 0 ? null : l11, (i10 & 1024) != 0 ? null : str5, (i10 & 2048) != 0 ? null : str6);
    }
}
