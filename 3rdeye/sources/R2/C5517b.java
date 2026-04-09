package r2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: DefaultLottieNetworkFetcher.java */
/* renamed from: r2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5517b {
    public static C5516a a(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C5516a(httpURLConnection);
    }
}
