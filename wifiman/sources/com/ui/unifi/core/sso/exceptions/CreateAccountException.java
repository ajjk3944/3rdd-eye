package com.ui.unifi.core.sso.exceptions;

import Eb.CreateAccountError;
import kotlin.Metadata;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ui/unifi/core/sso/exceptions/CreateAccountException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "LEb/b;", "error", "", "errorData", "<init>", "(LEb/b;Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "LEb/b;", "()LEb/b;", "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class CreateAccountException extends Exception {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CreateAccountError error;

    public CreateAccountException(CreateAccountError createAccountError, String str) {
        super("Error while trying to create account. Data: " + str);
        this.error = createAccountError;
    }

    /* renamed from: a, reason: from getter */
    public final CreateAccountError getError() {
        return this.error;
    }
}
