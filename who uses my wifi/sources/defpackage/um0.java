package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class um0 extends ja {
    public final /* synthetic */ int f;
    public int g;

    @Override // defpackage.xp0
    public void a() throws IOException {
        switch (this.f) {
            case 0:
                i("dns.server", "dns.search", "dns.ndots");
                break;
            default:
                h();
                if (!k("/etc/resolv.conf")) {
                    k("sys:/etc/resolv.cfg");
                    break;
                }
                break;
        }
    }

    @Override // defpackage.xp0
    public final int b() {
        switch (this.f) {
        }
        return this.g;
    }

    public void i(String str, String str2, String str3) {
        h();
        String property = System.getProperty(str);
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ",");
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                try {
                    URI uri = new URI("dns://" + strNextToken);
                    int i = 53;
                    if (uri.getHost() == null) {
                        e(new InetSocketAddress(strNextToken, 53));
                    } else {
                        int port = uri.getPort();
                        if (port != -1) {
                            i = port;
                        }
                        e(new InetSocketAddress(uri.getHost(), i));
                    }
                } catch (URISyntaxException unused) {
                    this.b.m(strNextToken, "Ignored invalid server {}");
                }
            }
        }
        String property2 = System.getProperty(str2);
        if (property2 != null) {
            StringTokenizer stringTokenizer2 = new StringTokenizer(property2, ",");
            while (stringTokenizer2.hasMoreTokens()) {
                f(stringTokenizer2.nextToken());
            }
        }
        this.g = ja.g(System.getProperty(str3));
    }

    @Override // defpackage.xp0
    public boolean isEnabled() {
        switch (this.f) {
            case 1:
                return (System.getProperty("os.name").contains("Windows") || System.getProperty("java.specification.vendor").toLowerCase().contains("android")) ? false : true;
            default:
                return super.isEnabled();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void j(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        try {
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    ArrayList arrayList = this.c;
                    if (line == null) {
                        bufferedReader.close();
                        inputStreamReader.close();
                        String str = System.getenv("LOCALDOMAIN");
                        if (str != null && !str.isEmpty()) {
                            arrayList.clear();
                            StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
                            while (stringTokenizer.hasMoreTokens()) {
                                f(stringTokenizer.nextToken());
                            }
                        }
                        String str2 = System.getenv("RES_OPTIONS");
                        if (str2 == null || str2.isEmpty()) {
                            return;
                        }
                        StringTokenizer stringTokenizer2 = new StringTokenizer(str2, " ");
                        while (stringTokenizer2.hasMoreTokens()) {
                            String strNextToken = stringTokenizer2.nextToken();
                            if (strNextToken.startsWith("ndots:")) {
                                this.g = ja.g(strNextToken.substring(6));
                            }
                        }
                        return;
                    }
                    StringTokenizer stringTokenizer3 = new StringTokenizer(line);
                    if (stringTokenizer3.hasMoreTokens()) {
                        String strNextToken2 = stringTokenizer3.nextToken();
                        switch (strNextToken2.hashCode()) {
                            case -1326197564:
                                if (!strNextToken2.equals("domain")) {
                                    break;
                                } else {
                                    arrayList.clear();
                                    if (!stringTokenizer3.hasMoreTokens()) {
                                        break;
                                    } else {
                                        f(stringTokenizer3.nextToken());
                                        break;
                                    }
                                }
                            case -1249474914:
                                if (!strNextToken2.equals("options")) {
                                    break;
                                } else {
                                    while (stringTokenizer3.hasMoreTokens()) {
                                        String strNextToken3 = stringTokenizer3.nextToken();
                                        if (strNextToken3.startsWith("ndots:")) {
                                            this.g = ja.g(strNextToken3.substring(6));
                                        }
                                    }
                                    break;
                                }
                            case -906336856:
                                if (!strNextToken2.equals("search")) {
                                    break;
                                } else {
                                    arrayList.clear();
                                    while (stringTokenizer3.hasMoreTokens()) {
                                        f(stringTokenizer3.nextToken());
                                    }
                                    break;
                                }
                            case 154424718:
                                if (!strNextToken2.equals("nameserver")) {
                                    break;
                                } else {
                                    e(new InetSocketAddress(stringTokenizer3.nextToken(), 53));
                                    break;
                                }
                        }
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                inputStreamReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public boolean k(String str) throws IOException {
        Path path = Paths.get(str, new String[0]);
        if (Files.exists(path, new LinkOption[0])) {
            try {
                InputStream inputStreamNewInputStream = Files.newInputStream(path, new OpenOption[0]);
                try {
                    j(inputStreamNewInputStream);
                    if (inputStreamNewInputStream != null) {
                        inputStreamNewInputStream.close();
                    }
                    return true;
                } finally {
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }
}
