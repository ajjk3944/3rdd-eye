package com.bytedance.sdk.component.bw.ypw;

import android.util.Log;
import com.bytedance.sdk.component.bw.bw;
import com.bytedance.sdk.component.utils.ru;
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

/* loaded from: classes.dex */
public class emc implements com.bytedance.sdk.component.bw.dg<xq> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // com.bytedance.sdk.component.bw.dg
    /* renamed from: ypw, reason: merged with bridge method [inline-methods] */
    public xq<byte[]> emc(bw bwVar) throws Throwable {
        Closeable closeable;
        InputStream inputStream;
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream;
        String message;
        Closeable closeable2;
        HttpURLConnection httpURLConnection;
        InputStream inputStream2 = null;
        Map<String, String> mapEmc = null;
        int i10 = 0;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(bwVar.emc()).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
            } catch (MalformedURLException e10) {
                e = e10;
                inputStream = null;
                byteArray = null;
            } catch (IOException e11) {
                e = e11;
                inputStream = null;
                byteArray = null;
            } catch (Throwable th) {
                th = th;
                closeable = null;
                ru.emc(inputStream2);
                ru.emc(closeable);
                throw th;
            }
            try {
                byte[] bArr = new byte[1024];
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int i11 = inputStream.read(bArr);
                        if (i11 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i11);
                    } catch (MalformedURLException e12) {
                        e = e12;
                        byteArray = null;
                    } catch (IOException e13) {
                        e = e13;
                        byteArray = null;
                    }
                }
                i10 = 200;
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (MalformedURLException e14) {
                e = e14;
                byteArray = null;
                byteArrayOutputStream = byteArray;
                Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                ru.emc(inputStream);
                ru.emc(closeable2);
                return new xq<>(i10, byteArray, message, mapEmc);
            } catch (IOException e15) {
                e = e15;
                byteArray = null;
                byteArrayOutputStream = byteArray;
                Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                ru.emc(inputStream);
                ru.emc(closeable2);
                return new xq<>(i10, byteArray, message, mapEmc);
            } catch (Throwable th2) {
                th = th2;
                closeable = null;
                inputStream2 = inputStream;
                ru.emc(inputStream2);
                ru.emc(closeable);
                throw th;
            }
            try {
                mapEmc = bwVar.ypw() ? emc(httpURLConnection) : null;
                ru.emc(inputStream);
                ru.emc(byteArrayOutputStream);
                message = "success";
            } catch (MalformedURLException e16) {
                e = e16;
                Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                ru.emc(inputStream);
                ru.emc(closeable2);
                return new xq<>(i10, byteArray, message, mapEmc);
            } catch (IOException e17) {
                e = e17;
                Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                ru.emc(inputStream);
                ru.emc(closeable2);
                return new xq<>(i10, byteArray, message, mapEmc);
            }
            return new xq<>(i10, byteArray, message, mapEmc);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private Map<String, String> emc(HttpURLConnection httpURLConnection) {
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
