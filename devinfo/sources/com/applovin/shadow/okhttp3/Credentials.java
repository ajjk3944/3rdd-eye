package com.applovin.shadow.okhttp3;

import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.shadow.okio.ByteString;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import je.u;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static final String basic(String str, String str2) {
        k.e(str, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
        k.e(str2, "password");
        return basic$default(str, str2, null, 4, null);
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            k.d(charset, "ISO_8859_1");
        }
        return basic(str, str2, charset);
    }

    public static final String basic(String str, String str2, Charset charset) {
        k.e(str, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
        k.e(str2, "password");
        k.e(charset, "charset");
        return u.t("Basic ", ByteString.Companion.encodeString(str + ':' + str2, charset).base64());
    }
}
