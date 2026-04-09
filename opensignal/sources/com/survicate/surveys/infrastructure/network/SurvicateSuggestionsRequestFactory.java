package com.survicate.surveys.infrastructure.network;

import br.l;
import com.survicate.surveys.infrastructure.serialization.SuggestionsSerializer;
import io.sentry.k;
import java.net.URI;
import kotlin.Metadata;
import po.a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/SurvicateSuggestionsRequestFactory;", "Lcom/survicate/surveys/infrastructure/network/SuggestionsRequestFactory;", "Lpo/a;", "urlProvider", "Lcom/survicate/surveys/infrastructure/serialization/SuggestionsSerializer;", "suggestionsSerializer", "<init>", "(Lpo/a;Lcom/survicate/surveys/infrastructure/serialization/SuggestionsSerializer;)V", "Lcom/survicate/surveys/infrastructure/network/EventSuggestionRequestBody;", "body", "Lcom/survicate/surveys/infrastructure/network/URLRequest;", "createEventSuggestionRequest", "(Lcom/survicate/surveys/infrastructure/network/EventSuggestionRequestBody;)Lcom/survicate/surveys/infrastructure/network/URLRequest;", "Lpo/a;", "Lcom/survicate/surveys/infrastructure/serialization/SuggestionsSerializer;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurvicateSuggestionsRequestFactory implements SuggestionsRequestFactory {
    private final SuggestionsSerializer suggestionsSerializer;
    private final a urlProvider;

    public SurvicateSuggestionsRequestFactory(a aVar, SuggestionsSerializer suggestionsSerializer) {
        l.e(aVar, "urlProvider");
        l.e(suggestionsSerializer, "suggestionsSerializer");
        this.urlProvider = aVar;
        this.suggestionsSerializer = suggestionsSerializer;
    }

    @Override // com.survicate.surveys.infrastructure.network.SuggestionsRequestFactory
    public URLRequest createEventSuggestionRequest(EventSuggestionRequestBody body) {
        l.e(body, "body");
        k kVar = (k) this.urlProvider;
        kVar.getClass();
        return new URLRequest(new URI(kVar.W((String) kVar.f12399r, "workspaces/{workspaceKey}/targeting_event.json")), URLRequest.METHOD_POST, this.suggestionsSerializer.serializeEventSuggestionRequestBody(body));
    }
}
