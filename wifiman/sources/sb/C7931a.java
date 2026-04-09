package sb;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.AbstractC6492s;
import lb.CloudCredentials;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: sb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7931a implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    private CloudCredentials f61434a;

    /* renamed from: b, reason: collision with root package name */
    private final SimpleDateFormat f61435b;

    public C7931a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.f61435b = simpleDateFormat;
    }

    @Override // okhttp3.Interceptor
    public Response a(Interceptor.Chain chain) {
        Request requestS;
        AbstractC6492s.i(chain, "chain");
        CloudCredentials cloudCredentials = this.f61434a;
        if (cloudCredentials == null) {
            requestS = chain.getRequest();
        } else {
            Request request = chain.getRequest();
            Request.Builder builderI = request.i();
            String str = this.f61435b.format(new Date());
            AbstractC6492s.h(str, "format(...)");
            requestS = f.s(builderI.a("X-Amz-Date", str).a("X-Amz-Security-Token", cloudCredentials.getSessionToken()).a("Host", request.getUrl().getHost()).b(), cloudCredentials.getAccessKeyId(), cloudCredentials.getSecretKey(), cloudCredentials.getRegion(), "execute-api");
        }
        return chain.b(requestS);
    }

    public final void b(CloudCredentials cloudCredentials) {
        this.f61434a = cloudCredentials;
    }
}
