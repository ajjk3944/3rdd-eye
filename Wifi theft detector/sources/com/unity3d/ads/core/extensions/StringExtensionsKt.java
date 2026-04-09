package com.unity3d.ads.core.extensions;

import java.net.URLConnection;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s9.c;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0001¨\u0006\u0003"}, d2 = {"getSHA256Hash", "", "guessMimeType", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StringExtensionsKt {
    @NotNull
    public static final String getSHA256Hash(@NotNull String str) {
        p.e(str, "<this>");
        byte[] bytes = str.getBytes(c.f24341b);
        p.d(bytes, "this as java.lang.String).getBytes(charset)");
        String strHex = ByteString.of(Arrays.copyOf(bytes, bytes.length)).sha256().hex();
        p.d(strHex, "bytes.sha256().hex()");
        return strHex;
    }

    @Nullable
    public static final String guessMimeType(@NotNull String str) {
        p.e(str, "<this>");
        return URLConnection.guessContentTypeFromName(str);
    }
}
