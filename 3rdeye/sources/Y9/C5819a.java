package y9;

import com.singular.sdk.internal.Constants;
import java.nio.charset.Charset;

/* compiled from: Charsets.kt */
/* renamed from: y9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5819a {

    /* renamed from: a, reason: collision with root package name */
    public static final C5819a f48358a = new C5819a();

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f48359b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f48360c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile Charset f48361d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile Charset f48362e;

    static {
        Charset charsetForName = Charset.forName(Constants.ENCODING);
        kotlin.jvm.internal.l.e(charsetForName, "forName(...)");
        f48359b = charsetForName;
        kotlin.jvm.internal.l.e(Charset.forName("UTF-16"), "forName(...)");
        kotlin.jvm.internal.l.e(Charset.forName("UTF-16BE"), "forName(...)");
        kotlin.jvm.internal.l.e(Charset.forName("UTF-16LE"), "forName(...)");
        kotlin.jvm.internal.l.e(Charset.forName("US-ASCII"), "forName(...)");
        Charset charsetForName2 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.l.e(charsetForName2, "forName(...)");
        f48360c = charsetForName2;
    }
}
