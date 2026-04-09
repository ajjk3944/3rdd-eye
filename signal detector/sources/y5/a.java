package y5;

import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f24252a;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        q5.i.d(charsetForName, "forName(...)");
        f24252a = charsetForName;
        q5.i.d(Charset.forName("UTF-16"), "forName(...)");
        q5.i.d(Charset.forName("UTF-16BE"), "forName(...)");
        q5.i.d(Charset.forName("UTF-16LE"), "forName(...)");
        q5.i.d(Charset.forName("US-ASCII"), "forName(...)");
        q5.i.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
