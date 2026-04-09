package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.lh1;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class a22 extends qd {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f24395h = 0;

    public static final class a {
        private a() {
        }

        public static a22 a(String packageName) {
            kotlin.jvm.internal.l.f(packageName, "packageName");
            try {
                return new a22(Class.forName(packageName.concat(".OpenSSLSocketImpl")), Class.forName(packageName.concat(".OpenSSLSocketFactoryImpl")), Class.forName(packageName.concat(".SSLParametersImpl")));
            } catch (Exception e4) {
                int i = lh1.f30001c;
                lh1.a.a().getClass();
                lh1.a(5, "unable to load android socket classes", e4);
                return null;
            }
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a22(Class<? super SSLSocket> sslSocketClass, Class<? super SSLSocketFactory> sslSocketFactoryClass, Class<?> paramClass) {
        super(sslSocketClass);
        kotlin.jvm.internal.l.f(sslSocketClass, "sslSocketClass");
        kotlin.jvm.internal.l.f(sslSocketFactoryClass, "sslSocketFactoryClass");
        kotlin.jvm.internal.l.f(paramClass, "paramClass");
    }
}
