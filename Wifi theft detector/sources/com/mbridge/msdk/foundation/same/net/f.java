package com.mbridge.msdk.foundation.same.net;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static volatile AtomicInteger f15129b = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    private ThreadPoolExecutor f15130a;

    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("SocketThreadPool");
            return threadNewThread;
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f15132a;

        public b(c cVar) {
            this.f15132a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            this.f15132a.a();
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private static f f15143a = new f(null);
    }

    public /* synthetic */ f(a aVar) {
        this();
    }

    public static f b() {
        return d.f15143a;
    }

    private f() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
        this.f15130a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
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

    public void a(String str, int i10, String str2, boolean z10, com.mbridge.msdk.foundation.same.net.b bVar, boolean z11) {
        if (z11) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                jSONObject.put("data", "p=" + URLEncoder.encode(v0.b(jSONObject.optString("data"), "ebmclXzZOhtU2sRlZxGL8A"), C.UTF8_NAME));
                str2 = jSONObject.toString();
            } catch (Exception e10) {
                q0.b("SocketManager", "send error", e10);
            }
        }
        this.f15130a.execute(new b(new c(str, i10, str2, z10, bVar)));
    }

    public class c {

        /* renamed from: a, reason: collision with root package name */
        private ByteBuffer f15134a;

        /* renamed from: b, reason: collision with root package name */
        private String f15135b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f15136c;

        /* renamed from: d, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.net.b f15137d;

        /* renamed from: e, reason: collision with root package name */
        private OutputStream f15138e;

        /* renamed from: f, reason: collision with root package name */
        private int f15139f;

        /* renamed from: g, reason: collision with root package name */
        private Socket f15140g;

        /* renamed from: h, reason: collision with root package name */
        private String f15141h;

        public c(String str, int i10, String str2, boolean z10, com.mbridge.msdk.foundation.same.net.b bVar) {
            this.f15135b = str;
            this.f15139f = i10;
            this.f15141h = str2;
            this.f15136c = z10;
            this.f15137d = bVar;
        }

        /* JADX WARN: Finally extract failed */
        public void a() throws IOException {
            int length;
            try {
                Socket socket = new Socket(this.f15135b, this.f15139f);
                this.f15140g = socket;
                socket.setSoTimeout(DefaultLoadControl.DEFAULT_MIN_BUFFER_MS);
                boolean z10 = this.f15135b.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f15174j) || this.f15135b.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().f15176l);
                q0.b("SocketManager", "Socket connect : " + this.f15135b + " : " + this.f15139f + " isAnalytics : " + z10);
                this.f15138e = this.f15140g.getOutputStream();
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[8]);
                this.f15134a = byteBufferWrap;
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                byteBufferWrap.order(byteOrder);
                this.f15134a.put((byte) 2);
                if (TextUtils.isEmpty(this.f15141h)) {
                    this.f15134a.put((byte) 1);
                } else {
                    this.f15134a.put(this.f15136c ? (byte) 3 : (byte) 2);
                }
                this.f15134a.putShort((short) f.f15129b.getAndIncrement());
                if (TextUtils.isEmpty(this.f15141h)) {
                    this.f15134a.putInt(0);
                    this.f15138e.write(this.f15134a.array());
                    length = 0;
                } else {
                    byte[] bArrA = this.f15136c ? f.this.a(this.f15141h) : this.f15141h.getBytes();
                    length = bArrA.length;
                    this.f15134a.putInt(length);
                    this.f15138e.write(this.f15134a.array());
                    this.f15138e.write(bArrA);
                }
                this.f15138e.flush();
                q0.a("SocketManager", "Socket Request : header : " + Arrays.toString(this.f15134a.array()) + " length : " + length);
                InputStream inputStream = this.f15140g.getInputStream();
                byte[] bArr = new byte[8];
                inputStream.read(bArr, 0, 8);
                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr);
                this.f15134a = byteBufferWrap2;
                byteBufferWrap2.order(byteOrder);
                int i10 = this.f15134a.getInt(4);
                byte b10 = bArr[1];
                boolean z11 = b10 == 3;
                boolean z12 = b10 == 2;
                q0.b("SocketManager", "Socket Response : header : " + Arrays.toString(bArr) + " length : " + i10 + " isGzip : " + z11);
                byte[] bArr2 = new byte[i10];
                new DataInputStream(this.f15140g.getInputStream()).readFully(bArr2);
                if (!z11 && i10 > 2 && ((bArr2[0] << 8) | (bArr2[1] & 255)) == 8075) {
                    z11 = true;
                }
                com.mbridge.msdk.foundation.same.net.b bVar = this.f15137d;
                if (bVar == null) {
                    Socket socket2 = this.f15140g;
                    if (socket2 != null) {
                        try {
                            socket2.close();
                            this.f15134a = null;
                            this.f15138e.close();
                            return;
                        } catch (IOException e10) {
                            q0.b("SocketManager", e10.getMessage());
                            return;
                        }
                    }
                    return;
                }
                if (z12 && i10 == 0) {
                    bVar.onSuccess(e.a(null, new com.mbridge.msdk.foundation.same.net.toolbox.a(204, null, null)));
                    Socket socket3 = this.f15140g;
                    if (socket3 != null) {
                        try {
                            socket3.close();
                            this.f15134a = null;
                            this.f15138e.close();
                            return;
                        } catch (IOException e11) {
                            q0.b("SocketManager", e11.getMessage());
                            return;
                        }
                    }
                    return;
                }
                if (i10 < 1) {
                    a("The response data less than 1");
                    Socket socket4 = this.f15140g;
                    if (socket4 != null) {
                        try {
                            socket4.close();
                            this.f15134a = null;
                            this.f15138e.close();
                            return;
                        } catch (IOException e12) {
                            q0.b("SocketManager", e12.getMessage());
                            return;
                        }
                    }
                    return;
                }
                if (z10) {
                    if (bArr2[0] == 1) {
                        bVar.onSuccess(e.a(null, new com.mbridge.msdk.foundation.same.net.toolbox.a(200, null, null)));
                    } else {
                        a("The server returns fail");
                    }
                    Socket socket5 = this.f15140g;
                    if (socket5 != null) {
                        try {
                            socket5.close();
                            this.f15134a = null;
                            this.f15138e.close();
                            return;
                        } catch (IOException e13) {
                            q0.b("SocketManager", e13.getMessage());
                            return;
                        }
                    }
                    return;
                }
                try {
                    String strA = z11 ? f.this.a(bArr2) : new String(bArr2);
                    JSONObject jSONObject = !TextUtils.isEmpty(strA) ? new JSONObject(strA) : null;
                    q0.b("SocketManager", "Socket Response length : " + i10 + " " + strA.length());
                    this.f15137d.onSuccess(e.a(jSONObject, new com.mbridge.msdk.foundation.same.net.toolbox.a(200, null, null)));
                } catch (Throwable th) {
                    String message = th.getMessage();
                    q0.b("SocketManager", th.getMessage());
                    if (TextUtils.isEmpty(message)) {
                        message = "The JSON data is illegal";
                    }
                    a(message);
                }
                inputStream.close();
                Socket socket6 = this.f15140g;
                if (socket6 != null) {
                    try {
                        socket6.close();
                        this.f15134a = null;
                        this.f15138e.close();
                    } catch (IOException e14) {
                        q0.b("SocketManager", e14.getMessage());
                    }
                }
            } catch (Throwable th2) {
                try {
                    String message2 = th2.getMessage();
                    q0.a("SocketManager", "Socket exception: " + message2);
                    a(message2);
                    Socket socket7 = this.f15140g;
                    if (socket7 != null) {
                        try {
                            socket7.close();
                            this.f15134a = null;
                            this.f15138e.close();
                        } catch (IOException e15) {
                            q0.b("SocketManager", e15.getMessage());
                        }
                    }
                } catch (Throwable th3) {
                    Socket socket8 = this.f15140g;
                    if (socket8 != null) {
                        try {
                            socket8.close();
                            this.f15134a = null;
                            this.f15138e.close();
                        } catch (IOException e16) {
                            q0.b("SocketManager", e16.getMessage());
                        }
                    }
                    throw th3;
                }
            }
        }

        private void a(String str) {
            if (this.f15137d != null) {
                if (TextUtils.isEmpty(str)) {
                    str = "Unknown exception";
                }
                this.f15137d.onError(new com.mbridge.msdk.foundation.same.net.exception.a(13, new com.mbridge.msdk.foundation.same.net.toolbox.a(TTAdConstant.DEEPLINK_FALLBACK_CODE, str.getBytes(), null)));
            }
        }
    }
}
