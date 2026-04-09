package Db;

import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.HttpHeaders;

/* loaded from: classes3.dex */
public final class b implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    private final String f3181a;

    public b(String mfaPollLoginPath) {
        AbstractC6492s.i(mfaPollLoginPath, "mfaPollLoginPath");
        this.f3181a = mfaPollLoginPath;
    }

    @Override // okhttp3.Interceptor
    public Response a(Interceptor.Chain chain) throws TimeoutException {
        AbstractC6492s.i(chain, "chain");
        Request request = chain.getRequest();
        Response responseB = chain.b(request);
        if (t.W(chain.getRequest().getUrl().d(), this.f3181a, false, 2, null)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jCurrentTimeMillis2 = 0;
            while (responseB.getCode() == 202) {
                if (jCurrentTimeMillis2 > c.f3182a) {
                    throw new TimeoutException();
                }
                if (HttpHeaders.b(responseB)) {
                    responseB.close();
                }
                responseB = chain.b(request);
                jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            }
        }
        return responseB;
    }
}
