package io.sentry.transport;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* loaded from: classes.dex */
public final class l extends Authenticator {

    /* renamed from: a, reason: collision with root package name */
    public final String f12768a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12769b;

    public l(String str, String str2) {
        this.f12768a = str;
        this.f12769b = str2;
    }

    @Override // java.net.Authenticator
    public final PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() != Authenticator.RequestorType.PROXY) {
            return null;
        }
        return new PasswordAuthentication(this.f12768a, this.f12769b.toCharArray());
    }
}
