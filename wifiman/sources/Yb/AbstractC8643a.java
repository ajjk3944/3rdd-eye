package yb;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: yb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8643a {
    public static final Request.Builder a(Request.Builder builder, String cookie) {
        AbstractC6492s.i(builder, "<this>");
        AbstractC6492s.i(cookie, "cookie");
        return builder.a("Cookie", cookie);
    }

    public static final List b(Response response) {
        AbstractC6492s.i(response, "<this>");
        List listK = response.getHeaders().k("Set-Cookie");
        if (listK.isEmpty()) {
            listK = null;
        }
        return listK;
    }

    public static final Request.Builder c(Request.Builder builder, String userAgent) {
        AbstractC6492s.i(builder, "<this>");
        AbstractC6492s.i(userAgent, "userAgent");
        return builder.c("User-Agent", userAgent);
    }
}
