package ee;

import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: ee.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5458d {

    /* renamed from: a, reason: collision with root package name */
    public static final C5458d f46380a = new C5458d();

    private C5458d() {
    }

    public final X509Certificate a(byte[] bytes) throws CertificateException {
        AbstractC6492s.i(bytes, "bytes");
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        AbstractC6492s.h(certificateFactory, "getInstance(...)");
        Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bytes));
        AbstractC6492s.g(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
        return (X509Certificate) certificateGenerateCertificate;
    }

    public final byte[] b(X509Certificate cert) throws CertificateEncodingException {
        AbstractC6492s.i(cert, "cert");
        byte[] encoded = cert.getEncoded();
        AbstractC6492s.h(encoded, "getEncoded(...)");
        return encoded;
    }
}
