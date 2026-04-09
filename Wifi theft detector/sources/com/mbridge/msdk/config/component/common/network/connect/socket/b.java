package com.mbridge.msdk.config.component.common.network.connect.socket;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.config.component.common.network.listener.EventListenerTCP;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private String f13240a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f13241b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    private boolean f13242c = false;

    /* renamed from: d, reason: collision with root package name */
    private Socket f13243d;

    /* renamed from: e, reason: collision with root package name */
    private OutputStream f13244e;

    /* renamed from: f, reason: collision with root package name */
    private InputStream f13245f;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f13246g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f13247h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f13248i;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.retry.a f13249j;

    /* renamed from: k, reason: collision with root package name */
    private EventListenerTCP f13250k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f13251l;

    /* renamed from: m, reason: collision with root package name */
    private String f13252m;

    public b(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2, com.mbridge.msdk.config.component.common.network.a aVar3) {
        this.f13246g = aVar;
        this.f13248i = aVar3;
        this.f13247h = aVar2;
        this.f13250k = new EventListenerTCP(aVar2.b());
    }

    private void b(String str) throws IOException {
        byte[] bArrA;
        try {
            EventListenerTCP eventListenerTCP = this.f13250k;
            if (eventListenerTCP != null) {
                eventListenerTCP.requestHeadersStart();
            }
            this.f13251l = false;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[8]);
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
            byteBufferWrap.put((byte) 2);
            if (TextUtils.isEmpty(str)) {
                byteBufferWrap.put((byte) 1);
            } else {
                byteBufferWrap.put(this.f13251l ? (byte) 3 : (byte) 2);
            }
            byteBufferWrap.putShort((short) this.f13241b.getAndIncrement());
            if (TextUtils.isEmpty(str)) {
                byteBufferWrap.putInt(0);
                bArrA = null;
            } else {
                bArrA = this.f13251l ? a(str) : str.getBytes();
                byteBufferWrap.putInt(bArrA != null ? bArrA.length : 0);
            }
            this.f13244e.write(byteBufferWrap.array());
            EventListenerTCP eventListenerTCP2 = this.f13250k;
            if (eventListenerTCP2 != null) {
                eventListenerTCP2.requestHeadersEnd();
            }
            if (bArrA != null) {
                EventListenerTCP eventListenerTCP3 = this.f13250k;
                if (eventListenerTCP3 != null) {
                    eventListenerTCP3.requestBodyStart();
                }
                this.f13244e.write(bArrA);
                EventListenerTCP eventListenerTCP4 = this.f13250k;
                if (eventListenerTCP4 != null) {
                    eventListenerTCP4.requestBodyEnd(bArrA.length);
                }
            }
            this.f13244e.flush();
        } catch (IOException e10) {
            q0.b("JavaSocketConnection", "Failed to send request: " + e10.getMessage());
            throw new IOException("Failed to send request: " + e10.getMessage(), e10);
        }
    }

    private com.mbridge.msdk.config.component.common.network.result.a d() {
        try {
            JSONObject jSONObjectG = g();
            f();
            b(jSONObjectG.toString());
            return i();
        } catch (ConnectException e10) {
            return a(1002, 1002, "Connection refused: " + e10.getMessage());
        } catch (SocketTimeoutException e11) {
            return a(1001, 1001, "Connection timeout: " + e11.getMessage());
        } catch (UnknownHostException e12) {
            return a(2001, 2001, "Host unreachable: " + e12.getMessage());
        } catch (IOException e13) {
            return a(2003, 2003, "Network error: " + e13.getMessage());
        } catch (Exception e14) {
            return a(1999, 1999, "Unknown error: " + e14.getMessage());
        }
    }

    private void f() throws IOException {
        try {
            try {
                try {
                    try {
                        EventListenerTCP eventListenerTCP = this.f13250k;
                        if (eventListenerTCP != null) {
                            eventListenerTCP.dnsStart();
                        }
                        this.f13243d = new Socket();
                        InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f13240a, this.f13246g.j());
                        if (inetSocketAddress.isUnresolved()) {
                            throw new IOException("Cannot resolve host: " + this.f13240a);
                        }
                        EventListenerTCP eventListenerTCP2 = this.f13250k;
                        if (eventListenerTCP2 != null) {
                            eventListenerTCP2.dnsEnd(this.f13240a, Arrays.asList(inetSocketAddress.getAddress()));
                        }
                        this.f13243d.setSoTimeout(30000);
                        EventListenerTCP eventListenerTCP3 = this.f13250k;
                        if (eventListenerTCP3 != null) {
                            eventListenerTCP3.connectStart(inetSocketAddress);
                        }
                        this.f13243d.connect(inetSocketAddress, 30000);
                        EventListenerTCP eventListenerTCP4 = this.f13250k;
                        if (eventListenerTCP4 != null) {
                            eventListenerTCP4.connectEnd(inetSocketAddress);
                        }
                        this.f13244e = this.f13243d.getOutputStream();
                        this.f13245f = this.f13243d.getInputStream();
                        q0.a("JavaSocketConnection", "Socket connected to " + this.f13240a + ":");
                        Socket socket = this.f13243d;
                        if (socket == null || !socket.isConnected()) {
                            b();
                        }
                    } catch (SocketTimeoutException e10) {
                        EventListenerTCP eventListenerTCP5 = this.f13250k;
                        if (eventListenerTCP5 != null) {
                            eventListenerTCP5.connectFailed(new InetSocketAddress(this.f13240a, this.f13246g.j()), e10);
                        }
                        throw new IOException("Connection timeout", e10);
                    } catch (UnknownHostException e11) {
                        EventListenerTCP eventListenerTCP6 = this.f13250k;
                        if (eventListenerTCP6 != null) {
                            eventListenerTCP6.connectFailed(new InetSocketAddress(this.f13240a, this.f13246g.j()), e11);
                        }
                        throw new IOException("Host unreachable", e11);
                    }
                } catch (IOException e12) {
                    EventListenerTCP eventListenerTCP7 = this.f13250k;
                    if (eventListenerTCP7 != null) {
                        eventListenerTCP7.connectFailed(new InetSocketAddress(this.f13240a, this.f13246g.j()), e12);
                    }
                    throw new IOException("Connection failed", e12);
                }
            } catch (ConnectException e13) {
                EventListenerTCP eventListenerTCP8 = this.f13250k;
                if (eventListenerTCP8 != null) {
                    eventListenerTCP8.connectFailed(new InetSocketAddress(this.f13240a, this.f13246g.j()), e13);
                }
                throw new IOException("Connection refused", e13);
            }
        } catch (Throwable th) {
            Socket socket2 = this.f13243d;
            if (socket2 == null || !socket2.isConnected()) {
                b();
            }
            throw th;
        }
    }

    private JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            this.f13240a = com.mbridge.msdk.foundation.same.net.utils.d.h().f15177m;
            int iJ = this.f13246g.j();
            Map<String, Object> mapB = this.f13246g.b();
            JSONObject jSONObject2 = new JSONObject();
            if (mapB != null) {
                for (Map.Entry<String, Object> entry : mapB.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            }
            jSONObject.put("headers", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("host", this.f13240a);
            jSONObject3.put("port", iJ);
            Map<String, Object> mapA = this.f13246g.a();
            if (mapA != null) {
                JSONObject jSONObject4 = new JSONObject();
                for (Map.Entry<String, Object> entry2 : mapA.entrySet()) {
                    jSONObject4.put(entry2.getKey(), entry2.getValue());
                }
                jSONObject3.put("data", jSONObject4);
            }
            jSONObject.put(TtmlNode.TAG_BODY, jSONObject3);
            return jSONObject;
        } catch (Exception e10) {
            q0.b("JavaSocketConnection", "Failed to prepare request content: " + e10.getMessage());
            return jSONObject;
        }
    }

    private void h() {
        if (this.f13248i == null) {
            return;
        }
        EventListenerTCP eventListenerTCP = this.f13250k;
        if (eventListenerTCP != null) {
            eventListenerTCP.callEnd();
        }
        if (com.mbridge.msdk.config.component.common.util.c.a(this.f13247h.g())) {
            this.f13248i.b(this.f13247h);
            return;
        }
        if (this.f13247h.g() == 200) {
            this.f13248i.c(this.f13247h);
            com.mbridge.msdk.config.component.common.network.retry.a aVar = this.f13249j;
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        com.mbridge.msdk.config.component.common.network.retry.a aVar2 = this.f13249j;
        if (aVar2 != null) {
            aVar2.b();
        } else if (this.f13246g.g() > 0) {
            new com.mbridge.msdk.config.component.common.network.retry.c(this.f13252m, this.f13246g, this.f13248i, this.f13247h).c();
        } else {
            this.f13248i.d(this.f13247h);
        }
    }

    private com.mbridge.msdk.config.component.common.network.result.a i() throws IOException {
        try {
            EventListenerTCP eventListenerTCP = this.f13250k;
            if (eventListenerTCP != null) {
                eventListenerTCP.responseHeadersStart();
            }
            byte[] bArr = new byte[8];
            if (this.f13245f.read(bArr) != 8) {
                return a(1008, 1008, "Failed to read response header");
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
            if (byteBufferWrap.get() != 2) {
                return a(1008, 1008, "Invalid protocol version");
            }
            byte b10 = byteBufferWrap.get();
            byteBufferWrap.getShort();
            int i10 = byteBufferWrap.getInt();
            EventListenerTCP eventListenerTCP2 = this.f13250k;
            if (eventListenerTCP2 != null) {
                eventListenerTCP2.responseHeadersEnd();
            }
            if (i10 > 0) {
                EventListenerTCP eventListenerTCP3 = this.f13250k;
                if (eventListenerTCP3 != null) {
                    eventListenerTCP3.responseBodyStart();
                }
                boolean z10 = false;
                boolean z11 = b10 == 3;
                byte[] bArr2 = new byte[i10];
                new DataInputStream(this.f13245f).readFully(bArr2);
                if (i10 > 2) {
                    if (((bArr2[0] << 8) | (bArr2[1] & 255)) == 8075) {
                        z10 = true;
                    }
                }
                try {
                    this.f13247h.b((z11 && z10) ? a(bArr2) : new String(bArr2));
                    this.f13247h.c(200);
                    this.f13247h.b(1);
                    EventListenerTCP eventListenerTCP4 = this.f13250k;
                    if (eventListenerTCP4 != null) {
                        eventListenerTCP4.responseBodyEnd(i10);
                    }
                } catch (Exception e10) {
                    return a(TTAdConstant.IMAGE_MODE_1010, TTAdConstant.IMAGE_MODE_1010, "Failed to process response data: " + e10.getMessage());
                }
            } else {
                this.f13247h.c(200);
                this.f13247h.b(1);
            }
            return this.f13247h;
        } catch (SocketTimeoutException e11) {
            return a(1004, 1004, "Read timeout: " + e11.getMessage());
        } catch (IOException e12) {
            return a(1006, 1006, "Failed to read response: " + e12.getMessage());
        } catch (Exception e13) {
            return a(1999, 1999, "Unknown error while processing response: " + e13.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.a aVar) {
        this.f13249j = aVar;
    }

    public void c(String str) {
        this.f13252m = str;
    }

    public EventListenerTCP e() {
        return this.f13250k;
    }

    @Override // java.lang.Runnable
    public void run() {
        c();
    }

    private void c() {
        this.f13247h = d();
        if (this.f13242c) {
            a(1999, 1999, "Request cancelled");
        }
        h();
    }

    public void a() {
        this.f13242c = true;
        b();
    }

    private byte[] a(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    private String a(byte[] bArr) throws IOException {
        if (bArr != null && bArr.length != 0) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int i10 = gZIPInputStream.read(bArr2);
                    if (i10 > 0) {
                        byteArrayOutputStream.write(bArr2, 0, i10);
                    } else {
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        byteArrayOutputStream.close();
                        return byteArrayOutputStream.toString();
                    }
                }
            } catch (IOException e10) {
                q0.b("JavaSocketConnection", "Failed to decompress GZIP data: " + e10.getMessage());
                throw e10;
            }
        } else {
            return "";
        }
    }

    private com.mbridge.msdk.config.component.common.network.result.a a(int i10, int i11, String str) {
        this.f13247h.a(str);
        this.f13247h.c(i10);
        this.f13247h.a(i11);
        this.f13247h.b(2);
        EventListenerTCP eventListenerTCP = this.f13250k;
        if (eventListenerTCP != null) {
            eventListenerTCP.callFailed(new IOException(str));
        }
        return this.f13247h;
    }

    private void b() {
        OutputStream outputStream = this.f13244e;
        try {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e10) {
                    q0.b("JavaSocketConnection", "Error closing output stream: " + e10.getMessage());
                }
            }
            InputStream inputStream = this.f13245f;
            try {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e11) {
                        q0.b("JavaSocketConnection", "Error closing input stream: " + e11.getMessage());
                    }
                }
                Socket socket = this.f13243d;
                if (socket != null) {
                    try {
                        try {
                            socket.close();
                        } finally {
                            this.f13243d = null;
                        }
                    } catch (IOException e12) {
                        q0.b("JavaSocketConnection", "Error closing socket: " + e12.getMessage());
                    }
                }
                q0.a("JavaSocketConnection", "All resources closed");
            } finally {
                this.f13245f = null;
            }
        } finally {
            this.f13244e = null;
        }
    }
}
