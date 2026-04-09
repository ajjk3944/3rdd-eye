package retrofit2;

import Mj.w;
import java.util.Objects;

/* loaded from: classes2.dex */
public class HttpException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final int f60397a;

    /* renamed from: b, reason: collision with root package name */
    private final String f60398b;

    /* renamed from: c, reason: collision with root package name */
    private final transient w f60399c;

    public HttpException(w wVar) {
        super(c(wVar));
        this.f60397a = wVar.b();
        this.f60398b = wVar.g();
        this.f60399c = wVar;
    }

    private static String c(w wVar) {
        Objects.requireNonNull(wVar, "response == null");
        return "HTTP " + wVar.b() + " " + wVar.g();
    }

    public int a() {
        return this.f60397a;
    }

    public w d() {
        return this.f60399c;
    }
}
