package com.instagram.common.viewpoint.core;

import android.util.Log;
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
public abstract class AbstractC0808Ct implements InterfaceC1780gA {
    public static byte[] A01;
    public final InterfaceC1781gB A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{108, -114, -114, -112, -101, -97, 88, 110, -109, -116, -99, -98, -112, -97, -42, -11, 7, -3, -9, -26, -7, 5, 9, -7, 7, 8, -36, -11, 2, -8, 0, -7, 6, -62, 3, 2, -39, 6, 6, 3, 6, -126, -82, -83, -77, -92, -83, -77, 108, -109, -72, -81, -92, -126, -127, 115, 90, 101};
    }

    public AbstractC0808Ct(InterfaceC1781gB interfaceC1781gB) {
        this.A00 = interfaceC1781gB;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1780gA
    public final boolean ADs(C1778g8 c1778g8) {
        InterfaceC1764fu interfaceC1764fuA00 = c1778g8.A00();
        if (this.A00.AAZ()) {
            Log.e(AbstractC0808Ct.class.getSimpleName(), A00(14, 27, 123), c1778g8);
        }
        if (interfaceC1764fuA00 != null && interfaceC1764fuA00.A9C() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1780gA
    public final HttpURLConnection AGl(String str, Proxy proxy) throws IOException {
        URL url = new URL(str);
        if (proxy == null) {
            return (HttpURLConnection) url.openConnection();
        }
        return (HttpURLConnection) url.openConnection(proxy);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1780gA
    public final InputStream AGm(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getInputStream();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1780gA
    public final OutputStream AGn(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1780gA
    public final void AH6(HttpURLConnection httpURLConnection, EnumC1776g6 enumC1776g6, String str) throws IOException {
        httpURLConnection.setRequestMethod(enumC1776g6.A03());
        httpURLConnection.setDoOutput(enumC1776g6.A05());
        httpURLConnection.setDoInput(enumC1776g6.A04());
        if (str != null) {
            httpURLConnection.setRequestProperty(A00(41, 12, 38), str);
        }
        httpURLConnection.setRequestProperty(A00(0, 14, 18), A00(53, 5, 20));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1780gA
    public final byte[] AHT(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[16384];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 != -1) {
                byteArrayOutputStream.write(bArr, 0, i10);
            } else {
                byteArrayOutputStream.flush();
                byte[] data = byteArrayOutputStream.toByteArray();
                return data;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1780gA
    public final void AL8(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(bArr);
    }
}
