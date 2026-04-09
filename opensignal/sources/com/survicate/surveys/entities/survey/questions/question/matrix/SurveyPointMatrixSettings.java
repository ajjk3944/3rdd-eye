package com.survicate.surveys.entities.survey.questions.question.matrix;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import c7.a;
import com.survicate.surveys.entities.survey.questions.DisclaimerSettings;
import com.survicate.surveys.entities.survey.questions.SurveyPointImage;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings;
import com.survicate.surveys.entities.survey.surveyLogic.SurveyLogicOperator;
import com.survicate.surveys.entities.survey.surveyLogic.display.DisplayLogic;
import com.survicate.surveys.entities.survey.surveyLogic.matrix.SurveyPointMatrixLogic;
import h0.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0012\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005HÆ\u0003¢\u0006\u0004\b*\u0010 J\u0012\u0010+\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0096\u0001\u0010-\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0003\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0003\u0010\r\u001a\u00020\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\b\u0003\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b/\u0010$J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u000200HÖ\u0001¢\u0006\u0004\b7\u00102J \u0010<\u001a\u00020;2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u000200HÖ\u0001¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b@\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bB\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bC\u0010 R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\bD\u0010\u001dR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bF\u0010$R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b\r\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010G\u001a\u0004\bH\u0010'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010I\u001a\u0004\bJ\u0010)R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bK\u0010 R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010L\u001a\u0004\bM\u0010,R\u0014\u0010N\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\u001d¨\u0006O"}, d2 = {"Lcom/survicate/surveys/entities/survey/questions/question/matrix/SurveyPointMatrixSettings;", "Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionPointSettings;", "", "randomizeAnswers", "randomizeExceptLast", "", "Lcom/survicate/surveys/entities/survey/questions/question/matrix/MatrixColumn;", "scale", "Lcom/survicate/surveys/entities/survey/surveyLogic/matrix/SurveyPointMatrixLogic;", "logic", "mandatory", "", "commentLabel", "isCommentMandatory", "Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "disclaimerSettings", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "displayLogicOperator", "Lcom/survicate/surveys/entities/survey/surveyLogic/display/DisplayLogic;", "displayLogic", "Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "surveyPointImage", "<init>", "(ZZLjava/util/List;Ljava/util/List;ZLjava/lang/String;ZLcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;)V", "Lcom/survicate/surveys/entities/survey/translations/SurveyPointSettingsTranslation;", "translation", "translatedWith", "(Lcom/survicate/surveys/entities/survey/translations/SurveyPointSettingsTranslation;)Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionPointSettings;", "component1", "()Z", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "()Ljava/lang/String;", "component7", "component8", "()Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "component9", "()Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "component10", "component11", "()Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "copy", "(ZZLjava/util/List;Ljava/util/List;ZLjava/lang/String;ZLcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;)Lcom/survicate/surveys/entities/survey/questions/question/matrix/SurveyPointMatrixSettings;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getRandomizeAnswers", "getRandomizeExceptLast", "Ljava/util/List;", "getScale", "getLogic", "getMandatory", "Ljava/lang/String;", "getCommentLabel", "Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "getDisclaimerSettings", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "getDisplayLogicOperator", "getDisplayLogic", "Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "getSurveyPointImage", "isMandatory", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SurveyPointMatrixSettings implements SurveyQuestionPointSettings {
    public static final Parcelable.Creator<SurveyPointMatrixSettings> CREATOR = new Creator();
    private final String commentLabel;
    private final DisclaimerSettings disclaimerSettings;
    private final List<DisplayLogic> displayLogic;
    private final SurveyLogicOperator displayLogicOperator;
    private final boolean isCommentMandatory;
    private final List<SurveyPointMatrixLogic> logic;
    private final boolean mandatory;
    private final boolean randomizeAnswers;
    private final boolean randomizeExceptLast;
    private final List<MatrixColumn> scale;
    private final SurveyPointImage surveyPointImage;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SurveyPointMatrixSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SurveyPointMatrixSettings createFromParcel(Parcel parcel) {
            l.e(parcel, "parcel");
            int iF = 0;
            boolean z10 = parcel.readInt() != 0;
            boolean z11 = parcel.readInt() != 0;
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(MatrixColumn.CREATOR.createFromParcel(parcel));
            }
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList2.add(SurveyPointMatrixLogic.CREATOR.createFromParcel(parcel));
            }
            boolean z12 = parcel.readInt() != 0;
            String string = parcel.readString();
            boolean z13 = parcel.readInt() != 0;
            DisclaimerSettings disclaimerSettingsCreateFromParcel = parcel.readInt() == 0 ? null : DisclaimerSettings.CREATOR.createFromParcel(parcel);
            SurveyLogicOperator surveyLogicOperatorValueOf = parcel.readInt() == 0 ? null : SurveyLogicOperator.valueOf(parcel.readString());
            int i14 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i14);
            while (iF != i14) {
                iF = a.f(SurveyPointMatrixSettings.class, parcel, arrayList3, iF, 1);
            }
            return new SurveyPointMatrixSettings(z10, z11, arrayList, arrayList2, z12, string, z13, disclaimerSettingsCreateFromParcel, surveyLogicOperatorValueOf, arrayList3, parcel.readInt() != 0 ? SurveyPointImage.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SurveyPointMatrixSettings[] newArray(int i10) {
            return new SurveyPointMatrixSettings[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SurveyPointMatrixSettings(@o(name = "randomize_answers") boolean z10, @o(name = "randomize_except_last") boolean z11, @o(name = "scale") List<MatrixColumn> list, @o(name = "logic") List<SurveyPointMatrixLogic> list2, @o(name = "mandatory") boolean z12, @o(name = "comment_label") String str, @o(name = "mandatory_comment") boolean z13, @o(name = "disclaimer_settings") DisclaimerSettings disclaimerSettings, @o(name = "display_logic_operator") SurveyLogicOperator surveyLogicOperator, @o(name = "display_logic") List<? extends DisplayLogic> list3, @o(name = "point_image") SurveyPointImage surveyPointImage) {
        l.e(list, "scale");
        l.e(list2, "logic");
        l.e(str, "commentLabel");
        l.e(list3, "displayLogic");
        this.randomizeAnswers = z10;
        this.randomizeExceptLast = z11;
        this.scale = list;
        this.logic = list2;
        this.mandatory = z12;
        this.commentLabel = str;
        this.isCommentMandatory = z13;
        this.disclaimerSettings = disclaimerSettings;
        this.displayLogicOperator = surveyLogicOperator;
        this.displayLogic = list3;
        this.surveyPointImage = surveyPointImage;
    }

    public static /* synthetic */ SurveyPointMatrixSettings copy$default(SurveyPointMatrixSettings surveyPointMatrixSettings, boolean z10, boolean z11, List list, List list2, boolean z12, String str, boolean z13, DisclaimerSettings disclaimerSettings, SurveyLogicOperator surveyLogicOperator, List list3, SurveyPointImage surveyPointImage, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = surveyPointMatrixSettings.randomizeAnswers;
        }
        if ((i10 & 2) != 0) {
            z11 = surveyPointMatrixSettings.randomizeExceptLast;
        }
        if ((i10 & 4) != 0) {
            list = surveyPointMatrixSettings.scale;
        }
        if ((i10 & 8) != 0) {
            list2 = surveyPointMatrixSettings.logic;
        }
        if ((i10 & 16) != 0) {
            z12 = surveyPointMatrixSettings.mandatory;
        }
        if ((i10 & 32) != 0) {
            str = surveyPointMatrixSettings.commentLabel;
        }
        if ((i10 & 64) != 0) {
            z13 = surveyPointMatrixSettings.isCommentMandatory;
        }
        if ((i10 & 128) != 0) {
            disclaimerSettings = surveyPointMatrixSettings.disclaimerSettings;
        }
        if ((i10 & 256) != 0) {
            surveyLogicOperator = surveyPointMatrixSettings.displayLogicOperator;
        }
        if ((i10 & 512) != 0) {
            list3 = surveyPointMatrixSettings.displayLogic;
        }
        if ((i10 & 1024) != 0) {
            surveyPointImage = surveyPointMatrixSettings.surveyPointImage;
        }
        List list4 = list3;
        SurveyPointImage surveyPointImage2 = surveyPointImage;
        DisclaimerSettings disclaimerSettings2 = disclaimerSettings;
        SurveyLogicOperator surveyLogicOperator2 = surveyLogicOperator;
        String str2 = str;
        boolean z14 = z13;
        boolean z15 = z12;
        List list5 = list;
        return surveyPointMatrixSettings.copy(z10, z11, list5, list2, z15, str2, z14, disclaimerSettings2, surveyLogicOperator2, list4, surveyPointImage2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getRandomizeAnswers() {
        return this.randomizeAnswers;
    }

    public final List<DisplayLogic> component10() {
        return this.displayLogic;
    }

    /* renamed from: component11, reason: from getter */
    public final SurveyPointImage getSurveyPointImage() {
        return this.surveyPointImage;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getRandomizeExceptLast() {
        return this.randomizeExceptLast;
    }

    public final List<MatrixColumn> component3() {
        return this.scale;
    }

    public final List<SurveyPointMatrixLogic> component4() {
        return this.logic;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getMandatory() {
        return this.mandatory;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCommentLabel() {
        return this.commentLabel;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsCommentMandatory() {
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

    public final SurveyPointMatrixSettings copy(@o(name = "randomize_answers") boolean randomizeAnswers, @o(name = "randomize_except_last") boolean randomizeExceptLast, @o(name = "scale") List<MatrixColumn> scale, @o(name = "logic") List<SurveyPointMatrixLogic> logic, @o(name = "mandatory") boolean mandatory, @o(name = "comment_label") String commentLabel, @o(name = "mandatory_comment") boolean isCommentMandatory, @o(name = "disclaimer_settings") DisclaimerSettings disclaimerSettings, @o(name = "display_logic_operator") SurveyLogicOperator displayLogicOperator, @o(name = "display_logic") List<? extends DisplayLogic> displayLogic, @o(name = "point_image") SurveyPointImage surveyPointImage) {
        l.e(scale, "scale");
        l.e(logic, "logic");
        l.e(commentLabel, "commentLabel");
        l.e(displayLogic, "displayLogic");
        return new SurveyPointMatrixSettings(randomizeAnswers, randomizeExceptLast, scale, logic, mandatory, commentLabel, isCommentMandatory, disclaimerSettings, displayLogicOperator, displayLogic, surveyPointImage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyPointMatrixSettings)) {
            return false;
        }
        SurveyPointMatrixSettings surveyPointMatrixSettings = (SurveyPointMatrixSettings) other;
        return this.randomizeAnswers == surveyPointMatrixSettings.randomizeAnswers && this.randomizeExceptLast == surveyPointMatrixSettings.randomizeExceptLast && l.a(this.scale, surveyPointMatrixSettings.scale) && l.a(this.logic, surveyPointMatrixSettings.logic) && this.mandatory == surveyPointMatrixSettings.mandatory && l.a(this.commentLabel, surveyPointMatrixSettings.commentLabel) && this.isCommentMandatory == surveyPointMatrixSettings.isCommentMandatory && l.a(this.disclaimerSettings, surveyPointMatrixSettings.disclaimerSettings) && this.displayLogicOperator == surveyPointMatrixSettings.displayLogicOperator && l.a(this.displayLogic, surveyPointMatrixSettings.displayLogic) && l.a(this.surveyPointImage, surveyPointMatrixSettings.surveyPointImage);
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

    public final List<SurveyPointMatrixLogic> getLogic() {
        return this.logic;
    }

    public final boolean getMandatory() {
        return this.mandatory;
    }

    public final boolean getRandomizeAnswers() {
        return this.randomizeAnswers;
    }

    public final boolean getRandomizeExceptLast() {
        return this.randomizeExceptLast;
    }

    public final List<MatrixColumn> getScale() {
        return this.scale;
    }

    @Override // com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings
    public SurveyPointImage getSurveyPointImage() {
        return this.surveyPointImage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.randomizeAnswers;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r32 = this.randomizeExceptLast;
        int i11 = r32;
        if (r32 != 0) {
            i11 = 1;
        }
        int iC = b.c(b.c((i10 + i11) * 31, 31, this.scale), 31, this.logic);
        ?? r33 = this.mandatory;
        int i12 = r33;
        if (r33 != 0) {
            i12 = 1;
        }
        int iG = a.g(this.commentLabel, (iC + i12) * 31, 31);
        boolean z11 = this.isCommentMandatory;
        int i13 = (iG + (z11 ? 1 : z11 ? 1 : 0)) * 31;
        DisclaimerSettings disclaimerSettings = this.disclaimerSettings;
        int iHashCode = (i13 + (disclaimerSettings == null ? 0 : disclaimerSettings.hashCode())) * 31;
        SurveyLogicOperator surveyLogicOperator = this.displayLogicOperator;
        int iC2 = b.c((iHashCode + (surveyLogicOperator == null ? 0 : surveyLogicOperator.hashCode())) * 31, 31, this.displayLogic);
        SurveyPointImage surveyPointImage = this.surveyPointImage;
        return iC2 + (surveyPointImage != null ? surveyPointImage.hashCode() : 0);
    }

    public final boolean isCommentMandatory() {
        return this.isCommentMandatory;
    }

    @Override // com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings
    /* renamed from: isMandatory */
    public boolean getIsMandatory() {
        return this.mandatory;
    }

    public String toString() {
        return "SurveyPointMatrixSettings(randomizeAnswers=" + this.randomizeAnswers + ", randomizeExceptLast=" + this.randomizeExceptLast + ", scale=" + this.scale + ", logic=" + this.logic + ", mandatory=" + this.mandatory + ", commentLabel=" + this.commentLabel + ", isCommentMandatory=" + this.isCommentMandatory + ", disclaimerSettings=" + this.disclaimerSettings + ", displayLogicOperator=" + this.displayLogicOperator + ", displayLogic=" + this.displayLogic + ", surveyPointImage=" + this.surveyPointImage + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        l.e(parcel, "out");
        parcel.writeInt(this.randomizeAnswers ? 1 : 0);
        parcel.writeInt(this.randomizeExceptLast ? 1 : 0);
        Iterator itV = a.v(this.scale, parcel);
        while (itV.hasNext()) {
            ((MatrixColumn) itV.next()).writeToParcel(parcel, flags);
        }
        Iterator itV2 = a.v(this.logic, parcel);
        while (itV2.hasNext()) {
            ((SurveyPointMatrixLogic) itV2.next()).writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.mandatory ? 1 : 0);
        parcel.writeString(this.commentLabel);
        parcel.writeInt(this.isCommentMandatory ? 1 : 0);
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
        Iterator itV3 = a.v(this.displayLogic, parcel);
        while (itV3.hasNext()) {
            parcel.writeParcelable((Parcelable) itV3.next(), flags);
        }
        SurveyPointImage surveyPointImage = this.surveyPointImage;
        if (surveyPointImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            surveyPointImage.writeToParcel(parcel, flags);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    @Override // com.survicate.surveys.entities.survey.translations.Translatable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings translatedWith(com.survicate.surveys.entities.survey.translations.SurveyPointSettingsTranslation r15) {
        /*
            r14 = this;
            java.util.List<com.survicate.surveys.entities.survey.questions.question.matrix.MatrixColumn> r1 = r14.scale
            java.util.ArrayList r3 = new java.util.ArrayList
            r2 = 10
            int r2 = mq.p.a0(r1, r2)
            r3.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            r4 = 0
            if (r2 == 0) goto L51
            java.lang.Object r2 = r1.next()
            com.survicate.surveys.entities.survey.questions.question.matrix.MatrixColumn r2 = (com.survicate.surveys.entities.survey.questions.question.matrix.MatrixColumn) r2
            if (r15 == 0) goto L40
            java.util.Map r5 = r15.getMatrixScale()
            if (r5 == 0) goto L40
            long r6 = r2.getId()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L40
            int r6 = r5.length()
            if (r6 <= 0) goto L3d
            r4 = r5
        L3d:
            if (r4 == 0) goto L40
            goto L44
        L40:
            java.lang.String r4 = r2.getName()
        L44:
            com.survicate.surveys.entities.survey.questions.question.matrix.MatrixColumn r5 = new com.survicate.surveys.entities.survey.questions.question.matrix.MatrixColumn
            long r6 = r2.getId()
            r5.<init>(r6, r4)
            r3.add(r5)
            goto L11
        L51:
            if (r15 == 0) goto L58
            java.lang.String r1 = r15.getCommentLabel()
            goto L59
        L58:
            r1 = r4
        L59:
            java.lang.String r2 = r14.commentLabel
            java.lang.String r6 = xu.l.B(r1, r2)
            com.survicate.surveys.entities.survey.questions.DisclaimerSettings r1 = r14.disclaimerSettings
            if (r1 == 0) goto L71
            if (r15 == 0) goto L6a
            com.survicate.surveys.entities.survey.translations.DisclaimerSettingsTranslation r2 = r15.getDisclaimerSettings()
            goto L6b
        L6a:
            r2 = r4
        L6b:
            com.survicate.surveys.entities.survey.questions.DisclaimerSettings r1 = r1.translatedWith(r2)
            r8 = r1
            goto L72
        L71:
            r8 = r4
        L72:
            com.survicate.surveys.entities.survey.questions.SurveyPointImage r1 = r14.getSurveyPointImage()
            if (r1 == 0) goto L82
            if (r15 == 0) goto L7e
            com.survicate.surveys.entities.survey.translations.SurveyPointImageTranslation r4 = r15.getSurveyPointImage()
        L7e:
            com.survicate.surveys.entities.survey.questions.SurveyPointImage r4 = r1.translatedWith(r4)
        L82:
            r11 = r4
            r12 = 859(0x35b, float:1.204E-42)
            r13 = 0
            r1 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r0 = r14
            com.survicate.surveys.entities.survey.questions.question.matrix.SurveyPointMatrixSettings r1 = copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.survicate.surveys.entities.survey.questions.question.matrix.SurveyPointMatrixSettings.translatedWith(com.survicate.surveys.entities.survey.translations.SurveyPointSettingsTranslation):com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings");
    }
}
