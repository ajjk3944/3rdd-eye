package com.ui.unifi.core.sso.exceptions;

import Eb.TwoFaRequiredResponse;
import kotlin.Metadata;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "LEb/z;", "response", "<init>", "(LEb/z;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "LEb/z;", "()LEb/z;", "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TwoFaRequiredException extends Exception {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TwoFaRequiredResponse response;

    public TwoFaRequiredException(TwoFaRequiredResponse twoFaRequiredResponse) {
        super("Two Factor Token Required!");
        this.response = twoFaRequiredResponse;
    }

    /* renamed from: a, reason: from getter */
    public final TwoFaRequiredResponse getResponse() {
        return this.response;
    }
}
