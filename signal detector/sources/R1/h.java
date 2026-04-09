package r1;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import l1.InterfaceC2639e;

/* loaded from: classes.dex */
public final class h implements InterfaceC2639e {

    /* renamed from: b, reason: collision with root package name */
    public final i f23348b;

    /* renamed from: c, reason: collision with root package name */
    public final URL f23349c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23350d;

    /* renamed from: e, reason: collision with root package name */
    public String f23351e;

    /* renamed from: f, reason: collision with root package name */
    public URL f23352f;

    /* renamed from: g, reason: collision with root package name */
    public volatile byte[] f23353g;

    /* renamed from: h, reason: collision with root package name */
    public int f23354h;

    public h(URL url) {
        l lVar = i.f23355a;
        H1.g.c(url, "Argument must not be null");
        this.f23349c = url;
        this.f23350d = null;
        H1.g.c(lVar, "Argument must not be null");
        this.f23348b = lVar;
    }

    @Override // l1.InterfaceC2639e
    public final void a(MessageDigest messageDigest) {
        if (this.f23353g == null) {
            this.f23353g = c().getBytes(InterfaceC2639e.f21817a);
        }
        messageDigest.update(this.f23353g);
    }

    public final String c() {
        String str = this.f23350d;
        if (str != null) {
            return str;
        }
        URL url = this.f23349c;
        H1.g.c(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f23352f == null) {
            if (TextUtils.isEmpty(this.f23351e)) {
                String string = this.f23350d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f23349c;
                    H1.g.c(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f23351e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
            }
            this.f23352f = new URL(this.f23351e);
        }
        return this.f23352f;
    }

    @Override // l1.InterfaceC2639e
    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (c().equals(hVar.c()) && this.f23348b.equals(hVar.f23348b)) {
                return true;
            }
        }
        return false;
    }

    @Override // l1.InterfaceC2639e
    public final int hashCode() {
        if (this.f23354h == 0) {
            int iHashCode = c().hashCode();
            this.f23354h = iHashCode;
            this.f23354h = this.f23348b.hashCode() + (iHashCode * 31);
        }
        return this.f23354h;
    }

    public final String toString() {
        return c();
    }

    public h(String str) {
        l lVar = i.f23355a;
        this.f23349c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f23350d = str;
            H1.g.c(lVar, "Argument must not be null");
            this.f23348b = lVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
