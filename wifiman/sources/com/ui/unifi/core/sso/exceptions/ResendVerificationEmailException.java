package com.ui.unifi.core.sso.exceptions;

import kotlin.Metadata;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ui/unifi/core/sso/exceptions/ResendVerificationEmailException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "limitInSeconds", "<init>", "(I)V", SnmpConfigurator.O_AUTH_PROTOCOL, "I", "getLimitInSeconds", "()I", "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ResendVerificationEmailException extends Exception {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int limitInSeconds;

    public ResendVerificationEmailException(int i10) {
        super("Failed to resend verification email");
        this.limitInSeconds = i10;
    }
}
