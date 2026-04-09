package com.instagram.common.viewpoint.core;

import android.util.Log;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ct, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0430Ct implements InterfaceC1402gA {
    public static byte[] A01;
    public final InterfaceC1403gB A00;

    static {
        A01();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{108, -114, -114, -112, -101, -97, 88, 110, -109, -116, -99, -98, -112, -97, -42, -11, 7, -3, -9, -26, -7, 5, 9, -7, 7, 8, -36, -11, 2, -8, 0, -7, 6, -62, 3, 2, -39, 6, 6, 3, 6, -126, -82, -83, -77, -92, -83, -77, 108, -109, -72, -81, -92, -126, -127, 115, 90, 101};
    }

    public AbstractC0430Ct(InterfaceC1403gB interfaceC1403gB) {
        this.A00 = interfaceC1403gB;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1402gA
    public final boolean ADs(C1400g8 c1400g8) {
        InterfaceC1386fu interfaceC1386fuA00 = c1400g8.A00();
        if (this.A00.AAZ()) {
            Log.e(AbstractC0430Ct.class.getSimpleName(), A00(14, 27, 123), c1400g8);
        }
        if (interfaceC1386fuA00 != null && interfaceC1386fuA00.A9C() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1402gA
    public final HttpURLConnection AGl(String str, Proxy proxy) throws IOException {
        URL url = new URL(str);
        if (proxy == null) {
            return (HttpURLConnection) url.openConnection();
        }
        return (HttpURLConnection) url.openConnection(proxy);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1402gA
    public final InputStream AGm(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getInputStream();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1402gA
    public final OutputStream AGn(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1402gA
    public final void AH6(HttpURLConnection httpURLConnection, EnumC1398g6 enumC1398g6, String str) throws IOException {
        httpURLConnection.setRequestMethod(enumC1398g6.A03());
        httpURLConnection.setDoOutput(enumC1398g6.A05());
        httpURLConnection.setDoInput(enumC1398g6.A04());
        if (str != null) {
            httpURLConnection.setRequestProperty(A00(41, 12, 38), str);
        }
        httpURLConnection.setRequestProperty(A00(0, 14, 18), A00(53, 5, 20));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1402gA
    public final byte[] AHT(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i4 = inputStream.read(bArr);
            if (i4 != -1) {
                byteArrayOutputStream.write(bArr, 0, i4);
            } else {
                byteArrayOutputStream.flush();
                byte[] data = byteArrayOutputStream.toByteArray();
                return data;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1402gA
    public final void AL8(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(bArr);
    }
}
