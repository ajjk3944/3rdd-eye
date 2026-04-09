package vk;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f36267a;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f36268b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f36269c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile Charset f36270d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile Charset f36271e;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        nk.k.d(charsetForName, "forName(...)");
        f36267a = charsetForName;
        nk.k.d(Charset.forName("UTF-16"), "forName(...)");
        Charset charsetForName2 = Charset.forName("UTF-16BE");
        nk.k.d(charsetForName2, "forName(...)");
        f36268b = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16LE");
        nk.k.d(charsetForName3, "forName(...)");
        f36269c = charsetForName3;
        nk.k.d(Charset.forName("US-ASCII"), "forName(...)");
        nk.k.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
