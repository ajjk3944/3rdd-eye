package com.survicate.surveys.infrastructure.serialization;

import br.l;
import com.survicate.surveys.entities.survey.translations.DisclaimerSettingsTranslation;
import com.survicate.surveys.entities.survey.translations.ImageTranslation;
import com.survicate.surveys.entities.survey.translations.SurveyMessagesTranslation;
import com.survicate.surveys.entities.survey.translations.SurveyPointEntryTranslation;
import com.survicate.surveys.entities.survey.translations.SurveyPointImageTranslation;
import com.survicate.surveys.entities.survey.translations.SurveyPointSettingsTranslation;
import com.survicate.surveys.entities.survey.translations.SurveyPointTranslation;
import com.survicate.surveys.entities.survey.translations.SurveySettingsTranslation;
import com.survicate.surveys.entities.survey.translations.SurveyTranslation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import mq.p;
import mq.t;
import mq.w;
import nk.c0;
import nk.n;
import nk.q0;
import nk.r;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 *2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006j\u0002`\tH\u0002¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006j\u0004\u0018\u0001`\tH\u0002¢\u0006\u0004\b\u0010\u0010\rJ3\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006j\u0004\u0018\u0001`\tH\u0002¢\u0006\u0004\b\u0012\u0010\rJ/\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006j\u0004\u0018\u0001`\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006j\u0004\u0018\u0001`\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006j\u0004\u0018\u0001`\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001e\u001a\u00020\u001d2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006j\u0002`\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b\"\u0010#J'\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0017¢\u0006\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/survicate/surveys/infrastructure/serialization/MoshiTranslationsAdapter;", "Lnk/r;", "", "Lcom/survicate/surveys/entities/survey/translations/SurveyTranslation;", "<init>", "()V", "", "", "", "Lcom/survicate/surveys/infrastructure/serialization/Translations;", MoshiTranslationsAdapter.POINTS_KEY, "Lcom/survicate/surveys/entities/survey/translations/SurveyPointTranslation;", "mapPoints", "(Ljava/util/Map;)Ljava/util/List;", MoshiTranslationsAdapter.POINT_ANSWERS_KEY, "Lcom/survicate/surveys/entities/survey/translations/SurveyPointEntryTranslation;", "mapPointAnswers", MoshiTranslationsAdapter.POINT_FIELDS_KEY, "mapPointFields", MoshiTranslationsAdapter.SETTINGS_KEY, "Lcom/survicate/surveys/entities/survey/translations/SurveyPointSettingsTranslation;", "mapPointSettings", "(Ljava/util/Map;)Lcom/survicate/surveys/entities/survey/translations/SurveyPointSettingsTranslation;", "Lcom/survicate/surveys/entities/survey/translations/DisclaimerSettingsTranslation;", "mapDisclaimerSettings", "(Ljava/util/Map;)Lcom/survicate/surveys/entities/survey/translations/DisclaimerSettingsTranslation;", "Lcom/survicate/surveys/entities/survey/translations/SurveyPointImageTranslation;", "mapSurveyPointImage", "(Ljava/util/Map;)Lcom/survicate/surveys/entities/survey/translations/SurveyPointImageTranslation;", "Lcom/survicate/surveys/entities/survey/translations/SurveySettingsTranslation;", "mapSettings", "(Ljava/util/Map;)Lcom/survicate/surveys/entities/survey/translations/SurveySettingsTranslation;", "Lnk/w;", "reader", "fromJson", "(Lnk/w;)Ljava/util/List;", "Lnk/c0;", "writer", "value", "Llq/b0;", "toJson", "(Lnk/c0;Ljava/util/List;)V", "Companion", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MoshiTranslationsAdapter extends r {
    private static final String DISCLAIMER_SETTINGS_CHECKBOX_LABEL_KEY = "checkbox_label";
    private static final String DISCLAIMER_SETTINGS_DESCRIPTION_KEY = "description";
    private static final String DISCLAIMER_SETTINGS_TITLE_KEY = "title";
    private static final String MESSAGES_ANSWER_REQUIRED_TEXT_KEY = "answer_required_text";
    private static final String MESSAGES_INPUT_TEXT_PLACEHOLDER_KEY = "text_placeholder";
    private static final String MESSAGES_NAVIGATION_BACK_TEXT_KEY = "navigation_back_text";
    private static final String MESSAGES_SUBMIT_TEXT_KEY = "submit_text";
    private static final String POINTS_KEY = "points";
    private static final String POINT_ANSWERS_KEY = "answers";
    private static final String POINT_CONTENT_KEY = "content";
    private static final String POINT_DESCRIPTION_KEY = "description";
    private static final String POINT_DISCLAIMER_SETTINGS_KEY = "disclaimer_settings";
    private static final String POINT_FIELDS_KEY = "fields";
    private static final String POINT_SETTINGS_COMMENT_LABEL = "comment_label";
    private static final String POINT_SETTINGS_LEFT_TEXT_KEY = "text_on_the_left";
    private static final String POINT_SETTINGS_MATRIX_SCALE = "scale";
    private static final String POINT_SETTINGS_RIGHT_TEXT_KEY = "text_on_the_right";
    private static final String POINT_SETTINGS_SURVEY_POINT_IMAGE = "point_image";
    private static final String POINT_SETTINGS_SURVEY_POINT_IMAGE_DESCRIPTION = "description";
    private static final String POINT_SETTINGS_SURVEY_POINT_IMAGE_IMAGE = "image";
    private static final String POINT_SETTINGS_TEXT_KEY = "text";
    private static final String SETTINGS_KEY = "settings";
    private static final String SETTINGS_MESSAGES_KEY = "messages";

    private final DisclaimerSettingsTranslation mapDisclaimerSettings(Map<String, ? extends Object> settings) {
        if (settings == null) {
            return null;
        }
        Object obj = settings.get(DISCLAIMER_SETTINGS_TITLE_KEY);
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = settings.get("description");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = settings.get(DISCLAIMER_SETTINGS_CHECKBOX_LABEL_KEY);
        return new DisclaimerSettingsTranslation(str, str2, obj3 instanceof String ? (String) obj3 : null);
    }

    private final List<SurveyPointEntryTranslation> mapPointAnswers(Map<String, ? extends Object> answers) throws NumberFormatException {
        Set<Map.Entry<String, ? extends Object>> setEntrySet;
        if (answers == null || (setEntrySet = answers.entrySet()) == null) {
            return w.f16945a;
        }
        Set<Map.Entry<String, ? extends Object>> set = setEntrySet;
        ArrayList arrayList = new ArrayList(p.a0(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            long j = Long.parseLong((String) entry.getKey());
            Object value = entry.getValue();
            arrayList.add(new SurveyPointEntryTranslation(j, value instanceof String ? (String) value : null));
        }
        return arrayList;
    }

    private final List<SurveyPointEntryTranslation> mapPointFields(Map<String, ? extends Object> fields) throws NumberFormatException {
        Set<Map.Entry<String, ? extends Object>> setEntrySet;
        if (fields == null || (setEntrySet = fields.entrySet()) == null) {
            return w.f16945a;
        }
        Set<Map.Entry<String, ? extends Object>> set = setEntrySet;
        ArrayList arrayList = new ArrayList(p.a0(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            long j = Long.parseLong((String) entry.getKey());
            Object value = entry.getValue();
            arrayList.add(new SurveyPointEntryTranslation(j, value instanceof String ? (String) value : null));
        }
        return arrayList;
    }

    private final SurveyPointSettingsTranslation mapPointSettings(Map<String, ? extends Object> settings) {
        if (settings == null) {
            return null;
        }
        Object obj = settings.get(POINT_SETTINGS_TEXT_KEY);
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = settings.get(POINT_SETTINGS_LEFT_TEXT_KEY);
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = settings.get(POINT_SETTINGS_RIGHT_TEXT_KEY);
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = settings.get(POINT_DISCLAIMER_SETTINGS_KEY);
        DisclaimerSettingsTranslation disclaimerSettingsTranslationMapDisclaimerSettings = mapDisclaimerSettings(obj4 instanceof Map ? (Map) obj4 : null);
        Object obj5 = settings.get(POINT_SETTINGS_MATRIX_SCALE);
        Map map = obj5 instanceof Map ? (Map) obj5 : null;
        Object obj6 = settings.get(POINT_SETTINGS_COMMENT_LABEL);
        String str4 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = settings.get(POINT_SETTINGS_SURVEY_POINT_IMAGE);
        return new SurveyPointSettingsTranslation(str, str2, str3, disclaimerSettingsTranslationMapDisclaimerSettings, map, str4, mapSurveyPointImage(obj7 instanceof Map ? (Map) obj7 : null));
    }

    private final List<SurveyPointTranslation> mapPoints(Map<String, ? extends Object> points) throws NumberFormatException {
        Set<Map.Entry<String, ? extends Object>> setEntrySet = points.entrySet();
        ArrayList arrayList = new ArrayList(p.a0(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            long j = Long.parseLong((String) entry.getKey());
            Object value = entry.getValue();
            l.c(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>{ com.survicate.surveys.infrastructure.serialization.MoshiTranslationsAdapterKt.Translations }");
            Map map = (Map) value;
            Object obj = map.get(POINT_CONTENT_KEY);
            Map<String, ? extends Object> map2 = null;
            String str = obj instanceof String ? (String) obj : null;
            Object obj2 = map.get("description");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = map.get(POINT_ANSWERS_KEY);
            Map<String, ? extends Object> map3 = obj3 instanceof Map ? (Map) obj3 : null;
            Object obj4 = map.get(POINT_FIELDS_KEY);
            Map<String, ? extends Object> map4 = obj4 instanceof Map ? (Map) obj4 : null;
            Object obj5 = map.get(SETTINGS_KEY);
            if (obj5 instanceof Map) {
                map2 = (Map) obj5;
            }
            arrayList.add(new SurveyPointTranslation(j, str, str2, mapPointAnswers(map3), mapPointFields(map4), mapPointSettings(map2)));
        }
        return arrayList;
    }

    private final SurveySettingsTranslation mapSettings(Map<String, ? extends Object> settings) {
        Object obj = settings.get(SETTINGS_MESSAGES_KEY);
        l.c(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>{ com.survicate.surveys.infrastructure.serialization.MoshiTranslationsAdapterKt.Translations }");
        Map map = (Map) obj;
        Object obj2 = map.get(MESSAGES_SUBMIT_TEXT_KEY);
        String str = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get(MESSAGES_NAVIGATION_BACK_TEXT_KEY);
        String str2 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = map.get(MESSAGES_ANSWER_REQUIRED_TEXT_KEY);
        String str3 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = map.get(MESSAGES_INPUT_TEXT_PLACEHOLDER_KEY);
        return new SurveySettingsTranslation(new SurveyMessagesTranslation(str, str2, str3, obj5 instanceof String ? (String) obj5 : null));
    }

    private final SurveyPointImageTranslation mapSurveyPointImage(Map<String, ? extends Object> settings) {
        if (settings == null) {
            return null;
        }
        Object obj = settings.get(POINT_SETTINGS_SURVEY_POINT_IMAGE_IMAGE);
        return new SurveyPointImageTranslation(mapSurveyPointImage$mapImage(obj instanceof Map ? (Map) obj : null));
    }

    private static final ImageTranslation mapSurveyPointImage$mapImage(Map<String, ? extends Object> map) {
        if (map == null) {
            return null;
        }
        Object obj = map.get("description");
        return new ImageTranslation(obj instanceof String ? (String) obj : null);
    }

    @Override // nk.r
    @q0
    public void toJson(c0 writer, List<SurveyTranslation> value) {
        l.e(writer, "writer");
    }

    @Override // nk.r
    @n
    public List<SurveyTranslation> fromJson(nk.w reader) {
        l.e(reader, "reader");
        Object objO0 = reader.o0();
        Map map = objO0 instanceof Map ? (Map) objO0 : null;
        if (map == null) {
            return w.f16945a;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            l.c(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>{ com.survicate.surveys.infrastructure.serialization.MoshiTranslationsAdapterKt.Translations }");
            Map map2 = (Map) value;
            ArrayList arrayList2 = new ArrayList(map2.size());
            for (Map.Entry entry2 : map2.entrySet()) {
                arrayList2.add(new lq.r(entry.getKey(), entry2.getKey(), entry2.getValue()));
            }
            t.d0(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(p.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lq.r rVar = (lq.r) it.next();
            String str = (String) rVar.f15580a;
            String str2 = (String) rVar.f15581d;
            Object obj = rVar.f15582g;
            l.c(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>{ com.survicate.surveys.infrastructure.serialization.MoshiTranslationsAdapterKt.Translations }");
            Map map3 = (Map) obj;
            Object obj2 = map3.get(POINTS_KEY);
            l.c(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>{ com.survicate.surveys.infrastructure.serialization.MoshiTranslationsAdapterKt.Translations }");
            Object obj3 = map3.get(SETTINGS_KEY);
            l.c(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>{ com.survicate.surveys.infrastructure.serialization.MoshiTranslationsAdapterKt.Translations }");
            arrayList3.add(new SurveyTranslation(str, str2, mapPoints((Map) obj2), mapSettings((Map) obj3)));
        }
        return arrayList3;
    }
}
