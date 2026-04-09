package mj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import org.eclipse.paho.client.mqttv3.internal.websocket.HandshakeFailedException;

/* renamed from: mj.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6847d {

    /* renamed from: a, reason: collision with root package name */
    InputStream f54052a;

    /* renamed from: b, reason: collision with root package name */
    OutputStream f54053b;

    /* renamed from: c, reason: collision with root package name */
    String f54054c;

    /* renamed from: d, reason: collision with root package name */
    String f54055d;

    /* renamed from: e, reason: collision with root package name */
    int f54056e;

    /* renamed from: f, reason: collision with root package name */
    Properties f54057f;

    public C6847d(InputStream inputStream, OutputStream outputStream, String str, String str2, int i10, Properties properties) {
        this.f54052a = inputStream;
        this.f54053b = outputStream;
        this.f54054c = str;
        this.f54055d = str2;
        this.f54056e = i10;
        this.f54057f = properties;
    }

    private Map b(ArrayList arrayList) {
        HashMap map = new HashMap();
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            String[] strArrSplit = ((String) arrayList.get(i10)).split(":");
            map.put(strArrSplit[0].toLowerCase(), strArrSplit[1]);
        }
        return map;
    }

    private void c(String str) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f54052a));
        ArrayList arrayList = new ArrayList();
        String line = bufferedReader.readLine();
        if (line == null) {
            throw new IOException("WebSocket Response header: Invalid response from Server, It may not support WebSockets.");
        }
        while (!line.equals("")) {
            arrayList.add(line);
            line = bufferedReader.readLine();
        }
        Map mapB = b(arrayList);
        String str2 = (String) mapB.get("connection");
        if (str2 == null || str2.equalsIgnoreCase("upgrade")) {
            throw new IOException("WebSocket Response header: Incorrect connection header");
        }
        String str3 = (String) mapB.get("upgrade");
        if (str3 == null || !str3.toLowerCase().contains("websocket")) {
            throw new IOException("WebSocket Response header: Incorrect upgrade.");
        }
        if (((String) mapB.get("sec-websocket-protocol")) == null) {
            throw new IOException("WebSocket Response header: empty sec-websocket-protocol");
        }
        if (!mapB.containsKey("sec-websocket-accept")) {
            throw new IOException("WebSocket Response header: Missing Sec-WebSocket-Accept");
        }
        try {
            f(str, (String) mapB.get("sec-websocket-accept"));
        } catch (NoSuchAlgorithmException e10) {
            throw new IOException(e10.getMessage());
        } catch (HandshakeFailedException unused) {
            throw new IOException("WebSocket Response header: Incorrect Sec-WebSocket-Key");
        }
    }

    private void d(String str) {
        try {
            String rawPath = "/mqtt";
            URI uri = new URI(this.f54054c);
            if (uri.getRawPath() != null && !uri.getRawPath().isEmpty()) {
                rawPath = uri.getRawPath();
                if (uri.getRawQuery() != null && !uri.getRawQuery().isEmpty()) {
                    rawPath = String.valueOf(rawPath) + "?" + uri.getRawQuery();
                }
            }
            PrintWriter printWriter = new PrintWriter(this.f54053b);
            printWriter.print("GET " + rawPath + " HTTP/1.1\r\n");
            if (this.f54056e != 80) {
                printWriter.print("Host: " + this.f54055d + ":" + this.f54056e + "\r\n");
            } else {
                printWriter.print("Host: " + this.f54055d + "\r\n");
            }
            printWriter.print("Upgrade: websocket\r\n");
            printWriter.print("Connection: Upgrade\r\n");
            printWriter.print("Sec-WebSocket-Key: " + str + "\r\n");
            printWriter.print("Sec-WebSocket-Protocol: mqtt\r\n");
            printWriter.print("Sec-WebSocket-Version: 13\r\n");
            Properties properties = this.f54057f;
            if (properties != null) {
                for (String str2 : properties.keySet()) {
                    printWriter.print(String.valueOf(str2) + ": " + this.f54057f.getProperty(str2) + "\r\n");
                }
            }
            String userInfo = uri.getUserInfo();
            if (userInfo != null) {
                printWriter.print("Authorization: Basic " + C6844a.a(userInfo) + "\r\n");
            }
            printWriter.print("\r\n");
            printWriter.flush();
        } catch (URISyntaxException e10) {
            throw new IllegalStateException(e10.getMessage());
        }
    }

    private byte[] e(String str) {
        return MessageDigest.getInstance("SHA1").digest(str.getBytes());
    }

    private void f(String str, String str2) throws HandshakeFailedException {
        if (!C6844a.b(e(String.valueOf(str) + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")).trim().equals(str2.trim())) {
            throw new HandshakeFailedException();
        }
    }

    public void a() throws IOException {
        byte[] bArr = new byte[16];
        System.arraycopy(UUID.randomUUID().toString().getBytes(), 0, bArr, 0, 16);
        String strB = C6844a.b(bArr);
        d(strB);
        c(strB);
    }
}
