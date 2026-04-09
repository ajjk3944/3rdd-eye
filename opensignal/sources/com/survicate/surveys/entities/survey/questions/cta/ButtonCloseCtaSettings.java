package com.survicate.surveys.entities.survey.questions.cta;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import c7.a;
import com.survicate.surveys.entities.survey.questions.DisclaimerSettings;
import com.survicate.surveys.entities.survey.questions.SurveyPointImage;
import com.survicate.surveys.entities.survey.surveyLogic.SurveyLogicOperator;
import com.survicate.surveys.entities.survey.surveyLogic.display.DisplayLogic;
import com.survicate.surveys.entities.survey.translations.SurveyPointSettingsTranslation;
import h0.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJP\u0010 \u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0017J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020#HÖ\u0001¢\u0006\u0004\b+\u0010%J \u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020#HÖ\u0001¢\u0006\u0004\b0\u00101R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\u001bR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010\u001f¨\u0006<"}, d2 = {"Lcom/survicate/surveys/entities/survey/questions/cta/ButtonCloseCtaSettings;", "Lcom/survicate/surveys/entities/survey/questions/cta/CtaSettings;", "", "buttonText", "Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "disclaimerSettings", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "displayLogicOperator", "", "Lcom/survicate/surveys/entities/survey/surveyLogic/display/DisplayLogic;", "displayLogic", "Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "surveyPointImage", "<init>", "(Ljava/lang/String;Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;)V", "Lcom/survicate/surveys/entities/survey/translations/SurveyPointSettingsTranslation;", "translation", "translatedWith", "(Lcom/survicate/surveys/entities/survey/translations/SurveyPointSettingsTranslation;)Lcom/survicate/surveys/entities/survey/questions/cta/CtaSettings;", "", "getNextSurveyPointId", "()Ljava/lang/Long;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "component3", "()Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "component4", "()Ljava/util/List;", "component5", "()Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "copy", "(Ljava/lang/String;Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;Ljava/util/List;Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;)Lcom/survicate/surveys/entities/survey/questions/cta/ButtonCloseCtaSettings;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getButtonText", "Lcom/survicate/surveys/entities/survey/questions/DisclaimerSettings;", "getDisclaimerSettings", "Lcom/survicate/surveys/entities/survey/surveyLogic/SurveyLogicOperator;", "getDisplayLogicOperator", "Ljava/util/List;", "getDisplayLogic", "Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "getSurveyPointImage", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ButtonCloseCtaSettings implements CtaSettings {
    public static final Parcelable.Creator<ButtonCloseCtaSettings> CREATOR = new Creator();
    private final String buttonText;
    private final DisclaimerSettings disclaimerSettings;
    private final List<DisplayLogic> displayLogic;
    private final SurveyLogicOperator displayLogicOperator;
    private final SurveyPointImage surveyPointImage;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ButtonCloseCtaSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ButtonCloseCtaSettings createFromParcel(Parcel parcel) {
            l.e(parcel, "parcel");
            String string = parcel.readString();
            DisclaimerSettings disclaimerSettingsCreateFromParcel = parcel.readInt() == 0 ? null : DisclaimerSettings.CREATOR.createFromParcel(parcel);
            SurveyLogicOperator surveyLogicOperatorValueOf = parcel.readInt() == 0 ? null : SurveyLogicOperator.valueOf(parcel.readString());
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            int iF = 0;
            while (iF != i10) {
                iF = a.f(ButtonCloseCtaSettings.class, parcel, arrayList, iF, 1);
            }
            return new ButtonCloseCtaSettings(string, disclaimerSettingsCreateFromParcel, surveyLogicOperatorValueOf, arrayList, parcel.readInt() != 0 ? SurveyPointImage.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ButtonCloseCtaSettings[] newArray(int i10) {
            return new ButtonCloseCtaSettings[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ButtonCloseCtaSettings(@o(name = "text") String str, @o(name = "disclaimer_settings") DisclaimerSettings disclaimerSettings, @o(name = "display_logic_operator") SurveyLogicOperator surveyLogicOperator, @o(name = "display_logic") List<? extends DisplayLogic> list, @o(name = "point_image") SurveyPointImage surveyPointImage) {
        l.e(list, "displayLogic");
        this.buttonText = str;
        this.disclaimerSettings = disclaimerSettings;
        this.displayLogicOperator = surveyLogicOperator;
        this.displayLogic = list;
        this.surveyPointImage = surveyPointImage;
    }

    public static /* synthetic */ ButtonCloseCtaSettings copy$default(ButtonCloseCtaSettings buttonCloseCtaSettings, String str, DisclaimerSettings disclaimerSettings, SurveyLogicOperator surveyLogicOperator, List list, SurveyPointImage surveyPointImage, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = buttonCloseCtaSettings.buttonText;
        }
        if ((i10 & 2) != 0) {
            disclaimerSettings = buttonCloseCtaSettings.disclaimerSettings;
        }
        if ((i10 & 4) != 0) {
            surveyLogicOperator = buttonCloseCtaSettings.displayLogicOperator;
        }
        if ((i10 & 8) != 0) {
            list = buttonCloseCtaSettings.displayLogic;
        }
        if ((i10 & 16) != 0) {
            surveyPointImage = buttonCloseCtaSettings.surveyPointImage;
        }
        SurveyPointImage surveyPointImage2 = surveyPointImage;
        SurveyLogicOperator surveyLogicOperator2 = surveyLogicOperator;
        return buttonCloseCtaSettings.copy(str, disclaimerSettings, surveyLogicOperator2, list, surveyPointImage2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* renamed from: component2, reason: from getter */
    public final DisclaimerSettings getDisclaimerSettings() {
        return this.disclaimerSettings;
    }

    /* renamed from: component3, reason: from getter */
    public final SurveyLogicOperator getDisplayLogicOperator() {
        return this.displayLogicOperator;
    }

    public final List<DisplayLogic> component4() {
        return this.displayLogic;
    }

    /* renamed from: component5, reason: from getter */
    public final SurveyPointImage getSurveyPointImage() {
        return this.surveyPointImage;
    }

    public final ButtonCloseCtaSettings copy(@o(name = "text") String buttonText, @o(name = "disclaimer_settings") DisclaimerSettings disclaimerSettings, @o(name = "display_logic_operator") SurveyLogicOperator displayLogicOperator, @o(name = "display_logic") List<? extends DisplayLogic> displayLogic, @o(name = "point_image") SurveyPointImage surveyPointImage) {
        l.e(displayLogic, "displayLogic");
        return new ButtonCloseCtaSettings(buttonText, disclaimerSettings, displayLogicOperator, displayLogic, surveyPointImage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonCloseCtaSettings)) {
            return false;
        }
        ButtonCloseCtaSettings buttonCloseCtaSettings = (ButtonCloseCtaSettings) other;
        return l.a(this.buttonText, buttonCloseCtaSettings.buttonText) && l.a(this.disclaimerSettings, buttonCloseCtaSettings.disclaimerSettings) && this.displayLogicOperator == buttonCloseCtaSettings.displayLogicOperator && l.a(this.displayLogic, buttonCloseCtaSettings.displayLogic) && l.a(this.surveyPointImage, buttonCloseCtaSettings.surveyPointImage);
    }

    @Override // com.survicate.surveys.entities.survey.questions.cta.CtaSettings
    public String getButtonText() {
        return this.buttonText;
    }

    @Override // com.survicate.surveys.entities.survey.questions.cta.CtaSettings
    public DisclaimerSettings getDisclaimerSettings() {
        return this.disclaimerSettings;
    }

    @Override // com.survicate.surveys.entities.survey.questions.cta.CtaSettings
    public List<DisplayLogic> getDisplayLogic() {
        return this.displayLogic;
    }

    @Override // com.survicate.surveys.entities.survey.questions.cta.CtaSettings
    public SurveyLogicOperator getDisplayLogicOperator() {
        return this.displayLogicOperator;
    }

    @Override // com.survicate.surveys.entities.survey.questions.cta.CtaSettings
    public Long getNextSurveyPointId() {
        return -1L;
    }

    @Override // com.survicate.surveys.entities.survey.questions.cta.CtaSettings
    public SurveyPointImage getSurveyPointImage() {
        return this.surveyPointImage;
    }

    public int hashCode() {
        String str = this.buttonText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DisclaimerSettings disclaimerSettings = this.disclaimerSettings;
        int iHashCode2 = (iHashCode + (disclaimerSettings == null ? 0 : disclaimerSettings.hashCode())) * 31;
        SurveyLogicOperator surveyLogicOperator = this.displayLogicOperator;
        int iC = b.c((iHashCode2 + (surveyLogicOperator == null ? 0 : surveyLogicOperator.hashCode())) * 31, 31, this.displayLogic);
        SurveyPointImage surveyPointImage = this.surveyPointImage;
        return iC + (surveyPointImage != null ? surveyPointImage.hashCode() : 0);
    }

    public String toString() {
        return "ButtonCloseCtaSettings(buttonText=" + this.buttonText + ", disclaimerSettings=" + this.disclaimerSettings + ", displayLogicOperator=" + this.displayLogicOperator + ", displayLogic=" + this.displayLogic + ", surveyPointImage=" + this.surveyPointImage + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        l.e(parcel, "out");
        parcel.writeString(this.buttonText);
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
    public CtaSettings translatedWith(SurveyPointSettingsTranslation translation) {
        DisclaimerSettings disclaimerSettingsTranslatedWith;
        SurveyPointImage surveyPointImageTranslatedWith = null;
        String strC = xu.l.C(translation != null ? translation.getButtonText() : null, getButtonText());
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
        return copy$default(this, strC, disclaimerSettingsTranslatedWith, null, null, surveyPointImageTranslatedWith, 12, null);
    }
}
