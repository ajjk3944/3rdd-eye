package io.reactivex.rxjava3.exceptions;

/* loaded from: classes4.dex */
public final class MissingBackpressureException extends RuntimeException {
    public MissingBackpressureException() {
    }

    public static MissingBackpressureException a() {
        return new MissingBackpressureException("Could not emit value due to lack of requests");
    }

    public MissingBackpressureException(String str) {
        super(str);
    }
}
