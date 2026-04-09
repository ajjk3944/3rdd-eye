package d8;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l implements x7.e {

    /* renamed from: b, reason: collision with root package name */
    public final m f22028b;

    /* renamed from: c, reason: collision with root package name */
    public final URL f22029c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22030d;

    /* renamed from: e, reason: collision with root package name */
    public String f22031e;

    /* renamed from: f, reason: collision with root package name */
    public URL f22032f;
    public volatile byte[] g;

    /* renamed from: h, reason: collision with root package name */
    public int f22033h;

    public l(URL url) {
        p pVar = m.f22034a;
        t8.f.c(url, "Argument must not be null");
        this.f22029c = url;
        this.f22030d = null;
        t8.f.c(pVar, "Argument must not be null");
        this.f22028b = pVar;
    }

    @Override // x7.e
    public final void b(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(x7.e.f36998a);
        }
        messageDigest.update(this.g);
    }

    public final String c() {
        String str = this.f22030d;
        if (str != null) {
            return str;
        }
        URL url = this.f22029c;
        t8.f.c(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f22032f == null) {
            if (TextUtils.isEmpty(this.f22031e)) {
                String string = this.f22030d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f22029c;
                    t8.f.c(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f22031e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
            }
            this.f22032f = new URL(this.f22031e);
        }
        return this.f22032f;
    }

    @Override // x7.e
    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (c().equals(lVar.c()) && this.f22028b.equals(lVar.f22028b)) {
                return true;
            }
        }
        return false;
    }

    @Override // x7.e
    public final int hashCode() {
        if (this.f22033h == 0) {
            int iHashCode = c().hashCode();
            this.f22033h = iHashCode;
            this.f22033h = this.f22028b.hashCode() + (iHashCode * 31);
        }
        return this.f22033h;
    }

    public final String toString() {
        return c();
    }

    public l(String str) {
        p pVar = m.f22034a;
        this.f22029c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f22030d = str;
            t8.f.c(pVar, "Argument must not be null");
            this.f22028b = pVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
