package com.survicate.surveys.entities.survey.questions.nps;

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

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0004\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010!J\u0010\u0010'\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(JZ\u0010)\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\u00042\b\b\u0003\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010!J\u0010\u0010,\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b,\u0010%J\u001a\u0010/\u001a\u00020\u00182\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b1\u0010%J \u00106\u001a\u0002052\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b6\u00107R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b<\u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b=\u0010!R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010%R\u001a\u0010\n\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b@\u0010!R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010(¨\u0006C"}, d2 = {"Lcom/survicate/surveys/entities/survey/questions/nps/SurveyNpsSurveyPoint;", "Lcom/survicate/surveys/entities/survey/questions/SurveyPoint;", "", "id", "", "type", "content", "description", "", "maxPath", "answerType", "Lcom/survicate/surveys/entities/survey/questions/nps/SurveyNpsPointSettings;", "settings", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/survicate/surveys/entities/survey/questions/nps/SurveyNpsPointSettings;)V", "Lwo/d;", "displayEngine", "Lwo/f;", "getDisplayer", "(Lwo/d;)Lwo/f;", "Lcom/survicate/surveys/entities/survey/translations/SurveyPointTranslation;", "translation", "translatedWith", "(Lcom/survicate/surveys/entities/survey/translations/SurveyPointTranslation;)Lcom/survicate/surveys/entities/survey/questions/SurveyPoint;", "", "isMandatory", "()Z", "Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "getSurveyPointImage", "()Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()I", "component6", "component7", "()Lcom/survicate/surveys/entities/survey/questions/nps/SurveyNpsPointSettings;", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/survicate/surveys/entities/survey/questions/nps/SurveyNpsPointSettings;)Lcom/survicate/surveys/entities/survey/questions/nps/SurveyNpsSurveyPoint;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getId", "Ljava/lang/String;", "getType", "getContent", "getDescription", "I", "getMaxPath", "getAnswerType", "Lcom/survicate/surveys/entities/survey/questions/nps/SurveyNpsPointSettings;", "getSettings", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SurveyNpsSurveyPoint implements SurveyPoint {
    public static final Parcelable.Creator<SurveyNpsSurveyPoint> CREATOR = new Creator();
    private final String answerType;
    private final String content;
    private final String description;
    private final long id;
    private final int maxPath;
    private final SurveyNpsPointSettings settings;
    private final String type;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SurveyNpsSurveyPoint> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SurveyNpsSurveyPoint createFromParcel(Parcel parcel) {
            l.e(parcel, "parcel");
            return new SurveyNpsSurveyPoint(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), SurveyNpsPointSettings.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SurveyNpsSurveyPoint[] newArray(int i10) {
            return new SurveyNpsSurveyPoint[i10];
        }
    }

    public SurveyNpsSurveyPoint(@o(name = "id") long j, @o(name = "type") String str, @o(name = "content") String str2, @o(name = "description") String str3, @o(name = "max_path") int i10, @o(name = "answer_type") String str4, @o(name = "settings") SurveyNpsPointSettings surveyNpsPointSettings) {
        l.e(str, "type");
        l.e(str4, "answerType");
        l.e(surveyNpsPointSettings, "settings");
        this.id = j;
        this.type = str;
        this.content = str2;
        this.description = str3;
        this.maxPath = i10;
        this.answerType = str4;
        this.settings = surveyNpsPointSettings;
    }

    public static /* synthetic */ SurveyNpsSurveyPoint copy$default(SurveyNpsSurveyPoint surveyNpsSurveyPoint, long j, String str, String str2, String str3, int i10, String str4, SurveyNpsPointSettings surveyNpsPointSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j = surveyNpsSurveyPoint.id;
        }
        long j7 = j;
        if ((i11 & 2) != 0) {
            str = surveyNpsSurveyPoint.type;
        }
        String str5 = str;
        if ((i11 & 4) != 0) {
            str2 = surveyNpsSurveyPoint.content;
        }
        String str6 = str2;
        if ((i11 & 8) != 0) {
            str3 = surveyNpsSurveyPoint.description;
        }
        String str7 = str3;
        if ((i11 & 16) != 0) {
            i10 = surveyNpsSurveyPoint.maxPath;
        }
        return surveyNpsSurveyPoint.copy(j7, str5, str6, str7, i10, (i11 & 32) != 0 ? surveyNpsSurveyPoint.answerType : str4, (i11 & 64) != 0 ? surveyNpsSurveyPoint.settings : surveyNpsPointSettings);
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
    public final SurveyNpsPointSettings getSettings() {
        return this.settings;
    }

    public final SurveyNpsSurveyPoint copy(@o(name = "id") long id2, @o(name = "type") String type, @o(name = "content") String content, @o(name = "description") String description, @o(name = "max_path") int maxPath, @o(name = "answer_type") String answerType, @o(name = "settings") SurveyNpsPointSettings settings) {
        l.e(type, "type");
        l.e(answerType, "answerType");
        l.e(settings, "settings");
        return new SurveyNpsSurveyPoint(id2, type, content, description, maxPath, answerType, settings);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyNpsSurveyPoint)) {
            return false;
        }
        SurveyNpsSurveyPoint surveyNpsSurveyPoint = (SurveyNpsSurveyPoint) other;
        return this.id == surveyNpsSurveyPoint.id && l.a(this.type, surveyNpsSurveyPoint.type) && l.a(this.content, surveyNpsSurveyPoint.content) && l.a(this.description, surveyNpsSurveyPoint.description) && this.maxPath == surveyNpsSurveyPoint.maxPath && l.a(this.answerType, surveyNpsSurveyPoint.answerType) && l.a(this.settings, surveyNpsSurveyPoint.settings);
    }

    @Override // com.survicate.surveys.entities.survey.questions.SurveyPoint
    public String getAnswerType() {
        return this.answerType;
    }

    @Override // com.survicate.surveys.entities.survey.questions.SurveyPoint
    public String getContent() {
        return this.content;
    }

    @Override // com.survicate.surveys.entities.survey.questions.SurveyPoint
    public String getDescription() {
        return this.description;
    }

    @Override // com.survicate.surveys.entities.survey.questions.SurveyPoint
    public f getDisplayer(d displayEngine) {
        l.e(displayEngine, "displayEngine");
        return new a(this, displayEngine, 4);
    }

    @Override // com.survicate.surveys.entities.survey.questions.SurveyPoint
    public long getId() {
        return this.id;
    }

    @Override // com.survicate.surveys.entities.survey.questions.SurveyPoint
    public int getMaxPath() {
        return this.maxPath;
    }

    public final SurveyNpsPointSettings getSettings() {
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
        return this.settings.hashCode() + c7.a.g(this.answerType, c7.a.C(this.maxPath, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31);
    }

    @Override // com.survicate.surveys.entities.survey.questions.SurveyPoint
    public boolean isMandatory() {
        return this.settings.getMandatory();
    }

    public String toString() {
        return "SurveyNpsSurveyPoint(id=" + this.id + ", type=" + this.type + ", content=" + this.content + ", description=" + this.description + ", maxPath=" + this.maxPath + ", answerType=" + this.answerType + ", settings=" + this.settings + ')';
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
        this.settings.writeToParcel(parcel, flags);
    }

    @Override // com.survicate.surveys.entities.survey.translations.Translatable
    public SurveyPoint translatedWith(SurveyPointTranslation translation) {
        return copy$default(this, 0L, null, xu.l.C(translation != null ? translation.getContent() : null, getContent()), xu.l.C(translation != null ? translation.getDescription() : null, getDescription()), 0, null, this.settings.translatedWith(translation != null ? translation.getSettings() : null), 51, null);
    }
}
