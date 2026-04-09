package com.survicate.surveys.entities.survey.questions.question.smileyScale;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import c7.a;
import com.survicate.surveys.entities.survey.questions.DisclaimerSettings;
import com.survicate.surveys.entities.survey.questions.SurveyPointImage;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings;
import com.survicate.surveys.entities.survey.surveyLogic.SurveyLogicOperator;
import com.survicate.surveys.entities.survey.surveyLogic.display.DisplayLogic;
import com.survicate.surveys.entities.survey.surveyLogic.range.SurveyPointRangeLogic;
import com.survicate.surveys.entities.survey.translations.SurveyPointSettingsTranslation;
import h0.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0092\u0001\u0010*\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0003\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001bJ\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020-HÖ\u0001¢\u0006\u0004\b4\u0010/J \u00109\u001a\u0002082\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020-HÖ\u0001¢\u0006\u0004\b9\u0010:R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b=\u0010\u001bR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b?\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bA\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\bB\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\b\u000b\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010$R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bF\u0010&R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\bG\u0010\u001eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010H\u001a\u0004\bI\u0010)R\u0014\u0010J\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lcom/survicate/surveys/entities/survey/questions/question/smileyScale/SurveyPointSmileyScaleSettings;", "Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionPointSettings;", "", "leftText", "rightText", "", "Lcom/survicate/surveys/entities/survey/surveyLogic/range/SurveyPointRangeLogic;", "logic", "", "mandatory", "commentLabel", "isCommentMandatory", "Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "disclaimerSettings", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "displayLogicOperator", "Lcom/survicate/surveys/entities/survey/surveyLogic/display/DisplayLogic;", "displayLogic", "Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "surveyPointImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;)V", "Lcom/survicate/surveys/entities/survey/translations/SurveyPointSettingsTranslation;", "translation", "translatedWith", "(Lcom/survicate/surveys/entities/survey/translations/SurveyPointSettingsTranslation;)Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionPointSettings;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "component7", "()Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "component8", "()Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "component9", "component10", "()Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;)Lcom/survicate/surveys/entities/survey/questions/question/smileyScale/SurveyPointSmileyScaleSettings;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLeftText", "getRightText", "Ljava/util/List;", "getLogic", "Ljava/lang/Boolean;", "getMandatory", "getCommentLabel", "Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "getDisclaimerSettings", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "getDisplayLogicOperator", "getDisplayLogic", "Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "getSurveyPointImage", "isMandatory", "()Z", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SurveyPointSmileyScaleSettings implements SurveyQuestionPointSettings {
    public static final Parcelable.Creator<SurveyPointSmileyScaleSettings> CREATOR = new Creator();
    private final String commentLabel;
    private final DisclaimerSettings disclaimerSettings;
    private final List<DisplayLogic> displayLogic;
    private final SurveyLogicOperator displayLogicOperator;
    private final Boolean isCommentMandatory;
    private final String leftText;
    private final List<SurveyPointRangeLogic> logic;
    private final Boolean mandatory;
    private final String rightText;
    private final SurveyPointImage surveyPointImage;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SurveyPointSmileyScaleSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final SurveyPointSmileyScaleSettings createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            Boolean bool;
            Boolean boolValueOf2;
            l.e(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iF = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i10 = parcel.readInt();
                arrayList = new ArrayList(i10);
                int iF2 = 0;
                while (iF2 != i10) {
                    iF2 = a.f(SurveyPointSmileyScaleSettings.class, parcel, arrayList, iF2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
                bool = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                bool = null;
            }
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = bool;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            DisclaimerSettings disclaimerSettings = (DisclaimerSettings) (parcel.readInt() == 0 ? bool : DisclaimerSettings.CREATOR.createFromParcel(parcel));
            Object objValueOf = parcel.readInt() == 0 ? bool : SurveyLogicOperator.valueOf(parcel.readString());
            int i11 = parcel.readInt();
            Object obj = bool;
            ArrayList arrayList2 = new ArrayList(i11);
            while (iF != i11) {
                iF = a.f(SurveyPointSmileyScaleSettings.class, parcel, arrayList2, iF, 1);
            }
            return new SurveyPointSmileyScaleSettings(string, string2, arrayList, boolValueOf, string3, boolValueOf2, disclaimerSettings, objValueOf, arrayList2, (SurveyPointImage) (parcel.readInt() == 0 ? obj : SurveyPointImage.CREATOR.createFromParcel(parcel)));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SurveyPointSmileyScaleSettings[] newArray(int i10) {
            return new SurveyPointSmileyScaleSettings[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SurveyPointSmileyScaleSettings(@o(name = "text_on_the_left") String str, @o(name = "text_on_the_right") String str2, @o(name = "logic") List<SurveyPointRangeLogic> list, @o(name = "mandatory") Boolean bool, @o(name = "comment_label") String str3, @o(name = "mandatory_comment") Boolean bool2, @o(name = "disclaimer_settings") DisclaimerSettings disclaimerSettings, @o(name = "display_logic_operator") SurveyLogicOperator surveyLogicOperator, @o(name = "display_logic") List<? extends DisplayLogic> list2, @o(name = "point_image") SurveyPointImage surveyPointImage) {
        l.e(list2, "displayLogic");
        this.leftText = str;
        this.rightText = str2;
        this.logic = list;
        this.mandatory = bool;
        this.commentLabel = str3;
        this.isCommentMandatory = bool2;
        this.disclaimerSettings = disclaimerSettings;
        this.displayLogicOperator = surveyLogicOperator;
        this.displayLogic = list2;
        this.surveyPointImage = surveyPointImage;
    }

    public static /* synthetic */ SurveyPointSmileyScaleSettings copy$default(SurveyPointSmileyScaleSettings surveyPointSmileyScaleSettings, String str, String str2, List list, Boolean bool, String str3, Boolean bool2, DisclaimerSettings disclaimerSettings, SurveyLogicOperator surveyLogicOperator, List list2, SurveyPointImage surveyPointImage, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = surveyPointSmileyScaleSettings.leftText;
        }
        if ((i10 & 2) != 0) {
            str2 = surveyPointSmileyScaleSettings.rightText;
        }
        if ((i10 & 4) != 0) {
            list = surveyPointSmileyScaleSettings.logic;
        }
        if ((i10 & 8) != 0) {
            bool = surveyPointSmileyScaleSettings.mandatory;
        }
        if ((i10 & 16) != 0) {
            str3 = surveyPointSmileyScaleSettings.commentLabel;
        }
        if ((i10 & 32) != 0) {
            bool2 = surveyPointSmileyScaleSettings.isCommentMandatory;
        }
        if ((i10 & 64) != 0) {
            disclaimerSettings = surveyPointSmileyScaleSettings.disclaimerSettings;
        }
        if ((i10 & 128) != 0) {
            surveyLogicOperator = surveyPointSmileyScaleSettings.displayLogicOperator;
        }
        if ((i10 & 256) != 0) {
            list2 = surveyPointSmileyScaleSettings.displayLogic;
        }
        if ((i10 & 512) != 0) {
            surveyPointImage = surveyPointSmileyScaleSettings.surveyPointImage;
        }
        List list3 = list2;
        SurveyPointImage surveyPointImage2 = surveyPointImage;
        DisclaimerSettings disclaimerSettings2 = disclaimerSettings;
        SurveyLogicOperator surveyLogicOperator2 = surveyLogicOperator;
        String str4 = str3;
        Boolean bool3 = bool2;
        return surveyPointSmileyScaleSettings.copy(str, str2, list, bool, str4, bool3, disclaimerSettings2, surveyLogicOperator2, list3, surveyPointImage2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLeftText() {
        return this.leftText;
    }

    /* renamed from: component10, reason: from getter */
    public final SurveyPointImage getSurveyPointImage() {
        return this.surveyPointImage;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRightText() {
        return this.rightText;
    }

    public final List<SurveyPointRangeLogic> component3() {
        return this.logic;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getMandatory() {
        return this.mandatory;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCommentLabel() {
        return this.commentLabel;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsCommentMandatory() {
        return this.isCommentMandatory;
    }

    /* renamed from: component7, reason: from getter */
    public final DisclaimerSettings getDisclaimerSettings() {
        return this.disclaimerSettings;
    }

    /* renamed from: component8, reason: from getter */
    public final SurveyLogicOperator getDisplayLogicOperator() {
        return this.displayLogicOperator;
    }

    public final List<DisplayLogic> component9() {
        return this.displayLogic;
    }

    public final SurveyPointSmileyScaleSettings copy(@o(name = "text_on_the_left") String leftText, @o(name = "text_on_the_right") String rightText, @o(name = "logic") List<SurveyPointRangeLogic> logic, @o(name = "mandatory") Boolean mandatory, @o(name = "comment_label") String commentLabel, @o(name = "mandatory_comment") Boolean isCommentMandatory, @o(name = "disclaimer_settings") DisclaimerSettings disclaimerSettings, @o(name = "display_logic_operator") SurveyLogicOperator displayLogicOperator, @o(name = "display_logic") List<? extends DisplayLogic> displayLogic, @o(name = "point_image") SurveyPointImage surveyPointImage) {
        l.e(displayLogic, "displayLogic");
        return new SurveyPointSmileyScaleSettings(leftText, rightText, logic, mandatory, commentLabel, isCommentMandatory, disclaimerSettings, displayLogicOperator, displayLogic, surveyPointImage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyPointSmileyScaleSettings)) {
            return false;
        }
        SurveyPointSmileyScaleSettings surveyPointSmileyScaleSettings = (SurveyPointSmileyScaleSettings) other;
        return l.a(this.leftText, surveyPointSmileyScaleSettings.leftText) && l.a(this.rightText, surveyPointSmileyScaleSettings.rightText) && l.a(this.logic, surveyPointSmileyScaleSettings.logic) && l.a(this.mandatory, surveyPointSmileyScaleSettings.mandatory) && l.a(this.commentLabel, surveyPointSmileyScaleSettings.commentLabel) && l.a(this.isCommentMandatory, surveyPointSmileyScaleSettings.isCommentMandatory) && l.a(this.disclaimerSettings, surveyPointSmileyScaleSettings.disclaimerSettings) && this.displayLogicOperator == surveyPointSmileyScaleSettings.displayLogicOperator && l.a(this.displayLogic, surveyPointSmileyScaleSettings.displayLogic) && l.a(this.surveyPointImage, surveyPointSmileyScaleSettings.surveyPointImage);
    }

    public final String getCommentLabel() {
        return this.commentLabel;
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

    public final String getLeftText() {
        return this.leftText;
    }

    public final List<SurveyPointRangeLogic> getLogic() {
        return this.logic;
    }

    public final Boolean getMandatory() {
        return this.mandatory;
    }

    public final String getRightText() {
        return this.rightText;
    }

    @Override // com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings
    public SurveyPointImage getSurveyPointImage() {
        return this.surveyPointImage;
    }

    public int hashCode() {
        String str = this.leftText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rightText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<SurveyPointRangeLogic> list = this.logic;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.mandatory;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.commentLabel;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.isCommentMandatory;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        DisclaimerSettings disclaimerSettings = this.disclaimerSettings;
        int iHashCode7 = (iHashCode6 + (disclaimerSettings == null ? 0 : disclaimerSettings.hashCode())) * 31;
        SurveyLogicOperator surveyLogicOperator = this.displayLogicOperator;
        int iC = b.c((iHashCode7 + (surveyLogicOperator == null ? 0 : surveyLogicOperator.hashCode())) * 31, 31, this.displayLogic);
        SurveyPointImage surveyPointImage = this.surveyPointImage;
        return iC + (surveyPointImage != null ? surveyPointImage.hashCode() : 0);
    }

    public final Boolean isCommentMandatory() {
        return this.isCommentMandatory;
    }

    @Override // com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings
    /* renamed from: isMandatory */
    public boolean getIsMandatory() {
        return l.a(this.mandatory, Boolean.TRUE);
    }

    public String toString() {
        return "SurveyPointSmileyScaleSettings(leftText=" + this.leftText + ", rightText=" + this.rightText + ", logic=" + this.logic + ", mandatory=" + this.mandatory + ", commentLabel=" + this.commentLabel + ", isCommentMandatory=" + this.isCommentMandatory + ", disclaimerSettings=" + this.disclaimerSettings + ", displayLogicOperator=" + this.displayLogicOperator + ", displayLogic=" + this.displayLogic + ", surveyPointImage=" + this.surveyPointImage + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        l.e(parcel, "out");
        parcel.writeString(this.leftText);
        parcel.writeString(this.rightText);
        List<SurveyPointRangeLogic> list = this.logic;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SurveyPointRangeLogic> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
        }
        Boolean bool = this.mandatory;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            a.x(parcel, 1, bool);
        }
        parcel.writeString(this.commentLabel);
        Boolean bool2 = this.isCommentMandatory;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            a.x(parcel, 1, bool2);
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
        Iterator itV = a.v(this.displayLogic, parcel);
        while (itV.hasNext()) {
            parcel.writeParcelable((Parcelable) itV.next(), flags);
        }
        SurveyPointImage surveyPointImage = this.surveyPointImage;
        if (surveyPointImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            surveyPointImage.writeToParcel(parcel, flags);
        }
    }

    @Override // com.survicate.surveys.entities.survey.translations.Translatable
    public SurveyQuestionPointSettings translatedWith(SurveyPointSettingsTranslation translation) {
        DisclaimerSettings disclaimerSettingsTranslatedWith;
        SurveyPointImage surveyPointImageTranslatedWith = null;
        String strC = xu.l.C(translation != null ? translation.getLeftText() : null, this.leftText);
        String strC2 = xu.l.C(translation != null ? translation.getRightText() : null, this.rightText);
        String strC3 = xu.l.C(translation != null ? translation.getCommentLabel() : null, this.commentLabel);
        DisclaimerSettings disclaimerSettings = this.disclaimerSettings;
        if (disclaimerSettings != null) {
            disclaimerSettingsTranslatedWith = disclaimerSettings.translatedWith(translation != null ? translation.getDisclaimerSettings() : null);
        } else {
            disclaimerSettingsTranslatedWith = null;
        }
        SurveyPointImage surveyPointImage = getSurveyPointImage();
        if (surveyPointImage != null) {
            surveyPointImageTranslatedWith = surveyPointImage.translatedWith(translation != null ? translation.getSurveyPointImage() : null);
        }
        return copy$default(this, strC, strC2, null, null, strC3, null, disclaimerSettingsTranslatedWith, null, null, surveyPointImageTranslatedWith, 428, null);
    }
}
