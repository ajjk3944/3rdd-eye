package R2;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import t4.C5606d;

/* compiled from: GlideUrl.java */
/* loaded from: classes.dex */
public final class i implements L2.f {

    /* renamed from: b, reason: collision with root package name */
    public final l f11666b;

    /* renamed from: c, reason: collision with root package name */
    public final URL f11667c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11668d;

    /* renamed from: e, reason: collision with root package name */
    public String f11669e;

    /* renamed from: f, reason: collision with root package name */
    public URL f11670f;

    /* renamed from: g, reason: collision with root package name */
    public volatile byte[] f11671g;

    /* renamed from: h, reason: collision with root package name */
    public int f11672h;

    public i(URL url) {
        l lVar = j.f11673a;
        C5606d.l(url, "Argument must not be null");
        this.f11667c = url;
        this.f11668d = null;
        C5606d.l(lVar, "Argument must not be null");
        this.f11666b = lVar;
    }

    @Override // L2.f
    public final void b(MessageDigest messageDigest) {
        if (this.f11671g == null) {
            this.f11671g = c().getBytes(L2.f.f4027a);
        }
        messageDigest.update(this.f11671g);
    }

    public final String c() {
        String str = this.f11668d;
        if (str != null) {
            return str;
        }
        URL url = this.f11667c;
        C5606d.l(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() throws MalformedURLException {
        if (this.f11670f == null) {
            if (TextUtils.isEmpty(this.f11669e)) {
                String string = this.f11668d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f11667c;
                    C5606d.l(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f11669e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f11670f = new URL(this.f11669e);
        }
        return this.f11670f;
    }

    @Override // L2.f
    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return c().equals(iVar.c()) && this.f11666b.equals(iVar.f11666b);
    }

    @Override // L2.f
    public final int hashCode() {
        if (this.f11672h == 0) {
            int iHashCode = c().hashCode();
            this.f11672h = iHashCode;
            this.f11672h = this.f11666b.f11674b.hashCode() + (iHashCode * 31);
        }
        return this.f11672h;
    }

    public final String toString() {
        return c();
    }

    public i(String str) {
        l lVar = j.f11673a;
        this.f11667c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f11668d = str;
            C5606d.l(lVar, "Argument must not be null");
            this.f11666b = lVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
