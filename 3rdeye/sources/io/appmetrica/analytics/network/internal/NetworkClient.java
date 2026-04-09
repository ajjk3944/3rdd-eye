package io.appmetrica.analytics.network.internal;

import N7.H7;
import io.appmetrica.analytics.network.impl.c;
import io.appmetrica.analytics.network.impl.d;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public class NetworkClient {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f42351a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f42352b;

    /* renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f42353c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f42354d;

    /* renamed from: e, reason: collision with root package name */
    private final Boolean f42355e;

    /* renamed from: f, reason: collision with root package name */
    private final int f42356f;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private Integer f42357a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f42358b;

        /* renamed from: c, reason: collision with root package name */
        private SSLSocketFactory f42359c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f42360d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f42361e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f42362f;

        public NetworkClient build() {
            return new NetworkClient(this.f42357a, this.f42358b, this.f42359c, this.f42360d, this.f42361e, this.f42362f, 0);
        }

        public Builder withConnectTimeout(int i) {
            this.f42357a = Integer.valueOf(i);
            return this;
        }

        public Builder withInstanceFollowRedirects(boolean z10) {
            this.f42361e = Boolean.valueOf(z10);
            return this;
        }

        public Builder withMaxResponseSize(int i) {
            this.f42362f = Integer.valueOf(i);
            return this;
        }

        public Builder withReadTimeout(int i) {
            this.f42358b = Integer.valueOf(i);
            return this;
        }

        public Builder withSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.f42359c = sSLSocketFactory;
            return this;
        }

        public Builder withUseCaches(boolean z10) {
            this.f42360d = Boolean.valueOf(z10);
            return this;
        }
    }

    public /* synthetic */ NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3, int i) {
        this(num, num2, sSLSocketFactory, bool, bool2, num3);
    }

    public Integer getConnectTimeout() {
        return this.f42351a;
    }

    public Boolean getInstanceFollowRedirects() {
        return this.f42355e;
    }

    public int getMaxResponseSize() {
        return this.f42356f;
    }

    public Integer getReadTimeout() {
        return this.f42352b;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f42353c;
    }

    public Boolean getUseCaches() {
        return this.f42354d;
    }

    public Call newCall(Request request) {
        return new c(this, request, new d());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NetworkClient{connectTimeout=");
        sb.append(this.f42351a);
        sb.append(", readTimeout=");
        sb.append(this.f42352b);
        sb.append(", sslSocketFactory=");
        sb.append(this.f42353c);
        sb.append(", useCaches=");
        sb.append(this.f42354d);
        sb.append(", instanceFollowRedirects=");
        sb.append(this.f42355e);
        sb.append(", maxResponseSize=");
        return H7.p(sb, this.f42356f, '}');
    }

    private NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3) {
        this.f42351a = num;
        this.f42352b = num2;
        this.f42353c = sSLSocketFactory;
        this.f42354d = bool;
        this.f42355e = bool2;
        this.f42356f = num3 == null ? Integer.MAX_VALUE : num3.intValue();
    }
}
