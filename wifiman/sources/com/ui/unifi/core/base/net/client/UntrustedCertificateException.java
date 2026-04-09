package com.ui.unifi.core.base.net.client;

import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001f\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ui/unifi/core/base/net/client/UntrustedCertificateException;", "Ljava/security/cert/CertificateException;", "", "Ljava/security/cert/Certificate;", "certificates", "", "cause", "<init>", "([Ljava/security/cert/Certificate;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "[Ljava/security/cert/Certificate;", "()[Ljava/security/cert/Certificate;", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UntrustedCertificateException extends CertificateException {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Certificate[] certificates;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UntrustedCertificateException(Certificate[] certificates, Throwable th2) {
        super("Untrusted certificate", th2);
        AbstractC6492s.i(certificates, "certificates");
        this.certificates = certificates;
    }

    /* renamed from: a, reason: from getter */
    public final Certificate[] getCertificates() {
        return this.certificates;
    }

    public /* synthetic */ UntrustedCertificateException(Certificate[] certificateArr, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(certificateArr, (i10 & 2) != 0 ? null : th2);
    }
}
