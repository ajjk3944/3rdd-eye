package com.google.common.util.concurrent;

import com.google.common.collect.r;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class CycleDetectingLockFactory {

    public static final class PotentialDeadlockException extends a {

        /* renamed from: c, reason: collision with root package name */
        private final a f38418c;

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb2 = new StringBuilder(message);
            for (Throwable cause = this.f38418c; cause != null; cause = cause.getCause()) {
                sb2.append(", ");
                sb2.append(cause.getMessage());
            }
            return sb2.toString();
        }
    }

    private static class a extends IllegalStateException {

        /* renamed from: a, reason: collision with root package name */
        static final StackTraceElement[] f38419a = new StackTraceElement[0];

        /* renamed from: b, reason: collision with root package name */
        static final r f38420b = r.K0(CycleDetectingLockFactory.class.getName(), a.class.getName(), b.class.getName());
    }

    private static class b {
    }
}
