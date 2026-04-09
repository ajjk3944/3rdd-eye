package com.bytedance.adsdk.ypw.dg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public class ypw implements ycc {
    @Override // com.bytedance.adsdk.ypw.dg.ycc
    public dg emc(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new emc(httpURLConnection);
    }
}
