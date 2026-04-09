package zb;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: zb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8725a implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response a(Interceptor.Chain chain) {
        Integer numQ;
        AbstractC6492s.i(chain, "chain");
        Request requestJ = chain.j();
        Request.Builder builderI = requestJ.i();
        String strD = requestJ.d("TimeoutHeaders.READ_TIMEOUT");
        int iA = (strD == null || (numQ = t.q(strD)) == null) ? chain.a() : numQ.intValue() * 1000;
        builderI.f("TimeoutHeaders.READ_TIMEOUT");
        return chain.d(iA, TimeUnit.MILLISECONDS).b(builderI.b());
    }
}
