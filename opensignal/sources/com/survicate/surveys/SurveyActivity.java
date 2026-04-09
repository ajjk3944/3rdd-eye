package com.survicate.surveys;

import al.c;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.survicate.surveys.entities.colors.MicroColorControlOpacity;
import com.survicate.surveys.entities.survey.Survey;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.entities.survey.theme.Theme;
import cq.l;
import h7.h0;
import i.j;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import lf.t1;
import on.r;
import on.t;
import se.b;
import wo.a;
import wo.d;
import wo.h;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/survicate/surveys/SurveyActivity;", "Li/j;", "Lwo/a;", "<init>", "()V", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurveyActivity extends j implements a {
    public static final /* synthetic */ int X = 0;
    public d T;
    public h U;
    public final l V = new l(4, this);
    public final String W;

    public SurveyActivity() {
        String string = UUID.randomUUID().toString();
        br.l.d(string, "toString(...)");
        this.W = string;
    }

    @Override // c.l
    public final Object l() {
        return this.U;
    }

    @Override // i.j, c.l, g3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Survey survey;
        Theme theme;
        super.onCreate(bundle);
        c cVar = c.f818l;
        if (cVar == null) {
            finish();
            return;
        }
        d dVar = (d) cVar.k;
        this.T = dVar;
        if (dVar.f24562o == null) {
            finish();
            return;
        }
        String str = this.W;
        br.l.e(str, "activityUuid");
        dVar.f24563p.put(str, this);
        dVar.f24565r = str;
        c.j jVar = (c.j) getLastNonConfigurationInstance();
        Object obj = jVar != null ? jVar.f3022a : null;
        this.U = obj != null ? (h) obj : new h();
        View decorView = getWindow().getDecorView();
        List list = iq.d.f12924a;
        ((h0) dVar.f24559l).getClass();
        Locale localeForLanguageTag = Locale.forLanguageTag(h0.B());
        br.l.d(localeForLanguageTag, "forLanguageTag(...)");
        decorView.setLayoutDirection(TextUtils.getLayoutDirectionFromLocale(localeForLanguageTag));
        t1.E(getWindow(), false);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        if (i10 >= 34) {
            overrideActivityTransition(0, R.anim.fade_in, 0);
        } else {
            overridePendingTransition(R.anim.fade_in, 0);
        }
        setContentView(t.activity_survey);
        j().a(this, new am.d(2, this));
        d dVar2 = this.T;
        Object colorScheme = (dVar2 == null || (survey = dVar2.f24562o) == null || (theme = survey.getTheme()) == null) ? null : theme.getColorScheme();
        MicroColorScheme microColorScheme = colorScheme instanceof MicroColorScheme ? (MicroColorScheme) colorScheme : null;
        if (microColorScheme == null) {
            return;
        }
        findViewById(r.survey_point_container).setBackgroundColor(b.z(microColorScheme.getAnswer(), MicroColorControlOpacity.SurveyBackgroundDim.getOpacityValue()));
    }

    @Override // i.j, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        d dVar = this.T;
        if (dVar != null) {
            String str = this.W;
            br.l.e(str, "activityUuid");
            dVar.f24563p.remove(str);
        }
        isChangingConfigurations();
    }

    @Override // i.j, android.app.Activity
    public final void onPause() {
        no.a aVar;
        super.onPause();
        d dVar = this.T;
        if (dVar == null || (aVar = dVar.f24561n) == null) {
            return;
        }
        l lVar = this.V;
        synchronized (aVar.f2897a) {
            aVar.f2897a.remove(lVar);
        }
    }

    @Override // i.j, android.app.Activity
    public final void onResume() {
        no.a aVar;
        super.onResume();
        d dVar = this.T;
        if (dVar == null || (aVar = dVar.f24561n) == null) {
            return;
        }
        aVar.b(this.V);
    }
}
