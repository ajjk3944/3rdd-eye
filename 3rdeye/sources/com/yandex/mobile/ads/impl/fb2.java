package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class fb2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f27278a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fb2(int i, String errorDescription) {
        this(errorDescription);
        kotlin.jvm.internal.l.f(errorDescription, "errorDescription");
    }

    public final String a() {
        return this.f27278a;
    }

    public static final class a {
        public static fb2 a(String str) {
            if (str == null) {
                str = "Ad request failed with network error";
            }
            return new fb2(2, str);
        }

        public static fb2 b(String description) {
            kotlin.jvm.internal.l.f(description, "description");
            return new fb2(1, description);
        }

        public static fb2 a(b50 error) {
            kotlin.jvm.internal.l.f(error, "error");
            String message = error.getMessage();
            if (message == null) {
                message = "Ad request completed successfully, but there are no ads available.";
            }
            return new fb2(3, message);
        }

        public static fb2 b() {
            return new fb2(4, "Server temporarily unavailable. Please, try again later.");
        }

        public static fb2 a() {
            return new fb2(1, "Internal error. Failed to parse response");
        }
    }

    private fb2(String str) {
        this.f27278a = str;
    }
}
