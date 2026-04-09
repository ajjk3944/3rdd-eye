package b4;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* renamed from: b4.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0356u extends X509Certificate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5772a;

    /* renamed from: b, reason: collision with root package name */
    public final X509Certificate f5773b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f5774c;

    public /* synthetic */ C0356u(X509Certificate x509Certificate, byte[] bArr, int i) {
        this.f5772a = i;
        this.f5773b = x509Certificate;
        this.f5774c = bArr;
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        switch (this.f5772a) {
            case 0:
                this.f5773b.checkValidity();
                break;
            default:
                this.f5773b.checkValidity();
                break;
        }
    }

    @Override // java.security.cert.X509Certificate
    public final int getBasicConstraints() {
        switch (this.f5772a) {
        }
        return this.f5773b.getBasicConstraints();
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        switch (this.f5772a) {
        }
        return this.f5773b.getCriticalExtensionOIDs();
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        switch (this.f5772a) {
        }
        return this.f5774c;
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        switch (this.f5772a) {
        }
        return this.f5773b.getExtensionValue(str);
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getIssuerDN() {
        switch (this.f5772a) {
        }
        return this.f5773b.getIssuerDN();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getIssuerUniqueID() {
        switch (this.f5772a) {
        }
        return this.f5773b.getIssuerUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getKeyUsage() {
        switch (this.f5772a) {
        }
        return this.f5773b.getKeyUsage();
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        switch (this.f5772a) {
        }
        return this.f5773b.getNonCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotAfter() {
        switch (this.f5772a) {
        }
        return this.f5773b.getNotAfter();
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotBefore() {
        switch (this.f5772a) {
        }
        return this.f5773b.getNotBefore();
    }

    @Override // java.security.cert.Certificate
    public final PublicKey getPublicKey() {
        switch (this.f5772a) {
        }
        return this.f5773b.getPublicKey();
    }

    @Override // java.security.cert.X509Certificate
    public final BigInteger getSerialNumber() {
        switch (this.f5772a) {
        }
        return this.f5773b.getSerialNumber();
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgName() {
        switch (this.f5772a) {
        }
        return this.f5773b.getSigAlgName();
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgOID() {
        switch (this.f5772a) {
        }
        return this.f5773b.getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSigAlgParams() {
        switch (this.f5772a) {
        }
        return this.f5773b.getSigAlgParams();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSignature() {
        switch (this.f5772a) {
        }
        return this.f5773b.getSignature();
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getSubjectDN() {
        switch (this.f5772a) {
        }
        return this.f5773b.getSubjectDN();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getSubjectUniqueID() {
        switch (this.f5772a) {
        }
        return this.f5773b.getSubjectUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getTBSCertificate() {
        switch (this.f5772a) {
        }
        return this.f5773b.getTBSCertificate();
    }

    @Override // java.security.cert.X509Certificate
    public final int getVersion() {
        switch (this.f5772a) {
        }
        return this.f5773b.getVersion();
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        switch (this.f5772a) {
        }
        return this.f5773b.hasUnsupportedCriticalExtension();
    }

    @Override // java.security.cert.Certificate
    public final String toString() {
        switch (this.f5772a) {
        }
        return this.f5773b.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        switch (this.f5772a) {
            case 0:
                this.f5773b.verify(publicKey);
                break;
            default:
                this.f5773b.verify(publicKey);
                break;
        }
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        switch (this.f5772a) {
            case 0:
                this.f5773b.checkValidity(date);
                break;
            default:
                this.f5773b.checkValidity(date);
                break;
        }
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        switch (this.f5772a) {
            case 0:
                this.f5773b.verify(publicKey, str);
                break;
            default:
                this.f5773b.verify(publicKey, str);
                break;
        }
    }
}
