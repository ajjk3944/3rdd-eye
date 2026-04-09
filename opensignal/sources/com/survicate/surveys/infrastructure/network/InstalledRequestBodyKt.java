package com.survicate.surveys.infrastructure.network;

import br.l;
import com.survicate.surveys.entities.models.RespondentEvent;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toRequestBody", "Lcom/survicate/surveys/infrastructure/network/InstalledRequestBody;", "Lcom/survicate/surveys/entities/models/RespondentEvent$Installed;", "survicate-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InstalledRequestBodyKt {
    public static final InstalledRequestBody toRequestBody(RespondentEvent.Installed installed) {
        l.e(installed, "<this>");
        return new InstalledRequestBody(installed);
    }
}
