package com.ui.sso.api.provider;

import com.ui.sso.account.UIAccountManager;
import com.ui.sso.api.UiAccountApi;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.InterfaceC6518l;
import kotlin.text.p;
import kotlin.text.t;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/ui/sso/api/provider/UiAccountProviderError;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "AccountManager", "CallerSignCertMismatch", "IllegalState", "InterprocessWrapper", "Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;", "Lcom/ui/sso/api/provider/UiAccountProviderError$CallerSignCertMismatch;", "Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class UiAccountProviderError extends RuntimeException {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ui/sso/api/provider/UiAccountProviderError$AccountManager;", "Lcom/ui/sso/api/provider/UiAccountProviderError;", "", "message", "Lcom/ui/sso/account/UIAccountManager$Error;", "cause", "<init>", "(Ljava/lang/String;Lcom/ui/sso/account/UIAccountManager$Error;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Lcom/ui/sso/account/UIAccountManager$Error;", "()Lcom/ui/sso/account/UIAccountManager$Error;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AccountManager extends UiAccountProviderError {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final UIAccountManager.Error cause;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccountManager(String message, UIAccountManager.Error cause) {
            super(null);
            AbstractC6492s.i(message, "message");
            AbstractC6492s.i(cause, "cause");
            this.cause = cause;
            String message2 = getCause().getMessage();
            this.message = message + ": " + (message2 == null ? "" : message2);
        }

        @Override // java.lang.Throwable
        /* renamed from: a, reason: from getter */
        public UIAccountManager.Error getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ui/sso/api/provider/UiAccountProviderError$CallerSignCertMismatch;", "Lcom/ui/sso/api/provider/UiAccountProviderError;", "()V", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CallerSignCertMismatch extends UiAccountProviderError {
        public CallerSignCertMismatch() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/sso/api/provider/UiAccountProviderError$IllegalState;", "Lcom/ui/sso/api/provider/UiAccountProviderError;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IllegalState extends UiAccountProviderError {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Throwable cause;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String message;

        public /* synthetic */ IllegalState(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : th2);
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IllegalState(String message, Throwable th2) {
            String message2;
            super(null);
            AbstractC6492s.i(message, "message");
            this.cause = th2;
            Throwable cause = getCause();
            this.message = message + ": " + ((cause == null || (message2 = cause.getMessage()) == null) ? "" : message2);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00112\u00060\u0001j\u0002`\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/ui/sso/api/provider/UiAccountProviderError$InterprocessWrapper;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lcom/ui/sso/api/provider/UiAccountProviderError;", "cause", "<init>", "(Lcom/ui/sso/api/provider/UiAccountProviderError;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Lcom/ui/sso/api/provider/UiAccountProviderError;", "()Lcom/ui/sso/api/provider/UiAccountProviderError;", "", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "", SnmpConfigurator.O_COMMUNITY, "()I", "id", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InterprocessWrapper extends IllegalStateException {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final UiAccountProviderError cause;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* renamed from: com.ui.sso.api.provider.UiAccountProviderError$InterprocessWrapper$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final UiAccountApi.Error a(IllegalStateException ex) throws UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse {
                InterfaceC6518l interfaceC6518lL;
                AbstractC6492s.i(ex, "ex");
                String message = ex.getMessage();
                if (message == null || (interfaceC6518lL = new p("UIAccountInterprocessError:(\\d+)-(.*)").l(message)) == null) {
                    return null;
                }
                Integer numQ = t.q((String) interfaceC6518lL.b().get(1));
                if (numQ == null) {
                    throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("invalid interprocess error message " + message, null, 2, null);
                }
                int iIntValue = numQ.intValue();
                CharSequence charSequence = (CharSequence) interfaceC6518lL.b().get(2);
                if (t.m0(charSequence)) {
                    charSequence = null;
                }
                String str = (String) charSequence;
                switch (iIntValue) {
                    case 0:
                        return new UiAccountApi.Error.CallerSignCertMismatch();
                    case 1:
                        if (str != null) {
                            message = str;
                        }
                        return new UiAccountApi.Error.ContentProvider.IllegalState(message, null, 2, null);
                    case 2:
                        if (str != null) {
                            message = str;
                        }
                        return new UiAccountApi.Error.AccountManager.AccessRestricted(message);
                    case 3:
                        if (str != null) {
                            message = str;
                        }
                        return new UiAccountApi.Error.AccountManager.AccountNotFound(message);
                    case 4:
                    case 5:
                    case 6:
                        if (str != null) {
                            message = str;
                        }
                        return new UiAccountApi.Error.AccountManager.IO(message);
                    default:
                        throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("unknown interprocess error " + message, null, 2, null);
                }
            }

            private Companion() {
            }
        }

        public InterprocessWrapper(UiAccountProviderError cause) {
            AbstractC6492s.i(cause, "cause");
            this.cause = cause;
            int iC = c();
            String message = getCause().getMessage();
            this.message = "UIAccountInterprocessError:" + iC + "-" + (message == null ? "" : message);
        }

        private final int c() {
            UiAccountProviderError cause = getCause();
            if (cause instanceof CallerSignCertMismatch) {
                return 0;
            }
            if (cause instanceof IllegalState) {
                return 1;
            }
            if (!(cause instanceof AccountManager)) {
                throw new NoWhenBranchMatchedException();
            }
            UIAccountManager.Error cause2 = ((AccountManager) getCause()).getCause();
            if (cause2 instanceof UIAccountManager.Error.AccessRestricted) {
                return 2;
            }
            if (cause2 instanceof UIAccountManager.Error.NotFound) {
                return 3;
            }
            if (cause2 instanceof UIAccountManager.Error.IO) {
                return 4;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // java.lang.Throwable
        /* renamed from: a, reason: from getter */
        public UiAccountProviderError getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }
    }

    public /* synthetic */ UiAccountProviderError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UiAccountProviderError() {
    }
}
