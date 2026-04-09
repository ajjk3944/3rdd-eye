package com.survicate.surveys.infrastructure.network;

import br.l;
import com.survicate.surveys.infrastructure.serialization.WorkspaceDeserializer;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/SurvicateWorkspaceApi;", "Lcom/survicate/surveys/infrastructure/network/WorkspaceApi;", "requestFactory", "Lcom/survicate/surveys/infrastructure/network/WorkspaceRequestFactory;", "deserializer", "Lcom/survicate/surveys/infrastructure/serialization/WorkspaceDeserializer;", "httpClient", "Lcom/survicate/surveys/infrastructure/network/SurvicateHttpClient;", "(Lcom/survicate/surveys/infrastructure/network/WorkspaceRequestFactory;Lcom/survicate/surveys/infrastructure/serialization/WorkspaceDeserializer;Lcom/survicate/surveys/infrastructure/network/SurvicateHttpClient;)V", "fetchWorkspace", "Lcom/survicate/surveys/infrastructure/network/NetworkWorkspace;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurvicateWorkspaceApi implements WorkspaceApi {
    private final WorkspaceDeserializer deserializer;
    private final SurvicateHttpClient httpClient;
    private final WorkspaceRequestFactory requestFactory;

    public SurvicateWorkspaceApi(WorkspaceRequestFactory workspaceRequestFactory, WorkspaceDeserializer workspaceDeserializer, SurvicateHttpClient survicateHttpClient) {
        l.e(workspaceRequestFactory, "requestFactory");
        l.e(workspaceDeserializer, "deserializer");
        l.e(survicateHttpClient, "httpClient");
        this.requestFactory = workspaceRequestFactory;
        this.deserializer = workspaceDeserializer;
        this.httpClient = survicateHttpClient;
    }

    @Override // com.survicate.surveys.infrastructure.network.WorkspaceApi
    public NetworkWorkspace fetchWorkspace() throws IOException {
        String strLoadUrlResponse = this.httpClient.loadUrlResponse(this.requestFactory.createWorkspaceRequest());
        if (strLoadUrlResponse != null) {
            return this.deserializer.deserializeWorkspace(strLoadUrlResponse);
        }
        throw new IOException("Failed to fetch workspace: empty API response");
    }
}
