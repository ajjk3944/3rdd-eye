package Yf;

import com.wireguard.config.ParseException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f24958g = Pattern.compile("^[^\\[\\]]*:[^\\[\\]]*");

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f24959h = Pattern.compile("[/?#]");

    /* renamed from: a, reason: collision with root package name */
    private final String f24960a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f24961b;

    /* renamed from: d, reason: collision with root package name */
    private final int f24963d;

    /* renamed from: f, reason: collision with root package name */
    private c f24965f;

    /* renamed from: c, reason: collision with root package name */
    private final Object f24962c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private Instant f24964e = Instant.EPOCH;

    private c(String str, boolean z10, int i10) {
        this.f24960a = str;
        this.f24961b = z10;
        this.f24963d = i10;
    }

    public static c c(String str) throws NoSuchMethodException, ParseException {
        if (f24959h.matcher(str).find()) {
            throw new ParseException(c.class, str, "Forbidden characters");
        }
        try {
            URI uri = new URI("wg://" + str);
            if (uri.getPort() < 0 || uri.getPort() > 65535) {
                throw new ParseException(c.class, str, "Missing/invalid port number");
            }
            try {
                b.a(uri.getHost());
                return new c(uri.getHost(), true, uri.getPort());
            } catch (ParseException unused) {
                return new c(uri.getHost(), false, uri.getPort());
            }
        } catch (URISyntaxException e10) {
            throw new ParseException(c.class, str, e10);
        }
    }

    public String a() {
        return this.f24960a;
    }

    public Optional b() {
        Optional optionalOfNullable;
        if (this.f24961b) {
            return Optional.of(this);
        }
        synchronized (this.f24962c) {
            try {
                if (Duration.between(this.f24964e, Instant.now()).toMinutes() > 1) {
                    try {
                        InetAddress[] allByName = InetAddress.getAllByName(this.f24960a);
                        int i10 = 0;
                        InetAddress inetAddress = allByName[0];
                        int length = allByName.length;
                        while (true) {
                            if (i10 >= length) {
                                break;
                            }
                            InetAddress inetAddress2 = allByName[i10];
                            if (inetAddress2 instanceof Inet4Address) {
                                inetAddress = inetAddress2;
                                break;
                            }
                            i10++;
                        }
                        this.f24965f = new c(inetAddress.getHostAddress(), true, this.f24963d);
                        this.f24964e = Instant.now();
                    } catch (UnknownHostException unused) {
                        this.f24965f = null;
                    }
                }
                optionalOfNullable = Optional.ofNullable(this.f24965f);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return optionalOfNullable;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f24960a.equals(cVar.f24960a) && this.f24963d == cVar.f24963d;
    }

    public int hashCode() {
        return this.f24960a.hashCode() ^ this.f24963d;
    }

    public String toString() {
        String str;
        boolean z10 = this.f24961b && f24958g.matcher(this.f24960a).matches();
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            str = '[' + this.f24960a + ']';
        } else {
            str = this.f24960a;
        }
        sb2.append(str);
        sb2.append(':');
        sb2.append(this.f24963d);
        return sb2.toString();
    }
}
