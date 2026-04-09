package com.survicate.surveys.entities.survey.questions.question.rating.shape;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import c7.a;
import com.survicate.surveys.entities.survey.questions.DisclaimerSettings;
import com.survicate.surveys.entities.survey.questions.SurveyPointImage;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings;
import com.survicate.surveys.entities.survey.questions.question.rating.SurveyPointRatingSettings;
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

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006HÆ\u0003¢\u0006\u0004\b*\u0010!J\u0012\u0010+\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b+\u0010,J\u009e\u0001\u0010-\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0003\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u001dJ\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u000200HÖ\u0001¢\u0006\u0004\b7\u00102J \u0010<\u001a\u00020;2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u000200HÖ\u0001¢\u0006\u0004\b<\u0010=R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b@\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\bA\u0010\u001dR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bC\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bE\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\bF\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\b\f\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010G\u001a\u0004\bH\u0010'R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\bJ\u0010)R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010B\u001a\u0004\bK\u0010!R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010L\u001a\u0004\bM\u0010,R\u0014\u0010N\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006P"}, d2 = {"Lcom/survicate/surveys/entities/survey/questions/question/rating/shape/SurveyPointShapeSettings;", "Lcom/survicate/surveys/entities/survey/questions/question/rating/SurveyPointRatingSettings;", "", "leftText", "rightText", "shape", "", "Lcom/survicate/surveys/entities/survey/surveyLogic/range/SurveyPointRangeLogic;", "logic", "", "mandatory", "commentLabel", "isCommentMandatory", "Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "disclaimerSettings", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "displayLogicOperator", "Lcom/survicate/surveys/entities/survey/surveyLogic/display/DisplayLogic;", "displayLogic", "Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "surveyPointImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;)V", "Lcom/survicate/surveys/entities/survey/translations/SurveyPointSettingsTranslation;", "translation", "Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionPointSettings;", "translatedWith", "(Lcom/survicate/surveys/entities/survey/translations/SurveyPointSettingsTranslation;)Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionPointSettings;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "component8", "()Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "component9", "()Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "component10", "component11", "()Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;)Lcom/survicate/surveys/entities/survey/questions/question/rating/shape/SurveyPointShapeSettings;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLeftText", "getRightText", "getShape", "Ljava/util/List;", "getLogic", "Ljava/lang/Boolean;", "getMandatory", "getCommentLabel", "Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "getDisclaimerSettings", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "getDisplayLogicOperator", "getDisplayLogic", "Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "getSurveyPointImage", "isMandatory", "()Z", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SurveyPointShapeSettings implements SurveyPointRatingSettings {
    public static final Parcelable.Creator<SurveyPointShapeSettings> CREATOR = new Creator();
    private final String commentLabel;
    private final DisclaimerSettings disclaimerSettings;
    private final List<DisplayLogic> displayLogic;
    private final SurveyLogicOperator displayLogicOperator;
    private final Boolean isCommentMandatory;
    private final String leftText;
    private final List<SurveyPointRangeLogic> logic;
    private final Boolean mandatory;
    private final String rightText;
    private final String shape;
    private final SurveyPointImage surveyPointImage;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SurveyPointShapeSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final SurveyPointShapeSettings createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            Boolean bool;
            Boolean boolValueOf2;
            l.e(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int iF = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i10 = parcel.readInt();
                arrayList = new ArrayList(i10);
                int iF2 = 0;
                while (iF2 != i10) {
                    iF2 = a.f(SurveyPointShapeSettings.class, parcel, arrayList, iF2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
                bool = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                bool = null;
            }
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = bool;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            DisclaimerSettings disclaimerSettings = (DisclaimerSettings) (parcel.readInt() == 0 ? bool : DisclaimerSettings.CREATOR.createFromParcel(parcel));
            Object objValueOf = parcel.readInt() == 0 ? bool : SurveyLogicOperator.valueOf(parcel.readString());
            int i11 = parcel.readInt();
            Object objCreateFromParcel = bool;
            ArrayList arrayList2 = new ArrayList(i11);
            while (iF != i11) {
                iF = a.f(SurveyPointShapeSettings.class, parcel, arrayList2, iF, 1);
            }
            if (parcel.readInt() != 0) {
                objCreateFromParcel = SurveyPointImage.CREATOR.createFromParcel(parcel);
            }
            return new SurveyPointShapeSettings(string, string2, string3, arrayList, boolValueOf, string4, boolValueOf2, disclaimerSettings, objValueOf, arrayList2, (SurveyPointImage) objCreateFromParcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SurveyPointShapeSettings[] newArray(int i10) {
            return new SurveyPointShapeSettings[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SurveyPointShapeSettings(@o(name = "text_on_the_left") String str, @o(name = "text_on_the_right") String str2, @o(name = "shape") String str3, @o(name = "logic") List<SurveyPointRangeLogic> list, @o(name = "mandatory") Boolean bool, @o(name = "comment_label") String str4, @o(name = "mandatory_comment") Boolean bool2, @o(name = "disclaimer_settings") DisclaimerSettings disclaimerSettings, @o(name = "display_logic_operator") SurveyLogicOperator surveyLogicOperator, @o(name = "display_logic") List<? extends DisplayLogic> list2, @o(name = "point_image") SurveyPointImage surveyPointImage) {
        l.e(list2, "displayLogic");
        this.leftText = str;
        this.rightText = str2;
        this.shape = str3;
        this.logic = list;
        this.mandatory = bool;
        this.commentLabel = str4;
        this.isCommentMandatory = bool2;
        this.disclaimerSettings = disclaimerSettings;
        this.displayLogicOperator = surveyLogicOperator;
        this.displayLogic = list2;
        this.surveyPointImage = surveyPointImage;
    }

    public static /* synthetic */ SurveyPointShapeSettings copy$default(SurveyPointShapeSettings surveyPointShapeSettings, String str, String str2, String str3, List list, Boolean bool, String str4, Boolean bool2, DisclaimerSettings disclaimerSettings, SurveyLogicOperator surveyLogicOperator, List list2, SurveyPointImage surveyPointImage, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = surveyPointShapeSettings.leftText;
        }
        if ((i10 & 2) != 0) {
            str2 = surveyPointShapeSettings.rightText;
        }
        if ((i10 & 4) != 0) {
            str3 = surveyPointShapeSettings.shape;
        }
        if ((i10 & 8) != 0) {
            list = surveyPointShapeSettings.logic;
        }
        if ((i10 & 16) != 0) {
            bool = surveyPointShapeSettings.mandatory;
        }
        if ((i10 & 32) != 0) {
            str4 = surveyPointShapeSettings.commentLabel;
        }
        if ((i10 & 64) != 0) {
            bool2 = surveyPointShapeSettings.isCommentMandatory;
        }
        if ((i10 & 128) != 0) {
            disclaimerSettings = surveyPointShapeSettings.disclaimerSettings;
        }
        if ((i10 & 256) != 0) {
            surveyLogicOperator = surveyPointShapeSettings.displayLogicOperator;
        }
        if ((i10 & 512) != 0) {
            list2 = surveyPointShapeSettings.displayLogic;
        }
        if ((i10 & 1024) != 0) {
            surveyPointImage = surveyPointShapeSettings.surveyPointImage;
        }
        List list3 = list2;
        SurveyPointImage surveyPointImage2 = surveyPointImage;
        DisclaimerSettings disclaimerSettings2 = disclaimerSettings;
        SurveyLogicOperator surveyLogicOperator2 = surveyLogicOperator;
        String str5 = str4;
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        String str6 = str3;
        return surveyPointShapeSettings.copy(str, str2, str6, list, bool4, str5, bool3, disclaimerSettings2, surveyLogicOperator2, list3, surveyPointImage2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLeftText() {
        return this.leftText;
    }

    public final List<DisplayLogic> component10() {
        return this.displayLogic;
    }

    /* renamed from: component11, reason: from getter */
    public final SurveyPointImage getSurveyPointImage() {
        return this.surveyPointImage;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRightText() {
        return this.rightText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getShape() {
        return this.shape;
    }

    public final List<SurveyPointRangeLogic> component4() {
        return this.logic;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getMandatory() {
        return this.mandatory;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCommentLabel() {
        return this.commentLabel;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getIsCommentMandatory() {
        return this.isCommentMandatory;
    }

    /* renamed from: component8, reason: from getter */
    public final DisclaimerSettings getDisclaimerSettings() {
        return this.disclaimerSettings;
    }

    /* renamed from: component9, reason: from getter */
    public final SurveyLogicOperator getDisplayLogicOperator() {
        return this.displayLogicOperator;
    }

    public final SurveyPointShapeSettings copy(@o(name = "text_on_the_left") String leftText, @o(name = "text_on_the_right") String rightText, @o(name = "shape") String shape, @o(name = "logic") List<SurveyPointRangeLogic> logic, @o(name = "mandatory") Boolean mandatory, @o(name = "comment_label") String commentLabel, @o(name = "mandatory_comment") Boolean isCommentMandatory, @o(name = "disclaimer_settings") DisclaimerSettings disclaimerSettings, @o(name = "display_logic_operator") SurveyLogicOperator displayLogicOperator, @o(name = "display_logic") List<? extends DisplayLogic> displayLogic, @o(name = "point_image") SurveyPointImage surveyPointImage) {
        l.e(displayLogic, "displayLogic");
        return new SurveyPointShapeSettings(leftText, rightText, shape, logic, mandatory, commentLabel, isCommentMandatory, disclaimerSettings, displayLogicOperator, displayLogic, surveyPointImage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyPointShapeSettings)) {
            return false;
        }
        SurveyPointShapeSettings surveyPointShapeSettings = (SurveyPointShapeSettings) other;
        return l.a(this.leftText, surveyPointShapeSettings.leftText) && l.a(this.rightText, surveyPointShapeSettings.rightText) && l.a(this.shape, surveyPointShapeSettings.shape) && l.a(this.logic, surveyPointShapeSettings.logic) && l.a(this.mandatory, surveyPointShapeSettings.mandatory) && l.a(this.commentLabel, surveyPointShapeSettings.commentLabel) && l.a(this.isCommentMandatory, surveyPointShapeSettings.isCommentMandatory) && l.a(this.disclaimerSettings, surveyPointShapeSettings.disclaimerSettings) && this.displayLogicOperator == surveyPointShapeSettings.displayLogicOperator && l.a(this.displayLogic, surveyPointShapeSettings.displayLogic) && l.a(this.surveyPointImage, surveyPointShapeSettings.surveyPointImage);
    }

    public final String getCommentLabel() {
        return this.commentLabel;
    }

    @Override // com.survicate.surveys.entities.survey.questions.question.rating.SurveyPointRatingSettings
    public DisclaimerSettings getDisclaimerSettings() {
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

    public final String getShape() {
        return this.shape;
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
        String str3 = this.shape;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<SurveyPointRangeLogic> list = this.logic;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.mandatory;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.commentLabel;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.isCommentMandatory;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        DisclaimerSettings disclaimerSettings = this.disclaimerSettings;
        int iHashCode8 = (iHashCode7 + (disclaimerSettings == null ? 0 : disclaimerSettings.hashCode())) * 31;
        SurveyLogicOperator surveyLogicOperator = this.displayLogicOperator;
        int iC = b.c((iHashCode8 + (surveyLogicOperator == null ? 0 : surveyLogicOperator.hashCode())) * 31, 31, this.displayLogic);
        SurveyPointImage surveyPointImage = this.surveyPointImage;
        return iC + (surveyPointImage != null ? surveyPointImage.hashCode() : 0);
    }

    @Override // com.survicate.surveys.entities.survey.questions.question.rating.SurveyPointRatingSettings
    public Boolean isCommentMandatory() {
        return this.isCommentMandatory;
    }

    @Override // com.survicate.surveys.entities.survey.questions.question.rating.SurveyPointRatingSettings, com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings
    /* renamed from: isMandatory */
    public boolean getIsMandatory() {
        return l.a(this.mandatory, Boolean.TRUE);
    }

    public String toString() {
        return "SurveyPointShapeSettings(leftText=" + this.leftText + ", rightText=" + this.rightText + ", shape=" + this.shape + ", logic=" + this.logic + ", mandatory=" + this.mandatory + ", commentLabel=" + this.commentLabel + ", isCommentMandatory=" + this.isCommentMandatory + ", disclaimerSettings=" + this.disclaimerSettings + ", displayLogicOperator=" + this.displayLogicOperator + ", displayLogic=" + this.displayLogic + ", surveyPointImage=" + this.surveyPointImage + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        l.e(parcel, "out");
        parcel.writeString(this.leftText);
        parcel.writeString(this.rightText);
        parcel.writeString(this.shape);
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
        DisclaimerSettings disclaimerSettings = getDisclaimerSettings();
        if (disclaimerSettings != null) {
            disclaimerSettingsTranslatedWith = disclaimerSettings.translatedWith(translation != null ? translation.getDisclaimerSettings() : null);
        } else {
            disclaimerSettingsTranslatedWith = null;
        }
        SurveyPointImage surveyPointImage = getSurveyPointImage();
        if (surveyPointImage != null) {
            surveyPointImageTranslatedWith = surveyPointImage.translatedWith(translation != null ? translation.getSurveyPointImage() : null);
        }
        return copy$default(this, strC, strC2, null, null, null, strC3, null, disclaimerSettingsTranslatedWith, null, null, surveyPointImageTranslatedWith, 860, null);
    }
}
