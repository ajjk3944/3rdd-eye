package com.mbridge.msdk.click;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class n {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicInteger f12986d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.setting.g f12987a;

    /* renamed from: b, reason: collision with root package name */
    private String f12988b;

    /* renamed from: c, reason: collision with root package name */
    private int f12989c = 9377;

    public n() {
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        this.f12987a = gVarD;
        if (gVarD == null) {
            this.f12987a = com.mbridge.msdk.setting.h.b().a();
        }
    }

    private JSONObject b(String str, CampaignEx campaignEx, boolean z10, boolean z11) {
        JSONObject jSONObject = new JSONObject();
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String host = uri.getHost();
                String path = uri.getPath();
                String encodedQuery = uri.getEncodedQuery();
                this.f12988b = host;
                jSONObject.put("uri", "https://" + host + path);
                jSONObject.put("data", encodedQuery);
            }
        } catch (Throwable th) {
            q0.b("SocketSpider", th.getMessage());
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (!z10 && !z11) {
                jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, m0.i());
            }
            if (campaignEx != null) {
                if (z10 && campaignEx.getcUA() == 1) {
                    jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, m0.i());
                }
                if (z11 && campaignEx.getImpUA() == 1) {
                    jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, m0.i());
                }
            } else {
                jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, m0.i());
            }
            jSONObject2.put("Accept-Encoding", "gzip");
            if (this.f12987a.M0() && !TextUtils.isEmpty(str)) {
                jSONObject2.put("referer", str);
            }
            jSONObject.put("header", jSONObject2);
        } catch (Throwable th2) {
            q0.b("SocketSpider", th2.getMessage());
        }
        return jSONObject;
    }

    public com.mbridge.msdk.click.entity.a a(String str, CampaignEx campaignEx, boolean z10, boolean z11) {
        com.mbridge.msdk.click.entity.a aVar = new com.mbridge.msdk.click.entity.a();
        aVar.f12948g = str;
        if (TextUtils.isEmpty(str)) {
            aVar.f12949h = "request url can not null.";
            return aVar;
        }
        String strReplace = str.replace(" ", "%20");
        JSONObject jSONObjectB = b(strReplace, campaignEx, z10, z11);
        if (jSONObjectB.length() == 0) {
            aVar.f12949h = "request content generation failed.";
            return aVar;
        }
        if (TextUtils.isEmpty(jSONObjectB.optString("uri"))) {
            aVar.f12949h = "request url parse error.";
            return aVar;
        }
        if (campaignEx != null) {
            int trackingTcpPort = campaignEx.getTrackingTcpPort();
            if (trackingTcpPort == 0) {
                trackingTcpPort = 9377;
            }
            this.f12989c = trackingTcpPort;
        }
        if (!TextUtils.isEmpty(this.f12988b)) {
            return a(strReplace, jSONObjectB.toString());
        }
        aVar.f12949h = "request url parse error.";
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.mbridge.msdk.click.entity.a a(String str, String str2) throws IOException {
        OutputStream outputStream;
        Socket socket;
        int length;
        InputStream inputStream;
        int i10;
        boolean z10;
        byte b10;
        byte[] bArr;
        String str3;
        com.mbridge.msdk.click.entity.a aVar = new com.mbridge.msdk.click.entity.a();
        Socket socket2 = null;
        OutputStream outputStream2 = null;
        try {
            socket = new Socket(this.f12988b, this.f12989c);
        } catch (Throwable th) {
            th = th;
            outputStream = null;
        }
        try {
            socket.setSoTimeout(DefaultLoadControl.DEFAULT_MIN_BUFFER_MS);
            outputStream2 = socket.getOutputStream();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[8]);
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            byteBufferWrap.order(byteOrder);
            byteBufferWrap.put((byte) 2);
            byteBufferWrap.put((byte) 3);
            byteBufferWrap.putShort((short) f12986d.getAndIncrement());
            if (TextUtils.isEmpty(str2)) {
                byteBufferWrap.putInt(0);
                outputStream2.write(byteBufferWrap.array());
                length = 0;
            } else {
                byte[] bArrA = a(str2);
                length = bArrA.length;
                byteBufferWrap.putInt(length);
                outputStream2.write(byteBufferWrap.array());
                outputStream2.write(bArrA);
            }
            outputStream2.flush();
            q0.a("SocketSpider", "Socket Request : header : " + Arrays.toString(byteBufferWrap.array()) + " length : " + length);
            inputStream = socket.getInputStream();
            byte[] bArr2 = new byte[8];
            inputStream.read(bArr2, 0, 8);
            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr2);
            byteBufferWrap2.order(byteOrder);
            i10 = byteBufferWrap2.getInt(4);
            byte b11 = bArr2[1];
            z10 = b11 == 3;
            b10 = b11 == 2;
            q0.b("SocketSpider", "Socket Response : header : " + Arrays.toString(bArr2) + " length : " + i10 + " isGzip : " + z10);
            bArr = new byte[i10];
            new DataInputStream(socket.getInputStream()).readFully(bArr);
            if (!z10 && i10 > 2 && ((bArr[0] << 8) | (bArr[1] & 255)) == 8075) {
                z10 = true;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStream = outputStream2;
            socket2 = socket;
            try {
                q0.a("SocketSpider", "Socket exception: " + th.getMessage());
                aVar.f12949h = th.getMessage();
                if (socket2 != null) {
                    try {
                        socket2.close();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                    } catch (Exception e10) {
                        q0.b("SocketSpider", e10.getMessage());
                    }
                }
                return aVar;
            } finally {
            }
        }
        if (b10 == true && i10 == 0) {
            aVar.f12947f = 200;
            aVar.f12948g = str;
            aVar.f12946e = 0;
            try {
                socket.close();
                outputStream2.close();
                return aVar;
            } catch (Exception e11) {
                q0.b("SocketSpider", e11.getMessage());
                return aVar;
            }
        }
        if (i10 < 1) {
            aVar.f12947f = 200;
            aVar.f12948g = str;
            aVar.f12946e = 0;
            try {
                socket.close();
                outputStream2.close();
                return aVar;
            } catch (Exception e12) {
                q0.b("SocketSpider", e12.getMessage());
                return aVar;
            }
        }
        try {
            if (z10) {
                str3 = a(bArr);
            } else {
                str3 = new String(bArr);
            }
        } catch (Throwable th3) {
            q0.b("SocketSpider", th3.getMessage());
            aVar.f12949h = th3.getMessage();
        }
        if (!TextUtils.isEmpty(str3)) {
            aVar.f12947f = 200;
            aVar.f12948g = str;
            aVar.f12946e = 0;
            try {
                JSONObject jSONObjectOptJSONObject = new JSONObject(str3).optJSONObject("data");
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("location");
                    if (!TextUtils.isEmpty(strOptString)) {
                        aVar.f12947f = Sdk$SDKError.Reason.INVALID_IFA_STATUS_VALUE;
                        aVar.f12942a = strOptString;
                    }
                }
            } catch (Throwable th4) {
                q0.b("SocketSpider", th4.getMessage());
            }
            try {
                socket.close();
                outputStream2.close();
            } catch (Exception e13) {
                q0.b("SocketSpider", e13.getMessage());
            }
        } else {
            inputStream.close();
            try {
                socket.close();
                outputStream2.close();
            } catch (Exception e14) {
                q0.b("SocketSpider", e14.getMessage());
            }
        }
        return aVar;
    }

    public byte[] a(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public String a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i10 = gZIPInputStream.read(bArr2, 0, 1024);
            if (i10 > 0) {
                byteArrayOutputStream.write(bArr2, 0, i10);
            } else {
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toString();
            }
        }
    }
}
