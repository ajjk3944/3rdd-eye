package j8;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.SocketFactory;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public Socket f21779a;

    /* renamed from: b, reason: collision with root package name */
    public InputStream f21780b;

    /* renamed from: c, reason: collision with root package name */
    public OutputStream f21781c;

    /* renamed from: d, reason: collision with root package name */
    public int f21782d = -1;

    /* renamed from: e, reason: collision with root package name */
    public transient char[] f21783e = new char[1024];

    public static void b(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final void a() throws IOException {
        Socket socket = this.f21779a;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
        b(this.f21780b);
        b(this.f21781c);
        this.f21779a = null;
        this.f21780b = null;
        this.f21781c = null;
    }

    public final void c(String str, int i10) throws IOException {
        try {
            InetAddress byName = InetAddress.getByName(str);
            Socket socketCreateSocket = SocketFactory.getDefault().createSocket();
            this.f21779a = socketCreateSocket;
            if (i10 != -1) {
                socketCreateSocket.setReceiveBufferSize(i10);
            }
            int i11 = this.f21782d;
            if (i11 != -1) {
                this.f21779a.setSendBufferSize(i11);
            }
            this.f21779a.connect(new InetSocketAddress(byName, 43), 0);
            this.f21779a.setSoTimeout(0);
            this.f21780b = this.f21779a.getInputStream();
            this.f21781c = this.f21779a.getOutputStream();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.String] */
    public final String d(boolean z10, String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        try {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(str);
            sb2.append("\r\n");
            byte[] bytes = sb2.toString().getBytes();
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(this.f21781c, 1024));
            dataOutputStream.write(bytes, 0, bytes.length);
            dataOutputStream.flush();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f21780b));
            while (true) {
                char[] cArr = this.f21783e;
                int i10 = bufferedReader.read(cArr, 0, cArr.length);
                if (i10 <= 0) {
                    bufferedReader.close();
                    sb = sb.toString();
                    return sb;
                }
                sb.append(this.f21783e, 0, i10);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return sb.toString();
        }
    }
}
