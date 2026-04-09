package com.survicate.surveys.infrastructure.network.contacts;

import br.n;
import com.survicate.surveys.infrastructure.network.contacts.ContactsApiModels;
import java.lang.annotation.Annotation;
import ku.p0;

/* loaded from: classes.dex */
public final class a extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f6376d = new a(0);

    @Override // ar.a
    public final Object c() {
        return p0.d("com.survicate.surveys.infrastructure.network.contacts.ContactsApiModels.SurveyInteractionType", ContactsApiModels.SurveyInteractionType.values(), new String[]{"seen", "answered", "completed", "closed"}, new Annotation[][]{null, null, null, null});
    }
}
