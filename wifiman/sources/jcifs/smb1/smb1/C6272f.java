package jcifs.smb1.smb1;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/* renamed from: jcifs.smb1.smb1.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6272f extends URLStreamHandler {

    /* renamed from: a, reason: collision with root package name */
    static final URLStreamHandler f50558a = new C6272f();

    @Override // java.net.URLStreamHandler
    protected int getDefaultPort() {
        return 445;
    }

    @Override // java.net.URLStreamHandler
    public URLConnection openConnection(URL url) {
        return new M(url);
    }

    @Override // java.net.URLStreamHandler
    protected void parseURL(URL url, String str, int i10, int i11) {
        String host = url.getHost();
        if (str.equals("smb1://")) {
            i11 += 2;
            str = "smb1:////";
        } else if (!str.startsWith("smb1://") && host != null && host.length() == 0) {
            str = "//" + str;
            i11 += 2;
        }
        super.parseURL(url, str, i10, i11);
        String path = url.getPath();
        String ref = url.getRef();
        if (ref != null) {
            path = path + '#' + ref;
        }
        String str2 = path;
        int port = url.getPort();
        if (port == -1) {
            port = getDefaultPort();
        }
        setURL(url, "smb", url.getHost(), port, url.getAuthority(), url.getUserInfo(), str2, url.getQuery(), null);
    }
}
