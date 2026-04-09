package kotlin.text;

import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: kotlin.text.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6510d {

    /* renamed from: a, reason: collision with root package name */
    public static final C6510d f52214a = new C6510d();

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f52215b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f52216c;

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f52217d;

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f52218e;

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f52219f;

    /* renamed from: g, reason: collision with root package name */
    public static final Charset f52220g;

    /* renamed from: h, reason: collision with root package name */
    private static volatile Charset f52221h;

    /* renamed from: i, reason: collision with root package name */
    private static volatile Charset f52222i;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC6492s.h(charsetForName, "forName(...)");
        f52215b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        AbstractC6492s.h(charsetForName2, "forName(...)");
        f52216c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        AbstractC6492s.h(charsetForName3, "forName(...)");
        f52217d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        AbstractC6492s.h(charsetForName4, "forName(...)");
        f52218e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        AbstractC6492s.h(charsetForName5, "forName(...)");
        f52219f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        AbstractC6492s.h(charsetForName6, "forName(...)");
        f52220g = charsetForName6;
    }

    private C6510d() {
    }

    public final Charset a() {
        Charset charset = f52222i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        AbstractC6492s.h(charsetForName, "forName(...)");
        f52222i = charsetForName;
        return charsetForName;
    }

    public final Charset b() {
        Charset charset = f52221h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        AbstractC6492s.h(charsetForName, "forName(...)");
        f52221h = charsetForName;
        return charsetForName;
    }
}
