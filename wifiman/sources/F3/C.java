package F3;

import java.util.concurrent.TimeUnit;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: e, reason: collision with root package name */
    private static final MediaType f5845e = MediaType.g("application/json; charset=utf-8");

    /* renamed from: a, reason: collision with root package name */
    public final D f5846a;

    /* renamed from: b, reason: collision with root package name */
    private final OkHttpClient f5847b;

    /* renamed from: c, reason: collision with root package name */
    private final F f5848c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5849d;

    public C(D d10, F f10) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f5847b = builder.e(10000L, timeUnit).O(10000L, timeUnit).Q(10000L, timeUnit).c();
        this.f5846a = d10;
        this.f5848c = f10;
        this.f5849d = "https://firebaseinstallations.googleapis.com/v1";
    }
}
