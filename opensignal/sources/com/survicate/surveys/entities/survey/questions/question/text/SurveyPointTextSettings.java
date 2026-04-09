package com.survicate.surveys.entities.survey.questions.question.text;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import c7.a;
import com.survicate.surveys.entities.survey.questions.DisclaimerSettings;
import com.survicate.surveys.entities.survey.questions.SurveyPointImage;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings;
import com.survicate.surveys.entities.survey.surveyLogic.SurveyLogicOperator;
import com.survicate.surveys.entities.survey.surveyLogic.display.DisplayLogic;
import com.survicate.surveys.entities.survey.surveyLogic.text.SurveyPointTextLogic;
import com.survicate.surveys.entities.survey.translations.SurveyPointSettingsTranslation;
import h0.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import nk.o;
import w.g;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\"\u0010#Jl\u0010$\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\u00052\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b/\u0010*J \u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b4\u00105R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b7\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b9\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010\u001eR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b>\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010!R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010#R\u0014\u0010C\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lcom/survicate/surveys/entities/survey/questions/question/text/SurveyPointTextSettings;", "Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionPointSettings;", "", "Lcom/survicate/surveys/entities/survey/surveyLogic/text/SurveyPointTextLogic;", "logic", "", "mandatory", "Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "disclaimerSettings", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "displayLogicOperator", "Lcom/survicate/surveys/entities/survey/surveyLogic/display/DisplayLogic;", "displayLogic", "Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "surveyPointImage", "", "followUpQuestionCount", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;Ljava/lang/Integer;)V", "Lcom/survicate/surveys/entities/survey/translations/SurveyPointSettingsTranslation;", "translation", "translatedWith", "(Lcom/survicate/surveys/entities/survey/translations/SurveyPointSettingsTranslation;)Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionPointSettings;", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Boolean;", "component3", "()Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "component4", "()Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "component5", "component6", "()Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "component7", "()Ljava/lang/Integer;", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;Ljava/lang/Integer;)Lcom/survicate/surveys/entities/survey/questions/question/text/SurveyPointTextSettings;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getLogic", "Ljava/lang/Boolean;", "getMandatory", "Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "getDisclaimerSettings", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "getDisplayLogicOperator", "getDisplayLogic", "Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "getSurveyPointImage", "Ljava/lang/Integer;", "getFollowUpQuestionCount", "isMandatory", "()Z", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SurveyPointTextSettings implements SurveyQuestionPointSettings {
    public static final Parcelable.Creator<SurveyPointTextSettings> CREATOR = new Creator();
    private final DisclaimerSettings disclaimerSettings;
    private final List<DisplayLogic> displayLogic;
    private final SurveyLogicOperator displayLogicOperator;
    private final Integer followUpQuestionCount;
    private final List<SurveyPointTextLogic> logic;
    private final Boolean mandatory;
    private final SurveyPointImage surveyPointImage;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SurveyPointTextSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SurveyPointTextSettings createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            l.e(parcel, "parcel");
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            int iF = 0;
            int iF2 = 0;
            while (iF2 != i10) {
                iF2 = a.f(SurveyPointTextSettings.class, parcel, arrayList, iF2, 1);
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            DisclaimerSettings disclaimerSettingsCreateFromParcel = parcel.readInt() == 0 ? null : DisclaimerSettings.CREATOR.createFromParcel(parcel);
            SurveyLogicOperator surveyLogicOperatorValueOf = parcel.readInt() == 0 ? null : SurveyLogicOperator.valueOf(parcel.readString());
            int i11 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i11);
            while (iF != i11) {
                iF = a.f(SurveyPointTextSettings.class, parcel, arrayList2, iF, 1);
            }
            return new SurveyPointTextSettings(arrayList, boolValueOf, disclaimerSettingsCreateFromParcel, surveyLogicOperatorValueOf, arrayList2, parcel.readInt() == 0 ? null : SurveyPointImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SurveyPointTextSettings[] newArray(int i10) {
            return new SurveyPointTextSettings[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SurveyPointTextSettings(@o(name = "logic") List<SurveyPointTextLogic> list, @o(name = "mandatory") Boolean bool, @o(name = "disclaimer_settings") DisclaimerSettings disclaimerSettings, @o(name = "display_logic_operator") SurveyLogicOperator surveyLogicOperator, @o(name = "display_logic") List<? extends DisplayLogic> list2, @o(name = "point_image") SurveyPointImage surveyPointImage, @o(name = "followup_questions") Integer num) {
        l.e(list, "logic");
        l.e(list2, "displayLogic");
        this.logic = list;
        this.mandatory = bool;
        this.disclaimerSettings = disclaimerSettings;
        this.displayLogicOperator = surveyLogicOperator;
        this.displayLogic = list2;
        this.surveyPointImage = surveyPointImage;
        this.followUpQuestionCount = num;
    }

    public static /* synthetic */ SurveyPointTextSettings copy$default(SurveyPointTextSettings surveyPointTextSettings, List list, Boolean bool, DisclaimerSettings disclaimerSettings, SurveyLogicOperator surveyLogicOperator, List list2, SurveyPointImage surveyPointImage, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = surveyPointTextSettings.logic;
        }
        if ((i10 & 2) != 0) {
            bool = surveyPointTextSettings.mandatory;
        }
        if ((i10 & 4) != 0) {
            disclaimerSettings = surveyPointTextSettings.disclaimerSettings;
        }
        if ((i10 & 8) != 0) {
            surveyLogicOperator = surveyPointTextSettings.displayLogicOperator;
        }
        if ((i10 & 16) != 0) {
            list2 = surveyPointTextSettings.displayLogic;
        }
        if ((i10 & 32) != 0) {
            surveyPointImage = surveyPointTextSettings.surveyPointImage;
        }
        if ((i10 & 64) != 0) {
            num = surveyPointTextSettings.followUpQuestionCount;
        }
        SurveyPointImage surveyPointImage2 = surveyPointImage;
        Integer num2 = num;
        List list3 = list2;
        DisclaimerSettings disclaimerSettings2 = disclaimerSettings;
        return surveyPointTextSettings.copy(list, bool, disclaimerSettings2, surveyLogicOperator, list3, surveyPointImage2, num2);
    }

    public final List<SurveyPointTextLogic> component1() {
        return this.logic;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getMandatory() {
        return this.mandatory;
    }

    /* renamed from: component3, reason: from getter */
    public final DisclaimerSettings getDisclaimerSettings() {
        return this.disclaimerSettings;
    }

    /* renamed from: component4, reason: from getter */
    public final SurveyLogicOperator getDisplayLogicOperator() {
        return this.displayLogicOperator;
    }

    public final List<DisplayLogic> component5() {
        return this.displayLogic;
    }

    /* renamed from: component6, reason: from getter */
    public final SurveyPointImage getSurveyPointImage() {
        return this.surveyPointImage;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getFollowUpQuestionCount() {
        return this.followUpQuestionCount;
    }

    public final SurveyPointTextSettings copy(@o(name = "logic") List<SurveyPointTextLogic> logic, @o(name = "mandatory") Boolean mandatory, @o(name = "disclaimer_settings") DisclaimerSettings disclaimerSettings, @o(name = "display_logic_operator") SurveyLogicOperator displayLogicOperator, @o(name = "display_logic") List<? extends DisplayLogic> displayLogic, @o(name = "point_image") SurveyPointImage surveyPointImage, @o(name = "followup_questions") Integer followUpQuestionCount) {
        l.e(logic, "logic");
        l.e(displayLogic, "displayLogic");
        return new SurveyPointTextSettings(logic, mandatory, disclaimerSettings, displayLogicOperator, displayLogic, surveyPointImage, followUpQuestionCount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyPointTextSettings)) {
            return false;
        }
        SurveyPointTextSettings surveyPointTextSettings = (SurveyPointTextSettings) other;
        return l.a(this.logic, surveyPointTextSettings.logic) && l.a(this.mandatory, surveyPointTextSettings.mandatory) && l.a(this.disclaimerSettings, surveyPointTextSettings.disclaimerSettings) && this.displayLogicOperator == surveyPointTextSettings.displayLogicOperator && l.a(this.displayLogic, surveyPointTextSettings.displayLogic) && l.a(this.surveyPointImage, surveyPointTextSettings.surveyPointImage) && l.a(this.followUpQuestionCount, surveyPointTextSettings.followUpQuestionCount);
    }

    public final DisclaimerSettings getDisclaimerSettings() {
        return this.disclaimerSettings;
    }

    @Override // com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings
    public List<DisplayLogic> getDisplayLogic() {
        return this.displayLogic;
    }

    @Override // com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings
    public SurveyLogicOperator getDisplayLogicOperator() {
        return this.displayLogicOperator;
    }

    public final Integer getFollowUpQuestionCount() {
        return this.followUpQuestionCount;
    }

    public final List<SurveyPointTextLogic> getLogic() {
        return this.logic;
    }

    public final Boolean getMandatory() {
        return this.mandatory;
    }

    @Override // com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings
    public SurveyPointImage getSurveyPointImage() {
        return this.surveyPointImage;
    }

    public int hashCode() {
        int iHashCode = this.logic.hashCode() * 31;
        Boolean bool = this.mandatory;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        DisclaimerSettings disclaimerSettings = this.disclaimerSettings;
        int iHashCode3 = (iHashCode2 + (disclaimerSettings == null ? 0 : disclaimerSettings.hashCode())) * 31;
        SurveyLogicOperator surveyLogicOperator = this.displayLogicOperator;
        int iC = b.c((iHashCode3 + (surveyLogicOperator == null ? 0 : surveyLogicOperator.hashCode())) * 31, 31, this.displayLogic);
        SurveyPointImage surveyPointImage = this.surveyPointImage;
        int iHashCode4 = (iC + (surveyPointImage == null ? 0 : surveyPointImage.hashCode())) * 31;
        Integer num = this.followUpQuestionCount;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    @Override // com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings
    public boolean isMandatory() {
        return l.a(this.mandatory, Boolean.TRUE);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SurveyPointTextSettings(logic=");
        sb2.append(this.logic);
        sb2.append(", mandatory=");
        sb2.append(this.mandatory);
        sb2.append(", disclaimerSettings=");
        sb2.append(this.disclaimerSettings);
        sb2.append(", displayLogicOperator=");
        sb2.append(this.displayLogicOperator);
        sb2.append(", displayLogic=");
        sb2.append(this.displayLogic);
        sb2.append(", surveyPointImage=");
        sb2.append(this.surveyPointImage);
        sb2.append(", followUpQuestionCount=");
        return g.i(sb2, this.followUpQuestionCount, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        l.e(parcel, "out");
        Iterator itV = a.v(this.logic, parcel);
        while (itV.hasNext()) {
            parcel.writeParcelable((Parcelable) itV.next(), flags);
        }
        Boolean bool = this.mandatory;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            a.x(parcel, 1, bool);
        }
        DisclaimerSettings disclaimerSettings = this.disclaimerSettings;
        if (disclaimerSettings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            disclaimerSettings.writeToParcel(parcel, flags);
        }
        SurveyLogicOperator surveyLogicOperator = this.displayLogicOperator;
        if (surveyLogicOperator == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(surveyLogicOperator.name());
        }
        Iterator itV2 = a.v(this.displayLogic, parcel);
        while (itV2.hasNext()) {
            parcel.writeParcelable((Parcelable) itV2.next(), flags);
        }
        SurveyPointImage surveyPointImage = this.surveyPointImage;
        if (surveyPointImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            surveyPointImage.writeToParcel(parcel, flags);
        }
        Integer num = this.followUpQuestionCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    @Override // com.survicate.surveys.entities.survey.translations.Translatable
    public SurveyQuestionPointSettings translatedWith(SurveyPointSettingsTranslation translation) {
        DisclaimerSettings disclaimerSettingsTranslatedWith;
        DisclaimerSettings disclaimerSettings = this.disclaimerSettings;
        SurveyPointImage surveyPointImageTranslatedWith = null;
        if (disclaimerSettings != null) {
            disclaimerSettingsTranslatedWith = disclaimerSettings.translatedWith(translation != null ? translation.getDisclaimerSettings() : null);
        } else {
            disclaimerSettingsTranslatedWith = null;
        }
        SurveyPointImage surveyPointImage = getSurveyPointImage();
        if (surveyPointImage != null) {
            surveyPointImageTranslatedWith = surveyPointImage.translatedWith(translation != null ? translation.getSurveyPointImage() : null);
        }
        return copy$default(this, null, null, disclaimerSettingsTranslatedWith, null, null, surveyPointImageTranslatedWith, null, 91, null);
    }
}
