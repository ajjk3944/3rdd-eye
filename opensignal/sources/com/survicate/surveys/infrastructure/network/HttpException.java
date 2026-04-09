package com.survicate.surveys.infrastructure.network;

import br.g;
import h0.b;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/HttpException;", "Ljava/io/IOException;", "responseCode", "", "errorBody", "", "(ILjava/lang/String;)V", "getErrorBody", "()Ljava/lang/String;", "getResponseCode", "()I", "Companion", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class HttpException extends IOException {
    public static final int CONFLICT_RESPONSE_CODE = 409;
    public static final int TOO_MANY_REQUESTS_RESPONSE_CODE = 429;
    private final String errorBody;
    private final int responseCode;

    public /* synthetic */ HttpException(int i10, String str, int i11, g gVar) {
        this(i10, (i11 & 2) != 0 ? null : str);
    }

    public final String getErrorBody() {
        return this.errorBody;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public HttpException(int i10, String str) {
        super(b.h(i10, "HTTP error code: "));
        this.responseCode = i10;
        this.errorBody = str;
    }
}
