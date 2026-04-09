package com.ui.sso.auth;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ui/sso/auth/UiCookieAuthError;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "InvalidCookieFormat", "InvalidToken", "Lcom/ui/sso/auth/UiCookieAuthError$InvalidCookieFormat;", "Lcom/ui/sso/auth/UiCookieAuthError$InvalidToken;", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class UiCookieAuthError extends RuntimeException {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ui/sso/auth/UiCookieAuthError$InvalidCookieFormat;", "Lcom/ui/sso/auth/UiCookieAuthError;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InvalidCookieFormat extends UiCookieAuthError {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable cause;

        public /* synthetic */ InvalidCookieFormat(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : th2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InvalidCookieFormat)) {
                return false;
            }
            InvalidCookieFormat invalidCookieFormat = (InvalidCookieFormat) other;
            return AbstractC6492s.d(this.message, invalidCookieFormat.message) && AbstractC6492s.d(this.cause, invalidCookieFormat.cause);
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            Throwable th2 = this.cause;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InvalidCookieFormat(message=" + this.message + ", cause=" + this.cause + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidCookieFormat(String message, Throwable th2) {
            super(null);
            AbstractC6492s.i(message, "message");
            this.message = message;
            this.cause = th2;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ui/sso/auth/UiCookieAuthError$InvalidToken;", "Lcom/ui/sso/auth/UiCookieAuthError;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InvalidToken extends UiCookieAuthError {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidToken(String message) {
            super(null);
            AbstractC6492s.i(message, "message");
            this.message = message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InvalidToken) && AbstractC6492s.d(this.message, ((InvalidToken) other).message);
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InvalidToken(message=" + this.message + ")";
        }
    }

    public /* synthetic */ UiCookieAuthError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UiCookieAuthError() {
    }
}
