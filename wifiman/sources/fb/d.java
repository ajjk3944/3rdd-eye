package fb;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes3.dex */
public final class d implements Interceptor {

    /* renamed from: b, reason: collision with root package name */
    public static final a f47232b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private String f47233a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // okhttp3.Interceptor
    public Response a(Interceptor.Chain chain) {
        AbstractC6492s.i(chain, "chain");
        Request.Builder builderI = chain.j().i();
        String str = this.f47233a;
        if (str != null) {
            builderI.a("X-CSRF-Token", str);
        }
        Response responseB = chain.b(builderI.b());
        this.f47233a = responseB.y("X-CSRF-Token", this.f47233a);
        return responseB;
    }
}
