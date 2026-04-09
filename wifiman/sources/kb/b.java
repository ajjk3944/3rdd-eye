package kb;

import Mj.w;
import Zg.AbstractC3689v;
import Zg.U;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.ResponseBody;
import sh.AbstractC7978m;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final a f51351c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final g f51352a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f51353b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(w response) {
            byte[] bArrG;
            AbstractC6492s.i(response, "response");
            Set setF = response.e().f();
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(setF, 10)), 16));
            for (Object obj : setF) {
                linkedHashMap.put(obj, response.e().k((String) obj));
            }
            g gVar = new g(linkedHashMap);
            ResponseBody responseBody = (ResponseBody) response.a();
            if (responseBody == null || (bArrG = responseBody.g()) == null) {
                bArrG = new byte[0];
            }
            return new b(gVar, bArrG);
        }

        private a() {
        }
    }

    public b(g headers, byte[] body) {
        AbstractC6492s.i(headers, "headers");
        AbstractC6492s.i(body, "body");
        this.f51352a = headers;
        this.f51353b = body;
    }

    public final byte[] a() {
        return this.f51353b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC6492s.d(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC6492s.g(obj, "null cannot be cast to non-null type com.ui.unifi.core.base.net.message.ApiResponse");
        b bVar = (b) obj;
        if (AbstractC6492s.d(this.f51352a, bVar.f51352a)) {
            return Arrays.equals(this.f51353b, bVar.f51353b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f51352a.hashCode() * 31) + Arrays.hashCode(this.f51353b);
    }

    public String toString() {
        return "ApiResponse(headers=" + this.f51352a + ", body=" + Arrays.toString(this.f51353b) + ")";
    }
}
