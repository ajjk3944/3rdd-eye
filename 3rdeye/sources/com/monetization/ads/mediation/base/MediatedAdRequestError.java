package com.monetization.ads.mediation.base;

import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class MediatedAdRequestError {

    /* renamed from: a, reason: collision with root package name */
    private final int f23699a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23700b;

    public static final class Code {
        public static final Code INSTANCE = new Code();
        public static final int INTERNAL_ERROR = 1;
        public static final int INVALID_REQUEST = 2;
        public static final int NETWORK_ERROR = 3;
        public static final int NO_FILL = 4;
        public static final int SYSTEM_ERROR = 5;
        public static final int UNKNOWN_ERROR = 0;

        private Code() {
        }
    }

    public MediatedAdRequestError(int i, String description) {
        l.f(description, "description");
        this.f23699a = i;
        this.f23700b = description;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MediatedAdRequestError.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.d(obj, "null cannot be cast to non-null type com.monetization.ads.mediation.base.MediatedAdRequestError");
        MediatedAdRequestError mediatedAdRequestError = (MediatedAdRequestError) obj;
        if (this.f23699a != mediatedAdRequestError.f23699a) {
            return false;
        }
        return l.b(this.f23700b, mediatedAdRequestError.f23700b);
    }

    public final int getCode() {
        return this.f23699a;
    }

    public final String getDescription() {
        return this.f23700b;
    }

    public int hashCode() {
        return this.f23700b.hashCode() + (this.f23699a * 31);
    }

    public String toString() {
        return "AdRequestError (code: " + this.f23699a + ", description: " + this.f23700b + ")";
    }
}
