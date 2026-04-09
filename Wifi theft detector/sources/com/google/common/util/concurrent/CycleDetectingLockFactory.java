package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.collect.ImmutableSet;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class CycleDetectingLockFactory {

    public static class ExampleStackTrace extends IllegalStateException {

        /* renamed from: a, reason: collision with root package name */
        public static final StackTraceElement[] f12154a = new StackTraceElement[0];

        /* renamed from: b, reason: collision with root package name */
        public static final ImmutableSet f12155b = ImmutableSet.H(CycleDetectingLockFactory.class.getName(), ExampleStackTrace.class.getName(), b.class.getName());
    }

    @Beta
    public enum Policies {
        THROW { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.1
        },
        WARN { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.2
        },
        DISABLED { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.3
        };

        /* synthetic */ Policies(a aVar) {
            this();
        }
    }

    @Beta
    public static final class PotentialDeadlockException extends ExampleStackTrace {
        private final ExampleStackTrace conflictingStackTrace;

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb = new StringBuilder(message);
            for (Throwable cause = this.conflictingStackTrace; cause != null; cause = cause.getCause()) {
                sb.append(", ");
                sb.append(cause.getMessage());
            }
            return sb.toString();
        }
    }

    public class a extends ThreadLocal {
    }

    public static class b {
    }
}
