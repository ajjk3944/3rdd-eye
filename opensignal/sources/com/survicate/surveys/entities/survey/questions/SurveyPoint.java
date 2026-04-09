package com.survicate.surveys.entities.survey.questions;

import android.os.Parcelable;
import com.survicate.surveys.entities.survey.translations.SurveyPointTranslation;
import com.survicate.surveys.entities.survey.translations.Translatable;
import kotlin.Metadata;
import wo.d;
import wo.f;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0003:\u0001#J\u001b\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138&X¦\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015R\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/survicate/surveys/entities/survey/questions/SurveyPoint;", "Lcom/survicate/surveys/entities/survey/translations/Translatable;", "Lcom/survicate/surveys/entities/survey/translations/SurveyPointTranslation;", "Landroid/os/Parcelable;", "Lwo/d;", "displayEngine", "Lwo/f;", "getDisplayer", "(Lwo/d;)Lwo/f;", "", "isMandatory", "()Z", "Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "getSurveyPointImage", "()Lcom/survicate/surveys/entities/survey/questions/SurveyPointImage;", "", "getId", "()J", "id", "", "getType", "()Ljava/lang/String;", "getType$annotations", "()V", "type", "getAnswerType", "answerType", "getContent", "content", "getDescription", "description", "", "getMaxPath", "()I", "maxPath", "Companion", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SurveyPoint extends Translatable<SurveyPointTranslation, SurveyPoint>, Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final long FINISH_SURVEY_NEXT_POINT_ID = -1;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/survicate/surveys/entities/survey/questions/SurveyPoint$Companion;", "", "()V", "FINISH_SURVEY_NEXT_POINT_ID", "", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long FINISH_SURVEY_NEXT_POINT_ID = -1;

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getType$annotations() {
        }
    }

    String getAnswerType();

    String getContent();

    String getDescription();

    f getDisplayer(d displayEngine);

    long getId();

    int getMaxPath();

    SurveyPointImage getSurveyPointImage();

    String getType();

    boolean isMandatory();
}
