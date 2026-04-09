package I2;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
public class h implements C2.e {

    /* renamed from: b, reason: collision with root package name */
    private final i f8483b;

    /* renamed from: c, reason: collision with root package name */
    private final URL f8484c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8485d;

    /* renamed from: e, reason: collision with root package name */
    private String f8486e;

    /* renamed from: f, reason: collision with root package name */
    private URL f8487f;

    /* renamed from: g, reason: collision with root package name */
    private volatile byte[] f8488g;

    /* renamed from: h, reason: collision with root package name */
    private int f8489h;

    public h(URL url) {
        this(url, i.f8491b);
    }

    private byte[] d() {
        if (this.f8488g == null) {
            this.f8488g = c().getBytes(C2.e.f2192a);
        }
        return this.f8488g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f8486e)) {
            String string = this.f8485d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) W2.k.d(this.f8484c)).toString();
            }
            this.f8486e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f8486e;
    }

    private URL g() {
        if (this.f8487f == null) {
            this.f8487f = new URL(f());
        }
        return this.f8487f;
    }

    @Override // C2.e
    public void a(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f8485d;
        return str != null ? str : ((URL) W2.k.d(this.f8484c)).toString();
    }

    public Map e() {
        return this.f8483b.a();
    }

    @Override // C2.e
    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return c().equals(hVar.c()) && this.f8483b.equals(hVar.f8483b);
    }

    public URL h() {
        return g();
    }

    @Override // C2.e
    public int hashCode() {
        if (this.f8489h == 0) {
            int iHashCode = c().hashCode();
            this.f8489h = iHashCode;
            this.f8489h = (iHashCode * 31) + this.f8483b.hashCode();
        }
        return this.f8489h;
    }

    public String toString() {
        return c();
    }

    public h(String str) {
        this(str, i.f8491b);
    }

    public h(URL url, i iVar) {
        this.f8484c = (URL) W2.k.d(url);
        this.f8485d = null;
        this.f8483b = (i) W2.k.d(iVar);
    }

    public h(String str, i iVar) {
        this.f8484c = null;
        this.f8485d = W2.k.b(str);
        this.f8483b = (i) W2.k.d(iVar);
    }
}
