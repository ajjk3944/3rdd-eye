package tt;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f22975a;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f22976b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Charset f22977c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile Charset f22978d;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        br.l.d(charsetForName, "forName(...)");
        f22975a = charsetForName;
        br.l.d(Charset.forName("UTF-16"), "forName(...)");
        br.l.d(Charset.forName("UTF-16BE"), "forName(...)");
        br.l.d(Charset.forName("UTF-16LE"), "forName(...)");
        br.l.d(Charset.forName("US-ASCII"), "forName(...)");
        Charset charsetForName2 = Charset.forName("ISO-8859-1");
        br.l.d(charsetForName2, "forName(...)");
        f22976b = charsetForName2;
    }
}
