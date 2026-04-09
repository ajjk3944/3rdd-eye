package s9;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f24340a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f24341b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f24342c;

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f24343d;

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f24344e;

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f24345f;

    /* renamed from: g, reason: collision with root package name */
    public static final Charset f24346g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile Charset f24347h;

    /* renamed from: i, reason: collision with root package name */
    public static volatile Charset f24348i;

    static {
        Charset charsetForName = Charset.forName(C.UTF8_NAME);
        kotlin.jvm.internal.p.d(charsetForName, "forName(...)");
        f24341b = charsetForName;
        Charset charsetForName2 = Charset.forName(C.UTF16_NAME);
        kotlin.jvm.internal.p.d(charsetForName2, "forName(...)");
        f24342c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        kotlin.jvm.internal.p.d(charsetForName3, "forName(...)");
        f24343d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        kotlin.jvm.internal.p.d(charsetForName4, "forName(...)");
        f24344e = charsetForName4;
        Charset charsetForName5 = Charset.forName(C.ASCII_NAME);
        kotlin.jvm.internal.p.d(charsetForName5, "forName(...)");
        f24345f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.p.d(charsetForName6, "forName(...)");
        f24346g = charsetForName6;
    }

    public final Charset a() {
        Charset charset = f24348i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        kotlin.jvm.internal.p.d(charsetForName, "forName(...)");
        f24348i = charsetForName;
        return charsetForName;
    }

    public final Charset b() {
        Charset charset = f24347h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        kotlin.jvm.internal.p.d(charsetForName, "forName(...)");
        f24347h = charsetForName;
        return charsetForName;
    }
}
