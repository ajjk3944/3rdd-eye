package com.survicate.surveys.entities.survey.questions.cta;

import android.os.Parcel;
import android.os.Parcelable;
import ap.a;
import br.l;
import com.survicate.surveys.entities.survey.questions.SurveyPoint;
import com.survicate.surveys.entities.survey.questions.SurveyPointImage;
import com.survicate.surveys.entities.survey.translations.SurveyPointTranslation;
import kotlin.Metadata;
import nk.o;
import wo.d;
import wo.f;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0004\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0010\u0010&\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010#J\u0010\u0010)\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*JZ\u0010+\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\u00042\b\b\u0003\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010#J\u0010\u0010.\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b.\u0010'J\u001a\u00101\u001a\u00020\u001a2\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b3\u0010'J \u00108\u001a\u0002072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b8\u00109R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b>\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b?\u0010#R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bA\u0010'R\u001a\u0010\n\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\bB\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bD\u0010*¨\u0006E"}, d2 = {"Lcom/survicate/surveys/entities/survey/questions/cta/SurveyCtaSurveyPoint;", "Lcom/survicate/surveys/entities/survey/questions/SurveyPoint;", "", "id", "", "type", "content", "description", "", "maxPath", "answerType", "Lcom/survicate/surveys/entities/survey/questions/cta/CtaSettings;", "ctaSettings", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/survicate/surveys/entities/survey/questions/cta/CtaSettings;)V", "Lwo/d;", "displayEngine", "Lwo/f;", "getDisplayer", "(Lwo/d;)Lwo/f;", "Lcom/survicate/surveys/entities/survey/translations/SurveyPointTranslation;", "translation", "translatedWith", "(Lcom/survicate/surveys/entities/survey/translations/SurveyPointTranslation;)Lcom/survicate/surveys/entities/survey/questions/SurveyPoint;", "getNextSurveyPointId", "()Ljava/lang/Long;", "", "isMandatory", "()Z", "Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "getSurveyPointImage", "()Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()I", "component6", "component7", "()Lcom/survicate/surveys/entities/survey/questions/cta/CtaSettings;", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/survicate/surveys/entities/survey/questions/cta/CtaSettings;)Lcom/survicate/surveys/entities/survey/questions/cta/SurveyCtaSurveyPoint;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getId", "Ljava/lang/String;", "getType", "getContent", "getDescription", "I", "getMaxPath", "getAnswerType", "Lcom/survicate/surveys/entities/survey/questions/cta/CtaSettings;", "getCtaSettings", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SurveyCtaSurveyPoint implements SurveyPoint {
    public static final Parcelable.Creator<SurveyCtaSurveyPoint> CREATOR = new Creator();
    private final String answerType;
    private final String content;
    private final CtaSettings ctaSettings;
    private final String description;
    private final long id;
    private final int maxPath;
    private final String type;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SurveyCtaSurveyPoint> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SurveyCtaSurveyPoint createFromParcel(Parcel parcel) {
            l.e(parcel, "parcel");
            return new SurveyCtaSurveyPoint(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), (CtaSettings) parcel.readParcelable(SurveyCtaSurveyPoint.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SurveyCtaSurveyPoint[] newArray(int i10) {
            return new SurveyCtaSurveyPoint[i10];
        }
    }

    public SurveyCtaSurveyPoint(@o(name = "id") long j, @o(name = "type") String str, @o(name = "content") String str2, @o(name = "description") String str3, @o(name = "max_path") int i10, @o(name = "answer_type") String str4, @o(name = "settings") CtaSettings ctaSettings) {
        l.e(str, "type");
        l.e(str4, "answerType");
        l.e(ctaSettings, "ctaSettings");
        this.id = j;
        this.type = str;
        this.content = str2;
        this.description = str3;
        this.maxPath = i10;
        this.answerType = str4;
        this.ctaSettings = ctaSettings;
    }

    public static /* synthetic */ SurveyCtaSurveyPoint copy$default(SurveyCtaSurveyPoint surveyCtaSurveyPoint, long j, String str, String str2, String str3, int i10, String str4, CtaSettings ctaSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j = surveyCtaSurveyPoint.id;
        }
        long j7 = j;
        if ((i11 & 2) != 0) {
            str = surveyCtaSurveyPoint.type;
        }
        String str5 = str;
        if ((i11 & 4) != 0) {
            str2 = surveyCtaSurveyPoint.content;
        }
        String str6 = str2;
        if ((i11 & 8) != 0) {
            str3 = surveyCtaSurveyPoint.description;
        }
        String str7 = str3;
        if ((i11 & 16) != 0) {
            i10 = surveyCtaSurveyPoint.maxPath;
        }
        return surveyCtaSurveyPoint.copy(j7, str5, str6, str7, i10, (i11 & 32) != 0 ? surveyCtaSurveyPoint.answerType : str4, (i11 & 64) != 0 ? surveyCtaSurveyPoint.ctaSettings : ctaSettings);
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

    /* renamed from: component7, reason: from getter */
    public final CtaSettings getCtaSettings() {
        return this.ctaSettings;
    }

    public final SurveyCtaSurveyPoint copy(@o(name = "id") long id2, @o(name = "type") String type, @o(name = "content") String content, @o(name = "description") String description, @o(name = "max_path") int maxPath, @o(name = "answer_type") String answerType, @o(name = "settings") CtaSettings ctaSettings) {
        l.e(type, "type");
        l.e(answerType, "answerType");
        l.e(ctaSettings, "ctaSettings");
        return new SurveyCtaSurveyPoint(id2, type, content, description, maxPath, answerType, ctaSettings);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyCtaSurveyPoint)) {
            return false;
        }
        SurveyCtaSurveyPoint surveyCtaSurveyPoint = (SurveyCtaSurveyPoint) other;
        return this.id == surveyCtaSurveyPoint.id && l.a(this.type, surveyCtaSurveyPoint.type) && l.a(this.content, surveyCtaSurveyPoint.content) && l.a(this.description, surveyCtaSurveyPoint.description) && this.maxPath == surveyCtaSurveyPoint.maxPath && l.a(this.answerType, surveyCtaSurveyPoint.answerType) && l.a(this.ctaSettings, surveyCtaSurveyPoint.ctaSettings);
    }

    @Override // com.survicate.surveys.entities.survey.questions.SurveyPoint
    public String getAnswerType() {
        return this.answerType;
    }

    @Override // com.survicate.surveys.entities.survey.questions.SurveyPoint
    public String getContent() {
        return this.content;
    }

    public final CtaSettings getCtaSettings() {
        return this.ctaSettings;
    }

    @Override // com.survicate.surveys.entities.survey.questions.SurveyPoint
    public String getDescription() {
        return this.description;
    }

    @Override // com.survicate.surveys.entities.survey.questions.SurveyPoint
    public f getDisplayer(d displayEngine) {
        l.e(displayEngine, "displayEngine");
        return new a(this, displayEngine, 0);
    }

    @Override // com.survicate.surveys.entities.survey.questions.SurveyPoint
    public long getId() {
        return this.id;
    }

    @Override // com.survicate.surveys.entities.survey.questions.SurveyPoint
    public int getMaxPath() {
        return this.maxPath;
    }

    public final Long getNextSurveyPointId() {
        return this.ctaSettings.getNextSurveyPointId();
    }

    @Override // com.survicate.surveys.entities.survey.questions.SurveyPoint
    public SurveyPointImage getSurveyPointImage() {
        return this.ctaSettings.getSurveyPointImage();
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
        return this.ctaSettings.hashCode() + c7.a.g(this.answerType, c7.a.C(this.maxPath, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31);
    }

    @Override // com.survicate.surveys.entities.survey.questions.SurveyPoint
    public boolean isMandatory() {
        return true;
    }

    public String toString() {
        return "SurveyCtaSurveyPoint(id=" + this.id + ", type=" + this.type + ", content=" + this.content + ", description=" + this.description + ", maxPath=" + this.maxPath + ", answerType=" + this.answerType + ", ctaSettings=" + this.ctaSettings + ')';
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
        parcel.writeParcelable(this.ctaSettings, flags);
    }

    @Override // com.survicate.surveys.entities.survey.translations.Translatable
    public SurveyPoint translatedWith(SurveyPointTranslation translation) {
        return copy$default(this, 0L, null, xu.l.C(translation != null ? translation.getContent() : null, getContent()), xu.l.C(translation != null ? translation.getDescription() : null, getDescription()), 0, null, this.ctaSettings.translatedWith(translation != null ? translation.getSettings() : null), 51, null);
    }
}
