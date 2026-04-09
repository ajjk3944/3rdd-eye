package com.ui.unifi.core.sso.exceptions;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/unifi/core/sso/exceptions/EmailNotVerifiedException;", "Ljava/lang/Exception;", "<init>", "()V", "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmailNotVerifiedException extends Exception {
    public EmailNotVerifiedException() {
        super("Email must be verified to sign in");
    }
}
