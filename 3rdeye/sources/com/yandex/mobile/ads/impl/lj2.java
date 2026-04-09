package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Build;
import b9.C2001h;
import b9.InterfaceC2000g;
import com.yandex.mobile.ads.impl.ew1;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class lj2 implements kj2 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2000g f30016a = C2001h.b(a.f30017b);

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<CertificateFactory> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f30017b = new a();

        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final CertificateFactory invoke() {
            return CertificateFactory.getInstance("X.509");
        }
    }

    @Override // com.yandex.mobile.ads.impl.kj2
    public final boolean a(Context context, SslError sslError) throws CertificateException {
        X509Certificate x509CertificateA;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sslError, "sslError");
        du1 du1VarA = ew1.a.a().a(context);
        if (du1VarA != null && du1VarA.r0()) {
            if (Build.VERSION.SDK_INT >= 29) {
                x509CertificateA = sslError.getCertificate().getX509Certificate();
            } else {
                SslCertificate certificate = sslError.getCertificate();
                kotlin.jvm.internal.l.e(certificate, "getCertificate(...)");
                Object value = this.f30016a.getValue();
                kotlin.jvm.internal.l.e(value, "getValue(...)");
                x509CertificateA = vs1.a(certificate, (CertificateFactory) value);
            }
            if (x509CertificateA != null) {
                try {
                    cr0.a(new cu1(context)).checkServerTrusted(new X509Certificate[]{x509CertificateA}, "RSA");
                    return true;
                } catch (Exception unused) {
                    int i = fp0.f27419b;
                }
            }
        }
        return false;
    }
}
