package com.survicate.surveys.infrastructure.serialization;

import bf.n;
import br.l;
import com.survicate.surveys.infrastructure.network.NetworkWorkspace;
import kotlin.Metadata;
import nk.j0;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/survicate/surveys/infrastructure/serialization/SurvicateWorkspaceDeserializer;", "Lcom/survicate/surveys/infrastructure/serialization/WorkspaceDeserializer;", "Lnk/j0;", "moshi", "<init>", "(Lnk/j0;)V", "", "rawData", "Lcom/survicate/surveys/infrastructure/network/NetworkWorkspace;", "deserializeWorkspace", "(Ljava/lang/String;)Lcom/survicate/surveys/infrastructure/network/NetworkWorkspace;", "Lnk/j0;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurvicateWorkspaceDeserializer implements WorkspaceDeserializer {
    private final j0 moshi;

    public SurvicateWorkspaceDeserializer(j0 j0Var) {
        l.e(j0Var, "moshi");
        this.moshi = j0Var;
    }

    @Override // com.survicate.surveys.infrastructure.serialization.WorkspaceDeserializer
    public NetworkWorkspace deserializeWorkspace(String rawData) {
        l.e(rawData, "rawData");
        NetworkWorkspace networkWorkspace = (NetworkWorkspace) this.moshi.a(NetworkWorkspace.class).fromJson(rawData);
        if (networkWorkspace != null) {
            return networkWorkspace;
        }
        throw new n("Failed to deserialize workspace: null");
    }
}
