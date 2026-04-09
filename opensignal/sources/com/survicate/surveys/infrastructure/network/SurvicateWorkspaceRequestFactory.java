package com.survicate.surveys.infrastructure.network;

import br.l;
import io.sentry.k;
import java.net.URI;
import kotlin.Metadata;
import po.a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/SurvicateWorkspaceRequestFactory;", "Lcom/survicate/surveys/infrastructure/network/WorkspaceRequestFactory;", "Lpo/a;", "urlProvider", "<init>", "(Lpo/a;)V", "Lcom/survicate/surveys/infrastructure/network/URLRequest;", "createWorkspaceRequest", "()Lcom/survicate/surveys/infrastructure/network/URLRequest;", "Lpo/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurvicateWorkspaceRequestFactory implements WorkspaceRequestFactory {
    private final a urlProvider;

    public SurvicateWorkspaceRequestFactory(a aVar) {
        l.e(aVar, "urlProvider");
        this.urlProvider = aVar;
    }

    @Override // com.survicate.surveys.infrastructure.network.WorkspaceRequestFactory
    public URLRequest createWorkspaceRequest() {
        k kVar = (k) this.urlProvider;
        kVar.getClass();
        return new URLRequest(new URI(kVar.W((String) kVar.f12398g, "workspaces/{workspaceKey}/mobile_surveys_v6_4.json")), URLRequest.METHOD_GET, null);
    }
}
