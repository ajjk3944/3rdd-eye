package com.survicate.surveys.entities.survey;

import android.os.Parcel;
import android.os.Parcelable;
import br.g;
import br.l;
import com.survicate.surveys.entities.survey.translations.SurveyMessagesTranslation;
import com.survicate.surveys.entities.survey.translations.Translatable;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0003:\u0001'B\u0007¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0019\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\u0005\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010\u0015\u0012\u0004\b\u001e\u0010\u0005\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R*\u0010\u001f\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010\u0015\u0012\u0004\b\"\u0010\u0005\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R*\u0010#\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b#\u0010\u0015\u0012\u0004\b&\u0010\u0005\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019¨\u0006("}, d2 = {"Lcom/survicate/surveys/entities/survey/SurveyMessages;", "Lcom/survicate/surveys/entities/survey/translations/Translatable;", "Lcom/survicate/surveys/entities/survey/translations/SurveyMessagesTranslation;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "translation", "translatedWith", "(Lcom/survicate/surveys/entities/survey/translations/SurveyMessagesTranslation;)Lcom/survicate/surveys/entities/survey/SurveyMessages;", "", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "submitText", "Ljava/lang/String;", "getSubmitText", "()Ljava/lang/String;", "setSubmitText", "(Ljava/lang/String;)V", "getSubmitText$annotations", "navigationBackText", "getNavigationBackText", "setNavigationBackText", "getNavigationBackText$annotations", "answerRequiredText", "getAnswerRequiredText", "setAnswerRequiredText", "getAnswerRequiredText$annotations", "inputTextPlaceholder", "getInputTextPlaceholder", "setInputTextPlaceholder", "getInputTextPlaceholder$annotations", "CREATOR", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurveyMessages implements Translatable<SurveyMessagesTranslation, SurveyMessages>, Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String answerRequiredText;
    private String inputTextPlaceholder;
    private String navigationBackText;
    private String submitText;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/survicate/surveys/entities/survey/SurveyMessages$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/survicate/surveys/entities/survey/SurveyMessages;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/survicate/surveys/entities/survey/SurveyMessages;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.survicate.surveys.entities.survey.SurveyMessages$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<SurveyMessages> {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SurveyMessages createFromParcel(Parcel parcel) {
            l.e(parcel, "parcel");
            return new SurveyMessages(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SurveyMessages[] newArray(int size) {
            return new SurveyMessages[size];
        }
    }

    public SurveyMessages() {
    }

    @o(name = "answer_required_text")
    public static /* synthetic */ void getAnswerRequiredText$annotations() {
    }

    @o(name = "text_placeholder")
    public static /* synthetic */ void getInputTextPlaceholder$annotations() {
    }

    @o(name = "navigation_back_text")
    public static /* synthetic */ void getNavigationBackText$annotations() {
    }

    @o(name = "submit_text")
    public static /* synthetic */ void getSubmitText$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getAnswerRequiredText() {
        return this.answerRequiredText;
    }

    public final String getInputTextPlaceholder() {
        return this.inputTextPlaceholder;
    }

    public final String getNavigationBackText() {
        return this.navigationBackText;
    }

    public final String getSubmitText() {
        return this.submitText;
    }

    public final void setAnswerRequiredText(String str) {
        this.answerRequiredText = str;
    }

    public final void setInputTextPlaceholder(String str) {
        this.inputTextPlaceholder = str;
    }

    public final void setNavigationBackText(String str) {
        this.navigationBackText = str;
    }

    public final void setSubmitText(String str) {
        this.submitText = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        l.e(parcel, "parcel");
        parcel.writeString(this.submitText);
        parcel.writeString(this.navigationBackText);
        parcel.writeString(this.answerRequiredText);
        parcel.writeString(this.inputTextPlaceholder);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SurveyMessages(Parcel parcel) {
        this();
        l.e(parcel, "parcel");
        this.submitText = parcel.readString();
        this.navigationBackText = parcel.readString();
        this.answerRequiredText = parcel.readString();
        this.inputTextPlaceholder = parcel.readString();
    }

    @Override // com.survicate.surveys.entities.survey.translations.Translatable
    public SurveyMessages translatedWith(SurveyMessagesTranslation translation) {
        SurveyMessages surveyMessages = new SurveyMessages();
        surveyMessages.submitText = xu.l.C(translation != null ? translation.getSubmitText() : null, this.submitText);
        surveyMessages.navigationBackText = xu.l.C(translation != null ? translation.getNavigationBackText() : null, this.navigationBackText);
        surveyMessages.answerRequiredText = xu.l.C(translation != null ? translation.getAnswerRequiredText() : null, this.answerRequiredText);
        surveyMessages.inputTextPlaceholder = xu.l.C(translation != null ? translation.getInputTextPlaceholder() : null, this.inputTextPlaceholder);
        return surveyMessages;
    }
}
