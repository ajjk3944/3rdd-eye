package defpackage;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ie {
    public static final Charset a;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        i30.l(charsetForName, "forName(...)");
        a = charsetForName;
        i30.l(Charset.forName("UTF-16"), "forName(...)");
        i30.l(Charset.forName("UTF-16BE"), "forName(...)");
        i30.l(Charset.forName("UTF-16LE"), "forName(...)");
        i30.l(Charset.forName("US-ASCII"), "forName(...)");
        i30.l(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
