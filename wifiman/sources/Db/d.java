package Db;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes3.dex */
public final class d implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    private final Cb.a f3183a;

    public d(Cb.a trustedDeviceHelper) {
        AbstractC6492s.i(trustedDeviceHelper, "trustedDeviceHelper");
        this.f3183a = trustedDeviceHelper;
    }

    @Override // okhttp3.Interceptor
    public Response a(Interceptor.Chain chain) {
        AbstractC6492s.i(chain, "chain");
        Request.Builder builderI = chain.j().i();
        for (Map.Entry entry : this.f3183a.a().entrySet()) {
            builderI.a((String) entry.getKey(), (String) entry.getValue());
        }
        return chain.b(builderI.b());
    }
}
