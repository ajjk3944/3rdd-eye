package io.appmetrica.analytics.networktasks.internal;

import B4.f;
import com.singular.sdk.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class DefaultResponseParser {

    public static class Response {
        public final String mStatus;

        public Response(String str) {
            this.mStatus = str;
        }

        public String toString() {
            return f.c(new StringBuilder("Response{mStatus='"), this.mStatus, "'}");
        }
    }

    public Response parse(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            if (bArr.length > 0) {
                return new Response(new JSONObject(new String(bArr, Constants.ENCODING)).optString("status"));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
