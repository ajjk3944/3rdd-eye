package so;

import android.content.SharedPreferences;
import br.l;
import com.survicate.surveys.infrastructure.serialization.SurvicateSerializer;
import java.util.List;
import mq.w;

/* loaded from: classes.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f22181a;

    /* renamed from: b, reason: collision with root package name */
    public final SurvicateSerializer f22182b;

    /* renamed from: c, reason: collision with root package name */
    public final no.b f22183c;

    public e(SharedPreferences sharedPreferences, SurvicateSerializer survicateSerializer, no.b bVar) {
        l.e(sharedPreferences, "preferences");
        l.e(survicateSerializer, "serializer");
        l.e(bVar, "logger");
        this.f22181a = sharedPreferences;
        this.f22182b = survicateSerializer;
        this.f22183c = bVar;
    }

    public final List a() {
        SharedPreferences sharedPreferences = this.f22181a;
        boolean zContains = sharedPreferences.contains("answersToSend");
        w wVar = w.f16945a;
        if (!zContains) {
            return wVar;
        }
        try {
            String string = sharedPreferences.getString("answersToSend", "");
            l.b(string);
            return this.f22182b.deserializeAnswerEvents(string);
        } catch (Exception unused) {
            ((sm.f) this.f22183c).getClass();
            return wVar;
        }
    }

    public final List b() {
        SharedPreferences sharedPreferences = this.f22181a;
        boolean zContains = sharedPreferences.contains("surveySeenEventsToSend");
        w wVar = w.f16945a;
        if (!zContains) {
            return wVar;
        }
        try {
            String string = sharedPreferences.getString("surveySeenEventsToSend", "");
            l.b(string);
            return this.f22182b.deserializeSurveySeenEvents(string);
        } catch (Exception unused) {
            ((sm.f) this.f22183c).getClass();
            return wVar;
        }
    }
}
