package com.survicate.surveys.entities.survey.questions.nps;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import c7.a;
import com.survicate.surveys.entities.survey.questions.DisclaimerSettings;
import com.survicate.surveys.entities.survey.questions.SurveyPointImage;
import com.survicate.surveys.entities.survey.surveyLogic.SurveyLogicOperator;
import com.survicate.surveys.entities.survey.surveyLogic.display.DisplayLogic;
import com.survicate.surveys.entities.survey.surveyLogic.range.SurveyPointRangeLogic;
import com.survicate.surveys.entities.survey.translations.SurveyPointSettingsTranslation;
import com.survicate.surveys.entities.survey.translations.Translatable;
import h0.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002B\u009d\u0001\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000e\u001a\u00020\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\t\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0012\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00150\tHÆ\u0003¢\u0006\u0004\b/\u0010$J\u0012\u00100\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b0\u00101J¦\u0001\u00102\u001a\u00020\u00002\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u000e\b\u0003\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b4\u0010\u001fJ\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u0010:\u001a\u00020\f2\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u000205HÖ\u0001¢\u0006\u0004\b<\u00107J \u0010A\u001a\u00020@2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u000205HÖ\u0001¢\u0006\u0004\bA\u0010BR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bD\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010C\u001a\u0004\bE\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010F\u001a\u0004\bG\u0010\"R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010H\u001a\u0004\bI\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010J\u001a\u0004\bK\u0010&R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010J\u001a\u0004\bL\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bM\u0010\u001fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010N\u001a\u0004\b\u0010\u0010*R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010O\u001a\u0004\bP\u0010,R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010Q\u001a\u0004\bR\u0010.R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010H\u001a\u0004\bS\u0010$R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010T\u001a\u0004\bU\u00101¨\u0006V"}, d2 = {"Lcom/survicate/surveys/entities/survey/questions/nps/SurveyNpsPointSettings;", "Landroid/os/Parcelable;", "Lcom/survicate/surveys/entities/survey/translations/Translatable;", "Lcom/survicate/surveys/entities/survey/translations/SurveyPointSettingsTranslation;", "", "textOnTheLeft", "textOnTheRight", "Lcom/survicate/surveys/entities/survey/questions/nps/AnswerLayout;", "answersLayout", "", "Lcom/survicate/surveys/entities/survey/surveyLogic/range/SurveyPointRangeLogic;", "logic", "", "mandatory", "addComment", "commentLabel", "isCommentMandatory", "Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "disclaimerSettings", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "displayLogicOperator", "Lcom/survicate/surveys/entities/survey/surveyLogic/display/DisplayLogic;", "displayLogic", "Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "surveyPointImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/survicate/surveys/entities/survey/questions/nps/AnswerLayout;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/Boolean;Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;)V", "translation", "translatedWith", "(Lcom/survicate/surveys/entities/survey/translations/SurveyPointSettingsTranslation;)Lcom/survicate/surveys/entities/survey/questions/nps/SurveyNpsPointSettings;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/survicate/surveys/entities/survey/questions/nps/AnswerLayout;", "component4", "()Ljava/util/List;", "component5", "()Z", "component6", "component7", "component8", "()Ljava/lang/Boolean;", "component9", "()Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "component10", "()Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "component11", "component12", "()Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/survicate/surveys/entities/survey/questions/nps/AnswerLayout;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/Boolean;Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;)Lcom/survicate/surveys/entities/survey/questions/nps/SurveyNpsPointSettings;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTextOnTheLeft", "getTextOnTheRight", "Lcom/survicate/surveys/entities/survey/questions/nps/AnswerLayout;", "getAnswersLayout", "Ljava/util/List;", "getLogic", "Z", "getMandatory", "getAddComment", "getCommentLabel", "Ljava/lang/Boolean;", "Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "getDisclaimerSettings", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "getDisplayLogicOperator", "getDisplayLogic", "Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "getSurveyPointImage", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SurveyNpsPointSettings implements Parcelable, Translatable<SurveyPointSettingsTranslation, SurveyNpsPointSettings> {
    public static final Parcelable.Creator<SurveyNpsPointSettings> CREATOR = new Creator();
    private final boolean addComment;
    private final AnswerLayout answersLayout;
    private final String commentLabel;
    private final DisclaimerSettings disclaimerSettings;
    private final List<DisplayLogic> displayLogic;
    private final SurveyLogicOperator displayLogicOperator;
    private final Boolean isCommentMandatory;
    private final List<SurveyPointRangeLogic> logic;
    private final boolean mandatory;
    private final SurveyPointImage surveyPointImage;
    private final String textOnTheLeft;
    private final String textOnTheRight;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SurveyNpsPointSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final SurveyNpsPointSettings createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int iF;
            Boolean boolValueOf;
            l.e(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            AnswerLayout answerLayoutValueOf = parcel.readInt() == 0 ? null : AnswerLayout.valueOf(parcel.readString());
            boolean z10 = false;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i10 = parcel.readInt();
                arrayList = new ArrayList(i10);
                int iF2 = 0;
                while (iF2 != i10) {
                    iF2 = a.f(SurveyNpsPointSettings.class, parcel, arrayList, iF2, 1);
                }
            }
            boolean z11 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                iF = 0;
                z10 = true;
            } else {
                iF = 0;
            }
            ArrayList arrayList2 = arrayList;
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? 1 : iF);
            }
            DisclaimerSettings disclaimerSettingsCreateFromParcel = parcel.readInt() == 0 ? null : DisclaimerSettings.CREATOR.createFromParcel(parcel);
            SurveyLogicOperator surveyLogicOperatorValueOf = parcel.readInt() == 0 ? null : SurveyLogicOperator.valueOf(parcel.readString());
            int i11 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i11);
            while (iF != i11) {
                iF = a.f(SurveyNpsPointSettings.class, parcel, arrayList3, iF, 1);
            }
            return new SurveyNpsPointSettings(string, string2, answerLayoutValueOf, arrayList2, z11, z10, string3, boolValueOf, disclaimerSettingsCreateFromParcel, surveyLogicOperatorValueOf, arrayList3, parcel.readInt() != 0 ? SurveyPointImage.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SurveyNpsPointSettings[] newArray(int i10) {
            return new SurveyNpsPointSettings[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SurveyNpsPointSettings(@o(name = "text_on_the_left") String str, @o(name = "text_on_the_right") String str2, @o(name = "answers_layout") AnswerLayout answerLayout, @o(name = "logic") List<SurveyPointRangeLogic> list, @o(name = "mandatory") boolean z10, @o(name = "add_comment") boolean z11, @o(name = "comment_label") String str3, @o(name = "mandatory_comment") Boolean bool, @o(name = "disclaimer_settings") DisclaimerSettings disclaimerSettings, @o(name = "display_logic_operator") SurveyLogicOperator surveyLogicOperator, @o(name = "display_logic") List<? extends DisplayLogic> list2, @o(name = "point_image") SurveyPointImage surveyPointImage) {
        l.e(list2, "displayLogic");
        this.textOnTheLeft = str;
        this.textOnTheRight = str2;
        this.answersLayout = answerLayout;
        this.logic = list;
        this.mandatory = z10;
        this.addComment = z11;
        this.commentLabel = str3;
        this.isCommentMandatory = bool;
        this.disclaimerSettings = disclaimerSettings;
        this.displayLogicOperator = surveyLogicOperator;
        this.displayLogic = list2;
        this.surveyPointImage = surveyPointImage;
    }

    public static /* synthetic */ SurveyNpsPointSettings copy$default(SurveyNpsPointSettings surveyNpsPointSettings, String str, String str2, AnswerLayout answerLayout, List list, boolean z10, boolean z11, String str3, Boolean bool, DisclaimerSettings disclaimerSettings, SurveyLogicOperator surveyLogicOperator, List list2, SurveyPointImage surveyPointImage, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = surveyNpsPointSettings.textOnTheLeft;
        }
        if ((i10 & 2) != 0) {
            str2 = surveyNpsPointSettings.textOnTheRight;
        }
        if ((i10 & 4) != 0) {
            answerLayout = surveyNpsPointSettings.answersLayout;
        }
        if ((i10 & 8) != 0) {
            list = surveyNpsPointSettings.logic;
        }
        if ((i10 & 16) != 0) {
            z10 = surveyNpsPointSettings.mandatory;
        }
        if ((i10 & 32) != 0) {
            z11 = surveyNpsPointSettings.addComment;
        }
        if ((i10 & 64) != 0) {
            str3 = surveyNpsPointSettings.commentLabel;
        }
        if ((i10 & 128) != 0) {
            bool = surveyNpsPointSettings.isCommentMandatory;
        }
        if ((i10 & 256) != 0) {
            disclaimerSettings = surveyNpsPointSettings.disclaimerSettings;
        }
        if ((i10 & 512) != 0) {
            surveyLogicOperator = surveyNpsPointSettings.displayLogicOperator;
        }
        if ((i10 & 1024) != 0) {
            list2 = surveyNpsPointSettings.displayLogic;
        }
        if ((i10 & 2048) != 0) {
            surveyPointImage = surveyNpsPointSettings.surveyPointImage;
        }
        List list3 = list2;
        SurveyPointImage surveyPointImage2 = surveyPointImage;
        DisclaimerSettings disclaimerSettings2 = disclaimerSettings;
        SurveyLogicOperator surveyLogicOperator2 = surveyLogicOperator;
        String str4 = str3;
        Boolean bool2 = bool;
        boolean z12 = z10;
        boolean z13 = z11;
        return surveyNpsPointSettings.copy(str, str2, answerLayout, list, z12, z13, str4, bool2, disclaimerSettings2, surveyLogicOperator2, list3, surveyPointImage2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTextOnTheLeft() {
        return this.textOnTheLeft;
    }

    /* renamed from: component10, reason: from getter */
    public final SurveyLogicOperator getDisplayLogicOperator() {
        return this.displayLogicOperator;
    }

    public final List<DisplayLogic> component11() {
        return this.displayLogic;
    }

    /* renamed from: component12, reason: from getter */
    public final SurveyPointImage getSurveyPointImage() {
        return this.surveyPointImage;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTextOnTheRight() {
        return this.textOnTheRight;
    }

    /* renamed from: component3, reason: from getter */
    public final AnswerLayout getAnswersLayout() {
        return this.answersLayout;
    }

    public final List<SurveyPointRangeLogic> component4() {
        return this.logic;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getMandatory() {
        return this.mandatory;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getAddComment() {
        return this.addComment;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCommentLabel() {
        return this.commentLabel;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getIsCommentMandatory() {
        return this.isCommentMandatory;
    }

    /* renamed from: component9, reason: from getter */
    public final DisclaimerSettings getDisclaimerSettings() {
        return this.disclaimerSettings;
    }

    public final SurveyNpsPointSettings copy(@o(name = "text_on_the_left") String textOnTheLeft, @o(name = "text_on_the_right") String textOnTheRight, @o(name = "answers_layout") AnswerLayout answersLayout, @o(name = "logic") List<SurveyPointRangeLogic> logic, @o(name = "mandatory") boolean mandatory, @o(name = "add_comment") boolean addComment, @o(name = "comment_label") String commentLabel, @o(name = "mandatory_comment") Boolean isCommentMandatory, @o(name = "disclaimer_settings") DisclaimerSettings disclaimerSettings, @o(name = "display_logic_operator") SurveyLogicOperator displayLogicOperator, @o(name = "display_logic") List<? extends DisplayLogic> displayLogic, @o(name = "point_image") SurveyPointImage surveyPointImage) {
        l.e(displayLogic, "displayLogic");
        return new SurveyNpsPointSettings(textOnTheLeft, textOnTheRight, answersLayout, logic, mandatory, addComment, commentLabel, isCommentMandatory, disclaimerSettings, displayLogicOperator, displayLogic, surveyPointImage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyNpsPointSettings)) {
            return false;
        }
        SurveyNpsPointSettings surveyNpsPointSettings = (SurveyNpsPointSettings) other;
        return l.a(this.textOnTheLeft, surveyNpsPointSettings.textOnTheLeft) && l.a(this.textOnTheRight, surveyNpsPointSettings.textOnTheRight) && this.answersLayout == surveyNpsPointSettings.answersLayout && l.a(this.logic, surveyNpsPointSettings.logic) && this.mandatory == surveyNpsPointSettings.mandatory && this.addComment == surveyNpsPointSettings.addComment && l.a(this.commentLabel, surveyNpsPointSettings.commentLabel) && l.a(this.isCommentMandatory, surveyNpsPointSettings.isCommentMandatory) && l.a(this.disclaimerSettings, surveyNpsPointSettings.disclaimerSettings) && this.displayLogicOperator == surveyNpsPointSettings.displayLogicOperator && l.a(this.displayLogic, surveyNpsPointSettings.displayLogic) && l.a(this.surveyPointImage, surveyNpsPointSettings.surveyPointImage);
    }

    public final boolean getAddComment() {
        return this.addComment;
    }

    public final AnswerLayout getAnswersLayout() {
        return this.answersLayout;
    }

    public final String getCommentLabel() {
        return this.commentLabel;
    }

    public final DisclaimerSettings getDisclaimerSettings() {
        return this.disclaimerSettings;
    }

    public final List<DisplayLogic> getDisplayLogic() {
        return this.displayLogic;
    }

    public final SurveyLogicOperator getDisplayLogicOperator() {
        return this.displayLogicOperator;
    }

    public final List<SurveyPointRangeLogic> getLogic() {
        return this.logic;
    }

    public final boolean getMandatory() {
        return this.mandatory;
    }

    public final SurveyPointImage getSurveyPointImage() {
        return this.surveyPointImage;
    }

    public final String getTextOnTheLeft() {
        return this.textOnTheLeft;
    }

    public final String getTextOnTheRight() {
        return this.textOnTheRight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.textOnTheLeft;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.textOnTheRight;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AnswerLayout answerLayout = this.answersLayout;
        int iHashCode3 = (iHashCode2 + (answerLayout == null ? 0 : answerLayout.hashCode())) * 31;
        List<SurveyPointRangeLogic> list = this.logic;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        boolean z10 = this.mandatory;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode4 + i10) * 31;
        boolean z11 = this.addComment;
        int i12 = (i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31;
        String str3 = this.commentLabel;
        int iHashCode5 = (i12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isCommentMandatory;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
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

    public String toString() {
        return "SurveyNpsPointSettings(textOnTheLeft=" + this.textOnTheLeft + ", textOnTheRight=" + this.textOnTheRight + ", answersLayout=" + this.answersLayout + ", logic=" + this.logic + ", mandatory=" + this.mandatory + ", addComment=" + this.addComment + ", commentLabel=" + this.commentLabel + ", isCommentMandatory=" + this.isCommentMandatory + ", disclaimerSettings=" + this.disclaimerSettings + ", displayLogicOperator=" + this.displayLogicOperator + ", displayLogic=" + this.displayLogic + ", surveyPointImage=" + this.surveyPointImage + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        l.e(parcel, "out");
        parcel.writeString(this.textOnTheLeft);
        parcel.writeString(this.textOnTheRight);
        AnswerLayout answerLayout = this.answersLayout;
        if (answerLayout == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(answerLayout.name());
        }
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
        parcel.writeInt(this.mandatory ? 1 : 0);
        parcel.writeInt(this.addComment ? 1 : 0);
        parcel.writeString(this.commentLabel);
        Boolean bool = this.isCommentMandatory;
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
    public SurveyNpsPointSettings translatedWith(SurveyPointSettingsTranslation translation) {
        DisclaimerSettings disclaimerSettingsTranslatedWith;
        SurveyPointImage surveyPointImageTranslatedWith = null;
        String strC = xu.l.C(translation != null ? translation.getLeftText() : null, this.textOnTheLeft);
        String strC2 = xu.l.C(translation != null ? translation.getRightText() : null, this.textOnTheRight);
        String strC3 = xu.l.C(translation != null ? translation.getCommentLabel() : null, this.commentLabel);
        DisclaimerSettings disclaimerSettings = this.disclaimerSettings;
        if (disclaimerSettings != null) {
            disclaimerSettingsTranslatedWith = disclaimerSettings.translatedWith(translation != null ? translation.getDisclaimerSettings() : null);
        } else {
            disclaimerSettingsTranslatedWith = null;
        }
        SurveyPointImage surveyPointImage = this.surveyPointImage;
        if (surveyPointImage != null) {
            surveyPointImageTranslatedWith = surveyPointImage.translatedWith(translation != null ? translation.getSurveyPointImage() : null);
        }
        return copy$default(this, strC, strC2, null, null, false, false, strC3, null, disclaimerSettingsTranslatedWith, null, null, surveyPointImageTranslatedWith, 1724, null);
    }
}
