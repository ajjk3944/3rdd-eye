package com.survicate.surveys.infrastructure.network;

import br.l;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"canRetry", "", "Lcom/survicate/surveys/infrastructure/network/HttpException;", "survicate-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpExceptionKt {
    public static final boolean canRetry(HttpException httpException) {
        l.e(httpException, "<this>");
        int responseCode = httpException.getResponseCode();
        return (500 <= responseCode && responseCode < 600) || httpException.getResponseCode() == 429 || httpException.getResponseCode() == 0;
    }
}
