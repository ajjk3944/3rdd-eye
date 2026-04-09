package com.bytedance.sdk.component.fkw.vt;

import android.util.Log;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.component.fkw.fkw;
import com.bytedance.sdk.component.fkw.le;
import com.bytedance.sdk.component.utils.tlj;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw implements com.bytedance.sdk.component.fkw.yu<lh> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    private static lh<byte[]> vt(fkw fkwVar) throws Throwable {
        Closeable closeable;
        InputStream inputStream;
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream;
        String message;
        Closeable closeable2;
        HttpURLConnection httpURLConnection;
        InputStream inputStream2 = null;
        Map<String, String> mapOuw = null;
        int i4 = 0;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(fkwVar.ouw()).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(PAGErrorCode.LOAD_FACTORY_NULL_CODE);
                httpURLConnection.setReadTimeout(PAGErrorCode.LOAD_FACTORY_NULL_CODE);
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
            } catch (MalformedURLException e2) {
                e = e2;
                inputStream = null;
                byteArray = null;
            } catch (IOException e10) {
                e = e10;
                inputStream = null;
                byteArray = null;
            } catch (Throwable th2) {
                th = th2;
                closeable = null;
                tlj.ouw(inputStream2);
                tlj.ouw(closeable);
                throw th;
            }
            try {
                byte[] bArr = new byte[Segment.SHARE_MINIMUM];
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int i10 = inputStream.read(bArr);
                        if (i10 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i10);
                    } catch (MalformedURLException e11) {
                        e = e11;
                        byteArray = null;
                    } catch (IOException e12) {
                        e = e12;
                        byteArray = null;
                    }
                }
                i4 = TTAdConstant.MATE_VALID;
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (MalformedURLException e13) {
                e = e13;
                byteArray = null;
                byteArrayOutputStream = byteArray;
                Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                tlj.ouw(inputStream);
                tlj.ouw(closeable2);
                return new lh<>(i4, byteArray, message, mapOuw);
            } catch (IOException e14) {
                e = e14;
                byteArray = null;
                byteArrayOutputStream = byteArray;
                Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                tlj.ouw(inputStream);
                tlj.ouw(closeable2);
                return new lh<>(i4, byteArray, message, mapOuw);
            } catch (Throwable th3) {
                th = th3;
                closeable = null;
                inputStream2 = inputStream;
                tlj.ouw(inputStream2);
                tlj.ouw(closeable);
                throw th;
            }
            try {
                mapOuw = fkwVar.vt() ? ouw(httpURLConnection) : null;
                tlj.ouw(inputStream);
                tlj.ouw(byteArrayOutputStream);
                message = "success";
            } catch (MalformedURLException e15) {
                e = e15;
                Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                tlj.ouw(inputStream);
                tlj.ouw(closeable2);
                return new lh<>(i4, byteArray, message, mapOuw);
            } catch (IOException e16) {
                e = e16;
                Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                tlj.ouw(inputStream);
                tlj.ouw(closeable2);
                return new lh<>(i4, byteArray, message, mapOuw);
            }
            return new lh<>(i4, byteArray, message, mapOuw);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // com.bytedance.sdk.component.fkw.yu
    public final /* synthetic */ le ouw(fkw fkwVar) {
        return vt(fkwVar);
    }

    private static Map<String, String> ouw(HttpURLConnection httpURLConnection) {
        HashMap map = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        for (String str : headerFields.keySet()) {
            List<String> list = headerFields.get(str);
            if (list != null && list.size() > 0) {
                map.put(str, list.get(0));
            }
        }
        return map;
    }
}
