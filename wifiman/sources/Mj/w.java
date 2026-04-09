package Mj;

import java.util.Objects;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class w<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Response f13494a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f13495b;

    /* renamed from: c, reason: collision with root package name */
    private final ResponseBody f13496c;

    private w(Response response, Object obj, ResponseBody responseBody) {
        this.f13494a = response;
        this.f13495b = obj;
        this.f13496c = responseBody;
    }

    public static w c(ResponseBody responseBody, Response response) {
        Objects.requireNonNull(responseBody, "body == null");
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.P()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new w(response, null, responseBody);
    }

    public static w h(Object obj, Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.P()) {
            return new w(response, obj, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public Object a() {
        return this.f13495b;
    }

    public int b() {
        return this.f13494a.getCode();
    }

    public ResponseBody d() {
        return this.f13496c;
    }

    public Headers e() {
        return this.f13494a.getHeaders();
    }

    public boolean f() {
        return this.f13494a.P();
    }

    public String g() {
        return this.f13494a.getMessage();
    }

    public String toString() {
        return this.f13494a.toString();
    }
}
