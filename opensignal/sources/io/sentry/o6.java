package io.sentry;

import com.survicate.surveys.infrastructure.network.HttpException;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes.dex */
public enum o6 implements c2 {
    OK(0, 399),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(HttpException.CONFLICT_RESPONSE_CODE),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(HttpException.TOO_MANY_REQUESTS_RESPONSE_CODE),
    FAILED_PRECONDITION(400),
    ABORTED(HttpException.CONFLICT_RESPONSE_CODE),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    o6(int i10) {
        this.minHttpStatusCode = i10;
        this.maxHttpStatusCode = i10;
    }

    public static o6 fromApiNameSafely(String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static o6 fromHttpStatusCode(int i10) {
        for (o6 o6Var : values()) {
            if (o6Var.matches(i10)) {
                return o6Var;
            }
        }
        return null;
    }

    private boolean matches(int i10) {
        return i10 >= this.minHttpStatusCode && i10 <= this.maxHttpStatusCode;
    }

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }

    @Override // io.sentry.c2
    public void serialize(y2 y2Var, u0 u0Var) throws IOException {
        ((i4.b) y2Var).V(apiName());
    }

    public static o6 fromHttpStatusCode(Integer num, o6 o6Var) {
        o6 o6VarFromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : o6Var;
        return o6VarFromHttpStatusCode != null ? o6VarFromHttpStatusCode : o6Var;
    }

    o6(int i10, int i11) {
        this.minHttpStatusCode = i10;
        this.maxHttpStatusCode = i11;
    }
}
