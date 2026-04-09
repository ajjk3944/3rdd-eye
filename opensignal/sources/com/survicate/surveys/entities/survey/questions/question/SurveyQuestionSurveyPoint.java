package com.survicate.surveys.entities.survey.questions.question;

import android.os.Parcel;
import android.os.Parcelable;
import ap.a;
import br.l;
import com.survicate.surveys.entities.survey.questions.SurveyPoint;
import com.survicate.surveys.entities.survey.questions.SurveyPointImage;
import com.survicate.surveys.entities.survey.translations.SurveyPointEntryTranslation;
import com.survicate.surveys.entities.survey.translations.SurveyPointTranslation;
import h0.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import mq.p;
import nk.o;
import wo.d;
import wo.f;
import yp.e;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010$J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-Jj\u0010.\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\u00042\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0003\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b0\u0010$J\u0010\u00101\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b1\u0010(J\u001a\u00104\u001a\u00020\u001b2\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b6\u0010(J \u0010;\u001a\u00020:2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b;\u0010<J3\u0010?\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010\u000bH\u0002¢\u0006\u0004\b?\u0010@R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bD\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010C\u001a\u0004\bE\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bF\u0010$R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010G\u001a\u0004\bH\u0010(R\u001a\u0010\n\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bI\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010J\u001a\u0004\bK\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010L\u001a\u0004\bM\u0010-¨\u0006N"}, d2 = {"Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionSurveyPoint;", "Lcom/survicate/surveys/entities/survey/questions/SurveyPoint;", "", "id", "", "type", "content", "description", "", "maxPath", "answerType", "", "Lcom/survicate/surveys/entities/survey/questions/question/QuestionPointAnswer;", "answers", "Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionPointSettings;", "settings", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionPointSettings;)V", "Lwo/d;", "displayEngine", "Lwo/f;", "getDisplayer", "(Lwo/d;)Lwo/f;", "Lcom/survicate/surveys/entities/survey/translations/SurveyPointTranslation;", "translation", "translatedWith", "(Lcom/survicate/surveys/entities/survey/translations/SurveyPointTranslation;)Lcom/survicate/surveys/entities/survey/questions/SurveyPoint;", "", "isMandatory", "()Z", "Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "getSurveyPointImage", "()Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()I", "component6", "component7", "()Ljava/util/List;", "component8", "()Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionPointSettings;", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionPointSettings;)Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionSurveyPoint;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/survicate/surveys/entities/survey/translations/SurveyPointEntryTranslation;", "translations", "translateAnswers", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "J", "getId", "Ljava/lang/String;", "getType", "getContent", "getDescription", "I", "getMaxPath", "getAnswerType", "Ljava/util/List;", "getAnswers", "Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionPointSettings;", "getSettings", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SurveyQuestionSurveyPoint implements SurveyPoint {
    public static final Parcelable.Creator<SurveyQuestionSurveyPoint> CREATOR = new Creator();
    private final String answerType;
    private final List<QuestionPointAnswer> answers;
    private final String content;
    private final String description;
    private final long id;
    private final int maxPath;
    private final SurveyQuestionPointSettings settings;
    private final String type;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SurveyQuestionSurveyPoint> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SurveyQuestionSurveyPoint createFromParcel(Parcel parcel) {
            l.e(parcel, "parcel");
            long j = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i10 = parcel.readInt();
            String string4 = parcel.readString();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(QuestionPointAnswer.CREATOR.createFromParcel(parcel));
            }
            return new SurveyQuestionSurveyPoint(j, string, string2, string3, i10, string4, arrayList, (SurveyQuestionPointSettings) parcel.readParcelable(SurveyQuestionSurveyPoint.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SurveyQuestionSurveyPoint[] newArray(int i10) {
            return new SurveyQuestionSurveyPoint[i10];
        }
    }

    public SurveyQuestionSurveyPoint(@o(name = "id") long j, @o(name = "type") String str, @o(name = "content") String str2, @o(name = "description") String str3, @o(name = "max_path") int i10, @o(name = "answer_type") String str4, @o(name = "answers") List<QuestionPointAnswer> list, @o(name = "settings") SurveyQuestionPointSettings surveyQuestionPointSettings) {
        l.e(str, "type");
        l.e(str4, "answerType");
        l.e(list, "answers");
        l.e(surveyQuestionPointSettings, "settings");
        this.id = j;
        this.type = str;
        this.content = str2;
        this.description = str3;
        this.maxPath = i10;
        this.answerType = str4;
        this.answers = list;
        this.settings = surveyQuestionPointSettings;
    }

    public static /* synthetic */ SurveyQuestionSurveyPoint copy$default(SurveyQuestionSurveyPoint surveyQuestionSurveyPoint, long j, String str, String str2, String str3, int i10, String str4, List list, SurveyQuestionPointSettings surveyQuestionPointSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j = surveyQuestionSurveyPoint.id;
        }
        long j7 = j;
        if ((i11 & 2) != 0) {
            str = surveyQuestionSurveyPoint.type;
        }
        String str5 = str;
        if ((i11 & 4) != 0) {
            str2 = surveyQuestionSurveyPoint.content;
        }
        String str6 = str2;
        if ((i11 & 8) != 0) {
            str3 = surveyQuestionSurveyPoint.description;
        }
        return surveyQuestionSurveyPoint.copy(j7, str5, str6, str3, (i11 & 16) != 0 ? surveyQuestionSurveyPoint.maxPath : i10, (i11 & 32) != 0 ? surveyQuestionSurveyPoint.answerType : str4, (i11 & 64) != 0 ? surveyQuestionSurveyPoint.answers : list, (i11 & 128) != 0 ? surveyQuestionSurveyPoint.settings : surveyQuestionPointSettings);
    }

    private final List<QuestionPointAnswer> translateAnswers(List<QuestionPointAnswer> answers, List<SurveyPointEntryTranslation> translations) {
        Object next;
        if (translations == null) {
            return answers;
        }
        ArrayList arrayList = new ArrayList(p.a0(answers, 10));
        for (QuestionPointAnswer questionPointAnswer : answers) {
            Iterator<T> it = translations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((SurveyPointEntryTranslation) next).getId() == questionPointAnswer.getId()) {
                    break;
                }
            }
            arrayList.add(questionPointAnswer.translatedWith((SurveyPointEntryTranslation) next));
        }
        return arrayList;
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMaxPath() {
        return this.maxPath;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAnswerType() {
        return this.answerType;
    }

    public final List<QuestionPointAnswer> component7() {
        return this.answers;
    }

    /* renamed from: component8, reason: from getter */
    public final SurveyQuestionPointSettings getSettings() {
        return this.settings;
    }

    public final SurveyQuestionSurveyPoint copy(@o(name = "id") long id2, @o(name = "type") String type, @o(name = "content") String content, @o(name = "description") String description, @o(name = "max_path") int maxPath, @o(name = "answer_type") String answerType, @o(name = "answers") List<QuestionPointAnswer> answers, @o(name = "settings") SurveyQuestionPointSettings settings) {
        l.e(type, "type");
        l.e(answerType, "answerType");
        l.e(answers, "answers");
        l.e(settings, "settings");
        return new SurveyQuestionSurveyPoint(id2, type, content, description, maxPath, answerType, answers, settings);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyQuestionSurveyPoint)) {
            return false;
        }
        SurveyQuestionSurveyPoint surveyQuestionSurveyPoint = (SurveyQuestionSurveyPoint) other;
        return this.id == surveyQuestionSurveyPoint.id && l.a(this.type, surveyQuestionSurveyPoint.type) && l.a(this.content, surveyQuestionSurveyPoint.content) && l.a(this.description, surveyQuestionSurveyPoint.description) && this.maxPath == surveyQuestionSurveyPoint.maxPath && l.a(this.answerType, surveyQuestionSurveyPoint.answerType) && l.a(this.answers, surveyQuestionSurveyPoint.answers) && l.a(this.settings, surveyQuestionSurveyPoint.settings);
    }

    @Override // com.survicate.surveys.entities.survey.questions.SurveyPoint
    public String getAnswerType() {
        return this.answerType;
    }

    public final List<QuestionPointAnswer> getAnswers() {
        return this.answers;
    }

    @Override // com.survicate.surveys.entities.survey.questions.SurveyPoint
    public String getContent() {
        return this.content;
    }

    @Override // com.survicate.surveys.entities.survey.questions.SurveyPoint
    public String getDescription() {
        return this.description;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Override // com.survicate.surveys.entities.survey.questions.SurveyPoint
    public f getDisplayer(d displayEngine) {
        l.e(displayEngine, "displayEngine");
        String answerType = getAnswerType();
        switch (answerType.hashCode()) {
            case -1710937533:
                if (answerType.equals("numerical_scale")) {
                    return new a(this, displayEngine, 5);
                }
                break;
            case -1081239615:
                if (answerType.equals("matrix")) {
                    return new hp.a(this, displayEngine);
                }
                break;
            case -938102371:
                if (answerType.equals("rating")) {
                    return new a(this, displayEngine, 6);
                }
                break;
            case -902265784:
                if (answerType.equals("single")) {
                    return new a(this, displayEngine, 7);
                }
                break;
            case 3062947:
                if (answerType.equals("csat")) {
                    return new a(this, displayEngine, 9);
                }
                break;
            case 3076014:
                if (answerType.equals("date")) {
                    return new a(this, displayEngine, 1);
                }
                break;
            case 3556653:
                if (answerType.equals("text")) {
                    return new e(this, displayEngine);
                }
                break;
            case 653829648:
                if (answerType.equals("multiple")) {
                    return new a(this, displayEngine, 3);
                }
                break;
            case 1047773692:
                if (answerType.equals("smiley_scale")) {
                    return new a(this, displayEngine, 8);
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported answer type: " + getAnswerType());
    }

    @Override // com.survicate.surveys.entities.survey.questions.SurveyPoint
    public long getId() {
        return this.id;
    }

    @Override // com.survicate.surveys.entities.survey.questions.SurveyPoint
    public int getMaxPath() {
        return this.maxPath;
    }

    public final SurveyQuestionPointSettings getSettings() {
        return this.settings;
    }

    @Override // com.survicate.surveys.entities.survey.questions.SurveyPoint
    public SurveyPointImage getSurveyPointImage() {
        return this.settings.getSurveyPointImage();
    }

    @Override // com.survicate.surveys.entities.survey.questions.SurveyPoint
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        int iG = c7.a.g(this.type, Long.hashCode(this.id) * 31, 31);
        String str = this.content;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        return this.settings.hashCode() + b.c(c7.a.g(this.answerType, c7.a.C(this.maxPath, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31), 31, this.answers);
    }

    @Override // com.survicate.surveys.entities.survey.questions.SurveyPoint
    public boolean isMandatory() {
        return this.settings.isMandatory();
    }

    public String toString() {
        return "SurveyQuestionSurveyPoint(id=" + this.id + ", type=" + this.type + ", content=" + this.content + ", description=" + this.description + ", maxPath=" + this.maxPath + ", answerType=" + this.answerType + ", answers=" + this.answers + ", settings=" + this.settings + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        l.e(parcel, "out");
        parcel.writeLong(this.id);
        parcel.writeString(this.type);
        parcel.writeString(this.content);
        parcel.writeString(this.description);
        parcel.writeInt(this.maxPath);
        parcel.writeString(this.answerType);
        Iterator itV = c7.a.v(this.answers, parcel);
        while (itV.hasNext()) {
            ((QuestionPointAnswer) itV.next()).writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.settings, flags);
    }

    @Override // com.survicate.surveys.entities.survey.translations.Translatable
    public SurveyPoint translatedWith(SurveyPointTranslation translation) {
        return copy$default(this, 0L, null, xu.l.C(translation != null ? translation.getContent() : null, getContent()), xu.l.C(translation != null ? translation.getDescription() : null, getDescription()), 0, null, translateAnswers(this.answers, translation != null ? translation.getAnswers() : null), this.settings.translatedWith(translation != null ? translation.getSettings() : null), 51, null);
    }
}
