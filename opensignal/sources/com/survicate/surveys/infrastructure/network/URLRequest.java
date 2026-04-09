package com.survicate.surveys.infrastructure.network;

import br.l;
import c7.a;
import h0.b;
import java.net.URI;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/URLRequest;", "", "url", "Ljava/net/URI;", "method", "", "body", "(Ljava/net/URI;Ljava/lang/String;Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "getMethod", "getUrl", "()Ljava/net/URI;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class URLRequest {
    public static final String METHOD_GET = "GET";
    public static final String METHOD_POST = "POST";
    private final String body;
    private final String method;
    private final URI url;

    public URLRequest(URI uri, String str, String str2) {
        l.e(uri, "url");
        l.e(str, "method");
        this.url = uri;
        this.method = str;
        this.body = str2;
    }

    public static /* synthetic */ URLRequest copy$default(URLRequest uRLRequest, URI uri, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            uri = uRLRequest.url;
        }
        if ((i10 & 2) != 0) {
            str = uRLRequest.method;
        }
        if ((i10 & 4) != 0) {
            str2 = uRLRequest.body;
        }
        return uRLRequest.copy(uri, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final URI getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    public final URLRequest copy(URI url, String method, String body) {
        l.e(url, "url");
        l.e(method, "method");
        return new URLRequest(url, method, body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof URLRequest)) {
            return false;
        }
        URLRequest uRLRequest = (URLRequest) other;
        return l.a(this.url, uRLRequest.url) && l.a(this.method, uRLRequest.method) && l.a(this.body, uRLRequest.body);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getMethod() {
        return this.method;
    }

    public final URI getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iG = a.g(this.method, this.url.hashCode() * 31, 31);
        String str = this.body;
        return iG + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("URLRequest(url=");
        sb2.append(this.url);
        sb2.append(", method=");
        sb2.append(this.method);
        sb2.append(", body=");
        return b.r(sb2, this.body, ')');
    }
}
