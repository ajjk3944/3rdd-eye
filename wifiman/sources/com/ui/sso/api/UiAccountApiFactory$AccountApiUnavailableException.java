package com.ui.sso.api;

import com.ui.sso.api.UiAccountApi;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"com/ui/sso/api/UiAccountApiFactory$AccountApiUnavailableException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "Lcom/ui/sso/api/UiAccountApi$Error;", "cause", "<init>", "(Ljava/lang/String;Lcom/ui/sso/api/UiAccountApi$Error;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Lcom/ui/sso/api/UiAccountApi$Error;", "()Lcom/ui/sso/api/UiAccountApi$Error;", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UiAccountApiFactory$AccountApiUnavailableException extends Exception {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String message;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final UiAccountApi.Error cause;

    public UiAccountApiFactory$AccountApiUnavailableException(String message, UiAccountApi.Error cause) {
        AbstractC6492s.i(message, "message");
        AbstractC6492s.i(cause, "cause");
        this.message = message;
        this.cause = cause;
    }

    @Override // java.lang.Throwable
    /* renamed from: a, reason: from getter */
    public UiAccountApi.Error getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
